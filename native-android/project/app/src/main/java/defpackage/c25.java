package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum c25 extends Enum {
    public static final c25 n = null;
    public static final c25 o = null;
    public static final c25 p = null;
    public static final /* synthetic */ c25[] q = null;

    static {
        c25 r0 = new c25("FAIL", 0);
        n = r0;
        c25 r1 = new c25("FULL_NOW", 1);
        o = r1;
        c25 r2 = new c25("ASK_FULL", 2);
        p = r2;
        q = new c25[]{r0, r1, r2};
    }

    public static c25 valueOf(String r1) {
        return (c25) Enum.valueOf(c25.class, r1);
    }

    public static c25[] values() {
        return (c25[]) q.clone();
    }
}
