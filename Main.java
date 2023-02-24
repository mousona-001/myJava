// import java.net.SocketOption;
import java.util.*;

public class Main {
    public static void main(String[] args) {

  // Pattern making -
        System.out.println("*****");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("*****");

   // How to take input -
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Your number is: " + number);

     // If - Else -
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = input1.nextInt();
    if(age >= 18)
    {
        System.out.println("I'm Adult");
    }
    else {
        System.out.println("I'm not Adult");
    }

    // Prime number or not -
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input2.nextInt();
        int factor = 0;
        int i;
        for(i=1; i<=num; i++)
        {
           if(num % i == 0)
            {
                factor ++;
            }
        }
        if(factor == 2)
        {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }

    }
}