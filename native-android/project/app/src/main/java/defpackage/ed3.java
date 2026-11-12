package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ed3 {
    public static final dd3 a;
    public static final qc3 b;

    static {
        dd3 dd3Var = new dd3(0);
        a = dd3Var;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        b = new qc3(i, i2, i3, i4, 0, 0, rv2.C, new cd3(), te5.a(q01.n), dd3Var, qc0.b(0, 0, 15));
    }

    public static final long a(qc3 qc3Var, int i) {
        int i2 = qc3Var.c;
        long j = (((((long) i) * ((long) (qc3Var.b + i2))) + ((long) (-qc3Var.f))) + ((long) qc3Var.d)) - ((long) i2);
        int i3 = (int) (qc3Var.e == hb3.o ? qc3Var.i() >> 32 : qc3Var.i() & 4294967295L);
        qc3Var.n.getClass();
        long jM = j - ((long) (i3 - gb.m(0, 0, i3)));
        if (jM < 0) {
            return 0L;
        }
        return jM;
    }
}
