//import scanner class
import java.util.Scanner;
//import date class
import java.util.Date;


public class lab173 {
    public static void main(String[] args)
    {
        //add new date object
        Date today = new Date();
        System.out.println("Directory: " + System.getProperty("user.dir"));
        System.out.println(today + "\n");
        //create new scanner object that will receive user input
        Scanner in = new Scanner(System.in);

        double[] store = new double[5];
        String r;


        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your name: ");
        r = in.nextLine();

        for(int i = 0; i < 5; i++)
        {
            System.out.printf("Enter today\'s sales for store %d: ", i + 1);
            store[i] = userInput.nextDouble();
        }

        System.out.println("\nSALES BAR CHART");

        for(int i = 0; i < 5; i++)
        {
            //print out store #
            System.out.printf("Store %d: ", i + 1);

            for(int c = 0; c < store[i]/100; c++)
                //print how many astricks that store deserves
                System.out.print("*");
            //goes to new line
            System.out.println();
        }

        userInput.close();
    }
}