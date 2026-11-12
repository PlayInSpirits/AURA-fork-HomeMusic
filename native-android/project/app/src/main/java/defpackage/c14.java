package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c14 {
    public static c14 g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public ml3 e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final b14 h = new b14(6);

    public static synchronized c14 c() {
        try {
            if (g == null) {
                g = new c14();
            }
        } catch (Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        b14 b14Var = h;
        b14Var.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) b14Var.g(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        mj4 mj4Var = (mj4) this.a.get(context);
        if (mj4Var == null) {
            mj4Var = new mj4(0);
            this.a.put(context, mj4Var);
        }
        int i2 = mj4Var.q;
        if (i2 != 0 && i <= mj4Var.o[i2 - 1]) {
            mj4Var.d(i, colorStateList);
            return;
        }
        if (mj4Var.n && i2 >= mj4Var.o.length) {
            su3.f(mj4Var);
        }
        int i3 = mj4Var.q;
        if (i3 >= mj4Var.o.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            mj4Var.o = Arrays.copyOf(mj4Var.o, i7);
            mj4Var.p = Arrays.copyOf(mj4Var.p, i7);
        }
        mj4Var.o[i3] = i;
        mj4Var.p[i3] = colorStateList;
        mj4Var.q = i3 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    public final Drawable b(Context context, int i) {
        Object obj;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawableN;
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            xe2 xe2Var = (xe2) this.b.get(context);
            obj = null;
            if (xe2Var != null && (weakReference = (WeakReference) xe2Var.b(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    xe2Var.g(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e == null) {
            layerDrawableN = null;
        } else if (i == R.drawable.abc_cab_background_top_material) {
            layerDrawableN = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        } else if (i == R.drawable.abc_ratingbar_material) {
            layerDrawableN = ml3.n(this, context, R.dimen.abc_star_big);
        } else if (i == R.drawable.abc_ratingbar_indicator_material) {
            layerDrawableN = ml3.n(this, context, R.dimen.abc_star_medium);
        } else if (i == R.drawable.abc_ratingbar_small_material) {
            layerDrawableN = ml3.n(this, context, R.dimen.abc_star_small);
        } else {
            layerDrawableN = null;
        }
        if (layerDrawableN == null) {
            return layerDrawableN;
        }
        layerDrawableN.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableN.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableN;
                }
                xe2 xe2Var2 = (xe2) this.b.get(context);
                if (xe2Var2 == null) {
                    xe2Var2 = new xe2(obj);
                    this.b.put(context, xe2Var2);
                }
                xe2Var2.f(j, new WeakReference(constantState2));
                return layerDrawableN;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, R.drawable.abc_vector_test);
                if (drawableD == null || (!(drawableD instanceof z35) && !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName()))) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, z, drawableB);
            }
            if (drawableB != null) {
                aw0.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        mj4 mj4Var;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListO = null;
        colorStateList = (weakHashMap == null || (mj4Var = (mj4) weakHashMap.get(context)) == null) ? null : (ColorStateList) mj4Var.b(i);
        if (colorStateList == null) {
            ml3 ml3Var = this.e;
            if (ml3Var != null) {
                colorStateListO = ml3Var.o(context, i);
            }
            if (colorStateListO != null) {
                a(context, i, colorStateListO);
            }
            colorStateList = colorStateListO;
        }
        return colorStateList;
    }

    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        boolean z2;
        int iRound;
        ColorStateList colorStateListG = g(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListG != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListG);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        ml3 ml3Var = this.e;
        int i2 = R.attr.colorControlNormal;
        if (ml3Var != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = gt4.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = fg.b;
                ml3.t(drawableFindDrawableByLayerId, iC, mode2);
                ml3.t(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), gt4.c(context, R.attr.colorControlNormal), mode2);
                ml3.t(layerDrawable.findDrawableByLayerId(android.R.id.progress), gt4.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = gt4.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = fg.b;
                ml3.t(drawableFindDrawableByLayerId2, iB, mode3);
                ml3.t(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), gt4.c(context, R.attr.colorControlActivated), mode3);
                ml3.t(layerDrawable2.findDrawableByLayerId(android.R.id.progress), gt4.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        ml3 ml3Var2 = this.e;
        boolean z3 = false;
        if (ml3Var2 != null) {
            PorterDuff.Mode mode4 = fg.b;
            if (ml3.i((int[]) ml3Var2.a, i)) {
                z2 = true;
                iRound = -1;
            } else {
                if (ml3.i((int[]) ml3Var2.c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zI = ml3.i((int[]) ml3Var2.d, i);
                    i2 = android.R.attr.colorBackground;
                    if (zI) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                        z2 = true;
                    } else {
                        if (i != R.drawable.abc_dialog_material_background) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                    }
                }
                z2 = true;
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                drawableMutate2.setColorFilter(fg.c(gt4.c(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                }
                z3 = true;
            }
        }
        if (z3 || !z) {
            return drawable;
        }
        return null;
    }
}
