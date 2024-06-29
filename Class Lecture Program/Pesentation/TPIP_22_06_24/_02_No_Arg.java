class _02_No_Arg {
    int i;
    // constructor with no parameter
    private _02_No_Arg(){
        i = 5;
        System.out.println("Constructor is Called ");
    }

    public static void main(String[] args) {
        _02_No_Arg obj = new _02_No_Arg();
        System.out.println("Value of obj is : "+obj.i);
    }
}+