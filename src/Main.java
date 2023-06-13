import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char mark=sc.next().charAt(0);
        switch(mark){
            case '0':
                System.out.println("well good mark");
                break;
            case 'A':
                System.out.println("get o grade next time");
                break;
            default:
                System.out.println("study well and better luck next time");
        }

    }}
