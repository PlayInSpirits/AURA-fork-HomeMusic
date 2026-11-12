package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fe1 {
    public final wo0 a;
    public final ss0 b;
    public final kc1 c;
    public boolean d = false;
    public int e = -1;

    public fe1(wo0 wo0Var, ss0 ss0Var, ClassLoader classLoader, dd1 dd1Var, Bundle bundle) {
        this.a = wo0Var;
        this.b = ss0Var;
        kc1 kc1VarA = ((be1) bundle.getParcelable("state")).a(dd1Var);
        this.c = kc1VarA;
        kc1VarA.o = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        kc1VarA.c0(bundle2);
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + kc1VarA);
        }
    }

    public final void a() {
        boolean zI = ld1.I(3);
        kc1 kc1Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + kc1Var);
        }
        Bundle bundle = kc1Var.o;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        kc1Var.H.P();
        kc1Var.n = 3;
        kc1Var.R = false;
        kc1Var.C();
        if (!kc1Var.R) {
            throw new do4(b11.l("Fragment ", kc1Var, " did not call through to super.onActivityCreated()"));
        }
        if (ld1.I(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + kc1Var);
        }
        if (kc1Var.T != null) {
            Bundle bundle2 = kc1Var.o;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = kc1Var.p;
            if (sparseArray != null) {
                kc1Var.T.restoreHierarchyState(sparseArray);
                kc1Var.p = null;
            }
            kc1Var.R = false;
            kc1Var.U(bundle3);
            if (!kc1Var.R) {
                throw new do4(b11.l("Fragment ", kc1Var, " did not call through to super.onViewStateRestored()"));
            }
            if (kc1Var.T != null) {
                kc1Var.d0.c(q92.ON_CREATE);
            }
        }
        kc1Var.o = null;
        md1 md1Var = kc1Var.H;
        md1Var.G = false;
        md1Var.H = false;
        md1Var.N.g = false;
        md1Var.t(4);
        this.a.e(false);
    }

    public final void b() {
        kc1 kc1Var;
        View view;
        View view2;
        kc1 kc1Var2 = this.c;
        View view3 = kc1Var2.S;
        while (true) {
            kc1Var = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            kc1 kc1Var3 = tag instanceof kc1 ? (kc1) tag : null;
            if (kc1Var3 != null) {
                kc1Var = kc1Var3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        kc1 kc1Var4 = kc1Var2.I;
        if (kc1Var != null && kc1Var != kc1Var4) {
            int i = kc1Var2.K;
            ge1 ge1Var = he1.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(kc1Var2);
            sb.append(" within the view of parent fragment ");
            sb.append(kc1Var);
            sb.append(" via container with ID ");
            he1.b(new WrongNestedHierarchyViolation(kc1Var2, f34.i(sb, i, " without using parent's childFragmentManager")));
            he1.a(kc1Var2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.b.n;
        ViewGroup viewGroup = kc1Var2.S;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(kc1Var2);
            for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
                kc1 kc1Var5 = (kc1) arrayList.get(i2);
                if (kc1Var5.S == viewGroup && (view2 = kc1Var5.T) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                kc1 kc1Var6 = (kc1) arrayList.get(iIndexOf);
                if (kc1Var6.S == viewGroup && (view = kc1Var6.T) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        kc1Var2.S.addView(kc1Var2.T, iIndexOfChild);
    }

    public final void c() {
        boolean zI = ld1.I(3);
        kc1 kc1Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "moveto ATTACHED: " + kc1Var);
        }
        kc1 kc1Var2 = kc1Var.t;
        fe1 fe1Var = null;
        ss0 ss0Var = this.b;
        if (kc1Var2 != null) {
            fe1 fe1Var2 = (fe1) ((HashMap) ss0Var.o).get(kc1Var2.r);
            if (fe1Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(kc1Var);
                kc1 kc1Var3 = kc1Var.t;
                sb.append(" declared target fragment ");
                sb.append(kc1Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            kc1Var.u = kc1Var.t.r;
            kc1Var.t = null;
            fe1Var = fe1Var2;
        } else {
            String str = kc1Var.u;
            if (str != null && (fe1Var = (fe1) ((HashMap) ss0Var.o).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(kc1Var);
                sb2.append(" declared target fragment ");
                kf2.o(b11.q(sb2, kc1Var.u, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (fe1Var != null) {
            fe1Var.k();
        }
        ld1 ld1Var = kc1Var.F;
        kc1Var.G = ld1Var.v;
        kc1Var.I = ld1Var.x;
        wo0 wo0Var = this.a;
        wo0Var.l(false);
        ArrayList arrayList = kc1Var.i0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ic1) obj).a();
        }
        arrayList.clear();
        kc1Var.H.b(kc1Var.G, kc1Var.i(), kc1Var);
        kc1Var.n = 0;
        kc1Var.R = false;
        kc1Var.E(kc1Var.G.B);
        if (!kc1Var.R) {
            throw new do4(b11.l("Fragment ", kc1Var, " did not call through to super.onAttach()"));
        }
        ld1 ld1Var2 = kc1Var.F;
        Iterator it = ld1Var2.o.iterator();
        while (it.hasNext()) {
            ((xd1) it.next()).a(ld1Var2, kc1Var);
        }
        md1 md1Var = kc1Var.H;
        md1Var.G = false;
        md1Var.H = false;
        md1Var.N.g = false;
        md1Var.t(0);
        wo0Var.f(false);
    }

    public final int d() {
        Object obj;
        kc1 kc1Var = this.c;
        if (kc1Var.F == null) {
            return kc1Var.n;
        }
        int iMin = this.e;
        int iOrdinal = kc1Var.b0.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (kc1Var.A) {
            boolean z = kc1Var.B;
            int i2 = this.e;
            if (z) {
                iMin = Math.max(i2, 2);
                View view = kc1Var.T;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i2 < 4 ? Math.min(iMin, kc1Var.n) : Math.min(iMin, 1);
            }
        }
        if (!kc1Var.x) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = kc1Var.S;
        if (viewGroup != null) {
            xm0 xm0VarF = xm0.f(viewGroup, kc1Var.q());
            pj4 pj4VarD = xm0VarF.d(kc1Var);
            int i3 = pj4VarD != null ? pj4VarD.b : 0;
            ArrayList arrayList = xm0VarF.c;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i4);
                i4++;
                pj4 pj4Var = (pj4) obj;
                if (h12.c(pj4Var.c, kc1Var) && !pj4Var.f) {
                    break;
                }
            }
            pj4 pj4Var2 = (pj4) obj;
            i = pj4Var2 != null ? pj4Var2.b : 0;
            int i5 = i3 == 0 ? -1 : qj4.a[xa3.w(i3)];
            if (i5 != -1 && i5 != 1) {
                i = i3;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (kc1Var.y) {
            iMin = kc1Var.A() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (kc1Var.U && kc1Var.n < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (ld1.I(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + kc1Var);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        boolean zI = ld1.I(3);
        kc1 kc1Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "moveto CREATED: " + kc1Var);
        }
        Bundle bundle2 = kc1Var.o;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (kc1Var.Z) {
            kc1Var.n = 1;
            Bundle bundle4 = kc1Var.o;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            kc1Var.H.V(bundle);
            md1 md1Var = kc1Var.H;
            md1Var.G = false;
            md1Var.H = false;
            md1Var.N.g = false;
            md1Var.t(1);
            return;
        }
        wo0 wo0Var = this.a;
        wo0Var.n(false);
        kc1Var.H.P();
        kc1Var.n = 1;
        kc1Var.R = false;
        kc1Var.c0.a(new vv3(4, kc1Var));
        kc1Var.F(bundle3);
        kc1Var.Z = true;
        if (!kc1Var.R) {
            throw new do4(b11.l("Fragment ", kc1Var, " did not call through to super.onCreate()"));
        }
        kc1Var.c0.d(q92.ON_CREATE);
        wo0Var.g(false);
    }

    public final void f() {
        String resourceName;
        kc1 kc1Var = this.c;
        if (kc1Var.A) {
            return;
        }
        int i = 3;
        if (ld1.I(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + kc1Var);
        }
        Bundle bundle = kc1Var.o;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterL = kc1Var.L(bundle2);
        kc1Var.Y = layoutInflaterL;
        ViewGroup viewGroup = kc1Var.S;
        if (viewGroup == null) {
            int i2 = kc1Var.K;
            if (i2 == 0) {
                viewGroup = null;
            } else {
                if (i2 == -1) {
                    kf2.n(b11.l("Cannot create fragment ", kc1Var, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) kc1Var.F.w.H(i2);
                if (viewGroup == null) {
                    if (!kc1Var.C) {
                        try {
                            resourceName = kc1Var.r().getResourceName(kc1Var.K);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(kc1Var.K) + " (" + resourceName + ") for fragment " + kc1Var);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    ge1 ge1Var = he1.a;
                    he1.b(new WrongFragmentContainerViolation(kc1Var, "Attempting to add fragment " + kc1Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    he1.a(kc1Var).getClass();
                }
            }
        }
        kc1Var.S = viewGroup;
        kc1Var.V(layoutInflaterL, viewGroup, bundle2);
        if (kc1Var.T != null) {
            if (ld1.I(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + kc1Var);
            }
            kc1Var.T.setSaveFromParentEnabled(false);
            kc1Var.T.setTag(R.id.fragment_container_view_tag, kc1Var);
            if (viewGroup != null) {
                b();
            }
            if (kc1Var.M) {
                kc1Var.T.setVisibility(8);
            }
            View view = kc1Var.T;
            WeakHashMap weakHashMap = j65.a;
            boolean zIsAttachedToWindow = view.isAttachedToWindow();
            View view2 = kc1Var.T;
            if (zIsAttachedToWindow) {
                view2.requestApplyInsets();
            } else {
                view2.addOnAttachStateChangeListener(new bc(i, view2));
            }
            Bundle bundle3 = kc1Var.o;
            kc1Var.T(kc1Var.T, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
            kc1Var.H.t(2);
            this.a.t(kc1Var, kc1Var.T, false);
            int visibility = kc1Var.T.getVisibility();
            kc1Var.k().j = kc1Var.T.getAlpha();
            if (kc1Var.S != null && visibility == 0) {
                View viewFindFocus = kc1Var.T.findFocus();
                if (viewFindFocus != null) {
                    kc1Var.k().k = viewFindFocus;
                    if (ld1.I(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + kc1Var);
                    }
                }
                kc1Var.T.setAlpha(0.0f);
            }
        }
        kc1Var.n = 2;
    }

    public final void g() throws Exception {
        kc1 kc1VarT;
        boolean zI = ld1.I(3);
        kc1 kc1Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "movefrom CREATED: " + kc1Var);
        }
        boolean zIsChangingConfigurations = true;
        int i = 0;
        boolean z = kc1Var.y && !kc1Var.A();
        ss0 ss0Var = this.b;
        if (z && !kc1Var.z) {
            ss0Var.G(kc1Var.r, null);
        }
        if (!z) {
            od1 od1Var = (od1) ss0Var.q;
            if (!((od1Var.b.containsKey(kc1Var.r) && od1Var.e) ? od1Var.f : true)) {
                String str = kc1Var.u;
                if (str != null && (kc1VarT = ss0Var.t(str)) != null && kc1VarT.O) {
                    kc1Var.t = kc1VarT;
                }
                kc1Var.n = 0;
                return;
            }
        }
        mc1 mc1Var = kc1Var.G;
        if (mc1Var != null) {
            zIsChangingConfigurations = ((od1) ss0Var.q).f;
        } else {
            nc1 nc1Var = mc1Var.B;
            if (nc1Var != null) {
                zIsChangingConfigurations = true ^ nc1Var.isChangingConfigurations();
            }
        }
        if ((z && !kc1Var.z) || zIsChangingConfigurations) {
            ((od1) ss0Var.q).c(kc1Var, false);
        }
        kc1Var.H.k();
        kc1Var.c0.d(q92.ON_DESTROY);
        kc1Var.n = 0;
        kc1Var.R = false;
        kc1Var.Z = false;
        kc1Var.I();
        if (!kc1Var.R) {
            throw new do4(b11.l("Fragment ", kc1Var, " did not call through to super.onDestroy()"));
        }
        this.a.i(false);
        ArrayList arrayListV = ss0Var.v();
        int size = arrayListV.size();
        while (i < size) {
            Object obj = arrayListV.get(i);
            i++;
            fe1 fe1Var = (fe1) obj;
            if (fe1Var != null) {
                kc1 kc1Var2 = fe1Var.c;
                if (kc1Var.r.equals(kc1Var2.u)) {
                    kc1Var2.t = kc1Var;
                    kc1Var2.u = null;
                }
            }
        }
        String str2 = kc1Var.u;
        if (str2 != null) {
            kc1Var.t = ss0Var.t(str2);
        }
        ss0Var.F(this);
    }

    public final void h() {
        View view;
        boolean zI = ld1.I(3);
        kc1 kc1Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + kc1Var);
        }
        ViewGroup viewGroup = kc1Var.S;
        if (viewGroup != null && (view = kc1Var.T) != null) {
            viewGroup.removeView(view);
        }
        kc1Var.H.t(1);
        if (kc1Var.T != null) {
            le1 le1Var = kc1Var.d0;
            le1Var.e();
            if (le1Var.r.h.compareTo(r92.p) >= 0) {
                kc1Var.d0.c(q92.ON_DESTROY);
            }
        }
        kc1Var.n = 1;
        kc1Var.R = false;
        kc1Var.J();
        if (!kc1Var.R) {
            throw new do4(b11.l("Fragment ", kc1Var, " did not call through to super.onDestroyView()"));
        }
        mj4 mj4Var = ((nd2) new qr2(kc1Var, kc1Var.d()).p).b;
        int iE = mj4Var.e();
        for (int i = 0; i < iE; i++) {
            ((ld2) mj4Var.f(i)).l();
        }
        kc1Var.D = false;
        this.a.u(false);
        kc1Var.S = null;
        kc1Var.T = null;
        kc1Var.d0 = null;
        kc1Var.e0.k(null);
        kc1Var.B = false;
    }

    public final void i() throws Exception {
        boolean zI = ld1.I(3);
        kc1 kc1Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + kc1Var);
        }
        kc1Var.n = -1;
        kc1Var.R = false;
        kc1Var.K();
        kc1Var.Y = null;
        if (!kc1Var.R) {
            throw new do4(b11.l("Fragment ", kc1Var, " did not call through to super.onDetach()"));
        }
        md1 md1Var = kc1Var.H;
        if (!md1Var.I) {
            md1Var.k();
            kc1Var.H = new md1();
        }
        this.a.j(false);
        kc1Var.n = -1;
        kc1Var.G = null;
        kc1Var.I = null;
        kc1Var.F = null;
        if (!kc1Var.y || kc1Var.A()) {
            od1 od1Var = (od1) this.b.q;
            if (!((od1Var.b.containsKey(kc1Var.r) && od1Var.e) ? od1Var.f : true)) {
                return;
            }
        }
        if (ld1.I(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + kc1Var);
        }
        kc1Var.x();
    }

    public final void j() {
        kc1 kc1Var = this.c;
        if (kc1Var.A && kc1Var.B && !kc1Var.D) {
            if (ld1.I(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + kc1Var);
            }
            Bundle bundle = kc1Var.o;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterL = kc1Var.L(bundle2);
            kc1Var.Y = layoutInflaterL;
            kc1Var.V(layoutInflaterL, null, bundle2);
            View view = kc1Var.T;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                kc1Var.T.setTag(R.id.fragment_container_view_tag, kc1Var);
                if (kc1Var.M) {
                    kc1Var.T.setVisibility(8);
                }
                Bundle bundle3 = kc1Var.o;
                kc1Var.T(kc1Var.T, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                kc1Var.H.t(2);
                this.a.t(kc1Var, kc1Var.T, false);
                kc1Var.n = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        kc1 kc1Var = this.c;
        if (z) {
            if (ld1.I(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + kc1Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = kc1Var.n;
                int i2 = 3;
                ss0 ss0Var = this.b;
                if (iD == i) {
                    if (!z2 && i == -1 && kc1Var.y && !kc1Var.A() && !kc1Var.z) {
                        if (ld1.I(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + kc1Var);
                        }
                        ((od1) ss0Var.q).c(kc1Var, true);
                        ss0Var.F(this);
                        if (ld1.I(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + kc1Var);
                        }
                        kc1Var.x();
                    }
                    if (kc1Var.X) {
                        if (kc1Var.T != null && (viewGroup = kc1Var.S) != null) {
                            xm0 xm0VarF = xm0.f(viewGroup, kc1Var.q());
                            if (kc1Var.M) {
                                if (ld1.I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + kc1Var);
                                }
                                xm0VarF.a(3, 1, this);
                            } else {
                                if (ld1.I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + kc1Var);
                                }
                                xm0VarF.a(2, 1, this);
                            }
                        }
                        ld1 ld1Var = kc1Var.F;
                        if (ld1Var != null && kc1Var.x && ld1.J(kc1Var)) {
                            ld1Var.F = true;
                        }
                        kc1Var.X = false;
                        kc1Var.H.n();
                    }
                    this.d = false;
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (kc1Var.z) {
                                if (((Bundle) ((HashMap) ss0Var.p).get(kc1Var.r)) == null) {
                                    ss0Var.G(kc1Var.r, o());
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            kc1Var.n = 1;
                            break;
                        case 2:
                            kc1Var.B = false;
                            kc1Var.n = 2;
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            if (ld1.I(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + kc1Var);
                            }
                            if (kc1Var.z) {
                                ss0Var.G(kc1Var.r, o());
                            } else if (kc1Var.T != null && kc1Var.p == null) {
                                p();
                            }
                            if (kc1Var.T != null && (viewGroup2 = kc1Var.S) != null) {
                                xm0 xm0VarF2 = xm0.f(viewGroup2, kc1Var.q());
                                if (ld1.I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + kc1Var);
                                }
                                xm0VarF2.a(1, 3, this);
                            }
                            kc1Var.n = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            kc1Var.n = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            a();
                            break;
                        case 4:
                            if (kc1Var.T != null && (viewGroup3 = kc1Var.S) != null) {
                                xm0 xm0VarF3 = xm0.f(viewGroup3, kc1Var.q());
                                int visibility = kc1Var.T.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                if (ld1.I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + kc1Var);
                                }
                                xm0VarF3.a(i2, 2, this);
                            }
                            kc1Var.n = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            kc1Var.n = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zI = ld1.I(3);
        kc1 kc1Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "movefrom RESUMED: " + kc1Var);
        }
        kc1Var.H.t(5);
        if (kc1Var.T != null) {
            kc1Var.d0.c(q92.ON_PAUSE);
        }
        kc1Var.c0.d(q92.ON_PAUSE);
        kc1Var.n = 6;
        kc1Var.R = false;
        kc1Var.O();
        if (!kc1Var.R) {
            throw new do4(b11.l("Fragment ", kc1Var, " did not call through to super.onPause()"));
        }
        this.a.k(false);
    }

    public final void m(ClassLoader classLoader) {
        kc1 kc1Var = this.c;
        Bundle bundle = kc1Var.o;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (kc1Var.o.getBundle("savedInstanceState") == null) {
            kc1Var.o.putBundle("savedInstanceState", new Bundle());
        }
        kc1Var.p = kc1Var.o.getSparseParcelableArray("viewState");
        kc1Var.q = kc1Var.o.getBundle("viewRegistryState");
        be1 be1Var = (be1) kc1Var.o.getParcelable("state");
        if (be1Var != null) {
            kc1Var.u = be1Var.y;
            kc1Var.v = be1Var.z;
            kc1Var.V = be1Var.A;
        }
        if (kc1Var.V) {
            return;
        }
        kc1Var.U = true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public final void n() {
        boolean zRequestFocus;
        String str;
        boolean zI = ld1.I(3);
        kc1 kc1Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "moveto RESUMED: " + kc1Var);
        }
        hc1 hc1Var = kc1Var.W;
        View view = hc1Var == null ? null : hc1Var.k;
        if (view != null) {
            if (view == kc1Var.T) {
                zRequestFocus = view.requestFocus();
                if (ld1.I(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(kc1Var);
                    sb.append(" resulting in focused view ");
                    sb.append(kc1Var.T.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == kc1Var.T) {
                            zRequestFocus = view.requestFocus();
                            if (ld1.I(2)) {
                                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                                sb2.append(view);
                                sb2.append(" ");
                                if (zRequestFocus) {
                                    str = "succeeded";
                                } else {
                                    str = "failed";
                                }
                                sb2.append(str);
                                sb2.append(" on Fragment ");
                                sb2.append(kc1Var);
                                sb2.append(" resulting in focused view ");
                                sb2.append(kc1Var.T.findFocus());
                                Log.v("FragmentManager", sb2.toString());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        kc1Var.k().k = null;
        kc1Var.H.P();
        kc1Var.H.y(true);
        kc1Var.n = 7;
        kc1Var.R = false;
        kc1Var.P();
        if (!kc1Var.R) {
            throw new do4(b11.l("Fragment ", kc1Var, " did not call through to super.onResume()"));
        }
        ea2 ea2Var = kc1Var.c0;
        q92 q92Var = q92.ON_RESUME;
        ea2Var.d(q92Var);
        if (kc1Var.T != null) {
            kc1Var.d0.r.d(q92Var);
        }
        md1 md1Var = kc1Var.H;
        md1Var.G = false;
        md1Var.H = false;
        md1Var.N.g = false;
        md1Var.t(7);
        this.a.p(false);
        this.b.G(kc1Var.r, null);
        kc1Var.o = null;
        kc1Var.p = null;
        kc1Var.q = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        kc1 kc1Var = this.c;
        if (kc1Var.n == -1 && (bundle = kc1Var.o) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new be1(kc1Var));
        if (kc1Var.n > -1) {
            Bundle bundle3 = new Bundle();
            kc1Var.Q(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.q(false);
            Bundle bundle4 = new Bundle();
            kc1Var.g0.t(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleW = kc1Var.H.W();
            if (!bundleW.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleW);
            }
            if (kc1Var.T != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = kc1Var.p;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = kc1Var.q;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = kc1Var.s;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        kc1 kc1Var = this.c;
        if (kc1Var.T == null) {
            return;
        }
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + kc1Var + " with view " + kc1Var.T);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        kc1Var.T.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            kc1Var.p = sparseArray;
        }
        Bundle bundle = new Bundle();
        kc1Var.d0.s.t(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        kc1Var.q = bundle;
    }

    public final void q() {
        boolean zI = ld1.I(3);
        kc1 kc1Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "moveto STARTED: " + kc1Var);
        }
        kc1Var.H.P();
        kc1Var.H.y(true);
        kc1Var.n = 5;
        kc1Var.R = false;
        kc1Var.R();
        if (!kc1Var.R) {
            throw new do4(b11.l("Fragment ", kc1Var, " did not call through to super.onStart()"));
        }
        ea2 ea2Var = kc1Var.c0;
        q92 q92Var = q92.ON_START;
        ea2Var.d(q92Var);
        if (kc1Var.T != null) {
            kc1Var.d0.r.d(q92Var);
        }
        md1 md1Var = kc1Var.H;
        md1Var.G = false;
        md1Var.H = false;
        md1Var.N.g = false;
        md1Var.t(5);
        this.a.r(false);
    }

    public final void r() {
        boolean zI = ld1.I(3);
        kc1 kc1Var = this.c;
        if (zI) {
            Log.d("FragmentManager", "movefrom STARTED: " + kc1Var);
        }
        md1 md1Var = kc1Var.H;
        md1Var.H = true;
        md1Var.N.g = true;
        md1Var.t(4);
        if (kc1Var.T != null) {
            kc1Var.d0.c(q92.ON_STOP);
        }
        kc1Var.c0.d(q92.ON_STOP);
        kc1Var.n = 4;
        kc1Var.R = false;
        kc1Var.S();
        if (!kc1Var.R) {
            throw new do4(b11.l("Fragment ", kc1Var, " did not call through to super.onStop()"));
        }
        this.a.s(false);
    }

    public fe1(wo0 wo0Var, ss0 ss0Var, kc1 kc1Var) {
        this.a = wo0Var;
        this.b = ss0Var;
        this.c = kc1Var;
    }

    public fe1(wo0 wo0Var, ss0 ss0Var, kc1 kc1Var, Bundle bundle) {
        this.a = wo0Var;
        this.b = ss0Var;
        this.c = kc1Var;
        kc1Var.p = null;
        kc1Var.q = null;
        kc1Var.E = 0;
        kc1Var.B = false;
        kc1Var.x = false;
        kc1 kc1Var2 = kc1Var.t;
        kc1Var.u = kc1Var2 != null ? kc1Var2.r : null;
        kc1Var.t = null;
        kc1Var.o = bundle;
        kc1Var.s = bundle.getBundle("arguments");
    }
}
