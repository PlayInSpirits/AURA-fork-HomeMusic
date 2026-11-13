/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.bu4;
import defpackage.f35;
import defpackage.fq;
import defpackage.go4;
import defpackage.pe4;
import defpackage.qe4;
import defpackage.zt4;
import java.util.ArrayList;

public final class de4
implements go4 {
    public final qe4 n;
    public final pe4 o;
    public final int p;
    public final int q;
    public final int r;

    public de4(qe4 qe42, pe4 pe42, int n16, int n17, int n18) {
        this.n = qe42;
        this.o = pe42;
        this.p = n16;
        this.q = n17;
        this.r = n18;
    }

    @Override
    public final Object get() {
        Object object = this.n;
        zt4 zt42 = ((qe4)object).g;
        bu4 bu42 = ((fq)object).b;
        pe4 pe42 = this.o;
        object = qe4.Z0(pe42, zt42, bu42);
        f35.P((ArrayList)object, this.p, this.q, this.r);
        return qe4.j1(pe42, (ArrayList)object, zt42, bu42);
    }
}

