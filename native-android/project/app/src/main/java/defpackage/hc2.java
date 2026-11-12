package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.eddyizm.tempus.homemusic.SmartPlan;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hc2 implements View.OnTouchListener {
    public static final int E = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public final cx0 D;
    public final qn n;
    public final AccelerateInterpolator o;
    public final cx0 p;
    public g5 q;
    public final float[] r;
    public final float[] s;
    public final int t;
    public final int u;
    public final float[] v;
    public final float[] w;
    public final float[] x;
    public boolean y;
    public boolean z;

    static {
        E = ViewConfiguration.getTapTimeout();
    }

    public hc2(cx0 r12) {
        qn r0 = new qn();
        r0.e = Long.MIN_VALUE;
        r0.g = -1;
        r0.f = 0;
        this.n = r0;
        this.o = new AccelerateInterpolator();
        float[] r2 = {0.0f, 0.0f};
        this.r = r2;
        float[] r3 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.s = r3;
        float[] r4 = {0.0f, 0.0f};
        this.v = r4;
        float[] r5 = {0.0f, 0.0f};
        this.w = r5;
        float[] r1 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.x = r1;
        this.p = r12;
        float r6 = Resources.getSystem().getDisplayMetrics().density;
        float r7 = ((int) ((1575.0f * r6) + 0.5f)) / 1000.0f;
        r1[0] = r7;
        r1[1] = r7;
        float r8 = ((int) ((r6 * 315.0f) + 0.5f)) / 1000.0f;
        r5[0] = r8;
        r5[1] = r8;
        this.t = 1;
        r3[0] = Float.MAX_VALUE;
        r3[1] = Float.MAX_VALUE;
        r2[0] = 0.2f;
        r2[1] = 0.2f;
        r4[0] = 0.001f;
        r4[1] = 0.001f;
        this.u = E;
        r0.a = SmartPlan.MAX_QUEUE;
        r0.b = SmartPlan.MAX_QUEUE;
        this.D = r12;
    }

    public static float b(float r1, float r2, float r3) {
        if (r1 <= r3) goto L6;
        return r3;
    L6:
        if (r1 >= r2) goto L8;
        return r2;
    L8:
        return r1;
    }

    public final float a(int r4, float r5, float r6, float r7) {
        float r0 = b(this.r[r4] * r6, 0.0f, this.s[r4]);
        float r8 = c(r6 - r5, r0) - c(r5, r0);
        AccelerateInterpolator r1 = this.o;
        if (r8 >= 0.0f) goto L6;
        float r9 = -r1.getInterpolation(-r8);
    L8:
        float r10 = b(r9, -1.0f, 1.0f);
    L11:
        if (r10 != 0.0f) goto L13;
        return 0.0f;
    L13:
        float r2 = this.v[r4];
        float r3 = this.w[r4];
        float r11 = this.x[r4];
        float r12 = r2 * r7;
        if (r10 <= 0.0f) goto L18;
        return b(r10 * r12, r3, r11);
    L18:
        return -b((-r10) * r12, r3, r11);
    L6:
        if (r8 <= 0.0f) goto L9;
        r9 = r1.getInterpolation(r8);
        goto L8
    L9:
        r10 = 0.0f;
        goto L11
    }

    public final float c(float r6, float r7) {
        if (r7 == 0.0f) goto L25;
        int r2 = this.t;
        if (r2 == 0) goto L16;
        if (r2 == 1) goto L16;
        if (r2 != 2) goto L25;
        if (r6 >= 0.0f) goto L25;
        return r6 / (-r7);
    L16:
        if (r6 >= r7) goto L25;
        if (r6 < 0.0f) goto L22;
        return 1.0f - (r6 / r7);
    L22:
        if (this.B == false) goto L25;
        if (r2 != 1) goto L25;
        return 1.0f;
    L25:
        return 0.0f;
    }

    public final void d() {
        int r1 = 0;
        if (this.z == false) goto L6;
        this.B = false;
        return;
    L6:
        long r2 = AnimationUtils.currentAnimationTimeMillis();
        qn r6 = this.n;
        int r0 = (int) (r2 - r6.e);
        int r4 = r6.b;
        if (r0 <= r4) goto L9;
        r1 = r4;
    L12:
        r6.i = r1;
        r6.h = r6.a(r2);
        r6.g = r2;
        return;
    L9:
        if (r0 < 0) goto L12;
        r1 = r0;
        goto L12
    }

    public final boolean e() {
        qn r0 = this.n;
        float r1 = r0.d;
        int r2 = (int) (r1 / Math.abs(r1));
        Math.abs(r0.c);
        if (r2 == 0) goto L19;
        cx0 r7 = this.D;
        int r3 = r7.getCount();
        if (r3 == 0) goto L19;
        int r4 = r7.getChildCount();
        int r5 = r7.getFirstVisiblePosition();
        int r6 = r5 + r4;
        if (r2 <= 0) goto L13;
        if (r6 >= r3) goto L11;
    L18:
        return true;
    L11:
        if (r7.getChildAt(r4 - 1).getBottom() > r7.getHeight()) goto L18;
    L13:
        if (r2 >= 0) goto L19;
        if (r5 > 0) goto L18;
        if (r7.getChildAt(0).getTop() < 0) goto L18;
    L19:
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r9, MotionEvent r10) {
        if (this.C == false) goto L29;
        int r0 = r10.getActionMasked();
        int r2 = 3;
        if (r0 == 0) goto L14;
        if (r0 != 1) goto L9;
    L12:
        d();
        return false;
    L9:
        if (r0 == 2) goto L15;
        if (r0 == 3) goto L12;
    L15:
        float r1 = r10.getX();
        float r4 = r9.getWidth();
        cx0 r5 = this.p;
        float r3 = a(0, r1, r4, r5.getWidth());
        float r11 = a(1, r10.getY(), r9.getHeight(), r5.getHeight());
        qn r12 = this.n;
        r12.c = r3;
        r12.d = r11;
        if (this.B == true) goto L29;
        if (e() == false) goto L29;
        if (this.q != null) goto L22;
        this.q = new g5(r2, this);
    L22:
        this.B = true;
        this.z = true;
        if (this.y == true) goto L27;
        int r13 = this.u;
        if (r13 <= 0) goto L27;
        g5 r14 = this.q;
        long r6 = r13;
        WeakHashMap r15 = j65.a;
        r5.postOnAnimationDelayed(r14, r6);
    L28:
        this.y = true;
    L27:
        this.q.run();
        goto L28
    L14:
        this.A = true;
        this.y = false;
    L29:
        return false;
    }
}
