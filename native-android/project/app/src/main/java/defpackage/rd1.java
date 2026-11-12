package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
@s43("fragment")
public class rd1 extends t43 {
    public final Context c;
    public final ld1 d;
    public final int e;
    public final LinkedHashSet f = new LinkedHashSet();
    public final ArrayList g = new ArrayList();
    public final pd1 h = new pd1(0, this);
    public final ir0 i = new ir0(1, this);

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class a extends x65 {
        public WeakReference b;

        @Override // defpackage.x65
        public final void b() {
            WeakReference weakReference = this.b;
            if (weakReference == null) {
                h12.Q("completeTransition");
                throw null;
            }
            gf1 gf1Var = (gf1) weakReference.get();
            if (gf1Var != null) {
                gf1Var.invoke();
            }
        }
    }

    public rd1(Context context, ld1 ld1Var, int i) {
        this.c = context;
        this.d = ld1Var;
        this.e = i;
    }

    public static void k(rd1 rd1Var, String str, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        ArrayList arrayList = rd1Var.g;
        if (z2) {
            v40.p0(arrayList, new td1(0, str));
        }
        arrayList.add(new kd3(str, Boolean.valueOf(z)));
    }

    public static boolean n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // defpackage.t43
    public final r23 a() {
        return new sd1(this);
    }

    @Override // defpackage.t43
    public final void d(List list, y23 y23Var) {
        ld1 ld1Var = this.d;
        if (ld1Var.N()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a23 a23Var = (a23) it.next();
            boolean zIsEmpty = ((List) b().e.n.getValue()).isEmpty();
            int i = 0;
            if (y23Var == null || zIsEmpty || !y23Var.b || !this.f.remove(a23Var.s)) {
                po poVarM = m(a23Var, y23Var);
                String str = a23Var.s;
                if (!zIsEmpty) {
                    a23 a23Var2 = (a23) q40.D0((List) b().e.n.getValue());
                    if (a23Var2 != null) {
                        k(this, a23Var2.s, 6);
                    }
                    k(this, str, 6);
                    poVarM.c(str);
                }
                poVarM.e(false);
                if (n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + a23Var);
                }
                b().h(a23Var);
            } else {
                ld1Var.w(new kd1(ld1Var, a23Var.s, i), false);
                b().h(a23Var);
            }
        }
    }

    @Override // defpackage.t43
    public final void e(final d23 d23Var) {
        this.a = d23Var;
        this.b = true;
        if (n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        xd1 xd1Var = new xd1() { // from class: qd1
            @Override // defpackage.xd1
            public final void a(ld1 ld1Var, kc1 kc1Var) {
                Object objPrevious;
                ld1Var.getClass();
                kc1Var.getClass();
                d23 d23Var2 = d23Var;
                List list = (List) d23Var2.e.n.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!h12.c(((a23) objPrevious).s, kc1Var.L));
                a23 a23Var = (a23) objPrevious;
                boolean zN = rd1.n();
                rd1 rd1Var = this;
                if (zN) {
                    Log.v("FragmentNavigator", "Attaching fragment " + kc1Var + " associated with entry " + a23Var + " to FragmentManager " + rd1Var.d);
                }
                if (a23Var != null) {
                    kc1Var.e0.e(kc1Var, new wd1(new ud1(rd1Var, kc1Var, a23Var), 0));
                    kc1Var.c0.a(rd1Var.h);
                    rd1Var.l(kc1Var, a23Var, d23Var2);
                }
            }
        };
        ld1 ld1Var = this.d;
        ld1Var.o.add(xd1Var);
        vd1 vd1Var = new vd1(d23Var, this);
        if (ld1Var.m == null) {
            ld1Var.m = new ArrayList();
        }
        ld1Var.m.add(vd1Var);
    }

    @Override // defpackage.t43
    public final void f(a23 a23Var) {
        String str = a23Var.s;
        ld1 ld1Var = this.d;
        if (ld1Var.N()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        po poVarM = m(a23Var, null);
        List list = (List) b().e.n.getValue();
        if (list.size() > 1) {
            a23 a23Var2 = (a23) q40.y0(list, list.size() - 2);
            if (a23Var2 != null) {
                k(this, a23Var2.s, 6);
            }
            k(this, str, 4);
            ld1Var.w(new jd1(ld1Var, str, -1), false);
            k(this, str, 2);
            poVarM.c(str);
        }
        poVarM.e(false);
        b().c(a23Var);
    }

    @Override // defpackage.t43
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f;
            linkedHashSet.clear();
            v40.n0(stringArrayList, linkedHashSet);
        }
    }

    @Override // defpackage.t43
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return fh0.g(new kd3("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // defpackage.t43
    public final void i(a23 a23Var, boolean z) {
        int i;
        a23Var.getClass();
        ld1 ld1Var = this.d;
        if (ld1Var.N()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) b().e.n.getValue();
        int iIndexOf = list.indexOf(a23Var);
        List listSubList = list.subList(iIndexOf, list.size());
        a23 a23Var2 = (a23) q40.w0(list);
        int i2 = 1;
        a23 a23Var3 = (a23) q40.y0(list, iIndexOf - 1);
        if (a23Var3 != null) {
            k(this, a23Var3.s, 6);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listSubList.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    k(this, ((a23) obj).s, 4);
                }
                if (z) {
                    for (a23 a23Var4 : q40.H0(listSubList)) {
                        if (h12.c(a23Var4, a23Var2)) {
                            Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + a23Var4);
                        } else {
                            ld1Var.w(new kd1(ld1Var, a23Var4.s, i2), false);
                            this.f.add(a23Var4.s);
                        }
                    }
                } else {
                    ld1Var.w(new jd1(ld1Var, a23Var.s, -1), false);
                }
                if (n()) {
                    Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + a23Var + " with savedState " + z);
                }
                b().f(a23Var, z);
                return;
            }
            Object next = it.next();
            a23 a23Var5 = (a23) next;
            ArrayList arrayList2 = this.g;
            arrayList2.getClass();
            String str = a23Var5.s;
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                kd3 kd3Var = (kd3) it2.next();
                kd3Var.getClass();
                String str2 = (String) kd3Var.n;
                if (i3 < 0) {
                    gb.c0();
                    throw null;
                }
                if (h12.c(str, str2)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            if (i >= 0 || !h12.c(a23Var5.s, a23Var2.s)) {
                arrayList.add(next);
            }
        }
    }

    public final void l(kc1 kc1Var, a23 a23Var, d23 d23Var) {
        kc1Var.getClass();
        e75 e75VarD = kc1Var.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i30 i30VarA = kx3.a(a.class);
        if (linkedHashMap.containsKey(i30VarA)) {
            kf2.e(xa3.h("A `initializer` with the same `clazz` has already been added: ", i30VarA.b(), "."));
            return;
        }
        linkedHashMap.put(i30VarA, new z65(i30VarA));
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        z65[] z65VarArr = (z65[]) collectionValues.toArray(new z65[0]);
        zy1 zy1Var = new zy1((z65[]) Arrays.copyOf(z65VarArr, z65VarArr.length));
        sf0 sf0Var = sf0.b;
        sf0Var.getClass();
        bq4 bq4Var = new bq4(e75VarD, zy1Var, sf0Var);
        i30 i30VarA2 = kx3.a(a.class);
        String strB = i30VarA2.b();
        if (strB == null) {
            kf2.n("Local and anonymous classes can not be ViewModels");
        } else {
            ((a) bq4Var.l(i30VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).b = new WeakReference(new gp(a23Var, d23Var, this, kc1Var));
        }
    }

    public final po m(a23 a23Var, y23 y23Var) {
        r23 r23Var = a23Var.o;
        r23Var.getClass();
        Bundle bundleC = a23Var.c();
        String str = ((sd1) r23Var).x;
        if (str == null) {
            kf2.o("Fragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        ld1 ld1Var = this.d;
        dd1 dd1VarF = ld1Var.F();
        context.getClassLoader();
        kc1 kc1VarA = dd1VarF.a(str);
        kc1VarA.getClass();
        kc1VarA.c0(bundleC);
        po poVar = new po(ld1Var);
        int i = y23Var != null ? y23Var.f : -1;
        int i2 = y23Var != null ? y23Var.g : -1;
        int i3 = y23Var != null ? y23Var.h : -1;
        int i4 = y23Var != null ? y23Var.i : -1;
        if (i != -1 || i2 != -1 || i3 != -1 || i4 != -1) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            int i5 = i4 != -1 ? i4 : 0;
            poVar.b = i;
            poVar.c = i2;
            poVar.d = i3;
            poVar.e = i5;
        }
        poVar.j(this.e, kc1VarA, a23Var.s);
        poVar.l(kc1VarA);
        poVar.p = true;
        return poVar;
    }
}
