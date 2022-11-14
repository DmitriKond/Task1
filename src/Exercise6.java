import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialNum;
        int numDigitSum = 0;

        System.out.println("Input a number");
        initialNum = scanner.nextInt();
        do {
            numDigitSum += initialNum % 10;
            initialNum = initialNum / 10;
        } while (initialNum > 0);
        System.out.println("The sum of the number's digits is " +numDigitSum);
    }
}
