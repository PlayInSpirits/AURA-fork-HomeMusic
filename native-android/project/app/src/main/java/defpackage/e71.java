package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e71 extends cx2 implements u62 {
    public lq0 B;
    public float C;

    @Override // defpackage.u62
    public final vi2 r(cf2 r6, pi2 r7, long r8) {
        if (nc0.d(r8) == true) goto L5;
    L13:
        int r2 = nc0.j(r8);
        int r0 = nc0.h(r8);
    L15:
        if (nc0.c(r8) == true) goto L17;
    L25:
        int r5 = nc0.i(r8);
        int r9 = nc0.g(r8);
        int r10 = r5;
        int r11 = r9;
    L26:
        jg3 r12 = r7.r(qc0.a(r2, r0, r10, r11));
        return r6.v(r12.n, r12.o, v01.n, new la(r12, 1));
    L17:
        if (this.B == lq0.o) goto L25;
        int r13 = Math.round(nc0.g(r8) * this.C);
        int r1 = nc0.i(r8);
        r10 = nc0.g(r8);
        if (r13 >= r1) goto L21;
        r13 = r1;
    L21:
        if (r13 > r10) goto L24;
        r10 = r13;
    L24:
        r11 = r10;
        goto L26
    L5:
        if (this.B == lq0.n) goto L13;
        int r3 = Math.round(nc0.h(r8) * this.C);
        int r4 = nc0.j(r8);
        r2 = nc0.h(r8);
        if (r3 >= r4) goto L9;
        r3 = r4;
    L9:
        if (r3 > r2) goto L12;
        r2 = r3;
    L12:
        r0 = r2;
        goto L15
    }
}
