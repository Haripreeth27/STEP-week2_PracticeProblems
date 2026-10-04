import java.util.Scanner;

public class Problem5_BankTransactionReference {

    static void validateReference(String reference) {

        reference = reference.trim().toUpperCase();

        if (reference.length() != 14) {
            System.out.println("Invalid: Wrong length");
            return;
        }

        // First 3 characters must be letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                System.out.println("Invalid: Bank code must contain letters");
                return;
            }
        }

        // Remaining 11 characters must be digits
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                System.out.println("Invalid: Body must contain digits");
                return;
            }
        }

        String bankCode = reference.substring(0, 3);
        String date = reference.substring(3, 9);
        String sequence = reference.substring(9);

        System.out.println("[" + bankCode + "] DATE: "
                + date.substring(0, 2) + "/"
                + date.substring(2, 4) + "/"
                + date.substring(4, 6)
                + " | SEQ: " + sequence);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction reference: ");
        String reference = sc.nextLine();

        validateReference(reference);

        sc.close();
    }
}