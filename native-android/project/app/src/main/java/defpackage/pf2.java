package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pf2 extends sj0 {
    public i11 d;

    @Override // defpackage.sj0
    public final int b(Object r1) {
        q04 r2 = (q04) r1;
        if (r2 != null) goto L7;
        return 1;
    L7:
        return r2.d();
    }

    @Override // defpackage.sj0
    public final void c(Object r1, Object r2) {
        f42 r3 = (f42) r1;
        q04 r4 = (q04) r2;
        i11 r0 = this.d;
        if (r0 == null) goto L7;
        if (r4 == null) goto L8;
        r0.e.k(r4, true);
        return;
    L8:
        return;
    }
}
