// Multiple inheritance using interface
interface Backend{
    public void connetServer();
}

class Frontend{
    public void responsive(String str){
        System.out.println(str + "Can also be used ");
    }
}

public class _02_Multiple_inheritace {
    public static void main(String[] args) {
        // create obj of language
        Language obj = new Language();

        obj.connetServer();

        // call the inherited method from frontend class
        obj.responsive(obj.lang);
    }
}
