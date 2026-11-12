package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g74 {
    public a74 a;
    public tb b;
    public y71 c;
    public hb3 d;
    public boolean e;
    public na4 f;
    public final z64 g;
    public final x64 h;
    public boolean i;
    public int j;
    public q64 k;
    public final e74 l;
    public final kl3 m;

    public g74(a74 r1, tb r2, y71 r3, hb3 r4, boolean r5, na4 r6, z64 r7, x64 r8) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.j = 1;
        this.k = v64.a;
        this.l = new e74(this);
        this.m = new kl3(6, this);
    }

    public final Object a(long r11, wd0 r13) {
        if ((r13 instanceof b74) == false) goto L7;
        b74 r0 = (b74) r13;
        int r1 = r0.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.q = r1 - Integer.MIN_VALUE;
    L8:
        Object r14 = r0.o;
        int r2 = r0.q;
        if (r2 == 0) goto L18;
        if (r2 != 1) goto L16;
        ix3 r12 = r0.n;
        kb4.X(r14);     // Catch: Throwable -> L14
        g74 r5 = this;
    L26:
        r5.i = false;
        return new k45(r12.n);
    L14:
        th = move-exception;
        Throwable r15 = th;
        r5 = this;
    L32:
        r5.i = false;
        throw r15;
    L16:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r14);
        ix3 r6 = new ix3();
        r6.n = r11;
        this.i = true;
        h13 r16 = h13.n;     // Catch: Throwable -> L30
        r5 = this;
        d74 r4 = new d74(r5, r6, r11, null);     // Catch: Throwable -> L28
        r0.n = r6;     // Catch: Throwable -> L28
        r0.q = 1;     // Catch: Throwable -> L28
        Object r10 = r5.g(r16, r4, r0);     // Catch: Throwable -> L28
        xe0 r17 = xe0.n;
        if (r10 != r17) goto L25;
        return r17;
    L25:
        r12 = r6;
    L28:
        th = th;
    L29:
        r15 = th;
    L30:
        th = th;
        r5 = this;
    L7:
        r0 = new b74(this, r13);
        goto L8
    }

    public final boolean b() {
        if (this.a.c() == false) goto L5;
    L13:
        return true;
    L5:
        if (this.a.b() == true) goto L13;
        tb r2 = this.b;
        if (r2 != null) goto L9;
        return false;
    L9:
        if (r2.e() == true) goto L13;
        return false;
    }

    public final Object c(long r4, boolean r6, ep4 r7) {
        j15 r0 = j15.a;
        if (r6 == false) goto L8;
        y71 r8 = this.c;
        t64 r1 = v64.a;
        if ((r8 instanceof uk0) == false) goto L8;
    L22:
        return r0;
    L8:
        if (this.d != hb3.o) goto L11;
        int r9 = 1;
    L10:
        long r5 = k45.a(r4, 0.0f, 0.0f, r9);
        f74 r10 = new f74(this, null);
        tb r2 = this.b;
        xe0 r3 = xe0.n;
        if (r2 != null) goto L15;
    L19:
        f74 r11 = new f74(r10.r, r7);
        r11.q = r5;
        Object r12 = r11.invokeSuspend(r0);
        if (r12 != r3) goto L22;
        return r12;
    L15:
        if (b() == false) goto L19;
        Object r13 = r2.b(r5, r10, r7);
        if (r13 != r3) goto L22;
        return r13;
    L11:
        r9 = 2;
        goto L10
    }

    public final long d(q64 r15, long r16, int r18) {
        e53 r2 = (e53) this.f.n;
        e53 r3 = null;
        if (r2 == null) goto L5;
        e53 r4 = r2.r0();
    L6:
        long r5 = 0;
        if (r4 == null) goto L9;
        long r12 = r4.x(r18, r16);
    L10:
        long r0 = g83.d(r16, r12);
        if (this.d != hb3.o) goto L13;
        long r9 = g83.a(1, r0);
    L14:
        long r10 = f(i(r15.a(h(f(r9)))));
        z64 r6 = this.g;
        if (r6.A == false) goto L24;
        ViewTreeObserver r7 = ((ra) j51.P(r6)).getViewTreeObserver();
        if (ra.Z0 != null) goto L21;
        Method r8 = r7.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);     // Catch: Exception -> L32
        r8.setAccessible(true);     // Catch: Exception -> L32
        ra.Z0 = r8;     // Catch: Exception -> L32
    L21:
        Method r11 = ra.Z0;     // Catch: Exception -> L32
        if (r11 == null) goto L24;
        r11.invoke(r7, null);     // Catch: Exception -> L32
    L24:
        long r1 = g83.d(r0, r10);
        e53 r14 = (e53) this.f.n;
        if (r14 == null) goto L27;
        r3 = r14.r0();
    L27:
        e53 r13 = r3;
        if (r13 == null) goto L31;
        r5 = r13.R(r18, r10, r1);
    L31:
        return g83.e(g83.e(r12, r10), r5);
    L13:
        r9 = g83.a(2, r0);
        goto L14
    L9:
        r12 = 0;
        goto L10
    L5:
        r4 = null;
        goto L6
    }

    public final float e(float r1) {
        if (this.e == true) goto L5;
        return r1;
    L5:
        return r1 * (-1.0f);
    }

    public final long f(long r1) {
        if (this.e == true) goto L5;
        return r1;
    L5:
        return g83.f(r1, -1.0f);
    }

    public final Object g(h13 r5, wf1 r6, wd0 r7) {
        Object r4 = this.a.e(r5, new r(this, r6, null, 13), r7);
        if (r4 != xe0.n) goto L6;
        return r4;
    L6:
        return j15.a;
    }

    public final float h(long r3) {
        if (this.d != hb3.o) goto L7;
        long r2 = r3 >> 32;
    L6:
        return Float.intBitsToFloat((int) r2);
    L7:
        r2 = r3 & 4294967295L;
        goto L6
    }

    public final long i(float r6) {
        if (r6 != 0.0f) goto L7;
        return 0;
    L7:
        if (this.d == hb3.o) goto L9;
        long r0 = Float.floatToRawIntBits(0.0f);
        return (((long) Float.floatToRawIntBits(r6)) & 4294967295L) | (r0 << 32);
    L9:
        return (Float.floatToRawIntBits(r6) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    public final float j(long r6) {
        int r0 = (int) (4294967295L & r6);
        int r7 = (int) (r6 >> 32);
        double r1 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(r0)), Math.abs(Float.intBitsToFloat(r7)));
        hb3 r5 = this.d;
        if (r1 < 0.7853981633974483d) goto L10;
        if (r5 == hb3.n) goto L7;
        return 0.0f;
    L7:
        return Float.intBitsToFloat(r0);
    L10:
        if (r5 == hb3.o) goto L12;
        return 0.0f;
    L12:
        return Float.intBitsToFloat(r7);
    }
}
