package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of sections (X): ");
        int X = input.nextInt();

        System.out.print("Enter students per section (Y): ");
        int Y = input.nextInt();

        System.out.print("Enter passed students (Z): ");
        int Z = input.nextInt();

        if (2 * Z > X * Y) {
            System.out.println("Yes, more than 50% passed");
        } else {
            System.out.println("No, not more than 50%");
        }
    }

}