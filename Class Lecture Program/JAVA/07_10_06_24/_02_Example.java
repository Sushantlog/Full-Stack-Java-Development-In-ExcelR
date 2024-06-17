class Lamp{
    // stores the value for lamp on/off
    boolean isOn;

    // method to turn on light
    void turnOn(){
        isOn = true;
        System.out.println("Light on ? " + isOn);
    }
    // method to turn off the light 

    void turnOff(){
        isOn = false;
        System.out.println("Light Off ? " + isOn);
    }
}

public class _02_Example {
    public static void main(String[] args) {
        // Create object led and helogen of lamp class
        //          or
        // led and halogen are the two object created using lamp class
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        // turn on Light calling turnOn()
        // accessing and running turnon() method for led object
        led.turnOn();

        // turn off the helogen obj
        halogen.turnOff();
    }
}
