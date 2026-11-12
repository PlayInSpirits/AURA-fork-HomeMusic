package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xm0 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public xm0(ViewGroup r1) {
        r1.getClass();
        this.a = r1;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final xm0 f(ViewGroup r2, ld1 r3) {
        r2.getClass();
        r3.getClass();
        r3.G().getClass();
        Object r0 = r2.getTag(R.id.special_effects_controller_view_tag);
        if ((r0 instanceof xm0) == true) goto L5;
        xm0 r1 = new xm0(r2);
        r2.setTag(R.id.special_effects_controller_view_tag, r1);
        return r1;
    L5:
        return (xm0) r0;
    }

    public final void a(int r4, int r5, fe1 r6) {
        ArrayList r0 = this.b;
        monitor-enter(r0);
        gz r1 = new gz();     // Catch: Throwable -> L9
        kc1 r2 = r6.c;     // Catch: Throwable -> L9
        r2.getClass();     // Catch: Throwable -> L9
        pj4 r3 = d(r2);     // Catch: Throwable -> L9
        if (r3 == null) goto L11;
        r3.c(r4, r5);     // Catch: Throwable -> L9
        monitor-exit(r0);
        return;
    L11:
        final pj4 r7 = new pj4(r4, r5, r6, r1);     // Catch: Throwable -> L9
        this.b.add(r7);     // Catch: Throwable -> L9
        final int r8 = 0;
        Runnable r9 = new oj4(this, r7, r8);     // Catch: Throwable -> L9
        r7.d.add(r9);     // Catch: Throwable -> L9
        final int r10 = 1;
        Runnable r11 = new oj4(this, r7, r10);     // Catch: Throwable -> L9
        r7.d.add(r11);     // Catch: Throwable -> L9
        monitor-exit(r0);
        return;
    L9:
        th = move-exception;
        throw th;
    }

    public final void b(ArrayList r24, boolean r25) {
        xm0 r1 = this;
        ArrayList r0 = r24;
        int r3 = r0.size();
        int r4 = 0;
    L3:
        Object r5 = null;
        if (r4 >= r3) goto L20;
        Object r12 = r0.get(r4);
        r4 = r4 + 1;
        pj4 r13 = (pj4) r12;
        View r14 = r13.c.T;
        r14.getClass();
        if (r14.getAlpha() != 0.0f) goto L10;
        if (r14.getVisibility() == 0) goto L3;
    L10:
        int r15 = r14.getVisibility();
        if (r15 != 0) goto L12;
        if (r13.a == 2) goto L3;
    L21:
        pj4 r16 = (pj4) r12;
        ListIterator r6 = r0.listIterator(r0.size());
    L23:
        if (r6.hasPrevious() == false) goto L39;
        Object r7 = r6.previous();
        pj4 r17 = (pj4) r7;
        View r18 = r17.c.T;
        r18.getClass();
        if (r18.getAlpha() == 0.0f) goto L27;
    L29:
        int r19 = r18.getVisibility();
        if (r19 == 0) goto L23;
        if (r19 == 4) goto L37;
        if (r19 == 8) goto L37;
        kf2.n(f34.f(r19, "Unknown visibility "));
        return;
    L37:
        if (r17.a != 2) goto L23;
        r5 = r7;
        goto L39
    L27:
        if (r18.getVisibility() != 0) goto L29;
    L39:
        pj4 r8 = (pj4) r5;
        if (ld1.I(2) == false) goto L42;
        Log.v("FragmentManager", "Executing operations from " + r16 + " to " + r8);
    L42:
        ArrayList r10 = new ArrayList();
        ArrayList r9 = new ArrayList();
        ArrayList r110 = new ArrayList(r0);
        kc1 r11 = ((pj4) q40.C0(r0)).c;
        int r20 = r0.size();
        int r111 = 0;
    L43:
        if (r111 >= r20) goto L45;
        Object r112 = r0.get(r111);
        r111 = r111 + 1;
        hc1 r113 = ((pj4) r112).c.W;
        hc1 r21 = r11.W;
        r113.b = r21.b;
        r113.c = r21.c;
        r113.d = r21.d;
        r113.e = r21.e;
        goto L43
    L45:
        int r22 = r0.size();
        int r23 = 0;
    L46:
        if (r23 >= r22) goto L72;
        Object r114 = r0.get(r23);
        r23 = r23 + 1;
        pj4 r115 = (pj4) r114;
        gz r116 = new gz();
        r115.d();
        LinkedHashSet r117 = r115.e;
        r117.add(r116);
        r10.add(new tm0(r115, r116, r25));
        gz r26 = new gz();
        r115.d();
        r117.add(r26);
        if (r25 == false) goto L52;
        if (r115 != r16) goto L51;
    L50:
        boolean r118 = true;
    L54:
        kc1 r119 = r115.c;
        um0 r120 = new um0(r115, r26);
        if (r115.a != 2) goto L59;
        if (r25 == false) goto L58;
        hc1 r2 = r119.W;
    L63:
        if (r115.a != 2) goto L67;
        if (r25 == false) goto L66;
        hc1 r27 = r119.W;
        goto L67
    L66:
        hc1 r28 = r119.W;
    L67:
        if (r118 == false) goto L71;
        if (r25 == false) goto L70;
        hc1 r29 = r119.W;
        goto L71
    L70:
        r119.getClass();
    L71:
        r9.add(r120);
        r115.d.add(new k6(r110, r115, r1));
        r0 = r24;
        goto L46
    L58:
        r119.getClass();
        goto L63
    L59:
        if (r25 == false) goto L61;
        hc1 r30 = r119.W;
        goto L63
    L61:
        r119.getClass();
    L51:
        r118 = false;
        goto L54
    L52:
        if (r115 != r8) goto L51;
    L72:
        LinkedHashMap r31 = new LinkedHashMap();
        ArrayList r32 = new ArrayList();
        int r33 = r9.size();
        int r34 = 0;
    L73:
        if (r34 >= r33) goto L77;
        Object r35 = r9.get(r34);
        r34 = r34 + 1;
        if (((um0) r35).k() == true) goto L73;
        r32.add(r35);
        goto L73
    L77:
        ArrayList r36 = new ArrayList();
        int r37 = r32.size();
        int r38 = 0;
    L78:
        if (r38 >= r37) goto L80;
        Object r121 = r32.get(r38);
        r38 = r38 + 1;
        ((um0) r121).getClass();
        goto L78
    L80:
        int r39 = r36.size();
        int r40 = 0;
    L81:
        if (r40 >= r39) goto L83;
        Object r41 = r36.get(r40);
        r40 = r40 + 1;
        ((um0) r41).getClass();
        goto L81
    L83:
        int r42 = r9.size();
        int r43 = 0;
    L84:
        if (r43 >= r42) goto L86;
        Object r44 = r9.get(r43);
        r43 = r43 + 1;
        um0 r45 = (um0) r44;
        r31.put((pj4) r45.a, Boolean.FALSE);
        r45.d();
        goto L84
    L86:
        boolean r122 = r31.containsValue(Boolean.TRUE);
        ViewGroup r123 = r1.a;
        Context r124 = r123.getContext();
        ArrayList r46 = new ArrayList();
        int r47 = r10.size();
        int r48 = 0;
        boolean r125 = false;
    L88:
        if (r48 >= r47) goto L116;
        r48 = r48 + 1;
        tm0 r49 = (tm0) r10.get(r48);
        if (r49.k() == true) goto L91;
        r124.getClass();
        xc5 r50 = r49.o(r124);
        if (r50 == null) goto L95;
        Animator r51 = (Animator) r50.p;
        if (r51 == null) goto L98;
        ArrayList r210 = r46;
        pj4 r52 = (pj4) r49.a;
        kc1 r53 = r52.c;
        int r211 = r47;
        if (h12.c(r31.get(r52), Boolean.TRUE) == true) goto L102;
        if (r52.a != 3) goto L109;
        boolean r54 = true;
    L110:
        if (r54 == false) goto L112;
        r110.remove(r52);
    L112:
        View r55 = r53.T;
        r123.startViewTransition(r55);
        LinkedHashMap r212 = r31;
        ArrayList r213 = r10;
        r1 = this;
        r51.addListener(new vm0(r1, r55, r54, r52, r49));
        r51.setTarget(r55);
        r51.start();
        if (ld1.I(2) == false) goto L115;
        Log.v("FragmentManager", "Animator from operation " + r52 + " has started.");
    L115:
        ((gz) r49.b).a(new ef0(3, r51, r52));
        r31 = r212;
        r47 = r211;
        r46 = r210;
        r10 = r213;
        r125 = true;
        goto L88
    L109:
        r54 = false;
        goto L110
    L102:
        if (ld1.I(2) == false) goto L104;
        Log.v("FragmentManager", "Ignoring Animator set on " + r53 + " as this Fragment was involved in a Transition.");
    L104:
        r49.d();
    L105:
        r1 = this;
        r46 = r210;
        r47 = r211;
        goto L88
    L98:
        r46.add(r49);
    L92:
        r210 = r46;
        r211 = r47;
        goto L105
    L95:
        r49.d();
        goto L92
    L91:
        r49.d();
        goto L92
    L116:
        ArrayList r214 = r46;
        int r56 = r214.size();
        int r57 = 0;
    L117:
        if (r57 >= r56) goto L146;
        ArrayList r58 = r214;
        int r126 = r57 + 1;
        tm0 r59 = (tm0) r58.get(r57);
        pj4 r60 = (pj4) r59.a;
        kc1 r61 = r60.c;
        if (r122 == true) goto L121;
        if (r125 == true) goto L128;
        View r62 = r61.T;
        r124.getClass();
        xc5 r63 = r59.o(r124);
        if (r63 == null) goto L144;
        Animation r64 = (Animation) r63.o;
        if (r64 == null) goto L142;
        int r215 = r56;
        if (r60.a == 1) goto L138;
        r62.startAnimation(r64);
        r59.d();
    L141:
        r214 = r58;
        ((gz) r59.b).a(new dg0(r62, this, r59, r60, 1));
        r1 = this;
        r56 = r215;
    L125:
        r57 = r126;
        goto L117
    L138:
        r123.startViewTransition(r62);
        qc1 r65 = new qc1(r64, r123, r62);
        r65.setAnimationListener(new wm0(r60, r1, r62, r59));
        r62.startAnimation(r65);
        if (ld1.I(2) == false) goto L141;
        Log.v("FragmentManager", "Animation from operation " + r60 + " has started.");
        goto L141
    L142:
        kf2.o("Required value was null.");
        return;
    L144:
        kf2.o("Required value was null.");
        return;
    L128:
        if (ld1.I(2) == false) goto L130;
        Log.v("FragmentManager", "Ignoring Animation set on " + r61 + " as Animations cannot run alongside Animators.");
    L130:
        r59.d();
    L124:
        r214 = r58;
        goto L125
    L121:
        if (ld1.I(2) == false) goto L123;
        Log.v("FragmentManager", "Ignoring Animation set on " + r61 + " as Animations cannot run alongside Transitions.");
    L123:
        r59.d();
        goto L124
    L146:
        int r66 = r110.size();
        int r67 = 0;
    L147:
        if (r67 >= r66) goto L149;
        Object r68 = r110.get(r67);
        r67 = r67 + 1;
        pj4 r69 = (pj4) r68;
        View r70 = r69.c.T;
        int r71 = r69.a;
        r70.getClass();
        f34.a(r70, r71);
        goto L147
    L149:
        r110.clear();
        if (ld1.I(2) == false) goto L202;
        Log.v("FragmentManager", "Completed executing operations from " + r16 + " to " + r8);
        return;
    L202:
        return;
    L12:
        if (r15 == 4) goto L3;
        if (r15 == 8) goto L3;
        kf2.n(f34.f(r15, "Unknown visibility "));
        return;
    L20:
        r12 = null;
        goto L21
    }

    public final void c() {
        if (this.e == false) goto L5;
        return;
    L5:
        ViewGroup r0 = this.a;
        WeakHashMap r1 = j65.a;
        if (r0.isAttachedToWindow() == true) goto L9;
        e();
        this.d = false;
        return;
    L9:
        ArrayList r2 = this.b;
        monitor-enter(r2);
    L19:
        th = move-exception;
        throw th;
    L12:
        if (this.b.isEmpty() == true) goto L33;
        ArrayList r3 = q40.R0(this.c);     // Catch: Throwable -> L19
        this.c.clear();     // Catch: Throwable -> L19
        int r4 = r3.size();     // Catch: Throwable -> L19
        int r5 = 0;
    L15:
        if (r5 >= r4) goto L24;
        Object r6 = r3.get(r5);     // Catch: Throwable -> L19
        r5 = r5 + 1;     // Catch: Throwable -> L19
        pj4 r7 = (pj4) r6;     // Catch: Throwable -> L19
        if (ld1.I(2) == false) goto L21;
        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + r7);     // Catch: Throwable -> L19
    L21:
        r7.a();     // Catch: Throwable -> L19
        if (r7.g == true) goto L15;
        this.c.add(r7);     // Catch: Throwable -> L19
        goto L15
    L24:
        g();     // Catch: Throwable -> L19
        ArrayList r8 = q40.R0(this.b);     // Catch: Throwable -> L19
        this.b.clear();     // Catch: Throwable -> L19
        this.c.addAll(r8);     // Catch: Throwable -> L19
        if (ld1.I(2) == false) goto L27;
        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");     // Catch: Throwable -> L19
    L27:
        int r9 = r8.size();     // Catch: Throwable -> L19
        int r10 = 0;
    L28:
        if (r10 >= r9) goto L30;
        Object r11 = r8.get(r10);     // Catch: Throwable -> L19
        r10 = r10 + 1;     // Catch: Throwable -> L19
        ((pj4) r11).d();     // Catch: Throwable -> L19
        goto L28
    L30:
        b(r8, this.d);     // Catch: Throwable -> L19
        this.d = false;     // Catch: Throwable -> L19
        if (ld1.I(2) == false) goto L33;
        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");     // Catch: Throwable -> L19
    L33:
        monitor-exit(r2);
    }

    public final pj4 d(kc1 r6) {
        ArrayList r5 = this.b;
        int r0 = r5.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        Object r2 = r5.get(r1);
        r1 = r1 + 1;
        pj4 r3 = (pj4) r2;
        if (h12.c(r3.c, r6) == false) goto L3;
        if (r3.f == true) goto L3;
    L11:
        return (pj4) r2;
    L9:
        r2 = null;
        goto L11
    }

    public final void e() {
        if (ld1.I(2) == false) goto L5;
        Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
    L5:
        ViewGroup r1 = this.a;
        WeakHashMap r2 = j65.a;
        boolean r3 = r1.isAttachedToWindow();
        ArrayList r4 = this.b;
        monitor-enter(r4);
        g();     // Catch: Throwable -> L10
        ArrayList r5 = this.b;     // Catch: Throwable -> L10
        int r6 = r5.size();     // Catch: Throwable -> L10
        int r7 = 0;
        int r8 = 0;
    L8:
        if (r8 >= r6) goto L12;
        Object r9 = r5.get(r8);     // Catch: Throwable -> L10
        r8 = r8 + 1;     // Catch: Throwable -> L10
        ((pj4) r9).d();     // Catch: Throwable -> L10
        goto L8
    L12:
        ArrayList r10 = q40.R0(this.c);     // Catch: Throwable -> L10
        int r11 = r10.size();     // Catch: Throwable -> L10
        int r12 = 0;
    L13:
        if (r12 >= r11) goto L21;
        Object r13 = r10.get(r12);     // Catch: Throwable -> L10
        r12 = r12 + 1;     // Catch: Throwable -> L10
        pj4 r14 = (pj4) r13;     // Catch: Throwable -> L10
        if (ld1.I(2) == false) goto L20;
        if (r3 == false) goto L18;
        String r15 = "";
    L19:
        Log.v("FragmentManager", "SpecialEffectsController: " + r15 + "Cancelling running operation " + r14);     // Catch: Throwable -> L10
        goto L20
    L18:
        r15 = "Container " + this.a + " is not attached to window. ";     // Catch: Throwable -> L10
    L20:
        r14.a();     // Catch: Throwable -> L10
        goto L13
    L21:
        ArrayList r16 = q40.R0(this.b);     // Catch: Throwable -> L10
        int r17 = r16.size();     // Catch: Throwable -> L10
    L22:
        if (r7 >= r17) goto L31;
        Object r18 = r16.get(r7);     // Catch: Throwable -> L10
        r7 = r7 + 1;     // Catch: Throwable -> L10
        pj4 r19 = (pj4) r18;     // Catch: Throwable -> L10
        if (ld1.I(2) == false) goto L29;
        if (r3 == false) goto L27;
        String r20 = "";
    L28:
        Log.v("FragmentManager", "SpecialEffectsController: " + r20 + "Cancelling pending operation " + r19);     // Catch: Throwable -> L10
        goto L29
    L27:
        r20 = "Container " + this.a + " is not attached to window. ";     // Catch: Throwable -> L10
    L29:
        r19.a();     // Catch: Throwable -> L10
        goto L22
    L31:
        monitor-exit(r4);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public final void g() {
        ArrayList r5 = this.b;
        int r0 = r5.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L16;
        Object r2 = r5.get(r1);
        r1 = r1 + 1;
        pj4 r3 = (pj4) r2;
        int r4 = 2;
        if (r3.b != 2) goto L3;
        int r6 = r3.c.a0().getVisibility();
        if (r6 == 0) goto L15;
        r4 = 4;
        if (r6 == 4) goto L15;
        if (r6 != 8) goto L13;
        r4 = 3;
        goto L15
    L13:
        kf2.n(f34.f(r6, "Unknown visibility "));
        return;
    L15:
        r3.c(r4, 1);
        goto L3
    }
}
