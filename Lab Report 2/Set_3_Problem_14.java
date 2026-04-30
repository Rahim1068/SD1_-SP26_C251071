package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter profit of A (P): ");
        int P = input.nextInt();

        System.out.print("Enter profit of B (Q): ");
        int Q = input.nextInt();

        System.out.print("Enter profit of C (R): ");
        int R = input.nextInt();

        System.out.print("Enter profit of D (S): ");
        int S = input.nextInt();

        if (P > Q + R + S || 
            Q > P + R + S || 
            R > P + Q + S || 
            S > P + Q + R) {
            
            System.out.println("Monopoly exists");
        } else {
            System.out.println("No monopoly");
        }
    }

}