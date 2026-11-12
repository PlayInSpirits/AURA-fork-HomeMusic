package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vi0 {
    public static final vi0 n;
    public static final vi0 o;
    public static final vi0 p;
    public static final /* synthetic */ vi0[] q;

    static {
        vi0 vi0Var = new vi0("PREFER_ARGB_8888", 0);
        n = vi0Var;
        vi0 vi0Var2 = new vi0("PREFER_RGB_565", 1);
        o = vi0Var2;
        q = new vi0[]{vi0Var, vi0Var2};
        p = vi0Var;
    }

    public static vi0 valueOf(String str) {
        return (vi0) Enum.valueOf(vi0.class, str);
    }

    public static vi0[] values() {
        return (vi0[]) q.clone();
    }
}
