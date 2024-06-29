
public class _06_Default_Const {
    int i;
    boolean b;
    String str;

    public static void main(String[] args) {
        _06_Default_Const obj = new _06_Default_Const();

        System.out.println("Default value of variables when there is no constructor created ");
        System.out.println("i : "+obj.i);
        System.out.println("b : "+obj.b);
        System.out.println("str : "+obj.str);
    }
}
