package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cr1 {
    public static final cr1 n;
    public static final cr1 o;
    public static final cr1 p;
    public static final /* synthetic */ cr1[] q;

    static {
        cr1 cr1Var = new cr1("NONE", 0);
        n = cr1Var;
        cr1 cr1Var2 = new cr1("BASIC", 1);
        cr1 cr1Var3 = new cr1("HEADERS", 2);
        o = cr1Var3;
        cr1 cr1Var4 = new cr1("BODY", 3);
        p = cr1Var4;
        q = new cr1[]{cr1Var, cr1Var2, cr1Var3, cr1Var4};
    }

    public static cr1 valueOf(String str) {
        return (cr1) Enum.valueOf(cr1.class, str);
    }

    public static cr1[] values() {
        return (cr1[]) q.clone();
    }
}
