package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gd3 implements y71 {
    public final wg4 a;
    public final lm0 b;

    public gd3(wg4 r1, lm0 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.y71
    public final Object a(c74 r6, float r7, vd0 r8) {
        if ((r8 instanceof fd3) == false) goto L7;
        fd3 r0 = (fd3) r8;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.p = r1 - Integer.MIN_VALUE;
    L8:
        Object r9 = r0.n;
        int r2 = r0.p;
        vd0 r3 = null;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        kb4.X(r9);
    L17:
        float r10 = ((Number) r9).floatValue();
        lm0 r5 = this.b;
        if (r5.l() != 0.0f) goto L21;
    L26:
        new Float(r5.l());
    L28:
        return new Float(r10);
    L21:
        if (Math.abs(r5.l()) >= 0.001d) goto L26;
        int r11 = r5.k();
        if (r5.k.a() == false) goto L25;
        fu.G(((qc3) r5.m.getValue()).s, null, null, new kc3(r5, r3, 2), 3);
    L25:
        r5.t(0.0f, r11, false);
        goto L28
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r9);
        x r12 = new x(27, this, r6);
        r0.p = 1;
        r9 = this.a.d(r6, r7, r12, r0);
        xe0 r13 = xe0.n;
        if (r9 != r13) goto L17;
        return r13;
    L7:
        r0 = new fd3(this, (wd0) r8);
        goto L8
    }
}
