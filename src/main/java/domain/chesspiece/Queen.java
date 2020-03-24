package domain.chesspiece;

import domain.team.Team;

public class Queen extends Chesspiece {
    private static final String INITIAL = "Q";

    public Queen(Team team) {
        super(INITIAL, team);
    }
}
