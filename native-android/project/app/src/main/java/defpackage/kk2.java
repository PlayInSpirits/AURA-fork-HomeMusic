package defpackage;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kk2 implements q55 {
    public final /* synthetic */ ok2 b;

    public kk2(ok2 r1) {
        this.b = r1;
    }

    @Override // defpackage.q55
    public final void a(s55 r1) {
    }

    @Override // defpackage.q55
    public final void b() {
        ok2 r2 = this.b;
        Surface r0 = r2.l1;
        if (r0 == null) goto L6;
        r2.W0.j(r0);
        r2.o1 = true;
        return;
    }

    @Override // defpackage.q55
    public final void c() {
        ok2 r2 = this.b;
        if (r2.l1 == null) goto L6;
        r2.S0(0, 1);
        return;
    }

    @Override // defpackage.q55
    public final void d() {
        k41 r0 = this.b.V;
        if (r0 == null) goto L6;
        r0.a();
        return;
    }
}
