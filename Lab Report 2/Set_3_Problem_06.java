package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of friends (N): ");
        int N = input.nextInt();

        System.out.print("Enter cost of one subscription (X): ");
        int X = input.nextInt();

        int subscriptions = (N + 5) / 6;

        int totalCost = subscriptions * X;

        System.out.println("Minimum total cost: " + totalCost);
    }

}