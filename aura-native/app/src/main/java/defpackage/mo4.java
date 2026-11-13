package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class mo4 {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ no4 E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public e5 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public mo4(no4 no4Var, Menu menu) {
        this.E = no4Var;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        no4 no4Var = this.E;
        Context context = no4Var.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                kf2.o("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (no4Var.d == null) {
                no4Var.d = no4.a(context);
            }
            Object obj = no4Var.d;
            String str = this.y;
            lo4 lo4Var = new lo4();
            lo4Var.o = obj;
            Class<?> cls = obj.getClass();
            try {
                lo4Var.p = cls.getMethod(str, lo4.q);
                menuItem.setOnMenuItemClickListener(lo4Var);
            } catch (Exception e) {
                StringBuilder j = xa3.j("Couldn't resolve menu item onClick handler ", str, " in class ");
                j.append(cls.getName());
                InflateException inflateException = new InflateException(j.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof tu2) {
                ((tu2) menuItem).f(true);
            } else if (menuItem instanceof xu2) {
                xu2 xu2Var = (xu2) menuItem;
                oo4 oo4Var = xu2Var.c;
                try {
                    if (xu2Var.d == null) {
                        xu2Var.d = oo4Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    xu2Var.d.invoke(oo4Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, no4.e, no4Var.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        e5 e5Var = this.z;
        if (e5Var != null) {
            if (menuItem instanceof oo4) {
                ((oo4) menuItem).a(e5Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof oo4;
        if (z2) {
            ((oo4) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            r50.m(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((oo4) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            r50.u(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((oo4) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            r50.k(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((oo4) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            r50.q(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((oo4) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                r50.p(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((oo4) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                r50.o(menuItem, colorStateList);
            }
        }
    }
}
