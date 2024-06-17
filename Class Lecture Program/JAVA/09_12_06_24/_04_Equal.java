public class _04_Equal {
    public static void main(String[] args) {
        String first = "Java Programming";
        String second = "Java Programming";
        String third = "Python Programming";

        // Compare first and second strings
        boolean results1 = first.equals(second);
        System.out.println(results1);

        boolean results2 = first.equals(third);
        System.out.println(results2);
    }
}
