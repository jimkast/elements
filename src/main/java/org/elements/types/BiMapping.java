package org.elements.types;

public interface BiMapping<X, Y, Z> {
    Z map(X x, Y y);

    class Env<X, Y, Z> implements BiMapping<X, Y, Z> {
        private final BiMapping<X, Y, Z> origin;

        public Env(BiMapping<X, Y, Z> origin) {
            this.origin = origin;
        }

        @Override
        public Z map(X x, Y y) {
            return origin.map(x, y);
        }
    }
}
