package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface bi {
    void a(int i, Object obj);

    void b(Object obj);

    void c();

    void d(int i, int i2, int i3);

    void e(int i, int i2);

    void g();

    void h(int i, Object obj);

    Object j();

    default void m(wf1 wf1Var, Object obj) {
        wf1Var.invoke(j(), obj);
    }

    default void i() {
    }
}
