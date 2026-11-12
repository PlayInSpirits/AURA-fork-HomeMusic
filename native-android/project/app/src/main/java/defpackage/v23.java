package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v23 {
    public final ArrayList A;
    public final rp4 B;
    public final cd4 C;
    public final Context a;
    public final Activity b;
    public t23 c;
    public Bundle d;
    public Parcelable[] e;
    public boolean f;
    public final ii g;
    public final nl4 h;
    public final nl4 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public ba2 n;
    public j23 o;
    public final CopyOnWriteArrayList p;
    public r92 q;
    public final pd1 r;
    public final bd1 s;
    public final boolean t;
    public final u43 u;
    public final LinkedHashMap v;
    public if1 w;
    public f23 x;
    public final LinkedHashMap y;
    public int z;

    public v23(Context context) {
        this.a = context;
        for (Object obj : fa4.c0(k5.s, context)) {
            if (((Context) obj) instanceof Activity) {
                this.b = (Activity) obj;
                this.g = new ii();
                u01 u01Var = u01.n;
                this.h = ya4.a(u01Var);
                this.i = ya4.a(u01Var);
                this.j = new LinkedHashMap();
                this.k = new LinkedHashMap();
                this.l = new LinkedHashMap();
                this.m = new LinkedHashMap();
                this.p = new CopyOnWriteArrayList();
                this.q = r92.o;
                this.r = new pd1(1, this);
                this.s = new bd1(5, this);
                this.t = true;
                u43 u43Var = new u43();
                this.u = u43Var;
                this.v = new LinkedHashMap();
                this.y = new LinkedHashMap();
                u43Var.a(new u23(u43Var));
                u43Var.a(new l5(this.a));
                this.A = new ArrayList();
                this.B = new rp4(new zf0(3, this));
                this.C = g12.a(1, 0, wv.o);
            }
        }
        obj = null;
        this.b = (Activity) obj;
        this.g = new ii();
        u01 u01Var2 = u01.n;
        this.h = ya4.a(u01Var2);
        this.i = ya4.a(u01Var2);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new CopyOnWriteArrayList();
        this.q = r92.o;
        this.r = new pd1(1, this);
        this.s = new bd1(5, this);
        this.t = true;
        u43 u43Var2 = new u43();
        this.u = u43Var2;
        this.v = new LinkedHashMap();
        this.y = new LinkedHashMap();
        u43Var2.a(new u23(u43Var2));
        u43Var2.a(new l5(this.a));
        this.A = new ArrayList();
        this.B = new rp4(new zf0(3, this));
        this.C = g12.a(1, 0, wv.o);
    }

    public static r23 e(int i, r23 r23Var, r23 r23Var2, boolean z) {
        t23 t23Var;
        if (r23Var.u == i && (r23Var2 == null || (r23Var.equals(r23Var2) && h12.c(r23Var.o, r23Var2.o)))) {
            return r23Var;
        }
        if (r23Var instanceof t23) {
            t23Var = (t23) r23Var;
        } else {
            t23 t23Var2 = r23Var.o;
            t23Var2.getClass();
            t23Var = t23Var2;
        }
        return t23Var.h(i, t23Var, r23Var2, z);
    }

    public static /* synthetic */ void s(v23 v23Var, a23 a23Var) {
        v23Var.r(a23Var, false, new ii());
    }

    public final void a(r23 r23Var, Bundle bundle, a23 a23Var, List list) {
        Object objPrevious;
        Object objPrevious2;
        r23 r23Var2 = a23Var.o;
        boolean z = r23Var2 instanceof rp0;
        ii iiVar = this.g;
        if (!z) {
            while (!iiVar.isEmpty() && (((a23) iiVar.last()).o instanceof rp0) && q(((a23) iiVar.last()).o.u, true, false)) {
            }
        }
        ii<a23> iiVar2 = new ii();
        boolean z2 = r23Var instanceof t23;
        Context context = this.a;
        Object obj = null;
        if (z2) {
            r23 r23Var3 = r23Var2;
            do {
                r23Var3.getClass();
                r23Var3 = r23Var3.o;
                if (r23Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!h12.c(((a23) objPrevious2).o, r23Var3));
                    a23 a23VarV = (a23) objPrevious2;
                    if (a23VarV == null) {
                        a23VarV = tv1.v(context, r23Var3, bundle, j(), this.o);
                    }
                    iiVar2.addFirst(a23VarV);
                    if (!iiVar.isEmpty() && ((a23) iiVar.last()).o == r23Var3) {
                        s(this, (a23) iiVar.last());
                    }
                }
                if (r23Var3 == null) {
                    break;
                }
            } while (r23Var3 != r23Var);
        }
        r23 r23Var4 = iiVar2.isEmpty() ? r23Var2 : ((a23) iiVar2.first()).o;
        while (r23Var4 != null && d(r23Var4.u, r23Var4) != r23Var4) {
            r23Var4 = r23Var4.o;
            if (r23Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!h12.c(((a23) objPrevious).o, r23Var4));
                a23 a23VarV2 = (a23) objPrevious;
                if (a23VarV2 == null) {
                    a23VarV2 = tv1.v(context, r23Var4, r23Var4.a(bundle2), j(), this.o);
                }
                iiVar2.addFirst(a23VarV2);
            }
        }
        if (!iiVar2.isEmpty()) {
            r23Var2 = ((a23) iiVar2.first()).o;
        }
        while (!iiVar.isEmpty() && (((a23) iiVar.last()).o instanceof t23)) {
            r23 r23Var5 = ((a23) iiVar.last()).o;
            r23Var5.getClass();
            if (((t23) r23Var5).x.b(r23Var2.u) != null) {
                break;
            } else {
                s(this, (a23) iiVar.last());
            }
        }
        a23 a23Var2 = (a23) (iiVar.isEmpty() ? null : iiVar.o[iiVar.n]);
        if (a23Var2 == null) {
            a23Var2 = (a23) (iiVar2.isEmpty() ? null : iiVar2.o[iiVar2.n]);
        }
        if (!h12.c(a23Var2 != null ? a23Var2.o : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                r23 r23Var6 = ((a23) objPrevious3).o;
                t23 t23Var = this.c;
                t23Var.getClass();
                if (h12.c(r23Var6, t23Var)) {
                    obj = objPrevious3;
                    break;
                }
            }
            a23 a23VarV3 = (a23) obj;
            if (a23VarV3 == null) {
                t23 t23Var2 = this.c;
                t23Var2.getClass();
                t23 t23Var3 = this.c;
                t23Var3.getClass();
                a23VarV3 = tv1.v(context, t23Var2, t23Var3.a(bundle), j(), this.o);
            }
            iiVar2.addFirst(a23VarV3);
        }
        for (a23 a23Var3 : iiVar2) {
            Object obj2 = this.v.get(this.u.b(a23Var3.o.n));
            if (obj2 == null) {
                nz2.f(b11.q(new StringBuilder("NavigatorBackStack for "), r23Var.n, " should already be created"));
                return;
            }
            ((d23) obj2).a(a23Var3);
        }
        iiVar.addAll(iiVar2);
        iiVar.addLast(a23Var);
        ArrayList arrayListF0 = q40.F0(a23Var, iiVar2);
        int size = arrayListF0.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayListF0.get(i);
            i++;
            a23 a23Var4 = (a23) obj3;
            t23 t23Var4 = a23Var4.o.o;
            if (t23Var4 != null) {
                l(a23Var4, f(t23Var4.u));
            }
        }
    }

    public final void b(e23 e23Var) {
        this.p.add(e23Var);
        ii iiVar = this.g;
        if (iiVar.isEmpty()) {
            return;
        }
        a23 a23Var = (a23) iiVar.last();
        r23 r23Var = a23Var.o;
        a23Var.c();
        e23Var.a(this, r23Var);
    }

    public final boolean c() {
        ii iiVar;
        while (true) {
            iiVar = this.g;
            if (iiVar.isEmpty() || !(((a23) iiVar.last()).o instanceof t23)) {
                break;
            }
            s(this, (a23) iiVar.last());
        }
        a23 a23Var = (a23) iiVar.g();
        ArrayList arrayList = this.A;
        if (a23Var != null) {
            arrayList.add(a23Var);
        }
        this.z++;
        x();
        int i = this.z - 1;
        this.z = i;
        if (i == 0) {
            ArrayList arrayListR0 = q40.R0(arrayList);
            arrayList.clear();
            int size = arrayListR0.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListR0.get(i2);
                i2++;
                a23 a23Var2 = (a23) obj;
                for (e23 e23Var : this.p) {
                    r23 r23Var = a23Var2.o;
                    a23Var2.c();
                    e23Var.a(this, r23Var);
                }
                this.C.q(a23Var2);
            }
            ArrayList arrayList2 = new ArrayList(iiVar);
            nl4 nl4Var = this.h;
            nl4Var.getClass();
            nl4Var.j(null, arrayList2);
            ArrayList arrayListT = t();
            nl4 nl4Var2 = this.i;
            nl4Var2.getClass();
            nl4Var2.j(null, arrayListT);
        }
        return a23Var != null;
    }

    public final r23 d(int i, r23 r23Var) {
        r23 r23Var2;
        t23 t23Var = this.c;
        if (t23Var == null) {
            return null;
        }
        if (t23Var.u == i) {
            if (r23Var == null) {
                return t23Var;
            }
            if (h12.c(t23Var, r23Var) && r23Var.o == null) {
                return this.c;
            }
        }
        a23 a23Var = (a23) this.g.g();
        if (a23Var == null || (r23Var2 = a23Var.o) == null) {
            r23Var2 = this.c;
            r23Var2.getClass();
        }
        return e(i, r23Var2, r23Var, false);
    }

    public final a23 f(int i) {
        Object objPrevious;
        ii iiVar = this.g;
        ListIterator<E> listIterator = iiVar.listIterator(iiVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((a23) objPrevious).o.u != i);
        a23 a23Var = (a23) objPrevious;
        if (a23Var != null) {
            return a23Var;
        }
        StringBuilder sbJ = f34.j(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbJ.append(g());
        throw new IllegalArgumentException(sbJ.toString().toString());
    }

    public final r23 g() {
        a23 a23Var = (a23) this.g.g();
        if (a23Var != null) {
            return a23Var.o;
        }
        return null;
    }

    public final int h() {
        int i = 0;
        ii iiVar = this.g;
        if (iiVar != null && iiVar.isEmpty()) {
            return 0;
        }
        Iterator it = iiVar.iterator();
        while (it.hasNext()) {
            if (!(((a23) it.next()).o instanceof t23) && (i = i + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    public final t23 i() {
        t23 t23Var = this.c;
        if (t23Var != null) {
            t23Var.getClass();
            return t23Var;
        }
        kf2.o("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final r92 j() {
        return this.n == null ? r92.p : this.q;
    }

    public final t23 k(ii iiVar) {
        r23 r23Var;
        a23 a23Var = (a23) iiVar.g();
        if (a23Var == null || (r23Var = a23Var.o) == null) {
            r23Var = this.c;
            r23Var.getClass();
        }
        if (r23Var instanceof t23) {
            return (t23) r23Var;
        }
        t23 t23Var = r23Var.o;
        t23Var.getClass();
        return t23Var;
    }

    public final void l(a23 a23Var, a23 a23Var2) {
        this.j.put(a23Var, a23Var2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(a23Var2) == null) {
            linkedHashMap.put(a23Var2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(a23Var2);
        obj.getClass();
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public final void m(int i, Bundle bundle, y23 y23Var) {
        int i2;
        Bundle bundle2;
        r23 r23VarD;
        Context context;
        String strV;
        boolean z;
        int i3;
        ii iiVar = this.g;
        r23 r23Var = iiVar.isEmpty() ? this.c : ((a23) iiVar.last()).o;
        if (r23Var == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        y13 y13VarD = r23Var.d(i);
        if (y13VarD != null) {
            if (y23Var == null) {
                y23Var = y13VarD.b;
            }
            i2 = y13VarD.a;
            Bundle bundle3 = y13VarD.c;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i2 == 0 && y23Var != null) {
                z = y23Var.d;
                i3 = y23Var.c;
                if (i3 != -1) {
                    if (i3 != -1) {
                        p(i3, z);
                        return;
                    }
                    return;
                }
            }
            if (i2 != 0) {
                kf2.n("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
                return;
            }
            r23VarD = d(i2, null);
            if (r23VarD == null) {
                n(r23VarD, bundle2, y23Var);
                return;
            }
            int i4 = r23.w;
            context = this.a;
            strV = ya4.v(context, i2);
            if (y13VarD == null) {
                tb4.h("Navigation action/destination ", strV, " cannot be found from the current destination ", r23Var);
                return;
            }
            StringBuilder sbJ = xa3.j("Navigation destination ", strV, " referenced from action ");
            sbJ.append(ya4.v(context, i));
            sbJ.append(" cannot be found from the current destination ");
            sbJ.append(r23Var);
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        i2 = i;
        bundle2 = null;
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i2 == 0) {
            z = y23Var.d;
            i3 = y23Var.c;
            if (i3 != -1) {
                if (i3 != -1) {
                    p(i3, z);
                    return;
                }
                return;
            }
        }
        if (i2 != 0) {
            kf2.n("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            return;
        }
        r23VarD = d(i2, null);
        if (r23VarD == null) {
            n(r23VarD, bundle2, y23Var);
            return;
        }
        int i5 = r23.w;
        context = this.a;
        strV = ya4.v(context, i2);
        if (y13VarD == null) {
            tb4.h("Navigation action/destination ", strV, " cannot be found from the current destination ", r23Var);
            return;
        }
        StringBuilder sbJ2 = xa3.j("Navigation destination ", strV, " referenced from action ");
        sbJ2.append(ya4.v(context, i));
        sbJ2.append(" cannot be found from the current destination ");
        sbJ2.append(r23Var);
        throw new IllegalArgumentException(sbJ2.toString().toString());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101 A[LOOP:4: B:50:0x00fa->B:52:0x0101, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173 A[LOOP:6: B:61:0x016d->B:63:0x0173, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0187  */
    /* JADX WARN: Code duplicated, block: B:67:0x018c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0165 A[SYNTHETIC] */
    public final void n(r23 r23Var, Bundle bundle, y23 y23Var) {
        int i;
        boolean zQ;
        u43 u43Var;
        LinkedHashMap linkedHashMap;
        boolean z;
        int iNextIndex;
        r23 r23Var2;
        ii<a23> iiVar;
        t23 t23Var;
        LinkedHashMap linkedHashMap2 = this.v;
        Iterator it = linkedHashMap2.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                ((d23) it.next()).d = true;
            }
        }
        fx3 fx3Var = new fx3();
        if (y23Var != null) {
            boolean z2 = y23Var.e;
            boolean z3 = y23Var.d;
            int i2 = y23Var.c;
            if (i2 != -1) {
                zQ = q(i2, z3, z2);
            } else {
                zQ = false;
            }
        } else {
            zQ = false;
        }
        Bundle bundleA = r23Var.a(bundle);
        if (y23Var == null || !y23Var.b) {
            u43Var = this.u;
            if (y23Var == null && y23Var.a) {
                ii iiVar2 = this.g;
                a23 a23Var = (a23) iiVar2.g();
                ListIterator listIterator = iiVar2.listIterator(iiVar2.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((a23) listIterator.previous()).o == r23Var) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    linkedHashMap = linkedHashMap2;
                    z = false;
                } else if (r23Var instanceof t23) {
                    int i3 = t23.A;
                    List listF0 = fa4.f0(new tq4(fa4.c0(k5.z, (t23) r23Var), k5.v, 1));
                    if (iiVar2.p - iNextIndex == listF0.size()) {
                        List listSubList = iiVar2.subList(iNextIndex, iiVar2.p);
                        ArrayList arrayList = new ArrayList(r40.k0(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((a23) it2.next()).o.u));
                        }
                        if (arrayList.equals(listF0)) {
                            iiVar = new ii();
                            for (i = 1; iiVar2.size() - i >= iNextIndex; i = 1) {
                                a23 a23Var2 = (a23) v40.q0(iiVar2);
                                w(a23Var2);
                                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                a23 a23Var3 = new a23(a23Var2.n, a23Var2.o, a23Var2.o.a(bundle), a23Var2.q, a23Var2.r, a23Var2.s, a23Var2.t);
                                a23Var3.q = a23Var2.q;
                                r92 r92Var = a23Var2.x;
                                r92Var.getClass();
                                a23Var3.x = r92Var;
                                a23Var3.e();
                                iiVar.addFirst(a23Var3);
                                linkedHashMap2 = linkedHashMap3;
                            }
                            linkedHashMap = linkedHashMap2;
                            for (a23 a23Var4 : iiVar) {
                                t23Var = a23Var4.o.o;
                                if (t23Var != null) {
                                    l(a23Var4, f(t23Var.u));
                                }
                                iiVar2.addLast(a23Var4);
                            }
                            for (a23 a23Var5 : iiVar) {
                                u43Var.b(a23Var5.o.n).f(a23Var5);
                            }
                            z = true;
                        }
                    }
                    linkedHashMap = linkedHashMap2;
                    z = false;
                } else if (a23Var == null || (r23Var2 = a23Var.o) == null || r23Var.u != r23Var2.u) {
                    linkedHashMap = linkedHashMap2;
                    z = false;
                } else {
                    iiVar = new ii();
                    while (iiVar2.size() - i >= iNextIndex) {
                        a23 a23Var6 = (a23) v40.q0(iiVar2);
                        w(a23Var6);
                        LinkedHashMap linkedHashMap4 = linkedHashMap2;
                        a23 a23Var7 = new a23(a23Var6.n, a23Var6.o, a23Var6.o.a(bundle), a23Var6.q, a23Var6.r, a23Var6.s, a23Var6.t);
                        a23Var7.q = a23Var6.q;
                        r92 r92Var2 = a23Var6.x;
                        r92Var2.getClass();
                        a23Var7.x = r92Var2;
                        a23Var7.e();
                        iiVar.addFirst(a23Var7);
                        linkedHashMap2 = linkedHashMap4;
                    }
                    linkedHashMap = linkedHashMap2;
                    while (r3.hasNext()) {
                        t23Var = a23Var4.o.o;
                        if (t23Var != null) {
                            l(a23Var4, f(t23Var.u));
                        }
                        iiVar2.addLast(a23Var4);
                    }
                    while (r3.hasNext()) {
                        u43Var.b(a23Var5.o.n).f(a23Var5);
                    }
                    z = true;
                }
            } else {
                linkedHashMap = linkedHashMap2;
                z = false;
            }
            if (!z) {
                a23 a23VarV = tv1.v(this.a, r23Var, bundleA, j(), this.o);
                t43 t43VarB = u43Var.b(r23Var.n);
                List listO = gb.O(a23VarV);
                this.w = new i23(fx3Var, this, r23Var, bundleA);
                t43VarB.d(listO, y23Var);
                this.w = null;
            }
        } else if (this.l.containsKey(Integer.valueOf(r23Var.u))) {
            fx3Var.n = u(r23Var.u, bundleA, y23Var);
            linkedHashMap = linkedHashMap2;
            z = false;
        } else {
            u43Var = this.u;
            if (y23Var == null) {
                linkedHashMap = linkedHashMap2;
                z = false;
            } else {
                linkedHashMap = linkedHashMap2;
                z = false;
            }
            if (!z) {
                a23 a23VarV2 = tv1.v(this.a, r23Var, bundleA, j(), this.o);
                t43 t43VarB2 = u43Var.b(r23Var.n);
                List listO2 = gb.O(a23VarV2);
                this.w = new i23(fx3Var, this, r23Var, bundleA);
                t43VarB2.d(listO2, y23Var);
                this.w = null;
            }
        }
        y();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((d23) it3.next()).d = false;
        }
        if (zQ || fx3Var.n || z) {
            c();
        } else {
            x();
        }
    }

    public final void o() {
        Intent intent;
        int iH = h();
        ii iiVar = this.g;
        if (iH != 1) {
            if (iiVar.isEmpty()) {
                return;
            }
            r23 r23VarG = g();
            r23VarG.getClass();
            p(r23VarG.u, true);
            return;
        }
        Activity activity = this.b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            r23 r23VarG2 = g();
            r23VarG2.getClass();
            int i = r23VarG2.u;
            for (t23 t23Var = r23VarG2.o; t23Var != null; t23Var = t23Var.o) {
                if (t23Var.y != i) {
                    Bundle bundle = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        t23 t23VarK = k(iiVar);
                        Intent intent2 = activity.getIntent();
                        intent2.getClass();
                        p23 p23VarI = t23VarK.i(new ik(intent2), true, t23VarK);
                        if ((p23VarI != null ? p23VarI.o : null) != null) {
                            bundle.putAll(p23VarI.n.a(p23VarI.o));
                        }
                    }
                    na4 na4Var = new na4(this);
                    int i2 = t23Var.u;
                    ArrayList arrayList = (ArrayList) na4Var.q;
                    arrayList.clear();
                    arrayList.add(new o23(i2, null));
                    if (((t23) na4Var.p) != null) {
                        na4Var.S();
                    }
                    ((Intent) na4Var.o).putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                    na4Var.k().b();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                i = t23Var.u;
            }
            return;
        }
        if (this.f) {
            activity.getClass();
            Intent intent3 = activity.getIntent();
            Bundle extras2 = intent3.getExtras();
            extras2.getClass();
            int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            intArray.getClass();
            ArrayList arrayList2 = new ArrayList(intArray.length);
            int i3 = 0;
            for (int i4 : intArray) {
                arrayList2.add(Integer.valueOf(i4));
            }
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            int iIntValue = ((Number) v40.q0(arrayList2)).intValue();
            if (parcelableArrayList != null) {
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            r23 r23VarE = e(iIntValue, i(), null, false);
            if (r23VarE instanceof t23) {
                int i5 = t23.A;
                iIntValue = jz4.s((t23) r23VarE).u;
            }
            r23 r23VarG3 = g();
            if (r23VarG3 == null || iIntValue != r23VarG3.u) {
                return;
            }
            na4 na4Var2 = new na4(this);
            Bundle bundleG = fh0.g(new kd3("android-support-nav:controller:deepLinkIntent", intent3));
            Bundle bundle2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
            if (bundle2 != null) {
                bundleG.putAll(bundle2);
            }
            ((Intent) na4Var2.o).putExtra("android-support-nav:controller:deepLinkExtras", bundleG);
            int size = arrayList2.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                int i7 = i3 + 1;
                if (i3 < 0) {
                    gb.c0();
                    throw null;
                }
                ((ArrayList) na4Var2.q).add(new o23(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i3) : null));
                if (((t23) na4Var2.p) != null) {
                    na4Var2.S();
                }
                i3 = i7;
            }
            na4Var2.k().b();
            activity.finish();
        }
    }

    public final boolean p(int i, boolean z) {
        return q(i, z, false) && c();
    }

    public final boolean q(int i, boolean z, boolean z2) {
        r23 r23Var;
        boolean z3;
        ii iiVar = this.g;
        int i2 = 0;
        if (iiVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = q40.H0(iiVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                r23Var = null;
                break;
            }
            r23 r23Var2 = ((a23) it.next()).o;
            t43 t43VarB = this.u.b(r23Var2.n);
            if (z || r23Var2.u != i) {
                arrayList.add(t43VarB);
            }
            if (r23Var2.u == i) {
                r23Var = r23Var2;
                break;
            }
        }
        if (r23Var == null) {
            int i3 = r23.w;
            Log.i("NavController", "Ignoring popBackStack to destination " + ya4.v(this.a, i) + " as it was not found on the current back stack");
            return false;
        }
        fx3 fx3Var = new fx3();
        ii iiVar2 = new ii();
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z3 = z2;
                break;
            }
            int i5 = i4 + 1;
            t43 t43Var = (t43) arrayList.get(i4);
            fx3 fx3Var2 = new fx3();
            a23 a23Var = (a23) iiVar.last();
            z3 = z2;
            this.x = new f23(fx3Var2, fx3Var, this, z3, iiVar2);
            t43Var.i(a23Var, z3);
            this.x = null;
            if (!fx3Var2.n) {
                break;
            }
            i4 = i5;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.l;
            if (!z) {
                g71 g71Var = new g71(new tq4(fa4.c0(k5.t, r23Var), new g23(this, i2), 0));
                while (g71Var.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((r23) g71Var.next()).u);
                    c23 c23Var = (c23) (iiVar2.isEmpty() ? null : iiVar2.o[iiVar2.n]);
                    linkedHashMap.put(numValueOf, c23Var != null ? c23Var.n : null);
                }
            }
            if (!iiVar2.isEmpty()) {
                c23 c23Var2 = (c23) iiVar2.first();
                int i6 = c23Var2.o;
                String str = c23Var2.n;
                g71 g71Var2 = new g71(new tq4(fa4.c0(k5.u, d(i6, null)), new g23(this, 1), 0));
                while (g71Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((r23) g71Var2.next()).u), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.m.put(str, iiVar2);
                }
            }
        }
        y();
        return fx3Var.n;
    }

    public final void r(a23 a23Var, boolean z, ii iiVar) {
        j23 j23Var;
        vu3 vu3Var;
        Set set;
        ii iiVar2 = this.g;
        a23 a23Var2 = (a23) iiVar2.last();
        if (!h12.c(a23Var2, a23Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(a23Var.o);
            r23 r23Var = a23Var2.o;
            sb.append(", which is not the top of the back stack (");
            sb.append(r23Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        v40.q0(iiVar2);
        d23 d23Var = (d23) this.v.get(this.u.b(a23Var2.o.n));
        boolean z2 = true;
        if ((d23Var == null || (vu3Var = d23Var.f) == null || (set = (Set) vu3Var.n.getValue()) == null || !set.contains(a23Var2)) && !this.k.containsKey(a23Var2)) {
            z2 = false;
        }
        r92 r92Var = a23Var2.u.h;
        r92 r92Var2 = r92.p;
        if (r92Var.compareTo(r92Var2) >= 0) {
            if (z) {
                a23Var2.x = r92Var2;
                a23Var2.e();
                iiVar.addFirst(new c23(a23Var2));
            }
            if (z2) {
                a23Var2.x = r92Var2;
                a23Var2.e();
            } else {
                a23Var2.x = r92.n;
                a23Var2.e();
                w(a23Var2);
            }
        }
        if (z || z2 || (j23Var = this.o) == null) {
            return;
        }
        String str = a23Var2.s;
        str.getClass();
        e75 e75Var = (e75) j23Var.b.remove(str);
        if (e75Var != null) {
            e75Var.a();
        }
    }

    public final ArrayList t() {
        r92 r92Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.v.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            r92Var = r92.q;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((d23) it.next()).f.n.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                a23 a23Var = (a23) obj;
                if (!arrayList.contains(a23Var) && a23Var.x.compareTo(r92Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            v40.n0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.g) {
            a23 a23Var2 = (a23) obj2;
            if (!arrayList.contains(a23Var2) && a23Var2.x.compareTo(r92Var) >= 0) {
                arrayList3.add(obj2);
            }
        }
        v40.n0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (!(((a23) obj3).o instanceof t23)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean u(int i, Bundle bundle, y23 y23Var) {
        r23 r23VarI;
        a23 a23Var;
        r23 r23Var;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.l;
        int i2 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        td1 td1Var = new td1(1, str);
        collectionValues.getClass();
        v40.o0(collectionValues, td1Var, true);
        ii<c23> iiVar = (ii) jz4.f(this.m).remove(str);
        ArrayList arrayList = new ArrayList();
        a23 a23Var2 = (a23) this.g.g();
        if (a23Var2 == null || (r23VarI = a23Var2.o) == null) {
            r23VarI = i();
        }
        if (iiVar != null) {
            for (c23 c23Var : iiVar) {
                r23 r23VarE = e(c23Var.o, r23VarI, null, true);
                Context context = this.a;
                if (r23VarE == null) {
                    int i3 = r23.w;
                    nz2.o("Restore State failed: destination ", ya4.v(context, c23Var.o), " cannot be found from the current destination ", r23VarI);
                    return false;
                }
                arrayList.add(c23Var.a(context, r23VarE, j(), this.o));
                r23VarI = r23VarE;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((a23) obj).o instanceof t23)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            a23 a23Var3 = (a23) obj2;
            List list = (List) q40.D0(arrayList2);
            if (h12.c((list == null || (a23Var = (a23) q40.C0(list)) == null || (r23Var = a23Var.o) == null) ? null : r23Var.n, a23Var3.o.n)) {
                list.add(a23Var3);
            } else {
                arrayList2.add(gb.Q(a23Var3));
            }
        }
        fx3 fx3Var = new fx3();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            t43 t43VarB = this.u.b(((a23) q40.w0(list2)).o.n);
            this.w = new h23(fx3Var, arrayList, new hx3(), this, bundle);
            t43VarB.d(list2, y23Var);
            this.w = null;
        }
        return fx3Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, r23, t23] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, v23] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, r23, t23] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v29, types: [r23, t23] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r4v11, types: [r23, t23] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, r23, t23] */
    public final void v(t23 t23Var, Bundle bundle) {
        ii iiVar;
        LinkedHashMap linkedHashMap;
        ii iiVar2;
        LinkedHashMap linkedHashMap2;
        Activity activity;
        Intent intent;
        int[] intArray;
        t23 t23VarK;
        p23 p23VarI;
        boolean z;
        String strV;
        ?? r3;
        r23 r23VarH;
        Context context;
        ?? r11;
        Bundle bundle2;
        ?? r4;
        r23 r23VarH2;
        ?? r5;
        ?? r6;
        Object obj;
        ArrayList<String> stringArrayList;
        mj4 mj4Var = t23Var.x;
        ii<a23> iiVar3 = this.g;
        if (!iiVar3.isEmpty() && j() == r92.n) {
            kf2.o("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            return;
        }
        t23 t23Var2 = null;
        boolean z2 = false;
        int i = 0;
        if (h12.c(this.c, t23Var)) {
            int iE = mj4Var.e();
            for (int i2 = 0; i2 < iE; i2++) {
                r23 r23Var = (r23) mj4Var.f(i2);
                t23 t23Var3 = this.c;
                t23Var3.getClass();
                int iC = t23Var3.x.c(i2);
                t23 t23Var4 = this.c;
                t23Var4.getClass();
                mj4 mj4Var2 = t23Var4.x;
                if (mj4Var2.n) {
                    su3.f(mj4Var2);
                }
                int iH = su3.h(mj4Var2.q, iC, mj4Var2.o);
                if (iH >= 0) {
                    Object[] objArr = mj4Var2.p;
                    Object obj2 = objArr[iH];
                    objArr[iH] = r23Var;
                }
            }
            for (a23 a23Var : iiVar3) {
                int i3 = r23.w;
                r23 r23Var2 = a23Var.o;
                r23Var2.getClass();
                tg2 tg2Var = new tg2(fa4.f0(fa4.c0(k5.y, r23Var2)));
                r23 r23VarH3 = this.c;
                r23VarH3.getClass();
                Iterator it = tg2Var.iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((f24) it).o;
                    if (listIterator.hasPrevious()) {
                        r23 r23Var3 = (r23) listIterator.previous();
                        if ((!h12.c(r23Var3, this.c) || !r23VarH3.equals(t23Var)) && (r23VarH3 instanceof t23)) {
                            ?? r7 = (t23) r23VarH3;
                            r23VarH3 = r7.h(r23Var3.u, r7, null, false);
                            r23VarH3.getClass();
                        }
                    }
                }
                a23Var.o = r23VarH3;
            }
            return;
        }
        t23 t23Var5 = this.c;
        boolean z3 = false;
        LinkedHashMap linkedHashMap3 = this.v;
        boolean z4 = true;
        if (t23Var5 != null) {
            ArrayList arrayList = new ArrayList(this.l.keySet());
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                Integer num = (Integer) arrayList.get(i4);
                num.getClass();
                int iIntValue = num.intValue();
                Iterator it2 = linkedHashMap3.values().iterator();
                while (it2.hasNext()) {
                    ((d23) it2.next()).d = true;
                }
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                ArrayList arrayList2 = arrayList;
                int i6 = size;
                boolean z5 = z3;
                ii iiVar4 = iiVar3;
                boolean zU = u(iIntValue, null, new y23(false, true, -1, false, false, -1, -1, -1, -1));
                Iterator it3 = linkedHashMap4.values().iterator();
                while (it3.hasNext()) {
                    ((d23) it3.next()).d = false;
                }
                if (zU) {
                    q(iIntValue, true, false);
                }
                z3 = z5;
                i4 = i5;
                iiVar3 = iiVar4;
                arrayList = arrayList2;
                size = i6;
                linkedHashMap3 = linkedHashMap4;
            }
            iiVar = iiVar3;
            linkedHashMap = linkedHashMap3;
            q(t23Var5.u, true, z3);
        } else {
            iiVar = iiVar3;
            linkedHashMap = linkedHashMap3;
        }
        this.c = t23Var;
        Bundle bundle3 = this.d;
        u43 u43Var = this.u;
        if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            int size2 = stringArrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                String str = stringArrayList.get(i7);
                i7++;
                String str2 = str;
                str2.getClass();
                t43 t43VarB = u43Var.b(str2);
                Bundle bundle4 = bundle3.getBundle(str2);
                if (bundle4 != null) {
                    t43VarB.g(bundle4);
                }
            }
        }
        Parcelable[] parcelableArr = this.e;
        Context context2 = this.a;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i8 = 0;
            while (i8 < length) {
                Parcelable parcelable = parcelableArr[i8];
                parcelable.getClass();
                c23 c23Var = (c23) parcelable;
                int i9 = c23Var.o;
                r23 r23VarD = d(i9, null);
                if (r23VarD == null) {
                    int i10 = r23.w;
                    nz2.m(g(), xa3.j("Restoring the Navigation back stack failed: destination ", ya4.v(context2, i9), " cannot be found from the current destination "));
                    return;
                }
                a23 a23VarA = c23Var.a(context2, r23VarD, j(), this.o);
                t43 t43VarB2 = u43Var.b(r23VarD.n);
                LinkedHashMap linkedHashMap5 = linkedHashMap;
                Object obj3 = linkedHashMap5.get(t43VarB2);
                if (obj3 == null) {
                    obj = obj3;
                    d23 d23Var = new d23(this, t43VarB2);
                    linkedHashMap5.put(t43VarB2, d23Var);
                    obj = d23Var;
                }
                obj = obj3;
                ii iiVar5 = iiVar;
                iiVar5.addLast(a23VarA);
                ((d23) obj).a(a23VarA);
                t23 t23Var6 = a23VarA.o.o;
                if (t23Var6 != null) {
                    l(a23VarA, f(t23Var6.u));
                }
                i8++;
                linkedHashMap = linkedHashMap5;
                iiVar = iiVar5;
            }
            iiVar2 = iiVar;
            linkedHashMap2 = linkedHashMap;
            y();
            this.e = null;
        } else {
            iiVar2 = iiVar;
            linkedHashMap2 = linkedHashMap;
        }
        Collection collectionValues = lg2.a0(u43Var.a).values();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : collectionValues) {
            if (!((t43) obj4).b) {
                arrayList3.add(obj4);
            }
        }
        int size3 = arrayList3.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj5 = arrayList3.get(i11);
            i11++;
            t43 t43Var = (t43) obj5;
            Object d23Var2 = linkedHashMap2.get(t43Var);
            if (d23Var2 == null) {
                d23Var2 = new d23(this, t43Var);
                linkedHashMap2.put(t43Var, d23Var2);
            }
            t43Var.e((d23) d23Var2);
        }
        if (this.c == null || !iiVar2.isEmpty()) {
            c();
            return;
        }
        if (!this.f && (activity = this.b) != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception e) {
                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                    intArray = null;
                }
            } else {
                intArray = null;
            }
            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
            Bundle bundle5 = new Bundle();
            Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
            if (bundle6 != null) {
                bundle5.putAll(bundle6);
            }
            if ((intArray == null || intArray.length == 0) && (p23VarI = (t23VarK = k(iiVar2)).i(new ik(intent), true, t23VarK)) != null) {
                r23 r23Var4 = p23VarI.n;
                int[] iArrB = r23Var4.b(null);
                Bundle bundleA = r23Var4.a(p23VarI.o);
                if (bundleA != null) {
                    bundle5.putAll(bundleA);
                }
                intArray = iArrB;
                parcelableArrayList = null;
            }
            if (intArray != null && intArray.length != 0) {
                t23 t23Var7 = this.c;
                int length2 = intArray.length;
                ?? r23 = t23Var7;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        z = z4;
                        strV = null;
                        break;
                    }
                    z = z4;
                    int i13 = intArray[i12];
                    if (i12 == 0) {
                        t23 t23Var8 = this.c;
                        t23Var8.getClass();
                        r23VarH2 = t23Var8.u == i13 ? this.c : t23Var2;
                        r5 = r23;
                    } else {
                        r23.getClass();
                        r4 = r23;
                        r23VarH2 = r4.h(i13, r4, t23Var2, false);
                    }
                    if (r23VarH2 == null) {
                        r5 = r4;
                        int i14 = r23.w;
                        strV = ya4.v(context2, i13);
                        break;
                    }
                    r5 = r4;
                    if (i12 != intArray.length - 1 && (r23VarH2 instanceof t23)) {
                        while (true) {
                            r6 = (t23) r23VarH2;
                            r6.getClass();
                            if (!(r6.h(r6.y, r6, null, false) instanceof t23)) {
                                break;
                            } else {
                                r23VarH2 = r6.h(r6.y, r6, null, false);
                            }
                        }
                        r5 = r6;
                    }
                    i12++;
                    r23 = r5;
                    z4 = z;
                    t23Var2 = null;
                }
                if (strV == null) {
                    bundle5.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                    int length3 = intArray.length;
                    Bundle[] bundleArr = new Bundle[length3];
                    for (int i15 = 0; i15 < length3; i15++) {
                        Bundle bundle7 = new Bundle();
                        bundle7.putAll(bundle5);
                        if (parcelableArrayList != null && (bundle2 = (Bundle) parcelableArrayList.get(i15)) != null) {
                            bundle7.putAll(bundle2);
                        }
                        bundleArr[i15] = bundle7;
                    }
                    int flags = intent.getFlags();
                    int i16 = 268435456 & flags;
                    if (i16 != 0 && (flags & 32768) == 0) {
                        intent.addFlags(32768);
                        hr4 hr4Var = new hr4(context2);
                        ComponentName component = intent.getComponent();
                        if (component == null) {
                            component = intent.resolveActivity(hr4Var.o.getPackageManager());
                        }
                        if (component != null) {
                            hr4Var.a(component);
                        }
                        hr4Var.n.add(intent);
                        hr4Var.b();
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        return;
                    }
                    if (i16 != 0) {
                        if (!iiVar2.isEmpty()) {
                            t23 t23Var9 = this.c;
                            t23Var9.getClass();
                            q(t23Var9.u, true, false);
                        }
                        while (i < intArray.length) {
                            int i17 = intArray[i];
                            int i18 = i + 1;
                            Bundle bundle8 = bundleArr[i];
                            r23 r23VarD2 = d(i17, null);
                            if (r23VarD2 == null) {
                                int i19 = r23.w;
                                nz2.m(g(), xa3.j("Deep Linking failed: destination ", ya4.v(context2, i17), " cannot be found from the current destination "));
                                return;
                            }
                            br0 br0Var = new br0(1, r23VarD2, this);
                            z23 z23Var = new z23();
                            br0Var.invoke(z23Var);
                            x23 x23Var = z23Var.a;
                            x23Var.a = false;
                            x23Var.b = false;
                            int i20 = z23Var.b;
                            boolean z6 = z23Var.c;
                            x23Var.c = i20;
                            x23Var.d = false;
                            x23Var.e = z6;
                            n(r23VarD2, bundle8, x23Var.a());
                            i = i18;
                        }
                        this.f = z;
                        return;
                    }
                    t23 t23Var10 = this.c;
                    int length4 = intArray.length;
                    int i21 = 0;
                    while (i21 < length4) {
                        int i22 = intArray[i21];
                        Bundle bundle9 = bundleArr[i21];
                        if (i21 == 0) {
                            r23VarH = this.c;
                        } else {
                            r3.getClass();
                            r23VarH = r3.h(i22, r3, null, z2);
                        }
                        if (r23VarH == null) {
                            r3 = t23Var10;
                            r3 = t23Var10;
                            int i23 = r23.w;
                            throw new IllegalStateException("Deep Linking failed: destination " + ya4.v(context2, i22) + " cannot be found in graph " + r3);
                        }
                        r3 = t23Var10;
                        if (i21 == intArray.length - 1) {
                            r3 = t23Var10;
                            t23 t23Var11 = this.c;
                            t23Var11.getClass();
                            int i24 = t23Var11.u;
                            boolean z7 = z2 ? 1 : 0;
                            context = context2;
                            y23 y23Var = new y23(false, false, i24, true, false, z7 ? 1 : 0, z7 ? 1 : 0, -1, -1);
                            z2 = z7 ? 1 : 0;
                            n(r23VarH, bundle9, y23Var);
                        } else if (r23VarH instanceof t23) {
                            while (true) {
                                r3 = t23Var10;
                                r11 = (t23) r23VarH;
                                r11.getClass();
                                if (!(r11.h(r11.y, r11, null, z2) instanceof t23)) {
                                    break;
                                } else {
                                    r23VarH = r11.h(r11.y, r11, null, z2);
                                }
                            }
                            context = context2;
                            r3 = r11;
                        } else {
                            r3 = t23Var10;
                            context = context2;
                        }
                        i21++;
                        intArray = intArray;
                        context2 = context;
                        length4 = length4;
                        bundleArr = bundleArr;
                        r3 = r3;
                    }
                    r3 = t23Var10;
                    this.f = true;
                    return;
                }
                Log.i("NavController", "Could not find destination " + strV + " in the navigation graph, ignoring the deep link from " + intent);
            }
        }
        t23 t23Var12 = this.c;
        t23Var12.getClass();
        n(t23Var12, bundle, null);
    }

    public final void w(a23 a23Var) {
        a23Var.getClass();
        a23 a23Var2 = (a23) this.j.remove(a23Var);
        if (a23Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.k;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(a23Var2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            d23 d23Var = (d23) this.v.get(this.u.b(a23Var2.o.n));
            if (d23Var != null) {
                d23Var.b(a23Var2);
            }
            linkedHashMap.remove(a23Var2);
        }
    }

    public final void x() {
        AtomicInteger atomicInteger;
        vu3 vu3Var;
        Set set;
        ArrayList arrayListR0 = q40.R0(this.g);
        if (arrayListR0.isEmpty()) {
            return;
        }
        r23 r23Var = ((a23) q40.C0(arrayListR0)).o;
        ArrayList arrayList = new ArrayList();
        if (r23Var instanceof rp0) {
            Iterator it = q40.H0(arrayListR0).iterator();
            while (it.hasNext()) {
                r23 r23Var2 = ((a23) it.next()).o;
                arrayList.add(r23Var2);
                if (!(r23Var2 instanceof rp0) && !(r23Var2 instanceof t23)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        Iterator it2 = q40.H0(arrayListR0).iterator();
        while (true) {
            int i = 0;
            if (!it2.hasNext()) {
                int size = arrayListR0.size();
                while (i < size) {
                    Object obj = arrayListR0.get(i);
                    i++;
                    a23 a23Var = (a23) obj;
                    r92 r92Var = (r92) map.get(a23Var);
                    if (r92Var != null) {
                        a23Var.getClass();
                        a23Var.x = r92Var;
                        a23Var.e();
                    } else {
                        a23Var.e();
                    }
                }
                return;
            }
            a23 a23Var2 = (a23) it2.next();
            r92 r92Var2 = a23Var2.x;
            r23 r23Var3 = a23Var2.o;
            r92 r92Var3 = r92.r;
            r92 r92Var4 = r92.q;
            if (r23Var != null && r23Var3.u == r23Var.u) {
                if (r92Var2 != r92Var3) {
                    d23 d23Var = (d23) this.v.get(this.u.b(r23Var3.n));
                    if (h12.c((d23Var == null || (vu3Var = d23Var.f) == null || (set = (Set) vu3Var.n.getValue()) == null) ? null : Boolean.valueOf(set.contains(a23Var2)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.k.get(a23Var2)) != null && atomicInteger.get() == 0)) {
                        map.put(a23Var2, r92Var4);
                    } else {
                        map.put(a23Var2, r92Var3);
                    }
                }
                r23 r23Var4 = (r23) q40.x0(arrayList);
                if (r23Var4 != null && r23Var4.u == r23Var3.u) {
                    if (arrayList.isEmpty()) {
                        kf2.m("List is empty.");
                        return;
                    }
                    arrayList.remove(0);
                }
                r23Var = r23Var.o;
            } else if (arrayList.isEmpty() || r23Var3.u != ((r23) q40.w0(arrayList)).u) {
                a23Var2.x = r92.p;
                a23Var2.e();
            } else {
                if (arrayList.isEmpty()) {
                    kf2.m("List is empty.");
                    return;
                }
                r23 r23Var5 = (r23) arrayList.remove(0);
                if (r92Var2 == r92Var3) {
                    a23Var2.x = r92Var4;
                    a23Var2.e();
                } else if (r92Var2 != r92Var4) {
                    map.put(a23Var2, r92Var4);
                }
                t23 t23Var = r23Var5.o;
                if (t23Var != null && !arrayList.contains(t23Var)) {
                    arrayList.add(t23Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public final void y() {
        boolean z;
        if (this.t) {
            z = h() > 1;
        }
        this.s.c(z);
    }
}
