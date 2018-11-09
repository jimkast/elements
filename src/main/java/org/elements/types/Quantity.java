package org.elements.types;

public interface Quantity {
    int length();


    class Env implements Quantity {
        private final Quantity origin;

        public Env(Quantity origin) {
            this.origin = origin;
        }

        @Override
        public final int length() {
            return origin.length();
        }
    }


    final class Fixed implements Quantity {
        private final int length;

        public Fixed(int length) {
            this.length = length;
        }

        @Override
        public int length() {
            return length;
        }
    }
}
