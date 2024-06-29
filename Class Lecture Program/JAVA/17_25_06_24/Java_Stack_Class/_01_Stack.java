import java.util.Stack;

public class _01_Stack {

    public static void main(String[] args) {
        // Create a stack
        Stack<String> animalStack = new Stack<>();

        // Add element to stack using push()
        animalStack.push("Dog");
        animalStack.push("Cat");
        animalStack.push("Horse");

        System.out.println("Stack : "+animalStack);

        int positions = animalStack.search("Dog");
        System.out.println(positions);

        // remove element using pop()
        String ele = animalStack.pop();
        System.out.println("Removed element : "+ele);
        System.out.println("After removing : "+animalStack);

        // peek() - return an object from top of the stack
        String str = animalStack.peek();
        System.out.println(str);

        // Search() - return position of element from top
        int position = animalStack.search("Dog");
        System.out.println(position);

        // empty() - to check if stack is empty
        boolean bool = animalStack.empty();
        System.out.println(bool);
    }
}