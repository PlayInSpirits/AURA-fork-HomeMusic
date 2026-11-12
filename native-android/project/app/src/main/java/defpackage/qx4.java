package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qx4 {
    public static final qx4 n;
    public static final qx4 o;
    public static final qx4 p;
    public static final /* synthetic */ qx4[] q;

    static {
        qx4 qx4Var = new qx4("ContinueTraversal", 0);
        n = qx4Var;
        qx4 qx4Var2 = new qx4("SkipSubtreeAndContinueTraversal", 1);
        o = qx4Var2;
        qx4 qx4Var3 = new qx4("CancelTraversal", 2);
        p = qx4Var3;
        q = new qx4[]{qx4Var, qx4Var2, qx4Var3};
    }

    public static qx4 valueOf(String str) {
        return (qx4) Enum.valueOf(qx4.class, str);
    }

    public static qx4[] values() {
        return (qx4[]) q.clone();
    }
}
