import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class Needle {
    private int usSize;
    private double mmSize;
    private String material;
    private boolean inUse;

    public int getUsSize() {
        return usSize;
    }

    public void setUsSize(int usSize) {
        this.usSize = usSize;
    }

    public double getMmSize() {
        return mmSize;
    }

    public void setMmSize(double mmSize) {
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

    public Needle(int usSize, double mmSize, String material, boolean inUse) {
        this.usSize = usSize;
        this.mmSize = mmSize;
        this.material = material;
        this.inUse = inUse;
    }

    public Needle(int usSize, double mmSize, String material) {
        this.usSize = usSize;
        this.mmSize = mmSize;
        this.material = material;
    }

    public void writeToFile(List<Needle> needleToAdd){
        File needle = new File("TextFiles/Needle.txt");

        try(PrintWriter dataOutput = new PrintWriter(new FileOutputStream(needle, true))){
            int counter = 0;
            while(counter < needleToAdd.size()){
                dataOutput.println("\n");
                dataOutput.println(needleToAdd.get(counter).getUsSize());
                dataOutput.println(needleToAdd.get(counter).getMmSize());
                dataOutput.println(needleToAdd.get(counter).getMaterial());
                dataOutput.println(needleToAdd.get(counter).isInUse());
                dataOutput.println("\n");
                counter++;
            }
        }catch(FileNotFoundException ex){
            System.out.println("File Not Found");
        }
    }
}
