package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = input.nextInt();

        System.out.print("Enter B: ");
        int B = input.nextInt();

        System.out.print("Enter C: ");
        int C = input.nextInt();

        int lowerBound = Math.max(A, C);

        if (lowerBound <= B) {
            System.out.println("Yes, they can agree");
        } else {
            System.out.println("No, they cannot agree");
        }
    }

}
