package sd_lab_report_2_c251071;

import java.util.Scanner;

public class Set_3_Problem_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        if (word.length() > 0) {
            char first = Character.toUpperCase(word.charAt(0));
            String result = first + word.substring(1);
            System.out.println(result);
        }
    }

}