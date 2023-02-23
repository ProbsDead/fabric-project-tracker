import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Needle {
    private String usSize;
    private double mmSize;
    private String material;
    private boolean inUse;

    public String getUsSize() {
        return usSize;
    }

    public void setUsSize(String usSize) {
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

    public Needle(String usSize, double mmSize, String material, boolean inUse) {
        this.usSize = usSize;
        this.mmSize = mmSize;
        this.material = material;
        this.inUse = inUse;
    }

    public Needle(String usSize, double mmSize, String material) {
        this.usSize = usSize;
        this.mmSize = mmSize;
        this.material = material;
    }
    public Needle(){}

    public void addNeedleToFile() {
        System.out.println("Is this a (C)rochet hook or (K)nitting needle: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if (userInput.equalsIgnoreCase("c")) {
            Crochet crochet = new Crochet();
            crochet.addNeedleToFile();
        } else if (userInput.equalsIgnoreCase("k")) {
            Knit knit = new Knit();
            knit.addNeedleToFile();
        }
    }

}


