package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rr4 {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public ColorStateList j;
    public float k;
    public final int l;
    public boolean m;
    public Typeface n;

    public rr4(Context r6, int r7) {
        this.m = false;
        TypedArray r1 = r6.obtainStyledAttributes(r7, ht3.V);
        this.k = r1.getDimension(0, 0.0f);
        this.j = h12.s(r6, r1, 3);
        h12.s(r6, r1, 4);
        h12.s(r6, r1, 5);
        this.c = r1.getInt(2, 0);
        this.d = r1.getInt(1, 1);
        int r3 = 12;
        if (r1.hasValue(12) == true) goto L6;
        r3 = 10;
    L6:
        this.l = r1.getResourceId(r3, 0);
        this.b = r1.getString(r3);
        r1.getBoolean(14, false);
        this.a = h12.s(r6, r1, 6);
        this.e = r1.getFloat(7, 0.0f);
        this.f = r1.getFloat(8, 0.0f);
        this.g = r1.getFloat(9, 0.0f);
        r1.recycle();
        TypedArray r8 = r6.obtainStyledAttributes(r7, ht3.F);
        this.h = r8.hasValue(0);
        this.i = r8.getFloat(0, 0.0f);
        r8.recycle();
    }

    public final void a() {
        Typeface r0 = this.n;
        int r1 = this.c;
        if (r0 != null) goto L8;
        String r2 = this.b;
        if (r2 == null) goto L8;
        this.n = Typeface.create(r2, r1);
    L8:
        if (this.n != null) goto L21;
        int r3 = this.d;
        if (r3 != 1) goto L12;
        this.n = Typeface.SANS_SERIF;
    L19:
        this.n = Typeface.create(this.n, r1);
        return;
    L12:
        if (r3 != 2) goto L14;
        this.n = Typeface.SERIF;
        goto L19
    L14:
        if (r3 == 3) goto L16;
        this.n = Typeface.DEFAULT;
        goto L19
    L16:
        this.n = Typeface.MONOSPACE;
        goto L19
    }

    public final Typeface b(Context r9) {
        if (this.m == false) goto L7;
        return this.n;
    L7:
        if (r9.isRestricted() == false) goto L21;
    L18:
        a();
        this.m = true;
        return this.n;
    L21:
        int r2 = this.l;     // Catch: Exception -> L16 Throwable -> L20
        ThreadLocal r0 = g14.a;     // Catch: Exception -> L16 Throwable -> L20
        if (r9.isRestricted() == false) goto L11;
        Typeface r10 = null;
    L12:
        this.n = r10;     // Catch: Exception -> L16 Throwable -> L20
        if (r10 == null) goto L18;
        this.n = Typeface.create(r10, this.c);     // Catch: Exception -> L16 Throwable -> L20
        goto L18
    L11:
        r10 = g14.a(r9, r2, new TypedValue(), 0, null, false, false);     // Catch: Exception -> L16 Throwable -> L20
    L16:
        e = move-exception;
        Log.d("TextAppearance", "Error loading font " + this.b, e);
        goto L18
    }

    public final void c(Context r10, h12 r11) {
        if (d(r10) == false) goto L5;
        b(r10);
    L6:
        int r3 = this.l;
        if (r3 != 0) goto L10;
        this.m = true;
    L10:
        if (this.m == false) goto L23;
        r11.I(this.n, true);
        return;
    L23:
        pr4 r6 = new pr4(this, r11);     // Catch: Exception -> L19 Resources.NotFoundException -> L21
        ThreadLocal r0 = g14.a;     // Catch: Exception -> L19 Resources.NotFoundException -> L21
        if (r10.isRestricted() == false) goto L17;
        r6.e(-4);     // Catch: Exception -> L19 Resources.NotFoundException -> L21
        return;
    L17:
        g14.a(r10, r3, new TypedValue(), 0, r6, false, false);     // Catch: Exception -> L19 Resources.NotFoundException -> L21
        return;
    L21:
        this.m = true;
        r11.H(1);
        return;
    L19:
        e = move-exception;
        Log.d("TextAppearance", "Error loading font " + this.b, e);
        this.m = true;
        r11.H(-3);
        return;
    L5:
        a();
        goto L6
    }

    public final boolean d(Context r9) {
        Typeface r0 = null;
        int r2 = this.l;
        if (r2 == 0) goto L8;
        ThreadLocal r8 = g14.a;
        if (r9.isRestricted() == true) goto L8;
        r0 = g14.a(r9, r2, new TypedValue(), 0, null, false, true);
    L8:
        if (r0 == null) goto L11;
        return true;
    L11:
        return false;
    }

    public final void e(Context r2, TextPaint r3, h12 r4) {
        f(r2, r3, r4);
        ColorStateList r5 = this.j;
        if (r5 == null) goto L5;
        int r6 = r5.getColorForState(r3.drawableState, r5.getDefaultColor());
    L6:
        r3.setColor(r6);
        ColorStateList r7 = this.a;
        if (r7 == null) goto L9;
        int r8 = r7.getColorForState(r3.drawableState, r7.getDefaultColor());
    L10:
        r3.setShadowLayer(this.g, this.e, this.f, r8);
        return;
    L9:
        r8 = 0;
        goto L10
    L5:
        r6 = -16777216;
        goto L6
    }

    public final void f(Context r2, TextPaint r3, h12 r4) {
        if (d(r2) == false) goto L6;
        g(r2, r3, b(r2));
        return;
    L6:
        a();
        g(r2, r3, this.n);
        c(r2, new qr4(this, r2, r3, r4));
    }

    public final void g(Context r1, TextPaint r2, Typeface r3) {
        Typeface r4 = zz1.v(r1.getResources().getConfiguration(), r3);
        if (r4 == null) goto L5;
        r3 = r4;
    L5:
        r2.setTypeface(r3);
        int r5 = (~r3.getStyle()) & this.c;
        if ((r5 & 1) == 0) goto L8;
        boolean r6 = true;
    L9:
        r2.setFakeBoldText(r6);
        if ((r5 & 2) == 0) goto L12;
        float r7 = -0.25f;
    L13:
        r2.setTextSkewX(r7);
        r2.setTextSize(this.k);
        if (this.h == false) goto L17;
        r2.setLetterSpacing(this.i);
        return;
    L17:
        return;
    L12:
        r7 = 0.0f;
        goto L13
    L8:
        r6 = false;
        goto L9
    }
}
