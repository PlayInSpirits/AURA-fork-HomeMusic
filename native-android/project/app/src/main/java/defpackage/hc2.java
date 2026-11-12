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
    public static final int E = ViewConfiguration.getTapTimeout();
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

    public hc2(cx0 cx0Var) {
        qn qnVar = new qn();
        qnVar.e = Long.MIN_VALUE;
        qnVar.g = -1L;
        qnVar.f = 0L;
        this.n = qnVar;
        this.o = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.r = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.s = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.v = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.w = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.x = fArr5;
        this.p = cx0Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.t = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.u = E;
        qnVar.a = SmartPlan.MAX_QUEUE;
        qnVar.b = SmartPlan.MAX_QUEUE;
        this.D = cx0Var;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(int i, float f, float f2, float f3) {
        float fB;
        float interpolation;
        float fB2 = b(this.r[i] * f2, 0.0f, this.s[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.o;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.v[i];
            float f5 = this.w[i];
            float f6 = this.x[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.v[i];
        float f9 = this.w[i];
        float f10 = this.x[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.t;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.B && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.z) {
            this.B = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        qn qnVar = this.n;
        int i2 = (int) (jCurrentAnimationTimeMillis - qnVar.e);
        int i3 = qnVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        qnVar.i = i;
        qnVar.h = qnVar.a(jCurrentAnimationTimeMillis);
        qnVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        cx0 cx0Var;
        int count;
        qn qnVar = this.n;
        float f = qnVar.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(qnVar.c);
        if (iAbs != 0 && (count = (cx0Var = this.D).getCount()) != 0) {
            int childCount = cx0Var.getChildCount();
            int firstVisiblePosition = cx0Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && cx0Var.getChildAt(0).getTop() >= 0)) : !(i >= count && cx0Var.getChildAt(childCount - 1).getBottom() <= cx0Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.C) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = 3;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.A = true;
            this.y = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            cx0 cx0Var = this.p;
            float fA = a(0, x, width, cx0Var.getWidth());
            float fA2 = a(1, motionEvent.getY(), view.getHeight(), cx0Var.getHeight());
            qn qnVar = this.n;
            qnVar.c = fA;
            qnVar.d = fA2;
            if (!this.B && e()) {
                if (this.q == null) {
                    this.q = new g5(i2, this);
                }
                this.B = true;
                this.z = true;
                if (this.y || (i = this.u) <= 0) {
                    this.q.run();
                } else {
                    g5 g5Var = this.q;
                    long j = i;
                    WeakHashMap weakHashMap = j65.a;
                    cx0Var.postOnAnimationDelayed(g5Var, j);
                }
                this.y = true;
            }
        }
        return false;
    }
}
