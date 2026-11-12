package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pt4 {
    public final i03 a;
    public ot4 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public pt4() {
        i03 r0 = f02.a;
        this.a = new i03();
        this.c = -1;
        this.d = 0;
        this.e = 0;
    }

    public final void a(ot4 r11, long r12, long r14, float[] r16, long r17) {
        long r2 = r11.g;
        if ((r17 - r2) <= 0) goto L5;
    L8:
        boolean r10 = true;
    L9:
        if (r10 == false) goto L12;
        r11.g = r17;
        r11.a(r11.e, r11.f, r12, r14, r16);
        return;
    L12:
        return;
    L5:
        if (r2 == Long.MIN_VALUE) goto L8;
        r10 = false;
        goto L9
    }

    public final boolean b(long r5, long r7, float[] r9, int r10, int r11) {
        if (g02.a(r7, this.d) == true) goto L5;
        this.d = r7;
        boolean r8 = true;
    L7:
        if (g02.a(r5, this.e) == true) goto L9;
        this.e = r5;
        r8 = true;
    L9:
        if (r9 == null) goto L11;
        this.g = r9;
        r8 = true;
    L11:
        long r6 = (((long) r10) << 32) | (((long) r11) & 4294967295L);
        if (r6 == this.f) goto L15;
        this.f = r6;
        return true;
    L15:
        return r8;
    L5:
        r8 = false;
        goto L7
    }
}
