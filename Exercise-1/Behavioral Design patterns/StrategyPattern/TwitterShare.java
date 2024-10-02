public class TwitterShare implements ShareStrategy {
    @Override
    public void share(String content) {
        System.out.println("Sharing to Twitter: " + content);
    }
}
