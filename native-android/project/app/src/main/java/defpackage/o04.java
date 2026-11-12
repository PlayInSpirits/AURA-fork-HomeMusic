package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o04 {
    public static final o04 n;
    public static final o04 o;
    public static final /* synthetic */ o04[] p;

    static {
        o04 o04Var = new o04("Ltr", 0);
        n = o04Var;
        o04 o04Var2 = new o04("Rtl", 1);
        o = o04Var2;
        p = new o04[]{o04Var, o04Var2};
    }

    public static o04 valueOf(String str) {
        return (o04) Enum.valueOf(o04.class, str);
    }

    public static o04[] values() {
        return (o04[]) p.clone();
    }
}
