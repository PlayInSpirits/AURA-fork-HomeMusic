package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qq2 {
    public final Context n;
    public final om1 o;
    public final zk p;
    public si1 q;
    public up2 r;
    public boolean s;
    public xk0 t;
    public boolean u;

    public qq2(Context r3, om1 r4) {
        this.p = new zk(8, this);
        if (r3 == null) goto L10;
        this.n = r3;
        if (r4 != null) goto L8;
        ComponentName r0 = new ComponentName(r3, getClass());
        this.o = new om1(10, r0);
        return;
    L8:
        this.o = r4;
        return;
    L10:
        kf2.n("context must not be null");
        throw null;
    }

    public nq2 a(String r1, pq2 r2) {
        if (r1 == null) goto L5;
        return null;
    L5:
        kf2.n("initialMemberRouteId cannot be null.");
        return null;
    }

    public oq2 b(String r1) {
        if (r1 == null) goto L5;
        return null;
    L5:
        kf2.n("routeId cannot be null");
        return null;
    }

    public oq2 c(String r1, pq2 r2) {
        return b(r1);
    }

    public oq2 d(String r2, String r3) {
        if (r2 == null) goto L9;
        if (r3 != null) goto L6;
        kf2.n("routeGroupId cannot be null");
        return null;
    L6:
        return c(r2, pq2.b);
    L9:
        kf2.n("routeId cannot be null");
        return null;
    }

    public abstract void e(up2 r1);

    public final void f(xk0 r2) {
        yq2.b();
        if (this.t == r2) goto L8;
        this.t = r2;
        if (this.u == true) goto L9;
        this.u = true;
        this.p.sendEmptyMessage(1);
        return;
    L9:
        return;
    }

    public final void g(up2 r2) {
        yq2.b();
        if (Objects.equals(this.r, r2) == true) goto L10;
        this.r = r2;
        if (this.s == true) goto L9;
        this.s = true;
        this.p.sendEmptyMessage(2);
        return;
    L9:
        return;
    }
}
