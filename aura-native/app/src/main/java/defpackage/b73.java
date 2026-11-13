/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.net.Uri;
import defpackage.e35;
import defpackage.gf1;
import defpackage.if1;
import defpackage.j15;
import defpackage.rg1;
import defpackage.wf1;
import defpackage.xl;
import java.util.List;

public final class b73
implements wf1 {
    public final List n;
    public final int o;
    public final boolean p;
    public final Uri q;
    public final String r;
    public final boolean s;
    public final boolean t;
    public final if1 u;
    public final gf1 v;

    public b73(List list, int n16, boolean bl5, Uri uri, String string, boolean bl6, boolean bl7, if1 if12, gf1 gf12, int n17) {
        this.n = list;
        this.o = n16;
        this.p = bl5;
        this.q = uri;
        this.r = string;
        this.s = bl6;
        this.t = bl7;
        this.u = if12;
        this.v = gf12;
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        object = (rg1)object;
        ((Integer)object2).getClass();
        int n16 = xl.O(1);
        e35.e(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (rg1)object, n16);
        return j15.a;
    }
}

