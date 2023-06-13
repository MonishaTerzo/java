import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        //implicit casting
        //byte to short
            byte a=8;
            byte c=9;
            int d=a+c;
        System.out.println(d);
            //int to float
        float f=9.0f;
        float g=f+2;
        System.out.println(g);

        //explicit casting
        double ans=(double)a/(double)c;
        System.out.println(ans);

        float ak=9.0f;
        int gk=(int)(ak)/2;
        System.out.println(gk);

        //parseint
        String r="9";
        int gh=Integer.parseInt(r)+8;
        System.out.println(gh);

        //parsedouble
        String yy="5.5";
        int h=7;
        int ff=(int)Double.parseDouble(yy)+h;
        System.out.println(ff);




        }
    }
