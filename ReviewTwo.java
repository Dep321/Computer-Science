//Q1 of Part 2
//import java.util.Arrays;
//import java.util.Scanner;
//public class ReviewTwo {
//    public static void main(String[] args) {
//        System.out.println("How many temperatures would you want to sort?");
//        Scanner keyboard = new Scanner(System.in);
//        int size = keyboard.nextInt();
//        double[] temperature = new double[size];
//        System.out.println("Pls put in" + temperature.length + "temperatures");
//        double sum = 0;
//        for (int i = 0; i<= temperature.length-1; i++)
//        {
//            temperature[i]= keyboard.nextDouble();
//            sum = sum + temperature[i];
//
//        }
//        Arrays.sort(temperature);
//        for (int i=0; i<= temperature.length-1; i++)
//        {
//           System.out.println(temperature[i]);
//        }
//    }
//}

//Q2 of Part 2
//import java.util.Scanner;
//public class ReviewTwo {
//    public static void main(String[] args) {
//        System.out.println("To convert from inches to meters, please instert a number in inches");
//        Scanner keyboard = new Scanner(System.in);
//        double inches = keyboard.nextDouble();
//        double meters = inches/39.37;
//        System.out.println("Here is the converted distance from inches to meters:"+ " " + meters);
//    }
//}

//Q3 and 4 of Part 2
//import java.util.Scanner;
//import java.util.Arrays;
//public class ReviewTwo {
//    public static void main(String[] args) {
//        System.out.println("Insert the amount of values you want to create an array of");
//        Scanner keyboard = new Scanner(System.in);
//        int size = keyboard.nextInt();
//        double[] arrayCalculation = new double[size];
//        System.out.println("Pls put in"+ " " + arrayCalculation.length + " " +"values");
//        double sum = 0;
//        for (int i =0; i<=arrayCalculation.length-1; i++)
//        {
//        arrayCalculation[i]= keyboard.nextDouble();
//        sum = sum + arrayCalculation[i];
//        }
//        double smallest = arrayCalculation[0];
//        double largest = arrayCalculation[0];
//        for (int i=0; i<= arrayCalculation.length-1; i++)
//        {
//           if (arrayCalculation[i] < smallest) smallest = arrayCalculation[i];
//           if (arrayCalculation[i] > largest) largest = arrayCalculation[i];
//        }
//        System.out.println("Your total sum of the array is"+" "+ sum);
//        System.out.println("The minimum value of your array is" + " " + smallest);
//        System.out.println("The maximum value of your array is" + " " + largest);
//    }
//}
