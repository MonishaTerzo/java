import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean an=true;
        int principal=0;
        while(an){
        System.out.print("enter the anount you want between $1000 to $1,00000:");
        principal=sc.nextInt();
        if(principal<1000 || principal>1000000){
            System.out.println("enter valid value");
            }
        else{
            break;}
        continue;
        }
        float interest =0;
        while(an){
            System.out.print("enter the interest you want between 0 to 30:");

            interest =sc.nextFloat();
            if(interest<0 || interest>30){
                System.out.println("enter valid value");
            }
            else{
                break;}
            continue;
        }
        float monthly_interest= interest/100/12;
        System.out.print("enter the duration");
        int years=sc.nextInt();
        long total_payment=years*12;
        double k=Math.pow(1+monthly_interest,total_payment);
        double total_amount=0.0f;
        total_amount=(principal*k)/k-1;
        System.out.println("your final amount"+"$"+total_amount);
        NumberFormat a= NumberFormat.getCurrencyInstance();
        String g=a.format(total_amount);
        System.out.println("yoy should pay the amount"+g);

    }
    }
