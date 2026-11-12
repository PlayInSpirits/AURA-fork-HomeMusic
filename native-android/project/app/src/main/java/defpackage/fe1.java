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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fe1 {
    public final wo0 a;
    public final ss0 b;
    public final kc1 c;
    public boolean d;
    public int e;

    public fe1(wo0 r2, ss0 r3, ClassLoader r4, dd1 r5, Bundle r6) {
        this.d = false;
        this.e = -1;
        this.a = r2;
        this.b = r3;
        kc1 r7 = ((be1) r6.getParcelable("state")).a(r5);
        this.c = r7;
        r7.o = r6;
        Bundle r1 = r6.getBundle("arguments");
        if (r1 == null) goto L5;
        r1.setClassLoader(r4);
    L5:
        r7.c0(r1);
        if (ld1.I(2) == false) goto L9;
        Log.v("FragmentManager", "Instantiated fragment " + r7);
        return;
    }

    public final void a() {
        boolean r1 = ld1.I(3);
        kc1 r3 = this.c;
        if (r1 == false) goto L5;
        Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + r3);
    L5:
        Bundle r2 = r3.o;
        if (r2 == null) goto L8;
        r2.getBundle("savedInstanceState");
    L8:
        r3.H.P();
        r3.n = 3;
        r3.R = false;
        r3.C();
        if (r3.R == false) goto L32;
        if (ld1.I(3) == false) goto L14;
        Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + r3);
    L14:
        if (r3.T == null) goto L29;
        Bundle r0 = r3.o;
        if (r0 == null) goto L18;
        Bundle r4 = r0.getBundle("savedInstanceState");
    L19:
        SparseArray<Parcelable> r5 = r3.p;
        if (r5 == null) goto L22;
        r3.T.restoreHierarchyState(r5);
        r3.p = null;
    L22:
        r3.R = false;
        r3.U(r4);
        if (r3.R == false) goto L28;
        if (r3.T == null) goto L29;
        r3.d0.c(q92.ON_CREATE);
        goto L29
    L28:
        throw new do4(b11.l("Fragment ", r3, " did not call through to super.onViewStateRestored()"));
    L18:
        r4 = null;
    L29:
        r3.o = null;
        md1 r6 = r3.H;
        r6.G = false;
        r6.H = false;
        r6.N.g = false;
        r6.t(4);
        this.a.e(false);
        return;
    L32:
        throw new do4(b11.l("Fragment ", r3, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        kc1 r0 = this.c;
        View r1 = r0.S;
    L3:
        kc1 r2 = null;
        if (r1 == null) goto L15;
        Object r3 = r1.getTag(R.id.fragment_container_view_tag);
        if ((r3 instanceof kc1) == false) goto L8;
        kc1 r4 = (kc1) r3;
    L9:
        if (r4 != null) goto L10;
        Object r5 = r1.getParent();
        if ((r5 instanceof View) == true) goto L13;
        r1 = null;
        goto L3
    L13:
        r1 = (View) r5;
        goto L3
    L10:
        r2 = r4;
        goto L15
    L8:
        r4 = null;
    L15:
        kc1 r6 = r0.I;
        if (r2 == null) goto L19;
        if (r2 == r6) goto L19;
        int r7 = r0.K;
        ge1 r8 = he1.a;
        StringBuilder r9 = new StringBuilder("Attempting to nest fragment ");
        r9.append(r0);
        r9.append(" within the view of parent fragment ");
        r9.append(r2);
        r9.append(" via container with ID ");
        he1.b(new WrongNestedHierarchyViolation(r0, f34.i(r9, r7, " without using parent's childFragmentManager")));
        he1.a(r0).getClass();
    L19:
        ArrayList r10 = (ArrayList) this.b.n;
        ViewGroup r11 = r0.S;
        int r12 = -1;
        if (r11 == null) goto L38;
        int r13 = r10.indexOf(r0);
        int r14 = r13 - 1;
    L23:
        if (r14 < 0) goto L30;
        kc1 r15 = (kc1) r10.get(r14);
        if (r15.S != r11) goto L29;
        View r16 = r15.T;
        if (r16 == null) goto L29;
        r12 = r11.indexOfChild(r16) + 1;
    L29:
        r14 = r14 - 1;
    L30:
        r13 = r13 + 1;
        if (r13 >= r10.size()) goto L38;
        kc1 r17 = (kc1) r10.get(r13);
        if (r17.S != r11) goto L30;
        View r18 = r17.T;
        if (r18 == null) goto L30;
        r12 = r11.indexOfChild(r18);
    L38:
        r0.S.addView(r0.T, r12);
    }

    public final void c() {
        boolean r0 = ld1.I(3);
        kc1 r1 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "moveto ATTACHED: " + r1);
    L5:
        kc1 r2 = r1.t;
        fe1 r3 = null;
        ss0 r5 = this.b;
        if (r2 == null) goto L12;
        fe1 r4 = (fe1) ((HashMap) r5.o).get(r2.r);
        if (r4 == null) goto L10;
        r1.u = r1.t.r;
        r1.t = null;
        r3 = r4;
    L19:
        if (r3 == null) goto L21;
        r3.k();
    L21:
        ld1 r6 = r1.F;
        r1.G = r6.v;
        r1.I = r6.x;
        wo0 r7 = this.a;
        r7.l(false);
        ArrayList r8 = r1.i0;
        int r9 = r8.size();
        int r10 = 0;
    L22:
        if (r10 >= r9) goto L24;
        Object r11 = r8.get(r10);
        r10 = r10 + 1;
        ((ic1) r11).a();
        goto L22
    L24:
        r8.clear();
        r1.H.b(r1.G, r1.i(), r1);
        r1.n = 0;
        r1.R = false;
        r1.E(r1.G.B);
        if (r1.R == false) goto L33;
        ld1 r12 = r1.F;
        Iterator r13 = r12.o.iterator();
    L28:
        if (r13.hasNext() == false) goto L30;
        ((xd1) r13.next()).a(r12, r1);
        goto L28
    L30:
        md1 r14 = r1.H;
        r14.G = false;
        r14.H = false;
        r14.N.g = false;
        r14.t(0);
        r7.f(false);
        return;
    L33:
        throw new do4(b11.l("Fragment ", r1, " did not call through to super.onAttach()"));
    L10:
        StringBuilder r15 = new StringBuilder("Fragment ");
        r15.append(r1);
        kc1 r16 = r1.t;
        r15.append(" declared target fragment ");
        r15.append(r16);
        r15.append(" that does not belong to this FragmentManager!");
        throw new IllegalStateException(r15.toString());
    L12:
        String r17 = r1.u;
        if (r17 == null) goto L19;
        r3 = (fe1) ((HashMap) r5.o).get(r17);
        if (r3 != null) goto L19;
        StringBuilder r18 = new StringBuilder("Fragment ");
        r18.append(r1);
        r18.append(" declared target fragment ");
        kf2.o(b11.q(r18, r1.u, " that does not belong to this FragmentManager!"));
    }

    public final int d() {
        kc1 r0 = this.c;
        if (r0.F == null) goto L5;
        int r1 = this.e;
        int r2 = r0.b0.ordinal();
        int r3 = 0;
        if (r2 == 1) goto L14;
        if (r2 == 2) goto L13;
        if (r2 == 3) goto L12;
        if (r2 == 4) goto L16;
        r1 = Math.min(r1, -1);
    L16:
        if (r0.A == false) goto L28;
        boolean r4 = r0.B;
        int r15 = this.e;
        if (r4 == false) goto L24;
        r1 = Math.max(r15, 2);
        View r16 = r0.T;
        if (r16 == null) goto L28;
        if (r16.getParent() != null) goto L28;
        r1 = Math.min(r1, 2);
        goto L28
    L24:
        if (r15 >= 4) goto L26;
        r1 = Math.min(r1, r0.n);
        goto L28
    L26:
        r1 = Math.min(r1, 1);
    L28:
        if (r0.x == true) goto L30;
        r1 = Math.min(r1, 1);
    L30:
        ViewGroup r17 = r0.S;
        if (r17 == null) goto L53;
        xm0 r18 = xm0.f(r17, r0.q());
        pj4 r5 = r18.d(r0);
        if (r5 == null) goto L35;
        int r6 = r5.b;
    L36:
        ArrayList r19 = r18.c;
        int r10 = r19.size();
        int r11 = 0;
    L37:
        if (r11 >= r10) goto L43;
        Object r12 = r19.get(r11);
        r11 = r11 + 1;
        pj4 r13 = (pj4) r12;
        if (h12.c(r13.c, r0) == false) goto L37;
        if (r13.f == true) goto L37;
    L44:
        pj4 r14 = (pj4) r12;
        if (r14 == null) goto L47;
        r3 = r14.b;
    L47:
        if (r6 != 0) goto L49;
        int r110 = -1;
    L50:
        if (r110 == (-1)) goto L53;
        if (r110 == 1) goto L53;
        r3 = r6;
        goto L53
    L49:
        r110 = qj4.a[xa3.w(r6)];
        goto L50
    L43:
        r12 = null;
        goto L44
    L35:
        r6 = 0;
    L53:
        if (r3 != 2) goto L55;
        r1 = Math.min(r1, 6);
    L64:
        if (r0.U == false) goto L69;
        if (r0.n >= 5) goto L69;
        r1 = Math.min(r1, 4);
    L69:
        if (ld1.I(2) == false) goto L71;
        Log.v("FragmentManager", "computeExpectedState() of " + r1 + " for " + r0);
    L71:
        return r1;
    L55:
        if (r3 != 3) goto L58;
        r1 = Math.max(r1, 3);
        goto L64
    L58:
        if (r0.y == false) goto L64;
        if (r0.A() == false) goto L62;
        r1 = Math.min(r1, 1);
        goto L64
    L62:
        r1 = Math.min(r1, -1);
        goto L64
    L12:
        r1 = Math.min(r1, 5);
        goto L16
    L13:
        r1 = Math.min(r1, 1);
        goto L16
    L14:
        r1 = Math.min(r1, 0);
        goto L16
    L5:
        return r0.n;
    }

    public final void e() {
        boolean r0 = ld1.I(3);
        kc1 r1 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "moveto CREATED: " + r1);
    L5:
        Bundle r2 = r1.o;
        if (r2 == null) goto L8;
        Bundle r3 = r2.getBundle("savedInstanceState");
    L10:
        if (r1.Z == true) goto L17;
        wo0 r7 = this.a;
        r7.n(false);
        r1.H.P();
        r1.n = 1;
        r1.R = false;
        r1.c0.a(new vv3(4, r1));
        r1.F(r3);
        r1.Z = true;
        if (r1.R == false) goto L16;
        r1.c0.d(q92.ON_CREATE);
        r7.g(false);
        return;
    L16:
        throw new do4(b11.l("Fragment ", r1, " did not call through to super.onCreate()"));
    L17:
        r1.n = 1;
        Bundle r8 = r1.o;
        if (r8 == null) goto L23;
        Bundle r9 = r8.getBundle("childFragmentManager");
        if (r9 == null) goto L24;
        r1.H.V(r9);
        md1 r10 = r1.H;
        r10.G = false;
        r10.H = false;
        r10.N.g = false;
        r10.t(1);
        return;
    L24:
        return;
    L23:
        return;
    L8:
        r3 = null;
        goto L10
    }

    public final void f() {
        kc1 r0 = this.c;
        if (r0.A == false) goto L5;
        return;
    L5:
        int r1 = 3;
        if (ld1.I(3) == false) goto L8;
        Log.d("FragmentManager", "moveto CREATE_VIEW: " + r0);
    L8:
        Bundle r2 = r0.o;
        Bundle r5 = null;
        if (r2 == null) goto L11;
        Bundle r3 = r2.getBundle("savedInstanceState");
    L12:
        LayoutInflater r6 = r0.L(r3);
        r0.Y = r6;
        ViewGroup r7 = r0.S;
        if (r7 != null) goto L35;
        int r8 = r0.K;
        if (r8 != 0) goto L18;
        r7 = null;
        goto L35
    L18:
        if (r8 == (-1)) goto L32;
        r7 = (ViewGroup) r0.F.w.H(r8);
        if (r7 != null) goto L30;
        if (r0.C == true) goto L35;
        String r11 = r0.r().getResourceName(r0.K);     // Catch: Resources.NotFoundException -> L26
    L28:
        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(r0.K) + " (" + r11 + ") for fragment " + r0);
    L26:
        r11 = "unknown";
        goto L28
    L30:
        if ((r7 instanceof FragmentContainerView) == true) goto L35;
        ge1 r9 = he1.a;
        he1.b(new WrongFragmentContainerViolation(r0, "Attempting to add fragment " + r0 + " to container " + r7 + " which is not a FragmentContainerView"));
        he1.a(r0).getClass();
        goto L35
    L32:
        kf2.n(b11.l("Cannot create fragment ", r0, " for a container view with no id"));
        return;
    L35:
        r0.S = r7;
        r0.V(r6, r7, r3);
        if (r0.T != null) goto L38;
    L62:
        r0.n = 2;
        return;
    L38:
        if (ld1.I(3) == false) goto L40;
        Log.d("FragmentManager", "moveto VIEW_CREATED: " + r0);
    L40:
        r0.T.setSaveFromParentEnabled(false);
        r0.T.setTag(R.id.fragment_container_view_tag, r0);
        if (r7 == null) goto L44;
        b();
    L44:
        if (r0.M == false) goto L46;
        r0.T.setVisibility(8);
    L46:
        View r4 = r0.T;
        WeakHashMap r10 = j65.a;
        boolean r12 = r4.isAttachedToWindow();
        View r13 = r0.T;
        if (r12 == false) goto L49;
        r13.requestApplyInsets();
    L50:
        Bundle r14 = r0.o;
        if (r14 == null) goto L53;
        r5 = r14.getBundle("savedInstanceState");
    L53:
        r0.T(r0.T, r5);
        r0.H.t(2);
        this.a.t(r0, r0.T, false);
        int r15 = r0.T.getVisibility();
        r0.k().j = r0.T.getAlpha();
        if (r0.S == null) goto L62;
        if (r15 != 0) goto L62;
        View r16 = r0.T.findFocus();
        if (r16 == null) goto L61;
        r0.k().k = r16;
        if (ld1.I(2) == false) goto L61;
        Log.v("FragmentManager", "requestFocus: Saved focused view " + r16 + " for Fragment " + r0);
    L61:
        r0.T.setAlpha(0.0f);
        goto L62
    L49:
        r13.addOnAttachStateChangeListener(new bc(r1, r13));
        goto L50
    L11:
        r3 = null;
        goto L12
    }

    public final void g() {
        boolean r0 = ld1.I(3);
        kc1 r1 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "movefrom CREATED: " + r1);
    L5:
        boolean r2 = true;
        int r3 = 0;
        if (r1.y == true) goto L8;
    L10:
        boolean r4 = false;
    L11:
        ss0 r5 = this.b;
        if (r4 == true) goto L14;
    L16:
        if (r4 == true) goto L35;
        od1 r6 = (od1) r5.q;
        if (r6.b.containsKey(r1.r) == true) goto L21;
    L23:
        boolean r7 = true;
    L24:
        if (r7 == true) goto L35;
        String r9 = r1.u;
        if (r9 == null) goto L33;
        kc1 r10 = r5.t(r9);
        if (r10 == null) goto L33;
        if (r10.O == false) goto L33;
        r1.t = r10;
    L33:
        r1.n = 0;
        return;
    L21:
        if (r6.e == false) goto L23;
        r7 = r6.f;
    L35:
        mc1 r8 = r1.G;
        if (r8 == null) goto L38;
        r2 = ((od1) r5.q).f;
    L41:
        if (r4 == true) goto L43;
    L44:
        if (r2 == false) goto L46;
    L45:
        ((od1) r5.q).c(r1, false);
    L46:
        r1.H.k();
        r1.c0.d(q92.ON_DESTROY);
        r1.n = 0;
        r1.R = false;
        r1.Z = false;
        r1.I();
        if (r1.R == false) goto L61;
        this.a.i(false);
        ArrayList r11 = r5.v();
        int r12 = r11.size();
    L49:
        if (r3 >= r12) goto L55;
        Object r13 = r11.get(r3);
        r3 = r3 + 1;
        fe1 r14 = (fe1) r13;
        if (r14 == null) goto L49;
        kc1 r15 = r14.c;
        if (r1.r.equals(r15.u) == false) goto L49;
        r15.t = r1;
        r15.u = null;
        goto L49
    L55:
        String r16 = r1.u;
        if (r16 == null) goto L58;
        r1.t = r5.t(r16);
    L58:
        r5.F(this);
        return;
    L61:
        throw new do4(b11.l("Fragment ", r1, " did not call through to super.onDestroy()"));
    L43:
        if (r1.z == false) goto L45;
    L38:
        nc1 r17 = r8.B;
        if (r17 == null) goto L41;
        r2 = true ^ r17.isChangingConfigurations();
        goto L41
    L14:
        if (r1.z == true) goto L16;
        r5.G(r1.r, null);
        goto L16
    L8:
        if (r1.A() == true) goto L10;
        r4 = true;
        goto L11
    }

    public final void h() {
        boolean r0 = ld1.I(3);
        kc1 r1 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "movefrom CREATE_VIEW: " + r1);
    L5:
        ViewGroup r2 = r1.S;
        if (r2 == null) goto L10;
        View r3 = r1.T;
        if (r3 == null) goto L10;
        r2.removeView(r3);
    L10:
        r1.H.t(1);
        if (r1.T == null) goto L15;
        le1 r4 = r1.d0;
        r4.e();
        if (r4.r.h.compareTo(r92.p) < 0) goto L15;
        r1.d0.c(q92.ON_DESTROY);
    L15:
        r1.n = 1;
        r1.R = false;
        r1.J();
        if (r1.R == false) goto L23;
        mj4 r5 = ((nd2) new qr2(r1, r1.d()).p).b;
        int r6 = r5.e();
        int r7 = 0;
    L18:
        if (r7 >= r6) goto L20;
        ((ld2) r5.f(r7)).l();
        r7 = r7 + 1;
        goto L18
    L20:
        r1.D = false;
        this.a.u(false);
        r1.S = null;
        r1.T = null;
        r1.d0 = null;
        r1.e0.k(null);
        r1.B = false;
        return;
    L23:
        throw new do4(b11.l("Fragment ", r1, " did not call through to super.onDestroyView()"));
    }

    public final void i() {
        boolean r1 = ld1.I(3);
        kc1 r3 = this.c;
        if (r1 == false) goto L5;
        Log.d("FragmentManager", "movefrom ATTACHED: " + r3);
    L5:
        r3.n = -1;
        r3.R = false;
        r3.K();
        r3.Y = null;
        if (r3.R == false) goto L29;
        md1 r6 = r3.H;
        if (r6.I == true) goto L10;
        r6.k();
        r3.H = new md1();
    L10:
        this.a.j(false);
        r3.n = -1;
        r3.G = null;
        r3.I = null;
        r3.F = null;
        if (r3.y == true) goto L13;
    L15:
        od1 r8 = (od1) this.b.q;
        if (r8.b.containsKey(r3.r) == true) goto L19;
    L21:
        boolean r9 = true;
    L22:
        if (r9 == true) goto L24;
        return;
    L24:
        if (ld1.I(3) == false) goto L26;
        Log.d("FragmentManager", "initState called for fragment: " + r3);
    L26:
        r3.x();
        return;
    L19:
        if (r8.e == false) goto L21;
        r9 = r8.f;
        goto L22
    L13:
        if (r3.A() == true) goto L15;
    L29:
        throw new do4(b11.l("Fragment ", r3, " did not call through to super.onDetach()"));
    }

    public final void j() {
        kc1 r0 = this.c;
        if (r0.A == true) goto L5;
        return;
    L5:
        if (r0.B == true) goto L7;
        return;
    L7:
        if (r0.D == false) goto L9;
        return;
    L9:
        if (ld1.I(3) == false) goto L11;
        Log.d("FragmentManager", "moveto CREATE_VIEW: " + r0);
    L11:
        Bundle r1 = r0.o;
        Bundle r3 = null;
        if (r1 == null) goto L14;
        Bundle r2 = r1.getBundle("savedInstanceState");
    L15:
        LayoutInflater r4 = r0.L(r2);
        r0.Y = r4;
        r0.V(r4, null, r2);
        View r5 = r0.T;
        if (r5 == null) goto L28;
        r5.setSaveFromParentEnabled(false);
        r0.T.setTag(R.id.fragment_container_view_tag, r0);
        if (r0.M == false) goto L20;
        r0.T.setVisibility(8);
    L20:
        Bundle r6 = r0.o;
        if (r6 == null) goto L23;
        r3 = r6.getBundle("savedInstanceState");
    L23:
        r0.T(r0.T, r3);
        r0.H.t(2);
        this.a.t(r0, r0.T, false);
        r0.n = 2;
        return;
    L28:
        return;
    L14:
        r2 = null;
        goto L15
    }

    public final void k() {
        boolean r0 = this.d;
        kc1 r3 = this.c;
        if (r0 == false) goto L125;
        if (ld1.I(2) == false) goto L146;
        Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + r3);
        return;
    L146:
        return;
    L125:
        this.d = true;     // Catch: Throwable -> L18
        boolean r5 = false;
    L10:
        int r6 = d();     // Catch: Throwable -> L18
        int r7 = r3.n;     // Catch: Throwable -> L18
        int r8 = 3;
        ss0 r9 = this.b;
        if (r6 == r7) goto L81;
        if (r6 <= r7) goto L46;
        switch((r7 + 1)) {
            case 0: goto L44;
            case 1: goto L43;
            case 2: goto L42;
            case 3: goto L41;
            case 4: goto L23;
            case 5: goto L21;
            case 6: goto L20;
            case 7: goto L17;
            default: goto L80;
        };
    L17:
        n();     // Catch: Throwable -> L18
        goto L80
    L20:
        r3.n = 6;     // Catch: Throwable -> L18
        goto L80
    L21:
        q();     // Catch: Throwable -> L18
        goto L80
    L41:
        a();     // Catch: Throwable -> L18
        goto L80
    L42:
        j();     // Catch: Throwable -> L18
        f();     // Catch: Throwable -> L18
        goto L80
    L43:
        e();     // Catch: Throwable -> L18
        goto L80
    L44:
        c();     // Catch: Throwable -> L18
        goto L80
    L23:
        if (r3.T == null) goto L40;
        ViewGroup r10 = r3.S;     // Catch: Throwable -> L18
        if (r10 == null) goto L40;
        xm0 r11 = xm0.f(r10, r3.q());     // Catch: Throwable -> L18
        int r12 = r3.T.getVisibility();     // Catch: Throwable -> L18
        if (r12 == 0) goto L35;
        if (r12 != 4) goto L30;
        r8 = 4;
    L37:
        if (ld1.I(2) == false) goto L39;
        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + r3);     // Catch: Throwable -> L18
    L39:
        r11.a(r8, 2, this);     // Catch: Throwable -> L18
        goto L40
    L30:
        if (r12 == 8) goto L37;
        throw new IllegalArgumentException("Unknown visibility " + r12);     // Catch: Throwable -> L18
    L35:
        r8 = 2;
    L40:
        r3.n = 4;     // Catch: Throwable -> L18
    L80:
        r5 = true;
        goto L10
    L46:
        switch((r7 - 1)) {
            case -1: goto L79;
            case 0: goto L74;
            case 1: goto L72;
            case 2: goto L71;
            case 3: goto L52;
            case 4: goto L50;
            case 5: goto L49;
            case 6: goto L48;
            default: goto L80;
        };     // Catch: Throwable -> L18
    L48:
        l();     // Catch: Throwable -> L18
        goto L80
    L49:
        r3.n = 5;     // Catch: Throwable -> L18
        goto L80
    L50:
        r();     // Catch: Throwable -> L18
        goto L80
    L71:
        r3.B = false;     // Catch: Throwable -> L18
        r3.n = 2;     // Catch: Throwable -> L18
        goto L80
    L72:
        h();     // Catch: Throwable -> L18
        r3.n = 1;     // Catch: Throwable -> L18
        goto L80
    L79:
        i();     // Catch: Throwable -> L18
        goto L80
    L52:
        if (ld1.I(3) == false) goto L55;
        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + r3);     // Catch: Throwable -> L18
    L55:
        if (r3.z == false) goto L58;
        r9.G(r3.r, o());     // Catch: Throwable -> L18
    L63:
        if (r3.T == null) goto L70;
        ViewGroup r13 = r3.S;     // Catch: Throwable -> L18
        if (r13 == null) goto L70;
        xm0 r14 = xm0.f(r13, r3.q());     // Catch: Throwable -> L18
        if (ld1.I(2) == false) goto L69;
        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + r3);     // Catch: Throwable -> L18
    L69:
        r14.a(1, 3, this);     // Catch: Throwable -> L18
    L70:
        r3.n = 3;     // Catch: Throwable -> L18
        goto L80
    L58:
        if (r3.T == null) goto L63;
        if (r3.p != null) goto L63;
        p();     // Catch: Throwable -> L18
        goto L63
    L74:
        if (r3.z == true) goto L76;
    L78:
        g();     // Catch: Throwable -> L18
        goto L80
    L76:
        if (((Bundle) ((HashMap) r9.p).get(r3.r)) != null) goto L78;
        r9.G(r3.r, o());     // Catch: Throwable -> L18
        goto L78
    L81:
        if (r5 == true) goto L98;
        if (r7 != (-1)) goto L98;
        if (r3.y == false) goto L98;
        if (r3.A() == true) goto L98;
        if (r3.z == true) goto L98;
        if (ld1.I(3) == false) goto L93;
        Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + r3);     // Catch: Throwable -> L18
    L93:
        ((od1) r9.q).c(r3, true);     // Catch: Throwable -> L18
        r9.F(this);     // Catch: Throwable -> L18
        if (ld1.I(3) == false) goto L96;
        Log.d("FragmentManager", "initState called for fragment: " + r3);     // Catch: Throwable -> L18
    L96:
        r3.x();     // Catch: Throwable -> L18
    L98:
        if (r3.X == true) goto L100;
    L121:
        this.d = false;
        return;
    L100:
        if (r3.T == null) goto L113;
        ViewGroup r15 = r3.S;     // Catch: Throwable -> L18
        if (r15 == null) goto L113;
        xm0 r16 = xm0.f(r15, r3.q());     // Catch: Throwable -> L18
        if (r3.M == false) goto L110;
        if (ld1.I(2) == false) goto L108;
        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + r3);     // Catch: Throwable -> L18
    L108:
        r16.a(3, 1, this);     // Catch: Throwable -> L18
        goto L113
    L110:
        if (ld1.I(2) == false) goto L112;
        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + r3);     // Catch: Throwable -> L18
    L112:
        r16.a(2, 1, this);     // Catch: Throwable -> L18
    L113:
        ld1 r1 = r3.F;     // Catch: Throwable -> L18
        if (r1 != null) goto L116;
    L120:
        r3.X = false;     // Catch: Throwable -> L18
        r3.H.n();     // Catch: Throwable -> L18
        goto L121
    L116:
        if (r3.x == false) goto L120;
        if (ld1.J(r3) == false) goto L120;
        r1.F = true;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        this.d = false;
        throw th;
    }

    public final void l() {
        boolean r0 = ld1.I(3);
        kc1 r1 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "movefrom RESUMED: " + r1);
    L5:
        r1.H.t(5);
        if (r1.T == null) goto L8;
        r1.d0.c(q92.ON_PAUSE);
    L8:
        r1.c0.d(q92.ON_PAUSE);
        r1.n = 6;
        r1.R = false;
        r1.O();
        if (r1.R == false) goto L13;
        this.a.k(false);
        return;
    L13:
        throw new do4(b11.l("Fragment ", r1, " did not call through to super.onPause()"));
    }

    public final void m(ClassLoader r3) {
        kc1 r2 = this.c;
        Bundle r0 = r2.o;
        if (r0 == null) goto L16;
        r0.setClassLoader(r3);
        if (r2.o.getBundle("savedInstanceState") != null) goto L8;
        r2.o.putBundle("savedInstanceState", new Bundle());
    L8:
        r2.p = r2.o.getSparseParcelableArray("viewState");
        r2.q = r2.o.getBundle("viewRegistryState");
        be1 r4 = (be1) r2.o.getParcelable("state");
        if (r4 == null) goto L12;
        r2.u = r4.y;
        r2.v = r4.z;
        r2.V = r4.A;
    L12:
        if (r2.V == true) goto L15;
        r2.U = true;
        return;
    L15:
        return;
    }

    public final void n() {
        boolean r0 = ld1.I(3);
        kc1 r2 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "moveto RESUMED: " + r2);
    L5:
        hc1 r1 = r2.W;
        if (r1 != null) goto L8;
        View r3 = null;
    L9:
        if (r3 != null) goto L11;
    L25:
        r2.k().k = null;
        r2.H.P();
        r2.H.y(true);
        r2.n = 7;
        r2.R = false;
        r2.P();
        if (r2.R == false) goto L33;
        ea2 r4 = r2.c0;
        q92 r5 = q92.ON_RESUME;
        r4.d(r5);
        if (r2.T == null) goto L30;
        r2.d0.r.d(r5);
    L30:
        md1 r6 = r2.H;
        r6.G = false;
        r6.H = false;
        r6.N.g = false;
        r6.t(7);
        this.a.p(false);
        this.b.G(r2.r, null);
        r2.o = null;
        r2.p = null;
        r2.q = null;
        return;
    L33:
        throw new do4(b11.l("Fragment ", r2, " did not call through to super.onResume()"));
    L11:
        if (r3 == r2.T) goto L17;
        ViewParent r7 = r3.getParent();
    L14:
        if (r7 == null) goto L25;
        if (r7 == r2.T) goto L17;
        r7 = r7.getParent();
    L17:
        boolean r8 = r3.requestFocus();
        if (ld1.I(2) == false) goto L25;
        StringBuilder r9 = new StringBuilder("requestFocus: Restoring focused view ");
        r9.append(r3);
        r9.append(" ");
        if (r8 == false) goto L22;
        String r10 = "succeeded";
    L23:
        r9.append(r10);
        r9.append(" on Fragment ");
        r9.append(r2);
        r9.append(" resulting in focused view ");
        r9.append(r2.T.findFocus());
        Log.v("FragmentManager", r9.toString());
        goto L25
    L22:
        r10 = "failed";
        goto L23
    L8:
        r3 = r1.k;
        goto L9
    }

    public final Bundle o() {
        Bundle r0 = new Bundle();
        kc1 r1 = this.c;
        if (r1.n != (-1)) goto L7;
        Bundle r2 = r1.o;
        if (r2 == null) goto L7;
        r0.putAll(r2);
    L7:
        r0.putParcelable("state", new be1(r1));
        if (r1.n <= (-1)) goto L27;
        Bundle r3 = new Bundle();
        r1.Q(r3);
        if (r3.isEmpty() == true) goto L12;
        r0.putBundle("savedInstanceState", r3);
    L12:
        this.a.q(false);
        Bundle r4 = new Bundle();
        r1.g0.t(r4);
        if (r4.isEmpty() == true) goto L15;
        r0.putBundle("registryState", r4);
    L15:
        Bundle r5 = r1.H.W();
        if (r5.isEmpty() == true) goto L19;
        r0.putBundle("childFragmentManager", r5);
    L19:
        if (r1.T == null) goto L21;
        p();
    L21:
        SparseArray<? extends Parcelable> r6 = r1.p;
        if (r6 == null) goto L24;
        r0.putSparseParcelableArray("viewState", r6);
    L24:
        Bundle r7 = r1.q;
        if (r7 == null) goto L27;
        r0.putBundle("viewRegistryState", r7);
    L27:
        Bundle r8 = r1.s;
        if (r8 == null) goto L30;
        r0.putBundle("arguments", r8);
    L30:
        return r0;
    }

    public final void p() {
        kc1 r2 = this.c;
        if (r2.T != null) goto L6;
        return;
    L6:
        if (ld1.I(2) == false) goto L8;
        Log.v("FragmentManager", "Saving view state for fragment " + r2 + " with view " + r2.T);
    L8:
        SparseArray<Parcelable> r0 = new SparseArray();
        r2.T.saveHierarchyState(r0);
        if (r0.size() <= 0) goto L11;
        r2.p = r0;
    L11:
        Bundle r1 = new Bundle();
        r2.d0.s.t(r1);
        if (r1.isEmpty() == true) goto L15;
        r2.q = r1;
        return;
    }

    public final void q() {
        boolean r0 = ld1.I(3);
        kc1 r1 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "moveto STARTED: " + r1);
    L5:
        r1.H.P();
        r1.H.y(true);
        r1.n = 5;
        r1.R = false;
        r1.R();
        if (r1.R == false) goto L13;
        ea2 r3 = r1.c0;
        q92 r4 = q92.ON_START;
        r3.d(r4);
        if (r1.T == null) goto L10;
        r1.d0.r.d(r4);
    L10:
        md1 r2 = r1.H;
        r2.G = false;
        r2.H = false;
        r2.N.g = false;
        r2.t(5);
        this.a.r(false);
        return;
    L13:
        throw new do4(b11.l("Fragment ", r1, " did not call through to super.onStart()"));
    }

    public final void r() {
        boolean r0 = ld1.I(3);
        kc1 r1 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "movefrom STARTED: " + r1);
    L5:
        md1 r2 = r1.H;
        r2.H = true;
        r2.N.g = true;
        r2.t(4);
        if (r1.T == null) goto L8;
        r1.d0.c(q92.ON_STOP);
    L8:
        r1.c0.d(q92.ON_STOP);
        r1.n = 4;
        r1.R = false;
        r1.S();
        if (r1.R == false) goto L13;
        this.a.s(false);
        return;
    L13:
        throw new do4(b11.l("Fragment ", r1, " did not call through to super.onStop()"));
    }

    public fe1(wo0 r2, ss0 r3, kc1 r4) {
        this.d = false;
        this.e = -1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
    }

    public fe1(wo0 r3, ss0 r4, kc1 r5, Bundle r6) {
        this.d = false;
        this.e = -1;
        this.a = r3;
        this.b = r4;
        this.c = r5;
        r5.p = null;
        r5.q = null;
        r5.E = 0;
        r5.B = false;
        r5.x = false;
        kc1 r7 = r5.t;
        if (r7 == null) goto L5;
        String r8 = r7.r;
    L6:
        r5.u = r8;
        r5.t = null;
        r5.o = r6;
        r5.s = r6.getBundle("arguments");
        return;
    L5:
        r8 = null;
        goto L6
    }
}
