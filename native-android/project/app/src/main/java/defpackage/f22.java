package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.MotionEvent
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.ViewConfiguration
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class f22
extends kw3
implements ow3 {
    public Rect A;
    public long B;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public cx3 c = null;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l = -1;
    public final e22 m;
    public int n = 0;
    public int o;
    public final ArrayList p = new ArrayList();
    public int q;
    public RecyclerView r;
    public final g5 s = new g5(16, this);
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public View w = null;
    public GestureDetector x;
    public d22 y;
    public final a22 z = new a22(this);

    public f22(e22 e222) {
        this.m = e222;
    }

    public static boolean p(View view, float f16, float f17, float f18, float f19) {
        return f16 >= f18 && f16 <= f18 + (float)view.getWidth() && f17 >= f19 && f17 <= f19 + (float)view.getHeight();
    }

    @Override
    public final void b(View object) {
        if (object == this.w) {
            this.w = null;
        }
        if ((object = this.r.M((View)object)) != null) {
            cx3 cx32 = this.c;
            if (cx32 != null && object == cx32) {
                this.r(null, 0);
                return;
            }
            this.m((cx3)object, false);
            if (this.a.remove(object.a)) {
                this.m.a(this.r, (cx3)object);
            }
        }
    }

    @Override
    public final void c(View view) {
    }

    @Override
    public final void f(Rect rect, View view, RecyclerView recyclerView, yw3 yw32) {
        rect.setEmpty();
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        int n16;
        float f16;
        float f17;
        Object object;
        if (this.c != null) {
            object = this.b;
            this.o((float[])object);
            f17 = object[0];
            f16 = object[1];
        } else {
            f17 = 0.0f;
            f16 = 0.0f;
        }
        object = this.c;
        this.m.getClass();
        ArrayList arrayList = this.p;
        int n17 = arrayList.size();
        for (n16 = 0; n16 < n17; ++n16) {
            b22 b222 = (b22)arrayList.get(n16);
            cx3 cx32 = b222.e;
            float f18 = b222.a;
            float f19 = b222.c;
            b222.i = f18 == f19 ? cx32.a.getTranslationX() : xa3.a(f19, f18, b222.m, f18);
            f18 = b222.b;
            f19 = b222.d;
            b222.j = f18 == f19 ? cx32.a.getTranslationY() : xa3.a(f19, f18, b222.m, f18);
            int n18 = canvas.save();
            e22.g(recyclerView, b222.e, b222.i, b222.j, false);
            canvas.restoreToCount(n18);
        }
        if (object != null) {
            n16 = canvas.save();
            e22.g(recyclerView, (cx3)object, f17, f16, true);
            canvas.restoreToCount(n16);
        }
    }

    @Override
    public final void h(Canvas object, RecyclerView recyclerView) {
        int n16;
        Object object2 = this.c;
        boolean bl5 = false;
        if (object2 != null) {
            object2 = this.b;
            this.o((float[])object2);
            Object object3 = object2[0];
            object3 = object2[1];
        }
        cx3 cx32 = this.c;
        this.m.getClass();
        object2 = this.p;
        int n17 = ((ArrayList)object2).size();
        for (n16 = 0; n16 < n17; ++n16) {
            b22 b222 = (b22)object2.get(n16);
            int n18 = object.save();
            b222 = b222.e.a;
            object.restoreToCount(n18);
        }
        if (cx32 != null) {
            object.restoreToCount(object.save());
        }
        for (n16 = n17 - 1; n16 >= 0; --n16) {
            object = (b22)object2.get(n16);
            boolean bl6 = object.l;
            if (bl6 && !object.h) {
                object2.remove(n16);
                continue;
            }
            if (bl6) continue;
            bl5 = true;
        }
        if (bl5) {
            recyclerView.invalidate();
        }
    }

    public final void i(RecyclerView recyclerView) {
        Object object = this.r;
        if (object == recyclerView) {
            return;
        }
        a22 a222 = this.z;
        if (object != null) {
            ((RecyclerView)object).f0(this);
            object = this.r;
            ((RecyclerView)object).D.remove(a222);
            if (((RecyclerView)object).E == a222) {
                ((RecyclerView)object).E = null;
            }
            if ((object = this.r.P) != null) {
                ((ArrayList)object).remove(this);
            }
            object = this.p;
            for (int i16 = ((ArrayList)object).size() - 1; i16 >= 0; --i16) {
                Object object2 = (b22)((ArrayList)object).get(0);
                ((b22)object2).g.cancel();
                RecyclerView recyclerView2 = this.r;
                object2 = ((b22)object2).e;
                this.m.a(recyclerView2, (cx3)object2);
            }
            ((ArrayList)object).clear();
            this.w = null;
            object = this.t;
            if (object != null) {
                object.recycle();
                this.t = null;
            }
            if ((object = this.y) != null) {
                ((d22)((Object)object)).n = false;
                this.y = null;
            }
            if (this.x != null) {
                this.x = null;
            }
        }
        this.r = recyclerView;
        recyclerView = recyclerView.getResources();
        this.f = recyclerView.getDimension(2131166050);
        this.g = recyclerView.getDimension(2131166049);
        this.q = ViewConfiguration.get((Context)this.r.getContext()).getScaledTouchSlop();
        this.r.i(this);
        this.r.D.add(a222);
        recyclerView = this.r;
        if (recyclerView.P == null) {
            recyclerView.P = new ArrayList();
        }
        recyclerView.P.add(this);
        this.y = new d22(this);
        this.x = new GestureDetector(this.r.getContext(), (GestureDetector.OnGestureListener)this.y);
    }

    public final int j(int n16) {
        if ((n16 & 0xC) != 0) {
            float f16 = this.h;
            int n17 = 4;
            int n18 = f16 > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.t;
            e22 e222 = this.m;
            if (velocityTracker != null && this.l > -1) {
                f16 = this.g;
                e222.getClass();
                velocityTracker.computeCurrentVelocity(1000, f16);
                float f17 = this.t.getXVelocity(this.l);
                f16 = this.t.getYVelocity(this.l);
                if (f17 > 0.0f) {
                    n17 = 8;
                }
                f17 = Math.abs(f17);
                if ((n17 & n16) != 0 && n18 == n17 && f17 >= this.f && f17 > Math.abs(f16)) {
                    return n17;
                }
            }
            f16 = this.r.getWidth();
            e222.getClass();
            if ((n16 & n18) != 0 && Math.abs(this.h) > f16 * 0.5f) {
                return n18;
            }
        }
        return 0;
    }

    public final void k(int n16, int n17, MotionEvent motionEvent) {
        if (this.c == null && n16 == 2 && this.n != 2) {
            e22 e222 = this.m;
            e222.getClass();
            if (this.r.getScrollState() != 1) {
                float f16;
                float f17;
                float f18;
                float f19;
                Object object = this.r.getLayoutManager();
                n16 = this.l;
                cx3 cx32 = null;
                if (n16 != -1) {
                    n16 = motionEvent.findPointerIndex(n16);
                    f19 = motionEvent.getX(n16);
                    f18 = this.d;
                    f17 = motionEvent.getY(n16);
                    f16 = this.e;
                    f19 = Math.abs(f19 - f18);
                    f16 = Math.abs(f17 - f16);
                    f17 = this.q;
                    if (!(f19 < f17 && f16 < f17 || f19 > f16 && ((mw3)object).d() || f16 > f19 && ((mw3)object).e() || (object = this.n(motionEvent)) == null)) {
                        cx32 = this.r.M((View)object);
                    }
                }
                if (cx32 != null) {
                    object = this.r;
                    n16 = e222.c;
                    if ((n16 = (e22.b(n16 << 8 | (n16 | 3) | 0x30000, object.getLayoutDirection()) & 0xFF00) >> 8) != 0) {
                        f19 = motionEvent.getX(n17);
                        f17 = motionEvent.getY(n17);
                        f16 = f17 - this.e;
                        f17 = Math.abs(f19 -= this.d);
                        float f26 = Math.abs(f16);
                        f18 = this.q;
                        if (!(f17 < f18 && f26 < f18 || (f17 > f26 ? f19 < 0.0f && (n16 & 4) == 0 || f19 > 0.0f && (n16 & 8) == 0 : f16 < 0.0f && (n16 & 1) == 0 || f16 > 0.0f && (n16 & 2) == 0))) {
                            this.i = 0.0f;
                            this.h = 0.0f;
                            this.l = motionEvent.getPointerId(0);
                            this.r(cx32, 1);
                        }
                    }
                }
            }
        }
    }

    public final int l(int n16) {
        if ((n16 & 3) != 0) {
            float f16 = this.i;
            int n17 = 1;
            int n18 = f16 > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.t;
            e22 e222 = this.m;
            if (velocityTracker != null && this.l > -1) {
                f16 = this.g;
                e222.getClass();
                velocityTracker.computeCurrentVelocity(1000, f16);
                f16 = this.t.getXVelocity(this.l);
                float f17 = this.t.getYVelocity(this.l);
                if (f17 > 0.0f) {
                    n17 = 2;
                }
                f17 = Math.abs(f17);
                if ((n17 & n16) != 0 && n17 == n18 && f17 >= this.f && f17 > Math.abs(f16)) {
                    return n17;
                }
            }
            f16 = this.r.getHeight();
            e222.getClass();
            if ((n16 & n18) != 0 && Math.abs(this.i) > f16 * 0.5f) {
                return n18;
            }
        }
        return 0;
    }

    public final void m(cx3 cx32, boolean bl5) {
        ArrayList arrayList = this.p;
        for (int i16 = arrayList.size() - 1; i16 >= 0; --i16) {
            b22 b222 = (b22)arrayList.get(i16);
            if (b222.e != cx32) continue;
            b222.k |= bl5;
            if (!b222.l) {
                b222.g.cancel();
            }
            arrayList.remove(i16);
            return;
        }
    }

    public final View n(MotionEvent object) {
        RecyclerView recyclerView;
        int n16;
        float f16 = object.getX();
        float f17 = object.getY();
        object = this.c;
        if (object != null && f22.p((View)(object = object.a), f16, f17, this.j + this.h, this.k + this.i)) {
            return object;
        }
        ArrayList arrayList = this.p;
        for (n16 = arrayList.size() - 1; n16 >= 0; --n16) {
            object = (b22)arrayList.get(n16);
            recyclerView = object.e.a;
            if (!f22.p((View)recyclerView, f16, f17, object.i, object.j)) continue;
            return recyclerView;
        }
        recyclerView = this.r;
        for (n16 = recyclerView.s.h() - 1; n16 >= 0; --n16) {
            object = recyclerView.s.g(n16);
            float f18 = object.getTranslationX();
            float f19 = object.getTranslationY();
            if (!(f16 >= (float)object.getLeft() + f18) || !(f16 <= (float)object.getRight() + f18) || !(f17 >= (float)object.getTop() + f19) || !(f17 <= (float)object.getBottom() + f19)) continue;
            return object;
        }
        return null;
    }

    public final void o(float[] fArray) {
        fArray[0] = (this.o & 0xC) != 0 ? this.j + this.h - (float)this.c.a.getLeft() : this.c.a.getTranslationX();
        if ((this.o & 3) != 0) {
            fArray[1] = this.k + this.i - (float)this.c.a.getTop();
            return;
        }
        fArray[1] = this.c.a.getTranslationY();
    }

    public final void q(cx3 object) {
        if (!this.r.isLayoutRequested() && this.n == 2) {
            e22 e222 = this.m;
            e222.getClass();
            int n16 = (int)(this.j + this.h);
            int n17 = (int)(this.k + this.i);
            View view = ((cx3)object).a;
            if (!((float)Math.abs(n17 - view.getTop()) < (float)view.getHeight() * 0.5f) || !((float)Math.abs(n16 - view.getLeft()) < (float)view.getWidth() * 0.5f)) {
                int n18;
                int n19;
                int n26;
                Object object2;
                int n27;
                Object object3 = this.u;
                if (object3 == null) {
                    this.u = new ArrayList();
                    this.v = new ArrayList();
                } else {
                    ((ArrayList)object3).clear();
                    this.v.clear();
                }
                int n28 = Math.round(this.j + this.h);
                int n29 = Math.round(this.k + this.i);
                int n36 = view.getWidth() + n28;
                int n37 = view.getHeight() + n29;
                int n38 = (n28 + n36) / 2;
                int n39 = (n29 + n37) / 2;
                Object object4 = this.r.getLayoutManager();
                int n46 = ((mw3)object4).v();
                for (n27 = 0; n27 < n46; ++n27) {
                    object3 = ((mw3)object4).u(n27);
                    if (object3 == view || object3.getBottom() < n29 || object3.getTop() > n37 || object3.getRight() < n28 || object3.getLeft() > n36) continue;
                    object2 = this.r.M((View)object3);
                    n26 = object3.getLeft();
                    n26 = Math.abs(n38 - (object3.getRight() + n26) / 2);
                    n19 = object3.getTop();
                    n19 = Math.abs(n39 - (object3.getBottom() + n19) / 2);
                    int n47 = n19 * n19 + n26 * n26;
                    n18 = this.u.size();
                    n26 = 0;
                    for (n19 = 0; n19 < n18 && n47 > (Integer)this.v.get(n19); ++n19) {
                        ++n26;
                    }
                    this.u.add(n26, object2);
                    this.v.add(n26, n47);
                }
                ArrayList arrayList = this.u;
                if (arrayList.size() != 0) {
                    n38 = view.getWidth();
                    n29 = view.getHeight();
                    n36 = n16 - view.getLeft();
                    n18 = n17 - view.getTop();
                    n46 = arrayList.size();
                    object4 = null;
                    n27 = -1;
                    for (n26 = 0; n26 < n46; ++n26) {
                        object3 = (cx3)arrayList.get(n26);
                        if (n36 > 0 && (n19 = ((cx3)object3).a.getRight() - (n38 + n16)) < 0) {
                            object2 = object4;
                            n28 = n27;
                            if (((cx3)object3).a.getRight() > view.getRight()) {
                                n19 = Math.abs(n19);
                                object2 = object4;
                                n28 = n27;
                                if (n19 > n27) {
                                    n28 = n19;
                                    object2 = object3;
                                }
                            }
                        } else {
                            n28 = n27;
                            object2 = object4;
                        }
                        object4 = object2;
                        n27 = n28;
                        if (n36 < 0) {
                            n19 = ((cx3)object3).a.getLeft() - n16;
                            object4 = object2;
                            n27 = n28;
                            if (n19 > 0) {
                                object4 = object2;
                                n27 = n28;
                                if (((cx3)object3).a.getLeft() < view.getLeft()) {
                                    n19 = Math.abs(n19);
                                    object4 = object2;
                                    n27 = n28;
                                    if (n19 > n28) {
                                        n27 = n19;
                                        object4 = object3;
                                    }
                                }
                            }
                        }
                        object2 = object4;
                        n28 = n27;
                        if (n18 < 0) {
                            n19 = ((cx3)object3).a.getTop() - n17;
                            object2 = object4;
                            n28 = n27;
                            if (n19 > 0) {
                                object2 = object4;
                                n28 = n27;
                                if (((cx3)object3).a.getTop() < view.getTop()) {
                                    n19 = Math.abs(n19);
                                    object2 = object4;
                                    n28 = n27;
                                    if (n19 > n27) {
                                        n28 = n19;
                                        object2 = object3;
                                    }
                                }
                            }
                        }
                        object4 = object2;
                        n27 = n28;
                        if (n18 <= 0) continue;
                        n19 = ((cx3)object3).a.getBottom() - (n29 + n17);
                        object4 = object2;
                        n27 = n28;
                        if (n19 >= 0) continue;
                        object4 = object2;
                        n27 = n28;
                        if (((cx3)object3).a.getBottom() <= view.getBottom()) continue;
                        n19 = Math.abs(n19);
                        object4 = object2;
                        n27 = n28;
                        if (n19 <= n28) continue;
                        n27 = n19;
                        object4 = object3;
                    }
                    if (object4 == null) {
                        this.u.clear();
                        this.v.clear();
                        return;
                    }
                    object3 = ((cx3)object4).a;
                    n28 = ((cx3)object4).b();
                    ((cx3)object).b();
                    if (e222.h(this.r, (cx3)object, (cx3)object4)) {
                        object4 = this.r;
                        object = ((RecyclerView)object4).getLayoutManager();
                        if (object instanceof LinearLayoutManager) {
                            object4 = (LinearLayoutManager)object;
                            ((LinearLayoutManager)object4).c("Cannot drop a view during a scroll or layout calculation");
                            ((LinearLayoutManager)object4).L0();
                            ((LinearLayoutManager)object4).d1();
                            n28 = mw3.I(view);
                            n27 = mw3.I((View)object3);
                            n28 = n28 < n27 ? 1 : -1;
                            boolean bl5 = ((LinearLayoutManager)object4).u;
                            object = ((LinearLayoutManager)object4).r;
                            if (bl5) {
                                if (n28 == 1) {
                                    n17 = ((qz0)object).i();
                                    n28 = ((LinearLayoutManager)object4).r.g((View)object3);
                                    ((LinearLayoutManager)object4).f1(n27, n17 - (((LinearLayoutManager)object4).r.e(view) + n28));
                                    return;
                                }
                                ((LinearLayoutManager)object4).f1(n27, ((qz0)object).i() - ((LinearLayoutManager)object4).r.d((View)object3));
                                return;
                            }
                            if (n28 == -1) {
                                ((LinearLayoutManager)object4).f1(n27, ((qz0)object).g((View)object3));
                                return;
                            }
                            ((LinearLayoutManager)object4).f1(n27, ((qz0)object).d((View)object3) - ((LinearLayoutManager)object4).r.e(view));
                            return;
                        }
                        if (((mw3)object).d()) {
                            if (mw3.A((View)object3) <= object4.getPaddingLeft()) {
                                ((RecyclerView)object4).j0(n28);
                            }
                            if (mw3.B((View)object3) >= object4.getWidth() - object4.getPaddingRight()) {
                                ((RecyclerView)object4).j0(n28);
                            }
                        }
                        if (((mw3)object).e()) {
                            if (mw3.C((View)object3) <= object4.getPaddingTop()) {
                                ((RecyclerView)object4).j0(n28);
                            }
                            if (mw3.y((View)object3) >= object4.getHeight() - object4.getPaddingBottom()) {
                                ((RecyclerView)object4).j0(n28);
                            }
                        }
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void r(cx3 var1_1, int var2_2) {
        block29: {
            block24: {
                block28: {
                    block25: {
                        block23: {
                            block26: {
                                block27: {
                                    if (var1_1 == this.c && var2_2 == this.n) {
                                        return;
                                    }
                                    this.B = -9223372036854775808L;
                                    var9_3 = this.n;
                                    this.m(var1_1, true);
                                    this.n = var2_2;
                                    if (var2_2 == 2) {
                                        if (var1_1 != null) {
                                            this.w = var1_1.a;
                                        } else {
                                            kf2.n("Must pass a ViewHolder when dragging");
                                            return;
                                        }
                                    }
                                    var16_4 = this.c;
                                    var15_5 = this.m;
                                    if (var16_4 == null) break block24;
                                    var17_6 /* !! */  = var16_4.a;
                                    if (var17_6 /* !! */ .getParent() == null) break block25;
                                    if (var9_3 == 2) lbl-1000:
                                    // 5 sources

                                    {
                                        while (true) {
                                            var7_7 = 0;
                                            break block23;
                                            break;
                                        }
                                    }
                                    if (this.n == 2) ** GOTO lbl-1000
                                    var17_6 /* !! */  = this.r;
                                    var7_7 = var15_5.c;
                                    var11_9 = (e22.b(var7_7 = var7_7 << 8 | (var7_7 | 3) | 196608, var17_6 /* !! */ .getLayoutDirection()) & 65280) >> 8;
                                    if (var11_9 == 0) ** GOTO lbl-1000
                                    var10_10 = (var7_7 & 65280) >> 8;
                                    if (!(Math.abs(this.h) > Math.abs(this.i))) break block26;
                                    var8_8 = this.j(var11_9);
                                    if (var8_8 <= 0) break block27;
                                    var7_7 = var8_8;
                                    if ((var10_10 & var8_8) == 0) {
                                        var7_7 = e22.c(var8_8, this.r.getLayoutDirection());
                                    }
                                    break block23;
                                }
                                var7_7 = this.l(var11_9);
                                if (var7_7 <= 0) ** GOTO lbl-1000
                                break block23;
                            }
                            var7_7 = this.l(var11_9);
                            if (var7_7 <= 0) {
                                var8_8 = this.j(var11_9);
                                if (var8_8 > 0) ** break;
                                ** continue;
                                var7_7 = var8_8;
                                if ((var10_10 & var8_8) == 0) {
                                    var7_7 = e22.c(var8_8, this.r.getLayoutDirection());
                                }
                            }
                        }
                        var17_6 /* !! */  = this.t;
                        if (var17_6 /* !! */  != null) {
                            var17_6 /* !! */ .recycle();
                            this.t = null;
                        }
                        var8_8 = 4;
                        var4_11 = 0.0f;
                        if (var7_7 != 1 && var7_7 != 2) {
                            if (var7_7 != 4 && var7_7 != 8 && var7_7 != 16 && var7_7 != 32) {
                                var3_12 = 0.0f;
                            } else {
                                var4_11 = Math.signum(this.h);
                                var5_13 /* !! */  = this.r.getWidth();
                                var3_12 = 0.0f;
                                var4_11 *= var5_13 /* !! */ ;
                            }
                        } else {
                            var3_12 = Math.signum(this.i) * (float)this.r.getHeight();
                        }
                        if (var9_3 == 2) {
                            var8_8 = 8;
                        } else if (var7_7 > 0) {
                            var8_8 = 2;
                        }
                        var17_6 /* !! */  = (View)this.b;
                        this.o((float[])var17_6 /* !! */ );
                        var6_14 = var17_6 /* !! */ [0];
                        var5_13 /* !! */  = (float)var17_6 /* !! */ [1];
                        var17_6 /* !! */  = new b22(this, var16_4, var9_3, (float)var6_14, var5_13 /* !! */ , var4_11, var3_12, var7_7, var16_4);
                        var18_15 = this.r;
                        var15_5.getClass();
                        var18_15 = var18_15.getItemAnimator();
                        var12_16 = var18_15 == null ? (var8_8 == 8 ? 200L : 250L) : (var8_8 == 8 ? var18_15.e : var18_15.d);
                        var18_15 = var17_6 /* !! */ .g;
                        var18_15.setDuration(var12_16);
                        this.p.add(var17_6 /* !! */ );
                        var16_4.p(false);
                        var18_15.start();
                        var7_7 = 1;
                        break block28;
                    }
                    if (var17_6 /* !! */  == this.w) {
                        this.w = null;
                    }
                    var15_5.a(this.r, var16_4);
                    var7_7 = 0;
                }
                this.c = null;
                break block29;
            }
            var7_7 = 0;
        }
        var14_17 = false;
        if (var1_1 != null) {
            var16_4 = var1_1.a;
            var17_6 /* !! */  = this.r;
            var8_8 = var15_5.c;
            this.o = (e22.b(var8_8 << 8 | (var8_8 | 3) | 196608, var17_6 /* !! */ .getLayoutDirection()) & (1 << var2_2 * 8 + 8) - 1) >> this.n * 8;
            this.j = var16_4.getLeft();
            this.k = var16_4.getTop();
            this.c = var1_1;
            if (var2_2 == 2) {
                var16_4.performHapticFeedback(0);
            }
        }
        if ((var1_1 = this.r.getParent()) != null) {
            if (this.c != null) {
                var14_17 = true;
            }
            var1_1.requestDisallowInterceptTouchEvent(var14_17);
        }
        if (var7_7 == 0) {
            this.r.getLayoutManager().f = true;
        }
        var15_5.getClass();
        this.r.invalidate();
    }

    public final void s(int n16, int n17, MotionEvent motionEvent) {
        float f16 = motionEvent.getX(n17);
        float f17 = motionEvent.getY(n17);
        this.h = f16 -= this.d;
        this.i = f17 - this.e;
        if ((n16 & 4) == 0) {
            this.h = Math.max(0.0f, f16);
        }
        if ((n16 & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((n16 & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((n16 & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }
}

