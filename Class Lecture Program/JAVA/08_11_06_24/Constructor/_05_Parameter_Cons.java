class _05_Parameter_Cons {
    String languages;

    // constructor with parameters

    _05_Parameter_Cons(String lang){
        languages = lang;
        System.out.println(languages + " Is a Programming Languages.");
    }

    public static void main(String[] args) {
        // call constructor with single value
        _05_Parameter_Cons obj1 = new _05_Parameter_Cons("Java");
        _05_Parameter_Cons obj2 = new _05_Parameter_Cons("C");
        _05_Parameter_Cons obj3 = new _05_Parameter_Cons("C++");
        _05_Parameter_Cons obj4 = new _05_Parameter_Cons("Javascript");
    }
}
