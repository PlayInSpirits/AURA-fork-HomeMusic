package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum cr3 extends Enum {
    public static final cr3 n = null;
    public static final cr3 o = null;
    public static final cr3 p = null;
    public static final /* synthetic */ cr3[] q = null;

    static {
        cr3 r0 = new cr3("PASS_THROUGH", 0);
        n = r0;
        cr3 r1 = new cr3("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        o = r1;
        cr3 r2 = new cr3("DISCARDING", 2);
        p = r2;
        q = new cr3[]{r0, r1, r2};
    }

    public static cr3 valueOf(String r1) {
        return (cr3) Enum.valueOf(cr3.class, r1);
    }

    public static cr3[] values() {
        return (cr3[]) q.clone();
    }
}
