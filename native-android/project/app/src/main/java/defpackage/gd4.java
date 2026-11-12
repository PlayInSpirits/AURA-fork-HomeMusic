package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gd4 {
    public static final gd4 n;
    public static final gd4 o;
    public static final gd4 p;
    public static final /* synthetic */ gd4[] q;

    static {
        gd4 gd4Var = new gd4("START", 0);
        n = gd4Var;
        gd4 gd4Var2 = new gd4("STOP", 1);
        o = gd4Var2;
        gd4 gd4Var3 = new gd4("STOP_AND_RESET_REPLAY_CACHE", 2);
        p = gd4Var3;
        q = new gd4[]{gd4Var, gd4Var2, gd4Var3};
    }

    public static gd4 valueOf(String str) {
        return (gd4) Enum.valueOf(gd4.class, str);
    }

    public static gd4[] values() {
        return (gd4[]) q.clone();
    }
}
