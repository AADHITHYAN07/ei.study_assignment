public class North implements Direction {
    @Override
    public Direction turnLeft() {
        return new West();
    }

    @Override
    public Direction turnRight() {
        return new East();
    }

    @Override
    public void moveForward(Position position) {
        position.setY(position.getY() + 1);
    }

    @Override
    public String getName() {
        return "North";
    }
}
