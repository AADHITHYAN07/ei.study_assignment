public class FacebookShare implements ShareStrategy {
    @Override
    public void share(String content) {
        System.out.println("Sharing to Facebook: " + content);
    }
}
