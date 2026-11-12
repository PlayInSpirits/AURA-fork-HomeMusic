package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum xe0 extends Enum {
    public static final xe0 n = null;
    public static final xe0 o = null;
    public static final xe0 p = null;
    public static final /* synthetic */ xe0[] q = null;

    static {
        xe0 r0 = new xe0("COROUTINE_SUSPENDED", 0);
        n = r0;
        xe0 r1 = new xe0("UNDECIDED", 1);
        o = r1;
        xe0 r2 = new xe0("RESUMED", 2);
        p = r2;
        q = new xe0[]{r0, r1, r2};
    }

    public static xe0 valueOf(String r1) {
        return (xe0) Enum.valueOf(xe0.class, r1);
    }

    public static xe0[] values() {
        return (xe0[]) q.clone();
    }
}
