package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface b75 {
    default x65 a(Class r1) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default x65 b(Class r1, f03 r2) {
        return a(r1);
    }

    default x65 c(i30 r1, f03 r2) {
        Class r3 = r1.n;
        r3.getClass();
        return b(r3, r2);
    }
}
