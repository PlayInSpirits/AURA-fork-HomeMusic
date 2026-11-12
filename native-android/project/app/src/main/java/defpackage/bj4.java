package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bj4 implements im {
    public int b;
    public float c;
    public float d;
    public gm e;
    public gm f;
    public gm g;
    public gm h;
    public boolean i;
    public aj4 j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // defpackage.im
    public final boolean b() {
        if (this.f.a != (-1)) goto L5;
        return false;
    L5:
        if (Math.abs(this.c - 1.0f) < 1.0E-4f) goto L7;
        return true;
    L7:
        if (Math.abs(this.d - 1.0f) < 1.0E-4f) goto L9;
        return true;
    L9:
        if (this.f.a == this.e.a) goto L17;
        return true;
    L17:
        return false;
    }

    @Override // defpackage.im
    public final boolean c() {
        if (this.o == false) goto L13;
        aj4 r4 = this.j;
        if (r4 != null) goto L7;
    L12:
        return true;
    L7:
        if (r4.k < 0) goto L9;
        boolean r2 = true;
    L10:
        rr2.w(r2);
        if ((r4.i.o() * (r4.k * r4.b)) != 0) goto L13;
    L9:
        r2 = false;
    L13:
        return false;
    }

    @Override // defpackage.im
    public final ByteBuffer d() {
        aj4 r0 = this.j;
        if (r0 == null) goto L19;
        zi4 r1 = r0.i;
        int r2 = r0.b;
        boolean r5 = true;
        if (r0.k < 0) goto L7;
        boolean r3 = true;
    L8:
        rr2.w(r3);
        int r6 = r1.o() * (r0.k * r2);
        if (r6 <= 0) goto L19;
        if (this.k.capacity() >= r6) goto L13;
        this.k = ByteBuffer.allocateDirect(r6).order(ByteOrder.nativeOrder());
    L14:
        ByteBuffer r4 = this.k;
        if (r0.k >= 0) goto L18;
        r5 = false;
    L18:
        rr2.w(r5);
        int r7 = Math.min(r4.remaining() / (r1.o() * r2), r0.k);
        r1.b(r7, r4);
        r0.k -= r7;
        System.arraycopy(r1.i(), r7 * r2, r1.i(), 0, r0.k * r2);
        this.k.flip();
        this.n += (long) r6;
        this.l = this.k;
        goto L19
    L13:
        this.k.clear();
        goto L14
    L7:
        r3 = false;
    L19:
        ByteBuffer r8 = this.l;
        this.l = im.a;
        return r8;
    }

    @Override // defpackage.im
    public final void e(ByteBuffer r7) {
        if (r7.hasRemaining() == true) goto L5;
        return;
    L5:
        aj4 r0 = this.j;
        r0.getClass();
        this.m += (long) r7.remaining();
        int r6 = r7.remaining();
        int r1 = r0.b;
        zi4 r2 = r0.i;
        int r3 = r6 / (r2.o() * r1);
        r2.p(r3);
        r2.a(r6, r7);
        r0.j += r3;
        r0.b();
    }

    @Override // defpackage.im
    public final gm f(gm r4) {
        int r0 = r4.c;
        if (r0 != 2) goto L5;
    L9:
        int r1 = this.b;
        if (r1 != (-1)) goto L12;
        r1 = r4.a;
    L12:
        this.e = r4;
        gm r2 = new gm(r1, r4.b, r0);
        this.f = r2;
        this.i = true;
        return r2;
    L5:
        if (r0 == 4) goto L9;
        throw new AudioProcessor$UnhandledAudioFormatException(r4);
    }

    @Override // defpackage.im
    public final void flush() {
        if (b() == false) goto L14;
        gm r0 = this.e;
        this.g = r0;
        gm r2 = this.f;
        this.h = r2;
        if (this.i == false) goto L11;
        int r5 = r0.a;
        int r6 = r0.b;
        float r7 = this.c;
        float r8 = this.d;
        int r9 = r2.a;
        if (r0.c != 4) goto L9;
        boolean r10 = true;
    L10:
        this.j = new aj4(r5, r6, r7, r8, r9, r10);
        goto L14
    L9:
        r10 = false;
        goto L10
    L11:
        aj4 r1 = this.j;
        if (r1 == null) goto L14;
        r1.j = 0;
        r1.k = 0;
        r1.l = 0;
        r1.m = 0;
        r1.n = 0;
        r1.o = 0;
        r1.p = 0;
        r1.q = 0.0d;
        r1.i.flush();
    L14:
        this.l = im.a;
        this.m = 0;
        this.n = 0;
        this.o = false;
    }

    @Override // defpackage.im
    public final void g() {
        aj4 r0 = this.j;
        if (r0 == null) goto L8;
        int r1 = r0.j;
        float r2 = r0.c;
        float r3 = r0.d;
        double r4 = r2 / r3;
        double r5 = r0.e * r3;
        int r6 = r0.o;
        int r8 = r0.k + ((int) ((((((((double) (r1 - r6)) / r4) + ((double) r6)) + r0.q) + ((double) r0.l)) / r5) + 0.5d));
        r0.q = 0.0d;
        zi4 r7 = r0.i;
        int r9 = r0.h * 2;
        r7.p(r9 + r1);
        r7.d(r1 * r0.b, r9);
        r0.j = r9 + r0.j;
        r0.b();
        if (r0.k <= r8) goto L7;
        r0.k = Math.max(r8, 0);
    L7:
        r0.j = 0;
        r0.o = 0;
        r0.l = 0;
    L8:
        this.o = true;
    }

    @Override // defpackage.im
    public final long h(long r12) {
        if (this.n < 1024) goto L11;
        long r0 = this.m;
        aj4 r2 = this.j;
        r2.getClass();
        long r8 = r0 - ((long) (r2.i.o() * (r2.j * r2.b)));
        int r1 = this.h.a;
        int r3 = this.g.a;
        long r6 = this.n;
        if (r1 != r3) goto L9;
        return f35.a0(r12, r6, r8, RoundingMode.DOWN);
    L9:
        return f35.a0(r12, r6 * ((long) r3), r8 * ((long) r1), RoundingMode.DOWN);
    L11:
        return (long) (r12 / ((double) this.c));
    }

    @Override // defpackage.im
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        gm r0 = gm.e;
        this.e = r0;
        this.f = r0;
        this.g = r0;
        this.h = r0;
        ByteBuffer r1 = im.a;
        this.k = r1;
        this.l = r1;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.m = 0;
        this.n = 0;
        this.o = false;
    }
}
