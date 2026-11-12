package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vy extends kq {
    public final cj0 F;
    public final be3 G;
    public uy H;
    public long I;

    public vy() {
        super(6);
        this.F = new cj0(1, 0);
        this.G = new be3();
    }

    @Override // defpackage.kq
    public final void A(long r6, long r8) {
    L3:
        if (l() == true) goto L29;
        if (this.I >= (100000 + r6)) goto L43;
        cj0 r9 = this.F;
        r9.r();
        gp3 r10 = this.p;
        r10.d();
        int r0 = 0;
        if (z(r10, r9, 0) != (-4)) goto L44;
        if (r9.d(4) == true) goto L45;
        long r1 = r9.t;
        this.I = r1;
        if (r1 >= this.y) goto L14;
        boolean r2 = true;
    L16:
        if (this.H == null) goto L3;
        if (r2 == true) goto L3;
        r9.u();
        ByteBuffer r11 = r9.r;
        String r3 = f35.a;
        if (r11.remaining() == 16) goto L22;
        float[] r12 = null;
    L26:
        if (r12 == null) goto L3;
        this.H.a(this.I - this.x, r12);
        goto L3
    L22:
        byte[] r4 = r11.array();
        int r5 = r11.limit();
        be3 r7 = this.G;
        r7.L(r5, r4);
        r7.N(r11.arrayOffset() + 4);
        float[] r13 = new float[3];
    L23:
        if (r0 >= 3) goto L25;
        r13[r0] = Float.intBitsToFloat(r7.o());
        r0 = r0 + 1;
        goto L23
    L25:
        r12 = r13;
        goto L26
    L14:
        r2 = false;
        goto L16
    L45:
        return;
    L44:
        return;
    L43:
        return;
    }

    @Override // defpackage.kq
    public final int E(tb1 r1) {
        if ("application/x-camera-motion".equals(r1.n) == false) goto L7;
        return kq.a(4, 0, 0, 0);
    L7:
        return kq.a(0, 0, 0, 0);
    }

    @Override // defpackage.kq, defpackage.rk3
    public final void c(int r2, Object r3) {
        if (r2 != 8) goto L6;
        this.H = (uy) r3;
        return;
    }

    @Override // defpackage.kq
    public final String h() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.kq
    public final boolean m() {
        return l();
    }

    @Override // defpackage.kq
    public final boolean o() {
        return true;
    }

    @Override // defpackage.kq
    public final void p() {
        uy r0 = this.H;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }

    @Override // defpackage.kq
    public final void r(long r1, boolean r3, boolean r4) {
        this.I = Long.MIN_VALUE;
        uy r0 = this.H;
        if (r0 == null) goto L6;
        r0.b();
        return;
    }
}
