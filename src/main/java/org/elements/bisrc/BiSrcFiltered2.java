package org.elements.bisrc;

import org.elements.bimap.BiMapFixed;
import org.elements.types.BiMapping;
import org.elements.types.BiSource;
import org.elements.types.Cond;
import org.elements.types.Mapping;

public final class BiSrcFiltered2<X, Y> implements BiSource<X, Y> {
    private final Mapping<Y, Cond> check;
    private final BiSource<X, Y> origin;

    public BiSrcFiltered2(Mapping<Y, Cond> check, BiSource<X, Y> origin) {
        this.check = check;
        this.origin = origin;
    }

    @Override
    public <Z> Z feed(BiMapping<X, Y, Z> target, Z other) {
        return origin.feed((x, y) -> check.map(y).choose(target, new BiMapFixed<X, Y, Z>(other)).map(x, y), other);
    }
}