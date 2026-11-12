package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ks4 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public final Layout e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final float j;
    public final boolean k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final sa2[] n;
    public final Rect o;
    public z40 p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    public ks4(CharSequence r22, float r23, TextPaint r24, int r25, TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, t62 r35) {
        this.a = r24;
        this.b = r26;
        this.c = r28;
        this.o = new Rect();
        int r5 = r22.length();
        TextDirectionHeuristic r12 = ns4.b(r27);
        Layout.Alignment r8 = nr4.a;
        if (r25 == 0) goto L15;
        if (r25 == 1) goto L14;
        if (r25 != 2) goto L7;
        Layout.Alignment r3 = Layout.Alignment.ALIGN_CENTER;
    L17:
        if ((r22 instanceof Spanned) == true) goto L19;
    L21:
        boolean r6 = false;
    L22:
        Trace.beginSection("TextLayout:initLayout");
        BoringLayout.Metrics r9 = r35.a();     // Catch: Throwable -> L168
        double r10 = r23;
        int r11 = (int) Math.ceil(r10);     // Catch: Throwable -> L168
        if (r9 != null) goto L26;
    L40:
        this.k = false;     // Catch: Throwable -> L168
        int r7 = r29;
        TextDirectionHeuristic r13 = r12;
        Layout r2 = fu.m(r22, r24, r11, r22.length(), r13, r3, r7, r26, (int) Math.ceil(r10), r34, r28, r30, r31, r32, r33);     // Catch: Throwable -> L168
    L41:
        this.e = r2;     // Catch: Throwable -> L168
        Trace.endSection();
        int r1 = Math.min(r2.getLineCount(), r7);
        this.f = r1;
        int r4 = r1 - 1;
        if (r1 >= r7) goto L46;
    L44:
        boolean r14 = false;
    L50:
        this.d = r14;
        if ((r2.getText() instanceof Spanned) == false) goto L57;
        CharSequence r15 = r2.getText();
        r15.getClass();
        if (bu.q((Spanned) r15, sa2.class) == false) goto L56;
    L58:
        CharSequence r16 = r2.getText();
        r16.getClass();
        int r17 = 0;
        sa2[] r18 = (sa2[]) ((Spanned) r16).getSpans(0, r2.getText().length(), sa2.class);
    L59:
        this.n = r18;
        if (r18 != null) goto L62;
    L74:
        int r19 = 2;
        int r110 = r17;
    L75:
        if (r18 != null) goto L77;
    L86:
        int r111 = r17;
    L87:
        if (r110 == 0) goto L90;
        if (r111 == 0) goto L90;
        long r20 = ns4.b;
        Throwable r210 = null;
        char r211 = ' ';
        long r212 = 4294967295L;
        int r112 = 1;
        int r113 = 33;
    L130:
        if (r18 == null) goto L144;
        int r21 = r18.length;
        int r36 = r17;
        int r37 = r36;
        int r114 = r37;
    L132:
        if (r114 >= r21) goto L140;
        sa2 r115 = r18[r114];
        int r116 = r115.x;
        if (r116 >= 0) goto L136;
        r36 = Math.max(r36, Math.abs(r116));
    L136:
        int r117 = r115.y;
        if (r117 >= 0) goto L139;
        r37 = Math.max(r36, Math.abs(r117));
    L139:
        r114 = r114 + 1;
        goto L132
    L140:
        if (r36 != 0) goto L143;
        if (r37 != 0) goto L143;
        long r38 = ns4.b;
    L145:
        this.g = Math.max((int) (r20 >> r211), (int) (r38 >> r211));
        this.h = Math.max((int) (r20 & r212), (int) (r38 & r212));
        TextPaint r39 = this.a;
        sa2[] r40 = this.n;
        int r41 = this.f - r112;
        Layout r42 = this.e;
        if (r42.getLineStart(r41) != r42.getLineEnd(r41)) goto L162;
        if (r40 == null) goto L162;
        if (r40.length == 0) goto L162;
        SpannableString r43 = new SpannableString("\u200b");
        if (r40.length == 0) goto L160;
        sa2 r44 = r40[r17];
        int r45 = r43.length();
        if (r41 != 0) goto L156;
    L158:
        ?? r118 = r44.q;
    L159:
        r43.setSpan(new sa2(r44.n, r45, r118, r44.q, r44.r, r44.s), r17, r43.length(), r113);
        int r46 = r17;
        TextDirectionHeuristic r119 = r13;
        StaticLayout r47 = fu.m(r43, r39, Integer.MAX_VALUE, r43.length(), r119, p62.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
        Paint.FontMetricsInt r48 = new Paint.FontMetricsInt();
        r48.ascent = r47.getLineAscent(r46);
        r48.descent = r47.getLineDescent(r46);
        r48.top = r47.getLineTop(r46);
        r48.bottom = r47.getLineBottom(r46);
        ?? r49 = r48;
    L163:
        if (r49 == 0) goto L165;
        int r120 = ((Paint.FontMetricsInt) r49).bottom - ((int) (d(r4) - g(r4)));
    L166:
        this.m = r120;
        this.l = r49;
        Layout r50 = this.e;
        this.i = vr1.t(r50, r4, r50.getPaint());
        Layout r51 = this.e;
        this.j = vr1.u(r51, r4, r51.getPaint());
        return;
    L165:
        r120 = r46;
        goto L166
    L156:
        if (r44.q == false) goto L158;
        r118 = r17;
        goto L159
    L160:
        kf2.m("Array is empty.");
        throw r210;
    L162:
        r46 = r17;
        r49 = r210;
    L143:
        r38 = ns4.a(r36, r37);
        goto L145
    L144:
        r38 = ns4.b;
    L90:
        long r121 = ns4.b;
        if (r28 == false) goto L93;
        r210 = null;
        r211 = ' ';
        r212 = 4294967295L;
        r112 = 1;
        r113 = 33;
    L123:
        if (r110 == 0) goto L125;
        int r122 = r17;
    L126:
        if (r111 == 0) goto L128;
        int r52 = r17;
    L129:
        r20 = ns4.a(r122, r52);
        goto L130
    L128:
        r52 = (int) (r121 & r212);
        goto L129
    L125:
        r122 = (int) (r121 >> r211);
        goto L126
    L93:
        if (this.k == false) goto L98;
        BoringLayout r53 = (BoringLayout) r2;
        r113 = 33;
        if (Build.VERSION.SDK_INT < 33) goto L97;
        ?? r54 = n3.x(r53);
    L104:
        if (r54 == 0) goto L106;
        r210 = null;
        r211 = ' ';
        r212 = 4294967295L;
        r112 = 1;
        goto L123
    L106:
        TextPaint r55 = r2.getPaint();
        CharSequence r123 = r2.getText();
        r210 = null;
        r211 = ' ';
        Rect r56 = uo.u(r55, r123, r2.getLineStart(r17), r2.getLineEnd(r17));
        int r57 = r2.getLineAscent(r17);
        r212 = 4294967295L;
        int r124 = r56.top;
        if (r124 >= r57) goto L110;
        int r58 = r57 - r124;
    L109:
        r112 = 1;
        if (r1 == 1) goto L114;
        r56 = uo.u(r55, r123, r2.getLineStart(r4), r2.getLineEnd(r4));
    L114:
        int r59 = r2.getLineDescent(r4);
        int r60 = r56.bottom;
        if (r60 <= r59) goto L117;
        int r61 = r60 - r59;
    L118:
        if (r58 != 0) goto L121;
        if (r61 == 0) goto L123;
    L121:
        r121 = ns4.a(r58, r61);
        goto L123
    L117:
        r61 = r2.getBottomPadding();
        goto L118
    L110:
        r58 = r2.getTopPadding();
    L97:
        r54 = r17;
        goto L104
    L98:
        r113 = 33;
        StaticLayout r62 = (StaticLayout) r2;
        int r125 = Build.VERSION.SDK_INT;
        if (r125 < 33) goto L102;
        r54 = n3.y(r62);
        goto L104
    L102:
        if (r125 < 28) goto L97;
        r54 = 1;
        goto L104
    L77:
        if (r18.length != 0) goto L79;
        sa2 r63 = null;
    L80:
        if (r63 == null) goto L86;
        if (r63.q == false) goto L86;
        if (r63.s != r19) goto L86;
        r111 = 1;
        goto L87
    L79:
        r63 = r18[r17];
        goto L80
    L62:
        if (r18.length != 0) goto L64;
        sa2 r64 = null;
    L65:
        if (r64 == null) goto L74;
        if (r64.p == false) goto L71;
        r19 = 2;
        if (r64.s != 2) goto L72;
        int r126 = 1;
    L73:
        r110 = r126;
    L72:
        r126 = r17;
        goto L73
    L71:
        r19 = 2;
        goto L72
    L64:
        r64 = r18[r17];
        goto L65
    L56:
        if (r2.getText().length() <= 0) goto L58;
    L57:
        r18 = null;
        r17 = 0;
        goto L59
    L46:
        if (r2.getEllipsisCount(r4) <= 0) goto L48;
    L49:
        r14 = true;
        goto L50
    L48:
        if (r2.getLineEnd(r4) == r22.length()) goto L44;
    L26:
        if (r35.c() > r23) goto L40;
        if (r6 == true) goto L40;
        this.k = true;     // Catch: Throwable -> L168
        if (r11 >= 0) goto L32;
        dz1.a("negative width");     // Catch: Throwable -> L168
    L32:
        if (r11 >= 0) goto L36;
        dz1.a("negative ellipsized width");     // Catch: Throwable -> L168
    L36:
        if (Build.VERSION.SDK_INT < 33) goto L38;
        r2 = n3.g(r22, r24, r11, r3, r9, r28, r26, r11);     // Catch: Throwable -> L168
    L39:
        r7 = r29;
        r13 = r12;
        goto L41
    L38:
        r2 = new BoringLayout(r22, r24, r11, r3, 1.0f, 0.0f, r9, r28, r26, r11);     // Catch: Throwable -> L168
    L168:
        th = move-exception;
        Trace.endSection();
        throw th;
    L19:
        if (((Spanned) r22).nextSpanTransition(-1, r5, ir.class) >= r5) goto L21;
        r6 = true;
        goto L22
    L7:
        if (r25 != 3) goto L9;
        r3 = nr4.a;
        goto L17
    L9:
        if (r25 == 4) goto L11;
        r3 = Layout.Alignment.ALIGN_NORMAL;
        goto L17
    L11:
        r3 = nr4.b;
        goto L17
    L14:
        r3 = Layout.Alignment.ALIGN_OPPOSITE;
        goto L17
    L15:
        r3 = Layout.Alignment.ALIGN_NORMAL;
        goto L17
    }

    public final int a() {
        boolean r0 = this.d;
        Layout r1 = this.e;
        if (r0 == false) goto L5;
        int r2 = r1.getLineBottom(this.f - 1);
    L7:
        return ((r2 + this.g) + this.h) + this.m;
    L5:
        r2 = r1.getHeight();
        goto L7
    }

    public final z40 b() {
        z40 r0 = this.p;
        if (r0 != null) goto L6;
        z40 r1 = new z40(this.e);
        this.p = r1;
        return r1;
    L6:
        return r0;
    }

    public final float c(int r3) {
        float r0 = this.g;
        if (r3 != (this.f - 1)) goto L7;
        Paint.FontMetricsInt r1 = this.l;
        if (r1 == null) goto L7;
        float r2 = g(r3) - r1.ascent;
    L9:
        return r0 + r2;
    L7:
        r2 = this.e.getLineBaseline(r3);
        goto L9
    }

    public final float d(int r4) {
        int r0 = this.f;
        int r1 = r0 - 1;
        Layout r2 = this.e;
        if (r4 != r1) goto L8;
        Paint.FontMetricsInt r3 = this.l;
        if (r3 == null) goto L8;
        return r2.getLineBottom(r4 - 1) + r3.bottom;
    L8:
        float r5 = this.g + r2.getLineBottom(r4);
        if (r4 != (r0 - 1)) goto L11;
        int r6 = this.h;
    L13:
        return r5 + r6;
    L11:
        r6 = 0;
        goto L13
    }

    public final int e(int r3) {
        ThreadLocal r0 = ns4.a;
        Layout r1 = this.e;
        if (r1.getEllipsisCount(r3) <= 0) goto L9;
        if (this.b != TextUtils.TruncateAt.END) goto L9;
        return r1.getText().length();
    L9:
        return r1.getLineEnd(r3);
    }

    public final int f(int r2) {
        int r0 = this.f;
        if (r0 > 0) goto L6;
        return 0;
    L6:
        int r1 = this.e.getLineForOffset(r2);
        int r3 = r0 - 1;
        if (r1 <= r3) goto L9;
        return r3;
    L9:
        return r1;
    }

    public final float g(int r2) {
        float r0 = this.e.getLineTop(r2);
        if (r2 != 0) goto L5;
        int r1 = 0;
    L7:
        return r0 + r1;
    L5:
        r1 = this.g;
        goto L7
    }

    public final float h(int r3, boolean r4) {
        float r5 = b().d(r3, true, r4);
        if (f(r3) != (this.f - 1)) goto L5;
        float r6 = this.i + this.j;
    L7:
        return r6 + r5;
    L5:
        r6 = 0.0f;
        goto L7
    }

    public final float i(int r3, boolean r4) {
        float r5 = b().d(r3, false, r4);
        if (f(r3) != (this.f - 1)) goto L5;
        float r6 = this.i + this.j;
    L7:
        return r6 + r5;
    L5:
        r6 = 0.0f;
        goto L7
    }
}
