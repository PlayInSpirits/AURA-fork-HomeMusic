package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p12 {
    public static final p12 n;
    public static final p12 o;
    public static final p12 p;
    public static final p12 q;
    public static final /* synthetic */ p12[] r;

    static {
        p12 p12Var = new p12("IGNORED", 0);
        n = p12Var;
        p12 p12Var2 = new p12("SCHEDULED", 1);
        o = p12Var2;
        p12 p12Var3 = new p12("DEFERRED", 2);
        p = p12Var3;
        p12 p12Var4 = new p12("IMMINENT", 3);
        q = p12Var4;
        r = new p12[]{p12Var, p12Var2, p12Var3, p12Var4};
    }

    public static p12 valueOf(String str) {
        return (p12) Enum.valueOf(p12.class, str);
    }

    public static p12[] values() {
        return (p12[]) r.clone();
    }
}
