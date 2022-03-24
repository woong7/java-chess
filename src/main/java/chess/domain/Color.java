package chess.domain;

import java.util.Locale;

public enum Color {
    BLACK, WHITE, NONE;

    public String correctSignature(String signature) {
        if (this == BLACK) {
            return signature.toUpperCase(Locale.ROOT);
        }
        if (this == WHITE) {
            return signature.toLowerCase(Locale.ROOT);
        }
        return signature;
    }

    public Color nextTurnColor() {
        if (this == BLACK) {
            return WHITE;
        }
        if (this == WHITE) {
            return BLACK;
        }
        return NONE;
    }
}
