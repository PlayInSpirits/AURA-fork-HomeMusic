/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.b25;
import defpackage.ce;
import defpackage.if1;
import defpackage.j15;
import defpackage.ji2;
import defpackage.zd;

public final class y15
implements if1 {
    public final b25 n;
    public final float o;
    public final if1 p;

    public y15(b25 b252, float f16, if1 if12) {
        this.n = b252;
        this.o = f16;
        this.p = if12;
    }

    @Override
    public final Object invoke(Object object) {
        long l16 = (Long)object;
        b25 b252 = this.n;
        if (b252.b == Long.MIN_VALUE) {
            b252.b = l16;
        }
        float f16 = b252.e;
        object = new zd(f16);
        float f17 = this.o;
        zd zd6 = b25.f;
        long l17 = f17 == 0.0f ? b252.a.m(new zd(f16), zd6, b252.c) : ji2.M((float)(l16 - b252.b) / f17);
        f16 = ((zd)b252.a.k((long)l17, (ce)object, (ce)zd6, (ce)b252.c)).a;
        b252.c = (zd)b252.a.d(l17, (ce)object, zd6, b252.c);
        b252.b = l16;
        f17 = b252.e;
        b252.e = f16;
        this.p.invoke(Float.valueOf(f17 - f16));
        return j15.a;
    }
}

