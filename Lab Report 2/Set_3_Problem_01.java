package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = input.nextInt();

        System.out.print("Enter C: ");
        int C = input.nextInt();

        if ((A + C) % 2 == 0) {
            int B = (A + C) / 2;
            System.out.println("B exists and B = " + B);
        } else {
            System.out.println("No integer B exists");
        }
    }

}