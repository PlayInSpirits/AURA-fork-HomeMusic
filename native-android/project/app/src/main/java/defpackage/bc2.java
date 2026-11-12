package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bc2 implements nd4 {
    public static final Method N;
    public static final Method O;
    public og0 A;
    public View B;
    public AdapterView.OnItemClickListener C;
    public AdapterView.OnItemSelectedListener D;
    public final Handler I;
    public Rect K;
    public boolean L;
    public final lg M;
    public final Context n;
    public ListAdapter o;
    public cx0 p;
    public int s;
    public int t;
    public boolean v;
    public boolean w;
    public boolean x;
    public final int q = -2;
    public int r = -2;
    public final int u = 1002;
    public int y = 0;
    public final int z = Integer.MAX_VALUE;
    public final yb2 E = new yb2(this, 1);
    public final ac2 F = new ac2(this);
    public final zb2 G = new zb2(this);
    public final yb2 H = new yb2(this, 0);
    public final Rect J = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                N = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                O = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public bc2(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.n = context;
        this.I = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, st3.p, i, 0);
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.v = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        lg lgVar = new lg(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, st3.t, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            lgVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        lgVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : zz1.r(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.M = lgVar;
        lgVar.setInputMethodMode(1);
    }

    @Override // defpackage.nd4
    public final boolean b() {
        return this.M.isShowing();
    }

    public final int c() {
        return this.s;
    }

    public final void d(int i) {
        this.s = i;
    }

    @Override // defpackage.nd4
    public final void dismiss() {
        lg lgVar = this.M;
        lgVar.dismiss();
        lgVar.setContentView(null);
        this.p = null;
        this.I.removeCallbacks(this.E);
    }

    @Override // defpackage.nd4
    public final void f() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        cx0 cx0Var;
        cx0 cx0Var2 = this.p;
        Context context = this.n;
        int i2 = 1;
        lg lgVar = this.M;
        if (cx0Var2 == null) {
            cx0 cx0VarQ = q(context, !this.L);
            this.p = cx0VarQ;
            cx0VarQ.setAdapter(this.o);
            this.p.setOnItemClickListener(this.C);
            this.p.setFocusable(true);
            this.p.setFocusableInTouchMode(true);
            this.p.setOnItemSelectedListener(new dx0(i2, this));
            this.p.setOnScrollListener(this.G);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.D;
            if (onItemSelectedListener != null) {
                this.p.setOnItemSelectedListener(onItemSelectedListener);
            }
            lgVar.setContentView(this.p);
        }
        Drawable background = lgVar.getBackground();
        Rect rect = this.J;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.v) {
                this.t = -i3;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = wb2.a(lgVar, this.B, this.t, lgVar.getInputMethodMode() == 2);
        int i4 = this.q;
        if (i4 == -1) {
            paddingBottom = iA + i;
        } else {
            int i5 = this.r;
            if (i5 != -2) {
                iMakeMeasureSpec = i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.p.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.p.getPaddingBottom() + this.p.getPaddingTop() + i : 0);
        }
        boolean z = lgVar.getInputMethodMode() == 2;
        lgVar.setWindowLayoutType(this.u);
        if (lgVar.isShowing()) {
            if (this.B.isAttachedToWindow()) {
                int width = this.r;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.B.getWidth();
                }
                if (i4 == -1) {
                    i4 = z ? paddingBottom : -1;
                    int i6 = this.r;
                    if (z) {
                        lgVar.setWidth(i6 == -1 ? -1 : 0);
                        lgVar.setHeight(0);
                    } else {
                        lgVar.setWidth(i6 == -1 ? -1 : 0);
                        lgVar.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                lgVar.setOutsideTouchable(true);
                int i7 = width;
                View view = this.B;
                int i8 = this.s;
                int i9 = this.t;
                int i10 = i7 < 0 ? -1 : i7;
                if (i4 < 0) {
                    i4 = -1;
                }
                lgVar.update(view, i8, i9, i10, i4);
                return;
            }
            return;
        }
        int width2 = this.r;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.B.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        lgVar.setWidth(width2);
        lgVar.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = N;
            if (method != null) {
                try {
                    method.invoke(lgVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            xb2.b(lgVar, true);
        }
        lgVar.setOutsideTouchable(true);
        lgVar.setTouchInterceptor(this.F);
        if (this.x) {
            lgVar.setOverlapAnchor(this.w);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = O;
            if (method2 != null) {
                try {
                    method2.invoke(lgVar, this.K);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            xb2.a(lgVar, this.K);
        }
        lgVar.showAsDropDown(this.B, this.s, this.t, this.y);
        this.p.setSelection(-1);
        if ((!this.L || this.p.isInTouchMode()) && (cx0Var = this.p) != null) {
            cx0Var.setListSelectionHidden(true);
            cx0Var.requestLayout();
        }
        if (this.L) {
            return;
        }
        this.I.post(this.H);
    }

    public final Drawable g() {
        return this.M.getBackground();
    }

    public final void i(Drawable drawable) {
        this.M.setBackgroundDrawable(drawable);
    }

    public final void j(int i) {
        this.t = i;
        this.v = true;
    }

    @Override // defpackage.nd4
    public final cx0 k() {
        return this.p;
    }

    public final int o() {
        if (this.v) {
            return this.t;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        og0 og0Var = this.A;
        if (og0Var == null) {
            this.A = new og0(1, this);
        } else {
            ListAdapter listAdapter2 = this.o;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(og0Var);
            }
        }
        this.o = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A);
        }
        cx0 cx0Var = this.p;
        if (cx0Var != null) {
            cx0Var.setAdapter(this.o);
        }
    }

    public cx0 q(Context context, boolean z) {
        return new cx0(context, z);
    }

    public final void r(int i) {
        Drawable background = this.M.getBackground();
        if (background == null) {
            this.r = i;
            return;
        }
        Rect rect = this.J;
        background.getPadding(rect);
        this.r = rect.left + rect.right + i;
    }
}
