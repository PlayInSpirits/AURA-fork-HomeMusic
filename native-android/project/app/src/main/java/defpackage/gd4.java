package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum gd4 extends Enum {
    public static final gd4 n = null;
    public static final gd4 o = null;
    public static final gd4 p = null;
    public static final /* synthetic */ gd4[] q = null;

    static {
        gd4 r0 = new gd4("START", 0);
        n = r0;
        gd4 r1 = new gd4("STOP", 1);
        o = r1;
        gd4 r2 = new gd4("STOP_AND_RESET_REPLAY_CACHE", 2);
        p = r2;
        q = new gd4[]{r0, r1, r2};
    }

    public static gd4 valueOf(String r1) {
        return (gd4) Enum.valueOf(gd4.class, r1);
    }

    public static gd4[] values() {
        return (gd4[]) q.clone();
    }
}
