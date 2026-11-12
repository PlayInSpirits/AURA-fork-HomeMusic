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
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final e22 m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public GestureDetector x;
    public d22 y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public cx3 c = null;
    public int l = -1;
    public int n = 0;
    public final ArrayList p = new ArrayList();
    public final g5 s = new g5(16, this);
    public View w = null;
    public final a22 z = new a22(this);

    public f22(e22 e22Var) {
        this.m = e22Var;
    }

    public static boolean p(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // defpackage.ow3
    public final void b(View view) {
        if (view == this.w) {
            this.w = null;
        }
        cx3 cx3VarM = this.r.M(view);
        if (cx3VarM == null) {
            return;
        }
        cx3 cx3Var = this.c;
        if (cx3Var != null && cx3VarM == cx3Var) {
            r(null, 0);
            return;
        }
        m(cx3VarM, false);
        if (this.a.remove(cx3VarM.a)) {
            this.m.a(this.r, cx3VarM);
        }
    }

    @Override // defpackage.ow3
    public final void c(View view) {
    }

    @Override // defpackage.kw3
    public final void f(Rect rect, View view, RecyclerView recyclerView, yw3 yw3Var) {
        rect.setEmpty();
    }

    @Override // defpackage.kw3
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        cx3 cx3Var = this.c;
        this.m.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b22 b22Var = (b22) arrayList.get(i);
            cx3 cx3Var2 = b22Var.e;
            float f3 = b22Var.a;
            float f4 = b22Var.c;
            if (f3 == f4) {
                b22Var.i = cx3Var2.a.getTranslationX();
            } else {
                b22Var.i = xa3.a(f4, f3, b22Var.m, f3);
            }
            float f5 = b22Var.b;
            float f6 = b22Var.d;
            if (f5 == f6) {
                b22Var.j = cx3Var2.a.getTranslationY();
            } else {
                b22Var.j = xa3.a(f6, f5, b22Var.m, f5);
            }
            int iSave = canvas.save();
            e22.g(recyclerView, b22Var.e, b22Var.i, b22Var.j, false);
            canvas.restoreToCount(iSave);
        }
        if (cx3Var != null) {
            int iSave2 = canvas.save();
            e22.g(recyclerView, cx3Var, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // defpackage.kw3
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        cx3 cx3Var = this.c;
        this.m.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b22 b22Var = (b22) arrayList.get(i);
            int iSave = canvas.save();
            View view = b22Var.e.a;
            canvas.restoreToCount(iSave);
        }
        if (cx3Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            b22 b22Var2 = (b22) arrayList.get(i2);
            boolean z2 = b22Var2.l;
            if (z2 && !b22Var2.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a22 a22Var = this.z;
        if (recyclerView2 != null) {
            recyclerView2.f0(this);
            RecyclerView recyclerView3 = this.r;
            recyclerView3.D.remove(a22Var);
            if (recyclerView3.E == a22Var) {
                recyclerView3.E = null;
            }
            ArrayList arrayList = this.r.P;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                b22 b22Var = (b22) arrayList2.get(0);
                b22Var.g.cancel();
                this.m.a(this.r, b22Var.e);
            }
            arrayList2.clear();
            this.w = null;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.t = null;
            }
            d22 d22Var = this.y;
            if (d22Var != null) {
                d22Var.n = false;
                this.y = null;
            }
            if (this.x != null) {
                this.x = null;
            }
        }
        this.r = recyclerView;
        Resources resources = recyclerView.getResources();
        this.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
        this.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
        this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
        this.r.i(this);
        this.r.D.add(a22Var);
        RecyclerView recyclerView4 = this.r;
        if (recyclerView4.P == null) {
            recyclerView4.P = new ArrayList();
        }
        recyclerView4.P.add(this);
        this.y = new d22(this);
        this.x = new GestureDetector(this.r.getContext(), this.y);
    }

    public final int j(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        e22 e22Var = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            e22Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.r.getWidth();
        e22Var.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.h) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void k(int i, int i2, MotionEvent motionEvent) {
        View viewN;
        if (this.c == null && i == 2 && this.n != 2) {
            e22 e22Var = this.m;
            e22Var.getClass();
            if (this.r.getScrollState() == 1) {
                return;
            }
            mw3 layoutManager = this.r.getLayoutManager();
            int i3 = this.l;
            cx3 cx3VarM = null;
            if (i3 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(iFindPointerIndex) - this.d;
                float y = motionEvent.getY(iFindPointerIndex) - this.e;
                float fAbs = Math.abs(x);
                float fAbs2 = Math.abs(y);
                float f = this.q;
                if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.d()) && ((fAbs2 <= fAbs || !layoutManager.e()) && (viewN = n(motionEvent)) != null))) {
                    cx3VarM = this.r.M(viewN);
                }
            }
            if (cx3VarM == null) {
                return;
            }
            RecyclerView recyclerView = this.r;
            int i4 = e22Var.c;
            int iB = (e22.b(((i4 << 8) | (i4 | 3)) | 196608, recyclerView.getLayoutDirection()) & 65280) >> 8;
            if (iB == 0) {
                return;
            }
            float x2 = motionEvent.getX(i2);
            float y2 = motionEvent.getY(i2);
            float f2 = x2 - this.d;
            float f3 = y2 - this.e;
            float fAbs3 = Math.abs(f2);
            float fAbs4 = Math.abs(f3);
            float f4 = this.q;
            if (fAbs3 >= f4 || fAbs4 >= f4) {
                if (fAbs3 > fAbs4) {
                    if (f2 < 0.0f && (iB & 4) == 0) {
                        return;
                    }
                    if (f2 > 0.0f && (iB & 8) == 0) {
                        return;
                    }
                } else {
                    if (f3 < 0.0f && (iB & 1) == 0) {
                        return;
                    }
                    if (f3 > 0.0f && (iB & 2) == 0) {
                        return;
                    }
                }
                this.i = 0.0f;
                this.h = 0.0f;
                this.l = motionEvent.getPointerId(0);
                r(cx3VarM, 1);
            }
        }
    }

    public final int l(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        e22 e22Var = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            e22Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.r.getHeight();
        e22Var.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.i) <= f2) {
            return 0;
        }
        return i2;
    }

    public final void m(cx3 cx3Var, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b22 b22Var = (b22) arrayList.get(size);
            if (b22Var.e == cx3Var) {
                b22Var.k |= z;
                if (!b22Var.l) {
                    b22Var.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        cx3 cx3Var = this.c;
        if (cx3Var != null) {
            View view = cx3Var.a;
            if (p(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b22 b22Var = (b22) arrayList.get(size);
            View view2 = b22Var.e.a;
            if (p(view2, x, y, b22Var.i, b22Var.j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.r;
        for (int iH = recyclerView.s.h() - 1; iH >= 0; iH--) {
            View viewG = recyclerView.s.g(iH);
            float translationX = viewG.getTranslationX();
            float translationY = viewG.getTranslationY();
            if (x >= viewG.getLeft() + translationX && x <= viewG.getRight() + translationX && y >= viewG.getTop() + translationY && y <= viewG.getBottom() + translationY) {
                return viewG;
            }
        }
        return null;
    }

    public final void o(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void q(cx3 cx3Var) {
        ArrayList arrayList;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        if (!this.r.isLayoutRequested() && this.n == 2) {
            e22 e22Var = this.m;
            e22Var.getClass();
            int i2 = (int) (this.j + this.h);
            int i3 = (int) (this.k + this.i);
            View view = cx3Var.a;
            if (Math.abs(i3 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i2 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.u;
                if (arrayList2 == null) {
                    this.u = new ArrayList();
                    this.v = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.v.clear();
                }
                int iRound = Math.round(this.j + this.h);
                int iRound2 = Math.round(this.k + this.i);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i4 = (iRound + width) / 2;
                int i5 = (iRound2 + height) / 2;
                mw3 layoutManager = this.r.getLayoutManager();
                int iV = layoutManager.v();
                int i6 = 0;
                while (i6 < iV) {
                    View viewU = layoutManager.u(i6);
                    if (viewU == view) {
                        i = i6;
                    } else {
                        i = i6;
                        if (viewU.getBottom() >= iRound2 && viewU.getTop() <= height && viewU.getRight() >= iRound && viewU.getLeft() <= width) {
                            cx3 cx3VarM = this.r.M(viewU);
                            int iAbs5 = Math.abs(i4 - ((viewU.getRight() + viewU.getLeft()) / 2));
                            int iAbs6 = Math.abs(i5 - ((viewU.getBottom() + viewU.getTop()) / 2));
                            int i7 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            int size = this.u.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < size) {
                                int i10 = size;
                                if (i7 <= ((Integer) this.v.get(i8)).intValue()) {
                                    break;
                                }
                                i9++;
                                i8++;
                                size = i10;
                            }
                            this.u.add(i9, cx3VarM);
                            this.v.add(i9, Integer.valueOf(i7));
                        }
                        i6 = i + 1;
                        i2 = i2;
                        i3 = i3;
                        iRound = iRound;
                    }
                    i6 = i + 1;
                    i2 = i2;
                    i3 = i3;
                    iRound = iRound;
                }
                int i11 = i2;
                int i12 = i3;
                ArrayList arrayList3 = this.u;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i11;
                int height2 = view.getHeight() + i12;
                int left2 = i11 - view.getLeft();
                int top2 = i12 - view.getTop();
                int size2 = arrayList3.size();
                cx3 cx3Var2 = null;
                int i13 = -1;
                int i14 = 0;
                while (i14 < size2) {
                    cx3 cx3Var3 = (cx3) arrayList3.get(i14);
                    if (left2 <= 0 || (right = cx3Var3.a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (cx3Var3.a.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i13) {
                            i13 = iAbs4;
                            cx3Var2 = cx3Var3;
                        }
                    }
                    if (left2 < 0 && (left = cx3Var3.a.getLeft() - i11) > 0 && cx3Var3.a.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i13) {
                        i13 = iAbs3;
                        cx3Var2 = cx3Var3;
                    }
                    if (top2 < 0 && (top = cx3Var3.a.getTop() - i12) > 0 && cx3Var3.a.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i13) {
                        i13 = iAbs2;
                        cx3Var2 = cx3Var3;
                    }
                    if (top2 > 0 && (bottom = cx3Var3.a.getBottom() - height2) < 0 && cx3Var3.a.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i13) {
                        i13 = iAbs;
                        cx3Var2 = cx3Var3;
                    }
                    i14++;
                    arrayList3 = arrayList;
                }
                if (cx3Var2 == null) {
                    this.u.clear();
                    this.v.clear();
                    return;
                }
                View view2 = cx3Var2.a;
                int iB = cx3Var2.b();
                cx3Var.b();
                if (e22Var.h(this.r, cx3Var, cx3Var2)) {
                    RecyclerView recyclerView = this.r;
                    mw3 layoutManager2 = recyclerView.getLayoutManager();
                    if (!(layoutManager2 instanceof LinearLayoutManager)) {
                        if (layoutManager2.d()) {
                            if (mw3.A(view2) <= recyclerView.getPaddingLeft()) {
                                recyclerView.j0(iB);
                            }
                            if (mw3.B(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                                recyclerView.j0(iB);
                            }
                        }
                        if (layoutManager2.e()) {
                            if (mw3.C(view2) <= recyclerView.getPaddingTop()) {
                                recyclerView.j0(iB);
                            }
                            if (mw3.y(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                                recyclerView.j0(iB);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                    linearLayoutManager.c("Cannot drop a view during a scroll or layout calculation");
                    linearLayoutManager.L0();
                    linearLayoutManager.d1();
                    int I = mw3.I(view);
                    int I2 = mw3.I(view2);
                    byte b = I < I2 ? (byte) 1 : (byte) -1;
                    boolean z = linearLayoutManager.u;
                    qz0 qz0Var = linearLayoutManager.r;
                    if (z) {
                        if (b == 1) {
                            linearLayoutManager.f1(I2, qz0Var.i() - (linearLayoutManager.r.e(view) + linearLayoutManager.r.g(view2)));
                            return;
                        } else {
                            linearLayoutManager.f1(I2, qz0Var.i() - linearLayoutManager.r.d(view2));
                            return;
                        }
                    }
                    if (b == -1) {
                        linearLayoutManager.f1(I2, qz0Var.g(view2));
                    } else {
                        linearLayoutManager.f1(I2, qz0Var.d(view2) - linearLayoutManager.r.e(view));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
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
    public final void r(cx3 cx3Var, int i) {
        ?? r3;
        ?? r12;
        boolean z;
        ?? r13;
        ?? r14;
        cx3 cx3Var2;
        boolean z2;
        ?? r4;
        int iL;
        char c;
        float fSignum;
        Object obj;
        long j;
        if (cx3Var == this.c && i == this.n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        int i2 = this.n;
        m(cx3Var, true);
        this.n = i;
        if (i == 2) {
            if (cx3Var == null) {
                kf2.n("Must pass a ViewHolder when dragging");
                return;
            }
            this.w = cx3Var.a;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.c;
        e22 e22Var = this.m;
        if (r2 != 0) {
            View view = r2.a;
            if (view.getParent() != null) {
                if (i2 == 2 || this.n == 2) {
                    iL = 0;
                } else {
                    RecyclerView recyclerView = this.r;
                    int i4 = e22Var.c;
                    int i5 = (i4 << 8) | i4 | 3 | 196608;
                    int iB = (e22.b(i5, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (iB == 0) {
                        iL = 0;
                    } else {
                        int i6 = (i5 & 65280) >> 8;
                        if (Math.abs(this.h) > Math.abs(this.i)) {
                            iL = j(iB);
                            if (iL <= 0) {
                                iL = l(iB);
                                if (iL <= 0) {
                                    iL = 0;
                                }
                            } else if ((i6 & iL) == 0) {
                                iL = e22.c(iL, this.r.getLayoutDirection());
                            }
                        } else {
                            iL = l(iB);
                            if (iL <= 0) {
                                iL = j(iB);
                                if (iL <= 0) {
                                    iL = 0;
                                } else if ((i6 & iL) == 0) {
                                    iL = e22.c(iL, this.r.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.t = null;
                }
                char c2 = 4;
                float fSignum2 = 0.0f;
                if (iL == 1 || iL == 2) {
                    c = 0;
                    fSignum = Math.signum(this.i) * this.r.getHeight();
                    obj = null;
                } else if (iL == 4 || iL == 8 || iL == 16 || iL == 32) {
                    c = 0;
                    obj = null;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.h) * this.r.getWidth();
                } else {
                    obj = null;
                    c = 0;
                    fSignum = 0.0f;
                }
                if (i2 == 2) {
                    c2 = '\b';
                } else if (iL > 0) {
                    c2 = 2;
                }
                float[] fArr = this.b;
                o(fArr);
                char c3 = c2;
                ?? r15 = c;
                b22 b22Var = new b22(this, r2, i2, fArr[c], fArr[1], fSignum2, fSignum, iL, r2);
                RecyclerView recyclerView2 = this.r;
                e22Var.getClass();
                jw3 itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator == null) {
                    j = c3 == '\b' ? 200L : 250L;
                } else {
                    j = c3 == '\b' ? itemAnimator.e : itemAnimator.d;
                }
                ValueAnimator valueAnimator = b22Var.g;
                valueAnimator.setDuration(j);
                this.p.add(b22Var);
                r2.p(r15);
                valueAnimator.start();
                r4 = e22Var;
                z2 = true;
                cx3Var2 = null;
                r14 = r15;
            } else {
                r14 = 0;
                if (view == this.w) {
                    cx3Var2 = null;
                    this.w = null;
                } else {
                    cx3Var2 = null;
                }
                ?? r5 = e22Var;
                r5.a(this.r, r2);
                z2 = false;
                r4 = r5;
            }
            this.c = cx3Var2;
            z = z2;
            r3 = r4;
            r12 = r14;
        } else {
            r3 = e22Var;
            r12 = 0;
            z = false;
        }
        if (cx3Var != null) {
            View view2 = cx3Var.a;
            RecyclerView recyclerView3 = this.r;
            int i7 = r3.c;
            this.o = (e22.b(((i7 << 8) | (i7 | 3)) | 196608, recyclerView3.getLayoutDirection()) & i3) >> (this.n * 8);
            this.j = view2.getLeft();
            this.k = view2.getTop();
            this.c = cx3Var;
            if (i == 2) {
                view2.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.r.getParent();
        if (parent != 0) {
            if (this.c != null) {
                r13 = r12;
                r13 = 1;
            }
            r13 = r12;
            parent.requestDisallowInterceptTouchEvent(r13);
        }
        if (!z) {
            this.r.getLayoutManager().f = true;
        }
        r3.getClass();
        this.r.invalidate();
    }

    public final void s(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.d;
        this.h = f;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            this.h = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }
}
