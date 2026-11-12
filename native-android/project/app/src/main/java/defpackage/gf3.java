package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gf3 {
    public static final gf3 n;
    public static final gf3 o;
    public static final gf3 p;
    public static final gf3 q;
    public static final gf3 r;
    public static final gf3 s;
    public static final gf3 t;
    public static final /* synthetic */ gf3[] u;

    static {
        gf3 gf3Var = new gf3("Invalid", 0);
        n = gf3Var;
        gf3 gf3Var2 = new gf3("Cancelled", 1);
        o = gf3Var2;
        gf3 gf3Var3 = new gf3("InitialPending", 2);
        p = gf3Var3;
        gf3 gf3Var4 = new gf3("RecomposePending", 3);
        q = gf3Var4;
        gf3 gf3Var5 = new gf3("Recomposing", 4);
        r = gf3Var5;
        gf3 gf3Var6 = new gf3("ApplyPending", 5);
        s = gf3Var6;
        gf3 gf3Var7 = new gf3("Applied", 6);
        t = gf3Var7;
        u = new gf3[]{gf3Var, gf3Var2, gf3Var3, gf3Var4, gf3Var5, gf3Var6, gf3Var7};
    }

    public static gf3 valueOf(String str) {
        return (gf3) Enum.valueOf(gf3.class, str);
    }

    public static gf3[] values() {
        return (gf3[]) u.clone();
    }
}
