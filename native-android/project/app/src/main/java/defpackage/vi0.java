package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum vi0 extends Enum {
    public static final vi0 n = null;
    public static final vi0 o = null;
    public static final vi0 p = null;
    public static final /* synthetic */ vi0[] q = null;

    static {
        vi0 r0 = new vi0("PREFER_ARGB_8888", 0);
        n = r0;
        vi0 r1 = new vi0("PREFER_RGB_565", 1);
        o = r1;
        q = new vi0[]{r0, r1};
        p = r0;
    }

    public static vi0 valueOf(String r1) {
        return (vi0) Enum.valueOf(vi0.class, r1);
    }

    public static vi0[] values() {
        return (vi0[]) q.clone();
    }
}
