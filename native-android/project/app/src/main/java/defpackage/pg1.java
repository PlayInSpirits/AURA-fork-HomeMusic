package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pg1 extends u80 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final x03 e;
    public final zd3 f;
    public final /* synthetic */ rg1 g;

    public pg1(rg1 r1, long r2, boolean r4, boolean r5, zg5 r6) {
        this.g = r1;
        this.a = r2;
        this.b = r4;
        this.c = r5;
        x03 r3 = w54.a;
        this.e = new x03();
        this.f = new zd3(mf3.q, rv2.A);
    }

    @Override // defpackage.u80
    public final void a(z80 r1, wf1 r2) {
        this.g.b.a(r1, r2);
    }

    @Override // defpackage.u80
    public final x03 b(z80 r1, md4 r2, wf1 r3) {
        return this.g.b.b(r1, r2, r3);
    }

    @Override // defpackage.u80
    public final void c() {
        this.g.A--;
    }

    @Override // defpackage.u80
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.u80
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.u80
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.u80
    public final long g() {
        return this.a;
    }

    @Override // defpackage.u80
    public final t80 h() {
        return this.g.h;
    }

    @Override // defpackage.u80
    public final mf3 i() {
        return (mf3) this.f.getValue();
    }

    @Override // defpackage.u80
    public final ne0 j() {
        return this.g.b.j();
    }

    @Override // defpackage.u80
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.u80
    public final void l(z80 r3) {
        rg1 r2 = this.g;
        r2.b.l(r2.h);
        r2.b.l(r3);
    }

    @Override // defpackage.u80
    public final iy2 m(jy2 r1) {
        return this.g.b.m(r1);
    }

    @Override // defpackage.u80
    public final x03 n(z80 r1, md4 r2, x03 r3) {
        return this.g.b.n(r1, r2, r3);
    }

    @Override // defpackage.u80
    public final void o(Set r2) {
        HashSet r0 = this.d;
        if (r0 != null) goto L5;
        r0 = new HashSet();
        this.d = r0;
    L5:
        r0.add(r2);
    }

    @Override // defpackage.u80
    public final void p(rg1 r1) {
        this.e.a(r1);
    }

    @Override // defpackage.u80
    public final void q(lv3 r1) {
        this.g.b.q(r1);
    }

    @Override // defpackage.u80
    public final void r(z80 r1) {
        this.g.b.r(r1);
    }

    @Override // defpackage.u80
    public final ez s(wc r1) {
        return this.g.b.s(r1);
    }

    @Override // defpackage.u80
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.u80
    public final void u(rg1 r4) {
        HashSet r0 = this.d;
        if (r0 == null) goto L8;
        Iterator r1 = r0.iterator();
    L6:
        if (r1.hasNext() == false) goto L8;
        Set r2 = (Set) r1.next();
        r4.getClass();
        r2.remove(r4.t());
    L8:
        if (r4 == null) goto L12;
        this.e.l(r4);
        return;
    }

    @Override // defpackage.u80
    public final void v(z80 r1) {
        this.g.b.v(r1);
    }

    public final void w() {
        x03 r0 = this.e;
        if (r0.h() == false) goto L30;
        HashSet r15 = this.d;
        if (r15 == null) goto L23;
        Object[] r1 = r0.b;
        long[] r2 = r0.a;
        int r3 = r2.length - 2;
        if (r3 < 0) goto L23;
        int r5 = 0;
    L9:
        long r6 = r2[r5];
        if (((((~r6) << 7) & r6) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L21;
        int r8 = 8 - ((~(r5 - r3)) >>> 31);
        int r10 = 0;
    L12:
        if (r10 >= r8) goto L20;
        if ((255 & r6) >= 128) goto L19;
        rg1 r11 = (rg1) r1[(r5 << 3) + r10];
        Iterator r12 = r15.iterator();
    L17:
        if (r12.hasNext() == false) goto L19;
        ((Set) r12.next()).remove(r11.t());
    L19:
        r6 = r6 >> 8;
        r10 = r10 + 1;
        goto L12
    L20:
        if (r8 != 8) goto L23;
    L21:
        if (r5 == r3) goto L23;
        r5 = r5 + 1;
    L23:
        r0.b();
        return;
    }
}
