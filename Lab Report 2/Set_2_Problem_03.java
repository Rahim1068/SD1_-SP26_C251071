package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_2_Problem_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        int min = numbers[0];

        for (int i = 1; i < 5; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Smallest number is: " + min);
    }

}