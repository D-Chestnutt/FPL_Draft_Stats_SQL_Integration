package fplAPIs;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import pojos.GameWeek;

import java.net.MalformedURLException;
import java.net.URL;

import static fplAPIs.UrlUtils.connectToUrlAndRetrieveJSON;
import static fplAPIs.UrlUtils.createGson;

public class Game {

    public static Logger LOG = Logger.getLogger(Game.class);

    private Game() {
    }

    public static long getLastFinishedWeek() {
        Gson gson = createGson();
        JSONObject jGame = new JSONObject();

        try {
            URL url = new URL("https://draft.premierleague.com/api/game");
            jGame = connectToUrlAndRetrieveJSON(url);
        } catch (
                MalformedURLException e) {
            LOG.error("Could not parse URL. Exiting...");
            System.exit(1);
        }

        GameWeek gameWeek = gson.fromJson(jGame.toString(), GameWeek.class);

        long lastFinishedWeek = gameWeek.isCurrentEventFinished() ? gameWeek.getCurrentEvent() : gameWeek.getCurrentEvent() - 1;

        return lastFinishedWeek;
    }

}
