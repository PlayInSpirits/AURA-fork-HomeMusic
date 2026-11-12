package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ds3 {
    public static final yw a = null;

    static {
        yw r0 = yw.q;
        a = pa.t("xn--");
    }

    public static int a(int r0, int r1, boolean r2) {
        if (r2 == false) goto L4;
        int r3 = r0 / 700;
    L5:
        int r4 = (r3 / r1) + r3;
        int r5 = 0;
    L7:
        if (r4 <= 455) goto L10;
        r4 = r4 / 35;
        r5 = r5 + 36;
        goto L7
    L10:
        return ((r4 * 36) / (r4 + 38)) + r5;
    L4:
        r3 = r0 / 2;
        goto L5
    }

    public static int b(int r3) {
        if (r3 >= 26) goto L7;
        return r3 + 97;
    L7:
        if (r3 >= 36) goto L11;
        return r3 + 22;
    L11:
        throw new IllegalStateException(("unexpected digit: " + r3).toString());
    }
}
