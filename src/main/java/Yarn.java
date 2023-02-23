import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Yarn implements IdNumber {
    private String mainColor;
    private String specificColor;
    private String weight;
    private int gramsAvailable;
    private boolean inUse;
    private String idNumber;

    public String getColor() {
        return mainColor;
    }

    public void setColor(String color) {
        this.mainColor = color;
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

    public String getSpecificColor() {
        return specificColor;
    }

    public void setSpecificColor(String specificColor) {
        this.specificColor = specificColor;
    }

    public Yarn() {

    }

    public Yarn(String mainColor, String specificColor, String weight, int gramsAvailable, boolean inUse) {
        this.mainColor = mainColor;
        this.specificColor = specificColor;
        this.weight = weight;
        this.gramsAvailable = gramsAvailable;
        this.inUse = inUse;
    }

    public Yarn(String color, String specificColor, String weight, int gramsAvailable) {
        this.mainColor = color;
        this.specificColor = specificColor;
        this.weight = weight;
        this.gramsAvailable = gramsAvailable;
    }

    public String setIdNumber(){
        return "holding place";
    }

    public void addYarnToFile() {
        File yarn = new File("TextFiles/Yarn.txt");
        Date date = new Date();
        SimpleDateFormat dateTime = new SimpleDateFormat("MM/dd/yyy hh:mm:ss aa");
        String stringDate = dateTime.format(date);
        try(PrintWriter dataOutput = new PrintWriter(new FileOutputStream(yarn, true))){
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the overall color of yarn: ");
            dataOutput.println("Yarn added: " + stringDate + "\n" + "Color Group: " + input.nextLine());
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



 /*   THIS IS OLD CODE I DIDN'T WANT TO DELETE YET

    public void writeToFile(List<Yarn> yarnToAdd){
        File yarn = new File("TextFiles/Yarn.txt");

        try(PrintWriter dataOutput = new PrintWriter(new FileOutputStream(yarn, true))){
            int counter = 0;
            while(counter < yarnToAdd.size()){
                dataOutput.println(yarnToAdd.get(counter).getColor());
                dataOutput.println((yarnToAdd.get(counter).getSpecificColor()));
                dataOutput.println(yarnToAdd.get(counter).getWeight());
                dataOutput.println(yarnToAdd.get(counter).getGramsAvailable());
                dataOutput.println(yarnToAdd.get(counter).isInUse());
                dataOutput.println("\n");
                counter++;
            }
        }catch(FileNotFoundException ex){
            System.out.println("File Not Found");
        }
    }


*/