public class OutOfBoardException extends Exception {
    public OutOfBoardException(Coordinates coordinate) {
        super("The given coordinate: " + coordinate + " does not exist on the board!");
    }

    public OutOfBoardException(int coordinate) {
        super("The given coordinate: " + coordinate + " does not exist on the board!");
    }
}
