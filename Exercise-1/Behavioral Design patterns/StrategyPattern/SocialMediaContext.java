public class SocialMediaContext {
    private ShareStrategy strategy;

    public SocialMediaContext(ShareStrategy strategy) {
        this.strategy = strategy;
    }

    public void setShareStrategy(ShareStrategy strategy) {
        this.strategy = strategy;
    }

    public void shareContent(String content) {
        strategy.share(content);
    }
}
