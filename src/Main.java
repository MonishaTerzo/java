public class Main {
    public static void main(String[] args) {
        String a = " Hi i am monishaa";
        //endswith
        System.out.println(a.endsWith("monisha"));

        //startswith
        System.out.println(a.startsWith("i"));

        //only 15 letters allowed
        int len = a.length();
        if (len > 15) {
            System.out.println("please fill the form within 15 letter");
        }

        //find the index where the name starts
        int index = a.indexOf("m");

        ///change the content
        a.replace("i am", "my name is");

        //lowercase and uppercase
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

        //trim
        System.out.println(a.trim());

        //charAt
        System.out.println(a.charAt(1));

        //empty or not
        System.out.println(a.isEmpty());


    }
}
