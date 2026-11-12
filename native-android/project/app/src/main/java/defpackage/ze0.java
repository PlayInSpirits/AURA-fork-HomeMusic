package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ze0 {
    public static final ze0 n;
    public static final ze0 o;
    public static final ze0 p;
    public static final ze0 q;
    public static final /* synthetic */ ze0[] r;

    static {
        ze0 ze0Var = new ze0("DEFAULT", 0);
        n = ze0Var;
        ze0 ze0Var2 = new ze0("LAZY", 1);
        o = ze0Var2;
        ze0 ze0Var3 = new ze0("ATOMIC", 2);
        p = ze0Var3;
        ze0 ze0Var4 = new ze0("UNDISPATCHED", 3);
        q = ze0Var4;
        r = new ze0[]{ze0Var, ze0Var2, ze0Var3, ze0Var4};
    }

    public static ze0 valueOf(String str) {
        return (ze0) Enum.valueOf(ze0.class, str);
    }

    public static ze0[] values() {
        return (ze0[]) r.clone();
    }
}
