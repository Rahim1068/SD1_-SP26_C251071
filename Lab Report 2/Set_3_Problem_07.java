package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting time (X pm): ");
        int X = input.nextInt();

        if (X + 3 <= 10) {
            System.out.println("Yes, he can complete on time");
        } else {
            System.out.println("No, he cannot complete on time");
        }
    }

}