package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eq3 {
    public static final eq3 n;
    public static final eq3 o;
    public static final eq3 p;
    public static final eq3 q;
    public static final /* synthetic */ eq3[] r;

    static {
        eq3 eq3Var = new eq3("IMMEDIATE", 0);
        n = eq3Var;
        eq3 eq3Var2 = new eq3("HIGH", 1);
        o = eq3Var2;
        eq3 eq3Var3 = new eq3("NORMAL", 2);
        p = eq3Var3;
        eq3 eq3Var4 = new eq3("LOW", 3);
        q = eq3Var4;
        r = new eq3[]{eq3Var, eq3Var2, eq3Var3, eq3Var4};
    }

    public static eq3 valueOf(String str) {
        return (eq3) Enum.valueOf(eq3.class, str);
    }

    public static eq3[] values() {
        return (eq3[]) r.clone();
    }
}
