public class EmailShare implements ShareStrategy {
    @Override
    public void share(String content) {
        System.out.println("Sending via Email: " + content);
    }
}
