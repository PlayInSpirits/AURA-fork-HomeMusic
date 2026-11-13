/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.os.Bundle;
import defpackage.bm2;
import defpackage.pu1;
import defpackage.va4;
import defpackage.xl2;

public final class dl2
implements xl2 {
    public final int n;
    public final bm2 o;
    public final va4 p;
    public final Bundle q;

    public dl2(bm2 bm22, va4 va42, Bundle bundle, int n16) {
        this.n = n16;
        this.o = bm22;
        this.p = va42;
        this.q = bundle;
    }

    @Override
    public final void d(pu1 pu12, int n16) {
        int n17 = this.n;
        va4 va42 = this.p;
        bm2 bm22 = this.o;
        switch (n17) {
            default: {
                pu12.t0(bm22.c, n16, va42.b(), this.q);
                return;
            }
            case 0: 
        }
        pu12.s(bm22.c, n16, va42.b(), this.q, false);
    }
}

