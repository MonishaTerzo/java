import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the anount you want:");
        int principal=sc.nextInt();
        System.out.println("enter the interest rate:") ;
        float interest=sc.nextFloat();
        float monthly_interest=interest/100/12;
        System.out.println("enter the duration");
        int years=sc.nextInt();
        long total_payment=years*12;
        double k=Math.pow(1+monthly_interest,years);
        double total_amount=0.0f;
        total_amount=(monthly_interest*k)/k-1;
        System.out.println("your final amount"+"$"+total_amount);
        NumberFormat a= NumberFormat.getCurrencyInstance();
        String g=a.format(total_amount);
        System.out.println(g);

    }
    }
