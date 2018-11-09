package org.elements.types;

public interface IntIntMapping {
    int map(int offset);

    class Env implements IntIntMapping {
        private final IntIntMapping origin;

        public Env(IntIntMapping origin) {
            this.origin = origin;
        }

        @Override
        public int map(int offset) {
            return origin.map(offset);
        }
    }
}
