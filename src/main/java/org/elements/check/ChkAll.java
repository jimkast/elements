package org.elements.check;

public final class ChkAll<T> implements Check2<T> {
    private final Iterable<Check2<T>> all;

    public ChkAll(Iterable<Check2<T>> all) {
        this.all = all;
    }

    @Override
    public <X> X test(T item, X success, X other) {
        X x;
        for (Check2<T> chk : all) {
            x = chk.test(item, success, other);
            if (x == success) {
                return x;
            }
        }
        return other;
    }
}
