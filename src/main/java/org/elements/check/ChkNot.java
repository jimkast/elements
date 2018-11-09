package org.elements.check;

public final class ChkNot<T> implements Check2<T> {
    private final Check2<T> origin;

    public ChkNot(Check2<T> origin) {
        this.origin = origin;
    }

    @Override
    public <X> X test(T item, X success, X other) {
        return origin.test(item, other, success);
    }
}
