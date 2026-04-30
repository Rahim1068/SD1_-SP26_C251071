package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_2_Problem_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The numbers are:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }

}