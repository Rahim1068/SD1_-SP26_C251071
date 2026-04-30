package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_1_Problem_09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }

}