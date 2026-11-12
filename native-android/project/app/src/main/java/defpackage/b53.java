package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class b53 extends gx2 {
    public final y43 a;

    public b53(y43 r1) {
        this.a = r1;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        return new e53(this.a, null);
    }

    @Override // defpackage.gx2
    public final void e(cx2 r3) {
        e53 r4 = (e53) r3;
        r4.B = this.a;
        na4 r2 = r4.C;
        if (((e53) r2.n) != r4) goto L5;
        r2.n = null;
        r2.q = null;
        r2.p = gb.c;
    L5:
        na4 r5 = new na4(10);
        r4.C = r5;
        if (r4.A == false) goto L9;
        r5.n = r4;
        r5.o = null;
        r4.D = null;
        r5.p = new wc(15, r4);
        r5.q = r4.e0();
        return;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof b53) == true) goto L6;
        return false;
    L6:
        if (h12.c(((b53) r2).a, this.a) == true) goto L9;
        return false;
    L9:
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
