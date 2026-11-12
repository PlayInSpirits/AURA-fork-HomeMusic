package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lb implements rl0, View.OnAttachStateChangeListener {
    public final a0 A;
    public final ra n;
    public final na o;
    public gp3 p;
    public final ArrayList q;
    public final long r;
    public jb s;
    public boolean t;
    public final aw u;
    public i03 v;
    public long w;
    public final i03 x;
    public j94 y;
    public boolean z;

    public lb(ra r3, na r4) {
        this.n = r3;
        this.o = r4;
        this.q = new ArrayList();
        this.r = 100;
        this.s = jb.n;
        this.t = true;
        this.u = su3.a(1, 6, null);
        new Handler(Looper.getMainLooper());
        i03 r5 = f02.a;
        r5.getClass();
        this.v = r5;
        this.x = new i03();
        this.y = new j94(r3.getSemanticsOwner().a(), r5);
        this.A = new a0(5, this);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0082 -> B:17:0x0046). Please report as a decompilation issue!!! */
    public final Object a(wd0 r8) {
        if ((r8 instanceof kb) == false) goto L7;
        kb r0 = (kb) r8;
        int r1 = r0.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.q = r1 - Integer.MIN_VALUE;
    L8:
        Object r9 = r0.o;
        int r2 = r0.q;
        xe0 r4 = xe0.n;
        if (r2 == 0) goto L16;
        if (r2 == 1) goto L15;
        if (r2 != 2) goto L13;
        xv r3 = r0.n;
        kb4.X(r9);
    L17:
        r0.n = r3;
        r0.q = 1;
        r9 = r3.b(r0);
        if (r9 != r4) goto L21;
    L31:
        return r4;
    L21:
        if (((Boolean) r9).booleanValue() == false) goto L33;
        r3.c();
        if (e() == false) goto L25;
        f();
    L25:
        Handler r10 = this.n.getHandler();
        if (this.z == true) goto L29;
        if (r10 == null) goto L29;
        this.z = true;
        r10.post(this.A);
    L29:
        r0.n = r3;
        r0.q = 2;
        if (au0.j(this.r, r0) != r4) goto L17;
    L33:
        return j15.a;
    L13:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L15:
        r3 = r0.n;
        kb4.X(r9);
        goto L21
    L16:
        kb4.X(r9);
        aw r11 = this.u;
        r11.getClass();
        r3 = new xv(r11);
    L7:
        r0 = new kb(this, r8);
        goto L8
    }

    public final void c(e02 r34) {
        e02 r1 = r34;
        int[] r2 = r1.b;
        long[] r3 = r1.a;
        int r4 = r3.length - 2;
        if (r4 < 0) goto L91;
        int r6 = 0;
    L5:
        long r7 = r3[r6];
        char r11 = 7;
        long r12 = -9187201950435737472L;
        if (((((~r7) << 7) & r7) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L88;
        int r10 = 8;
        int r9 = 8 - ((~(r6 - r4)) >>> 31);
        int r14 = 0;
    L8:
        if (r14 >= r9) goto L85;
        if ((r7 & 255) >= 128) goto L83;
        int r5 = r2[(r6 << 3) + r14];
        char r17 = r11;
        j94 r13 = (j94) this.x.b(r5);
        k94 r8 = (k94) r1.b(r5);
        if (r8 == null) goto L14;
        i94 r15 = r8.a;
    L15:
        if (r15 == null) goto L82;
        long r22 = r12;
        int r16 = r15.f;
        w03 r18 = r15.d.n;
        if (r13 != null) goto L45;
        Object[] r19 = r18.b;
        long[] r110 = r18.a;
        int r111 = r110.length - 2;
        int[] r26 = r2;
        if (r111 < 0) goto L43;
        int r112 = r10;
        int r113 = 0;
    L21:
        long r20 = r110[r113];
        long r27 = r7;
        if (((((~r20) << r17) & r20) & r22) == r22) goto L41;
        int r21 = 8 - ((~(r113 - r111)) >>> 31);
        int r23 = 0;
    L24:
        if (r23 >= r21) goto L40;
        if ((r20 & 255) >= 128) goto L37;
        long r30 = r20;
        p94 r24 = (p94) r19[(r113 << 3) + r23];
        p94 r25 = n94.z;
        if (h12.c(r24, r25) == false) goto L38;
        Object r28 = r18.g(r25);
        if (r28 != null) goto L32;
        r28 = null;
    L32:
        List r29 = (List) r28;
        if (r29 == null) goto L35;
        he r31 = (he) q40.x0(r29);
    L36:
        h(r16, String.valueOf(r31));
        goto L38
    L35:
        r31 = null;
    L38:
        r20 = r30 >> r112;
        r23 = r23 + 1;
        goto L24
    L37:
        r30 = r20;
        goto L38
    L40:
        if (r21 == r112) goto L41;
    L44:
        int r114 = r14;
    L80:
        int r32 = 8;
    L84:
        r7 = r27 >> r32;
        r14 = r114 + 1;
        r10 = r32;
        r11 = r17;
        r12 = r22;
        r2 = r26;
        r1 = r34;
    L41:
        if (r113 == r111) goto L44;
        r113 = r113 + 1;
        r7 = r27;
        r112 = 8;
        goto L21
    L43:
        r27 = r7;
        goto L44
    L45:
        r26 = r2;
        r27 = r7;
        Object[] r33 = r18.b;
        long[] r35 = r18.a;
        int r36 = r35.length - 2;
        if (r36 < 0) goto L44;
        long[] r115 = r35;
        int r37 = 0;
    L48:
        long r38 = r115[r37];
        long[] r210 = r115;
        r114 = r14;
        if (((((~r38) << r17) & r38) & r22) == r22) goto L78;
        int r116 = 8 - ((~(r37 - r36)) >>> 31);
        int r117 = 0;
    L51:
        if (r117 >= r116) goto L77;
        if ((r38 & 255) >= 128) goto L74;
        long r39 = r38;
        p94 r40 = (p94) r33[(r37 << 3) + r117];
        p94 r41 = n94.z;
        if (h12.c(r40, r41) == false) goto L75;
        Object r42 = r13.a.n.g(r41);
        if (r42 != null) goto L59;
        r42 = null;
    L59:
        List r43 = (List) r42;
        if (r43 == null) goto L62;
        he r44 = (he) q40.x0(r43);
    L63:
        Object r45 = r18.g(r41);
        if (r45 != null) goto L66;
        r45 = null;
    L66:
        List r46 = (List) r45;
        if (r46 == null) goto L69;
        he r47 = (he) q40.x0(r46);
    L71:
        if (h12.c(r44, r47) == true) goto L75;
        h(r16, String.valueOf(r47));
        goto L75
    L69:
        r47 = null;
        goto L71
    L62:
        r44 = null;
    L75:
        r117 = r117 + 1;
        r38 = r39 >> 8;
        goto L51
    L74:
        r39 = r38;
        goto L75
    L77:
        if (r116 != 8) goto L80;
    L78:
        if (r37 == r36) goto L80;
        r37 = r37 + 1;
        r14 = r114;
        r115 = r210;
        goto L48
    L82:
        throw xa3.l("no value for specified key");
    L14:
        r15 = null;
        goto L15
    L83:
        r26 = r2;
        r27 = r7;
        r17 = r11;
        r22 = r12;
        r114 = r14;
        r32 = r10;
        goto L84
    L85:
        int[] r211 = r2;
        if (r9 != r10) goto L107;
    L89:
        if (r6 == r4) goto L108;
        r6 = r6 + 1;
        r1 = r34;
        r2 = r211;
        goto L5
    L108:
        return;
    L107:
        return;
    L88:
        r211 = r2;
        goto L89
    }

    public final e02 d() {
        if (this.t == false) goto L6;
        this.t = false;
        int r3 = 5;
        this.v = wr1.o(this.n.getSemanticsOwner(), new k2(r3, 0));
        this.w = System.currentTimeMillis();
    L6:
        return this.v;
    }

    public final boolean e() {
        if (this.p == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final void f() {
        gp3 r0 = this.p;
        if (r0 == null) goto L43;
        Object r1 = r0.o;
        if (Build.VERSION.SDK_INT < 29) goto L44;
        ArrayList r9 = this.q;
        if (r9.isEmpty() == true) goto L42;
        int r2 = r9.size();
        int r5 = 0;
    L12:
        if (r5 >= r2) goto L30;
        yc0 r7 = (yc0) r9.get(r5);
        int r8 = r7.c.ordinal();
        if (r8 == 0) goto L23;
        if (r8 != 1) goto L21;
        AutofillId r6 = r0.q(r7.a);
        if (r6 == null) goto L28;
        if (Build.VERSION.SDK_INT < 29) goto L28;
        yh.g(kz.d(r1), r6);
    L28:
        r5 = r5 + 1;
        goto L12
    L21:
        er1.n();
        return;
    L23:
        oz4 r10 = r7.d;
        if (r10 == null) goto L28;
        ViewStructure r11 = (ViewStructure) r10.n;
        if (Build.VERSION.SDK_INT < 29) goto L28;
        yh.f(kz.d(r1), r11);
        goto L28
    L30:
        if (Build.VERSION.SDK_INT < 29) goto L32;
        ContentCaptureSession r3 = kz.d(r1);
        hg3 r4 = bu.l((View) r0.p);
        Objects.requireNonNull(r4);
        yh.i(r3, tn.f(r4.o), new long[]{Long.MIN_VALUE});
    L32:
        r9.clear();
        return;
    L42:
        return;
    L44:
        return;
    }

    public final void g(i94 r10, j94 r11) {
        int r1 = 0;
        ib r0 = new ib(r1, r11, this);
        r10.getClass();
        List r2 = i94.j(4, r10);
        int r3 = r2.size();
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r3) goto L8;
        Object r6 = r2.get(r4);
        if (d().a(((i94) r6).f) == false) goto L7;
        r0.invoke(Integer.valueOf(r5), r6);
        r5 = r5 + 1;
    L7:
        r4 = r4 + 1;
        goto L3
    L8:
        List r12 = i94.j(4, r10);
        int r13 = r12.size();
    L9:
        if (r1 >= r13) goto L20;
        i94 r7 = (i94) r12.get(r1);
        e02 r8 = d();
        int r9 = r7.f;
        if (r8.a(r9) == false) goto L19;
        i03 r14 = this.x;
        if (r14.a(r9) == false) goto L19;
        Object r15 = r14.b(r9);
        if (r15 == null) goto L18;
        g(r7, (j94) r15);
        goto L19
    L18:
        throw xa3.l("node not present in pruned tree before this change");
    L19:
        r1 = r1 + 1;
        goto L9
    }

    public final void h(int r5, String r6) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 29) goto L16;
        gp3 r4 = this.p;
        if (r4 == null) goto L17;
        AutofillId r7 = r4.q(r5);
        if (r7 == null) goto L14;
        if (r0 < 29) goto L15;
        yh.h(kz.d(r4.o), r7, r6);
        return;
    L15:
        return;
    L14:
        throw xa3.l("Invalid content capture ID");
    L17:
        return;
    }

    public final void i(int r19, i94 r20) {
        if (e() == true) goto L5;
        return;
    L5:
        w03 r2 = r20.d.n;
        Object r3 = r2.g(n94.B);
        f63 r4 = null;
        if (r3 != null) goto L8;
        r3 = null;
    L8:
        Boolean r5 = (Boolean) r3;
        if (this.s != jb.n) goto L21;
        if (h12.c(r5, Boolean.TRUE) == false) goto L21;
        Object r6 = r2.g(d94.m);
        if (r6 != null) goto L15;
        r6 = null;
    L15:
        w2 r7 = (w2) r6;
        if (r7 == null) goto L32;
        if1 r8 = (if1) r7.b;
        if (r8 == null) goto L32;
        Boolean r9 = (Boolean) r8.invoke(Boolean.FALSE);
    L32:
        int r10 = r20.f;
        gp3 r11 = this.p;
        int r12 = 0;
        if (r11 != null) goto L35;
    L34:
        oz4 r13 = null;
    L107:
        if (r13 == null) goto L110;
        this.q.add(new yc0(r10, this.w, zc0.n, r13));
    L110:
        List r1 = i94.j(4, r20);
        int r14 = r1.size();
        int r15 = 0;
    L111:
        if (r12 >= r14) goto L116;
        Object r16 = r1.get(r12);
        if (d().a(((i94) r16).f) == false) goto L115;
        i(r15, (i94) r16);
        r15 = r15 + 1;
    L115:
        r12 = r12 + 1;
        goto L111
    L116:
        return;
    L35:
        int r17 = Build.VERSION.SDK_INT;
        if (r17 < 29) goto L34;
        hg3 r18 = bu.l(this.n);
        if (r18 == null) goto L34;
        i94 r21 = r20.l();
        int r110 = r20.f;
        if (r21 == null) goto L46;
        AutofillId r22 = r11.q(r21.f);
        if (r22 == null) goto L34;
    L47:
        long r111 = r110;
        if (r17 < 29) goto L50;
        oz4 r23 = new oz4(yh.e(kz.d(r11.o), r22, r111));
    L51:
        if (r23 == null) goto L34;
        ViewStructure r112 = (ViewStructure) r23.n;
        e94 r24 = r20.d;
        p94 r25 = n94.J;
        w03 r26 = r24.n;
        if (r26.c(r25) == true) goto L34;
        Bundle r27 = r112.getExtras();
        if (r27 == null) goto L59;
        r27.putLong("android.view.contentcapture.EventTimestamp", this.w);
        r27.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", r19);
    L59:
        Object r28 = r26.g(n94.x);
        if (r28 != null) goto L62;
        r28 = null;
    L62:
        String r29 = (String) r28;
        if (r29 == null) goto L65;
        r112.setId(r110, null, null, r29);
    L65:
        Object r30 = r26.g(n94.m);
        if (r30 != null) goto L69;
        r30 = null;
    L69:
        if (((Boolean) r30) == null) goto L71;
        r112.setClassName("android.widget.ViewGroup");
    L71:
        Object r31 = r26.g(n94.z);
        if (r31 != null) goto L74;
        r31 = null;
    L74:
        List r32 = (List) r31;
        if (r32 == null) goto L77;
        r112.setClassName("android.widget.TextView");
        r112.setText(gc2.a(r32, "\n", null, 62));
    L77:
        Object r33 = r26.g(n94.D);
        if (r33 != null) goto L80;
        r33 = null;
    L80:
        he r34 = (he) r33;
        if (r34 == null) goto L83;
        r112.setClassName("android.widget.EditText");
        r112.setText(r34);
    L83:
        Object r35 = r26.g(n94.a);
        if (r35 != null) goto L86;
        r35 = null;
    L86:
        List r36 = (List) r35;
        if (r36 == null) goto L89;
        r112.setContentDescription(gc2.a(r36, "\n", null, 62));
    L89:
        Object r37 = r26.g(n94.w);
        if (r37 != null) goto L93;
        r37 = null;
    L93:
        if (((m24) r37) == null) goto L95;
        r112.setClassName("android.widget.ImageView");
    L95:
        ms4 r38 = gh0.p(r24);
        if (r38 == null) goto L98;
        ls4 r39 = r38.a;
        zs4 r40 = r39.b;
        oo0 r41 = r39.g;
        r112.setTextStyle(r41.J() * (r41.g() * bt4.c(r40.a.b)), 0, 0, 0);
    L98:
        f63 r42 = r20.d();
        if (r42 != null) goto L101;
    L105:
        wv3 r43 = wv3.e;
    L106:
        float r44 = r43.a;
        float r45 = r43.b;
        r112.setDimens((int) r44, (int) r45, 0, 0, (int) (r43.c - r44), (int) (r43.d - r45));
        r13 = r23;
        goto L107
    L101:
        if (r42.A0().A == false) goto L103;
        r4 = r42;
    L103:
        if (r4 == null) goto L105;
        r43 = r20.a(r4);
        goto L106
    L50:
        r23 = null;
        goto L51
    L46:
        r22 = tn.f(r18.o);
    L21:
        if (this.s != jb.o) goto L32;
        if (h12.c(r5, Boolean.FALSE) == false) goto L32;
        Object r46 = r2.g(d94.m);
        if (r46 != null) goto L27;
        r46 = null;
    L27:
        w2 r47 = (w2) r46;
        if (r47 == null) goto L32;
        if1 r48 = (if1) r47.b;
        if (r48 == null) goto L32;
        Boolean r49 = (Boolean) r48.invoke(Boolean.TRUE);
        goto L32
    }

    public final void k(i94 r8) {
        if (e() == false) goto L8;
        yc0 r1 = new yc0(r8.f, this.w, zc0.o, null);
        this.q.add(r1);
        List r9 = i94.j(4, r8);
        int r0 = r9.size();
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L10;
        k((i94) r9.get(r2));
        r2 = r2 + 1;
        goto L6
    L10:
        return;
    }

    public final void l() {
        i03 r1 = this.x;
        r1.c();
        e02 r2 = d();
        int[] r3 = r2.b;
        Object[] r4 = r2.c;
        long[] r5 = r2.a;
        int r6 = r5.length - 2;
        if (r6 < 0) goto L16;
        int r7 = 0;
    L5:
        long r8 = r5[r7];
        if (((((~r8) << 7) & r8) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L14;
        int r10 = 8 - ((~(r7 - r6)) >>> 31);
        int r12 = 0;
    L8:
        if (r12 >= r10) goto L13;
        if ((255 & r8) >= 128) goto L12;
        int r13 = (r7 << 3) + r12;
        r1.i(r3[r13], new j94(((k94) r4[r13]).a, d()));
    L12:
        r8 = r8 >> 8;
        r12 = r12 + 1;
        goto L8
    L13:
        if (r10 != 8) goto L16;
    L14:
        if (r7 == r6) goto L16;
        r7 = r7 + 1;
    L16:
        this.y = new j94(this.n.getSemanticsOwner().a(), d());
    }

    @Override // defpackage.rl0
    public final void onStart(ba2 r2) {
        this.p = (gp3) this.o.invoke();
        i(-1, this.n.getSemanticsOwner().a());
        f();
    }

    @Override // defpackage.rl0
    public final void onStop(ba2 r1) {
        k(this.n.getSemanticsOwner().a());
        f();
        this.p = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r2) {
        Handler r3 = this.n.getHandler();
        r3.getClass();
        r3.removeCallbacks(this.A);
        this.p = null;
    }
}
