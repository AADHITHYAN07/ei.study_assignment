public interface Direction {
    Direction turnLeft();
    Direction turnRight();
    void moveForward(Position position);
    String getName();
}
