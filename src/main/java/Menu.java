import java.io.PrintWriter;

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
}
