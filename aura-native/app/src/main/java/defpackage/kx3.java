package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class kx3 {
    public static final lx3 a;

    static {
        lx3 lx3Var = null;
        try {
            lx3Var = (lx3) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (lx3Var == null) {
            lx3Var = new lx3();
        }
        a = lx3Var;
    }

    public static i30 a(Class cls) {
        a.getClass();
        return new i30(cls);
    }
}
