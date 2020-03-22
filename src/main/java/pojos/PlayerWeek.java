package pojos;

public class PlayerWeek {
    private long id;
    private String detail;
    private long event;
    private long assists;
    private long bonus;
    private long bps;
    private long cleanSheets;
    private String creativity;
    private long goalsScored;
    private String ictIndex;
    private String influence;
    private long minutes;
    private long ownGoals;
    private long penaltiesMissed;
    private long penaltiesSaved;
    private long redCards;
    private long saves;
    private String threat;
    private long yellowCards;
    private long totalPoints;
    private long element;
    private long fixtures;
    private long opponentTeam;

    public PlayerWeek(long id, String detail, long event, long assists, long bonus, long bps, long cleanSheets, String creativity, long goalsScored, String ictIndex, String influence, long minutes, long ownGoals, long penaltiesMissed, long penaltiesSaved, long redCards, long saves, String threat, long yellowCards, long totalPoints, long element, long fixtures, long opponentTeam) {
        this.id = id;
        this.detail = detail;
        this.event = event;
        this.assists = assists;
        this.bonus = bonus;
        this.bps = bps;
        this.cleanSheets = cleanSheets;
        this.creativity = creativity;
        this.goalsScored = goalsScored;
        this.ictIndex = ictIndex;
        this.influence = influence;
        this.minutes = minutes;
        this.ownGoals = ownGoals;
        this.penaltiesMissed = penaltiesMissed;
        this.penaltiesSaved = penaltiesSaved;
        this.redCards = redCards;
        this.saves = saves;
        this.threat = threat;
        this.yellowCards = yellowCards;
        this.totalPoints = totalPoints;
        this.element = element;
        this.fixtures = fixtures;
        this.opponentTeam = opponentTeam;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public long getEvent() {
        return event;
    }

    public void setEvent(long event) {
        this.event = event;
    }

    public long getAssists() {
        return assists;
    }

    public void setAssists(long assists) {
        this.assists = assists;
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    public long getBps() {
        return bps;
    }

    public void setBps(long bps) {
        this.bps = bps;
    }

    public long getCleanSheets() {
        return cleanSheets;
    }

    public void setCleanSheets(long cleanSheets) {
        this.cleanSheets = cleanSheets;
    }

    public String getCreativity() {
        return creativity;
    }

    public void setCreativity(String creativity) {
        this.creativity = creativity;
    }

    public long getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(long goalsScored) {
        this.goalsScored = goalsScored;
    }

    public String getIctIndex() {
        return ictIndex;
    }

    public void setIctIndex(String ictIndex) {
        this.ictIndex = ictIndex;
    }

    public String getInfluence() {
        return influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public long getMinutes() {
        return minutes;
    }

    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }

    public long getOwnGoals() {
        return ownGoals;
    }

    public void setOwnGoals(long ownGoals) {
        this.ownGoals = ownGoals;
    }

    public long getPenaltiesMissed() {
        return penaltiesMissed;
    }

    public void setPenaltiesMissed(long penaltiesMissed) {
        this.penaltiesMissed = penaltiesMissed;
    }

    public long getPenaltiesSaved() {
        return penaltiesSaved;
    }

    public void setPenaltiesSaved(long penaltiesSaved) {
        this.penaltiesSaved = penaltiesSaved;
    }

    public long getRedCards() {
        return redCards;
    }

    public void setRedCards(long redCards) {
        this.redCards = redCards;
    }

    public long getSaves() {
        return saves;
    }

    public void setSaves(long saves) {
        this.saves = saves;
    }

    public String getThreat() {
        return threat;
    }

    public void setThreat(String threat) {
        this.threat = threat;
    }

    public long getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(long yellowCards) {
        this.yellowCards = yellowCards;
    }

    public long getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(long totalPoints) {
        this.totalPoints = totalPoints;
    }

    public long getElement() {
        return element;
    }

    public void setElement(long element) {
        this.element = element;
    }

    public long getFixtures() {
        return fixtures;
    }

    public void setFixtures(long fixtures) {
        this.fixtures = fixtures;
    }

    public long getOpponentTeam() {
        return opponentTeam;
    }

    public void setOpponentTeam(long opponentTeam) {
        this.opponentTeam = opponentTeam;
    }
}
