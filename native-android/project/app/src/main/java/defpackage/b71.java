package defpackage;

import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b71 {
    public static final s32 a;
    public static final y04 b;

    static {
        s32 s32Var;
        try {
            Class.forName("java.nio.file.Files");
            s32Var = new x53();
        } catch (ClassNotFoundException unused) {
            s32Var = new s32();
        }
        a = s32Var;
        String str = ge3.o;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        tv1.z(property);
        ClassLoader classLoader = y04.class.getClassLoader();
        classLoader.getClass();
        b = new y04(classLoader);
    }

    public abstract of4 a(ge3 ge3Var);

    public abstract void b(ge3 ge3Var, ge3 ge3Var2);

    public abstract void c(ge3 ge3Var);

    public abstract void d(ge3 ge3Var);

    public final boolean e(ge3 ge3Var) {
        ge3Var.getClass();
        return h(ge3Var) != null;
    }

    public abstract List f(ge3 ge3Var);

    public final xo0 g(ge3 ge3Var) throws FileNotFoundException {
        ge3Var.getClass();
        xo0 xo0VarH = h(ge3Var);
        if (xo0VarH != null) {
            return xo0VarH;
        }
        mj0.k(ge3Var, "no such file: ");
        return null;
    }

    public abstract xo0 h(ge3 ge3Var);

    public abstract r32 i(ge3 ge3Var);

    public abstract of4 j(ge3 ge3Var);

    public abstract ej4 k(ge3 ge3Var);
}
