package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class qk0 {
    public static final ao0 a;

    static {
        String str;
        ao0 ao0Var;
        int i = eq4.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            rm0 rm0Var = rr0.a;
            fl1 fl1Var = uf2.a;
            fl1 fl1Var2 = fl1Var.s;
            ao0Var = fl1Var;
            if (fl1Var == null) {
                ao0Var = pk0.y;
            }
        } else {
            ao0Var = pk0.y;
        }
        a = ao0Var;
    }
}
