package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r04 implements uh0, rh0 {
    public final xi0 n;
    public final wi0 o;
    public int p;
    public int q;
    public f42 r;
    public List s;
    public int t;
    public volatile tw2 u;
    public File v;
    public s04 w;

    public r04(wi0 r2, xi0 r3) {
        this.q = -1;
        this.o = r2;
        this.n = r3;
    }

    @Override // defpackage.rh0
    public final void b(Exception r4) {
        this.n.b(this.w, r4, this.u.c, 4);
    }

    @Override // defpackage.uh0
    public final boolean c() {
        ArrayList r2 = this.o.a();
        if (r2.isEmpty() == false) goto L5;
        return false;
    L5:
        wi0 r3 = this.o;
        ey3 r5 = r3.c.a();
        Class<?> r6 = r3.d.getClass();
        Class r7 = r3.g;
        Class r4 = r3.k;
        qr2 r8 = r5.h;
        yy2 r9 = (yy2) ((AtomicReference) r8.o).getAndSet(null);
        if (r9 != null) goto L8;
        r9 = new yy2(r6, r7, r4);
    L9:
        oi r11 = (oi) r8.p;
        monitor-enter(r11);
        List r12 = (List) ((oi) r8.p).get(r9);     // Catch: Throwable -> L73
        monitor-exit(r11);     // Catch: Throwable -> L73
        ((AtomicReference) r8.o).set(r9);
        if (r12 != null) goto L40;
        ArrayList r13 = new ArrayList();
        rf2 r10 = r5.a;
        monitor-enter(r10);
        ArrayList r14 = ((na4) r10.n).y(r6);     // Catch: Throwable -> L37
        monitor-exit(r10);
        int r15 = r14.size();
        int r16 = 0;
    L20:
        if (r16 >= r15) goto L29;
        Object r17 = r14.get(r16);
        r16 = r16 + 1;
        ArrayList r18 = r5.c.f((Class) r17, r7);
        int r19 = r18.size();
        int r110 = 0;
    L22:
        if (r110 >= r19) goto L20;
        Object r111 = r18.get(r110);
        r110 = r110 + 1;
        Class r20 = (Class) r111;
        if (r5.f.e(r20, r4).isEmpty() == true) goto L22;
        if (r13.contains(r20) == true) goto L22;
        r13.add(r20);
        goto L22
    L29:
        boolean r112 = false;
        qr2 r21 = r5.h;
        List r22 = Collections.unmodifiableList(r13);
        oi r23 = (oi) r21.p;
        monitor-enter(r23);
        ((oi) r21.p).put(new yy2(r6, r7, r4), r22);     // Catch: Throwable -> L34
        monitor-exit(r23);     // Catch: Throwable -> L34
        List r113 = r13;
    L42:
        if (r113.isEmpty() == true) goto L44;
    L48:
        List r1 = this.s;
        if (r1 != null) goto L51;
    L62:
        int r24 = this.q + 1;
        this.q = r24;
        if (r24 < r113.size()) goto L68;
        int r25 = this.p + 1;
        this.p = r25;
        if (r25 >= r2.size()) goto L99;
        this.q = r112 ? 1 : 0;
        goto L68
    L99:
        return r112;
    L68:
        f42 r26 = (f42) r2.get(this.p);
        Class r27 = (Class) r113.get(this.q);
        uw4 r28 = this.o.e(r27);
        wi0 r29 = this.o;
        this.w = new s04(r29.c.a, r26, r29.n, r29.e, r29.f, r28, r27, r29.i);
        File r30 = r29.h.a().m(this.w);
        this.v = r30;
        if (r30 == null) goto L71;
        this.r = r26;
        this.s = this.o.c.a().f(r30);
        boolean r31 = false;
        this.t = 0;
    L72:
        r112 = r31;
        goto L48
    L71:
        r31 = false;
        goto L72
    L51:
        if (this.t >= r1.size()) goto L62;
        this.u = null;
        boolean r32 = r112;
    L53:
        if (r32 == true) goto L61;
        if (this.t >= this.s.size()) goto L61;
        List r33 = this.s;
        int r34 = this.t;
        this.t = r34 + 1;
        uw2 r35 = (uw2) r33.get(r34);
        File r36 = this.v;
        wi0 r37 = this.o;
        this.u = r35.b(r36, r37.e, r37.f, r37.i);
        if (this.u == null) goto L53;
        if (this.o.c(this.u.c.a()) == null) goto L53;
        this.u.c.d(this.o.o, this);
        r32 = true;
    L61:
        return r32;
    L44:
        if (File.class.equals(this.o.k) == true) goto L98;
        StringBuilder r38 = new StringBuilder("Failed to find any load path from ");
        r38.append(this.o.d.getClass());
        Class r0 = this.o.k;
        r38.append(" to ");
        r38.append(r0);
        throw new IllegalStateException(r38.toString());
    L98:
        return r112;
    L34:
        th = move-exception;
        throw th;
    L37:
        th = move-exception;
        throw th;
    L40:
        r112 = false;
        r113 = r12;
    L73:
        th = move-exception;
        throw th;
    L8:
        r9.a = r6;
        r9.b = r7;
        r9.c = r4;
        goto L9
    }

    @Override // defpackage.uh0
    public final void cancel() {
        tw2 r0 = this.u;
        if (r0 == null) goto L6;
        r0.c.cancel();
        return;
    }

    @Override // defpackage.rh0
    public final void f(Object r7) {
        this.n.a(this.r, r7, this.u.c, 4, this.w);
    }
}
