package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = input.nextInt();

        System.out.print("Enter B: ");
        int B = input.nextInt();

        System.out.print("Enter C: ");
        int C = input.nextInt();

        if (A + B > 2 * C) {
            System.out.println("Yes, average is greater than C");
        } else {
            System.out.println("No, average is not greater than C");
        }
    }

}