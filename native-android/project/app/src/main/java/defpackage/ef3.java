package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ef3 {
    public final z80 a;
    public final u80 b;
    public final rg1 c;
    public final wf1 d;
    public final boolean e;
    public final d15 f;
    public final Object g;
    public final AtomicReference h;
    public long i;
    public x03 j;
    public final uy3 k;
    public final uv3 l;

    public ef3(z80 r1, u80 r2, rg1 r3, z03 r4, wf1 r5, boolean r6, d15 r7, Object r8) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.h = new AtomicReference(gf3.p);
        this.i = te5.m();
        x03 r9 = w54.a;
        r9.getClass();
        this.j = r9;
        uy3 r10 = new uy3();
        r10.g(r4, r3.v());
        this.k = r10;
        this.l = new uv3(r7.p);
    }

    public final void a() {
        AtomicReference r0 = this.h;
    L7:
        e = move-exception;
        r0.set(gf3.n);
        throw e;
    L4:
        switch(((gf3) r0.get()).ordinal()) {
            case 0: goto L24;
            case 1: goto L22;
            case 2: goto L20;
            case 3: goto L20;
            case 4: goto L20;
            case 5: goto L11;
            case 6: goto L10;
            default: goto L6;
        };     // Catch: Exception -> L7
    L11:
        b();     // Catch: Exception -> L7
        gf3 r4 = gf3.s;     // Catch: Exception -> L7
        gf3 r1 = gf3.t;     // Catch: Exception -> L7
    L13:
        if (r0.compareAndSet(r4, r1) == true) goto L14;
        if (r0.get() == r4) goto L13;
        oo3.b("Unexpected state change from: " + r4 + " to: " + r1 + ".");     // Catch: Exception -> L7
        return;
    L14:
        return;
    L6:
        throw new NoWhenBranchMatchedException();     // Catch: Exception -> L7
    L10:
        throw new IllegalStateException("The paused composition has already been applied");     // Catch: Exception -> L7
    L20:
        throw new IllegalStateException("The paused composition has not completed yet");     // Catch: Exception -> L7
    L22:
        throw new IllegalStateException("The paused composition has been cancelled");     // Catch: Exception -> L7
    L24:
        throw new IllegalStateException("The paused composition is invalid because of a previous exception");     // Catch: Exception -> L7
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        Object r0 = this.g;     // Catch: Throwable -> L18
        monitor-enter(r0);     // Catch: Throwable -> L18
        this.l.f(this.f, this.k);     // Catch: Throwable -> L13
        this.k.c();     // Catch: Throwable -> L13
        this.k.d();     // Catch: Throwable -> L13
        this.k.b();     // Catch: Throwable -> L11
        this.a.D = null;     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L18
        Trace.endSection();
        return;
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L18
    L13:
        th = move-exception;
        this.k.b();     // Catch: Throwable -> L11
        this.a.D = null;     // Catch: Throwable -> L11
        throw th;     // Catch: Throwable -> L11
    L18:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    public final boolean c() {
        if (((gf3) this.h.get()).compareTo(gf3.s) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void d() {
    L2:
        AtomicReference r0 = this.h;
        gf3 r1 = gf3.q;
        gf3 r2 = gf3.s;
        if (r0.compareAndSet(r1, r2) == true) goto L4;
        if (r0.get() == r1) goto L2;
        boolean r4 = false;
    L8:
        if (r4 == true) goto L14;
        oo3.b("Unexpected state change from: " + r1 + " to: " + r2 + ".");
        return;
    L14:
        return;
    L4:
        r4 = true;
        goto L8
    }

    public final boolean e(md4 r14) {
        gf3 r0 = gf3.r;
        AtomicReference r1 = this.h;
        int r2 = ((gf3) r1.get()).ordinal();     // Catch: Exception -> L8
        gf3 r3 = gf3.q;
        z80 r4 = this.a;
        u80 r5 = this.b;
        switch(r2) {
            case 0: goto L72;
            case 1: goto L70;
            case 2: goto L43;
            case 3: goto L17;
            case 4: goto L14;
            case 5: goto L13;
            case 6: goto L11;
            default: goto L7;
        };
    L14:
        l80.b("Recursive call to resume()");     // Catch: Exception -> L8
        throw new KotlinNothingValueException();     // Catch: Exception -> L8
    L43:
        rg1 r6 = this.c;
        boolean r9 = this.e;
        if (r9 == false) goto L78;
        r6.z = 0;     // Catch: Exception -> L8
        r6.y = true;     // Catch: Exception -> L8
    L78:
        this.j = r5.b(r4, r14, this.d);     // Catch: Throwable -> L67
        if (r9 == true) goto L49;
    L55:
        gf3 r15 = gf3.p;     // Catch: Exception -> L8
    L57:
        if (r1.compareAndSet(r15, r3) == true) goto L63;
        if (r1.get() == r15) goto L57;
        oo3.b("Unexpected state change from: " + r15 + " to: " + r3 + ".");     // Catch: Exception -> L8
    L63:
        if (this.j.g() == false) goto L66;
        d();     // Catch: Exception -> L8
    L66:
        return c();
    L49:
        if (r6.F == false) goto L51;
    L53:
        oo3.a("Cannot disable reuse from root if it was caused by other groups");     // Catch: Exception -> L8
    L54:
        r6.z = -1;     // Catch: Exception -> L8
        r6.y = false;     // Catch: Exception -> L8
        goto L55
    L51:
        if (r6.z != 0) goto L53;
    L67:
        th = move-exception;
        throw th;     // Catch: Exception -> L8
    L7:
        throw new NoWhenBranchMatchedException();     // Catch: Exception -> L8
    L11:
        throw new IllegalStateException("The paused composition has been applied");     // Catch: Exception -> L8
    L13:
        throw new IllegalStateException("Pausable composition is complete and apply() should be applied");     // Catch: Exception -> L8
    L17:
        if (r1.compareAndSet(r3, r0) == true) goto L22;
        if (r1.get() == r3) goto L17;
        oo3.b("Unexpected state change from: " + r3 + " to: " + r0 + ".");     // Catch: Exception -> L8
    L22:
        long r10 = this.i;     // Catch: Exception -> L8
        this.i = te5.m();     // Catch: Throwable -> L34
        this.j = r5.n(r4, r14, this.j);     // Catch: Throwable -> L34
        this.i = r10;     // Catch: Exception -> L8
    L26:
        if (r1.compareAndSet(r0, r3) == true) goto L32;
        if (r1.get() == r0) goto L26;
        oo3.b("Unexpected state change from: " + r0 + " to: " + r3 + ".");     // Catch: Exception -> L8
    L32:
        if (this.j.g() == false) goto L66;
        d();     // Catch: Exception -> L8
        goto L66
    L34:
        th = move-exception;
        this.i = r10;     // Catch: Exception -> L8
    L37:
        if (r1.compareAndSet(r0, r3) == true) goto L42;
        if (r1.get() == r0) goto L37;
        oo3.b("Unexpected state change from: " + r0 + " to: " + r3 + ".");     // Catch: Exception -> L8
    L42:
        throw th;     // Catch: Exception -> L8
    L70:
        throw new IllegalStateException("The paused composition has been cancelled");     // Catch: Exception -> L8
    L72:
        throw new IllegalStateException("The paused composition is invalid because of a previous exception");     // Catch: Exception -> L8
    L8:
        e = move-exception;
        r1.set(gf3.n);
        throw e;
    }
}
