/**
 * The coordinate pair consist of a column and a row. Each column is symbolized by a letter. Each row by an integer.
 */
public class CoordinatePair {
    private Coordinates column;
    private int row;

    /**
     *
     * @param column a letter from A to H.
     * @param row an integer from 1 to 8
     * @throws OutOfBoardException if the given coordinates do not exist on a standard chess board.
     */
    public CoordinatePair(Coordinates column, int row) throws OutOfBoardException {
        if (column.getCoordinateAsNumber() > 8) throw new OutOfBoardException(column);
        if (row > 8) throw new OutOfBoardException(row);
        this.column = column;
        this.row = row;
    }

    public Coordinates getColumn() {
        return column;
    }

    public void setColumn(Coordinates column) throws OutOfBoardException {
        if (column.getCoordinateAsNumber() > 8) throw new OutOfBoardException(column);
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) throws OutOfBoardException {
        if (row > 8) throw new OutOfBoardException(row);
        this.row = row;
    }
}
