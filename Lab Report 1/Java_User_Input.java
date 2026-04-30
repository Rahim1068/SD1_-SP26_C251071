package sd1_lab_report_1_c251071;

import java.util.Scanner;

public class Java_User_Input {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }

}