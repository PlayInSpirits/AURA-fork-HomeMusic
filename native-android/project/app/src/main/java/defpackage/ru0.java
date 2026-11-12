package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum ru0 extends Enum {
    public static final ru0 n = null;
    public static final ru0 o = null;
    public static final ru0 p = null;
    public static final /* synthetic */ ru0[] q = null;

    static {
        ru0 r0 = new ru0("Yes", 0);
        n = r0;
        ru0 r1 = new ru0("No", 1);
        o = r1;
        ru0 r2 = new ru0("NotInitialized", 2);
        p = r2;
        q = new ru0[]{r0, r1, r2};
    }

    public static ru0 valueOf(String r1) {
        return (ru0) Enum.valueOf(ru0.class, r1);
    }

    public static ru0[] values() {
        return (ru0[]) q.clone();
    }
}
