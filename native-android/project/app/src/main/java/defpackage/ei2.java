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

    public ei2(ei2 ei2Var) {
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
        this.a = ei2Var.a;
        this.b = ei2Var.b;
        this.j = ei2Var.j;
        this.c = ei2Var.c;
        this.d = ei2Var.d;
        this.f = ei2Var.f;
        this.e = ei2Var.e;
        this.k = ei2Var.k;
        this.h = ei2Var.h;
        this.p = ei2Var.p;
        this.n = ei2Var.n;
        this.i = ei2Var.i;
        this.l = ei2Var.l;
        this.m = ei2Var.m;
        this.o = ei2Var.o;
        this.q = ei2Var.q;
        if (ei2Var.g != null) {
            this.g = new Rect(ei2Var.g);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        fi2 fi2Var = new fi2(this);
        fi2Var.r = true;
        return fi2Var;
    }

    public ei2(bc4 bc4Var) {
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
        this.a = bc4Var;
        this.b = null;
    }
}
