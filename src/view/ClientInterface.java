package view;
import java.util.Scanner;
import model.Dispenser;
import model.Drink;

public class ClientInterface {

    private final Scanner scan;
    private Dispenser dispenser;

    public ClientInterface(Dispenser dispenser){

        this.dispenser = dispenser;
        this.scan = new Scanner(System.in);

    }

    public void eraseConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void waitForUser() {
        System.out.println("Please input a key to continue...");
        this.scan.nextLine();
    }

    public String displayDispenser() {


        System.out.println("╔══════════════════════════ MENU ══════════════════════════╗");
        System.out.println("║  1. add change                                           ║");
        System.out.println("║  2. flush change                                         ║");
        this.dispenser.getContent().values().forEach(d -> {
            System.out.println("║  "+d.getName()+ " ".repeat(45-d.getName().length()) + d.getPrice() + " ".repeat(11 - String.valueOf(d.getPrice()).length()) + "║");
        });
        System.out.println("║                                                          ║");
        System.out.println("║                                                          ║");
        System.out.println("║                                                          ║");
        System.out.println("║ 0:quitter                                    Change: "+this.dispenser.getChange()+" ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        System.out.print("\nChoix : ");

        try {
            String choix = this.scan.nextLine();
            return choix;
        } catch (Exception e) {

            return "";

        }

    }

    public String addChange(){

        System.out.println("╔══════════════════════════ MENU ══════════════════════════╗");
        System.out.println("║  1. 1 euro                                               ║");
        System.out.println("║  2. 50 cents                                             ║");
        System.out.println("║                                                          ║");
        System.out.println("║  0. cancel                                               ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        
        try {
            String choix = this.scan.nextLine();
            return choix;
        } catch (Exception e) {

            return "";

        }

    }

    public void buyingDrink(Drink can){
        System.out.println("Here comes your can of "+can.getName());
    }

    public void closeScan() {

        this.scan.close();

    }

    public void message(String message){
        System.out.println(message);
    }
}