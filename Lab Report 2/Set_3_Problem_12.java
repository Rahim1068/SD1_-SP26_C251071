package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of children (N): ");
        int N = input.nextInt();

        System.out.print("Enter available candies (X): ");
        int X = input.nextInt();

        int availablePackets = X / 4;

        int packetsNeeded;

        if (availablePackets >= N) {
            packetsNeeded = 0;
        } else {
            packetsNeeded = N - availablePackets;
        }

        System.out.println("Packets to buy: " + packetsNeeded);
    }

}