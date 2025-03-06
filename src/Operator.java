public enum Operator {
    ADD('+') {
        @Override
        public <T extends Number> T apply(T a, T b) {
            double result = a.doubleValue() + b.doubleValue();
            if (a instanceof Integer && b instanceof Integer) {
                return (T) Integer.valueOf((int) result);
            } else {
                return (T) Double.valueOf(result);
            }
        }
    },
    SUBTRACT('-') {
        @Override
        public <T extends Number> T apply(T a, T b) {
            double result = a.doubleValue() - b.doubleValue();
            if (a instanceof Integer && b instanceof Integer) {
                return (T) Integer.valueOf((int) result);
            } else {
                return (T) Double.valueOf(result);
            }
        }
    },
    MULTIPLY('*') {
        @Override
        public <T extends Number> T apply(T a, T b) {
            double result = a.doubleValue() * b.doubleValue();
            if (a instanceof Integer && b instanceof Integer) {
                return (T) Integer.valueOf((int) result);
            } else {
                return (T) Double.valueOf(result);
            }
        }
    },
    DIVIDE('/') {
        @Override
        public <T extends Number> T apply(T a, T b) {
            if (b.doubleValue() == 0.0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }
            double result = a.doubleValue() / b.doubleValue();
            if (a instanceof Integer && b instanceof Integer) {
                return (T) Integer.valueOf((int) result);
            } else {
                return (T) Double.valueOf(result);
            }
        }
    };

    private final char symbol;

    Operator(char symbol) {
        this.symbol = symbol;
    }

    public abstract <T extends Number> T apply(T a, T b);

    public char getSymbol() {
        return symbol;
    }

    public static Operator fromSymbol(char symbol) {
        for (Operator op : values()) {
            if (op.symbol == symbol) {
                return op;
            }
        }
        throw new IllegalArgumentException("잘못된 기호입니다: " + symbol);
    }
}