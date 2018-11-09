package org.elements.check;

import org.elements.types.Cond;
import org.elements.types.Mapping;

public interface Check<T> extends Mapping<T, Cond> {

    final class Not<T> implements Check<T> {
        private final Check<T> origin;

        public Not(Check<T> origin) {
            this.origin = origin;
        }

        @Override
        public Cond map(T t) {
            return origin.map(t).choose(Cond.FALSE, Cond.TRUE);
        }
    }


    final class Eq<T> implements Check<T> {
        private final T against;

        public Eq(T against) {
            this.against = against;
        }

        @Override
        public Cond map(T t) {
            return against.equals(t) ? Cond.TRUE : Cond.FALSE;
        }
    }
}
