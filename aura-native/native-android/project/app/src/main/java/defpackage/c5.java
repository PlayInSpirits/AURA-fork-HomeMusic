package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 {
    public static final c5 n;
    public static final c5 o;
    public static final /* synthetic */ c5[] p;

    static {
        c5 c5Var = new c5("ALWAYS", 0);
        n = c5Var;
        c5 c5Var2 = new c5("LAST", 1);
        o = c5Var2;
        p = new c5[]{c5Var, c5Var2};
    }

    public static c5 valueOf(String str) {
        return (c5) Enum.valueOf(c5.class, str);
    }

    public static c5[] values() {
        return (c5[]) p.clone();
    }
}
