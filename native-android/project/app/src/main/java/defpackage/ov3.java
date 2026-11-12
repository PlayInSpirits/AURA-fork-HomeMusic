package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ov3 {
    public static final ov3 n;
    public static final ov3 o;
    public static final ov3 p;
    public static final ov3 q;
    public static final ov3 r;
    public static final ov3 s;
    public static final /* synthetic */ ov3[] t;

    static {
        ov3 ov3Var = new ov3("ShutDown", 0);
        n = ov3Var;
        ov3 ov3Var2 = new ov3("ShuttingDown", 1);
        o = ov3Var2;
        ov3 ov3Var3 = new ov3("Inactive", 2);
        p = ov3Var3;
        ov3 ov3Var4 = new ov3("InactivePendingWork", 3);
        q = ov3Var4;
        ov3 ov3Var5 = new ov3("Idle", 4);
        r = ov3Var5;
        ov3 ov3Var6 = new ov3("PendingWork", 5);
        s = ov3Var6;
        t = new ov3[]{ov3Var, ov3Var2, ov3Var3, ov3Var4, ov3Var5, ov3Var6};
    }

    public static ov3 valueOf(String str) {
        return (ov3) Enum.valueOf(ov3.class, str);
    }

    public static ov3[] values() {
        return (ov3[]) t.clone();
    }
}
