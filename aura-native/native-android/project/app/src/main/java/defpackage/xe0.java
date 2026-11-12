package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xe0 {
    public static final xe0 n;
    public static final xe0 o;
    public static final xe0 p;
    public static final /* synthetic */ xe0[] q;

    static {
        xe0 xe0Var = new xe0("COROUTINE_SUSPENDED", 0);
        n = xe0Var;
        xe0 xe0Var2 = new xe0("UNDECIDED", 1);
        o = xe0Var2;
        xe0 xe0Var3 = new xe0("RESUMED", 2);
        p = xe0Var3;
        q = new xe0[]{xe0Var, xe0Var2, xe0Var3};
    }

    public static xe0 valueOf(String str) {
        return (xe0) Enum.valueOf(xe0.class, str);
    }

    public static xe0[] values() {
        return (xe0[]) q.clone();
    }
}
