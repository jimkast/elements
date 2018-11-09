package org.elements.types.comp;

import org.elements.types.IntIntMapping;
import org.elements.types.Quantity;

public interface Binary extends IntIntMapping, Quantity {

    Binary EMPTY = new Empty();


    final class Range implements Binary {
        private final int size;

        public Range(int size) {
            this.size = size;
        }

        @Override
        public int map(int offset) {
            return offset;
        }

        @Override
        public int length() {
            return size;
        }
    }


    final class Empty implements Binary {
        @Override
        public int map(int offset) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public int length() {
            return 0;
        }
    }
}
