package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum c5 extends Enum {
    public static final c5 n = null;
    public static final c5 o = null;
    public static final /* synthetic */ c5[] p = null;

    static {
        c5 r0 = new c5("ALWAYS", 0);
        n = r0;
        c5 r1 = new c5("LAST", 1);
        o = r1;
        p = new c5[]{r0, r1};
    }

    public static c5 valueOf(String r1) {
        return (c5) Enum.valueOf(c5.class, r1);
    }

    public static c5[] values() {
        return (c5[]) p.clone();
    }
}
