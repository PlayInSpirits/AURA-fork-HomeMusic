package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum b92 extends Enum {
    public static final b92 n = null;
    public static final /* synthetic */ b92[] o = null;

    static {
        b92 r0 = new b92("SYNCHRONIZED", 0);
        b92 r1 = new b92("PUBLICATION", 1);
        b92 r2 = new b92("NONE", 2);
        n = r2;
        o = new b92[]{r0, r1, r2};
    }

    public static b92 valueOf(String r1) {
        return (b92) Enum.valueOf(b92.class, r1);
    }

    public static b92[] values() {
        return (b92[]) o.clone();
    }
}
