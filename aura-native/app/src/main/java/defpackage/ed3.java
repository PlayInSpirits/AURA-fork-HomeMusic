/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.dd3;
import defpackage.gb;
import defpackage.hb3;
import defpackage.q01;
import defpackage.qc0;
import defpackage.qc3;
import defpackage.rv2;
import defpackage.te5;
import defpackage.vi2;

public abstract class ed3 {
    public static final dd3 a;
    public static final qc3 b;

    static {
        dd3 dd32;
        a = dd32 = new dd3(0);
        b = new qc3(0, 0, 0, 0, 0, 0, rv2.C, (vi2)new Object(), te5.a(q01.n), dd32, qc0.b(0, 0, 15));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final long a(qc3 qc32, int n16) {
        int n17 = qc32.c;
        int n18 = qc32.b;
        long l16 = n16;
        long l17 = n18 + n17;
        long l18 = -qc32.f;
        long l19 = qc32.d;
        long l26 = n17;
        long l27 = qc32.e == hb3.o ? qc32.i() >> 32 : qc32.i() & 0xFFFFFFFFL;
        n16 = (int)l27;
        qc32.n.getClass();
        l27 = l16 * l17 + l18 + l19 - l26 - (long)(n16 - gb.m(0, 0, n16));
        if (l27 >= 0L) {
            return l27;
        }
        return 0L;
    }
}

