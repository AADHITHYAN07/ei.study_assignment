import java.util.logging.Logger;

public class Rover {
    private Position position;
    private Direction direction;
    private Grid grid;
    private static final Logger logger = Logger.getLogger(Rover.class.getName());

    public Rover(Position position, Direction direction, Grid grid) {
        this.position = position;
        this.direction = direction;
        this.grid = grid;
        logger.info("Rover initialized at position: " + position + " facing " + direction.getName());
    }

    public void turnLeft() {
        direction = direction.turnLeft();
        logger.info("Rover turned left. Now facing: " + direction.getName());
    }

    public void turnRight() {
        direction = direction.turnRight();
        logger.info("Rover turned right. Now facing: " + direction.getName());
    }

    public void moveForward() {
        Position newPosition = new Position(position.getX(), position.getY());
        direction.moveForward(newPosition);
        if (grid.isWithinBounds(newPosition) && !grid.hasObstacle(newPosition)) {
            position = newPosition;
            logger.info("Rover moved forward to position: " + position);
        } else {
            logger.warning("Movement blocked. Obstacle detected or out of bounds at: " + newPosition);
        }
    }

    public String getStatus() {
        return "Rover is at " + position + " facing " + direction.getName();
    }
}
