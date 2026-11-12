package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qg2 extends cu4 {
    public final gn2 e;

    public qg2(gn2 r1) {
        this.e = r1;
    }

    @Override // defpackage.cu4
    public final int b(Object r1) {
        if (r1 != pg2.h) goto L6;
        return 0;
    L6:
        return -1;
    }

    @Override // defpackage.cu4
    public final zt4 f(int r11, zt4 r12, boolean r13) {
        Object r10 = null;
        if (r13 == false) goto L5;
        Integer r1 = 0;
    L6:
        if (r13 == false) goto L8;
        r10 = pg2.h;
    L8:
        r12.i(r1, r10, 0, -9223372036854775807L, 0, z5.f, true);
        return r12;
    L5:
        r1 = null;
        goto L6
    }

    @Override // defpackage.cu4
    public final int h() {
        return 1;
    }

    @Override // defpackage.cu4
    public final Object l(int r1) {
        return pg2.h;
    }

    @Override // defpackage.cu4
    public final bu4 m(int r22, bu4 r23, long r24) {
        r23.b(bu4.p, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0, -9223372036854775807L, 0, 0, 0);
        r23.j = true;
        return r23;
    }

    @Override // defpackage.cu4
    public final int o() {
        return 1;
    }
}
