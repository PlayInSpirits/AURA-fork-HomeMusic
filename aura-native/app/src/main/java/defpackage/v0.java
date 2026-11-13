/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.o15;
import defpackage.rr2;
import defpackage.tb4;
import java.util.ListIterator;

public abstract class v0
extends o15
implements ListIterator {
    public final int o;
    public int p;

    public v0(int n16, int n17) {
        super(0);
        rr2.t(n17, n16);
        this.o = n16;
        this.p = n17;
    }

    public abstract Object a(int var1);

    public final void add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.p < this.o;
    }

    @Override
    public final boolean hasPrevious() {
        return this.p > 0;
    }

    @Override
    public final Object next() {
        if (this.hasNext()) {
            int n16 = this.p;
            this.p = n16 + 1;
            return this.a(n16);
        }
        tb4.k();
        return null;
    }

    @Override
    public final int nextIndex() {
        return this.p;
    }

    public final Object previous() {
        if (this.hasPrevious()) {
            int n16;
            this.p = n16 = this.p - 1;
            return this.a(n16);
        }
        tb4.k();
        return null;
    }

    @Override
    public final int previousIndex() {
        return this.p - 1;
    }

    public final void set(Object object) {
        throw new UnsupportedOperationException();
    }
}

