package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum a72 extends Enum {
    public static final a72 n = null;
    public static final a72 o = null;
    public static final a72 p = null;
    public static final /* synthetic */ a72[] q = null;

    static {
        a72 r0 = new a72("InMeasureBlock", 0);
        n = r0;
        a72 r1 = new a72("InLayoutBlock", 1);
        o = r1;
        a72 r2 = new a72("NotUsed", 2);
        p = r2;
        q = new a72[]{r0, r1, r2};
    }

    public static a72 valueOf(String r1) {
        return (a72) Enum.valueOf(a72.class, r1);
    }

    public static a72[] values() {
        return (a72[]) q.clone();
    }
}
