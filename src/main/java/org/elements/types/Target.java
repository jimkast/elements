package org.elements.types;

public interface Target<T> {
    void accept(T t);


    class Env<T> implements Target<T> {
        private final Target<T> origin;

        public Env(Target<T> origin) {
            this.origin = origin;
        }

        @Override
        public void accept(T t) {
            origin.accept(t);
        }
    }
}
