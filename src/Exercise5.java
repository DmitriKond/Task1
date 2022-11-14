import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fiboCheckNumber;
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.println("This is some change");
        System.out.println("Input a number to check if it's in the Fibonacci Sequence");
        fiboCheckNumber = scanner.nextInt();
        do {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        } while (num3 < fiboCheckNumber);
        if (fiboCheckNumber % num3 == 0){
            System.out.println("The number is in the Fibonacci Sequence");
        } else {
            System.out.println("The number is not in the Fibonacci Sequence");
        }
    }
}

