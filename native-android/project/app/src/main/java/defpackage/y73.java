package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum y73 extends Enum {
    public static final y73 n = null;
    public static final y73 o = null;
    public static final y73 p = null;
    public static final /* synthetic */ y73[] q = null;

    static {
        y73 r0 = new y73("NO_OP", 0);
        n = r0;
        y73 r1 = new y73("ADD", 1);
        o = r1;
        y73 r2 = new y73("REMOVE", 2);
        p = r2;
        q = new y73[]{r0, r1, r2};
    }

    public static y73 valueOf(String r1) {
        return (y73) Enum.valueOf(y73.class, r1);
    }

    public static y73[] values() {
        return (y73[]) q.clone();
    }
}
