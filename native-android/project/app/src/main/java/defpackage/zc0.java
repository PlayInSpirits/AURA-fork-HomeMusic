package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum zc0 extends Enum {
    public static final zc0 n = null;
    public static final zc0 o = null;
    public static final /* synthetic */ zc0[] p = null;

    static {
        zc0 r0 = new zc0("VIEW_APPEAR", 0);
        n = r0;
        zc0 r1 = new zc0("VIEW_DISAPPEAR", 1);
        o = r1;
        p = new zc0[]{r0, r1};
    }

    public static zc0 valueOf(String r1) {
        return (zc0) Enum.valueOf(zc0.class, r1);
    }

    public static zc0[] values() {
        return (zc0[]) p.clone();
    }
}
