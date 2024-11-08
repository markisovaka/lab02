import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getFileName(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}
