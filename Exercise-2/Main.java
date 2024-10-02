import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        grid.addObstacle(new Position(2, 2));
        grid.addObstacle(new Position(3, 5));

        Rover rover = new Rover(new Position(0, 0), new North(), grid);

        List<RoverCommand> commands = new ArrayList<>();
        try {
            commands.add(new MoveForwardCommand(rover));
            commands.add(new MoveForwardCommand(rover));
            commands.add(new TurnRightCommand(rover));
            commands.add(new MoveForwardCommand(rover));
            commands.add(new TurnLeftCommand(rover));
            commands.add(new MoveForwardCommand(rover));

            for (RoverCommand command : commands) {
                command.execute();
            }

            logger.info(rover.getStatus());
        } catch (Exception e) {
            logger.severe("An error occurred: " + e.getMessage());
        }
    }
}
