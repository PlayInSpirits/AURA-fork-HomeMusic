package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lq implements Cloneable {
    public yx A;
    public Class B;
    public boolean C;
    public Resources.Theme D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int n;
    public float o;
    public xq0 p;
    public eq3 q;
    public Drawable r;
    public ColorDrawable s;
    public boolean t;
    public int u;
    public int v;
    public f42 w;
    public boolean x;
    public Drawable y;
    public db3 z;

    public lq() {
        this.o = 1.0f;
        this.p = xq0.e;
        this.q = eq3.p;
        this.t = true;
        this.u = -1;
        this.v = -1;
        this.w = a11.b;
        this.z = new db3();
        this.A = new yx(0);
        this.B = Object.class;
        this.G = true;
    }

    public static boolean j(int r0, int r1) {
        if ((r0 & r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public lq A(uw4 r2) {
        return B(r2, true);
    }

    public final lq B(uw4 r3, boolean r4) {
        if (this.E == true) goto L5;
        wv0 r0 = new wv0(r3, r4);
        C(Bitmap.class, r3, r4);
        C(Drawable.class, r0, r4);
        C(BitmapDrawable.class, r0, r4);
        C(vh1.class, new xh1(r3), r4);
        u();
        return this;
    L5:
        return c().B(r3, r4);
    }

    public final lq C(Class r2, uw4 r3, boolean r4) {
        if (this.E == true) goto L5;
        h12.e(r3);
        this.A.put(r2, r3);
        int r5 = this.n;
        this.n = 67584 | r5;
        this.G = false;
        if (r4 == false) goto L9;
        this.n = r5 | 198656;
        this.x = true;
    L9:
        u();
        return this;
    L5:
        return c().C(r2, r3, r4);
    }

    public lq D(uw4... r3) {
        if (r3.length <= 1) goto L7;
        return B(new lz2(r3), true);
    L7:
        if (r3.length == 1) goto L9;
        u();
        return this;
    L9:
        return A(r3[0]);
    }

    public lq E() {
        if (this.E == true) goto L5;
        this.H = true;
        this.n |= 1048576;
        u();
        return this;
    L5:
        return c().E();
    }

    public lq a(lq r4) {
        if (this.E == false) goto L7;
        return c().a(r4);
    L7:
        if (j(r4.n, 2) == false) goto L10;
        this.o = r4.o;
    L10:
        if (j(r4.n, 1048576) == false) goto L13;
        this.H = r4.H;
    L13:
        if (j(r4.n, 4) == false) goto L16;
        this.p = r4.p;
    L16:
        if (j(r4.n, 8) == false) goto L19;
        this.q = r4.q;
    L19:
        if (j(r4.n, 16) == false) goto L22;
        this.r = r4.r;
        this.n &= -33;
    L22:
        if (j(r4.n, 32) == false) goto L25;
        this.r = null;
        this.n &= -17;
    L25:
        if (j(r4.n, 64) == false) goto L28;
        this.s = r4.s;
        this.n &= -129;
    L28:
        if (j(r4.n, 128) == false) goto L31;
        this.s = null;
        this.n &= -65;
    L31:
        if (j(r4.n, 256) == false) goto L34;
        this.t = r4.t;
    L34:
        if (j(r4.n, 512) == false) goto L37;
        this.v = r4.v;
        this.u = r4.u;
    L37:
        if (j(r4.n, 1024) == false) goto L40;
        this.w = r4.w;
    L40:
        if (j(r4.n, 4096) == false) goto L43;
        this.B = r4.B;
    L43:
        if (j(r4.n, 8192) == false) goto L46;
        this.y = r4.y;
        this.n &= -16385;
    L46:
        if (j(r4.n, 16384) == false) goto L49;
        this.y = null;
        this.n &= -8193;
    L49:
        if (j(r4.n, 32768) == false) goto L52;
        this.D = r4.D;
    L52:
        if (j(r4.n, 131072) == false) goto L55;
        this.x = r4.x;
    L55:
        if (j(r4.n, 2048) == false) goto L58;
        this.A.putAll(r4.A);
        this.G = r4.G;
    L58:
        if (j(r4.n, 524288) == false) goto L60;
        this.F = r4.F;
    L60:
        this.n |= r4.n;
        this.z.b.g(r4.z.b);
        u();
        return this;
    }

    public lq b() {
        if (this.C == true) goto L5;
    L9:
        this.E = true;
        return k();
    L5:
        if (this.E == true) goto L9;
        kf2.o("You cannot auto lock an already locked options object, try clone() first");
        return null;
    }

    public lq c() {
        lq r0 = (lq) super.clone();     // Catch: CloneNotSupportedException -> L4
        db3 r1 = new db3();     // Catch: CloneNotSupportedException -> L4
        r0.z = r1;     // Catch: CloneNotSupportedException -> L4
        db3 r2 = this.z;     // Catch: CloneNotSupportedException -> L4
        r1.b.g(r2.b);     // Catch: CloneNotSupportedException -> L4
        yx r3 = new yx(0);     // Catch: CloneNotSupportedException -> L4
        r0.A = r3;     // Catch: CloneNotSupportedException -> L4
        r3.putAll(this.A);     // Catch: CloneNotSupportedException -> L4
        r0.C = false;     // Catch: CloneNotSupportedException -> L4
        r0.E = false;     // Catch: CloneNotSupportedException -> L4
        return r0;
    L4:
        e = move-exception;
        er1.m(e);
        return null;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return c();
    }

    public lq d(Class r2) {
        if (this.E == true) goto L5;
        this.B = r2;
        this.n |= 4096;
        u();
        return this;
    L5:
        return c().d(r2);
    }

    public lq e(xq0 r2) {
        if (this.E == true) goto L5;
        h12.f(r2, "Argument must not be null");
        this.p = r2;
        this.n |= 4;
        u();
        return this;
    L5:
        return c().e(r2);
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof lq) == true) goto L5;
        return false;
    L5:
        return i((lq) r2);
    }

    public lq f(gu0 r2) {
        return v(gu0.g, r2);
    }

    public lq g(Drawable r2) {
        if (this.E == true) goto L5;
        this.r = r2;
        this.n = (this.n | 16) & (-33);
        u();
        return this;
    L5:
        return c().g(r2);
    }

    public lq h(Drawable r2) {
        if (this.E == true) goto L5;
        this.y = r2;
        this.n = (this.n | 8192) & (-16385);
        u();
        return this;
    L5:
        return c().h(r2);
    }

    public int hashCode() {
        int r0 = e35.F(e35.E(0, e35.F(e35.E(0, e35.F(e35.E(0, e35.D(17, this.o)), this.r)), this.s)), this.y);
        int r1 = e35.E(this.t ? 1 : 0, r0);
        int r2 = e35.E(this.u, r1);
        int r3 = e35.E(this.v, r2);
        int r4 = e35.E(0, e35.E(1, e35.E(this.x ? 1 : 0, r3)));
        return e35.F(e35.F(e35.F(e35.F(e35.F(e35.F(e35.F(e35.E(this.F ? 1 : 0, r4), this.p), this.q), this.z), this.A), this.B), this.w), this.D);
    }

    public final boolean i(lq r3) {
        if (Float.compare(r3.o, this.o) == 0) goto L5;
        return false;
    L5:
        if (e35.n(this.r, r3.r) == true) goto L7;
        return false;
    L7:
        if (e35.n(this.s, r3.s) == true) goto L9;
        return false;
    L9:
        if (e35.n(this.y, r3.y) == true) goto L11;
        return false;
    L11:
        if (this.t == r3.t) goto L13;
        return false;
    L13:
        if (this.u == r3.u) goto L15;
        return false;
    L15:
        if (this.v == r3.v) goto L17;
        return false;
    L17:
        if (this.x == r3.x) goto L19;
        return false;
    L19:
        if (this.F == r3.F) goto L21;
        return false;
    L21:
        if (this.p.equals(r3.p) == true) goto L23;
        return false;
    L23:
        if (this.q == r3.q) goto L25;
        return false;
    L25:
        if (this.z.equals(r3.z) == true) goto L27;
        return false;
    L27:
        if (this.A.equals(r3.A) == true) goto L29;
        return false;
    L29:
        if (this.B.equals(r3.B) == true) goto L31;
        return false;
    L31:
        if (this.w.equals(r3.w) == true) goto L33;
        return false;
    L33:
        if (e35.n(this.D, r3.D) == false) goto L52;
        return true;
    L52:
        return false;
    }

    public lq k() {
        this.C = true;
        return this;
    }

    public lq l() {
        if (this.E == true) goto L5;
        this.F = true;
        this.n |= 524288;
        u();
        return this;
    L5:
        return c().l();
    }

    public lq m() {
        return p(gu0.d, new m00());
    }

    public lq n() {
        lq r2 = p(gu0.c, new n00());
        r2.G = true;
        return r2;
    }

    public lq o() {
        lq r2 = p(gu0.b, new k71());
        r2.G = true;
        return r2;
    }

    public final lq p(gu0 r2, bt r3) {
        if (this.E == true) goto L5;
        f(r2);
        return B(r3, false);
    L5:
        return c().p(r2, r3);
    }

    public lq q(int r2, int r3) {
        if (this.E == true) goto L5;
        this.v = r2;
        this.u = r3;
        this.n |= 512;
        u();
        return this;
    L5:
        return c().q(r2, r3);
    }

    public lq r(ColorDrawable r2) {
        if (this.E == true) goto L5;
        this.s = r2;
        this.n = (this.n | 64) & (-129);
        u();
        return this;
    L5:
        return c().r(r2);
    }

    public lq s() {
        if (this.E == true) goto L5;
        this.q = eq3.q;
        this.n |= 8;
        u();
        return this;
    L5:
        return c().s();
    }

    public final lq t(ab3 r2) {
        if (this.E == true) goto L5;
        this.z.b.remove(r2);
        u();
        return this;
    L5:
        return c().t(r2);
    }

    public final void u() {
        if (this.C == true) goto L5;
        return;
    L5:
        kf2.o("You cannot modify locked T, consider clone()");
    }

    public lq v(ab3 r2, Object r3) {
        if (this.E == true) goto L5;
        h12.e(r2);
        h12.e(r3);
        this.z.b.put(r2, r3);
        u();
        return this;
    L5:
        return c().v(r2, r3);
    }

    public lq w(f42 r2) {
        if (this.E == true) goto L5;
        this.w = r2;
        this.n |= 1024;
        u();
        return this;
    L5:
        return c().w(r2);
    }

    public lq x() {
        if (this.E == true) goto L5;
        this.o = 0.1f;
        this.n |= 2;
        u();
        return this;
    L5:
        return c().x();
    }

    public lq y(boolean r3) {
        if (this.E == true) goto L5;
        this.t = !r3;
        this.n |= 256;
        u();
        return this;
    L5:
        return c().y(true);
    }

    public lq z(Resources.Theme r3) {
        if (this.E == true) goto L5;
        this.D = r3;
        int r0 = this.n;
        if (r3 == null) goto L10;
        this.n = r0 | 32768;
        return v(v04.b, r3);
    L10:
        this.n = (-32769) & r0;
        return t(v04.b);
    L5:
        return c().z(r3);
    }
}
