# Mars Rover Simulation

## Overview
This project is a console-based simulation of a Mars Rover navigating a grid-based terrain. It demonstrates the use of various design patterns 
(Command and Composite patterns), Object-Oriented Programming principles, and logging and exception handling mechanisms.

## Features Implemented
1. **Command Pattern:** The commands ('M', 'L', 'R') are encapsulated as separate command objects, allowing for flexible command execution.
2. **Composite Pattern:** The grid and obstacles are represented using a composite structure, allowing dynamic handling of obstacles.
3. **Direction Classes:** Implemented using interfaces and multiple classes (`North`, `East`, `South`, `West`) to represent rover's direction, avoiding if-else conditions.
4. **OOP Principles:** Applied encapsulation, inheritance, and polymorphism to manage rover's state, movement, and direction.
5. **Logging:** Integrated Java's `Logger` to record events, actions, and errors within the rover's journey.
6. **Exception Handling:** Basic exception handling is used to catch runtime errors during command execution.
7. **Dynamic Obstacle Management:** Obstacles can be added or removed dynamically, and the rover avoids obstacles and grid boundaries during movement.
8. **Status Report:** Rover sends a status report containing its current position and facing direction after executing the commands.
9. **Validation:** Input commands are processed in a structured way, avoiding complex conditionals.
10. **Encapsulation:** Rover's internal state is managed through methods, preventing direct manipulation.

## Instructions to Run
1. Compile all Java files in the project directory.
2. Run `Main.java` to start the simulation. The output will reflect the rover's movements and any encounters with obstacles or boundaries.
3. Adjust the commands in `Main.java` to simulate different paths for the rover.

## Project Structure
- **Direction.java:** Interface representing rover's direction.
- **North.java, East.java, South.java, West.java:** Implementations of the `Direction` interface for each direction.
- **Position.java:** Class to represent the rover's position on the grid.
- **Rover.java:** Main rover class responsible for executing movements and turning.
- **RoverCommand.java:** Interface for rover commands.
- **MoveForwardCommand.java, TurnLeftCommand.java, TurnRightCommand.java:** Concrete command classes implementing the `RoverCommand` interface.
- **Grid.java:** Class representing the grid, containing methods to add/remove obstacles and check boundaries.
- **Main.java:** Entry point to the simulation, where commands are created and executed.
- **README.md:** This file.

## Assumptions
- The grid size is fixed at 10x10 but can be modified in the `Grid` class.
- Obstacles are provided as coordinates and managed dynamically during runtime.
- The rover cannot move beyond grid boundaries or into obstacles.



