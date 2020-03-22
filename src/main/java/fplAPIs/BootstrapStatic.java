package fplAPIs;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import pojos.Player;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static fplAPIs.UrlUtils.connectToUrlAndRetrieveJSON;
import static fplAPIs.UrlUtils.createGson;

public class BootstrapStatic {

    public static Logger LOG = Logger.getLogger(BootstrapStatic.class);
    public static String PLAYERS = "elements";

    private BootstrapStatic() {
    }

    public static List<Player> getPlayers() {
        Gson gson = createGson();

        JSONObject jBootstrapStatic = new JSONObject();
        try {
            URL url = new URL("https://draft.premierleague.com/api/bootstrap-static");
            jBootstrapStatic = connectToUrlAndRetrieveJSON(url);
        } catch (
                MalformedURLException e) {
            LOG.error("Could not parse URL. Exiting...");
            System.exit(1);
        }
        List<Player> players = new ArrayList<Player>();
        JSONArray playersJSON = (JSONArray) jBootstrapStatic.get(PLAYERS);

        for (Object playerJSON : playersJSON) {
            Player player = gson.fromJson(playerJSON.toString(), Player.class);
            players.add(player);
        }

        return players;
    }

}
