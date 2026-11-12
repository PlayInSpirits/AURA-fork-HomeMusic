package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o65 {
    public static final c22 x = null;
    public int a;
    public int b;
    public int c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public float n;
    public int o;
    public final int p;
    public int q;
    public final OverScroller r;
    public final hw s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public final wu4 w;

    static {
        x = new c22(3);
    }

    public o65(Context r3, ViewGroup r4, hw r5) {
        this.c = -1;
        this.w = new wu4(4, this);
        if (r5 == null) goto L6;
        this.v = r4;
        this.s = r5;
        ViewConfiguration r6 = ViewConfiguration.get(r3);
        int r7 = (int) ((r3.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.p = r7;
        this.o = r7;
        this.b = r6.getScaledTouchSlop();
        this.m = r6.getScaledMaximumFlingVelocity();
        this.n = r6.getScaledMinimumFlingVelocity();
        this.r = new OverScroller(r3, x);
        return;
    L6:
        kf2.n("Callback may not be null");
        throw null;
    }

    public final void a() {
        this.c = -1;
        float[] r0 = this.d;
        if (r0 == null) goto L6;
        Arrays.fill(r0, 0.0f);
        Arrays.fill(this.e, 0.0f);
        Arrays.fill(this.f, 0.0f);
        Arrays.fill(this.g, 0.0f);
        Arrays.fill(this.h, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.j, 0);
        this.k = 0;
    L6:
        VelocityTracker r1 = this.l;
        if (r1 == null) goto L10;
        r1.recycle();
        this.l = null;
        return;
    }

    public final void b(View r3, int r4) {
        ViewParent r0 = r3.getParent();
        ViewGroup r1 = this.v;
        if (r0 != r1) goto L6;
        this.t = r3;
        this.c = r4;
        this.s.y(r3, r4);
        p(1);
        return;
    L6:
        nz2.A(r1, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    }

    public final boolean c(float r3, float r4, int r5, int r6) {
        float r7 = Math.abs(r3);
        float r8 = Math.abs(r4);
        if ((this.h[r5] & r6) == r6) goto L5;
        return false;
    L5:
        if ((this.q & r6) != 0) goto L7;
        return false;
    L7:
        if ((this.j[r5] & r6) != r6) goto L9;
        return false;
    L9:
        if ((this.i[r5] & r6) == r6) goto L28;
        float r0 = this.b;
        if (r7 > r0) goto L16;
        if (r8 > r0) goto L16;
        return false;
    L16:
        if (r7 >= (r8 * 0.5f)) goto L19;
        this.s.getClass();
    L19:
        if ((this.i[r5] & r6) == 0) goto L21;
        return false;
    L21:
        if (r7 <= this.b) goto L30;
        return true;
    L30:
        return false;
    L28:
        return false;
    }

    public final boolean d(View r4, float r5, float r6) {
        if (r4 == null) goto L26;
        hw r1 = this.s;
        if (r1.o(r4) <= 0) goto L8;
        boolean r7 = true;
    L10:
        if (r1.p() <= 0) goto L12;
        boolean r2 = true;
    L13:
        if (r7 == false) goto L18;
        if (r2 == false) goto L18;
        float r8 = (r6 * r6) + (r5 * r5);
        int r3 = this.b;
        if (r8 <= (r3 * r3)) goto L26;
    L25:
        return true;
    L18:
        if (r7 == true) goto L20;
        if (r2 == false) goto L26;
        if (Math.abs(r6) <= this.b) goto L26;
    L20:
        if (Math.abs(r5) <= this.b) goto L26;
    L12:
        r2 = false;
        goto L13
    L8:
        r7 = false;
    L26:
        return false;
    }

    public final void e(int r5) {
        float[] r0 = this.d;
        if (r0 == null) goto L8;
        int r1 = this.k;
        int r2 = 1 << r5;
        if ((r1 & r2) == 0) goto L9;
        r0[r5] = 0.0f;
        this.e[r5] = 0.0f;
        this.f[r5] = 0.0f;
        this.g[r5] = 0.0f;
        this.h[r5] = 0;
        this.i[r5] = 0;
        this.j[r5] = 0;
        this.k = (~r2) & r1;
        return;
    L9:
        return;
    }

    public final int f(int r4, int r5, int r6) {
        if (r4 != 0) goto L5;
        return 0;
    L5:
        int r3 = this.v.getWidth();
        float r0 = r3 / 2;
        float r1 = (((float) Math.sin((Math.min(1.0f, Math.abs(r4) / r3) - 0.5f) * 0.47123894f)) * r0) + r0;
        int r7 = Math.abs(r5);
        if (r7 <= 0) goto L8;
        int r8 = Math.round(Math.abs(r1 / r7) * 1000.0f) * 4;
    L10:
        return Math.min(r8, 600);
    L8:
        r8 = (int) (((Math.abs(r4) / r6) + 1.0f) * 256.0f);
        goto L10
    }

    public final boolean g() {
        if (this.a != 2) goto L21;
        OverScroller r0 = this.r;
        boolean r3 = r0.computeScrollOffset();
        int r4 = r0.getCurrX();
        int r5 = r0.getCurrY();
        int r6 = r4 - this.t.getLeft();
        int r7 = r5 - this.t.getTop();
        if (r6 == 0) goto L7;
        View r8 = this.t;
        WeakHashMap r9 = j65.a;
        r8.offsetLeftAndRight(r6);
    L7:
        if (r7 == 0) goto L9;
        View r10 = this.t;
        WeakHashMap r11 = j65.a;
        r10.offsetTopAndBottom(r7);
    L9:
        if (r6 != 0) goto L11;
        if (r7 != 0) goto L11;
    L12:
        if (r3 == true) goto L14;
    L18:
        if (r3 == true) goto L21;
        this.v.post(this.w);
        goto L21
    L14:
        if (r4 != r0.getFinalX()) goto L18;
        if (r5 != r0.getFinalY()) goto L18;
        r0.abortAnimation();
        r3 = false;
    L11:
        this.s.A(this.t, r4, r5);
    L21:
        if (this.a != 2) goto L24;
        return true;
    L24:
        return false;
    }

    public final View h(int r5, int r6) {
        ViewGroup r0 = this.v;
        int r1 = r0.getChildCount() - 1;
    L3:
        if (r1 < 0) goto L14;
        this.s.getClass();
        View r2 = r0.getChildAt(r1);
        if (r5 < r2.getLeft()) goto L13;
        if (r5 >= r2.getRight()) goto L13;
        if (r6 < r2.getTop()) goto L13;
        if (r6 >= r2.getBottom()) goto L13;
        return r2;
    L13:
        r1 = r1 - 1;
        goto L3
    L14:
        return null;
    }

    public final boolean i(int r11, int r12, int r13, int r14) {
        int r2 = this.t.getLeft();
        int r3 = this.t.getTop();
        int r4 = r11 - r2;
        int r5 = r12 - r3;
        OverScroller r1 = this.r;
        if (r4 != 0) goto L7;
        if (r5 != 0) goto L7;
        r1.abortAnimation();
        p(0);
        return false;
    L7:
        View r15 = this.t;
        int r0 = (int) this.n;
        int r6 = (int) this.m;
        int r7 = Math.abs(r13);
        if (r7 >= r0) goto L10;
        r13 = 0;
    L14:
        int r8 = (int) this.n;
        int r9 = Math.abs(r14);
        if (r9 >= r8) goto L17;
        r14 = 0;
    L21:
        int r16 = Math.abs(r4);
        int r10 = Math.abs(r5);
        int r17 = Math.abs(r13);
        int r18 = Math.abs(r14);
        int r19 = r17 + r18;
        int r20 = r16 + r10;
        if (r13 == 0) goto L25;
        float r110 = r17;
        float r21 = r19;
    L24:
        float r111 = r110 / r21;
        if (r14 == 0) goto L29;
        float r22 = r18;
        float r23 = r19;
    L28:
        float r24 = r22 / r23;
        hw r25 = this.s;
        r1.startScroll(r2, r3, r4, r5, (int) ((f(r5, r14, r25.p()) * r24) + (f(r4, r13, r25.o(r15)) * r111)));
        p(2);
        return true;
    L29:
        r22 = r10;
        r23 = r20;
        goto L28
    L25:
        r110 = r16;
        r21 = r20;
        goto L24
    L17:
        if (r9 <= r6) goto L21;
        if (r14 <= 0) goto L20;
        r14 = r6;
        goto L21
    L20:
        r14 = -r6;
        goto L21
    L10:
        if (r7 <= r6) goto L14;
        if (r13 <= 0) goto L13;
        r13 = r6;
        goto L14
    L13:
        r13 = -r6;
        goto L14
    }

    public final boolean j(int r3) {
        if ((this.k & (1 << r3)) == 0) goto L5;
        return true;
    L5:
        Log.e("ViewDragHelper", "Ignoring pointerId=" + r3 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent r10) {
        int r0 = r10.getActionMasked();
        int r1 = r10.getActionIndex();
        if (r0 != 0) goto L6;
        a();
    L6:
        if (this.l != null) goto L8;
        this.l = VelocityTracker.obtain();
    L8:
        this.l.addMovement(r10);
        hw r2 = this.s;
        int r3 = 0;
        if (r0 != 0) goto L11;
        float r4 = r10.getX();
        float r5 = r10.getY();
        int r11 = r10.getPointerId(0);
        View r6 = h((int) r4, (int) r5);
        n(r4, r5, r11);
        t(r6, r11);
        if ((this.q & this.h[r11]) == 0) goto L124;
        r2.w();
        return;
    L124:
        return;
    L11:
        if (r0 == 1) goto L100;
        if (r0 == 2) goto L69;
        if (r0 == 3) goto L62;
        if (r0 != 5) goto L19;
        int r7 = r10.getPointerId(r1);
        float r8 = r10.getX(r1);
        float r12 = r10.getY(r1);
        n(r8, r12, r7);
        if (this.a != 0) goto L48;
        t(h((int) r8, (int) r12), r7);
        if ((this.q & this.h[r7]) == 0) goto L119;
        r2.w();
        return;
    L119:
        return;
    L48:
        int r9 = (int) r8;
        int r13 = (int) r12;
        View r14 = this.t;
        if (r14 != null) goto L52;
        return;
    L52:
        if (r9 >= r14.getLeft()) goto L54;
        return;
    L54:
        if (r9 < r14.getRight()) goto L56;
        return;
    L56:
        if (r13 >= r14.getTop()) goto L58;
        return;
    L58:
        if (r13 >= r14.getBottom()) goto L123;
        t(this.t, r7);
        return;
    L123:
        return;
    L19:
        if (r0 != 6) goto L125;
        int r15 = r10.getPointerId(r1);
        if (this.a == 1) goto L24;
    L40:
        e(r15);
        return;
    L24:
        if (r15 != this.c) goto L40;
        int r16 = r10.getPointerCount();
    L27:
        if (r3 >= r16) goto L37;
        int r17 = r10.getPointerId(r3);
        if (r17 == this.c) goto L36;
        View r18 = h((int) r10.getX(r3), (int) r10.getY(r3));
        View r19 = this.t;
        if (r18 != r19) goto L36;
        if (t(r19, r17) == false) goto L36;
        int r110 = this.c;
    L38:
        if (r110 != (-1)) goto L40;
        l();
    L36:
        r3 = r3 + 1;
        goto L27
    L37:
        r110 = -1;
        goto L38
    L125:
        return;
    L62:
        if (this.a != 1) goto L66;
        this.u = true;
        r2.B(this.t, 0.0f, 0.0f);
        this.u = false;
        if (this.a != 1) goto L66;
        p(0);
    L66:
        a();
        return;
    L69:
        if (this.a == 1) goto L71;
        int r20 = r10.getPointerCount();
    L84:
        if (r3 >= r20) goto L97;
        int r21 = r10.getPointerId(r3);
        if (j(r21) == false) goto L96;
        float r22 = r10.getX(r3);
        float r23 = r10.getY(r3);
        float r24 = r22 - this.d[r21];
        float r25 = r23 - this.e[r21];
        m(r24, r25, r21);
        if (this.a == 1) goto L97;
        View r26 = h((int) r22, (int) r23);
        if (d(r26, r24, r25) == false) goto L96;
        if (t(r26, r21) == true) goto L97;
    L96:
        r3 = r3 + 1;
    L97:
        o(r10);
        return;
    L71:
        if (j(this.c) == false) goto L127;
        int r27 = r10.findPointerIndex(this.c);
        float r28 = r10.getX(r27);
        float r29 = r10.getY(r27);
        float[] r30 = this.f;
        int r31 = this.c;
        int r32 = (int) (r28 - r30[r31]);
        int r33 = (int) (r29 - this.g[r31]);
        int r34 = this.t.getLeft() + r32;
        int r35 = this.t.getTop() + r33;
        int r36 = this.t.getLeft();
        int r37 = this.t.getTop();
        if (r32 == 0) goto L76;
        r34 = r2.d(this.t, r34);
        WeakHashMap r38 = j65.a;
        this.t.offsetLeftAndRight(r34 - r36);
    L76:
        if (r33 == 0) goto L78;
        r35 = r2.e(this.t, r35);
        WeakHashMap r39 = j65.a;
        this.t.offsetTopAndBottom(r35 - r37);
    L78:
        if (r32 != 0) goto L80;
        if (r33 != 0) goto L80;
    L81:
        o(r10);
        return;
    L80:
        r2.A(this.t, r34, r35);
        goto L81
    L127:
        return;
    L100:
        if (this.a != 1) goto L102;
        l();
    L102:
        a();
    }

    public final void l() {
        VelocityTracker r0 = this.l;
        float r2 = this.m;
        r0.computeCurrentVelocity(1000, r2);
        float r1 = this.l.getXVelocity(this.c);
        float r3 = this.n;
        float r4 = Math.abs(r1);
        if (r4 >= r3) goto L6;
        r1 = 0.0f;
    L11:
        float r5 = this.l.getYVelocity(this.c);
        float r6 = this.n;
        float r7 = Math.abs(r5);
        if (r7 >= r6) goto L15;
        r2 = 0.0f;
    L21:
        this.u = true;
        this.s.B(this.t, r1, r2);
        this.u = false;
        if (this.a != 1) goto L25;
        p(0);
        return;
    L25:
        return;
    L15:
        if (r7 > r2) goto L17;
        r2 = r5;
        goto L21
    L17:
        if (r5 > 0.0f) goto L21;
        r2 = -r2;
        goto L21
    L6:
        if (r4 <= r2) goto L11;
        if (r1 <= 0.0f) goto L10;
        r1 = r2;
        goto L11
    L10:
        r1 = -r2;
        goto L11
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [hw] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(float r3, float r4, int r5) {
        boolean r0 = c(r3, r4, r5, 1);
        ?? r1 = r0;
        if (c(r4, r3, r5, 4) == false) goto L5;
        r1 = (r0 ? 1 : 0) | 4;
    L5:
        ?? r2 = r1;
        if (c(r3, r4, r5, 2) == false) goto L8;
        r2 = (r1 == true ? 1 : 0) | 2;
    L8:
        ?? r6 = r2;
        if (c(r4, r3, r5, 8) == false) goto L11;
        r6 = (r2 == true ? 1 : 0) | 8;
    L11:
        if (r6 == 0) goto L14;
        int[] r7 = this.i;
        r7[r5] = (r7[r5] | r6) == true ? 1 : 0;
        this.s.v(r6, r5);
        return;
    }

    public final void n(float r11, float r12, int r13) {
        float[] r0 = this.d;
        int r1 = 0;
        if (r0 != null) goto L5;
    L6:
        int r2 = r13 + 1;
        float[] r3 = new float[r2];
        float[] r4 = new float[r2];
        float[] r5 = new float[r2];
        float[] r6 = new float[r2];
        int[] r7 = new int[r2];
        int[] r8 = new int[r2];
        int[] r9 = new int[r2];
        if (r0 == null) goto L9;
        System.arraycopy(r0, 0, r3, 0, r0.length);
        float[] r10 = this.e;
        System.arraycopy(r10, 0, r4, 0, r10.length);
        float[] r14 = this.f;
        System.arraycopy(r14, 0, r5, 0, r14.length);
        float[] r15 = this.g;
        System.arraycopy(r15, 0, r6, 0, r15.length);
        int[] r16 = this.h;
        System.arraycopy(r16, 0, r7, 0, r16.length);
        int[] r17 = this.i;
        System.arraycopy(r17, 0, r8, 0, r17.length);
        int[] r18 = this.j;
        System.arraycopy(r18, 0, r9, 0, r18.length);
    L9:
        this.d = r3;
        this.e = r4;
        this.f = r5;
        this.g = r6;
        this.h = r7;
        this.i = r8;
        this.j = r9;
    L10:
        float[] r19 = this.d;
        this.f[r13] = r11;
        r19[r13] = r11;
        float[] r20 = this.e;
        this.g[r13] = r12;
        r20[r13] = r12;
        int[] r21 = this.h;
        int r110 = (int) r11;
        int r111 = (int) r12;
        ViewGroup r22 = this.v;
        if (r110 >= (r22.getLeft() + this.o)) goto L14;
        r1 = 1;
    L14:
        if (r111 >= (r22.getTop() + this.o)) goto L17;
        r1 = r1 | 4;
    L17:
        if (r110 <= (r22.getRight() - this.o)) goto L20;
        r1 = r1 | 2;
    L20:
        if (r111 <= (r22.getBottom() - this.o)) goto L22;
        r1 = r1 | 8;
    L22:
        r21[r13] = r1;
        this.k |= 1 << r13;
        return;
    L5:
        if (r0.length > r13) goto L10;
        goto L6
    }

    public final void o(MotionEvent r7) {
        int r0 = r7.getPointerCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        int r2 = r7.getPointerId(r1);
        if (j(r2) == false) goto L8;
        float r3 = r7.getX(r1);
        float r4 = r7.getY(r1);
        this.f[r2] = r3;
        this.g[r2] = r4;
    L8:
        r1 = r1 + 1;
        goto L3
    }

    public final void p(int r3) {
        this.v.removeCallbacks(this.w);
        if (this.a == r3) goto L8;
        this.a = r3;
        this.s.z(r3);
        if (this.a != 0) goto L9;
        this.t = null;
        return;
    L9:
        return;
    }

    public final boolean q(int r4, int r5) {
        if (this.u == true) goto L5;
        kf2.o("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    L5:
        return i(r4, r5, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
    }

    public final boolean r(MotionEvent r19) {
        int r2 = r19.getActionMasked();
        int r3 = r19.getActionIndex();
        if (r2 != 0) goto L6;
        a();
    L6:
        if (this.l != null) goto L8;
        this.l = VelocityTracker.obtain();
    L8:
        this.l.addMovement(r19);
        hw r6 = this.s;
        if (r2 == 0) goto L64;
        if (r2 == 1) goto L63;
        if (r2 == 2) goto L30;
        if (r2 == 3) goto L63;
        if (r2 != 5) goto L17;
        int r4 = r19.getPointerId(r3);
        float r8 = r19.getX(r3);
        float r1 = r19.getY(r3);
        n(r8, r1, r4);
        int r5 = this.a;
        if (r5 == 0) goto L23;
        if (r5 != 2) goto L73;
        View r7 = h((int) r8, (int) r1);
        if (r7 != this.t) goto L73;
        t(r7, r4);
    L73:
        if (this.a != 1) goto L75;
        return true;
    L75:
        return false;
    L23:
        if ((this.h[r4] & this.q) == 0) goto L73;
        r6.w();
        goto L73
    L17:
        if (r2 != 6) goto L73;
        e(r19.getPointerId(r3));
        goto L73
    L30:
        if (this.d == null) goto L73;
        if (this.e == null) goto L73;
        int r9 = r19.getPointerCount();
        int r10 = 0;
    L35:
        if (r10 >= r9) goto L62;
        int r11 = r19.getPointerId(r10);
        if (j(r11) == false) goto L61;
        float r12 = r19.getX(r10);
        float r13 = r19.getY(r10);
        float r14 = r12 - this.d[r11];
        float r15 = r13 - this.e[r11];
        View r16 = h((int) r12, (int) r13);
        if (r16 != null) goto L42;
    L44:
        boolean r17 = false;
    L45:
        if (r17 == false) goto L54;
        int r18 = r16.getLeft();
        int r110 = r6.d(r16, ((int) r14) + r18);
        int r111 = r16.getTop();
        int r112 = r6.e(r16, ((int) r15) + r111);
        int r113 = r6.o(r16);
        int r114 = r6.p();
        if (r113 == 0) goto L50;
        if (r113 <= 0) goto L54;
        if (r110 != r18) goto L54;
    L50:
        if (r114 == 0) goto L62;
        if (r114 <= 0) goto L54;
        if (r112 == r111) goto L62;
    L54:
        m(r14, r15, r11);
        if (this.a == 1) goto L62;
        if (r17 == false) goto L61;
        if (t(r16, r11) == false) goto L61;
    L42:
        if (d(r16, r14, r15) == false) goto L44;
        r17 = true;
    L61:
        r10 = r10 + 1;
    L62:
        o(r19);
    L63:
        a();
        goto L73
    L64:
        float r20 = r19.getX();
        float r21 = r19.getY();
        int r22 = r19.getPointerId(0);
        n(r20, r21, r22);
        View r23 = h((int) r20, (int) r21);
        if (r23 != this.t) goto L70;
        if (this.a != 2) goto L70;
        t(r23, r22);
    L70:
        if ((this.h[r22] & this.q) == 0) goto L73;
        r6.w();
        goto L73
    }

    public final boolean s(View r1, int r2, int r3) {
        this.t = r1;
        this.c = -1;
        boolean r4 = i(r2, r3, 0, 0);
        if (r4 == false) goto L5;
    L9:
        return r4;
    L5:
        if (this.a != 0) goto L9;
        if (this.t == null) goto L9;
        this.t = null;
        goto L9
    }

    public final boolean t(View r3, int r4) {
        if (r3 == this.t) goto L5;
    L7:
        if (r3 != null) goto L9;
        return false;
    L9:
        if (this.s.Q(r3, r4) == false) goto L14;
        this.c = r4;
        b(r3, r4);
        return true;
    L14:
        return false;
    L5:
        if (this.c != r4) goto L7;
        return true;
    }
}
