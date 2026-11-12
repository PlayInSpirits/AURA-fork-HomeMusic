package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ei2 extends Drawable.ConstantState {
    public bc4 a;
    public nz0 b;
    public ColorStateList c;
    public ColorStateList d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public Rect g;
    public final float h;
    public float i;
    public float j;
    public int k;
    public float l;
    public float m;
    public int n;
    public int o;
    public int p;
    public final Paint.Style q;

    public ei2(ei2 r3) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = r3.a;
        this.b = r3.b;
        this.j = r3.j;
        this.c = r3.c;
        this.d = r3.d;
        this.f = r3.f;
        this.e = r3.e;
        this.k = r3.k;
        this.h = r3.h;
        this.p = r3.p;
        this.n = r3.n;
        this.i = r3.i;
        this.l = r3.l;
        this.m = r3.m;
        this.o = r3.o;
        this.q = r3.q;
        if (r3.g == null) goto L6;
        this.g = new Rect(r3.g);
        return;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        fi2 r0 = new fi2(this);
        r0.r = true;
        return r0;
    }

    public ei2(bc4 r3) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.h = 1.0f;
        this.i = 1.0f;
        this.k = 255;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = r3;
        this.b = null;
    }
}
