/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.util.Pair;
import defpackage.f35;
import defpackage.l84;
import defpackage.o84;
import defpackage.q84;

public final class qw2
implements q84 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public qw2(long l16, long[] lArray, long[] lArray2) {
        this.a = lArray;
        this.b = lArray2;
        if (l16 == -9223372036854775807L) {
            l16 = f35.Q(lArray2[lArray2.length - 1]);
        }
        this.c = l16;
    }

    public static Pair h(long l16, long[] lArray, long[] lArray2) {
        int n16 = f35.f(lArray, l16, true);
        long l17 = lArray[n16];
        long l18 = lArray2[n16];
        if (++n16 == lArray.length) {
            return Pair.create(l17, l18);
        }
        long l19 = lArray[n16];
        long l26 = lArray2[n16];
        double d16 = l19 == l17 ? 0.0 : ((double)l16 - (double)l17) / (double)(l19 - l17);
        return Pair.create(l16, (long)(d16 * (double)(l26 - l18)) + l18);
    }

    @Override
    public final long a() {
        return -1L;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final long c(long l16) {
        return f35.Q((Long)qw2.h((long)l16, (long[])this.a, (long[])this.b).second);
    }

    @Override
    public final l84 e(long l16) {
        Object object = qw2.h(f35.i0(f35.k(l16, 0L, this.c)), this.b, this.a);
        object = new o84(f35.Q((Long)((Pair)object).first), (Long)((Pair)object).second);
        return new l84((o84)object, (o84)object);
    }

    @Override
    public final int f() {
        return -2147483647;
    }

    @Override
    public final long g() {
        return this.c;
    }
}

