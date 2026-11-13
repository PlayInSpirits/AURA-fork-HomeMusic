/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.o15;
import defpackage.tb4;

public final class l22
extends o15 {
    public final Object o;
    public boolean p;

    public l22(Object object) {
        super(0);
        this.o = object;
    }

    @Override
    public final boolean hasNext() {
        return this.p ^ true;
    }

    public final Object next() {
        if (!this.p) {
            this.p = true;
            return this.o;
        }
        tb4.k();
        return null;
    }
}

