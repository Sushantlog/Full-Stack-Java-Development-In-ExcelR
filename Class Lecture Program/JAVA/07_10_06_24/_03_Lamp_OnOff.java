public class _03_Lamp_OnOff {
    // create field
    boolean isOn;
    
    // Method to turn on and off the light 
    void turnOn(){
        isOn = true;
        System.out.println("Light on ? " + isOn);
    }

    void turnOff(){
        isOn = false;
        System.out.println("Light Off ? "+isOn);
    }

    public static void main(String[] args) {
        // create an object of Lamp1
        _03_Lamp_OnOff led = new _03_Lamp_OnOff();

        // access method using object
        led.turnOn();

        led.turnOff();
    }
}
