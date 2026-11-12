package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum wv extends Enum {
    public static final wv n = null;
    public static final wv o = null;
    public static final wv p = null;
    public static final /* synthetic */ wv[] q = null;

    static {
        wv r0 = new wv("SUSPEND", 0);
        n = r0;
        wv r1 = new wv("DROP_OLDEST", 1);
        o = r1;
        wv r2 = new wv("DROP_LATEST", 2);
        p = r2;
        q = new wv[]{r0, r1, r2};
    }

    public static wv valueOf(String r1) {
        return (wv) Enum.valueOf(wv.class, r1);
    }

    public static wv[] values() {
        return (wv[]) q.clone();
    }
}
