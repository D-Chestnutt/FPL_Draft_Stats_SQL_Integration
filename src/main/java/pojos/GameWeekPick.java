package pojos;

public class GameWeekPick {
    private boolean isCaptain;
    private long multiplier;
    private long position;
    private boolean isViceCaptain;
    private long element;

    public GameWeekPick(boolean isCaptain, long multiplier, long position, boolean isViceCaptain, long element) {
        this.isCaptain = isCaptain;
        this.multiplier = multiplier;
        this.position = position;
        this.isViceCaptain = isViceCaptain;
        this.element = element;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public long getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(long multiplier) {
        this.multiplier = multiplier;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    public boolean isViceCaptain() {
        return isViceCaptain;
    }

    public void setViceCaptain(boolean viceCaptain) {
        isViceCaptain = viceCaptain;
    }

    public long getElement() {
        return element;
    }

    public void setElement(long element) {
        this.element = element;
    }
}
