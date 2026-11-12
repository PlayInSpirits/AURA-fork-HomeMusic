package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yo extends Drawable implements wr4 {
    public final WeakReference n;
    public final fi2 o;
    public final xr4 p;
    public final Rect q;
    public final ap r;
    public float s;
    public float t;
    public final int u;
    public float v;
    public float w;
    public float x;
    public WeakReference y;
    public WeakReference z;

    public yo(Context context, zo zoVar) {
        rr4 rr4Var;
        WeakReference weakReference = new WeakReference(context);
        this.n = weakReference;
        uc5.h(context, uc5.h, "Theme.MaterialComponents");
        this.q = new Rect();
        xr4 xr4Var = new xr4(this);
        this.p = xr4Var;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = xr4Var.a;
        textPaint.setTextAlign(align);
        ap apVar = new ap(context, zoVar);
        this.r = apVar;
        boolean zF = f();
        zo zoVar2 = apVar.b;
        fi2 fi2Var = new fi2(bc4.a(context, zF ? zoVar2.t.intValue() : zoVar2.r.intValue(), f() ? zoVar2.u.intValue() : zoVar2.s.intValue()).a());
        this.o = fi2Var;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && xr4Var.g != (rr4Var = new rr4(context2, zoVar2.q.intValue()))) {
            xr4Var.c(rr4Var, context2);
            textPaint.setColor(zoVar2.p.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i = zoVar2.y;
        if (i != -2) {
            this.u = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.u = zoVar2.z;
        }
        xr4Var.e = true;
        j();
        invalidateSelf();
        xr4Var.e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(zoVar2.o.intValue());
        if (fi2Var.n.c != colorStateListValueOf) {
            fi2Var.m(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(zoVar2.p.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.y;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.y.get();
            WeakReference weakReference3 = this.z;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(zoVar2.G.booleanValue(), false);
    }

    @Override // defpackage.wr4
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        ap apVar = this.r;
        zo zoVar = apVar.b;
        zo zoVar2 = apVar.b;
        String str = zoVar.w;
        WeakReference weakReference = this.n;
        if (str == null) {
            if (!g()) {
                return null;
            }
            int i = this.u;
            if (i == -2 || e() <= i) {
                return NumberFormat.getInstance(zoVar2.A).format(e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(zoVar2.A, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        int i2 = zoVar.y;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        ap apVar = this.r;
        zo zoVar = apVar.b;
        if (zoVar.w != null) {
            CharSequence charSequence = zoVar.B;
            return charSequence != null ? charSequence : apVar.b.w;
        }
        boolean zG = g();
        zo zoVar2 = apVar.b;
        if (!zG) {
            return zoVar2.C;
        }
        if (zoVar2.D == 0 || (context = (Context) this.n.get()) == null) {
            return null;
        }
        int i = this.u;
        return (i == -2 || e() <= i) ? context.getResources().getQuantityString(zoVar2.D, e(), Integer.valueOf(e())) : context.getString(zoVar2.E, Integer.valueOf(i));
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.z;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.o.draw(canvas);
        if (!f() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        xr4 xr4Var = this.p;
        xr4Var.a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.t - rect.exactCenterY();
        canvas.drawText(strB, this.s, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), xr4Var.a);
    }

    public final int e() {
        int i = this.r.b.x;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean f() {
        return this.r.b.w != null || g();
    }

    public final boolean g() {
        zo zoVar = this.r.b;
        return zoVar.w == null && zoVar.x != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.r.b.v;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.q.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.q.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.n.get();
        if (context == null) {
            return;
        }
        boolean zF = f();
        ap apVar = this.r;
        this.o.setShapeAppearanceModel(bc4.a(context, zF ? apVar.b.t.intValue() : apVar.b.r.intValue(), f() ? apVar.b.u.intValue() : apVar.b.s.intValue()).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.y = new WeakReference(view);
        this.z = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0237  */
    /* JADX WARN: Code duplicated, block: B:101:0x024f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0254  */
    /* JADX WARN: Code duplicated, block: B:107:0x0261  */
    /* JADX WARN: Code duplicated, block: B:110:0x026e  */
    /* JADX WARN: Code duplicated, block: B:113:0x027b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0216  */
    /* JADX WARN: Code duplicated, block: B:97:0x022e  */
    public final void j() {
        float y;
        float x;
        float y2;
        float x2;
        float height;
        float width;
        WeakReference weakReference = this.n;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.y;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.q;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.z;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zF = f();
        ap apVar = this.r;
        float f = zF ? apVar.d : apVar.c;
        this.v = f;
        if (f != -1.0f) {
            this.w = f;
            this.x = f;
        } else {
            this.w = Math.round((f() ? apVar.g : apVar.e) / 2.0f);
            this.x = Math.round((f() ? apVar.h : apVar.f) / 2.0f);
        }
        if (f()) {
            String strB = b();
            float f2 = this.w;
            xr4 xr4Var = this.p;
            this.w = Math.max(f2, (xr4Var.a(strB) / 2.0f) + apVar.b.H.intValue());
            float f3 = this.x;
            if (xr4Var.e) {
                xr4Var.b(strB);
            }
            float fMax = Math.max(f3, (xr4Var.d / 2.0f) + apVar.b.I.intValue());
            this.x = fMax;
            this.w = Math.max(this.w, fMax);
        }
        zo zoVar = apVar.b;
        zo zoVar2 = apVar.b;
        int i = apVar.k;
        int iIntValue = zoVar.K.intValue();
        if (f()) {
            iIntValue = zoVar.M.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = yd.c(iIntValue, yd.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue - zoVar.P.intValue());
            }
        }
        if (i == 0) {
            iIntValue -= Math.round(this.x);
        }
        int iIntValue2 = zoVar.O.intValue() + iIntValue;
        int iIntValue3 = zoVar2.F.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.t = rect3.bottom - iIntValue2;
        } else {
            this.t = rect3.top + iIntValue2;
        }
        int iIntValue4 = f() ? zoVar.L.intValue() : zoVar2.J.intValue();
        if (i == 1) {
            iIntValue4 += f() ? apVar.j : apVar.i;
        }
        int iIntValue5 = zoVar.N.intValue() + iIntValue4;
        int iIntValue6 = zoVar2.F.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap weakHashMap = j65.a;
            this.s = view.getLayoutDirection() == 0 ? (rect3.left - this.w) + iIntValue5 : (rect3.right + this.w) - iIntValue5;
        } else {
            WeakHashMap weakHashMap2 = j65.a;
            this.s = view.getLayoutDirection() == 0 ? (rect3.right + this.w) - iIntValue5 : (rect3.left - this.w) + iIntValue5;
        }
        if (zoVar.Q.booleanValue()) {
            View viewD = d();
            if (viewD != null) {
                FrameLayout frameLayoutD = d();
                if (frameLayoutD == null || frameLayoutD.getId() != R.id.mtrl_anchor_parent) {
                    y = 0.0f;
                    x = 0.0f;
                } else if (viewD.getParent() instanceof View) {
                    y = viewD.getY();
                    x = viewD.getX();
                    viewD = (View) viewD.getParent();
                }
                y2 = viewD.getY() + (this.t - this.x) + y;
                x2 = viewD.getX() + (this.s - this.w) + x;
                if (viewD.getParent() instanceof View) {
                    height = ((this.t + this.x) - (((View) viewD.getParent()).getHeight() - viewD.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewD.getParent() instanceof View) {
                    width = ((this.s + this.w) - (((View) viewD.getParent()).getWidth() - viewD.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.t = Math.abs(y2) + this.t;
                }
                if (x2 < 0.0f) {
                    this.s = Math.abs(x2) + this.s;
                }
                if (height > 0.0f) {
                    this.t -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.s -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y3 = view.getY();
                x = view.getX();
                View view2 = (View) view.getParent();
                y = y3;
                viewD = view2;
                y2 = viewD.getY() + (this.t - this.x) + y;
                x2 = viewD.getX() + (this.s - this.w) + x;
                if (viewD.getParent() instanceof View) {
                    height = ((this.t + this.x) - (((View) viewD.getParent()).getHeight() - viewD.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewD.getParent() instanceof View) {
                    width = ((this.s + this.w) - (((View) viewD.getParent()).getWidth() - viewD.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.t = Math.abs(y2) + this.t;
                }
                if (x2 < 0.0f) {
                    this.s = Math.abs(x2) + this.s;
                }
                if (height > 0.0f) {
                    this.t -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.s -= Math.abs(width);
                }
            }
        }
        float f4 = this.s;
        float f5 = this.t;
        float f6 = this.w;
        float f7 = this.x;
        rect2.set((int) (f4 - f6), (int) (f5 - f7), (int) (f4 + f6), (int) (f5 + f7));
        float f8 = this.v;
        fi2 fi2Var = this.o;
        if (f8 != -1.0f) {
            zc1 zc1VarG = fi2Var.n.a.g();
            zc1VarG.b(f8);
            fi2Var.setShapeAppearanceModel(zc1VarG.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        fi2Var.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.wr4
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        ap apVar = this.r;
        apVar.a.v = i;
        apVar.b.v = i;
        this.p.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
