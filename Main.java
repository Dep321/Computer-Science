import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String studentFirstName;
        String studentLastName;
        String firstWord;
        String secondWord;
        String thirdWord;
        String fourthWord;
        String fifthWord;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        studentFirstName = input.next();
        studentLastName = input.next();
        System.out.println("List 5 additional words");
        firstWord = input.next();
        secondWord = input.next();
        thirdWord = input.next();
        fourthWord = input.next();
        fifthWord = input.next();
        System.out.println("Hi my name is" + " " + studentFirstName + " " + studentLastName + "." + " "
                + "It was a" + " " + firstWord + " " + ", cold November day." + " " + "I woke up to the" + " " +
                secondWord + " " + "smell of" + " " + thirdWord + " " + "roasting in the" + " " + fourthWord +
                " " + "downstairs." + " " + "I" + " " + fifthWord + " " + "down the stairs to see if I could help" +
                " " + firstWord + " " + "the dinner." );
    }

}
