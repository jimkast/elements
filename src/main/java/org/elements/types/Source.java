package org.elements.types;

import java.util.Iterator;

public interface Source<T> {
    <X> X feed(Mapping<T, X> target, X other);

    class Env<T> implements Source<T> {
        private final Source<T> origin;

        public Env(Source<T> origin) {
            this.origin = origin;
        }

        @Override
        public final <X> X feed(Mapping<T, X> target, X other) {
            return origin.feed(target, other);
        }
    }

    final class OfIterator<T> implements Source<T> {
        private final Iterator<T> iter;

        public OfIterator(Iterator<T> iter) {
            this.iter = iter;
        }

        @Override
        public <X> X feed(Mapping<T, X> target, X other) {
            return iter.hasNext() ? target.map(iter.next()) : other;
        }
    }
}
