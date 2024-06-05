public class _04_logical {
    public static void main(String[] args) {
        // logical AND = return true if condition are true

        int x = 50, y=20, z=30;
        System.out.println(x>y && x>z);

        // Logical || => Return true if one condition is true
        System.out.println(x<y || x>y);

        // Logical Not ! =>Reverse the result
        System.out.println(!(x>y && x>y));
    }
}
