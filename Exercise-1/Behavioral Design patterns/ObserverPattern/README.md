# Observer Pattern - Weather Station Monitoring

## Description
This example demonstrates the Observer Pattern through a weather station system. The `WeatherStation` object maintains a list of observers (e.g., mobile apps) that need to be updated whenever the weather measurements change.

## Files
- **WeatherStation.java:** The observable object that tracks temperature and humidity.
- **WeatherObserver.java:** The interface for observers.
- **MobileAppDisplay.java:** Concrete implementation of the observer that displays weather data.
- **MainObserver.java:** The main class to demonstrate the observer pattern.

## Usage
Run the `MainObserver` class to see how observers are notified whenever weather measurements are updated.
