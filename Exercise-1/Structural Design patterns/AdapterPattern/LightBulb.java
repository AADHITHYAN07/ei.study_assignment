public class LightBulb implements HomeDevice {
    @Override
    public void turnOn() {
        System.out.println("Light bulb is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb is turned off.");
    }
}
