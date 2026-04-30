package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter B1: ");
        int B1 = input.nextInt();

        System.out.print("Enter B2: ");
        int B2 = input.nextInt();

        System.out.print("Enter B3: ");
        int B3 = input.nextInt();

        int empty = 0;

        if (B1 == 0) empty++;
        if (B2 == 0) empty++;
        if (B3 == 0) empty++;

        if (empty >= 2) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }
    }

}