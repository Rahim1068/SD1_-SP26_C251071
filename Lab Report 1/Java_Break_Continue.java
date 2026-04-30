package sd1_lab_report_1_c251071;

public class Java_Break_Continue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("----");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

    }

}