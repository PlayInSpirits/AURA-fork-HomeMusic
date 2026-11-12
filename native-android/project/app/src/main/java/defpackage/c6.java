package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c6 {
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public c6() {
        this.b = new rp1[32];
        this.c = new float[32];
        this.d = new byte[32];
        x03 r0 = w54.a;
        this.e = new x03();
        this.f = new x03();
    }

    public static c6 f(Context r8, int r9) {
        if (r9 == 0) goto L5;
        boolean r2 = true;
    L6:
        l93.j("Cannot create a CalendarItemStyle with a styleResId of 0", r2);
        TypedArray r10 = r8.obtainStyledAttributes(r9, ht3.y);
        Rect r5 = new Rect(r10.getDimensionPixelOffset(0, 0), r10.getDimensionPixelOffset(2, 0), r10.getDimensionPixelOffset(1, 0), r10.getDimensionPixelOffset(3, 0));
        ColorStateList r0 = h12.s(r8, r10, 4);
        ColorStateList r3 = h12.s(r8, r10, 9);
        ColorStateList r4 = h12.s(r8, r10, 7);
        int r6 = r10.getDimensionPixelSize(8, 0);
        bc4 r11 = bc4.a(r8, r10.getResourceId(5, 0), r10.getResourceId(6, 0)).a();
        r10.recycle();
        c6 r12 = new c6();
        l93.k(r5.left);
        l93.k(r5.top);
        l93.k(r5.right);
        l93.k(r5.bottom);
        r12.b = r5;
        r12.c = r3;
        r12.d = r0;
        r12.e = r4;
        r12.a = r6;
        r12.f = r11;
        return r12;
    L5:
        r2 = false;
        goto L6
    }

    public void A(TextView r12) {
        ColorStateList r0 = (ColorStateList) this.c;
        fi2 r1 = new fi2();
        fi2 r2 = new fi2();
        bc4 r3 = (bc4) this.f;
        r1.setShapeAppearanceModel(r3);
        r2.setShapeAppearanceModel(r3);
        r1.m((ColorStateList) this.d);
        float r4 = this.a;
        ColorStateList r5 = (ColorStateList) this.e;
        r1.r(r4);
        r1.q(r5);
        r12.setTextColor(r0);
        RippleDrawable r6 = new RippleDrawable(r0.withAlpha(30), r1, r2);
        Rect r11 = (Rect) this.b;
        InsetDrawable r7 = new InsetDrawable(r6, r11.left, r11.top, r11.right, r11.bottom);
        WeakHashMap r13 = j65.a;
        r12.setBackground(r7);
    }

    public int B(int r10, int r11) {
        jo3 r0 = (jo3) this.b;
        ArrayList r9 = (ArrayList) this.d;
        int r1 = r9.size() - 1;
    L4:
        if (r1 < 0) goto L39;
        b6 r4 = (b6) r9.get(r1);
        int r5 = r4.a;
        int r6 = r4.b;
        if (r5 != 8) goto L29;
        int r3 = r4.d;
        if (r6 >= r3) goto L10;
        int r8 = r3;
        int r7 = r6;
    L11:
        if (r10 < r7) goto L24;
        if (r10 > r8) goto L24;
        if (r7 != r6) goto L19;
        if (r11 != 1) goto L16;
        r4.d = r3 + 1;
    L18:
        r10 = r10 + 1;
    L38:
        r1 = r1 - 1;
        goto L4
    L16:
        if (r11 != 2) goto L18;
        r4.d = r3 - 1;
        goto L18
    L19:
        if (r11 != 1) goto L21;
        r4.b = r6 + 1;
    L23:
        r10 = r10 - 1;
        goto L38
    L21:
        if (r11 != 2) goto L23;
        r4.b = r6 - 1;
    L24:
        if (r10 >= r6) goto L38;
        if (r11 != 1) goto L27;
        r4.b = r6 + 1;
        r4.d = r3 + 1;
        goto L38
    L27:
        if (r11 != 2) goto L38;
        r4.b = r6 - 1;
        r4.d = r3 - 1;
        goto L38
    L10:
        r7 = r3;
        r8 = r6;
        goto L11
    L29:
        if (r6 > r10) goto L34;
        if (r5 != 1) goto L32;
        r10 = r10 - r4.d;
        goto L38
    L32:
        if (r5 != 2) goto L38;
        r10 = r10 + r4.d;
        goto L38
    L34:
        if (r11 != 1) goto L36;
        r4.b = r6 + 1;
        goto L38
    L36:
        if (r11 != 2) goto L38;
        r4.b = r6 - 1;
        goto L38
    L39:
        int r12 = r9.size() - 1;
    L40:
        if (r12 < 0) goto L50;
        b6 r2 = (b6) r9.get(r12);
        int r13 = r2.a;
        int r14 = r2.d;
        if (r13 == 8) goto L44;
        if (r14 > 0) goto L49;
        r9.remove(r12);
        r2.c = null;
        r0.a(r2);
    L49:
        r12 = r12 - 1;
        goto L40
    L44:
        if (r14 == r2.b) goto L46;
        if (r14 >= 0) goto L49;
    L46:
        r9.remove(r12);
        r2.c = null;
        r0.a(r2);
        goto L49
    L50:
        return r10;
    }

    public void C(Object r4) {
        Object r0 = this.e;
        this.e = r4;
        if (r0.equals(r4) == true) goto L6;
        i41 r3 = ((u31) this.d).o;
        ((Integer) r0).getClass();
        Integer r5 = (Integer) r4;
        int r1 = r5.intValue();
        r3.z1();
        r3.q1(1, 10, r5);
        r3.q1(2, 10, r5);
        r3.n.f(21, new ij0(r1, 2));
        return;
    }

    public void a(long r10, be3 r12) {
        ArrayDeque r0 = (ArrayDeque) this.d;
        PriorityQueue r1 = (PriorityQueue) this.e;
        if (r10 == (-9223372036854775807L)) goto L34;
        int r3 = this.a;
        if (r3 == 0) goto L34;
        if (r3 != (-1)) goto L9;
    L13:
        ArrayDeque r4 = (ArrayDeque) this.c;
        if (r4.isEmpty() == false) goto L16;
        be3 r5 = new be3();
    L17:
        r5.K(r12.a());
        boolean r8 = false;
        System.arraycopy(r12.a, r12.b, r5.a, 0, r5.a());
        fz3 r13 = (fz3) this.f;
        if (r13 == null) goto L24;
        if (r10 != r13.o) goto L24;
        r13.n.add(r5);
        return;
    L24:
        if (r0.isEmpty() == false) goto L26;
        fz3 r14 = new fz3();
    L27:
        ArrayList r2 = r14.n;
        if (r10 == (-9223372036854775807L)) goto L30;
        r8 = true;
    L30:
        rr2.l(r8);
        rr2.w(r2.isEmpty());
        r14.o = r10;
        r2.add(r5);
        r1.add(r14);
        this.f = r14;
        int r11 = this.a;
        if (r11 == (-1)) goto L36;
        j(r11);
        return;
    L36:
        return;
    L26:
        r14 = (fz3) r0.pop();
        goto L27
    L16:
        r5 = (be3) r4.pop();
        goto L17
    L9:
        if (r1.size() < this.a) goto L13;
        fz3 r6 = (fz3) r1.peek();
        String r7 = f35.a;
        if (r10 >= r6.o) goto L13;
    L34:
        ((gz3) this.b).k(r10, r12);
    }

    public void b() {
        View r0 = (View) this.b;
        Drawable r1 = r0.getBackground();
        if (r1 != null) goto L5;
        return;
    L5:
        if (((la0) this.d) != null) goto L7;
    L21:
        la0 r2 = (la0) this.e;
        if (r2 == null) goto L25;
        fg.e(r1, r2, r0.getDrawableState());
        return;
    L25:
        la0 r5 = (la0) this.d;
        if (r5 == null) goto L30;
        fg.e(r1, r5, r0.getDrawableState());
        return;
    L30:
        return;
    L7:
        if (((la0) this.f) != null) goto L9;
        this.f = new la0();
    L9:
        la0 r3 = (la0) this.f;
        r3.p = null;
        r3.o = false;
        r3.q = null;
        r3.n = false;
        WeakHashMap r4 = j65.a;
        ColorStateList r6 = r0.getBackgroundTintList();
        if (r6 == null) goto L12;
        r3.o = true;
        r3.p = r6;
    L12:
        PorterDuff.Mode r7 = r0.getBackgroundTintMode();
        if (r7 == null) goto L16;
        r3.n = true;
        r3.q = r7;
    L16:
        if (r3.o == false) goto L18;
    L19:
        fg.e(r1, r3, r0.getDrawableState());
        return;
    L18:
        if (r3.n == false) goto L21;
        goto L19
    }

    public boolean c(int r9) {
        ArrayList r0 = (ArrayList) this.d;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L17;
        b6 r4 = (b6) r0.get(r3);
        int r5 = r4.a;
        if (r5 == 8) goto L7;
        if (r5 != 1) goto L16;
        int r6 = r4.b;
        int r7 = r4.d + r6;
    L11:
        if (r6 >= r7) goto L16;
        if (i(r6, r3 + 1) == r9) goto L14;
        r6 = r6 + 1;
    L14:
        return true;
    L16:
        r3 = r3 + 1;
        goto L3
    L7:
        if (i(r4.d, r3 + 1) != r9) goto L16;
    L17:
        return false;
    }

    public void d() {
        ArrayList r0 = (ArrayList) this.d;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        ((si1) this.e).C((b6) r0.get(r3));
        r3 = r3 + 1;
        goto L3
    L5:
        t(r0);
        this.a = 0;
    }

    public void e() {
        si1 r0 = (si1) this.e;
        d();
        ArrayList r1 = (ArrayList) this.c;
        int r2 = r1.size();
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L18;
        b6 r5 = (b6) r1.get(r4);
        int r6 = r5.a;
        if (r6 != 1) goto L7;
        r0.C(r5);
        r0.G(r5.b, r5.d);
    L17:
        r4 = r4 + 1;
        goto L3
    L7:
        if (r6 != 2) goto L9;
        r0.C(r5);
        int r7 = r5.b;
        int r8 = r5.d;
        RecyclerView r9 = (RecyclerView) r0.o;
        r9.U(r7, r8, true);
        r9.x0 = true;
        r9.u0.c += r8;
        goto L17
    L9:
        if (r6 != 4) goto L11;
        r0.C(r5);
        r0.F(r5.b, r5.d, r5.c);
        goto L17
    L11:
        if (r6 != 8) goto L17;
        r0.C(r5);
        r0.H(r5.b, r5.d);
        goto L17
    L18:
        t(r1);
        this.a = 0;
    }

    public void g(b6 r14) {
        jo3 r0 = (jo3) this.b;
        int r1 = r14.a;
        if (r1 != 1) goto L5;
    L34:
        kf2.n("should not dispatch add or move for pre layout");
        return;
    L5:
        if (r1 == 8) goto L34;
        int r2 = B(r14.b, r1);
        int r3 = r14.b;
        int r4 = r14.a;
        if (r4 == 2) goto L12;
        if (r4 != 4) goto L10;
        int r5 = 1;
    L13:
        int r7 = 1;
        int r8 = 1;
    L15:
        if (r7 >= r14.d) goto L30;
        int r9 = B((r5 * r7) + r14.b, r14.a);
        int r11 = r14.a;
        if (r11 == 2) goto L23;
        if (r11 == 4) goto L21;
    L25:
        b6 r6 = o(r14.c, r11, r2, r8);
        h(r6, r3);
        r6.c = null;
        r0.a(r6);
        if (r14.a != 4) goto L28;
        r3 = r3 + r8;
    L28:
        r8 = 1;
        r2 = r9;
    L29:
        r7 = r7 + 1;
        goto L15
    L21:
        if (r9 != (r2 + 1)) goto L25;
    L24:
        r8 = r8 + 1;
        goto L29
    L23:
        if (r9 != r2) goto L25;
    L30:
        Object r10 = r14.c;
        r14.c = null;
        r0.a(r14);
        if (r8 <= 0) goto L39;
        b6 r15 = o(r10, r14.a, r2, r8);
        h(r15, r3);
        r15.c = null;
        r0.a(r15);
        return;
    L39:
        return;
    L10:
        mj0.l(r14, "op should be remove or update.");
        return;
    L12:
        r5 = 0;
        goto L13
    }

    public void h(b6 r3, int r4) {
        si1 r2 = (si1) this.e;
        r2.C(r3);
        int r0 = r3.a;
        if (r0 != 2) goto L5;
        int r5 = r3.d;
        RecyclerView r6 = (RecyclerView) r2.o;
        r6.U(r4, r5, true);
        r6.x0 = true;
        r6.u0.c += r5;
        return;
    L5:
        if (r0 != 4) goto L8;
        r2.F(r4, r3.d, r3.c);
        return;
    L8:
        kf2.n("only remove and update ops can be dispatched in first pass");
    }

    public int i(int r6, int r7) {
        ArrayList r5 = (ArrayList) this.d;
        int r0 = r5.size();
    L3:
        if (r7 >= r0) goto L25;
        b6 r1 = (b6) r5.get(r7);
        int r2 = r1.a;
        int r3 = r1.b;
        if (r2 != 8) goto L13;
        if (r3 != r6) goto L8;
        r6 = r1.d;
    L24:
        r7 = r7 + 1;
        goto L3
    L8:
        if (r3 >= r6) goto L11;
        r6 = r6 - 1;
    L11:
        if (r1.d > r6) goto L24;
        r6 = r6 + 1;
        goto L24
    L13:
        if (r3 > r6) goto L24;
        if (r2 != 2) goto L22;
        int r4 = r1.d;
        if (r6 < (r3 + r4)) goto L18;
        r6 = r6 - r4;
        goto L24
    L18:
        return -1;
    L22:
        if (r2 != 1) goto L24;
        r6 = r6 + r1.d;
        goto L24
    L25:
        return r6;
    }

    public void j(int r9) {
        PriorityQueue r0 = (PriorityQueue) this.e;
    L4:
        if (r0.size() <= r9) goto L15;
        fz3 r1 = (fz3) r0.poll();
        String r2 = f35.a;
        int r3 = 0;
    L6:
        ArrayList r4 = r1.n;
        if (r3 >= r4.size()) goto L9;
        ((gz3) this.b).k(r1.o, (be3) r4.get(r3));
        ((ArrayDeque) this.c).push((be3) r4.get(r3));
        r3 = r3 + 1;
        goto L6
    L9:
        r4.clear();
        fz3 r5 = (fz3) this.f;
        if (r5 == null) goto L14;
        if (r5.o != r1.o) goto L14;
        this.f = null;
    L14:
        ((ArrayDeque) this.d).push(r1);
        goto L4
    }

    public ColorStateList k() {
        la0 r0 = (la0) this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (ColorStateList) r0.p;
    }

    public PorterDuff.Mode l() {
        la0 r0 = (la0) this.e;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (PorterDuff.Mode) r0.q;
    }

    public boolean m() {
        if (((ArrayList) this.c).size() <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public void n(AttributeSet r11, int r12) {
        View r0 = (View) this.b;
        Context r1 = r0.getContext();
        int[] r4 = st3.B;
        jv3 r2 = jv3.f(r1, r11, r4, r12);
        TypedArray r9 = (TypedArray) r2.o;
        View r3 = (View) this.b;
        j65.n(r3, r3.getContext(), r4, r11, (TypedArray) r2.o, r12, 0);
    L12:
        th = move-exception;
        r2.g();
        throw th;
    L4:
        if (r9.hasValue(0) == false) goto L19;
        this.a = r9.getResourceId(0, -1);     // Catch: Throwable -> L12
        fg r13 = (fg) this.c;     // Catch: Throwable -> L12
        Context r14 = r0.getContext();     // Catch: Throwable -> L12
        int r5 = this.a;     // Catch: Throwable -> L12
        monitor-enter(r13);     // Catch: Throwable -> L12
        ColorStateList r15 = r13.a.g(r14, r5);     // Catch: Throwable -> L14
        monitor-exit(r13);     // Catch: Throwable -> L12
        if (r15 == null) goto L19;
        w(r15);     // Catch: Throwable -> L12
        goto L19
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L19:
        if (r9.hasValue(1) == false) goto L22;
        r0.setBackgroundTintList(r2.b(1));     // Catch: Throwable -> L12
    L22:
        if (r9.hasValue(2) == false) goto L24;
        r0.setBackgroundTintMode(aw0.c(r9.getInt(2, -1), null));     // Catch: Throwable -> L12
    L24:
        r2.g();
    }

    public b6 o(Object r1, int r2, int r3, int r4) {
        b6 r0 = (b6) ((jo3) this.b).b();
        if (r0 != null) goto L6;
        b6 r5 = new b6();
        r5.a = r2;
        r5.b = r3;
        r5.d = r4;
        r5.c = r1;
        return r5;
    L6:
        r0.a = r2;
        r0.b = r3;
        r0.d = r4;
        r0.c = r1;
        return r0;
    }

    public void p() {
        this.a = -1;
        w(null);
        b();
    }

    public void q(int r4) {
        this.a = r4;
        fg r0 = (fg) this.c;
        if (r0 == null) goto L12;
        Context r1 = ((View) this.b).getContext();
        monitor-enter(r0);
        ColorStateList r5 = r0.a.g(r1, r4);     // Catch: Throwable -> L9
        monitor-exit(r0);
    L13:
        w(r5);
        b();
        return;
    L9:
        th = move-exception;
        throw th;
    L12:
        r5 = null;
        goto L13
    }

    public void r(b6 r4) {
        si1 r0 = (si1) this.e;
        ((ArrayList) this.d).add(r4);
        int r3 = r4.a;
        if (r3 != 1) goto L5;
        r0.G(r4.b, r4.d);
        return;
    L5:
        if (r3 != 2) goto L7;
        int r5 = r4.b;
        int r6 = r4.d;
        RecyclerView r1 = (RecyclerView) r0.o;
        r1.U(r5, r6, false);
        r1.x0 = true;
        return;
    L7:
        if (r3 != 4) goto L9;
        r0.F(r4.b, r4.d, r4.c);
        return;
    L9:
        if (r3 != 8) goto L12;
        r0.H(r4.b, r4.d);
        return;
    L12:
        mj0.l(r4, "Unknown update op type for ");
    }

    public void s() {
        jo3 r1 = (jo3) this.b;
        si1 r2 = (si1) this.e;
        pz1 r3 = (pz1) this.f;
        ArrayList r4 = (ArrayList) this.c;
        r3.getClass();
    L3:
        int r5 = r4.size() - 1;
        boolean r8 = false;
    L5:
        if (r5 < 0) goto L12;
        if (((b6) r4.get(r5)).a != 8) goto L10;
        if (r8 == false) goto L11;
    L14:
        if (r5 == (-1)) goto L120;
        int r9 = r5 + 1;
        c6 r13 = (c6) r3.o;
        jo3 r14 = (jo3) r13.b;
        b6 r15 = (b6) r4.get(r5);
        b6 r7 = (b6) r4.get(r9);
        int r10 = r7.a;
        if (r10 != 1) goto L17;
        int r6 = r15.d;
        int r11 = r7.b;
        if (r6 >= r11) goto L110;
        int r16 = -1;
    L111:
        int r12 = r15.b;
        if (r12 >= r11) goto L114;
        r16 = r16 + 1;
    L114:
        if (r11 > r12) goto L116;
        r15.b = r12 + r7.d;
    L116:
        int r17 = r7.b;
        if (r17 > r6) goto L119;
        r15.d = r6 + r7.d;
    L119:
        r7.b = r17 + r16;
        r4.set(r5, r7);
        r4.set(r9, r15);
        goto L3
    L110:
        r16 = 0;
        goto L111
    L17:
        if (r10 != 2) goto L18;
        int r18 = r15.b;
        int r19 = r15.d;
        int r110 = r7.b;
        if (r18 >= r19) goto L52;
        if (r110 == r18) goto L46;
    L49:
        boolean r20 = false;
    L50:
        boolean r111 = false;
    L57:
        if (r19 < r110) goto L58;
        int r21 = r7.d;
        if (r19 >= (r110 + r21)) goto L64;
        r7.d = r21 - 1;
        r15.a = 2;
        r15.d = 1;
        if (r7.d != 0) goto L3;
        r4.remove(r9);
        r7.c = null;
        r14.a(r7);
    L64:
        int r22 = r15.b;
        int r112 = r7.b;
        if (r22 > r112) goto L68;
        r7.b = r112 + 1;
    L67:
        Object r113 = null;
        b6 r23 = null;
    L72:
        if (r111 == true) goto L73;
        if (r20 == false) goto L88;
        if (r23 == null) goto L82;
        int r24 = r15.b;
        if (r24 <= r23.b) goto L79;
        r15.b = r24 - r23.d;
    L79:
        int r25 = r15.d;
        if (r25 <= r23.b) goto L82;
        r15.d = r25 - r23.d;
    L82:
        int r26 = r15.b;
        if (r26 <= r7.b) goto L85;
        r15.b = r26 - r7.d;
    L85:
        int r27 = r15.d;
        if (r27 <= r7.b) goto L101;
        r15.d = r27 - r7.d;
    L101:
        r4.set(r5, r7);
        if (r15.b == r15.d) goto L104;
        r4.set(r9, r15);
    L105:
        if (r23 == null) goto L3;
        r4.add(r5, r23);
        goto L3
    L104:
        r4.remove(r9);
        goto L105
    L88:
        if (r23 == null) goto L95;
        int r28 = r15.b;
        if (r28 < r23.b) goto L92;
        r15.b = r28 - r23.d;
    L92:
        int r29 = r15.d;
        if (r29 < r23.b) goto L95;
        r15.d = r29 - r23.d;
    L95:
        int r30 = r15.b;
        if (r30 < r7.b) goto L98;
        r15.b = r30 - r7.d;
    L98:
        int r31 = r15.d;
        if (r31 < r7.b) goto L101;
        r15.d = r31 - r7.d;
        goto L101
    L73:
        r4.set(r5, r7);
        r4.remove(r9);
        r15.c = r113;
        r14.a(r15);
        goto L3
    L68:
        int r114 = r112 + r7.d;
        if (r22 >= r114) goto L67;
        r113 = null;
        b6 r115 = r13.o(null, 2, r22 + 1, r114 - r22);
        r7.d = r15.b - r7.b;
        r23 = r115;
        goto L72
    L58:
        r7.b = r110 - 1;
        goto L64
    L46:
        if (r7.d != (r19 - r18)) goto L49;
        r20 = false;
    L48:
        r111 = true;
        goto L57
    L52:
        if (r110 == (r19 + 1)) goto L54;
    L56:
        r20 = true;
        goto L50
    L54:
        if (r7.d != (r18 - r19)) goto L56;
        r20 = true;
        goto L48
    L18:
        if (r10 != 4) goto L3;
        int r116 = r15.d;
        int r117 = r7.b;
        if (r116 >= r117) goto L23;
        r7.b = r117 - 1;
    L26:
        b6 r32 = null;
    L27:
        int r33 = r15.b;
        int r118 = r7.b;
        if (r33 > r118) goto L30;
        r7.b = r118 + 1;
    L33:
        b6 r34 = null;
    L34:
        r4.set(r9, r15);
        if (r7.d <= 0) goto L37;
        r4.set(r5, r7);
    L38:
        if (r32 == null) goto L40;
        r4.add(r5, r32);
    L40:
        if (r34 == null) goto L3;
        r4.add(r5, r34);
        goto L3
    L37:
        r4.remove(r5);
        r7.c = null;
        r14.a(r7);
        goto L38
    L30:
        int r119 = r118 + r7.d;
        if (r33 >= r119) goto L33;
        int r120 = r119 - r33;
        r34 = r13.o(r7.c, 4, r33 + 1, r120);
        r7.d -= r120;
        goto L34
    L23:
        int r35 = r7.d;
        if (r116 >= (r117 + r35)) goto L26;
        r7.d = r35 - 1;
        r32 = r13.o(r7.c, 4, r15.b, 1);
        goto L27
    L120:
        int r36 = r4.size();
        int r37 = 0;
    L121:
        if (r37 >= r36) goto L180;
        b6 r38 = (b6) r4.get(r37);
        int r39 = r38.a;
        if (r39 == 1) goto L178;
        if (r39 == 2) goto L151;
        if (r39 == 4) goto L129;
        if (r39 != 8) goto L179;
        r(r38);
    L179:
        r37 = r37 + 1;
        goto L121
    L129:
        int r40 = r38.b;
        int r41 = r38.d + r40;
        int r121 = r40;
        int r122 = 0;
        byte r123 = -1;
    L130:
        if (r40 >= r41) goto L146;
        if (r2.D(r40) == null) goto L134;
    L141:
        if (r123 != 0) goto L143;
        g(o(r38.c, 4, r121, r122));
        r121 = r40;
        r122 = 0;
    L143:
        r123 = 1;
    L144:
        r122 = r122 + 1;
        r40 = r40 + 1;
        goto L130
    L134:
        if (c(r40) == true) goto L141;
        if (r123 != 1) goto L139;
        r(o(r38.c, 4, r121, r122));
        r121 = r40;
        r122 = 0;
    L139:
        r123 = 0;
        goto L144
    L146:
        if (r122 == r38.d) goto L148;
        Object r42 = r38.c;
        r38.c = null;
        r1.a(r38);
        r38 = o(r42, 4, r121, r122);
    L148:
        if (r123 != 0) goto L150;
        g(r38);
        goto L179
    L150:
        r(r38);
        goto L179
    L151:
        int r43 = r38.b;
        int r44 = r38.d + r43;
        int r124 = r43;
        int r125 = 0;
        byte r126 = -1;
    L152:
        if (r124 >= r44) goto L173;
        if (r2.D(r124) != null) goto L163;
        if (c(r124) == true) goto L163;
        if (r126 != 1) goto L161;
        r(o(null, 2, r43, r125));
        boolean r127 = true;
    L162:
        byte r128 = 0;
    L167:
        if (r127 == false) goto L170;
        r124 = r124 - r125;
        r44 = r44 - r125;
        r125 = 1;
    L171:
        r124 = r124 + 1;
        r126 = r128;
        goto L152
    L170:
        r125 = r125 + 1;
        goto L171
    L161:
        r127 = false;
    L163:
        if (r126 != 0) goto L165;
        g(o(null, 2, r43, r125));
        r127 = true;
    L166:
        r128 = 1;
        goto L167
    L165:
        r127 = false;
        goto L166
    L173:
        if (r125 == r38.d) goto L175;
        r38.c = null;
        r1.a(r38);
        r38 = o(null, 2, r43, r125);
    L175:
        if (r126 != 0) goto L177;
        g(r38);
        goto L179
    L177:
        r(r38);
        goto L179
    L178:
        r(r38);
        goto L179
    L180:
        r4.clear();
        return;
    L11:
        r5 = r5 - 1;
        goto L5
    L10:
        r8 = true;
        goto L11
    L12:
        r5 = -1;
        goto L14
    }

    public void t(ArrayList r5) {
        int r0 = r5.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        b6 r2 = (b6) r5.get(r1);
        r2.c = null;
        ((jo3) this.b).a(r2);
        r1 = r1 + 1;
        goto L3
    L5:
        r5.clear();
    }

    public void u(rp1 r6) {
        int r7 = ti.m0((rp1[]) this.b, r6);
        if (r7 < 0) goto L6;
        rp1[] r0 = (rp1[]) this.b;
        int r1 = r7 + 1;
        ti.Z(r7, r1, this.a, r0, r0);
        rp1[] r2 = (rp1[]) this.b;
        int r3 = this.a;
        r2[r3 - 1] = null;
        float[] r4 = (float[]) this.c;
        System.arraycopy(r4, r1, r4, r7, r3 - r1);
        byte[] r5 = (byte[]) this.d;
        ti.X(r7, r1, this.a, r5, r5);
        this.a--;
        return;
    }

    public void v(Runnable r2) {
        yp4 r1 = (yp4) this.b;
        if (r1.a.getLooper().getThread().isAlive() == true) goto L5;
        return;
    L5:
        r1.d(r2);
    }

    public void w(ColorStateList r2) {
        if (r2 != null) goto L4;
        this.d = null;
    L8:
        b();
        return;
    L4:
        if (((la0) this.d) != null) goto L6;
        this.d = new la0();
    L6:
        la0 r0 = (la0) this.d;
        r0.p = r2;
        r0.o = true;
        goto L8
    }

    public void x(int r2) {
        if (r2 < 0) goto L4;
        boolean r0 = true;
    L5:
        rr2.w(r0);
        this.a = r2;
        j(r2);
        return;
    L4:
        r0 = false;
        goto L5
    }

    public void y(ColorStateList r2) {
        if (((la0) this.e) != null) goto L5;
        this.e = new la0();
    L5:
        la0 r0 = (la0) this.e;
        r0.p = r2;
        r0.o = true;
        b();
    }

    public void z(PorterDuff.Mode r2) {
        if (((la0) this.e) != null) goto L5;
        this.e = new la0();
    L5:
        la0 r0 = (la0) this.e;
        r0.q = r2;
        r0.n = true;
        b();
    }

    public c6(gz3 r1) {
        this.b = r1;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public c6(View r2) {
        this.a = -1;
        this.b = r2;
        this.c = fg.a();
    }
}
