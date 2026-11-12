package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kr3 extends bq {
    public final bi0 h;
    public final ss2 i;
    public final ww0 j;
    public final i80 k;
    public final int l;
    public final tb1 m;
    public boolean n;
    public long o;
    public boolean p;
    public boolean q;
    public boolean r;
    public rw4 s;
    public gn2 t;

    public kr3(gn2 r1, bi0 r2, ss2 r3, ww0 r4, i80 r5, int r6, tb1 r7) {
        this.t = r1;
        this.h = r2;
        this.i = r3;
        this.j = r4;
        this.k = r5;
        this.l = r6;
        this.m = r7;
        this.n = true;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.bq
    public final boolean a(gn2 r5) {
        bn2 r4 = h().b;
        r4.getClass();
        bn2 r6 = r5.b;
        if (r6 != null) goto L5;
        return false;
    L5:
        if (r6.a.equals(r4.a) == true) goto L7;
        return false;
    L7:
        if (r6.h == r4.h) goto L9;
        return false;
    L9:
        if (Objects.equals(r6.f, r4.f) == false) goto L16;
        return true;
    L16:
        return false;
    }

    @Override // defpackage.bq
    public final no2 b(mt2 r17, n9 r18, long r19) {
        ci0 r2 = this.h.m();
        rw4 r1 = this.s;
        if (r1 == null) goto L5;
        r2.c(r1);
    L5:
        bn2 r3 = h().b;
        r3.getClass();
        Uri r4 = r3.a;
        this.g.getClass();
        z05 r5 = new z05((n51) this.i.o);
        sw0 r6 = new sw0(this.d.c, 0, r17);
        CopyOnWriteArrayList r10 = (CopyOnWriteArrayList) this.c.q;
        ue1 r7 = new ue1(r10, 0, r17, 8);
        String r11 = r3.f;
        long r13 = f35.Q(r3.h);
        return new hr3(r4, r2, r5, this.j, r6, this.k, r7, this, r18, r11, this.l, this.m, r13, null);
    }

    @Override // defpackage.bq
    public final synchronized gn2 h() {
        monitor-enter(this);
        gn2 r0 = this.t;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.bq
    public final void j() {
    }

    @Override // defpackage.bq
    public final void l(rw4 r3) {
        this.s = r3;
        Looper r4 = Looper.myLooper();
        r4.getClass();
        ik3 r0 = this.g;
        r0.getClass();
        ww0 r1 = this.j;
        r1.e(r4, r0);
        r1.b();
        t();
    }

    @Override // defpackage.bq
    public final void n(no2 r7) {
        hr3 r8 = (hr3) r7;
        if (r8.L == false) goto L10;
        p44[] r6 = r8.I;
        int r1 = r6.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L10;
        p44 r3 = r6[r2];
        r3.j();
        pw0 r4 = r3.h;
        if (r4 == null) goto L9;
        r4.d(r3.e);
        r3.h = null;
        r3.g = null;
    L9:
        r2 = r2 + 1;
    L10:
        r8.z.p(r8);
        r8.E.removeCallbacksAndMessages(null);
        r8.F = null;
        r8.d0 = true;
    }

    @Override // defpackage.bq
    public final void p() {
        this.j.a();
    }

    @Override // defpackage.bq
    public final synchronized void s(gn2 r1) {
        monitor-enter(this);
        this.t = r1;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final void t() {
        long r6 = this.o;
        boolean r14 = this.p;
        boolean r2 = this.q;
        gn2 r3 = h();
        if (r2 == false) goto L6;
        an2 r4 = r3.c;
    L7:
        cu4 r1 = new bf4(-9223372036854775807L, -9223372036854775807L, r6, r6, 0, 0, r14, false, false, null, r3, r4);
        if (this.n == false) goto L10;
        r1 = new ir3(r1);
    L10:
        m(r1);
        return;
    L6:
        r4 = null;
        goto L7
    }

    public final void u(long r3, m84 r5, boolean r6) {
        if (this.r == true) goto L5;
    L7:
        this.r = !r5.d();
        if (r3 != (-9223372036854775807L)) goto L10;
        r3 = this.o;
    L10:
        boolean r7 = r5.b();
        if (this.n == false) goto L13;
    L19:
        this.o = r3;
        this.p = r7;
        this.q = r6;
        this.n = false;
        t();
        return;
    L13:
        if (this.o != r3) goto L19;
        if (this.p != r7) goto L19;
        if (this.q != r6) goto L19;
        return;
    L5:
        if (r5.d() == false) goto L7;
    }
}
