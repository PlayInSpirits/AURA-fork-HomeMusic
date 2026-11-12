package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zc0 {
    public static final zc0 n;
    public static final zc0 o;
    public static final /* synthetic */ zc0[] p;

    static {
        zc0 zc0Var = new zc0("VIEW_APPEAR", 0);
        n = zc0Var;
        zc0 zc0Var2 = new zc0("VIEW_DISAPPEAR", 1);
        o = zc0Var2;
        p = new zc0[]{zc0Var, zc0Var2};
    }

    public static zc0 valueOf(String str) {
        return (zc0) Enum.valueOf(zc0.class, str);
    }

    public static zc0[] values() {
        return (zc0[]) p.clone();
    }
}
