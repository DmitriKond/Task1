public class Exercise7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++){
            int narcNumber = i;
            int digitCount = 0;
            int digitSum = 0;

            int j = i;
            do {
                digitCount++;
                j = j / 10;
            } while (j > 0);

            do {
                int narcNumDigit = narcNumber % 10;
                digitSum += (int) Math.pow(narcNumDigit, digitCount);
                narcNumber = narcNumber / 10;
            } while (narcNumber > 0);

            if (digitSum == i){
                System.out.print(i+ ", ");
            }
        }
    }
}
