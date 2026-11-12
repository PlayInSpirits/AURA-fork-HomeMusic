package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum hb3 extends Enum {
    public static final hb3 n = null;
    public static final hb3 o = null;
    public static final /* synthetic */ hb3[] p = null;

    static {
        hb3 r0 = new hb3("Vertical", 0);
        n = r0;
        hb3 r1 = new hb3("Horizontal", 1);
        o = r1;
        p = new hb3[]{r0, r1};
    }

    public static hb3 valueOf(String r1) {
        return (hb3) Enum.valueOf(hb3.class, r1);
    }

    public static hb3[] values() {
        return (hb3[]) p.clone();
    }
}
