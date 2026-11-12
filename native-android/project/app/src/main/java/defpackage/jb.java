package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum jb extends Enum {
    public static final jb n = null;
    public static final jb o = null;
    public static final /* synthetic */ jb[] p = null;

    static {
        jb r0 = new jb("SHOW_ORIGINAL", 0);
        n = r0;
        jb r1 = new jb("SHOW_TRANSLATED", 1);
        o = r1;
        p = new jb[]{r0, r1};
    }

    public static jb valueOf(String r1) {
        return (jb) Enum.valueOf(jb.class, r1);
    }

    public static jb[] values() {
        return (jb[]) p.clone();
    }
}
