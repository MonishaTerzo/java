import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

           int rating =6;
           int performance=10;
           boolean character=false;
           boolean increment=rating>5 && performance>8;
           if(increment==true){
               System.out.println("u have increment");}
           else{
               System.out.println("there is no increment");}
           int test1mark=4;
           int test2mark=9;
           if(test1mark>5 || test2mark>5){
               System.out.println("super u done the test well");}
           else{
               System.out.println("do well");}
           boolean overall_performance= (rating>5 || test1mark>5) && !character;
           if(overall_performance){
               System.out.println("you are a great person");
           }

    }
    }
