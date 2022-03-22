package chess.domain.piece;

import chess.domain.Color;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PawnTest {
    @ParameterizedTest
    @CsvSource(value = {"BLACK:P", "WHITE:p"}, delimiter = ':')
    @DisplayName("기물의 색깔에 맞는 이름을 반환하는지")
    void checkNameByColor(Color color, String pieceName) {
        Pawn pawn = new Pawn(color);

        assertThat(pawn.signature()).isEqualTo(pieceName);
    }
}
