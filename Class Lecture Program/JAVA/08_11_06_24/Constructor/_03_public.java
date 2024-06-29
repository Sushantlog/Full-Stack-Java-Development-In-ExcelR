package Constructor;
// Using Public

class _02_No_Arg {
    int i;
    // constructor with no parameter
    public _02_No_Arg(){
        i = 5;
        System.out.println("Constructor is Called ");
    }
}

class _03_public{
    public static void main(String[] args) {
        _02_No_Arg obj = new _02_No_Arg();
        System.out.println("Value of obj is : "+obj.i);
    }
}