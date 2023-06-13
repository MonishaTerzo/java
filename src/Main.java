public class Main {
    public static void main(String[] args) {
     float a=9.6f;
        System.out.println(Math.round(a));
        System.out.println(Math.ceil(a));
        System.out.println(Math.floor(a));
        short mark1=99;
        short mark2=90;
        int h=Math.max(mark1,mark2);
        if (h == 99) {
            System.out.println("monisha score first");
        }
        else{
            System.out.println("monisha lost");
        }
        int low=Math.min(mark1,mark2);
        System.out.println(low);

        //lottery
        double luckynumber=Math.random()*5;
       int  luckynumber1 = (int)Math.round(luckynumber);
        System.out.println(luckynumber1);
        if(luckynumber>3){
            System.out.println("you won the lottery");


        }

    }}
