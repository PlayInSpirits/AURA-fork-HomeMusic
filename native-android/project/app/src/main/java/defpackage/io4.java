package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class io4 implements go4 {
    public static final di0 q = new di0(6);
    public final Object n = new Object();
    public volatile go4 o;
    public Object p;

    public io4(go4 go4Var) {
        this.o = go4Var;
    }

    @Override // defpackage.go4
    public final Object get() {
        go4 go4Var = this.o;
        di0 di0Var = q;
        if (go4Var != di0Var) {
            synchronized (this.n) {
                try {
                    if (this.o != di0Var) {
                        Object obj = this.o.get();
                        this.p = obj;
                        this.o = di0Var;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.p;
    }

    public final String toString() {
        Object obj = this.o;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == q) {
            obj = "<supplier that returned " + this.p + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
