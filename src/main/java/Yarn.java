import java.sql.Timestamp;
import java.util.Date;

public class Yarn {
    private String color;
    private String weight;
    private int gramsAvailable;
    private boolean inUse;
    private String idNumber;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getGramsAvailable() {
        return gramsAvailable;
    }

    public void setGramsAvailable(int gramsAvailable) {
        this.gramsAvailable = gramsAvailable;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public Yarn(String color, String weight, int gramsAvailable, boolean inUse) {
        this.color = color;
        this.weight = weight;
        this.gramsAvailable = gramsAvailable;
        this.inUse = inUse;
    }


}
