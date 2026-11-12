package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum mu4 extends Enum {
    public static final xi4 o = null;
    public static final mu4 p = null;
    public static final mu4 q = null;
    public static final mu4 r = null;
    public static final mu4 s = null;
    public static final mu4 t = null;
    public static final /* synthetic */ mu4[] u = null;
    public final String n;

    static {
        mu4 r0 = new mu4(0, "TLS_1_3", "TLSv1.3");
        p = r0;
        mu4 r1 = new mu4(1, "TLS_1_2", "TLSv1.2");
        q = r1;
        mu4 r2 = new mu4(2, "TLS_1_1", "TLSv1.1");
        r = r2;
        mu4 r3 = new mu4(3, "TLS_1_0", "TLSv1");
        s = r3;
        mu4 r4 = new mu4(4, "SSL_3_0", "SSLv3");
        t = r4;
        u = new mu4[]{r0, r1, r2, r3, r4};
        o = new xi4(20);
    }

    public mu4(int r1, String r2, String r3) {
        super(r2, r1);
        this.n = r3;
    }

    public static mu4 valueOf(String r1) {
        return (mu4) Enum.valueOf(mu4.class, r1);
    }

    public static mu4[] values() {
        return (mu4[]) u.clone();
    }
}
