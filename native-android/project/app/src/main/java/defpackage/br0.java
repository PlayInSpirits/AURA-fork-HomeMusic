package defpackage;

import android.os.Bundle;
import androidx.work.impl.WorkerStoppedException;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class br0 extends q42 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ br0(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        super(1);
    }

    @Override // defpackage.if1
    public final Object invoke(Object r5) {
        switch(this.n) {
            case 0: goto L40;
            case 1: goto L25;
            case 2: goto L11;
            case 3: goto L9;
            default: goto L4;
        };
    L4:
        Throwable r6 = (Throwable) r5;
        if ((r6 instanceof WorkerStoppedException) == false) goto L7;
        oc2 r0 = (oc2) this.o;
        r0.c.compareAndSet(-256, ((WorkerStoppedException) r6).n);
    L7:
        ((ic2) this.p).cancel(false);
        return j15.a;
    L9:
        tc0 r7 = (tc0) r5;
        r7.getClass();
        ((sk4) this.o).f(null);
        ((rq3) this.p).d(r7);
        return j15.a;
    L11:
        a23 r8 = (a23) r5;
        t43 r1 = (t43) this.o;
        r8.getClass();
        r23 r2 = r8.o;
        if (r2 != null) goto L15;
        r2 = null;
    L15:
        if (r2 == null) goto L55;
        r23 r4 = r1.c(r2, r8.c(), (y23) this.p);
        if (r4 != null) goto L21;
        return null;
    L21:
        if (r4.equals(r2) == true) goto L54;
        d23 r3 = r1.b();
        Bundle r9 = r4.a(r8.c());
        v23 r10 = r3.h;
        return tv1.v(r10.a, r4, r9, r10.j(), r10.o);
    L54:
        return r8;
    L55:
        return null;
    L25:
        z23 r11 = (z23) r5;
        v23 r12 = (v23) this.p;
        r11.getClass();
        x23 r13 = r11.a;
        r13.f = 0;
        r13.g = 0;
        r23 r14 = (r23) this.o;
        if ((r14 instanceof t23) == false) goto L39;
        int r15 = r23.w;
        Iterator r16 = fa4.c0(k5.y, r14).iterator();
    L29:
        if (r16.hasNext() == false) goto L37;
        r23 r17 = (r23) r16.next();
        r23 r18 = r12.g();
        if (r18 == null) goto L33;
        t23 r19 = r18.o;
    L35:
        if (h12.c(r17, r19) == false) goto L29;
    L33:
        r19 = null;
        goto L35
    L37:
        int r20 = t23.A;
        r11.b = jz4.s(r12.i()).u;
        r11.c = true;
    L39:
        return j15.a;
    L40:
        ((IOException) r5).getClass();
        jr0 r21 = (jr0) this.o;
        ll r22 = (ll) this.p;
        monitor-enter(r21);
        r22.d();     // Catch: Throwable -> L46
        monitor-exit(r21);
        return j15.a;
    L46:
        th = move-exception;
        throw th;
    }
}
