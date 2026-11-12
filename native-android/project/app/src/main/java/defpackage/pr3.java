package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum pr3 extends Enum {
    public static final hh3 o = null;
    public static final pr3 p = null;
    public static final pr3 q = null;
    public static final pr3 r = null;
    public static final pr3 s = null;
    public static final pr3 t = null;
    public static final pr3 u = null;
    public static final pr3 v = null;
    public static final /* synthetic */ pr3[] w = null;
    public final String n;

    static {
        pr3 r0 = new pr3(0, "HTTP_1_0", "http/1.0");
        p = r0;
        pr3 r1 = new pr3(1, "HTTP_1_1", "http/1.1");
        q = r1;
        pr3 r2 = new pr3(2, "SPDY_3", "spdy/3.1");
        r = r2;
        pr3 r3 = new pr3(3, "HTTP_2", "h2");
        s = r3;
        pr3 r4 = new pr3(4, "H2_PRIOR_KNOWLEDGE", "h2_prior_knowledge");
        t = r4;
        pr3 r5 = new pr3(5, "QUIC", "quic");
        u = r5;
        pr3 r6 = new pr3(6, "HTTP_3", "h3");
        v = r6;
        w = new pr3[]{r0, r1, r2, r3, r4, r5, r6};
        o = new hh3(7);
    }

    public pr3(int r1, String r2, String r3) {
        super(r2, r1);
        this.n = r3;
    }

    public static pr3 valueOf(String r1) {
        return (pr3) Enum.valueOf(pr3.class, r1);
    }

    public static pr3[] values() {
        return (pr3[]) w.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.n;
    }
}
