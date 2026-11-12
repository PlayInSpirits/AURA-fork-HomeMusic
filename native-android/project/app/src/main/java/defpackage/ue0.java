package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ue0 {
    public static final ue0 n;
    public static final ue0 o;
    public static final ue0 p;
    public static final ue0 q;
    public static final ue0 r;
    public static final /* synthetic */ ue0[] s;

    static {
        ue0 ue0Var = new ue0("CPU_ACQUIRED", 0);
        n = ue0Var;
        ue0 ue0Var2 = new ue0("BLOCKING", 1);
        o = ue0Var2;
        ue0 ue0Var3 = new ue0("PARKING", 2);
        p = ue0Var3;
        ue0 ue0Var4 = new ue0("DORMANT", 3);
        q = ue0Var4;
        ue0 ue0Var5 = new ue0("TERMINATED", 4);
        r = ue0Var5;
        s = new ue0[]{ue0Var, ue0Var2, ue0Var3, ue0Var4, ue0Var5};
    }

    public static ue0 valueOf(String str) {
        return (ue0) Enum.valueOf(ue0.class, str);
    }

    public static ue0[] values() {
        return (ue0[]) s.clone();
    }
}
