//Question 1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double Fahrenheit;
        double Celsius;

        Scanner input = new Scanner(System.in);
        System.out.println("List a temperature in Fahrenheit");
        Fahrenheit = input.nextDouble();
        Celsius = ((Fahrenheit-32.0)*5)/9;
        System.out.println("Here is your converted temperature" + " " + Celsius + " " +"ºC");
    }
}

//Question 2
//import java.util.Scanner;
//public class Main {
//public static void main(String[] args) {
//double inches;
//double meters;

//Scanner input = new Scanner(System.in);
//System.out.println("List a measurement in inches");
//inches = input.nextDouble();
//meters = ((inches*0.0254));
//System.out.println("Here is your converted measurement" + " " + meters + " " +"meters");
//}
//}


//Question 3
//import java.util.Scanner;
//public class Main {
    //public static void main(String[] args) {
        //double weight;
        //double height;
        //double BMI;

        //Scanner input = new Scanner(System.in);
        //System.out.println("List your weight in pounds");
        //weight= input.nextDouble();
        //System.out.println("List your height in inches");
        //height = input.nextDouble();
        //BMI = (weight)/(height*height)*703;
        //System.out.println("Here is your Body Mass" + " " + BMI);
    //}
//}


//Question 4
//import java.util.Scanner;
//public class Main {
    //public static void main(String[] args) {
        //double pounds;
        //double kilograms;

        //Scanner input = new Scanner(System.in);
        //System.out.println("List your weight in pounds");
        //pounds = input.nextDouble();
        //kilograms = (pounds*0.45359237);
        //System.out.println("Here is your converted mass" + " " + kilograms + " " + "kg");
    //}
//}
