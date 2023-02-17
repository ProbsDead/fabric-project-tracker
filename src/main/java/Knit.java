import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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

    public Knit(String usSize, double mmSize, String material, boolean inUse, boolean isRound) {
        super(usSize, mmSize, material, inUse);
        this.isRound = isRound;
    }

    public Knit(String usSize, double mmSize, String material, boolean isRound) {
        super(usSize, mmSize, material);
        this.isRound = isRound;
    }

    public String setIdNumber(){
        return "holding place";
    }

// UNFINISHED ADD TO FILE METHOD NEED TO FIGURE OUT WHAT CAN BE INHERITED FROM SUPERCLASS
    public void addNeedleToFile() {
        File yarn = new File("TextFiles/Yarn.txt");
        Date date = new Date();
        SimpleDateFormat dateTime = new SimpleDateFormat("MM/dd/yyy hh:mm:ss aa");
        String stringDate = dateTime.format(date);
        try (PrintWriter dataOutput = new PrintWriter(new FileOutputStream(yarn, true))) {
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();


            if (userInput.equalsIgnoreCase("Needle")){
                System.out.println("Please enter needle US size: ");
                dataOutput.println("US Size: " + input.nextLine());
                dataOutput.println("mm Size: " + usToMmConverter(input.nextLine()));
                System.out.println("Please enter the needle material: ");
                dataOutput.println("Material: " + input.nextLine());
                System.out.println("Is this a Crochet ");



            }

        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
    }





    public double usToMmConverter(String usSize){
        switch(usSize){
            case "00000":
                super.setMmSize(1.0);
                break;
            case "0000":
                super.setMmSize(1.25);
                break;
            case "000":
                super.setMmSize(1.5);
                break;
            case "00":
                super.setMmSize(1.75);
                break;
            case"0":
                super.setMmSize(2.0);
                break;
            case "1":
                super.setMmSize(2.25);
                break;
            case "1.5":
                super.setMmSize(2.5);
                break;
            case "2":
                super.setMmSize(2.75);
                break;
            case "2.5":
                super.setMmSize(3.0);
                break;
            case "3":
                super.setMmSize(3.25);
                break;
            case "4":
                super.setMmSize(3.5);
                break;
            case "5":
                super.setMmSize(3.75);
                break;
            case "6":
                super.setMmSize(4.0);
                break;
            case "7":
                super.setMmSize(4.5);
                break;
            case "8":
                super.setMmSize(5.0);
                break;
            case "9":
                super.setMmSize(5.5);
                break;
            case "10":
                super.setMmSize(6.0);
                break;
            case "10.5":
                super.setMmSize(6.5);
                break;
            case "11":
                super.setMmSize(8.0);
                break;
            case "13":
                super.setMmSize(9.0);
                break;
            case "14":
                super.setMmSize(9.5);
                break;
            case "15":
                super.setMmSize(10.0);
                break;
            case "17":
                super.setMmSize(12.0);
                break;
            case "19":
                super.setMmSize(16.0);
                break;
            case "35":
                super.setMmSize(19.0);
                break;
            case "50":
                super.setMmSize(25.0);
                break;
        }
        return super.getMmSize();
    }
}


