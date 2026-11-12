package defpackage;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ad2 {
    public static final Object k = null;
    public final Object a;
    public final i44 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final g5 j;

    static {
        k = new Object();
    }

    public ad2() {
        this.a = new Object();
        this.b = new i44();
        this.c = 0;
        Object r0 = k;
        this.f = r0;
        this.j = new g5(18, this);
        this.e = r0;
        this.g = -1;
    }

    public static void a(String r2) {
        ei.V().j.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L5;
        return;
    L5:
        kf2.o(xa3.h("Cannot invoke ", r2, " on a background thread"));
    }

    public final void b(zc2 r3) {
        if (r3.o == true) goto L6;
        return;
    L6:
        if (r3.e() == true) goto L9;
        r3.a(false);
        return;
    L9:
        int r0 = r3.p;
        int r1 = this.g;
        if (r0 < r1) goto L12;
        return;
    L12:
        r3.p = r1;
        r3.n.b(this.e);
    }

    public final void c(zc2 r5) {
        if (this.h == false) goto L6;
        this.i = true;
        return;
    L6:
        this.h = true;
    L7:
        this.i = false;
        if (r5 == null) goto L10;
        b(r5);
        r5 = null;
    L16:
        if (this.i == true) goto L7;
        this.h = false;
        return;
    L10:
        i44 r1 = this.b;
        r1.getClass();
        g44 r2 = new g44(r1);
        r1.p.put(r2, Boolean.FALSE);
    L12:
        if (r2.hasNext() == false) goto L16;
        b((zc2) ((Map.Entry) r2.next()).getValue());
        if (this.i == false) goto L12;
        goto L16
    }

    public final Object d() {
        Object r1 = this.e;
        if (r1 == k) goto L5;
        return r1;
    L5:
        return null;
    }

    public final void e(ba2 r3, a83 r4) {
        a("observe");
        if (r3.h().h == r92.n) goto L16;
        yc2 r0 = new yc2(this, r3, r4);
        zc2 r2 = (zc2) this.b.a(r4, r0);
        if (r2 != null) goto L8;
    L12:
        if (r2 == null) goto L14;
        return;
    L14:
        r3.h().a(r0);
        return;
    L8:
        if (r2.d(r3) == true) goto L12;
        kf2.n("Cannot add the same observer with different lifecycles");
        return;
    }

    public final void f(a83 r2) {
        a("observeForever");
        xc2 r0 = new xc2(this, r2);
        zc2 r1 = (zc2) this.b.a(r2, r0);
        if ((r1 instanceof yc2) == true) goto L8;
        if (r1 == null) goto L6;
        return;
    L6:
        r0.a(true);
        return;
    L8:
        kf2.n("Cannot add the same observer with different lifecycles");
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Object r4) {
        Object r0 = this.a;
        monitor-enter(r0);
    L14:
        th = move-exception;
        throw th;
    L5:
        if (this.f != k) goto L7;
        boolean r1 = true;
    L8:
        this.f = r4;     // Catch: Throwable -> L14
        monitor-exit(r0);     // Catch: Throwable -> L14
        if (r1 == true) goto L12;
        return;
    L12:
        ei.V().W(this.j);
        return;
    L7:
        r1 = false;
        goto L8
    }

    public void j(a83 r2) {
        a("removeObserver");
        zc2 r1 = (zc2) this.b.b(r2);
        if (r1 != null) goto L5;
        return;
    L5:
        r1.c();
        r1.a(false);
    }

    public void k(Object r2) {
        a("setValue");
        this.g++;
        this.e = r2;
        c(null);
    }

    public ad2(Object r4) {
        this.a = new Object();
        this.b = new i44();
        this.c = 0;
        this.f = k;
        this.j = new g5(18, this);
        this.e = r4;
        this.g = 0;
    }
}
