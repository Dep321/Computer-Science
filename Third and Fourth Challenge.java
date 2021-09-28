import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("How much data will you input to find the minimum and maximum value of the temperatures?");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        int[] temperatures = new int[size];
        System.out.println("You will be finding the min and max values from" + " " + temperatures.length + " "  +
                "values of temperature:");
        int sum = 0;
        for (int i = 0; i< temperatures.length; i++){
            temperatures[i]= keyboard.nextInt();
            sum = sum+ temperatures[i];
        }
        int smallest = temperatures[0];
        int largest = temperatures[0];

        for (int i = 0; i<temperatures.length; i++) {
            if (temperatures[i] < smallest) smallest = temperatures[i];
            if (temperatures[i] > largest) largest = temperatures[i];
        }
            System.out.println("here is the Minimum value:" +  " " + smallest);
            System.out.println("here is the Maximum value:" +  " " + largest);

    }
}
