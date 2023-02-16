public class Knit extends Needle implements IdNumber{
    private String type = "Knit";
    private boolean isRound;
    private String idNumber;

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

    public String setIdNumber(){
        return "holding place";
    }

}
