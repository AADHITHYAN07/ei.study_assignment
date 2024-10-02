public class MainStrategy {
    public static void main(String[] args) {
        SocialMediaContext context = new SocialMediaContext(new FacebookShare());
        context.shareContent("Hello World!");

        context.setShareStrategy(new TwitterShare());
        context.shareContent("Learning Design Patterns!");

        context.setShareStrategy(new EmailShare());
        context.shareContent("Check out this new content.");
    }
}
