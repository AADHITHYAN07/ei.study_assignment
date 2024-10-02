import java.util.HashSet;
import java.util.Set;

public class Grid {
    private int width;
    private int height;
    private Set<Position> obstacles;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.obstacles = new HashSet<>();
    }

    public void addObstacle(Position position) {
        if (isWithinBounds(position)) {
            obstacles.add(position);
            System.out.println("Obstacle added at: " + position);
        } else {
            System.out.println("Cannot add obstacle. Position out of bounds: " + position);
        }
    }

    public void removeObstacle(Position position) {
        if (obstacles.contains(position)) {
            obstacles.remove(position);
            System.out.println("Obstacle removed at: " + position);
        } else {
            System.out.println("No obstacle found at: " + position);
        }
    }

    public boolean hasObstacle(Position position) {
        return obstacles.contains(position);
    }

    public boolean isWithinBounds(Position position) {
        return position.getX() >= 0 && position.getX() < width &&
               position.getY() >= 0 && position.getY() < height;
    }
}
