package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter pulp in kg (N): ");
        int N = input.nextInt();

        int notebooks = N * 10;

        System.out.println("Number of notebooks: " + notebooks);
    }

}