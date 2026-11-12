package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum qu4 extends Enum {
    public static final qu4 n = null;
    public static final qu4 o = null;
    public static final /* synthetic */ qu4[] p = null;

    static {
        qu4 r0 = new qu4("On", 0);
        n = r0;
        qu4 r1 = new qu4("Off", 1);
        o = r1;
        p = new qu4[]{r0, r1, new qu4("Indeterminate", 2)};
    }

    public static qu4 valueOf(String r1) {
        return (qu4) Enum.valueOf(qu4.class, r1);
    }

    public static qu4[] values() {
        return (qu4[]) p.clone();
    }
}
