package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class ig3 implements oo0 {
    public boolean n;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ig3 ig3Var, jg3 jg3Var) {
        ig3Var.getClass();
        if (jg3Var instanceof yx2) {
            ((yx2) jg3Var).x(ig3Var.n);
        }
    }

    public static void f(ig3 ig3Var, jg3 jg3Var, int i, int i2) {
        ig3Var.getClass();
        a(ig3Var, jg3Var);
        jg3Var.N(g02.c((i2 & 4294967295L) | (i << 32), jg3Var.r), 0.0f, null);
    }

    public static void j(ig3 ig3Var, jg3 jg3Var, long j) {
        ig3Var.getClass();
        a(ig3Var, jg3Var);
        jg3Var.N(g02.c(j, jg3Var.r), 0.0f, null);
    }

    public static void k(ig3 ig3Var, jg3 jg3Var) {
        if (ig3Var.c() == r62.n || ig3Var.e() == 0) {
            a(ig3Var, jg3Var);
            jg3Var.N(g02.c(0L, jg3Var.r), 0.0f, null);
        } else {
            a(ig3Var, jg3Var);
            jg3Var.N(g02.c((ig3Var.e() - jg3Var.n) << 32, jg3Var.r), 0.0f, null);
        }
    }

    public static void n(ig3 ig3Var, jg3 jg3Var) {
        k52 k52Var = kg3.a;
        if (ig3Var.c() == r62.n || ig3Var.e() == 0) {
            a(ig3Var, jg3Var);
            jg3Var.N(g02.c(0L, jg3Var.r), 0.0f, k52Var);
        } else {
            a(ig3Var, jg3Var);
            jg3Var.N(g02.c((ig3Var.e() - jg3Var.n) << 32, jg3Var.r), 0.0f, k52Var);
        }
    }

    public static void q(ig3 ig3Var, jg3 jg3Var, if1 if1Var) {
        ig3Var.getClass();
        a(ig3Var, jg3Var);
        jg3Var.N(g02.c(0L, jg3Var.r), 0.0f, if1Var);
    }

    public float b(rp1 rp1Var) {
        return Float.NaN;
    }

    public abstract r62 c();

    public abstract int e();
}
