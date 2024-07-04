import java.util.EnumSet;

public class _01_Enum {
    enum Size{
        SMALL,MEDIUM,LARGE,EXTRALARGE
    }

    public static void main(String[] args) {
        
        // using allOF(size) -create enumset
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);

        System.out.println("EnumSet: "+sizes);

        // Creating empty set using nonOf()
        EnumSet<Size> sizes2 = EnumSet.noneOf(Size.class);

        System.out.println("Empty EnumSet : "+sizes2);

        // creating using range(e1,e2)
        EnumSet<Size> sizes3 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        System.out.println("Using Range : "+sizes3);

        // using of() method
        EnumSet<Size> sizes4 = EnumSet.of(Size.MEDIUM);
        System.out.println("Using of() method :"+sizes4);

        EnumSet<Size> sizes5 = EnumSet.of(Size.MEDIUM, Size.LARGE);
        System.out.println("Using Enum :"+sizes5);
    }
}