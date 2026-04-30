package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_2_Problem_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
        }

        double average = (double) sum / 5;

        System.out.println("Average = " + average);
    }

}