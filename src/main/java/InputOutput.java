import java.util.Scanner;

public class InputOutput {
    private static final String[] MAIN_MENU_CHOICES = {"Input Yarn/Needles", "Retrieve Yarn/Needles", "Print Stock", "Exit"};

     Scanner input = new Scanner(System.in);
     Yarn inputYarn = new Yarn();
     InventoryAdd mainAdd = new InventoryAdd();


    public void run(){
        System.out.println("Enter the number corresponding with what you would like to do:\n");
        Menu menuChoices = new Menu();

        boolean running = true;
        while (running){

            menuChoices.menu(MAIN_MENU_CHOICES);
            String choice = input.next();
            if(choice.equals("1")){
                System.out.println("Welcome! Please input what you would like to add to your Inventory: Yarn or Needles");
                inputYarn.addYarnToFile();

            } else if(choice.equals("2")){

            }else if(choice.equals("3")){

            }else if (choice.equals("4")){
                running = false;
            }


        }

    }



    public static void main(String[] args) {
        InputOutput runMethod = new InputOutput();
        runMethod.run();
    }
}
