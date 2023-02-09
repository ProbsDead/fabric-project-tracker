import java.util.Scanner;

public class InputOutput {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! Please input what you would like to add to your Inventory: Yarn or Needles");
        String userInput = input.nextLine();

        if (userInput.equals("Yarn")){
            System.out.println("Please enter the yarn color: ");
            String yarnColor = input.nextLine();
            System.out.println("Please enter the yarn weight: ");
            String yarnWeight = input.nextLine();
            System.out.println("Please enter the amount of yarn in grams (whole numbers only): ");
            int gramsYarn = Integer.parseInt(input.nextLine());
            Yarn newYarn = new Yarn(yarnColor, yarnWeight, gramsYarn);
            System.out.println("Your yarn has been added to the list!");
        } else if (userInput.equals("Needles")){
            System.out.println("Please enter the needle US Size: ");
            int usSize = Integer.parseInt(input.nextLine());
            System.out.println("Please enter the mm size: ");
            double mmSize = Double.parseDouble(input.nextLine());
            System.out.println("Please enter the needle material: ");
            String material = input.nextLine();
            System.out.println("Is this a Crochet needle or a Knitting needle? (Only enter either Crochet or Knit");
            String needleType = input.nextLine();
            if (needleType.equals("Knit")){
                System.out.println("Is this needle in the round? (true/false)");
                Boolean isRound = input.nextBoolean();
                Knit newKnit = new Knit(usSize, mmSize, material, isRound);
            } else {
                Crochet newCrochet = new Crochet(usSize, mmSize, material);
            }
            System.out.println("Your needles have been added to the List!");
        }
    }
}
