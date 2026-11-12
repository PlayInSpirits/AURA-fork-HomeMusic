package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class en {
    public boolean A;
    public long B;
    public final d34 a;
    public final vp4 b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final vm h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public en(d34 r3, vp4 r4, AudioTrack r5, int r6, int r7, int r8) {
        this.a = r3;
        this.b = r4;
        this.d = r5;
        this.m = AudioTrack.class.getMethod("getLatency", null);     // Catch: NoSuchMethodException -> L10
    L4:
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new vm(r5, r3);
        int r9 = r5.getSampleRate();
        this.e = r9;
        boolean r10 = f35.L(r6);
        this.g = r10;
        if (r10 == false) goto L7;
        long r11 = f35.Y(r9, r8 / r7);
    L8:
        this.f = r11;
        this.q = 0;
        this.r = 0;
        this.A = false;
        this.B = 0;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0;
        this.n = 0;
        this.i = 1.0f;
        this.j = -9223372036854775807L;
        return;
    L7:
        r11 = -9223372036854775807L;
        goto L8
    }

    public final long a() {
        if (this.u != (-9223372036854775807L)) goto L5;
        this.b.getClass();
        long r0 = SystemClock.elapsedRealtime();
        if ((r0 - this.p) < 5) goto L32;
        AudioTrack r4 = this.d;
        int r5 = r4.getPlayState();
        if (r5 == 1) goto L30;
        long r6 = ((long) r4.getPlaybackHeadPosition()) & 4294967295L;
        if (Build.VERSION.SDK_INT <= 29) goto L14;
    L23:
        long r2 = this.q;
        if (r2 > r6) goto L26;
    L29:
        this.q = r6;
        goto L30
    L26:
        if (this.A == false) goto L28;
        this.B += r2;
        this.A = false;
        goto L29
    L28:
        this.r++;
        goto L29
    L14:
        if (r6 == 0) goto L16;
    L22:
        this.v = -9223372036854775807L;
        goto L23
    L16:
        if (this.q <= 0) goto L22;
        if (r5 != 3) goto L22;
        if (this.v != (-9223372036854775807L)) goto L30;
        this.v = r0;
    L30:
        this.p = r0;
    L32:
        return (this.q + this.B) + (this.r << 32);
    L5:
        return Math.min(this.x, c());
    }

    public final long b(long r7) {
        int r0 = this.t;
        int r1 = this.e;
        if (r0 == 0) goto L5;
        long r8 = f35.A(r7 + this.k, this.i);
    L9:
        long r9 = Math.max(0, r8 - this.n);
        if (this.u != (-9223372036854775807L)) goto L12;
        return r9;
    L12:
        return Math.min(f35.Y(r1, this.x), r9);
    L5:
        if (this.u == (-9223372036854775807L)) goto L7;
        r8 = f35.Y(r1, c());
        goto L9
    L7:
        r8 = f35.Y(r1, a());
        goto L9
    }

    public final long c() {
        if (this.d.getPlayState() == 2) goto L5;
        this.b.getClass();
        return this.w + f35.a0(f35.A(f35.Q(SystemClock.elapsedRealtime()) - this.u, this.i), this.e, 1000000, RoundingMode.UP);
    L5:
        return this.w;
    }

    public final void d(long r6) {
        long r0 = this.j;
        if (r0 != (-9223372036854775807L)) goto L5;
        return;
    L5:
        if (r6 < r0) goto L10;
        long r7 = f35.E(r6 - r0, this.i);
        this.b.getClass();
        long r1 = System.currentTimeMillis() - f35.i0(r7);
        this.j = -9223372036854775807L;
        ((an) this.a.o).i.f(-1, new xm(r1));
        return;
    }
}
