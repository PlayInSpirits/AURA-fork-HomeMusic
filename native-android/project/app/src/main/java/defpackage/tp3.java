package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum tp3 extends Enum {
    public static final tp3 n = null;
    public static final /* synthetic */ tp3[] o = null;

    static {
        tp3 r0 = new tp3("SRGB", 0);
        tp3 r1 = new tp3("DISPLAY_P3", 1);
        n = r1;
        o = new tp3[]{r0, r1};
    }

    public static tp3 valueOf(String r1) {
        return (tp3) Enum.valueOf(tp3.class, r1);
    }

    public static tp3[] values() {
        return (tp3[]) o.clone();
    }
}
