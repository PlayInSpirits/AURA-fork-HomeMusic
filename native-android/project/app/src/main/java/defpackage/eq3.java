package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum eq3 extends Enum {
    public static final eq3 n = null;
    public static final eq3 o = null;
    public static final eq3 p = null;
    public static final eq3 q = null;
    public static final /* synthetic */ eq3[] r = null;

    static {
        eq3 r0 = new eq3("IMMEDIATE", 0);
        n = r0;
        eq3 r1 = new eq3("HIGH", 1);
        o = r1;
        eq3 r2 = new eq3("NORMAL", 2);
        p = r2;
        eq3 r3 = new eq3("LOW", 3);
        q = r3;
        r = new eq3[]{r0, r1, r2, r3};
    }

    public static eq3 valueOf(String r1) {
        return (eq3) Enum.valueOf(eq3.class, r1);
    }

    public static eq3[] values() {
        return (eq3[]) r.clone();
    }
}
