class Polygon{
    // method to render a shape 
    public void render(){
        System.out.println("Rendering a polygon...");
    }
}

class Square extends Polygon{
    // render Square
    public void render(){
        System.out.println("Rendering a Square. ");
    }
}

class Circle extends Polygon{
    // render circle
    public void render(){
        System.out.println("Rendering a Circle. ");
    }
}

public class _01_polymorphism {
    public static void main(String[] args) {
        // create an obj of Square
        Square s1 = new Square();
        s1.render();

        // create an obj of circle
        Circle c1 = new Circle();
        c1.render();
    }
}
