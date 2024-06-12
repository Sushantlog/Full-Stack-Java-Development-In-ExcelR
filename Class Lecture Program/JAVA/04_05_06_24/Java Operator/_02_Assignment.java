public class _02_Assignment {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        System.out.println(y);
        
        // Assignment +=
        x += 5;
        System.out.println(x);

        // Assignment -=
        x -= 5;
        System.out.println(x);

        // Assignment *=
        x *= 5;
        System.out.println(x);

        // Assignment /=
        x /= 5;
        System.out.println(x);

        // Assignment %=
        x %= 5;
        System.out.println(x);

        // Assignment &=
        x &= 5;
        System.out.println("&= "+ x);

        int z = 11;
        z &= 1;
        System.out.println(z);

        // Assignment |=
        x |= 5;
        System.out.println(x);

        // z = 11 => 1011
        // z = z + 1 => 1011 + 0001 => 1100 (12)

        
    }
}