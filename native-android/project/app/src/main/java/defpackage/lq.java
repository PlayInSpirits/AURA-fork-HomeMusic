package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lq implements Cloneable {
    public boolean C;
    public Resources.Theme D;
    public boolean E;
    public boolean F;
    public boolean H;
    public int n;
    public Drawable r;
    public ColorDrawable s;
    public boolean x;
    public Drawable y;
    public float o = 1.0f;
    public xq0 p = xq0.e;
    public eq3 q = eq3.p;
    public boolean t = true;
    public int u = -1;
    public int v = -1;
    public f42 w = a11.b;
    public db3 z = new db3();
    public yx A = new yx(0);
    public Class B = Object.class;
    public boolean G = true;

    public static boolean j(int i, int i2) {
        return (i & i2) != 0;
    }

    public lq A(uw4 uw4Var) {
        return B(uw4Var, true);
    }

    public final lq B(uw4 uw4Var, boolean z) {
        if (this.E) {
            return clone().B(uw4Var, z);
        }
        wv0 wv0Var = new wv0(uw4Var, z);
        C(Bitmap.class, uw4Var, z);
        C(Drawable.class, wv0Var, z);
        C(BitmapDrawable.class, wv0Var, z);
        C(vh1.class, new xh1(uw4Var), z);
        u();
        return this;
    }

    public final lq C(Class cls, uw4 uw4Var, boolean z) {
        if (this.E) {
            return clone().C(cls, uw4Var, z);
        }
        h12.e(uw4Var);
        this.A.put(cls, uw4Var);
        int i = this.n;
        this.n = 67584 | i;
        this.G = false;
        if (z) {
            this.n = i | 198656;
            this.x = true;
        }
        u();
        return this;
    }

    public lq D(uw4... uw4VarArr) {
        if (uw4VarArr.length > 1) {
            return B(new lz2(uw4VarArr), true);
        }
        if (uw4VarArr.length == 1) {
            return A(uw4VarArr[0]);
        }
        u();
        return this;
    }

    public lq E() {
        if (this.E) {
            return clone().E();
        }
        this.H = true;
        this.n |= 1048576;
        u();
        return this;
    }

    public lq a(lq lqVar) {
        if (this.E) {
            return clone().a(lqVar);
        }
        if (j(lqVar.n, 2)) {
            this.o = lqVar.o;
        }
        if (j(lqVar.n, 1048576)) {
            this.H = lqVar.H;
        }
        if (j(lqVar.n, 4)) {
            this.p = lqVar.p;
        }
        if (j(lqVar.n, 8)) {
            this.q = lqVar.q;
        }
        if (j(lqVar.n, 16)) {
            this.r = lqVar.r;
            this.n &= -33;
        }
        if (j(lqVar.n, 32)) {
            this.r = null;
            this.n &= -17;
        }
        if (j(lqVar.n, 64)) {
            this.s = lqVar.s;
            this.n &= -129;
        }
        if (j(lqVar.n, 128)) {
            this.s = null;
            this.n &= -65;
        }
        if (j(lqVar.n, 256)) {
            this.t = lqVar.t;
        }
        if (j(lqVar.n, 512)) {
            this.v = lqVar.v;
            this.u = lqVar.u;
        }
        if (j(lqVar.n, 1024)) {
            this.w = lqVar.w;
        }
        if (j(lqVar.n, 4096)) {
            this.B = lqVar.B;
        }
        if (j(lqVar.n, 8192)) {
            this.y = lqVar.y;
            this.n &= -16385;
        }
        if (j(lqVar.n, 16384)) {
            this.y = null;
            this.n &= -8193;
        }
        if (j(lqVar.n, 32768)) {
            this.D = lqVar.D;
        }
        if (j(lqVar.n, 131072)) {
            this.x = lqVar.x;
        }
        if (j(lqVar.n, 2048)) {
            this.A.putAll(lqVar.A);
            this.G = lqVar.G;
        }
        if (j(lqVar.n, 524288)) {
            this.F = lqVar.F;
        }
        this.n |= lqVar.n;
        this.z.b.g(lqVar.z.b);
        u();
        return this;
    }

    public lq b() {
        if (!this.C || this.E) {
            this.E = true;
            return k();
        }
        kf2.o("You cannot auto lock an already locked options object, try clone() first");
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public lq clone() {
        try {
            lq lqVar = (lq) super.clone();
            db3 db3Var = new db3();
            lqVar.z = db3Var;
            db3Var.b.g(this.z.b);
            yx yxVar = new yx(0);
            lqVar.A = yxVar;
            yxVar.putAll(this.A);
            lqVar.C = false;
            lqVar.E = false;
            return lqVar;
        } catch (CloneNotSupportedException e) {
            er1.m(e);
            return null;
        }
    }

    public lq d(Class cls) {
        if (this.E) {
            return clone().d(cls);
        }
        this.B = cls;
        this.n |= 4096;
        u();
        return this;
    }

    public lq e(xq0 xq0Var) {
        if (this.E) {
            return clone().e(xq0Var);
        }
        h12.f(xq0Var, "Argument must not be null");
        this.p = xq0Var;
        this.n |= 4;
        u();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof lq) {
            return i((lq) obj);
        }
        return false;
    }

    public lq f(gu0 gu0Var) {
        return v(gu0.g, gu0Var);
    }

    public lq g(Drawable drawable) {
        if (this.E) {
            return clone().g(drawable);
        }
        this.r = drawable;
        this.n = (this.n | 16) & (-33);
        u();
        return this;
    }

    public lq h(Drawable drawable) {
        if (this.E) {
            return clone().h(drawable);
        }
        this.y = drawable;
        this.n = (this.n | 8192) & (-16385);
        u();
        return this;
    }

    public int hashCode() {
        return e35.F(e35.F(e35.F(e35.F(e35.F(e35.F(e35.F(e35.E(this.F ? 1 : 0, e35.E(0, e35.E(1, e35.E(this.x ? 1 : 0, e35.E(this.v, e35.E(this.u, e35.E(this.t ? 1 : 0, e35.F(e35.E(0, e35.F(e35.E(0, e35.F(e35.E(0, e35.D(17, this.o)), this.r)), this.s)), this.y)))))))), this.p), this.q), this.z), this.A), this.B), this.w), this.D);
    }

    public final boolean i(lq lqVar) {
        return Float.compare(lqVar.o, this.o) == 0 && e35.n(this.r, lqVar.r) && e35.n(this.s, lqVar.s) && e35.n(this.y, lqVar.y) && this.t == lqVar.t && this.u == lqVar.u && this.v == lqVar.v && this.x == lqVar.x && this.F == lqVar.F && this.p.equals(lqVar.p) && this.q == lqVar.q && this.z.equals(lqVar.z) && this.A.equals(lqVar.A) && this.B.equals(lqVar.B) && this.w.equals(lqVar.w) && e35.n(this.D, lqVar.D);
    }

    public lq k() {
        this.C = true;
        return this;
    }

    public lq l() {
        if (this.E) {
            return clone().l();
        }
        this.F = true;
        this.n |= 524288;
        u();
        return this;
    }

    public lq m() {
        return p(gu0.d, new m00());
    }

    public lq n() {
        lq lqVarP = p(gu0.c, new n00());
        lqVarP.G = true;
        return lqVarP;
    }

    public lq o() {
        lq lqVarP = p(gu0.b, new k71());
        lqVarP.G = true;
        return lqVarP;
    }

    public final lq p(gu0 gu0Var, bt btVar) {
        if (this.E) {
            return clone().p(gu0Var, btVar);
        }
        f(gu0Var);
        return B(btVar, false);
    }

    public lq q(int i, int i2) {
        if (this.E) {
            return clone().q(i, i2);
        }
        this.v = i;
        this.u = i2;
        this.n |= 512;
        u();
        return this;
    }

    public lq r(ColorDrawable colorDrawable) {
        if (this.E) {
            return clone().r(colorDrawable);
        }
        this.s = colorDrawable;
        this.n = (this.n | 64) & (-129);
        u();
        return this;
    }

    public lq s() {
        if (this.E) {
            return clone().s();
        }
        this.q = eq3.q;
        this.n |= 8;
        u();
        return this;
    }

    public final lq t(ab3 ab3Var) {
        if (this.E) {
            return clone().t(ab3Var);
        }
        this.z.b.remove(ab3Var);
        u();
        return this;
    }

    public final void u() {
        if (this.C) {
            kf2.o("You cannot modify locked T, consider clone()");
        }
    }

    public lq v(ab3 ab3Var, Object obj) {
        if (this.E) {
            return clone().v(ab3Var, obj);
        }
        h12.e(ab3Var);
        h12.e(obj);
        this.z.b.put(ab3Var, obj);
        u();
        return this;
    }

    public lq w(f42 f42Var) {
        if (this.E) {
            return clone().w(f42Var);
        }
        this.w = f42Var;
        this.n |= 1024;
        u();
        return this;
    }

    public lq x() {
        if (this.E) {
            return clone().x();
        }
        this.o = 0.1f;
        this.n |= 2;
        u();
        return this;
    }

    public lq y(boolean z) {
        if (this.E) {
            return clone().y(true);
        }
        this.t = !z;
        this.n |= 256;
        u();
        return this;
    }

    public lq z(Resources.Theme theme) {
        if (this.E) {
            return clone().z(theme);
        }
        this.D = theme;
        int i = this.n;
        if (theme != null) {
            this.n = i | 32768;
            return v(v04.b, theme);
        }
        this.n = (-32769) & i;
        return t(v04.b);
    }
}
