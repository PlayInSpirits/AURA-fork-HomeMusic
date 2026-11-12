package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum y74 extends Enum {
    public static final y74 n = null;
    public static final y74 o = null;
    public static final y74 p = null;
    public static final y74 q = null;
    public static final /* synthetic */ y74[] r = null;

    static {
        y74 r0 = new y74("HIDING", 0);
        n = r0;
        y74 r1 = new y74("HIDDEN", 1);
        o = r1;
        y74 r2 = new y74("SHOWING", 2);
        p = r2;
        y74 r3 = new y74("SHOWN", 3);
        q = r3;
        r = new y74[]{r0, r1, r2, r3};
    }

    public static y74 valueOf(String r1) {
        return (y74) Enum.valueOf(y74.class, r1);
    }

    public static y74[] values() {
        return (y74[]) r.clone();
    }
}
