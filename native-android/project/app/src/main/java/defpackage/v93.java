package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v93 extends e22 {
    public static final v93 f = null;

    static {
        f = new v93(0, 1, 1);
    }

    @Override // defpackage.e22
    public final void d(x20 r1, bi r2, lg4 r3, uy3 r4, wa3 r5) {
        int r0 = 0;
        Object[] r6 = (Object[]) r1.d(0);
        int r7 = r6.length;
    L3:
        if (r0 >= r7) goto L5;
        r2.b(r6[r0]);
        r0 = r0 + 1;
        goto L3
    }
}
