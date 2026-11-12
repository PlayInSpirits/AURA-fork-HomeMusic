package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k40 {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public zy D;
    public zy E;
    public TextUtils.TruncateAt F;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public boolean J;
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;
    public final ViewGroup a;
    public ColorStateList a0;
    public float b;
    public float b0;
    public boolean c;
    public float c0;
    public float d;
    public float d0;
    public float e;
    public ColorStateList e0;
    public int f;
    public float f0;
    public final Rect g;
    public float g0;
    public final Rect h;
    public float h0;
    public final RectF i;
    public StaticLayout i0;
    public int j;
    public float j0;
    public int k;
    public float k0;
    public float l;
    public float l0;
    public float m;
    public CharSequence m0;
    public ColorStateList n;
    public int n0;
    public ColorStateList o;
    public float o0;
    public int p;
    public float p0;
    public float q;
    public int q0;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public Typeface z;

    public k40(ViewGroup r4) {
        this.j = 16;
        this.k = 16;
        this.l = 15.0f;
        this.m = 15.0f;
        this.F = TextUtils.TruncateAt.END;
        this.J = true;
        this.n0 = 1;
        this.o0 = 0.0f;
        this.p0 = 1.0f;
        this.q0 = 1;
        this.a = r4;
        TextPaint r0 = new TextPaint(129);
        this.T = r0;
        this.U = new TextPaint(r0);
        this.h = new Rect();
        this.g = new Rect();
        this.i = new RectF();
        float r1 = this.d;
        this.e = xa3.a(1.0f, r1, 0.5f, r1);
        h(r4.getContext().getResources().getConfiguration());
    }

    public static int a(int r5, float r6, int r7) {
        float r0 = 1.0f - r6;
        return Color.argb(Math.round((Color.alpha(r7) * r6) + (Color.alpha(r5) * r0)), Math.round((Color.red(r7) * r6) + (Color.red(r5) * r0)), Math.round((Color.green(r7) * r6) + (Color.green(r5) * r0)), Math.round((Color.blue(r7) * r6) + (Color.blue(r5) * r0)));
    }

    public static float g(float r0, float r1, float r2, TimeInterpolator r3) {
        if (r3 == null) goto L5;
        r2 = r3.getInterpolation(r2);
    L5:
        return yd.a(r0, r1, r2);
    }

    public final boolean b(CharSequence r3) {
        WeakHashMap r0 = j65.a;
        boolean r1 = true;
        if (this.a.getLayoutDirection() == 1) goto L7;
        r1 = false;
    L7:
        if (this.J == false) goto L13;
        if (r1 == false) goto L10;
        xk0 r2 = vr4.d;
    L12:
        return r2.j(r3, r3.length());
    L10:
        r2 = vr4.c;
        goto L12
    L13:
        return r1;
    }

    public final void c(float r18, boolean r19) {
        if (this.G == null) goto L105;
        float r2 = this.h.width();
        float r3 = this.g.width();
        if (Math.abs(r18 - 1.0f) >= 1.0E-5f) goto L8;
        float r1 = this.m;
        float r4 = this.f0;
        this.L = 1.0f;
        Typeface r5 = this.w;
    L19:
        TextPaint r8 = this.T;
        if (r2 > 0.0f) goto L22;
        boolean r6 = false;
    L55:
        if (this.H == null) goto L59;
        if (r6 == true) goto L59;
        return;
    L59:
        r8.setTextSize(this.M);
        r8.setTypeface(this.C);
        r8.setLetterSpacing(this.h0);
        boolean r7 = b(this.G);
        this.I = r7;
        int r9 = this.n0;
        if (r9 <= 1) goto L65;
        if (r7 == true) goto L63;
    L66:
        if (r9 != 1) goto L68;
        Layout.Alignment r10 = Layout.Alignment.ALIGN_NORMAL;
    L79:
        CharSequence r11 = this.G;
        int r12 = (int) r2;
        int r13 = r11.length();
        Layout.Alignment r14 = Layout.Alignment.ALIGN_NORMAL;
        TextUtils.TruncateAt r15 = this.F;
        float r16 = this.o0;
        float r17 = this.p0;
        int r110 = this.q0;
        if (r11 != null) goto L82;
        r11 = "";
    L82:
        int r20 = Math.max(0, r12);
        if (r9 != 1) goto L85;
        r11 = TextUtils.ellipsize(r11, r8, r20, r15);
    L85:
        int r21 = Math.min(r11.length(), r13);
        if (r7 == false) goto L89;
        if (r9 != 1) goto L89;
        r10 = Layout.Alignment.ALIGN_OPPOSITE;
    L89:
        StaticLayout.Builder r22 = StaticLayout.Builder.obtain(r11, 0, r21, r8, r20);
        r22.setAlignment(r10);
        r22.setIncludePad(false);
        if (r7 == false) goto L92;
        TextDirectionHeuristic r23 = TextDirectionHeuristics.RTL;
    L93:
        r22.setTextDirection(r23);
        if (r15 == null) goto L96;
        r22.setEllipsize(r15);
    L96:
        r22.setMaxLines(r9);
        if (r16 == 0.0f) goto L99;
    L100:
        r22.setLineSpacing(r16, r17);
    L101:
        if (r9 <= 1) goto L103;
        r22.setHyphenationFrequency(r110);
    L103:
        StaticLayout r24 = r22.build();
        r24.getClass();
        this.i0 = r24;
        this.H = r24.getText();
        return;
    L99:
        if (r17 == 1.0f) goto L101;
    L92:
        r23 = TextDirectionHeuristics.LTR;
        goto L93
    L68:
        int r25 = Gravity.getAbsoluteGravity(this.j, r7 ? 1 : 0) & 7;
        if (r25 == 1) goto L78;
        boolean r26 = this.I;
        if (r25 == 5) goto L75;
        if (r26 == false) goto L74;
        r10 = Layout.Alignment.ALIGN_OPPOSITE;
        goto L79
    L74:
        r10 = Layout.Alignment.ALIGN_NORMAL;
        goto L79
    L75:
        if (r26 == false) goto L77;
        r10 = Layout.Alignment.ALIGN_NORMAL;
        goto L79
    L77:
        r10 = Layout.Alignment.ALIGN_OPPOSITE;
        goto L79
    L78:
        r10 = Layout.Alignment.ALIGN_CENTER;
        goto L79
    L63:
        if (this.c == true) goto L66;
    L65:
        r9 = 1;
        goto L66
    L22:
        if (this.M == r1) goto L24;
        boolean r27 = true;
    L26:
        if (this.h0 == r4) goto L28;
        boolean r111 = true;
    L30:
        if (this.C == r5) goto L32;
        boolean r112 = true;
    L33:
        StaticLayout r113 = this.i0;
        if (r113 != null) goto L36;
    L38:
        boolean r114 = false;
    L39:
        if (r27 == true) goto L47;
        if (r111 == true) goto L47;
        if (r114 == true) goto L47;
        if (r112 == true) goto L47;
        if (this.S == true) goto L47;
        boolean r28 = false;
    L48:
        this.M = r1;
        this.h0 = r4;
        this.C = r5;
        this.S = false;
        if (this.L == 1.0f) goto L51;
        boolean r29 = true;
    L52:
        r8.setLinearText(r29);
        r6 = r28;
        goto L55
    L51:
        r29 = false;
    L47:
        r28 = true;
        goto L48
    L36:
        if (r2 == r113.getWidth()) goto L38;
        r114 = true;
        goto L39
    L32:
        r112 = false;
        goto L33
    L28:
        r111 = false;
        goto L30
    L24:
        r27 = false;
        goto L26
    L8:
        float r30 = this.l;
        float r31 = this.g0;
        Typeface r32 = this.z;
        if (Math.abs(r18 - 0.0f) >= 1.0E-5f) goto L11;
        this.L = 1.0f;
    L12:
        float r33 = this.m / this.l;
        float r34 = r3 * r33;
        if (r19 == false) goto L17;
    L14:
        r2 = r3;
    L15:
        r1 = r30;
        r4 = r31;
        r5 = r32;
        goto L19
    L17:
        if (r34 <= r2) goto L14;
        r2 = Math.min(r2 / r33, r3);
        goto L15
    L11:
        this.L = g(this.l, this.m, r18, this.W) / this.l;
        goto L12
    }

    public final void d(Canvas r14) {
        int r0 = r14.save();
        if (this.H == null) goto L48;
        RectF r1 = this.i;
        if (r1.width() > 0.0f) goto L7;
        return;
    L7:
        if (r1.height() <= 0.0f) goto L50;
        float r2 = this.M;
        TextPaint r8 = this.T;
        r8.setTextSize(r2);
        float r3 = this.u;
        float r4 = this.v;
        float r5 = this.L;
        if (r5 == 1.0f) goto L14;
        if (this.c == true) goto L14;
        r14.scale(r5, r5, r3, r4);
    L14:
        if (this.n0 > 1) goto L16;
    L45:
        r14.translate(r3, r4);
        this.i0.draw(r14);
    L46:
        r14.restoreToCount(r0);
        return;
    L16:
        if (this.I == false) goto L20;
        if (this.c == false) goto L45;
    L20:
        if (this.c == true) goto L22;
    L23:
        float r6 = this.u - this.i0.getLineStart(0);
        int r11 = r8.getAlpha();
        r14.translate(r6, r4);
        if (this.c == true) goto L30;
        r8.setAlpha((int) (this.l0 * r11));
        if (Build.VERSION.SDK_INT < 31) goto L28;
        r8.setShadowLayer(this.N, this.O, this.P, g12.l(this.Q, r8.getAlpha()));
    L28:
        this.i0.draw(r14);
    L30:
        if (this.c == true) goto L32;
        r8.setAlpha((int) (this.k0 * r11));
    L32:
        int r7 = Build.VERSION.SDK_INT;
        if (r7 < 31) goto L35;
        r8.setShadowLayer(this.N, this.O, this.P, g12.l(this.Q, r8.getAlpha()));
    L35:
        int r9 = this.i0.getLineBaseline(0);
        CharSequence r10 = this.m0;
        float r12 = r9;
        r14.drawText(r10, 0, r10.length(), 0.0f, r12, r8);
        if (r7 < 31) goto L39;
        r8.setShadowLayer(this.N, this.O, this.P, this.Q);
    L39:
        if (this.c == true) goto L44;
        String r15 = this.m0.toString().trim();
        if (r15.endsWith("…") == false) goto L43;
        r15 = r15.substring(0, r15.length() - 1);
    L43:
        String r13 = r15;
        r8.setAlpha(r11);
        r14.drawText(r13, 0, Math.min(this.i0.getLineEnd(0), r13.length()), 0.0f, r12, r8);
    L44:
        r14 = r14;
        goto L46
    L22:
        if (this.b <= this.e) goto L45;
    L50:
        return;
    }

    public final float e() {
        float r0 = this.m;
        TextPaint r1 = this.U;
        r1.setTextSize(r0);
        r1.setTypeface(this.w);
        r1.setLetterSpacing(this.f0);
        return -r1.ascent();
    }

    public final int f(ColorStateList r2) {
        if (r2 != null) goto L5;
        return 0;
    L5:
        int[] r1 = this.R;
        if (r1 == null) goto L10;
        return r2.getColorForState(r1, 0);
    L10:
        return r2.getDefaultColor();
    }

    public final void h(Configuration r3) {
        if (Build.VERSION.SDK_INT < 31) goto L20;
        Typeface r0 = this.y;
        if (r0 == null) goto L7;
        this.x = zz1.v(r3, r0);
    L7:
        Typeface r1 = this.B;
        if (r1 == null) goto L10;
        this.A = zz1.v(r3, r1);
    L10:
        Typeface r4 = this.x;
        if (r4 != null) goto L14;
        r4 = this.y;
    L14:
        this.w = r4;
        Typeface r5 = this.A;
        if (r5 != null) goto L18;
        r5 = this.B;
    L18:
        this.z = r5;
        i(true);
        return;
    }

    public final void i(boolean r19) {
        ViewGroup r2 = this.a;
        if (r2.getHeight() > 0) goto L5;
    L6:
        if (r19 == false) goto L91;
    L7:
        c(1.0f, r19);
        CharSequence r4 = this.H;
        TextPaint r5 = this.T;
        if (r4 == null) goto L12;
        StaticLayout r6 = this.i0;
        if (r6 == null) goto L12;
        this.m0 = TextUtils.ellipsize(r4, r5, r6.getWidth(), this.F);
    L12:
        CharSequence r7 = this.m0;
        if (r7 == null) goto L15;
        this.j0 = r5.measureText(r7, 0, r7.length());
    L16:
        int r8 = Gravity.getAbsoluteGravity(this.k, this.I ? 1 : 0);
        int r9 = r8 & 112;
        Rect r10 = this.h;
        if (r9 == 48) goto L21;
        if (r9 == 80) goto L20;
        this.r = r10.centerY() - ((r5.descent() - r5.ascent()) / 2.0f);
    L22:
        int r11 = r8 & 8388615;
        if (r11 == 1) goto L27;
        if (r11 == 5) goto L26;
        this.t = r10.left;
    L28:
        c(0.0f, r19);
        StaticLayout r1 = this.i0;
        if (r1 == null) goto L31;
        float r3 = r1.getHeight();
    L32:
        StaticLayout r12 = this.i0;
        if (r12 != null) goto L35;
    L37:
        CharSequence r13 = this.H;
        if (r13 == null) goto L40;
        float r14 = r5.measureText(r13, 0, r13.length());
    L41:
        StaticLayout r15 = this.i0;
        if (r15 == null) goto L44;
        int r16 = r15.getLineCount();
    L45:
        this.p = r16;
        int r17 = Gravity.getAbsoluteGravity(this.j, this.I ? 1 : 0);
        int r18 = r17 & 112;
        Rect r110 = this.g;
        if (r18 == 48) goto L50;
        if (r18 == 80) goto L49;
        this.q = r110.centerY() - (r3 / 2.0f);
    L51:
        int r20 = r17 & 8388615;
        if (r20 == 1) goto L56;
        if (r20 == 5) goto L55;
        this.s = r110.left;
    L57:
        Bitmap r21 = this.K;
        if (r21 == null) goto L60;
        r21.recycle();
        this.K = null;
    L60:
        q(this.b);
        float r22 = this.b;
        boolean r23 = this.c;
        RectF r24 = this.i;
        if (r23 == true) goto L63;
        r24.left = g(r110.left, r10.left, r22, this.V);
        r24.top = g(this.q, this.r, r22, this.V);
        r24.right = g(r110.right, r10.right, r22, this.V);
        r24.bottom = g(r110.bottom, r10.bottom, r22, this.V);
    L68:
        if (this.c == true) goto L70;
        this.u = g(this.s, this.t, r22, this.V);
        this.v = g(this.q, this.r, r22, this.V);
        q(r22);
        float r25 = r22;
    L74:
        a61 r26 = yd.b;
        this.k0 = 1.0f - g(0.0f, 1.0f, 1.0f - r22, r26);
        WeakHashMap r27 = j65.a;
        r2.postInvalidateOnAnimation();
        this.l0 = g(1.0f, 0.0f, r22, r26);
        r2.postInvalidateOnAnimation();
        ColorStateList r28 = this.o;
        ColorStateList r29 = this.n;
        if (r28 == r29) goto L77;
        r5.setColor(a(f(r29), r25, f(this.o)));
    L78:
        float r30 = this.f0;
        float r31 = this.g0;
        if (r30 == r31) goto L81;
        r5.setLetterSpacing(g(r31, r30, r22, r26));
    L82:
        this.N = yd.a(this.b0, this.X, r22);
        this.O = yd.a(this.c0, this.Y, r22);
        this.P = yd.a(this.d0, this.Z, r22);
        int r32 = a(f(this.e0), r22, f(this.a0));
        this.Q = r32;
        r5.setShadowLayer(this.N, this.O, this.P, r32);
        if (this.c == false) goto L89;
        int r33 = r5.getAlpha();
        float r34 = this.e;
        if (r22 > r34) goto L87;
        float r0 = yd.b(1.0f, 0.0f, this.d, r34, r22);
    L88:
        r5.setAlpha((int) (r0 * r33));
        goto L89
    L87:
        r0 = yd.b(0.0f, 1.0f, r34, 1.0f, r22);
    L89:
        r2.postInvalidateOnAnimation();
        return;
    L81:
        r5.setLetterSpacing(r30);
        goto L82
    L77:
        r5.setColor(f(r28));
        goto L78
    L70:
        if (r22 >= this.e) goto L72;
        this.u = this.s;
        this.v = this.q;
        q(0.0f);
        r25 = 0.0f;
        goto L74
    L72:
        this.u = this.t;
        this.v = this.r - Math.max(0, this.f);
        q(1.0f);
        r25 = 1.0f;
        goto L74
    L63:
        if (r22 >= this.e) goto L65;
        r10 = r110;
    L65:
        r24.set(r10);
        goto L68
    L55:
        this.s = r110.right - r14;
        goto L57
    L56:
        this.s = r110.centerX() - (r14 / 2.0f);
        goto L57
    L49:
        this.q = r5.descent() + (r110.bottom - r3);
        goto L51
    L50:
        this.q = r110.top;
        goto L51
    L44:
        r16 = 0;
        goto L45
    L40:
        r14 = 0.0f;
        goto L41
    L35:
        if (this.n0 <= 1) goto L37;
        r14 = r12.getWidth();
        goto L41
    L31:
        r3 = 0.0f;
        goto L32
    L26:
        this.t = r10.right - this.j0;
        goto L28
    L27:
        this.t = r10.centerX() - (this.j0 / 2.0f);
        goto L28
    L20:
        this.r = r5.ascent() + r10.bottom;
        goto L22
    L21:
        this.r = r10.top;
        goto L22
    L15:
        this.j0 = 0.0f;
        goto L16
    L91:
        return;
    L5:
        if (r2.getWidth() > 0) goto L7;
        goto L6
    }

    public final void j(ColorStateList r2) {
        if (this.o == r2) goto L5;
    L8:
        this.o = r2;
        this.n = r2;
        i(false);
        return;
    L5:
        if (this.n != r2) goto L8;
    }

    public final void k(int r5) {
        ViewGroup r1 = this.a;
        rr4 r0 = new rr4(r1.getContext(), r5);
        ColorStateList r6 = r0.j;
        if (r6 == null) goto L5;
        this.o = r6;
    L5:
        float r7 = r0.k;
        if (r7 == 0.0f) goto L8;
        this.m = r7;
    L8:
        ColorStateList r8 = r0.a;
        if (r8 == null) goto L11;
        this.a0 = r8;
    L11:
        this.Y = r0.e;
        this.Z = r0.f;
        this.X = r0.g;
        this.f0 = r0.i;
        zy r9 = this.E;
        if (r9 == null) goto L14;
        r9.g = true;
    L14:
        zg5 r2 = new zg5(this);
        r0.a();
        this.E = new zy(r2, r0.n);
        r0.c(r1.getContext(), this.E);
        i(false);
    }

    public final void l(int r2) {
        if (this.k == r2) goto L6;
        this.k = r2;
        i(false);
        return;
    }

    public final boolean m(Typeface r3) {
        zy r0 = this.E;
        if (r0 == null) goto L6;
        r0.g = true;
    L6:
        if (this.y == r3) goto L12;
        this.y = r3;
        Typeface r4 = zz1.v(this.a.getContext().getResources().getConfiguration(), r3);
        this.x = r4;
        if (r4 != null) goto L10;
        r4 = this.y;
    L10:
        this.w = r4;
        return true;
    L12:
        return false;
    }

    public final void n(int r5) {
        ViewGroup r1 = this.a;
        rr4 r0 = new rr4(r1.getContext(), r5);
        ColorStateList r6 = r0.j;
        if (r6 == null) goto L5;
        this.n = r6;
    L5:
        float r7 = r0.k;
        if (r7 == 0.0f) goto L8;
        this.l = r7;
    L8:
        ColorStateList r8 = r0.a;
        if (r8 == null) goto L11;
        this.e0 = r8;
    L11:
        this.c0 = r0.e;
        this.d0 = r0.f;
        this.b0 = r0.g;
        this.g0 = r0.i;
        zy r9 = this.D;
        if (r9 == null) goto L14;
        r9.g = true;
    L14:
        d34 r2 = new d34(15, this);
        r0.a();
        this.D = new zy(r2, r0.n);
        r0.c(r1.getContext(), this.D);
        i(false);
    }

    public final boolean o(Typeface r3) {
        zy r0 = this.D;
        if (r0 == null) goto L6;
        r0.g = true;
    L6:
        if (this.B == r3) goto L12;
        this.B = r3;
        Typeface r4 = zz1.v(this.a.getContext().getResources().getConfiguration(), r3);
        this.A = r4;
        if (r4 != null) goto L10;
        r4 = this.B;
    L10:
        this.z = r4;
        return true;
    L12:
        return false;
    }

    public final void p(float r9) {
        float r10 = su3.k(r9, 0.0f, 1.0f);
        if (r10 == this.b) goto L35;
        this.b = r10;
        boolean r2 = this.c;
        Rect r3 = this.h;
        Rect r4 = this.g;
        RectF r5 = this.i;
        if (r2 == true) goto L7;
        r5.left = g(r4.left, r3.left, r10, this.V);
        r5.top = g(this.q, this.r, r10, this.V);
        r5.right = g(r4.right, r3.right, r10, this.V);
        r5.bottom = g(r4.bottom, r3.bottom, r10, this.V);
    L12:
        if (this.c == true) goto L14;
        this.u = g(this.s, this.t, r10, this.V);
        this.v = g(this.q, this.r, r10, this.V);
        q(r10);
        float r6 = r10;
    L18:
        a61 r7 = yd.b;
        this.k0 = 1.0f - g(0.0f, 1.0f, 1.0f - r10, r7);
        WeakHashMap r8 = j65.a;
        ViewGroup r11 = this.a;
        r11.postInvalidateOnAnimation();
        this.l0 = g(1.0f, 0.0f, r10, r7);
        r11.postInvalidateOnAnimation();
        ColorStateList r12 = this.o;
        ColorStateList r13 = this.n;
        TextPaint r14 = this.T;
        if (r12 == r13) goto L21;
        r14.setColor(a(f(r13), r6, f(this.o)));
    L22:
        float r15 = this.f0;
        float r16 = this.g0;
        if (r15 == r16) goto L25;
        r14.setLetterSpacing(g(r16, r15, r10, r7));
    L26:
        this.N = yd.a(this.b0, this.X, r10);
        this.O = yd.a(this.c0, this.Y, r10);
        this.P = yd.a(this.d0, this.Z, r10);
        int r17 = a(f(this.e0), r10, f(this.a0));
        this.Q = r17;
        r14.setShadowLayer(this.N, this.O, this.P, r17);
        if (this.c == false) goto L33;
        int r18 = r14.getAlpha();
        float r19 = this.e;
        if (r10 > r19) goto L31;
        float r20 = yd.b(1.0f, 0.0f, this.d, r19, r10);
    L32:
        r14.setAlpha((int) (r20 * r18));
        goto L33
    L31:
        r20 = yd.b(0.0f, 1.0f, r19, 1.0f, r10);
    L33:
        r11.postInvalidateOnAnimation();
        return;
    L25:
        r14.setLetterSpacing(r15);
        goto L26
    L21:
        r14.setColor(f(r12));
        goto L22
    L14:
        if (r10 >= this.e) goto L16;
        this.u = this.s;
        this.v = this.q;
        q(0.0f);
        r6 = 0.0f;
        goto L18
    L16:
        this.u = this.t;
        this.v = this.r - Math.max(0, this.f);
        q(1.0f);
        r6 = 1.0f;
        goto L18
    L7:
        if (r10 >= this.e) goto L9;
        r3 = r4;
    L9:
        r5.set(r3);
        goto L12
    }

    public final void q(float r2) {
        c(r2, false);
        WeakHashMap r3 = j65.a;
        this.a.postInvalidateOnAnimation();
    }
}
