package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum ze0 extends Enum {
    public static final ze0 n = null;
    public static final ze0 o = null;
    public static final ze0 p = null;
    public static final ze0 q = null;
    public static final /* synthetic */ ze0[] r = null;

    static {
        ze0 r0 = new ze0("DEFAULT", 0);
        n = r0;
        ze0 r1 = new ze0("LAZY", 1);
        o = r1;
        ze0 r2 = new ze0("ATOMIC", 2);
        p = r2;
        ze0 r3 = new ze0("UNDISPATCHED", 3);
        q = r3;
        r = new ze0[]{r0, r1, r2, r3};
    }

    public static ze0 valueOf(String r1) {
        return (ze0) Enum.valueOf(ze0.class, r1);
    }

    public static ze0[] values() {
        return (ze0[]) r.clone();
    }
}
