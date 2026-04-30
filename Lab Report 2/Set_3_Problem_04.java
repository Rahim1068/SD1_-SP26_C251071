package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.print("Enter c: ");
        int c = input.nextInt();

        int result;

        if (a == b) {
            result = c;
        } else if (a == c) {
            result = b;
        } else {
            result = a;
        }

        System.out.println("Unique value: " + result);
    }

}