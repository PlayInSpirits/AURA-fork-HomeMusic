package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum co1 extends Enum {
    public static final co1 n = null;
    public static final co1 o = null;
    public static final co1 p = null;
    public static final co1 q = null;
    public static final /* synthetic */ co1[] r = null;

    static {
        co1 r0 = new co1("SERVER", 0);
        n = r0;
        co1 r1 = new co1("ACCOUNT", 1);
        o = r1;
        co1 r2 = new co1("REGISTER", 2);
        p = r2;
        co1 r3 = new co1("EMAIL", 3);
        q = r3;
        r = new co1[]{r0, r1, r2, r3};
    }

    public static co1 valueOf(String r1) {
        return (co1) Enum.valueOf(co1.class, r1);
    }

    public static co1[] values() {
        return (co1[]) r.clone();
    }
}
