package pojos;

public class GameWeek {
    private boolean waiversProcessed;
    private String processingStatus;
    private long currentEvent;
    private boolean currentEventFinished;
    private boolean tradesTimeForApproval;
    private long nextEvent;

    public GameWeek(boolean waiversProcessed, String processingStatus, long currentEvent, boolean currentEventFinished, boolean tradesTimeForApproval, long nextEvent) {
        this.waiversProcessed = waiversProcessed;
        this.processingStatus = processingStatus;
        this.currentEvent = currentEvent;
        this.currentEventFinished = currentEventFinished;
        this.tradesTimeForApproval = tradesTimeForApproval;
        this.nextEvent = nextEvent;
    }

    public boolean isWaiversProcessed() {
        return waiversProcessed;
    }

    public void setWaiversProcessed(boolean waiversProcessed) {
        this.waiversProcessed = waiversProcessed;
    }

    public String getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    public long getCurrentEvent() {
        return currentEvent;
    }

    public void setCurrentEvent(long currentEvent) {
        this.currentEvent = currentEvent;
    }

    public boolean isCurrentEventFinished() {
        return currentEventFinished;
    }

    public void setCurrentEventFinished(boolean currentEventFinished) {
        this.currentEventFinished = currentEventFinished;
    }

    public boolean isTradesTimeForApproval() {
        return tradesTimeForApproval;
    }

    public void setTradesTimeForApproval(boolean tradesTimeForApproval) {
        this.tradesTimeForApproval = tradesTimeForApproval;
    }

    public long getNextEvent() {
        return nextEvent;
    }

    public void setNextEvent(long nextEvent) {
        this.nextEvent = nextEvent;
    }
}
