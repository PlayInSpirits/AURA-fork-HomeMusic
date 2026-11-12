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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
@s43("fragment")
public class rd1 extends t43 {
    public final Context c;
    public final ld1 d;
    public final int e;
    public final LinkedHashSet f;
    public final ArrayList g;
    public final pd1 h;
    public final ir0 i;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class a extends x65 {
        public WeakReference b;

        public a() {
        }

        @Override // defpackage.x65
        public final void b() {
            WeakReference r0 = this.b;
            if (r0 == null) goto L8;
            gf1 r1 = (gf1) r0.get();
            if (r1 == null) goto L10;
            r1.invoke();
            return;
        L10:
            return;
        L8:
            h12.Q("completeTransition");
            throw null;
        }
    }

    public rd1(Context r1, ld1 r2, int r3) {
        this.c = r1;
        this.d = r2;
        this.e = r3;
        this.f = new LinkedHashSet();
        this.g = new ArrayList();
        this.h = new pd1(0, this);
        this.i = new ir0(1, this);
    }

    public static void k(rd1 r3, String r4, int r5) {
        boolean r1 = true;
        if ((r5 & 2) == 0) goto L5;
        boolean r0 = false;
    L7:
        if ((r5 & 4) != 0) goto L10;
        r1 = false;
    L10:
        ArrayList r6 = r3.g;
        if (r1 == false) goto L13;
        v40.p0(r6, new td1(0, r4));
    L13:
        r6.add(new kd3(r4, Boolean.valueOf(r0)));
        return;
    L5:
        r0 = true;
        goto L7
    }

    public static boolean n() {
        if (Log.isLoggable("FragmentManager", 2) == false) goto L5;
        return true;
    L5:
        if (Log.isLoggable("FragmentNavigator", 2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.t43
    public final r23 a() {
        return new sd1(this);
    }

    @Override // defpackage.t43
    public final void d(List r9, y23 r10) {
        ld1 r0 = this.d;
        if (r0.N() == false) goto L6;
        Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
        return;
    L6:
        Iterator r11 = r9.iterator();
    L8:
        if (r11.hasNext() == false) goto L27;
        a23 r1 = (a23) r11.next();
        boolean r3 = ((List) b().e.n.getValue()).isEmpty();
        int r4 = 0;
        if (r10 == null) goto L17;
        if (r3 == true) goto L17;
        if (r10.b == false) goto L17;
        if (this.f.remove(r1.s) == false) goto L17;
        r0.w(new kd1(r0, r1.s, r4), false);
        b().h(r1);
    L17:
        po r5 = m(r1, r10);
        String r6 = r1.s;
        if (r3 == true) goto L23;
        a23 r7 = (a23) q40.D0((List) b().e.n.getValue());
        if (r7 == null) goto L22;
        k(this, r7.s, 6);
    L22:
        k(this, r6, 6);
        r5.c(r6);
    L23:
        r5.e(false);
        if (n() == false) goto L26;
        Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + r1);
    L26:
        b().h(r1);
        goto L8
    }

    @Override // defpackage.t43
    public final void e(final d23 r4) {
        this.a = r4;
        this.b = true;
        if (n() == false) goto L5;
        Log.v("FragmentNavigator", "onAttach");
    L5:
        xd1 r0 = new qd1(r4, this);
        ld1 r1 = this.d;
        r1.o.add(r0);
        vd1 r2 = new vd1(r4, this);
        if (r1.m != null) goto L8;
        r1.m = new ArrayList();
    L8:
        r1.m.add(r2);
    }

    @Override // defpackage.t43
    public final void f(a23 r8) {
        String r0 = r8.s;
        ld1 r1 = this.d;
        if (r1.N() == false) goto L6;
        Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
        return;
    L6:
        po r2 = m(r8, null);
        List r3 = (List) b().e.n.getValue();
        if (r3.size() <= 1) goto L12;
        a23 r4 = (a23) q40.y0(r3, r3.size() - 2);
        if (r4 == null) goto L11;
        k(this, r4.s, 6);
    L11:
        k(this, r0, 4);
        r1.w(new jd1(r1, r0, -1), false);
        k(this, r0, 2);
        r2.c(r0);
    L12:
        r2.e(false);
        b().c(r8);
    }

    @Override // defpackage.t43
    public final void g(Bundle r2) {
        ArrayList<String> r3 = r2.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (r3 == null) goto L6;
        LinkedHashSet r1 = this.f;
        r1.clear();
        v40.n0(r3, r1);
        return;
    }

    @Override // defpackage.t43
    public final Bundle h() {
        LinkedHashSet r2 = this.f;
        if (r2.isEmpty() == false) goto L7;
        return null;
    L7:
        return fh0.g(new kd3[]{new kd3("androidx-nav-fragment:navigator:savedIds", new ArrayList(r2))});
    }

    @Override // defpackage.t43
    public final void i(a23 r18, boolean r19) {
        r18.getClass();
        ld1 r3 = this.d;
        if (r3.N() == false) goto L6;
        Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
        return;
    L6:
        List r4 = (List) b().e.n.getValue();
        int r6 = r4.indexOf(r18);
        List r7 = r4.subList(r6, r4.size());
        a23 r8 = (a23) q40.w0(r4);
        int r9 = 1;
        a23 r5 = (a23) q40.y0(r4, r6 - 1);
        if (r5 == null) goto L9;
        k(this, r5.s, 6);
    L9:
        ArrayList r10 = new ArrayList();
        Iterator r11 = r7.iterator();
    L10:
        int r12 = 0;
        if (r11.hasNext() == false) goto L29;
        Object r13 = r11.next();
        a23 r14 = (a23) r13;
        ArrayList r15 = this.g;
        r15.getClass();
        String r16 = r14.s;
        Iterator r17 = r15.iterator();
    L14:
        if (r17.hasNext() == false) goto L23;
        kd3 r110 = (kd3) r17.next();
        r110.getClass();
        String r111 = (String) r110.n;
        if (r12 < 0) goto L21;
        if (h12.c(r16, r111) == true) goto L19;
        r12 = r12 + 1;
        goto L14
    L19:
        int r112 = r12;
    L24:
        if (r112 >= 0) goto L28;
        if (h12.c(r14.s, r8.s) == true) goto L10;
    L28:
        r10.add(r13);
        goto L10
    L21:
        gb.c0();
        throw null;
    L23:
        r112 = -1;
        goto L24
    L29:
        int r20 = r10.size();
        int r113 = 0;
    L30:
        if (r113 >= r20) goto L32;
        Object r114 = r10.get(r113);
        r113 = r113 + 1;
        k(this, ((a23) r114).s, 4);
        goto L30
    L32:
        if (r19 == false) goto L40;
        Iterator r21 = q40.H0(r7).iterator();
    L35:
        if (r21.hasNext() == false) goto L42;
        a23 r22 = (a23) r21.next();
        if (h12.c(r22, r8) == true) goto L38;
        r3.w(new kd1(r3, r22.s, r9), false);
        this.f.add(r22.s);
        goto L35
    L38:
        Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + r22);
    L42:
        if (n() == false) goto L44;
        Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + r18 + " with savedState " + r19);
    L44:
        b().f(r18, r19);
        return;
    L40:
        r3.w(new jd1(r3, r18.s, -1), false);
        goto L42
    }

    public final void l(kc1 r6, a23 r7, d23 r8) {
        r6.getClass();
        e75 r0 = r6.d();
        LinkedHashMap r1 = new LinkedHashMap();
        i30 r3 = kx3.a(a.class);
        if (r1.containsKey(r3) == true) goto L10;
        r1.put(r3, new z65(r3));
        Collection r2 = r1.values();
        r2.getClass();
        z65[] r4 = (z65[]) r2.toArray(new z65[0]);
        zy1 r5 = new zy1((z65[]) Arrays.copyOf(r4, r4.length));
        sf0 r9 = sf0.b;
        r9.getClass();
        bq4 r10 = new bq4(r0, r5, r9);
        i30 r11 = kx3.a(a.class);
        String r12 = r11.b();
        if (r12 == null) goto L8;
        a r13 = (a) r10.l(r11, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r12));
        r13.b = new WeakReference(new gp(r7, r8, this, r6));
        return;
    L8:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return;
    L10:
        kf2.e(xa3.h("A `initializer` with the same `clazz` has already been added: ", r3.b(), "."));
    }

    public final po m(a23 r8, y23 r9) {
        r23 r0 = r8.o;
        r0.getClass();
        Bundle r1 = r8.c();
        String r2 = ((sd1) r0).x;
        if (r2 == null) goto L38;
        int r3 = 0;
        char r4 = r2.charAt(0);
        Context r5 = this.c;
        if (r4 != '.') goto L7;
        r2 = r5.getPackageName() + r2;
    L7:
        ld1 r6 = this.d;
        dd1 r7 = r6.F();
        r5.getClassLoader();
        kc1 r10 = r7.a(r2);
        r10.getClass();
        r10.c0(r1);
        po r11 = new po(r6);
        if (r9 == null) goto L10;
        int r12 = r9.f;
    L11:
        if (r9 == null) goto L13;
        int r13 = r9.g;
    L14:
        if (r9 == null) goto L16;
        int r14 = r9.h;
    L17:
        if (r9 == null) goto L19;
        int r15 = r9.i;
    L20:
        if (r12 != (-1)) goto L24;
        if (r13 != (-1)) goto L24;
        if (r14 != (-1)) goto L24;
        if (r15 != (-1)) goto L24;
    L36:
        r11.j(this.e, r10, r8.s);
        r11.l(r10);
        r11.p = true;
        return r11;
    L24:
        if (r12 != (-1)) goto L27;
        r12 = 0;
    L27:
        if (r13 != (-1)) goto L30;
        r13 = 0;
    L30:
        if (r14 != (-1)) goto L33;
        r14 = 0;
    L33:
        if (r15 == (-1)) goto L35;
        r3 = r15;
    L35:
        r11.b = r12;
        r11.c = r13;
        r11.d = r14;
        r11.e = r3;
        goto L36
    L19:
        r15 = -1;
        goto L20
    L16:
        r14 = -1;
        goto L17
    L13:
        r13 = -1;
        goto L14
    L10:
        r12 = -1;
        goto L11
    L38:
        kf2.o("Fragment class was not set");
        return null;
    }
}
