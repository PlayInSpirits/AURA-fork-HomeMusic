package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ge0 extends ViewGroup.MarginLayoutParams {
    public de0 a;
    public boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final Rect p;

    public ge0(Context r9, AttributeSet r10) {
        super(r9, r10);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
        TypedArray r2 = r9.obtainStyledAttributes(r10, lt3.b);
        this.c = r2.getInteger(0, 0);
        this.f = r2.getResourceId(1, -1);
        this.d = r2.getInteger(2, 0);
        this.e = r2.getInteger(6, -1);
        this.g = r2.getInt(5, 0);
        this.h = r2.getInt(4, 0);
        boolean r4 = r2.hasValue(3);
        this.b = r4;
        if (r4 == false) goto L29;
        String r1 = r2.getString(3);
        String r5 = CoordinatorLayout.F;
        de0 r6 = null;
        if (TextUtils.isEmpty(r1) == false) goto L8;
    L26:
        this.a = r6;
        goto L29
    L8:
        if (r1.startsWith(".") == false) goto L11;
        r1 = r9.getPackageName() + r1;
    L33:
        ThreadLocal r7 = CoordinatorLayout.H;     // Catch: Exception -> L19
        Map r8 = (Map) r7.get();     // Catch: Exception -> L19
        if (r8 != null) goto L21;
        r8 = new HashMap();     // Catch: Exception -> L19
        r7.set(r8);     // Catch: Exception -> L19
    L21:
        Constructor<?> r11 = (Constructor) r8.get(r1);     // Catch: Exception -> L19
        if (r11 != null) goto L24;
        r11 = Class.forName(r1, false, r9.getClassLoader()).getConstructor(CoordinatorLayout.G);     // Catch: Exception -> L19
        r11.setAccessible(true);     // Catch: Exception -> L19
        r8.put(r1, r11);     // Catch: Exception -> L19
    L24:
        r6 = (de0) r11.newInstance(new Object[]{r9, r10});     // Catch: Exception -> L19
    L19:
        e = move-exception;
        nz2.s("Could not inflate Behavior subclass ".concat(r1), e);
        throw null;
    L11:
        if (r1.indexOf(46) >= 0) goto L33;
        String r12 = CoordinatorLayout.F;
        if (TextUtils.isEmpty(r12) == true) goto L33;
        r1 = r12 + '.' + r1;
    L29:
        r2.recycle();
        de0 r13 = this.a;
        if (r13 == null) goto L35;
        r13.g(this);
        return;
    }

    public final boolean a(int r2) {
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L8;
        return false;
    L8:
        return this.n;
    L10:
        return this.m;
    }

    public final void b(de0 r2) {
        de0 r0 = this.a;
        if (r0 == r2) goto L10;
        if (r0 == null) goto L6;
        r0.j();
    L6:
        this.a = r2;
        this.b = true;
        if (r2 == null) goto L11;
        r2.g(this);
        return;
    L11:
        return;
    }

    public ge0() {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public ge0(ge0 r2) {
        super(r2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public ge0(ViewGroup.MarginLayoutParams r2) {
        super(r2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }

    public ge0(ViewGroup.LayoutParams r2) {
        super(r2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new Rect();
    }
}
