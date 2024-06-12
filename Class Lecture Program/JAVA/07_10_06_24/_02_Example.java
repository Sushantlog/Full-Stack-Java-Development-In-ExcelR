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
        // Create object led and helogen
        Lamp led = new Lamp();
        Lamp helogen = new Lamp();

        // turn on Light calling turnOn()
        led.turnOn();

        // turn off the helogen obj
        helogen.turnOff();
    }
}
