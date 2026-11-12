package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q93 extends e22 {
    public static final q93 f = null;

    static {
        f = new q93(0, 2, 1);
    }

    @Override // defpackage.e22
    public final void d(x20 r2, bi r3, lg4 r4, uy3 r5, wa3 r6) {
        l02 r1 = (l02) r2.d(1);
        if (r1 == null) goto L5;
        int r7 = r1.a;
    L6:
        w00 r8 = (w00) r2.d(0);
        if (r7 <= 0) goto L9;
        j83 r0 = new j83();
        r0.p = r3;
        r0.n = r7;
        r3 = r0;
    L9:
        if (r6 == null) goto L11;
        hd5 r9 = new hd5(16, r6, r4);
    L12:
        r8.C(r3, r4, r5, r9);
        return;
    L11:
        r9 = null;
        goto L12
    L5:
        r7 = 0;
        goto L6
    }
}
