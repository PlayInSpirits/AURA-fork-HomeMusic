package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ic {
    public final mc a;
    public final int b;
    public final long c;
    public final ks4 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    public ic(mc r21, int r22, int r23, long r24) {
        this.a = r21;
        this.b = r22;
        this.c = r24;
        if (nc0.i(r24) == 0) goto L5;
    L7:
        dz1.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    L9:
        if (r22 >= 1) goto L12;
        dz1.a("maxLines should be greater than 0");
    L12:
        zs4 r1 = r21.o;
        CharSequence r2 = r21.u;
        if (r23 != 2) goto L39;
        int r17 = 0;
        if (bt4.a(r1.a.h, su3.v(0)) == false) goto L17;
    L38:
        CharSequence r9 = r2;
        this.e = r9;
        sd3 r3 = r1.b;
        ij4 r4 = r1.a;
        int r6 = r3.a;
        int r7 = 3;
        if (r6 != 1) goto L44;
        int r8 = 3;
    L54:
        if (r6 != 4) goto L56;
        int r10 = 1;
    L58:
        if (r3.h == 2) goto L60;
        int r15 = r17;
    L64:
        int r5 = r3.g;
        int r11 = r5 & 255;
        if (r11 == 1) goto L71;
        if (r11 != 2) goto L69;
        int r12 = 1;
    L72:
        int r13 = (r5 >> 8) & 255;
        if (r13 != 1) goto L76;
    L83:
        r7 = r17;
    L84:
        int r14 = (r5 >> 16) & 255;
        if (r14 != 1) goto L87;
        int r16 = 2;
    L90:
        int r18 = r17;
    L91:
        if (r23 != r16) goto L95;
        TextUtils.TruncateAt r19 = TextUtils.TruncateAt.END;
    L93:
        char r110 = ' ';
        TextUtils.TruncateAt r20 = r19;
    L101:
        ks4 r111 = b(r8, r10, r20, r22, r15, r12, r7, r18, r9);
        Layout r0 = r111.e;
        int r112 = r8;
        if (Build.VERSION.SDK_INT < 35) goto L104;
    L105:
        ic r25 = this;
        int r26 = r22;
        int r27 = r112;
        int r113 = 2;
    L115:
        int r28 = r111.f;
        if (r23 == r113) goto L118;
    L137:
        r25.d = r111;
    L138:
        r25.f = r25.d.a();
        xc r29 = r25.a.t;
        uo r30 = r4.a.f();
        float r31 = r25.c();
        r29.c(r30, (((long) Float.floatToRawIntBits(r25.f)) & 4294967295L) | (Float.floatToRawIntBits(r31) << r110), r4.a.b());
        Layout r32 = r25.d.e;
        if ((r32.getText() instanceof Spanned) == true) goto L141;
    L140:
        wb4[] r33 = null;
    L144:
        if (r33 == null) goto L148;
        int r34 = r33.length;
        int r35 = 0;
    L146:
        if (r35 >= r34) goto L148;
        wb4 r36 = r33[r35];
        float r37 = r25.c();
        r36.p.setValue(new qf4((((long) Float.floatToRawIntBits(r25.f)) & 4294967295L) | (Float.floatToRawIntBits(r37) << r110)));
        r35 = r35 + 1;
    L148:
        CharSequence r38 = r25.e;
        if ((r38 instanceof Spanned) == true) goto L151;
        List r39 = u01.n;
    L193:
        r25.g = r39;
        return;
    L151:
        Spanned r40 = (Spanned) r38;
        Object[] r41 = r40.getSpans(0, r38.length(), ng3.class);
        ArrayList r42 = new ArrayList(r41.length);
        int r43 = r41.length;
        int r44 = 0;
    L152:
        if (r44 >= r43) goto L192;
        ng3 r45 = (ng3) r41[r44];
        int r46 = r40.getSpanStart(r45);
        int r47 = r40.getSpanEnd(r45);
        int r48 = r25.d.f(r46);
        if (r48 < r25.b) goto L156;
        boolean r114 = true;
    L158:
        if (r25.d.e.getEllipsisCount(r48) > 0) goto L160;
    L162:
        boolean r115 = false;
    L164:
        if (r47 <= r25.d.e(r48)) goto L166;
        boolean r49 = true;
    L167:
        if (r115 == true) goto L190;
        if (r49 == true) goto L190;
        if (r114 == true) goto L190;
        if (r25.d.e.getParagraphDirection(r48) != 1) goto L174;
        boolean r50 = true;
    L175:
        boolean r116 = r25.d.e.isRtlCharAt(r46);
        if (r50 == false) goto L181;
        if (r116 == true) goto L181;
        float r51 = r25.d.h(r46, false);
        int r52 = r45.c();
    L179:
        float r53 = r52 + r51;
    L189:
        ks4 r117 = r25.d;
        r45.getClass();
        float r54 = r117.c(r48) - r45.b();
        wv3 r118 = new wv3(r51, r54, r53, r45.b() + r54);
    L191:
        r42.add(r118);
        r44 = r44 + 1;
    L181:
        if (r50 == false) goto L185;
        if (r116 == false) goto L185;
        r53 = r25.d.i(r46, false);
        int r55 = r45.c();
    L184:
        r51 = r53 - r55;
    L185:
        ks4 r56 = r25.d;
        if (r116 == false) goto L188;
        r53 = r56.h(r46, false);
        r55 = r45.c();
        goto L184
    L188:
        r51 = r56.i(r46, false);
        r52 = r45.c();
        goto L179
    L174:
        r50 = false;
    L190:
        r118 = null;
        goto L191
    L166:
        r49 = false;
        goto L167
    L160:
        if (r47 <= (r25.d.e.getEllipsisStart(r48) + r25.d.e.getLineStart(r48))) goto L162;
        r115 = true;
        goto L164
    L156:
        r114 = false;
        goto L158
    L192:
        r39 = r42;
        goto L193
    L141:
        CharSequence r57 = r32.getText();
        r57.getClass();
        Spanned r58 = (Spanned) r57;
        if (r58.nextSpanTransition(-1, r58.length(), wb4.class) == r58.length()) goto L140;
        CharSequence r59 = r32.getText();
        r59.getClass();
        r33 = (wb4[]) ((Spanned) r59).getSpans(0, r32.getText().length(), wb4.class);
        goto L144
    L118:
        if (r111.a() <= nc0.g(r24)) goto L137;
        if (r26 <= 1) goto L137;
        int r60 = nc0.g(r24);
        int r119 = 0;
    L122:
        if (r119 >= r28) goto L127;
        if (r111.d(r119) > r60) goto L128;
        r119 = r119 + 1;
    L128:
        if (r119 >= 0) goto L130;
    L136:
        r25.d = r111;
        goto L138
    L130:
        if (r119 == r25.b) goto L136;
        if (r119 >= 1) goto L134;
        int r61 = 1;
    L135:
        r111 = r25.b(r27, r10, r20, r61, r15, r12, r7, r18, r25.e);
        goto L136
    L134:
        r61 = r119;
        goto L135
    L127:
        r119 = r28;
        goto L128
    L104:
        if (r21.t.getLetterSpacing() == 0.0f) goto L105;
        if (r23 != 4) goto L110;
    L113:
        if (r0.getEllipsisCount(0) <= 0) goto L105;
        int r62 = r0.getEllipsisStart(0);
        r113 = 2;
        CharSequence[] r63 = {r9.subSequence(0, r62), "…", r9.subSequence(r0.getEllipsisCount(0) + r62, r9.length())};
        r25 = this;
        r26 = r22;
        r27 = r112;
        r111 = r25.b(r27, r10, r20, r26, r15, r12, r7, r18, TextUtils.concat(r63));
        goto L115
    L110:
        if (r23 != 5) goto L105;
    L95:
        if (r23 != 5) goto L98;
        r19 = TextUtils.TruncateAt.MIDDLE;
        goto L93
    L98:
        if (r23 != 4) goto L100;
        r19 = TextUtils.TruncateAt.START;
        goto L93
    L100:
        r110 = ' ';
        r20 = null;
        goto L101
    L87:
        r16 = 2;
        if (r14 != 2) goto L90;
        r18 = 1;
        goto L91
    L76:
        if (r13 != 2) goto L78;
        r7 = 1;
        goto L84
    L78:
        if (r13 != 3) goto L81;
        r7 = 2;
        goto L84
    L81:
        if (r13 != 4) goto L83;
    L69:
        if (r11 != 3) goto L71;
        r12 = 2;
    L71:
        r12 = r17;
        goto L72
    L60:
        if (Build.VERSION.SDK_INT > 32) goto L62;
        r15 = 2;
        goto L64
    L62:
        r15 = 4;
        goto L64
    L56:
        r10 = r17;
        goto L58
    L44:
        if (r6 != 2) goto L46;
        r8 = 4;
        goto L54
    L46:
        if (r6 != 3) goto L48;
        r8 = 2;
        goto L54
    L48:
        if (r6 != 5) goto L51;
    L53:
        r8 = r17;
        goto L54
    L51:
        if (r6 != 6) goto L53;
        r8 = 1;
        goto L54
    L17:
        if (bt4.a(r1.a.h, bt4.c) == true) goto L38;
        int r64 = r1.b.a;
        if (r64 == 0) goto L38;
        if (r64 == 5) goto L38;
        if (r64 == 4) goto L38;
        if (r2.length() == 0) goto L38;
        if ((r2 instanceof Spannable) == false) goto L31;
        Spannable r65 = (Spannable) r2;
    L32:
        if (r65 != null) goto L35;
        r65 = new SpannableString(r2);
    L35:
        if (bu.q(r65, px1.class) == true) goto L37;
        r65.setSpan(new px1(), r65.length() - 1, r65.length() - 1, 33);
    L37:
        r2 = r65;
        goto L38
    L31:
        r65 = null;
        goto L32
    L39:
        r17 = 0;
        goto L38
    L5:
        if (nc0.j(r24) != 0) goto L7;
        goto L7
    }

    public static final void a(ic r5, jz r6) {
        r5.getClass();
        Canvas r7 = ba.a(r6);
        ks4 r0 = r5.d;
        if (r0.d == false) goto L5;
        r7.save();
        r7.clipRect(0.0f, 0.0f, r5.c(), r5.f);
    L5:
        int r8 = r0.g;
        if (r7.getClipBounds(r0.o) == false) goto L19;
        if (r8 == 0) goto L10;
        r7.translate(0.0f, r8);
    L10:
        ThreadLocal r1 = ns4.a;
        Object r3 = r1.get();
        if (r3 != null) goto L13;
        r3 = new or4();
        r1.set(r3);
    L13:
        or4 r4 = (or4) r3;
        r4.a = r7;
        r0.e.draw(r4);     // Catch: Throwable -> L22
        r4.a = null;
        if (r8 == 0) goto L19;
        r7.translate(0.0f, (-1.0f) * r8);
    L22:
        th = move-exception;
        r4.a = null;
        throw th;
    L19:
        if (r0.d == false) goto L27;
        r7.restore();
        return;
    }

    public final ks4 b(int r16, int r17, TextUtils.TruncateAt r18, int r19, int r20, int r21, int r22, int r23, CharSequence r24) {
        float r2 = c();
        mc r15 = this.a;
        xc r3 = r15.t;
        int r6 = r15.y;
        t62 r14 = r15.v;
        zs4 r110 = r15.o;
        jc r0 = kc.a;
        eh3 r111 = r110.c;
        if (r111 == null) goto L8;
        zg3 r112 = r111.a;
        if (r112 == null) goto L8;
        boolean r113 = r112.a;
    L10:
        return new ks4(r24, r2, r3, r16, r18, r6, r113, r19, r21, r22, r23, r20, r17, r14);
    L8:
        r113 = false;
        goto L10
    }

    public final float c() {
        return nc0.h(this.c);
    }

    public final void d(jz r11, long r12, xb4 r14, sr4 r15, q05 r16) {
        xc r0 = this.a.t;
        int r1 = r0.c;
        r0.d(r12);
        r0.f(r14);
        r0.g(r15);
        r0.e(r16);
        r0.b(3);
        new q(1, this, ic.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, 1).invoke(r11);
        r0.b(r1);
    }

    public final void e(jz r11, uo r12, float r13, xb4 r14, sr4 r15, q05 r16) {
        xc r0 = this.a.t;
        int r1 = r0.c;
        r0.c(r12, (Float.floatToRawIntBits(c()) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L), r13);
        r0.f(r14);
        r0.g(r15);
        r0.e(r16);
        r0.b(3);
        new q(1, this, ic.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, 2).invoke(r11);
        r0.b(r1);
    }
}
