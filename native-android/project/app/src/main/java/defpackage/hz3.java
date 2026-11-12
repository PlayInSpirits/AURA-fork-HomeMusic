package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum hz3 extends Enum {
    public static final hz3 n = null;
    public static final hz3 o = null;
    public static final /* synthetic */ hz3[] p = null;

    static {
        hz3 r0 = new hz3("Restart", 0);
        n = r0;
        hz3 r1 = new hz3("Reverse", 1);
        o = r1;
        p = new hz3[]{r0, r1};
    }

    public static hz3 valueOf(String r1) {
        return (hz3) Enum.valueOf(hz3.class, r1);
    }

    public static hz3[] values() {
        return (hz3[]) p.clone();
    }
}
