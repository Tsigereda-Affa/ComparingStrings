import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        //In Java ObjectA == ObjectB returns true when both objects share the same memory location.ObjectA.equals(ObjectB) also returns true when both objects share the same memory location.
        // However,StringA.equals(StringB) returns true when the VALUE of StringA is the same as the VALUE of StringB, regardless of memory location.
        //Strings have a built-in method .equals(). Strings have a built-in method .equals() / same content => it results true or false
        // you can also use ! equals
        //Q.1 Add a line to print "You should stay inside" if the response is "stormy".
        Scanner sc = new Scanner(System.in);

            System.out.println("How is the weather?");
            String answer = sc.nextLine();

            if (answer.equals("rain"))
                System.out.println("Take your umbrella!");
            else if (answer.equals("windy"))
                System.out.println("Wear your jacket!");
            else if (answer.equals("snow") )
                System.out.println("Wear a coat and take a shovel!");
            else if (answer.equalsIgnoreCase("Stormy")) {
                System.out.println("You should stay inside");
            }else
                System.out.println("Enjoy your day!");
        }
    }

