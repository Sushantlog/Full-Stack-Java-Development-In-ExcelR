class Animal{
    // protected method
    protected void display(){
        System.out.println("I am an animal");
    }
}

class Dog extends Animal{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}