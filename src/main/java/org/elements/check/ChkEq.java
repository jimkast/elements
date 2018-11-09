package org.elements.check;

public final class ChkEq<T> implements Check2<T> {
    private final T item;

    public ChkEq(T item) {
        this.item = item;
    }

    @Override
    public <X> X test(T item, X success, X other) {
        return this.item.equals(item) ? success : other;
    }
}
