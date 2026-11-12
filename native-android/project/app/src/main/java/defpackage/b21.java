package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum b21 extends Enum {
    public static final om0 o = null;
    public static final b21 p = null;
    public static final b21 q = null;
    public static final b21 r = null;
    public static final b21 s = null;
    public static final b21 t = null;
    public static final b21 u = null;
    public static final /* synthetic */ b21[] v = null;
    public final int n;

    static {
        b21 r0 = new b21("NO_ERROR", 0, 0);
        p = r0;
        b21 r1 = new b21("PROTOCOL_ERROR", 1, 1);
        q = r1;
        b21 r2 = new b21("INTERNAL_ERROR", 2, 2);
        r = r2;
        b21 r3 = new b21("FLOW_CONTROL_ERROR", 3, 3);
        s = r3;
        b21 r4 = new b21("SETTINGS_TIMEOUT", 4, 4);
        b21 r5 = new b21("STREAM_CLOSED", 5, 5);
        b21 r6 = new b21("FRAME_SIZE_ERROR", 6, 6);
        b21 r7 = new b21("REFUSED_STREAM", 7, 7);
        t = r7;
        b21 r8 = new b21("CANCEL", 8, 8);
        u = r8;
        v = new b21[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, new b21("COMPRESSION_ERROR", 9, 9), new b21("CONNECT_ERROR", 10, 10), new b21("ENHANCE_YOUR_CALM", 11, 11), new b21("INADEQUATE_SECURITY", 12, 12), new b21("HTTP_1_1_REQUIRED", 13, 13)};
        o = new om0(27);
    }

    public b21(String r1, int r2, int r3) {
        super(r1, r2);
        this.n = r3;
    }

    public static b21 valueOf(String r1) {
        return (b21) Enum.valueOf(b21.class, r1);
    }

    public static b21[] values() {
        return (b21[]) v.clone();
    }
}
