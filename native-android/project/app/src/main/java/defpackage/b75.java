package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface b75 {
    default x65 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default x65 b(Class cls, f03 f03Var) {
        return a(cls);
    }

    default x65 c(i30 i30Var, f03 f03Var) {
        Class cls = i30Var.n;
        cls.getClass();
        return b(cls, f03Var);
    }
}
