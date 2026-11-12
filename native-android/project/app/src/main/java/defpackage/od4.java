package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum od4 extends Enum {
    public static final hh3 n = null;
    public static final od4 o = null;
    public static final od4 p = null;
    public static final od4 q = null;
    public static final /* synthetic */ od4[] r = null;

    static {
        od4 r0 = new od4("OFF", 0);
        o = r0;
        od4 r1 = new od4("SHUFFLE", 1);
        p = r1;
        od4 r2 = new od4("SMART", 2);
        q = r2;
        r = new od4[]{r0, r1, r2};
        n = new hh3(28);
    }

    public static od4 valueOf(String r1) {
        return (od4) Enum.valueOf(od4.class, r1);
    }

    public static od4[] values() {
        return (od4[]) r.clone();
    }
}
