package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zk3 extends cu4 {
    public static final Object j = null;
    public final gn2 e;
    public final boolean f;
    public final boolean g;
    public final an2 h;
    public final long i;

    static {
        j = new Object();
    }

    public zk3(al3 r3) {
        this.e = r3.a();
        this.f = r3.R0();
        this.g = r3.T0();
        if (r3.V0() == false) goto L5;
        an2 r0 = an2.f;
    L6:
        this.h = r0;
        this.i = f35.Q(r3.x());
        return;
    L5:
        r0 = null;
        goto L6
    }

    @Override // defpackage.cu4
    public final int b(Object r1) {
        if (j == r1) goto L6;
        return -1;
    L6:
        return 0;
    }

    @Override // defpackage.cu4
    public final zt4 f(int r11, zt4 r12, boolean r13) {
        r12.getClass();
        z5 r8 = z5.f;
        Object r1 = j;
        r12.i(r1, r1, 0, this.i, 0, r8, false);
        r12.f = false;
        return r12;
    }

    @Override // defpackage.cu4
    public final int h() {
        return 1;
    }

    @Override // defpackage.cu4
    public final Object l(int r1) {
        return j;
    }

    @Override // defpackage.cu4
    public final bu4 m(int r22, bu4 r23, long r24) {
        r23.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0, this.i, 0, 0, 0);
        r23.j = false;
        return r23;
    }

    @Override // defpackage.cu4
    public final int o() {
        return 1;
    }
}
