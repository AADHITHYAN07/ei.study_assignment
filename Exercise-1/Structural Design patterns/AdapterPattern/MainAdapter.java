public class MainAdapter {
    public static void main(String[] args) {
        HomeDevice lightBulb = new LightBulb();
        lightBulb.turnOn();
        lightBulb.turnOff();

        HomeDevice thermostat = new ThermostatAdapter();
        thermostat.turnOn();
        thermostat.turnOff();
    }
}
