class _01_Car_Class {

    // State or Field
    String model = "Suzkuki";

    //behaviour / method
    public void start(){
        System.out.println(model);
    }

}

class _01_Main_Class{
    public static void main(String[] args) {
        // Create an object
        // className object = new(keyword) className();
        _01_Car_Class Car_Obj = new _01_Car_Class();

        // access field and method
        // object . methodName();
        Car_Obj.start();
    }
}