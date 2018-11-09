package org.elements.src;

import org.elements.types.Mapping;
import org.elements.types.Source;

public final class SrcEmpty<T> implements Source<T> {
    private static final Source INSTANCE = new SrcEmpty<>();

    @Override
    public <X> X feed(Mapping<T, X> target, X other) {
        return other;
    }

    @SuppressWarnings("unchecked")
    public static <T> Source<T> instance() {
        return INSTANCE;
    }
}
