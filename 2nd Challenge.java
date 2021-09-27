

import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        System.out.println("How many temperatures do you want to sort?");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        double[] temperature = new double[size];
        System.out.println("Enter"+ " " + temperature.length + " " + "temperatures");
        double sum = 0;
        for (int index = 0; index < temperature.length; index++)
        {
            temperature[index] = keyboard.nextDouble();
            sum = sum + temperature[index];
        }
        Arrays.sort(temperature);
        for (int i=0; i <= temperature.length-1;i++){
            System.out.println(temperature[i]);
        }
    }
}
