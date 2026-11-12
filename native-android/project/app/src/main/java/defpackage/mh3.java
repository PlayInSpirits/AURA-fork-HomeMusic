package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum mh3 extends Enum {
    public static final mh3 n = null;
    public static final mh3 o = null;
    public static final mh3 p = null;
    public static final mh3 q = null;
    public static final mh3 r = null;
    public static final mh3 s = null;
    public static final /* synthetic */ mh3[] t = null;

    static {
        mh3 r0 = new mh3("SENT", 0);
        n = r0;
        mh3 r1 = new mh3("PARTIAL", 1);
        o = r1;
        mh3 r2 = new mh3("REFUSED", 2);
        p = r2;
        mh3 r3 = new mh3("TOO_LARGE", 3);
        q = r3;
        mh3 r4 = new mh3("RETRY", 4);
        r = r4;
        mh3 r5 = new mh3("NO_ENDPOINT", 5);
        s = r5;
        t = new mh3[]{r0, r1, r2, r3, r4, r5};
    }

    public static mh3 valueOf(String r1) {
        return (mh3) Enum.valueOf(mh3.class, r1);
    }

    public static mh3[] values() {
        return (mh3[]) t.clone();
    }
}
