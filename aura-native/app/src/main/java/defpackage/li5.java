/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.o15;
import defpackage.tb4;

public final class li5
extends o15 {
    public static final Object p = new Object();
    public Object o;

    public li5(Object object) {
        super(1);
        this.o = object;
    }

    @Override
    public final boolean hasNext() {
        return this.o != p;
    }

    public final Object next() {
        Object object = this.o;
        Object object2 = p;
        if (object != object2) {
            this.o = object2;
            return object;
        }
        tb4.k();
        return null;
    }
}

