package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_2_Problem_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }

}