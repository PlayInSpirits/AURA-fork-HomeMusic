package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bx3 implements Runnable {
    public int n;
    public int o;
    public OverScroller p;
    public Interpolator q;
    public boolean r;
    public boolean s;
    public final /* synthetic */ RecyclerView t;

    public bx3(RecyclerView recyclerView) {
        this.t = recyclerView;
        c22 c22Var = RecyclerView.W0;
        this.q = c22Var;
        this.r = false;
        this.s = false;
        this.p = new OverScroller(recyclerView.getContext(), c22Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.t;
        recyclerView.setScrollState(2);
        this.o = 0;
        this.n = 0;
        Interpolator interpolator = this.q;
        c22 c22Var = RecyclerView.W0;
        if (interpolator != c22Var) {
            this.q = c22Var;
            this.p = new OverScroller(recyclerView.getContext(), c22Var);
        }
        this.p.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.r) {
            this.s = true;
            return;
        }
        RecyclerView recyclerView = this.t;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = j65.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.t;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.W0;
        }
        if (this.q != interpolator) {
            this.q = interpolator;
            this.p = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.o = 0;
        this.n = 0;
        recyclerView.setScrollState(2);
        this.p.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.t;
        int[] iArr = recyclerView.G0;
        if (recyclerView.A == null) {
            recyclerView.removeCallbacks(this);
            this.p.abortAnimation();
            return;
        }
        this.s = false;
        this.r = true;
        recyclerView.p();
        OverScroller overScroller = this.p;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.n;
            int i7 = currY - this.o;
            this.n = currX;
            this.o = currY;
            int iO = RecyclerView.o(i6, recyclerView.V, recyclerView.a0, recyclerView.getWidth());
            int iO2 = RecyclerView.o(i7, recyclerView.W, recyclerView.b0, recyclerView.getHeight());
            int[] iArr2 = recyclerView.G0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(iO, iO2, 1, iArr2, null)) {
                iO -= iArr[0];
                iO2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(iO, iO2);
            }
            if (recyclerView.z != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.i0(iO, iO2, iArr);
                int i8 = iArr[0];
                int i9 = iArr[1];
                int i10 = iO - i8;
                int i11 = iO2 - i9;
                db2 db2Var = recyclerView.A.e;
                if (db2Var != null && !db2Var.d && db2Var.e) {
                    int iB = recyclerView.u0.b();
                    if (iB == 0) {
                        db2Var.i();
                    } else if (db2Var.a >= iB) {
                        db2Var.a = iB - 1;
                        db2Var.g(i8, i9);
                    } else {
                        db2Var.g(i8, i9);
                    }
                }
                i = i10;
                i3 = i8;
                i2 = i11;
                i4 = i9;
            } else {
                i = iO;
                i2 = iO2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.C.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.G0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i3, i4, i, i2, null, 1, iArr3);
            int i12 = i - iArr[0];
            int i13 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.x(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            db2 db2Var2 = recyclerView.A.e;
            if ((db2Var2 == null || !db2Var2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i12 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i12 > 0 ? currVelocity : 0;
                    }
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.z();
                        if (recyclerView.V.isFinished()) {
                            recyclerView.V.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.A();
                        if (recyclerView.a0.isFinished()) {
                            recyclerView.a0.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.W.isFinished()) {
                            recyclerView.W.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.b0.isFinished()) {
                            recyclerView.b0.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.U0) {
                    b30 b30Var = recyclerView.t0;
                    int[] iArr4 = b30Var.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    b30Var.d = 0;
                }
            } else {
                b();
                yg1 yg1Var = recyclerView.s0;
                if (yg1Var != null) {
                    yg1Var.a(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                gw3.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        db2 db2Var3 = recyclerView.A.e;
        if (db2Var3 != null && db2Var3.d) {
            db2Var3.g(0, 0);
        }
        this.r = false;
        if (!this.s) {
            recyclerView.setScrollState(0);
            recyclerView.q0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = j65.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
