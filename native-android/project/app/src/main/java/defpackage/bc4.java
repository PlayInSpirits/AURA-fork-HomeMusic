package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bc4 {
    public static final oy3 m = null;
    public su3 a;
    public su3 b;
    public su3 c;
    public su3 d;
    public ke0 e;
    public ke0 f;
    public ke0 g;
    public ke0 h;
    public fz0 i;
    public fz0 j;
    public fz0 k;
    public fz0 l;

    static {
        m = new oy3(0.5f);
    }

    public bc4() {
        this.a = new m34();
        this.b = new m34();
        this.c = new m34();
        this.d = new m34();
        this.e = new m(0.0f);
        this.f = new m(0.0f);
        this.g = new m(0.0f);
        this.h = new m(0.0f);
        int r1 = 0;
        this.i = new fz0(r1);
        this.j = new fz0(r1);
        this.k = new fz0(r1);
        this.l = new fz0(r1);
    }

    public static zc1 a(Context r2, int r3, int r4) {
        return b(r2, r3, r4, new m(0.0f));
    }

    public static zc1 b(Context r6, int r7, int r8, ke0 r9) {
        ContextThemeWrapper r0 = new ContextThemeWrapper(r6, r7);
        if (r8 == 0) goto L5;
        r0 = new ContextThemeWrapper(r0, r8);
    L5:
        TypedArray r10 = r0.obtainStyledAttributes(ht3.P);
        int r11 = r10.getInt(0, 0);     // Catch: Throwable -> L9
        int r12 = r10.getInt(3, r11);     // Catch: Throwable -> L9
        int r1 = r10.getInt(4, r11);     // Catch: Throwable -> L9
        int r2 = r10.getInt(2, r11);     // Catch: Throwable -> L9
        int r13 = r10.getInt(1, r11);     // Catch: Throwable -> L9
        ke0 r14 = e(r10, 5, r9);     // Catch: Throwable -> L9
        ke0 r3 = e(r10, 8, r14);     // Catch: Throwable -> L9
        ke0 r4 = e(r10, 9, r14);     // Catch: Throwable -> L9
        ke0 r5 = e(r10, 7, r14);     // Catch: Throwable -> L9
        ke0 r15 = e(r10, 6, r14);     // Catch: Throwable -> L9
        zc1 r16 = new zc1();     // Catch: Throwable -> L9
        r16.a = ji2.v(r12);     // Catch: Throwable -> L9
        r16.e = r3;     // Catch: Throwable -> L9
        r16.b = ji2.v(r1);     // Catch: Throwable -> L9
        r16.f = r4;     // Catch: Throwable -> L9
        r16.c = ji2.v(r2);     // Catch: Throwable -> L9
        r16.g = r5;     // Catch: Throwable -> L9
        r16.d = ji2.v(r13);     // Catch: Throwable -> L9
        r16.h = r15;     // Catch: Throwable -> L9
        r10.recycle();
        return r16;
    L9:
        th = move-exception;
        r10.recycle();
        throw th;
    }

    public static zc1 c(Context r2, AttributeSet r3, int r4, int r5) {
        return d(r2, r3, r4, r5, new m(0.0f));
    }

    public static zc1 d(Context r1, AttributeSet r2, int r3, int r4, ke0 r5) {
        TypedArray r6 = r1.obtainStyledAttributes(r2, ht3.D, r3, r4);
        int r7 = r6.getResourceId(0, 0);
        int r8 = r6.getResourceId(1, 0);
        r6.recycle();
        return b(r1, r7, r8, r5);
    }

    public static ke0 e(TypedArray r2, int r3, ke0 r4) {
        TypedValue r5 = r2.peekValue(r3);
        if (r5 == null) goto L13;
        int r0 = r5.type;
        if (r0 != 5) goto L10;
        return new m(TypedValue.complexToDimensionPixelSize(r5.data, r2.getResources().getDisplayMetrics()));
    L10:
        if (r0 != 6) goto L13;
        return new oy3(r5.getFraction(1.0f, 1.0f));
    L13:
        return r4;
    }

    public final boolean f(RectF r6) {
        if (this.l.getClass().equals(fz0.class) == true) goto L5;
    L11:
        boolean r0 = false;
    L12:
        float r1 = this.e.a(r6);
        if (this.f.a(r6) == r1) goto L15;
    L19:
        boolean r7 = false;
    L21:
        if ((this.b instanceof m34) == true) goto L23;
    L29:
        boolean r5 = false;
    L30:
        if (r0 == false) goto L34;
        if (r7 == false) goto L34;
        if (r5 == false) goto L34;
        return true;
    L34:
        return false;
    L23:
        if ((this.a instanceof m34) == false) goto L29;
        if ((this.c instanceof m34) == false) goto L29;
        if ((this.d instanceof m34) == false) goto L29;
        r5 = true;
        goto L30
    L15:
        if (this.h.a(r6) != r1) goto L19;
        if (this.g.a(r6) != r1) goto L19;
        r7 = true;
        goto L21
    L5:
        if (this.j.getClass().equals(fz0.class) == false) goto L11;
        if (this.i.getClass().equals(fz0.class) == false) goto L11;
        if (this.k.getClass().equals(fz0.class) == false) goto L11;
        r0 = true;
        goto L12
    }

    public final zc1 g() {
        zc1 r0 = new zc1();
        r0.a = this.a;
        r0.b = this.b;
        r0.c = this.c;
        r0.d = this.d;
        r0.e = this.e;
        r0.f = this.f;
        r0.g = this.g;
        r0.h = this.h;
        r0.i = this.i;
        r0.j = this.j;
        r0.k = this.k;
        r0.l = this.l;
        return r0;
    }
}
