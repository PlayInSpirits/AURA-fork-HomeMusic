package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import app.homemusic.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kc1 implements ComponentCallbacks, View.OnCreateContextMenuListener, ba2, f75, ml1, j54 {
    public static final Object k0 = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public ld1 F;
    public mc1 G;
    public kc1 I;
    public int J;
    public int K;
    public String L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean R;
    public ViewGroup S;
    public View T;
    public boolean U;
    public hc1 W;
    public boolean X;
    public LayoutInflater Y;
    public boolean Z;
    public String a0;
    public r92 b0;
    public ea2 c0;
    public le1 d0;
    public final k03 e0;
    public k54 f0;
    public gp3 g0;
    public final AtomicInteger h0;
    public final ArrayList i0;
    public final ec1 j0;
    public Bundle o;
    public SparseArray p;
    public Bundle q;
    public Bundle s;
    public kc1 t;
    public int v;
    public boolean x;
    public boolean y;
    public boolean z;
    public int n = -1;
    public String r = UUID.randomUUID().toString();
    public String u = null;
    public Boolean w = null;
    public md1 H = new md1();
    public boolean Q = true;
    public boolean V = true;

    public kc1() {
        new g5(12, this);
        this.b0 = r92.r;
        this.e0 = new k03();
        this.h0 = new AtomicInteger();
        this.i0 = new ArrayList();
        this.j0 = new ec1(this);
        w();
    }

    public final boolean A() {
        return this.E > 0;
    }

    public final boolean B() {
        View view;
        return (!y() || z() || (view = this.T) == null || view.getWindowToken() == null || this.T.getVisibility() != 0) ? false : true;
    }

    public void C() {
        this.R = true;
    }

    public void D(int i, int i2, Intent intent) {
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void E(Context context) {
        this.R = true;
        mc1 mc1Var = this.G;
        if ((mc1Var == null ? null : mc1Var.A) != null) {
            this.R = true;
        }
    }

    public void F(Bundle bundle) {
        Bundle bundle2;
        this.R = true;
        Bundle bundle3 = this.o;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.H.V(bundle2);
            md1 md1Var = this.H;
            md1Var.G = false;
            md1Var.H = false;
            md1Var.N.g = false;
            md1Var.t(1);
        }
        md1 md1Var2 = this.H;
        if (md1Var2.u >= 1) {
            return;
        }
        md1Var2.G = false;
        md1Var2.H = false;
        md1Var2.N.g = false;
        md1Var2.t(1);
    }

    public void G(Menu menu, MenuInflater menuInflater) {
    }

    public View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void I() {
        this.R = true;
    }

    public void J() {
        this.R = true;
    }

    public void K() {
        this.R = true;
    }

    public LayoutInflater L(Bundle bundle) {
        mc1 mc1Var = this.G;
        if (mc1Var == null) {
            kf2.o("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        nc1 nc1Var = mc1Var.E;
        LayoutInflater layoutInflaterCloneInContext = nc1Var.getLayoutInflater().cloneInContext(nc1Var);
        layoutInflaterCloneInContext.setFactory2(this.H.f);
        return layoutInflaterCloneInContext;
    }

    public void M(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.R = true;
        mc1 mc1Var = this.G;
        if ((mc1Var == null ? null : mc1Var.A) != null) {
            this.R = true;
        }
    }

    public boolean N(MenuItem menuItem) {
        return false;
    }

    public void O() {
        this.R = true;
    }

    public void P() {
        this.R = true;
    }

    public void Q(Bundle bundle) {
    }

    public void R() {
        this.R = true;
    }

    public void S() {
        this.R = true;
    }

    public void T(View view, Bundle bundle) {
    }

    public void U(Bundle bundle) {
        this.R = true;
    }

    public void V(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.H.P();
        this.D = true;
        this.d0 = new le1(this, d(), new qa1(1, this));
        View viewH = H(layoutInflater, viewGroup, bundle);
        this.T = viewH;
        le1 le1Var = this.d0;
        if (viewH == null) {
            if (le1Var.r == null) {
                this.d0 = null;
                return;
            } else {
                kf2.o("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        le1Var.e();
        if (ld1.I(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.T + " for Fragment " + this);
        }
        View view = this.T;
        le1 le1Var2 = this.d0;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, le1Var2);
        View view2 = this.T;
        le1 le1Var3 = this.d0;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, le1Var3);
        View view3 = this.T;
        le1 le1Var4 = this.d0;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, le1Var4);
        this.e0.k(this.d0);
    }

    public final dc1 W(p5 p5Var, su3 su3Var) {
        zg5 zg5Var = new zg5(this);
        if (this.n > 1) {
            kf2.o(b11.l("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        gc1 gc1Var = new gc1(this, zg5Var, atomicReference, su3Var, p5Var);
        if (this.n >= 0) {
            gc1Var.a();
        } else {
            this.i0.add(gc1Var);
        }
        return new dc1(atomicReference);
    }

    public final nc1 X() {
        nc1 nc1VarE = e();
        if (nc1VarE != null) {
            return nc1VarE;
        }
        kf2.o(b11.l("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle Y() {
        Bundle bundle = this.s;
        if (bundle != null) {
            return bundle;
        }
        kf2.o(b11.l("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context Z() {
        Context contextN = n();
        if (contextN != null) {
            return contextN;
        }
        kf2.o(b11.l("Fragment ", this, " not attached to a context."));
        return null;
    }

    @Override // defpackage.ml1
    public final b75 a() {
        Application application = null;
        if (this.F == null) {
            kf2.o("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.f0 == null) {
            for (Context applicationContext = Z().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && ld1.I(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + Z().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f0 = new k54(application, this, this.s);
        }
        return this.f0;
    }

    public final View a0() {
        View view = this.T;
        if (view != null) {
            return view;
        }
        kf2.o(b11.l("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    @Override // defpackage.ml1
    public final f03 b() {
        Application application;
        Context applicationContext = Z().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && ld1.I(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + Z().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        f03 f03Var = new f03(0);
        LinkedHashMap linkedHashMap = f03Var.a;
        if (application != null) {
            linkedHashMap.put(a75.d, application);
        }
        linkedHashMap.put(e54.a, this);
        linkedHashMap.put(e54.b, this);
        Bundle bundle = this.s;
        if (bundle != null) {
            linkedHashMap.put(e54.c, bundle);
        }
        return f03Var;
    }

    public final void b0(int i, int i2, int i3, int i4) {
        if (this.W == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        k().b = i;
        k().c = i2;
        k().d = i3;
        k().e = i4;
    }

    public final void c0(Bundle bundle) {
        ld1 ld1Var = this.F;
        if (ld1Var != null) {
            if (ld1Var == null ? false : ld1Var.N()) {
                kf2.o("Fragment already added and state has been saved");
                return;
            }
        }
        this.s = bundle;
    }

    @Override // defpackage.f75
    public final e75 d() {
        if (this.F == null) {
            kf2.o("Can't access ViewModels from detached fragment");
            return null;
        }
        if (p() == 1) {
            kf2.o("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.F.N.d;
        e75 e75Var = (e75) map.get(this.r);
        if (e75Var != null) {
            return e75Var;
        }
        e75 e75Var2 = new e75();
        map.put(this.r, e75Var2);
        return e75Var2;
    }

    public final void d0() {
        if (!this.P) {
            this.P = true;
            if (!y() || z()) {
                return;
            }
            this.G.E.invalidateOptionsMenu();
        }
    }

    public final void e0(boolean z) {
        if (this.Q != z) {
            this.Q = z;
            if (this.P && y() && !z()) {
                this.G.E.invalidateOptionsMenu();
            }
        }
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.j54
    public final rm3 f() {
        return (rm3) this.g0.p;
    }

    public final void f0(kc1 kc1Var) {
        if (kc1Var != null) {
            ge1 ge1Var = he1.a;
            he1.b(new SetTargetFragmentUsageViolation(this, "Attempting to set target fragment " + kc1Var + " with request code 0 for fragment " + this));
            he1.a(this).getClass();
        }
        ld1 ld1Var = this.F;
        ld1 ld1Var2 = kc1Var != null ? kc1Var.F : null;
        if (ld1Var != null && ld1Var2 != null && ld1Var != ld1Var2) {
            kf2.n(b11.l("Fragment ", kc1Var, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (kc1 kc1VarU = kc1Var; kc1VarU != null; kc1VarU = kc1VarU.u(false)) {
            if (kc1VarU == this) {
                throw new IllegalArgumentException("Setting " + kc1Var + " as the target of " + this + " would create a target cycle");
            }
        }
        if (kc1Var == null) {
            this.u = null;
            this.t = null;
        } else if (this.F == null || kc1Var.F == null) {
            this.u = null;
            this.t = kc1Var;
        } else {
            this.u = kc1Var.r;
            this.t = null;
        }
        this.v = 0;
    }

    public final void g0(Intent intent) {
        mc1 mc1Var = this.G;
        if (mc1Var != null) {
            mc1Var.B.startActivity(intent, null);
        } else {
            kf2.o(b11.l("Fragment ", this, " not attached to Activity"));
        }
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        return this.c0;
    }

    public fu i() {
        return new fc1(this);
    }

    public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.J));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.K));
        printWriter.print(" mTag=");
        printWriter.println(this.L);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.n);
        printWriter.print(" mWho=");
        printWriter.print(this.r);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.x);
        printWriter.print(" mRemoving=");
        printWriter.print(this.y);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.A);
        printWriter.print(" mInLayout=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.M);
        printWriter.print(" mDetached=");
        printWriter.print(this.N);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.Q);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.P);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.O);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.V);
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.F);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.G);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.I);
        }
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.s);
        }
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.o);
        }
        if (this.p != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.p);
        }
        if (this.q != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.q);
        }
        kc1 kc1VarU = u(false);
        if (kc1VarU != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(kc1VarU);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        hc1 hc1Var = this.W;
        printWriter.println(hc1Var == null ? false : hc1Var.a);
        hc1 hc1Var2 = this.W;
        if ((hc1Var2 == null ? 0 : hc1Var2.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            hc1 hc1Var3 = this.W;
            printWriter.println(hc1Var3 == null ? 0 : hc1Var3.b);
        }
        hc1 hc1Var4 = this.W;
        if ((hc1Var4 == null ? 0 : hc1Var4.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            hc1 hc1Var5 = this.W;
            printWriter.println(hc1Var5 == null ? 0 : hc1Var5.c);
        }
        hc1 hc1Var6 = this.W;
        if ((hc1Var6 == null ? 0 : hc1Var6.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            hc1 hc1Var7 = this.W;
            printWriter.println(hc1Var7 == null ? 0 : hc1Var7.d);
        }
        hc1 hc1Var8 = this.W;
        if ((hc1Var8 == null ? 0 : hc1Var8.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            hc1 hc1Var9 = this.W;
            printWriter.println(hc1Var9 != null ? hc1Var9.e : 0);
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.S);
        }
        if (this.T != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.T);
        }
        if (n() != null) {
            new qr2(this, d()).g(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.H + ":");
        this.H.v(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final hc1 k() {
        if (this.W == null) {
            hc1 hc1Var = new hc1();
            Object obj = k0;
            hc1Var.g = obj;
            hc1Var.h = obj;
            hc1Var.i = obj;
            hc1Var.j = 1.0f;
            hc1Var.k = null;
            this.W = hc1Var;
        }
        return this.W;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final nc1 e() {
        mc1 mc1Var = this.G;
        if (mc1Var == null) {
            return null;
        }
        return mc1Var.A;
    }

    public final ld1 m() {
        if (this.G != null) {
            return this.H;
        }
        kf2.o(b11.l("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public final Context n() {
        mc1 mc1Var = this.G;
        if (mc1Var == null) {
            return null;
        }
        return mc1Var.B;
    }

    public final LayoutInflater o() {
        LayoutInflater layoutInflater = this.Y;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterL = L(null);
        this.Y = layoutInflaterL;
        return layoutInflaterL;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.R = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        X().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.R = true;
    }

    public final int p() {
        r92 r92Var = this.b0;
        return (r92Var == r92.o || this.I == null) ? r92Var.ordinal() : Math.min(r92Var.ordinal(), this.I.p());
    }

    public final ld1 q() {
        ld1 ld1Var = this.F;
        if (ld1Var != null) {
            return ld1Var;
        }
        kf2.o(b11.l("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public final Resources r() {
        return Z().getResources();
    }

    public final String s(int i) {
        return r().getString(i);
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.G == null) {
            kf2.o(b11.l("Fragment ", this, " not attached to Activity"));
            return;
        }
        ld1 ld1VarQ = q();
        if (ld1VarQ.B != null) {
            String str = this.r;
            gd1 gd1Var = new gd1();
            gd1Var.n = str;
            gd1Var.o = i;
            ld1VarQ.E.addLast(gd1Var);
            ld1VarQ.B.a(intent);
            return;
        }
        mc1 mc1Var = ld1VarQ.v;
        if (i == -1) {
            mc1Var.B.startActivity(intent, null);
        } else {
            mc1Var.getClass();
            kf2.o("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    public final String t(int i, Object... objArr) {
        return r().getString(i, objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.r);
        if (this.J != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.J));
        }
        if (this.L != null) {
            sb.append(" tag=");
            sb.append(this.L);
        }
        sb.append(")");
        return sb.toString();
    }

    public final kc1 u(boolean z) {
        String str;
        if (z) {
            ge1 ge1Var = he1.a;
            he1.b(new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this));
            he1.a(this).getClass();
        }
        kc1 kc1Var = this.t;
        if (kc1Var != null) {
            return kc1Var;
        }
        ld1 ld1Var = this.F;
        if (ld1Var == null || (str = this.u) == null) {
            return null;
        }
        return ld1Var.c.t(str);
    }

    public final le1 v() {
        le1 le1Var = this.d0;
        if (le1Var != null) {
            return le1Var;
        }
        kf2.o(b11.l("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    public final void w() {
        this.c0 = new ea2(this, true);
        this.g0 = new gp3(new xm2(this, new wc(22, this)));
        this.f0 = null;
        ArrayList arrayList = this.i0;
        ec1 ec1Var = this.j0;
        if (arrayList.contains(ec1Var)) {
            return;
        }
        if (this.n >= 0) {
            ec1Var.a();
        } else {
            arrayList.add(ec1Var);
        }
    }

    public final void x() {
        w();
        this.a0 = this.r;
        this.r = UUID.randomUUID().toString();
        this.x = false;
        this.y = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.E = 0;
        this.F = null;
        this.H = new md1();
        this.G = null;
        this.J = 0;
        this.K = 0;
        this.L = null;
        this.M = false;
        this.N = false;
    }

    public final boolean y() {
        return this.G != null && this.x;
    }

    public final boolean z() {
        if (this.M) {
            return true;
        }
        ld1 ld1Var = this.F;
        if (ld1Var != null) {
            kc1 kc1Var = this.I;
            ld1Var.getClass();
            if (kc1Var == null ? false : kc1Var.z()) {
                return true;
            }
        }
        return false;
    }
}
