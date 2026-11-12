package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k55 {
    public final n71 a;
    public final Context b;
    public g55 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;

    public k55(Context r3) {
        this.b = r3;
        n71 r4 = new n71();
        r4.a = new m71();
        r4.b = new m71();
        r4.d = -9223372036854775807L;
        this.a = r4;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 30) goto L21;
        Surface r0 = this.e;
        if (r0 != null) goto L7;
        return;
    L7:
        if (this.j != Integer.MIN_VALUE) goto L9;
        return;
    L9:
        if (this.h != 0.0f) goto L11;
        return;
    L11:
        if (r0.isValid() == false) goto L25;
        this.h = 0.0f;
        xq2.r(this.e, 0.0f, 0);     // Catch: IllegalStateException -> L16
        return;
    L16:
        e = move-exception;
        l93.G("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        return;
    L25:
        return;
    }

    public final void b() {
        this.m = 0;
        this.q = -1;
        this.n = -1;
        this.k = 0;
        this.l = 0;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        return;
    L5:
        if (this.e == null) goto L47;
        n71 r0 = this.a;
        if (r0.a.a() == true) goto L10;
        float r2 = this.f;
    L18:
        float r4 = this.g;
        if (r2 != r4) goto L22;
        return;
    L22:
        if (r2 != (-1.0f)) goto L24;
    L38:
        if (r2 == (-1.0f)) goto L41;
    L42:
        this.g = r2;
        d(false);
        return;
    L41:
        if (r0.e >= 30) goto L42;
        return;
    L24:
        if (r4 == (-1.0f)) goto L38;
        if (r0.a.a() == true) goto L28;
    L34:
        float r1 = 1.0f;
    L36:
        if (Math.abs(r2 - this.g) >= r1) goto L42;
        return;
    L28:
        if (r0.a.a() == false) goto L30;
        long r3 = r0.a.f;
    L32:
        if (r3 < 5000000000L) goto L34;
        r1 = 0.1f;
        goto L36
    L30:
        r3 = -9223372036854775807L;
        goto L32
    L10:
        if (r0.a.a() == false) goto L16;
        m71 r5 = r0.a;
        long r6 = r5.e;
        long r7 = 0;
        if (r6 == 0) goto L15;
        r7 = r5.f / r6;
    L15:
        r2 = (float) (1.0E9d / r7);
        goto L18
    L16:
        r2 = -1.0f;
        goto L18
    }

    public final void d(boolean r4) {
        if (Build.VERSION.SDK_INT < 30) goto L32;
        Surface r0 = this.e;
        if (r0 != null) goto L7;
        return;
    L7:
        if (this.j != Integer.MIN_VALUE) goto L9;
        return;
    L9:
        if (r0.isValid() == true) goto L12;
        return;
    L12:
        if (this.d == false) goto L16;
        float r1 = this.g;
        if (r1 == (-1.0f)) goto L16;
        float r2 = r1 * this.i;
    L17:
        if (r4 == false) goto L19;
    L21:
        this.h = r2;
        Surface r3 = this.e;
        if (r2 != 0.0f) goto L24;
        int r5 = 0;
    L30:
        xq2.r(r3, r2, r5);     // Catch: IllegalStateException -> L27
        return;
    L27:
        e = move-exception;
        l93.G("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        return;
    L24:
        r5 = 1;
        goto L30
    L19:
        if (this.h != r2) goto L21;
        return;
    L16:
        r2 = 0.0f;
        goto L17
    }
}
