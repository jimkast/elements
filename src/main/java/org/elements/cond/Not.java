package org.elements.cond;

import org.elements.types.Cond;

public final class Not implements Cond {
    private final Cond origin;

    public Not(Cond origin) {
        this.origin = origin;
    }

    @Override
    public <T> T choose(T success, T other) {
        return origin.choose(other, success);
    }
}
