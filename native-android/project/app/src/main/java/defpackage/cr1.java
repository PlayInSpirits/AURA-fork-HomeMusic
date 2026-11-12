package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum cr1 extends Enum {
    public static final cr1 n = null;
    public static final cr1 o = null;
    public static final cr1 p = null;
    public static final /* synthetic */ cr1[] q = null;

    static {
        cr1 r0 = new cr1("NONE", 0);
        n = r0;
        cr1 r1 = new cr1("BASIC", 1);
        cr1 r2 = new cr1("HEADERS", 2);
        o = r2;
        cr1 r3 = new cr1("BODY", 3);
        p = r3;
        q = new cr1[]{r0, r1, r2, r3};
    }

    public static cr1 valueOf(String r1) {
        return (cr1) Enum.valueOf(cr1.class, r1);
    }

    public static cr1[] values() {
        return (cr1[]) q.clone();
    }
}
