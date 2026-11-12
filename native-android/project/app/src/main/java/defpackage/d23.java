package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d23 {
    public final ReentrantLock a;
    public final nl4 b;
    public final nl4 c;
    public boolean d;
    public final vu3 e;
    public final vu3 f;
    public final t43 g;
    public final /* synthetic */ v23 h;

    public d23(v23 r3, t43 r4) {
        r4.getClass();
        this.h = r3;
        this.a = new ReentrantLock(true);
        nl4 r5 = ya4.a(u01.n);
        this.b = r5;
        nl4 r0 = ya4.a(z01.n);
        this.c = r0;
        this.e = new vu3(r5);
        this.f = new vu3(r0);
        this.g = r4;
    }

    public final void a(a23 r3) {
        r3.getClass();
        ReentrantLock r0 = this.a;
        r0.lock();
        nl4 r2 = this.b;     // Catch: Throwable -> L6
        r2.j(null, q40.F0(r3, (Collection) r2.getValue()));     // Catch: Throwable -> L6
        r0.unlock();
        return;
    L6:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    public final void b(a23 r9) {
        r9.getClass();
        String r0 = r9.s;
        v23 r1 = this.h;
        nl4 r2 = r1.i;
        LinkedHashMap r3 = r1.y;
        boolean r4 = h12.c(r3.get(r9), Boolean.TRUE);
        nl4 r5 = this.c;
        r5.j(null, kb4.K((Set) r5.getValue(), r9));
        r3.remove(r9);
        ii r6 = r1.g;
        if (r6.contains(r9) == true) goto L26;
        r1.w(r9);
        if (r9.u.h.compareTo(r92.p) < 0) goto L7;
        r9.x = r92.n;
        r9.e();
    L7:
        if (r6 != null) goto L9;
    L11:
        Iterator r8 = r6.iterator();
    L13:
        if (r8.hasNext() == false) goto L17;
        if (h12.c(((a23) r8.next()).s, r0) == false) goto L13;
    L23:
        r1.x();
        ArrayList r10 = r1.t();
        r2.getClass();
        r2.j(null, r10);
        return;
    L17:
        if (r4 == true) goto L23;
        j23 r11 = r1.o;
        if (r11 == null) goto L23;
        r0.getClass();
        e75 r12 = (e75) r11.b.remove(r0);
        if (r12 == null) goto L23;
        r12.a();
        goto L23
    L9:
        if (r6.isEmpty() == false) goto L11;
    L26:
        if (this.d == true) goto L32;
        r1.x();
        nl4 r13 = r1.h;
        ArrayList r14 = q40.R0(r6);
        r13.getClass();
        r13.j(null, r14);
        ArrayList r15 = r1.t();
        r2.getClass();
        r2.j(null, r15);
        return;
    }

    public final void c(a23 r6) {
        ReentrantLock r0 = this.a;
        r0.lock();
        ArrayList r1 = q40.R0((Collection) this.e.n.getValue());     // Catch: Throwable -> L9
        ListIterator r2 = r1.listIterator(r1.size());     // Catch: Throwable -> L9
    L5:
        if (r2.hasPrevious() == false) goto L11;
        if (h12.c(((a23) r2.previous()).s, r6.s) == false) goto L5;
        int r3 = r2.nextIndex();     // Catch: Throwable -> L9
    L12:
        r1.set(r3, r6);     // Catch: Throwable -> L9
        nl4 r5 = this.b;     // Catch: Throwable -> L9
        r5.getClass();     // Catch: Throwable -> L9
        r5.j(null, r1);     // Catch: Throwable -> L9
        r0.unlock();
        return;
    L11:
        r3 = -1;
    L9:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    public final void d(a23 r5, boolean r6) {
        r5.getClass();
        v23 r0 = this.h;
        t43 r1 = r0.u.b(r5.o.n);
        r0.y.put(r5, Boolean.valueOf(r6));
        if (r1.equals(this.g) == false) goto L17;
        f23 r2 = r0.x;
        if (r2 == null) goto L8;
        r2.invoke(r5);
        e(r5);
        return;
    L8:
        gp r3 = new gp(this, r5, r6);
        ii r4 = r0.g;
        int r7 = r4.indexOf(r5);
        if (r7 >= 0) goto L12;
        Log.i("NavController", "Ignoring pop of " + r5 + " as it was not found on the current back stack");
        return;
    L12:
        int r8 = r7 + 1;
        if (r8 == r4.p) goto L15;
        r0.q(((a23) r4.get(r8)).o.u, true, false);
    L15:
        v23.s(r0, r5);
        r3.invoke();
        r0.y();
        r0.c();
        return;
    L17:
        Object r9 = r0.v.get(r1);
        r9.getClass();
        ((d23) r9).d(r5, r6);
    }

    public final void e(a23 r6) {
        r6.getClass();
        ReentrantLock r0 = this.a;
        r0.lock();
        nl4 r5 = this.b;     // Catch: Throwable -> L10
        Iterable r1 = (Iterable) r5.getValue();     // Catch: Throwable -> L10
        ArrayList r2 = new ArrayList();     // Catch: Throwable -> L10
        Iterator r3 = r1.iterator();     // Catch: Throwable -> L10
    L5:
        if (r3.hasNext() == false) goto L12;
        Object r4 = r3.next();     // Catch: Throwable -> L10
        if (h12.c((a23) r4, r6) == true) goto L12;
        r2.add(r4);     // Catch: Throwable -> L10
    L12:
        r5.j(null, r2);     // Catch: Throwable -> L10
        r0.unlock();
        return;
    L10:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    public final void f(a23 r8, boolean r9) {
        r8.getClass();
        nl4 r0 = this.c;
        Iterable r1 = (Iterable) r0.getValue();
        boolean r2 = r1 instanceof Collection;
        vu3 r3 = this.e;
        if (r2 == true) goto L5;
    L7:
        Iterator r4 = r1.iterator();
    L9:
        if (r4.hasNext() == false) goto L24;
        if (((a23) r4.next()) != r8) goto L9;
        Iterable r5 = (Iterable) r3.n.getValue();
        if ((r5 instanceof Collection) == true) goto L15;
    L17:
        Iterator r6 = r5.iterator();
    L19:
        if (r6.hasNext() == false) goto L50;
        if (((a23) r6.next()) != r8) goto L19;
    L50:
        return;
    L15:
        if (((Collection) r5).isEmpty() == false) goto L17;
        return;
    L24:
        r0.j(null, kb4.Q((Set) r0.getValue(), r8));
        nl4 r7 = r3.n;
        nl4 r10 = r3.n;
        List r11 = (List) r7.getValue();
        ListIterator r12 = r11.listIterator(r11.size());
    L26:
        if (r12.hasPrevious() == false) goto L32;
        Object r13 = r12.previous();
        a23 r14 = (a23) r13;
        if (h12.c(r14, r8) == true) goto L26;
        if (((List) r10.getValue()).lastIndexOf(r14) >= ((List) r10.getValue()).lastIndexOf(r8)) goto L26;
    L33:
        a23 r15 = (a23) r13;
        if (r15 == null) goto L36;
        r0.j(null, kb4.Q((Set) r0.getValue(), r15));
    L36:
        d(r8, r9);
        return;
    L32:
        r13 = null;
        goto L33
    L5:
        if (((Collection) r1).isEmpty() == false) goto L7;
        goto L7
    }

    public final void g(a23 r4) {
        r4.getClass();
        v23 r0 = this.h;
        t43 r1 = r0.u.b(r4.o.n);
        if (r1.equals(this.g) == false) goto L10;
        if1 r2 = r0.w;
        if (r2 == null) goto L8;
        r2.invoke(r4);
        a(r4);
        return;
    L8:
        Log.i("NavController", "Ignoring add of destination " + r4.o + " outside of the call to navigate(). ");
        return;
    L10:
        Object r3 = r0.v.get(r1);
        if (r3 == null) goto L14;
        ((d23) r3).g(r4);
        return;
    L14:
        nz2.f(b11.q(new StringBuilder("NavigatorBackStack for "), r4.o.n, " should already be created"));
    }

    public final void h(a23 r5) {
        nl4 r0 = this.c;
        Iterable r1 = (Iterable) r0.getValue();
        boolean r2 = r1 instanceof Collection;
        vu3 r3 = this.e;
        if (r2 == true) goto L5;
    L7:
        Iterator r4 = r1.iterator();
    L9:
        if (r4.hasNext() == false) goto L23;
        if (((a23) r4.next()) != r5) goto L9;
        Iterable r6 = (Iterable) r3.n.getValue();
        if ((r6 instanceof Collection) == true) goto L15;
    L17:
        Iterator r7 = r6.iterator();
    L19:
        if (r7.hasNext() == false) goto L23;
        if (((a23) r7.next()) != r5) goto L19;
        return;
    L15:
        if (((Collection) r6).isEmpty() == false) goto L17;
    L23:
        a23 r8 = (a23) q40.D0((List) r3.n.getValue());
        if (r8 == null) goto L26;
        r0.j(null, kb4.Q((Set) r0.getValue(), r8));
    L26:
        r0.j(null, kb4.Q((Set) r0.getValue(), r5));
        g(r5);
        return;
    L5:
        if (((Collection) r1).isEmpty() == false) goto L7;
        goto L7
    }
}
