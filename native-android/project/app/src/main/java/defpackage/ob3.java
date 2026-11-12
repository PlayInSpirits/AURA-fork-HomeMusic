package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ob3 extends ya4 {
    public final g34 f;
    public final nc g;

    public ob3(g34 r2) {
        this.f = r2;
        if (wr1.K(r2) == true) goto L5;
        nc r0 = pc.a();
        nc.b(r0, r2);
    L6:
        this.g = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L5;
        return true;
    L5:
        if ((r2 instanceof ob3) == false) goto L13;
        g34 r3 = ((ob3) r2).f;
        if (this.f.equals(r3) == true) goto L11;
        return false;
    L11:
        return true;
    L13:
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.ya4
    public final wv3 s() {
        g34 r4 = this.f;
        return new wv3(r4.a, r4.b, r4.c, r4.d);
    }
}
