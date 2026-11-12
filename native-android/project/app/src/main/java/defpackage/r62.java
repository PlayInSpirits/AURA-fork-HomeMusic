package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r62 {
    public static final r62 n;
    public static final r62 o;
    public static final /* synthetic */ r62[] p;

    static {
        r62 r62Var = new r62("Ltr", 0);
        n = r62Var;
        r62 r62Var2 = new r62("Rtl", 1);
        o = r62Var2;
        p = new r62[]{r62Var, r62Var2};
    }

    public static r62 valueOf(String str) {
        return (r62) Enum.valueOf(r62.class, str);
    }

    public static r62[] values() {
        return (r62[]) p.clone();
    }
}
