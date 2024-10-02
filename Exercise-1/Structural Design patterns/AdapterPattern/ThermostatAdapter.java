public class ThermostatAdapter implements HomeDevice {
    private Thermostat thermostat;

    public ThermostatAdapter() {
        this.thermostat = new Thermostat();
    }

    @Override
    public void turnOn() {
        thermostat.enable();
    }

    @Override
    public void turnOff() {
        thermostat.disable();
    }
}
