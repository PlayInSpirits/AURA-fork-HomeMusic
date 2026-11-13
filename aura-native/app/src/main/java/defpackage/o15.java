/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import java.util.Iterator;

public abstract class o15
implements Iterator {
    public final int n;

    public o15(int n16) {
        this.n = n16;
    }

    @Override
    public final void remove() {
        switch (this.n) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 0: 
        }
        throw new UnsupportedOperationException();
    }
}

