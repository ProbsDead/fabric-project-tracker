import model.Needle;
import model.Yarn;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.Scanner;

public class InputOutput {
    private static final String[] MAIN_MENU_CHOICES = {"Input model.Yarn/Needles", "Retrieve model.Yarn/Needles", "Print Stock", "Exit"};

     Scanner input = new Scanner(System.in);
     Yarn inputYarn = new Yarn();
     InventoryAdd mainAdd = new InventoryAdd();
     Needle inputNeedle = new Needle();


    public void run(){
        System.out.println("Enter the number corresponding with what you would like to do:\n");
        Menu menuChoices = new Menu();

        boolean running = true;
        while (running){

            menuChoices.menu(MAIN_MENU_CHOICES);
            String choice = input.nextLine();
            if(choice.equals("1")){
                System.out.println("Welcome! Please input what you would like to add to your Inventory: (Y)arn or (N)eedles");
                if(input.nextLine().equalsIgnoreCase("y")){
                    inputYarn.addYarnToFile();
                } else if (input.nextLine().equalsIgnoreCase("n")){
                    inputNeedle.addNeedleToFile();
                }
            } else if(choice.equals("2")){

            }else if(choice.equals("3")){

            }else if (choice.equals("4")){
                running = false;
            }


        }

    }



    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/Yarn");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");
        InputOutput runMethod = new InputOutput();
        runMethod.run();
    }
}
