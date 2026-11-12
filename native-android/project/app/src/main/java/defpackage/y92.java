package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y92 implements s92, aa2 {
    public final HashSet n;
    public final ea2 o;

    public y92(ea2 r2) {
        this.n = new HashSet();
        this.o = r2;
        r2.a(this);
    }

    @Override // defpackage.s92
    public final void a(z92 r1) {
        this.n.remove(r1);
    }

    @Override // defpackage.s92
    public final void f(z92 r2) {
        this.n.add(r2);
        r92 r1 = this.o.h;
        if (r1 != r92.n) goto L7;
        r2.h();
        return;
    L7:
        if (r1.compareTo(r92.q) < 0) goto L10;
        r2.n();
        return;
    L10:
        r2.j();
    }

    @f93(q92.ON_DESTROY)
    public void onDestroy(ba2 r5) {
        ArrayList r0 = e35.B(this.n);
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        ((z92) r3).h();
        goto L3
    L5:
        r5.h().f(this);
    }

    @f93(q92.ON_START)
    public void onStart(ba2 r3) {
        ArrayList r2 = e35.B(this.n);
        int r4 = r2.size();
        int r0 = 0;
    L3:
        if (r0 >= r4) goto L5;
        Object r1 = r2.get(r0);
        r0 = r0 + 1;
        ((z92) r1).n();
        goto L3
    }

    @f93(q92.ON_STOP)
    public void onStop(ba2 r3) {
        ArrayList r2 = e35.B(this.n);
        int r4 = r2.size();
        int r0 = 0;
    L3:
        if (r0 >= r4) goto L5;
        Object r1 = r2.get(r0);
        r0 = r0 + 1;
        ((z92) r1).j();
        goto L3
    }
}
