package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface zn4 {
    default qn4 b(byte[] bArr, int i, int i2) {
        uw1 uw1VarJ = yw1.j();
        c(bArr, 0, i2, yn4.c, new ss2(22, uw1VarJ));
        return new mg0(uw1VarJ.f());
    }

    void c(byte[] bArr, int i, int i2, yn4 yn4Var, wc0 wc0Var);

    default void reset() {
    }
}
