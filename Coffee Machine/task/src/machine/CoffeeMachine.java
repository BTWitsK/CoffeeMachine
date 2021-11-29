package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterLeft = 400;
        int milkLeft = 540;
        int beansLeft = 120;
        int cupsLeft = 9;
        int dollarsLeft = 550;

        printSupplies(waterLeft, milkLeft, beansLeft, cupsLeft, dollarsLeft);
        System.out.println("Write action (buy, fill, take):");
        String input = scanner.nextLine();

        switch (input) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int coffeeType = scanner.nextInt();
                buy(coffeeType, waterLeft, milkLeft, beansLeft, cupsLeft, dollarsLeft);
                break;
            case "fill":
                fill(waterLeft, milkLeft, beansLeft, cupsLeft, dollarsLeft);
                break;
            case "take":
                take(dollarsLeft);
                printSupplies(waterLeft, milkLeft, beansLeft, cupsLeft, 0);
                break;
            default:
                break;

        }

    }

    public static void printSupplies(int waterLeft, int milkLeft, int beansLeft, int cupsLeft, int dollarsLeft) {

        System.out.println("The coffee machine has:\n");
        System.out.printf("%d ml of water\n", waterLeft);
        System.out.printf("%d ml of milk\n", milkLeft);
        System.out.printf("%d g of coffee beans\n", beansLeft);
        System.out.printf("%d disposable cups\n", cupsLeft);
        System.out.printf("$%d of money\n", dollarsLeft);
    }

    public static void buy(int coffee, int water, int milk, int beans, int cups, int dollars) {
        cups--;

        switch (coffee) {
            case 1:
                printSupplies(water - 250, milk, beans - 16, cups, dollars + 4);
                break;
            case 2:
                printSupplies(water - 350, milk - 75, beans - 20, cups, dollars + 7);
                break;
            case 3:
                printSupplies(water - 200, milk - 100, beans - 12, cups, dollars + 6);
                break;
            default:
                break;
        }

    }


    public static void fill(int waterLeft, int milkLeft, int beansLeft, int cupsLeft, int dollarsLeft) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        waterLeft += scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        milkLeft += scanner.nextInt();

        System.out.println("Write how many grams of coffee you want to add:");
        beansLeft += scanner.nextInt();

        System.out.println("Write how many disposable cups coffee you want to add:");
        cupsLeft += scanner.nextInt();

        printSupplies(waterLeft, milkLeft, beansLeft, cupsLeft, dollarsLeft);

    }

    public static void take(int dollarsLeft) {
        System.out.printf("I gave you $%d\n", dollarsLeft);
    }
}



        /* System.out.println("Write how many ml of water the coffee machine has: ");
        int waterLeft = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkLeft = scanner.nextInt();

        System.out.println("Write how many grams of milk the coffee machine has: ");
        int beansLeft = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        int coffeeCups = scanner.nextInt();

        int cups = Integer.min((waterLeft / water),Integer.min ((milkLeft / milk), (beansLeft / beans)));

        if (coffeeCups == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (coffeeCups < cups) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)\n", cups - coffeeCups);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee", cups);
        }

         */
