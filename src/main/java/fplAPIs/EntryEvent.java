package fplAPIs;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import pojos.GameWeekPick;
import pojos.LeagueEntrant;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static fplAPIs.UrlUtils.connectToUrlAndRetrieveJSON;
import static fplAPIs.UrlUtils.createGson;
import static java.lang.String.format;

public class EntryEvent {

    public static Logger LOG = Logger.getLogger(EntryEvent.class);


    public static Map<Long, Map<Long, List<GameWeekPick>>> getEntryGameWeeks(List<LeagueEntrant> leagueEntries, long lastFinishedWeek) {
        Gson gson = createGson();

        // <Entrant, Team>
        Map<Long, List<GameWeekPick>> entrantPicks = new HashMap<>();
        // <Week, <Entrant, Team>>
        Map<Long, Map<Long, List<GameWeekPick>>> gameWeekPicks = new HashMap<>();
        for (LeagueEntrant entrant : leagueEntries) {
            long entrantId = entrant.getEntryId();
            JSONObject jGameWeekPicks = new JSONObject();

            for (long gw = 1L; gw <= lastFinishedWeek; gw++) {
                try {
                    String stringUrl = format("https://draft.premierleague.com/api/entry/%s/event/%s", entrantId, gw);
                    LOG.info("Creating URL for: " + stringUrl);
                    URL url = new URL(stringUrl);
                    jGameWeekPicks = connectToUrlAndRetrieveJSON(url);
                    JSONArray jPicks = (JSONArray) jGameWeekPicks.get("picks");
                    List<GameWeekPick> picks = new ArrayList<>();

                    for (Object jPick : jPicks) {
                        GameWeekPick pick = gson.fromJson(((JSONObject) jPick).toString(), GameWeekPick.class);
                        picks.add(pick);
                    }

                    entrantPicks.put(entrantId, picks);
                } catch (MalformedURLException e) {
                    LOG.error("Could not parse URL. Exiting...");
                    System.exit(1);
                }

                gameWeekPicks.put(gw, entrantPicks);

            }
        }
        return gameWeekPicks;
    }
}
