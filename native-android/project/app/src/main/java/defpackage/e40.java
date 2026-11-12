package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e40 extends be5 {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final ArrayList r;
    public final bu4 s;
    public d40 t;
    public ClippingMediaSource$IllegalClippingException u;
    public long v;
    public long w;

    public e40(c40 r3) {
        super(r3.a);
        this.l = r3.b;
        this.m = r3.c;
        this.n = r3.d;
        this.o = r3.e;
        this.p = r3.f;
        this.q = r3.g;
        this.r = new ArrayList();
        this.s = new bu4();
    }

    @Override // defpackage.be5
    public final void A(cu4 r2) {
        if (this.u == null) goto L5;
        return;
    L5:
        D(r2);
    }

    public final void D(cu4 r17) {
        bu4 r0 = this.s;
        r17.n(0, r0);
        long r5 = r0.o;
        d40 r3 = this.t;
        long r7 = this.m;
        long r9 = Long.MIN_VALUE;
        ArrayList r11 = this.r;
        if (r3 != null) goto L5;
    L15:
        boolean r4 = this.p;
        long r12 = this.l;
        if (r4 == false) goto L18;
        long r14 = r0.k;
        r12 = r12 + r14;
        long r15 = r14 + r7;
    L19:
        this.v = r5 + r12;
        if (r7 == Long.MIN_VALUE) goto L23;
        r9 = r5 + r15;
    L23:
        this.w = r9;
        int r1 = r11.size();
        int r2 = 0;
    L24:
        if (r2 >= r1) goto L26;
        b40 r6 = (b40) r11.get(r2);
        long r8 = this.v;
        long r10 = this.w;
        r6.s = r8;
        r6.t = r10;
        r2 = r2 + 1;
        goto L24
    L26:
        long r13 = r15;
    L14:
        long r16 = r12;
        d40 r18 = new d40(r17, r16, r13, this.q);     // Catch: ClippingMediaSource$IllegalClippingException -> L30
        this.t = r18;     // Catch: ClippingMediaSource$IllegalClippingException -> L30
        m(r18);
        return;
    L30:
        e = move-exception;
        this.u = e;
        int r19 = 0;
    L33:
        if (r19 >= r11.size()) goto L35;
        b40 r20 = (b40) r11.get(r19);
        r20.u = this.u;
        r19 = r19 + 1;
        goto L33
    L35:
        return;
    L18:
        r15 = r7;
        goto L19
    L5:
        if (r11.isEmpty() == true) goto L15;
        if (this.o == true) goto L15;
        r12 = this.v - r5;
        if (r7 == Long.MIN_VALUE) goto L13;
        r9 = this.w - r5;
    L13:
        r13 = r9;
        goto L14
    }

    @Override // defpackage.be5, defpackage.bq
    public final boolean a(gn2 r3) {
        bq r2 = this.k;
        if (r2.h().e.equals(r3.e) == true) goto L5;
        return false;
    L5:
        if (r2.a(r3) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.be5, defpackage.bq
    public final no2 b(mt2 r8, n9 r9, long r10) {
        no2 r1 = this.k.b(r8, r9, r10);
        long r3 = this.v;
        long r5 = this.w;
        b40 r0 = new b40(r1, this.n, r3, r5);
        this.r.add(r0);
        return r0;
    }

    @Override // defpackage.p80, defpackage.bq
    public final void j() {
        ClippingMediaSource$IllegalClippingException r0 = this.u;
        if (r0 != null) goto L6;
        super.j();
        return;
    L6:
        throw r0;
    }

    @Override // defpackage.be5, defpackage.bq
    public final void n(no2 r3) {
        ArrayList r0 = this.r;
        rr2.w(r0.remove(r3));
        no2 r4 = ((b40) r3).n;
        this.k.n(r4);
        if (r0.isEmpty() == true) goto L5;
        return;
    L5:
        if (this.o == true) goto L9;
        d40 r5 = this.t;
        r5.getClass();
        D(r5.e);
        return;
    }

    @Override // defpackage.p80, defpackage.bq
    public final void p() {
        super.p();
        this.u = null;
        this.t = null;
    }
}
