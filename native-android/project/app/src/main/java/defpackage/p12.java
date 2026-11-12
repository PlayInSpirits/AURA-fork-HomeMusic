package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum p12 extends Enum {
    public static final p12 n = null;
    public static final p12 o = null;
    public static final p12 p = null;
    public static final p12 q = null;
    public static final /* synthetic */ p12[] r = null;

    static {
        p12 r0 = new p12("IGNORED", 0);
        n = r0;
        p12 r1 = new p12("SCHEDULED", 1);
        o = r1;
        p12 r2 = new p12("DEFERRED", 2);
        p = r2;
        p12 r3 = new p12("IMMINENT", 3);
        q = r3;
        r = new p12[]{r0, r1, r2, r3};
    }

    public static p12 valueOf(String r1) {
        return (p12) Enum.valueOf(p12.class, r1);
    }

    public static p12[] values() {
        return (p12[]) r.clone();
    }
}
