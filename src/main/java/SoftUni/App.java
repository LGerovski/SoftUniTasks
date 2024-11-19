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
        Dispatcher dispatcher = new Dispatcher();
        EventListener eventListener = new EventListenerImpl();
        dispatcher.addEventListener(eventListener);

        Scanner input = new Scanner(System.in);
        String newValue = input.nextLine();

        while (!newValue.equals("end")){
            dispatcher.value =newValue;
            dispatcher.fireEvent();
            newValue = input.nextLine();
        }

    }
}
