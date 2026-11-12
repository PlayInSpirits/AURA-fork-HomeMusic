package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class kx4 extends dx4 {
    public ArrayList K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;

    public kx4() {
        this.K = new ArrayList();
        this.L = true;
        this.N = false;
        this.O = 0;
    }

    @Override // defpackage.dx4
    public final void A(xi4 r3) {
        super.A(r3);
        this.O |= 4;
        if (this.K == null) goto L8;
        int r0 = 0;
    L6:
        if (r0 >= this.K.size()) goto L10;
        ((dx4) this.K.get(r0)).A(r3);
        r0 = r0 + 1;
        goto L6
    L10:
        return;
    }

    @Override // defpackage.dx4
    public final void B(cx r4) {
        this.F = r4;
        this.O |= 2;
        int r0 = this.K.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((dx4) this.K.get(r1)).B(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.dx4
    public final void C(long r1) {
        this.o = r1;
    }

    @Override // defpackage.dx4
    public final String E(String r5) {
        String r0 = super.E(r5);
        int r1 = 0;
    L4:
        if (r1 >= this.K.size()) goto L6;
        StringBuilder r2 = b11.s(r0, "\n");
        r2.append(((dx4) this.K.get(r1)).E(r5.concat("  ")));
        r0 = r2.toString();
        r1 = r1 + 1;
        goto L4
    L6:
        return r0;
    }

    public final void F(dx4 r5) {
        this.K.add(r5);
        r5.v = this;
        long r0 = this.p;
        if (r0 < 0) goto L6;
        r5.x(r0);
    L6:
        if ((this.O & 1) == 0) goto L9;
        r5.z(this.q);
    L9:
        if ((this.O & 2) == 0) goto L12;
        r5.B(this.F);
    L12:
        if ((this.O & 4) == 0) goto L15;
        r5.A(this.G);
    L15:
        if ((this.O & 8) == 0) goto L18;
        r5.y(null);
        return;
    }

    public final void G(long r4) {
        this.p = r4;
        if (r4 < 0) goto L9;
        ArrayList r0 = this.K;
        if (r0 == null) goto L11;
        int r1 = r0.size();
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L12;
        ((dx4) this.K.get(r2)).x(r4);
        r2 = r2 + 1;
        goto L7
    L12:
        return;
    L11:
        return;
    }

    public final void H(TimeInterpolator r4) {
        this.O |= 1;
        ArrayList r0 = this.K;
        if (r0 == null) goto L7;
        int r1 = r0.size();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L7;
        ((dx4) this.K.get(r2)).z(r4);
        r2 = r2 + 1;
    L7:
        this.q = r4;
    }

    public final void I(int r2) {
        if (r2 == 0) goto L9;
        if (r2 != 1) goto L8;
        this.L = false;
        return;
    L8:
        throw new AndroidRuntimeException(f34.f(r2, "Invalid parameter for TransitionSet ordering: "));
    L9:
        this.L = true;
    }

    @Override // defpackage.dx4
    public final void c(mx4 r6) {
        View r0 = r6.b;
        if (r(r0) == false) goto L9;
        ArrayList r5 = this.K;
        int r1 = r5.size();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L15;
        Object r3 = r5.get(r2);
        r2 = r2 + 1;
        dx4 r4 = (dx4) r3;
        if (r4.r(r0) == false) goto L5;
        r4.c(r6);
        r6.c.add(r4);
        goto L5
    L15:
        return;
    }

    @Override // defpackage.dx4
    public final void cancel() {
        super.cancel();
        int r0 = this.K.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((dx4) this.K.get(r1)).cancel();
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.dx4
    public final /* bridge */ /* synthetic */ Object clone() {
        return i();
    }

    @Override // defpackage.dx4
    public final void e(mx4 r4) {
        super.e(r4);
        int r0 = this.K.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((dx4) this.K.get(r1)).e(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.dx4
    public final void f(mx4 r6) {
        View r0 = r6.b;
        if (r(r0) == false) goto L9;
        ArrayList r5 = this.K;
        int r1 = r5.size();
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L15;
        Object r3 = r5.get(r2);
        r2 = r2 + 1;
        dx4 r4 = (dx4) r3;
        if (r4.r(r0) == false) goto L5;
        r4.f(r6);
        r6.c.add(r4);
        goto L5
    L15:
        return;
    }

    @Override // defpackage.dx4
    public final dx4 i() {
        kx4 r0 = (kx4) super.i();
        r0.K = new ArrayList();
        int r1 = this.K.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        dx4 r3 = ((dx4) this.K.get(r2)).i();
        r0.K.add(r3);
        r3.v = r0;
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    @Override // defpackage.dx4
    public final void k(ViewGroup r12, bq4 r13, bq4 r14, ArrayList r15, ArrayList r16) {
        long r0 = this.o;
        int r2 = this.K.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L16;
        dx4 r5 = (dx4) this.K.get(r3);
        if (r0 <= 0) goto L15;
        if (this.L == true) goto L11;
        if (r3 != 0) goto L15;
    L11:
        long r8 = r5.o;
        if (r8 <= 0) goto L14;
        r5.C(r8 + r0);
        goto L15
    L14:
        r5.C(r0);
    L15:
        r5.k(r12, r13, r14, r15, r16);
        r3 = r3 + 1;
        goto L3
    }

    @Override // defpackage.dx4
    public final void t(View r4) {
        super.t(r4);
        int r0 = this.K.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((dx4) this.K.get(r1)).t(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.dx4
    public final void v(View r4) {
        super.v(r4);
        int r0 = this.K.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((dx4) this.K.get(r1)).v(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.dx4
    public final void w() {
        if (this.K.isEmpty() == false) goto L6;
        D();
        l();
        return;
    L6:
        t51 r0 = new t51();
        r0.b = this;
        ArrayList r1 = this.K;
        int r2 = r1.size();
        int r3 = 0;
        int r4 = 0;
    L7:
        if (r4 >= r2) goto L9;
        Object r5 = r1.get(r4);
        r4 = r4 + 1;
        ((dx4) r5).a(r0);
        goto L7
    L9:
        this.M = this.K.size();
        if (this.L == true) goto L19;
        int r6 = 1;
        int r7 = 1;
    L12:
        int r8 = this.K.size();
        ArrayList r9 = this.K;
        if (r7 >= r8) goto L15;
        ((dx4) r9.get(r7 - 1)).a(new t51(r6, (dx4) this.K.get(r7)));
        r7 = r7 + 1;
        goto L12
    L15:
        dx4 r10 = (dx4) r9.get(0);
        if (r10 == null) goto L22;
        r10.w();
        return;
    L22:
        return;
    L19:
        ArrayList r11 = this.K;
        int r12 = r11.size();
    L20:
        if (r3 >= r12) goto L26;
        Object r13 = r11.get(r3);
        r3 = r3 + 1;
        ((dx4) r13).w();
        goto L20
    }

    @Override // defpackage.dx4
    public final /* bridge */ /* synthetic */ void x(long r1) {
        G(r1);
    }

    @Override // defpackage.dx4
    public final void y(hw r4) {
        this.O |= 8;
        int r0 = this.K.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((dx4) this.K.get(r1)).y(r4);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.dx4
    public final /* bridge */ /* synthetic */ void z(TimeInterpolator r1) {
        H(r1);
    }
}
