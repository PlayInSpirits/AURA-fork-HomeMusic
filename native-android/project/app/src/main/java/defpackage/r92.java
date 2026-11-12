package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum r92 extends Enum {
    public static final r92 n = null;
    public static final r92 o = null;
    public static final r92 p = null;
    public static final r92 q = null;
    public static final r92 r = null;
    public static final /* synthetic */ r92[] s = null;

    static {
        r92 r0 = new r92("DESTROYED", 0);
        n = r0;
        r92 r1 = new r92("INITIALIZED", 1);
        o = r1;
        r92 r2 = new r92("CREATED", 2);
        p = r2;
        r92 r3 = new r92("STARTED", 3);
        q = r3;
        r92 r4 = new r92("RESUMED", 4);
        r = r4;
        s = new r92[]{r0, r1, r2, r3, r4};
    }

    public static r92 valueOf(String r1) {
        return (r92) Enum.valueOf(r92.class, r1);
    }

    public static r92[] values() {
        return (r92[]) s.clone();
    }
}
