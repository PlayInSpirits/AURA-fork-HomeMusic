package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum r62 extends Enum {
    public static final r62 n = null;
    public static final r62 o = null;
    public static final /* synthetic */ r62[] p = null;

    static {
        r62 r0 = new r62("Ltr", 0);
        n = r0;
        r62 r1 = new r62("Rtl", 1);
        o = r1;
        p = new r62[]{r0, r1};
    }

    public static r62 valueOf(String r1) {
        return (r62) Enum.valueOf(r62.class, r1);
    }

    public static r62[] values() {
        return (r62[]) p.clone();
    }
}
