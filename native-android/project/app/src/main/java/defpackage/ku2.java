package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ku2 implements a83 {
    public final ad2 a;
    public final ht1 b;
    public int c;

    public ku2(ad2 r2, ht1 r3) {
        this.c = -1;
        this.a = r2;
        this.b = r3;
    }

    @Override // defpackage.a83
    public final void b(Object r3) {
        int r0 = this.c;
        int r1 = this.a.g;
        if (r0 == r1) goto L6;
        this.c = r1;
        this.b.b(r3);
        return;
    }
}
