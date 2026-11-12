package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum hf2 extends Enum {
    public static final hf2 n = null;
    public static final hf2 o = null;
    public static final hf2 p = null;
    public static final /* synthetic */ hf2[] q = null;

    static {
        hf2 r0 = new hf2("IsPlacedInLookahead", 0);
        n = r0;
        hf2 r1 = new hf2("IsPlacedInApproach", 1);
        o = r1;
        hf2 r2 = new hf2("IsNotPlaced", 2);
        p = r2;
        q = new hf2[]{r0, r1, r2};
    }

    public static hf2 valueOf(String r1) {
        return (hf2) Enum.valueOf(hf2.class, r1);
    }

    public static hf2[] values() {
        return (hf2[]) q.clone();
    }
}
