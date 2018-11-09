package org.elements.map;

import org.elements.types.Cond;
import org.elements.types.Mapping;

public final class MappingFork<K, T> implements Mapping<K, T> {
    private final Mapping<K, Cond> check;
    private final Mapping<K, T> main;
    private final Mapping<K, T> other;

    public MappingFork(Mapping<K, Cond> check, Mapping<K, T> main, Mapping<K, T> other) {
        this.check = check;
        this.main = main;
        this.other = other;
    }

    @Override
    public T map(K key) {
        return check.map(key).choose(main, other).map(key);
    }
}
