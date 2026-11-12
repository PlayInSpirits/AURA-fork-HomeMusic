package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y73 {
    public static final y73 n;
    public static final y73 o;
    public static final y73 p;
    public static final /* synthetic */ y73[] q;

    static {
        y73 y73Var = new y73("NO_OP", 0);
        n = y73Var;
        y73 y73Var2 = new y73("ADD", 1);
        o = y73Var2;
        y73 y73Var3 = new y73("REMOVE", 2);
        p = y73Var3;
        q = new y73[]{y73Var, y73Var2, y73Var3};
    }

    public static y73 valueOf(String str) {
        return (y73) Enum.valueOf(y73.class, str);
    }

    public static y73[] values() {
        return (y73[]) q.clone();
    }
}
