package org.elements.src;

import org.elements.types.Mapping;
import org.elements.types.Source;

public final class SrcRange implements Source<Integer> {
    private int i;
    private final int max;

    public SrcRange(int i, int max) {
        this.i = i;
        this.max = max;
    }

    @Override
    public <X> X feed(Mapping<Integer, X> target, X other) {
        return i <= max ? target.map(i++) : other;
    }
}