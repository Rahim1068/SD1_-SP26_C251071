package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_2_Problem_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        boolean found = false;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter number to search: ");
        int key = input.nextInt();

        for (int i = 0; i < 5; i++) {
            if (numbers[i] == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }

}