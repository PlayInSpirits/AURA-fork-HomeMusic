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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mo4 {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C;
    public PorterDuff.Mode D;
    public final /* synthetic */ no4 E;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
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

    public mo4(no4 r1, Menu r2) {
        this.E = r1;
        this.C = null;
        this.D = null;
        this.a = r2;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final Object a(String r2, Class[] r3, Object[] r4) {
        Constructor<?> r1 = Class.forName(r2, false, this.E.c.getClassLoader()).getConstructor(r3);     // Catch: Exception -> L4
        r1.setAccessible(true);     // Catch: Exception -> L4
        return r1.newInstance(r4);
    L4:
        e = move-exception;
        Log.w("SupportMenuInflater", "Cannot instantiate class: " + r2, e);
        return null;
    }

    public final void b(MenuItem r9) {
        no4 r0 = this.E;
        Context r1 = r0.c;
        MenuItem r2 = r9.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
        boolean r4 = false;
        if (this.r < 1) goto L5;
        boolean r3 = true;
    L6:
        r2.setCheckable(r3).setTitleCondensed(this.l).setIcon(this.m);
        int r5 = this.v;
        if (r5 < 0) goto L10;
        r9.setShowAsAction(r5);
    L10:
        if (this.y == null) goto L25;
        if (r1.isRestricted() == false) goto L14;
        kf2.o("The android:onClick attribute cannot be used within a restricted context");
        return;
    L14:
        if (r0.d != null) goto L16;
        r0.d = no4.a(r1);
    L16:
        Object r6 = r0.d;
        String r7 = this.y;
        lo4 r8 = new lo4();
        r8.o = r6;
        Class<?> r10 = r6.getClass();
        r8.p = r10.getMethod(r7, lo4.q);     // Catch: Exception -> L19
        r9.setOnMenuItemClickListener(r8);
    L19:
        e = move-exception;
        StringBuilder r11 = xa3.j("Couldn't resolve menu item onClick handler ", r7, " in class ");
        r11.append(r10.getName());
        InflateException r12 = new InflateException(r11.toString());
        r12.initCause(e);
        throw r12;
    L25:
        if (this.r >= 2) goto L27;
    L40:
        String r13 = this.x;
        if (r13 == null) goto L43;
        r9.setActionView((View) a(r13, no4.e, r0.a));
        r4 = true;
    L43:
        int r14 = this.w;
        if (r14 <= 0) goto L48;
        if (r4 == true) goto L47;
        r9.setActionView(r14);
        goto L48
    L47:
        Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
    L48:
        e5 r15 = this.z;
        if (r15 != null) goto L51;
    L54:
        CharSequence r16 = this.A;
        boolean r17 = r9 instanceof oo4;
        if (r17 == false) goto L58;
        ((oo4) r9).setContentDescription(r16);
    L60:
        CharSequence r18 = this.B;
        if (r17 == false) goto L64;
        ((oo4) r9).setTooltipText(r18);
    L66:
        char r19 = this.n;
        int r20 = this.o;
        if (r17 == false) goto L70;
        ((oo4) r9).setAlphabeticShortcut(r19, r20);
    L72:
        char r21 = this.p;
        int r22 = this.q;
        if (r17 == false) goto L76;
        ((oo4) r9).setNumericShortcut(r21, r22);
    L78:
        PorterDuff.Mode r23 = this.D;
        if (r23 == null) goto L85;
        if (r17 == false) goto L83;
        ((oo4) r9).setIconTintMode(r23);
        goto L85
    L83:
        if (Build.VERSION.SDK_INT < 26) goto L85;
        r50.p(r9, r23);
    L85:
        ColorStateList r24 = this.C;
        if (r24 == null) goto L97;
        if (r17 == false) goto L90;
        ((oo4) r9).setIconTintList(r24);
        return;
    L90:
        if (Build.VERSION.SDK_INT < 26) goto L99;
        r50.o(r9, r24);
        return;
    L99:
        return;
    L97:
        return;
    L76:
        if (Build.VERSION.SDK_INT < 26) goto L78;
        r50.q(r9, r21, r22);
        goto L78
    L70:
        if (Build.VERSION.SDK_INT < 26) goto L72;
        r50.k(r9, r19, r20);
        goto L72
    L64:
        if (Build.VERSION.SDK_INT < 26) goto L66;
        r50.u(r9, r18);
        goto L66
    L58:
        if (Build.VERSION.SDK_INT < 26) goto L60;
        r50.m(r9, r16);
        goto L60
    L51:
        if ((r9 instanceof oo4) == false) goto L53;
        ((oo4) r9).a(r15);
        goto L54
    L53:
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        goto L54
    L27:
        if ((r9 instanceof tu2) == false) goto L30;
        ((tu2) r9).f(true);
        goto L40
    L30:
        if ((r9 instanceof xu2) == false) goto L40;
        xu2 r25 = (xu2) r9;
        oo4 r26 = r25.c;
    L35:
        e = move-exception;
        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        goto L40
    L33:
        if (r25.d != null) goto L37;
        r25.d = r26.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});     // Catch: Exception -> L35
    L37:
        r25.d.invoke(r26, new Object[]{Boolean.TRUE});     // Catch: Exception -> L35
        goto L40
    L5:
        r3 = false;
        goto L6
    }
}
