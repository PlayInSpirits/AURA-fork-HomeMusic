package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ru0 {
    public static final ru0 n;
    public static final ru0 o;
    public static final ru0 p;
    public static final /* synthetic */ ru0[] q;

    static {
        ru0 ru0Var = new ru0("Yes", 0);
        n = ru0Var;
        ru0 ru0Var2 = new ru0("No", 1);
        o = ru0Var2;
        ru0 ru0Var3 = new ru0("NotInitialized", 2);
        p = ru0Var3;
        q = new ru0[]{ru0Var, ru0Var2, ru0Var3};
    }

    public static ru0 valueOf(String str) {
        return (ru0) Enum.valueOf(ru0.class, str);
    }

    public static ru0[] values() {
        return (ru0[]) q.clone();
    }
}
