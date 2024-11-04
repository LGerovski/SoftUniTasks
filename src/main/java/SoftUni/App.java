package SoftUni;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dispatcher disp = new Dispatcher();
        Handler handler = new Handler();

        Scanner input = new Scanner(System.in);
        String nextValue = input.nextLine();

        //NameChange one = new NameChange("Pesho");
        while (!nextValue.equals("end")){
            System.out.printf("Dispatcher’s name changed to %s\n", nextValue);
            nextValue = input.nextLine();
        }
    }
}
