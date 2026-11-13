package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface wv4 {
    void a(long j, int i, int i2, int i3, vv4 vv4Var);

    void b(be3 be3Var, int i, int i2);

    int c(wh0 wh0Var, int i, boolean z);

    default void e(int i, be3 be3Var) {
        b(be3Var, i, 0);
    }

    default int f(wh0 wh0Var, int i, boolean z) {
        return c(wh0Var, i, z);
    }

    void g(tb1 tb1Var);

    default void d(long j) {
    }
}
