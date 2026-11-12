package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b20 extends u22 {
    public final cz u;

    public b20(cz r1) {
        this.u = r1;
    }

    @Override // defpackage.u22
    public final boolean r() {
        return true;
    }

    @Override // defpackage.u22
    public final void s(Throwable r2) {
        a32 r3 = q();
        cz r1 = this.u;
        Throwable r4 = r1.o(r3);
        if (r1.y() == true) goto L5;
        boolean r0 = false;
    L6:
        if (r0 == true) goto L13;
        r1.r(r4);
        if (r1.y() == true) goto L12;
        r1.m();
        return;
    L12:
        return;
    L13:
        return;
    L5:
        r0 = ((mr0) r1.q).n(r4);
        goto L6
    }
}
