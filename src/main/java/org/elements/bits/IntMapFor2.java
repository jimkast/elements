package org.elements.bits;

import org.elements.types.BiBitsMapping;
import org.elements.types.IntIntMapping;

public final class IntMapFor2 implements IntIntMapping {
    private final int param;
    private final BiBitsMapping bi;

    public IntMapFor2(int param, BiBitsMapping bi) {
        this.param = param;
        this.bi = bi;
    }

    @Override
    public int map(int offset) {
        return bi.map(offset, param);
    }
}
