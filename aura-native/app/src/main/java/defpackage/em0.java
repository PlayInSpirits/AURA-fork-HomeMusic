/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.f35;
import defpackage.fm0;
import defpackage.im4;
import defpackage.l84;
import defpackage.m84;
import defpackage.o84;
import java.math.BigInteger;

public final class em0
implements m84 {
    public final fm0 a;

    public em0(fm0 fm02) {
        this.a = fm02;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final l84 e(long l16) {
        Object object = this.a;
        long l17 = (long)((fm0)object).q.i * l16 / 1000000L;
        long l18 = ((fm0)object).o;
        BigInteger bigInteger = BigInteger.valueOf(l17);
        l17 = ((fm0)object).p;
        object = new o84(l16, f35.k(bigInteger.multiply(BigInteger.valueOf(l17 - l18)).divide(BigInteger.valueOf(((fm0)object).s)).longValue() + l18 - 30000L, ((fm0)object).o, l17 - 1L));
        return new l84((o84)object, (o84)object);
    }

    @Override
    public final long g() {
        fm0 fm02 = this.a;
        im4 im42 = fm02.q;
        return fm02.s * 1000000L / (long)im42.i;
    }
}

