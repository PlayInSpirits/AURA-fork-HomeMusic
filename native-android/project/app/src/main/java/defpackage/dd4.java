package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dd4 extends n2 {
    public long a;
    public cz b;

    @Override // defpackage.n2
    public final boolean a(m2 r5) {
        cd4 r6 = (cd4) r5;
        if (this.a < 0) goto L6;
        return false;
    L6:
        long r0 = r6.v;
        if (r0 >= r6.w) goto L9;
        r6.w = r0;
    L9:
        this.a = r0;
        return true;
    }

    @Override // defpackage.n2
    public final vd0[] b(m2 r5) {
        long r0 = this.a;
        this.a = -1;
        this.b = null;
        return ((cd4) r5).v(r0);
    }
}
