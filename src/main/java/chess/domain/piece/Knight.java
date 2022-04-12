package chess.domain.piece;

import chess.domain.game.Color;
import chess.domain.position.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Knight extends Piece {
    public Knight(Color color) {
        super(color, PieceType.KNIGHT);
    }

    @Override
    protected String baseSignature() {
        return "n";
    }

    @Override
    public boolean isMovable(Map<Position, Piece> board, Position source, Position target) {
        int distanceX = Math.abs(source.calculateDisplacementXTo(target));
        int distanceY = Math.abs(source.calculateDisplacementYTo(target));

        return isKnightMove(distanceX, distanceY);
    }

    private boolean isKnightMove(int distanceX, int distanceY) {
        return (distanceY == 1 && distanceX == 2) || (distanceY == 2 && distanceX == 1);
    }

    @Override
    public List<Position> findRoute(Position source, Position target) {
        return new ArrayList<>();
    }

    @Override
    public double score() {
        return 2.5;
    }
}
