package defpackage;

import java.util.Collections;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class dl1 implements mz0 {
    public final jv3 a;
    public String b;
    public wv4 c;
    public cl1 d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final n41 g = new n41(32);
    public final n41 h = new n41(33);
    public final n41 i = new n41(34);
    public final n41 j = new n41(39);
    public final n41 k = new n41(40);
    public long m = -9223372036854775807L;
    public final be3 n = new be3();

    public dl1(jv3 jv3Var) {
        this.a = jv3Var;
    }

    @Override // defpackage.mz0
    public final void a(be3 be3Var) {
        int i;
        this.c.getClass();
        String str = f35.a;
        while (be3Var.a() > 0) {
            int i2 = be3Var.b;
            int i3 = be3Var.c;
            byte[] bArr = be3Var.a;
            this.l += be3Var.a();
            this.c.e(be3Var.a(), be3Var);
            while (i2 < i3) {
                int o = uc5.o(bArr, i2, i3, this.f);
                if (o == i3) {
                    g(bArr, i2, i3);
                    return;
                }
                int i4 = (bArr[o + 3] & 126) >> 1;
                if (o <= 0 || bArr[o - 1] != 0) {
                    i = 3;
                } else {
                    o--;
                    i = 4;
                }
                int i5 = o;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    g(bArr, i2, i5);
                }
                int i8 = i3 - i5;
                long j = this.l - i8;
                b(i8, i7 < 0 ? -i7 : 0, j, this.m);
                h(i8, i4, j, this.m);
                i2 = i5 + i6;
            }
        }
    }

    public final void b(int i, int i2, long j, long j2) {
        c6 c6Var = (c6) this.a.p;
        cl1 cl1Var = this.d;
        boolean z = this.e;
        if (cl1Var.j && cl1Var.g) {
            cl1Var.m = cl1Var.c;
            cl1Var.j = false;
        } else if (cl1Var.h || cl1Var.g) {
            if (z && cl1Var.i) {
                cl1Var.a(i + ((int) (j - cl1Var.b)));
            }
            cl1Var.k = cl1Var.b;
            cl1Var.l = cl1Var.e;
            cl1Var.m = cl1Var.c;
            cl1Var.i = true;
        }
        if (!this.e) {
            n41 n41Var = this.g;
            n41Var.d(i2);
            n41 n41Var2 = this.h;
            n41Var2.d(i2);
            n41 n41Var3 = this.i;
            n41Var3.d(i2);
            if (n41Var.e && n41Var2.e && n41Var3.e) {
                String str = this.b;
                int i3 = n41Var.c;
                byte[] bArr = new byte[n41Var2.c + i3 + n41Var3.c];
                System.arraycopy((byte[]) n41Var.f, 0, bArr, 0, i3);
                System.arraycopy((byte[]) n41Var2.f, 0, bArr, n41Var.c, n41Var2.c);
                System.arraycopy((byte[]) n41Var3.f, 0, bArr, n41Var.c + n41Var2.c, n41Var3.c);
                r13 I = uc5.I((byte[]) n41Var2.f, 3, n41Var2.c, null);
                p13 p13Var = I.b;
                String a = p13Var != null ? i40.a(p13Var.a, p13Var.b, p13Var.c, p13Var.d, p13Var.e, p13Var.f) : null;
                sb1 sb1Var = new sb1();
                sb1Var.a = str;
                sb1Var.l = lw2.m("video/mp2t");
                sb1Var.m = lw2.m("video/hevc");
                sb1Var.j = a;
                sb1Var.t = I.e;
                sb1Var.u = I.f;
                sb1Var.v = I.g;
                sb1Var.w = I.h;
                sb1Var.C = new c50(I.k, I.l, I.m, null, I.c + 8, I.d + 8);
                sb1Var.z = I.i;
                sb1Var.o = I.j;
                sb1Var.D = I.a + 1;
                sb1Var.p = Collections.singletonList(bArr);
                tb1 tb1Var = new tb1(sb1Var);
                this.c.g(tb1Var);
                int i4 = tb1Var.p;
                rr2.w(i4 != -1);
                c6Var.x(i4);
                this.e = true;
            }
        }
        n41 n41Var4 = this.j;
        boolean d = n41Var4.d(i2);
        be3 be3Var = this.n;
        if (d) {
            be3Var.L(uc5.b0(n41Var4.c, (byte[]) n41Var4.f), (byte[]) n41Var4.f);
            be3Var.O(5);
            c6Var.a(j2, be3Var);
        }
        n41 n41Var5 = this.k;
        if (n41Var5.d(i2)) {
            be3Var.L(uc5.b0(n41Var5.c, (byte[]) n41Var5.f), (byte[]) n41Var5.f);
            be3Var.O(5);
            c6Var.a(j2, be3Var);
        }
    }

    @Override // defpackage.mz0
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        uc5.i(this.f);
        this.g.f();
        this.h.f();
        this.i.f();
        this.j.f();
        this.k.f();
        ((c6) this.a.p).j(0);
        cl1 cl1Var = this.d;
        if (cl1Var != null) {
            cl1Var.f = false;
            cl1Var.g = false;
            cl1Var.h = false;
            cl1Var.i = false;
            cl1Var.j = false;
        }
    }

    @Override // defpackage.mz0
    public final void d(boolean z) {
        this.c.getClass();
        String str = f35.a;
        if (z) {
            ((c6) this.a.p).j(0);
            b(0, 0, this.l, this.m);
            h(0, 48, this.l, this.m);
        }
    }

    @Override // defpackage.mz0
    public final void e(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.mz0
    public final void f(m51 m51Var, sy4 sy4Var) {
        sy4Var.a();
        sy4Var.b();
        this.b = sy4Var.e;
        sy4Var.b();
        wv4 t = m51Var.t(sy4Var.d, 2);
        this.c = t;
        this.d = new cl1(t);
        this.a.a(m51Var, sy4Var);
    }

    public final void g(byte[] bArr, int i, int i2) {
        cl1 cl1Var = this.d;
        if (cl1Var.f) {
            int i3 = cl1Var.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                cl1Var.g = (bArr[i4] & 128) != 0;
                cl1Var.f = false;
            } else {
                cl1Var.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void h(int i, int i2, long j, long j2) {
        cl1 cl1Var = this.d;
        boolean z = this.e;
        cl1Var.g = false;
        cl1Var.h = false;
        cl1Var.e = j2;
        cl1Var.d = 0;
        cl1Var.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (cl1Var.i && !cl1Var.j) {
                if (z) {
                    cl1Var.a(i);
                }
                cl1Var.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                cl1Var.h = !cl1Var.j;
                cl1Var.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        cl1Var.c = z2;
        cl1Var.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.g(i2);
            this.h.g(i2);
            this.i.g(i2);
        }
        this.j.g(i2);
        this.k.g(i2);
    }
}
