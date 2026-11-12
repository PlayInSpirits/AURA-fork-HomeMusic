package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lw4 {
    public static final lw4 n;
    public static final lw4 o;
    public static final /* synthetic */ lw4[] p;

    static {
        lw4 lw4Var = new lw4("DEFERRED", 0);
        n = lw4Var;
        lw4 lw4Var2 = new lw4("IMMEDIATE", 1);
        o = lw4Var2;
        p = new lw4[]{lw4Var, lw4Var2, new lw4("EXCLUSIVE", 2)};
    }

    public static lw4 valueOf(String str) {
        return (lw4) Enum.valueOf(lw4.class, str);
    }

    public static lw4[] values() {
        return (lw4[]) p.clone();
    }
}
