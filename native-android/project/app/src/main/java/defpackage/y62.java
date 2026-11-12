package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum y62 extends Enum {
    public static final y62 n = null;
    public static final y62 o = null;
    public static final y62 p = null;
    public static final y62 q = null;
    public static final y62 r = null;
    public static final /* synthetic */ y62[] s = null;

    static {
        y62 r0 = new y62("Measuring", 0);
        n = r0;
        y62 r1 = new y62("LookaheadMeasuring", 1);
        o = r1;
        y62 r2 = new y62("LayingOut", 2);
        p = r2;
        y62 r3 = new y62("LookaheadLayingOut", 3);
        q = r3;
        y62 r4 = new y62("Idle", 4);
        r = r4;
        s = new y62[]{r0, r1, r2, r3, r4};
    }

    public static y62 valueOf(String r1) {
        return (y62) Enum.valueOf(y62.class, r1);
    }

    public static y62[] values() {
        return (y62[]) s.clone();
    }
}
