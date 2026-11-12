package defpackage;

import androidx.media3.common.ParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wl1 implements k51 {
    public m51 b;
    public l51 c;
    public e20 d;
    public sy2 e;
    public int g;
    public long h;
    public int i;
    public final be3 a = new be3(16);
    public long j = -1;
    public int f = 0;

    @Override // defpackage.k51
    public final void a() {
        sy2 sy2Var = this.e;
        if (sy2Var != null) {
            sy2Var.getClass();
            this.e = null;
        }
    }

    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        while (true) {
            int i = this.f;
            if (i == 0) {
                int i2 = this.i;
                be3 be3Var = this.a;
                if (i2 == 0) {
                    if (!l51Var.a(be3Var.a, 0, 8, true)) {
                        m51 m51Var = this.b;
                        m51Var.getClass();
                        m51Var.p();
                        this.b.w(new bo(-9223372036854775807L));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    be3Var.N(0);
                    this.h = be3Var.C();
                    this.g = be3Var.m();
                }
                if (this.h == 1) {
                    l51Var.readFully(be3Var.a, 8, 8);
                    this.i += 8;
                    this.h = be3Var.G();
                }
                if (this.g == 1836086884) {
                    long position = l51Var.getPosition();
                    this.j = position;
                    long j = this.i;
                    xx2 xx2Var = new xx2(0L, position - j, -9223372036854775807L, position, this.h - j);
                    m51 m51Var2 = this.b;
                    m51Var2.getClass();
                    wv4 wv4VarT = m51Var2.t(1024, 4);
                    sb1 sb1Var = new sb1();
                    sb1Var.l = lw2.m("image/heic");
                    sb1Var.k = new qv2(xx2Var);
                    f34.l(sb1Var, wv4VarT);
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i == 1) {
                l51Var.l((int) (this.h - ((long) this.i)));
                this.i = 0;
                this.f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        tb4.a();
                        return 0;
                    }
                    if (this.d == null || l51Var != this.c) {
                        this.c = l51Var;
                        this.d = new e20(l51Var, this.j);
                    }
                    sy2 sy2Var = this.e;
                    sy2Var.getClass();
                    int iB = sy2Var.b(this.d, t71Var);
                    if (iB == 1) {
                        t71Var.a += this.j;
                    }
                    return iB;
                }
                if (this.e == null) {
                    this.e = new sy2(xn4.m, 8);
                }
                e20 e20Var = new e20(l51Var, this.j);
                this.d = e20Var;
                if (this.e.c(e20Var)) {
                    sy2 sy2Var2 = this.e;
                    long j2 = this.j;
                    m51 m51Var3 = this.b;
                    m51Var3.getClass();
                    sy2Var2.f(new e20(j2, m51Var3, 6));
                    this.f = 3;
                } else {
                    m51 m51Var4 = this.b;
                    m51Var4.getClass();
                    m51Var4.p();
                    this.b.w(new bo(-9223372036854775807L));
                    this.f = 4;
                }
            }
        }
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        return ji2.S((rk0) l51Var, true);
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                sy2 sy2Var = this.e;
                sy2Var.getClass();
                sy2Var.d(j, j2);
                return;
            }
            return;
        }
        this.f = 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.b = m51Var;
    }
}
