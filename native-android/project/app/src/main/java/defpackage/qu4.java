package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qu4 {
    public static final qu4 n;
    public static final qu4 o;
    public static final /* synthetic */ qu4[] p;

    static {
        qu4 qu4Var = new qu4("On", 0);
        n = qu4Var;
        qu4 qu4Var2 = new qu4("Off", 1);
        o = qu4Var2;
        p = new qu4[]{qu4Var, qu4Var2, new qu4("Indeterminate", 2)};
    }

    public static qu4 valueOf(String str) {
        return (qu4) Enum.valueOf(qu4.class, str);
    }

    public static qu4[] values() {
        return (qu4[]) p.clone();
    }
}
