package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class af2 implements oo0 {
    public boolean n;
    public long o;
    public long p;
    public final /* synthetic */ cf2 q;

    public af2(cf2 r3) {
        this.q = r3;
        this.o = 9223372034707292159L;
        this.p = 0;
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.q.J();
    }

    public final void a(rp1 r5, float r6) {
        cf2 r4 = this.q;
        c6 r0 = r4.D;
        if (r0 != null) goto L5;
        r0 = new c6();
        r4.D = r0;
    L5:
        int r7 = ti.m0((rp1[]) r0.b, r5);
        if (r7 >= 0) goto L12;
        int r8 = r0.a;
        rp1[] r2 = (rp1[]) r0.b;
        if (r8 != r2.length) goto L10;
        int r3 = r8 * 2;
        r0.b = (rp1[]) Arrays.copyOf(r2, r3);
        r0.c = Arrays.copyOf((float[]) r0.c, r3);
        r0.d = Arrays.copyOf((byte[]) r0.d, r3);
    L10:
        ((rp1[]) r0.b)[r8] = r5;
        ((byte[]) r0.d)[r8] = 3;
        ((float[]) r0.c)[r8] = r6;
        r0.a++;
        return;
    L12:
        float[] r9 = (float[]) r0.c;
        if (r9[r7] != r6) goto L18;
        byte[] r10 = (byte[]) r0.d;
        if (r10[r7] != 2) goto L20;
        r10[r7] = 0;
        return;
    L20:
        return;
    L18:
        r9[r7] = r6;
        ((byte[]) r0.d)[r7] = 1;
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.q.g();
    }
}
