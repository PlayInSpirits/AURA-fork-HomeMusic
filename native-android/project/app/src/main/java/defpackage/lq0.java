package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum lq0 extends Enum {
    public static final lq0 n = null;
    public static final lq0 o = null;
    public static final lq0 p = null;
    public static final /* synthetic */ lq0[] q = null;

    static {
        lq0 r0 = new lq0("Vertical", 0);
        n = r0;
        lq0 r1 = new lq0("Horizontal", 1);
        o = r1;
        lq0 r2 = new lq0("Both", 2);
        p = r2;
        q = new lq0[]{r0, r1, r2};
    }

    public static lq0 valueOf(String r1) {
        return (lq0) Enum.valueOf(lq0.class, r1);
    }

    public static lq0[] values() {
        return (lq0[]) q.clone();
    }
}
