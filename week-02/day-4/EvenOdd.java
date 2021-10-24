package conditionals;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg 1 számot!");
        int userNumber = scanner.nextInt();
        if (userNumber % 2 == 0) {
            System.out.println("Páros");
        } else {
            System.out.println("Páratlan");
        }
    }
}