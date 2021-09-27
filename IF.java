import java.util.Scanner;
public class IF {
    public static void main(String[] args) {
        System.out.println("List a number between 1 and 10 to know what favorite food you like");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();
        if (inputtedNum < 5) {
        System.out.println("Good Luck");
        } else {
            System.out.println("Bad Luck");
        }
    }
}
