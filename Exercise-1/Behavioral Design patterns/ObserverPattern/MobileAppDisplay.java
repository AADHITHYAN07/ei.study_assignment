public class MobileAppDisplay implements WeatherObserver {
    private String appName;

    public MobileAppDisplay(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(double temperature, double humidity) {
        System.out.println(appName + " Display - Temperature: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}
