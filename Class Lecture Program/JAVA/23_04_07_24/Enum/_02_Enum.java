import java.util.EnumSet;

import java.util.Iterator;

public class _02_Enum {
    enum Size{
        SMALL,MEDIUM,LARGE,EXTRALARGE
    }

    public static void main(String[] args) {
        // Create set using allof()
        EnumSet<Size> size1 = EnumSet.allOf(Size.class);

        // Create set using noneOf()
        EnumSet<Size> sizes2 = EnumSet.noneOf(Size.class);

        // using add()
        sizes2.add(Size.MEDIUM);
        System.out.println("Enum set using add() "+sizes2);

        sizes2.addAll(size1);
        System.out.println("Enum set using addAll(): "+sizes2);

        // Accessing elements using iterator()
        Iterator<Size> iterator = size1.iterator();

        System.out.println("EnumSet : ");
        while(iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(" , ");
        }

        // remove EnumSet Elements
        boolean val1 = size1.remove(Size.MEDIUM);
        System.out.println("Removed element is : "+val1);

        boolean val2 = size1.removeAll(size1);
        System.out.println("All elements are removed? : "+val2);
    }
}
