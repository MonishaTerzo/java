import java.util.*;
public class Main {
    public static void main(String[] args) {
            int[] a={9,3,78,33,51} ;
            String[] b=new String[5];
            b[0]="moni";
            b[1]="terzo";
      b[2]="project";
        System.out.println(Arrays.toString(a));
        //sort
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //copy of range
        int[] c=Arrays.copyOfRange(a,3,5);
        System.out.println(Arrays.toString(c));
        //length
        System.out.println(a.length);

        }
    }
