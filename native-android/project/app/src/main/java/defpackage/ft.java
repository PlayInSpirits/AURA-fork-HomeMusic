package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ft extends cx2 implements u62, g94 {
    public if1 B;

    @Override // defpackage.g94
    public final boolean c() {
        return false;
    }

    @Override // defpackage.g94
    public final void c0(q94 r5) {
        f63 r0 = j51.M(this, 2);
        if (r0.a0 == true) goto L18;
        b24 r1 = au0.w;
        if (r1 != null) goto L7;
        au0.w = new b24();
    L8:
        b24 r2 = au0.w;
        r2.getClass();
        r2.z = r0.H.J;
        r2.x = l93.o0(r0.p);
        ch4 r3 = ya4.t();
        if (r3 == null) goto L11;
        if1 r4 = r3.e();
    L12:
        ch4 r6 = ya4.z(r3);
        this.B.invoke(r2);     // Catch: Throwable -> L15
        ya4.H(r3, r6, r4);
        ac4 r7 = r2.v;
        boolean r8 = r2.w;
    L19:
        if (r8 == true) goto L21;
        return;
    L21:
        o94.b(r5, r7);
        return;
    L15:
        th = move-exception;
        ya4.H(r3, r6, r4);
        throw th;
    L11:
        r4 = null;
        goto L12
    L7:
        r1.a();
        goto L8
    L18:
        r7 = r0.W;
        r8 = r0.Z;
        goto L19
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 r3, pi2 r4, long r5) {
        jg3 r6 = r4.r(r5);
        int r7 = r6.n;
        int r8 = r6.o;
        o r0 = new o(2, r6, this);
        return r3.v(r7, r8, v01.n, r0);
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.B + ")";
    }
}
