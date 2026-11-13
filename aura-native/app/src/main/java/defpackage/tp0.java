package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
@s43("dialog")
/* loaded from: classes.dex */
public final class tp0 extends t43 {
    public final Context c;
    public final ld1 d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final vv3 f = new vv3(3, this);
    public final LinkedHashMap g = new LinkedHashMap();

    public tp0(Context context, ld1 ld1Var) {
        this.c = context;
        this.d = ld1Var;
    }

    @Override // defpackage.t43
    public final r23 a() {
        return new rp0(this);
    }

    @Override // defpackage.t43
    public final void d(List list, y23 y23Var) {
        ld1 ld1Var = this.d;
        if (ld1Var.N()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a23 a23Var = (a23) it.next();
            k(a23Var).m0(ld1Var, a23Var.s);
            a23 a23Var2 = (a23) q40.D0((List) b().e.n.getValue());
            boolean s0 = q40.s0((Iterable) b().f.n.getValue(), a23Var2);
            b().h(a23Var);
            if (a23Var2 != null && !s0) {
                b().b(a23Var2);
            }
        }
    }

    @Override // defpackage.t43
    public final void e(d23 d23Var) {
        ea2 ea2Var;
        this.a = d23Var;
        this.b = true;
        Iterator it = ((List) d23Var.e.n.getValue()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ld1 ld1Var = this.d;
            if (!hasNext) {
                ld1Var.o.add(new xd1() { // from class: qp0
                    @Override // defpackage.xd1
                    public final void a(ld1 ld1Var2, kc1 kc1Var) {
                        ld1Var2.getClass();
                        kc1Var.getClass();
                        tp0 tp0Var = tp0.this;
                        LinkedHashSet linkedHashSet = tp0Var.e;
                        String str = kc1Var.L;
                        if ((linkedHashSet instanceof x32) && !(linkedHashSet instanceof y32)) {
                            jz4.M(linkedHashSet, "kotlin.collections.MutableCollection");
                            throw null;
                        }
                        if (linkedHashSet.remove(str)) {
                            kc1Var.c0.a(tp0Var.f);
                        }
                        LinkedHashMap linkedHashMap = tp0Var.g;
                        jz4.f(linkedHashMap).remove(kc1Var.L);
                    }
                });
                return;
            }
            a23 a23Var = (a23) it.next();
            pp0 pp0Var = (pp0) ld1Var.D(a23Var.s);
            if (pp0Var == null || (ea2Var = pp0Var.c0) == null) {
                this.e.add(a23Var.s);
            } else {
                ea2Var.a(this.f);
            }
        }
    }

    @Override // defpackage.t43
    public final void f(a23 a23Var) {
        String str = a23Var.s;
        ld1 ld1Var = this.d;
        if (ld1Var.N()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        pp0 pp0Var = (pp0) this.g.get(str);
        if (pp0Var == null) {
            kc1 D = ld1Var.D(str);
            pp0Var = D instanceof pp0 ? (pp0) D : null;
        }
        if (pp0Var != null) {
            pp0Var.c0.f(this.f);
            pp0Var.h0();
        }
        k(a23Var).m0(ld1Var, str);
        d23 b = b();
        List list = (List) b.e.n.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            a23 a23Var2 = (a23) listIterator.previous();
            if (h12.c(a23Var2.s, str)) {
                nl4 nl4Var = b.c;
                nl4Var.j(null, kb4.Q(kb4.Q((Set) nl4Var.getValue(), a23Var2), a23Var));
                b.c(a23Var);
                return;
            }
        }
        kf2.m("List contains no element matching the predicate.");
    }

    @Override // defpackage.t43
    public final void i(a23 a23Var, boolean z) {
        a23Var.getClass();
        ld1 ld1Var = this.d;
        if (ld1Var.N()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().e.n.getValue();
        int indexOf = list.indexOf(a23Var);
        Iterator it = q40.H0(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            kc1 D = ld1Var.D(((a23) it.next()).s);
            if (D != null) {
                ((pp0) D).h0();
            }
        }
        l(indexOf, a23Var, z);
    }

    public final pp0 k(a23 a23Var) {
        r23 r23Var = a23Var.o;
        r23Var.getClass();
        rp0 rp0Var = (rp0) r23Var;
        String str = rp0Var.x;
        if (str == null) {
            kf2.o("DialogFragment class was not set");
            return null;
        }
        char charAt = str.charAt(0);
        Context context = this.c;
        if (charAt == '.') {
            str = context.getPackageName() + str;
        }
        dd1 F = this.d.F();
        context.getClassLoader();
        kc1 a = F.a(str);
        a.getClass();
        if (pp0.class.isAssignableFrom(a.getClass())) {
            pp0 pp0Var = (pp0) a;
            pp0Var.c0(a23Var.c());
            pp0Var.c0.a(this.f);
            this.g.put(a23Var.s, pp0Var);
            return pp0Var;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = rp0Var.x;
        if (str2 != null) {
            kf2.e(b11.q(sb, str2, " is not an instance of DialogFragment"));
            return null;
        }
        kf2.o("DialogFragment class was not set");
        return null;
    }

    public final void l(int i, a23 a23Var, boolean z) {
        a23 a23Var2 = (a23) q40.y0((List) b().e.n.getValue(), i - 1);
        boolean s0 = q40.s0((Iterable) b().f.n.getValue(), a23Var2);
        b().f(a23Var, z);
        if (a23Var2 == null || s0) {
            return;
        }
        b().b(a23Var2);
    }
}
