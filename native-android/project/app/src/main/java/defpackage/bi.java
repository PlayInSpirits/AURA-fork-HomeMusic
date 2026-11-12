package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface bi {
    void a(int r1, Object r2);

    void b(Object r1);

    void c();

    void d(int r1, int r2, int r3);

    void e(int r1, int r2);

    void g();

    void h(int r1, Object r2);

    default void i() {
    }

    Object j();

    default void m(wf1 r1, Object r2) {
        r1.invoke(j(), r2);
    }
}
