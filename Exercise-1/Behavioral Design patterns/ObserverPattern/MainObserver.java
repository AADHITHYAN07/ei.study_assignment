public class MainObserver {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        MobileAppDisplay phoneApp = new MobileAppDisplay("Phone");
        MobileAppDisplay desktopWidget = new MobileAppDisplay("Desktop");

        station.attach(phoneApp);
        station.attach(desktopWidget);

        station.setMeasurements(25.0, 65.0);
        station.setMeasurements(22.5, 70.0);
    }
}
