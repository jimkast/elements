package org.elements.types;

import java.io.IOException;

public interface InStream {
    int read(byte[] b, int offset, int length) throws IOException;
}
