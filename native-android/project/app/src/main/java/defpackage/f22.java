package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f22 extends kw3 implements ow3 {
    public Rect A;
    public long B;
    public final ArrayList a;
    public final float[] b;
    public cx3 c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public final e22 m;
    public int n;
    public int o;
    public final ArrayList p;
    public int q;
    public RecyclerView r;
    public final g5 s;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public View w;
    public GestureDetector x;
    public d22 y;
    public final a22 z;

    public f22(e22 r4) {
        this.a = new ArrayList();
        this.b = new float[2];
        this.c = null;
        this.l = -1;
        this.n = 0;
        this.p = new ArrayList();
        this.s = new g5(16, this);
        this.w = null;
        this.z = new a22(this);
        this.m = r4;
    }

    public static boolean p(View r1, float r2, float r3, float r4, float r5) {
        if (r2 >= r4) goto L5;
        return false;
    L5:
        if (r2 <= (r4 + r1.getWidth())) goto L7;
        return false;
    L7:
        if (r3 >= r5) goto L9;
        return false;
    L9:
        if (r3 > (r5 + r1.getHeight())) goto L16;
        return true;
    L16:
        return false;
    }

    @Override // defpackage.ow3
    public final void b(View r4) {
        if (r4 != this.w) goto L5;
        this.w = null;
    L5:
        cx3 r5 = this.r.M(r4);
        if (r5 == null) goto L18;
        cx3 r0 = this.c;
        if (r0 == null) goto L13;
        if (r5 != r0) goto L13;
        r(null, 0);
        return;
    L13:
        m(r5, false);
        if (this.a.remove(r5.a) == false) goto L17;
        this.m.a(this.r, r5);
        return;
    L17:
        return;
    }

    @Override // defpackage.ow3
    public final void c(View r1) {
    }

    @Override // defpackage.kw3
    public final void f(Rect r1, View r2, RecyclerView r3, yw3 r4) {
        r1.setEmpty();
    }

    @Override // defpackage.kw3
    public final void g(Canvas r13, RecyclerView r14) {
        if (this.c == null) goto L5;
        float[] r0 = this.b;
        o(r0);
        float r3 = r0[0];
        float r1 = r0[1];
    L6:
        cx3 r4 = this.c;
        this.m.getClass();
        ArrayList r12 = this.p;
        int r5 = r12.size();
        int r6 = 0;
    L7:
        if (r6 >= r5) goto L17;
        b22 r7 = (b22) r12.get(r6);
        cx3 r8 = r7.e;
        float r9 = r7.a;
        float r10 = r7.c;
        if (r9 != r10) goto L11;
        r7.i = r8.a.getTranslationX();
    L12:
        float r11 = r7.b;
        float r15 = r7.d;
        if (r11 != r15) goto L15;
        r7.j = r8.a.getTranslationY();
    L16:
        int r16 = r13.save();
        e22.g(r14, r7.e, r7.i, r7.j, false);
        r13.restoreToCount(r16);
        r6 = r6 + 1;
        goto L7
    L15:
        r7.j = xa3.a(r15, r11, r7.m, r11);
        goto L16
    L11:
        r7.i = xa3.a(r10, r9, r7.m, r9);
        goto L12
    L17:
        if (r4 == null) goto L23;
        int r17 = r13.save();
        e22.g(r14, r4, r3, r1, true);
        r13.restoreToCount(r17);
        return;
    L23:
        return;
    L5:
        r3 = 0.0f;
        r1 = 0.0f;
        goto L6
    }

    @Override // defpackage.kw3
    public final void h(Canvas r8, RecyclerView r9) {
        boolean r2 = false;
        if (this.c == null) goto L5;
        float[] r0 = this.b;
        o(r0);
        float r3 = r0[0];
        float r1 = r0[1];
    L5:
        cx3 r4 = this.c;
        this.m.getClass();
        ArrayList r7 = this.p;
        int r5 = r7.size();
        int r6 = 0;
    L6:
        if (r6 >= r5) goto L8;
        b22 r10 = (b22) r7.get(r6);
        int r11 = r8.save();
        View r12 = r10.e.a;
        r8.restoreToCount(r11);
        r6 = r6 + 1;
        goto L6
    L8:
        if (r4 == null) goto L10;
        r8.restoreToCount(r8.save());
    L10:
        int r13 = r5 - 1;
    L11:
        if (r13 < 0) goto L20;
        b22 r14 = (b22) r7.get(r13);
        boolean r15 = r14.l;
        if (r15 == true) goto L15;
    L17:
        if (r15 == true) goto L19;
        r2 = true;
    L19:
        r13 = r13 - 1;
        goto L11
    L15:
        if (r14.h == true) goto L17;
        r7.remove(r13);
        goto L19
    L20:
        if (r2 == false) goto L28;
        r9.invalidate();
        return;
    }

    public final void i(RecyclerView r8) {
        RecyclerView r0 = this.r;
        if (r0 != r8) goto L5;
        return;
    L5:
        a22 r1 = this.z;
        if (r0 == null) goto L27;
        r0.f0(this);
        RecyclerView r2 = this.r;
        r2.D.remove(r1);
        if (r2.E != r1) goto L10;
        r2.E = null;
    L10:
        ArrayList r3 = this.r.P;
        if (r3 == null) goto L14;
        r3.remove(this);
    L14:
        ArrayList r4 = this.p;
        int r5 = r4.size();
    L15:
        r5 = r5 - 1;
        if (r5 < 0) goto L18;
        b22 r6 = (b22) r4.get(0);
        r6.g.cancel();
        this.m.a(this.r, r6.e);
        goto L15
    L18:
        r4.clear();
        this.w = null;
        VelocityTracker r7 = this.t;
        if (r7 == null) goto L21;
        r7.recycle();
        this.t = null;
    L21:
        d22 r9 = this.y;
        if (r9 == null) goto L25;
        r9.n = false;
        this.y = null;
    L25:
        if (this.x == null) goto L27;
        this.x = null;
    L27:
        this.r = r8;
        Resources r10 = r8.getResources();
        this.f = r10.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
        this.g = r10.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.i(this);
        this.r.D.add(r1);
        RecyclerView r11 = this.r;
        if (r11.P != null) goto L30;
        r11.P = new ArrayList();
    L30:
        r11.P.add(this);
        this.y = new d22(this);
        this.x = new GestureDetector(this.r.getContext(), this.y);
    }

    public final int j(int r9) {
        if ((r9 & 12) == 0) goto L28;
        int r2 = 4;
        if (this.h <= 0.0f) goto L7;
        int r0 = 8;
    L8:
        VelocityTracker r4 = this.t;
        e22 r5 = this.m;
        if (r4 != null) goto L11;
    L23:
        float r1 = this.r.getWidth();
        r5.getClass();
        float r3 = r1 * 0.5f;
        if ((r9 & r0) != 0) goto L26;
        return 0;
    L26:
        if (Math.abs(this.h) <= r3) goto L31;
        return r0;
    L31:
        return 0;
    L11:
        if (this.l <= (-1)) goto L23;
        float r6 = this.g;
        r5.getClass();
        r4.computeCurrentVelocity(1000, r6);
        float r7 = this.t.getXVelocity(this.l);
        float r8 = this.t.getYVelocity(this.l);
        if (r7 <= 0.0f) goto L15;
        r2 = 8;
    L15:
        float r10 = Math.abs(r7);
        if ((r2 & r9) == 0) goto L23;
        if (r0 != r2) goto L23;
        if (r10 < this.f) goto L23;
        if (r10 <= Math.abs(r8)) goto L23;
        return r2;
    L7:
        r0 = 4;
        goto L8
    L28:
        return 0;
    }

    public final void k(int r9, int r10, MotionEvent r11) {
        if (this.c == null) goto L5;
        return;
    L5:
        if (r9 == 2) goto L7;
        return;
    L7:
        if (this.n == 2) goto L69;
        e22 r12 = this.m;
        r12.getClass();
        if (this.r.getScrollState() == 1) goto L70;
        mw3 r1 = this.r.getLayoutManager();
        int r3 = this.l;
        cx3 r5 = null;
        if (r3 == (-1)) goto L33;
        int r4 = r11.findPointerIndex(r3);
        float r6 = r11.getX(r4) - this.d;
        float r7 = r11.getY(r4) - this.e;
        float r8 = Math.abs(r6);
        float r13 = Math.abs(r7);
        float r14 = this.q;
        if (r8 >= r14) goto L20;
        if (r13 < r14) goto L33;
    L20:
        if (r8 <= r13) goto L25;
        if (r1.d() == true) goto L33;
    L25:
        if (r13 > r8) goto L27;
    L29:
        View r2 = n(r11);
        if (r2 == null) goto L33;
        r5 = this.r.M(r2);
        goto L33
    L27:
        if (r1.e() == false) goto L29;
    L33:
        if (r5 == null) goto L71;
        RecyclerView r15 = this.r;
        int r16 = r12.c;
        int r17 = (e22.b(((r16 << 8) | (r16 | 3)) | 196608, r15.getLayoutDirection()) & 65280) >> 8;
        if (r17 == 0) goto L72;
        float r18 = r11.getX(r10);
        float r19 = r11.getY(r10);
        float r20 = r18 - this.d;
        float r110 = r19 - this.e;
        float r21 = Math.abs(r20);
        float r22 = Math.abs(r110);
        float r23 = this.q;
        if (r21 >= r23) goto L44;
        if (r22 >= r23) goto L44;
        return;
    L44:
        if (r21 <= r22) goto L56;
        if (r20 >= 0.0f) goto L51;
        if ((r17 & 4) != 0) goto L51;
        return;
    L51:
        if (r20 > 0.0f) goto L53;
    L65:
        this.i = 0.0f;
        this.h = 0.0f;
        this.l = r11.getPointerId(0);
        r(r5, 1);
        return;
    L53:
        if ((r17 & 8) != 0) goto L65;
        return;
    L56:
        if (r110 >= 0.0f) goto L61;
        if ((r17 & 1) != 0) goto L61;
        return;
    L61:
        if (r110 <= 0.0f) goto L65;
        if ((r17 & 2) != 0) goto L65;
        return;
    L72:
        return;
    L71:
        return;
    L70:
        return;
    }

    public final int l(int r9) {
        if ((r9 & 3) == 0) goto L28;
        int r2 = 1;
        if (this.i <= 0.0f) goto L7;
        int r0 = 2;
    L8:
        VelocityTracker r4 = this.t;
        e22 r5 = this.m;
        if (r4 != null) goto L11;
    L23:
        float r1 = this.r.getHeight();
        r5.getClass();
        float r3 = r1 * 0.5f;
        if ((r9 & r0) != 0) goto L26;
        return 0;
    L26:
        if (Math.abs(this.i) <= r3) goto L31;
        return r0;
    L31:
        return 0;
    L11:
        if (this.l <= (-1)) goto L23;
        float r6 = this.g;
        r5.getClass();
        r4.computeCurrentVelocity(1000, r6);
        float r7 = this.t.getXVelocity(this.l);
        float r8 = this.t.getYVelocity(this.l);
        if (r8 <= 0.0f) goto L15;
        r2 = 2;
    L15:
        float r10 = Math.abs(r8);
        if ((r2 & r9) == 0) goto L23;
        if (r2 != r0) goto L23;
        if (r10 < this.f) goto L23;
        if (r10 <= Math.abs(r7)) goto L23;
        return r2;
    L7:
        r0 = 1;
        goto L8
    L28:
        return 0;
    }

    public final void m(cx3 r4, boolean r5) {
        ArrayList r3 = this.p;
        int r0 = r3.size() - 1;
    L3:
        if (r0 < 0) goto L12;
        b22 r1 = (b22) r3.get(r0);
        if (r1.e == r4) goto L6;
        r0 = r0 - 1;
        goto L3
    L6:
        r1.k |= r5;
        if (r1.l == true) goto L9;
        r1.g.cancel();
    L9:
        r3.remove(r0);
        return;
    }

    public final View n(MotionEvent r7) {
        float r0 = r7.getX();
        float r8 = r7.getY();
        cx3 r1 = this.c;
        if (r1 == null) goto L7;
        View r2 = r1.a;
        if (p(r2, r0, r8, this.j + this.h, this.k + this.i) == false) goto L7;
        return r2;
    L7:
        ArrayList r3 = this.p;
        int r4 = r3.size() - 1;
    L8:
        if (r4 < 0) goto L13;
        b22 r5 = (b22) r3.get(r4);
        View r6 = r5.e.a;
        if (p(r6, r0, r8, r5.i, r5.j) == true) goto L11;
        r4 = r4 - 1;
        goto L8
    L11:
        return r6;
    L13:
        RecyclerView r9 = this.r;
        int r10 = r9.s.h() - 1;
    L14:
        if (r10 < 0) goto L25;
        View r11 = r9.s.g(r10);
        float r12 = r11.getTranslationX();
        float r13 = r11.getTranslationY();
        if (r0 < (r11.getLeft() + r12)) goto L24;
        if (r0 > (r11.getRight() + r12)) goto L24;
        if (r8 < (r11.getTop() + r13)) goto L24;
        if (r8 > (r11.getBottom() + r13)) goto L24;
        return r11;
    L24:
        r10 = r10 - 1;
        goto L14
    L25:
        return null;
    }

    public final void o(float[] r4) {
        if ((this.o & 12) == 0) goto L5;
        r4[0] = (this.j + this.h) - this.c.a.getLeft();
    L7:
        if ((this.o & 3) == 0) goto L10;
        r4[1] = (this.k + this.i) - this.c.a.getTop();
        return;
    L10:
        r4[1] = this.c.a.getTranslationY();
        return;
    L5:
        r4[0] = this.c.a.getTranslationX();
        goto L7
    }

    public final void q(cx3 r24) {
        if (this.r.isLayoutRequested() == false) goto L6;
        return;
    L6:
        if (this.n != 2) goto L135;
        e22 r2 = this.m;
        r2.getClass();
        int r4 = (int) (this.j + this.h);
        int r5 = (int) (this.k + this.i);
        View r6 = r24.a;
        if (Math.abs(r5 - r6.getTop()) < (r6.getHeight() * 0.5f)) goto L11;
    L13:
        ArrayList r7 = this.u;
        if (r7 != null) goto L16;
        this.u = new ArrayList();
        this.v = new ArrayList();
    L17:
        int r8 = Math.round(this.j + this.h);
        int r9 = Math.round(this.k + this.i);
        int r10 = r6.getWidth() + r8;
        int r11 = r6.getHeight() + r9;
        int r12 = (r8 + r10) / 2;
        int r13 = (r9 + r11) / 2;
        mw3 r14 = this.r.getLayoutManager();
        int r15 = r14.v();
        int r3 = 0;
    L18:
        if (r3 >= r15) goto L39;
        View r16 = r14.u(r3);
        if (r16 != r6) goto L23;
        int r18 = r3;
    L38:
        r3 = r18 + 1;
        r4 = r4;
        r5 = r5;
        r8 = r8;
        goto L18
    L23:
        r18 = r3;
        if (r16.getBottom() < r9) goto L38;
        if (r16.getTop() > r11) goto L38;
        if (r16.getRight() < r8) goto L38;
        if (r16.getLeft() > r10) goto L38;
        cx3 r17 = this.r.M(r16);
        int r19 = Math.abs(r12 - ((r16.getRight() + r16.getLeft()) / 2));
        int r110 = Math.abs(r13 - ((r16.getBottom() + r16.getTop()) / 2));
        int r111 = (r110 * r110) + (r19 * r19);
        int r20 = this.u.size();
        int r21 = 0;
        int r22 = 0;
    L33:
        if (r21 >= r20) goto L37;
        int r23 = r20;
        if (r111 <= ((Integer) this.v.get(r21)).intValue()) goto L37;
        r22 = r22 + 1;
        r21 = r21 + 1;
        r20 = r23;
    L37:
        this.u.add(r22, r17);
        this.v.add(r22, Integer.valueOf(r111));
        goto L38
    L39:
        int r112 = r4;
        int r25 = r5;
        ArrayList r26 = this.u;
        if (r26.size() == 0) goto L137;
        int r27 = r6.getWidth() + r112;
        int r28 = r6.getHeight() + r25;
        int r29 = r112 - r6.getLeft();
        int r30 = r25 - r6.getTop();
        int r31 = r26.size();
        cx3 r113 = null;
        int r114 = -1;
        int r115 = 0;
    L43:
        if (r115 >= r31) goto L79;
        cx3 r116 = (cx3) r26.get(r115);
        if (r29 <= 0) goto L53;
        int r117 = r116.a.getRight() - r27;
        if (r117 >= 0) goto L53;
        ArrayList r118 = r26;
        if (r116.a.getRight() <= r6.getRight()) goto L54;
        int r32 = Math.abs(r117);
        if (r32 <= r114) goto L54;
        r114 = r32;
        r113 = r116;
    L54:
        if (r29 >= 0) goto L62;
        int r33 = r116.a.getLeft() - r112;
        if (r33 <= 0) goto L62;
        if (r116.a.getLeft() >= r6.getLeft()) goto L62;
        int r34 = Math.abs(r33);
        if (r34 <= r114) goto L62;
        r114 = r34;
        r113 = r116;
    L62:
        if (r30 >= 0) goto L70;
        int r35 = r116.a.getTop() - r25;
        if (r35 <= 0) goto L70;
        if (r116.a.getTop() >= r6.getTop()) goto L70;
        int r36 = Math.abs(r35);
        if (r36 <= r114) goto L70;
        r114 = r36;
        r113 = r116;
    L70:
        if (r30 <= 0) goto L78;
        int r37 = r116.a.getBottom() - r28;
        if (r37 >= 0) goto L78;
        if (r116.a.getBottom() <= r6.getBottom()) goto L78;
        int r38 = Math.abs(r37);
        if (r38 <= r114) goto L78;
        r114 = r38;
        r113 = r116;
    L78:
        r115 = r115 + 1;
        r26 = r118;
    L53:
        r118 = r26;
        goto L54
    L79:
        if (r113 != null) goto L82;
        this.u.clear();
        this.v.clear();
        return;
    L82:
        View r39 = r113.a;
        int r40 = r113.b();
        r24.b();
        if (r2.h(this.r, r24, r113) == false) goto L131;
        RecyclerView r0 = this.r;
        mw3 r1 = r0.getLayoutManager();
        if ((r1 instanceof LinearLayoutManager) == false) goto L104;
        LinearLayoutManager r41 = (LinearLayoutManager) r1;
        r41.c("Cannot drop a view during a scroll or layout calculation");
        r41.L0();
        r41.d1();
        int r42 = mw3.I(r6);
        int r43 = mw3.I(r39);
        if (r42 >= r43) goto L89;
        byte r44 = 1;
    L90:
        boolean r45 = r41.u;
        qz0 r46 = r41.r;
        if (r45 == false) goto L98;
        if (r44 != 1) goto L95;
        r41.f1(r43, r46.i() - (r41.r.e(r6) + r41.r.g(r39)));
        return;
    L95:
        r41.f1(r43, r46.i() - r41.r.d(r39));
        return;
    L98:
        if (r44 != (-1)) goto L101;
        r41.f1(r43, r46.g(r39));
        return;
    L101:
        r41.f1(r43, r46.d(r39) - r41.r.e(r6));
        return;
    L89:
        r44 = -1;
        goto L90
    L104:
        if (r1.d() == false) goto L112;
        if (mw3.A(r39) > r0.getPaddingLeft()) goto L109;
        r0.j0(r40);
    L109:
        if (mw3.B(r39) < (r0.getWidth() - r0.getPaddingRight())) goto L112;
        r0.j0(r40);
    L112:
        if (r1.e() == true) goto L114;
        return;
    L114:
        if (mw3.C(r39) > r0.getPaddingTop()) goto L117;
        r0.j0(r40);
    L117:
        if (mw3.y(r39) < (r0.getHeight() - r0.getPaddingBottom())) goto L133;
        r0.j0(r40);
        return;
    L133:
        return;
    L131:
        return;
    L137:
        return;
    L16:
        r7.clear();
        this.v.clear();
        goto L17
    L11:
        if (Math.abs(r4 - r6.getLeft()) >= (r6.getWidth() * 0.5f)) goto L13;
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [cx3] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [e22, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [e22] */
    /* JADX WARN: Type inference failed for: r3v4 */
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
    public final void r(cx3 r23, int r24) {
        if (r23 == this.c) goto L5;
    L7:
        this.B = Long.MIN_VALUE;
        int r3 = this.n;
        m(r23, true);
        this.n = r24;
        if (r24 != 2) goto L13;
        if (r23 == null) goto L11;
        this.w = r23.a;
        goto L13
    L11:
        kf2.n("Must pass a ViewHolder when dragging");
        return;
    L13:
        int r15 = (1 << ((r24 * 8) + 8)) - 1;
        ?? r2 = this.c;
        e22 r0 = this.m;
        if (r2 == 0) goto L77;
        View r5 = r2.a;
        if (r5.getParent() == null) goto L71;
        if (r3 != 2) goto L20;
    L18:
        int r8 = 0;
    L43:
        VelocityTracker r6 = this.t;
        if (r6 == null) goto L46;
        r6.recycle();
        this.t = null;
    L46:
        char r7 = 4;
        float r9 = 0.0f;
        if (r8 == 1) goto L57;
        if (r8 == 2) goto L57;
        if (r8 == 4) goto L56;
        if (r8 == 8) goto L56;
        if (r8 == 16) goto L56;
        if (r8 == 32) goto L56;
        Object r4 = null;
        char r17 = 0;
        float r10 = 0.0f;
    L58:
        if (r3 != 2) goto L60;
        r7 = '\b';
    L62:
        float[] r11 = this.b;
        o(r11);
        char r20 = r7;
        ?? r12 = r17;
        b22 r1 = new b22(this, r2, r3, r11[r17], r11[1], r9, r10, r8, r2);
        RecyclerView r13 = this.r;
        r0.getClass();
        jw3 r14 = r13.getItemAnimator();
        if (r14 != null) goto L67;
        if (r20 != '\b') goto L66;
        long r16 = 200;
    L70:
        ValueAnimator r18 = r1.g;
        r18.setDuration(r16);
        this.p.add(r1);
        r2.p(r12);
        r18.start();
        ?? r19 = r0;
        boolean r21 = true;
        cx3 r22 = null;
        ?? r110 = r12;
    L76:
        this.c = r22;
        boolean r25 = r21;
        ?? r26 = r19;
        ?? r111 = r110;
    L78:
        if (r23 == null) goto L82;
        View r27 = r23.a;
        RecyclerView r28 = this.r;
        int r29 = r26.c;
        this.o = (e22.b(((r29 << 8) | (r29 | 3)) | 196608, r28.getLayoutDirection()) & r15) >> (this.n * 8);
        this.j = r27.getLeft();
        this.k = r27.getTop();
        this.c = r23;
        if (r24 != 2) goto L82;
        r27.performHapticFeedback(r111 == true ? 1 : 0);
    L82:
        ?? r30 = this.r.getParent();
        if (r30 == 0) goto L88;
        ?? r112 = r111;
        if (this.c == null) goto L87;
        r112 = 1;
    L87:
        r30.requestDisallowInterceptTouchEvent(r112);
    L88:
        if (r25 == true) goto L90;
        this.r.getLayoutManager().f = true;
    L90:
        r26.getClass();
        this.r.invalidate();
        return;
    L66:
        r16 = 250;
        goto L70
    L67:
        if (r20 != '\b') goto L69;
        r16 = r14.e;
        goto L70
    L69:
        r16 = r14.d;
        goto L70
    L60:
        if (r8 <= 0) goto L62;
        r7 = 2;
    L56:
        r17 = 0;
        r4 = null;
        r10 = 0.0f;
        r9 = Math.signum(this.h) * this.r.getWidth();
    L57:
        r17 = 0;
        r10 = Math.signum(this.i) * this.r.getHeight();
        r4 = null;
        goto L58
    L20:
        if (this.n == 2) goto L18;
        RecyclerView r31 = this.r;
        int r32 = r0.c;
        int r33 = ((r32 << 8) | (r32 | 3)) | 196608;
        int r34 = (e22.b(r33, r31.getLayoutDirection()) & 65280) >> 8;
        if (r34 == 0) goto L18;
        int r35 = (r33 & 65280) >> 8;
        if (Math.abs(this.h) <= Math.abs(this.i)) goto L35;
        r8 = j(r34);
        if (r8 > 0) goto L30;
        r8 = l(r34);
        if (r8 <= 0) goto L18;
    L30:
        if ((r35 & r8) != 0) goto L43;
        r8 = e22.c(r8, this.r.getLayoutDirection());
        goto L43
    L35:
        r8 = l(r34);
        if (r8 > 0) goto L43;
        r8 = j(r34);
        if (r8 <= 0) goto L18;
        if ((r35 & r8) != 0) goto L43;
        r8 = e22.c(r8, this.r.getLayoutDirection());
        goto L43
    L71:
        r110 = 0;
        if (r5 != this.w) goto L74;
        r22 = null;
        this.w = null;
    L75:
        ?? r36 = r0;
        r36.a(this.r, r2);
        r21 = false;
        r19 = r36;
        goto L76
    L74:
        r22 = null;
        goto L75
    L77:
        r26 = r0;
        r111 = 0;
        r25 = false;
        goto L78
    L5:
        if (r24 != this.n) goto L7;
    }

    public final void s(int r2, int r3, MotionEvent r4) {
        float r0 = r4.getX(r3);
        float r5 = r4.getY(r3);
        float r1 = r0 - this.d;
        this.h = r1;
        this.i = r5 - this.e;
        if ((r2 & 4) != 0) goto L6;
        this.h = Math.max(0.0f, r1);
    L6:
        if ((r2 & 8) != 0) goto L9;
        this.h = Math.min(0.0f, this.h);
    L9:
        if ((r2 & 1) != 0) goto L12;
        this.i = Math.max(0.0f, this.i);
    L12:
        if ((r2 & 2) != 0) goto L15;
        this.i = Math.min(0.0f, this.i);
        return;
    }
}
