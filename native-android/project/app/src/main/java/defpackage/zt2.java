package defpackage;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zt2 implements st2, tw0 {
    public final bu2 n;
    public final /* synthetic */ fo1 o;

    public zt2(fo1 r1, bu2 r2) {
        this.o = r1;
        this.n = r2;
    }

    @Override // defpackage.tw0
    public final void D(int r3, mt2 r4, tv1 r5) {
        Pair r6 = a(r3, r4);
        if (r6 == null) goto L6;
        ((yp4) this.o.j).d(new qo2(this, r6, r5, 3));
        return;
    }

    @Override // defpackage.tw0
    public final void M(int r3, mt2 r4) {
        Pair r5 = a(r3, r4);
        if (r5 == null) goto L6;
        ((yp4) this.o.j).d(new xt2(this, r5, 0));
        return;
    }

    @Override // defpackage.st2
    public final void U(int r8, mt2 r9, ed2 r10, un2 r11, int r12) {
        Pair r2 = a(r8, r9);
        if (r2 == null) goto L6;
        ((yp4) this.o.j).d(new fm2(this, r2, r10, r11, r12, 2));
        return;
    }

    public final Pair a(int r7, mt2 r8) {
        bu2 r6 = this.n;
        mt2 r0 = null;
        if (r8 == null) goto L16;
        int r1 = 0;
    L6:
        if (r1 >= r6.c.size()) goto L11;
        if (((mt2) r6.c.get(r1)).d == r8.d) goto L9;
        r1 = r1 + 1;
        goto L6
    L9:
        Object r2 = r8.a;
        Object r3 = r6.b;
        int r4 = tm3.n;
        mt2 r9 = r8.a(Pair.create(r3, r2));
    L12:
        if (r9 != null) goto L14;
        return null;
    L14:
        r0 = r9;
        goto L16
    L11:
        r9 = null;
    L16:
        return Pair.create(Integer.valueOf(r7 + r6.d), r0);
    }

    @Override // defpackage.tw0
    public final void c(int r3, mt2 r4, Exception r5) {
        Pair r6 = a(r3, r4);
        if (r6 == null) goto L6;
        ((yp4) this.o.j).d(new qo2(this, r6, r5, 4));
        return;
    }

    @Override // defpackage.st2
    public final void l(int r3, mt2 r4, un2 r5) {
        Pair r6 = a(r3, r4);
        if (r6 == null) goto L6;
        ((yp4) this.o.j).d(new vt2(this, r6, r5, 1));
        return;
    }

    @Override // defpackage.st2
    public final void m(int r3, mt2 r4, un2 r5) {
        Pair r6 = a(r3, r4);
        if (r6 == null) goto L6;
        ((yp4) this.o.j).d(new vt2(this, r6, r5, 0));
        return;
    }

    @Override // defpackage.tw0
    public final void p(int r3, mt2 r4, int r5) {
        Pair r6 = a(r3, r4);
        if (r6 == null) goto L6;
        ((yp4) this.o.j).d(new gk(this, r6, r5, 8));
        return;
    }

    @Override // defpackage.st2
    public final void u(int r7, mt2 r8, ed2 r9, un2 r10) {
        Pair r2 = a(r7, r8);
        if (r2 == null) goto L6;
        ((yp4) this.o.j).d(new wt2(this, r2, r9, r10, 0));
        return;
    }

    @Override // defpackage.st2
    public final void w(int r7, mt2 r8, ed2 r9, un2 r10) {
        Pair r2 = a(r7, r8);
        if (r2 == null) goto L6;
        ((yp4) this.o.j).d(new wt2(this, r2, r9, r10, 1));
        return;
    }

    @Override // defpackage.st2
    public final void y(int r2, mt2 r3, final ed2 r4, final un2 r5, final IOException r6, final boolean r7) {
        final Pair r8 = a(r2, r3);
        if (r8 == null) goto L6;
        ((yp4) this.o.j).d(new yt2(this, r8, r4, r5, r6, r7));
        return;
    }

    @Override // defpackage.tw0
    public final void z(int r3, mt2 r4) {
        Pair r5 = a(r3, r4);
        if (r5 == null) goto L6;
        ((yp4) this.o.j).d(new xt2(this, r5, 1));
        return;
    }
}
