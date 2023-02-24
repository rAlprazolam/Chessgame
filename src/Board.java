/**
Creates a Chessboard consisting of tiles.
@author René
 */
public class Board {
    private final Tile[][] tiles = new Tile[8][8];

    /**
     * Creates a 8x8 Chessboard filled with tiles. Easy tile has standard chess notation added to it.
     * @throws OutOfBoardException if the given coordinates do not exist on a standard chess board.
     */
    public Board() throws OutOfBoardException{
        int i = 0;
        for (Coordinates column : Coordinates.values()) {
            for (int j = 0; j < 8; j++) {
                tiles[i][j] = new Tile(new CoordinatePair(column, j+1));
            }
            i++;
        }
    }
}
