package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum fe3 extends Enum {
    public static final fe3 n = null;
    public static final /* synthetic */ fe3[] o = null;

    static {
        fe3 r0 = new fe3("CounterClockwise", 0);
        n = r0;
        o = new fe3[]{r0, new fe3("Clockwise", 1)};
    }

    public static fe3 valueOf(String r1) {
        return (fe3) Enum.valueOf(fe3.class, r1);
    }

    public static fe3[] values() {
        return (fe3[]) o.clone();
    }
}
