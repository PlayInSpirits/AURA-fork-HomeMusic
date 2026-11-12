package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fb0 {
    public static final fb0 n;
    public static final fb0 o;
    public static final fb0 p;
    public static final /* synthetic */ fb0[] q;

    static {
        fb0 fb0Var = new fb0("ARTIST", 0);
        n = fb0Var;
        fb0 fb0Var2 = new fb0("ALBUM", 1);
        o = fb0Var2;
        fb0 fb0Var3 = new fb0("TRACK", 2);
        p = fb0Var3;
        q = new fb0[]{fb0Var, fb0Var2, fb0Var3};
    }

    public static fb0 valueOf(String str) {
        return (fb0) Enum.valueOf(fb0.class, str);
    }

    public static fb0[] values() {
        return (fb0[]) q.clone();
    }
}
