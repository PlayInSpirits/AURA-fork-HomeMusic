package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import app.homemusic.R;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.Inflater;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uc5 {
    public static final f01 a = null;
    public static final f01 b = null;
    public static final byte[] c = null;
    public static final float[] d = null;
    public static final Object e = null;
    public static int[] f = null;
    public static final int[] g = null;
    public static final int[] h = null;
    public static volatile boolean i = true;
    public static Boolean j;

    static {
        a = new f01(1, "UNDEFINED");
        b = new f01(1, "REUSABLE_CLAIMED");
        c = new byte[]{0, 0, 0, 1};
        d = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        e = new Object();
        f = new int[10];
        g = new int[]{R.attr.colorPrimary};
        h = new int[]{R.attr.colorPrimaryVariant};
    }

    public static Drawable A(Context r1, int r2, Resources.Theme r3) {
        if (r3 == null) goto L5;
        ud0 r0 = new ud0(r1);
        r0.b = r3;
        r0.a(r3.getResources().getConfiguration());
        r1 = r0;
    L5:
        return zz1.r(r1, r2);
    }

    public static zd3 B(Object r2) {
        return new zd3(r2, rv2.D);
    }

    public static int C(tb1 r1) {
        String r2 = r(r1);
        if (Objects.equals(r2, "video/avc") == false) goto L7;
        return 1;
    L7:
        if (Objects.equals(r2, "video/hevc") == false) goto L10;
        return 2;
    L10:
        return 0;
    }

    public static TypedArray D(Context r0, AttributeSet r1, int[] r2, int r3, int r4, int... r5) {
        c(r0, r1, r3, r4);
        g(r0, r1, r2, r3, r4, r5);
        return r0.obtainStyledAttributes(r1, r2, r3, r4);
    }

    public static jv3 E(Context r0, AttributeSet r1, int[] r2, int r3, int r4, int... r5) {
        c(r0, r1, r3, r4);
        g(r0, r1, r2, r3, r4, r5);
        return new jv3(r0, r0.obtainStyledAttributes(r1, r2, r3, r4));
    }

    public static v2 F(h00 r3) {
        r3.s();
        return new v2(r3.i(6), r3.i(6), r3.i(3) - 1);
    }

    public static p13 G(h00 r19, boolean r20, int r21, p13 r22) {
        int[] r4 = new int[6];
        int r7 = 0;
        if (r20 == false) goto L16;
        int r2 = r19.i(2);
        boolean r8 = r19.h();
        int r9 = r19.i(5);
        int r10 = 0;
        int r11 = 0;
    L6:
        if (r10 >= 32) goto L11;
        if (r19.h() == false) goto L10;
        r11 = r11 | (1 << r10);
    L10:
        r10 = r10 + 1;
        goto L6
    L11:
        int r12 = 0;
    L12:
        if (r12 >= 6) goto L14;
        r4[r12] = r19.i(8);
        r12 = r12 + 1;
        goto L12
    L14:
        int r13 = r2;
    L15:
        int[] r17 = r4;
        boolean r14 = r8;
        int r15 = r9;
        int r16 = r11;
    L19:
        int r18 = r19.i(8);
        int r3 = 0;
    L20:
        if (r7 >= r21) goto L28;
        if (r19.h() == false) goto L25;
        r3 = r3 + 88;
    L25:
        if (r19.h() == false) goto L27;
        r3 = r3 + 8;
    L27:
        r7 = r7 + 1;
        goto L20
    L28:
        r19.t(r3);
        if (r21 <= 0) goto L32;
        r19.t((8 - r21) * 2);
    L32:
        return new p13(r13, r14, r15, r16, r17, r18);
    L16:
        if (r22 == null) goto L18;
        int r5 = r22.a;
        r8 = r22.b;
        r9 = r22.c;
        r11 = r22.d;
        r4 = r22.e;
        r13 = r5;
        goto L15
    L18:
        r17 = r4;
        r13 = 0;
        r14 = false;
        r15 = 0;
        r16 = 0;
        goto L19
    }

    public static cx H(byte[] r8, int r9, int r10) {
        int r11 = r9 + 2;
    L3:
        r10 = r10 - 1;
        byte r0 = r8[r10];
        if (r0 != 0) goto L7;
        if (r10 > r11) goto L3;
    L7:
        if (r0 == 0) goto L55;
        if (r10 <= r11) goto L70;
        h00 r1 = new h00(r8, r11, r10 + 1);
    L12:
        if (r1.d(16) == false) goto L71;
        int r12 = r1.i(8);
        int r2 = 0;
    L15:
        if (r12 != 255) goto L17;
        r2 = r2 + 255;
        r12 = r1.i(8);
        goto L15
    L17:
        int r3 = r2 + r12;
        int r13 = r1.i(8);
        int r4 = 0;
    L18:
        if (r13 != 255) goto L20;
        r4 = r4 + 255;
        r13 = r1.i(8);
        goto L18
    L20:
        int r5 = r4 + r13;
        if (r5 == 0) goto L72;
        if (r1.d(r5) == false) goto L73;
        if (r3 == 176) goto L27;
        r1.t(r5 * 8);
        goto L12
    L27:
        int r14 = r1.m();
        boolean r15 = r1.h();
        if (r15 == false) goto L30;
        int r6 = r1.m();
    L31:
        int r7 = r1.m();
        int r16 = -1;
        int r17 = 0;
    L32:
        if (r17 > r7) goto L53;
        r16 = r1.m();
        r1.m();
        int r18 = r1.i(6);
        if (r18 == 63) goto L74;
        if (r18 != 0) goto L38;
        int r19 = Math.max(0, r14 - 30);
    L39:
        r1.i(r19);
        if (r15 == false) goto L49;
        int r20 = r1.i(6);
        if (r20 == 63) goto L75;
        if (r20 != 0) goto L46;
        int r21 = Math.max(0, r6 - 30);
    L47:
        r1.i(r21);
        goto L49
    L46:
        r21 = Math.max(0, (r20 + r6) - 31);
        goto L47
    L75:
        return null;
    L49:
        if (r1.h() == false) goto L51;
        r1.t(10);
    L51:
        r17 = r17 + 1;
        goto L32
    L38:
        r19 = Math.max(0, (r18 + r14) - 31);
        goto L39
    L74:
        return null;
    L53:
        return new cx(r16);
    L30:
        r6 = 0;
        goto L31
    L73:
        return null;
    L72:
        return null;
    L71:
        return null;
    L70:
        return null;
    L55:
        return null;
    }

    public static r13 I(byte[] r32, int r33, int r34, ss0 r35) {
        v2 r4 = F(new h00(r32, r33, r34));
        h00 r6 = new h00(r32, r33 + 2, r34);
        int r0 = 4;
        r6.t(4);
        int r8 = r6.i(3);
        int r2 = r4.b;
        if (r2 != 0) goto L5;
    L7:
        boolean r9 = false;
    L8:
        if (r35 == null) goto L12;
        yw1 r10 = (yw1) r35.n;
        if (r10.isEmpty() == true) goto L12;
        int r3 = ((o13) r10.get(Math.min(r2, r10.size() - 1))).a;
    L13:
        p13 r11 = null;
        if (r9 == true) goto L16;
        r6.s();
        r11 = G(r6, true, r8, null);
    L20:
        r6.m();
        if (r9 == true) goto L23;
        int r12 = r6.m();
        if (r12 != 3) goto L40;
        r6.s();
    L40:
        int r14 = r6.m();
        int r15 = r6.m();
        if (r6.h() == false) goto L53;
        int r13 = r6.m();
        int r16 = r6.m();
        int r17 = r6.m();
        int r18 = r6.m();
        if (r12 == 1) goto L47;
        if (r12 == 2) goto L47;
        int r19 = 1;
    L48:
        int r110 = r14 - ((r13 + r16) * r19);
        if (r12 != 1) goto L51;
        int r111 = 2;
    L52:
        int r112 = r15 - ((r17 + r18) * r111);
    L54:
        int r113 = r112;
        int r114 = r6.m();
        int r115 = r110;
        int r116 = r6.m();
        int r117 = r15;
        int r118 = r14;
    L55:
        int r119 = r6.m();
        if (r9 == false) goto L58;
        int r120 = -1;
    L65:
        r6.m();
        r6.m();
        r6.m();
        r6.m();
        r6.m();
        r6.m();
        if (r6.h() == false) goto L94;
        if (r9 == false) goto L69;
        boolean r5 = r6.h();
    L70:
        int r7 = 6;
        if (r5 == false) goto L75;
        r6.t(6);
        goto L94
    L75:
        if (r6.h() == false) goto L94;
        int r20 = 0;
    L77:
        if (r20 >= r0) goto L94;
        int r21 = 0;
    L79:
        if (r21 >= r7) goto L93;
        if (r6.h() == true) goto L83;
        r6.m();
    L89:
        if (r20 != 3) goto L91;
        int r1 = 3;
    L92:
        r21 = r21 + r1;
        r7 = 6;
        goto L79
    L91:
        r1 = 1;
        goto L92
    L83:
        int r22 = Math.min(64, 1 << ((r20 << 1) + 4));
        if (r20 <= 1) goto L86;
        r6.n();
    L86:
        int r23 = 0;
    L87:
        if (r23 >= r22) goto L89;
        r6.n();
        r23 = r23 + 1;
        goto L87
    L93:
        r20 = r20 + 1;
        r0 = 4;
        r7 = 6;
        goto L77
    L69:
        r5 = false;
    L94:
        r6.t(2);
        if (r6.h() == false) goto L97;
        r6.t(8);
        r6.m();
        r6.m();
        r6.s();
    L97:
        int r24 = r6.m();
        int[] r25 = new int[0];
        int[] r26 = new int[0];
        int r27 = 0;
        int r28 = -1;
        int r29 = -1;
    L98:
        if (r27 >= r24) goto L164;
        if (r27 != 0) goto L101;
    L150:
        int r30 = r6.m();
        r28 = r6.m();
        int[] r31 = new int[r30];
        int r36 = 0;
    L151:
        if (r36 >= r30) goto L156;
        if (r36 <= 0) goto L154;
        int r37 = r31[r36 - 1];
    L155:
        r31[r36] = r37 - (r6.m() + 1);
        r6.s();
        r36 = r36 + 1;
        goto L151
    L154:
        r37 = 0;
        goto L155
    L156:
        int[] r38 = new int[r28];
        int r39 = 0;
    L157:
        if (r39 >= r28) goto L162;
        if (r39 <= 0) goto L160;
        int r40 = r38[r39 - 1];
    L161:
        r38[r39] = (r6.m() + 1) + r40;
        r6.s();
        r39 = r39 + 1;
        goto L157
    L160:
        r40 = 0;
        goto L161
    L162:
        r29 = r30;
        r25 = r31;
        r26 = r38;
    L163:
        r27 = r27 + 1;
        r24 = r24;
        r3 = r3;
        goto L98
    L101:
        if (r6.h() == false) goto L150;
        int r41 = r29 + r28;
        boolean r210 = r6.h();
        int r211 = (1 - ((r210 ? 1 : 0) * 2)) * (r6.m() + 1);
        int r42 = r41 + 1;
        boolean[] r43 = new boolean[r42];
        int r44 = 0;
    L103:
        if (r44 > r41) goto L109;
        if (r6.h() == true) goto L107;
        r43[r44] = r6.h();
    L108:
        r44 = r44 + 1;
        goto L103
    L107:
        r43[r44] = true;
        goto L108
    L109:
        int[] r45 = new int[r42];
        int[] r46 = new int[r42];
        int r212 = r28 - 1;
        int r213 = 0;
    L110:
        if (r212 < 0) goto L117;
        int r214 = r26[r212] + r211;
        if (r214 >= 0) goto L116;
        if (r43[r29 + r212] == false) goto L116;
        r45[r213] = r214;
        r213 = r213 + 1;
    L116:
        r212 = r212 - 1;
        goto L110
    L117:
        if (r211 < 0) goto L119;
    L121:
        int r47 = r213;
        int[] r215 = r25;
        int r48 = 0;
    L122:
        if (r48 >= r29) goto L129;
        int r216 = r215[r48] + r211;
        if (r216 >= 0) goto L128;
        if (r43[r48] == false) goto L128;
        r45[r47] = r216;
        r47 = r47 + 1;
    L128:
        r48 = r48 + 1;
        goto L122
    L129:
        int[] r49 = Arrays.copyOf(r45, r47);
        int r50 = r29 - 1;
        int r217 = 0;
    L130:
        if (r50 < 0) goto L137;
        int r218 = r215[r50] + r211;
        if (r218 <= 0) goto L136;
        if (r43[r50] == false) goto L136;
        r46[r217] = r218;
        r217 = r217 + 1;
    L136:
        r50 = r50 - 1;
        goto L130
    L137:
        if (r211 > 0) goto L139;
    L141:
        int r219 = r47;
        int r51 = r217;
        int r52 = 0;
    L142:
        if (r52 >= r28) goto L149;
        int r220 = r26[r52] + r211;
        if (r220 <= 0) goto L148;
        if (r43[r29 + r52] == false) goto L148;
        r46[r51] = r220;
        r51 = r51 + 1;
    L148:
        r52 = r52 + 1;
        goto L142
    L149:
        r26 = Arrays.copyOf(r46, r51);
        r28 = r51;
        r29 = r219;
        r25 = r49;
        goto L163
    L139:
        if (r43[r41] == false) goto L141;
        r46[r217] = r211;
        r217 = r217 + 1;
        goto L141
    L119:
        if (r43[r41] == false) goto L121;
        r45[r213] = r211;
        r213 = r213 + 1;
        goto L121
    L164:
        int r221 = r3;
        if (r6.h() == false) goto L169;
        int r53 = r6.m();
        int r54 = 0;
    L167:
        if (r54 >= r53) goto L169;
        r6.t(r119 + 5);
        r54 = r54 + 1;
    L169:
        r6.t(2);
        float r55 = 1.0f;
        if (r6.h() == true) goto L172;
        int r121 = -1;
        int r122 = -1;
        int r222 = -1;
    L213:
        return new r13(r8, r11, r114, r116, r115, r113, r118, r117, r55, r120, r121, r122, r222);
    L172:
        if (r6.h() == false) goto L184;
        int r56 = r6.i(8);
        if (r56 != 255) goto L180;
        int r57 = r6.i(16);
        int r58 = r6.i(16);
        if (r57 == 0) goto L184;
        if (r58 == 0) goto L184;
        r55 = r57 / r58;
        goto L184
    L180:
        if (r56 >= 17) goto L182;
        r55 = d[r56];
        goto L184
    L182:
        xa3.m(r56, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
    L184:
        if (r6.h() == false) goto L187;
        r6.s();
    L187:
        if (r6.h() == false) goto L196;
        r6.t(3);
        if (r6.h() == false) goto L191;
        int r59 = 1;
    L193:
        if (r6.h() == false) goto L195;
        int r60 = r6.i(8);
        int r61 = r6.i(8);
        r6.t(8);
        int r62 = c50.f(r60);
        int r63 = c50.g(r61);
    L204:
        if (r6.h() == false) goto L206;
        r6.m();
        r6.m();
    L206:
        r6.s();
        if (r6.h() == false) goto L209;
        r113 = r113 * 2;
    L209:
        r121 = r62;
        r222 = r63;
        r122 = r59;
        goto L213
    L195:
        r62 = -1;
        r63 = -1;
        goto L204
    L191:
        r59 = 2;
        goto L193
    L196:
        if (r35 == null) goto L202;
        wo0 r64 = (wo0) r35.q;
        if (r64 == null) goto L202;
        yw1 r65 = (yw1) r64.n;
        int r66 = ((int[]) r64.o)[r221];
        if (r65.size() <= r66) goto L202;
        s13 r67 = (s13) r65.get(r66);
        int r68 = r67.a;
        int r69 = r67.b;
        r63 = r67.c;
        r62 = r68;
        r59 = r69;
    L202:
        r62 = -1;
        r63 = -1;
        r59 = -1;
        goto L204
    L58:
        if (r6.h() == false) goto L60;
        int r123 = 0;
    L61:
        int r70 = r123;
        r120 = -1;
    L62:
        if (r70 > r8) goto L65;
        r6.m();
        r120 = Math.max(r6.m(), r120);
        r6.m();
        r70 = r70 + 1;
        goto L62
    L60:
        r123 = r8;
        goto L61
    L51:
        r111 = 1;
    L47:
        r19 = 2;
        goto L48
    L53:
        r110 = r14;
        r112 = r15;
        goto L54
    L23:
        if (r6.h() == false) goto L25;
        int r124 = r6.i(8);
    L26:
        if (r35 == null) goto L36;
        hd5 r125 = (hd5) r35.p;
        if (r125 == null) goto L36;
        yw1 r126 = (yw1) r125.o;
        if (r124 != (-1)) goto L32;
        r124 = ((int[]) r125.p)[r3];
    L32:
        if (r124 == (-1)) goto L36;
        if (r126.size() <= r124) goto L36;
        q13 r127 = (q13) r126.get(r124);
        int r128 = r127.a;
        r115 = r127.d;
        int r129 = r127.e;
        r114 = r127.b;
        r116 = r127.c;
        r113 = r129;
        r117 = r113;
        r118 = r115;
    L36:
        r114 = 0;
        r116 = 0;
        r115 = 0;
        r118 = 0;
        r113 = 0;
        r117 = 0;
        goto L55
    L25:
        r124 = -1;
        goto L26
    L16:
        if (r35 == null) goto L20;
        xc5 r130 = (xc5) r35.o;
        int[] r131 = (int[]) r130.p;
        yw1 r132 = (yw1) r130.o;
        int r133 = r131[r3];
        if (r132.size() <= r133) goto L20;
        r11 = (p13) r132.get(r133);
    L12:
        r3 = 0;
        goto L13
    L5:
        if (r8 != 7) goto L7;
        r9 = true;
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ss0 J(byte[] r40, int r41, int r42) {
        h00 r0 = new h00(r40, r41, r42);
        F(r0);
        r0.t(4);
        boolean r2 = r0.h();
        boolean r3 = r0.h();
        int r5 = r0.i(6);
        int r6 = r5 + 1;
        int r8 = r0.i(3);
        r0.t(17);
        p13 r11 = G(r0, true, r8, null);
        if (r0.h() == false) goto L5;
        int r12 = 0;
    L6:
        if (r12 > r8) goto L8;
        r0.m();
        r0.m();
        r0.m();
        r12 = r12 + 1;
        goto L6
    L8:
        int r13 = r0.i(6);
        int r14 = r0.m() + 1;
        int r43 = 6;
        xc5 r4 = new xc5(yw1.o(r11), new int[1]);
        if (r6 < 2) goto L12;
        if (r14 < 2) goto L12;
        boolean r15 = true;
    L13:
        if (r2 == false) goto L16;
        if (r3 == false) goto L16;
        boolean r7 = true;
    L17:
        int r9 = r13 + 1;
        if (r9 < r6) goto L20;
        boolean r16 = true;
    L21:
        if (r15 == false) goto L470;
        if (r7 == false) goto L470;
        if (r16 == false) goto L470;
        Class r17 = Integer.TYPE;
        int[][] r10 = (int[][]) Array.newInstance(r17, new int[]{r14, r9});
        int r44 = 1;
        int[] r18 = new int[r14];
        int[] r19 = new int[r14];
        r10[0][0] = 0;
        r18[0] = 1;
        r19[0] = 0;
        int r110 = 1;
    L26:
        if (r110 >= r14) goto L35;
        int r111 = 0;
        int r112 = 0;
    L28:
        if (r111 > r13) goto L33;
        if (r0.h() == false) goto L32;
        r10[r110][r112] = r111;
        r19[r110] = r111;
        r112 = r112 + 1;
    L32:
        r18[r110] = r112;
        r111 = r111 + 1;
        goto L28
    L33:
        r110 = r110 + 1;
        goto L26
    L35:
        if (r0.h() == false) goto L81;
        r0.t(64);
        if (r0.h() == false) goto L39;
        r0.m();
    L39:
        int r113 = r0.m();
        int r1 = 0;
    L40:
        if (r1 >= r113) goto L81;
        r0.m();
        if (r1 != 0) goto L44;
    L48:
        boolean r20 = r0.h();
        boolean r21 = r0.h();
        boolean r22 = r20;
        boolean r23 = r21;
        if (r20 == true) goto L51;
        if (r21 == true) goto L51;
    L47:
        boolean r24 = false;
        int r25 = r22;
        int r26 = r23;
    L58:
        int r114 = 0;
    L59:
        if (r114 > r8) goto L80;
        boolean r27 = r0.h();
        if (r27 == true) goto L63;
        r27 = r0.h();
    L63:
        if (r27 == false) goto L65;
        r0.m();
        boolean r28 = false;
    L66:
        if (r28 == true) goto L69;
        int r29 = r0.m();
    L68:
        int[][] r210 = r10;
        int r30 = r25 + r26;
        int[] r211 = r19;
        int r31 = 0;
    L71:
        if (r31 >= r30) goto L79;
        int r212 = r30;
        int r32 = 0;
    L73:
        if (r32 > r29) goto L78;
        r0.m();
        r0.m();
        if (r24 == false) goto L77;
        r0.m();
        r0.m();
    L77:
        r0.s();
        r32 = r32 + 1;
        goto L73
    L78:
        r31 = r31 + 1;
        r30 = r212;
        goto L71
    L79:
        r114 = r114 + 1;
        r1 = r1;
        r10 = r210;
        r19 = r211;
        goto L59
    L69:
        r29 = 0;
        goto L68
    L65:
        r28 = r0.h();
        goto L66
    L80:
        r1 = r1 + 1;
    L51:
        r24 = r0.h();
        if (r24 == false) goto L54;
        r0.t(19);
    L54:
        r0.t(8);
        if (r24 == false) goto L57;
        r0.t(4);
    L57:
        r0.t(15);
        r25 = r20;
        r26 = r21;
        goto L58
    L44:
        if (r0.h() == true) goto L48;
        r22 = false;
        r23 = false;
    L81:
        int[][] r213 = r10;
        int[] r214 = r19;
        if (r0.h() == false) goto L84;
        int r33 = r0.e;
        if (r33 <= 0) goto L88;
        r0.t(8 - r33);
    L88:
        p13 r34 = G(r0, false, r8, r11);
        boolean r35 = r0.h();
        boolean[] r115 = new boolean[16];
        int r36 = 0;
        int r116 = 0;
    L89:
        if (r116 >= 16) goto L94;
        boolean r215 = r0.h();
        r115[r116] = r215;
        if (r215 == false) goto L93;
        r36 = r36 + 1;
    L93:
        r116 = r116 + 1;
        goto L89
    L94:
        if (r36 == 0) goto L468;
        if (r115[1] == false) goto L468;
        int[] r117 = new int[r36];
        int r37 = 0;
    L100:
        if (r37 >= (r36 - (r35 ? 1 : 0))) goto L102;
        r117[r37] = r0.i(3);
        r37 = r37 + 1;
        goto L100
    L102:
        int[] r38 = new int[r36 + 1];
        if (r35 == false) goto L112;
        int r39 = 1;
    L105:
        if (r39 >= r36) goto L110;
        int[] r216 = r38;
        int r45 = 0;
    L107:
        if (r45 >= r39) goto L109;
        r216[r39] = (r117[r45] + 1) + r216[r39];
        r45 = r45 + 1;
        goto L107
    L109:
        r39 = r39 + 1;
        r38 = r216;
        goto L105
    L110:
        int[] r217 = r38;
        r217[r36] = 6;
    L113:
        int[][] r46 = (int[][]) Array.newInstance(r17, new int[]{r6, r36});
        int[] r47 = new int[r6];
        r47[0] = 0;
        boolean r118 = r0.h();
        int r48 = 1;
    L114:
        if (r48 >= r6) goto L126;
        if (r118 == false) goto L117;
        int r218 = r48;
        r47[r218] = r0.i(r43);
    L118:
        if (r35 == true) goto L122;
        int r49 = 0;
    L120:
        if (r49 >= r36) goto L125;
        int r310 = r49;
        r46[r218][r310] = r0.i(r117[r49] + 1);
        r49 = r310 + 1;
    L125:
        r48 = r218 + 1;
        r43 = 6;
        goto L114
    L122:
        int r50 = 0;
    L123:
        if (r50 >= r36) goto L125;
        int r311 = r50 + 1;
        r46[r218][r50] = (r47[r218] & ((1 << r217[r311]) - 1)) >> r217[r50];
        r50 = r311;
        goto L123
    L117:
        r218 = r48;
        r47[r218] = r218;
        goto L118
    L126:
        int[] r51 = new int[r9];
        int r52 = 1;
        int r119 = 0;
    L128:
        if (r119 >= r6) goto L148;
        r51[r47[r119]] = -1;
        int[] r219 = r51;
        int r120 = 0;
        int r220 = 0;
    L131:
        if (r120 >= 16) goto L139;
        if (r115[r120] == false) goto L138;
        if (r120 != r44) goto L137;
        r219[r47[r119]] = r46[r119][r220];
    L137:
        r220 = r220 + 1;
    L138:
        r120 = r120 + 1;
        r44 = 1;
        goto L131
    L139:
        if (r119 <= 0) goto L147;
        int r53 = 0;
    L141:
        if (r53 >= r119) goto L146;
        int r221 = r53;
        if (r219[r47[r119]] == r219[r47[r53]]) goto L147;
        r53 = r221 + 1;
        goto L141
    L146:
        r52 = r52 + 1;
    L147:
        r119 = r119 + 1;
        r51 = r219;
        r44 = 1;
        goto L128
    L148:
        int[] r222 = r51;
        int r54 = r0.i(4);
        if (r52 < 2) goto L466;
        if (r54 == 0) goto L466;
        int[] r121 = new int[r52];
        int r122 = 0;
    L153:
        if (r122 >= r52) goto L155;
        r121[r122] = r0.i(r54);
        r122 = r122 + 1;
        goto L153
    L155:
        int[] r55 = new int[r9];
        int r123 = 0;
    L156:
        if (r123 >= r6) goto L158;
        r55[Math.min(r47[r123], r13)] = r123;
        r123 = r123 + 1;
        goto L156
    L158:
        uw1 r124 = yw1.j();
        int r125 = 0;
    L159:
        if (r125 > r13) goto L165;
        int[] r223 = r55;
        int r224 = r52;
        int r56 = Math.min(r222[r125], r224 - 1);
        if (r56 < 0) goto L163;
        int r57 = r121[r56];
    L164:
        r124.c(new o13(r223[r125], r57));
        r125 = r125 + 1;
        r55 = r223;
        r47 = r47;
        r52 = r224;
        goto L159
    L163:
        r57 = -1;
        goto L164
    L165:
        int[] r225 = r47;
        gy3 r58 = r124.f();
        if (((o13) r58.get(0)).b == (-1)) goto L168;
        int r59 = 1;
    L170:
        if (r59 > r13) goto L175;
        if (((o13) r58.get(r59)).b != (-1)) goto L176;
        r59 = r59 + 1;
    L176:
        if (r59 == (-1)) goto L178;
        Class r126 = Boolean.TYPE;
        boolean[][] r60 = (boolean[][]) Array.newInstance(r126, new int[]{r6, r6});
        boolean[][] r127 = (boolean[][]) Array.newInstance(r126, new int[]{r6, r6});
        int r128 = 1;
    L180:
        if (r128 >= r6) goto L185;
        int r129 = 0;
    L182:
        if (r129 >= r128) goto L184;
        boolean[] r226 = r60[r128];
        boolean[] r227 = r127[r128];
        boolean r228 = r0.h();
        r227[r129] = r228;
        r226[r129] = r228;
        r129 = r129 + 1;
        goto L182
    L184:
        r128 = r128 + 1;
        goto L180
    L185:
        int r130 = 1;
    L186:
        if (r130 >= r6) goto L199;
        int r131 = 0;
    L188:
        if (r131 >= r5) goto L198;
        boolean[][] r410 = r60;
        int r61 = 0;
    L190:
        if (r61 >= r130) goto L197;
        boolean[] r229 = r127[r130];
        if (r229[r61] == false) goto L196;
        if (r127[r61][r131] == false) goto L196;
        r229[r131] = true;
    L196:
        r61 = r61 + 1;
    L197:
        r131 = r131 + 1;
        r60 = r410;
        goto L188
    L198:
        r130 = r130 + 1;
        goto L186
    L199:
        boolean[][] r411 = r60;
        int[] r62 = new int[r9];
        int r132 = 0;
    L200:
        if (r132 >= r6) goto L205;
        int r133 = 0;
        int r230 = 0;
    L202:
        if (r133 >= r132) goto L204;
        r230 = r230 + (r411[r132][r133] ? 1 : 0);
        r133 = r133 + 1;
        goto L202
    L204:
        r62[r225[r132]] = r230;
        r132 = r132 + 1;
        goto L200
    L205:
        int r134 = 0;
        int r135 = 0;
    L206:
        if (r134 >= r6) goto L212;
        if (r62[r225[r134]] != 0) goto L210;
        r135 = r135 + 1;
    L210:
        r134 = r134 + 1;
        goto L206
    L212:
        if (r135 > 1) goto L214;
        int[] r136 = new int[r6];
        int[] r137 = new int[r14];
        if (r0.h() == false) goto L220;
        int r63 = 0;
    L218:
        if (r63 >= r6) goto L221;
        int r231 = r63;
        r136[r231] = r0.i(3);
        r63 = r231 + 1;
    L221:
        int r64 = 0;
    L222:
        if (r64 >= r14) goto L228;
        int r232 = r64;
        boolean[][] r233 = r127;
        int[] r234 = r136;
        int r65 = 0;
        int r138 = 0;
    L225:
        if (r65 >= r18[r232]) goto L227;
        r138 = Math.max(r138, r234[((o13) r58.get(r213[r232][r65])).a]);
        r65 = r65 + 1;
        goto L225
    L227:
        r137[r232] = r138 + 1;
        r64 = r232 + 1;
        r127 = r233;
        r136 = r234;
        goto L222
    L228:
        boolean[][] r235 = r127;
        if (r0.h() == false) goto L240;
        int r66 = 0;
    L231:
        if (r66 >= r5) goto L240;
        int r139 = r66 + 1;
        int r140 = r139;
    L233:
        if (r140 >= r6) goto L239;
        if (r411[r140][r66] == false) goto L238;
        r0.t(3);
    L238:
        r140 = r140 + 1;
        r5 = r5;
        goto L233
    L239:
        r66 = r139;
    L240:
        r0.s();
        int r67 = r0.m() + 1;
        uw1 r68 = yw1.j();
        r68.c(r11);
        if (r67 <= 1) goto L245;
        r68.c(r34);
        int r141 = 2;
    L243:
        if (r141 >= r67) goto L245;
        r34 = G(r0, r0.h(), r8, r34);
        r68.c(r34);
        r141 = r141 + 1;
    L245:
        gy3 r69 = r68.f();
        int r70 = r0.m() + r14;
        if (r70 > r14) goto L248;
        int r71 = r0.i(2);
        boolean[][] r142 = (boolean[][]) Array.newInstance(r126, new int[]{r70, r9});
        int[] r143 = new int[r70];
        int r144 = 0;
        int[] r145 = new int[r70];
        int r146 = 0;
    L250:
        if (r146 >= r14) goto L268;
        r143[r146] = r144;
        r145[r146] = r214[r146];
        if (r71 != 0) goto L255;
        int r236 = r146;
        boolean[][] r312 = r142;
        int[] r313 = r143;
        int[] r314 = r137;
        Arrays.fill(r142[r236], r144, r18[r236], true);
        r313[r236] = r18[r236];
    L254:
        r144 = 0;
    L267:
        r146 = r236 + 1;
        r142 = r312;
        r143 = r313;
        r137 = r314;
        goto L250
    L255:
        r236 = r146;
        r312 = r142;
        r313 = r143;
        r314 = r137;
        if (r71 != 1) goto L266;
        int r147 = r214[r236];
        int r148 = 0;
    L259:
        if (r148 >= r18[r236]) goto L265;
        boolean[] r149 = r312[r236];
        if (r213[r236][r148] != r147) goto L263;
        boolean r150 = true;
    L264:
        r149[r148] = r150;
        r148 = r148 + 1;
        goto L259
    L263:
        r150 = false;
        goto L264
    L265:
        r313[r236] = 1;
        goto L254
    L266:
        r144 = 0;
        r312[0][0] = true;
        r313[0] = 1;
        goto L267
    L268:
        boolean[][] r315 = r142;
        int[] r316 = r143;
        int[] r317 = r137;
        int[] r151 = new int[r9];
        int r152 = 2;
        int[] r153 = new int[2];
        r153[1] = r9;
        r153[r144] = r70;
        boolean[][] r72 = (boolean[][]) Array.newInstance(r126, r153);
        int r154 = 1;
        int r155 = 0;
    L269:
        if (r154 >= r70) goto L320;
        if (r71 != r152) goto L278;
        int r156 = 0;
    L273:
        if (r156 >= r18[r154]) goto L278;
        r315[r154][r156] = r0.h();
        int r157 = r316[r154];
        boolean r237 = r315[r154][r156];
        r316[r154] = r157 + (r237 ? 1 : 0);
        if (r237 == false) goto L277;
        r145[r154] = r213[r154][r156];
    L277:
        r156 = r156 + 1;
    L278:
        if (r155 != 0) goto L292;
        int r158 = 0;
        if (r213[r154][0] == 0) goto L282;
    L293:
        int r159 = r158;
    L295:
        if (r159 >= r18[r154]) goto L314;
        if (r67 <= 1) goto L312;
        r72[r154][r159] = r315[r154][r159];
        gy3 r160 = r69;
        boolean[][] r238 = r72;
        RoundingMode r239 = RoundingMode.CEILING;
        int r73 = ms0.c(r67);
        if (r238[r154][r159] == true) goto L307;
        int r74 = ((o13) r58.get(r213[r154][r159])).a;
        int r75 = r158;
    L301:
        if (r75 >= r159) goto L307;
        int r318 = r75;
        if (r235[r74][((o13) r58.get(r213[r154][r318])).a] == true) goto L304;
        r75 = r318 + 1;
        goto L301
    L304:
        r238[r154][r159] = true;
    L307:
        if (r238[r154][r159] == false) goto L313;
        if (r155 <= 0) goto L311;
        if (r154 != r155) goto L311;
        r151[r159] = r0.i(r73);
    L311:
        r0.t(r73);
    L313:
        r159 = r159 + 1;
        r69 = r160;
        r72 = r238;
        goto L295
    L312:
        r160 = r69;
        r238 = r72;
        goto L313
    L314:
        gy3 r161 = r69;
        boolean[][] r240 = r72;
        if (r316[r154] != 1) goto L319;
        if (r62[r145[r154]] <= 0) goto L319;
        r0.s();
    L319:
        r154 = r154 + 1;
        r69 = r161;
        r72 = r240;
        r152 = 2;
        goto L269
    L282:
        if (r315[r154][0] == false) goto L293;
        int r162 = 1;
    L285:
        if (r162 >= r18[r154]) goto L293;
        if (r213[r154][r162] != r59) goto L291;
        if (r315[r154][r59] == false) goto L291;
        r155 = r154;
    L291:
        r162 = r162 + 1;
        goto L285
    L292:
        r158 = 0;
        goto L293
    L320:
        gy3 r163 = r69;
        boolean[][] r241 = r72;
        if (r155 == 0) goto L323;
        int r76 = r0.m();
        int r77 = r76 + 1;
        f(r77, "expectedSize");
        f(r77, "initialCapacity");
        int[] r78 = new int[r6];
        Object[] r164 = new Object[r77];
        int r79 = 0;
        int r165 = 0;
        boolean r166 = false;
    L325:
        if (r79 >= r77) goto L355;
        int r242 = r79;
        int r243 = r0.i(16);
        int r244 = r0.i(16);
        boolean r245 = r166;
        if (r0.h() == false) goto L332;
        int r167 = r0.i(2);
        if (r167 != 3) goto L331;
        r0.s();
    L331:
        int r319 = r0.i(4);
        int r320 = r0.i(4);
    L334:
        if (r0.h() == false) goto L347;
        int r80 = r0.m();
        int r321 = r0.m();
        int r322 = r0.m();
        int r323 = r0.m();
        if (r167 != 1) goto L338;
    L341:
        int r81 = 2;
    L342:
        r243 = r243 - ((r80 + r321) * r81);
        if (r167 != 1) goto L345;
        int r82 = 2;
    L346:
        r244 = r244 - ((r322 + r323) * r82);
        goto L347
    L345:
        r82 = 1;
        goto L346
    L338:
        if (r167 == 2) goto L341;
        r81 = 1;
    L347:
        q13 r324 = new q13(r167, r319, r320, r243, r244);
        int r83 = qw1.b(r164.length, r165 + 1);
        if (r83 > r164.length) goto L352;
        if (r245 == true) goto L352;
        boolean r168 = r245;
    L353:
        r164[r165] = r324;
        r165 = r165 + 1;
        r79 = r242 + 1;
        r166 = r168;
    L352:
        r164 = Arrays.copyOf(r164, r83);
        r168 = false;
        goto L353
    L332:
        r167 = 0;
        r319 = 0;
        r320 = 0;
        goto L334
    L355:
        if (r77 > 1) goto L357;
    L361:
        int r84 = 1;
    L362:
        if (r84 >= r6) goto L364;
        r78[r84] = Math.min(r84, r76);
        r84 = r84 + 1;
    L364:
        hd5 r85 = new hd5(yw1.i(r165, r164), r78);
        r0.t(2);
        int r86 = 1;
    L365:
        if (r86 >= r6) goto L370;
        if (r62[r225[r86]] != 0) goto L369;
        r0.s();
    L369:
        r86 = r86 + 1;
        goto L365
    L370:
        int r87 = 1;
    L371:
        if (r87 >= r70) goto L392;
        boolean r88 = r0.h();
        int r89 = 0;
    L374:
        if (r89 >= r317[r87]) goto L391;
        if (r89 <= 0) goto L378;
        if (r88 == false) goto L378;
        boolean r169 = r0.h();
    L381:
        if (r169 == false) goto L390;
        int r170 = 0;
    L384:
        if (r170 >= r18[r87]) goto L389;
        if (r241[r87][r170] == false) goto L388;
        r0.m();
    L388:
        r170 = r170 + 1;
        goto L384
    L389:
        r0.m();
        r0.m();
    L390:
        r89 = r89 + 1;
    L378:
        if (r89 != 0) goto L380;
        r169 = true;
        goto L381
    L380:
        r169 = false;
        goto L381
    L391:
        r87 = r87 + 1;
        goto L371
    L392:
        int r90 = r0.m() + 2;
        if (r0.h() == false) goto L395;
        r0.t(r90);
    L404:
        int r91 = r0.m();
        int r92 = 1;
    L405:
        if (r92 > r91) goto L408;
        r0.t(8);
        r92 = r92 + 1;
        goto L405
    L408:
        if (r0.h() == false) goto L462;
        int r93 = r0.e;
        if (r93 <= 0) goto L413;
        r0.t(8 - r93);
    L413:
        if (r0.h() == true) goto L415;
        boolean r94 = r0.h();
    L416:
        if (r94 == false) goto L418;
        r0.s();
    L418:
        boolean r95 = r0.h();
        boolean r96 = r0.h();
        if (r95 == true) goto L421;
        if (r96 == true) goto L421;
    L438:
        boolean r97 = r0.h();
        if (r97 == false) goto L441;
        int r98 = r0.i(4) + 1;
    L442:
        f(r98, "expectedSize");
        f(r98, "initialCapacity");
        int[] r99 = new int[r6];
        Object[] r171 = new Object[r98];
        int r100 = 0;
        int r101 = 0;
        boolean r102 = false;
    L443:
        if (r100 >= r98) goto L455;
        r0.t(3);
        if (r0.h() == false) goto L448;
        int r172 = 1;
    L449:
        int r173 = c50.f(r0.i(8));
        boolean r412 = r97;
        int r103 = c50.g(r0.i(8));
        r0.t(8);
        s13 r174 = new s13(r173, r172, r103);
        int r104 = qw1.b(r171.length, r101 + 1);
        if (r104 > r171.length) goto L452;
        if (r102 == true) goto L452;
    L453:
        r171[r101] = r174;
        r100 = r100 + 1;
        r101 = r101 + 1;
        r97 = r412;
        r102 = r102;
    L452:
        r171 = Arrays.copyOf(r171, r104);
        r102 = false;
        goto L453
    L448:
        r172 = 2;
        goto L449
    L455:
        if (r97 == true) goto L457;
    L461:
        gy3 r105 = yw1.i(r101, r171);
        wo0 r106 = new wo0();
        r106.n = yw1.k(r105);
        r106.o = r99;
    L464:
        return new ss0(r58, new xc5(r163, r151), r85, r106);
    L457:
        if (r98 <= 1) goto L461;
        int r175 = 0;
    L459:
        if (r175 >= r6) goto L461;
        r99[r175] = r0.i(4);
        r175 = r175 + 1;
        goto L459
    L441:
        r98 = r6;
    L421:
        int r107 = 0;
    L422:
        if (r107 >= r14) goto L438;
        int r108 = 0;
    L425:
        if (r108 >= r317[r107]) goto L437;
        if (r95 == false) goto L428;
        boolean r176 = r0.h();
    L429:
        if (r96 == false) goto L431;
        boolean r177 = r0.h();
    L432:
        if (r176 == false) goto L434;
        r0.t(32);
    L434:
        if (r177 == false) goto L436;
        r0.t(18);
    L436:
        r108 = r108 + 1;
        goto L425
    L431:
        r177 = false;
        goto L432
    L428:
        r176 = false;
        goto L429
    L437:
        r107 = r107 + 1;
        goto L422
    L415:
        r94 = true;
        goto L416
    L462:
        r106 = null;
        goto L464
    L395:
        int r109 = 1;
    L396:
        if (r109 >= r6) goto L404;
        int r178 = 0;
    L398:
        if (r178 >= r109) goto L403;
        if (r411[r109][r178] == false) goto L402;
        r0.t(r90);
    L402:
        r178 = r178 + 1;
        goto L398
    L403:
        r109 = r109 + 1;
        goto L396
    L357:
        if (r0.h() == false) goto L361;
        RoundingMode r179 = RoundingMode.CEILING;
        int r180 = ms0.c(r77);
        int r181 = 1;
    L359:
        if (r181 >= r6) goto L364;
        r78[r181] = r0.i(r180);
        r181 = r181 + 1;
        goto L359
    L323:
        return new ss0(null, r4, null, null);
    L248:
        return new ss0(null, r4, null, null);
    L220:
        Arrays.fill(r136, 0, r6, r8);
        goto L221
    L214:
        return new ss0(null, r4, null, null);
    L178:
        return new ss0(null, r4, null, null);
    L175:
        r59 = -1;
        goto L176
    L168:
        return new ss0(null, r4, null, null);
    L466:
        return new ss0(null, r4, null, null);
    L112:
        r217 = r38;
    L468:
        return new ss0(null, r4, null, null);
    L84:
        return new ss0(null, r4, null, null);
    L470:
        return new ss0(null, r4, null, null);
    L20:
        r16 = false;
    L16:
        r7 = false;
    L12:
        r15 = false;
        goto L13
    L5:
        r12 = r8;
        goto L6
    }

    public static ArrayList K(be3 r30) {
        be3 r0 = r30;
        ArrayList r2 = null;
        r2 = null;
        r2 = null;
        if (r0.A() != 0) goto L67;
        char r1 = 7;
        r0.O(7);
        int r3 = r0.m();
        boolean r5 = true;
        if (r3 != 1684433976) goto L17;
        be3 r4 = new be3();
        Inflater r6 = new Inflater(true);
        if (f35.K(r0, r4, r6) == true) goto L12;
        r6.end();
        return null;
    L12:
        r6.end();
        r0 = r4;
    L19:
        ArrayList r7 = new ArrayList();
        int r8 = r0.b;
        int r9 = r0.c;
    L20:
        if (r8 >= r9) goto L68;
        int r10 = r0.m() + r8;
        if (r10 <= r8) goto L67;
        if (r10 > r9) goto L67;
        if (r0.m() != 1835365224) goto L65;
        int r11 = r0.m();
        if (r11 <= 10000) goto L30;
    L29:
        char r16 = r1;
        ArrayList r12 = r2;
        ArrayList r20 = r12;
        boolean r17 = r5;
        int r24 = r9;
        Object r13 = r12;
    L62:
        if (r13 == null) goto L87;
        r7.add(r13);
    L66:
        r0.N(r10);
        r8 = r10;
        r1 = r16;
        r5 = r17;
        r2 = r20;
        r9 = r24;
        goto L20
    L87:
        return r20;
    L30:
        float[] r14 = new float[r11];
        int r15 = 0;
    L31:
        if (r15 >= r11) goto L33;
        r14[r15] = Float.intBitsToFloat(r0.m());
        r15 = r15 + 1;
        goto L31
    L33:
        int r18 = r0.m();
        if (r18 > 32000) goto L29;
        double r19 = Math.log(2.0d);
        r16 = r1;
        ArrayList r110 = r2;
        int r21 = (int) Math.ceil(Math.log(((double) r11) * 2.0d) / r19);
        r17 = r5;
        byte[] r22 = r0.a;
        h00 r23 = new h00(r22.length, r22);
        r23.q(r0.b * 8);
        float[] r25 = new float[r18 * 5];
        int r111 = 5;
        int[] r112 = new int[5];
        ArrayList r26 = r110;
        int r113 = 0;
        int r27 = 0;
    L37:
        if (r113 >= r18) goto L48;
        int r28 = 0;
    L39:
        if (r28 >= r111) goto L47;
        int r29 = r112[r28];
        int r210 = r23.i(r21);
        int r114 = ((r210 >> 1) ^ (-(r210 & 1))) + r29;
        if (r114 >= r11) goto L45;
        if (r114 < 0) goto L45;
        r25[r27] = r14[r114];
        r112[r28] = r114;
        r28 = r28 + 1;
        r27 = r27 + 1;
        r111 = 5;
    L45:
        r24 = r9;
    L46:
        r13 = r26;
        r20 = r26;
        goto L62
    L47:
        r113 = r113 + 1;
        r111 = 5;
        goto L37
    L48:
        r23.q((r23.g() + 7) & (-8));
        int r31 = 32;
        int r32 = r23.i(32);
        tu[] r33 = new tu[r32];
        int r34 = 0;
    L49:
        if (r34 >= r32) goto L61;
        int r115 = r23.i(8);
        int r116 = r23.i(8);
        int r117 = r23.i(r31);
        if (r117 > 128000) goto L45;
        int r211 = r32;
        float[] r35 = r25;
        int r36 = (int) Math.ceil(Math.log(((double) r18) * 2.0d) / r19);
        float[] r37 = new float[r117 * 3];
        float[] r38 = new float[r117 * 2];
        r24 = r9;
        int r39 = 0;
        int r212 = 0;
    L54:
        if (r39 >= r117) goto L60;
        int r213 = r23.i(r36);
        h00 r214 = r23;
        int r40 = ((r213 >> 1) ^ (-(r213 & 1))) + r212;
        if (r40 < 0) goto L46;
        if (r40 >= r18) goto L46;
        int r215 = r39 * 3;
        int r216 = r40 * 5;
        r37[r215] = r35[r216];
        r37[r215 + 1] = r35[r216 + 1];
        r37[r215 + 2] = r35[r216 + 2];
        int r217 = r39 * 2;
        r38[r217] = r35[r216 + 3];
        r38[r217 + 1] = r35[r216 + 4];
        r39 = r39 + 1;
        r212 = r40;
        r23 = r214;
        goto L54
    L60:
        h00 r218 = r23;
        r33[r34] = new tu(r115, r116, r37, r38);
        r34 = r34 + 1;
        r32 = r211;
        r25 = r35;
        r9 = r24;
        r23 = r218;
        r31 = 32;
        goto L49
    L61:
        r24 = r9;
        r13 = new lr3(r33);
        r20 = r26;
        goto L62
    L65:
        r16 = r1;
        r20 = r2;
        r17 = r5;
        r24 = r9;
        goto L66
    L68:
        return r7;
    L13:
        th = move-exception;
        r6.end();
        throw th;
    L17:
        if (r3 == 1918990112) goto L19;
    L67:
        return r2;
    }

    public static u13 L(byte[] r30, int r31, int r32) {
        h00 r2 = new h00(r30, r31 + 1, r32);
        int r4 = r2.i(8);
        int r5 = r2.i(8);
        int r6 = r2.i(8);
        int r7 = r2.m();
        if (r4 == 100) goto L19;
        if (r4 == 110) goto L19;
        if (r4 == 122) goto L19;
        if (r4 == 244) goto L19;
        if (r4 == 44) goto L19;
        if (r4 == 83) goto L19;
        if (r4 == 86) goto L19;
        if (r4 == 118) goto L19;
        if (r4 == 128) goto L19;
        if (r4 == 138) goto L19;
        int r14 = 1;
        int r33 = 16;
        int r11 = 0;
        boolean r13 = false;
        int r18 = 0;
    L48:
        int r1 = r2.m() + 4;
        int r9 = r2.m();
        if (r9 != 0) goto L52;
        int r10 = r2.m() + 4;
    L51:
        boolean r19 = false;
    L59:
        r2.m();
        r2.s();
        int r8 = r2.m() + 1;
        int r12 = r2.m() + 1;
        boolean r15 = r2.h();
        int r16 = 2 - (r15 ? 1 : 0);
        int r17 = r12 * r16;
        if (r15 == true) goto L62;
        r2.s();
    L62:
        r2.s();
        int r20 = r8 * 16;
        int r21 = r17 * 16;
        if (r2.h() == false) goto L75;
        int r24 = r2.m();
        int r26 = r2.m();
        int r27 = r2.m();
        int r28 = r2.m();
        if (r14 != 0) goto L67;
        int r29 = 1;
    L74:
        r20 = r20 - ((r24 + r26) * r29);
        r21 = r21 - ((r27 + r28) * r16);
        goto L75
    L67:
        if (r14 != 3) goto L69;
        r29 = 1;
    L70:
        if (r14 != 1) goto L72;
        int r110 = 2;
    L73:
        r16 = r16 * r110;
        goto L74
    L72:
        r110 = 1;
        goto L73
    L69:
        r29 = 2;
    L75:
        int r22 = r21;
        int r23 = r20;
        int r25 = r4;
        if (r25 == 44) goto L88;
        if (r25 == 86) goto L88;
        if (r25 == 100) goto L88;
        if (r25 == 110) goto L88;
        if (r25 == 122) goto L88;
        if (r25 == 244) goto L88;
    L90:
        int r111 = r33;
    L91:
        int r112 = -1;
        float r113 = 1.0f;
        if (r2.h() == true) goto L94;
        r1 = r1;
        int r210 = r111;
        int r211 = -1;
        int r212 = -1;
        float r114 = 1.0f;
        int r115 = -1;
    L141:
        return new u13(r25, r5, r6, r7, r23, r22, r114, r11, r18, r13, r15, r1, r9, r10, r19, r115, r211, r212, r210);
    L94:
        if (r2.h() == false) goto L107;
        int r116 = r2.i(8);
        if (r116 != 255) goto L103;
        int r0 = r33;
        int r117 = r2.i(r0);
        int r3 = r2.i(r0);
        if (r117 == 0) goto L107;
        if (r3 == 0) goto L107;
        r113 = r117 / r3;
        goto L107
    L103:
        if (r116 >= 17) goto L105;
        r113 = d[r116];
        goto L107
    L105:
        xa3.m(r116, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
    L107:
        if (r2.h() == false) goto L110;
        r2.s();
    L110:
        if (r2.h() == false) goto L119;
        r2.t(3);
        if (r2.h() == false) goto L114;
        int r34 = 1;
    L116:
        if (r2.h() == false) goto L118;
        int r118 = r2.i(8);
        int r119 = r2.i(8);
        r2.t(8);
        r112 = c50.f(r118);
        int r35 = c50.g(r119);
    L121:
        if (r2.h() == false) goto L124;
        r2.m();
        r2.m();
    L124:
        if (r2.h() == false) goto L126;
        r2.t(65);
    L126:
        boolean r120 = r2.h();
        if (r120 == false) goto L129;
        W(r2);
    L129:
        boolean r121 = r2.h();
        if (r121 == false) goto L132;
        W(r2);
    L132:
        if (r120 == true) goto L134;
        if (r121 == true) goto L134;
    L135:
        r2.s();
        if (r2.h() == false) goto L138;
        r2.s();
        r2.m();
        r2.m();
        r2.m();
        r2.m();
        r111 = r2.m();
        r2.m();
    L138:
        r114 = r113;
        r115 = r112;
        r211 = r34;
        r212 = r35;
        r210 = r111;
    L134:
        r2.s();
        goto L135
    L118:
        r35 = -1;
        goto L121
    L114:
        r34 = 2;
        goto L116
    L119:
        r34 = -1;
        r35 = -1;
    L88:
        if ((r5 & 16) == 0) goto L90;
        r111 = 0;
        goto L91
    L52:
        if (r9 != 1) goto L58;
        boolean r122 = r2.h();
        r2.n();
        r2.n();
        r4 = r4;
        long r36 = r2.m();
        r9 = r9;
        int r123 = 0;
    L55:
        if (r123 >= r36) goto L57;
        r2.m();
        r123 = r123 + 1;
        goto L55
    L57:
        r18 = r18;
        r19 = r122;
        r10 = 0;
        goto L59
    L58:
        r10 = 0;
    L19:
        r14 = r2.m();
        if (r14 != 3) goto L22;
        boolean r124 = r2.h();
    L23:
        int r125 = r2.m();
        r18 = r2.m();
        r2.s();
        if (r2.h() == false) goto L46;
        if (r14 == 3) goto L28;
        int r126 = 8;
    L27:
        r33 = 16;
        int r37 = 0;
    L30:
        if (r37 >= r126) goto L47;
        if (r2.h() == false) goto L45;
        if (r37 >= 6) goto L36;
        int r38 = 16;
    L37:
        int r127 = 0;
        int r213 = 8;
        int r214 = 8;
    L38:
        if (r127 >= r38) goto L45;
        if (r213 == 0) goto L41;
        r213 = ((r2.n() + r214) + 256) % 256;
    L41:
        if (r213 == 0) goto L44;
        r214 = r213;
    L44:
        r127 = r127 + 1;
        goto L38
    L36:
        r38 = 64;
    L45:
        r37 = r37 + 1;
    L47:
        r13 = r124;
        r11 = r125;
        goto L48
    L28:
        r126 = 12;
        goto L27
    L46:
        r33 = 16;
        goto L47
    L22:
        r124 = false;
        goto L23
    }

    public static final ug0 M(ba1 r6) {
        int r0 = r6.v0().ordinal();
        ug0 r1 = ug0.n;
        if (r0 == 0) goto L44;
        ug0 r2 = null;
        ug0 r3 = ug0.o;
        if (r0 != 1) goto L7;
        ba1 r4 = te5.s(r6);
        if (r4 == null) goto L42;
        ug0 r5 = M(r4);
        if (r5 == r1) goto L20;
        r2 = r5;
    L20:
        if (r2 == null) goto L22;
        return r2;
    L22:
        if (r6.C == true) goto L40;
        r6.C = true;
        x91 r7 = r6.s0();     // Catch: Throwable -> L34
        ey r8 = (ey) ((ra) j51.P(r6)).getFocusOwner();     // Catch: Throwable -> L34
        ba1 r9 = r8.f();     // Catch: Throwable -> L34
        r7.k.getClass();     // Catch: Throwable -> L34
        ba1 r10 = r8.f();     // Catch: Throwable -> L34
        if (r9 == r10) goto L36;
        if (r10 == null) goto L36;
        if (y91.d != y91.c) goto L31;
        r6.C = false;
        return r3;
    L31:
        ug0 r11 = ug0.p;     // Catch: Throwable -> L34
        r6.C = false;
        return r11;
    L36:
        r6.C = false;
        return r1;
    L34:
        th = move-exception;
        r6.C = false;
        throw th;
    L40:
        return r1;
    L42:
        kf2.n("ActiveParent with no focused child");
        return null;
    L7:
        if (r0 != 2) goto L9;
        return r3;
    L9:
        if (r0 == 3) goto L44;
        er1.n();
        return null;
    L44:
        return r1;
    }

    public static final ug0 N(ba1 r4) {
        if (r4.D == true) goto L22;
        r4.D = true;
        x91 r1 = r4.s0();     // Catch: Throwable -> L13
        ey r2 = (ey) ((ra) j51.P(r4)).getFocusOwner();     // Catch: Throwable -> L13
        ba1 r3 = r2.f();     // Catch: Throwable -> L13
        r1.j.getClass();     // Catch: Throwable -> L13
        ba1 r5 = r2.f();     // Catch: Throwable -> L13
        if (r3 == r5) goto L18;
        if (r5 == null) goto L18;
        if (y91.d != y91.c) goto L15;
        ug0 r6 = ug0.o;     // Catch: Throwable -> L13
        r4.D = false;
        return r6;
    L15:
        ug0 r7 = ug0.p;     // Catch: Throwable -> L13
        r4.D = false;
        return r7;
    L18:
        r4.D = false;
    L13:
        th = move-exception;
        r4.D = false;
        throw th;
    L22:
        return ug0.n;
    }

    public static final ug0 O(ba1 r11) {
        int r0 = r11.v0().ordinal();
        ug0 r1 = ug0.n;
        if (r0 == 0) goto L85;
        ug0 r2 = null;
        if (r0 != 1) goto L7;
        ba1 r12 = te5.s(r11);
        if (r12 != null) goto L82;
        kf2.n("ActiveParent with no focused child");
        return null;
    L82:
        return M(r12);
    L7:
        if (r0 == 2) goto L85;
        if (r0 == 3) goto L11;
        er1.n();
        return null;
    L11:
        if (r11.n.A == true) goto L13;
        cz1.b("visitAncestors called on an unattached node");
    L13:
        cx2 r3 = r11.n.r;
        c72 r13 = j51.O(r11);
    L14:
        if (r13 == null) goto L52;
        if ((((cx2) r13.Q.g).q & 1024) == 0) goto L46;
    L17:
        if (r3 == null) goto L46;
        if ((r3.p & 1024) == 0) goto L45;
        cx2 r6 = r3;
        f13 r7 = null;
    L21:
        if (r6 == null) goto L45;
        if ((r6 instanceof ba1) == true) goto L53;
        if ((r6.p & 1024) == 0) goto L44;
        if ((r6 instanceof fo0) == false) goto L44;
        cx2 r8 = ((fo0) r6).C;
        int r9 = 0;
    L30:
        if (r8 == null) goto L42;
        if ((r8.p & 1024) == 0) goto L41;
        r9 = r9 + 1;
        if (r9 != 1) goto L36;
        r6 = r8;
        goto L41
    L36:
        if (r7 != null) goto L38;
        r7 = new f13(new cx2[16]);
    L38:
        if (r6 == null) goto L40;
        r7.b(r6);
        r6 = null;
    L40:
        r7.b(r8);
    L41:
        r8 = r8.s;
        goto L30
    L42:
        if (r9 == 1) goto L21;
    L44:
        r6 = j51.c(r7);
    L53:
        ba1 r10 = (ba1) r6;
        if (r10 != null) goto L56;
        return r1;
    L56:
        int r14 = r10.v0().ordinal();
        if (r14 == 0) goto L76;
        if (r14 == 1) goto L74;
        if (r14 == 2) goto L72;
        if (r14 != 3) goto L69;
        ug0 r15 = O(r10);
        if (r15 == r1) goto L65;
        r2 = r15;
    L65:
        if (r2 == null) goto L67;
        return r2;
    L67:
        return N(r10);
    L69:
        er1.n();
        return null;
    L72:
        return ug0.o;
    L74:
        return O(r10);
    L76:
        return N(r10);
    L45:
        r3 = r3.r;
    L46:
        r13 = r13.t();
        if (r13 == null) goto L51;
        w12 r4 = r13.Q;
        if (r4 == null) goto L51;
        r3 = (sq4) r4.f;
    L51:
        r3 = null;
        goto L14
    L52:
        r6 = null;
    L85:
        return r1;
    }

    public static final boolean P(ba1 r3, boolean r4) {
        int r0 = r3.v0().ordinal();
        if (r0 != 0) goto L5;
    L22:
        return true;
    L5:
        if (r0 != 1) goto L7;
        ba1 r1 = te5.s(r3);
        if (r1 == null) goto L17;
        boolean r5 = P(r1, r4);
    L18:
        if (r5 == false) goto L21;
        r3.r0(z91.o, z91.p);
        return true;
    L21:
        return false;
    L17:
        r5 = true;
        goto L18
    L7:
        if (r0 != 2) goto L9;
        return r4;
    L9:
        if (r0 == 3) goto L22;
        er1.n();
        return false;
    }

    public static final List Q(z34 r10) {
        int r0 = rr2.y(r10, "id");
        int r1 = rr2.y(r10, "seq");
        int r2 = rr2.y(r10, "from");
        int r3 = rr2.y(r10, "to");
        qb2 r4 = gb.r();
    L4:
        if (r10.O() == false) goto L7;
        r4.add(new ob1((int) r10.getLong(r0), (int) r10.getLong(r1), r10.D(r2), r10.D(r3)));
        goto L4
    L7:
        return q40.J0(gb.f(r4));
    }

    public static final qq4 R(x34 r13, String r14, boolean r15) {
        z34 r16 = r13.U("PRAGMA index_xinfo(`" + r14 + "`)");
        int r0 = rr2.y(r16, "seqno");     // Catch: Throwable -> L18
        int r1 = rr2.y(r16, "cid");     // Catch: Throwable -> L18
        int r2 = rr2.y(r16, "name");     // Catch: Throwable -> L18
        int r3 = rr2.y(r16, "desc");     // Catch: Throwable -> L18
        if (r0 == (-1)) goto L33;
        if (r1 == (-1)) goto L33;
        if (r2 == (-1)) goto L33;
        if (r3 == (-1)) goto L33;
        LinkedHashMap r4 = new LinkedHashMap();     // Catch: Throwable -> L18
        LinkedHashMap r6 = new LinkedHashMap();     // Catch: Throwable -> L18
    L11:
        if (r16.O() == false) goto L22;
        if (((int) r16.getLong(r1)) < 0) goto L11;
        int r7 = (int) r16.getLong(r0);     // Catch: Throwable -> L18
        String r8 = r16.D(r2);     // Catch: Throwable -> L18
        if (r16.getLong(r3) <= 0) goto L20;
        String r9 = "DESC";
    L21:
        r4.put(Integer.valueOf(r7), r8);     // Catch: Throwable -> L18
        r6.put(Integer.valueOf(r7), r9);     // Catch: Throwable -> L18
        goto L11
    L20:
        r9 = "ASC";
        goto L21
    L22:
        List r5 = q40.K0(r4.entrySet(), new jb2(4));     // Catch: Throwable -> L18
        ArrayList r10 = new ArrayList(r40.k0(r5, 10));     // Catch: Throwable -> L18
        Iterator r11 = r5.iterator();     // Catch: Throwable -> L18
    L24:
        if (r11.hasNext() == false) goto L26;
        r10.add((String) ((Map.Entry) r11.next()).getValue());     // Catch: Throwable -> L18
        goto L24
    L26:
        List r12 = q40.Q0(r10);     // Catch: Throwable -> L18
        List r17 = q40.K0(r6.entrySet(), new jb2(5));     // Catch: Throwable -> L18
        ArrayList r18 = new ArrayList(r40.k0(r17, 10));     // Catch: Throwable -> L18
        Iterator r19 = r17.iterator();     // Catch: Throwable -> L18
    L28:
        if (r19.hasNext() == false) goto L30;
        r18.add((String) ((Map.Entry) r19.next()).getValue());     // Catch: Throwable -> L18
        goto L28
    L30:
        qq4 r20 = new qq4(r14, r15, r12, q40.Q0(r18));     // Catch: Throwable -> L18
        ud3.e(r16, null);
        return r20;
    L33:
        ud3.e(r16, null);
        return null;
    L18:
        th = move-exception;
        throw th;     // Catch: Throwable -> L36
    L36:
        th = move-exception;
        ud3.e(r16, th);
        throw th;
    }

    public static final b13 S(Object r2, rg1 r3) {
        Object r0 = r3.H();
        if (r0 != j80.a) goto L5;
        r0 = B(r2);
        r3.b0(r0);
    L5:
        b13 r1 = (b13) r0;
        r1.setValue(r2);
        return r1;
    }

    public static final void T(vd0 r9, Object r10) {
        if ((r9 instanceof mr0) == false) goto L48;
        mr0 r11 = (mr0) r9;
        pe0 r0 = r11.q;
        wd0 r1 = r11.r;
        Throwable r2 = bb3.a(r10);
        if (r2 != null) goto L7;
        Object r3 = r10;
    L9:
        if (r0.Y(r1.getContext()) == false) goto L12;
        r11.s = r3;
        r11.p = 1;
        r0.W(r1.getContext(), r11);
        return;
    L12:
        g21 r4 = it4.a();
        if (r4.p < 4294967296L) goto L15;
        r11.s = r3;
        r11.p = 1;
        r4.b0(r11);
        return;
    L15:
        r4.c0(true);
        s22 r5 = (s22) r1.getContext().K(fz0.h0);     // Catch: Throwable -> L21
        if (r5 != null) goto L19;
    L23:
        Object r6 = r11.t;     // Catch: Throwable -> L21
        ne0 r7 = r1.getContext();     // Catch: Throwable -> L21
        Object r8 = te5.R(r7, r6);     // Catch: Throwable -> L21
        if (r8 == te5.b) goto L27;
        f15 r12 = jz4.Q(r1, r7, r8);     // Catch: Throwable -> L21
    L50:
        r1.resumeWith(r10);     // Catch: Throwable -> L36
        if (r12 != null) goto L31;
    L32:
        te5.K(r7, r8);     // Catch: Throwable -> L21
    L34:
        if (r4.e0() == true) goto L34;
    L35:
        r4.a0(true);
        return;
    L31:
        if (r12.m0() == false) goto L34;
    L36:
        th = move-exception;
        if (r12 != null) goto L39;
    L40:
        te5.K(r7, r8);     // Catch: Throwable -> L21
    L41:
        throw th;     // Catch: Throwable -> L21
    L39:
        if (r12.m0() == false) goto L41;
    L27:
        r12 = null;
        goto L50
    L19:
        if (r5.b() == true) goto L23;
        r11.resumeWith(kb4.o(r5.q()));     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        r11.g(th);     // Catch: Throwable -> L45
    L45:
        th = move-exception;
        r4.a0(true);
        throw th;
    L7:
        r3 = new a70(r2, false);
        goto L9
    L48:
        r9.resumeWith(r10);
    }

    public static final Object U(ba1 r10, int r11, if1 r12) {
        if (r10.n.A == true) goto L5;
        cz1.b("visitAncestors called on an unattached node");
    L5:
        cx2 r0 = r10.n.r;
        c72 r1 = j51.O(r10);
    L6:
        int r2 = 0;
        int r3 = 1;
        Object r4 = null;
        if (r1 == null) goto L45;
        if ((((cx2) r1.Q.g).q & 1024) == 0) goto L39;
    L10:
        if (r0 == null) goto L39;
        if ((r0.p & 1024) == 0) goto L38;
        cx2 r5 = r0;
        f13 r6 = null;
    L14:
        if (r5 == null) goto L38;
        if ((r5 instanceof ba1) == true) goto L46;
        if ((r5.p & 1024) == 0) goto L37;
        if ((r5 instanceof fo0) == false) goto L37;
        cx2 r7 = ((fo0) r5).C;
        int r8 = 0;
    L23:
        if (r7 == null) goto L35;
        if ((r7.p & 1024) == 0) goto L34;
        r8 = r8 + 1;
        if (r8 != 1) goto L29;
        r5 = r7;
        goto L34
    L29:
        if (r6 != null) goto L31;
        r6 = new f13(new cx2[16]);
    L31:
        if (r5 == null) goto L33;
        r6.b(r5);
        r5 = null;
    L33:
        r6.b(r7);
    L34:
        r7 = r7.s;
        goto L23
    L35:
        if (r8 == 1) goto L14;
    L37:
        r5 = j51.c(r6);
    L46:
        ba1 r9 = (ba1) r5;
        if (r9 != null) goto L49;
    L51:
        z72 r13 = r10.u0();
        if (r13 == null) goto L107;
        int r14 = 5;
        if (r11 == 5) goto L70;
        r14 = 6;
        if (r11 == 6) goto L70;
        r14 = 3;
        if (r11 == 3) goto L70;
        r14 = 4;
        if (r11 == 4) goto L70;
        if (r11 != 1) goto L67;
        r14 = 2;
        goto L70
    L67:
        if (r11 != 2) goto L106;
        r14 = 1;
        goto L70
    L106:
        kf2.o("Unsupported direction for beyond bounds layout");
    L70:
        if (r13.B.a.n() <= 0) goto L105;
        if (r13.B.a.m().a.isEmpty() == true) goto L105;
        if (r13.A == false) goto L105;
        boolean r15 = r13.r0(r14);
        dc3 r16 = r13.B;
        if (r15 == false) goto L79;
        lm0 r17 = r16.a;
        int r18 = Math.min(r17.n() - 1, ((xi2) q40.C0(r17.m().a)).a);
    L80:
        jx3 r19 = new jx3();
        hg3 r20 = r13.C;
        r20.getClass();
        v72 r21 = new v72(r18, r18);
        ((f13) r20.o).b(r21);
        r19.n = r21;
        lm0 r110 = r13.B.a;
        if (r110.m().a.size() != 0) goto L83;
        r3 = 0;
    L90:
        int r22 = r3 * 2;
        int r111 = r13.B.a.n();
        if (r22 <= r111) goto L93;
        r22 = r111;
    L93:
        if (r4 != null) goto L102;
        if (r13.q0((v72) r19.n, r14) == false) goto L102;
        if (r2 >= r22) goto L102;
        v72 r112 = (v72) r19.n;
        int r23 = r112.a;
        int r113 = r112.b;
        if (r13.r0(r14) == false) goto L100;
        r113 = r113 + 1;
    L101:
        hg3 r24 = r13.C;
        r24.getClass();
        v72 r25 = new v72(r23, r113);
        ((f13) r24.o).b(r25);
        hg3 r114 = r13.C;
        ((f13) r114.o).j((v72) r19.n);
        r19.n = r25;
        r2 = r2 + 1;
        j51.O(r13).l();
        r4 = r12.invoke(new y72(r13, r19, r14));
        goto L93
    L100:
        r23 = r23 - 1;
    L102:
        hg3 r115 = r13.C;
        ((f13) r115.o).j((v72) r19.n);
        j51.O(r13).l();
        return r4;
    L83:
        int r26 = te5.x(r110.m());
        int r27 = r110.m().b + r110.m().c;
        if (r27 == 0) goto L90;
        int r28 = r26 / r27;
        if (r28 < 1) goto L90;
        r3 = r28;
        goto L90
    L79:
        r18 = Math.max(0, r16.a.e);
    L105:
        return r12.invoke(z72.E);
    L107:
        return null;
    L49:
        if (h12.c(r9.u0(), r10.u0()) == false) goto L51;
    L38:
        r0 = r0.r;
    L39:
        r1 = r1.t();
        if (r1 == null) goto L44;
        w12 r29 = r1.Q;
        if (r29 == null) goto L44;
        r0 = (sq4) r29.f;
    L44:
        r0 = null;
        goto L6
    L45:
        r5 = null;
        goto L46
    }

    public static String V(Context r2, long r3) {
        if (r3 < 1073741824) goto L6;
        String r4 = r2.getString(R.string.homemusic_size_gb, new Object[]{Double.valueOf(r3 / 1.073741824E9d)});
        r4.getClass();
        return r4;
    L6:
        String r5 = r2.getString(R.string.homemusic_size_mb, new Object[]{Double.valueOf(r3 / 1048576.0d)});
        r5.getClass();
        return r5;
    }

    public static void W(h00 r2) {
        int r0 = r2.m() + 1;
        r2.t(8);
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r2.m();
        r2.m();
        r2.s();
        r1 = r1 + 1;
        goto L3
    L5:
        r2.t(20);
    }

    public static final int X(int r1) {
        if (r1 == 0) goto L22;
        int r2 = xa3.w(r1);
        if (r2 == 0) goto L19;
        int r0 = 1;
        if (r2 == 1) goto L18;
        r0 = 2;
        if (r2 == 2) goto L18;
        r0 = 3;
        if (r2 == 3) goto L18;
        r0 = 4;
        if (r2 == 4) goto L18;
        if (r2 != 5) goto L16;
        return 5;
    L16:
        er1.n();
        return 0;
    L18:
        return r0;
    L19:
        return 0;
    L22:
        throw null;
    }

    public static final ly4 Y(Context r6, int r7) {
        lp1 r0 = lp1.a;
        long r1 = lp1.a(r7, "play");
        long r2 = lp1.a(r7, "preload");
        return new ly4(V(r6, r1 + r2), V(r6, r1), V(r6, r2));
    }

    public static final long Z(long r5) {
        long r0 = 63 & r5;
        int r2 = (int) r0;
        if (r2 > 15) goto L6;
        return r5;
    L6:
        if (r2 != s50.u.c) goto L10;
        return e35.U(r5);
    L10:
        if (r2 == s50.v.c) goto L14;
        if (r2 == s50.w.c) goto L14;
    L18:
        if (r2 != s50.x.c) goto L24;
        if (Build.VERSION.SDK_INT >= 36) goto L24;
        return e35.U(r5);
    L24:
        return (r5 & (-64)) | (r0 - 1);
    L14:
        if (Build.VERSION.SDK_INT >= 34) goto L18;
        return e35.U(r5);
    }

    public static final void a(final lm0 r26, final dx2 r27, final ac3 r28, rv2 r29, final float r30, gs r31, wg4 r32, final boolean r33, final if1 r34, y43 r35, rv2 r36, tb r37, final r70 r38, rg1 r39, final int r40) {
        r39.S(1860873769);
        if (r39.e(r26) == false) goto L5;
        int r0 = 4;
    L6:
        int r1 = (r40 | r0) | 5794816;
        if (r39.f(r33) == false) goto L9;
        int r5 = 67108864;
    L10:
        int r2 = (r1 | r5) | 805306368;
        if (r39.g(r34) == false) goto L13;
        int r6 = 4;
    L14:
        int r7 = r6 | 26000;
        if ((306783379 & r2) == 306783378) goto L17;
    L20:
        boolean r8 = true;
    L22:
        if (r39.K(r2 & 1, r8) == false) goto L78;
        r39.O(-127, null, 0, null);
        if ((r40 & 1) != 0) goto L26;
    L35:
        rv2 r9 = rv2.x;
        gs r12 = fz0.x;
        int r14 = (r2 & 14) | 196608;
        Object r15 = new sc3();
        float r16 = xj4.a;
        qr3 r3 = g90.h;
        oo0 r10 = (oo0) r39.i(r3);
        boolean r11 = r39.c(r10.g());
        Object r13 = r39.H();
        Object r17 = j80.a;
        if (r11 == true) goto L38;
        if (r13 == r17) goto L38;
    L39:
        ui0 r18 = (ui0) r13;
        int r19 = n85.a;
        ck4 r20 = au0.S(1);
        Object r4 = (oo0) r39.i(r3);
        qr3 r21 = g90.n;
        r62 r22 = (r62) r39.i(r21);
        if (((r14 & 14) ^ 6) <= 4) goto L44;
        if (r39.e(r26) == false) goto L44;
    L45:
        boolean r23 = true;
    L47:
        boolean r24 = ((((r23 | r39.e(r18)) | r39.e(r20)) | r39.e(r15)) | r39.e(r4)) | r39.d(r22.ordinal());
        Object r25 = r39.H();
        if (r24 == true) goto L50;
        if (r25 == r17) goto L50;
    L51:
        wg4 r41 = (wg4) r25;
        int r42 = r2 & (-29360129);
        int r43 = (r2 & 14) | 432;
        r62 r44 = (r62) r39.i(r21);
        if (((r43 & 14) ^ 6) <= 4) goto L56;
        if (r39.e(r26) == false) goto L56;
    L57:
        boolean r45 = true;
    L59:
        boolean r46 = r39.d(r44.ordinal()) | r45;
        Object r47 = r39.H();
        if (r46 == true) goto L62;
        if (r47 == r17) goto L62;
    L63:
        jm0 r48 = (jm0) r47;
        rv2 r49 = rv2.C;
        l90 r50 = sb3.a;
        r39.R(282942128);
        ub r51 = (ub) r39.i(sb3.a);
        if (r51 != null) goto L66;
        boolean r52 = false;
        r39.o(false);
        tb r110 = null;
    L71:
        wg4 r53 = r41;
        y43 r54 = r48;
        final rv2 r111 = r49;
        int r55 = r7 & (-7281);
        rv2 r56 = r9;
        gs r112 = r12;
        tb r57 = r110;
    L72:
        r39.o(r52);
        lv3 r58 = r39.u();
        if (r58 == null) goto L77;
        int r59 = r58.b;
        if ((r59 & 1) == 0) goto L77;
        r58.b = r59 | 2;
    L77:
        y43 r60 = r54;
        ya4.b(r27, r26, r28, r53, r33, r57, r30, r56, r60, r34, r112, r111, r38, r39, (((r42 >> 6) & 3670016) | (((r42 << 3) & 112) | 28038)) | 905969664, ((r55 << 6) & 896) | 1797126);
        final tb r113 = r57;
        final rv2 r61 = r56;
        final gs r62 = r112;
        final wg4 r63 = r53;
        final y43 r114 = r60;
    L79:
        lv3 r115 = r39.p();
        if (r115 == null) goto L83;
        r115.d = new hc3(r26, r27, r28, r61, r30, r62, r63, r33, r34, r114, r111, r113, r38, r40);
        return;
    L83:
        return;
    L66:
        boolean r64 = r39.e(r51);
        Object r116 = r39.H();
        if (r64 == true) goto L69;
        if (r116 == r17) goto L69;
    L70:
        r52 = false;
        r39.o(false);
        r110 = (tb) r116;
    L69:
        r116 = new tb(r51.a, r51.b, r51.c, r51.d);
        r39.b0(r116);
    L62:
        r47 = new jm0(r26, r44);
        r39.b0(r47);
    L56:
        if ((r43 & 6) == 4) goto L57;
        r45 = false;
    L50:
        gc3 r65 = new gc3(0, r26, r22);
        rf2 r66 = new rf2();
        r66.n = r26;
        r66.o = r65;
        Object r67 = new wg4(r66, r18, r20);
        r39.b0(r67);
        r25 = r67;
    L44:
        if ((r14 & 6) == 4) goto L45;
        r23 = false;
    L38:
        r13 = new ui0(new rm2(r10));
        r39.b0(r13);
        goto L39
    L26:
        if (r39.w() == false) goto L35;
        if (r39.w == true) goto L35;
        lv3 r68 = r39.u();
        if (r68 != null) goto L32;
    L34:
        r39.N();
        int r69 = r7 & (-7281);
        r56 = r29;
        r111 = r36;
        r57 = r37;
        r42 = r2 & (-29360129);
        r55 = r69;
        r52 = false;
        r112 = r31;
        r53 = r32;
        r54 = r35;
        goto L72
    L32:
        if ((r68.b & 4) == 0) goto L34;
    L78:
        r39.N();
        r61 = r29;
        r62 = r31;
        r63 = r32;
        r114 = r35;
        r111 = r36;
        r113 = r37;
        goto L79
    L17:
        if ((r7 & 9363) != 9362) goto L20;
        r8 = false;
        goto L22
    L13:
        r6 = 2;
        goto L14
    L9:
        r5 = 33554432;
        goto L10
    L5:
        r0 = 2;
        goto L6
    }

    public static final o53 a0(byte[] r6) {
        r6.getClass();
        if (Build.VERSION.SDK_INT < 28) goto L32;
        if (r6.length == 0) goto L32;
        ByteArrayInputStream r0 = new ByteArrayInputStream(r6);
        ObjectInputStream r7 = new ObjectInputStream(r0);     // Catch: Throwable -> L21
        int r1 = r7.readInt();     // Catch: Throwable -> L12
        int[] r2 = new int[r1];     // Catch: Throwable -> L12
        int r3 = 0;
        int r4 = 0;
    L10:
        if (r4 >= r1) goto L14;
        r2[r4] = r7.readInt();     // Catch: Throwable -> L12
        r4 = r4 + 1;     // Catch: Throwable -> L12
        goto L10
    L14:
        int r5 = r7.readInt();     // Catch: Throwable -> L12
        int[] r8 = new int[r5];     // Catch: Throwable -> L12
    L15:
        if (r3 >= r5) goto L17;
        r8[r3] = r7.readInt();     // Catch: Throwable -> L12
        r3 = r3 + 1;     // Catch: Throwable -> L12
        goto L15
    L17:
        o53 r9 = fu.n(r8, r2);     // Catch: Throwable -> L12
        r7.close();     // Catch: Throwable -> L21
        r0.close();
        return r9;
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        q05.h(r7, th);     // Catch: Throwable -> L21
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        throw th;     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        q05.h(r0, th);
        throw th;
    L32:
        return new o53(null);
    }

    public static final LinkedHashSet b(byte[] r7) {
        r7.getClass();
        LinkedHashSet r0 = new LinkedHashSet();
        if (r7.length != 0) goto L5;
        return r0;
    L5:
        ByteArrayInputStream r1 = new ByteArrayInputStream(r7);
        ObjectInputStream r8 = new ObjectInputStream(r1);     // Catch: Throwable -> L15 IOException -> L17
        int r2 = r8.readInt();     // Catch: Throwable -> L11
        int r3 = 0;
    L8:
        if (r3 >= r2) goto L13;
        Uri r4 = Uri.parse(r8.readUTF());     // Catch: Throwable -> L11
        boolean r5 = r8.readBoolean();     // Catch: Throwable -> L11
        r4.getClass();     // Catch: Throwable -> L11
        r0.add(new lc0(r5, r4));     // Catch: Throwable -> L11
        r3 = r3 + 1;
        goto L8
    L13:
        r8.close();     // Catch: Throwable -> L15 IOException -> L17
    L24:
        r1.close();
        return r0;
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        q05.h(r8, th);     // Catch: Throwable -> L15 IOException -> L17
        throw th;     // Catch: Throwable -> L15 IOException -> L17
    L17:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        q05.h(r1, th);
        throw th;
    }

    public static int b0(int r8, byte[] r9) {
        Object r0 = e;
        monitor-enter(r0);
        int r2 = 0;
        int r3 = 0;
    L5:
        if (r2 >= r8) goto L24;
    L7:
        if (r2 >= (r8 - 2)) goto L16;
    L21:
        th = move-exception;
        throw th;
    L9:
        if (r9[r2] != 0) goto L15;
        if (r9[r2 + 1] != 0) goto L15;
        if (r9[r2 + 2] != 3) goto L15;
    L17:
        if (r2 >= r8) goto L5;
        int[] r4 = f;     // Catch: Throwable -> L21
        if (r4.length > r3) goto L23;
        f = Arrays.copyOf(r4, r4.length * 2);     // Catch: Throwable -> L21
    L23:
        f[r3] = r2;     // Catch: Throwable -> L21
        r2 = r2 + 3;     // Catch: Throwable -> L21
        r3 = r3 + 1;     // Catch: Throwable -> L21
    L15:
        r2 = r2 + 1;     // Catch: Throwable -> L21
        goto L7
    L16:
        r2 = r8;
        goto L17
    L24:
        int r10 = r8 - r3;     // Catch: Throwable -> L21
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
    L25:
        if (r5 >= r3) goto L27;
        int r11 = f[r5] - r7;     // Catch: Throwable -> L21
        System.arraycopy(r9, r7, r9, r6, r11);     // Catch: Throwable -> L21
        int r12 = r6 + r11;     // Catch: Throwable -> L21
        int r13 = r12 + 1;     // Catch: Throwable -> L21
        r9[r12] = 0;     // Catch: Throwable -> L21
        r6 = r12 + 2;     // Catch: Throwable -> L21
        r9[r13] = 0;     // Catch: Throwable -> L21
        r7 = r7 + (r11 + 3);     // Catch: Throwable -> L21
        r5 = r5 + 1;     // Catch: Throwable -> L21
        goto L25
    L27:
        System.arraycopy(r9, r7, r9, r6, r10 - r6);     // Catch: Throwable -> L21
        monitor-exit(r0);     // Catch: Throwable -> L21
        return r10;
    }

    public static void c(Context r1, AttributeSet r2, int r3, int r4) {
        TypedArray r5 = r1.obtainStyledAttributes(r2, ht3.Y, r3, r4);
        boolean r6 = r5.getBoolean(1, false);
        r5.recycle();
        if (r6 == false) goto L11;
        TypedValue r7 = new TypedValue();
        if (r1.getTheme().resolveAttribute(R.attr.isMaterialTheme, r7, true) == true) goto L7;
    L10:
        h(r1, h, "Theme.MaterialComponents");
        goto L11
    L7:
        if (r7.type != 18) goto L11;
        if (r7.data == 0) goto L10;
    L11:
        h(r1, g, "Theme.AppCompat");
    }

    public static void d(Object r2, Object r3) {
        if (r2 == null) goto L8;
        if (r3 == null) goto L6;
        return;
    L6:
        throw new NullPointerException("null value in entry: " + r2 + "=null");
    L8:
        throw new NullPointerException("null key in entry: null=" + r3);
    }

    public static h33 e(TypedValue r2, h33 r3, h33 r4, String r5, String r6) {
        if (r3 == null) goto L7;
        if (r3 == r4) goto L7;
        StringBuilder r7 = b11.u("Type is ", r5, " but found ", r6, ": ");
        r7.append(r2.data);
        throw new XmlPullParserException(r7.toString());
    L7:
        if (r3 != null) goto L9;
        return r4;
    L9:
        return r3;
    }

    public static void f(int r2, String r3) {
        if (r2 < 0) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(r3 + " cannot be negative but was: " + r2);
    }

    public static void g(Context r5, AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        TypedArray r0 = r5.obtainStyledAttributes(r6, ht3.Y, r8, r9);
        boolean r2 = false;
        if (r0.getBoolean(2, false) == true) goto L7;
        r0.recycle();
        return;
    L7:
        if (r10.length == 0) goto L9;
        TypedArray r11 = r5.obtainStyledAttributes(r6, r7, r8, r9);
        int r12 = r10.length;
        int r13 = 0;
    L12:
        if (r13 >= r12) goto L17;
        if (r11.getResourceId(r10[r13], -1) == (-1)) goto L15;
        r13 = r13 + 1;
        goto L12
    L15:
        r11.recycle();
    L18:
        r0.recycle();
        if (r2 == false) goto L21;
        return;
    L21:
        kf2.n("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        return;
    L17:
        r11.recycle();
    L10:
        r2 = true;
        goto L18
    L9:
        if (r0.getResourceId(0, -1) == (-1)) goto L18;
        goto L10
    }

    public static void h(Context r2, int[] r3, String r4) {
        TypedArray r5 = r2.obtainStyledAttributes(r3);
        int r0 = 0;
    L4:
        if (r0 >= r3.length) goto L10;
        if (r5.hasValue(r0) == false) goto L8;
        r0 = r0 + 1;
        goto L4
    L8:
        r5.recycle();
        kf2.n(xa3.h("The style on this component requires your app theme to be ", r4, " (or a descendant)."));
        return;
    L10:
        r5.recycle();
    }

    public static void i(boolean[] r2) {
        r2[0] = false;
        r2[1] = false;
        r2[2] = false;
    }

    public static Parcelable j(Parcelable r2, Parcelable.Creator r3) {
        if (r2 != null) goto L5;
        return null;
    L5:
        Parcel r0 = Parcel.obtain();
        r2.writeToParcel(r0, 0);     // Catch: Throwable -> L9
        r0.setDataPosition(0);     // Catch: Throwable -> L9
        Parcelable r4 = (Parcelable) r3.createFromParcel(r0);     // Catch: Throwable -> L9
        r0.recycle();
        return r4;
    L9:
        th = move-exception;
        r0.recycle();
        throw th;
    }

    public static ArrayList k(List r3, Parcelable.Creator r4) {
        if (r3 != null) goto L5;
        return null;
    L5:
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L7:
        if (r1 >= r3.size()) goto L9;
        r0.add(j((Parcelable) r3.get(r1), r4));
        r1 = r1 + 1;
        goto L7
    L9:
        return r0;
    }

    public static final sc5 l(Context r12, r90 r13) {
        r12.getClass();
        bq4 r3 = new bq4(r13.c);
        Context r0 = r12.getApplicationContext();
        r0.getClass();
        ia4 r1 = (ia4) r3.n;
        r1.getClass();
        xi4 r2 = r13.d;
        boolean r4 = r12.getResources().getBoolean(R.bool.workmanager_test_configuration);
        r2.getClass();
        if (r4 == false) goto L5;
        q24 r5 = new q24(r0, WorkDatabase.class, null);
        r5.i = true;
    L6:
        r5.f = r1;
        r5.d.add(new m30(r2));
        r5.a(new jw2[]{kw2.h});
        r5.a(new jw2[]{new k04(r0, 2, 3)});
        r5.a(new jw2[]{kw2.i});
        r5.a(new jw2[]{kw2.j});
        r5.a(new jw2[]{new k04(r0, 5, 6)});
        r5.a(new jw2[]{kw2.k});
        r5.a(new jw2[]{kw2.l});
        r5.a(new jw2[]{kw2.m});
        r5.a(new jw2[]{new k04(r0)});
        r5.a(new jw2[]{new k04(r0, 10, 11)});
        r5.a(new jw2[]{kw2.d});
        r5.a(new jw2[]{kw2.e});
        r5.a(new jw2[]{kw2.f});
        r5.a(new jw2[]{kw2.g});
        r5.a(new jw2[]{new k04(r0, 21, 22)});
        r5.p = false;
        r5.q = true;
        WorkDatabase r10 = (WorkDatabase) r5.b();
        Context r6 = r12.getApplicationContext();
        r6.getClass();
        z40 r7 = new z40(r3, r6);
        pq3 r8 = new pq3(r12.getApplicationContext(), r13, r3, r10);
        int r9 = tc5.n;
        String r11 = c64.a;
        dq4 r14 = new dq4(r12, r10, r13);
        yb3.a(r12, SystemJobService.class, true);
        cx.f().b(c64.a, "Created SystemJobScheduler and enabled SystemJobService");
        return new sc5(r12.getApplicationContext(), r13, r3, r10, gb.P(new a64[]{r14, new dk1(r12, r13, r7, r8, new rm3(r8, r3), r3)}), r8, r7);
    L5:
        r5 = vr1.i(r0, WorkDatabase.class, "androidx.work.workdb");
        r5.h = new ss2(25, r0);
        goto L6
    }

    public static final long m() {
        return Thread.currentThread().getId();
    }

    public static final f13 n() {
        z05 r0 = ph4.b;
        f13 r1 = (f13) r0.f();
        if (r1 != null) goto L6;
        f13 r2 = new f13(new qg1[0]);
        r0.n(r2);
        return r2;
    L6:
        return r1;
    }

    public static int o(byte[] r8, int r9, int r10, boolean[] r11) {
        int r0 = r10 - r9;
        boolean r1 = false;
        if (r0 < 0) goto L5;
        boolean r3 = true;
    L6:
        rr2.w(r3);
        if (r0 != 0) goto L10;
        return r10;
    L10:
        if (r11[0] == false) goto L14;
        i(r11);
        return r9 - 3;
    L14:
        if (r0 > 1) goto L16;
    L21:
        if (r0 > 2) goto L23;
    L30:
        int r4 = r10 - 1;
        int r12 = r9 + 2;
    L31:
        if (r12 >= r4) goto L44;
        byte r5 = r8[r12];
        if ((r5 & 254) != 0) goto L43;
        int r6 = r12 - 2;
        if (r8[r6] == 0) goto L38;
    L42:
        r12 = r12 - 2;
        goto L43
    L38:
        if (r8[r12 - 1] != 0) goto L42;
        if (r5 != 1) goto L42;
        i(r11);
        return r6;
    L43:
        r12 = r12 + 3;
        goto L31
    L44:
        if (r0 > 2) goto L46;
        if (r0 != 2) goto L62;
        if (r11[2] == true) goto L57;
    L52:
        boolean r13 = false;
    L66:
        r11[0] = r13;
        if (r0 <= 1) goto L75;
        if (r8[r10 - 2] == 0) goto L71;
    L73:
        boolean r14 = false;
    L79:
        r11[1] = r14;
        if (r8[r4] != 0) goto L82;
        r1 = true;
    L82:
        r11[2] = r1;
        return r10;
    L71:
        if (r8[r4] != 0) goto L73;
    L72:
        r14 = true;
        goto L79
    L75:
        if (r11[2] == false) goto L73;
        if (r8[r4] != 0) goto L73;
    L57:
        if (r8[r10 - 2] != 0) goto L52;
        if (r8[r4] != 1) goto L52;
    L51:
        r13 = true;
        goto L66
    L62:
        if (r11[1] == false) goto L52;
        if (r8[r4] != 1) goto L52;
    L46:
        if (r8[r10 - 3] != 0) goto L52;
        if (r8[r10 - 2] != 0) goto L52;
        if (r8[r4] != 1) goto L52;
    L23:
        if (r11[2] == false) goto L30;
        if (r8[r9] != 0) goto L30;
        if (r8[r9 + 1] != 1) goto L30;
        i(r11);
        return r9 - 1;
    L16:
        if (r11[1] == false) goto L21;
        if (r8[r9] != 1) goto L21;
        i(r11);
        return r9 - 2;
    L5:
        r3 = false;
        goto L6
    }

    public static Drawable p(Context r1, Context r2, int r3, Resources.Theme r4) {
    L6:
        e = move-exception;
        if (r1.getPackageName().equals(r2.getPackageName()) == false) goto L10;
        throw e;
    L10:
        return r2.getDrawable(r3);
    L12:
        i = false;
        goto L13
    L3:
        if (i == false) goto L13;
        return A(r2, r3, r4);
    L13:
        if (r4 != null) goto L16;
        r4 = r2.getTheme();
    L16:
        Resources r5 = r2.getResources();
        ThreadLocal r6 = g14.a;
        return r5.getDrawable(r3, r4);
    }

    public static String q(List r12) {
        int r1 = 0;
    L4:
        if (r1 >= r12.size()) goto L27;
        byte[] r2 = (byte[]) r12.get(r1);
        int r4 = r2.length;
        if (r4 <= 3) goto L26;
        boolean[] r6 = new boolean[3];
        uw1 r7 = yw1.j();
        int r8 = 0;
    L9:
        if (r8 >= r2.length) goto L14;
        int r9 = o(r2, r8, r2.length, r6);
        if (r9 == r2.length) goto L13;
        r7.c(Integer.valueOf(r9));
    L13:
        r8 = r9 + 3;
        goto L9
    L14:
        gy3 r10 = r7.f();
        int r11 = 0;
    L16:
        if (r11 >= r10.q) goto L26;
        if ((((Integer) r10.get(r11)).intValue() + 3) >= r4) goto L25;
        h00 r13 = new h00(r2, ((Integer) r10.get(r11)).intValue() + 3, r4);
        v2 r14 = F(r13);
        if (r14.a != 33) goto L25;
        if (r14.b != 0) goto L25;
        r13.t(4);
        int r15 = r13.i(3);
        r13.s();
        p13 r16 = G(r13, true, r15, null);
        return i40.a(r16.a, r16.b, r16.c, r16.d, r16.e, r16.f);
    L25:
        r11 = r11 + 1;
    L26:
        r1 = r1 + 1;
        goto L4
    L27:
        return null;
    }

    public static String r(tb1 r3) {
        String r0 = r3.n;
        String r1 = r3.k;
        if (Objects.equals(r0, "video/dolby-vision") == false) goto L19;
        if (r1 == null) goto L19;
        if (r1.startsWith("dva1") == false) goto L8;
        return "video/avc";
    L8:
        if (r1.startsWith("dvav") == false) goto L11;
        return "video/avc";
    L11:
        if (r1.startsWith("dvh1") == false) goto L13;
        return "video/hevc";
    L13:
        if (r1.startsWith("dvhe") == false) goto L19;
        return "video/hevc";
    L19:
        return r3.n;
    }

    public static final void s(ne0 r3, Throwable r4) {
        qe0 r0 = (qe0) r3.K(fz0.S);     // Catch: Throwable -> L6
        if (r0 == null) goto L8;
        r0.n(r3, r4);     // Catch: Throwable -> L6
        return;
    L8:
        q05.o(r3, r4);
        return;
    L6:
        th = move-exception;
        if (r4 == th) goto L13;
        RuntimeException r1 = new RuntimeException("Exception while trying to handle coroutine exception", th);
        j51.d(r1, r4);
        r4 = r1;
    L13:
        q05.o(r3, r4);
    }

    public static final int t(int r0, int r1) {
        return (r0 >> r1) & 31;
    }

    public static final int u(int r2) {
        if (r2 == 0) goto L9;
        if (r2 != 1) goto L7;
        return 2;
    L7:
        kf2.n(b11.j(r2, "Could not convert ", " to BackoffPolicy"));
        return 0;
    L9:
        return 1;
    }

    public static final int v(int r3) {
        if (r3 != 0) goto L5;
        return 1;
    L5:
        if (r3 != 1) goto L7;
        return 2;
    L7:
        if (r3 != 2) goto L9;
        return 3;
    L9:
        if (r3 != 3) goto L11;
        return 4;
    L11:
        if (r3 != 4) goto L13;
        return 5;
    L13:
        if (Build.VERSION.SDK_INT < 30) goto L17;
        if (r3 != 5) goto L17;
        return 6;
    L17:
        kf2.n(b11.j(r3, "Could not convert ", " to NetworkType"));
        return 0;
    }

    public static final int w(int r2) {
        if (r2 == 0) goto L9;
        if (r2 != 1) goto L7;
        return 2;
    L7:
        kf2.n(b11.j(r2, "Could not convert ", " to OutOfQuotaPolicy"));
        return 0;
    L9:
        return 1;
    }

    public static final int x(int r2) {
        if (r2 != 0) goto L5;
        return 1;
    L5:
        if (r2 != 1) goto L7;
        return 2;
    L7:
        if (r2 != 2) goto L9;
        return 3;
    L9:
        if (r2 != 3) goto L11;
        return 4;
    L11:
        if (r2 == 4) goto L17;
        if (r2 != 5) goto L15;
        return 6;
    L15:
        kf2.n(b11.j(r2, "Could not convert ", " to State"));
        return 0;
    L17:
        return 5;
    }

    public static boolean y(byte[] r5, int r6, tb1 r7) {
        if (Objects.equals(r7.n, "video/avc") == false) goto L16;
        byte r8 = r5[4];
        if (((r8 & 96) >> 5) != 0) goto L27;
        int r9 = r8 & 31;
        if (r9 != 1) goto L11;
        return false;
    L11:
        if (r9 == 9) goto L29;
        if (r9 != 14) goto L27;
        return false;
    L29:
        return false;
    L27:
        return true;
    L16:
        if (Objects.equals(r7.n, "video/hevc") == false) goto L27;
        v2 r10 = F(new h00(r5, 4, r6 + 4));
        int r11 = r10.a;
        if (r11 == 35) goto L31;
        if (r11 > 14) goto L27;
        if ((r11 % 2) != 0) goto L27;
        if (r10.c != (r7.E - 1)) goto L27;
        return false;
    L31:
        return false;
    }

    public static final boolean z(tv r7) {
        r7.getClass();
        tv r2 = new tv();     // Catch: EOFException -> L22
        long r3 = r7.o;     // Catch: EOFException -> L22
        long r5 = 64;
        if (r3 > 64) goto L7;
        r5 = r3;
    L7:
        r7.n(r2, 0, r5);     // Catch: EOFException -> L22
        int r8 = 0;
    L9:
        if (r8 >= 16) goto L30;
        if (r2.l() == true) goto L19;
        int r1 = r2.R();     // Catch: EOFException -> L22
        if (Character.isISOControl(r1) == false) goto L18;
        if (Character.isWhitespace(r1) == false) goto L21;
    L18:
        r8 = r8 + 1;
        goto L9
    L19:
        return true;
    L30:
        return true;
    L21:
        return false;
    }
}
