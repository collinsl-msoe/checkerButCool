package checkers;

public class RedBehavior implements MoveBehavior{
    @Override
    public boolean isValidOrdinaryMove(Piece piece, Square square) {
        return (square.getY() == piece.getY() + 1 && Math.abs(square.getX()-piece.getX()) == 1);
    }
    @Override
    public Piece getCapturedPiece(Piece piece, Square square) {
        if (!((square.getY() == piece.getY() + 2 &&
                Math.abs(square.getX()- piece.getX()) == 2))) {
            return null;
        } else {
            return piece.getMiddlePiece(square);
        }
    }
}
