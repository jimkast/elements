package org.elements.check;

import org.elements.types.Cond;

public final class Check2Adapter<T> implements Check<T> {
    private final Check2<T> origin;

    public Check2Adapter(Check2<T> origin) {
        this.origin = origin;
    }

    @Override
    public Cond map(T key) {
        return origin.test(key, Cond.TRUE, Cond.FALSE);
    }
}
