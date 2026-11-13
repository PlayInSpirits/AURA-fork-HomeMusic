/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.bi0;
import defpackage.dm0;
import defpackage.go4;

public final class am0
implements go4 {
    public final int n;
    public final Class o;
    public final bi0 p;

    public am0(Class clazz, bi0 bi02, int n16) {
        this.n = n16;
        this.o = clazz;
        this.p = bi02;
    }

    @Override
    public final Object get() {
        switch (this.n) {
            default: {
                return dm0.f(this.o, this.p);
            }
            case 1: {
                return dm0.f(this.o, this.p);
            }
            case 0: 
        }
        return dm0.f(this.o, this.p);
    }
}

