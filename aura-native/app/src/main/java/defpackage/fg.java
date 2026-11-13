package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fg {
    public fg() {
        super();
    }

    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static fg c;
    public c14 a;

    public static synchronized fg a() {
        fg fgVar;
        synchronized (fg.class) {
            try {
                if (c == null) {
                    d();
                }
                fgVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fgVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter f;
        synchronized (fg.class) {
            f = c14.f(i, mode);
        }
        return f;
    }

    public static synchronized void d() {
        synchronized (fg.class) {
            if (c == null) {
                fg fgVar = new fg();
                c = fgVar;
                fgVar.a = c14.c();
                c14 c14Var = c.a;
                ml3 ml3Var = new ml3(1);
                synchronized (c14Var) {
                    c14Var.e = ml3Var;
                }
            }
        }
    }

    public static void e(Drawable drawable, la0 la0Var, int[] iArr) {
        PorterDuff.Mode mode = c14.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = la0Var.o;
        if (!z && !la0Var.n) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? (ColorStateList) la0Var.p : null;
        PorterDuff.Mode mode2 = la0Var.n ? (PorterDuff.Mode) la0Var.q : c14.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = c14.f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.d(context, i);
    }
}
