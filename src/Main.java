public class Main {
    public static void main(String[] args) {
        //primitive
        int a = 20;
        int b = a;
        a = 14;
        System.out.println(b);

        //non_primitive
        int[] n = {1, 2};
        n[0] = 9;
        System.out.println(n[0]);
    }
}
