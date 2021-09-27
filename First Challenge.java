//1st Challenge
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("how many people are there to compare your wealth?");
        int size = keyboard.nextInt();
        double[] money = new double[size];

        //Read temperatures and computer their average
        System.out.println("Enter" + " " + money.length + " " + "peoples amount of money they have");
        double sum = 0;
        for (int index = 0; index < money.length; index++) {
            money[index] = keyboard.nextDouble();
            sum = sum + money[index];
        }
        double average = sum / money.length;
        System.out.println("The average amount of wealth is " + average);

        //Display each temperature and its relation to the average:
        System.out.println("The amount of wealth are");
        for (int index = 0; index < money.length; index++)
        {
            if (money[index] < average)
                System.out.println("$" + money[index] + " below average");
            else if (money[index] > average)
                System.out.println("$" + money[index] + " above average");
            else //temperature[index] == average
                System.out.println("$" + money[index] + " the average");
        }
        System.out.println("Have a nice week.");
    }
}

