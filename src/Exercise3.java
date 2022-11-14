import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Input an odd, positive number that is greater than 3");
            number = scanner.nextInt();
        } while (number % 2 == 0 || number < 3);

        for(int i = 1; i <= number; i++){
            if (i % 2 != 0) {
                for (int j = (number - 1); j >= (i / 2); j--){
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (int i = number - 1; i >= 1; i--){
            if (i % 2 != 0) {
                for (int j = number - 1; j >= (i / 2); j--){
                    System.out.print(" ");
                }
                for (int k = i; k >= 1; k--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
