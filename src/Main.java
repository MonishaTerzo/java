import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int n = sc.nextInt();
                System.out.println("fizz or Buzz, 0r FizzBuzz are: ");
                for (int i = 1; i <= n; i++)
                {
                    if (i%3==0 && i%5==0)
                    {

                        System.out.println(i+" - FizzBuzz");
                    }

                    else if (i%3==0)
                    {
                        System.out.println(i+ " - Fizz");
                    }

                    else if (i%5==0)
                    {
                        System.out.println(i + "- Buzz");
                    }
                    else
                    {
                        System.out.println(i);
                    }

            }
        }}}





