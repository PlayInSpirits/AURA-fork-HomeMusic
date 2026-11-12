package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n12 {
    public static final n12 n;
    public static final n12 o;
    public static final n12 p;
    public static final n12 q;
    public static final /* synthetic */ n12[] r;

    static {
        n12 n12Var = new n12("LookaheadMeasurement", 0);
        n = n12Var;
        n12 n12Var2 = new n12("LookaheadPlacement", 1);
        o = n12Var2;
        n12 n12Var3 = new n12("Measurement", 2);
        p = n12Var3;
        n12 n12Var4 = new n12("Placement", 3);
        q = n12Var4;
        r = new n12[]{n12Var, n12Var2, n12Var3, n12Var4};
    }

    public static n12 valueOf(String str) {
        return (n12) Enum.valueOf(n12.class, str);
    }

    public static n12[] values() {
        return (n12[]) r.clone();
    }
}
