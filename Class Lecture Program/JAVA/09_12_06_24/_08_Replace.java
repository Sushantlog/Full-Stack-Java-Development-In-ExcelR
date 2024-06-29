public class _08_Replace {
    public static void main(String[] args) {
        String str = "Good Morning";

        // replace Morning with Evening
        System.out.println(str.replace("Morning", "Evening"));
        System.out.println(str.replace("morning", "Evening")); //it is case sensitive m & M is different
        System.out.println(str.replace("o", "a"));  //also charge the character
    }
}