package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vv3 implements w92 {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ vv3(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.w92
    public final void b(ba2 ba2Var, q92 q92Var) {
        int iNextIndex;
        View view;
        int i = this.n;
        Object obj = null;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                j54 j54Var = (j54) obj2;
                if (q92Var != q92.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                ba2Var.h().f(this);
                Bundle bundleA = j54Var.f().A("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    kf2.o("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, vv3.class.getClassLoader()).asSubclass(h54.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(j54Var instanceof f75)) {
                                    nz2.u(j54Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                e75 e75VarD = ((f75) j54Var).d();
                                rm3 rm3VarF = j54Var.f();
                                LinkedHashMap linkedHashMap = e75VarD.a;
                                LinkedHashMap linkedHashMap2 = e75VarD.a;
                                Iterator it = q40.T0(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    x65 x65Var = (x65) linkedHashMap2.get(it.next());
                                    if (x65Var != null) {
                                        te5.c(x65Var, rm3VarF, j54Var.h());
                                    }
                                }
                                if (!q40.T0(linkedHashMap2.keySet()).isEmpty()) {
                                    rm3VarF.P();
                                }
                            } catch (Exception e) {
                                nz2.s(xa3.g("Failed to instantiate ", str2), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        nz2.s(xa3.h("Class ", str2, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                nc1 nc1Var = (nc1) obj2;
                if (nc1Var.r == null) {
                    h70 h70Var = (h70) nc1Var.getLastNonConfigurationInstance();
                    if (h70Var != null) {
                        nc1Var.r = h70Var.a;
                    }
                    if (nc1Var.r == null) {
                        nc1Var.r = new e75();
                    }
                }
                nc1Var.n.f(this);
                return;
            case 2:
                new HashMap();
                ah1[] ah1VarArr = (ah1[]) obj2;
                if (ah1VarArr.length > 0) {
                    ah1 ah1Var = ah1VarArr[0];
                    throw null;
                }
                if (ah1VarArr.length <= 0) {
                    return;
                }
                ah1 ah1Var2 = ah1VarArr[0];
                throw null;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                tp0 tp0Var = (tp0) obj2;
                int i3 = sp0.a[q92Var.ordinal()];
                if (i3 == 1) {
                    pp0 pp0Var = (pp0) ba2Var;
                    Iterable iterable = (Iterable) tp0Var.b().e.n.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            if (h12.c(((a23) it2.next()).s, pp0Var.L)) {
                                return;
                            }
                        }
                    }
                    pp0Var.h0();
                    return;
                }
                if (i3 == 2) {
                    pp0 pp0Var2 = (pp0) ba2Var;
                    for (Object obj3 : (Iterable) tp0Var.b().f.n.getValue()) {
                        if (h12.c(((a23) obj3).s, pp0Var2.L)) {
                            obj = obj3;
                        }
                    }
                    a23 a23Var = (a23) obj;
                    if (a23Var != null) {
                        tp0Var.b().b(a23Var);
                        return;
                    }
                    return;
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        return;
                    }
                    pp0 pp0Var3 = (pp0) ba2Var;
                    for (Object obj4 : (Iterable) tp0Var.b().f.n.getValue()) {
                        if (h12.c(((a23) obj4).s, pp0Var3.L)) {
                            obj = obj4;
                        }
                    }
                    a23 a23Var2 = (a23) obj;
                    if (a23Var2 != null) {
                        tp0Var.b().b(a23Var2);
                    }
                    pp0Var3.c0.f(this);
                    return;
                }
                pp0 pp0Var4 = (pp0) ba2Var;
                if (pp0Var4.k0().isShowing()) {
                    return;
                }
                List list = (List) tp0Var.b().e.n.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (h12.c(((a23) listIterator.previous()).s, pp0Var4.L)) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                a23 a23Var3 = (a23) q40.y0(list, iNextIndex);
                if (!h12.c(q40.D0(list), a23Var3)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + pp0Var4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                if (a23Var3 != null) {
                    tp0Var.l(iNextIndex, a23Var3, false);
                    return;
                }
                return;
            case 4:
                if (q92Var != q92.ON_STOP || (view = ((kc1) obj2).T) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 5:
                ((de1) obj2).b(false);
                return;
            default:
                if (q92Var != q92.ON_CREATE) {
                    nz2.u(q92Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    ba2Var.h().f(this);
                    ((f54) obj2).b();
                    return;
                }
        }
    }
}
