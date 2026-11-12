package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum ug0 extends Enum {
    public static final ug0 n = null;
    public static final ug0 o = null;
    public static final ug0 p = null;
    public static final /* synthetic */ ug0[] q = null;

    static {
        ug0 r0 = new ug0("None", 0);
        n = r0;
        ug0 r1 = new ug0("Cancelled", 1);
        o = r1;
        ug0 r2 = new ug0("Redirected", 2);
        p = r2;
        q = new ug0[]{r0, r1, r2, new ug0("RedirectCancelled", 3)};
    }

    public static ug0 valueOf(String r1) {
        return (ug0) Enum.valueOf(ug0.class, r1);
    }

    public static ug0[] values() {
        return (ug0[]) q.clone();
    }
}
