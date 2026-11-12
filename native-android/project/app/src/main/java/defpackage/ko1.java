package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum ko1 extends Enum {
    public static final ko1 n = null;
    public static final ko1 o = null;
    public static final ko1 p = null;
    public static final /* synthetic */ ko1[] q = null;

    static {
        ko1 r0 = new ko1("NONE", 0);
        n = r0;
        ko1 r1 = new ko1("PENDING", 1);
        o = r1;
        ko1 r2 = new ko1("ON_PHONE", 2);
        p = r2;
        q = new ko1[]{r0, r1, r2};
    }

    public static ko1 valueOf(String r1) {
        return (ko1) Enum.valueOf(ko1.class, r1);
    }

    public static ko1[] values() {
        return (ko1[]) q.clone();
    }
}
