public class Needle {
    private int usSize;
    private int mmSize;
    private String material;
    private boolean inUse;
    private String idNumber;

    public int getUsSize() {
        return usSize;
    }

    public void setUsSize(int usSize) {
        this.usSize = usSize;
    }

    public int getMmSize() {
        return mmSize;
    }

    public void setMmSize(int mmSize) {
        this.mmSize = mmSize;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public Needle(int usSize, int mmSize, String material, boolean inUse) {
        this.usSize = usSize;
        this.mmSize = mmSize;
        this.material = material;
        this.inUse = inUse;
    }
}
