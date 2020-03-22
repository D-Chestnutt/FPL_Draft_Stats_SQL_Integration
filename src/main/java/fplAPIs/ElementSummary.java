package fplAPIs;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import pojos.Player;
import pojos.PlayerWeek;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static fplAPIs.UrlUtils.connectToUrlAndRetrieveJSON;
import static fplAPIs.UrlUtils.createGson;
import static java.lang.String.format;

public class ElementSummary {

    public static String PLAYER_WEEK = "history";
    public static Logger LOG = Logger.getLogger(ElementSummary.class);

    public static Map<Long, List<PlayerWeek>> getPlayerWeeks(List<Player> players) {
        Gson gson = createGson();

        JSONObject jElementSummary = new JSONObject();
        Map<Long, List<PlayerWeek>> playerWeeks = new HashMap<>();
        for (Player player : players) {
            long playerId = player.getId();
            try {
                String stringUrl = format("https://draft.premierleague.com/api/element-summary/%s", playerId);
                URL url = new URL(stringUrl);
                jElementSummary = connectToUrlAndRetrieveJSON(url);
            } catch (MalformedURLException e) {
                LOG.error("Could not parse URL. Exiting...");
                System.exit(1);
            }
            List<PlayerWeek> weeks = new ArrayList<PlayerWeek>();
            JSONArray playerWeeksJSON = (JSONArray) jElementSummary.get(PLAYER_WEEK);

            for (Object playerWeekJSON : playerWeeksJSON) {
                PlayerWeek week = gson.fromJson(playerWeekJSON.toString(), PlayerWeek.class);
                weeks.add(week);
                playerWeeks.put(playerId, weeks);
            }

        }
        return playerWeeks;
    }
}
