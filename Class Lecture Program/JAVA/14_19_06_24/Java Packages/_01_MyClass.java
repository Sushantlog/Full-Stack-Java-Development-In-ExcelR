import java.util.Scanner;
// import java.util.*;  //import all the class and interface inside the util package

class _01_MyClass{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Name : ");

        String userName = obj.nextLine();
        System.out.println("UserName = "+userName);
    }
}