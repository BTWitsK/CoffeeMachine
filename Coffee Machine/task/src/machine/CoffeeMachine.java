package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int water = 200;
        final int milk = 50;
        final int beans= 15;

        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterLeft = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkLeft = scanner.nextInt();

        System.out.println("Write how many grams of milk the coffee machine has: ");
        int beansLeft = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        int coffeeCups = scanner.nextInt();

        int cups = Integer.min((waterLeft / water),Integer.min ((milkLeft / milk), (beansLeft / beans)));

        if (Integer.compare(coffeeCups,cups) == 0) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (Integer.compare(coffeeCups, cups) < 0) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)\n", cups - coffeeCups);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee", cups);
        }









    }
}
