package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ao4 implements wv4 {
    public final wv4 a;
    public final xn4 b;
    public final be3 c;
    public int d;
    public int e;
    public byte[] f;
    public zn4 g;
    public tb1 h;
    public boolean i;

    public ao4(wv4 r1, xn4 r2) {
        this.a = r1;
        this.b = r2;
        this.d = 0;
        this.e = 0;
        this.f = f35.b;
        this.c = new be3();
    }

    @Override // defpackage.wv4
    public final void a(long r5, int r7, int r8, int r9, vv4 r10) {
        if (this.g != null) goto L7;
        this.a.a(r5, r7, r8, r9, r10);
        return;
    L7:
        if (r10 != null) goto L9;
        boolean r11 = true;
    L10:
        rr2.k("DRM on subtitles is not supported", r11);
        int r12 = (this.e - r9) - r8;
        int r13 = r12;
        this.g.c(this.f, r13, r8, yn4.c, new lj0(this, r5, r7));     // Catch: RuntimeException -> L15
    L22:
        int r14 = r13 + r8;
        this.d = r14;
        if (r14 != this.e) goto L31;
        this.d = 0;
        this.e = 0;
        return;
    L31:
        return;
    L15:
        e = e;
    L16:
        RuntimeException r6 = e;
        if (this.i == false) goto L26;
        l93.r0("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", r6);
        goto L22
    L26:
        throw r6;
    L17:
        e = e;
        r13 = r12;
        goto L16
    L9:
        r11 = false;
        goto L10
    }

    @Override // defpackage.wv4
    public final void b(be3 r2, int r3, int r4) {
        if (this.g != null) goto L6;
        this.a.b(r2, r3, r4);
        return;
    L6:
        h(r3);
        r2.k(this.f, this.e, r3);
        this.e += r3;
    }

    @Override // defpackage.wv4
    public final int c(wh0 r3, int r4, boolean r5) {
        if (this.g == null) goto L5;
        h(r4);
        int r6 = r3.read(this.f, this.e, r4);
        if (r6 != (-1)) goto L12;
        if (r5 == false) goto L11;
        return -1;
    L11:
        throw new EOFException();
    L12:
        this.e += r6;
        return r6;
    L5:
        return this.a.c(r3, r4, r5);
    }

    @Override // defpackage.wv4
    public final void g(tb1 r6) {
        r6.n.getClass();
        String r0 = r6.n;
        if (lw2.h(r0) != 3) goto L5;
        boolean r1 = true;
    L6:
        rr2.l(r1);
        boolean r2 = r6.equals(this.h);
        xn4 r3 = this.b;
        if (r2 == true) goto L13;
        this.h = r6;
        if (r3.n(r6) == false) goto L11;
        zn4 r4 = r3.C(r6);
    L12:
        this.g = r4;
        goto L13
    L11:
        r4 = null;
    L13:
        zn4 r5 = this.g;
        wv4 r7 = this.a;
        if (r5 != null) goto L17;
        r7.g(r6);
        return;
    L17:
        sb1 r8 = r6.a();
        r8.m = lw2.m("application/x-media3-cues");
        r8.j = r0;
        r8.r = Long.MAX_VALUE;
        r8.K = r3.R(r6);
        f34.l(r8, r7);
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final void h(int r5) {
        int r0 = this.f.length;
        int r1 = this.e;
        if ((r0 - r1) < r5) goto L5;
        return;
    L5:
        int r2 = r1 - this.d;
        int r6 = Math.max(r2 * 2, r5 + r2);
        byte[] r3 = this.f;
        if (r6 > r3.length) goto L8;
        byte[] r7 = r3;
    L9:
        System.arraycopy(r3, this.d, r7, 0, r2);
        this.d = 0;
        this.e = r2;
        this.f = r7;
        return;
    L8:
        r7 = new byte[r6];
        goto L9
    }
}
