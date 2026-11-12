package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cv extends cx2 implements zu, o62 {
    public gd0 B;
    public boolean C;

    public static final wv3 q0(cv r4, f63 r5, fa r6) {
        if (r4.A == true) goto L6;
    L16:
        return null;
    L6:
        if (r4.C == false) goto L16;
        f63 r7 = j51.N(r4);
        if (r5.A0().A == true) goto L12;
        r5 = null;
    L12:
        if (r5 == null) goto L16;
        wv3 r8 = (wv3) r6.invoke();
        if (r8 == null) goto L16;
        wv3 r9 = r7.C(r5, false);
        float r10 = r9.a;
        float r11 = r9.b;
        long r0 = Float.floatToRawIntBits(r10);
        return r8.f((((long) Float.floatToRawIntBits(r11)) & 4294967295L) | (r0 << 32));
    }

    @Override // defpackage.o62
    public final void e(q62 r1) {
        this.C = true;
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.zu
    public final Object k(f63 r7, fa r8, ep4 r9) {
        Object r6 = te5.j(new bv(this, r7, r8, new jo(this, r7, r8, 1), null), r9);
        if (r6 != xe0.n) goto L6;
        return r6;
    L6:
        return j15.a;
    }
}
