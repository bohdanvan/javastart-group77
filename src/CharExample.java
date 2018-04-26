/**
 * @author bvanchuhov
 */
public class CharExample {

    public static void main(String[] args) {
        System.out.println("I ❤ Java");

        System.out.println("\uD83D\uDE00");
        System.out.println("\uD83D\uDE2D");

        char c1 = 'a';
        char c2 = '\n'; // \n, \t, \0, \\, \", \'
        char c3 = '\u2764';
        char c4 = 1234;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        // "D:\\"
        System.out.println("\"D:\\\\\"");
    }
}
