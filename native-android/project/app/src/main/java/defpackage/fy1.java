package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum fy1 extends Enum {
    public static final fy1 n = null;
    public static final fy1 o = null;
    public static final fy1 p = null;
    public static final /* synthetic */ fy1[] q = null;

    static {
        fy1 r0 = new fy1("Yes", 0);
        n = r0;
        fy1 r1 = new fy1("No", 1);
        o = r1;
        fy1 r2 = new fy1("NotInitialized", 2);
        p = r2;
        q = new fy1[]{r0, r1, r2};
    }

    public static fy1 valueOf(String r1) {
        return (fy1) Enum.valueOf(fy1.class, r1);
    }

    public static fy1[] values() {
        return (fy1[]) q.clone();
    }
}
