package defpackage;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n80 implements st2, tw0 {
    public final Object n;
    public ue1 o;
    public sw0 p;
    public final /* synthetic */ p80 q;

    public n80(p80 r6, Object r7) {
        this.q = r6;
        int r3 = 0;
        Object r4 = null;
        this.o = new ue1((CopyOnWriteArrayList) r6.c.q, r3, r4, 8);
        this.p = new sw0(r6.d.c, 0, null);
        this.n = r7;
    }

    @Override // defpackage.tw0
    public final void D(int r1, mt2 r2, tv1 r3) {
        if (a(r1, r2) == false) goto L6;
        this.p.a(r3);
        return;
    }

    @Override // defpackage.tw0
    public final void M(int r1, mt2 r2) {
        if (a(r1, r2) == false) goto L6;
        this.p.e();
        return;
    }

    @Override // defpackage.st2
    public final void U(int r1, mt2 r2, ed2 r3, un2 r4, int r5) {
        if (a(r1, r2) == false) goto L6;
        ue1 r6 = this.o;
        un2 r0 = b(r4, r2);
        r6.getClass();
        r6.i(new ot2(r6, r3, r0, r5));
        return;
    }

    public final boolean a(int r5, mt2 r6) {
        Object r0 = this.n;
        p80 r1 = this.q;
        if (r6 == null) goto L8;
        mt2 r7 = r1.t(r0, r6);
        if (r7 != null) goto L9;
        return false;
    L9:
        int r8 = r1.v(r5, r0);
        ue1 r2 = this.o;
        if (r2.o == r8) goto L12;
    L13:
        this.o = new ue1((CopyOnWriteArrayList) r1.c.q, r8, r7, 8);
    L14:
        sw0 r3 = this.p;
        if (r3.a == r8) goto L17;
    L18:
        this.p = new sw0(r1.d.c, r8, r7);
        return true;
    L17:
        if (Objects.equals(r3.b, r7) == false) goto L18;
        return true;
    L12:
        if (Objects.equals((mt2) r2.p, r7) == true) goto L14;
    L8:
        r7 = null;
        goto L9
    }

    public final un2 b(un2 r13, mt2 r14) {
        long r0 = r13.f;
        p80 r15 = this.q;
        Object r12 = this.n;
        long r8 = r15.u(r0, r12);
        long r2 = r13.g;
        long r10 = r15.u(r2, r12);
        if (r8 != r0) goto L8;
        if (r10 != r2) goto L8;
        return r13;
    L8:
        return new un2(r13.a, r13.b, r13.c, r13.d, r13.e, r8, r10);
    }

    @Override // defpackage.tw0
    public final void c(int r1, mt2 r2, Exception r3) {
        if (a(r1, r2) == false) goto L6;
        this.p.d(r3);
        return;
    }

    @Override // defpackage.st2
    public final void l(int r1, mt2 r2, un2 r3) {
        if (a(r1, r2) == false) goto L6;
        ue1 r4 = this.o;
        un2 r0 = b(r3, r2);
        r4.getClass();
        r4.i(new bt2(r4, r0));
        return;
    }

    @Override // defpackage.st2
    public final void m(int r2, mt2 r3, un2 r4) {
        if (a(r2, r3) == false) goto L6;
        ue1 r5 = this.o;
        un2 r1 = b(r4, r3);
        mt2 r6 = (mt2) r5.p;
        r6.getClass();
        r5.i(new eg0(r5, r6, r1, 10));
        return;
    }

    @Override // defpackage.tw0
    public final void p(int r1, mt2 r2, int r3) {
        if (a(r1, r2) == false) goto L6;
        this.p.c(r3);
        return;
    }

    @Override // defpackage.st2
    public final void u(int r1, mt2 r2, ed2 r3, un2 r4) {
        if (a(r1, r2) == false) goto L6;
        ue1 r5 = this.o;
        un2 r0 = b(r4, r2);
        r5.getClass();
        r5.i(new pt2(r5, r3, r0, 1));
        return;
    }

    @Override // defpackage.st2
    public final void w(int r1, mt2 r2, ed2 r3, un2 r4) {
        if (a(r1, r2) == false) goto L6;
        ue1 r5 = this.o;
        un2 r0 = b(r4, r2);
        r5.getClass();
        r5.i(new pt2(r5, r3, r0, 0));
        return;
    }

    @Override // defpackage.st2
    public final void y(int r7, mt2 r8, ed2 r9, un2 r10, IOException r11, boolean r12) {
        if (a(r7, r8) == false) goto L6;
        ue1 r1 = this.o;
        un2 r3 = b(r10, r8);
        r1.getClass();
        r1.i(new qt2(r1, r9, r3, r11, r12));
        return;
    }

    @Override // defpackage.tw0
    public final void z(int r1, mt2 r2) {
        if (a(r1, r2) == false) goto L6;
        this.p.b();
        return;
    }
}
