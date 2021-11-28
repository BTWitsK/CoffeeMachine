package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need: ");
        int coffeeCups = scanner.nextInt();
        final int water = 200;
        final int milk = 50;
        final int coffeeBeans = 15;

        System.out.printf("For %d cups of coffee you will need:\n", coffeeCups);
        System.out.printf("%d ml of water\n", water * coffeeCups);
        System.out.printf("%d ml of milk\n", milk * coffeeCups);
        System.out.printf("%d g of coffee beans\n", coffeeBeans * coffeeCups);


    }
}
