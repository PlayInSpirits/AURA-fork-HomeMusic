package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum h13 extends Enum {
    public static final h13 n = null;
    public static final h13 o = null;
    public static final /* synthetic */ h13[] p = null;

    static {
        h13 r0 = new h13("Default", 0);
        n = r0;
        h13 r1 = new h13("UserInput", 1);
        o = r1;
        p = new h13[]{r0, r1, new h13("PreventUserInput", 2)};
    }

    public static h13 valueOf(String r1) {
        return (h13) Enum.valueOf(h13.class, r1);
    }

    public static h13[] values() {
        return (h13[]) p.clone();
    }
}
