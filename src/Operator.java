public enum Operator {
    ADD('+') {
        @Override
        public Number apply(Number a, Number b) {
            double result = a.doubleValue() + b.doubleValue();

            if(a instanceof Integer && b instanceof Integer) {
                return (int) result;
            } else {
                return result;
            }
        }
    },
    SUBTRACT('-') {
        @Override
        public Number apply(Number a, Number b) {
            double result = a.doubleValue() - b.doubleValue();

            if(a instanceof Integer && b instanceof Integer) {
                return (int) result;
            } else {
                return result;
            }
        }
    },
    MULTIPLY('*') {
        @Override
        public Number apply(Number a, Number b) {
            double result = a.doubleValue() * b.doubleValue();

            if(a instanceof Integer && b instanceof Integer) {
                return (int) result;
            } else {
                return result;
            }
        }
    },
    DIVIDE('/') {
        @Override
        public Number apply(Number a, Number b) {
            if (b.doubleValue() == 0.0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }

            double result = a.doubleValue() / b.doubleValue();

            if(a instanceof Integer && b instanceof Integer) {
                return (int) result;
            } else {
                return result;
            }
        }
    };

    private final char symbol;

    Operator(char symbol) {
        this.symbol = symbol;
    }

    public abstract Number apply(Number a, Number b);

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