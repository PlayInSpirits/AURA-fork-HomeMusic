package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum r42 extends Enum {
    public static final r42 n = null;
    public static final r42 o = null;
    public static final r42 p = null;
    public static final r42 q = null;
    public static final r42 r = null;
    public static final /* synthetic */ r42[] s = null;

    static {
        r42 r0 = new r42("IDENTITY", 0);
        n = r0;
        r42 r1 = new r42("CONNECT", 1);
        o = r1;
        r42 r2 = new r42("TLS", 2);
        p = r2;
        r42 r3 = new r42("VERIFY", 3);
        q = r3;
        r42 r4 = new r42("RESPONSE", 4);
        r = r4;
        s = new r42[]{r0, r1, r2, r3, r4};
    }

    public static r42 valueOf(String r1) {
        return (r42) Enum.valueOf(r42.class, r1);
    }

    public static r42[] values() {
        return (r42[]) s.clone();
    }
}
