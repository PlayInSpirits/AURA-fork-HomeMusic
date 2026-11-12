package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum ue0 extends Enum {
    public static final ue0 n = null;
    public static final ue0 o = null;
    public static final ue0 p = null;
    public static final ue0 q = null;
    public static final ue0 r = null;
    public static final /* synthetic */ ue0[] s = null;

    static {
        ue0 r0 = new ue0("CPU_ACQUIRED", 0);
        n = r0;
        ue0 r1 = new ue0("BLOCKING", 1);
        o = r1;
        ue0 r2 = new ue0("PARKING", 2);
        p = r2;
        ue0 r3 = new ue0("DORMANT", 3);
        q = r3;
        ue0 r4 = new ue0("TERMINATED", 4);
        r = r4;
        s = new ue0[]{r0, r1, r2, r3, r4};
    }

    public static ue0 valueOf(String r1) {
        return (ue0) Enum.valueOf(ue0.class, r1);
    }

    public static ue0[] values() {
        return (ue0[]) s.clone();
    }
}
