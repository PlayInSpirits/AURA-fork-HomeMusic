package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ee1 extends dw3 {
    public final ea2 q;
    public final ld1 r;
    public final xe2 s;
    public final xe2 t;
    public final xe2 u;
    public de1 v;
    public final zh0 w;
    public boolean x;
    public boolean y;

    public ee1(ld1 r3, ea2 r4) {
        Object r1 = null;
        this.s = new xe2(r1);
        this.t = new xe2(r1);
        this.u = new xe2(r1);
        zh0 r0 = new zh0(26);
        r0.o = new CopyOnWriteArrayList();
        this.w = r0;
        this.x = false;
        this.y = false;
        this.r = r3;
        this.q = r4;
        o(true);
    }

    public static void p(View r2, FrameLayout r3) {
        if (r3.getChildCount() <= 1) goto L5;
        kf2.o("Design assumption violated.");
        return;
    L5:
        if (r2.getParent() != r3) goto L8;
        return;
    L8:
        if (r3.getChildCount() <= 0) goto L11;
        r3.removeAllViews();
    L11:
        if (r2.getParent() == null) goto L13;
        ((ViewGroup) r2.getParent()).removeView(r2);
    L13:
        r3.addView(r2);
    }

    @Override // defpackage.dw3
    public final long b(int r1) {
        return r1;
    }

    @Override // defpackage.dw3
    public final void f(RecyclerView r4) {
        if (this.v != null) goto L6;
        de1 r0 = new de1(this);
        this.v = r0;
        ViewPager2 r5 = de1.a(r4);
        r0.d = r5;
        q80 r1 = new q80(1, r0);
        r0.a = r1;
        ((ArrayList) r5.p.b).add(r1);
        ce1 r6 = new ce1(0, r0);
        r0.b = r6;
        this.n.registerObserver(r6);
        vv3 r7 = new vv3(5, r0);
        r0.c = r7;
        this.q.a(r7);
        return;
    L6:
        nz2.c();
    }

    @Override // defpackage.dw3
    public final void g(cx3 r9, int r10) {
        ke1 r11 = (ke1) r9;
        long r0 = r11.e;
        FrameLayout r2 = (FrameLayout) r11.a;
        int r3 = r2.getId();
        Long r4 = t(r3);
        xe2 r5 = this.u;
        if (r4 != null) goto L5;
    L7:
        r5.f(r0, Integer.valueOf(r3));
        long r1 = r10;
        xe2 r6 = this.s;
        if (r6.c(r1) >= 0) goto L18;
        kc1 r12 = r(r10);
        jc1 r7 = (jc1) this.t.b(r1);
        if (r12.F != null) goto L23;
        if (r7 == null) goto L16;
        Bundle r8 = r7.n;
        if (r8 == null) goto L16;
    L17:
        r12.o = r8;
        r6.f(r1, r12);
    L16:
        r8 = null;
        goto L17
    L23:
        kf2.o("Fragment already added");
        return;
    L18:
        WeakHashMap r13 = j65.a;
        if (r2.isAttachedToWindow() == false) goto L21;
        u(r11);
    L21:
        s();
        return;
    L5:
        if (r4.longValue() == r0) goto L7;
        v(r4.longValue());
        r5.g(r4.longValue());
        goto L7
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r1, int r2) {
        int r0 = ke1.u;
        FrameLayout r3 = new FrameLayout(r1.getContext());
        r3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap r4 = j65.a;
        r3.setId(View.generateViewId());
        r3.setSaveEnabled(false);
        return new ke1(r3);
    }

    @Override // defpackage.dw3
    public final void j(RecyclerView r4) {
        de1 r0 = this.v;
        r0.getClass();
        ViewPager2 r5 = de1.a(r4);
        q80 r1 = r0.a;
        ((ArrayList) r5.p.b).remove(r1);
        ee1 r6 = r0.f;
        ce1 r2 = r0.b;
        r6.n.unregisterObserver(r2);
        r6.q.f(r0.c);
        r0.d = null;
        this.v = null;
    }

    @Override // defpackage.dw3
    public final /* bridge */ /* synthetic */ boolean k(cx3 r1) {
        ke1 r2 = (ke1) r1;
        return true;
    }

    @Override // defpackage.dw3
    public final void l(cx3 r1) {
        u((ke1) r1);
        s();
    }

    @Override // defpackage.dw3
    public final void n(cx3 r3) {
        Long r4 = t(((FrameLayout) ((ke1) r3).a).getId());
        if (r4 == null) goto L6;
        v(r4.longValue());
        this.u.g(r4.longValue());
        return;
    }

    public final boolean q(long r3) {
        if (r3 >= 0) goto L5;
        return false;
    L5:
        if (r3 >= a()) goto L10;
        return true;
    L10:
        return false;
    }

    public abstract kc1 r(int r1);

    public final void s() {
        if (this.y == true) goto L5;
        return;
    L5:
        if (this.r.N() == true) goto L46;
        int r1 = 0;
        qi r0 = new qi(0);
        int r2 = 0;
    L8:
        xe2 r3 = this.s;
        int r4 = r3.h();
        xe2 r5 = this.u;
        if (r2 >= r4) goto L15;
        long r6 = r3.e(r2);
        if (q(r6) == true) goto L13;
        r0.add(Long.valueOf(r6));
        r5.g(r6);
    L13:
        r2 = r2 + 1;
        goto L8
    L15:
        if (this.x == true) goto L33;
        this.y = false;
    L18:
        if (r1 >= r3.h()) goto L33;
        long r7 = r3.e(r1);
        if (r5.c(r7) >= 0) goto L32;
        kc1 r8 = (kc1) r3.b(r7);
        if (r8 == null) goto L31;
        View r9 = r8.T;
        if (r9 == null) goto L31;
        if (r9.getParent() != null) goto L32;
    L31:
        r0.add(Long.valueOf(r7));
    L32:
        r1 = r1 + 1;
    L33:
        ki r10 = new ki(r0);
    L35:
        if (r10.hasNext() == false) goto L47;
        v(((Long) r10.next()).longValue());
        goto L35
    L47:
        return;
    }

    public final Long t(int r6) {
        int r1 = 0;
        Long r2 = null;
    L3:
        xe2 r3 = this.u;
        if (r1 >= r3.h()) goto L12;
        if (((Integer) r3.i(r1)).intValue() != r6) goto L11;
        if (r2 != null) goto L9;
        r2 = Long.valueOf(r3.e(r1));
        goto L11
    L9:
        kf2.o("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
        return null;
    L11:
        r1 = r1 + 1;
        goto L3
    L12:
        return r2;
    }

    public final void u(ke1 r9) {
        kc1 r1 = (kc1) this.s.b(r9.e);
        if (r1 == null) goto L45;
        FrameLayout r3 = (FrameLayout) r9.a;
        View r4 = r1.T;
        if (r1.y() == true) goto L10;
        if (r4 == null) goto L10;
        kf2.o("Design assumption violated.");
        return;
    L10:
        boolean r2 = r1.y();
        ld1 r5 = this.r;
        if (r2 == false) goto L16;
        if (r4 != null) goto L16;
        ((CopyOnWriteArrayList) r5.n.n).add(new yc1(new rf2(this, r1, r3)));
        return;
    L16:
        if (r1.y() == false) goto L24;
        if (r4.getParent() == null) goto L24;
        if (r4.getParent() == r3) goto L42;
        p(r4, r3);
        return;
    L42:
        return;
    L24:
        if (r1.y() == false) goto L28;
        p(r4, r3);
        return;
    L28:
        if (r5.N() == true) goto L41;
        ((CopyOnWriteArrayList) r5.n.n).add(new yc1(new rf2(this, r1, r3)));
        zh0 r6 = this.w;
        r6.getClass();
        ArrayList r7 = new ArrayList();
        Iterator r8 = ((CopyOnWriteArrayList) r6.o).iterator();
        if (r8.hasNext() == true) goto L39;
        r1.e0(false);     // Catch: Throwable -> L35
        po r10 = new po(r5);     // Catch: Throwable -> L35
        r10.g(0, r1, "f" + r9.e, 1);     // Catch: Throwable -> L35
        r10.k(r1, r92.q);     // Catch: Throwable -> L35
        r10.f();     // Catch: Throwable -> L35
        this.v.b(false);     // Catch: Throwable -> L35
        zh0.B(r7);
        return;
    L35:
        th = move-exception;
        zh0.B(r7);
        throw th;
    L39:
        throw xa3.d(r8);
    L41:
        if (r5.I == true) goto L49;
        this.q.a(new tl0(this, r9));
        return;
    L49:
        return;
    L45:
        kf2.o("Design assumption violated.");
    }

    public final void v(long r10) {
        xe2 r0 = this.s;
        kc1 r1 = (kc1) r0.b(r10);
        if (r1 != null) goto L5;
        return;
    L5:
        View r2 = r1.T;
        if (r2 == null) goto L10;
        ViewParent r3 = r2.getParent();
        if (r3 == null) goto L10;
        ((FrameLayout) r3).removeAllViews();
    L10:
        boolean r4 = q(r10);
        xe2 r5 = this.t;
        if (r4 == true) goto L14;
        r5.g(r10);
    L14:
        if (r1.y() == true) goto L17;
        r0.g(r10);
        return;
    L17:
        ld1 r6 = this.r;
        if (r6.N() == false) goto L21;
        this.y = true;
        return;
    L21:
        boolean r7 = r1.y();
        zh0 r8 = this.w;
        if (r7 == true) goto L24;
    L39:
        r8.getClass();
        ArrayList r9 = new ArrayList();
        Iterator r11 = ((CopyOnWriteArrayList) r8.o).iterator();
        if (r11.hasNext() == true) goto L48;
        po r12 = new po(r6);     // Catch: Throwable -> L44
        r12.i(r1);     // Catch: Throwable -> L44
        r12.f();     // Catch: Throwable -> L44
        r0.g(r10);     // Catch: Throwable -> L44
        zh0.B(r9);
        return;
    L44:
        th = move-exception;
        zh0.B(r9);
        throw th;
    L48:
        throw xa3.d(r11);
    L24:
        if (q(r10) == false) goto L39;
        r8.getClass();
        ArrayList r13 = new ArrayList();
        Iterator r14 = ((CopyOnWriteArrayList) r8.o).iterator();
        if (r14.hasNext() == true) goto L38;
        ss0 r15 = r6.c;
        String r16 = r1.r;
        fe1 r17 = (fe1) ((HashMap) r15.o).get(r16);
        jc1 r18 = null;
        if (r17 == null) goto L35;
        kc1 r19 = r17.c;
        r19.getClass();
        if (r19 != r1) goto L35;
        if (r19.n <= (-1)) goto L34;
        r18 = new jc1(r17.o());
    L34:
        zh0.B(r13);
        r5.f(r10, r18);
    L35:
        r6.g0(new IllegalStateException(b11.l("Fragment ", r1, " is not currently in the FragmentManager")));
        throw null;
    L38:
        throw xa3.d(r14);
    }
}
