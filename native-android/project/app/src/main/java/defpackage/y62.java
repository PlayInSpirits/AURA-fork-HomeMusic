package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y62 {
    public static final y62 n;
    public static final y62 o;
    public static final y62 p;
    public static final y62 q;
    public static final y62 r;
    public static final /* synthetic */ y62[] s;

    static {
        y62 y62Var = new y62("Measuring", 0);
        n = y62Var;
        y62 y62Var2 = new y62("LookaheadMeasuring", 1);
        o = y62Var2;
        y62 y62Var3 = new y62("LayingOut", 2);
        p = y62Var3;
        y62 y62Var4 = new y62("LookaheadLayingOut", 3);
        q = y62Var4;
        y62 y62Var5 = new y62("Idle", 4);
        r = y62Var5;
        s = new y62[]{y62Var, y62Var2, y62Var3, y62Var4, y62Var5};
    }

    public static y62 valueOf(String str) {
        return (y62) Enum.valueOf(y62.class, str);
    }

    public static y62[] values() {
        return (y62[]) s.clone();
    }
}
