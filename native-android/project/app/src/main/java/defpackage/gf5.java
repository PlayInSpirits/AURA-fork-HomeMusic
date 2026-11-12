package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gf5 implements gj1, hj1 {
    public final LinkedList e;
    public final me f;
    public final ve g;
    public final xc5 h;
    public final HashSet i;
    public final HashMap j;
    public final int k;
    public final rf5 l;
    public boolean m;
    public final ArrayList n;
    public ka0 o;
    public int p;
    public final /* synthetic */ ij1 q;

    public gf5(ij1 r10, dj1 r11) {
        this.q = r10;
        this.e = new LinkedList();
        this.i = new HashSet();
        this.j = new HashMap();
        this.n = new ArrayList();
        this.o = null;
        this.p = 0;
        Looper r4 = r10.A.getLooper();
        c12 r1 = r11.a();
        ml3 r5 = new ml3((qi) r1.o, (String) r1.p, (String) r1.q);
        vr1 r2 = (vr1) r11.c.n;
        ji2.m(r2);
        le r6 = r11.d;
        me r9 = r2.a(r11.a, r4, r5, r6, this, this);
        String r3 = r11.b;
        if (r3 != null) goto L5;
    L7:
        if (r3 != null) goto L9;
    L13:
        this.f = r9;
        this.g = r11.e;
        this.h = new xc5(23);
        this.k = r11.g;
        if (r9.i0() == false) goto L17;
        Context r12 = r10.r;
        zw2 r13 = r10.A;
        c12 r14 = r11.a();
        this.l = new rf5(r12, r13, new ml3((qi) r14.o, (String) r14.p, (String) r14.q));
        return;
    L17:
        this.l = null;
        return;
    L9:
        if ((r9 instanceof l63) == false) goto L13;
        xa3.r(r9);
        throw null;
    L5:
        if ((r9 instanceof a) == false) goto L7;
        ((a) r9).E = r3;
        goto L7
    }

    @Override // defpackage.gj1
    public final void U(int r4) {
        Looper r0 = Looper.myLooper();
        zw2 r1 = this.q.A;
        if (r0 != r1.getLooper()) goto L6;
        f(r4);
        return;
    L6:
        r1.post(new rq(r4, 7, this));
    }

    @Override // defpackage.gj1
    public final void X() {
        Looper r0 = Looper.myLooper();
        zw2 r1 = this.q.A;
        if (r0 != r1.getLooper()) goto L6;
        e();
        return;
    L6:
        r1.post(new wu4(5, this));
    }

    public final void a(ka0 r4) {
        HashSet r0 = this.i;
        Iterator r1 = r0.iterator();
        if (r1.hasNext() == true) goto L5;
        r0.clear();
        return;
    L5:
        if (r1.next() == null) goto L7;
        kf2.k();
        return;
    L7:
        if (au0.n(r4, ka0.r) == false) goto L10;
        this.f.d0();
    L10:
        throw null;
    }

    public final void b(Status r3) {
        ji2.j(this.q.A);
        c(r3, null, false);
    }

    public final void c(Status r4, Exception r5, boolean r6) {
        ji2.j(this.q.A);
        boolean r0 = true;
        if (r4 == null) goto L5;
        boolean r2 = false;
    L6:
        if (r5 == null) goto L8;
        r0 = false;
    L8:
        if (r2 == r0) goto L21;
        Iterator r3 = this.e.iterator();
    L11:
        if (r3.hasNext() == false) goto L20;
        cg5 r1 = (cg5) r3.next();
        if (r6 == false) goto L16;
        if (r1.a != 2) goto L11;
    L16:
        if (r4 == null) goto L18;
        r1.a(r4);
    L19:
        r3.remove();
        goto L11
    L18:
        r1.b(r5);
        goto L19
    L20:
        return;
    L21:
        kf2.n("Status XOR exception should be null");
        return;
    L5:
        r2 = true;
        goto L6
    }

    public final void d() {
        LinkedList r1 = this.e;
        ArrayList r0 = new ArrayList(r1);
        int r2 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L11;
        cg5 r4 = (cg5) r0.get(r3);
        if (this.f.Y() == false) goto L16;
        if (h(r4) == false) goto L10;
        r1.remove(r4);
    L10:
        r3 = r3 + 1;
        goto L3
    L16:
        return;
    }

    public final void e() {
        ij1 r0 = this.q;
        ji2.j(r0.A);
        this.o = null;
        a(ka0.r);
        zw2 r1 = r0.A;
        if (this.m == false) goto L5;
        ve r2 = this.g;
        r1.removeMessages(11, r2);
        r1.removeMessages(9, r2);
        this.m = false;
    L5:
        Iterator r3 = this.j.values().iterator();
        if (r3.hasNext() == true) goto L10;
        d();
        g();
        return;
    L10:
        throw xa3.d(r3);
    }

    public final void f(int r9) {
        ij1 r0 = this.q;
        zw2 r1 = r0.A;
        ji2.j(r0.A);
        this.o = null;
        this.m = true;
        String r4 = this.f.h0();
        xc5 r5 = this.h;
        r5.getClass();
        StringBuilder r6 = new StringBuilder("The connection to Google Play services was lost");
        if (r9 != 1) goto L6;
        r6.append(" due to service disconnection.");
    L8:
        if (r4 == null) goto L10;
        r6.append(" Last reason for disconnect: ");
        r6.append(r4);
    L10:
        r5.x(true, new Status(20, r6.toString(), null, null));
        ve r2 = this.g;
        r1.sendMessageDelayed(Message.obtain(r1, 9, r2), 5000);
        r1.sendMessageDelayed(Message.obtain(r1, 11, r2), 120000);
        ((SparseIntArray) r0.t.o).clear();
        Iterator r8 = this.j.values().iterator();
        if (r8.hasNext() == true) goto L14;
        return;
    L14:
        throw xa3.d(r8);
    L6:
        if (r9 != 3) goto L8;
        r6.append(" due to dead object exception.");
        goto L8
    }

    public final void g() {
        ij1 r0 = this.q;
        zw2 r1 = r0.A;
        ve r4 = this.g;
        r1.removeMessages(12, r4);
        r1.sendMessageDelayed(r1.obtainMessage(12, r4), r0.n);
    }

    public final boolean h(cg5 r15) {
        if ((r15 instanceof kf5) == true) goto L9;
        xc5 r0 = this.h;
        me r3 = this.f;
        r15.d(r0, r3.i0());
        r15.c(this);     // Catch: DeadObjectException -> L7
        return true;
    L7:
        U(1);
        r3.a0("DeadObjectException thrown while running ApiCallRunner.");
        return true;
    L9:
        kf5 r1 = (kf5) r15;
        p61[] r4 = r1.g(this);
        if (r4 != null) goto L12;
    L29:
        p61 r9 = null;
    L30:
        if (r9 != null) goto L36;
        xc5 r2 = this.h;
        me r5 = this.f;
        r15.d(r2, r5.i0());
        r15.c(this);     // Catch: DeadObjectException -> L34
        return true;
    L34:
        U(1);
        r5.a0("DeadObjectException thrown while running ApiCallRunner.");
        return true;
    L36:
        Log.w("GoogleApiManager", this.f.getClass().getName() + " could not execute call because it requires feature (" + r9.n + ", " + r9.b() + ").");
        if (this.q.B == true) goto L39;
    L48:
        r1.b(new UnsupportedApiCallException(r9));
        return true;
    L39:
        if (r1.f(this) == false) goto L48;
        hf5 r6 = new hf5(this.g, r9);
        int r16 = this.n.indexOf(r6);
        ArrayList r7 = this.n;
        if (r16 < 0) goto L44;
        hf5 r17 = (hf5) r7.get(r16);
        this.q.A.removeMessages(15, r17);
        zw2 r14 = this.q.A;
        r14.sendMessageDelayed(Message.obtain(r14, 15, r17), 5000);
        return false;
    L44:
        r7.add(r6);
        zw2 r18 = this.q.A;
        r18.sendMessageDelayed(Message.obtain(r18, 15, r6), 5000);
        zw2 r19 = this.q.A;
        r19.sendMessageDelayed(Message.obtain(r19, 16, r6), 120000);
        ka0 r110 = new ka0(2, null);
        if (i(r110) == true) goto L47;
        this.q.c(r110, this.k);
    L47:
        return false;
    L12:
        if (r4.length == 0) goto L29;
        p61[] r8 = this.f.g0();
        if (r8 != null) goto L17;
        r8 = new p61[0];
    L17:
        oi r10 = new oi(r8.length);
        int r11 = 0;
    L19:
        if (r11 >= r8.length) goto L21;
        p61 r12 = r8[r11];
        r10.put(r12.n, Long.valueOf(r12.b()));
        r11 = r11 + 1;
        goto L19
    L21:
        int r13 = r4.length;
        int r20 = 0;
    L22:
        if (r20 >= r13) goto L29;
        r9 = r4[r20];
        Long r111 = (Long) r10.get(r9.n);
        if (r111 == null) goto L30;
        if (r111.longValue() < r9.b()) goto L30;
        r20 = r20 + 1;
        goto L22
    }

    public final boolean i(ka0 r5) {
        Object r0 = ij1.E;
        monitor-enter(r0);
        ij1 r1 = this.q;     // Catch: Throwable -> L19
        if (r1.x != null) goto L7;
    L21:
        monitor-exit(r0);     // Catch: Throwable -> L19
        return false;
    L7:
        if (r1.y.contains(this.g) == false) goto L21;
        df5 r2 = this.q.x;     // Catch: Throwable -> L19
        int r4 = this.k;     // Catch: Throwable -> L19
        r2.getClass();     // Catch: Throwable -> L19
        eg5 r3 = new eg5(r5, r4);     // Catch: Throwable -> L19
    L9:
        AtomicReference r6 = r2.p;     // Catch: Throwable -> L19
    L10:
        int r7 = 1;
        if (r6.compareAndSet(null, r3) == true) goto L12;
        if (r6.get() == null) goto L10;
        if (r6.get() == null) goto L9;
    L17:
        monitor-exit(r0);     // Catch: Throwable -> L19
        return true;
    L12:
        r2.q.post(new qf5(r7, r2, r3));     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        throw th;
    }

    public final void j() {
        ij1 r0 = this.q;
        ji2.j(r0.A);
        me r1 = this.f;
        if (r1.Y() == false) goto L5;
        return;
    L5:
        if (r1.c0() == false) goto L48;
        return;
    L48:
        hd5 r3 = r0.t;     // Catch: IllegalStateException -> L27
        Context r4 = r0.r;     // Catch: IllegalStateException -> L27
        SparseIntArray r5 = (SparseIntArray) r3.o;     // Catch: IllegalStateException -> L27
        ji2.m(r4);     // Catch: IllegalStateException -> L27
        int r6 = r1.f0();     // Catch: IllegalStateException -> L27
        int r7 = ((SparseIntArray) r3.o).get(r6, -1);     // Catch: IllegalStateException -> L27
        if (r7 != (-1)) goto L24;
        r7 = 0;
        int r9 = 0;
    L13:
        if (r9 >= r5.size()) goto L20;
        int r10 = r5.keyAt(r9);     // Catch: IllegalStateException -> L27
        if (r10 <= r6) goto L19;
        if (r5.get(r10) != 0) goto L19;
    L21:
        if (r7 != (-1)) goto L23;
        r7 = ((ej1) r3.p).b(r4, r6);     // Catch: IllegalStateException -> L27
    L23:
        r5.put(r6, r7);     // Catch: IllegalStateException -> L27
    L19:
        r9 = r9 + 1;     // Catch: IllegalStateException -> L27
        goto L13
    L20:
        r7 = -1;
    L24:
        if (r7 == 0) goto L29;
        ka0 r2 = new ka0(r7, null);     // Catch: IllegalStateException -> L27
        Log.w("GoogleApiManager", "The service for " + r1.getClass().getName() + " is not available: " + r2.toString());     // Catch: IllegalStateException -> L27
        l(r2, null);     // Catch: IllegalStateException -> L27
        return;
    L29:
        nq r8 = new nq(r0, r1, this.g);
        if (r1.i0() == false) goto L50;
        rf5 r11 = this.l;
        ji2.m(r11);
        Handler r12 = r11.g;
        ml3 r13 = r11.j;
        sd4 r14 = r11.k;
        if (r14 == null) goto L34;
        r14.b();
    L34:
        r13.f = Integer.valueOf(System.identityHashCode(r11));
        r11.k = (sd4) r11.h.a(r11.f, r12.getLooper(), r13, (ud4) r13.e, r11, r11);
        r11.l = r8;
        Set r15 = r11.i;
        if (r15 != null) goto L37;
    L40:
        r12.post(new wu4(7, r11));
        goto L50
    L37:
        if (r15.isEmpty() == true) goto L40;
        sd4 r16 = r11.k;
        r16.getClass();
        r16.e0(new d34(9, r16));
    L50:
        r1.e0(r8);     // Catch: SecurityException -> L43
        return;
    L43:
        e = move-exception;
        l(new ka0(10), e);
        return;
    L27:
        e = move-exception;
        l(new ka0(10), e);
    }

    public final void k(cg5 r3) {
        ji2.j(this.q.A);
        boolean r0 = this.f.Y();
        LinkedList r1 = this.e;
        if (r0 == true) goto L5;
        r1.add(r3);
        ka0 r4 = this.o;
        if (r4 != null) goto L13;
    L18:
        j();
        return;
    L13:
        if (r4.o == 0) goto L18;
        if (r4.p == null) goto L18;
        l(r4, null);
        return;
    L5:
        if (h(r3) == false) goto L8;
        g();
        return;
    L8:
        r1.add(r3);
    }

    public final void l(ka0 r7, RuntimeException r8) {
        ji2.j(this.q.A);
        rf5 r0 = this.l;
        if (r0 == null) goto L7;
        sd4 r1 = r0.k;
        if (r1 == null) goto L7;
        r1.b();
    L7:
        ji2.j(this.q.A);
        this.o = null;
        ((SparseIntArray) this.q.t.o).clear();
        a(r7);
        if ((this.f instanceof fg5) == false) goto L13;
        if (r7.o == 24) goto L13;
        ij1 r2 = this.q;
        r2.o = true;
        zw2 r3 = r2.A;
        r3.sendMessageDelayed(r3.obtainMessage(19), 300000);
    L13:
        if (r7.o != 4) goto L17;
        b(ij1.D);
        return;
    L17:
        if (this.e.isEmpty() == false) goto L20;
        this.o = r7;
        return;
    L20:
        ij1 r4 = this.q;
        if (r8 == null) goto L24;
        ji2.j(r4.A);
        c(null, r8, false);
        return;
    L24:
        boolean r9 = r4.B;
        ve r5 = this.g;
        if (r9 == false) goto L42;
        c(ij1.d(r5, r7), null, true);
        if (this.e.isEmpty() == false) goto L30;
        return;
    L30:
        if (i(r7) == false) goto L32;
        return;
    L32:
        if (this.q.c(r7, this.k) == false) goto L34;
        return;
    L34:
        if (r7.o != 18) goto L37;
        this.m = true;
    L37:
        if (this.m == false) goto L40;
        ij1 r10 = this.q;
        ve r6 = this.g;
        zw2 r11 = r10.A;
        r11.sendMessageDelayed(Message.obtain(r11, 9, r6), 5000);
        return;
    L40:
        b(ij1.d(this.g, r7));
        return;
    L42:
        b(ij1.d(r5, r7));
    }

    @Override // defpackage.hj1
    public final void m(ka0 r2) {
        l(r2, null);
    }

    public final void n(ka0 r6) {
        ji2.j(this.q.A);
        me r0 = this.f;
        r0.a0("onSignInFailed for " + r0.getClass().getName() + " with " + String.valueOf(r6));
        l(r6, null);
    }

    public final void o() {
        ji2.j(this.q.A);
        Status r0 = ij1.C;
        b(r0);
        int r2 = 0;
        this.h.x(false, r0);
        pc2[] r1 = (pc2[]) this.j.keySet().toArray(new pc2[0]);
        int r3 = r1.length;
    L3:
        if (r2 >= r3) goto L5;
        pc2 r4 = r1[r2];
        k(new ag5(new cr4()));
        r2 = r2 + 1;
        goto L3
    L5:
        int r5 = 4;
        a(new ka0(4));
        me r6 = this.f;
        if (r6.Y() == false) goto L10;
        r6.b0(new h45(r5, this));
        return;
    }
}
