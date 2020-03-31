package chess.piece.type.movable;

import chess.location.Location;
import chess.piece.type.Piece;

import java.util.Map;

public class KnightPieceMovable implements PieceMovable {
    @Override
    public boolean canMove(Map<Location, Piece> board, Location now, Location after) {
        return isKnightRange(now, after);
    }

    private boolean isKnightRange(Location now, Location destination) {
        int[] dRow = {2, 2, 1, 1, -1, -1, -2, -2};
        int[] dCol = {1, -1, -2, 2, -2, 2, -1, 1};

        for (int i = 0; i < dRow.length; i++) {
            Location location = now.plusBy(dRow[i], dCol[i]);
            if (location.equals(destination)) {
                return true;
            }
        }

        return false;
    }
}