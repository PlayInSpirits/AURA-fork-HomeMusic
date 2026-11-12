package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nv {
    public static volatile int a = 1;

    static {
        Class.forName("org.osgi.framework.BundleEvent");     // Catch: Exception -> L4
        return;
    L5:
        if (a != 1) goto L15;
        Class.forName("org.brotli.dec.BrotliInputStream");     // Catch: Throwable -> L8
        int r0 = 2;
    L9:
        a = r0;
        return;
    L8:
        r0 = 3;
        goto L9
    }
}
