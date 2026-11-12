package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class it4 {
    public static final ThreadLocal a = null;

    static {
        a = new ThreadLocal();
    }

    public static g21 a() {
        ThreadLocal r0 = a;
        g21 r1 = (g21) r0.get();
        if (r1 != null) goto L6;
        jt r2 = new jt(Thread.currentThread());
        r0.set(r2);
        return r2;
    L6:
        return r1;
    }
}
