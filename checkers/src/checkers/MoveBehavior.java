package checkers;

/**
 * Abstract class to define the basic behaviors of any piece
 */
public interface MoveBehavior {

    /**
     * Determines if the move is valid for the type of piece being moved
     * @square the square that is being attempted to move to
     * @return true if it is a valid move
     */
    boolean isValidOrdinaryMove(Piece piece, Square square);

    /**
     * Retrieves the piece being captured to allow for removal
     * @return the piece being gathered
     */
    Piece getCapturedPiece(Piece piece, Square Square);
}
