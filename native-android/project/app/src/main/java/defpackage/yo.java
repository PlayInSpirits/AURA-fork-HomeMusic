package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import app.homemusic.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yo extends Drawable implements wr4 {
    public final WeakReference n;
    public final fi2 o;
    public final xr4 p;
    public final Rect q;
    public final ap r;
    public float s;
    public float t;
    public final int u;
    public float v;
    public float w;
    public float x;
    public WeakReference y;
    public WeakReference z;

    public yo(Context r10, zo r11) {
        WeakReference r0 = new WeakReference(r10);
        this.n = r0;
        uc5.h(r10, uc5.h, "Theme.MaterialComponents");
        this.q = new Rect();
        xr4 r1 = new xr4(this);
        this.p = r1;
        Paint.Align r2 = Paint.Align.CENTER;
        TextPaint r3 = r1.a;
        r3.setTextAlign(r2);
        ap r4 = new ap(r10, r11);
        this.r = r4;
        boolean r5 = f();
        zo r6 = r4.b;
        if (r5 == false) goto L5;
        int r7 = r6.t.intValue();
    L7:
        if (f() == false) goto L9;
        int r8 = r6.u.intValue();
    L10:
        fi2 r12 = new fi2(bc4.a(r10, r7, r8).a());
        this.o = r12;
        h();
        Context r13 = (Context) r0.get();
        if (r13 == null) goto L17;
        rr4 r9 = new rr4(r13, r6.q.intValue());
        if (r1.g == r9) goto L17;
        r1.c(r9, r13);
        r3.setColor(r6.p.intValue());
        invalidateSelf();
        j();
        invalidateSelf();
    L17:
        int r14 = r6.y;
        if (r14 == (-2)) goto L20;
        this.u = ((int) Math.pow(10.0d, ((double) r14) - 1.0d)) - 1;
    L21:
        r1.e = true;
        j();
        invalidateSelf();
        r1.e = true;
        h();
        j();
        invalidateSelf();
        r3.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList r15 = ColorStateList.valueOf(r6.o.intValue());
        if (r12.n.c == r15) goto L24;
        r12.m(r15);
        invalidateSelf();
    L24:
        r3.setColor(r6.p.intValue());
        invalidateSelf();
        WeakReference r16 = this.y;
        if (r16 != null) goto L27;
    L33:
        j();
        setVisible(r6.G.booleanValue(), false);
        return;
    L27:
        if (r16.get() == null) goto L33;
        View r17 = (View) this.y.get();
        WeakReference r18 = this.z;
        if (r18 == null) goto L31;
        FrameLayout r19 = (FrameLayout) r18.get();
    L32:
        i(r17, r19);
        goto L33
    L31:
        r19 = null;
        goto L32
    L20:
        this.u = r6.z;
        goto L21
    L9:
        r8 = r6.s.intValue();
        goto L10
    L5:
        r7 = r6.r.intValue();
        goto L7
    }

    @Override // defpackage.wr4
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        ap r0 = this.r;
        zo r1 = r0.b;
        zo r2 = r0.b;
        String r3 = r1.w;
        WeakReference r4 = this.n;
        if (r3 == null) goto L17;
        int r5 = r1.y;
        if (r5 == (-2)) goto L15;
        if (r3 == null) goto L15;
        if (r3.length() <= r5) goto L15;
        Context r6 = (Context) r4.get();
        if (r6 != null) goto L14;
        return "";
    L14:
        return String.format(r6.getString(R.string.m3_exceed_max_badge_text_suffix), new Object[]{r3.substring(0, r5 - 1), "…"});
    L15:
        return r3;
    L17:
        if (g() == false) goto L31;
        int r7 = this.u;
        if (r7 == (-2)) goto L30;
        if (e() <= r7) goto L30;
        Context r8 = (Context) r4.get();
        if (r8 != null) goto L28;
        return "";
    L28:
        return String.format(r2.A, r8.getString(R.string.mtrl_exceed_max_badge_number_suffix), new Object[]{Integer.valueOf(r7), "+"});
    L30:
        return NumberFormat.getInstance(r2.A).format(e());
    L31:
        return null;
    }

    public final CharSequence c() {
        if (isVisible() == false) goto L32;
        ap r0 = this.r;
        zo r1 = r0.b;
        if (r1.w == null) goto L12;
        CharSequence r4 = r1.B;
        if (r4 == null) goto L11;
        return r4;
    L11:
        return r0.b.w;
    L12:
        boolean r2 = g();
        zo r3 = r0.b;
        if (r2 == false) goto L31;
        if (r3.D == 0) goto L28;
        Context r5 = (Context) this.n.get();
        if (r5 == null) goto L33;
        int r6 = this.u;
        if (r6 == (-2)) goto L27;
        if (e() <= r6) goto L27;
        return r5.getString(r3.E, new Object[]{Integer.valueOf(r6)});
    L27:
        return r5.getResources().getQuantityString(r3.D, e(), new Object[]{Integer.valueOf(e())});
    L33:
        return null;
    L28:
        return null;
    L31:
        return r3.C;
    L32:
        return null;
    }

    public final FrameLayout d() {
        WeakReference r0 = this.z;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (FrameLayout) r0.get();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r7) {
        if (getBounds().isEmpty() == false) goto L5;
        return;
    L5:
        if (getAlpha() != 0) goto L7;
        return;
    L7:
        if (isVisible() == false) goto L24;
        this.o.draw(r7);
        if (f() == false) goto L22;
        String r0 = b();
        if (r0 == null) goto L23;
        Rect r1 = new Rect();
        xr4 r2 = this.p;
        r2.a.getTextBounds(r0, 0, r0.length(), r1);
        float r3 = this.t - r1.exactCenterY();
        float r6 = this.s;
        if (r1.bottom > 0) goto L17;
        int r4 = (int) r3;
    L18:
        r7.drawText(r0, r6, r4, r2.a);
        return;
    L17:
        r4 = Math.round(r3);
        goto L18
    L23:
        return;
    L22:
        return;
    }

    public final int e() {
        int r1 = this.r.b.x;
        if (r1 == (-1)) goto L5;
        return r1;
    L5:
        return 0;
    }

    public final boolean f() {
        if (this.r.b.w == null) goto L6;
        return true;
    L6:
        if (g() == false) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean g() {
        zo r1 = this.r.b;
        if (r1.w == null) goto L6;
        return false;
    L6:
        if (r1.x == (-1)) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.r.b.v;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.q.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.q.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context r0 = (Context) this.n.get();
        if (r0 != null) goto L5;
        return;
    L5:
        boolean r1 = f();
        ap r2 = this.r;
        if (r1 == false) goto L8;
        int r3 = r2.b.t.intValue();
    L10:
        if (f() == false) goto L12;
        int r4 = r2.b.u.intValue();
    L13:
        bc4 r5 = bc4.a(r0, r3, r4).a();
        this.o.setShapeAppearanceModel(r5);
        invalidateSelf();
        return;
    L12:
        r4 = r2.b.s.intValue();
        goto L13
    L8:
        r3 = r2.b.r.intValue();
        goto L10
    }

    public final void i(View r2, FrameLayout r3) {
        this.y = new WeakReference(r2);
        this.z = new WeakReference(r3);
        ViewGroup r4 = (ViewGroup) r2.getParent();
        r4.setClipChildren(false);
        r4.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j() {
        WeakReference r0 = this.n;
        Context r1 = (Context) r0.get();
        WeakReference r2 = this.y;
        ViewGroup r3 = null;
        if (r2 == null) goto L5;
        View r4 = (View) r2.get();
    L6:
        if (r1 == null) goto L121;
        if (r4 == null) goto L123;
        Rect r5 = new Rect();
        Rect r6 = this.q;
        r5.set(r6);
        Rect r7 = new Rect();
        r4.getDrawingRect(r7);
        WeakReference r8 = this.z;
        if (r8 == null) goto L12;
        r3 = (ViewGroup) r8.get();
    L12:
        if (r3 == null) goto L15;
        r3.offsetDescendantRectToMyCoords(r4, r7);
    L15:
        boolean r9 = f();
        ap r10 = this.r;
        if (r9 == false) goto L18;
        float r11 = r10.d;
    L19:
        this.v = r11;
        if (r11 == (-1.0f)) goto L23;
        this.w = r11;
        this.x = r11;
    L34:
        if (f() == false) goto L40;
        String r12 = b();
        float r13 = this.w;
        xr4 r14 = this.p;
        this.w = Math.max(r13, (r14.a(r12) / 2.0f) + r10.b.H.intValue());
        float r15 = this.x;
        if (r14.e == false) goto L39;
        r14.b(r12);
    L39:
        float r16 = Math.max(r15, (r14.d / 2.0f) + r10.b.I.intValue());
        this.x = r16;
        this.w = Math.max(this.w, r16);
    L40:
        zo r17 = r10.b;
        zo r18 = r10.b;
        int r19 = r10.k;
        int r110 = r17.K.intValue();
        if (f() == false) goto L45;
        r110 = r17.M.intValue();
        Context r20 = (Context) r0.get();
        if (r20 == null) goto L45;
        r110 = yd.c(r110, yd.b(0.0f, 1.0f, 0.3f, 1.0f, r20.getResources().getConfiguration().fontScale - 1.0f), r110 - r17.P.intValue());
    L45:
        if (r19 != 0) goto L47;
        r110 = r110 - Math.round(this.x);
    L47:
        int r21 = r17.O.intValue() + r110;
        int r111 = r18.F.intValue();
        if (r111 != 8388691) goto L50;
    L52:
        this.t = r7.bottom - r21;
    L54:
        if (f() == false) goto L56;
        int r22 = r17.L.intValue();
    L58:
        if (r19 == 1) goto L60;
    L64:
        int r23 = r17.N.intValue() + r22;
        int r24 = r18.F.intValue();
        if (r24 == 8388659) goto L72;
        if (r24 == 8388691) goto L72;
        WeakHashMap r25 = j65.a;
        if (r4.getLayoutDirection() != 0) goto L70;
        float r26 = (r7.right + this.w) - r23;
    L71:
        this.s = r26;
    L78:
        if (r17.Q.booleanValue() == false) goto L114;
        View r27 = d();
        if (r27 == null) goto L82;
        FrameLayout r28 = d();
        if (r28 != null) goto L88;
    L93:
        float r29 = 0.0f;
        float r30 = 0.0f;
    L94:
        float r31 = (r27.getY() + (this.t - this.x)) + r29;
        float r32 = (r27.getX() + (this.s - this.w)) + r30;
        if ((r27.getParent() instanceof View) == false) goto L97;
        float r33 = ((this.t + this.x) - (((View) r27.getParent()).getHeight() - r27.getY())) + r29;
    L99:
        if ((r27.getParent() instanceof View) == false) goto L101;
        float r34 = ((this.s + this.w) - (((View) r27.getParent()).getWidth() - r27.getX())) + r30;
    L103:
        if (r31 >= 0.0f) goto L106;
        this.t = Math.abs(r31) + this.t;
    L106:
        if (r32 >= 0.0f) goto L109;
        this.s = Math.abs(r32) + this.s;
    L109:
        if (r33 <= 0.0f) goto L112;
        this.t -= Math.abs(r33);
    L112:
        if (r34 <= 0.0f) goto L114;
        this.s -= Math.abs(r34);
        goto L114
    L101:
        r34 = 0.0f;
        goto L103
    L97:
        r33 = 0.0f;
        goto L99
    L88:
        if (r28.getId() != R.id.mtrl_anchor_parent) goto L93;
        if ((r27.getParent() instanceof View) == false) goto L114;
        r29 = r27.getY();
        r30 = r27.getX();
        r27 = (View) r27.getParent();
        goto L94
    L82:
        if ((r4.getParent() instanceof View) == false) goto L114;
        float r35 = r4.getY();
        r30 = r4.getX();
        View r36 = (View) r4.getParent();
        r29 = r35;
        r27 = r36;
    L114:
        float r37 = this.s;
        float r38 = this.t;
        float r39 = this.w;
        float r40 = this.x;
        r6.set((int) (r37 - r39), (int) (r38 - r40), (int) (r37 + r39), (int) (r38 + r40));
        float r41 = this.v;
        fi2 r112 = this.o;
        if (r41 == (-1.0f)) goto L118;
        zc1 r42 = r112.n.a.g();
        r42.b(r41);
        r112.setShapeAppearanceModel(r42.a());
    L118:
        if (r5.equals(r6) == true) goto L122;
        r112.setBounds(r6);
        return;
    L122:
        return;
    L70:
        r26 = (r7.left - this.w) + r23;
    L72:
        WeakHashMap r43 = j65.a;
        if (r4.getLayoutDirection() != 0) goto L75;
        float r44 = (r7.left - this.w) + r23;
    L76:
        this.s = r44;
        goto L78
    L75:
        r44 = (r7.right + this.w) - r23;
        goto L76
    L60:
        if (f() == false) goto L62;
        int r45 = r10.j;
    L63:
        r22 = r22 + r45;
        goto L64
    L62:
        r45 = r10.i;
        goto L63
    L56:
        r22 = r18.J.intValue();
        goto L58
    L50:
        if (r111 == 8388693) goto L52;
        this.t = r7.top + r21;
        goto L54
    L23:
        if (f() == false) goto L26;
        float r46 = r10.g;
    L27:
        this.w = Math.round(r46 / 2.0f);
        if (f() == false) goto L31;
        float r47 = r10.h;
    L32:
        this.x = Math.round(r47 / 2.0f);
        goto L34
    L31:
        r47 = r10.f;
        goto L32
    L26:
        r46 = r10.e;
        goto L27
    L18:
        r11 = r10.c;
        goto L19
    L123:
        return;
    L121:
        return;
    L5:
        r4 = null;
        goto L6
    }

    @Override // android.graphics.drawable.Drawable, defpackage.wr4
    public final boolean onStateChange(int[] r1) {
        return super.onStateChange(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r3) {
        ap r0 = this.r;
        r0.a.v = r3;
        r0.b.v = r3;
        this.p.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r1) {
    }
}
