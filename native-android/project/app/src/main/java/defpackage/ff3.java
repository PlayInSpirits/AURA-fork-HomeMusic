package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ff3 implements vy3 {
    public final Set n;
    public final f13 o;

    public ff3(Set r2) {
        this.n = r2;
        this.o = new f13(new wg1[16]);
    }

    @Override // defpackage.vy3
    public final void a() {
    }

    @Override // defpackage.vy3
    public final void c() {
    }

    @Override // defpackage.vy3
    public final void d() {
        f13 r0 = this.o;
        Object[] r1 = r0.n;
        int r2 = r0.p;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        vy3 r4 = ((wg1) r1[r3]).a;
        this.n.remove(r4);
        r4.d();
        r3 = r3 + 1;
        goto L3
    }
}
