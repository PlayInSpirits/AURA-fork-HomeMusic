package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ch4 {
    public gh4 a;
    public long b;
    public boolean c;
    public int d;

    public ch4(long j, gh4 gh4Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = gh4Var;
        this.b = j;
        o54 o54Var = jh4.a;
        if (j != 0) {
            gh4 gh4VarD = d();
            long j2 = gh4VarD.p;
            long[] jArr = gh4VarD.q;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = gh4VarD.o;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = gh4VarD.n;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (jh4.c) {
                iA = jh4.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(ch4 ch4Var) {
        jh4.b.n(ch4Var);
    }

    public final void a() {
        synchronized (jh4.c) {
            b();
            p();
        }
    }

    public void b() {
        jh4.d = jh4.d.b(g());
    }

    public abstract void c();

    public gh4 d() {
        return this.a;
    }

    public abstract if1 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract if1 i();

    public final ch4 j() {
        z05 z05Var = jh4.b;
        ch4 ch4Var = (ch4) z05Var.f();
        z05Var.n(this);
        return ch4Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(rl4 rl4Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            jh4.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(gh4 gh4Var) {
        this.a = gh4Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract ch4 u(if1 if1Var);
}
