package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h13 {
    public static final h13 n;
    public static final h13 o;
    public static final /* synthetic */ h13[] p;

    static {
        h13 h13Var = new h13("Default", 0);
        n = h13Var;
        h13 h13Var2 = new h13("UserInput", 1);
        o = h13Var2;
        p = new h13[]{h13Var, h13Var2, new h13("PreventUserInput", 2)};
    }

    public static h13 valueOf(String str) {
        return (h13) Enum.valueOf(h13.class, str);
    }

    public static h13[] values() {
        return (h13[]) p.clone();
    }
}
