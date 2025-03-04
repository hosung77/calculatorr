public enum Operator {

    ADD('+') {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT('-') {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY('*') {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },
    DIVIDE('/') {
        @Override
        public int apply(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            return a / b;
        }
    };

    private final char symbol; // ✅ char 유지

    Operator(char symbol) { // ✅ char 타입 생성자 유지
        this.symbol = symbol;
    }

    // 추상 메서드
    public abstract int apply(int a, int b);

    public char getSymbol() {
        return symbol;
    }

    public static Operator fromSymbol(char symbol) { // ✅ char 타입 유지
        for (Operator op : values()) {
            if (op.symbol == symbol) { // ✅ char 비교는 == 사용
                return op;
            }
        }
        throw new IllegalArgumentException("잘못된 기호입니다: " + symbol);
    }
}