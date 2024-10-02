# Adapter Pattern - Home Automation Controller

## Description
This example demonstrates the Adapter Pattern through a home automation controller. The `ThermostatAdapter` allows a thermostat device to be controlled using a common interface (`HomeDevice`), similar to a light bulb.

## Files
- **HomeDevice.java:** The target interface for controlling devices.
- **LightBulb.java:** A concrete implementation of a controllable home device.
- **Thermostat.java:** An incompatible class that requires an adapter.
- **ThermostatAdapter.java:** The adapter that makes `Thermostat` compatible with `HomeDevice`.
- **MainAdapter.java:** The main class to demonstrate the adapter pattern.

## Usage
Run the `MainAdapter` class to see how different home devices are controlled using a uniform interface.
