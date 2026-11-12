package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.view.ActionMode;
import android.view.Display;
import android.view.WindowManager;
import android.widget.TextView;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ya4 {
    public static final ca1 a = null;
    public static final i61 b = null;
    public static i61 c;
    public static final f01 d = null;
    public static final f01 e = null;

    static {
        a = new ca1(16);
        boolean r6 = false;
        Object r3 = null;
        b = new i61(r3, r3, r3, r6, 8);
        d = new f01(1, "NONE");
        e = new f01(1, "PENDING");
    }

    public static final long A(long r12, float[] r14) {
        if (r14.length >= 16) goto L5;
        return r12;
    L5:
        float r0 = r14[0];
        float r1 = r14[1];
        float r2 = r14[3];
        float r3 = r14[4];
        float r4 = r14[5];
        float r5 = r14[7];
        float r6 = r14[12];
        float r7 = r14[13];
        float r15 = r14[15];
        float r9 = Float.intBitsToFloat((int) (r12 >> 32));
        float r13 = Float.intBitsToFloat((int) (r12 & 4294967295L));
        float r16 = 1.0f / (((r5 * r13) + (r2 * r9)) + r15);
        if ((Float.floatToRawIntBits(r16) & Integer.MAX_VALUE) < 2139095040) goto L9;
        r16 = 0.0f;
    L9:
        float r8 = r4 * r13;
        return (Float.floatToRawIntBits((((r3 * r13) + (r0 * r9)) + r6) * r16) << 32) | (((long) Float.floatToRawIntBits(((r8 + (r1 * r9)) + r7) * r16)) & 4294967295L);
    }

    public static final void B(float[] r24, v03 r25) {
        if (r24.length >= 16) goto L5;
        return;
    L5:
        float r2 = r24[0];
        float r3 = r24[1];
        float r4 = r24[3];
        float r5 = r24[4];
        float r6 = r24[5];
        float r7 = r24[7];
        float r8 = r24[12];
        float r9 = r24[13];
        float r0 = r24[15];
        float r10 = r25.b;
        float r11 = r25.c;
        float r12 = r25.d;
        float r13 = r25.e;
        float r14 = r4 * r10;
        float r15 = r7 * r11;
        float r16 = 1.0f / ((r14 + r15) + r0);
        float r18 = 0.0f;
        if ((Float.floatToRawIntBits(r16) & Integer.MAX_VALUE) < 2139095040) goto L9;
        r16 = 0.0f;
    L9:
        float r1 = r2 * r10;
        float r21 = r5 * r11;
        float r17 = ((r1 + r21) + r8) * r16;
        float r19 = r10 * r3;
        float r110 = r11 * r6;
        float r20 = ((r19 + r110) + r9) * r16;
        float r22 = r7 * r13;
        float r111 = 1.0f / ((r14 + r22) + r0);
        if ((Float.floatToRawIntBits(r111) & Integer.MAX_VALUE) < 2139095040) goto L13;
        r111 = 0.0f;
    L13:
        float r23 = r5 * r13;
        float r26 = ((r1 + r23) + r8) * r111;
        float r27 = r6 * r13;
        float r112 = ((r19 + r27) + r9) * r111;
        float r28 = r4 * r12;
        float r113 = 1.0f / ((r15 + r28) + r0);
        if ((Float.floatToRawIntBits(r113) & Integer.MAX_VALUE) < 2139095040) goto L17;
        r113 = 0.0f;
    L17:
        float r114 = r2 * r12;
        float r115 = ((r114 + r21) + r8) * r113;
        float r116 = r12 * r3;
        float r117 = ((r110 + r116) + r9) * r113;
        float r118 = 1.0f / ((r28 + r22) + r0);
        if ((Float.floatToRawIntBits(r118) & Integer.MAX_VALUE) >= 2139095040) goto L20;
        r18 = r118;
    L20:
        float r119 = ((r114 + r23) + r8) * r18;
        float r120 = ((r116 + r27) + r9) * r18;
        r25.b = Math.min(r17, Math.min(r26, Math.min(r115, r119)));
        r25.c = Math.min(r20, Math.min(r112, Math.min(r117, r120)));
        r25.d = Math.max(r17, Math.max(r26, Math.max(r115, r119)));
        r25.e = Math.max(r20, Math.max(r112, Math.max(r117, r120)));
    }

    public static ne0 C(le0 r1, me0 r2) {
        r2.getClass();
        if (h12.c(r1.getKey(), r2) == true) goto L5;
        return r1;
    L5:
        return q01.n;
    }

    public static Object D(bp0 r6, gf1 r7) {
        ch4 r0 = (ch4) jh4.b.f();
        if ((r0 instanceof ox4) == false) goto L13;
        ox4 r1 = (ox4) r0;
        if (r1.t != te5.m()) goto L13;
        if1 r2 = r1.r;
        if1 r3 = r1.s;
        if1 r8 = jh4.k(r6, r2, true);     // Catch: Throwable -> L10
        ((ox4) r0).r = r8;     // Catch: Throwable -> L10
        ((ox4) r0).s = r3;     // Catch: Throwable -> L10
        Object r9 = r7.invoke();     // Catch: Throwable -> L10
        r1.r = r2;
        r1.s = r3;
        return r9;
    L10:
        th = move-exception;
        r1.r = r2;
        r1.s = r3;
        throw th;
    L13:
        if (r0 == null) goto L19;
        if ((r0 instanceof a13) == true) goto L19;
        ch4 r10 = r0.u(r6);
    L38:
        ch4 r4 = r10.j();     // Catch: Throwable -> L28
        Object r11 = r7.invoke();     // Catch: Throwable -> L30
        ch4.q(r4);     // Catch: Throwable -> L28
        r10.c();
        return r11;
    L30:
        th = move-exception;
        ch4.q(r4);     // Catch: Throwable -> L28
        throw th;     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        r10.c();
        throw th;
    L19:
        if ((r0 instanceof a13) == false) goto L21;
        a13 r5 = (a13) r0;
    L22:
        r10 = new ox4(r5, r6, null, true, false);
        goto L38
    L21:
        r5 = null;
        goto L22
    }

    public static final ArrayList E(List r8, List r9) {
        ju3 r0 = ku3.n;
        if (r8 != null) goto L5;
        r8 = u01.n;
    L5:
        ArrayList r1 = new ArrayList();
        Iterator r10 = r8.iterator();
    L7:
        if (r10.hasNext() == false) goto L11;
        Object r2 = r10.next();
        if (((ArtistID3) r2).getId() == null) goto L7;
        r1.add(r2);
        goto L7
    L11:
        HashSet r11 = new HashSet();
        ArrayList r3 = new ArrayList();
        int r4 = r1.size();
        int r5 = 0;
        int r6 = 0;
    L12:
        if (r6 >= r4) goto L16;
        Object r7 = r1.get(r6);
        r6 = r6 + 1;
        if (r11.add(((ArtistID3) r7).getId()) == false) goto L12;
        r3.add(r7);
        goto L12
    L16:
        List r12 = gb.a0(r3, r0);
        HashSet r13 = new HashSet();
        ArrayList r14 = (ArrayList) r12;
        int r15 = r14.size();
        int r16 = 0;
    L17:
        if (r16 >= r15) goto L19;
        Object r17 = r14.get(r16);
        r16 = r16 + 1;
        r13.add(((ArtistID3) r17).getId());
        goto L17
    L19:
        ArrayList r18 = new ArrayList();
        Iterator r19 = r9.iterator();
    L21:
        if (r19.hasNext() == false) goto L27;
        Object r20 = r19.next();
        ArtistID3 r21 = (ArtistID3) r20;
        if (r21.getId() == null) goto L21;
        if (r13.contains(r21.getId()) == true) goto L21;
        r18.add(r20);
        goto L21
    L27:
        HashSet r22 = new HashSet();
        ArrayList r23 = new ArrayList();
        int r24 = r18.size();
    L28:
        if (r5 >= r24) goto L33;
        Object r25 = r18.get(r5);
        r5 = r5 + 1;
        if (r22.add(((ArtistID3) r25).getId()) == false) goto L28;
        r23.add(r25);
        goto L28
    L33:
        return q40.G0(r12, gb.a0(r23, r0));
    }

    public static ne0 F(le0 r3, ne0 r4) {
        r4.getClass();
        if (r4 != q01.n) goto L6;
        return r3;
    L6:
        return (ne0) r4.s(new d60(9, 0), r3);
    }

    public static final void G(float[] r3) {
        if (r3.length >= 16) goto L5;
        return;
    L5:
        r3[0] = 1.0f;
        r3[1] = 0.0f;
        r3[2] = 0.0f;
        r3[3] = 0.0f;
        r3[4] = 0.0f;
        r3[5] = 1.0f;
        r3[6] = 0.0f;
        r3[7] = 0.0f;
        r3[8] = 0.0f;
        r3[9] = 0.0f;
        r3[10] = 1.0f;
        r3[11] = 0.0f;
        r3[12] = 0.0f;
        r3[13] = 0.0f;
        r3[14] = 0.0f;
        r3[15] = 1.0f;
    }

    public static void H(ch4 r0, ch4 r1, if1 r2) {
        if (r0 == r1) goto L4;
        r1.getClass();
        ch4.q(r0);
        r1.c();
        return;
    L4:
        if ((r0 instanceof ox4) == false) goto L8;
        ((ox4) r0).r = r2;
        return;
    L8:
        if ((r0 instanceof px4) == false) goto L11;
        ((px4) r0).h = r2;
        return;
    L11:
        mj0.g(r0, "Non-transparent snapshot was reused: ");
    }

    public static void I(TextView r3, int r4) {
        l93.k(r4);
        if (Build.VERSION.SDK_INT < 28) goto L6;
        ne.r(r3, r4);
        return;
    L6:
        Paint.FontMetricsInt r0 = r3.getPaint().getFontMetricsInt();
        if (r3.getIncludeFontPadding() == false) goto L9;
        int r1 = r0.top;
    L11:
        if (r4 <= Math.abs(r1)) goto L14;
        int r5 = r4 + r1;
        r3.setPadding(r3.getPaddingLeft(), r5, r3.getPaddingRight(), r3.getPaddingBottom());
        return;
    L14:
        return;
    L9:
        r1 = r0.ascent;
        goto L11
    }

    public static void J(TextView r3, int r4) {
        l93.k(r4);
        Paint.FontMetricsInt r0 = r3.getPaint().getFontMetricsInt();
        if (r3.getIncludeFontPadding() == false) goto L5;
        int r1 = r0.bottom;
    L7:
        if (r4 <= Math.abs(r1)) goto L10;
        int r5 = r4 - r1;
        r3.setPadding(r3.getPaddingLeft(), r3.getPaddingTop(), r3.getPaddingRight(), r5);
        return;
    L10:
        return;
    L5:
        r1 = r0.descent;
        goto L7
    }

    public static void K(TextView r2, int r3) {
        l93.k(r3);
        int r0 = r2.getPaint().getFontMetricsInt(null);
        if (r3 == r0) goto L6;
        r2.setLineSpacing(r3 - r0, 1.0f);
        return;
    }

    public static final vu3 L(gc0 r9, td0 r10, il4 r11, Float r12) {
        y00.d.getClass();
        x00 r0 = x00.a;
        rf2 r1 = new rf2(r9, q01.n);
        nl4 r5 = a(r12);
        ne0 r13 = (ne0) r1.o;
        p81 r4 = (p81) r1.n;
        if (r11.equals(id4.a) == false) goto L5;
        ze0 r2 = ze0.n;
    L6:
        fu.F(r10, r13, r2, new x70(r11, r4, r5, r12, null, 4));
        return new vu3(r5);
    L5:
        r2 = ze0.q;
        goto L6
    }

    public static final int M(h03 r10) {
        int r0 = r10.b;
        int r1 = r10.b(0);
    L4:
        if (r10.b == 0) goto L21;
        if (r10.b(0) != r1) goto L21;
        int r2 = r10.b;
        if (r2 == 0) goto L19;
        r10.d(0, r10.a[r2 - 1]);
        r10.c(r10.b - 1);
        int r3 = r10.b;
        int r4 = r3 >>> 1;
        int r5 = 0;
    L10:
        if (r5 >= r4) goto L4;
        int r6 = r10.b(r5);
        int r7 = (r5 + 1) * 2;
        int r8 = r7 - 1;
        int r9 = r10.b(r8);
        if (r7 >= r3) goto L17;
        int r11 = r10.b(r7);
        if (r11 <= r9) goto L17;
        if (r11 <= r6) goto L4;
        r10.d(r5, r11);
        r10.d(r7, r6);
        r5 = r7;
    L17:
        if (r9 <= r6) goto L4;
        r10.d(r5, r9);
        r10.d(r8, r6);
        r5 = r8;
        goto L10
    L19:
        kf2.m("IntList is empty.");
        return 0;
    L21:
        return r1;
    }

    public static void N(float[] r8, float r9, float r10) {
        if (r8.length >= 16) goto L5;
        return;
    L5:
        float r0 = r8[0] * r9;
        float r1 = (r8[4] * r10) + r0;
        float r2 = ((r8[8] * 0.0f) + r1) + r8[12];
        float r3 = r8[1] * r9;
        float r4 = (r8[5] * r10) + r3;
        float r5 = ((r8[9] * 0.0f) + r4) + r8[13];
        float r6 = r8[2] * r9;
        float r7 = (r8[6] * r10) + r6;
        float r11 = ((r8[10] * 0.0f) + r7) + r8[14];
        float r12 = r8[3] * r9;
        float r13 = (r8[7] * r10) + r12;
        float r14 = ((r8[11] * 0.0f) + r13) + r8[15];
        r8[12] = r2;
        r8[13] = r5;
        r8[14] = r11;
        r8[15] = r14;
    }

    public static ActionMode.Callback O(ActionMode.Callback r2) {
        if ((r2 instanceof dt4) == true) goto L5;
        return r2;
    L5:
        if (Build.VERSION.SDK_INT >= 26) goto L7;
        return r2;
    L7:
        return ((dt4) r2).a;
    }

    public static ActionMode.Callback P(ActionMode.Callback r2, TextView r3) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 26) goto L5;
    L12:
        return r2;
    L5:
        if (r0 > 27) goto L12;
        if ((r2 instanceof dt4) == true) goto L12;
        if (r2 == null) goto L12;
        return new dt4(r2, r3);
    }

    public static Object Q(wf1 r2, Object r3, vd0 r4) {
        r2.getClass();
        ne0 r0 = r4.getContext();
        if (r0 != q01.n) goto L5;
        Object r1 = new k12(r4);
    L6:
        jz4.j(2, r2);
        return r2.invoke(r3, r1);
    L5:
        r1 = new l12(r4, r0);
        goto L6
    }

    public static final nl4 a(Object r1) {
        if (r1 != null) goto L6;
        r1 = xl.e;
    L6:
        return new nl4(r1);
    }

    public static final void b(dx2 r45, final lm0 r46, final ac3 r47, wg4 r48, final boolean r49, final tb r50, final float r51, final rv2 r52, y43 r53, final if1 r54, final gs r55, final rv2 r56, final r70 r57, rg1 r58, final int r59, final int r60) {
        Object r8 = fz0.z;
        r58.S(-572816025);
        int r16 = 2;
        if ((r59 & 6) == 0) goto L5;
        int r17 = r59;
    L10:
        int r19 = 16;
        if ((r59 & 48) == 0) goto L13;
    L17:
        int r20 = 128;
        if ((r59 & 384) == 0) goto L20;
    L24:
        int r22 = 1024;
        if ((r59 & 3072) == 0) goto L27;
    L31:
        int r24 = 8192;
        if ((r59 & 24576) == 0) goto L34;
    L38:
        int r27 = 65536;
        if ((r59 & 196608) == 0) goto L41;
    L45:
        int r30 = 524288;
        if ((r59 & 1572864) != 0) goto L53;
        if (r58.f(r49) == false) goto L50;
        int r29 = 1048576;
    L51:
        r17 = r17 | r29;
        goto L53
    L50:
        r29 = 524288;
    L53:
        if ((r59 & 12582912) != 0) goto L60;
        if (r58.e(r50) == false) goto L57;
        int r33 = 8388608;
    L58:
        r17 = r17 | r33;
        goto L60
    L57:
        r33 = 4194304;
    L60:
        if ((r59 & 100663296) != 0) goto L67;
        if (r58.d(0) == false) goto L64;
        int r11 = 67108864;
    L65:
        r17 = r17 | r11;
        goto L67
    L64:
        r11 = 33554432;
    L67:
        if ((r59 & 805306368) != 0) goto L74;
        if (r58.c(r51) == false) goto L71;
        int r35 = 536870912;
    L72:
        r17 = r17 | r35;
        goto L74
    L71:
        r35 = 268435456;
    L74:
        if ((r60 & 6) == 0) goto L76;
        int r18 = r60;
    L81:
        if ((r60 & 48) != 0) goto L87;
        if (r58.g(r53) == false) goto L85;
        r19 = 32;
    L85:
        r18 = r18 | r19;
    L87:
        if ((r60 & 384) != 0) goto L93;
        if (r58.g(r54) == false) goto L91;
        r20 = 256;
    L91:
        r18 = r18 | r20;
    L93:
        if ((r60 & 3072) != 0) goto L99;
        if (r58.e(r8) == false) goto L97;
        r22 = 2048;
    L97:
        r18 = r18 | r22;
    L99:
        if ((r60 & 24576) != 0) goto L105;
        if (r58.e(r55) == false) goto L103;
        r24 = 16384;
    L103:
        r18 = r18 | r24;
    L105:
        if ((r60 & 196608) != 0) goto L111;
        if (r58.e(r56) == false) goto L109;
        r27 = 131072;
    L109:
        r18 = r18 | r27;
    L111:
        if ((r60 & 1572864) != 0) goto L116;
        if (r58.g(r57) == false) goto L115;
        r30 = 1048576;
    L115:
        r18 = r18 | r30;
    L116:
        int r1 = r18;
        if ((r17 & 306783379) == 306783378) goto L121;
    L124:
        boolean r2 = true;
    L126:
        if (r58.K(r17 & 1, r2) == false) goto L310;
        int r3 = r17 & 112;
        if (r3 != 32) goto L130;
        boolean r110 = true;
    L131:
        Object r7 = r58.H();
        Object r13 = j80.a;
        if (r110 == true) goto L134;
        if (r7 == r13) goto L134;
    L135:
        Object r9 = (gf1) r7;
        int r111 = r17 >> 3;
        int r21 = r111 & 14;
        int r12 = r1 >> 15;
        int r14 = (r21 | (r12 & 112)) | (r1 & 896);
        Object r4 = uc5.S(r57, r58);
        Object r15 = uc5.S(r54, r58);
        if (((r14 & 14) ^ 6) <= 4) goto L140;
        if (r58.e(r46) == false) goto L140;
    L141:
        boolean r112 = true;
    L143:
        boolean r113 = ((r112 | r58.e(r4)) | r58.e(r15)) | r58.e(r9);
        Object r114 = r58.H();
        if (r113 == true) goto L146;
        if (r114 == r13) goto L146;
    L147:
        k82 r10 = (k82) r114;
        Object r0 = r58.H();
        if (r0 != r13) goto L150;
        Object r5 = new yy3(r58.R);
        r58.b0(r5);
        r0 = r5;
    L150:
        final we0 r115 = (we0) r0;
        if (r3 != 32) goto L153;
        boolean r6 = true;
    L154:
        Object r23 = r58.H();
        if (r6 == true) goto L157;
        if (r23 == r13) goto L157;
    L158:
        gf1 r25 = (gf1) r23;
        int r116 = r17 >> 9;
        int r26 = (((r17 & 65520) | (r116 & 458752)) | (r116 & 3670016)) | ((r1 << 21) & 29360128);
        int r117 = r1 << 15;
        int r28 = (r26 | (r117 & 234881024)) | (r117 & 1879048192);
        if (((r28 & 112) ^ 48) <= 32) goto L163;
        if (r58.e(r46) == false) goto L163;
    L164:
        boolean r118 = true;
    L167:
        if (((r28 & 896) ^ 384) <= 256) goto L171;
        if (r58.e(r47) == false) goto L171;
    L172:
        boolean r31 = true;
    L174:
        boolean r32 = r31 | r118;
        if (((r28 & 7168) ^ 3072) <= 2048) goto L179;
        if (r58.f(false) == false) goto L179;
    L180:
        boolean r119 = true;
    L182:
        boolean r34 = r32 | r119;
        if (((57344 & r28) ^ 24576) <= 16384) goto L189;
        if (r58.d(1) == false) goto L189;
    L190:
        boolean r120 = true;
    L192:
        boolean r36 = r34 | r120;
        if (((r28 & 234881024) ^ 100663296) <= 67108864) goto L197;
        if (r58.e(r8) == false) goto L197;
    L198:
        boolean r37 = true;
    L200:
        boolean r38 = r36 | r37;
        if (((r28 & 1879048192) ^ 805306368) <= 536870912) goto L205;
        if (r58.e(r55) == false) goto L205;
    L206:
        boolean r39 = true;
    L208:
        boolean r40 = r38 | r39;
        if (((r28 & 3670016) ^ 1572864) <= 1048576) goto L213;
        if (r58.c(r51) == false) goto L213;
    L214:
        boolean r41 = true;
    L216:
        boolean r42 = r40 | r41;
        if (((r28 & 29360128) ^ 12582912) <= 8388608) goto L221;
        if (r58.e(r52) == false) goto L221;
    L222:
        boolean r43 = true;
    L224:
        boolean r44 = r42 | r43;
        int r121 = 4;
        if (((r12 & 14) ^ 6) <= 4) goto L229;
        if (r58.e(r56) == false) goto L229;
    L230:
        boolean r61 = true;
    L232:
        boolean r62 = (r44 | r61) | r58.e(r25);
        if (((r28 & 458752) ^ 196608) <= 131072) goto L237;
        if (r58.d(0) == false) goto L237;
    L238:
        boolean r63 = true;
    L240:
        boolean r64 = (r63 | r62) | r58.e(r115);
        Object r65 = r58.H();
        if (r64 == true) goto L245;
        if (r65 == r13) goto L245;
        int r122 = 32;
    L246:
        pc3 r66 = (pc3) r65;
        if ((r21 ^ 6) <= 4) goto L251;
        if (r58.e(r46) == false) goto L251;
    L252:
        boolean r210 = true;
    L255:
        boolean r67 = r210 | r58.f(false);
        Object r68 = r58.H();
        if (r67 == true) goto L258;
        if (r68 == r13) goto L258;
    L259:
        s82 r69 = (s82) r68;
        if (r39 != r122) goto L262;
        boolean r70 = true;
    L264:
        if ((r17 & 458752) != 131072) goto L266;
        boolean r71 = true;
    L267:
        boolean r72 = r70 | r71;
        Object r73 = r58.H();
        if (r72 == true) goto L272;
        if (r73 == r13) goto L272;
        wg4 r123 = r48;
    L273:
        gd3 r74 = (gd3) r73;
        fv r75 = (fv) r58.i(hv.a);
        r62 r76 = (r62) r58.i(g90.n);
        if (r3 != r122) goto L276;
        boolean r77 = true;
    L277:
        boolean r78 = (r77 | r58.e(r75)) | r58.d(r76.ordinal());
        Object r79 = r58.H();
        if (r78 == true) goto L280;
        if (r79 == r13) goto L280;
    L281:
        ec3 r80 = (ec3) r79;
        ax2 r81 = ax2.a;
        if (r49 == false) goto L304;
        r58.R(-853734429);
        int r82 = r21 | ((r17 >> 21) & 112);
        if (((r82 & 14) ^ 6) <= 4) goto L288;
        if (r58.e(r46) == false) goto L288;
    L289:
        boolean r83 = true;
    L292:
        if (((r82 & 112) ^ 48) <= r122) goto L296;
        if (r58.d(0) == false) goto L296;
    L297:
        boolean r211 = true;
    L299:
        boolean r84 = r83 | r211;
        Object r85 = r58.H();
        if (r84 == true) goto L302;
        if (r85 == r13) goto L302;
    L303:
        dx2 r86 = ji2.y((dc3) r85, r46.v);
        final boolean r87 = false;
        r58.o(false);
    L305:
        dx2 r124 = r45;
        dx2 r88 = rr2.L(r124.c(r46.y).c(r46.w), r10, r69, r49);
        if (r49 == false) goto L308;
        if1 r89 = new ic3(r87, r46, r115);
        AtomicInteger r90 = f94.a;
        dx2 r91 = r88.c(new zh(r89));
    L309:
        dx2 r92 = vr1.F(r91.c(r86), r46, r50, r49, r74, r46.p, r80);
        lm0 r93 = r46;
        si1 r94 = new si1(r121, r93);
        kn3 r95 = gp4.a;
        y43 r125 = r53;
        su3.b(r10, te5.F(r92.c(new fp4(r93, null, r94, 6)), r125), r93.t, r66, r58, 0);
    L311:
        lv3 r96 = r58.p();
        if (r96 == null) goto L315;
        final lm0 r97 = r93;
        final wg4 r98 = r123;
        final y43 r99 = r125;
        final dx2 r100 = r124;
        r96.d = new i82(r100, r97, r47, r98, r49, r50, r51, r52, r99, r54, r55, r56, r57, r59, r60);
        return;
    L315:
        return;
    L308:
        r91 = r88.c(r81);
    L302:
        r85 = new dc3(r46);
        r58.b0(r85);
    L296:
        if ((r82 & 48) == r122) goto L297;
        r211 = false;
    L288:
        if ((r82 & 6) == 4) goto L289;
        r83 = false;
        goto L292
    L304:
        r87 = false;
        r58.R(-853304645);
        r58.o(false);
        r86 = r81;
    L280:
        r79 = new ec3(r46, r75, r76);
        r58.b0(r79);
        goto L281
    L276:
        r77 = false;
    L272:
        r123 = r48;
        r73 = new gd3(r123, r46);
        r58.b0(r73);
        goto L273
    L266:
        r71 = false;
        goto L267
    L262:
        r70 = false;
    L258:
        r68 = new s82(r46, false);
        r58.b0(r68);
    L251:
        if ((r111 & 6) == 4) goto L252;
        r210 = false;
    L245:
        r122 = 32;
        r65 = new pc3(r46, r47, r51, r52, r10, r25, r55, r56, r115);
        r58.b0(r65);
    L237:
        if ((r28 & 196608) == 131072) goto L238;
        r63 = false;
    L229:
        if ((r12 & 6) == 4) goto L230;
        r61 = false;
    L221:
        if ((r28 & 12582912) == 8388608) goto L222;
        r43 = false;
    L213:
        if ((r28 & 1572864) == 1048576) goto L214;
        r41 = false;
    L205:
        if ((r28 & 805306368) == 536870912) goto L206;
        r39 = false;
    L197:
        if ((r28 & 100663296) == 67108864) goto L198;
        r37 = false;
    L189:
        if ((r28 & 24576) == 16384) goto L190;
        r120 = false;
    L179:
        if ((r28 & 3072) == 2048) goto L180;
        r119 = false;
    L171:
        if ((r28 & 384) == 256) goto L172;
        r31 = false;
    L163:
        if ((r28 & 48) == 32) goto L164;
        r118 = false;
    L157:
        r23 = new h82(r46, 1);
        r58.b0(r23);
        goto L158
    L153:
        r6 = false;
    L146:
        rv2 r126 = rv2.A;
        jo r127 = new jo(r4, r15, r9, 5);
        z05 r101 = ph4.a;
        int r310 = 0;
        int r311 = 0;
        Class<kl4> r410 = kl4.class;
        r114 = new k82(r310, r311, r410, new dp0(new fa(11, new dp0(r127, r126), r46), r126), "value", "getValue()Ljava/lang/Object;");
        r58.b0(r114);
    L140:
        if ((r14 & 6) == 4) goto L141;
        r112 = false;
    L134:
        r7 = new h82(r46, 0);
        r58.b0(r7);
        goto L135
    L130:
        r110 = false;
        goto L131
    L310:
        r123 = r48;
        r93 = r46;
        r125 = r53;
        r124 = r45;
        r58.N();
        goto L311
    L121:
        if ((599187 & r1) != 599186) goto L124;
        r2 = false;
        goto L126
    L76:
        if (r58.e(r52) == false) goto L78;
        r16 = 4;
    L78:
        r18 = r60 | r16;
        goto L81
    L41:
        if (r58.e(r48) == false) goto L43;
        int r212 = 131072;
    L44:
        r17 = r17 | r212;
        goto L45
    L43:
        r212 = 65536;
        goto L44
    L34:
        if (r58.d(1) == false) goto L36;
        int r128 = 16384;
    L37:
        r17 = r17 | r128;
        goto L38
    L36:
        r128 = 8192;
        goto L37
    L27:
        if (r58.f(false) == false) goto L29;
        int r213 = 2048;
    L30:
        r17 = r17 | r213;
        goto L31
    L29:
        r213 = 1024;
        goto L30
    L20:
        if (r58.e(r47) == false) goto L22;
        int r214 = 256;
    L23:
        r17 = r17 | r214;
        goto L24
    L22:
        r214 = 128;
        goto L23
    L13:
        if (r58.e(r46) == false) goto L15;
        int r129 = 32;
    L16:
        r17 = r17 | r129;
        goto L17
    L15:
        r129 = 16;
        goto L16
    L5:
        if (r58.e(r45) == false) goto L7;
        int r130 = 4;
    L8:
        r17 = r59 | r130;
        goto L10
    L7:
        r130 = 2;
        goto L8
    }

    public static final void c(h03 r3, int r4) {
        if (r3.b != 0) goto L5;
    L9:
        int r0 = r3.b;
        r3.a(r4);
    L10:
        if (r0 <= 0) goto L14;
        int r1 = ((r0 + 1) >>> 1) - 1;
        int r2 = r3.b(r1);
        if (r4 <= r2) goto L14;
        r3.d(r0, r2);
        r0 = r1;
    L14:
        r3.d(r0, r4);
        return;
    L5:
        if (r3.b(0) != r4) goto L7;
        return;
    L7:
        if (r3.b(r3.b - 1) != r4) goto L9;
    }

    public static Long d(String r9) {
        if (r9 == null) goto L21;
        String r10 = qm4.K0(r9).toString();
        if (r10 == null) goto L23;
        List r11 = qm4.D0(r10, new char[]{':'});
        if (r11.size() != 3) goto L28;
        Long r1 = xm4.m0((String) r11.get(0));
        if (r1 == null) goto L24;
        long r2 = r1.longValue();
        Long r0 = xm4.m0((String) r11.get(1));
        if (r0 == null) goto L25;
        long r3 = r0.longValue();
        Long r12 = xm4.m0(qm4.H0((String) r11.get(2), '.'));
        if (r12 == null) goto L26;
        long r5 = r12.longValue();
        if (r3 < 60) goto L17;
        return null;
    L17:
        if (r5 < 60) goto L20;
        return null;
    L20:
        return Long.valueOf(((((r2 * 60) + r3) * 60) + r5) * 1000);
    L26:
        return null;
    L25:
        return null;
    L24:
        return null;
    L28:
        return null;
    L23:
        return null;
    L21:
        return null;
    }

    public static p81 e(p81 r3, int r4) {
        if (r4 < 0) goto L5;
    L10:
        if (r4 != (-1)) goto L12;
        r4 = 0;
        wv r0 = wv.o;
    L13:
        boolean r1 = r3 instanceof jg1;
        q01 r2 = q01.n;
        if (r1 == false) goto L18;
        return ((jg1) r3).c(r2, r4, r0);
    L18:
        return new b10(r3, r2, r4, r0);
    L12:
        r0 = wv.n;
        goto L13
    L5:
        if (r4 == (-2)) goto L10;
        if (r4 == (-1)) goto L10;
        kf2.e(f34.f(r4, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
        return null;
    }

    public static final Serializable f(j91 r4, q81 r5, wd0 r6) {
        if ((r6 instanceof u81) == false) goto L7;
        u81 r0 = (u81) r6;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.p = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.o;
        int r2 = r0.p;
        if (r2 == 0) goto L18;
        if (r2 != 1) goto L16;
        jx3 r8 = r0.n;
        kb4.X(r7);     // Catch: Throwable -> L14
    L23:
        return null;
    L14:
        th = th;
    L26:
        Throwable r9 = (Throwable) r8.n;
        if (r9 != null) goto L29;
    L30:
        s22 r10 = (s22) r0.getContext().K(fz0.h0);
        if (r10 != null) goto L33;
    L41:
        if (r9 != null) goto L44;
        return th;
    L44:
        if ((th instanceof CancellationException) == false) goto L47;
        j51.d(r9, th);
        throw r9;
    L47:
        j51.d(th, r9);
        throw th;
    L33:
        if (r10.isCancelled() == false) goto L41;
        CancellationException r11 = r10.q();
        if (r11 == null) goto L41;
        if (r11.equals(th) == false) goto L41;
    L40:
        throw th;
    L29:
        if (r9.equals(th) == true) goto L40;
    L16:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r7);
        jx3 r12 = new jx3();
        q81 r3 = new gs0(r5, r12);     // Catch: Throwable -> L24
        r0.n = r12;     // Catch: Throwable -> L24
        r0.p = 1;     // Catch: Throwable -> L24
        Object r13 = r4.a(r3, r0);     // Catch: Throwable -> L24
        xe0 r14 = xe0.n;
        if (r13 != r14) goto L23;
        return r14;
    L24:
        th = th;
        r8 = r12;
    L7:
        r0 = new u81(r6);
        goto L8
    }

    public static void g(int r4) {
        if (2 <= r4) goto L5;
    L7:
        StringBuilder r5 = f34.j(r4, "radix ", " was not in valid range ");
        kf2.g(new j02(2, 36, 1), r5);
        return;
    L5:
        if (r4 >= 37) goto L7;
    }

    public static float[] h() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vd0 i(vd0 r2, vd0 r3, wf1 r4) {
        r4.getClass();
        if ((r4 instanceof jp) == true) goto L5;
        ne0 r0 = r3.getContext();
        if (r0 != q01.n) goto L11;
        return new i12(r3, r2, r4);
    L11:
        return new j12(r3, r0, r4, r2);
    L5:
        return ((jp) r4).create(r2, r3);
    }

    public static b54 j(Bundle r3, Bundle r4) {
        if (r3 != null) goto L4;
        r3 = r4;
    L4:
        if (r3 != null) goto L7;
        b54 r5 = new b54();
        new LinkedHashMap();
        r5.a = new z40(v01.n);
        return r5;
    L7:
        ClassLoader r6 = b54.class.getClassLoader();
        r6.getClass();
        r3.setClassLoader(r6);
        ag2 r0 = new ag2(r3.size());
        Iterator<String> r7 = r3.keySet().iterator();
    L9:
        if (r7.hasNext() == false) goto L11;
        String r1 = r7.next();
        r1.getClass();
        r0.put(r1, r3.get(r1));
        goto L9
    L11:
        ag2 r8 = r0.b();
        b54 r9 = new b54();
        new LinkedHashMap();
        r9.a = new z40(r8);
        return r9;
    }

    public static byte[] k(String r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return Base64.decode(r1, 11);
    }

    public static final p81 m(p81 r1) {
        if ((r1 instanceof ll4) == false) goto L6;
        return r1;
    L6:
        if ((r1 instanceof hs0) == false) goto L9;
        return r1;
    L9:
        return new hs0(r1);
    }

    public static String n(byte[] r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return Base64.encodeToString(r1, 11);
    }

    public static final boolean o(char r2, char r3, boolean r4) {
        if (r2 != r3) goto L6;
        return true;
    L6:
        if (r4 == true) goto L8;
        return false;
    L8:
        char r5 = Character.toUpperCase(r2);
        char r6 = Character.toUpperCase(r3);
        if (r5 != r6) goto L11;
    L14:
        return true;
    L11:
        if (Character.toLowerCase(r5) == Character.toLowerCase(r6)) goto L14;
        return false;
    }

    public static final Object p(gc0 r5, wd0 r6) {
        f01 r0 = xl.e;
        if ((r6 instanceof d91) == false) goto L7;
        d91 r1 = (d91) r6;
        int r2 = r1.q;
        if ((r2 & Integer.MIN_VALUE) == 0) goto L7;
        r1.q = r2 - Integer.MIN_VALUE;
    L8:
        Object r7 = r1.p;
        int r3 = r1.q;
        int r4 = 1;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L16;
        fc0 r8 = r1.o;
        jx3 r9 = r1.n;
        kb4.X(r7);     // Catch: AbortFlowException -> L14
    L28:
        Object r10 = r9.n;
        if (r10 == r0) goto L31;
        return r10;
    L31:
        kf2.m("Expected at least one element");
        return null;
    L14:
        AbortFlowException e2 = e;
    L27:
        if (e2.n == r8) goto L28;
        throw e2;
    L16:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r7);
        jx3 r11 = new jx3();
        r11.n = r0;
        fc0 r12 = new fc0(r4, r11);
        r1.n = r11;     // Catch: AbortFlowException -> L24
        r1.o = r12;     // Catch: AbortFlowException -> L24
        r1.q = 1;     // Catch: AbortFlowException -> L24
        Object r13 = r5.a(r12, r1);     // Catch: AbortFlowException -> L24
        Object r14 = xe0.n;
        if (r13 != r14) goto L23;
        return r14;
    L23:
        r9 = r11;
    L24:
        e = move-exception;
        r9 = r11;
        e2 = e;
        r8 = r12;
    L7:
        r1 = new d91(r6);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [wf1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [p81] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, wf1] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.StringBuilder] */
    public static final Object q(p81 r5, wf1 r6, wd0 r7) {
        f01 r0 = xl.e;
        if ((r7 instanceof e91) == false) goto L7;
        e91 r1 = (e91) r7;
        int r2 = r1.r;
        if ((r2 & Integer.MIN_VALUE) == 0) goto L7;
        r1.r = r2 - Integer.MIN_VALUE;
    L8:
        Object r8 = r1.q;
        int r3 = r1.r;
        int r4 = 1;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L16;
        lv0 r9 = r1.p;
        jx3 r10 = r1.o;
        ?? r11 = (wf1) r1.n;
        kb4.X(r8);     // Catch: AbortFlowException -> L14
        ?? r12 = r11;
    L28:
        Object r13 = r10.n;
        if (r13 == r0) goto L32;
        return r13;
    L32:
        throw new NoSuchElementException("Expected at least one element matching the predicate " + r12);
    L14:
        AbortFlowException e2 = e;
    L26:
        r12 = r11;
        if (e2.n == r9) goto L28;
        throw e2;
    L16:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r8);
        jx3 r14 = new jx3();
        r14.n = r0;
        lv0 r15 = new lv0(r4, r6, r14);
        r1.n = (ep4) r6;     // Catch: AbortFlowException -> L24
        r1.o = r14;     // Catch: AbortFlowException -> L24
        r1.p = r15;     // Catch: AbortFlowException -> L24
        r1.r = 1;     // Catch: AbortFlowException -> L24
        Object r16 = r5.a(r15, r1);     // Catch: AbortFlowException -> L24
        xe0 r17 = xe0.n;
        if (r16 != r17) goto L23;
        return r17;
    L23:
        r12 = r6;
        r10 = r14;
    L24:
        e = move-exception;
        r11 = r6;
        r10 = r14;
        e2 = e;
        r9 = r15;
    L7:
        r1 = new e91(r7);
        goto L8
    }

    public static le0 r(le0 r1, me0 r2) {
        r2.getClass();
        if (h12.c(r1.getKey(), r2) == false) goto L5;
        return r1;
    L5:
        return null;
    }

    public static ch4 t() {
        return (ch4) jh4.b.f();
    }

    public static Rect u(Context r2) {
        WindowManager r3 = (WindowManager) r2.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) goto L5;
        Display r4 = r3.getDefaultDisplay();
        Point r0 = new Point();
        r4.getRealSize(r0);
        Rect r5 = new Rect();
        r5.right = r0.x;
        r5.bottom = r0.y;
        return r5;
    L5:
        return hb5.d(hb5.g(r3));
    }

    public static String v(Context r1, int r2) {
        r1.getClass();
        if (r2 <= 16777215) goto L5;
        String r3 = r1.getResources().getResourceName(r2);     // Catch: Resources.NotFoundException -> L8
    L9:
        r3.getClass();
        return r3;
    L8:
        r3 = String.valueOf(r2);
        goto L9
    L5:
        return String.valueOf(r2);
    }

    public static mo3 w(mh r8) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 28) goto L5;
        TextPaint r2 = new TextPaint(r8.getPaint());
        TextDirectionHeuristic r3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int r4 = r8.getBreakStrategy();
        int r5 = r8.getHyphenationFrequency();
        if ((r8.getTransformationMethod() instanceof PasswordTransformationMethod) == false) goto L9;
        r3 = TextDirectionHeuristics.LTR;
    L34:
        return new mo3(r2, r3, r4, r5);
    L9:
        boolean r6 = true;
        if (r0 < 28) goto L21;
        if ((r8.getInputType() & 15) != 3) goto L21;
        byte r9 = Character.getDirectionality(ne.d(DecimalFormatSymbols.getInstance(r8.getTextLocale()))[0].codePointAt(0));
        if (r9 != 1) goto L16;
    L19:
        r3 = TextDirectionHeuristics.RTL;
        goto L34
    L16:
        if (r9 == 2) goto L19;
        r3 = TextDirectionHeuristics.LTR;
    L21:
        if (r8.getLayoutDirection() == 1) goto L25;
        r6 = false;
    L25:
        switch(r8.getTextDirection()) {
            case 2: goto L32;
            case 3: goto L31;
            case 4: goto L30;
            case 5: goto L29;
            case 6: goto L34;
            case 7: goto L28;
            default: goto L26;
        };
    L26:
        if (r6 == false) goto L34;
        r3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        goto L34
    L28:
        r3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        goto L34
    L29:
        r3 = TextDirectionHeuristics.LOCALE;
        goto L34
    L30:
        r3 = TextDirectionHeuristics.RTL;
        goto L34
    L31:
        r3 = TextDirectionHeuristics.LTR;
        goto L34
    L32:
        r3 = TextDirectionHeuristics.ANYRTL_LTR;
        goto L34
    L5:
        return new mo3(ne.o(r8));
    }

    public static vd0 x(vd0 r1) {
        r1.getClass();
        if ((r1 instanceof wd0) == false) goto L5;
        wd0 r0 = (wd0) r1;
    L6:
        if (r0 == null) goto L11;
        vd0<Object> r2 = r0.intercepted();
        if (r2 == null) goto L11;
        return r2;
    L11:
        return r1;
    L5:
        r0 = null;
        goto L6
    }

    public static boolean y(char r1) {
        if (Character.isWhitespace(r1) == false) goto L5;
        return true;
    L5:
        if (Character.isSpaceChar(r1) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public static ch4 z(ch4 r6) {
        if ((r6 instanceof ox4) == false) goto L9;
        ox4 r0 = (ox4) r6;
        if (r0.t != te5.m()) goto L9;
        r0.r = null;
        return r6;
    L9:
        if ((r6 instanceof px4) == false) goto L14;
        px4 r1 = (px4) r6;
        if (r1.i != te5.m()) goto L14;
        r1.h = null;
        return r6;
    L14:
        ch4 r7 = jh4.g(r6, null, false);
        r7.j();
        return r7;
    }

    public abstract int l(g60 r1);

    public abstract wv3 s();
}
