import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeNumAmount;
        int primeCount = 0;
        int num = 2;

        System.out.println("Enter the amount of prime numbers you wish to see");
        primeNumAmount = scanner.nextInt();
        do {
            int notPrimeCheck = 0;
            for (int i = 2; i <= 9; i++){
                if (num == i){
                    continue;
                }
                if (num % i == 0){
                    notPrimeCheck++;
                }
            }
            if (notPrimeCheck == 0){
                System.out.print(num+ ", ");
                primeCount++;
            }
            num++;
        } while (primeCount < primeNumAmount);
    }
}