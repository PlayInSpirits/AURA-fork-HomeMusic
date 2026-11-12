package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z35 extends q35 {
    public static final PorterDuff.Mode w = null;
    public x35 o;
    public PorterDuffColorFilter p;
    public ColorFilter q;
    public boolean r;
    public boolean s;
    public final float[] t;
    public final Matrix u;
    public final Rect v;

    static {
        w = PorterDuff.Mode.SRC_IN;
    }

    public z35() {
        this.s = true;
        this.t = new float[9];
        this.u = new Matrix();
        this.v = new Rect();
        x35 r0 = new x35();
        r0.c = null;
        r0.d = w;
        r0.b = new w35();
        this.o = r0;
    }

    public final PorterDuffColorFilter a(ColorStateList r2, PorterDuff.Mode r3) {
        if (r2 == null) goto L7;
        if (r3 != null) goto L6;
        return null;
    L6:
        return new PorterDuffColorFilter(r2.getColorForState(getState(), 0), r3);
    L7:
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        r0.canApplyTheme();
        return false;
    L7:
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r19) {
        Drawable r2 = this.n;
        if (r2 == null) goto L6;
        r2.draw(r19);
        return;
    L6:
        Rect r3 = this.v;
        copyBounds(r3);
        if (r3.width() > 0) goto L9;
        return;
    L9:
        if (r3.height() <= 0) goto L64;
        ColorFilter r4 = this.q;
        if (r4 != null) goto L14;
        r4 = this.p;
    L14:
        Matrix r5 = this.u;
        r19.getMatrix(r5);
        float[] r6 = this.t;
        r5.getValues(r6);
        float r7 = Math.abs(r6[0]);
        float r8 = Math.abs(r6[4]);
        float r9 = Math.abs(r6[1]);
        float r10 = Math.abs(r6[3]);
        if (r9 == 0.0f) goto L17;
    L18:
        r7 = 1.0f;
        r8 = 1.0f;
    L19:
        int r11 = (int) (r3.width() * r7);
        int r12 = (int) (r3.height() * r8);
        int r13 = Math.min(2048, r11);
        int r14 = Math.min(2048, r12);
        if (r13 <= 0) goto L63;
        if (r14 <= 0) goto L65;
        int r15 = r19.save();
        r19.translate(r3.left, r3.top);
        if (isAutoMirrored() == true) goto L26;
    L28:
        r3.offsetTo(0, 0);
        x35 r16 = this.o;
        Bitmap r17 = r16.f;
        if (r17 != null) goto L31;
    L35:
        r16.f = Bitmap.createBitmap(r13, r14, Bitmap.Config.ARGB_8888);
        r16.k = true;
    L36:
        boolean r18 = this.s;
        x35 r110 = this.o;
        if (r18 == true) goto L40;
        r110.f.eraseColor(0);
        Canvas r111 = new Canvas(r110.f);
        w35 r112 = r110.b;
        r112.a(r112.g, w35.p, r111, r13, r14);
    L51:
        x35 r0 = this.o;
        if (r0.b.getRootAlpha() < 255) goto L57;
        if (r4 != null) goto L57;
        Paint r20 = null;
    L60:
        r19.drawBitmap(r0.f, null, r3, r20);
        r19.restoreToCount(r15);
        return;
    L57:
        if (r0.l != null) goto L59;
        Paint r21 = new Paint();
        r0.l = r21;
        r21.setFilterBitmap(true);
    L59:
        r0.l.setAlpha(r0.b.getRootAlpha());
        r0.l.setColorFilter(r4);
        r20 = r0.l;
        goto L60
    L40:
        if (r110.k == false) goto L42;
    L50:
        x35 r22 = this.o;
        r22.f.eraseColor(0);
        Canvas r113 = new Canvas(r22.f);
        w35 r114 = r22.b;
        r114.a(r114.g, w35.p, r113, r13, r14);
        x35 r23 = this.o;
        r23.g = r23.c;
        r23.h = r23.d;
        r23.i = r23.b.getRootAlpha();
        r23.j = r23.e;
        r23.k = false;
        goto L51
    L42:
        if (r110.g != r110.c) goto L50;
        if (r110.h != r110.d) goto L50;
        if (r110.j != r110.e) goto L50;
        if (r110.i != r110.b.getRootAlpha()) goto L50;
    L31:
        if (r13 != r17.getWidth()) goto L35;
        if (r14 != r16.f.getHeight()) goto L35;
    L26:
        if (getLayoutDirection() != 1) goto L28;
        r19.translate(r3.width(), 0.0f);
        r19.scale(-1.0f, 1.0f);
        goto L28
    L65:
        return;
    L63:
        return;
    L17:
        if (r10 == 0.0f) goto L19;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.getAlpha();
    L7:
        return this.o.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable r0 = this.n;
        if (r0 != null) goto L5;
        int r1 = super.getChangingConfigurations();
        return this.o.getChangingConfigurations() | r1;
    L5:
        return r0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.getColorFilter();
    L7:
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.n != null) goto L5;
        x35 r0 = this.o;
        r0.a = getChangingConfigurations();
        return this.o;
    L5:
        return new y35(this.n.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.getIntrinsicHeight();
    L7:
        return (int) this.o.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.getIntrinsicWidth();
    L7:
        return (int) this.o.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable r0 = this.n;
        if (r0 != null) goto L5;
        return -3;
    L5:
        return r0.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r26, XmlPullParser r27, AttributeSet r28, Resources.Theme r29) {
        Drawable r5 = this.n;
        if (r5 == null) goto L6;
        r5.inflate(r26, r27, r28, r29);
        return;
    L6:
        x35 r6 = this.o;
        r6.b = new w35();
        TypedArray r7 = gi1.O(r26, r29, r28, fh0.a);
        x35 r8 = this.o;
        w35 r9 = r8.b;
        if (gi1.u(r27, "tintMode") == true) goto L9;
        int r10 = -1;
    L10:
        PorterDuff.Mode r12 = PorterDuff.Mode.SRC_IN;
        int r14 = 3;
        if (r10 == 3) goto L20;
        if (r10 == 5) goto L21;
        if (r10 == 9) goto L19;
        switch(r10) {
            case 14: goto L18;
            case 15: goto L17;
            case 16: goto L16;
            default: goto L21;
        };
    L16:
        r12 = PorterDuff.Mode.ADD;
        goto L21
    L17:
        r12 = PorterDuff.Mode.SCREEN;
        goto L21
    L18:
        r12 = PorterDuff.Mode.MULTIPLY;
        goto L21
    L19:
        r12 = PorterDuff.Mode.SRC_ATOP;
    L21:
        r8.d = r12;
        ColorStateList r11 = gi1.r(r7, r27, r29);
        if (r11 == null) goto L24;
        r8.c = r11;
    L24:
        boolean r13 = r8.e;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") == null) goto L27;
        r13 = r7.getBoolean(5, r13);
    L27:
        r8.e = r13;
        float r15 = r9.j;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") == null) goto L30;
        r15 = r7.getFloat(7, r15);
    L30:
        r9.j = r15;
        float r16 = r9.k;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") == null) goto L33;
        r16 = r7.getFloat(8, r16);
    L33:
        r9.k = r16;
        if (r9.j <= 0.0f) goto L188;
        if (r16 <= 0.0f) goto L186;
        r9.h = r7.getDimension(3, r9.h);
        int r17 = 2;
        float r18 = r7.getDimension(2, r9.i);
        r9.i = r18;
        if (r9.h <= 0.0f) goto L184;
        if (r18 <= 0.0f) goto L182;
        float r19 = r9.getAlpha();
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") == null) goto L44;
        r19 = r7.getFloat(4, r19);
    L44:
        r9.setAlpha(r19);
        String r110 = r7.getString(0);
        if (r110 == null) goto L47;
        r9.m = r110;
        r9.o.put(r110, r9);
    L47:
        r7.recycle();
        r6.a = getChangingConfigurations();
        int r20 = 1;
        r6.k = true;
        x35 r21 = this.o;
        w35 r111 = r21.b;
        ArrayDeque r112 = new ArrayDeque();
        t35 r113 = r111.g;
        oi r114 = r111.o;
        r112.push(r113);
        int r115 = r27.getEventType();
        int r22 = r27.getDepth() + 1;
        boolean r116 = true;
    L48:
        if (r115 == r20) goto L176;
        if (r27.getDepth() >= r22) goto L53;
        if (r115 == r14) goto L176;
    L53:
        if (r115 != r17) goto L170;
        String r117 = r27.getName();
        t35 r118 = (t35) r112.peek();
        int r23 = r22;
        if ("path".equals(r117) == false) goto L122;
        s35 r24 = new s35();
        r24.e = 0.0f;
        r24.g = 1.0f;
        r24.h = 1.0f;
        r24.i = 0.0f;
        r24.j = 1.0f;
        r24.k = 0.0f;
        Paint.Cap r119 = Paint.Cap.BUTT;
        r24.l = r119;
        Paint.Join r25 = Paint.Join.MITER;
        r24.m = r25;
        r24.n = 4.0f;
        TypedArray r30 = gi1.O(r26, r29, r28, fh0.c);
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) goto L117;
        String r120 = r30.getString(0);
        if (r120 == null) goto L61;
        r24.b = r120;
    L61:
        String r121 = r30.getString(2);
        if (r121 == null) goto L64;
        r24.a = fh0.l(r121);
    L64:
        r24.f = gi1.s(r30, r27, r29, "fillColor", 1);
        float r31 = r24.h;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") == null) goto L67;
        r31 = r30.getFloat(12, r31);
    L67:
        r24.h = r31;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") == null) goto L70;
        int r122 = r30.getInt(8, -1);
    L71:
        Paint.Cap r32 = r24.l;
        if (r122 != 0) goto L74;
        Paint.Cap r123 = r119;
    L81:
        r24.l = r123;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") == null) goto L84;
        int r33 = r30.getInt(9, -1);
    L85:
        Paint.Join r124 = r24.m;
        if (r33 != 0) goto L88;
        Paint.Join r34 = r25;
    L95:
        r24.m = r34;
        float r35 = r24.n;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") == null) goto L98;
        r35 = r30.getFloat(10, r35);
    L98:
        r24.n = r35;
        r24.d = gi1.s(r30, r27, r29, "strokeColor", 3);
        float r36 = r24.g;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") == null) goto L101;
        r36 = r30.getFloat(11, r36);
    L101:
        r24.g = r36;
        float r37 = r24.e;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") == null) goto L104;
        r37 = r30.getFloat(4, r37);
    L104:
        r24.e = r37;
        float r38 = r24.j;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") == null) goto L107;
        r38 = r30.getFloat(6, r38);
    L107:
        r24.j = r38;
        float r39 = r24.k;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") == null) goto L110;
        r39 = r30.getFloat(7, r39);
    L110:
        r24.k = r39;
        float r40 = r24.i;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") == null) goto L113;
        r40 = r30.getFloat(5, r40);
    L113:
        r24.i = r40;
        int r41 = r24.c;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") == null) goto L116;
        r41 = r30.getInt(13, r41);
    L116:
        r24.c = r41;
        goto L117
    L88:
        if (r33 != 1) goto L90;
        r34 = Paint.Join.ROUND;
        goto L95
    L90:
        if (r33 == 2) goto L92;
        r34 = r124;
        goto L95
    L92:
        r34 = Paint.Join.BEVEL;
        goto L95
    L84:
        r33 = -1;
        goto L85
    L74:
        if (r122 != 1) goto L76;
        r123 = Paint.Cap.ROUND;
        goto L81
    L76:
        if (r122 == 2) goto L78;
        r123 = r32;
        goto L81
    L78:
        r123 = Paint.Cap.SQUARE;
        goto L81
    L70:
        r122 = -1;
    L117:
        r30.recycle();
        r118.b.add(r24);
        if (r24.getPathName() == null) goto L120;
        r114.put(r24.getPathName(), r24);
    L120:
        r21.a = r21.a;
        int r125 = 1;
        r116 = false;
    L169:
        int r210 = r125;
        int r126 = 3;
    L175:
        r115 = r27.next();
        r14 = r126;
        r20 = r210;
        r22 = r23;
        r17 = 2;
        goto L48
    L122:
        if ("clip-path".equals(r117) == false) goto L142;
        r35 r42 = new r35();
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) goto L136;
        TypedArray r43 = gi1.O(r26, r29, r28, fh0.d);
        String r127 = r43.getString(0);
        if (r127 == null) goto L128;
        r42.b = r127;
    L128:
        String r44 = r43.getString(1);
        if (r44 == null) goto L132;
        r42.a = fh0.l(r44);
    L132:
        if (gi1.u(r27, "fillType") == true) goto L134;
        int r128 = 0;
    L135:
        r42.c = r128;
        r43.recycle();
        goto L136
    L134:
        r128 = r43.getInt(2, 0);
    L136:
        r118.b.add(r42);
        if (r42.getPathName() == null) goto L139;
        r114.put(r42.getPathName(), r42);
    L139:
        r21.a = r21.a;
    L140:
        r125 = 1;
        goto L169
    L142:
        if ("group".equals(r117) == false) goto L140;
        t35 r45 = new t35();
        TypedArray r46 = gi1.O(r26, r29, r28, fh0.b);
        float r47 = r45.c;
        if (gi1.u(r27, "rotation") == false) goto L147;
        r47 = r46.getFloat(5, r47);
    L147:
        r45.c = r47;
        r125 = 1;
        r45.d = r46.getFloat(1, r45.d);
        r45.e = r46.getFloat(2, r45.e);
        float r48 = r45.f;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") == null) goto L150;
        r48 = r46.getFloat(3, r48);
    L150:
        r45.f = r48;
        float r49 = r45.g;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") == null) goto L154;
        r49 = r46.getFloat(4, r49);
    L154:
        r45.g = r49;
        float r50 = r45.h;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") == null) goto L158;
        r50 = r46.getFloat(6, r50);
    L158:
        r45.h = r50;
        float r51 = r45.i;
        if (r27.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") == null) goto L162;
        r51 = r46.getFloat(7, r51);
    L162:
        r45.i = r51;
        String r129 = r46.getString(0);
        if (r129 == null) goto L165;
        r45.k = r129;
    L165:
        r45.c();
        r46.recycle();
        r118.b.add(r45);
        r112.push(r45);
        if (r45.getGroupName() == null) goto L168;
        r114.put(r45.getGroupName(), r45);
    L168:
        r21.a = r21.a;
        goto L169
    L170:
        r23 = r22;
        r126 = r14;
        r210 = 1;
        if (r115 != r126) goto L175;
        if ("group".equals(r27.getName()) == false) goto L175;
        r112.pop();
    L176:
        if (r116 == true) goto L180;
        this.p = a(r6.c, r6.d);
        return;
    L180:
        throw new XmlPullParserException("no path defined");
    L182:
        throw new XmlPullParserException(r7.getPositionDescription() + "<vector> tag requires height > 0");
    L184:
        throw new XmlPullParserException(r7.getPositionDescription() + "<vector> tag requires width > 0");
    L186:
        throw new XmlPullParserException(r7.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    L188:
        throw new XmlPullParserException(r7.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    L20:
        r12 = PorterDuff.Mode.SRC_OVER;
        goto L21
    L9:
        r10 = r7.getInt(6, -1);
        goto L10
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.invalidateSelf();
        return;
    L6:
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.isAutoMirrored();
    L7:
        return this.o.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.isStateful();
    L7:
        if (super.isStateful() == true) goto L22;
        x35 r1 = this.o;
        if (r1 == null) goto L20;
        w35 r2 = r1.b;
        if (r2.n != null) goto L14;
        r2.n = Boolean.valueOf(r2.g.a());
    L14:
        if (r2.n.booleanValue() == true) goto L26;
        ColorStateList r3 = this.o.c;
        if (r3 != null) goto L18;
        return false;
    L18:
        if (r3.isStateful() == true) goto L27;
        return false;
    L27:
        return true;
    L26:
        return true;
    L20:
        return false;
    L22:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        r0.mutate();
        return this;
    L7:
        if (this.r == false) goto L9;
    L20:
        return this;
    L9:
        if (super.mutate() != this) goto L20;
        x35 r1 = this.o;
        x35 r2 = new x35();
        r2.c = null;
        r2.d = w;
        if (r1 == null) goto L19;
        r2.a = r1.a;
        w35 r3 = new w35(r1.b);
        r2.b = r3;
        if (r1.b.e == null) goto L16;
        r3.e = new Paint(r1.b.e);
    L16:
        if (r1.b.d == null) goto L18;
        w35 r4 = r2.b;
        r4.d = new Paint(r1.b.d);
    L18:
        r2.c = r1.c;
        r2.d = r1.d;
        r2.e = r1.e;
    L19:
        this.o = r2;
        this.r = true;
        goto L20
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r1) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setBounds(r1);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r6) {
        Drawable r0 = this.n;
        if (r0 != null) goto L5;
        x35 r1 = this.o;
        ColorStateList r2 = r1.c;
        if (r2 == null) goto L11;
        PorterDuff.Mode r3 = r1.d;
        if (r3 == null) goto L11;
        this.p = a(r2, r3);
        invalidateSelf();
        boolean r4 = true;
    L12:
        w35 r5 = r1.b;
        if (r5.n != null) goto L16;
        r5.n = Boolean.valueOf(r5.g.a());
    L16:
        if (r5.n.booleanValue() == false) goto L21;
        boolean r7 = r1.b.g.b(r6);
        r1.k |= r7;
        if (r7 == false) goto L21;
        invalidateSelf();
        return true;
    L21:
        return r4;
    L11:
        r4 = false;
        goto L12
    L5:
        return r0.setState(r6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable r2, long r3) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.scheduleSelf(r2, r3);
        return;
    L6:
        super.scheduleSelf(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        r0.setAlpha(r2);
        return;
    L7:
        if (this.o.b.getRootAlpha() == r2) goto L10;
        this.o.b.setRootAlpha(r2);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setAutoMirrored(r2);
        return;
    L6:
        this.o.e = r2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setColorFilter(r2);
        return;
    L6:
        this.q = r2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setTint(r2);
        return;
    L6:
        setTintList(ColorStateList.valueOf(r2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r3) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setTintList(r3);
        return;
    L6:
        x35 r1 = this.o;
        if (r1.c == r3) goto L10;
        r1.c = r3;
        this.p = a(r3, r1.d);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r3) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.setTintMode(r3);
        return;
    L6:
        x35 r1 = this.o;
        if (r1.d == r3) goto L10;
        r1.d = r3;
        this.p = a(r1.c, r3);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
        Drawable r0 = this.n;
        if (r0 == null) goto L7;
        return r0.setVisible(r2, r3);
    L7:
        return super.setVisible(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable r2) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.unscheduleSelf(r2);
        return;
    L6:
        super.unscheduleSelf(r2);
    }

    public z35(x35 r2) {
        this.s = true;
        this.t = new float[9];
        this.u = new Matrix();
        this.v = new Rect();
        this.o = r2;
        this.p = a(r2.c, r2.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r2, XmlPullParser r3, AttributeSet r4) {
        Drawable r0 = this.n;
        if (r0 == null) goto L6;
        r0.inflate(r2, r3, r4);
        return;
    L6:
        inflate(r2, r3, r4, null);
    }
}
