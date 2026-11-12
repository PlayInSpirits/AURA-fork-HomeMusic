package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d40 extends bc1 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public d40(cu4 r7, long r8, long r10, boolean r12) {
        super(r7);
        if (r10 != Long.MIN_VALUE) goto L5;
    L9:
        boolean r2 = false;
        if (r7.h() != 1) goto L48;
        bu4 r9 = r7.m(0, new bu4(), 0);
        long r11 = Math.max(0, r8);
        if (r12 == false) goto L14;
    L22:
        if (r10 != Long.MIN_VALUE) goto L24;
        long r13 = r9.l;
    L25:
        long r0 = r9.l;
        if (r0 != (-9223372036854775807L)) goto L28;
    L33:
        this.f = r11;
        this.g = r13;
        if (r13 != (-9223372036854775807L)) goto L36;
        long r14 = -9223372036854775807L;
    L37:
        this.h = r14;
        if (r9.h == false) goto L45;
        if (r13 != (-9223372036854775807L)) goto L41;
    L44:
        r2 = true;
        goto L45
    L41:
        if (r0 == (-9223372036854775807L)) goto L45;
        if (r13 == r0) goto L44;
    L45:
        this.i = r2;
        return;
    L36:
        r14 = r13 - r11;
        goto L37
    L28:
        if (r13 <= r0) goto L31;
        r13 = r0;
    L31:
        if (r11 <= r13) goto L33;
        r11 = r13;
        goto L33
    L24:
        r13 = Math.max(0, r10);
        goto L25
    L14:
        if (r9.j == true) goto L22;
        if (r11 == 0) goto L22;
        if (r9.g == true) goto L22;
        throw new ClippingMediaSource$IllegalClippingException(1);
    L48:
        throw new ClippingMediaSource$IllegalClippingException(0);
    L5:
        if (r10 >= r8) goto L9;
        throw new ClippingMediaSource$IllegalClippingException(2, r8, r10);
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final zt4 f(int r11, zt4 r12, boolean r13) {
        this.e.f(0, r12, r13);
        long r6 = r12.e - this.f;
        long r2 = this.h;
        long r4 = -9223372036854775807L;
        if (r2 == (-9223372036854775807L)) goto L6;
        r4 = r2 - r6;
    L6:
        r12.i(r12.a, r12.b, 0, r4, r6, z5.f, false);
        return r12;
    }

    @Override // defpackage.bc1, defpackage.cu4
    public final bu4 m(int r6, bu4 r7, long r8) {
        this.e.m(0, r7, 0);
        long r9 = r7.o;
        long r0 = this.f;
        r7.o = r9 + r0;
        r7.l = this.h;
        r7.h = this.i;
        long r10 = r7.k;
        if (r10 == (-9223372036854775807L)) goto L9;
        long r11 = Math.max(r10, r0);
        r7.k = r11;
        long r5 = this.g;
        if (r5 == (-9223372036854775807L)) goto L8;
        r11 = Math.min(r11, r5);
    L8:
        r7.k = r11 - r0;
    L9:
        long r12 = f35.i0(r0);
        long r13 = r7.d;
        if (r13 == (-9223372036854775807L)) goto L12;
        r7.d = r13 + r12;
    L12:
        long r14 = r7.e;
        if (r14 == (-9223372036854775807L)) goto L15;
        r7.e = r14 + r12;
    L15:
        return r7;
    }
}
