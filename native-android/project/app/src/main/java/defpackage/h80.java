package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h80 {
    public final View a;
    public boolean b;
    public u80 c;
    public ba2 d;
    public j54 e;
    public f75 f;
    public final iw1 g;
    public final z04 h;
    public final Configuration i;
    public final b13 j;
    public final rv2 k;
    public final pa l;
    public final hd5 m;
    public final y30 n;
    public final ga1 o;
    public final b13 p;
    public final kl1 q;
    public final gd r;
    public final e72 s;
    public final om1 t;
    public final nz u;
    public int v;
    public vc w;
    public final g80 x;

    public h80(h80 r4, View r5, u80 r6, ba2 r7, j54 r8, f75 r9) {
        View r0 = null;
        if (r4 == null) goto L7;
        View r1 = r4.a;
        if (r1 == null) goto L7;
        Context r2 = r1.getContext();
    L8:
        boolean r3 = h12.c(r2, r5.getContext());
        this.a = r5;
        this.c = r6;
        this.d = r7;
        this.e = r8;
        this.f = r9;
        if (r3 == false) goto L11;
        r4.getClass();
        iw1 r10 = r4.g;
    L12:
        this.g = r10;
        if (r4 == null) goto L16;
        z04 r11 = r4.h;
        if (r11 == null) goto L16;
    L17:
        this.h = r11;
        if (r3 == false) goto L20;
        r4.getClass();
        Configuration r12 = r4.i;
    L21:
        this.i = r12;
        if (r3 == false) goto L24;
        r4.getClass();
        b13 r13 = r4.j;
    L25:
        this.j = r13;
        if (r3 == false) goto L28;
        r4.getClass();
        rv2 r14 = r4.k;
    L29:
        this.k = r14;
        if (r3 == false) goto L32;
        r4.getClass();
        pa r15 = r4.l;
    L33:
        this.l = r15;
        if (r3 == false) goto L36;
        r4.getClass();
        hd5 r16 = r4.m;
    L37:
        this.m = r16;
        if (r3 == false) goto L40;
        r4.getClass();
        y30 r17 = r4.n;
    L41:
        this.n = r17;
        int r18 = 2;
        if (r3 == false) goto L44;
        r4.getClass();
        ga1 r19 = r4.o;
    L45:
        this.o = r19;
        if (r3 == false) goto L48;
        r4.getClass();
        b13 r20 = r4.p;
    L49:
        this.p = r20;
        if (r4 == null) goto L52;
        r0 = r4.a;
    L52:
        if (r5 != r0) goto L54;
        kl1 r21 = r4.q;
    L55:
        this.q = r21;
        if (r3 == false) goto L58;
        r4.getClass();
        gd r22 = r4.r;
    L59:
        this.r = r22;
        if (r4 == null) goto L63;
        e72 r23 = r4.s;
        if (r23 == null) goto L63;
    L64:
        this.s = r23;
        this.t = new om1(4, (byte) 0);
        if (r4 == null) goto L68;
        nz r24 = r4.u;
        if (r24 == null) goto L68;
    L69:
        this.u = r24;
        new wc(r18, this);
        this.x = new g80(this);
        return;
    L68:
        r24 = new nz();
    L63:
        r23 = new e72();
        goto L64
    L58:
        r22 = new gd(ViewConfiguration.get(r5.getContext()));
        goto L59
    L54:
        r21 = new sg3(r5);
        goto L55
    L48:
        r20 = new zd3(gb.o(r5.getContext()), rv2.A);
        goto L49
    L44:
        r5.getContext();
        r19 = new pa(r18);
        goto L45
    L40:
        r17 = new rv2(29);
        goto L41
    L36:
        r16 = new hd5(r5.getContext());
        goto L37
    L32:
        r5.getContext();
        r15 = new pa(5);
        goto L33
    L28:
        Context r25 = r5.getContext();
        r14 = new rv2(28);
        Object r26 = r25.getSystemService("accessibility");
        r26.getClass();
        AccessibilityManager r27 = (AccessibilityManager) r26;
        goto L29
    L24:
        r13 = uc5.B(new Configuration(r12));
        goto L25
    L20:
        r12 = new Configuration(r5.getContext().getResources().getConfiguration());
    L16:
        r11 = new z04();
        goto L17
    L11:
        r10 = new iw1();
    L7:
        r2 = null;
        goto L8
    }

    public final void a(ra r25, r70 r26, rg1 r27, int r28) {
        r27.S(123858079);
        int r6 = 2;
        if (r27.g(r25) == false) goto L5;
        int r5 = 4;
    L6:
        int r7 = r5 | r28;
        if (r27.g(r26) == false) goto L9;
        int r8 = 32;
    L10:
        int r9 = r7 | r8;
        if (r27.g(this) == false) goto L13;
        int r10 = 256;
    L14:
        int r11 = r9 | r10;
        if ((r11 & 147) == 146) goto L17;
        boolean r12 = true;
    L19:
        if (r27.K(r11 & 1, r12) == false) goto L63;
        Object r13 = r25.getTag(R.id.inspection_slot_table_set);
        Set r14 = null;
        if ((r13 instanceof Set) == true) goto L23;
    L27:
        Set r15 = null;
    L28:
        if (r15 != null) goto L43;
        Object r16 = r25.getParent();
        if ((r16 instanceof View) == false) goto L32;
        View r17 = (View) r16;
    L33:
        if (r17 == null) goto L35;
        Object r18 = r17.getTag(R.id.inspection_slot_table_set);
    L37:
        if ((r18 instanceof Set) == true) goto L39;
    L44:
        if (r14 == null) goto L46;
        r14.add(r27.t());
        r27.q = true;
        r27.C = true;
        r27.c.b();
        r27.H.b();
        lg4 r19 = r27.I;
        ig4 r20 = r19.a;
        r19.e = r20.w;
        r19.f = r20.x;
    L46:
        boolean r21 = r27.e(r25.getView());
        Object r22 = r27.H();
        i80 r23 = j80.a;
        if (r21 == true) goto L49;
        if (r22 == r23) goto L49;
    L50:
        y75 r24 = (y75) r22;
        rr3 r110 = qd2.a.a(d());
        qr3 r29 = td2.a;
        g();
        j54 r30 = this.e;
        r30.getClass();
        rr3 r111 = r29.a(r30);
        rr3 r112 = hb.d.a(this.g);
        rr3 r113 = hb.e.a(this.h);
        wl4 r31 = g90.v;
        boolean r32 = r27.g(this);
        Object r114 = r27.H();
        if (r32 == true) goto L53;
        if (r114 == r23) goto L53;
    L54:
        rr3 r115 = r31.c((if1) r114);
        rr3 r116 = hb.b.a(r25.getContext());
        rr3 r117 = yz1.a.a(r14);
        rr3 r118 = hb.a.a(r25.getConfiguration());
        wl4 r33 = z44.a;
        boolean r34 = r27.g(r25);
        Object r119 = r27.H();
        if (r34 == true) goto L57;
        if (r119 == r23) goto L57;
    L58:
        rr3 r120 = r33.c((if1) r119);
        rr3 r210 = hb.f.a(r25.getView());
        l90 r35 = g90.x;
        boolean r36 = r27.g(r25);
        Object r37 = r27.H();
        if (r36 == true) goto L61;
        if (r37 == r23) goto L61;
    L62:
        gi1.b(new rr3[]{r110, r111, r112, r113, r115, r116, r117, r118, r120, r210, r35.c((if1) r37), g90.t.a(r25.getViewConfiguration()), vp1.a.a(r24)}, fh0.w(1317454175, new f80(r25, this, r26), r27), r27, 56);
    L64:
        lv3 r3 = r27.p();
        if (r3 == null) goto L68;
        r3.d = new f80(this, r25, r26, r28);
        return;
    L68:
        return;
    L61:
        r37 = new ja(r25, 3);
        r27.b0(r37);
    L57:
        r119 = new ja(r25, r6);
        r27.b0(r119);
    L53:
        r114 = new x(8, this);
        r27.b0(r114);
    L49:
        r22 = new y75(r25.getView());
        r27.b0(r22);
        goto L50
    L39:
        if ((r18 instanceof x32) == true) goto L41;
    L42:
        r14 = (Set) r18;
        goto L44
    L41:
        if ((r18 instanceof b42) == false) goto L44;
    L35:
        r18 = null;
        goto L37
    L32:
        r17 = null;
        goto L33
    L43:
        r14 = r15;
        goto L44
    L23:
        if ((r13 instanceof x32) == true) goto L25;
    L26:
        r15 = (Set) r13;
        goto L28
    L25:
        if ((r13 instanceof b42) == false) goto L27;
    L63:
        r27.N();
        goto L64
    L17:
        r12 = false;
        goto L19
    L13:
        r10 = 128;
        goto L14
    L9:
        r8 = 16;
        goto L10
    L5:
        r5 = 2;
        goto L6
    }

    public final void b() {
        int r0 = this.v - 1;
        this.v = r0;
        if (r0 >= 0) goto L6;
        Log.e("ComposeViewContext", "View count has dropped below 0");
        this.v = 0;
    L6:
        if (this.v != 0) goto L9;
        View r1 = this.a;
        Context r2 = r1.getContext();
        g80 r3 = this.x;
        r2.unregisterComponentCallbacks(r3);
        this.t.getClass();
        r1.getViewTreeObserver().removeOnWindowFocusChangeListener(r3);
        return;
    }

    public final u80 c() {
        g();
        u80 r0 = this.c;
        r0.getClass();
        return r0;
    }

    public final ba2 d() {
        g();
        ba2 r0 = this.d;
        r0.getClass();
        return r0;
    }

    public final void e() {
        int r0 = this.v + 1;
        this.v = r0;
        if (r0 != 1) goto L6;
        View r1 = this.a;
        Context r2 = r1.getContext();
        g80 r3 = this.x;
        r2.registerComponentCallbacks(r3);
        f(r1.getResources().getConfiguration());
        boolean r4 = r1.hasWindowFocus();
        ((zd3) this.t.o).setValue(Boolean.valueOf(r4));
        r1.getViewTreeObserver().addOnWindowFocusChangeListener(r3);
        return;
    }

    public final void f(Configuration r4) {
        int r0 = this.i.updateFrom(r4);
        if (r0 == 0) goto L26;
        Iterator r1 = this.g.a.entrySet().iterator();
    L6:
        if (r1.hasNext() == false) goto L12;
        gw1 r2 = (gw1) ((WeakReference) ((Map.Entry) r1.next()).getValue()).get();
        if (r2 == null) goto L11;
        if (Configuration.needNewResources(r0, r2.b) == false) goto L6;
    L11:
        r1.remove();
        goto L6
    L12:
        this.j.setValue(new Configuration(r4));
        z04 r5 = this.h;
        monitor-enter(r5);
        r5.a.c();     // Catch: Throwable -> L23
        monitor-exit(r5);
        if ((268435456 & r0) == 0) goto L20;
        this.p.setValue(gb.o(this.a.getContext()));
    L20:
        if ((805248384 & r0) == 0) goto L35;
        this.t.getClass();
        return;
    L35:
        return;
    L23:
        th = move-exception;
        throw th;
    }

    public final void g() {
        if (this.b == true) goto L37;
        this.b = true;
        u80 r0 = this.c;
        View r1 = this.a;
        if (r0 != null) goto L18;
        u80 r2 = ic5.a(r1);
        if (r2 != null) goto L14;
        Object r3 = r1.getParent();
    L10:
        if (r2 != null) goto L14;
        if ((r3 instanceof View) == false) goto L14;
        View r4 = (View) r3;
        r2 = ic5.a(r4);
        r3 = au0.z(r4);
    L14:
        if (r2 != null) goto L16;
        r2 = ic5.b(r1);
    L16:
        this.c = r2;
    L18:
        if (this.d != null) goto L25;
        ba2 r5 = j51.u(r1);
        if (r5 == null) goto L22;
        this.d = r5;
        goto L25
    L22:
        kf2.o("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
        return;
    L25:
        if (this.e != null) goto L32;
        j54 r6 = kb4.y(r1);
        if (r6 == null) goto L29;
        this.e = r6;
        goto L32
    L29:
        kf2.o("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
        return;
    L32:
        if (this.f != null) goto L38;
        this.f = gi1.o(r1);
        return;
    L38:
        return;
    }
}
