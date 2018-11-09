package org.elements.check;

public interface Check2<T> {
    <X> X test(T item, X success, X other);


    class Env<T> implements Check2<T> {
        private final Check2<T> origin;

        public Env(Check2<T> origin) {
            this.origin = origin;
        }

        @Override
        public final <X> X test(T item, X success, X other) {
            return origin.test(item, success, other);
        }
    }
}
