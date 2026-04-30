package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = input.nextInt();

        System.out.print("Enter B: ");
        int B = input.nextInt();

        System.out.print("Enter C: ");
        int C = input.nextInt();

        System.out.print("Enter X: ");
        int X = input.nextInt();

        if (X == A || X == B || X == C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}