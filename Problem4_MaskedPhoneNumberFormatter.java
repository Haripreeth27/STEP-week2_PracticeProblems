import java.util.Scanner;

public class Problem4_MaskedPhoneNumberFormatter {

    static void formatPhone(String phone) {

        if (phone.length() != 10) {
            System.out.println("Invalid phone number");
            return;
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                System.out.println("Invalid phone number");
                return;
            }
        }

        StringBuilder result = new StringBuilder();

        result.append("XXXXXX-");
        result.append(phone.substring(6));

        System.out.println(result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        formatPhone(phone);

        sc.close();
    }
}