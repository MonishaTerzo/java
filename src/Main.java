import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = new int[3][2];
        int h = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                h=h+1;
                a[i][j] = h ;
            }}
            System.out.println(Arrays.deepToString(a));
            int[][] b = {{8, 6, 55}, {6, 7, 9}};
            System.out.println(b[0][0]);

        }
    }
