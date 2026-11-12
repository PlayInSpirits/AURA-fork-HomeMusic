package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bv3 implements gy, Cloneable {
    public volatile boolean A;
    public volatile y10 B;
    public final CopyOnWriteArrayList C;
    public final o83 n;
    public final oz3 o;
    public final dv3 p;
    public final av3 q;
    public final AtomicBoolean r;
    public Object s;
    public s21 t;
    public cv3 u;
    public boolean v;
    public y10 w;
    public boolean x;
    public boolean y;
    public boolean z;

    public bv3(o83 r3, oz3 r4) {
        r3.getClass();
        r4.getClass();
        this.n = r3;
        this.o = r4;
        this.p = (dv3) r3.E.o;
        r3.d.getClass();
        av3 r5 = new av3(this);
        r5.g(r3.w, TimeUnit.MILLISECONDS);
        this.q = r5;
        this.r = new AtomicBoolean();
        this.z = true;
        this.C = new CopyOnWriteArrayList();
    }

    public static final String a(bv3 r2) {
        StringBuilder r0 = new StringBuilder();
        if (r2.A == false) goto L5;
        String r1 = "canceled ";
    L6:
        r0.append(r1);
        r0.append("call");
        r0.append(" to ");
        r0.append(r2.o.a.i());
        return r0.toString();
    L5:
        r1 = "";
        goto L6
    }

    public final IOException b(IOException r3) {
        tl1 r0 = ze5.a;
        cv3 r1 = this.u;
        if (r1 == null) goto L19;
        monitor-enter(r1);
        Socket r2 = h();     // Catch: Throwable -> L15
        monitor-exit(r1);
        if (this.u != null) goto L11;
        if (r2 == null) goto L19;
        ze5.c(r2);
        goto L19
    L11:
        if (r2 == null) goto L19;
        kf2.o("Check failed.");
        return null;
    L15:
        th = move-exception;
        throw th;
    L19:
        if (this.v == false) goto L22;
    L23:
        IOException r4 = r3;
    L27:
        if (r3 == null) goto L29;
        r4.getClass();
    L29:
        return r4;
    L22:
        if (this.q.i() == false) goto L23;
        r4 = new InterruptedIOException("timeout");
        if (r3 == null) goto L27;
        r4.initCause(r3);
        goto L27
    }

    public final k14 c() {
        if (this.r.compareAndSet(false, true) == false) goto L19;
        this.q.h();
        qg3 r0 = qg3.a;
        this.s = qg3.a.g();
        na4 r1 = this.n.a;     // Catch: Throwable -> L12
        monitor-enter(r1);     // Catch: Throwable -> L12
        ((ArrayDeque) r1.q).add(this);     // Catch: Throwable -> L14
        monitor-exit(r1);     // Catch: Throwable -> L12
        k14 r2 = e();     // Catch: Throwable -> L12
        na4 r3 = this.n.a;
        r3.getClass();
        r3.p((ArrayDeque) r3.q, this);
        return r2;
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        na4 r4 = this.n.a;
        r4.getClass();
        r4.p((ArrayDeque) r4.q, this);
        throw th;
    L19:
        kf2.o("Already Executed");
        return null;
    }

    public final void cancel() {
        if (this.A == false) goto L5;
        return;
    L5:
        this.A = true;
        y10 r0 = this.B;
        if (r0 == null) goto L8;
        ((r21) r0.f).cancel();
    L8:
        Iterator r1 = this.C.iterator();
    L10:
        if (r1.hasNext() == false) goto L12;
        ((q34) r1.next()).cancel();
        goto L10
    }

    public final Object clone() {
        return new bv3(this.n, this.o);
    }

    public final void d(boolean r4) {
        monitor-enter(this);
    L15:
        th = move-exception;
        throw th;
    L4:
        if (this.z == false) goto L14;
        monitor-exit(this);
        if (r4 == false) goto L11;
        y10 r5 = this.B;
        if (r5 == null) goto L11;
        ((r21) r5.f).cancel();
        ((bv3) r5.d).f(r5, true, true, null);
    L11:
        this.w = null;
        return;
    L14:
        throw new IllegalStateException("released");     // Catch: Throwable -> L15
    }

    public final k14 e() {
        ArrayList r2 = new ArrayList();
        v40.n0(this.n.b, r2);
        r2.add(new xu(this.n));
        r2.add(new xu(this.n.j));
        int r9 = 1;
        r2.add(new xu(r9, this.n.k));
        r2.add(u90.b);
        v40.n0(this.n.c, r2);
        r2.add(new u90(r9));
        oz3 r5 = this.o;
        o83 r1 = this.n;
        k14 r0 = new ev3(this, r2, 0, null, r5, r1.x, r1.y, r1.z).b(this.o);     // Catch: Throwable -> L9 IOException -> L11
        if (this.A == true) goto L7;
        g(null);
        return r0;
    L7:
        xe5.b(r0);     // Catch: Throwable -> L9 IOException -> L11
        throw new IOException("Canceled");     // Catch: Throwable -> L9 IOException -> L11
    L11:
        e = move-exception;
        IOException r3 = g(e);     // Catch: Throwable -> L14
        r3.getClass();     // Catch: Throwable -> L14
        throw r3;     // Catch: Throwable -> L14
    L14:
        th = th;
    L15:
        if (r9 != 0) goto L17;
        g(null);
    L17:
        throw th;
    L9:
        th = th;
        r9 = 0;
        goto L15
    }

    public final IOException f(y10 r3, boolean r4, boolean r5, IOException r6) {
        r3.getClass();
        if (r3.equals(this.B) == false) goto L50;
        monitor-enter(this);
        boolean r0 = false;
        if (r4 == true) goto L53;
    L13:
        if (r5 == true) goto L15;
    L35:
        boolean r7 = false;
    L36:
        monitor-exit(this);
        if (r0 == false) goto L47;
        this.B = null;
        cv3 r8 = this.u;
        if (r8 == null) goto L47;
        monitor-enter(r8);
        r8.p++;     // Catch: Throwable -> L44
        monitor-exit(r8);
    L44:
        th = move-exception;
        throw th;
    L47:
        if (r7 == false) goto L50;
        return b(r6);
    L15:
        if (this.y == false) goto L35;
    L16:
        if (r4 == false) goto L18;
        this.x = false;     // Catch: Throwable -> L11
    L18:
        if (r5 == false) goto L20;
        this.y = false;     // Catch: Throwable -> L11
    L20:
        boolean r9 = this.x;     // Catch: Throwable -> L11
        if (r9 == false) goto L23;
    L25:
        boolean r10 = false;
    L26:
        if (r9 == false) goto L28;
    L32:
        r7 = r0;
        r0 = r10;
        goto L36
    L28:
        if (this.y == true) goto L32;
        if (this.z == true) goto L32;
        r0 = true;
    L11:
        th = move-exception;
        throw th;
    L23:
        if (this.y == true) goto L25;
        r10 = true;
        goto L26
    L53:
        if (this.x == true) goto L16;
    L50:
        return r6;
    }

    public final IOException g(IOException r3) {
        monitor-enter(this);
        boolean r1 = false;
        if (this.z == false) goto L12;
        this.z = false;     // Catch: Throwable -> L10
        if (this.x == true) goto L12;
        if (this.y == true) goto L12;
        r1 = true;
    L12:
        monitor-exit(this);
        if (r1 == true) goto L15;
        return r3;
    L15:
        return b(r3);
    L10:
        th = move-exception;
        throw th;
    }

    public final Socket h() {
        cv3 r0 = this.u;
        r0.getClass();
        tl1 r1 = ze5.a;
        ArrayList r2 = r0.s;
        int r3 = r2.size();
        int r4 = 0;
        int r5 = 0;
    L4:
        if (r5 >= r3) goto L9;
        Object r6 = r2.get(r5);
        r5 = r5 + 1;
        if (h12.c(((Reference) r6).get(), this) == true) goto L11;
        r4 = r4 + 1;
    L11:
        if (r4 == (-1)) goto L27;
        r2.remove(r4);
        this.u = null;
        if (r2.isEmpty() == false) goto L26;
        r0.t = System.nanoTime();
        dv3 r7 = this.p;
        ConcurrentLinkedQueue r8 = r7.f;
        tl1 r9 = ze5.a;
        if (r0.m == true) goto L18;
        fr4.e(r7.d, r7.e);
        return null;
    L18:
        r0.m = true;
        r8.remove(r0);
        if (r8.isEmpty() == false) goto L21;
        r7.d.a();
    L21:
        f6 r10 = r0.d.a;
        r10.getClass();
        if (r7.c.get(r10) != null) goto L25;
        Socket r11 = r0.f;
        r11.getClass();
        return r11;
    L25:
        kf2.k();
    L26:
        return null;
    L27:
        kf2.o("Check failed.");
        return null;
    L9:
        r4 = -1;
        goto L11
    }
}
