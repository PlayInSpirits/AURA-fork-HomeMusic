package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum qx4 extends Enum {
    public static final qx4 n = null;
    public static final qx4 o = null;
    public static final qx4 p = null;
    public static final /* synthetic */ qx4[] q = null;

    static {
        qx4 r0 = new qx4("ContinueTraversal", 0);
        n = r0;
        qx4 r1 = new qx4("SkipSubtreeAndContinueTraversal", 1);
        o = r1;
        qx4 r2 = new qx4("CancelTraversal", 2);
        p = r2;
        q = new qx4[]{r0, r1, r2};
    }

    public static qx4 valueOf(String r1) {
        return (qx4) Enum.valueOf(qx4.class, r1);
    }

    public static qx4[] values() {
        return (qx4[]) q.clone();
    }
}
