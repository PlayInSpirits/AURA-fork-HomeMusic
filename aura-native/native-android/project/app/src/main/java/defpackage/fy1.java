package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fy1 {
    public static final fy1 n;
    public static final fy1 o;
    public static final fy1 p;
    public static final /* synthetic */ fy1[] q;

    static {
        fy1 fy1Var = new fy1("Yes", 0);
        n = fy1Var;
        fy1 fy1Var2 = new fy1("No", 1);
        o = fy1Var2;
        fy1 fy1Var3 = new fy1("NotInitialized", 2);
        p = fy1Var3;
        q = new fy1[]{fy1Var, fy1Var2, fy1Var3};
    }

    public static fy1 valueOf(String str) {
        return (fy1) Enum.valueOf(fy1.class, str);
    }

    public static fy1[] values() {
        return (fy1[]) q.clone();
    }
}
