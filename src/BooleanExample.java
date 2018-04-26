/**
 * @author bvanchuhov
 */
public class BooleanExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        int x = 10;
        boolean b3 = x < 20; // true
        boolean b4 = x > 30; // false

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        System.out.println(x < 5); // F
        System.out.println(x >= 10); // T
        System.out.println(x <= 40); // T
        System.out.println(x == 15); // F
        System.out.println(x != 15); // T
    }
}
