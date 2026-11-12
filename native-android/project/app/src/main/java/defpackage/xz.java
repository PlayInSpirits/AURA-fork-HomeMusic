package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum xz extends Enum {
    public static final xz n = null;
    public static final xz o = null;
    public static final xz p = null;
    public static final xz q = null;
    public static final /* synthetic */ xz[] r = null;

    static {
        xz r0 = new xz("EMPTY", 0);
        n = r0;
        xz r1 = new xz("RETRY", 1);
        o = r1;
        xz r2 = new xz("ACCEPTED", 2);
        p = r2;
        xz r3 = new xz("REFUSED", 3);
        q = r3;
        r = new xz[]{r0, r1, r2, r3};
    }

    public static xz valueOf(String r1) {
        return (xz) Enum.valueOf(xz.class, r1);
    }

    public static xz[] values() {
        return (xz[]) r.clone();
    }
}
