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
    public int a = -1;
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

    public db2(Context context) {
        ww3 ww3Var = new ww3();
        ww3Var.d = -1;
        ww3Var.f = false;
        ww3Var.g = 0;
        ww3Var.a = 0;
        ww3Var.b = 0;
        ww3Var.c = Integer.MIN_VALUE;
        ww3Var.e = null;
        this.g = ww3Var;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            kf2.n("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        mw3 mw3Var = this.c;
        if (mw3Var == null || !mw3Var.d()) {
            return 0;
        }
        nw3 nw3Var = (nw3) view.getLayoutParams();
        return a(mw3.A(view) - ((ViewGroup.MarginLayoutParams) nw3Var).leftMargin, mw3.B(view) + ((ViewGroup.MarginLayoutParams) nw3Var).rightMargin, mw3Var.F(), mw3Var.n - mw3Var.G(), i);
    }

    public int c(View view, int i) {
        mw3 mw3Var = this.c;
        if (mw3Var == null || !mw3Var.e()) {
            return 0;
        }
        nw3 nw3Var = (nw3) view.getLayoutParams();
        return a(mw3.C(view) - ((ViewGroup.MarginLayoutParams) nw3Var).topMargin, mw3.y(view) + ((ViewGroup.MarginLayoutParams) nw3Var).bottomMargin, mw3Var.H(), mw3Var.o - mw3Var.E(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = d(this.l);
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }

    public PointF f(int i) {
        Object obj = this.c;
        if (obj instanceof xw3) {
            return ((xw3) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + xw3.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    public final void g(int i, int i2) {
        PointF pointFF;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f == null && this.c != null && (pointFF = f(this.a)) != null) {
            float f = pointFF.x;
            if (f != 0.0f || pointFF.y != 0.0f) {
                recyclerView.i0((int) Math.signum(f), (int) Math.signum(pointFF.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        ww3 ww3Var = this.g;
        if (view != null) {
            this.b.getClass();
            cx3 cx3VarN = RecyclerView.N(view);
            if ((cx3VarN != null ? cx3VarN.d() : -1) == this.a) {
                View view2 = this.f;
                yw3 yw3Var = recyclerView.u0;
                h(view2, ww3Var);
                ww3Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            yw3 yw3Var2 = recyclerView.u0;
            if (this.b.A.v() == 0) {
                i();
            } else {
                int i3 = this.o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.o = i4;
                int i5 = this.p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFF2 = f(this.a);
                    if (pointFF2 != null) {
                        float f2 = pointFF2.x;
                        if (f2 == 0.0f && pointFF2.y == 0.0f) {
                            ww3Var.d = this.a;
                            i();
                        } else {
                            float f3 = pointFF2.y;
                            float fSqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = pointFF2.x / fSqrt;
                            pointFF2.x = f4;
                            float f5 = pointFF2.y / fSqrt;
                            pointFF2.y = f5;
                            this.k = pointFF2;
                            this.o = (int) (f4 * 10000.0f);
                            this.p = (int) (f5 * 10000.0f);
                            int iE = e(10000);
                            int i7 = (int) (this.o * 1.2f);
                            int i8 = (int) (this.p * 1.2f);
                            ww3Var.a = i7;
                            ww3Var.b = i8;
                            ww3Var.c = (int) (iE * 1.2f);
                            ww3Var.e = this.i;
                            ww3Var.f = true;
                        }
                    } else {
                        ww3Var.d = this.a;
                        i();
                    }
                }
            }
            boolean z = ww3Var.d >= 0;
            ww3Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.r0.b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    public void h(View view, ww3 ww3Var) {
        int i;
        PointF pointF = this.k;
        int i2 = 0;
        if (pointF != null) {
            float f = pointF.x;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = f > 0.0f ? 1 : -1;
            }
        } else {
            i = 0;
        }
        int iB = b(view, i);
        PointF pointF2 = this.k;
        if (pointF2 != null) {
            float f2 = pointF2.y;
            if (f2 != 0.0f) {
                i2 = f2 > 0.0f ? 1 : -1;
            }
        }
        int iC = c(view, i2);
        int iCeil = (int) Math.ceil(((double) e((int) Math.sqrt((iC * iC) + (iB * iB)))) / 0.3356d);
        if (iCeil > 0) {
            ww3Var.a = -iB;
            ww3Var.b = -iC;
            ww3Var.c = iCeil;
            ww3Var.e = this.j;
            ww3Var.f = true;
        }
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.p = 0;
            this.o = 0;
            this.k = null;
            this.b.u0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            mw3 mw3Var = this.c;
            if (mw3Var.e == this) {
                mw3Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
