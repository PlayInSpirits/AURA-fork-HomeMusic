package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b71 {
    public static final s32 a = null;
    public static final y04 b = null;

    static {
        Class.forName("java.nio.file.Files");     // Catch: ClassNotFoundException -> L4
        s32 r0 = new x53();     // Catch: ClassNotFoundException -> L4
    L5:
        a = r0;
        String r1 = ge3.o;
        String r2 = System.getProperty("java.io.tmpdir");
        r2.getClass();
        tv1.z(r2);
        ClassLoader r3 = y04.class.getClassLoader();
        r3.getClass();
        b = new y04(r3);
        return;
    L4:
        r0 = new s32();
        goto L5
    }

    public abstract of4 a(ge3 r1);

    public abstract void b(ge3 r1, ge3 r2);

    public abstract void c(ge3 r1);

    public abstract void d(ge3 r1);

    public final boolean e(ge3 r1) {
        r1.getClass();
        if (h(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public abstract List f(ge3 r1);

    public final xo0 g(ge3 r1) {
        r1.getClass();
        xo0 r0 = h(r1);
        if (r0 == null) goto L5;
        return r0;
    L5:
        mj0.k(r1, "no such file: ");
        return null;
    }

    public abstract xo0 h(ge3 r1);

    public abstract r32 i(ge3 r1);

    public abstract of4 j(ge3 r1);

    public abstract ej4 k(ge3 r1);
}
