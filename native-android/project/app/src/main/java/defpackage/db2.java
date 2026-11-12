package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class db2 {
    public int a;
    public RecyclerView b;
    public mw3 c;
    public boolean d;
    public boolean e;
    public View f;
    public final ww3 g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public db2(Context r4) {
        this.a = -1;
        ww3 r1 = new ww3();
        r1.d = -1;
        r1.f = false;
        r1.g = 0;
        r1.a = 0;
        r1.b = 0;
        r1.c = Integer.MIN_VALUE;
        r1.e = null;
        this.g = r1;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = r4.getResources().getDisplayMetrics();
    }

    public static int a(int r1, int r2, int r3, int r4, int r5) {
        if (r5 == (-1)) goto L20;
        if (r5 != 0) goto L6;
        int r6 = r3 - r1;
        if (r6 <= 0) goto L14;
        return r6;
    L14:
        int r7 = r4 - r2;
        if (r7 >= 0) goto L17;
        return r7;
    L17:
        return 0;
    L6:
        if (r5 == 1) goto L8;
        kf2.n("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        return 0;
    L8:
        return r4 - r2;
    L20:
        return r3 - r1;
    }

    public int b(View r4, int r5) {
        mw3 r3 = this.c;
        if (r3 != null) goto L5;
        return 0;
    L5:
        if (r3.d() == false) goto L11;
        nw3 r0 = (nw3) r4.getLayoutParams();
        return a(mw3.A(r4) - ((ViewGroup.MarginLayoutParams) r0).leftMargin, mw3.B(r4) + ((ViewGroup.MarginLayoutParams) r0).rightMargin, r3.F(), r3.n - r3.G(), r5);
    L11:
        return 0;
    }

    public int c(View r4, int r5) {
        mw3 r3 = this.c;
        if (r3 != null) goto L5;
        return 0;
    L5:
        if (r3.e() == false) goto L11;
        nw3 r0 = (nw3) r4.getLayoutParams();
        return a(mw3.C(r4) - ((ViewGroup.MarginLayoutParams) r0).topMargin, mw3.y(r4) + ((ViewGroup.MarginLayoutParams) r0).bottomMargin, r3.H(), r3.o - r3.E(), r5);
    L11:
        return 0;
    }

    public float d(DisplayMetrics r1) {
        return 25.0f / r1.densityDpi;
    }

    public int e(int r2) {
        float r3 = Math.abs(r2);
        if (this.m == true) goto L6;
        this.n = d(this.l);
        this.m = true;
    L6:
        return (int) Math.ceil(r3 * this.n);
    }

    public PointF f(int r2) {
        Object r1 = this.c;
        if ((r1 instanceof xw3) == true) goto L5;
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + xw3.class.getCanonicalName());
        return null;
    L5:
        return ((xw3) r1).a(r2);
    }

    public final void g(int r9, int r10) {
        RecyclerView r0 = this.b;
        int r2 = -1;
        if (this.a == (-1)) goto L5;
        if (r0 == null) goto L5;
    L7:
        if (this.d == true) goto L9;
    L19:
        boolean r1 = false;
        this.d = false;
        View r5 = this.f;
        ww3 r6 = this.g;
        if (r5 == null) goto L29;
        this.b.getClass();
        cx3 r7 = RecyclerView.N(r5);
        if (r7 == null) goto L25;
        r2 = r7.d();
    L25:
        if (r2 != this.a) goto L27;
        View r3 = this.f;
        yw3 r4 = r0.u0;
        h(r3, r6);
        r6.a(r0);
        i();
        goto L29
    L27:
        Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
        this.f = null;
    L29:
        if (this.e == false) goto L60;
        yw3 r8 = r0.u0;
        if (this.b.A.v() != 0) goto L33;
        i();
    L52:
        if (r6.d < 0) goto L54;
        r1 = true;
    L54:
        r6.a(r0);
        if (r1 == true) goto L57;
        return;
    L57:
        if (this.e == false) goto L62;
        this.d = true;
        r0.r0.b();
        return;
    L62:
        return;
    L33:
        int r11 = this.o;
        int r12 = r11 - r9;
        if ((r11 * r12) > 0) goto L36;
        r12 = 0;
    L36:
        this.o = r12;
        int r13 = this.p;
        int r14 = r13 - r10;
        if ((r13 * r14) > 0) goto L39;
        r14 = 0;
    L39:
        this.p = r14;
        if (r12 != 0) goto L52;
        if (r14 != 0) goto L52;
        PointF r15 = f(this.a);
        if (r15 == null) goto L50;
        float r16 = r15.x;
        if (r16 == 0.0f) goto L47;
    L49:
        float r17 = r15.y;
        float r18 = (float) Math.sqrt((r17 * r17) + (r16 * r16));
        float r19 = r15.x / r18;
        r15.x = r19;
        float r20 = r15.y / r18;
        r15.y = r20;
        this.k = r15;
        this.o = (int) (r19 * 10000.0f);
        this.p = (int) (r20 * 10000.0f);
        int r21 = e(10000);
        int r110 = (int) (this.o * 1.2f);
        int r22 = (int) (this.p * 1.2f);
        r6.a = r110;
        r6.b = r22;
        r6.c = (int) (r21 * 1.2f);
        r6.e = this.i;
        r6.f = true;
        goto L52
    L47:
        if (r15.y != 0.0f) goto L49;
    L50:
        r6.d = this.a;
        i();
        goto L52
    L60:
        return;
    L9:
        if (this.f != null) goto L19;
        if (this.c == null) goto L19;
        PointF r23 = f(this.a);
        if (r23 == null) goto L19;
        float r24 = r23.x;
        if (r24 == 0.0f) goto L17;
    L18:
        r0.i0((int) Math.signum(r24), (int) Math.signum(r23.y), null);
        goto L19
    L17:
        if (r23.y == 0.0f) goto L19;
    L5:
        i();
        goto L7
    }

    public void h(View r7, ww3 r8) {
        PointF r0 = this.k;
        int r1 = 0;
        if (r0 == null) goto L10;
        float r2 = r0.x;
        if (r2 == 0.0f) goto L10;
        if (r2 <= 0.0f) goto L9;
        int r3 = 1;
    L11:
        int r4 = b(r7, r3);
        PointF r5 = this.k;
        if (r5 == null) goto L19;
        float r6 = r5.y;
        if (r6 == 0.0f) goto L19;
        if (r6 <= 0.0f) goto L18;
        r1 = 1;
        goto L19
    L18:
        r1 = -1;
    L19:
        int r9 = c(r7, r1);
        int r10 = (int) Math.ceil(((double) e((int) Math.sqrt((r9 * r9) + (r4 * r4)))) / 0.3356d);
        if (r10 <= 0) goto L23;
        r8.a = -r4;
        r8.b = -r9;
        r8.c = r10;
        r8.e = this.j;
        r8.f = true;
        return;
    L23:
        return;
    L9:
        r3 = -1;
    L10:
        r3 = 0;
        goto L11
    }

    public final void i() {
        if (this.e == true) goto L5;
        return;
    L5:
        this.e = false;
        this.p = 0;
        this.o = 0;
        this.k = null;
        this.b.u0.a = -1;
        this.f = null;
        this.a = -1;
        this.d = false;
        mw3 r0 = this.c;
        if (r0.e != this) goto L8;
        r0.e = null;
    L8:
        this.c = null;
        this.b = null;
    }
}
