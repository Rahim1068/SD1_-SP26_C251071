package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_2_Problem_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array (Ascending):");

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }

}