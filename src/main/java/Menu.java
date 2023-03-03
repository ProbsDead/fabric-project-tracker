import model.Needle;
import model.Yarn;

import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {

    private PrintWriter out;

    public Menu(){}

    public void menu(String[] menuOptions){
        int counter = 1;
        System.out.println("Menu Options:");
        for(String item : menuOptions){
            System.out.println(counter + ". " + item);
            counter++;
        }

        System.out.println("\n>>>>>>");
    }

    public Yarn promptForNewYarnInput(Scanner in){
        Yarn newYarn = new Yarn();
        System.out.println("General color: ");
        newYarn.setGeneralColor(in.nextLine());
        System.out.println("Manufacturer color: ");
        newYarn.setManufacturerColor(in.nextLine());
        System.out.println("Weight: ");
        newYarn.setWeight(in.nextLine());
        System.out.println("Grams: ");
        newYarn.setGrams(Integer.parseInt(in.nextLine()));
        System.out.println("Is this yarn in use? (Y/N) ");
        if(in.nextLine().equalsIgnoreCase("y")){
            newYarn.setInUse(true);
        }else{
            newYarn.setInUse(false);
        }
        return newYarn;
    }

    public Needle promptForNewNeedle(Scanner in){
        Needle newNeedle = new Needle();
        System.out.println("Material: ");
        newNeedle.setMaterial(in.nextLine());
        System.out.println("US sizing: ");
        newNeedle.setUsSize(in.nextLine());
        System.out.println("(K)nit or (C)rochet: ");
        if(in.nextLine().equalsIgnoreCase("k")){
            newNeedle.setMmSize(newNeedle.usToMmConverterKnit(newNeedle.getUsSize()));
            System.out.println("In the round? (Y/N)");
            if(in.nextLine().equalsIgnoreCase("y")){
                newNeedle.setRound(true);
            }else if(in.nextLine().equalsIgnoreCase("n")){
                newNeedle.setRound(false);
            }else{
                System.out.println("Invalid input");
            }
        } else if (in.nextLine().equalsIgnoreCase("c")){

        }
        return newNeedle;

    }


}
