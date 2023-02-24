/**
 * The tile of a chessboard knows its own coordinates as well if and what piece it is occupied by.
 */
public class Tile {

    private final CoordinatePair coordinatePair;
    private Piece occupyingPiece;

    public Tile (CoordinatePair coordinatePair)  {
        this.coordinatePair = coordinatePair;
    }

    public CoordinatePair getCoordinatePair() {
        return coordinatePair;
    }

    public Piece getOccupyingPiece() {
        return occupyingPiece;
    }

    public void capture(Piece piece) {
        this.occupyingPiece = piece;
    }
}
