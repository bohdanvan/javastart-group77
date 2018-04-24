/**
 * @author bvanchuhov
 */
public class Types {

    public static void main(String[] args) {
        // Primitive types (8)

        // Integer types (4)
        byte b = 127; // 1B, -128 ... 127
        short s = 10000; // 2B, -32 000 ... +32 000
        int x = 1000000000; // default, 4B, -2 000 000 000 ... +2 000 000 000
        long l = 1000000000000000000L; // 8B

        // Floating point types (2)
        float f = 10.5f; // 4B
        double d = 10.5; // 8B, default

        // Character (1)
        char c = 'a';

        // Logical (1)
        boolean bool = true;

        // Object types
        String str = "Hello";
    }
}
