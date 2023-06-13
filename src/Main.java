import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int majorityvote=sc.nextInt();
        String m="it is a rumour";
        boolean rumour=majorityvote>100;
        if(rumour){
            m="no it is not a rumour";}
        System.out.println(m);
    }
    }
