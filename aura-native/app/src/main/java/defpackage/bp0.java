/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.dp0;
import defpackage.if1;
import defpackage.j15;
import defpackage.kf2;
import defpackage.l02;
import defpackage.p03;
import defpackage.rl4;

public final class bp0
implements if1 {
    public final dp0 n;
    public final l02 o;
    public final p03 p;
    public final int q;

    public bp0(dp0 dp02, l02 l022, p03 p032, int n16) {
        this.n = dp02;
        this.o = l022;
        this.p = p032;
        this.q = n16;
    }

    @Override
    public final Object invoke(Object object) {
        if (object != this.n) {
            if (object instanceof rl4) {
                int n16 = this.o.a;
                int n17 = this.q;
                p03 p032 = this.p;
                int n18 = p032.d(object);
                n18 = n18 >= 0 ? p032.c[n18] : Integer.MAX_VALUE;
                p032.g(Math.min(n16 - n17, n18), object);
            }
            return j15.a;
        }
        kf2.o("A derived state calculation cannot read itself");
        return null;
    }
}

