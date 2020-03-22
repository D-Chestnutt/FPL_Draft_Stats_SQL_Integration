package fplAPIs;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import pojos.LeagueEntrant;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static fplAPIs.UrlUtils.connectToUrlAndRetrieveJSON;
import static fplAPIs.UrlUtils.createGson;
import static java.lang.String.format;

public class Details {

    public static Logger LOG = Logger.getLogger(Details.class);
    public static String LEAGUE_ENTRIES = "league_entries";

    public static JSONObject callDetails(int leagueId) {
        JSONObject jDetails = new JSONObject();
        try {
            String urlString = format("https://draft.premierleague.com/api/league/%s/details", leagueId);
            URL url = new URL(urlString);
            jDetails = connectToUrlAndRetrieveJSON(url);
        } catch (MalformedURLException e) {
            LOG.error("Could not parse URL. Exiting...");
            System.exit(1);
        }
        return jDetails;
    }

    public static List getLeagueEntrants(int leagueId) {
        JSONObject jDetails = callDetails(leagueId);
        Gson gson = createGson();

        JSONArray leagueEntriesJSON = (JSONArray) jDetails.get(LEAGUE_ENTRIES);

        List<LeagueEntrant> leagueEntries = new ArrayList<LeagueEntrant>();
        for (Object entrantJSON : leagueEntriesJSON) {
            LeagueEntrant entrant = gson.fromJson(entrantJSON.toString(), LeagueEntrant.class);
            leagueEntries.add(entrant);
        }

        return leagueEntries;
    }

}
