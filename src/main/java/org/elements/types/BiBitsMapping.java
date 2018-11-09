package org.elements.types;

public interface BiBitsMapping {
    int map(int x, int y);

    BiBitsMapping ADD = (i1, i2) -> i1 + i2;
    BiBitsMapping SUB = (i1, i2) -> i1 - i2;
    BiBitsMapping MUL = (i1, i2) -> i1 * i2;
    BiBitsMapping DIV = (i1, i2) -> i1 / i2;
    BiBitsMapping MOD = (i1, i2) -> i1 % i2;
    BiBitsMapping AND = (i1, i2) -> i1 & i2;
    BiBitsMapping OR = (i1, i2) -> i1 | i2;
    BiBitsMapping XOR = (i1, i2) -> i1 ^ i2;
    BiBitsMapping LSHIFT = (i1, i2) -> i1 << i2;
    BiBitsMapping RSHIFT = (i1, i2) -> i1 >> i2;
    BiBitsMapping URSHIFT = (i1, i2) -> i1 >>> i2;


    class Env implements BiBitsMapping {
        private final BiBitsMapping origin;

        public Env(BiBitsMapping origin) {
            this.origin = origin;
        }

        @Override
        public final int map(int x, int y) {
            return origin.map(x, y);
        }
    }


    final class Boxed implements BiMapping<Integer, Integer, Integer> {
        private final BiBitsMapping origin;

        public Boxed(BiBitsMapping origin) {
            this.origin = origin;
        }

        @Override
        public Integer map(Integer x, Integer y) {
            return origin.map(x, y);
        }
    }
}
