/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        int x = 10;

        String s = "Java!";

        int l = s.length();
        System.out.println("length = " + s.length()); // 5

        char c = s.charAt(2);
        System.out.println("c = " + c);

        System.out.println(s.toUpperCase());

        System.out.println(s.startsWith("J"));

        System.out.println(s.indexOf("!"));

        System.out.println(s.equals("JAVA!"));

        System.out.println(new StringBuilder(s).reverse().toString());
    }
}
