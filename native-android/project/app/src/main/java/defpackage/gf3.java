package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum gf3 extends Enum {
    public static final gf3 n = null;
    public static final gf3 o = null;
    public static final gf3 p = null;
    public static final gf3 q = null;
    public static final gf3 r = null;
    public static final gf3 s = null;
    public static final gf3 t = null;
    public static final /* synthetic */ gf3[] u = null;

    static {
        gf3 r0 = new gf3("Invalid", 0);
        n = r0;
        gf3 r1 = new gf3("Cancelled", 1);
        o = r1;
        gf3 r2 = new gf3("InitialPending", 2);
        p = r2;
        gf3 r3 = new gf3("RecomposePending", 3);
        q = r3;
        gf3 r4 = new gf3("Recomposing", 4);
        r = r4;
        gf3 r5 = new gf3("ApplyPending", 5);
        s = r5;
        gf3 r6 = new gf3("Applied", 6);
        t = r6;
        u = new gf3[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static gf3 valueOf(String r1) {
        return (gf3) Enum.valueOf(gf3.class, r1);
    }

    public static gf3[] values() {
        return (gf3[]) u.clone();
    }
}
