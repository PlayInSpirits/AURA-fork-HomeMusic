package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wa0 extends xa0 {
    public final k24 e;
    public final k24 f;
    public final float[] g;

    public wa0(k24 r9, k24 r10) {
        super(r10, r9, r10, null);
        this.e = r9;
        this.f = r10;
        float[] r0 = (float[]) d34.r.o;
        z95 r1 = r9.d;
        float[] r11 = r9.i;
        z95 r2 = r10.d;
        float[] r3 = r10.j;
        if (uo.l(r1, r2) == false) goto L5;
        float[] r12 = uo.A(r3, r11);
    L12:
        this.g = r12;
        return;
    L5:
        float[] r4 = r1.a();
        float[] r5 = r2.a();
        z95 r6 = wr1.b;
        if (uo.l(r1, r6) == true) goto L9;
        r11 = uo.A(uo.k(r0, r4, new float[]{0.964212f, 1.0f, 0.825188f}), r11);
    L9:
        if (uo.l(r2, r6) == true) goto L11;
        r3 = uo.w(uo.A(uo.k(r0, r5, new float[]{0.964212f, 1.0f, 0.825188f}), r10.i));
    L11:
        r12 = uo.A(r3, r11);
        goto L12
    }

    @Override // defpackage.xa0
    public final long a(long r7) {
        float r0 = x40.g(r7);
        float r1 = x40.f(r7);
        float r2 = x40.e(r7);
        float r8 = x40.d(r7);
        g24 r9 = this.e.p;
        float r3 = (float) r9.b(r0);
        float r4 = (float) r9.b(r1);
        float r10 = (float) r9.b(r2);
        float[] r5 = this.g;
        float r6 = (r5[6] * r10) + ((r5[3] * r4) + (r5[0] * r3));
        float r11 = (r5[7] * r10) + ((r5[4] * r4) + (r5[1] * r3));
        float r12 = (r5[8] * r10) + ((r5[5] * r4) + (r5[2] * r3));
        k24 r13 = this.f;
        float r14 = (float) r13.m.b(r6);
        g24 r15 = r13.m;
        return e35.a(r14, (float) r15.b(r11), (float) r15.b(r12), r8, r13);
    }
}
