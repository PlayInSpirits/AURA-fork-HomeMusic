package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ze1 {
    public static final ze1 n;
    public static final ze1 o;
    public static final ze1 p;
    public static final ze1 q;
    public static final ze1 r;
    public static final /* synthetic */ ze1[] s;

    static {
        ze1 ze1Var = new ze1("ON_CONFIGURE", 0);
        n = ze1Var;
        ze1 ze1Var2 = new ze1("ON_CREATE", 1);
        o = ze1Var2;
        ze1 ze1Var3 = new ze1("ON_UPGRADE", 2);
        p = ze1Var3;
        ze1 ze1Var4 = new ze1("ON_DOWNGRADE", 3);
        q = ze1Var4;
        ze1 ze1Var5 = new ze1("ON_OPEN", 4);
        r = ze1Var5;
        s = new ze1[]{ze1Var, ze1Var2, ze1Var3, ze1Var4, ze1Var5};
    }

    public static ze1 valueOf(String str) {
        return (ze1) Enum.valueOf(ze1.class, str);
    }

    public static ze1[] values() {
        return (ze1[]) s.clone();
    }
}
