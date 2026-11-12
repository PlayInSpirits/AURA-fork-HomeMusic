package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lq0 {
    public static final lq0 n;
    public static final lq0 o;
    public static final lq0 p;
    public static final /* synthetic */ lq0[] q;

    static {
        lq0 lq0Var = new lq0("Vertical", 0);
        n = lq0Var;
        lq0 lq0Var2 = new lq0("Horizontal", 1);
        o = lq0Var2;
        lq0 lq0Var3 = new lq0("Both", 2);
        p = lq0Var3;
        q = new lq0[]{lq0Var, lq0Var2, lq0Var3};
    }

    public static lq0 valueOf(String str) {
        return (lq0) Enum.valueOf(lq0.class, str);
    }

    public static lq0[] values() {
        return (lq0[]) q.clone();
    }
}
