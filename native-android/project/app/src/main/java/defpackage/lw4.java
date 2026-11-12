package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum lw4 extends Enum {
    public static final lw4 n = null;
    public static final lw4 o = null;
    public static final /* synthetic */ lw4[] p = null;

    static {
        lw4 r0 = new lw4("DEFERRED", 0);
        n = r0;
        lw4 r1 = new lw4("IMMEDIATE", 1);
        o = r1;
        p = new lw4[]{r0, r1, new lw4("EXCLUSIVE", 2)};
    }

    public static lw4 valueOf(String r1) {
        return (lw4) Enum.valueOf(lw4.class, r1);
    }

    public static lw4[] values() {
        return (lw4[]) p.clone();
    }
}
