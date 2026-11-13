package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class se5 {
    public static final byte[] a = {40, -75, 47, -3};
    public static final byte[] b = {42, 77, 24};
    public static volatile int c;

    static {
        int i = 3;
        c = 1;
        try {
            Class.forName("org.osgi.framework.BundleEvent");
        } catch (Exception unused) {
            if (c == 1) {
                try {
                    Class.forName("com.github.luben.zstd.ZstdInputStream");
                    i = 2;
                } catch (Exception | NoClassDefFoundError unused2) {
                }
                c = i;
            }
        }
    }
}
