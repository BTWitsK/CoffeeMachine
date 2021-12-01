package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static int waterLeft = 400;
    static int milkLeft = 540;
    static int beansLeft = 120;
    static int cupsLeft = 9;
    static int dollarsLeft = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String input = scanner.nextLine();

        switch (input) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String coffeeType = scanner.nextLine();
                CoffeeMachine.buy(coffeeType);
                CoffeeMachine.printSupplies();
                break;
            case "fill":
                CoffeeMachine.fill();
                CoffeeMachine.printSupplies();
                break;
            case "take":
                CoffeeMachine.take();
                break;
            case "remaining":
                CoffeeMachine.printSupplies();
            default:
                break;

        }

    }

    public static void printSupplies() {

        System.out.println("The coffee machine has:\n");
        System.out.printf("%d ml of water\n", waterLeft);
        System.out.printf("%d ml of milk\n", milkLeft);
        System.out.printf("%d g of coffee beans\n", beansLeft);
        System.out.printf("%d disposable cups\n", cupsLeft);
        System.out.printf("$%d of money\n", dollarsLeft);
    }

    public static void buy(String coffee) {

        switch (coffee) {
            case "1":
                CoffeeMachine.waterLeft -= 250;
                CoffeeMachine.beansLeft -= 16;
                CoffeeMachine.cupsLeft--;
                CoffeeMachine.dollarsLeft += 4;
                break;
            case "2":
                CoffeeMachine.waterLeft -= 350;
                CoffeeMachine.milkLeft -= 75;
                CoffeeMachine.beansLeft -= 20;
                CoffeeMachine.cupsLeft--;
                CoffeeMachine.dollarsLeft += 7;
                break;
            case "3":
                CoffeeMachine.waterLeft -= 200;
                CoffeeMachine.milkLeft -= 100;
                CoffeeMachine.beansLeft -= 12;
                CoffeeMachine.cupsLeft--;
                CoffeeMachine.dollarsLeft += 6;
                break;
            default:
                break;
        }

    }


    public static void fill() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        CoffeeMachine.waterLeft += scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        CoffeeMachine.milkLeft += scanner.nextInt();

        System.out.println("Write how many grams of coffee you want to add:");
        CoffeeMachine.beansLeft += scanner.nextInt();

        System.out.println("Write how many disposable cups coffee you want to add:");
        CoffeeMachine.cupsLeft += scanner.nextInt();

    }

    public static void take() {
        System.out.printf("I gave you $%d\n", CoffeeMachine.dollarsLeft);
        CoffeeMachine.dollarsLeft = 0;
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
