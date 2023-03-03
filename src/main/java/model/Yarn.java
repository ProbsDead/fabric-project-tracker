package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Yarn{
    private int yarnId;
    private String generalColor;
    private String manufacturerColor;
    private String weight;
    private int grams;
    private boolean inUse;

    public int getYarnId() {
        return yarnId;
    }

    public void setYarnId(int yarnId) {
        this.yarnId = yarnId;
    }

    public String getGeneralColor() {
        return generalColor;
    }

    public void setGeneralColor(String generalColor) {
        this.generalColor = generalColor;
    }

    public String getManufacturerColor() {
        return manufacturerColor;
    }

    public void setManufacturerColor(String manufacturerColor) {
        this.manufacturerColor = manufacturerColor;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public void addYarnToFile() {
        File yarn = new File("TextFiles/model.Yarn.txt");
        Date date = new Date();
        SimpleDateFormat dateTime = new SimpleDateFormat("MM/dd/yyy hh:mm:ss aa");
        String stringDate = dateTime.format(date);
        try(PrintWriter dataOutput = new PrintWriter(new FileOutputStream(yarn, true))){
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the overall color of yarn: ");
            dataOutput.println("model.Yarn added: " + stringDate + "\n" + "Color Group: " + input.nextLine());
            System.out.println("Please enter the manufacture color name: ");
            dataOutput.println("Manufacturer Color Name: " + input.nextLine());
            System.out.println("Please enter the yarn weight: ");
            dataOutput.println("Weight: " + input.nextLine());
            System.out.println("Please enter the amount of yarn in grams (whole numbers only): ");
            dataOutput.println("Grams: " + input.nextLine() + "\n");
            System.out.println("Your yarn has been added to the list!\n");

        }catch (FileNotFoundException ex){
            System.out.println("File Not Found");
        }
    }


}
