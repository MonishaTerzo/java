import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;

        String a="not interested";
        while(true){

            a=sc.next();
            if(a.equals("interested")){
            i+=1;
            continue;}
            else{
                System.out.println(i+1);
            System.out.println("pls give interest it is very useful");
            break;
    }}}}
