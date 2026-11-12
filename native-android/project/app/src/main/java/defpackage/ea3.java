package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ea3 extends e22 {
    public static final ea3 f = null;

    static {
        f = new ea3(0, 3, 1);
    }

    @Override // defpackage.e22
    public final void d(x20 r7, bi r8, lg4 r9, uy3 r10, wa3 r11) {
        ig4 r0 = (ig4) r7.d(1);
        mg1 r2 = (mg1) r7.d(0);
        p71 r12 = (p71) r7.d(2);
        lg4 r3 = r0.e();
        if (r11 != null) goto L16;
        hd5 r4 = null;
    L9:
        if (r12.e.w0() == true) goto L11;
        l80.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");     // Catch: Throwable -> L5
    L11:
        r12.d.v0(r8, r3, r10, r4);     // Catch: Throwable -> L5
        r3.e(true);
        r9.d();
        r2.getClass();
        r9.A(r0, r0.a(r2));
        r9.k();
        return;
    L5:
        th = move-exception;
        r3.e(false);
        throw th;
    L16:
        r4 = new hd5(16, r11, r9);     // Catch: Throwable -> L5
        goto L9
    }
}
