package defpackage;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c95 implements b95 {
    public final m51 a;
    public final wv4 b;
    public final uu c;
    public final tb1 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public c95(m51 r4, wv4 r5, uu r6, String r7, int r8) {
        this.a = r4;
        this.b = r5;
        this.c = r6;
        int r9 = r6.n;
        int r10 = r6.o;
        int r0 = (r6.q * r9) / 8;
        int r11 = r6.p;
        if (r11 != r0) goto L7;
        int r12 = r10 * r0;
        int r1 = r12 * 8;
        int r13 = Math.max(r0, r12 / 10);
        this.e = r13;
        sb1 r2 = new sb1();
        r2.l = lw2.m("audio/wav");
        r2.m = lw2.m(r7);
        r2.h = r1;
        r2.i = r1;
        r2.n = r13;
        r2.E = r9;
        r2.F = r10;
        r2.G = r8;
        this.d = new tb1(r2);
        return;
    L7:
        throw ParserException.a(null, "Expected block size: " + r0 + "; got: " + r11);
    }

    @Override // defpackage.b95
    public final void a(long r1) {
        this.f = r1;
        this.g = 0;
        this.h = 0;
    }

    @Override // defpackage.b95
    public final boolean b(l51 r19, long r20) {
        long r1 = r20;
    L4:
        if (r1 <= 0) goto L11;
        int r7 = this.g;
        int r8 = this.e;
        if (r7 >= r8) goto L11;
        int r5 = this.b.f(r19, (int) Math.min(r8 - r7, r1), true);
        if (r5 == (-1)) goto L9;
        this.g += r5;
        r1 = r1 - ((long) r5);
        goto L4
    L9:
        r1 = 0;
    L11:
        uu r2 = this.c;
        int r3 = r2.p;
        int r4 = this.g / r3;
        if (r4 <= 0) goto L14;
        long r9 = this.f;
        long r10 = this.h;
        long r13 = r2.o;
        String r6 = f35.a;
        long r12 = r9 + f35.a0(r10, 1000000, r13, RoundingMode.DOWN);
        int r15 = r4 * r3;
        int r16 = this.g - r15;
        this.b.a(r12, 1, r15, r16, null);
        this.h += (long) r4;
        this.g = r16;
    L14:
        if (r1 > 0) goto L16;
        return true;
    L16:
        return false;
    }

    @Override // defpackage.b95
    public final void c(int r8, long r9) {
        e95 r0 = new e95(this.c, 1, r8, r9);
        this.a.w(r0);
        tb1 r10 = this.d;
        wv4 r7 = this.b;
        r7.g(r10);
        r7.d(r0.e);
    }
}
