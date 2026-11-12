package defpackage;

import androidx.media3.common.ParserException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i83 implements k51 {
    public m51 a;
    public im4 b;
    public boolean c;

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0178 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0179  */
    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!g(l51Var)) {
                throw ParserException.a(null, "Failed to determine bitstream type");
            }
            l51Var.k();
        }
        if (!this.c) {
            wv4 wv4VarT = this.a.t(0, 1);
            this.a.p();
            im4 im4Var = this.b;
            im4Var.c = this.a;
            im4Var.b = wv4VarT;
            im4Var.d(true);
            this.c = true;
        }
        im4 im4Var2 = this.b;
        bl0 bl0Var = im4Var2.a;
        im4Var2.b.getClass();
        String str = f35.a;
        int i = im4Var2.h;
        if (i != 0) {
            if (i == 1) {
                l51Var.l((int) im4Var2.f);
                im4Var2.h = 2;
                return 0;
            }
            if (i != 2) {
                if (i == 3) {
                    return -1;
                }
                tb4.a();
                return 0;
            }
            long jB = im4Var2.d.b(l51Var);
            if (jB >= 0) {
                t71Var.a = jB;
                return 1;
            }
            if (jB < -1) {
                im4Var2.a(-(jB + 2));
            }
            if (!im4Var2.l) {
                m84 m84VarE = im4Var2.d.e();
                m84VarE.getClass();
                im4Var2.c.w(m84VarE);
                im4Var2.b.d(m84VarE.g());
                im4Var2.l = true;
            }
            if (im4Var2.k <= 0 && !bl0Var.b(l51Var)) {
                im4Var2.h = 3;
                return -1;
            }
            im4Var2.k = 0L;
            be3 be3Var = (be3) bl0Var.r;
            long jB2 = im4Var2.b(be3Var);
            if (jB2 >= 0) {
                long j = im4Var2.g;
                if (j + jB2 >= im4Var2.e) {
                    long j2 = (j * 1000000) / ((long) im4Var2.i);
                    im4Var2.b.e(be3Var.c, be3Var);
                    im4Var2.b.a(j2, 1, be3Var.c, 0, null);
                    im4Var2.e = -1L;
                }
            }
            im4Var2.g += jB2;
            return 0;
        }
        while (true) {
            boolean zB = bl0Var.b(l51Var);
            be3 be3Var2 = (be3) bl0Var.r;
            if (!zB) {
                im4Var2.h = 3;
                return -1;
            }
            long position = l51Var.getPosition();
            long j3 = im4Var2.f;
            im4Var2.k = position - j3;
            if (!im4Var2.c(be3Var2, j3, im4Var2.j)) {
                tb1 tb1Var = (tb1) im4Var2.j.n;
                im4Var2.i = tb1Var.G;
                if (!im4Var2.m) {
                    im4Var2.b.g(tb1Var);
                    im4Var2.m = true;
                }
                ru ruVar = (ru) im4Var2.j.o;
                if (ruVar == null) {
                    if (l51Var.getLength() == -1) {
                        im4Var2.d = new xi4(9);
                    } else {
                        k83 k83Var = (k83) bl0Var.q;
                        im4Var2.d = new fm0(im4Var2, im4Var2.f, l51Var.getLength(), k83Var.d + k83Var.e, k83Var.b, (k83Var.a & 4) != 0);
                    }
                    im4Var2.h = 2;
                    bArr = be3Var2.a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    be3Var2.L(be3Var2.c, Arrays.copyOf(bArr, Math.max(65025, be3Var2.c)));
                    return 0;
                }
                im4Var2.d = ruVar;
                im4Var2.h = 2;
                bArr = be3Var2.a;
                if (bArr.length == 65025) {
                    return 0;
                }
                be3Var2.L(be3Var2.c, Arrays.copyOf(bArr, Math.max(65025, be3Var2.c)));
                return 0;
            }
            im4Var2.f = l51Var.getPosition();
        }
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        try {
            return g(l51Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        im4 im4Var = this.b;
        if (im4Var != null) {
            bl0 bl0Var = im4Var.a;
            k83 k83Var = (k83) bl0Var.q;
            k83Var.a = 0;
            k83Var.b = 0L;
            k83Var.c = 0;
            k83Var.d = 0;
            k83Var.e = 0;
            ((be3) bl0Var.r).K(0);
            bl0Var.n = -1;
            bl0Var.p = false;
            if (j == 0) {
                im4Var.d(!im4Var.l);
                return;
            }
            if (im4Var.h != 0) {
                long j3 = (((long) im4Var.i) * j2) / 1000000;
                im4Var.e = j3;
                l83 l83Var = im4Var.d;
                String str = f35.a;
                l83Var.g(j3);
                im4Var.h = 2;
            }
        }
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.a = m51Var;
    }

    public final boolean g(l51 l51Var) {
        boolean zN;
        k83 k83Var = new k83();
        if (k83Var.a(l51Var, true) && (k83Var.a & 2) == 2) {
            int iMin = Math.min(k83Var.e, 8);
            be3 be3Var = new be3(iMin);
            l51Var.n(be3Var.a, 0, iMin);
            be3Var.N(0);
            if (be3Var.a() >= 5 && be3Var.A() == 127 && be3Var.C() == 1179402563) {
                this.b = new u71();
                return true;
            }
            be3Var.N(0);
            try {
                zN = zz1.N(1, be3Var, true);
            } catch (ParserException unused) {
                zN = false;
            }
            if (zN) {
                this.b = new s85();
            } else {
                be3Var.N(0);
                if (eb3.e(be3Var, eb3.o)) {
                    this.b = new eb3();
                }
            }
            return true;
        }
        return false;
    }
}
