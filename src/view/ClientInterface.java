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
        System.out.println("║                                                          ║");
        for(Drink d : dispenser.getContent.values());{
            System.out.println("║ "+d.getName()+"                                       "+d.getPrice()+"                 ║");
        }
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

    public void closeScan() {

        this.scan.close();

    }

}