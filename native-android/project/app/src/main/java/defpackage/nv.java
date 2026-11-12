package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nv {
    public static volatile int a = 1;

    static {
        int i;
        try {
            Class.forName("org.osgi.framework.BundleEvent");
        } catch (Exception unused) {
            if (a == 1) {
                try {
                    Class.forName("org.brotli.dec.BrotliInputStream");
                    i = 2;
                } catch (Exception | NoClassDefFoundError unused2) {
                    i = 3;
                }
                a = i;
            }
        }
    }
}
