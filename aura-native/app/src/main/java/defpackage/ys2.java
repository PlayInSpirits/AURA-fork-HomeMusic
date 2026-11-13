/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ab4;
import defpackage.fr2;
import defpackage.it2;
import defpackage.kt2;
import defpackage.na4;
import defpackage.tn2;
import defpackage.va4;

public final class ys2
implements Runnable {
    public final kt2 n;
    public final fr2 o;
    public final va4 p;
    public final tn2 q;
    public final int r;
    public final int s;
    public final it2 t;

    public ys2(kt2 kt22, fr2 fr22, va4 va42, tn2 tn22, int n16, int n17, it2 it22) {
        this.n = kt22;
        this.o = fr22;
        this.p = va42;
        this.q = tn22;
        this.r = n16;
        this.s = n17;
        this.t = it22;
    }

    @Override
    public final void run() {
        na4 na42 = this.n.f;
        fr2 fr22 = this.o;
        if (!na42.F(fr22)) {
            return;
        }
        va4 va42 = this.p;
        tn2 tn22 = this.q;
        int n16 = this.r;
        if (va42 != null) {
            if (!na42.J(fr22, va42)) {
                kt2.P0(tn22, fr22, n16, new ab4(-4));
                return;
            }
        } else if (!na42.I(fr22, this.s)) {
            kt2.P0(tn22, fr22, n16, new ab4(-4));
            return;
        }
        this.t.h(tn22, fr22, n16);
    }
}

