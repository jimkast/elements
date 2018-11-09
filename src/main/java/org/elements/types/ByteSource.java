package org.elements.types;

import java.io.IOException;
import java.io.UncheckedIOException;

public interface ByteSource {
    void feed(OutStream out) throws IOException;

    class Env implements ByteSource {
        private final ByteSource origin;

        public Env(ByteSource origin) {
            this.origin = origin;
        }

        @Override
        public final void feed(OutStream out) throws IOException {
            origin.feed(out);
        }
    }


    final class Safe implements ByteSource {
        private final ByteSource origin;

        public Safe(ByteSource origin) {
            this.origin = origin;
        }

        @Override
        public void feed(OutStream out) {
            try {
                origin.feed(out);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }
}
