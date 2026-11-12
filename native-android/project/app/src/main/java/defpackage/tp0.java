package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
@s43("dialog")
public final class tp0 extends t43 {
    public final Context c;
    public final ld1 d;
    public final LinkedHashSet e;
    public final vv3 f;
    public final LinkedHashMap g;

    public tp0(Context r1, ld1 r2) {
        this.c = r1;
        this.d = r2;
        this.e = new LinkedHashSet();
        this.f = new vv3(3, this);
        this.g = new LinkedHashMap();
    }

    @Override // defpackage.t43
    public final r23 a() {
        return new rp0(this);
    }

    @Override // defpackage.t43
    public final void d(List r5, y23 r6) {
        ld1 r7 = this.d;
        if (r7.N() == false) goto L6;
        Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
        return;
    L6:
        Iterator r8 = r5.iterator();
    L8:
        if (r8.hasNext() == false) goto L13;
        a23 r0 = (a23) r8.next();
        k(r0).m0(r7, r0.s);
        a23 r1 = (a23) q40.D0((List) b().e.n.getValue());
        boolean r2 = q40.s0((Iterable) b().f.n.getValue(), r1);
        b().h(r0);
        if (r1 == null) goto L8;
        if (r2 == true) goto L8;
        b().b(r1);
        goto L8
    }

    @Override // defpackage.t43
    public final void e(d23 r4) {
        this.a = r4;
        this.b = true;
        Iterator r5 = ((List) r4.e.n.getValue()).iterator();
    L3:
        boolean r0 = r5.hasNext();
        ld1 r1 = this.d;
        if (r0 == false) goto L11;
        a23 r2 = (a23) r5.next();
        pp0 r3 = (pp0) r1.D(r2.s);
        if (r3 == null) goto L10;
        ea2 r6 = r3.c0;
        if (r6 == null) goto L10;
        r6.a(this.f);
    L10:
        this.e.add(r2.s);
        goto L3
    L11:
        xd1 r7 = new qp0(this);
        r1.o.add(r7);
    }

    @Override // defpackage.t43
    public final void f(a23 r7) {
        String r0 = r7.s;
        ld1 r1 = this.d;
        if (r1.N() == false) goto L6;
        Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
        return;
    L6:
        pp0 r2 = (pp0) this.g.get(r0);
        if (r2 != null) goto L12;
        kc1 r3 = r1.D(r0);
        if ((r3 instanceof pp0) == false) goto L11;
        r2 = (pp0) r3;
        goto L12
    L11:
        r2 = null;
    L12:
        if (r2 == null) goto L14;
        r2.c0.f(this.f);
        r2.h0();
    L14:
        k(r7).m0(r1, r0);
        d23 r6 = b();
        List r4 = (List) r6.e.n.getValue();
        ListIterator r5 = r4.listIterator(r4.size());
    L16:
        if (r5.hasPrevious() == false) goto L21;
        a23 r8 = (a23) r5.previous();
        if (h12.c(r8.s, r0) == false) goto L16;
        nl4 r9 = r6.c;
        r9.j(null, kb4.Q(kb4.Q((Set) r9.getValue(), r8), r7));
        r6.c(r7);
        return;
    L21:
        kf2.m("List contains no element matching the predicate.");
    }

    @Override // defpackage.t43
    public final void i(a23 r5, boolean r6) {
        r5.getClass();
        ld1 r0 = this.d;
        if (r0.N() == false) goto L6;
        Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
        return;
    L6:
        List r1 = (List) b().e.n.getValue();
        int r2 = r1.indexOf(r5);
        Iterator r3 = q40.H0(r1.subList(r2, r1.size())).iterator();
    L8:
        if (r3.hasNext() == false) goto L12;
        kc1 r4 = r0.D(((a23) r3.next()).s);
        if (r4 == null) goto L8;
        ((pp0) r4).h0();
        goto L8
    L12:
        l(r2, r5, r6);
    }

    public final pp0 k(a23 r8) {
        r23 r0 = r8.o;
        r0.getClass();
        rp0 r1 = (rp0) r0;
        String r2 = r1.x;
        if (r2 == null) goto L17;
        char r4 = r2.charAt(0);
        Context r6 = this.c;
        if (r4 != '.') goto L7;
        r2 = r6.getPackageName() + r2;
    L7:
        dd1 r5 = this.d.F();
        r6.getClassLoader();
        kc1 r3 = r5.a(r2);
        r3.getClass();
        if (pp0.class.isAssignableFrom(r3.getClass()) == false) goto L11;
        pp0 r7 = (pp0) r3;
        r7.c0(r8.c());
        r7.c0.a(this.f);
        this.g.put(r8.s, r7);
        return r7;
    L11:
        StringBuilder r9 = new StringBuilder("Dialog destination ");
        String r10 = r1.x;
        if (r10 == null) goto L15;
        kf2.e(b11.q(r9, r10, " is not an instance of DialogFragment"));
        return null;
    L15:
        kf2.o("DialogFragment class was not set");
        return null;
    L17:
        kf2.o("DialogFragment class was not set");
        return null;
    }

    public final void l(int r3, a23 r4, boolean r5) {
        a23 r6 = (a23) q40.y0((List) b().e.n.getValue(), r3 - 1);
        boolean r0 = q40.s0((Iterable) b().f.n.getValue(), r6);
        b().f(r4, r5);
        if (r6 == null) goto L7;
        if (r0 == true) goto L8;
        b().b(r6);
        return;
    L8:
        return;
    }
}
