package defpackage;

import android.app.Activity;
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
    public static final Object k0 = null;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public ld1 F;
    public mc1 G;
    public md1 H;
    public kc1 I;
    public int J;
    public int K;
    public String L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public ViewGroup S;
    public View T;
    public boolean U;
    public boolean V;
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
    public int n;
    public Bundle o;
    public SparseArray p;
    public Bundle q;
    public String r;
    public Bundle s;
    public kc1 t;
    public String u;
    public int v;
    public Boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        k0 = new Object();
    }

    public kc1() {
        this.n = -1;
        this.r = UUID.randomUUID().toString();
        this.u = null;
        this.w = null;
        this.H = new md1();
        this.Q = true;
        this.V = true;
        new g5(12, this);
        this.b0 = r92.r;
        this.e0 = new k03();
        this.h0 = new AtomicInteger();
        this.i0 = new ArrayList();
        this.j0 = new ec1(this);
        w();
    }

    public final boolean A() {
        if (this.E <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean B() {
        if (y() == true) goto L5;
        return false;
    L5:
        if (z() == true) goto L16;
        View r0 = this.T;
        if (r0 != null) goto L9;
        return false;
    L9:
        if (r0.getWindowToken() != null) goto L11;
        return false;
    L11:
        if (this.T.getVisibility() != 0) goto L19;
        return true;
    L19:
        return false;
    L16:
        return false;
    }

    public void C() {
        this.R = true;
    }

    public void D(int r3, int r4, Intent r5) {
        if (ld1.I(2) == false) goto L6;
        Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + r3 + " resultCode: " + r4 + " data: " + r5);
        return;
    }

    public void E(Context r2) {
        this.R = true;
        mc1 r0 = this.G;
        if (r0 != null) goto L5;
        nc1 r1 = null;
    L6:
        if (r1 == null) goto L9;
        this.R = true;
        return;
    L9:
        return;
    L5:
        r1 = r0.A;
        goto L6
    }

    public void F(Bundle r4) {
        this.R = true;
        Bundle r0 = this.o;
        if (r0 == null) goto L7;
        Bundle r1 = r0.getBundle("childFragmentManager");
        if (r1 == null) goto L7;
        this.H.V(r1);
        md1 r2 = this.H;
        r2.G = false;
        r2.H = false;
        r2.N.g = false;
        r2.t(1);
    L7:
        md1 r3 = this.H;
        if (r3.u < 1) goto L10;
        return;
    L10:
        r3.G = false;
        r3.H = false;
        r3.N.g = false;
        r3.t(1);
    }

    public void G(Menu r1, MenuInflater r2) {
    }

    public View H(LayoutInflater r1, ViewGroup r2, Bundle r3) {
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

    public LayoutInflater L(Bundle r2) {
        mc1 r3 = this.G;
        if (r3 == null) goto L6;
        nc1 r4 = r3.E;
        LayoutInflater r5 = r4.getLayoutInflater().cloneInContext(r4);
        r5.setFactory2(this.H.f);
        return r5;
    L6:
        kf2.o("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        return null;
    }

    public void M(Context r1, AttributeSet r2, Bundle r3) {
        this.R = true;
        mc1 r4 = this.G;
        if (r4 != null) goto L5;
        nc1 r5 = null;
    L6:
        if (r5 == null) goto L9;
        this.R = true;
        return;
    L9:
        return;
    L5:
        r5 = r4.A;
        goto L6
    }

    public boolean N(MenuItem r1) {
        return false;
    }

    public void O() {
        this.R = true;
    }

    public void P() {
        this.R = true;
    }

    public void Q(Bundle r1) {
    }

    public void R() {
        this.R = true;
    }

    public void S() {
        this.R = true;
    }

    public void T(View r1, Bundle r2) {
    }

    public void U(Bundle r1) {
        this.R = true;
    }

    public void V(LayoutInflater r5, ViewGroup r6, Bundle r7) {
        this.H.P();
        this.D = true;
        this.d0 = new le1(this, d(), new qa1(1, this));
        View r8 = H(r5, r6, r7);
        this.T = r8;
        le1 r9 = this.d0;
        if (r8 == null) goto L10;
        r9.e();
        if (ld1.I(3) == false) goto L7;
        Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.T + " for Fragment " + this);
    L7:
        View r10 = this.T;
        le1 r11 = this.d0;
        r10.getClass();
        r10.setTag(R.id.view_tree_lifecycle_owner, r11);
        View r12 = this.T;
        le1 r13 = this.d0;
        r12.getClass();
        r12.setTag(R.id.view_tree_view_model_store_owner, r13);
        View r14 = this.T;
        le1 r15 = this.d0;
        r14.getClass();
        r14.setTag(R.id.view_tree_saved_state_registry_owner, r15);
        this.e0.k(this.d0);
        return;
    L10:
        if (r9.r != null) goto L13;
        this.d0 = null;
        return;
    L13:
        kf2.o("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final dc1 W(p5 r7, su3 r8) {
        zg5 r2 = new zg5(this);
        if (this.n > 1) goto L10;
        AtomicReference r3 = new AtomicReference();
        gc1 r0 = new gc1(this, r2, r3, r8, r7);
        if (this.n < 0) goto L7;
        r0.a();
    L9:
        return new dc1(r3);
    L7:
        this.i0.add(r0);
        goto L9
    L10:
        kf2.o(b11.l("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        return null;
    }

    public final nc1 X() {
        nc1 r0 = l();
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o(b11.l("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle Y() {
        Bundle r0 = this.s;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o(b11.l("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context Z() {
        Context r0 = n();
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o(b11.l("Fragment ", this, " not attached to a context."));
        return null;
    }

    @Override // defpackage.ml1
    public final b75 a() {
        Application r1 = null;
        if (this.F != null) goto L5;
        kf2.o("Can't access ViewModels from detached fragment");
        return null;
    L5:
        if (this.f0 != null) goto L19;
        Context r0 = Z().getApplicationContext();
    L8:
        if ((r0 instanceof ContextWrapper) == false) goto L13;
        if ((r0 instanceof Application) == true) goto L11;
        r0 = ((ContextWrapper) r0).getBaseContext();
        goto L8
    L11:
        r1 = (Application) r0;
    L13:
        if (r1 == null) goto L15;
    L17:
        this.f0 = new k54(r1, this, this.s);
        goto L19
    L15:
        if (ld1.I(3) == false) goto L17;
        Log.d("FragmentManager", "Could not find Application instance from Context " + Z().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
    L19:
        return this.f0;
    }

    public final View a0() {
        View r0 = this.T;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o(b11.l("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    @Override // defpackage.ml1
    public final f03 b() {
        Context r0 = Z().getApplicationContext();
    L4:
        if ((r0 instanceof ContextWrapper) == false) goto L9;
        if ((r0 instanceof Application) == true) goto L7;
        r0 = ((ContextWrapper) r0).getBaseContext();
        goto L4
    L7:
        Application r1 = (Application) r0;
    L10:
        if (r1 == null) goto L12;
    L14:
        f03 r2 = new f03(0);
        LinkedHashMap r3 = r2.a;
        if (r1 == null) goto L17;
        r3.put(a75.d, r1);
    L17:
        r3.put(e54.a, this);
        r3.put(e54.b, this);
        Bundle r4 = this.s;
        if (r4 == null) goto L20;
        r3.put(e54.c, r4);
    L20:
        return r2;
    L12:
        if (ld1.I(3) == false) goto L14;
        Log.d("FragmentManager", "Could not find Application instance from Context " + Z().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        goto L14
    L9:
        r1 = null;
        goto L10
    }

    public final void b0(int r2, int r3, int r4, int r5) {
        if (this.W != null) goto L9;
        if (r2 != 0) goto L9;
        if (r3 != 0) goto L9;
        if (r4 != 0) goto L9;
        if (r5 != 0) goto L9;
        return;
    L9:
        k().b = r2;
        k().c = r3;
        k().d = r4;
        k().e = r5;
    }

    public final void c0(Bundle r2) {
        ld1 r0 = this.F;
        if (r0 == null) goto L11;
        if (r0 != null) goto L6;
        boolean r1 = false;
    L7:
        if (r1 == false) goto L11;
        kf2.o("Fragment already added and state has been saved");
        return;
    L6:
        r1 = r0.N();
    L11:
        this.s = r2;
    }

    @Override // defpackage.f75
    public final e75 d() {
        if (this.F != null) goto L5;
        kf2.o("Can't access ViewModels from detached fragment");
        return null;
    L5:
        if (p() == 1) goto L10;
        HashMap r0 = this.F.N.d;
        e75 r1 = (e75) r0.get(this.r);
        if (r1 != null) goto L14;
        e75 r2 = new e75();
        r0.put(this.r, r2);
        return r2;
    L14:
        return r1;
    L10:
        kf2.o("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        return null;
    }

    public final void d0() {
        if (this.P == true) goto L10;
        this.P = true;
        if (y() == true) goto L7;
        return;
    L7:
        if (z() == true) goto L12;
        this.G.E.invalidateOptionsMenu();
        return;
    L12:
        return;
    }

    public /* synthetic */ Activity e() {
        return l();
    }

    public final void e0(boolean r2) {
        if (this.Q == r2) goto L12;
        this.Q = r2;
        if (this.P == true) goto L7;
        return;
    L7:
        if (y() == true) goto L9;
        return;
    L9:
        if (z() == true) goto L15;
        this.G.E.invalidateOptionsMenu();
        return;
    L15:
        return;
    }

    public final boolean equals(Object r1) {
        if (this == r1) goto L5;
        return false;
    L5:
        return true;
    }

    @Override // defpackage.j54
    public final rm3 f() {
        return (rm3) this.g0.p;
    }

    public final void f0(kc1 r4) {
        if (r4 == null) goto L4;
        ge1 r0 = he1.a;
        he1.b(new SetTargetFragmentUsageViolation(this, "Attempting to set target fragment " + r4 + " with request code 0 for fragment " + this));
        he1.a(this).getClass();
    L4:
        ld1 r1 = this.F;
        if (r4 == null) goto L7;
        ld1 r2 = r4.F;
    L8:
        if (r1 == null) goto L14;
        if (r2 == null) goto L14;
        if (r1 == r2) goto L14;
        kf2.n(b11.l("Fragment ", r4, " must share the same FragmentManager to be set as a target fragment"));
        return;
    L14:
        kc1 r3 = r4;
    L16:
        if (r3 == null) goto L21;
        if (r3 == this) goto L20;
        r3 = r3.u(false);
        goto L16
    L20:
        throw new IllegalArgumentException("Setting " + r4 + " as the target of " + this + " would create a target cycle");
    L21:
        if (r4 != null) goto L24;
        this.u = null;
        this.t = null;
    L29:
        this.v = 0;
        return;
    L24:
        if (this.F != null) goto L26;
    L28:
        this.u = null;
        this.t = r4;
        goto L29
    L26:
        if (r4.F == null) goto L28;
        this.u = r4.r;
        this.t = null;
        goto L29
    L7:
        r2 = null;
        goto L8
    }

    public final void g0(Intent r2) {
        mc1 r0 = this.G;
        if (r0 == null) goto L6;
        r0.B.startActivity(r2, null);
        return;
    L6:
        kf2.o(b11.l("Fragment ", this, " not attached to Activity"));
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        return this.c0;
    }

    public fu i() {
        return new fc1(this);
    }

    public void j(String r4, FileDescriptor r5, PrintWriter r6, String[] r7) {
        r6.print(r4);
        r6.print("mFragmentId=#");
        r6.print(Integer.toHexString(this.J));
        r6.print(" mContainerId=#");
        r6.print(Integer.toHexString(this.K));
        r6.print(" mTag=");
        r6.println(this.L);
        r6.print(r4);
        r6.print("mState=");
        r6.print(this.n);
        r6.print(" mWho=");
        r6.print(this.r);
        r6.print(" mBackStackNesting=");
        r6.println(this.E);
        r6.print(r4);
        r6.print("mAdded=");
        r6.print(this.x);
        r6.print(" mRemoving=");
        r6.print(this.y);
        r6.print(" mFromLayout=");
        r6.print(this.A);
        r6.print(" mInLayout=");
        r6.println(this.B);
        r6.print(r4);
        r6.print("mHidden=");
        r6.print(this.M);
        r6.print(" mDetached=");
        r6.print(this.N);
        r6.print(" mMenuVisible=");
        r6.print(this.Q);
        r6.print(" mHasMenu=");
        r6.println(this.P);
        r6.print(r4);
        r6.print("mRetainInstance=");
        r6.print(this.O);
        r6.print(" mUserVisibleHint=");
        r6.println(this.V);
        if (this.F == null) goto L6;
        r6.print(r4);
        r6.print("mFragmentManager=");
        r6.println(this.F);
    L6:
        if (this.G == null) goto L9;
        r6.print(r4);
        r6.print("mHost=");
        r6.println(this.G);
    L9:
        if (this.I == null) goto L12;
        r6.print(r4);
        r6.print("mParentFragment=");
        r6.println(this.I);
    L12:
        if (this.s == null) goto L15;
        r6.print(r4);
        r6.print("mArguments=");
        r6.println(this.s);
    L15:
        if (this.o == null) goto L18;
        r6.print(r4);
        r6.print("mSavedFragmentState=");
        r6.println(this.o);
    L18:
        if (this.p == null) goto L21;
        r6.print(r4);
        r6.print("mSavedViewState=");
        r6.println(this.p);
    L21:
        if (this.q == null) goto L23;
        r6.print(r4);
        r6.print("mSavedViewRegistryState=");
        r6.println(this.q);
    L23:
        int r0 = 0;
        kc1 r1 = u(false);
        if (r1 == null) goto L26;
        r6.print(r4);
        r6.print("mTarget=");
        r6.print(r1);
        r6.print(" mTargetRequestCode=");
        r6.println(this.v);
    L26:
        r6.print(r4);
        r6.print("mPopDirection=");
        hc1 r2 = this.W;
        if (r2 != null) goto L29;
        boolean r3 = false;
    L30:
        r6.println(r3);
        hc1 r8 = this.W;
        if (r8 != null) goto L33;
        int r9 = 0;
    L34:
        if (r9 == 0) goto L40;
        r6.print(r4);
        r6.print("getEnterAnim=");
        hc1 r10 = this.W;
        if (r10 != null) goto L38;
        int r11 = 0;
    L39:
        r6.println(r11);
        goto L40
    L38:
        r11 = r10.b;
    L40:
        hc1 r12 = this.W;
        if (r12 != null) goto L43;
        int r13 = 0;
    L44:
        if (r13 == 0) goto L50;
        r6.print(r4);
        r6.print("getExitAnim=");
        hc1 r14 = this.W;
        if (r14 != null) goto L48;
        int r15 = 0;
    L49:
        r6.println(r15);
        goto L50
    L48:
        r15 = r14.c;
    L50:
        hc1 r16 = this.W;
        if (r16 != null) goto L53;
        int r17 = 0;
    L54:
        if (r17 == 0) goto L60;
        r6.print(r4);
        r6.print("getPopEnterAnim=");
        hc1 r18 = this.W;
        if (r18 != null) goto L58;
        int r19 = 0;
    L59:
        r6.println(r19);
        goto L60
    L58:
        r19 = r18.d;
    L60:
        hc1 r20 = this.W;
        if (r20 != null) goto L63;
        int r21 = 0;
    L64:
        if (r21 == 0) goto L71;
        r6.print(r4);
        r6.print("getPopExitAnim=");
        hc1 r22 = this.W;
        if (r22 == null) goto L69;
        r0 = r22.e;
    L69:
        r6.println(r0);
    L71:
        if (this.S == null) goto L74;
        r6.print(r4);
        r6.print("mContainer=");
        r6.println(this.S);
    L74:
        if (this.T == null) goto L77;
        r6.print(r4);
        r6.print("mView=");
        r6.println(this.T);
    L77:
        if (n() == null) goto L79;
        new qr2(this, d()).g(r4, r6);
    L79:
        r6.print(r4);
        r6.println("Child " + this.H + ":");
        this.H.v(r4.concat("  "), r5, r6, r7);
        return;
    L63:
        r21 = r20.e;
        goto L64
    L53:
        r17 = r16.d;
        goto L54
    L43:
        r13 = r12.c;
        goto L44
    L33:
        r9 = r8.b;
        goto L34
    L29:
        r3 = r2.a;
        goto L30
    }

    public final hc1 k() {
        if (this.W != null) goto L6;
        hc1 r0 = new hc1();
        Object r1 = k0;
        r0.g = r1;
        r0.h = r1;
        r0.i = r1;
        r0.j = 1.0f;
        r0.k = null;
        this.W = r0;
    L6:
        return this.W;
    }

    public final nc1 l() {
        mc1 r0 = this.G;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.A;
    }

    public final ld1 m() {
        if (this.G != null) goto L5;
        kf2.o(b11.l("Fragment ", this, " has not been attached yet."));
        return null;
    L5:
        return this.H;
    }

    public final Context n() {
        mc1 r0 = this.G;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.B;
    }

    public final LayoutInflater o() {
        LayoutInflater r0 = this.Y;
        if (r0 != null) goto L6;
        LayoutInflater r1 = L(null);
        this.Y = r1;
        return r1;
    L6:
        return r0;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration r1) {
        this.R = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu r1, View r2, ContextMenu.ContextMenuInfo r3) {
        X().onCreateContextMenu(r1, r2, r3);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.R = true;
    }

    public final int p() {
        r92 r0 = this.b0;
        if (r0 == r92.o) goto L10;
        if (this.I == null) goto L10;
        return Math.min(r0.ordinal(), this.I.p());
    L10:
        return r0.ordinal();
    }

    public final ld1 q() {
        ld1 r0 = this.F;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o(b11.l("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public final Resources r() {
        return Z().getResources();
    }

    public final String s(int r1) {
        return r().getString(r1);
    }

    public final void startActivityForResult(Intent r3, int r4) {
        if (this.G == null) goto L14;
        ld1 r0 = q();
        if (r0.B == null) goto L8;
        String r2 = this.r;
        gd1 r1 = new gd1();
        r1.n = r2;
        r1.o = r4;
        r0.E.addLast(r1);
        r0.B.a(r3);
        return;
    L8:
        mc1 r5 = r0.v;
        if (r4 != (-1)) goto L12;
        r5.B.startActivity(r3, null);
        return;
    L12:
        r5.getClass();
        kf2.o("Starting activity with a requestCode requires a FragmentActivity host");
        return;
    L14:
        kf2.o(b11.l("Fragment ", this, " not attached to Activity"));
    }

    public final String t(int r1, Object... r2) {
        return r().getString(r1, r2);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append(getClass().getSimpleName());
        r0.append("{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append("} (");
        r0.append(this.r);
        if (this.J == 0) goto L6;
        r0.append(" id=0x");
        r0.append(Integer.toHexString(this.J));
    L6:
        if (this.L == null) goto L8;
        r0.append(" tag=");
        r0.append(this.L);
    L8:
        r0.append(")");
        return r0.toString();
    }

    public final kc1 u(boolean r3) {
        if (r3 == false) goto L4;
        ge1 r4 = he1.a;
        he1.b(new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this));
        he1.a(this).getClass();
    L4:
        kc1 r5 = this.t;
        if (r5 == null) goto L7;
        return r5;
    L7:
        ld1 r6 = this.F;
        if (r6 == null) goto L13;
        String r2 = this.u;
        if (r2 != null) goto L12;
        return null;
    L12:
        return r6.c.t(r2);
    L13:
        return null;
    }

    public final le1 v() {
        le1 r0 = this.d0;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o(b11.l("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    public final void w() {
        this.c0 = new ea2(this, true);
        this.g0 = new gp3(new xm2(this, new wc(22, this)));
        this.f0 = null;
        ArrayList r0 = this.i0;
        ec1 r1 = this.j0;
        if (r0.contains(r1) == false) goto L5;
        return;
    L5:
        if (this.n < 0) goto L8;
        r1.a();
        return;
    L8:
        r0.add(r1);
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
        if (this.G != null) goto L5;
        return false;
    L5:
        if (this.x == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean z() {
        if (this.M == true) goto L13;
        ld1 r0 = this.F;
        if (r0 == null) goto L12;
        kc1 r2 = this.I;
        r0.getClass();
        if (r2 != null) goto L9;
        boolean r3 = false;
    L10:
        if (r3 == false) goto L12;
        return true;
    L9:
        r3 = r2.z();
    L12:
        return false;
    L13:
        return true;
    }
}
