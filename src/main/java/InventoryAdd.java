import model.Needle;
import model.Yarn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryAdd {

    private List<Yarn> yarnToAdd = new ArrayList<>();
    private List<Needle> needleToAdd = new ArrayList<>();


    public void addInventory(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! Please input what you would like to add to your Inventory: model.Yarn or Needles");
        String userInput = input.nextLine();

         if (userInput.equalsIgnoreCase("Needles")) {
             System.out.println("Please enter the needle US Size: ");
             int usSize = Integer.parseInt(input.nextLine());
             System.out.println("Please enter the mm size: ");
             double mmSize = Double.parseDouble(input.nextLine());
             System.out.println("Please enter the needle material: ");
             String material = input.nextLine();
             System.out.println("Is this a model.Crochet needle or a Knitting needle? (Only enter either model.Crochet or model.Knit)");
             String needleType = input.nextLine();
//            if (needleType.equalsIgnoreCase("model.Knit")){
//                System.out.println("Is this needle in the round? (true/false)");
//                Boolean isRound = input.nextBoolean();
//                model.Needle newKnit = new model.Knit(usSize, mmSize, material, isRound);
//                needleToAdd.add(newKnit);
//                newKnit.writeToFile(needleToAdd);
//            } else if (needleType.equalsIgnoreCase("model.Crochet")) {
//                model.Needle newCrochet = new model.Crochet(usSize, mmSize, material);
//                needleToAdd.add(newCrochet);
//                newCrochet.writeToFile(needleToAdd);
//            } else {
//                System.out.println("Invalid input try again: ");
//            }
//            System.out.println("Your needles have been added to the List!");
//        }
//    }

         }}

}
