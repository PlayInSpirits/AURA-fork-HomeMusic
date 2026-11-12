package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ln3 {
    public static final ln3 n;
    public static final ln3 o;
    public static final ln3 p;
    public static final /* synthetic */ ln3[] q;

    static {
        ln3 ln3Var = new ln3("Initial", 0);
        n = ln3Var;
        ln3 ln3Var2 = new ln3("Main", 1);
        o = ln3Var2;
        ln3 ln3Var3 = new ln3("Final", 2);
        p = ln3Var3;
        q = new ln3[]{ln3Var, ln3Var2, ln3Var3};
    }

    public static ln3 valueOf(String str) {
        return (ln3) Enum.valueOf(ln3.class, str);
    }

    public static ln3[] values() {
        return (ln3[]) q.clone();
    }
}
