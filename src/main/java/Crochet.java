public class Crochet extends Needle implements IdNumber{
    private String type = "Crochet";
    private String idNumber;

    public Crochet(int usSize, double mmSize, String material, boolean inUse) {
        super(usSize, mmSize, material, inUse);
    }

    public Crochet(int usSize, double mmSize, String material) {
        super(usSize, mmSize, material);
    }

    public String setIdNumber(){
        return "holding place";
    }

}
