package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum ze1 extends Enum {
    public static final ze1 n = null;
    public static final ze1 o = null;
    public static final ze1 p = null;
    public static final ze1 q = null;
    public static final ze1 r = null;
    public static final /* synthetic */ ze1[] s = null;

    static {
        ze1 r0 = new ze1("ON_CONFIGURE", 0);
        n = r0;
        ze1 r1 = new ze1("ON_CREATE", 1);
        o = r1;
        ze1 r2 = new ze1("ON_UPGRADE", 2);
        p = r2;
        ze1 r3 = new ze1("ON_DOWNGRADE", 3);
        q = r3;
        ze1 r4 = new ze1("ON_OPEN", 4);
        r = r4;
        s = new ze1[]{r0, r1, r2, r3, r4};
    }

    public static ze1 valueOf(String r1) {
        return (ze1) Enum.valueOf(ze1.class, r1);
    }

    public static ze1[] values() {
        return (ze1[]) s.clone();
    }
}
