import pojos.GameWeekPick;
import pojos.LeagueEntrant;
import pojos.Player;
import pojos.PlayerWeek;

import java.util.List;
import java.util.Map;
import java.sql.*;

import static fplAPIs.BootstrapStatic.getPlayers;
import static fplAPIs.Details.getLeagueEntrants;
import static fplAPIs.ElementSummary.getPlayerWeeks;
import static fplAPIs.EntryEvent.getEntryGameWeeks;
import static fplAPIs.Game.getLastFinishedWeek;

class DownloadJsonData {

    public static int LEAGUE = 87047;

    public static void main(String [] args) {

        List<LeagueEntrant> leagueEntries = getLeagueEntrants(LEAGUE);
        long lastFinishedWeek = getLastFinishedWeek();

        Map<Long, Map<Long, List<GameWeekPick>>>gameWeekPicks = getEntryGameWeeks(leagueEntries, lastFinishedWeek);

        List<Player> players = getPlayers();

        Map<Long, List<PlayerWeek>> playerWeeks = getPlayerWeeks(players);

        System.out.println("here");
    }

}