public class South implements Direction {
    @Override
    public Direction turnLeft() {
        return new East();
    }

    @Override
    public Direction turnRight() {
        return new West();
    }

    @Override
    public void moveForward(Position position) {
        position.setY(position.getY() - 1);
    }

    @Override
    public String getName() {
        return "South";
    }
}
