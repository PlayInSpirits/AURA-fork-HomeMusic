package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ih {
    public final TextView a;
    public la0 b;
    public la0 c;
    public la0 d;
    public la0 e;
    public la0 f;
    public la0 g;
    public la0 h;
    public final rh i;
    public int j;
    public int k;
    public Typeface l;
    public boolean m;

    public ih(TextView r2) {
        this.j = 0;
        this.k = -1;
        this.a = r2;
        this.i = new rh(r2);
    }

    public static la0 c(Context r1, fg r2, int r3) {
        monitor-enter(r2);
        ColorStateList r4 = r2.a.g(r1, r3);     // Catch: Throwable -> L10
        monitor-exit(r2);
        if (r4 == null) goto L8;
        la0 r5 = new la0();
        r5.o = true;
        r5.p = r4;
        return r5;
    L8:
        return null;
    L10:
        th = move-exception;
        throw th;
    }

    public final void a(Drawable r1, la0 r2) {
        if (r1 == null) goto L6;
        if (r2 == null) goto L7;
        fg.e(r1, r2, this.a.getDrawableState());
        return;
    L7:
        return;
    }

    public final void b() {
        la0 r0 = this.b;
        TextView r3 = this.a;
        if (r0 == null) goto L5;
    L10:
        Drawable[] r1 = r3.getCompoundDrawables();
        a(r1[0], this.b);
        a(r1[1], this.c);
        a(r1[2], this.d);
        a(r1[3], this.e);
    L12:
        if (this.f == null) goto L14;
    L17:
        Drawable[] r2 = r3.getCompoundDrawablesRelative();
        a(r2[0], this.f);
        a(r2[2], this.g);
        return;
    L14:
        if (this.g != null) goto L17;
        return;
    L5:
        if (this.c != null) goto L10;
        if (this.d != null) goto L10;
        if (this.e == null) goto L12;
        goto L10
    }

    public final ColorStateList d() {
        la0 r0 = this.h;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (ColorStateList) r0.p;
    }

    public final PorterDuff.Mode e() {
        la0 r0 = this.h;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (PorterDuff.Mode) r0.q;
    }

    public final void f(AttributeSet r25, int r26) {
        TextView r1 = this.a;
        Context r8 = r1.getContext();
        fg r9 = fg.a();
        int[] r2 = st3.h;
        jv3 r10 = jv3.f(r8, r25, r2, r26);
        j65.n(r1, r1.getContext(), r2, r25, (TypedArray) r10.o, r26, 0);
        TypedArray r3 = (TypedArray) r10.o;
        int r4 = r3.getResourceId(0, -1);
        if (r3.hasValue(3) == false) goto L6;
        this.b = c(r8, r9, r3.getResourceId(3, 0));
    L6:
        if (r3.hasValue(1) == false) goto L9;
        this.c = c(r8, r9, r3.getResourceId(1, 0));
    L9:
        if (r3.hasValue(4) == false) goto L12;
        this.d = c(r8, r9, r3.getResourceId(4, 0));
    L12:
        if (r3.hasValue(2) == false) goto L15;
        this.e = c(r8, r9, r3.getResourceId(2, 0));
    L15:
        if (r3.hasValue(5) == false) goto L18;
        this.f = c(r8, r9, r3.getResourceId(5, 0));
    L18:
        if (r3.hasValue(6) == false) goto L20;
        this.g = c(r8, r9, r3.getResourceId(6, 0));
    L20:
        r10.g();
        boolean r5 = r1.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] r6 = st3.y;
        if (r4 == (-1)) goto L39;
        TypedArray r7 = r8.obtainStyledAttributes(r4, r6);
        jv3 r15 = new jv3(r8, r7);
        if (r5 == false) goto L25;
    L27:
        boolean r21 = false;
        boolean r22 = false;
    L28:
        m(r8, r15);
        if (r7.hasValue(15) == false) goto L31;
        String r23 = r7.getString(15);
    L33:
        if (Build.VERSION.SDK_INT >= 26) goto L35;
    L37:
        String r11 = null;
    L38:
        r15.g();
    L40:
        TypedArray r12 = r8.obtainStyledAttributes(r25, r6, r26, 0);
        jv3 r13 = new jv3(r8, r12);
        if (r5 == false) goto L43;
    L45:
        boolean r14 = r22;
        if (r12.hasValue(15) == false) goto L48;
        r23 = r12.getString(15);
    L48:
        int r16 = Build.VERSION.SDK_INT;
        if (r16 < 26) goto L54;
        if (r12.hasValue(13) == false) goto L54;
        r11 = r12.getString(13);
    L54:
        if (r16 >= 28) goto L56;
    L60:
        m(r8, r13);
        r13.g();
        if (r5 == true) goto L64;
        if (r21 == false) goto L64;
        r1.setAllCaps(r14);
    L64:
        Typeface r17 = this.l;
        if (r17 != null) goto L67;
    L70:
        if (r11 == null) goto L72;
        gh.d(r1, r11);
    L72:
        if (r23 == null) goto L74;
        fh.b(r1, fh.a(r23));
    L74:
        rh r18 = this.i;
        Context r19 = r18.j;
        int[] r20 = st3.i;
        TypedArray r24 = r19.obtainStyledAttributes(r25, r20, r26, 0);
        TextView r0 = r18.i;
        j65.n(r0, r0.getContext(), r20, r25, r24, r26, 0);
        if (r24.hasValue(5) == false) goto L78;
        r18.a = r24.getInt(5, 0);
    L78:
        if (r24.hasValue(4) == false) goto L80;
        float r27 = r24.getDimension(4, -1.0f);
    L82:
        if (r24.hasValue(2) == false) goto L85;
        float r28 = r24.getDimension(2, -1.0f);
    L87:
        if (r24.hasValue(1) == false) goto L90;
        float r110 = r24.getDimension(1, -1.0f);
    L92:
        if (r24.hasValue(3) == false) goto L102;
        int r29 = r24.getResourceId(3, 0);
        if (r29 <= 0) goto L102;
        TypedArray r30 = r24.getResources().obtainTypedArray(r29);
        int r31 = r30.length();
        int[] r111 = new int[r31];
        if (r31 <= 0) goto L101;
        int r112 = 0;
    L98:
        if (r112 >= r31) goto L100;
        r111[r112] = r30.getDimensionPixelSize(r112, -1);
        r112 = r112 + 1;
        goto L98
    L100:
        r18.f = rh.b(r111);
        r18.i();
    L101:
        r30.recycle();
    L102:
        r24.recycle();
        if (r18.j() == true) goto L105;
        r18.a = 0;
    L121:
        if (e85.c == true) goto L123;
    L130:
        TypedArray r32 = r8.obtainStyledAttributes(r25, r20);
        int r33 = r32.getResourceId(8, -1);
        if (r33 == (-1)) goto L134;
        Drawable r34 = r9.b(r8, r33);
    L135:
        int r35 = r32.getResourceId(13, -1);
        if (r35 == (-1)) goto L138;
        Drawable r36 = r9.b(r8, r35);
    L139:
        int r37 = r32.getResourceId(9, -1);
        if (r37 == (-1)) goto L143;
        Drawable r38 = r9.b(r8, r37);
    L144:
        int r39 = r32.getResourceId(6, -1);
        if (r39 == (-1)) goto L147;
        Drawable r40 = r9.b(r8, r39);
    L148:
        int r41 = r32.getResourceId(10, -1);
        if (r41 == (-1)) goto L151;
        Drawable r42 = r9.b(r8, r41);
    L152:
        int r43 = r32.getResourceId(7, -1);
        if (r43 == (-1)) goto L155;
        Drawable r44 = r9.b(r8, r43);
    L156:
        if (r42 != null) goto L189;
        if (r44 != null) goto L189;
        if (r34 != null) goto L163;
        if (r36 != null) goto L163;
        if (r38 != null) goto L163;
        if (r40 != null) goto L163;
    L204:
        if (r32.hasValue(11) == false) goto L215;
        if (r32.hasValue(11) == false) goto L212;
        int r45 = r32.getResourceId(11, 0);
        if (r45 == 0) goto L212;
        ColorStateList r46 = ud3.n(r8, r45);
        if (r46 == null) goto L212;
    L213:
        r1.setCompoundDrawableTintList(r46);
    L212:
        r46 = r32.getColorStateList(11);
    L215:
        if (r32.hasValue(12) == false) goto L217;
        r1.setCompoundDrawableTintMode(aw0.c(r32.getInt(12, -1), null));
    L217:
        int r47 = r32.getDimensionPixelSize(15, -1);
        int r48 = r32.getDimensionPixelSize(18, -1);
        if (r32.hasValue(19) == false) goto L226;
        TypedValue r49 = r32.peekValue(19);
        if (r49 != null) goto L222;
    L224:
        int r113 = -1;
        float r50 = r32.getDimensionPixelSize(19, -1);
    L225:
        int r51 = r113;
    L227:
        r32.recycle();
        if (r47 == r113) goto L230;
        ya4.I(r1, r47);
    L230:
        if (r48 == r113) goto L233;
        ya4.J(r1, r48);
    L233:
        if (r50 == (-1.0f)) goto L244;
        if (r51 != r113) goto L238;
        ya4.K(r1, (int) r50);
        return;
    L238:
        if (Build.VERSION.SDK_INT < 34) goto L241;
        a3.o(r1, r51, r50);
        return;
    L241:
        ya4.K(r1, Math.round(TypedValue.applyDimension(r51, r50, r1.getResources().getDisplayMetrics())));
        return;
    L244:
        return;
    L222:
        if (r49.type != 5) goto L224;
        int r52 = r49.data;
        int r114 = r52 & 15;
        r50 = TypedValue.complexToFloat(r52);
        r51 = r114;
        r113 = -1;
        goto L227
    L226:
        r113 = -1;
        r50 = -1.0f;
    L163:
        Drawable[] r53 = r1.getCompoundDrawablesRelative();
        Drawable r54 = r53[0];
        if (r54 != null) goto L182;
        if (r53[2] != null) goto L182;
        Drawable[] r55 = r1.getCompoundDrawables();
        if (r34 != null) goto L172;
        r34 = r55[0];
    L172:
        if (r36 != null) goto L175;
        r36 = r55[1];
    L175:
        if (r38 != null) goto L178;
        r38 = r55[2];
    L178:
        if (r40 != null) goto L181;
        r40 = r55[3];
    L181:
        r1.setCompoundDrawablesWithIntrinsicBounds(r34, r36, r38, r40);
    L182:
        if (r36 != null) goto L185;
        r36 = r53[1];
    L185:
        if (r40 != null) goto L188;
        r40 = r53[3];
    L188:
        r1.setCompoundDrawablesRelativeWithIntrinsicBounds(r54, r36, r53[2], r40);
    L189:
        Drawable[] r56 = r1.getCompoundDrawablesRelative();
        if (r42 != null) goto L193;
        r42 = r56[0];
    L193:
        if (r36 != null) goto L196;
        r36 = r56[1];
    L196:
        if (r44 != null) goto L199;
        r44 = r56[2];
    L199:
        if (r40 != null) goto L202;
        r40 = r56[3];
    L202:
        r1.setCompoundDrawablesRelativeWithIntrinsicBounds(r42, r36, r44, r40);
        goto L204
    L155:
        r44 = null;
        goto L156
    L151:
        r42 = null;
        goto L152
    L147:
        r40 = null;
        goto L148
    L143:
        r38 = null;
        goto L144
    L138:
        r36 = null;
        goto L139
    L134:
        r34 = null;
        goto L135
    L123:
        if (r18.a == 0) goto L130;
        int[] r57 = r18.f;
        if (r57.length <= 0) goto L130;
        if (gh.a(r1) == (-1.0f)) goto L129;
        gh.b(r1, Math.round(r18.d), Math.round(r18.e), Math.round(r18.c), 0);
        goto L130
    L129:
        gh.c(r1, r57, 0);
        goto L130
    L105:
        if (r18.a != 1) goto L121;
        if (r18.g == true) goto L118;
        DisplayMetrics r58 = r19.getResources().getDisplayMetrics();
        if (r28 != (-1.0f)) goto L112;
        r28 = TypedValue.applyDimension(2, 12.0f, r58);
    L112:
        if (r110 != (-1.0f)) goto L114;
        r110 = TypedValue.applyDimension(2, 112.0f, r58);
    L114:
        float r59 = r110;
        if (r27 != (-1.0f)) goto L117;
        r27 = 1.0f;
    L117:
        r18.k(r28, r59, r27);
    L118:
        r18.h();
        goto L121
    L90:
        r110 = -1.0f;
        goto L92
    L85:
        r28 = -1.0f;
        goto L87
    L80:
        r27 = -1.0f;
        goto L82
    L67:
        if (this.k != (-1)) goto L69;
        r1.setTypeface(r17, this.j);
        goto L70
    L69:
        r1.setTypeface(r17);
        goto L70
    L56:
        if (r12.hasValue(0) == false) goto L60;
        if (r12.getDimensionPixelSize(0, -1) != 0) goto L60;
        r1.setTextSize(0, 0.0f);
        goto L60
    L43:
        if (r12.hasValue(14) == false) goto L45;
        r22 = r12.getBoolean(14, false);
        r21 = true;
        goto L45
    L35:
        if (r7.hasValue(13) == false) goto L37;
        r11 = r7.getString(13);
        goto L38
    L31:
        r23 = null;
        goto L33
    L25:
        if (r7.hasValue(14) == false) goto L27;
        r22 = r7.getBoolean(14, false);
        r21 = true;
        goto L28
    L39:
        r21 = false;
        r22 = false;
        r11 = null;
        r23 = null;
        goto L40
    }

    public final void g(Context r6, int r7) {
        TypedArray r8 = r6.obtainStyledAttributes(r7, st3.y);
        jv3 r0 = new jv3(r6, r8);
        boolean r2 = r8.hasValue(14);
        TextView r4 = this.a;
        if (r2 == false) goto L6;
        r4.setAllCaps(r8.getBoolean(14, false));
    L6:
        if (r8.hasValue(0) == true) goto L8;
    L10:
        m(r6, r0);
        if (Build.VERSION.SDK_INT >= 26) goto L13;
    L17:
        r0.g();
        Typeface r9 = this.l;
        if (r9 == null) goto L21;
        r4.setTypeface(r9, this.j);
        return;
    L21:
        return;
    L13:
        if (r8.hasValue(13) == false) goto L17;
        String r10 = r8.getString(13);
        if (r10 == null) goto L17;
        gh.d(r4, r10);
        goto L17
    L8:
        if (r8.getDimensionPixelSize(0, -1) != 0) goto L10;
        r4.setTextSize(0, 0.0f);
        goto L10
    }

    public final void h(int r2, int r3, int r4, int r5) {
        rh r1 = this.i;
        if (r1.j() == false) goto L8;
        DisplayMetrics r0 = r1.j.getResources().getDisplayMetrics();
        r1.k(TypedValue.applyDimension(r5, r2, r0), TypedValue.applyDimension(r5, r3, r0), TypedValue.applyDimension(r5, r4, r0));
        if (r1.h() == false) goto L9;
        r1.a();
        return;
    L9:
        return;
    }

    public final void i(int[] r6, int r7) {
        rh r5 = this.i;
        if (r5.j() == false) goto L23;
        int r0 = r6.length;
        int r1 = 0;
        if (r0 <= 0) goto L17;
        int[] r2 = new int[r0];
        if (r7 != 0) goto L9;
        r2 = Arrays.copyOf(r6, r0);
    L12:
        r5.f = rh.b(r2);
        if (r5.i() == true) goto L19;
        kf2.l(Arrays.toString(r6), "None of the preset sizes is valid: ");
        return;
    L19:
        if (r5.h() == false) goto L24;
        r5.a();
        return;
    L24:
        return;
    L9:
        DisplayMetrics r3 = r5.j.getResources().getDisplayMetrics();
    L10:
        if (r1 >= r0) goto L12;
        r2[r1] = Math.round(TypedValue.applyDimension(r7, r6[r1], r3));
        r1 = r1 + 1;
        goto L10
    L17:
        r5.g = false;
        goto L19
    }

    public final void j(int r4) {
        rh r3 = this.i;
        if (r3.j() == false) goto L15;
        if (r4 != 0) goto L6;
        r3.a = 0;
        r3.d = -1.0f;
        r3.e = -1.0f;
        r3.c = -1.0f;
        r3.f = new int[0];
        r3.b = false;
        return;
    L6:
        if (r4 != 1) goto L11;
        DisplayMetrics r5 = r3.j.getResources().getDisplayMetrics();
        r3.k(TypedValue.applyDimension(2, 12.0f, r5), TypedValue.applyDimension(2, 112.0f, r5), 1.0f);
        if (r3.h() == false) goto L16;
        r3.a();
        return;
    L16:
        return;
    L11:
        kf2.n(f34.f(r4, "Unknown auto-size text type: "));
        return;
    }

    public final void k(ColorStateList r2) {
        if (this.h != null) goto L5;
        this.h = new la0();
    L5:
        la0 r0 = this.h;
        r0.p = r2;
        if (r2 == null) goto L8;
        boolean r3 = true;
    L9:
        r0.o = r3;
        this.b = r0;
        this.c = r0;
        this.d = r0;
        this.e = r0;
        this.f = r0;
        this.g = r0;
        return;
    L8:
        r3 = false;
        goto L9
    }

    public final void l(PorterDuff.Mode r2) {
        if (this.h != null) goto L5;
        this.h = new la0();
    L5:
        la0 r0 = this.h;
        r0.q = r2;
        if (r2 == null) goto L8;
        boolean r3 = true;
    L9:
        r0.n = r3;
        this.b = r0;
        this.c = r0;
        this.d = r0;
        this.e = r0;
        this.f = r0;
        this.g = r0;
        return;
    L8:
        r3 = false;
        goto L9
    }

    public final void m(Context r12, jv3 r13) {
        int r0 = this.j;
        TypedArray r1 = (TypedArray) r13.o;
        this.j = r1.getInt(2, r0);
        int r2 = Build.VERSION.SDK_INT;
        if (r2 < 28) goto L7;
        int r5 = r1.getInt(11, -1);
        this.k = r5;
        if (r5 == (-1)) goto L7;
        this.j &= 2;
    L7:
        int r6 = 10;
        boolean r7 = true;
        if (r1.hasValue(10) == false) goto L10;
    L26:
        this.l = null;
        if (r1.hasValue(12) == false) goto L29;
        r6 = 12;
    L29:
        int r8 = this.k;
        int r9 = this.j;
        if (r12.isRestricted() == true) goto L49;
        Typeface r14 = r13.e(r6, this.j, new dh(this, r8, r9, new WeakReference(this.a)));     // Catch: Throwable -> L63
        if (r14 == null) goto L44;
        if (r2 >= 28) goto L36;
    L42:
        this.l = r14;     // Catch: Throwable -> L63
        goto L44
    L36:
        if (this.k == (-1)) goto L42;
        Typeface r15 = Typeface.create(r14, 0);     // Catch: Throwable -> L63
        int r16 = this.k;     // Catch: Throwable -> L63
        if ((this.j & 2) == 0) goto L40;
        boolean r3 = true;
    L41:
        this.l = hh.a(r15, r16, r3);     // Catch: Throwable -> L63
        goto L44
    L40:
        r3 = false;
    L44:
        if (this.l != null) goto L46;
        boolean r17 = true;
    L47:
        this.m = r17;     // Catch: Throwable -> L63
        goto L49
    L46:
        r17 = false;
    L49:
        if (this.l != null) goto L67;
        String r18 = r1.getString(r6);
        if (r18 != null) goto L53;
        return;
    L53:
        if (Build.VERSION.SDK_INT >= 28) goto L55;
    L61:
        this.l = Typeface.create(r18, this.j);
        return;
    L55:
        if (this.k == (-1)) goto L61;
        Typeface r19 = Typeface.create(r18, 0);
        int r110 = this.k;
        if ((this.j & 2) != 0) goto L60;
        r7 = false;
    L60:
        this.l = hh.a(r19, r110, r7);
        return;
    L67:
        return;
    L10:
        if (r1.hasValue(12) == true) goto L26;
        if (r1.hasValue(1) == false) goto L66;
        this.m = false;
        int r111 = r1.getInt(1, 1);
        if (r111 == 1) goto L24;
        if (r111 != 2) goto L18;
        this.l = Typeface.SERIF;
        return;
    L18:
        if (r111 != 3) goto L70;
        this.l = Typeface.MONOSPACE;
        return;
    L70:
        return;
    L24:
        this.l = Typeface.SANS_SERIF;
        return;
    }
}
