package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter daily working hours (X): ");
        int X = input.nextInt();

        System.out.print("Enter Wednesday hours (Y): ");
        int Y = input.nextInt();

        int totalHours = 4 * X + Y;

        System.out.println("Total working hours in a week: " + totalHours);
    }

}