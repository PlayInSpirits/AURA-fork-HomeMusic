package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class fi2 extends Drawable implements lc4 {
    public static final Paint J = null;
    public final Paint A;
    public final Paint B;
    public final yb4 C;
    public final pz1 D;
    public final fo1 E;
    public PorterDuffColorFilter F;
    public PorterDuffColorFilter G;
    public final RectF H;
    public boolean I;
    public ei2 n;
    public final jc4[] o;
    public final jc4[] p;
    public final BitSet q;
    public boolean r;
    public final Matrix s;
    public final Path t;
    public final Path u;
    public final RectF v;
    public final RectF w;
    public final Region x;
    public final Region y;
    public bc4 z;

    static {
        Paint r0 = new Paint(1);
        J = r0;
        r0.setColor(-1);
        r0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public fi2(ei2 r7) {
        int r0 = 4;
        this.o = new jc4[4];
        this.p = new jc4[4];
        this.q = new BitSet(8);
        this.s = new Matrix();
        this.t = new Path();
        this.u = new Path();
        this.v = new RectF();
        this.w = new RectF();
        this.x = new Region();
        this.y = new Region();
        Paint r1 = new Paint(1);
        this.A = r1;
        Paint r3 = new Paint(1);
        this.B = r3;
        this.C = new yb4();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L5;
        fo1 r4 = cc4.a;
    L6:
        this.E = r4;
        this.H = new RectF();
        this.I = true;
        this.n = r7;
        r3.setStyle(Paint.Style.STROKE);
        r1.setStyle(Paint.Style.FILL);
        t();
        s(getState());
        this.D = new pz1(r0, this);
        return;
    L5:
        r4 = new fo1();
        goto L6
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF r8, Path r9) {
        ei2 r0 = this.n;
        bc4 r2 = r0.a;
        float r3 = r0.i;
        pz1 r5 = this.D;
        this.E.d(r2, r3, r8, r5, r9);
        if (this.n.h == 1.0f) goto L5;
        Matrix r10 = this.s;
        r10.reset();
        float r11 = this.n.h;
        r10.setScale(r11, r11, r8.width() / 2.0f, r8.height() / 2.0f);
        r9.transform(r10);
    L5:
        r9.computeBounds(this.H, true);
    }

    public final int c(int r3) {
        ei2 r2 = this.n;
        float r0 = (r2.m + 0.0f) + r2.l;
        nz0 r4 = r2.b;
        if (r4 != null) goto L5;
        return r3;
    L5:
        return r4.b(r3, r0);
    }

    public final void d(Canvas r9) {
        if (this.q.cardinality() <= 0) goto L5;
        Log.w("fi2", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
    L5:
        int r0 = this.n.p;
        Path r1 = this.t;
        yb4 r2 = this.C;
        if (r0 == 0) goto L8;
        r9.drawPath(r1, (Paint) r2.d);
    L8:
        int r3 = 0;
    L10:
        if (r3 >= 4) goto L13;
        jc4 r4 = this.o[r3];
        int r5 = this.n.o;
        Matrix r6 = jc4.b;
        r4.a(r6, r2, r5, r9);
        this.p[r3].a(r6, r2, this.n.o, r9);
        r3 = r3 + 1;
        goto L10
    L13:
        if (this.I == false) goto L17;
        int r7 = (int) (Math.sin(Math.toRadians(0.0d)) * this.n.p);
        int r8 = (int) (Math.cos(Math.toRadians(0.0d)) * this.n.p);
        r9.translate(-r7, -r8);
        r9.drawPath(r1, J);
        r9.translate(r7, r8);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas r19) {
        PorterDuffColorFilter r2 = this.F;
        Paint r3 = this.A;
        r3.setColorFilter(r2);
        int r6 = r3.getAlpha();
        int r4 = this.n.k;
        r3.setAlpha(((r4 + (r4 >>> 7)) * r6) >>> 8);
        PorterDuffColorFilter r5 = this.G;
        Paint r7 = this.B;
        r7.setColorFilter(r5);
        r7.setStrokeWidth(this.n.j);
        int r8 = r7.getAlpha();
        int r9 = this.n.k;
        r7.setAlpha(((r9 + (r9 >>> 7)) * r8) >>> 8);
        boolean r10 = this.r;
        Path r11 = this.t;
        if (r10 == false) goto L28;
        float r12 = 0.0f;
        if (i() == false) goto L7;
        float r13 = r7.getStrokeWidth() / 2.0f;
    L8:
        float r14 = -r13;
        bc4 r15 = this.n.a;
        zc1 r16 = r15.g();
        ke0 r17 = r15.e;
        if ((r17 instanceof oy3) == true) goto L12;
        r17 = new g6(r14, r17);
    L12:
        r16.e = r17;
        ke0 r18 = r15.f;
        if ((r18 instanceof oy3) == true) goto L16;
        r18 = new g6(r14, r18);
    L16:
        r16.f = r18;
        ke0 r110 = r15.h;
        if ((r110 instanceof oy3) == true) goto L20;
        r110 = new g6(r14, r110);
    L20:
        r16.h = r110;
        ke0 r111 = r15.g;
        if ((r111 instanceof oy3) == true) goto L24;
        r111 = new g6(r14, r111);
    L24:
        r16.g = r111;
        bc4 r112 = r16.a();
        this.z = r112;
        float r113 = this.n.i;
        RectF r20 = g();
        RectF r114 = this.w;
        r114.set(r20);
        if (i() == false) goto L27;
        r12 = r7.getStrokeWidth() / 2.0f;
    L27:
        r114.inset(r12, r12);
        this.E.d(r112, r113, r114, null, this.u);
        b(g(), r11);
        this.r = false;
        goto L28
    L7:
        r13 = 0.0f;
    L28:
        ei2 r21 = this.n;
        int r22 = r21.n;
        if (r22 != 1) goto L31;
    L49:
        ei2 r23 = this.n;
        Paint.Style r24 = r23.q;
        if (r24 != Paint.Style.FILL_AND_STROKE) goto L52;
    L53:
        e(r19, r3, r11, r23.a, g());
    L55:
        if (i() == false) goto L57;
        f(r19);
    L57:
        r3.setAlpha(r6);
        r7.setAlpha(r8);
        return;
    L52:
        if (r24 != Paint.Style.FILL) goto L55;
    L31:
        if (r21.o <= 0) goto L49;
        if (r22 != 2) goto L35;
    L40:
        r19.save();
        r19.translate((int) (Math.sin(Math.toRadians(0.0d)) * this.n.p), (int) (Math.cos(Math.toRadians(0.0d)) * this.n.p));
        if (this.I == true) goto L43;
        d(r19);
        r19.restore();
        goto L49
    L43:
        RectF r25 = this.H;
        int r26 = (int) (r25.width() - getBounds().width());
        int r115 = (int) (r25.height() - getBounds().height());
        if (r26 < 0) goto L47;
        if (r115 < 0) goto L47;
        Bitmap r27 = Bitmap.createBitmap(((this.n.o * 2) + ((int) r25.width())) + r26, ((this.n.o * 2) + ((int) r25.height())) + r115, Bitmap.Config.ARGB_8888);
        Canvas r28 = new Canvas(r27);
        float r29 = (getBounds().left - this.n.o) - r26;
        float r116 = (getBounds().top - this.n.o) - r115;
        r28.translate(-r29, -r116);
        d(r28);
        r19.drawBitmap(r27, r29, r116, null);
        r27.recycle();
        r19.restore();
    L47:
        kf2.o("Invalid shadow bounds. Check that the treatments result in a valid path.");
        return;
    L35:
        if (k() == true) goto L49;
        if (r11.isConvex() == true) goto L49;
        if (Build.VERSION.SDK_INT >= 29) goto L49;
        goto L40
    }

    public final void e(Canvas r2, Paint r3, Path r4, bc4 r5, RectF r6) {
        if (r5.f(r6) == false) goto L6;
        float r7 = r5.f.a(r6) * this.n.i;
        r2.drawRoundRect(r6, r7, r7, r3);
        return;
    L6:
        r2.drawPath(r4, r3);
    }

    public void f(Canvas r7) {
        bc4 r4 = this.z;
        RectF r0 = g();
        RectF r5 = this.w;
        r5.set(r0);
        boolean r1 = i();
        Paint r2 = this.B;
        if (r1 == false) goto L5;
        float r3 = r2.getStrokeWidth() / 2.0f;
    L6:
        r5.inset(r3, r3);
        e(r7, r2, this.u, r4, r5);
        return;
    L5:
        r3 = 0.0f;
        goto L6
    }

    public final RectF g() {
        Rect r0 = getBounds();
        RectF r1 = this.v;
        r1.set(r0);
        return r1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.n.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline r3) {
        if (this.n.n != 2) goto L6;
        return;
    L6:
        if (k() == false) goto L9;
        float r0 = h() * this.n.i;
        r3.setRoundRect(getBounds(), r0);
        return;
    L9:
        RectF r1 = g();
        Path r2 = this.t;
        b(r1, r2);
        te5.M(r3, r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect r2) {
        Rect r0 = this.n.g;
        if (r0 == null) goto L7;
        r2.set(r0);
        return true;
    L7:
        return super.getPadding(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect r0 = getBounds();
        Region r1 = this.x;
        r1.set(r0);
        RectF r2 = g();
        Path r3 = this.t;
        b(r2, r3);
        Region r4 = this.y;
        r4.setPath(r3, r1);
        r1.op(r4, Region.Op.DIFFERENCE);
        return r1;
    }

    public final float h() {
        return this.n.a.e.a(g());
    }

    public final boolean i() {
        Paint.Style r0 = this.n.q;
        if (r0 == Paint.Style.FILL_AND_STROKE) goto L7;
        if (r0 == Paint.Style.STROKE) goto L7;
        return false;
    L7:
        if (this.B.getStrokeWidth() <= 0.0f) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.r = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful() == true) goto L19;
        ColorStateList r0 = this.n.e;
        if (r0 != null) goto L7;
    L8:
        this.n.getClass();
        ColorStateList r1 = this.n.d;
        if (r1 != null) goto L11;
    L12:
        ColorStateList r2 = this.n.c;
        if (r2 != null) goto L15;
        return false;
    L15:
        if (r2.isStateful() == true) goto L24;
        return false;
    L24:
        return true;
    L11:
        if (r1.isStateful() == false) goto L12;
        return true;
    L7:
        if (r0.isStateful() == false) goto L8;
        return true;
    L19:
        return true;
    }

    public final void j(Context r3) {
        ei2 r0 = this.n;
        r0.b = new nz0(r3);
        u();
    }

    public final boolean k() {
        return this.n.a.f(g());
    }

    public final void l(float r3) {
        ei2 r0 = this.n;
        if (r0.m == r3) goto L6;
        r0.m = r3;
        u();
        return;
    }

    public final void m(ColorStateList r3) {
        ei2 r0 = this.n;
        if (r0.c == r3) goto L6;
        r0.c = r3;
        onStateChange(getState());
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.n = new ei2(this.n);
        return this;
    }

    public final void n(float r3) {
        ei2 r0 = this.n;
        if (r0.i == r3) goto L6;
        r0.i = r3;
        this.r = true;
        invalidateSelf();
        return;
    }

    public final void o() {
        this.C.t(-12303292);
        this.n.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect r2) {
        this.r = true;
        super.onBoundsChange(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r2) {
        boolean r3 = s(r2);
        boolean r0 = t();
        if (r3 == true) goto L7;
        if (r0 == true) goto L7;
        boolean r4 = false;
    L8:
        if (r4 == false) goto L10;
        invalidateSelf();
    L10:
        return r4;
    L7:
        r4 = true;
        goto L8
    }

    public final void p() {
        ei2 r0 = this.n;
        if (r0.n == 2) goto L6;
        r0.n = 2;
        super.invalidateSelf();
        return;
    }

    public final void q(ColorStateList r3) {
        ei2 r0 = this.n;
        if (r0.d == r3) goto L6;
        r0.d = r3;
        onStateChange(getState());
        return;
    }

    public final void r(float r2) {
        this.n.j = r2;
        invalidateSelf();
    }

    public final boolean s(int[] r5) {
        if (this.n.c == null) goto L7;
        Paint r0 = this.A;
        int r2 = r0.getColor();
        int r3 = this.n.c.getColorForState(r5, r2);
        if (r2 == r3) goto L7;
        r0.setColor(r3);
        boolean r1 = true;
    L9:
        if (this.n.d == null) goto L14;
        Paint r4 = this.B;
        int r6 = r4.getColor();
        int r7 = this.n.d.getColorForState(r5, r6);
        if (r6 == r7) goto L14;
        r4.setColor(r7);
        return true;
    L14:
        return r1;
    L7:
        r1 = false;
        goto L9
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r3) {
        ei2 r0 = this.n;
        if (r0.k == r3) goto L6;
        r0.k = r3;
        super.invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r1) {
        this.n.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.lc4
    public final void setShapeAppearanceModel(bc4 r2) {
        this.n.a = r2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r1) {
        setTintList(ColorStateList.valueOf(r1));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList r2) {
        this.n.e = r2;
        t();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode r3) {
        ei2 r0 = this.n;
        if (r0.f == r3) goto L6;
        r0.f = r3;
        t();
        super.invalidateSelf();
        return;
    }

    public final boolean t() {
        PorterDuffColorFilter r0 = this.F;
        PorterDuffColorFilter r1 = this.G;
        ei2 r2 = this.n;
        ColorStateList r3 = r2.e;
        PorterDuff.Mode r4 = r2.f;
        if (r3 == null) goto L7;
        if (r4 == null) goto L7;
        PorterDuffColorFilter r7 = new PorterDuffColorFilter(c(r3.getColorForState(getState(), 0)), r4);
    L11:
        this.F = r7;
        this.n.getClass();
        this.G = null;
        this.n.getClass();
        if (Objects.equals(r0, this.F) == true) goto L14;
    L17:
        return true;
    L14:
        if (Objects.equals(r1, this.G) == false) goto L17;
        return false;
    L7:
        int r5 = this.A.getColor();
        int r6 = c(r5);
        if (r6 == r5) goto L10;
        r7 = new PorterDuffColorFilter(r6, PorterDuff.Mode.SRC_IN);
        goto L11
    L10:
        r7 = null;
        goto L11
    }

    public final void u() {
        ei2 r0 = this.n;
        float r1 = r0.m + 0.0f;
        r0.o = (int) Math.ceil(0.75f * r1);
        this.n.p = (int) Math.ceil(r1 * 0.25f);
        t();
        super.invalidateSelf();
    }

    public fi2(Context r1, AttributeSet r2, int r3, int r4) {
        this(bc4.c(r1, r2, r3, r4).a());
    }

    public fi2(bc4 r2) {
        this(new ei2(r2));
    }

    public fi2() {
        this(new bc4());
    }
}
