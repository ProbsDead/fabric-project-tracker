public class Knit extends Needle{
    private boolean isRound;

    public boolean isRound() {
        return isRound;
    }

    public void setRound(boolean round) {
        isRound = round;
    }

    public Knit(int usSize, double mmSize, String material, boolean inUse, boolean isRound) {
        super(usSize, mmSize, material, inUse);
        this.isRound = isRound;
    }

    public Knit(int usSize, double mmSize, String material, boolean isRound) {
        super(usSize, mmSize, material);
        this.isRound = isRound;
    }

}
