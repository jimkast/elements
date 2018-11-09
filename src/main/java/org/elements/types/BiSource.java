package org.elements.types;

public interface BiSource<X, Y> {
    <Z> Z feed(BiMapping<X, Y, Z> target, Z other);


    class Env<X, Y> implements BiSource<X, Y> {
        private final BiSource<X, Y> origin;

        public Env(BiSource<X, Y> origin) {
            this.origin = origin;
        }

        @Override
        public <Z> Z feed(BiMapping<X, Y, Z> target, Z other) {
            return origin.feed(target, other);
        }
    }
}
