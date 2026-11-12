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

    public v23(Context r4) {
        this.a = r4;
        Iterator r5 = fa4.c0(k5.s, r4).iterator();
    L4:
        if (r5.hasNext() == false) goto L8;
        Object r0 = r5.next();
        if ((((Context) r0) instanceof Activity) == false) goto L4;
    L9:
        this.b = (Activity) r0;
        this.g = new ii();
        u01 r6 = u01.n;
        this.h = ya4.a(r6);
        this.i = ya4.a(r6);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new CopyOnWriteArrayList();
        this.q = r92.o;
        this.r = new pd1(1, this);
        this.s = new bd1(5, this);
        this.t = true;
        u43 r7 = new u43();
        this.u = r7;
        this.v = new LinkedHashMap();
        this.y = new LinkedHashMap();
        r7.a(new u23(r7));
        r7.a(new l5(this.a));
        this.A = new ArrayList();
        this.B = new rp4(new zf0(3, this));
        this.C = g12.a(1, 0, wv.o);
        return;
    L8:
        r0 = null;
        goto L9
    }

    public static r23 e(int r2, r23 r3, r23 r4, boolean r5) {
        if (r3.u != r2) goto L11;
        if (r4 != null) goto L6;
    L9:
        return r3;
    L6:
        if (r3.equals(r4) == false) goto L11;
        if (h12.c(r3.o, r4.o) == true) goto L9;
    L11:
        if ((r3 instanceof t23) == false) goto L13;
        t23 r6 = (t23) r3;
    L15:
        return r6.h(r2, r6, r4, r5);
    L13:
        t23 r7 = r3.o;
        r7.getClass();
        r6 = r7;
        goto L15
    }

    public static /* synthetic */ void s(v23 r2, a23 r3) {
        r2.r(r3, false, new ii());
    }

    public final void a(r23 r17, Bundle r18, a23 r19, List r20) {
        r23 r5 = r19.o;
        boolean r6 = r5 instanceof rp0;
        ii r9 = this.g;
        if (r6 == false) goto L5;
    L10:
        ii r7 = new ii();
        boolean r10 = r17 instanceof t23;
        Context r11 = this.a;
        Object r12 = null;
        if (r10 == false) goto L33;
        r23 r13 = r5;
    L13:
        r13.getClass();
        r13 = r13.o;
        if (r13 == null) goto L30;
        ListIterator r14 = r20.listIterator(r20.size());
    L17:
        if (r14.hasPrevious() == false) goto L21;
        Object r15 = r14.previous();
        if (h12.c(((a23) r15).o, r13) == false) goto L17;
    L22:
        a23 r16 = (a23) r15;
        if (r16 != null) goto L25;
        r16 = tv1.v(r11, r13, r18, j(), this.o);
    L25:
        r7.addFirst(r16);
        if (r9.isEmpty() == true) goto L30;
        if (((a23) r9.last()).o != r13) goto L30;
        s(this, (a23) r9.last());
        goto L30
    L21:
        r15 = null;
    L30:
        if (r13 == null) goto L33;
        if (r13 != r17) goto L13;
    L33:
        if (r7.isEmpty() == false) goto L35;
        r23 r110 = r5;
    L36:
        if (r110 == null) goto L60;
        if (d(r110.u, r110) == r110) goto L60;
        r110 = r110.o;
        if (r110 == null) goto L36;
        if (r18 != null) goto L43;
    L45:
        Bundle r111 = r18;
    L46:
        ListIterator r112 = r20.listIterator(r20.size());
    L48:
        if (r112.hasPrevious() == false) goto L53;
        Object r113 = r112.previous();
        if (h12.c(((a23) r113).o, r110) == false) goto L48;
    L54:
        a23 r114 = (a23) r113;
        if (r114 != null) goto L57;
        r114 = tv1.v(r11, r110, r110.a(r111), j(), this.o);
    L57:
        r7.addFirst(r114);
        goto L36
    L53:
        r113 = null;
        goto L54
    L43:
        if (r18.isEmpty() != true) goto L45;
        r111 = null;
    L60:
        if (r7.isEmpty() == true) goto L64;
        r5 = ((a23) r7.first()).o;
    L64:
        if (r9.isEmpty() == true) goto L71;
        if ((((a23) r9.last()).o instanceof t23) == false) goto L71;
        r23 r8 = ((a23) r9.last()).o;
        r8.getClass();
        if (((t23) r8).x.b(r5.u) != null) goto L71;
        s(this, (a23) r9.last());
    L71:
        if (r9.isEmpty() == false) goto L73;
        Object r21 = null;
    L74:
        a23 r22 = (a23) r21;
        if (r22 == null) goto L77;
    L81:
        if (r22 == null) goto L83;
        r23 r23 = r22.o;
    L85:
        if (h12.c(r23, this.c) == true) goto L96;
        ListIterator r4 = r20.listIterator(r20.size());
    L88:
        if (r4.hasPrevious() == false) goto L92;
        Object r24 = r4.previous();
        r23 r25 = ((a23) r24).o;
        t23 r26 = this.c;
        r26.getClass();
        if (h12.c(r25, r26) == false) goto L88;
        r12 = r24;
    L92:
        a23 r115 = (a23) r12;
        if (r115 != null) goto L95;
        t23 r27 = this.c;
        r27.getClass();
        t23 r28 = this.c;
        r28.getClass();
        r115 = tv1.v(r11, r27, r28.a(r18), j(), this.o);
    L95:
        r7.addFirst(r115);
    L96:
        Iterator r2 = r7.iterator();
    L98:
        if (r2.hasNext() == false) goto L104;
        a23 r29 = (a23) r2.next();
        Object r30 = this.v.get(this.u.b(r29.o.n));
        if (r30 == null) goto L102;
        ((d23) r30).a(r29);
        goto L98
    L102:
        nz2.f(b11.q(new StringBuilder("NavigatorBackStack for "), r17.n, " should already be created"));
        return;
    L104:
        r9.addAll(r7);
        r9.addLast(r19);
        ArrayList r1 = q40.F0(r19, r7);
        int r3 = r1.size();
        int r31 = 0;
    L105:
        if (r31 >= r3) goto L109;
        Object r32 = r1.get(r31);
        r31 = r31 + 1;
        a23 r33 = (a23) r32;
        t23 r34 = r33.o.o;
        if (r34 == null) goto L105;
        l(r33, f(r34.u));
        goto L105
    L109:
        return;
    L83:
        r23 = null;
        goto L85
    L77:
        if (r7.isEmpty() == false) goto L79;
        Object r35 = null;
    L80:
        r22 = (a23) r35;
        goto L81
    L79:
        r35 = r7.o[r7.n];
        goto L80
    L73:
        r21 = r9.o[r9.n];
        goto L74
    L35:
        r110 = ((a23) r7.first()).o;
    L5:
        if (r9.isEmpty() == true) goto L10;
        if ((((a23) r9.last()).o instanceof rp0) == false) goto L10;
        if (q(((a23) r9.last()).o.u, true, false) == true) goto L5;
        goto L10
    }

    public final void b(e23 r3) {
        this.p.add(r3);
        ii r0 = this.g;
        if (r0.isEmpty() == true) goto L6;
        a23 r1 = (a23) r0.last();
        r23 r2 = r1.o;
        r1.c();
        r3.a(this, r2);
        return;
    }

    public final boolean c() {
    L2:
        ii r0 = this.g;
        if (r0.isEmpty() == true) goto L7;
        if ((((a23) r0.last()).o instanceof t23) == false) goto L7;
        s(this, (a23) r0.last());
    L7:
        a23 r1 = (a23) r0.g();
        ArrayList r2 = this.A;
        if (r1 == null) goto L10;
        r2.add(r1);
    L10:
        this.z++;
        x();
        int r3 = this.z - 1;
        this.z = r3;
        if (r3 != 0) goto L20;
        ArrayList r4 = q40.R0(r2);
        r2.clear();
        int r5 = r4.size();
        int r6 = 0;
    L13:
        if (r6 >= r5) goto L19;
        Object r7 = r4.get(r6);
        r6 = r6 + 1;
        a23 r8 = (a23) r7;
        Iterator r9 = this.p.iterator();
    L16:
        if (r9.hasNext() == false) goto L18;
        e23 r10 = (e23) r9.next();
        r23 r11 = r8.o;
        r8.c();
        r10.a(this, r11);
        goto L16
    L18:
        this.C.q(r8);
        goto L13
    L19:
        ArrayList r12 = new ArrayList(r0);
        nl4 r13 = this.h;
        r13.getClass();
        r13.j(null, r12);
        ArrayList r14 = t();
        nl4 r15 = this.i;
        r15.getClass();
        r15.j(null, r14);
    L20:
        if (r1 == null) goto L22;
        return true;
    L22:
        return false;
    }

    public final r23 d(int r3, r23 r4) {
        t23 r0 = this.c;
        if (r0 != null) goto L7;
        return null;
    L7:
        if (r0.u != r3) goto L16;
        if (r4 != null) goto L10;
        return r0;
    L10:
        if (h12.c(r0, r4) == false) goto L16;
        if (r4.o != null) goto L16;
        return this.c;
    L16:
        a23 r1 = (a23) this.g.g();
        if (r1 == null) goto L20;
        r23 r2 = r1.o;
        if (r2 == null) goto L20;
    L22:
        return e(r3, r2, r4, false);
    L20:
        r2 = this.c;
        r2.getClass();
        goto L22
    }

    public final a23 f(int r4) {
        ii r0 = this.g;
        ListIterator<E> r1 = r0.listIterator(r0.size());
    L4:
        if (r1.hasPrevious() == false) goto L8;
        Object r2 = r1.previous();
        if (((a23) r2).o.u != r4) goto L4;
    L9:
        a23 r3 = (a23) r2;
        if (r3 == null) goto L12;
        return r3;
    L12:
        StringBuilder r5 = f34.j(r4, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        r5.append(g());
        throw new IllegalArgumentException(r5.toString().toString());
    L8:
        r2 = null;
        goto L9
    }

    public final r23 g() {
        a23 r0 = (a23) this.g.g();
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.o;
    }

    public final int h() {
        int r0 = 0;
        ii r2 = this.g;
        if (r2 != null) goto L5;
    L7:
        Iterator r3 = r2.iterator();
    L9:
        if (r3.hasNext() == false) goto L17;
        if ((((a23) r3.next()).o instanceof t23) == true) goto L9;
        r0 = r0 + 1;
        if (r0 >= 0) goto L9;
        throw new ArithmeticException("Count overflow has happened.");
    L17:
        return r0;
    L5:
        if (r2.isEmpty() == false) goto L7;
        return 0;
    }

    public final t23 i() {
        t23 r0 = this.c;
        if (r0 == null) goto L6;
        r0.getClass();
        return r0;
    L6:
        kf2.o("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final r92 j() {
        if (this.n != null) goto L7;
        return r92.p;
    L7:
        return this.q;
    }

    public final t23 k(ii r1) {
        a23 r2 = (a23) r1.g();
        if (r2 == null) goto L6;
        r23 r3 = r2.o;
        if (r3 == null) goto L6;
    L8:
        if ((r3 instanceof t23) == true) goto L10;
        t23 r0 = r3.o;
        r0.getClass();
        return r0;
    L10:
        return (t23) r3;
    L6:
        r3 = this.c;
        r3.getClass();
        goto L8
    }

    public final void l(a23 r2, a23 r3) {
        this.j.put(r2, r3);
        LinkedHashMap r1 = this.k;
        if (r1.get(r3) != null) goto L5;
        r1.put(r3, new AtomicInteger(0));
    L5:
        Object r4 = r1.get(r3);
        r4.getClass();
        ((AtomicInteger) r4).incrementAndGet();
    }

    public final void m(int r8, Bundle r9, y23 r10) {
        ii r0 = this.g;
        if (r0.isEmpty() == false) goto L5;
        r23 r1 = this.c;
    L6:
        if (r1 == null) goto L42;
        y13 r2 = r1.d(r8);
        if (r2 == null) goto L15;
        if (r10 != null) goto L11;
        r10 = r2.b;
    L11:
        int r3 = r2.a;
        Bundle r4 = r2.c;
        if (r4 == null) goto L14;
        Bundle r5 = new Bundle();
        r5.putAll(r4);
    L16:
        if (r9 == null) goto L20;
        if (r5 != null) goto L19;
        r5 = new Bundle();
    L19:
        r5.putAll(r9);
    L20:
        if (r3 != 0) goto L28;
        if (r10 == null) goto L28;
        boolean r11 = r10.d;
        int r6 = r10.c;
        if (r6 == (-1)) goto L28;
        if (r6 == (-1)) goto L43;
        p(r6, r11);
        return;
    L43:
        return;
    L28:
        if (r3 == 0) goto L39;
        r23 r12 = d(r3, null);
        if (r12 != null) goto L37;
        int r13 = r23.w;
        Context r7 = this.a;
        String r14 = ya4.v(r7, r3);
        if (r2 != null) goto L35;
        tb4.h("Navigation action/destination ", r14, " cannot be found from the current destination ", r1);
        return;
    L35:
        StringBuilder r15 = xa3.j("Navigation destination ", r14, " referenced from action ");
        r15.append(ya4.v(r7, r8));
        r15.append(" cannot be found from the current destination ");
        r15.append(r1);
        throw new IllegalArgumentException(r15.toString().toString());
    L37:
        n(r12, r5, r10);
        return;
    L39:
        kf2.n("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        return;
    L14:
        r5 = null;
        goto L16
    L15:
        r3 = r8;
        goto L14
    L42:
        throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
    L5:
        r1 = ((a23) r0.last()).o;
        goto L6
    }

    public final void n(r23 r24, Bundle r25, y23 r26) {
        LinkedHashMap r3 = this.v;
        Iterator r4 = r3.values().iterator();
    L3:
        int r6 = 1;
        if (r4.hasNext() == false) goto L6;
        ((d23) r4.next()).d = true;
        goto L3
    L6:
        fx3 r5 = new fx3();
        if (r26 == null) goto L11;
        boolean r8 = r26.e;
        boolean r9 = r26.d;
        int r10 = r26.c;
        if (r10 == (-1)) goto L11;
        boolean r11 = q(r10, r9, r8);
    L12:
        Bundle r12 = r24.a(r25);
        if (r26 != null) goto L15;
    L19:
        u43 r13 = this.u;
        if (r26 != null) goto L22;
    L65:
        LinkedHashMap r22 = r3;
        boolean r7 = false;
    L66:
        if (r7 == true) goto L68;
        a23 r14 = tv1.v(this.a, r24, r12, j(), this.o);
        t43 r15 = r13.b(r24.n);
        List r16 = gb.O(r14);
        this.w = new i23(r5, this, r24, r12);
        r15.d(r16, r26);
        this.w = null;
    L68:
        y();
        Iterator r1 = r22.values().iterator();
    L70:
        if (r1.hasNext() == false) goto L72;
        ((d23) r1.next()).d = false;
        goto L70
    L72:
        if (r11 == false) goto L74;
    L79:
        c();
        return;
    L74:
        if (r5.n == true) goto L79;
        if (r7 == true) goto L79;
        x();
        return;
    L22:
        if (r26.a != true) goto L65;
        ii r17 = this.g;
        a23 r18 = (a23) r17.g();
        ListIterator r19 = r17.listIterator(r17.a());
    L25:
        if (r19.hasPrevious() == false) goto L29;
        if (((a23) r19.previous()).o != r24) goto L25;
        int r110 = r19.nextIndex();
    L30:
        if (r110 == (-1)) goto L65;
        if ((r24 instanceof t23) == false) goto L44;
        int r20 = t23.A;
        List r21 = fa4.f0(new tq4(fa4.c0(k5.z, (t23) r24), k5.v, 1));
        if ((r17.p - r110) != r21.size()) goto L65;
        List r111 = r17.subList(r110, r17.p);
        ArrayList r112 = new ArrayList(r40.k0(r111, 10));
        Iterator r113 = r111.iterator();
    L39:
        if (r113.hasNext() == false) goto L42;
        r112.add(Integer.valueOf(((a23) r113.next()).o.u));
        goto L39
    L42:
        if (r112.equals(r21) == false) goto L65;
    L49:
        ii r23 = new ii();
    L51:
        if ((r17.size() - r6) < r110) goto L53;
        a23 r114 = (a23) v40.q0(r17);
        w(r114);
        LinkedHashMap r27 = r3;
        a23 r115 = new a23(r114.n, r114.o, r114.o.a(r25), r114.q, r114.r, r114.s, r114.t);
        r115.q = r114.q;
        r92 r28 = r114.x;
        r28.getClass();
        r115.x = r28;
        r115.e();
        r23.addFirst(r115);
        r3 = r27;
        r6 = 1;
        goto L51
    L53:
        r22 = r3;
        Iterator r29 = r23.iterator();
    L55:
        if (r29.hasNext() == false) goto L60;
        a23 r30 = (a23) r29.next();
        t23 r31 = r30.o.o;
        if (r31 == null) goto L59;
        l(r30, f(r31.u));
    L59:
        r17.addLast(r30);
        goto L55
    L60:
        Iterator r32 = r23.iterator();
    L62:
        if (r32.hasNext() == false) goto L64;
        a23 r33 = (a23) r32.next();
        r13.b(r33.o.n).f(r33);
        goto L62
    L64:
        r7 = true;
        goto L66
    L44:
        if (r18 == null) goto L65;
        r23 r34 = r18.o;
        if (r34 == null) goto L65;
        if (r24.u != r34.u) goto L65;
    L29:
        r110 = -1;
        goto L30
    L15:
        if (r26.b != true) goto L19;
        if (this.l.containsKey(Integer.valueOf(r24.u)) == false) goto L19;
        r5.n = u(r24.u, r12, r26);
        r22 = r3;
        r7 = false;
    L11:
        r11 = false;
        goto L12
    }

    public final void o() {
        int r0 = h();
        ii r1 = this.g;
        if (r0 != 1) goto L80;
        Activity r2 = this.b;
        if (r2 == null) goto L9;
        Intent r4 = r2.getIntent();
        if (r4 == null) goto L9;
        Bundle r5 = r4.getExtras();
    L11:
        if (r5 == null) goto L13;
        int[] r6 = r5.getIntArray("android-support-nav:controller:deepLinkIds");
    L15:
        if (r6 != null) goto L17;
        r23 r7 = g();
        r7.getClass();
        int r8 = r7.u;
        t23 r9 = r7.o;
    L55:
        if (r9 == null) goto L95;
        if (r9.y != r8) goto L58;
        r8 = r9.u;
        r9 = r9.o;
        goto L55
    L58:
        Bundle r10 = new Bundle();
        if (r2 != null) goto L61;
    L70:
        na4 r3 = new na4(this);
        int r12 = r9.u;
        ArrayList r11 = (ArrayList) r3.q;
        r11.clear();
        r11.add(new o23(r12, null));
        if (((t23) r3.p) == null) goto L73;
        r3.S();
    L73:
        ((Intent) r3.o).putExtra("android-support-nav:controller:deepLinkExtras", r10);
        r3.k().b();
        if (r2 == null) goto L92;
        r2.finish();
        return;
    L92:
        return;
    L61:
        if (r2.getIntent() == null) goto L70;
        if (r2.getIntent().getData() == null) goto L70;
        r10.putParcelable("android-support-nav:controller:deepLinkIntent", r2.getIntent());
        t23 r13 = k(r1);
        Intent r14 = r2.getIntent();
        r14.getClass();
        p23 r15 = r13.i(new ik(r14), true, r13);
        if (r15 == null) goto L67;
        Bundle r16 = r15.o;
    L68:
        if (r16 == null) goto L70;
        r10.putAll(r15.n.a(r15.o));
        goto L70
    L67:
        r16 = null;
        goto L68
    L95:
        return;
    L17:
        if (this.f == false) goto L93;
        r2.getClass();
        Intent r17 = r2.getIntent();
        Bundle r18 = r17.getExtras();
        r18.getClass();
        int[] r19 = r18.getIntArray("android-support-nav:controller:deepLinkIds");
        r19.getClass();
        ArrayList r20 = new ArrayList(r19.length);
        int r21 = r19.length;
        int r22 = 0;
        int r110 = 0;
    L20:
        if (r110 >= r21) goto L22;
        r20.add(Integer.valueOf(r19[r110]));
        r110 = r110 + 1;
        goto L20
    L22:
        ArrayList r23 = r18.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        int r24 = ((Number) v40.q0(r20)).intValue();
        if (r23 == null) goto L26;
        Bundle r111 = (Bundle) v40.q0(r23);
    L26:
        if (r20.isEmpty() == true) goto L94;
        r23 r112 = e(r24, i(), null, false);
        if ((r112 instanceof t23) == false) goto L31;
        int r25 = t23.A;
        r24 = jz4.s((t23) r112).u;
    L31:
        r23 r113 = g();
        if (r113 != null) goto L34;
        return;
    L34:
        if (r24 != r113.u) goto L91;
        na4 r26 = new na4(this);
        Bundle r114 = fh0.g(new kd3[]{new kd3("android-support-nav:controller:deepLinkIntent", r17)});
        Bundle r27 = r18.getBundle("android-support-nav:controller:deepLinkExtras");
        if (r27 == null) goto L38;
        r114.putAll(r27);
    L38:
        ((Intent) r26.o).putExtra("android-support-nav:controller:deepLinkExtras", r114);
        int r115 = r20.size();
        int r28 = 0;
    L39:
        if (r28 >= r115) goto L52;
        Object r29 = r20.get(r28);
        r28 = r28 + 1;
        int r30 = r22 + 1;
        if (r22 < 0) goto L50;
        int r31 = ((Number) r29).intValue();
        if (r23 == null) goto L45;
        Bundle r32 = (Bundle) r23.get(r22);
    L46:
        ((ArrayList) r26.q).add(new o23(r31, r32));
        if (((t23) r26.p) == null) goto L49;
        r26.S();
    L49:
        r22 = r30;
        goto L39
    L45:
        r32 = null;
        goto L46
    L50:
        gb.c0();
        throw null;
    L52:
        r26.k().b();
        r2.finish();
        return;
    L91:
        return;
    L94:
        return;
    L93:
        return;
    L13:
        r6 = null;
    L9:
        r5 = null;
        goto L11
    L80:
        if (r1.isEmpty() == false) goto L82;
        return;
    L82:
        r23 r33 = g();
        r33.getClass();
        p(r33.u, true);
    }

    public final boolean p(int r2, boolean r3) {
        if (q(r2, r3, false) == true) goto L5;
    L8:
        return false;
    L5:
        if (c() == false) goto L8;
        return true;
    }

    public final boolean q(int r16, boolean r17, boolean r18) {
        ii r6 = this.g;
        int r7 = 0;
        if (r6.isEmpty() == false) goto L5;
        return false;
    L5:
        ArrayList r8 = new ArrayList();
        Iterator r1 = q40.H0(r6).iterator();
    L7:
        if (r1.hasNext() == false) goto L16;
        r23 r2 = ((a23) r1.next()).o;
        t43 r3 = this.u.b(r2.n);
        if (r17 == false) goto L11;
    L12:
        r8.add(r3);
    L14:
        if (r2.u != r16) goto L7;
        r23 r10 = r2;
    L17:
        if (r10 != null) goto L20;
        int r4 = r23.w;
        Log.i("NavController", "Ignoring popBackStack to destination " + ya4.v(this.a, r16) + " as it was not found on the current back stack");
        return false;
    L20:
        fx3 r5 = new fx3();
        ii r9 = new ii();
        int r11 = r8.size();
        int r0 = 0;
    L21:
        if (r0 >= r11) goto L26;
        int r12 = r0 + 1;
        t43 r13 = (t43) r8.get(r0);
        fx3 r14 = new fx3();
        a23 r15 = (a23) r6.last();
        boolean r19 = r18;
        this.x = new f23(r14, r5, this, r19, r9);
        r13.i(r15, r19);
        this.x = null;
        if (r14.n == false) goto L27;
        r0 = r12;
    L27:
        if (r19 == false) goto L51;
        LinkedHashMap r20 = this.l;
        if (r17 == true) goto L43;
        g71 r21 = new g71(new tq4(fa4.c0(k5.t, r10), new g23(this, r7), 0));
    L32:
        if (r21.hasNext() == false) goto L43;
        Integer r22 = Integer.valueOf(((r23) r21.next()).u);
        if (r9.isEmpty() == false) goto L36;
        Object r23 = null;
    L37:
        c23 r24 = (c23) r23;
        if (r24 == null) goto L40;
        String r25 = r24.n;
    L41:
        r20.put(r22, r25);
        goto L32
    L40:
        r25 = null;
        goto L41
    L36:
        r23 = r9.o[r9.n];
    L43:
        if (r9.isEmpty() == true) goto L51;
        c23 r26 = (c23) r9.first();
        int r27 = r26.o;
        String r28 = r26.n;
        g71 r29 = new g71(new tq4(fa4.c0(k5.u, d(r27, null)), new g23(this, 1), 0));
    L46:
        if (r29.hasNext() == false) goto L49;
        r20.put(Integer.valueOf(((r23) r29.next()).u), r28);
        goto L46
    L49:
        if (r20.values().contains(r28) == false) goto L51;
        this.m.put(r28, r9);
    L51:
        y();
        return r5.n;
    L26:
        r19 = r18;
        goto L27
    L11:
        if (r2.u == r16) goto L14;
    L16:
        r10 = null;
        goto L17
    }

    public final void r(a23 r4, boolean r5, ii r6) {
        ii r0 = this.g;
        a23 r1 = (a23) r0.last();
        if (h12.c(r1, r4) == false) goto L32;
        v40.q0(r0);
        String r7 = r1.o.n;
        t43 r8 = this.u.b(r7);
        d23 r9 = (d23) this.v.get(r8);
        boolean r2 = true;
        if (r9 == null) goto L14;
        vu3 r10 = r9.f;
        if (r10 == null) goto L14;
        Set r11 = (Set) r10.n.getValue();
        if (r11 == null) goto L14;
        if (r11.contains(r1) != true) goto L14;
    L17:
        r92 r12 = r1.u.h;
        r92 r3 = r92.p;
        if (r12.compareTo(r3) < 0) goto L24;
        if (r5 == false) goto L21;
        r1.x = r3;
        r1.e();
        r6.addFirst(new c23(r1));
    L21:
        if (r2 == true) goto L23;
        r1.x = r92.n;
        r1.e();
        w(r1);
        goto L24
    L23:
        r1.x = r3;
        r1.e();
    L24:
        if (r5 == true) goto L34;
        if (r2 == true) goto L35;
        j23 r13 = this.o;
        if (r13 == null) goto L36;
        String r14 = r1.s;
        r14.getClass();
        e75 r15 = (e75) r13.b.remove(r14);
        if (r15 == null) goto L37;
        r15.a();
        return;
    L37:
        return;
    L36:
        return;
    L35:
        return;
    L34:
        return;
    L14:
        if (this.k.containsKey(r1) == true) goto L17;
        r2 = false;
        goto L17
    L32:
        StringBuilder r16 = new StringBuilder("Attempted to pop ");
        r16.append(r4.o);
        r23 r17 = r1.o;
        r16.append(", which is not the top of the back stack (");
        r16.append(r17);
        r16.append(')');
        throw new IllegalStateException(r16.toString().toString());
    }

    public final ArrayList t() {
        ArrayList r0 = new ArrayList();
        Iterator r1 = this.v.values().iterator();
    L3:
        boolean r2 = r1.hasNext();
        r92 r3 = r92.q;
        if (r2 == false) goto L15;
        Iterable r4 = (Iterable) ((d23) r1.next()).f.n.getValue();
        ArrayList r5 = new ArrayList();
        Iterator r6 = r4.iterator();
    L7:
        if (r6.hasNext() == false) goto L14;
        Object r7 = r6.next();
        a23 r8 = (a23) r7;
        if (r0.contains(r8) == true) goto L7;
        if (r8.x.compareTo(r3) >= 0) goto L7;
        r5.add(r7);
        goto L7
    L14:
        v40.n0(r5, r0);
        goto L3
    L15:
        ArrayList r9 = new ArrayList();
        Iterator r10 = this.g.iterator();
    L17:
        if (r10.hasNext() == false) goto L23;
        Object r11 = r10.next();
        a23 r12 = (a23) r11;
        if (r0.contains(r12) == true) goto L17;
        if (r12.x.compareTo(r3) < 0) goto L17;
        r9.add(r11);
        goto L17
    L23:
        v40.n0(r9, r0);
        ArrayList r13 = new ArrayList();
        int r14 = r0.size();
        int r15 = 0;
    L24:
        if (r15 >= r14) goto L28;
        Object r16 = r0.get(r15);
        r15 = r15 + 1;
        if ((((a23) r16).o instanceof t23) == true) goto L24;
        r13.add(r16);
        goto L24
    L28:
        return r13;
    }

    public final boolean u(int r12, Bundle r13, y23 r14) {
        Integer r0 = Integer.valueOf(r12);
        LinkedHashMap r1 = this.l;
        int r2 = 0;
        if (r1.containsKey(r0) == true) goto L5;
        return false;
    L5:
        String r15 = (String) r1.get(Integer.valueOf(r12));
        Collection r3 = r1.values();
        td1 r4 = new td1(1, r15);
        r3.getClass();
        v40.o0(r3, r4, true);
        ii r16 = (ii) jz4.f(this.m).remove(r15);
        ArrayList r6 = new ArrayList();
        a23 r5 = (a23) this.g.g();
        if (r5 == null) goto L9;
        r23 r7 = r5.o;
        if (r7 == null) goto L9;
    L11:
        if (r16 == null) goto L20;
        Iterator r17 = r16.iterator();
    L14:
        if (r17.hasNext() == false) goto L20;
        c23 r8 = (c23) r17.next();
        r23 r9 = e(r8.o, r7, null, true);
        Context r10 = this.a;
        if (r9 == null) goto L18;
        r6.add(r8.a(r10, r9, j(), this.o));
        r7 = r9;
        goto L14
    L18:
        int r11 = r23.w;
        nz2.o("Restore State failed: destination ", ya4.v(r10, r8.o), " cannot be found from the current destination ", r7);
        return false;
    L20:
        ArrayList r18 = new ArrayList();
        ArrayList r19 = new ArrayList();
        int r20 = r6.size();
        int r21 = 0;
    L21:
        if (r21 >= r20) goto L25;
        Object r22 = r6.get(r21);
        r21 = r21 + 1;
        if ((((a23) r22).o instanceof t23) == true) goto L21;
        r19.add(r22);
        goto L21
    L25:
        int r23 = r19.size();
        int r24 = 0;
    L26:
        if (r24 >= r23) goto L39;
        Object r25 = r19.get(r24);
        r24 = r24 + 1;
        a23 r26 = (a23) r25;
        List r27 = (List) q40.D0(r18);
        if (r27 == null) goto L34;
        a23 r28 = (a23) q40.C0(r27);
        if (r28 == null) goto L34;
        r23 r29 = r28.o;
        if (r29 == null) goto L34;
        String r30 = r29.n;
    L36:
        if (h12.c(r30, r26.o.n) == true) goto L37;
        r18.add(gb.Q(new a23[]{r26}));
        goto L26
    L37:
        r27.add(r26);
    L34:
        r30 = null;
        goto L36
    L39:
        fx3 r31 = new fx3();
        int r32 = r18.size();
    L40:
        if (r2 >= r32) goto L43;
        Object r33 = r18.get(r2);
        r2 = r2 + 1;
        List r34 = (List) r33;
        t43 r110 = this.u.b(((a23) q40.w0(r34)).o.n);
        this.w = new h23(r31, r6, new hx3(), this, r13);
        r110.d(r34, r14);
        this.w = null;
        goto L40
    L43:
        return r31.n;
    L9:
        r7 = i();
        goto L11
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
    public final void v(t23 r23, Bundle r24) {
        mj4 r2 = r23.x;
        ii r3 = this.g;
        if (r3.isEmpty() == false) goto L5;
    L9:
        t23 r5 = null;
        boolean r7 = false;
        int r8 = 0;
        if (h12.c(this.c, r23) == true) goto L187;
        t23 r4 = this.c;
        boolean r6 = false;
        LinkedHashMap r9 = this.v;
        boolean r10 = true;
        if (r4 == null) goto L27;
        ArrayList r11 = new ArrayList(this.l.keySet());
        int r12 = r11.size();
        int r13 = 0;
    L14:
        if (r13 >= r12) goto L26;
        int r16 = r13 + 1;
        Integer r14 = (Integer) r11.get(r13);
        r14.getClass();
        int r15 = r14.intValue();
        Iterator r17 = r9.values().iterator();
    L17:
        if (r17.hasNext() == false) goto L19;
        ((d23) r17.next()).d = true;
        goto L17
    L19:
        LinkedHashMap r18 = r9;
        ArrayList r19 = r11;
        int r20 = r12;
        boolean r21 = r6;
        ii r110 = r3;
        boolean r22 = u(r15, null, new y23(false, true, -1, false, false, -1, -1, -1, -1));
        Iterator r25 = r18.values().iterator();
    L21:
        if (r25.hasNext() == false) goto L23;
        ((d23) r25.next()).d = false;
        goto L21
    L23:
        if (r22 == false) goto L25;
        q(r15, true, false);
    L25:
        r6 = r21;
        r13 = r16;
        r3 = r110;
        r11 = r19;
        r12 = r20;
        r9 = r18;
        goto L14
    L26:
        ii r111 = r3;
        LinkedHashMap r26 = r9;
        q(r4.u, true, r6);
    L28:
        this.c = r23;
        Bundle r0 = this.d;
        u43 r27 = this.u;
        if (r0 == null) goto L37;
        ArrayList<String> r28 = r0.getStringArrayList("android-support-nav:controller:navigatorState:names");
        if (r28 == null) goto L37;
        int r29 = r28.size();
        int r30 = 0;
    L33:
        if (r30 >= r29) goto L37;
        String r112 = r28.get(r30);
        r30 = r30 + 1;
        String r113 = r112;
        r113.getClass();
        t43 r114 = r27.b(r113);
        Bundle r115 = r0.getBundle(r113);
        if (r115 == null) goto L33;
        r114.g(r115);
    L37:
        Parcelable[] r1 = this.e;
        Context r31 = this.a;
        if (r1 == null) goto L53;
        int r32 = r1.length;
        int r116 = 0;
    L40:
        if (r116 >= r32) goto L52;
        Parcelable r117 = r1[r116];
        r117.getClass();
        c23 r118 = (c23) r117;
        int r119 = r118.o;
        r23 r120 = d(r119, null);
        if (r120 == null) goto L50;
        a23 r121 = r118.a(r31, r120, j(), this.o);
        t43 r122 = r27.b(r120.n);
        LinkedHashMap r123 = r26;
        Object r124 = r123.get(r122);
        Object r125 = r124;
        if (r124 != null) goto L46;
        d23 r126 = new d23(this, r122);
        r123.put(r122, r126);
        r125 = r126;
    L46:
        ii r127 = r111;
        r127.addLast(r121);
        ((d23) r125).a(r121);
        t23 r128 = r121.o.o;
        if (r128 == null) goto L49;
        l(r121, f(r128.u));
    L49:
        r116 = r116 + 1;
        r26 = r123;
        r111 = r127;
        goto L40
    L50:
        int r33 = r23.w;
        nz2.m(g(), xa3.j("Restoring the Navigation back stack failed: destination ", ya4.v(r31, r119), " cannot be found from the current destination "));
        return;
    L52:
        ii r129 = r111;
        LinkedHashMap r130 = r26;
        y();
        this.e = null;
    L54:
        Collection r34 = lg2.a0(r27.a).values();
        ArrayList r35 = new ArrayList();
        Iterator r36 = r34.iterator();
    L56:
        if (r36.hasNext() == false) goto L60;
        Object r37 = r36.next();
        if (((t43) r37).b == true) goto L56;
        r35.add(r37);
        goto L56
    L60:
        int r38 = r35.size();
        int r39 = 0;
    L61:
        if (r39 >= r38) goto L67;
        Object r131 = r35.get(r39);
        r39 = r39 + 1;
        t43 r132 = (t43) r131;
        Object r133 = r130.get(r132);
        if (r133 != null) goto L65;
        r133 = new d23(this, r132);
        r130.put(r132, r133);
    L65:
        r132.e((d23) r133);
        goto L61
    L67:
        if (this.c != null) goto L69;
    L185:
        c();
        return;
    L69:
        if (r129.isEmpty() == false) goto L185;
        if (this.f == true) goto L184;
        Activity r40 = this.b;
        if (r40 == null) goto L184;
        Intent r41 = r40.getIntent();
        if (r41 == null) goto L184;
        Bundle r134 = r41.getExtras();
        if (r134 != null) goto L212;
    L83:
        int[] r42 = null;
    L84:
        if (r134 == null) goto L86;
        ArrayList r135 = r134.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
    L87:
        Bundle r136 = new Bundle();
        if (r134 == null) goto L90;
        Bundle r137 = r134.getBundle("android-support-nav:controller:deepLinkExtras");
    L91:
        if (r137 == null) goto L93;
        r136.putAll(r137);
    L93:
        if (r42 != null) goto L95;
    L96:
        t23 r138 = k(r129);
        p23 r139 = r138.i(new ik(r41), true, r138);
        if (r139 == null) goto L102;
        r23 r43 = r139.n;
        int[] r140 = r43.b(null);
        Bundle r44 = r43.a(r139.o);
        if (r44 == null) goto L101;
        r136.putAll(r44);
    L101:
        r42 = r140;
        r135 = null;
    L102:
        if (r42 == null) goto L184;
        if (r42.length == 0) goto L184;
        t23 r141 = this.c;
        int r142 = r42.length;
        ?? r210 = r141;
        int r143 = 0;
    L107:
        if (r143 >= r142) goto L128;
        boolean r144 = r10;
        int r45 = r42[r143];
        if (r143 != 0) goto L115;
        t23 r46 = this.c;
        r46.getClass();
        if (r46.u != r45) goto L113;
        t23 r47 = this.c;
    L114:
        r23 r48 = r47;
        ?? r49 = r210;
    L116:
        if (r48 == null) goto L117;
        if (r143 == (r42.length - 1)) goto L127;
        if ((r48 instanceof t23) == false) goto L127;
    L123:
        ?? r50 = (t23) r48;
        r50.getClass();
        if ((r50.h(r50.y, r50, null, false) instanceof t23) == false) goto L126;
        r48 = r50.h(r50.y, r50, null, false);
        goto L123
    L126:
        r49 = r50;
    L127:
        r143 = r143 + 1;
        r210 = r49;
        r10 = r144;
        r5 = null;
        goto L107
    L117:
        int r51 = r23.w;
        String r52 = ya4.v(r31, r45);
    L129:
        if (r52 == null) goto L131;
        Log.i("NavController", "Could not find destination " + r52 + " in the navigation graph, ignoring the deep link from " + r41);
        goto L184
    L131:
        r136.putParcelable("android-support-nav:controller:deepLinkIntent", r41);
        int r53 = r42.length;
        Bundle[] r54 = new Bundle[r53];
        int r55 = 0;
    L132:
        if (r55 >= r53) goto L139;
        Bundle r145 = new Bundle();
        r145.putAll(r136);
        if (r135 == null) goto L138;
        Bundle r146 = (Bundle) r135.get(r55);
        if (r146 == null) goto L138;
        r145.putAll(r146);
    L138:
        r54[r55] = r145;
        r55 = r55 + 1;
        goto L132
    L139:
        int r56 = r41.getFlags();
        int r57 = 268435456 & r56;
        if (r57 == 0) goto L150;
        if ((r56 & 32768) != 0) goto L150;
        r41.addFlags(32768);
        hr4 r58 = new hr4(r31);
        ComponentName r59 = r41.getComponent();
        if (r59 != null) goto L146;
        r59 = r41.resolveActivity(r58.o.getPackageManager());
    L146:
        if (r59 == null) goto L148;
        r58.a(r59);
    L148:
        r58.n.add(r41);
        r58.b();
        r40.finish();
        r40.overridePendingTransition(0, 0);
        return;
    L150:
        if (r57 != 0) goto L152;
        t23 r60 = this.c;
        int r61 = r42.length;
        int r62 = 0;
        ?? r63 = r60;
    L163:
        if (r62 >= r61) goto L183;
        int r64 = r42[r62];
        Bundle r147 = r54[r62];
        if (r62 != 0) goto L167;
        r23 r148 = this.c;
    L168:
        if (r148 == null) goto L181;
        if (r62 != (r42.length - 1)) goto L172;
        t23 r65 = this.c;
        r65.getClass();
        int r66 = r65.u;
        boolean r149 = r7 ? 1 : 0;
        Context r67 = r31;
        y23 r68 = new y23(false, false, r66, true, false, r149 ? 1 : 0, r149 ? 1 : 0, -1, -1);
        r7 = r149 ? 1 : 0;
        n(r148, r147, r68);
    L180:
        r62 = r62 + 1;
        r42 = r42;
        r31 = r67;
        r61 = r61;
        r54 = r54;
        r63 = r63;
        goto L163
    L172:
        if ((r148 instanceof t23) == true) goto L174;
        r67 = r31;
    L174:
        ?? r150 = (t23) r148;
        r150.getClass();
        if ((r150.h(r150.y, r150, null, r7) instanceof t23) == false) goto L177;
        r148 = r150.h(r150.y, r150, null, r7);
        goto L174
    L177:
        r67 = r31;
        r63 = r150;
        goto L180
    L181:
        int r69 = r23.w;
        throw new IllegalStateException("Deep Linking failed: destination " + ya4.v(r31, r64) + " cannot be found in graph " + r63);
    L167:
        r63.getClass();
        r148 = r63.h(r64, r63, null, r7);
        goto L168
    L183:
        this.f = true;
        return;
    L152:
        if (r129.isEmpty() == true) goto L155;
        t23 r70 = this.c;
        r70.getClass();
        q(r70.u, true, false);
    L155:
        if (r8 >= r42.length) goto L161;
        int r71 = r42[r8];
        int r72 = r8 + 1;
        Bundle r73 = r54[r8];
        r23 r151 = d(r71, null);
        if (r151 == null) goto L159;
        br0 r74 = new br0(1, r151, this);
        z23 r152 = new z23();
        r74.invoke(r152);
        x23 r75 = r152.a;
        r75.a = false;
        r75.b = false;
        int r153 = r152.b;
        boolean r154 = r152.c;
        r75.c = r153;
        r75.d = false;
        r75.e = r154;
        n(r151, r73, r75.a());
        r8 = r72;
        goto L155
    L159:
        int r76 = r23.w;
        nz2.m(g(), xa3.j("Deep Linking failed: destination ", ya4.v(r31, r71), " cannot be found from the current destination "));
        return;
    L161:
        this.f = r144;
        return;
    L113:
        r47 = r5;
        goto L114
    L115:
        r210.getClass();
        ?? r77 = r210;
        r48 = r77.h(r45, r77, r5, false);
        r49 = r77;
        goto L116
    L128:
        r144 = r10;
        r52 = null;
        goto L129
    L95:
        if (r42.length != 0) goto L102;
    L90:
        r137 = null;
        goto L91
    L86:
        r135 = null;
        goto L87
    L212:
        r42 = r134.getIntArray("android-support-nav:controller:deepLinkIds");     // Catch: Exception -> L81
    L81:
        e = move-exception;
        Log.e("NavController", "handleDeepLink() could not extract deepLink from " + r41, e);
    L184:
        t23 r78 = this.c;
        r78.getClass();
        n(r78, r24, null);
        return;
    L53:
        r129 = r111;
        r130 = r26;
        goto L54
    L27:
        r111 = r3;
        r26 = r9;
        goto L28
    L187:
        int r79 = r2.e();
        int r80 = 0;
    L188:
        if (r80 >= r79) goto L196;
        r23 r81 = (r23) r2.f(r80);
        t23 r82 = this.c;
        r82.getClass();
        int r83 = r82.x.c(r80);
        t23 r84 = this.c;
        r84.getClass();
        mj4 r85 = r84.x;
        if (r85.n == false) goto L192;
        su3.f(r85);
    L192:
        int r86 = su3.h(r85.q, r83, r85.o);
        if (r86 < 0) goto L195;
        Object[] r87 = r85.p;
        Object r88 = r87[r86];
        r87[r86] = r81;
    L195:
        r80 = r80 + 1;
        goto L188
    L196:
        Iterator r89 = r3.iterator();
    L198:
        if (r89.hasNext() == false) goto L269;
        a23 r90 = (a23) r89.next();
        int r91 = r23.w;
        r23 r92 = r90.o;
        r92.getClass();
        tg2 r93 = new tg2(fa4.f0(fa4.c0(k5.y, r92)));
        r23 r94 = this.c;
        r94.getClass();
        Iterator r95 = r93.iterator();
    L200:
        ListIterator r96 = (ListIterator) ((f24) r95).o;
        if (r96.hasPrevious() == false) goto L210;
        r23 r97 = (r23) r96.previous();
        if (h12.c(r97, this.c) == false) goto L208;
        if (r94.equals(r23) == true) goto L200;
    L208:
        if ((r94 instanceof t23) == false) goto L200;
        ?? r98 = (t23) r94;
        r94 = r98.h(r97.u, r98, null, false);
        r94.getClass();
        goto L200
    L210:
        r90.o = r94;
        goto L198
    L269:
        return;
    L5:
        if (j() != r92.n) goto L9;
        kf2.o("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
    }

    public final void w(a23 r4) {
        r4.getClass();
        a23 r5 = (a23) this.j.remove(r4);
        if (r5 == null) goto L19;
        LinkedHashMap r0 = this.k;
        AtomicInteger r1 = (AtomicInteger) r0.get(r5);
        if (r1 == null) goto L8;
        Integer r2 = Integer.valueOf(r1.decrementAndGet());
    L9:
        if (r2 != null) goto L12;
        return;
    L12:
        if (r2.intValue() != 0) goto L18;
        String r3 = r5.o.n;
        t43 r6 = this.u.b(r3);
        d23 r7 = (d23) this.v.get(r6);
        if (r7 == null) goto L16;
        r7.b(r5);
    L16:
        r0.remove(r5);
        return;
    L18:
        return;
    L8:
        r2 = null;
        goto L9
    }

    public final void x() {
        ArrayList r0 = q40.R0(this.g);
        if (r0.isEmpty() == true) goto L74;
        r23 r1 = ((a23) q40.C0(r0)).o;
        ArrayList r2 = new ArrayList();
        if ((r1 instanceof rp0) == false) goto L14;
        Iterator r3 = q40.H0(r0).iterator();
    L9:
        if (r3.hasNext() == false) goto L14;
        r23 r4 = ((a23) r3.next()).o;
        r2.add(r4);
        if ((r4 instanceof rp0) == true) goto L9;
        if ((r4 instanceof t23) == true) goto L9;
    L14:
        HashMap r5 = new HashMap();
        Iterator r6 = q40.H0(r0).iterator();
    L15:
        int r7 = 0;
        if (r6.hasNext() == false) goto L68;
        a23 r8 = (a23) r6.next();
        r92 r9 = r8.x;
        r23 r10 = r8.o;
        r92 r11 = r92.r;
        r92 r12 = r92.q;
        if (r1 == null) goto L50;
        if (r10.u != r1.u) goto L50;
        if (r9 == r11) goto L39;
        t43 r13 = this.u.b(r10.n);
        d23 r14 = (d23) this.v.get(r13);
        if (r14 == null) goto L29;
        vu3 r15 = r14.f;
        if (r15 == null) goto L29;
        Set r16 = (Set) r15.n.getValue();
        if (r16 == null) goto L29;
        Boolean r17 = Boolean.valueOf(r16.contains(r8));
    L31:
        if (h12.c(r17, Boolean.TRUE) == true) goto L38;
        AtomicInteger r18 = (AtomicInteger) this.k.get(r8);
        if (r18 != null) goto L35;
    L37:
        r5.put(r8, r11);
        goto L39
    L35:
        if (r18.get() != 0) goto L37;
    L38:
        r5.put(r8, r12);
    L29:
        r17 = null;
    L39:
        r23 r19 = (r23) q40.x0(r2);
        if (r19 != null) goto L42;
    L48:
        r1 = r1.o;
        goto L15
    L42:
        if (r19.u != r10.u) goto L48;
        if (r2.isEmpty() == true) goto L46;
        r2.remove(0);
        goto L48
    L46:
        kf2.m("List is empty.");
        return;
    L50:
        if (r2.isEmpty() == true) goto L67;
        if (r10.u != ((r23) q40.w0(r2)).u) goto L67;
        if (r2.isEmpty() == true) goto L65;
        r23 r20 = (r23) r2.remove(0);
        if (r9 != r11) goto L58;
        r8.x = r12;
        r8.e();
    L60:
        t23 r21 = r20.o;
        if (r21 == null) goto L15;
        if (r2.contains(r21) == true) goto L15;
        r2.add(r21);
        goto L15
    L58:
        if (r9 == r12) goto L60;
        r5.put(r8, r12);
        goto L60
    L65:
        kf2.m("List is empty.");
        return;
    L67:
        r8.x = r92.p;
        r8.e();
        goto L15
    L68:
        int r110 = r0.size();
    L69:
        if (r7 >= r110) goto L104;
        Object r22 = r0.get(r7);
        r7 = r7 + 1;
        a23 r23 = (a23) r22;
        r92 r24 = (r92) r5.get(r23);
        if (r24 != null) goto L72;
        r23.e();
        goto L69
    L72:
        r23.getClass();
        r23.x = r24;
        r23.e();
        goto L69
    L104:
        return;
    }

    public final void y() {
        if (this.t == false) goto L7;
        boolean r1 = true;
        if (h() <= 1) goto L7;
    L8:
        this.s.c(r1);
        return;
    L7:
        r1 = false;
        goto L8
    }
}
