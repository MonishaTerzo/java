import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int i = sc.nextInt();

                    if (i%3==0 && i%5==0)
                    {

                        System.out.println(i+" - Fizz Buzz");
                    }

                    else if (i%3==0)
                    {
                        System.out.println(i+ " - buzz");
                    }

                    else if (i%5==0)
                    {
                        System.out.println(i + "- fizz");
                    }
                    else
                    {
                        System.out.println(i);
                    }

            }
        }}





