package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum n12 extends Enum {
    public static final n12 n = null;
    public static final n12 o = null;
    public static final n12 p = null;
    public static final n12 q = null;
    public static final /* synthetic */ n12[] r = null;

    static {
        n12 r0 = new n12("LookaheadMeasurement", 0);
        n = r0;
        n12 r1 = new n12("LookaheadPlacement", 1);
        o = r1;
        n12 r2 = new n12("Measurement", 2);
        p = r2;
        n12 r3 = new n12("Placement", 3);
        q = r3;
        r = new n12[]{r0, r1, r2, r3};
    }

    public static n12 valueOf(String r1) {
        return (n12) Enum.valueOf(n12.class, r1);
    }

    public static n12[] values() {
        return (n12[]) r.clone();
    }
}
