package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class se5 {
    public static final byte[] a = null;
    public static final byte[] b = null;
    public static volatile int c;

    static {
        a = new byte[]{40, -75, 47, -3};
        int r0 = 3;
        b = new byte[]{42, 77, 24};
        c = 1;
        Class.forName("org.osgi.framework.BundleEvent");     // Catch: Exception -> L5
        return;
    L6:
        if (c != 1) goto L16;
        Class.forName("com.github.luben.zstd.ZstdInputStream");     // Catch: Throwable -> L11
        r0 = 2;
    L9:
        c = r0;
        return;
    }
}
