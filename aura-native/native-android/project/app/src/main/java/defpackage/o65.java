package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.animation.Interpolator
 *  android.widget.OverScroller
 */
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class o65 {
    public static final c22 x = new c22(3);
    public int a;
    public int b;
    public int c = -1;
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
    public final wu4 w = new wu4(4, this);

    public o65(Context context, ViewGroup viewGroup, hw hw5) {
        if (hw5 != null) {
            int n16;
            this.v = viewGroup;
            this.s = hw5;
            viewGroup = ViewConfiguration.get((Context)context);
            this.p = n16 = (int)(context.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
            this.o = n16;
            this.b = viewGroup.getScaledTouchSlop();
            this.m = viewGroup.getScaledMaximumFlingVelocity();
            this.n = viewGroup.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, (Interpolator)x);
            return;
        }
        kf2.n("Callback may not be null");
        throw null;
    }

    public final void a() {
        this.c = -1;
        Object object = this.d;
        if (object != null) {
            Arrays.fill(object, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        object = this.l;
        if (object != null) {
            object.recycle();
            this.l = null;
        }
    }

    public final void b(View view, int n16) {
        ViewGroup viewGroup;
        ViewParent viewParent = view.getParent();
        if (viewParent == (viewGroup = this.v)) {
            this.t = view;
            this.c = n16;
            this.s.y(view, n16);
            this.p(1);
            return;
        }
        nz2.A(viewGroup, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    }

    public final boolean c(float f16, float f17, int n16, int n17) {
        float f18;
        f16 = Math.abs(f16);
        f17 = Math.abs(f17);
        if (!((this.h[n16] & n17) != n17 || (this.q & n17) == 0 || (this.j[n16] & n17) == n17 || (this.i[n16] & n17) == n17 || f16 <= (f18 = (float)this.b) && f17 <= f18)) {
            if (f16 < f17 * 0.5f) {
                this.s.getClass();
            }
            if ((this.i[n16] & n17) == 0 && f16 > (float)this.b) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(View view, float f16, float f17) {
        if (view != null) {
            hw hw5 = this.s;
            int n16 = hw5.o(view) > 0 ? 1 : 0;
            boolean bl5 = hw5.p() > 0;
            if (n16 != 0 && bl5 ? f17 * f17 + f16 * f16 > (float)((n16 = this.b) * n16) : (n16 != 0 ? Math.abs(f16) > (float)this.b : bl5 && Math.abs(f17) > (float)this.b)) {
                return true;
            }
        }
        return false;
    }

    public final void e(int n16) {
        int n17;
        int n18;
        float[] fArray = this.d;
        if (fArray != null && ((n18 = this.k) & (n17 = 1 << n16)) != 0) {
            fArray[n16] = 0.0f;
            this.e[n16] = 0.0f;
            this.f[n16] = 0.0f;
            this.g[n16] = 0.0f;
            this.h[n16] = 0;
            this.i[n16] = 0;
            this.j[n16] = 0;
            this.k = ~n17 & n18;
        }
    }

    public final int f(int n16, int n17, int n18) {
        if (n16 == 0) {
            return 0;
        }
        int n19 = this.v.getWidth();
        int n26 = n19 / 2;
        float f16 = Math.min(1.0f, (float)Math.abs(n16) / (float)n19);
        float f17 = n26;
        f16 = (float)Math.sin((f16 - 0.5f) * 0.47123894f);
        n16 = (n17 = Math.abs(n17)) > 0 ? Math.round(Math.abs((f16 * f17 + f17) / (float)n17) * 1000.0f) * 4 : (int)(((float)Math.abs(n16) / (float)n18 + 1.0f) * 256.0f);
        return Math.min(n16, 600);
    }

    public final boolean g() {
        if (this.a == 2) {
            WeakHashMap weakHashMap;
            Object object;
            OverScroller overScroller = this.r;
            boolean bl5 = overScroller.computeScrollOffset();
            int n16 = overScroller.getCurrX();
            int n17 = overScroller.getCurrY();
            int n18 = n16 - this.t.getLeft();
            int n19 = n17 - this.t.getTop();
            if (n18 != 0) {
                object = this.t;
                weakHashMap = j65.a;
                object.offsetLeftAndRight(n18);
            }
            if (n19 != 0) {
                weakHashMap = this.t;
                object = j65.a;
                weakHashMap.offsetTopAndBottom(n19);
            }
            if (n18 != 0 || n19 != 0) {
                this.s.A(this.t, n16, n17);
            }
            boolean bl6 = bl5;
            if (bl5) {
                bl6 = bl5;
                if (n16 == overScroller.getFinalX()) {
                    bl6 = bl5;
                    if (n17 == overScroller.getFinalY()) {
                        overScroller.abortAnimation();
                        bl6 = false;
                    }
                }
            }
            if (!bl6) {
                this.v.post((Runnable)this.w);
            }
        }
        return this.a == 2;
    }

    public final View h(int n16, int n17) {
        ViewGroup viewGroup = this.v;
        for (int i16 = viewGroup.getChildCount() - 1; i16 >= 0; --i16) {
            this.s.getClass();
            View view = viewGroup.getChildAt(i16);
            if (n16 < view.getLeft() || n16 >= view.getRight() || n17 < view.getTop() || n17 >= view.getBottom()) continue;
            return view;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean i(int n16, int n17, int n18, int n19) {
        float f16;
        float f17;
        int n26 = this.t.getLeft();
        int n27 = this.t.getTop();
        int n28 = n16 - n26;
        int n29 = n17 - n27;
        OverScroller overScroller = this.r;
        if (n28 == 0 && n29 == 0) {
            overScroller.abortAnimation();
            this.p(0);
            return false;
        }
        View view = this.t;
        n16 = (int)this.n;
        int n36 = (int)this.m;
        n17 = Math.abs(n18);
        if (n17 < n16) {
            n16 = 0;
        } else {
            n16 = n18;
            if (n17 > n36) {
                n16 = n18 > 0 ? n36 : -n36;
            }
        }
        n17 = (int)this.n;
        n18 = Math.abs(n19);
        if (n18 < n17) {
            n17 = 0;
        } else {
            n17 = n19;
            if (n18 > n36) {
                n17 = n19 > 0 ? n36 : -n36;
            }
        }
        int n37 = Math.abs(n28);
        n18 = Math.abs(n29);
        n36 = Math.abs(n16);
        n19 = Math.abs(n17);
        int n38 = n36 + n19;
        int n39 = n37 + n18;
        if (n16 != 0) {
            f17 = n36;
            f16 = n38;
        } else {
            f17 = n37;
            f16 = n39;
        }
        float f18 = f17 / f16;
        if (n17 != 0) {
            f16 = n19;
            f17 = n38;
        } else {
            f16 = n18;
            f17 = n39;
        }
        f16 /= f17;
        hw hw5 = this.s;
        n16 = this.f(n28, n16, hw5.o(view));
        n17 = this.f(n29, n17, hw5.p());
        f17 = n16;
        overScroller.startScroll(n26, n27, n28, n29, (int)((float)n17 * f16 + f17 * f18));
        this.p(2);
        return true;
    }

    public final boolean j(int n16) {
        if ((this.k & 1 << n16) != 0) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder("Ignoring pointerId=");
        stringBuilder.append(n16);
        stringBuilder.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        Log.e((String)"ViewDragHelper", (String)stringBuilder.toString());
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void k(MotionEvent motionEvent) {
        int n16;
        int n17 = motionEvent.getActionMasked();
        int n18 = motionEvent.getActionIndex();
        if (n17 == 0) {
            this.a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        hw hw5 = this.s;
        int n19 = 0;
        if (n17 != 0) {
            if (n17 != 1) {
                if (n17 != 2) {
                    if (n17 != 3) {
                        if (n17 != 5) {
                            if (n17 != 6) return;
                            n19 = motionEvent.getPointerId(n18);
                            if (this.a == 1 && n19 == this.c) {
                                block19: {
                                    n18 = motionEvent.getPointerCount();
                                    for (n16 = 0; n16 < n18; ++n16) {
                                        View view;
                                        float f16;
                                        float f17;
                                        n17 = motionEvent.getPointerId(n16);
                                        if (n17 == this.c || (hw5 = this.h((int)(f17 = motionEvent.getX(n16)), (int)(f16 = motionEvent.getY(n16)))) != (view = this.t) || !this.t(view, n17)) continue;
                                        n16 = this.c;
                                        break block19;
                                    }
                                    n16 = -1;
                                }
                                if (n16 == -1) {
                                    this.l();
                                }
                            }
                            this.e(n19);
                            return;
                        }
                        n16 = motionEvent.getPointerId(n18);
                        float f18 = motionEvent.getX(n18);
                        float f19 = motionEvent.getY(n18);
                        this.n(f18, f19, n16);
                        if (this.a == 0) {
                            this.t(this.h((int)f18, (int)f19), n16);
                            n16 = this.h[n16];
                            if ((this.q & n16) == 0) return;
                            hw5.w();
                            return;
                        }
                        n19 = (int)f18;
                        n18 = (int)f19;
                        motionEvent = this.t;
                        if (motionEvent == null || n19 < motionEvent.getLeft() || n19 >= motionEvent.getRight() || n18 < motionEvent.getTop() || n18 >= motionEvent.getBottom()) return;
                        this.t(this.t, n16);
                        return;
                    }
                    if (this.a == 1) {
                        this.u = true;
                        hw5.B(this.t, 0.0f, 0.0f);
                        this.u = false;
                        if (this.a == 1) {
                            this.p(0);
                        }
                    }
                    this.a();
                    return;
                }
                if (this.a == 1) {
                    if (!this.j(this.c)) return;
                    n16 = motionEvent.findPointerIndex(this.c);
                    float f26 = motionEvent.getX(n16);
                    float f27 = motionEvent.getY(n16);
                    float[] fArray = this.f;
                    n16 = this.c;
                    n17 = (int)(f26 - fArray[n16]);
                    int n26 = (int)(f27 - this.g[n16]);
                    n19 = this.t.getLeft() + n17;
                    n18 = this.t.getTop() + n26;
                    int n27 = this.t.getLeft();
                    int n28 = this.t.getTop();
                    n16 = n19;
                    if (n17 != 0) {
                        n16 = hw5.d(this.t, n19);
                        View view = this.t;
                        WeakHashMap weakHashMap = j65.a;
                        view.offsetLeftAndRight(n16 - n27);
                    }
                    n19 = n18;
                    if (n26 != 0) {
                        n19 = hw5.e(this.t, n18);
                        View view = this.t;
                        WeakHashMap weakHashMap = j65.a;
                        view.offsetTopAndBottom(n19 - n28);
                    }
                    if (n17 != 0 || n26 != 0) {
                        hw5.A(this.t, n16, n19);
                    }
                    this.o(motionEvent);
                    return;
                }
                n18 = motionEvent.getPointerCount();
                for (n16 = n19; n16 < n18; ++n16) {
                    n19 = motionEvent.getPointerId(n16);
                    if (!this.j(n19)) continue;
                    float f28 = motionEvent.getX(n16);
                    float f29 = motionEvent.getY(n16);
                    float f36 = f28 - this.d[n19];
                    float f37 = f29 - this.e[n19];
                    this.m(f36, f37, n19);
                    if (this.a == 1 || this.d((View)(hw5 = this.h((int)f28, (int)f29)), f36, f37) && this.t((View)hw5, n19)) break;
                }
                this.o(motionEvent);
                return;
            }
            if (this.a == 1) {
                this.l();
            }
            this.a();
            return;
        }
        float f38 = motionEvent.getX();
        float f39 = motionEvent.getY();
        n16 = motionEvent.getPointerId(0);
        motionEvent = this.h((int)f38, (int)f39);
        this.n(f38, f39, n16);
        this.t((View)motionEvent, n16);
        n16 = this.h[n16];
        if ((this.q & n16) == 0) return;
        hw5.w();
    }

    public final void l() {
        VelocityTracker velocityTracker = this.l;
        float f16 = this.m;
        velocityTracker.computeCurrentVelocity(1000, f16);
        float f17 = this.l.getXVelocity(this.c);
        float f18 = this.n;
        float f19 = Math.abs(f17);
        if (f19 < f18) {
            f18 = 0.0f;
        } else {
            f18 = f17;
            if (f19 > f16) {
                f18 = f17 > 0.0f ? f16 : -f16;
            }
        }
        f17 = this.l.getYVelocity(this.c);
        float f26 = this.n;
        f19 = Math.abs(f17);
        if (f19 < f26) {
            f16 = 0.0f;
        } else if (f19 > f16) {
            if (!(f17 > 0.0f)) {
                f16 = -f16;
            }
        } else {
            f16 = f17;
        }
        this.u = true;
        this.s.B(this.t, f18, f16);
        this.u = false;
        if (this.a == 1) {
            this.p(0);
        }
    }

    public final void m(float f16, float f17, int n16) {
        int n17;
        int n18 = n17 = this.c(f16, f17, n16, 1);
        if (this.c(f17, f16, n16, 4)) {
            n18 = n17 | 4;
        }
        n17 = n18;
        if (this.c(f16, f17, n16, 2)) {
            n17 = n18 | 2;
        }
        n18 = n17;
        if (this.c(f17, f16, n16, 8)) {
            n18 = n17 | 8;
        }
        if (n18 != 0) {
            int[] nArray = this.i;
            nArray[n16] = nArray[n16] | n18;
            this.s.v(n18, n16);
        }
    }

    public final void n(float f16, float f17, int n16) {
        int[] nArray;
        Object object;
        int n17;
        Object[] objectArray = this.d;
        int n18 = 0;
        if (objectArray == null || objectArray.length <= n16) {
            n17 = n16 + 1;
            float[] fArray = new float[n17];
            float[] fArray2 = new float[n17];
            float[] fArray3 = new float[n17];
            object = new float[n17];
            nArray = new int[n17];
            int[] nArray2 = new int[n17];
            int[] nArray3 = new int[n17];
            if (objectArray != null) {
                System.arraycopy(objectArray, 0, fArray, 0, objectArray.length);
                objectArray = this.e;
                System.arraycopy(objectArray, 0, fArray2, 0, objectArray.length);
                objectArray = this.f;
                System.arraycopy(objectArray, 0, fArray3, 0, objectArray.length);
                objectArray = this.g;
                System.arraycopy(objectArray, 0, object, 0, objectArray.length);
                objectArray = this.h;
                System.arraycopy(objectArray, 0, nArray, 0, objectArray.length);
                objectArray = this.i;
                System.arraycopy(objectArray, 0, nArray2, 0, objectArray.length);
                objectArray = this.j;
                System.arraycopy(objectArray, 0, nArray3, 0, objectArray.length);
            }
            this.d = fArray;
            this.e = fArray2;
            this.f = fArray3;
            this.g = object;
            this.h = nArray;
            this.i = nArray2;
            this.j = nArray3;
        }
        object = this.d;
        this.f[n16] = f16;
        object[n16] = f16;
        object = this.e;
        this.g[n16] = f17;
        object[n16] = f17;
        nArray = this.h;
        int n19 = (int)f16;
        int n26 = (int)f17;
        object = this.v;
        if (n19 < object.getLeft() + this.o) {
            n18 = 1;
        }
        n17 = n18;
        if (n26 < object.getTop() + this.o) {
            n17 = n18 | 4;
        }
        n18 = n17;
        if (n19 > object.getRight() - this.o) {
            n18 = n17 | 2;
        }
        n17 = n18;
        if (n26 > object.getBottom() - this.o) {
            n17 = n18 | 8;
        }
        nArray[n16] = n17;
        this.k |= 1 << n16;
    }

    public final void o(MotionEvent motionEvent) {
        int n16 = motionEvent.getPointerCount();
        for (int i16 = 0; i16 < n16; ++i16) {
            int n17 = motionEvent.getPointerId(i16);
            if (!this.j(n17)) continue;
            float f16 = motionEvent.getX(i16);
            float f17 = motionEvent.getY(i16);
            this.f[n17] = f16;
            this.g[n17] = f17;
        }
    }

    public final void p(int n16) {
        this.v.removeCallbacks((Runnable)this.w);
        if (this.a != n16) {
            this.a = n16;
            this.s.z(n16);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public final boolean q(int n16, int n17) {
        if (this.u) {
            return this.i(n16, n17, (int)this.l.getXVelocity(this.c), (int)this.l.getYVelocity(this.c));
        }
        kf2.o("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    public final boolean r(MotionEvent motionEvent) {
        block17: {
            hw hw5;
            int n16;
            block14: {
                block15: {
                    int n17;
                    block16: {
                        n16 = motionEvent.getActionMasked();
                        n17 = motionEvent.getActionIndex();
                        if (n16 == 0) {
                            this.a();
                        }
                        if (this.l == null) {
                            this.l = VelocityTracker.obtain();
                        }
                        this.l.addMovement(motionEvent);
                        hw5 = this.s;
                        if (n16 == 0) break block14;
                        if (n16 == 1) break block15;
                        if (n16 == 2) break block16;
                        if (n16 == 3) break block15;
                        if (n16 != 5) {
                            if (n16 == 6) {
                                this.e(motionEvent.getPointerId(n17));
                            }
                        } else {
                            n16 = motionEvent.getPointerId(n17);
                            float f16 = motionEvent.getX(n17);
                            float f17 = motionEvent.getY(n17);
                            this.n(f16, f17, n16);
                            n17 = this.a;
                            if (n17 == 0) {
                                if ((this.h[n16] & this.q) != 0) {
                                    hw5.w();
                                }
                            } else if (n17 == 2 && (motionEvent = this.h((int)f16, (int)f17)) == this.t) {
                                this.t((View)motionEvent, n16);
                            }
                        }
                        break block17;
                    }
                    if (this.d != null && this.e != null) {
                        int n18 = motionEvent.getPointerCount();
                        for (n16 = 0; n16 < n18; ++n16) {
                            int n19 = motionEvent.getPointerId(n16);
                            if (!this.j(n19)) continue;
                            float f18 = motionEvent.getX(n16);
                            float f19 = motionEvent.getY(n16);
                            float f26 = f18 - this.d[n19];
                            float f27 = f19 - this.e[n19];
                            View view = this.h((int)f18, (int)f19);
                            n17 = view != null && this.d(view, f26, f27) ? 1 : 0;
                            if (n17 != 0) {
                                int n26 = view.getLeft();
                                int n27 = hw5.d(view, (int)f26 + n26);
                                int n28 = view.getTop();
                                int n29 = hw5.e(view, (int)f27 + n28);
                                int n36 = hw5.o(view);
                                int n37 = hw5.p();
                                if ((n36 == 0 || n36 > 0 && n27 == n26) && (n37 == 0 || n37 > 0 && n29 == n28)) break;
                            }
                            this.m(f26, f27, n19);
                            if (this.a == 1 || n17 != 0 && this.t(view, n19)) break;
                        }
                        this.o(motionEvent);
                    }
                    break block17;
                }
                this.a();
                break block17;
            }
            float f28 = motionEvent.getX();
            float f29 = motionEvent.getY();
            n16 = motionEvent.getPointerId(0);
            this.n(f28, f29, n16);
            motionEvent = this.h((int)f28, (int)f29);
            if (motionEvent == this.t && this.a == 2) {
                this.t((View)motionEvent, n16);
            }
            if ((this.h[n16] & this.q) != 0) {
                hw5.w();
            }
        }
        return this.a == 1;
    }

    public final boolean s(View view, int n16, int n17) {
        this.t = view;
        this.c = -1;
        boolean bl5 = this.i(n16, n17, 0, 0);
        if (!bl5 && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return bl5;
    }

    public final boolean t(View view, int n16) {
        if (view == this.t && this.c == n16) {
            return true;
        }
        if (view != null && this.s.Q(view, n16)) {
            this.c = n16;
            this.b(view, n16);
            return true;
        }
        return false;
    }
}

