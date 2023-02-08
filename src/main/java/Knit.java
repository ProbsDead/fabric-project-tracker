public class Knit extends Needle{
    private boolean isRound;

    public boolean isRound() {
        return isRound;
    }

    public void setRound(boolean round) {
        isRound = round;
    }

    public Knit(int usSize, int mmSize, String material, boolean inUse, boolean isRound) {
        super(usSize, mmSize, material, inUse);
        this.isRound = isRound;
    }
}
