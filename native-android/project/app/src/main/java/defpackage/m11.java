package defpackage;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m11 implements r51 {
    public static final om0 J = null;
    public boolean A;
    public q04 B;
    public int C;
    public boolean D;
    public GlideException E;
    public boolean F;
    public o11 G;
    public xi0 H;
    public volatile boolean I;
    public final l11 n;
    public final ul4 o;
    public final i11 p;
    public final io3 q;
    public final om0 r;
    public final i11 s;
    public final li1 t;
    public final li1 u;
    public final li1 v;
    public final AtomicInteger w;
    public n11 x;
    public boolean y;
    public boolean z;

    static {
        J = new om0(25);
    }

    public m11(li1 r3, li1 r4, li1 r5, li1 r6, i11 r7, i11 r8, i61 r9) {
        this.n = new l11(new ArrayList(2));
        this.o = new ul4();
        this.w = new AtomicInteger();
        this.t = r3;
        this.u = r4;
        this.v = r6;
        this.s = r7;
        this.p = r8;
        this.q = r9;
        this.r = J;
    }

    public final synchronized void a(cf4 r3, Executor r4) {
        monitor-enter(this);
        this.o.a();     // Catch: Throwable -> L6
        this.n.n.add(new k11(r3, r4));     // Catch: Throwable -> L6
        int r1 = 1;
        if (this.D == false) goto L9;
        d(1);     // Catch: Throwable -> L6
        r4.execute(new j11(this, r3, r1));     // Catch: Throwable -> L6
    L12:
        monitor-exit(this);
        return;
    L9:
        if (this.F == false) goto L11;
        d(1);     // Catch: Throwable -> L6
        r4.execute(new j11(this, r3, 0));     // Catch: Throwable -> L6
        goto L12
    L11:
        h12.d("Cannot add callbacks to a cancelled EngineJob", !this.I);     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    public final void b() {
        monitor-enter(this);
        this.o.a();     // Catch: Throwable -> L10
        h12.d("Not yet complete!", e());     // Catch: Throwable -> L10
        int r0 = this.w.decrementAndGet();     // Catch: Throwable -> L10
        if (r0 < 0) goto L6;
        boolean r1 = true;
    L7:
        h12.d("Can't decrement below 0", r1);     // Catch: Throwable -> L10
        if (r0 != 0) goto L12;
        o11 r2 = this.G;     // Catch: Throwable -> L10
        f();     // Catch: Throwable -> L10
    L13:
        monitor-exit(this);     // Catch: Throwable -> L10
        if (r2 == null) goto L21;
        r2.c();
        return;
    L21:
        return;
    L12:
        r2 = null;
        goto L13
    L6:
        r1 = false;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.r51
    public final ul4 c() {
        return this.o;
    }

    public final synchronized void d(int r3) {
        monitor-enter(this);
        h12.d("Not yet complete!", e());     // Catch: Throwable -> L9
        if (this.w.getAndAdd(r3) != 0) goto L11;
        o11 r4 = this.G;     // Catch: Throwable -> L9
        if (r4 == null) goto L11;
        r4.a();     // Catch: Throwable -> L9
    L11:
        monitor-exit(this);
        return;
    L9:
        th = move-exception;
        throw th;
    }

    public final boolean e() {
        if (this.F == false) goto L5;
        return true;
    L5:
        if (this.D == false) goto L7;
        return true;
    L7:
        if (this.I == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final synchronized void f() {
        monitor-enter(this);
    L15:
        th = move-exception;
        throw th;
    L4:
        if (this.x == null) goto L21;
        this.n.n.clear();     // Catch: Throwable -> L15
        this.x = null;     // Catch: Throwable -> L15
        this.G = null;     // Catch: Throwable -> L15
        this.B = null;     // Catch: Throwable -> L15
        this.F = false;     // Catch: Throwable -> L15
        this.I = false;     // Catch: Throwable -> L15
        this.D = false;     // Catch: Throwable -> L15
        xi0 r2 = this.H;     // Catch: Throwable -> L15
        yl r3 = r2.t;     // Catch: Throwable -> L15
        monitor-enter(r3);     // Catch: Throwable -> L15
        r3.a = true;     // Catch: Throwable -> L17
        boolean r4 = r3.b();     // Catch: Throwable -> L17
        monitor-exit(r3);     // Catch: Throwable -> L15
        if (r4 == false) goto L12;
        r2.k();     // Catch: Throwable -> L15
    L12:
        this.H = null;     // Catch: Throwable -> L15
        this.E = null;     // Catch: Throwable -> L15
        this.C = 0;     // Catch: Throwable -> L15
        this.q.a(this);     // Catch: Throwable -> L15
        monitor-exit(this);
        return;
    L17:
        th = move-exception;
        throw th;     // Catch: Throwable -> L15
    L21:
        throw new IllegalArgumentException();     // Catch: Throwable -> L15
    }

    public final synchronized void g(cf4 r4) {
        monitor-enter(this);
        this.o.a();     // Catch: Throwable -> L28
        this.n.n.remove(new k11(r4, fh0.h));     // Catch: Throwable -> L28
        if (this.n.n.isEmpty() == true) goto L6;
    L37:
        monitor-exit(this);
        return;
    L6:
        if (e() == true) goto L24;
        this.I = true;     // Catch: Throwable -> L28
        xi0 r0 = this.H;     // Catch: Throwable -> L28
        r0.O = true;     // Catch: Throwable -> L28
        uh0 r5 = r0.M;     // Catch: Throwable -> L28
        if (r5 == null) goto L11;
        r5.cancel();     // Catch: Throwable -> L28
    L11:
        i11 r6 = this.s;     // Catch: Throwable -> L28
        n11 r1 = this.x;     // Catch: Throwable -> L28
        monitor-enter(r6);     // Catch: Throwable -> L28
        gp3 r2 = r6.a;     // Catch: Throwable -> L34
        r2.getClass();     // Catch: Throwable -> L34
        if (this.A == false) goto L17;
        Object r3 = r2.p;     // Catch: Throwable -> L34
    L16:
        HashMap r7 = (HashMap) r3;     // Catch: Throwable -> L34
        if (this != r7.get(r1)) goto L22;
        r7.remove(r1);     // Catch: Throwable -> L34
    L22:
        monitor-exit(r6);     // Catch: Throwable -> L28
        goto L24
    L17:
        r3 = r2.o;     // Catch: Throwable -> L34
    L34:
        th = move-exception;
        throw th;     // Catch: Throwable -> L28
    L24:
        if (this.D == true) goto L31;
        if (this.F == false) goto L37;
    L31:
        if (this.w.get() != 0) goto L37;
        f();     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        throw th;
    }
}
