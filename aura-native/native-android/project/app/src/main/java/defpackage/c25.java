package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c25 {
    public static final c25 n;
    public static final c25 o;
    public static final c25 p;
    public static final /* synthetic */ c25[] q;

    static {
        c25 c25Var = new c25("FAIL", 0);
        n = c25Var;
        c25 c25Var2 = new c25("FULL_NOW", 1);
        o = c25Var2;
        c25 c25Var3 = new c25("ASK_FULL", 2);
        p = c25Var3;
        q = new c25[]{c25Var, c25Var2, c25Var3};
    }

    public static c25 valueOf(String str) {
        return (c25) Enum.valueOf(c25.class, str);
    }

    public static c25[] values() {
        return (c25[]) q.clone();
    }
}
