package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class co1 {
    public static final co1 n;
    public static final co1 o;
    public static final co1 p;
    public static final co1 q;
    public static final /* synthetic */ co1[] r;

    static {
        co1 co1Var = new co1("SERVER", 0);
        n = co1Var;
        co1 co1Var2 = new co1("ACCOUNT", 1);
        o = co1Var2;
        co1 co1Var3 = new co1("REGISTER", 2);
        p = co1Var3;
        co1 co1Var4 = new co1("EMAIL", 3);
        q = co1Var4;
        r = new co1[]{co1Var, co1Var2, co1Var3, co1Var4};
    }

    public static co1 valueOf(String str) {
        return (co1) Enum.valueOf(co1.class, str);
    }

    public static co1[] values() {
        return (co1[]) r.clone();
    }
}
