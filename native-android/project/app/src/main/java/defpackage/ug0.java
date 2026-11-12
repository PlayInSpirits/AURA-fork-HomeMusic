package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ug0 {
    public static final ug0 n;
    public static final ug0 o;
    public static final ug0 p;
    public static final /* synthetic */ ug0[] q;

    static {
        ug0 ug0Var = new ug0("None", 0);
        n = ug0Var;
        ug0 ug0Var2 = new ug0("Cancelled", 1);
        o = ug0Var2;
        ug0 ug0Var3 = new ug0("Redirected", 2);
        p = ug0Var3;
        q = new ug0[]{ug0Var, ug0Var2, ug0Var3, new ug0("RedirectCancelled", 3)};
    }

    public static ug0 valueOf(String str) {
        return (ug0) Enum.valueOf(ug0.class, str);
    }

    public static ug0[] values() {
        return (ug0[]) q.clone();
    }
}
