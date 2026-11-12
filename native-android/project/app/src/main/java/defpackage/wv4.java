package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface wv4 {
    void a(long r1, int r3, int r4, int r5, vv4 r6);

    void b(be3 r1, int r2, int r3);

    int c(wh0 r1, int r2, boolean r3);

    default void d(long r1) {
    }

    default void e(int r2, be3 r3) {
        b(r3, r2, 0);
    }

    default int f(wh0 r1, int r2, boolean r3) {
        return c(r1, r2, r3);
    }

    void g(tb1 r1);
}
