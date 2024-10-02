public class West implements Direction {
    @Override
    public Direction turnLeft() {
        return new South();
    }

    @Override
    public Direction turnRight() {
        return new North();
    }

    @Override
    public void moveForward(Position position) {
        position.setX(position.getX() - 1);
    }

    @Override
    public String getName() {
        return "West";
    }
}
