package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yv2 extends kq implements Handler.Callback {
    public final rv2 F;
    public final xv2 G;
    public final Handler H;
    public final uv2 I;
    public zz1 J;
    public boolean K;
    public boolean L;
    public long M;
    public qv2 N;
    public long O;

    public yv2(xv2 r3, Looper r4) {
        rv2 r0 = rv2.o;
        super(5);
        this.G = r3;
        if (r4 != null) goto L5;
        Handler r5 = null;
    L6:
        this.H = r5;
        this.F = r0;
        this.I = new uv2(1, 0);
        this.O = -9223372036854775807L;
        return;
    L5:
        String r6 = f35.a;
        r5 = new Handler(r4, this);
        goto L6
    }

    @Override // defpackage.kq
    public final void A(long r6, long r8) {
        boolean r9 = true;
    L3:
        if (r9 == false) goto L38;
        if (this.K == false) goto L7;
    L23:
        qv2 r10 = this.N;
        if (r10 != null) goto L26;
    L32:
        r9 = false;
    L34:
        if (this.K == false) goto L3;
        if (this.N != null) goto L3;
        this.L = true;
        goto L3
    L26:
        if (r10.b > I(r6)) goto L32;
        qv2 r11 = this.N;
        Handler r0 = this.H;
        if (r0 == null) goto L30;
        r0.obtainMessage(1, r11).sendToTarget();
    L31:
        this.N = null;
        r9 = true;
        goto L34
    L30:
        this.G.h(r11);
        goto L31
    L7:
        if (this.N != null) goto L23;
        uv2 r12 = this.I;
        r12.r();
        gp3 r1 = this.p;
        r1.d();
        int r2 = z(r1, r12, 0);
        if (r2 != (-4)) goto L21;
        if (r12.d(4) == false) goto L14;
        this.K = true;
        goto L23
    L14:
        if (r12.t < this.y) goto L23;
        r12.x = this.M;
        r12.u();
        zz1 r3 = this.J;
        String r4 = f35.a;
        qv2 r5 = r3.j(r12);
        if (r5 == null) goto L23;
        ArrayList r7 = new ArrayList(r5.a.length);
        H(r5, r7);
        if (r7.isEmpty() == true) goto L23;
        this.N = new qv2(I(r12.t), (pv2[]) r7.toArray(new pv2[0]));
        goto L23
    L21:
        if (r2 != (-5)) goto L23;
        tb1 r13 = (tb1) r1.p;
        r13.getClass();
        this.M = r13.s;
        goto L23
    }

    @Override // defpackage.kq
    public final int E(tb1 r2) {
        if (this.F.p(r2) == false) goto L11;
        if (r2.O != 0) goto L7;
        int r1 = 4;
    L9:
        return kq.a(r1, 0, 0, 0);
    L7:
        r1 = 2;
        goto L9
    L11:
        return kq.a(0, 0, 0, 0);
    }

    public final void H(qv2 r6, ArrayList r7) {
        int r0 = 0;
    L3:
        pv2[] r1 = r6.a;
        if (r0 >= r1.length) goto L14;
        tb1 r2 = r1[r0].a();
        if (r2 == null) goto L12;
        rv2 r3 = this.F;
        if (r3.p(r2) == false) goto L12;
        zz1 r4 = r3.h(r2);
        byte[] r5 = r1[r0].c();
        r5.getClass();
        uv2 r8 = this.I;
        r8.r();
        r8.t(r5.length);
        r8.r.put(r5);
        r8.u();
        qv2 r9 = r4.j(r8);
        if (r9 == null) goto L13;
        H(r9, r7);
    L13:
        r0 = r0 + 1;
    L12:
        r7.add(r1[r0]);
        goto L13
    }

    public final long I(long r8) {
        boolean r3 = false;
        if (r8 == (-9223372036854775807L)) goto L5;
        boolean r2 = true;
    L6:
        rr2.w(r2);
        if (this.O == (-9223372036854775807L)) goto L9;
        r3 = true;
    L9:
        rr2.w(r3);
        return r8 - this.O;
    L5:
        r2 = false;
        goto L6
    }

    @Override // defpackage.kq
    public final String h() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r3) {
        if (r3.what != 1) goto L6;
        qv2 r4 = (qv2) r3.obj;
        this.G.h(r4);
        return true;
    L6:
        tb4.a();
        return false;
    }

    @Override // defpackage.kq
    public final boolean m() {
        return this.L;
    }

    @Override // defpackage.kq
    public final boolean o() {
        return true;
    }

    @Override // defpackage.kq
    public final void p() {
        this.N = null;
        this.J = null;
        this.O = -9223372036854775807L;
    }

    @Override // defpackage.kq
    public final void r(long r1, boolean r3, boolean r4) {
        this.N = null;
        this.K = false;
        this.L = false;
    }

    @Override // defpackage.kq
    public final void x(tb1[] r3, long r4, long r6, mt2 r8) {
        tb1 r5 = r3[0];
        this.J = this.F.h(r5);
        qv2 r7 = this.N;
        if (r7 == null) goto L9;
        long r9 = r7.b;
        long r0 = (this.O + r9) - r6;
        if (r9 == r0) goto L8;
        r7 = new qv2(r0, r7.a);
    L8:
        this.N = r7;
    L9:
        this.O = r6;
    }
}
