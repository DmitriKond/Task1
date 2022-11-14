import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aValue;
        int bValue;
        int cValue;

        System.out.println("Input the value of a:");
        aValue = scanner.nextInt();
        System.out.println("Input the value of b:");
        bValue = scanner.nextInt();
        System.out.println("Input the value of c:");
        cValue = scanner.nextInt();

        double sqrtResult = ((bValue * bValue) - (4 * aValue * cValue));
        sqrtResult = Math.sqrt(sqrtResult);

        double xValue1 = (-(bValue) + sqrtResult) / (2 * aValue);
        double xValue2 = (-(bValue) - sqrtResult) / (2 * aValue);

        if (xValue1 != xValue2){
            System.out.println("2 answers were found for the quadratic equation: X1 = " +xValue1+ " and X2 = " +xValue2);
        } else if (xValue1 == xValue2) {
            System.out.println("1 answer was found for the quadratic equation: X1,2 = " +xValue1);
        } else {
            System.out.println("No answers were found for the quadratic equation.");
        }
    }
}
