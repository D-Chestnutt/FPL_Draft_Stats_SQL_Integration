package pojos;

public class LeagueEntrant {

    private String entryName;
    private long entryId;
    private long waiverPick;
    private String playerLastName;
    private String joinedTime;
    private String shortName;
    private long id;
    private String playerFirstName;

    public LeagueEntrant(String entryName, long entryId, long waiverPick, String playerLastName, String joinedTime, String shortName, long id, String playerFirstName) {
        this.entryName = entryName;
        this.entryId = entryId;
        this.waiverPick = waiverPick;
        this.playerLastName = playerLastName;
        this.joinedTime = joinedTime;
        this.shortName = shortName;
        this.id = id;
        this.playerFirstName = playerFirstName;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public long getEntryId() {
        return entryId;
    }

    public void setEntryId(long entryId) {
        this.entryId = entryId;
    }

    public long getWaiverPick() {
        return waiverPick;
    }

    public void setWaiverPick(long waiverPick) {
        this.waiverPick = waiverPick;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public String getJoinedTime() {
        return joinedTime;
    }

    public void setJoinedTime(String joinedTime) {
        this.joinedTime = joinedTime;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }
}
