package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xz1 extends ma5 implements Runnable, r83, View.OnAttachStateChangeListener {
    public boolean p;
    public int q;
    public pb5 r;
    public final w03 s;
    public final wd3 t;
    public final q03 u;
    public final rh4 v;

    public xz1() {
        super(1);
        w03 r0 = new w03(9);
        wb5.a.getClass();
        r0.l(vb5.b, new jc5("caption bar"));
        r0.l(vb5.c, new jc5("display cutout"));
        r0.l(vb5.d, new jc5("ime"));
        r0.l(vb5.e, new jc5("mandatory system gestures"));
        r0.l(vb5.f, new jc5("navigation bars"));
        r0.l(vb5.g, new jc5("status bars"));
        r0.l(vb5.h, new jc5("system gestures"));
        r0.l(vb5.i, new jc5("tappable element"));
        r0.l(vb5.j, new jc5("waterfall"));
        this.s = r0;
        this.t = new wd3(0);
        this.u = new q03(4);
        this.v = new rh4();
    }

    @Override // defpackage.ma5
    public final void a(ta5 r6) {
        boolean r0 = false;
        this.p = false;
        int r7 = r6.a.d();
        this.q &= ~r7;
        this.r = null;
        wb5 r8 = (wb5) yb5.a.b(r7);
        if (r8 == null) goto L18;
        Object r9 = this.s.g(r8);
        r9.getClass();
        jc5 r10 = (jc5) r9;
        r10.c.h(0.0f);
        r10.e.h(1.0f);
        r10.d.g(0);
        r10.c.h(0.0f);
        r10.b.setValue(Boolean.FALSE);
        r10.j = -1;
        r10.k = -1;
        wd3 r5 = this.t;
        r5.h(r5.g() + 1);
        Object r11 = jh4.c;
        monitor-enter(r11);
        x03 r12 = jh4.j.h;     // Catch: Throwable -> L15
        if (r12 == null) goto L11;
        if (r12.h() != true) goto L11;
        r0 = true;
    L11:
        monitor-exit(r11);
        if (r0 == false) goto L21;
        jh4.a();
        return;
    L21:
        return;
    L15:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.ma5
    public final void b(ta5 r1) {
        this.p = true;
    }

    @Override // defpackage.ma5
    public final pb5 c(pb5 r7, List r8) {
        int r0 = r8.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L10;
        ta5 r2 = (ta5) r8.get(r1);
        int r3 = r2.a.d();
        wb5 r4 = (wb5) yb5.a.b(r3);
        if (r4 == null) goto L9;
        Object r5 = this.s.g(r4);
        r5.getClass();
        jc5 r6 = (jc5) r5;
        if (((Boolean) r6.b.getValue()).booleanValue() == false) goto L9;
        sa5 r9 = r2.a;
        float r10 = r9.c();
        r6.c.h(r10);
        float r11 = r9.a();
        r6.e.h(r11);
        long r12 = r9.b();
        r6.d.g(r12);
    L9:
        r1 = r1 + 1;
        goto L3
    L10:
        e(r7);
        return r7;
    }

    @Override // defpackage.ma5
    public final qr2 d(ta5 r9, qr2 r10) {
        pb5 r0 = this.r;
        boolean r1 = false;
        this.p = false;
        this.r = null;
        if (r9.a.b() <= 0) goto L23;
        if (r0 == null) goto L23;
        int r2 = r9.a.d();
        this.q |= r2;
        wb5 r3 = (wb5) yb5.a.b(r2);
        if (r3 == null) goto L23;
        Object r4 = this.s.g(r3);
        r4.getClass();
        jc5 r5 = (jc5) r4;
        vz1 r6 = r0.a.h(r2);
        long r7 = (((((long) r6.a) << 48) | (((long) r6.b) << 32)) | (((long) r6.c) << 16)) | ((long) r6.d);
        long r8 = r5.h;
        if (te5.o(r7, r8) == true) goto L23;
        r5.j = r8;
        r5.k = r7;
        r5.b.setValue(Boolean.TRUE);
        sa5 r11 = r9.a;
        r5.c.h(r11.c());
        r5.e.h(r11.a());
        r5.d.g(r11.b());
        wd3 r12 = this.t;
        r12.h(r12.g() + 1);
        Object r13 = jh4.c;
        monitor-enter(r13);
        x03 r14 = jh4.j.h;     // Catch: Throwable -> L20
        if (r14 == null) goto L16;
        if (r14.h() != true) goto L16;
        r1 = true;
    L16:
        monitor-exit(r13);
        if (r1 == false) goto L23;
        jh4.a();
        return r10;
    L20:
        th = move-exception;
        throw th;
    L23:
        return r10;
    }

    public final void e(pb5 r28) {
        i03 r2 = yb5.a;
        int[] r3 = r2.b;
        Object[] r4 = r2.c;
        long[] r5 = r2.a;
        int r6 = r5.length - 2;
        if (r6 < 0) goto L33;
        int r13 = 0;
        boolean r14 = false;
        boolean r15 = false;
        char r16 = 16;
        char r17 = ' ';
    L5:
        long r7 = r5[r13];
        boolean r18 = true;
        if (((((~r7) << 7) & r7) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L30;
        int r12 = 8;
        int r11 = 8 - ((~(r13 - r6)) >>> 31);
        int r8 = 0;
        char r19 = '0';
    L8:
        if (r8 >= r11) goto L27;
        if ((r7 & 255) >= 128) goto L25;
        int r20 = (r13 << 3) + r8;
        int r110 = r3[r20];
        wb5 r9 = (wb5) r4[r20];
        vz1 r10 = r28.a.h(r110);
        long r21 = (((((long) r10.a) << 48) | (((long) r10.b) << 32)) | (((long) r10.c) << 16)) | ((long) r10.d);
        Object r22 = this.s.g(r9);
        r22.getClass();
        jc5 r23 = (jc5) r22;
        if (te5.o(r21, r23.h) == true) goto L17;
        r23.h = r21;
        r14 = true;
        if (te5.o(r21, 0) == true) goto L17;
        r15 = true;
    L17:
        if (r110 == 8) goto L23;
        vz1 r24 = r28.a.i(r110);
        Object[] r111 = r4;
        long r25 = (((((long) r24.b) << 32) | (((long) r24.a) << 48)) | (((long) r24.c) << 16)) | ((long) r24.d);
        if (te5.o(r23.i, r25) == true) goto L24;
        r23.i = r25;
        r14 = true;
        if (te5.o(r25, 0) == true) goto L24;
        r15 = true;
    L24:
        r23.a.setValue(Boolean.valueOf(r28.a.t(r110)));
        int r26 = 8;
    L26:
        r7 = r7 >> r26;
        r8 = r8 + 1;
        r12 = r26;
        r4 = r111;
        r5 = r5;
        r3 = r3;
        goto L8
    L23:
        r111 = r4;
        goto L24
    L25:
        r111 = r4;
        r26 = r12;
        goto L26
    L27:
        long[] r27 = r5;
        int[] r29 = r3;
        Object[] r112 = r4;
        if (r11 != r12) goto L34;
    L31:
        if (r13 == r6) goto L34;
        r13 = r13 + 1;
        r4 = r112;
        r5 = r27;
        r3 = r29;
    L34:
        tr0 r1 = r28.a.g();
        if (r1 != null) goto L38;
        long r30 = 0;
    L42:
        w03 r31 = this.s;
        wb5.a.getClass();
        Object r32 = r31.g(vb5.j);
        r32.getClass();
        jc5 r33 = (jc5) r32;
        r33.a.setValue(Boolean.valueOf(!te5.o(r30, 0)));
        if (te5.o(r33.h, r30) == true) goto L47;
        r33.h = r30;
        r33.i = r30;
        r14 = r18;
        if (te5.o(r30, 0) == true) goto L47;
        r15 = r14;
    L47:
        if (r1 != null) goto L52;
        q03 r34 = this.u;
        if (r34.b <= 0) goto L70;
        r34.d();
        this.v.clear();
        r14 = r18;
    L70:
        if (r15 == false) goto L72;
    L73:
        if (r14 == false) goto L102;
        wd3 r0 = this.t;
        r0.h(r0.g() + 1);
        Object r35 = jh4.c;
        monitor-enter(r35);
        x03 r36 = jh4.j.h;     // Catch: Throwable -> L87
        if (r36 == null) goto L82;
        boolean r37 = r18;
        if (r36.h() != r37) goto L82;
        boolean r113 = r37;
    L83:
        monitor-exit(r35);
        if (r113 == false) goto L103;
        jh4.a();
        return;
    L103:
        return;
    L82:
        r113 = false;
    L87:
        th = move-exception;
        throw th;
    L102:
        return;
    L72:
        if (this.t.g() != 0) goto L73;
        return;
    L52:
        if (Build.VERSION.SDK_INT < 28) goto L54;
        List r38 = ne.c(r1.a);
    L55:
        int r39 = r38.size();
        q03 r40 = this.u;
        if (r39 >= r40.b) goto L58;
        r40.l(r38.size(), this.u.b);
        this.v.e(r38.size(), this.v.size());
        r14 = r18;
    L61:
        int r41 = r38.size();
        int r42 = 0;
    L62:
        if (r42 >= r41) goto L68;
        Rect r43 = (Rect) r38.get(r42);
        b13 r44 = (b13) this.u.f(r42);
        if (h12.c(r44.getValue(), r43) == true) goto L66;
        r44.setValue(r43);
        r14 = r18;
    L66:
        r42 = r42 + 1;
        goto L62
    L68:
        if (r38.isEmpty() == true) goto L70;
        r15 = r18;
        goto L70
    L58:
        int r45 = r38.size() - this.u.b;
        int r46 = 0;
    L59:
        if (r46 >= r45) goto L61;
        q03 r47 = this.u;
        r47.a(uc5.B(r38.get(r47.b)));
        this.v.add(new jz1(f34.f(this.u.b, "display cutout rect ")));
        r46 = r46 + 1;
        r14 = r18;
        goto L59
    L54:
        r38 = Collections.EMPTY_LIST;
        goto L55
    L38:
        if (Build.VERSION.SDK_INT < 30) goto L40;
        vz1 r48 = vz1.c(p3.d(r1.a));
    L41:
        r30 = (((((long) r48.a) << r19) | (((long) r48.b) << r17)) | (((long) r48.c) << r16)) | ((long) r48.d);
        goto L42
    L40:
        r48 = vz1.e;
        goto L41
    L30:
        r27 = r5;
        r29 = r3;
        r112 = r4;
        r19 = '0';
        goto L31
    L33:
        r16 = 16;
        r17 = ' ';
        r18 = true;
        r19 = '0';
        r14 = false;
        r15 = false;
        goto L34
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r3) {
        Object r0 = r3.getParent();
        if ((r0 instanceof View) == false) goto L5;
        View r1 = (View) r0;
    L6:
        if (r1 == null) goto L9;
        r3 = r1;
    L9:
        WeakHashMap r2 = j65.a;
        a65.c(r3, this);
        j65.q(r3, this);
        return;
    L5:
        r1 = null;
        goto L6
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r3) {
        Object r2 = r3.getParent();
        if ((r2 instanceof View) == false) goto L5;
        View r4 = (View) r2;
    L6:
        if (r4 == null) goto L9;
        r3 = r4;
    L9:
        WeakHashMap r5 = j65.a;
        a65.c(r3, null);
        j65.q(r3, null);
        return;
    L5:
        r4 = null;
        goto L6
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.p == false) goto L8;
        this.q = 0;
        this.p = false;
        pb5 r0 = this.r;
        if (r0 == null) goto L9;
        e(r0);
        this.r = null;
        return;
    L9:
        return;
    }

    @Override // defpackage.r83
    public final pb5 x(View r3, pb5 r4) {
        if (this.p == false) goto L9;
        this.r = r4;
        if (Build.VERSION.SDK_INT != 30) goto L11;
        r3.post(this);
        return r4;
    L11:
        return r4;
    L9:
        if (this.q != 0) goto L11;
        e(r4);
        goto L11
    }
}
