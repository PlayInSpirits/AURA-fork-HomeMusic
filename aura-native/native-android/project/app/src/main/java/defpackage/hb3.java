package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hb3 {
    public static final hb3 n;
    public static final hb3 o;
    public static final /* synthetic */ hb3[] p;

    static {
        hb3 hb3Var = new hb3("Vertical", 0);
        n = hb3Var;
        hb3 hb3Var2 = new hb3("Horizontal", 1);
        o = hb3Var2;
        p = new hb3[]{hb3Var, hb3Var2};
    }

    public static hb3 valueOf(String str) {
        return (hb3) Enum.valueOf(hb3.class, str);
    }

    public static hb3[] values() {
        return (hb3[]) p.clone();
    }
}
