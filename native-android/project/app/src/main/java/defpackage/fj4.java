package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fj4 implements uh0, th0 {
    public final wi0 n;
    public final xi0 o;
    public volatile int p;
    public volatile ph0 q;
    public volatile Object r;
    public volatile tw2 s;
    public volatile qh0 t;

    public fj4(wi0 r1, xi0 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.th0
    public final void a(f42 r1, Object r2, sh0 r3, int r4, f42 r5) {
        this.o.a(r1, r2, r3, this.s.c.e(), r1);
    }

    @Override // defpackage.th0
    public final void b(f42 r1, Exception r2, sh0 r3, int r4) {
        this.o.b(r1, r2, r3, this.s.c.e());
    }

    @Override // defpackage.uh0
    public final boolean c() {
        if (this.r == null) goto L13;
        Object r0 = this.r;
        this.r = null;
        if (d(r0) == true) goto L13;
    L16:
        return true;
    L8:
        e = move-exception;
        if (Log.isLoggable("SourceGenerator", 3) == false) goto L13;
        Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
    L13:
        if (this.q != null) goto L15;
    L17:
        this.q = null;
        this.s = null;
        boolean r1 = false;
    L18:
        if (r1 == true) goto L28;
        if (this.p >= this.n.b().size()) goto L28;
        ArrayList r2 = this.n.b();
        int r3 = this.p;
        this.p = r3 + 1;
        this.s = (tw2) r2.get(r3);
        if (this.s == null) goto L18;
        if (this.n.p.a(this.s.c.e()) == true) goto L27;
        if (this.n.c(this.s.c.a()) == null) goto L18;
    L27:
        this.s.c.d(this.n.o, new gp3(this, this.s, false, 20));
        r1 = true;
    L28:
        return r1;
    L15:
        if (this.q.c() == false) goto L17;
        goto L16
    }

    @Override // defpackage.uh0
    public final void cancel() {
        tw2 r0 = this.s;
        if (r0 == null) goto L6;
        r0.c.cancel();
        return;
    }

    public final boolean d(Object r15) {
        int r3 = ee2.b;
        long r4 = SystemClock.elapsedRealtimeNanos();
        boolean r5 = false;
        yh0 r6 = this.n.c.a().g(r15);     // Catch: Throwable -> L7
        Object r7 = r6.l();     // Catch: Throwable -> L7
        c11 r8 = this.n.d(r7);     // Catch: Throwable -> L7
        ns3 r9 = new ns3(r8, r7, this.n.i, 2);     // Catch: Throwable -> L7
        f42 r10 = this.s.a;     // Catch: Throwable -> L7
        wi0 r12 = this.n;     // Catch: Throwable -> L7
        qh0 r11 = new qh0(r10, r12.n);     // Catch: Throwable -> L7
        wq0 r13 = r12.h.a();     // Catch: Throwable -> L7
        r13.M(r11, r9);     // Catch: Throwable -> L7
        if (Log.isLoggable("SourceGenerator", 2) == false) goto L10;
        Log.v("SourceGenerator", "Finished encoding source to cache, key: " + r11 + ", data: " + r15 + ", encoder: " + r8 + ", duration: " + ee2.a(r4));     // Catch: Throwable -> L7
    L10:
        if (r13.m(r11) == null) goto L16;
        this.t = r11;     // Catch: Throwable -> L7
        this.q = new ph0(Collections.singletonList(this.s.a), this.n, this);     // Catch: Throwable -> L7
        this.s.c.c();
        return true;
    L16:
        if (Log.isLoggable("SourceGenerator", 3) == false) goto L27;
        Log.d("SourceGenerator", "Attempt to write: " + this.t + ", data: " + r15 + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");     // Catch: Throwable -> L7
    L27:
        this.o.a(this.s.a, r6.l(), this.s.c, this.s.c.e(), this.s.a);     // Catch: Throwable -> L21
        return false;
    L21:
        th = move-exception;
        Throwable r16 = th;
        r5 = true;
    L23:
        if (r5 == true) goto L29;
        this.s.c.c();
        throw r16;
    L29:
        throw r16;
    L7:
        th = move-exception;
        r16 = th;
        goto L23
    }
}
