package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y74 {
    public static final y74 n;
    public static final y74 o;
    public static final y74 p;
    public static final y74 q;
    public static final /* synthetic */ y74[] r;

    static {
        y74 y74Var = new y74("HIDING", 0);
        n = y74Var;
        y74 y74Var2 = new y74("HIDDEN", 1);
        o = y74Var2;
        y74 y74Var3 = new y74("SHOWING", 2);
        p = y74Var3;
        y74 y74Var4 = new y74("SHOWN", 3);
        q = y74Var4;
        r = new y74[]{y74Var, y74Var2, y74Var3, y74Var4};
    }

    public static y74 valueOf(String str) {
        return (y74) Enum.valueOf(y74.class, str);
    }

    public static y74[] values() {
        return (y74[]) r.clone();
    }
}
