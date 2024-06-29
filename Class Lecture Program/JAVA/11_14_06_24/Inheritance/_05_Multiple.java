interface Backend{
    // abstract method
    public void connectServer();
}

class Frontend{
    public void responsive(String str){
        System.out.println(str + " Can also be used as frontend.");
    }
}

// Language extends frontend and implements backend interface
class Language extends Frontend implements Backend{
    String lang = "Java";

    // implements method from interface

    public void connectServer(){
        System.out.println(lang + " Can be used as a backend language");
    }
}

public class _05_Multiple {
    public static void main(String[] args) {
        // create obj of language
        Language obj = new Language();
        obj.connectServer();

        // call the inherited method from frontend class
        obj.responsive(obj.lang);
    }
}
