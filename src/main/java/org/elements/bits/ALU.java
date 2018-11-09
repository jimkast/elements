package org.elements.bits;

import org.elements.types.BiBitsMapping;
import org.elements.types.IntIntMapping;

public final class ALU {
    final class Add extends IntIntMapping.Env {
        public Add(int part) {
            super(new IntMapFor1(part, BiBitsMapping.ADD));
        }
    }

    final class Sub extends IntIntMapping.Env {
        public Sub(int part) {
            super(new IntMapFor1(part, BiBitsMapping.SUB));
        }
    }

    final class Mul extends IntIntMapping.Env {
        public Mul(int part) {
            super(new IntMapFor1(part, BiBitsMapping.MUL));
        }
    }

    final class Div extends IntIntMapping.Env {
        public Div(int part) {
            super(new IntMapFor1(part, BiBitsMapping.DIV));
        }
    }

    final class Mod extends IntIntMapping.Env {
        public Mod(int part) {
            super(new IntMapFor1(part, BiBitsMapping.MOD));
        }
    }

    final class And extends IntIntMapping.Env {
        public And(int part) {
            super(new IntMapFor1(part, BiBitsMapping.AND));
        }
    }

    final class Or extends IntIntMapping.Env {
        public Or(int part) {
            super(new IntMapFor1(part, BiBitsMapping.OR));
        }
    }

    final class Xor extends IntIntMapping.Env {
        public Xor(int part) {
            super(new IntMapFor1(part, BiBitsMapping.XOR));
        }
    }

    final class Lshift extends IntIntMapping.Env {
        public Lshift(int part) {
            super(new IntMapFor1(part, BiBitsMapping.LSHIFT));
        }
    }

    final class Rshift extends IntIntMapping.Env {
        public Rshift(int part) {
            super(new IntMapFor1(part, BiBitsMapping.RSHIFT));
        }
    }

    final class Urshift extends IntIntMapping.Env {
        public Urshift(int part) {
            super(new IntMapFor1(part, BiBitsMapping.URSHIFT));
        }
    }
}
