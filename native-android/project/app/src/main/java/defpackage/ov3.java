package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum ov3 extends Enum {
    public static final ov3 n = null;
    public static final ov3 o = null;
    public static final ov3 p = null;
    public static final ov3 q = null;
    public static final ov3 r = null;
    public static final ov3 s = null;
    public static final /* synthetic */ ov3[] t = null;

    static {
        ov3 r0 = new ov3("ShutDown", 0);
        n = r0;
        ov3 r1 = new ov3("ShuttingDown", 1);
        o = r1;
        ov3 r2 = new ov3("Inactive", 2);
        p = r2;
        ov3 r3 = new ov3("InactivePendingWork", 3);
        q = r3;
        ov3 r4 = new ov3("Idle", 4);
        r = r4;
        ov3 r5 = new ov3("PendingWork", 5);
        s = r5;
        t = new ov3[]{r0, r1, r2, r3, r4, r5};
    }

    public static ov3 valueOf(String r1) {
        return (ov3) Enum.valueOf(ov3.class, r1);
    }

    public static ov3[] values() {
        return (ov3[]) t.clone();
    }
}
