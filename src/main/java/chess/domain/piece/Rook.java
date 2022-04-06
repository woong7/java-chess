package chess.domain.piece;

import chess.domain.Color;
import chess.domain.position.Position;

import java.util.List;
import java.util.Map;

public class Rook extends LinearMovePiece {
    public Rook(Color color) {
        super(color, PieceType.Rook);
    }

    @Override
    protected String baseSignature() {
        return "r";
    }

    @Override
    public boolean isMovable(Map<Position, Piece> board, Position source, Position target) {
        int distanceX = Math.abs(source.calculateDisplacementXTo(target));
        int distanceY = Math.abs(source.calculateDisplacementYTo(target));

        return isDisplaced(distanceX, distanceY) && isStraightMove(distanceX, distanceY);
    }

    private boolean isDisplaced(int distanceX, int distanceY) {
        return Math.max(distanceX, distanceY) > 0;
    }

    private boolean isStraightMove(int distanceX, int distanceY) {
        return distanceX * distanceY == 0;
    }

    @Override
    public List<Position> findRoute(Position source, Position target) {
        return findLinearRoute(source, target);
    }

    @Override
    public double score() {
        return 5;
    }

    @Override
    public boolean isRook() {
        return true;
    }
}
