package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface zn4 {
    default qn4 b(byte[] r7, int r8, int r9) {
        uw1 r10 = yw1.j();
        ss2 r5 = new ss2(22, r10);
        c(r7, 0, r9, yn4.c, r5);
        return new mg0(r10.f());
    }

    void c(byte[] r1, int r2, int r3, yn4 r4, wc0 r5);

    default void reset() {
    }
}
