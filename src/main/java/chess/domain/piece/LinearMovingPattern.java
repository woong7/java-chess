package chess.domain.piece;

import chess.domain.position.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class LinearMovingPattern implements MovingPattern {
    public List<Position> findRoute(Position source, Position target) {
        List<Position> route = new ArrayList<>();

        int routeLength = source.calculateMaxLinearLengthTo(target);
        int xChangeRatio = source.calculateXSlope(target, routeLength);
        int yChangeRatio = source.calculateYSlope(target, routeLength);

        for (int step = 1; step < routeLength; step++) {
            Position routeNode = source.displacedOf(xChangeRatio * step, yChangeRatio * step);
            route.add(routeNode);
        }
        return route;
    }

    public abstract boolean isMovable(Map<Position, Piece> board, Position source, Position target);
}