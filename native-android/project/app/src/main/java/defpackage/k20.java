package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k20 extends fi2 implements Drawable.Callback, wr4 {
    public static final int[] S0 = null;
    public static final ShapeDrawable T0 = null;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public boolean E0;
    public int F0;
    public int G0;
    public ColorFilter H0;
    public PorterDuffColorFilter I0;
    public ColorStateList J0;
    public ColorStateList K;
    public PorterDuff.Mode K0;
    public ColorStateList L;
    public int[] L0;
    public float M;
    public ColorStateList M0;
    public float N;
    public WeakReference N0;
    public ColorStateList O;
    public TextUtils.TruncateAt O0;
    public float P;
    public boolean P0;
    public ColorStateList Q;
    public int Q0;
    public CharSequence R;
    public boolean R0;
    public boolean S;
    public Drawable T;
    public ColorStateList U;
    public float V;
    public boolean W;
    public boolean X;
    public Drawable Y;
    public RippleDrawable Z;
    public ColorStateList a0;
    public float b0;
    public SpannableStringBuilder c0;
    public boolean d0;
    public boolean e0;
    public Drawable f0;
    public ColorStateList g0;
    public zx2 h0;
    public zx2 i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public final Context r0;
    public final Paint s0;
    public final Paint.FontMetrics t0;
    public final RectF u0;
    public final PointF v0;
    public final Path w0;
    public final xr4 x0;
    public int y0;
    public int z0;

    static {
        S0 = new int[]{R.attr.state_enabled};
        T0 = new ShapeDrawable(new OvalShape());
    }

    public k20(Context r2, AttributeSet r3, int r4) {
        super(r2, r3, r4, app.homemusic.R.style.Widget_MaterialComponents_Chip_Action);
        this.N = -1.0f;
        this.s0 = new Paint(1);
        this.t0 = new Paint.FontMetrics();
        this.u0 = new RectF();
        this.v0 = new PointF();
        this.w0 = new Path();
        this.G0 = 255;
        this.K0 = PorterDuff.Mode.SRC_IN;
        this.N0 = new WeakReference(null);
        j(r2);
        this.r0 = r2;
        xr4 r5 = new xr4(this);
        this.x0 = r5;
        this.R = "";
        r5.a.density = r2.getResources().getDisplayMetrics().density;
        int[] r6 = S0;
        setState(r6);
        if (Arrays.equals(this.L0, r6) == true) goto L7;
        this.L0 = r6;
        if (a0() == false) goto L7;
        D(getState(), r6);
    L7:
        this.P0 = true;
        int[] r1 = l24.a;
        T0.setTint(-1);
    }

    public static boolean A(ColorStateList r0) {
        if (r0 != null) goto L4;
        return false;
    L4:
        if (r0.isStateful() == false) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean B(Drawable r0) {
        if (r0 != null) goto L4;
        return false;
    L4:
        if (r0.isStateful() == false) goto L9;
        return true;
    L9:
        return false;
    }

    public static void b0(Drawable r1) {
        if (r1 == null) goto L5;
        r1.setCallback(null);
        return;
    }

    public final void C() {
        Chip r1 = (Chip) this.N0.get();
        if (r1 == null) goto L6;
        r1.c(r1.D);
        r1.requestLayout();
        r1.invalidateOutline();
        return;
    }

    public final boolean D(int[] r9, int[] r10) {
        boolean r0 = super.onStateChange(r9);
        ColorStateList r1 = this.K;
        if (r1 == null) goto L5;
        int r2 = r1.getColorForState(r9, this.y0);
    L6:
        int r3 = c(r2);
        boolean r4 = true;
        if (this.y0 == r3) goto L9;
        this.y0 = r3;
        r0 = true;
    L9:
        ColorStateList r5 = this.L;
        if (r5 == null) goto L12;
        int r6 = r5.getColorForState(r9, this.z0);
    L13:
        int r7 = c(r6);
        if (this.z0 == r7) goto L16;
        this.z0 = r7;
        r0 = true;
    L16:
        int r8 = v50.g(r7, r3);
        if (this.A0 == r8) goto L19;
        boolean r11 = true;
    L21:
        if (this.n.c != null) goto L23;
        boolean r12 = true;
    L25:
        if ((r11 | r12) == false) goto L27;
        this.A0 = r8;
        m(ColorStateList.valueOf(r8));
        r0 = true;
    L27:
        ColorStateList r13 = this.O;
        if (r13 == null) goto L30;
        int r14 = r13.getColorForState(r9, this.B0);
    L32:
        if (this.B0 == r14) goto L35;
        this.B0 = r14;
        r0 = true;
    L35:
        if (this.M0 != null) goto L37;
    L39:
        int r15 = 0;
    L41:
        if (this.C0 == r15) goto L43;
        this.C0 = r15;
    L43:
        rr4 r16 = this.x0.g;
        if (r16 == null) goto L48;
        ColorStateList r17 = r16.j;
        if (r17 == null) goto L48;
        int r18 = r17.getColorForState(r9, this.D0);
    L50:
        if (this.D0 == r18) goto L52;
        this.D0 = r18;
        r0 = true;
    L52:
        int[] r19 = getState();
        if (r19 == null) goto L63;
        int r20 = r19.length;
        int r21 = 0;
    L56:
        if (r21 >= r20) goto L63;
        if (r19[r21] == 16842912) goto L60;
        r21 = r21 + 1;
        goto L56
    L60:
        if (this.d0 == false) goto L63;
        boolean r22 = true;
    L65:
        if (this.E0 != r22) goto L67;
    L72:
        boolean r23 = false;
    L73:
        ColorStateList r24 = this.J0;
        if (r24 == null) goto L76;
        int r25 = r24.getColorForState(r9, this.F0);
    L78:
        if (this.F0 == r25) goto L86;
        this.F0 = r25;
        ColorStateList r26 = this.J0;
        PorterDuff.Mode r27 = this.K0;
        if (r26 == null) goto L84;
        if (r27 == null) goto L84;
        PorterDuffColorFilter r28 = new PorterDuffColorFilter(r26.getColorForState(getState(), 0), r27);
    L85:
        this.I0 = r28;
    L88:
        if (B(this.T) == false) goto L91;
        r4 = r4 | this.T.setState(r9);
    L91:
        if (B(this.f0) == false) goto L94;
        r4 = r4 | this.f0.setState(r9);
    L94:
        if (B(this.Y) == false) goto L96;
        int[] r29 = new int[r9.length + r10.length];
        System.arraycopy(r9, 0, r29, 0, r9.length);
        System.arraycopy(r10, 0, r29, r9.length, r10.length);
        r4 = r4 | this.Y.setState(r29);
    L96:
        int[] r30 = l24.a;
        if (B(this.Z) == false) goto L99;
        r4 = r4 | this.Z.setState(r10);
    L99:
        if (r4 == false) goto L101;
        invalidateSelf();
    L101:
        if (r23 == false) goto L103;
        C();
    L103:
        return r4;
    L84:
        r28 = null;
        goto L85
    L86:
        r4 = r0;
        goto L88
    L76:
        r25 = 0;
        goto L78
    L67:
        if (this.f0 == null) goto L72;
        float r31 = x();
        this.E0 = r22;
        if (r31 == x()) goto L71;
        r0 = true;
        r23 = true;
        goto L73
    L71:
        r23 = false;
        r0 = true;
    L63:
        r22 = false;
    L48:
        r18 = 0;
        goto L50
    L37:
        if (l24.d(r9) == false) goto L39;
        r15 = this.M0.getColorForState(r9, this.C0);
        goto L41
    L30:
        r14 = 0;
        goto L32
    L23:
        r12 = false;
        goto L25
    L19:
        r11 = false;
        goto L21
    L12:
        r6 = 0;
        goto L13
    L5:
        r2 = 0;
        goto L6
    }

    public final void E(boolean r2) {
        if (this.d0 == r2) goto L13;
        this.d0 = r2;
        float r0 = x();
        if (r2 == false) goto L7;
    L9:
        float r3 = x();
        invalidateSelf();
        if (r0 == r3) goto L14;
        C();
        return;
    L14:
        return;
    L7:
        if (this.E0 == false) goto L9;
        this.E0 = false;
        goto L9
    }

    public final void F(Drawable r3) {
        if (this.f0 == r3) goto L8;
        float r0 = x();
        this.f0 = r3;
        float r4 = x();
        b0(this.f0);
        v(this.f0);
        invalidateSelf();
        if (r0 == r4) goto L9;
        C();
        return;
    L9:
        return;
    }

    public final void G(ColorStateList r3) {
        if (this.g0 == r3) goto L13;
        this.g0 = r3;
        if (this.e0 == false) goto L11;
        Drawable r0 = this.f0;
        if (r0 == null) goto L11;
        if (this.d0 == false) goto L11;
        r0.setTintList(r3);
    L11:
        onStateChange(getState());
        return;
    }

    public final void H(boolean r2) {
        if (this.e0 == r2) goto L12;
        boolean r0 = Y();
        this.e0 = r2;
        boolean r3 = Y();
        if (r0 == r3) goto L13;
        Drawable r1 = this.f0;
        if (r3 == false) goto L9;
        v(r1);
    L10:
        invalidateSelf();
        C();
        return;
    L9:
        b0(r1);
        goto L10
    L13:
        return;
    }

    public final void I(float r2) {
        if (this.N == r2) goto L6;
        this.N = r2;
        zc1 r0 = this.n.a.g();
        r0.b(r2);
        setShapeAppearanceModel(r0.a());
        return;
    }

    public final void J(Drawable r4) {
        Drawable r0 = this.T;
        Drawable r1 = null;
        if (r0 != null) goto L6;
        r0 = null;
    L6:
        if (r0 == r4) goto L17;
        float r2 = x();
        if (r4 == null) goto L10;
        r1 = r4.mutate();
    L10:
        this.T = r1;
        float r5 = x();
        b0(r0);
        if (Z() == false) goto L13;
        v(this.T);
    L13:
        invalidateSelf();
        if (r2 == r5) goto L18;
        C();
        return;
    L18:
        return;
    }

    public final void K(float r2) {
        if (this.V == r2) goto L8;
        float r0 = x();
        this.V = r2;
        float r3 = x();
        invalidateSelf();
        if (r0 == r3) goto L9;
        C();
        return;
    L9:
        return;
    }

    public final void L(ColorStateList r2) {
        this.W = true;
        if (this.U == r2) goto L9;
        this.U = r2;
        if (Z() == false) goto L7;
        this.T.setTintList(r2);
    L7:
        onStateChange(getState());
        return;
    }

    public final void M(boolean r2) {
        if (this.S == r2) goto L12;
        boolean r0 = Z();
        this.S = r2;
        boolean r3 = Z();
        if (r0 == r3) goto L13;
        Drawable r1 = this.T;
        if (r3 == false) goto L9;
        v(r1);
    L10:
        invalidateSelf();
        C();
        return;
    L9:
        b0(r1);
        goto L10
    L13:
        return;
    }

    public final void N(ColorStateList r2) {
        if (this.O == r2) goto L9;
        this.O = r2;
        if (this.R0 == false) goto L7;
        q(r2);
    L7:
        onStateChange(getState());
        return;
    }

    public final void O(float r2) {
        if (this.P == r2) goto L9;
        this.P = r2;
        this.s0.setStrokeWidth(r2);
        if (this.R0 == false) goto L7;
        r(r2);
    L7:
        invalidateSelf();
        return;
    }

    public final void P(Drawable r6) {
        Drawable r0 = this.Y;
        Drawable r1 = null;
        if (r0 != null) goto L6;
        r0 = null;
    L6:
        if (r0 == r6) goto L17;
        float r2 = y();
        if (r6 == null) goto L10;
        r1 = r6.mutate();
    L10:
        this.Y = r1;
        int[] r7 = l24.a;
        this.Z = new RippleDrawable(l24.c(this.Q), this.Y, T0);
        float r8 = y();
        b0(r0);
        if (a0() == false) goto L13;
        v(this.Y);
    L13:
        invalidateSelf();
        if (r2 == r8) goto L18;
        C();
        return;
    L18:
        return;
    }

    public final void Q(float r2) {
        if (this.p0 == r2) goto L8;
        this.p0 = r2;
        invalidateSelf();
        if (a0() == false) goto L9;
        C();
        return;
    L9:
        return;
    }

    public final void R(float r2) {
        if (this.b0 == r2) goto L8;
        this.b0 = r2;
        invalidateSelf();
        if (a0() == false) goto L9;
        C();
        return;
    L9:
        return;
    }

    public final void S(float r2) {
        if (this.o0 == r2) goto L8;
        this.o0 = r2;
        invalidateSelf();
        if (a0() == false) goto L9;
        C();
        return;
    L9:
        return;
    }

    public final void T(ColorStateList r2) {
        if (this.a0 == r2) goto L9;
        this.a0 = r2;
        if (a0() == false) goto L7;
        this.Y.setTintList(r2);
    L7:
        onStateChange(getState());
        return;
    }

    public final void U(boolean r2) {
        if (this.X == r2) goto L12;
        boolean r0 = a0();
        this.X = r2;
        boolean r3 = a0();
        if (r0 == r3) goto L13;
        Drawable r1 = this.Y;
        if (r3 == false) goto L9;
        v(r1);
    L10:
        invalidateSelf();
        C();
        return;
    L9:
        b0(r1);
        goto L10
    L13:
        return;
    }

    public final void V(float r2) {
        if (this.l0 == r2) goto L8;
        float r0 = x();
        this.l0 = r2;
        float r3 = x();
        invalidateSelf();
        if (r0 == r3) goto L9;
        C();
        return;
    L9:
        return;
    }

    public final void W(float r2) {
        if (this.k0 == r2) goto L8;
        float r0 = x();
        this.k0 = r2;
        float r3 = x();
        invalidateSelf();
        if (r0 == r3) goto L9;
        C();
        return;
    L9:
        return;
    }

    public final void X(ColorStateList r2) {
        if (this.Q == r2) goto L6;
        this.Q = r2;
        this.M0 = null;
        onStateChange(getState());
        return;
    }

    public final boolean Y() {
        if (this.e0 == true) goto L5;
        return false;
    L5:
        if (this.f0 != null) goto L7;
        return false;
    L7:
        if (this.E0 == false) goto L13;
        return true;
    L13:
        return false;
    }

    public final boolean Z() {
        if (this.S == true) goto L5;
        return false;
    L5:
        if (this.T == null) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.fi2, defpackage.wr4
    public final void a() {
        C();
        invalidateSelf();
    }

    public final boolean a0() {
        if (this.X == true) goto L5;
        return false;
    L5:
        if (this.Y == null) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void draw(Canvas r20) {
        Rect r7 = getBounds();
        if (r7.isEmpty() == true) goto L97;
        int r6 = this.G0;
        if (r6 != 0) goto L8;
        return;
    L8:
        if (r6 >= 255) goto L10;
        Canvas r1 = r20;
        int r10 = r1.saveLayerAlpha(r7.left, r7.top, r7.right, r7.bottom, r6);
    L11:
        boolean r2 = this.R0;
        Paint r3 = this.s0;
        RectF r11 = this.u0;
        if (r2 == true) goto L15;
        r3.setColor(this.y0);
        r3.setStyle(Paint.Style.FILL);
        r11.set(r7);
        r1.drawRoundRect(r11, z(), z(), r3);
    L15:
        if (this.R0 == true) goto L22;
        r3.setColor(this.z0);
        r3.setStyle(Paint.Style.FILL);
        ColorFilter r4 = this.H0;
        if (r4 != null) goto L20;
        r4 = this.I0;
    L20:
        r3.setColorFilter(r4);
        r11.set(r7);
        r1.drawRoundRect(r11, z(), z(), r3);
    L22:
        if (this.R0 == false) goto L25;
        super.draw(r20);
    L25:
        if (this.P > 0.0f) goto L27;
    L36:
        r3.setColor(this.C0);
        r3.setStyle(Paint.Style.FILL);
        r11.set(r7);
        if (this.R0 == true) goto L40;
        r1.drawRoundRect(r11, z(), z(), r3);
    L42:
        if (Z() == false) goto L45;
        w(r7, r11);
        float r0 = r11.left;
        float r5 = r11.top;
        r1.translate(r0, r5);
        this.T.setBounds(0, 0, (int) r11.width(), (int) r11.height());
        this.T.draw(r1);
        r1.translate(-r0, -r5);
    L45:
        if (Y() == false) goto L48;
        w(r7, r11);
        float r8 = r11.left;
        float r9 = r11.top;
        r1.translate(r8, r9);
        this.f0.setBounds(0, 0, (int) r11.width(), (int) r11.height());
        this.f0.draw(r1);
        r1.translate(-r8, -r9);
    L48:
        if (this.P0 == false) goto L84;
        if (this.R == null) goto L84;
        PointF r12 = this.v0;
        r12.set(0.0f, 0.0f);
        Paint.Align r13 = Paint.Align.LEFT;
        CharSequence r14 = this.R;
        xr4 r15 = this.x0;
        if (r14 == null) goto L58;
        float r16 = (x() + this.j0) + this.m0;
        if (getLayoutDirection() != 0) goto L56;
        r12.x = r7.left + r16;
    L57:
        float r17 = r7.centerY();
        TextPaint r18 = r15.a;
        Paint.FontMetrics r19 = this.t0;
        r18.getFontMetrics(r19);
        r12.y = r17 - ((r19.descent + r19.ascent) / 2.0f);
        goto L58
    L56:
        r12.x = r7.right - r16;
        r13 = Paint.Align.RIGHT;
    L58:
        r11.setEmpty();
        if (this.R == null) goto L65;
        float r21 = (x() + this.j0) + this.m0;
        float r22 = (y() + this.q0) + this.n0;
        int r23 = getLayoutDirection();
        int r110 = r7.left;
        if (r23 != 0) goto L63;
        r11.left = r110 + r21;
        r11.right = r7.right - r22;
    L64:
        r11.top = r7.top;
        r11.bottom = r7.bottom;
        goto L65
    L63:
        r11.left = r110 + r22;
        r11.right = r7.right - r21;
    L65:
        rr4 r24 = r15.g;
        TextPaint r25 = r15.a;
        if (r24 == null) goto L68;
        r25.drawableState = getState();
        r15.g.e(this.r0, r25, r15.b);
    L68:
        r25.setTextAlign(r13);
        if (Math.round(r15.a(this.R.toString())) <= Math.round(r11.width())) goto L71;
        boolean r111 = true;
    L72:
        if (r111 == false) goto L74;
        int r26 = r1.save();
        r1.clipRect(r11);
        int r112 = r26;
    L75:
        CharSequence r27 = this.R;
        if (r111 == true) goto L78;
    L80:
        r20.drawText(r27, 0, r27.length(), r12.x, r12.y, r25);
        r1 = r20;
        if (r111 == false) goto L84;
        r1.restoreToCount(r112);
        goto L84
    L78:
        if (this.O0 == null) goto L80;
        r27 = TextUtils.ellipsize(r27, r25, r11.width(), this.O0);
        goto L80
    L74:
        r112 = 0;
        goto L75
    L71:
        r111 = false;
    L84:
        if (a0() == false) goto L94;
        r11.setEmpty();
        if (a0() == false) goto L92;
        float r28 = this.q0 + this.p0;
        if (getLayoutDirection() != 0) goto L90;
        float r29 = r7.right - r28;
        r11.right = r29;
        r11.left = r29 - this.b0;
    L91:
        float r30 = r7.exactCenterY();
        float r31 = this.b0;
        float r32 = r30 - (r31 / 2.0f);
        r11.top = r32;
        r11.bottom = r32 + r31;
        goto L92
    L90:
        float r33 = r7.left + r28;
        r11.left = r33;
        r11.right = r33 + this.b0;
    L92:
        float r34 = r11.left;
        float r35 = r11.top;
        r1.translate(r34, r35);
        this.Y.setBounds(0, 0, (int) r11.width(), (int) r11.height());
        int[] r36 = l24.a;
        this.Z.setBounds(this.Y.getBounds());
        this.Z.jumpToCurrentState();
        this.Z.draw(r1);
        r1.translate(-r34, -r35);
    L94:
        if (this.G0 >= 255) goto L98;
        r1.restoreToCount(r10);
        return;
    L98:
        return;
    L40:
        RectF r37 = new RectF(r7);
        ei2 r38 = this.n;
        bc4 r113 = r38.a;
        float r114 = r38.i;
        pz1 r39 = this.D;
        fo1 r115 = this.E;
        Path r40 = this.w0;
        r115.d(r113, r114, r37, r39, r40);
        e(r1, r3, r40, this.n.a, g());
        goto L42
    L27:
        if (this.R0 == true) goto L36;
        r3.setColor(this.B0);
        r3.setStyle(Paint.Style.STROKE);
        if (this.R0 == true) goto L35;
        ColorFilter r41 = this.H0;
        if (r41 != null) goto L34;
        r41 = this.I0;
    L34:
        r3.setColorFilter(r41);
    L35:
        float r42 = r7.left;
        float r43 = this.P / 2.0f;
        r11.set(r42 + r43, r7.top + r43, r7.right - r43, r7.bottom - r43);
        float r44 = this.N - (this.P / 2.0f);
        r1.drawRoundRect(r11, r44, r44, r3);
        goto L36
    L10:
        r1 = r20;
        r10 = 0;
        goto L11
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.G0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.H0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.M;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float r0 = this.j0;
        float r1 = (x() + r0) + this.m0;
        String r2 = this.R.toString();
        float r3 = (this.x0.a(r2) + r1) + this.n0;
        return Math.min(Math.round((y() + r3) + this.q0), this.Q0);
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void getOutline(Outline r9) {
        if (this.R0 == false) goto L6;
        super.getOutline(r9);
        return;
    L6:
        Rect r0 = getBounds();
        if (r0.isEmpty() == true) goto L9;
        r9.setRoundRect(r0, this.N);
        Outline r2 = r9;
    L10:
        r2.setAlpha(this.G0 / 255.0f);
        return;
    L9:
        r2 = r9;
        r2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.M, this.N);
        goto L10
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable r1) {
        Drawable.Callback r2 = getCallback();
        if (r2 == null) goto L6;
        r2.invalidateDrawable(this);
        return;
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (A(this.K) == false) goto L5;
        return true;
    L5:
        if (A(this.L) == false) goto L7;
        return true;
    L7:
        if (A(this.O) == true) goto L34;
        rr4 r0 = this.x0.g;
        if (r0 == null) goto L16;
        ColorStateList r1 = r0.j;
        if (r1 == null) goto L16;
        if (r1.isStateful() == false) goto L16;
        return true;
    L16:
        if (this.e0 == false) goto L23;
        if (this.f0 == null) goto L23;
        if (this.d0 == false) goto L23;
        return true;
    L23:
        if (B(this.T) == false) goto L25;
        return true;
    L25:
        if (B(this.f0) == false) goto L27;
        return true;
    L27:
        if (A(this.J0) == true) goto L39;
        return false;
    L39:
        return true;
    L34:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r3) {
        boolean r0 = super.onLayoutDirectionChanged(r3);
        if (Z() == false) goto L6;
        r0 = r0 | this.T.setLayoutDirection(r3);
    L6:
        if (Y() == false) goto L9;
        r0 = r0 | this.f0.setLayoutDirection(r3);
    L9:
        if (a0() == false) goto L11;
        r0 = r0 | this.Y.setLayoutDirection(r3);
    L11:
        if (r0 == false) goto L15;
        invalidateSelf();
        return true;
    L15:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r3) {
        boolean r0 = super.onLevelChange(r3);
        if (Z() == false) goto L6;
        r0 = r0 | this.T.setLevel(r3);
    L6:
        if (Y() == false) goto L9;
        r0 = r0 | this.f0.setLevel(r3);
    L9:
        if (a0() == false) goto L11;
        r0 = r0 | this.Y.setLevel(r3);
    L11:
        if (r0 == false) goto L13;
        invalidateSelf();
    L13:
        return r0;
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
        if (this.R0 == false) goto L6;
        super.onStateChange(r2);
    L6:
        return D(r2, this.L0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        Drawable.Callback r4 = getCallback();
        if (r4 == null) goto L6;
        r4.scheduleDrawable(this, r2, r3);
        return;
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        if (this.G0 == r2) goto L6;
        this.G0 = r2;
        invalidateSelf();
        return;
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        if (this.H0 == r2) goto L6;
        this.H0 = r2;
        invalidateSelf();
        return;
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        if (this.J0 == r2) goto L6;
        this.J0 = r2;
        onStateChange(getState());
        return;
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r4) {
        if (this.K0 == r4) goto L12;
        this.K0 = r4;
        ColorStateList r0 = this.J0;
        if (r0 == null) goto L9;
        if (r4 == null) goto L9;
        PorterDuffColorFilter r1 = new PorterDuffColorFilter(r0.getColorForState(getState(), 0), r4);
    L10:
        this.I0 = r1;
        invalidateSelf();
        return;
    L9:
        r1 = null;
        goto L10
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r3, boolean r4) {
        boolean r0 = super.setVisible(r3, r4);
        if (Z() == false) goto L6;
        r0 = r0 | this.T.setVisible(r3, r4);
    L6:
        if (Y() == false) goto L9;
        r0 = r0 | this.f0.setVisible(r3, r4);
    L9:
        if (a0() == false) goto L11;
        r0 = r0 | this.Y.setVisible(r3, r4);
    L11:
        if (r0 == false) goto L13;
        invalidateSelf();
    L13:
        return r0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable r1, Runnable r2) {
        Drawable.Callback r3 = getCallback();
        if (r3 == null) goto L6;
        r3.unscheduleDrawable(this, r2);
        return;
    }

    public final void v(Drawable r3) {
        if (r3 == null) goto L21;
        r3.setCallback(this);
        r3.setLayoutDirection(getLayoutDirection());
        r3.setLevel(getLevel());
        r3.setVisible(isVisible(), false);
        if (r3 == this.Y) goto L7;
        Drawable r0 = this.T;
        if (r3 != r0) goto L17;
        if (this.W == false) goto L17;
        r0.setTintList(this.U);
    L17:
        if (r3.isStateful() == false) goto L20;
        r3.setState(getState());
        return;
    L20:
        return;
    L7:
        if (r3.isStateful() == false) goto L9;
        r3.setState(this.L0);
    L9:
        r3.setTintList(this.a0);
        return;
    }

    public final void w(Rect r6, RectF r7) {
        r7.setEmpty();
        if (Z() == false) goto L5;
    L8:
        float r0 = this.j0 + this.k0;
        if (this.E0 == false) goto L11;
        Drawable r1 = this.f0;
    L12:
        float r2 = this.V;
        if (r2 > 0.0f) goto L17;
        if (r1 == null) goto L17;
        r2 = r1.getIntrinsicWidth();
    L17:
        if (getLayoutDirection() != 0) goto L19;
        float r3 = r6.left + r0;
        r7.left = r3;
        r7.right = r3 + r2;
    L21:
        if (this.E0 == false) goto L23;
        Drawable r4 = this.f0;
    L24:
        float r5 = this.V;
        if (r5 > 0.0f) goto L30;
        if (r4 == null) goto L30;
        r5 = (float) Math.ceil(vr1.l(this.r0, 24));
        if (r4.getIntrinsicHeight() > r5) goto L30;
        r5 = r4.getIntrinsicHeight();
    L30:
        float r8 = r6.exactCenterY() - (r5 / 2.0f);
        r7.top = r8;
        r7.bottom = r8 + r5;
        return;
    L23:
        r4 = this.T;
        goto L24
    L19:
        float r9 = r6.right - r0;
        r7.right = r9;
        r7.left = r9 - r2;
        goto L21
    L11:
        r1 = this.T;
        goto L12
    L5:
        if (Y() == true) goto L8;
    }

    public final float x() {
        if (Z() == false) goto L5;
    L8:
        float r0 = this.k0;
        if (this.E0 == false) goto L11;
        Drawable r2 = this.f0;
    L12:
        float r3 = this.V;
        if (r3 > 0.0f) goto L17;
        if (r2 == null) goto L17;
        r3 = r2.getIntrinsicWidth();
    L17:
        return (r3 + r0) + this.l0;
    L11:
        r2 = this.T;
        goto L12
    L5:
        if (Y() == true) goto L8;
        return 0.0f;
    }

    public final float y() {
        if (a0() == true) goto L5;
        return 0.0f;
    L5:
        return (this.o0 + this.b0) + this.p0;
    }

    public final float z() {
        if (this.R0 == false) goto L7;
        return h();
    L7:
        return this.N;
    }
}
