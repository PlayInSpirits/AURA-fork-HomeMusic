package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kx3 {
    public static final lx3 a = null;

    static {
        lx3 r0 = null;
        r0 = (lx3) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();     // Catch: Throwable -> L10
    L5:
        if (r0 != null) goto L8;
        r0 = new lx3();
    L8:
        a = r0;
    }

    public static i30 a(Class r1) {
        a.getClass();
        return new i30(r1);
    }
}
