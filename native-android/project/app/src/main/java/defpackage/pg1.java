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

    public pg1(rg1 rg1Var, long j, boolean z, boolean z2, zg5 zg5Var) {
        this.g = rg1Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        x03 x03Var = w54.a;
        this.e = new x03();
        this.f = new zd3(mf3.q, rv2.A);
    }

    @Override // defpackage.u80
    public final void a(z80 z80Var, wf1 wf1Var) {
        this.g.b.a(z80Var, wf1Var);
    }

    @Override // defpackage.u80
    public final x03 b(z80 z80Var, md4 md4Var, wf1 wf1Var) {
        return this.g.b.b(z80Var, md4Var, wf1Var);
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
    public final void l(z80 z80Var) {
        rg1 rg1Var = this.g;
        rg1Var.b.l(rg1Var.h);
        rg1Var.b.l(z80Var);
    }

    @Override // defpackage.u80
    public final iy2 m(jy2 jy2Var) {
        return this.g.b.m(jy2Var);
    }

    @Override // defpackage.u80
    public final x03 n(z80 z80Var, md4 md4Var, x03 x03Var) {
        return this.g.b.n(z80Var, md4Var, x03Var);
    }

    @Override // defpackage.u80
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.u80
    public final void p(rg1 rg1Var) {
        this.e.a(rg1Var);
    }

    @Override // defpackage.u80
    public final void q(lv3 lv3Var) {
        this.g.b.q(lv3Var);
    }

    @Override // defpackage.u80
    public final void r(z80 z80Var) {
        this.g.b.r(z80Var);
    }

    @Override // defpackage.u80
    public final ez s(wc wcVar) {
        return this.g.b.s(wcVar);
    }

    @Override // defpackage.u80
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.u80
    public final void u(rg1 rg1Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                rg1Var.getClass();
                set.remove(rg1Var.t());
            }
        }
        if (rg1Var != null) {
            this.e.l(rg1Var);
        }
    }

    @Override // defpackage.u80
    public final void v(z80 z80Var) {
        this.g.b.v(z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    public final void w() {
        x03 x03Var = this.e;
        if (x03Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = x03Var.b;
                long[] jArr = x03Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    rg1 rg1Var = (rg1) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(rg1Var.t());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            x03Var.b();
        }
    }
}
