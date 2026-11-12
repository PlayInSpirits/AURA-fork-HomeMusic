package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum ln3 extends Enum {
    public static final ln3 n = null;
    public static final ln3 o = null;
    public static final ln3 p = null;
    public static final /* synthetic */ ln3[] q = null;

    static {
        ln3 r0 = new ln3("Initial", 0);
        n = r0;
        ln3 r1 = new ln3("Main", 1);
        o = r1;
        ln3 r2 = new ln3("Final", 2);
        p = r2;
        q = new ln3[]{r0, r1, r2};
    }

    public static ln3 valueOf(String r1) {
        return (ln3) Enum.valueOf(ln3.class, r1);
    }

    public static ln3[] values() {
        return (ln3[]) q.clone();
    }
}
