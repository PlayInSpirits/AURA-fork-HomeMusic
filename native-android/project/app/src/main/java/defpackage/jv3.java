package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jv3 implements d14 {
    public Object n;
    public Object o;
    public Object p;

    public jv3(List r3) {
        this.n = r3;
        this.o = new wv4[r3.size()];
        this.p = new c6(new ss2(14, this));
    }

    public static jv3 f(Context r2, AttributeSet r3, int[] r4, int r5) {
        return new jv3(r2, r2.obtainStyledAttributes(r3, r4, r5, 0));
    }

    public void a(m51 r9, sy4 r10) {
        wv4[] r0 = (wv4[]) this.o;
        int r2 = 0;
    L4:
        if (r2 >= r0.length) goto L17;
        r10.a();
        r10.b();
        wv4 r3 = r9.t(r10.d, 3);
        tb1 r4 = (tb1) ((List) this.n).get(r2);
        String r5 = r4.n;
        if ("application/cea-608".equals(r5) == false) goto L8;
    L11:
        boolean r6 = true;
    L12:
        rr2.o(r6, "Invalid closed caption MIME type provided: %s", r5);
        String r7 = r4.a;
        if (r7 != null) goto L16;
        r10.b();
        r7 = r10.e;
    L16:
        sb1 r8 = new sb1();
        r8.a = r7;
        r8.l = lw2.m("video/mp2t");
        r8.m = lw2.m(r5);
        r8.e = r4.e;
        r8.d = r4.d;
        r8.J = r4.K;
        r8.p = r4.q;
        f34.l(r8, r3);
        r0[r2] = r3;
        r2 = r2 + 1;
        goto L4
    L8:
        if ("application/cea-708".equals(r5) == true) goto L11;
        r6 = false;
        goto L12
    }

    public ColorStateList b(int r3) {
        TypedArray r0 = (TypedArray) this.o;
        if (r0.hasValue(r3) == false) goto L10;
        int r1 = r0.getResourceId(r3, 0);
        if (r1 == 0) goto L10;
        ColorStateList r2 = ud3.n((Context) this.n, r1);
        if (r2 == null) goto L10;
        return r2;
    L10:
        return r0.getColorStateList(r3);
    }

    public Drawable c(int r3) {
        TypedArray r0 = (TypedArray) this.o;
        if (r0.hasValue(r3) == false) goto L9;
        int r1 = r0.getResourceId(r3, 0);
        if (r1 == 0) goto L9;
        return zz1.r((Context) this.n, r1);
    L9:
        return r0.getDrawable(r3);
    }

    public Drawable d(int r4) {
        if (((TypedArray) this.o).hasValue(r4) == false) goto L14;
        int r5 = ((TypedArray) this.o).getResourceId(r4, 0);
        if (r5 == 0) goto L18;
        fg r0 = fg.a();
        Context r3 = (Context) this.n;
        monitor-enter(r0);
        Drawable r6 = r0.a.e(r3, r5, true);     // Catch: Throwable -> L11
        monitor-exit(r0);
        return r6;
    L11:
        th = move-exception;
        throw th;
    L18:
        return null;
    L14:
        return null;
    }

    public Typeface e(int r10, int r11, dh r12) {
        int r3 = ((TypedArray) this.o).getResourceId(r10, 0);
        if (r3 != 0) goto L6;
        return null;
    L6:
        if (((TypedValue) this.p) != null) goto L8;
        this.p = new TypedValue();
    L8:
        Context r2 = (Context) this.n;
        TypedValue r4 = (TypedValue) this.p;
        ThreadLocal r9 = g14.a;
        if (r2.isRestricted() == false) goto L13;
        return null;
    L13:
        return g14.a(r2, r3, r4, r11, r12, true, false);
    }

    public void g() {
        ((TypedArray) this.o).recycle();
    }

    @Override // defpackage.d14
    public q04 q(q04 r3, db3 r4) {
        Drawable r0 = (Drawable) r3.get();
        if ((r0 instanceof BitmapDrawable) == false) goto L7;
        x7 r5 = (x7) this.o;
        Bitmap r1 = ((BitmapDrawable) r0).getBitmap();
        return r5.q(at.c((zs) this.n, r1), r4);
    L7:
        if ((r0 instanceof vh1) == true) goto L9;
        return null;
    L9:
        return ((y41) this.p).q(r3, r4);
    }

    public /* synthetic */ jv3(Object r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    public jv3(Context r1, TypedArray r2) {
        this.n = r1;
        this.o = r2;
    }

    public jv3(Matcher r1, CharSequence r2) {
        r2.getClass();
        this.n = r1;
        this.o = new ug2(0, this);
    }
}
