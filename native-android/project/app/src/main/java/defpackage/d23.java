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

    public d23(v23 v23Var, t43 t43Var) {
        t43Var.getClass();
        this.h = v23Var;
        this.a = new ReentrantLock(true);
        nl4 nl4VarA = ya4.a(u01.n);
        this.b = nl4VarA;
        nl4 nl4VarA2 = ya4.a(z01.n);
        this.c = nl4VarA2;
        this.e = new vu3(nl4VarA);
        this.f = new vu3(nl4VarA2);
        this.g = t43Var;
    }

    public final void a(a23 a23Var) {
        a23Var.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            nl4 nl4Var = this.b;
            nl4Var.j(null, q40.F0(a23Var, (Collection) nl4Var.getValue()));
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    public final void b(a23 a23Var) {
        j23 j23Var;
        e75 e75Var;
        a23Var.getClass();
        String str = a23Var.s;
        v23 v23Var = this.h;
        nl4 nl4Var = v23Var.i;
        LinkedHashMap linkedHashMap = v23Var.y;
        boolean zC = h12.c(linkedHashMap.get(a23Var), Boolean.TRUE);
        nl4 nl4Var2 = this.c;
        nl4Var2.j(null, kb4.K((Set) nl4Var2.getValue(), a23Var));
        linkedHashMap.remove(a23Var);
        ii iiVar = v23Var.g;
        if (iiVar.contains(a23Var)) {
            if (this.d) {
                return;
            }
            v23Var.x();
            nl4 nl4Var3 = v23Var.h;
            ArrayList arrayListR0 = q40.R0(iiVar);
            nl4Var3.getClass();
            nl4Var3.j(null, arrayListR0);
            ArrayList arrayListT = v23Var.t();
            nl4Var.getClass();
            nl4Var.j(null, arrayListT);
            return;
        }
        v23Var.w(a23Var);
        if (a23Var.u.h.compareTo(r92.p) >= 0) {
            a23Var.x = r92.n;
            a23Var.e();
        }
        if (iiVar == null || !iiVar.isEmpty()) {
            Iterator it = iiVar.iterator();
            while (it.hasNext()) {
                if (h12.c(((a23) it.next()).s, str)) {
                }
            }
            if (!zC && (j23Var = v23Var.o) != null) {
                str.getClass();
                e75Var = (e75) j23Var.b.remove(str);
                if (e75Var != null) {
                    e75Var.a();
                }
            }
        } else if (!zC) {
            str.getClass();
            e75Var = (e75) j23Var.b.remove(str);
            if (e75Var != null) {
                e75Var.a();
            }
        }
        v23Var.x();
        ArrayList arrayListT2 = v23Var.t();
        nl4Var.getClass();
        nl4Var.j(null, arrayListT2);
    }

    public final void c(a23 a23Var) {
        int iNextIndex;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            ArrayList arrayListR0 = q40.R0((Collection) this.e.n.getValue());
            ListIterator listIterator = arrayListR0.listIterator(arrayListR0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (h12.c(((a23) listIterator.previous()).s, a23Var.s)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            arrayListR0.set(iNextIndex, a23Var);
            nl4 nl4Var = this.b;
            nl4Var.getClass();
            nl4Var.j(null, arrayListR0);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(a23 a23Var, boolean z) {
        a23Var.getClass();
        v23 v23Var = this.h;
        t43 t43VarB = v23Var.u.b(a23Var.o.n);
        v23Var.y.put(a23Var, Boolean.valueOf(z));
        if (!t43VarB.equals(this.g)) {
            Object obj = v23Var.v.get(t43VarB);
            obj.getClass();
            ((d23) obj).d(a23Var, z);
            return;
        }
        f23 f23Var = v23Var.x;
        if (f23Var != null) {
            f23Var.invoke(a23Var);
            e(a23Var);
            return;
        }
        gp gpVar = new gp(this, a23Var, z);
        ii iiVar = v23Var.g;
        int iIndexOf = iiVar.indexOf(a23Var);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + a23Var + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != iiVar.p) {
            v23Var.q(((a23) iiVar.get(i)).o.u, true, false);
        }
        v23.s(v23Var, a23Var);
        gpVar.invoke();
        v23Var.y();
        v23Var.c();
    }

    public final void e(a23 a23Var) {
        a23Var.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            nl4 nl4Var = this.b;
            Iterable iterable = (Iterable) nl4Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (h12.c((a23) obj, a23Var)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            nl4Var.j(null, arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(a23 a23Var, boolean z) {
        Object objPrevious;
        a23Var.getClass();
        nl4 nl4Var = this.c;
        Iterable iterable = (Iterable) nl4Var.getValue();
        boolean z2 = iterable instanceof Collection;
        vu3 vu3Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((a23) it.next()) == a23Var) {
                    Iterable iterable2 = (Iterable) vu3Var.n.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((a23) it2.next()) == a23Var) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        nl4Var.j(null, kb4.Q((Set) nl4Var.getValue(), a23Var));
        nl4 nl4Var2 = vu3Var.n;
        nl4 nl4Var3 = vu3Var.n;
        List list = (List) nl4Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            a23 a23Var2 = (a23) objPrevious;
            if (!h12.c(a23Var2, a23Var) && ((List) nl4Var3.getValue()).lastIndexOf(a23Var2) < ((List) nl4Var3.getValue()).lastIndexOf(a23Var)) {
                break;
            }
        }
        a23 a23Var3 = (a23) objPrevious;
        if (a23Var3 != null) {
            nl4Var.j(null, kb4.Q((Set) nl4Var.getValue(), a23Var3));
        }
        d(a23Var, z);
    }

    public final void g(a23 a23Var) {
        a23Var.getClass();
        v23 v23Var = this.h;
        t43 t43VarB = v23Var.u.b(a23Var.o.n);
        if (!t43VarB.equals(this.g)) {
            Object obj = v23Var.v.get(t43VarB);
            if (obj != null) {
                ((d23) obj).g(a23Var);
                return;
            } else {
                nz2.f(b11.q(new StringBuilder("NavigatorBackStack for "), a23Var.o.n, " should already be created"));
                return;
            }
        }
        if1 if1Var = v23Var.w;
        if (if1Var != null) {
            if1Var.invoke(a23Var);
            a(a23Var);
        } else {
            Log.i("NavController", "Ignoring add of destination " + a23Var.o + " outside of the call to navigate(). ");
        }
    }

    public final void h(a23 a23Var) {
        nl4 nl4Var = this.c;
        Iterable iterable = (Iterable) nl4Var.getValue();
        boolean z = iterable instanceof Collection;
        vu3 vu3Var = this.e;
        if (!z || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((a23) it.next()) == a23Var) {
                    Iterable iterable2 = (Iterable) vu3Var.n.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((a23) it2.next()) == a23Var) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        a23 a23Var2 = (a23) q40.D0((List) vu3Var.n.getValue());
        if (a23Var2 != null) {
            nl4Var.j(null, kb4.Q((Set) nl4Var.getValue(), a23Var2));
        }
        nl4Var.j(null, kb4.Q((Set) nl4Var.getValue(), a23Var));
        g(a23Var);
    }
}
