import java.util.Scanner;

public class Problem3_FileExtensionValidator {

    static void validateFile(String filename) {

        int dot = filename.lastIndexOf('.');

        if (dot == -1) {
            System.out.println("Rejected — invalid file type");
            return;
        }

        String extension = filename.substring(dot + 1);

        if (extension.equalsIgnoreCase("pdf")
                || extension.equalsIgnoreCase("docx")
                || extension.equalsIgnoreCase("zip")) {

            System.out.println("Accepted");
        } else {
            System.out.println("Rejected — invalid file type");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        validateFile(filename);

        sc.close();
    }
}