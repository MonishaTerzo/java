import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean an=true;
        while(an){
        System.out.print("enter the anount you want between $1000 to $1,00000:");

        int principal=sc.nextInt();
        if(principal<1000 || principal>100000){
            System.out.println("enter valid value");
            }
        else{
            break;}
        continue;
        }
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
        System.out.println("yoy should pay the amount"+g);

    }
    }
