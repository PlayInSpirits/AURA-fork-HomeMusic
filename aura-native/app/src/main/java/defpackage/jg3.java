/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.gb;
import defpackage.if1;
import defpackage.kg3;
import defpackage.n02;
import defpackage.nc0;

public abstract class jg3 {
    public int n;
    public int o;
    public long p = 0L;
    public long q = kg3.b;
    public long r = 0L;

    public int F() {
        return (int)(this.p & 0xFFFFFFFFL);
    }

    public int G() {
        return (int)(this.p >> 32);
    }

    public final void L() {
        int n16;
        this.n = gb.m((int)(this.p >> 32), nc0.j(this.q), nc0.h(this.q));
        this.o = n16 = gb.m((int)(this.p & 0xFFFFFFFFL), nc0.i(this.q), nc0.g(this.q));
        int n17 = this.n;
        long l16 = this.p;
        n17 = (n17 - (int)(l16 >> 32)) / 2;
        n16 = (n16 - (int)(l16 & 0xFFFFFFFFL)) / 2;
        this.r = (long)n17 << 32 | 0xFFFFFFFFL & (long)n16;
    }

    public abstract void N(long var1, float var3, if1 var4);

    public final void Q(long l16) {
        if (!n02.a(this.p, l16)) {
            this.p = l16;
            this.L();
        }
    }

    public final void R(long l16) {
        if (!nc0.b(this.q, l16)) {
            this.q = l16;
            this.L();
        }
    }

    public abstract Object t();
}

