import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
            NumberFormat a= NumberFormat.getCurrencyInstance();
            String g=a.format(768756764);
        System.out.println(g);
        NumberFormat h= NumberFormat.getPercentInstance();
        String ii=h.format(1.0);
        System.out.println(ii);



    }
    }
