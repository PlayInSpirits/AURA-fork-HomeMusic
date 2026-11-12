package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import app.homemusic.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ap {
    public final zo a;
    public final zo b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public ap(Context r11, zo r12) {
        this.b = new zo();
        if (r12 != null) goto L5;
        r12 = new zo();
    L5:
        int r1 = r12.n;
        if (r1 != 0) goto L150;
        AttributeSet r2 = null;
        int r4 = 0;
    L17:
        AttributeSet r5 = r2;
        if (r4 != 0) goto L31;
        r4 = R.style.Widget_MaterialComponents_Badge;
    L31:
        TypedArray r13 = uc5.D(r11, r5, ht3.c, R.attr.badgeStyle, r4, new int[0]);
        Resources r3 = r11.getResources();
        this.c = r13.getDimensionPixelSize(4, -1);
        this.i = r11.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = r11.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = r13.getDimensionPixelSize(14, -1);
        this.e = r13.getDimension(12, r3.getDimension(R.dimen.m3_badge_size));
        this.g = r13.getDimension(17, r3.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = r13.getDimension(3, r3.getDimension(R.dimen.m3_badge_size));
        this.h = r13.getDimension(13, r3.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = r13.getInt(24, 1);
        zo r6 = this.b;
        int r7 = r12.v;
        if (r7 != (-2)) goto L34;
        r7 = 255;
    L34:
        r6.v = r7;
        int r8 = r12.x;
        if (r8 == (-2)) goto L37;
        r6.x = r8;
    L41:
        String r9 = r12.w;
        if (r9 == null) goto L45;
        this.b.w = r9;
    L47:
        zo r10 = this.b;
        r10.B = r12.B;
        CharSequence r14 = r12.C;
        if (r14 != null) goto L50;
        r14 = r11.getString(R.string.mtrl_badge_numberless_content_description);
    L50:
        r10.C = r14;
        zo r15 = this.b;
        int r16 = r12.D;
        if (r16 != 0) goto L53;
        r16 = R.plurals.mtrl_badge_content_description;
    L53:
        r15.D = r16;
        int r17 = r12.E;
        if (r17 != 0) goto L56;
        r17 = R.string.mtrl_exceed_max_badge_number_content_description;
    L56:
        r15.E = r17;
        Boolean r18 = r12.G;
        if (r18 != null) goto L59;
    L62:
        boolean r19 = true;
    L63:
        r15.G = Boolean.valueOf(r19);
        zo r20 = this.b;
        int r21 = r12.y;
        if (r21 != (-2)) goto L66;
        r21 = r13.getInt(21, -2);
    L66:
        r20.y = r21;
        zo r22 = this.b;
        int r23 = r12.z;
        if (r23 != (-2)) goto L69;
        r23 = r13.getInt(22, -2);
    L69:
        r22.z = r23;
        zo r24 = this.b;
        Integer r25 = r12.r;
        if (r25 != null) goto L72;
        int r26 = r13.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
    L73:
        r24.r = Integer.valueOf(r26);
        zo r27 = this.b;
        Integer r28 = r12.s;
        if (r28 != null) goto L76;
        int r29 = r13.getResourceId(6, 0);
    L77:
        r27.s = Integer.valueOf(r29);
        zo r30 = this.b;
        Integer r31 = r12.t;
        if (r31 != null) goto L80;
        int r32 = r13.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
    L81:
        r30.t = Integer.valueOf(r32);
        zo r33 = this.b;
        Integer r34 = r12.u;
        if (r34 != null) goto L84;
        int r35 = r13.getResourceId(16, 0);
    L85:
        r33.u = Integer.valueOf(r35);
        zo r36 = this.b;
        Integer r37 = r12.o;
        if (r37 != null) goto L88;
        int r38 = h12.s(r11, r13, 1).getDefaultColor();
    L89:
        r36.o = Integer.valueOf(r38);
        zo r39 = this.b;
        Integer r40 = r12.q;
        if (r40 != null) goto L92;
        int r41 = r13.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge);
    L93:
        r39.q = Integer.valueOf(r41);
        Integer r42 = r12.p;
        if (r42 == null) goto L96;
        this.b.p = r42;
    L100:
        zo r43 = this.b;
        Integer r44 = r12.F;
        if (r44 != null) goto L103;
        int r0 = r13.getInt(2, 8388661);
    L104:
        r43.F = Integer.valueOf(r0);
        zo r45 = this.b;
        Integer r46 = r12.H;
        if (r46 != null) goto L107;
        int r47 = r13.getDimensionPixelSize(11, r3.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
    L108:
        r45.H = Integer.valueOf(r47);
        zo r48 = this.b;
        Integer r49 = r12.I;
        if (r49 != null) goto L111;
        int r50 = r13.getDimensionPixelSize(10, r3.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
    L112:
        r48.I = Integer.valueOf(r50);
        zo r51 = this.b;
        Integer r52 = r12.J;
        if (r52 != null) goto L115;
        int r53 = r13.getDimensionPixelOffset(18, 0);
    L116:
        r51.J = Integer.valueOf(r53);
        zo r54 = this.b;
        Integer r55 = r12.K;
        if (r55 != null) goto L119;
        int r56 = r13.getDimensionPixelOffset(25, 0);
    L120:
        r54.K = Integer.valueOf(r56);
        zo r57 = this.b;
        Integer r58 = r12.L;
        if (r58 != null) goto L123;
        int r59 = r13.getDimensionPixelOffset(19, r57.J.intValue());
    L124:
        r57.L = Integer.valueOf(r59);
        zo r60 = this.b;
        Integer r61 = r12.M;
        if (r61 != null) goto L127;
        int r62 = r13.getDimensionPixelOffset(26, r60.K.intValue());
    L128:
        r60.M = Integer.valueOf(r62);
        zo r63 = this.b;
        Integer r64 = r12.P;
        if (r64 != null) goto L131;
        int r65 = r13.getDimensionPixelOffset(20, 0);
    L132:
        r63.P = Integer.valueOf(r65);
        zo r66 = this.b;
        Integer r67 = r12.N;
        if (r67 != null) goto L135;
        int r68 = 0;
    L136:
        r66.N = Integer.valueOf(r68);
        zo r69 = this.b;
        Integer r70 = r12.O;
        if (r70 != null) goto L139;
        int r71 = 0;
    L140:
        r69.O = Integer.valueOf(r71);
        zo r72 = this.b;
        Boolean r73 = r12.Q;
        if (r73 != null) goto L143;
        boolean r74 = r13.getBoolean(0, false);
    L144:
        r72.Q = Boolean.valueOf(r74);
        r13.recycle();
        Locale r110 = r12.A;
        zo r75 = this.b;
        if (r110 != null) goto L147;
        r75.A = Locale.getDefault(Locale.Category.FORMAT);
    L148:
        this.a = r12;
        return;
    L147:
        r75.A = r110;
        goto L148
    L143:
        r74 = r73.booleanValue();
        goto L144
    L139:
        r71 = r70.intValue();
        goto L140
    L135:
        r68 = r67.intValue();
        goto L136
    L131:
        r65 = r64.intValue();
        goto L132
    L127:
        r62 = r61.intValue();
        goto L128
    L123:
        r59 = r58.intValue();
        goto L124
    L119:
        r56 = r55.intValue();
        goto L120
    L115:
        r53 = r52.intValue();
        goto L116
    L111:
        r50 = r49.intValue();
        goto L112
    L107:
        r47 = r46.intValue();
        goto L108
    L103:
        r0 = r44.intValue();
        goto L104
    L96:
        boolean r76 = r13.hasValue(9);
        zo r77 = this.b;
        if (r76 == false) goto L99;
        r77.p = Integer.valueOf(h12.s(r11, r13, 9).getDefaultColor());
        goto L100
    L99:
        rr4 r78 = new rr4(r11, r77.q.intValue());
        this.b.p = Integer.valueOf(r78.j.getDefaultColor());
        goto L100
    L92:
        r41 = r40.intValue();
        goto L93
    L88:
        r38 = r37.intValue();
        goto L89
    L84:
        r35 = r34.intValue();
        goto L85
    L80:
        r32 = r31.intValue();
        goto L81
    L76:
        r29 = r28.intValue();
        goto L77
    L72:
        r26 = r25.intValue();
        goto L73
    L59:
        if (r18.booleanValue() == true) goto L62;
        r19 = false;
        goto L63
    L45:
        if (r13.hasValue(7) == false) goto L47;
        this.b.w = r13.getString(7);
        goto L47
    L37:
        boolean r79 = r13.hasValue(23);
        zo r80 = this.b;
        if (r79 == false) goto L40;
        r80.x = r13.getInt(23, 0);
        goto L41
    L40:
        r80.x = -1;
        goto L41
    L150:
        XmlResourceParser r81 = r11.getResources().getXml(r1);     // Catch: IOException -> L18 Throwable -> L20
    L9:
        int r82 = r81.next();     // Catch: IOException -> L18 Throwable -> L20
        if (r82 == 2) goto L12;
        if (r82 != 1) goto L9;
    L12:
        if (r82 != 2) goto L25;
        if (TextUtils.equals(r81.getName(), "badge") == false) goto L23;
        r2 = Xml.asAttributeSet(r81);     // Catch: IOException -> L18 Throwable -> L20
        r4 = r2.getStyleAttribute();
        goto L17
    L23:
        throw new XmlPullParserException("Must have a <badge> start tag");     // Catch: IOException -> L18 Throwable -> L20
    L25:
        throw new XmlPullParserException("No start tag found");     // Catch: IOException -> L18 Throwable -> L20
    L20:
        e = move-exception;
        Resources.NotFoundException r111 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(r1));
        r111.initCause(e);
        throw r111;
    }
}
