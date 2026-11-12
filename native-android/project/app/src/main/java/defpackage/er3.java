package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class er3 implements jd2 {
    public final Uri a;
    public final yl4 b;
    public final z05 c;
    public final hr3 d;
    public final q90 e;
    public final t71 f;
    public volatile boolean g;
    public boolean h;
    public long i;
    public ii0 j;
    public wv4 k;
    public boolean l;
    public final /* synthetic */ hr3 m;

    public er3(hr3 r1, Uri r2, ci0 r3, z05 r4, hr3 r5, q90 r6) {
        this.m = r1;
        this.a = r2;
        this.b = new yl4(r3);
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = new t71();
        this.h = true;
        ed2.g.getAndIncrement();
        this.j = c(null, 0);
    }

    @Override // defpackage.jd2
    public final void a() {
        int r3 = 0;
        String r4 = null;
    L3:
        if (r3 != 0) goto L73;
        if (this.g == true) goto L92;
        long r13 = this.f.a;     // Catch: Throwable -> L21
        ii0 r5 = c(r4, r13);     // Catch: Throwable -> L21
        this.j = r5;     // Catch: Throwable -> L21
        long r8 = this.b.b(r5);     // Catch: Throwable -> L21
        if (this.g == true) goto L9;
        List r6 = (List) this.b.n.j().get("ETag");     // Catch: Throwable -> L21
        if (r6 != null) goto L19;
    L23:
        r4 = null;
    L25:
        if (r8 == (-1)) goto L27;
        r8 = r8 + r13;     // Catch: Throwable -> L21
        hr3 r10 = this.m;     // Catch: Throwable -> L21
        r10.E.post(new ar3(r10, 0));     // Catch: Throwable -> L21
    L27:
        long r15 = r8;
        this.m.G = iv1.d(this.b.n.j());     // Catch: Throwable -> L21
        yl4 r9 = this.b;     // Catch: Throwable -> L21
        iv1 r11 = this.m.G;     // Catch: Throwable -> L21
        if (r11 == null) goto L32;
        int r12 = r11.f;     // Catch: Throwable -> L21
        if (r12 == (-1)) goto L32;
        ci0 r14 = new gv1(r9, r12, this);     // Catch: Throwable -> L21
        wv4 r16 = this.m.D(new gr3(0, true));     // Catch: Throwable -> L21
        this.k = r16;     // Catch: Throwable -> L21
        r16.g(hr3.f0);     // Catch: Throwable -> L21
    L33:
        this.c.h(r14, this.a, this.b.n.j(), r13, r15, this.d);     // Catch: Throwable -> L21
        if (this.m.G == null) goto L42;
        k51 r17 = (k51) this.c.p;     // Catch: Throwable -> L21
        if (r17 == null) goto L42;
        if ((r17 instanceof ky2) == false) goto L42;
        ((ky2) r17).s = true;     // Catch: Throwable -> L21
    L42:
        if (this.h == false) goto L44;
        z05 r18 = this.c;     // Catch: Throwable -> L21
        long r19 = this.i;     // Catch: Throwable -> L21
        k51 r20 = (k51) r18.p;     // Catch: Throwable -> L21
        r20.getClass();     // Catch: Throwable -> L21
        r20.d(r13, r19);     // Catch: Throwable -> L21
        this.h = false;     // Catch: Throwable -> L21
    L44:
        if (r3 != 0) goto L61;
        if (this.g == true) goto L61;
        this.e.a();     // Catch: Throwable -> L21 InterruptedException -> L59
        z05 r21 = this.c;     // Catch: Throwable -> L21
        t71 r22 = this.f;     // Catch: Throwable -> L21
        k51 r110 = (k51) r21.p;     // Catch: Throwable -> L21
        r110.getClass();     // Catch: Throwable -> L21
        rk0 r23 = (rk0) r21.q;     // Catch: Throwable -> L21
        r23.getClass();     // Catch: Throwable -> L21
        r3 = r110.b(r23, r22);     // Catch: Throwable -> L21
        long r24 = this.c.g();     // Catch: Throwable -> L21
        if (r24 <= (this.m.w + r13)) goto L44;
        q90 r111 = this.e;     // Catch: Throwable -> L21
        monitor-enter(r111);     // Catch: Throwable -> L21
        r111.b = false;     // Catch: Throwable -> L56
        monitor-exit(r111);     // Catch: Throwable -> L21
        hr3 r112 = this.m;     // Catch: Throwable -> L21
        r112.E.post(r112.D);     // Catch: Throwable -> L21
        r13 = r24;
        goto L44
    L56:
        th = move-exception;
        throw th;     // Catch: Throwable -> L21
    L60:
        throw new InterruptedIOException();     // Catch: Throwable -> L21
    L61:
        if (r3 != 1) goto L64;
        r3 = 0;
    L66:
        fu.k(this.b);
        goto L3
    L64:
        if (this.c.g() == (-1)) goto L66;
        this.f.a = this.c.g();
    L32:
        r14 = r9;
        goto L33
    L19:
        if (r6.isEmpty() == true) goto L23;
        r4 = (String) r6.get(0);     // Catch: Throwable -> L21
        goto L25
    L9:
        if (r3 != 1) goto L12;
    L14:
        fu.k(this.b);
        return;
    L12:
        if (this.c.g() == (-1)) goto L14;
        this.f.a = this.c.g();
    L21:
        th = move-exception;
        if (r3 != 1) goto L69;
    L71:
        fu.k(this.b);
        throw th;
    L69:
        if (this.c.g() == (-1)) goto L71;
        this.f.a = this.c.g();
        goto L71
    L92:
        return;
    }

    @Override // defpackage.jd2
    public final void b() {
        this.g = true;
    }

    public final ii0 c(String r17, long r18) {
        Map r2 = hr3.e0;
        if (r17 != null) goto L5;
    L7:
        Map r1 = Collections.EMPTY_MAP;
        String r14 = this.m.v;
        Uri r4 = this.a;
        rr2.s(r4, "The uri must be set.");
        return new ii0(r4, 0, 1, null, r2, r18, -1, r14, 6);
    L5:
        if (r17.startsWith("W/") == true) goto L7;
        ue1 r3 = bx1.a();
        r3.y(r2.entrySet());
        r3.x("If-Range", r17);
        r2 = r3.f();
        goto L7
    }
}
