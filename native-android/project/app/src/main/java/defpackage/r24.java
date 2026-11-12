package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum r24 extends Enum {
    public static final r24 n = null;
    public static final r24 o = null;
    public static final r24 p = null;
    public static final /* synthetic */ r24[] q = null;

    static {
        r24 r0 = new r24("AUTOMATIC", 0);
        n = r0;
        r24 r1 = new r24("TRUNCATE", 1);
        o = r1;
        r24 r2 = new r24("WRITE_AHEAD_LOGGING", 2);
        p = r2;
        q = new r24[]{r0, r1, r2};
    }

    public static r24 valueOf(String r1) {
        return (r24) Enum.valueOf(r24.class, r1);
    }

    public static r24[] values() {
        return (r24[]) q.clone();
    }
}
