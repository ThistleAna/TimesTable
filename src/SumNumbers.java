import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        // Activity title: SumNumbers
        int sumTotal =0;
        //read user input
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number to sum to: ");
        int number = reader.nextInt();

        int i = 1;
        while (i <= number) {
            System.out.print(i);
            sumTotal = sumTotal + i;
            i++;
        }

        System.out.println("The total is " + sumTotal);

    }
}
