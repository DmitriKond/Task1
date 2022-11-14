import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum;
        int numProgression;
        int numAmount;

        System.out.println("Input the first number of the sequence:");
        firstNum = scanner.nextInt();
        System.out.println("Input the sequence progression:");
        numProgression = scanner.nextInt();
        do {
            System.out.println("Input the amount of numbers in the sequence (Must be positive):");
            numAmount = scanner.nextInt();
        } while (numAmount < 0);

        for (int i = 1; i <= numAmount; i++){
            System.out.print(firstNum+ ", ");
            firstNum += numProgression;
        }
    }
}
