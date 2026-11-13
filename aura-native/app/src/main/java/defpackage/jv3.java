package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.List;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jv3 implements d14 {
    public jv3() {
        super();
    }

    public Object n;
    public Object o;
    public Object p;

    public jv3(List list) {
        this.n = list;
        this.o = new wv4[list.size()];
        this.p = new c6(new ss2(14, this));
    }

    public static jv3 f(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new jv3(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void a(m51 m51Var, sy4 sy4Var) {
        wv4[] wv4VarArr = (wv4[]) this.o;
        for (int i = 0; i < wv4VarArr.length; i++) {
            sy4Var.a();
            sy4Var.b();
            wv4 t = m51Var.t(sy4Var.d, 3);
            tb1 tb1Var = (tb1) ((List) this.n).get(i);
            String str = tb1Var.n;
            rr2.o("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            String str2 = tb1Var.a;
            if (str2 == null) {
                sy4Var.b();
                str2 = sy4Var.e;
            }
            sb1 sb1Var = new sb1();
            sb1Var.a = str2;
            sb1Var.l = lw2.m("video/mp2t");
            sb1Var.m = lw2.m(str);
            sb1Var.e = tb1Var.e;
            sb1Var.d = tb1Var.d;
            sb1Var.J = tb1Var.K;
            sb1Var.p = tb1Var.q;
            f34.l(sb1Var, t);
            wv4VarArr[i] = t;
        }
    }

    public ColorStateList b(int i) {
        int resourceId;
        ColorStateList n;
        TypedArray typedArray = (TypedArray) this.o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (n = ud3.n((Context) this.n, resourceId)) == null) ? typedArray.getColorStateList(i) : n;
    }

    public Drawable c(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : zz1.r((Context) this.n, resourceId);
    }

    public Drawable d(int i) {
        int resourceId;
        Drawable e;
        if (!((TypedArray) this.o).hasValue(i) || (resourceId = ((TypedArray) this.o).getResourceId(i, 0)) == 0) {
            return null;
        }
        fg a = fg.a();
        Context context = (Context) this.n;
        synchronized (a) {
            e = a.a.e(context, resourceId, true);
        }
        return e;
    }

    public Typeface e(int i, int i2, dh dhVar) {
        int resourceId = ((TypedArray) this.o).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.p) == null) {
            this.p = new TypedValue();
        }
        Context context = (Context) this.n;
        TypedValue typedValue = (TypedValue) this.p;
        ThreadLocal threadLocal = g14.a;
        if (context.isRestricted()) {
            return null;
        }
        return g14.a(context, resourceId, typedValue, i2, dhVar, true, false);
    }

    public void g() {
        ((TypedArray) this.o).recycle();
    }

    @Override // defpackage.d14
    public q04 q(q04 q04Var, db3 db3Var) {
        Drawable drawable = (Drawable) q04Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((x7) this.o).q(at.c((zs) this.n, ((BitmapDrawable) drawable).getBitmap()), db3Var);
        }
        if (drawable instanceof vh1) {
            return ((y41) this.p).q(q04Var, db3Var);
        }
        return null;
    }

    public /* synthetic */ jv3(Object obj, Object obj2, Object obj3) {
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }

    public jv3(Context context, TypedArray typedArray) {
        this.n = context;
        this.o = typedArray;
    }

    public jv3(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.n = matcher;
        this.o = new ug2(0, this);
    }
}
