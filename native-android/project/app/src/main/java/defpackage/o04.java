package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum o04 extends Enum {
    public static final o04 n = null;
    public static final o04 o = null;
    public static final /* synthetic */ o04[] p = null;

    static {
        o04 r0 = new o04("Ltr", 0);
        n = r0;
        o04 r1 = new o04("Rtl", 1);
        o = r1;
        p = new o04[]{r0, r1};
    }

    public static o04 valueOf(String r1) {
        return (o04) Enum.valueOf(o04.class, r1);
    }

    public static o04[] values() {
        return (o04[]) p.clone();
    }
}
