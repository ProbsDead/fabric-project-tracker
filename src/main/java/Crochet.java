import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Crochet extends Needle implements IdNumber{
    private String type = "Crochet";
    private String idNumber;

    public Crochet(String usSize, double mmSize, String material, boolean inUse) {
        super(usSize, mmSize, material, inUse);
    }

    public Crochet(String usSize, double mmSize, String material) {
        super(usSize, mmSize, material);
    }

    public Crochet(){}

    public String setIdNumber(){
        return "holding place";
    }

/* This method receives input and writes to a file to save the input
* I am considering splitting this into two separate methods and building
* user input into an Object in one and then writing to the file in another
* I think that when this gets transitioned to a DB it will be a smoother
* transition*/

    public void addNeedleToFile() {
        File yarn = new File("TextFiles/Crochet.txt");
        Date date = new Date();
        SimpleDateFormat dateTime = new SimpleDateFormat("MM/dd/yyy hh:mm:ss aa");
        String stringDate = dateTime.format(date);
        try (PrintWriter dataOutput = new PrintWriter(new FileOutputStream(yarn, true))) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter needle US size: ");
            dataOutput.println("Needles added: " + stringDate + "US Size: " + input.nextLine());
            dataOutput.println("mm Size: " + usToMmConverter(input.nextLine()));
            System.out.println("Please enter the needle material: ");
            dataOutput.println("Material: " + input.nextLine());
            System.out.println("Your needles have been added to the list!");
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
    }

//This method converts input us sizing to mm sizing
    public double usToMmConverter(String usSize){
        switch(usSize){
            case "B-1":
                super.setMmSize(2.0);
                break;
            case "C-2":
                super.setMmSize(2.5);
                break;
            case "D-3":
                super.setMmSize(3.0);
                break;
            case "E-4":
                super.setMmSize(3.5);
                break;
            case"G-6":
                super.setMmSize(4.0);
                break;
            case "7":
                super.setMmSize(4.5);
                break;
            case "H-8":
                super.setMmSize(5.0);
                break;
            case "I-9":
                super.setMmSize(5.5);
                break;
            case "J-10":
                super.setMmSize(6.0);
                break;
            case "K-10.5":
                super.setMmSize(6.5);
                break;
            case "L-11":
                super.setMmSize(8.0);
                break;
            case "M/N-13":
                super.setMmSize(9.0);
                break;
            case "N/P-15":
                super.setMmSize(10.0);
                break;
            case "P/Q":
                super.setMmSize(15.0);
                break;
            case "Q":
                super.setMmSize(16.0);
                break;
            case "S":
                super.setMmSize(19.0);
                break;
            case "U":
                super.setMmSize(25.0);
                break;
        }
        return super.getMmSize();
    }

}
