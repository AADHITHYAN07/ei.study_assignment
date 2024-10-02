public class East implements Direction {
    @Override
    public Direction turnLeft() {
        return new North();
    }

    @Override
    public Direction turnRight() {
        return new South();
    }

    @Override
    public void moveForward(Position position) {
        position.setX(position.getX() + 1);
    }

    @Override
    public String getName() {
        return "East";
    }
}
