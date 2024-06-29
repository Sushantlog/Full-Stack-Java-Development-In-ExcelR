public class _06_Join {
    public static void main(String[] args) {
        String str1 = "I";
        String str2 = "am";
        String str3 = "in";
        String str4 = "Kowad";

        // joining all the above strings
        String joinedStr = String.join(" ",str1,str2,str3,str4);
        System.out.println(joinedStr);
        
    }
}
