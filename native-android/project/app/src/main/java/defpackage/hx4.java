package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hx4 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public dx4 n;
    public ViewGroup o;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        dx4 r1 = this.n;
        ViewGroup r2 = this.o;
        r2.getViewTreeObserver().removeOnPreDrawListener(this);
        r2.removeOnAttachStateChangeListener(this);
        boolean r6 = true;
        if (ix4.c.remove(r2) == true) goto L5;
        return true;
    L5:
        oi r3 = ix4.b();
        ArrayList r4 = (ArrayList) r3.get(r2);
        if (r4 != null) goto L10;
        r4 = new ArrayList();
        r3.put(r2, r4);
    L8:
        ArrayList r7 = null;
    L12:
        r4.add(r1);
        r1.a(new gx4(this, r3));
        int r0 = 0;
        r1.g(r2, false);
        if (r7 == null) goto L17;
        int r5 = r7.size();
        int r8 = 0;
    L15:
        if (r8 >= r5) goto L17;
        Object r9 = r7.get(r8);
        r8 = r8 + 1;
        ((dx4) r9).v(r2);
    L17:
        r1.x = new ArrayList();
        r1.y = new ArrayList();
        bq4 r10 = r1.t;
        bq4 r11 = r1.u;
        oi r12 = new oi((oi) r10.n);
        oi r13 = new oi((oi) r11.n);
        int r14 = 0;
    L18:
        int[] r15 = r1.w;
        if (r14 >= r15.length) goto L89;
        int r16 = r15[r14];
        if (r16 != r6) goto L23;
        boolean r17 = r6;
        int r18 = r12.p - 1;
    L77:
        if (r18 < 0) goto L88;
        View r19 = (View) r12.f(r18);
        if (r19 == null) goto L87;
        if (r1.r(r19) == false) goto L87;
        mx4 r20 = (mx4) r13.remove(r19);
        if (r20 == null) goto L87;
        if (r1.r(r20.b) == false) goto L87;
        r1.x.add((mx4) r12.h(r18));
        r1.y.add(r20);
    L87:
        r18 = r18 - 1;
    L88:
        r14 = r14 + 1;
        r6 = r17;
        r0 = 0;
        goto L18
    L23:
        if (r16 != 2) goto L25;
        r17 = r6;
        oi r21 = (oi) r10.q;
        oi r22 = (oi) r11.q;
        int r23 = r21.p;
        int r110 = 0;
    L62:
        if (r110 >= r23) goto L88;
        View r111 = (View) r21.j(r110);
        if (r111 == null) goto L75;
        if (r1.r(r111) == false) goto L75;
        View r112 = (View) r22.get(r21.f(r110));
        if (r112 == null) goto L75;
        if (r1.r(r112) == false) goto L75;
        mx4 r113 = (mx4) r12.get(r111);
        mx4 r114 = (mx4) r13.get(r112);
        if (r113 == null) goto L75;
        if (r114 == null) goto L75;
        r1.x.add(r113);
        r1.y.add(r114);
        r12.remove(r111);
        r13.remove(r112);
    L75:
        r110 = r110 + 1;
        goto L62
    L25:
        if (r16 != 3) goto L27;
        r17 = r6;
        SparseArray r24 = (SparseArray) r10.o;
        SparseArray r25 = (SparseArray) r11.o;
        int r26 = r24.size();
        int r115 = 0;
    L47:
        if (r115 >= r26) goto L88;
        View r116 = (View) r24.valueAt(r115);
        if (r116 == null) goto L60;
        if (r1.r(r116) == false) goto L60;
        View r117 = (View) r25.get(r24.keyAt(r115));
        if (r117 == null) goto L60;
        if (r1.r(r117) == false) goto L60;
        mx4 r118 = (mx4) r12.get(r116);
        mx4 r119 = (mx4) r13.get(r117);
        if (r118 == null) goto L60;
        if (r119 == null) goto L60;
        r1.x.add(r118);
        r1.y.add(r119);
        r12.remove(r116);
        r13.remove(r117);
    L60:
        r115 = r115 + 1;
        goto L47
    L27:
        if (r16 == 4) goto L29;
    L28:
        r17 = r6;
        goto L88
    L29:
        xe2 r120 = (xe2) r10.p;
        xe2 r121 = (xe2) r11.p;
        int r122 = r120.h();
        int r123 = r0;
    L30:
        if (r123 >= r122) goto L28;
        View r124 = (View) r120.i(r123);
        if (r124 != null) goto L34;
    L44:
        boolean r125 = r6;
    L45:
        r123 = r123 + 1;
        r6 = r125;
        goto L30
    L34:
        if (r1.r(r124) == false) goto L44;
        boolean r126 = r6;
        View r27 = (View) r121.b(r120.e(r123));
        if (r27 != null) goto L38;
    L43:
        r125 = r126;
        goto L45
    L38:
        if (r1.r(r27) == false) goto L43;
        mx4 r28 = (mx4) r12.get(r124);
        mx4 r29 = (mx4) r13.get(r27);
        if (r28 == null) goto L43;
        if (r29 == null) goto L43;
        r125 = r126;
        r1.x.add(r28);
        r1.y.add(r29);
        r12.remove(r124);
        r13.remove(r27);
        goto L45
    L89:
        boolean r127 = r6;
        int r30 = 0;
    L91:
        if (r30 >= r12.p) goto L96;
        mx4 r31 = (mx4) r12.j(r30);
        if (r1.r(r31.b) == false) goto L95;
        r1.x.add(r31);
        r1.y.add(null);
    L95:
        r30 = r30 + 1;
        goto L91
    L96:
        int r32 = 0;
    L98:
        if (r32 >= r13.p) goto L104;
        mx4 r33 = (mx4) r13.j(r32);
        if (r1.r(r33.b) == false) goto L103;
        r1.y.add(r33);
        r1.x.add(null);
    L103:
        r32 = r32 + 1;
        goto L98
    L104:
        oi r34 = dx4.n();
        int r35 = r34.p;
        f85 r36 = d85.a;
        WindowId r37 = r2.getWindowId();
        int r38 = r35 - 1;
    L105:
        if (r38 < 0) goto L130;
        Animator r39 = (Animator) r34.f(r38);
        if (r39 == null) goto L129;
        ax4 r40 = (ax4) r34.get(r39);
        if (r40 == null) goto L129;
        View r41 = r40.a;
        if (r41 == null) goto L129;
        if (r40.d.a.equals(r37) == false) goto L129;
        mx4 r42 = r40.c;
        boolean r128 = r127;
        mx4 r43 = r1.p(r41, r128);
        mx4 r129 = r1.m(r41, r128);
        if (r43 != null) goto L118;
        if (r129 != null) goto L118;
        r129 = (mx4) ((oi) r1.u.n).get(r41);
    L118:
        if (r43 != null) goto L121;
        if (r129 == null) goto L129;
    L121:
        if (r40.e.q(r42, r129) == false) goto L129;
        if (r39.isRunning() == false) goto L125;
    L128:
        r39.cancel();
        goto L129
    L125:
        if (r39.isStarted() == true) goto L128;
        r34.remove(r39);
    L129:
        r38 = r38 - 1;
        r127 = true;
        goto L105
    L130:
        r1.k(r2, r1.t, r1.u, r1.x, r1.y);
        r1.w();
        return true;
    L10:
        if (r4.size() <= 0) goto L8;
        r7 = new ArrayList(r4);
        goto L12
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r5) {
        ViewGroup r6 = this.o;
        r6.getViewTreeObserver().removeOnPreDrawListener(this);
        r6.removeOnAttachStateChangeListener(this);
        ix4.c.remove(r6);
        ArrayList r0 = (ArrayList) ix4.b().get(r6);
        if (r0 != null) goto L5;
    L9:
        this.n.h(true);
        return;
    L5:
        if (r0.size() <= 0) goto L9;
        int r1 = r0.size();
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L9;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        ((dx4) r3).v(r6);
        goto L7
    }
}
