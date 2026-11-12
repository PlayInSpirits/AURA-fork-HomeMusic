package defpackage;

import android.R;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ua extends zh0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ z2 s;

    public /* synthetic */ ua(z2 r1, int r2) {
        this.r = r2;
        this.s = r1;
        super(2);
    }

    @Override // defpackage.zh0
    public final v3 C(int r6) {
        int r0 = this.r;
        z2 r2 = this.s;
        switch(r0) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        z41 r3 = (z41) r2;
        if (r6 != 2) goto L7;
        int r7 = r3.x;
    L8:
        if (r7 != Integer.MIN_VALUE) goto L11;
        return null;
    L11:
        return z(r7);
    L7:
        r7 = r3.y;
        goto L8
    L12:
        ya r4 = (ya) r2;
        if (r6 == 1) goto L17;
        if (r6 == 2) goto L23;
        kf2.n(f34.f(r6, "Unknown focus type: "));
        return null;
    L23:
        return z(r4.x);
    L17:
        int r8 = r4.y;
        if (r8 != Integer.MIN_VALUE) goto L21;
        return null;
    L21:
        return z(r8);
    }

    @Override // defpackage.zh0
    public final boolean F(int r27, int r28, Bundle r29) {
        int r4 = this.r;
        z2 r0 = this.s;
        switch(r4) {
            case 0: goto L29;
            default: goto L4;
        };
    L4:
        z41 r1 = (z41) r0;
        View r5 = r1.v;
        if (r27 == (-1)) goto L27;
        if (r28 == 1) goto L623;
        if (r28 == 2) goto L622;
        if (r28 == 64) goto L15;
        if (r28 == 128) goto L12;
        return r1.s(r27, r28, r29);
    L12:
        if (r1.x != r27) goto L14;
        r1.x = Integer.MIN_VALUE;
        r5.invalidate();
        r1.x(r27, 65536);
        return true;
    L14:
        return false;
    L15:
        AccessibilityManager r2 = r1.u;
        if (r2.isEnabled() == false) goto L14;
        if (r2.isTouchExplorationEnabled() == false) goto L14;
        int r3 = r1.x;
        if (r3 == r27) goto L14;
        if (r3 == Integer.MIN_VALUE) goto L24;
        r1.x = Integer.MIN_VALUE;
        r5.invalidate();
        r1.x(r3, 65536);
    L24:
        r1.x = r27;
        r5.invalidate();
        r1.x(r27, 32768);
        return true;
    L622:
        return r1.j(r27);
    L623:
        return r1.w(r27);
    L27:
        WeakHashMap r6 = j65.a;
        return r5.performAccessibilityAction(r28, r29);
    L29:
        ya r7 = (ya) r0;
        AccessibilityManager r8 = r7.t;
        Float r15 = Float.valueOf(0.0f);
        ra r14 = r7.q;
        k94 r9 = (k94) r7.s().b(r27);
        if (r9 == null) goto L33;
        i94 r10 = r9.a;
        if (r10 == null) goto L33;
        c72 r11 = r10.c;
        int r12 = r10.f;
        e94 r13 = r10.d;
        w03 r16 = r13.n;
        Object r17 = r16.g(n94.n);
        if (r17 != null) goto L37;
        r17 = null;
    L37:
        Boolean r18 = Boolean.TRUE;
        if (h12.c(r17, r18) == false) goto L46;
        if (Build.VERSION.SDK_INT < 34) goto L42;
        boolean r19 = a3.l(r8);
    L43:
        if (r19 == true) goto L46;
    L42:
        r19 = true;
    L46:
        if (r28 != 64) goto L48;
        boolean r20 = true;
        boolean r21 = false;
        if (r8.isEnabled() == true) goto L597;
    L651:
        return r21;
    L597:
        if (r8.isTouchExplorationEnabled() == false) goto L651;
        int r22 = r7.x;
        if (r22 == r27) goto L651;
        if (r22 == Integer.MIN_VALUE) goto L604;
        ya.E(r7, r22, 65536, null, 12);
    L604:
        r7.x = r27;
        r14.invalidate();
        ya.E(r7, r27, 32768, null, 12);
    L650:
        return r20;
    L48:
        if (r28 != 128) goto L50;
        r20 = true;
        r21 = false;
        if (r7.x != r27) goto L651;
        r7.x = Integer.MIN_VALUE;
        r7.z = null;
        r14.invalidate();
        ya.E(r7, r27, 65536, null, 12);
        goto L650
    L50:
        if (r28 == 256) goto L496;
        if (r28 == 512) goto L496;
        if (r28 != 16384) goto L55;
        Object r23 = r16.g(d94.p);
        if (r23 != null) goto L490;
        Object r110 = null;
    L491:
        w2 r111 = (w2) r110;
        if (r111 == null) goto L33;
        gf1 r24 = (gf1) r111.b;
        if (r24 == null) goto L33;
        return ((Boolean) r24.invoke()).booleanValue();
    L490:
        r110 = r23;
        goto L491
    L55:
        if (r28 != 131072) goto L57;
        if (r29 == null) goto L479;
        int r25 = -1;
        int r26 = r29.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
    L480:
        if (r29 == null) goto L483;
        int r30 = r29.getInt("ACTION_ARGUMENT_SELECTION_END_INT", r25);
    L484:
        boolean r112 = r7.K(r10, r26, r30, false);
        if (r112 == false) goto L647;
        ya.E(r7, r7.A(r12), 0, null, 12);
        return r112;
    L647:
        return r112;
    L483:
        r30 = -1;
        goto L484
    L479:
        r25 = -1;
        r26 = -1;
        goto L480
    L57:
        if (xl.b(r10) == false) goto L33;
        if (r28 == 1) goto L466;
        if (r28 == 2) goto L459;
        r62 r31 = r62.o;
        switch(r28) {
            case 16: goto L446;
            case 32: goto L437;
            case 4096: goto L284;
            case 8192: goto L284;
            case 32768: goto L274;
            case 65536: goto L265;
            case 262144: goto L256;
            case 524288: goto L247;
            case 1048576: goto L238;
            case 2097152: goto L223;
            case 16908342: goto L142;
            case 16908349: goto L129;
            case 16908372: goto L120;
            default: goto L65;
        };
    L65:
        switch(r28) {
            case 16908344: goto L284;
            case 16908345: goto L284;
            case 16908346: goto L284;
            case 16908347: goto L284;
            default: goto L66;
        };
    L66:
        switch(r28) {
            case 16908358: goto L110;
            case 16908359: goto L101;
            case 16908360: goto L92;
            case 16908361: goto L83;
            default: goto L67;
        };
    L67:
        mj4 r32 = (mj4) r7.E.b(r27);
        if (r32 == null) goto L33;
        if (((CharSequence) r32.b(r28)) == null) goto L33;
        Object r33 = r16.g(d94.w);
        if (r33 != null) goto L75;
        Object r113 = null;
    L76:
        List r114 = (List) r113;
        if (r114 == null) goto L33;
        if (r114.size() <= 0) goto L33;
        r114.get(0).getClass();
        kf2.k();
        return false;
    L75:
        r113 = r33;
        goto L76
    L83:
        Object r34 = r16.g(d94.A);
        if (r34 != null) goto L86;
        Object r115 = null;
    L87:
        w2 r116 = (w2) r115;
        if (r116 == null) goto L33;
        gf1 r35 = (gf1) r116.b;
        if (r35 == null) goto L33;
        return ((Boolean) r35.invoke()).booleanValue();
    L86:
        r115 = r34;
        goto L87
    L92:
        Object r36 = r16.g(d94.y);
        if (r36 != null) goto L95;
        Object r117 = null;
    L96:
        w2 r118 = (w2) r117;
        if (r118 == null) goto L33;
        gf1 r37 = (gf1) r118.b;
        if (r37 == null) goto L33;
        return ((Boolean) r37.invoke()).booleanValue();
    L95:
        r117 = r36;
        goto L96
    L101:
        Object r38 = r16.g(d94.z);
        if (r38 != null) goto L104;
        Object r119 = null;
    L105:
        w2 r120 = (w2) r119;
        if (r120 == null) goto L33;
        gf1 r39 = (gf1) r120.b;
        if (r39 == null) goto L33;
        return ((Boolean) r39.invoke()).booleanValue();
    L104:
        r119 = r38;
        goto L105
    L110:
        Object r40 = r16.g(d94.x);
        if (r40 != null) goto L113;
        Object r121 = null;
    L114:
        w2 r122 = (w2) r121;
        if (r122 == null) goto L33;
        gf1 r41 = (gf1) r122.b;
        if (r41 == null) goto L33;
        return ((Boolean) r41.invoke()).booleanValue();
    L113:
        r121 = r40;
        goto L114
    L120:
        Object r42 = r16.g(d94.o);
        if (r42 != null) goto L123;
        Object r123 = null;
    L124:
        w2 r124 = (w2) r123;
        if (r124 == null) goto L33;
        gf1 r43 = (gf1) r124.b;
        if (r43 == null) goto L33;
        return ((Boolean) r43.invoke()).booleanValue();
    L123:
        r123 = r42;
        goto L124
    L129:
        if (r29 == null) goto L33;
        if (r29.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") == false) goto L33;
        Object r44 = r16.g(d94.i);
        if (r44 != null) goto L136;
        Object r125 = null;
    L137:
        w2 r126 = (w2) r125;
        if (r126 == null) goto L33;
        if1 r45 = (if1) r126.b;
        if (r45 == null) goto L33;
        return ((Boolean) r45.invoke(Float.valueOf(r29.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
    L136:
        r125 = r44;
        goto L137
    L142:
        i94 r46 = r10.l();
        if (r46 == null) goto L148;
        e94 r47 = r46.d;
        Object r48 = r47.n.g(d94.d);
        if (r48 != null) goto L147;
        r48 = null;
    L147:
        w2 r49 = (w2) r48;
    L149:
        if (r49 != null) goto L157;
        if (r46 == null) goto L157;
        r46 = r46.l();
        if (r46 == null) goto L148;
        e94 r50 = r46.d;
        Object r51 = r50.n.g(d94.d);
        if (r51 != null) goto L156;
        r51 = null;
    L156:
        r49 = (w2) r51;
        goto L149
    L148:
        r49 = null;
    L157:
        if (r46 != null) goto L159;
        wv3 r52 = r10.g();
        return r14.requestRectangleOnScreen(new Rect((int) Math.floor(r52.a), (int) Math.floor(r52.b), ji2.L((float) Math.ceil(r52.c)), ji2.L((float) Math.ceil(r52.d))));
    L159:
        long r53 = 0;
        long r127 = 0;
        boolean r54 = false;
    L160:
        if (r46 == null) goto L631;
        c72 r55 = r46.c;
        w03 r128 = r46.d.n;
        Object r129 = r128.g(d94.d);
        if (r129 != null) goto L164;
        r129 = null;
    L164:
        w2 r130 = (w2) r129;
        if (r130 == null) goto L221;
        wv3 r131 = wr1.c((iz1) r55.Q.d);
        q62 r56 = ((iz1) r55.Q.d).u();
        if (r56 == null) goto L170;
        long r57 = ((f63) r56).K0(r53);
    L171:
        wv3 r58 = r131.f(r57);
        f63 r59 = r10.d();
        if (r59 != null) goto L174;
    L179:
        long r60 = r53;
    L180:
        long r61 = g83.e(r60, r127);
        f63 r62 = r10.d();
        if (r62 == null) goto L183;
        long r63 = r62.p;
    L184:
        wv3 r64 = bu.d(r61, l93.o0(r63));
        float r65 = r64.a - r58.a;
        float r66 = r64.c - r58.c;
        if (Math.signum(r65) == Math.signum(r66)) goto L187;
        r65 = 0.0f;
    L191:
        float r67 = r64.b - r58.b;
        float r68 = r64.d - r58.d;
        if (Math.signum(r67) == Math.signum(r68)) goto L194;
        r67 = 0.0f;
    L198:
        long r69 = (Float.floatToRawIntBits(r65) << 32) | (((long) Float.floatToRawIntBits(r67)) & 4294967295L);
        if (g83.b(r69, 0) == false) goto L201;
        long r70 = r69;
    L211:
        wf1 r71 = (wf1) r130.b;
        if (r71 != null) goto L214;
    L216:
        if (r54 == false) goto L218;
    L217:
        r54 = true;
    L219:
        r127 = g83.d(r127, r69);
        goto L221
    L218:
        r54 = false;
        goto L219
    L214:
        if (((Boolean) r71.invoke(Float.valueOf(Float.intBitsToFloat((int) (r70 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (r70 & 4294967295L))))).booleanValue() != true) goto L216;
    L201:
        float r72 = Float.intBitsToFloat((int) (r69 >> 32));
        float r73 = Float.intBitsToFloat((int) (r69 & 4294967295L));
        Object r74 = r128.g(n94.u);
        if (r74 != null) goto L204;
        r74 = null;
    L204:
        h64 r75 = (h64) r74;
        if (r11.K != r31) goto L207;
        r72 = -r72;
    L207:
        Object r76 = r128.g(n94.v);
        if (r76 != null) goto L210;
        r76 = null;
    L210:
        h64 r77 = (h64) r76;
        long r78 = Float.floatToRawIntBits(r72);
        r70 = (((long) Float.floatToRawIntBits(r73)) & 4294967295L) | (r78 << 32);
        goto L211
    L194:
        if (Math.abs(r67) < Math.abs(r68)) goto L198;
        r67 = r68;
        goto L198
    L187:
        if (Math.abs(r65) < Math.abs(r66)) goto L191;
        r65 = r66;
        goto L191
    L183:
        r63 = 0;
        goto L184
    L174:
        if (r59.A0().A == true) goto L177;
        r59 = null;
    L177:
        if (r59 == null) goto L179;
        r60 = r59.K0(r53);
        goto L180
    L170:
        r57 = r53;
    L221:
        r46 = r46.l();
        r53 = 0;
        goto L160
    L631:
        return r54;
    L606:
        r49 = null;
        goto L149
    L223:
        if (r29 == null) goto L225;
        String r79 = r29.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
    L226:
        Object r80 = r16.g(d94.k);
        if (r80 != null) goto L229;
        Object r132 = null;
    L230:
        w2 r133 = (w2) r132;
        if (r133 == null) goto L33;
        if1 r81 = (if1) r133.b;
        if (r81 == null) goto L33;
        if (r79 != null) goto L632;
        r79 = "";
    L632:
        return ((Boolean) r81.invoke(new he(r79))).booleanValue();
    L229:
        r132 = r80;
        goto L230
    L225:
        r79 = null;
        goto L226
    L238:
        Object r82 = r16.g(d94.u);
        if (r82 != null) goto L241;
        Object r134 = null;
    L242:
        w2 r135 = (w2) r134;
        if (r135 == null) goto L33;
        gf1 r83 = (gf1) r135.b;
        if (r83 == null) goto L33;
        return ((Boolean) r83.invoke()).booleanValue();
    L241:
        r134 = r82;
        goto L242
    L247:
        Object r84 = r16.g(d94.t);
        if (r84 != null) goto L250;
        Object r136 = null;
    L251:
        w2 r137 = (w2) r136;
        if (r137 == null) goto L33;
        gf1 r85 = (gf1) r137.b;
        if (r85 == null) goto L33;
        return ((Boolean) r85.invoke()).booleanValue();
    L250:
        r136 = r84;
        goto L251
    L256:
        Object r86 = r16.g(d94.s);
        if (r86 != null) goto L259;
        Object r138 = null;
    L260:
        w2 r139 = (w2) r138;
        if (r139 == null) goto L33;
        gf1 r87 = (gf1) r139.b;
        if (r87 == null) goto L33;
        return ((Boolean) r87.invoke()).booleanValue();
    L259:
        r138 = r86;
        goto L260
    L265:
        Object r88 = r16.g(d94.q);
        if (r88 != null) goto L268;
        Object r140 = null;
    L269:
        w2 r141 = (w2) r140;
        if (r141 == null) goto L33;
        gf1 r89 = (gf1) r141.b;
        if (r89 == null) goto L33;
        return ((Boolean) r89.invoke()).booleanValue();
    L268:
        r140 = r88;
        goto L269
    L274:
        Object r90 = r16.g(d94.r);
        if (r90 != null) goto L277;
        Object r142 = null;
    L278:
        w2 r143 = (w2) r142;
        if (r143 == null) goto L33;
        gf1 r91 = (gf1) r143.b;
        if (r91 == null) goto L33;
        return ((Boolean) r91.invoke()).booleanValue();
    L277:
        r142 = r90;
        goto L278
    L437:
        Object r92 = r16.g(d94.c);
        if (r92 != null) goto L440;
        Object r144 = null;
    L441:
        w2 r145 = (w2) r144;
        if (r145 == null) goto L33;
        gf1 r93 = (gf1) r145.b;
        if (r93 == null) goto L33;
        return ((Boolean) r93.invoke()).booleanValue();
    L440:
        r144 = r92;
        goto L441
    L446:
        Object r94 = r16.g(d94.b);
        if (r94 != null) goto L449;
        r94 = null;
    L449:
        w2 r95 = (w2) r94;
        if (r95 == null) goto L455;
        gf1 r96 = (gf1) r95.b;
        if (r96 == null) goto L455;
        Boolean r210 = (Boolean) r96.invoke();
    L456:
        ya.E(r7, r27, 1, null, 12);
        if (r210 == null) goto L33;
        return r210.booleanValue();
    L455:
        r210 = null;
    L284:
        if (r28 != 4096) goto L286;
        boolean r97 = true;
    L288:
        if (r28 != 8192) goto L290;
        boolean r98 = true;
    L292:
        if (r28 != 16908345) goto L294;
        boolean r99 = true;
    L296:
        if (r28 != 16908347) goto L298;
        boolean r100 = true;
    L300:
        if (r28 != 16908344) goto L302;
        boolean r101 = true;
    L304:
        if (r28 != 16908346) goto L306;
        boolean r102 = true;
    L307:
        if (r99 == true) goto L313;
        if (r100 == true) goto L313;
        if (r97 == true) goto L313;
        if (r98 == true) goto L313;
        boolean r103 = false;
    L314:
        if (r101 == true) goto L320;
        if (r102 == true) goto L320;
        if (r97 == true) goto L320;
        if (r98 == true) goto L320;
        boolean r146 = false;
    L321:
        if (r97 == true) goto L323;
        if (r98 == true) goto L323;
    L338:
        long r104 = wr1.c((iz1) r11.Q.d).b();
        ArrayList r105 = new ArrayList();
        Object r106 = r16.g(d94.B);
        if (r106 != null) goto L341;
        r106 = null;
    L341:
        w2 r107 = (w2) r106;
        if (r107 == null) goto L348;
        if1 r108 = (if1) r107.b;
        if (r108 == null) goto L348;
        if (((Boolean) r108.invoke(r105)).booleanValue() == false) goto L348;
        Float r109 = (Float) r105.get(0);
    L349:
        Object r147 = r16.g(d94.d);
        if (r147 != null) goto L352;
        r147 = null;
    L352:
        w2 r148 = (w2) r147;
        if (r148 == null) goto L33;
        sf1 r149 = r148.b;
        Object r150 = r16.g(n94.u);
        if (r150 != null) goto L358;
        r150 = null;
    L358:
        h64 r151 = (h64) r150;
        if (r151 == null) goto L398;
        if (r103 == false) goto L398;
        if (r109 == null) goto L363;
        float r152 = r109.floatValue();
    L364:
        if (r99 == true) goto L366;
        if (r98 == true) goto L366;
    L368:
        if (r11.K != r31) goto L373;
        if (r99 == true) goto L371;
        if (r100 == false) goto L373;
    L371:
        r152 = -r152;
    L373:
        if (ya.x(r151, r152) == false) goto L399;
        p94 r153 = d94.y;
        if (r16.c(r153) == true) goto L383;
        if (r16.c(d94.A) == true) goto L383;
        wf1 r154 = (wf1) r149;
        if (r154 == null) goto L33;
        return ((Boolean) r154.invoke(Float.valueOf(r152), r15)).booleanValue();
    L383:
        if (r152 <= 0.0f) goto L389;
        Object r155 = r16.g(d94.A);
        if (r155 != null) goto L387;
        Object r156 = null;
    L388:
        w2 r157 = (w2) r156;
    L394:
        if (r157 == null) goto L33;
        gf1 r158 = (gf1) r157.b;
        if (r158 == null) goto L33;
        return ((Boolean) r158.invoke()).booleanValue();
    L387:
        r156 = r155;
        goto L388
    L389:
        Object r159 = r16.g(r153);
        if (r159 != null) goto L392;
        Object r160 = null;
    L393:
        r157 = (w2) r160;
        goto L394
    L392:
        r160 = r159;
    L399:
        Object r161 = r16.g(n94.v);
        if (r161 != null) goto L402;
        r161 = null;
    L402:
        h64 r162 = (h64) r161;
        if (r162 == null) goto L33;
        if (r146 == false) goto L33;
        if (r109 == null) goto L407;
        float r163 = r109.floatValue();
    L408:
        if (r101 == true) goto L410;
        if (r98 == true) goto L410;
    L412:
        if (ya.x(r162, r163) == false) goto L33;
        p94 r164 = d94.x;
        if (r16.c(r164) == true) goto L422;
        if (r16.c(d94.z) == true) goto L422;
        wf1 r165 = (wf1) r149;
        if (r165 == null) goto L33;
        return ((Boolean) r165.invoke(r15, Float.valueOf(r163))).booleanValue();
    L422:
        if (r163 <= 0.0f) goto L428;
        Object r166 = r16.g(d94.z);
        if (r166 != null) goto L426;
        Object r167 = null;
    L427:
        w2 r168 = (w2) r167;
    L433:
        if (r168 == null) goto L33;
        gf1 r169 = (gf1) r168.b;
        if (r169 == null) goto L33;
        return ((Boolean) r169.invoke()).booleanValue();
    L426:
        r167 = r166;
        goto L427
    L428:
        Object r170 = r16.g(r164);
        if (r170 != null) goto L431;
        Object r171 = null;
    L432:
        r168 = (w2) r171;
        goto L433
    L431:
        r171 = r170;
    L410:
        r163 = -r163;
        goto L412
    L407:
        r163 = Float.intBitsToFloat((int) (r104 & 4294967295L));
    L366:
        r152 = -r152;
        goto L368
    L363:
        r152 = Float.intBitsToFloat((int) (r104 >> 32));
    L398:
        r109 = r109;
        r98 = r98;
    L348:
        r109 = null;
    L323:
        Object r172 = r16.g(n94.c);
        if (r172 != null) goto L326;
        r172 = null;
    L326:
        xq3 r173 = (xq3) r172;
        Object r174 = r16.g(d94.i);
        if (r174 != null) goto L329;
        r174 = null;
    L329:
        w2 r175 = (w2) r174;
        if (r173 == null) goto L338;
        if (r175 == null) goto L338;
        if (r98 == false) goto L334;
        float r176 = -0.0f;
    L335:
        if1 r177 = (if1) r175.b;
        if (r177 == null) goto L33;
        return ((Boolean) r177.invoke(Float.valueOf(0.0f + r176))).booleanValue();
    L334:
        r176 = 0.0f;
    L320:
        r146 = true;
    L313:
        r103 = true;
        goto L314
    L306:
        r102 = false;
        goto L307
    L302:
        r101 = false;
        goto L304
    L298:
        r100 = false;
        goto L300
    L294:
        r99 = false;
        goto L296
    L290:
        r98 = false;
        goto L292
    L286:
        r97 = false;
        goto L288
    L459:
        Object r178 = r16.g(n94.l);
        if (r178 != null) goto L463;
        r178 = null;
    L463:
        if (h12.c(r178, r18) == false) goto L33;
        ((ey) r14.getFocusOwner()).b(8, false, true);
        return true;
    L466:
        if (r14.isInTouchMode() == false) goto L468;
        r14.requestFocusFromTouch();
    L468:
        Object r179 = r16.g(d94.v);
        if (r179 != null) goto L471;
        Object r180 = null;
    L472:
        w2 r181 = (w2) r180;
        if (r181 == null) goto L33;
        gf1 r182 = (gf1) r181.b;
        if (r182 == null) goto L33;
        return ((Boolean) r182.invoke()).booleanValue();
    L471:
        r180 = r179;
    L496:
        if (r29 == null) goto L33;
        int r183 = r29.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean r184 = r29.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        if (r28 != 256) goto L500;
        boolean r185 = true;
    L501:
        Integer r186 = r7.H;
        if (r186 != null) goto L505;
    L507:
        r7.G = -1;
        r7.H = Integer.valueOf(r12);
    L508:
        String r187 = ya.t(r10);
        if (r187 == null) goto L33;
        if (r187.length() == 0) goto L33;
        String r188 = ya.t(r10);
        if (r188 != null) goto L516;
    L527:
        b3 r189 = null;
    L555:
        if (r189 == null) goto L33;
        int r190 = r7.q(r10);
        if (r190 != (-1)) goto L562;
        if (r185 == false) goto L561;
        r190 = 0;
        goto L562
    L561:
        r190 = r187.length();
    L562:
        if (r185 == false) goto L564;
        int[] r191 = r189.f(r190);
    L565:
        if (r191 == null) goto L33;
        int r211 = r191[0];
        int r212 = r191[1];
        if (r184 == true) goto L570;
    L581:
        if (r185 == false) goto L583;
        int r192 = r212;
    L584:
        int r193 = r192;
    L585:
        if (r185 == false) goto L587;
        int r194 = 256;
    L588:
        r7.L = new va(r10, r194, r183, r211, r212, SystemClock.uptimeMillis());
        r20 = true;
        r7.K(r10, r192, r193, true);
        goto L650
    L587:
        r194 = 512;
        goto L588
    L583:
        r192 = r211;
        goto L584
    L570:
        if (r16.c(n94.a) == true) goto L581;
        if (r16.c(n94.D) == false) goto L581;
        r192 = r7.r(r10);
        if (r192 != (-1)) goto L578;
        if (r185 == false) goto L577;
        r192 = r211;
        goto L578
    L577:
        r192 = r212;
    L578:
        if (r185 == false) goto L580;
        r193 = r212;
        goto L585
    L580:
        r193 = r211;
        goto L585
    L564:
        r191 = r189.m(r190);
        goto L565
    L516:
        if (r188.length() == 0) goto L527;
        if (r183 != 1) goto L521;
        Locale r195 = r14.getContext().getResources().getConfiguration().locale;
        if (c3.e != null) goto L554;
        c3 r196 = new c3(0);
        r196.d = BreakIterator.getCharacterInstance(r195);
        c3.e = r196;
    L554:
        c3 r197 = c3.e;
        r197.getClass();
        r197.p(r188);
        r189 = r197;
        goto L555
    L521:
        if (r183 != 2) goto L523;
        Locale r198 = r14.getContext().getResources().getConfiguration().locale;
        if (c3.f != null) goto L550;
        c3 r199 = new c3(1);
        r199.d = BreakIterator.getWordInstance(r198);
        c3.f = r199;
    L550:
        c3 r1100 = c3.f;
        r1100.getClass();
        r1100.p(r188);
        r189 = r1100;
        goto L555
    L523:
        if (r183 == 4) goto L533;
        if (r183 == 8) goto L529;
        if (r183 == 16) goto L533;
    L529:
        if (e3.c != null) goto L531;
        e3.c = new e3();
    L531:
        e3 r1101 = e3.c;
        r1101.getClass();
        r1101.a = r188;
        r189 = r1101;
    L533:
        if (r16.c(d94.a) == false) goto L527;
        ms4 r200 = gh0.p(r13);
        if (r200 == null) goto L527;
        if (r183 != 4) goto L544;
        if (c3.g != null) goto L542;
        c3.g = new c3(2);
    L542:
        c3 r1102 = c3.g;
        r1102.getClass();
        r1102.a = r188;
        r1102.d = r200;
        r189 = r1102;
        goto L555
    L544:
        if (d3.e != null) goto L546;
        d3 r201 = new d3();
        new Rect();
        d3.e = r201;
    L546:
        d3 r1103 = d3.e;
        r1103.getClass();
        r1103.a = r188;
        r1103.c = r200;
        r1103.d = r10;
        r189 = r1103;
        goto L555
    L505:
        if (r12 == r186.intValue()) goto L508;
    L500:
        r185 = false;
    L33:
        r21 = false;
        goto L651
    }

    @Override // defpackage.zh0
    public void y(int r2, v3 r3, String r4, Bundle r5) {
        switch(this.r) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((ya) this.s).j(r2, r3, r4, r5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r14v0, types: [v3] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v20, types: [u01] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r2v5, types: [v3] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v94 */
    /* JADX WARN: Type inference failed for: r5v127 */
    /* JADX WARN: Type inference failed for: r5v128 */
    /* JADX WARN: Type inference failed for: r5v129 */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r5v77, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v89, types: [c72] */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v91, types: [c72] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v66, types: [v3] */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v70, types: [v3] */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r9v13, types: [ya] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v62, types: [ya] */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v67 */
    @Override // defpackage.zh0
    public final v3 z(int r46) {
        int r2 = this.r;
        z2 r0 = this.s;
        switch(r2) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Float r3 = Float.valueOf(0.0f);
        ya r1 = (ya) r0;
        AccessibilityManager r4 = r1.t;
        ra r5 = r1.q;
        if (r5.getComposeViewContext().d().h().h == r92.n) goto L9;
        k94 r6 = (k94) r1.s().b(r46);
        if (r6 == null) goto L16;
        i94 r7 = r6.a;
        e94 r9 = r7.k();
        c72 r10 = r7.c;
        Object r11 = r9.n.g(n94.n);
        if (r11 != null) goto L21;
        r11 = null;
    L21:
        boolean r12 = h12.c(r11, Boolean.TRUE);
        if (r12 == true) goto L24;
    L29:
        ?? r13 = AccessibilityNodeInfo.obtain();
        ?? r14 = new v3(r13);
        int r15 = Build.VERSION.SDK_INT;
        if (r15 < 34) goto L32;
        a3.n(r13, r12);
        Throwable r45 = null;
    L34:
        if (r46 != (-1)) goto L40;
        Object r16 = r5.getParentForAccessibility();
        if ((r16 instanceof View) == false) goto L38;
        ?? r17 = (View) r16;
    L39:
        r14.b = -1;
        r13.setParent(r17);
    L49:
        r14.c = r46;
        r13.setSource(r5, r46);
        r13.setBoundsInScreen(r1.k(r6));
        g03 r8 = r1.W;
        mj4 r18 = r1.F;
        Resources r19 = r5.getContext().getResources();
        r14.i("android.view.View");
        e94 r110 = r7.d;
        w03 r20 = r110.n;
        if (r20.c(n94.D) == false) goto L53;
        r14.i("android.widget.EditText");
    L53:
        if (r20.c(n94.z) == false) goto L55;
        r14.i("android.widget.TextView");
    L55:
        Object r111 = r20.g(n94.w);
        if (r111 != null) goto L59;
        r111 = r45;
    L59:
        if (((m24) r111) != null) goto L61;
    L69:
        r13.setPackageName(r5.getContext().getPackageName());
        r13.setImportantForAccessibility(wr1.I(r7));
        if (r15 < 34) goto L72;
        boolean r21 = a3.l(r4);
    L73:
        List r112 = i94.j(4, r7);
        int r113 = r112.size();
        boolean r114 = r21;
        int r22 = 0;
        int r23 = 0;
    L74:
        AccessibilityNodeInfo r24 = r14.a;
        if (r22 >= r113) goto L100;
        int r25 = r22;
        i94 r26 = (i94) r112.get(r22);
        List r27 = r112;
        e02 r115 = r1.s();
        int r28 = r113;
        int r116 = r26.f;
        if (r115.a(r116) == false) goto L98;
        if (r5.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(r26.c) != null) goto L96;
        if (r116 == (-1)) goto L98;
        k94 r29 = (k94) r1.s().b(r116);
        if (r29 == null) goto L91;
        i94 r30 = r29.a;
        if (r30 == null) goto L91;
        e94 r31 = r30.k();
        Object r32 = r31.n.g(n94.n);
        if (r32 != null) goto L90;
        r32 = r45;
    L90:
        boolean r33 = h12.c(r32, Boolean.TRUE);
    L92:
        if (r114 == true) goto L94;
        if (r33 == false) goto L94;
    L95:
        r8.f(r116, r23);
        r23 = r23 + 1;
    L94:
        r24.addChild(r5, r116);
    L91:
        r33 = false;
        goto L92
    L96:
        kf2.k();
    L660:
        return r45;
    L98:
        r22 = r25 + 1;
        r112 = r27;
        r113 = r28;
        goto L74
    L100:
        if (r46 != r1.x) goto L102;
        r24.setAccessibilityFocused(true);
        r14.b(o3.i);
    L103:
        he r34 = xl.t(r7);
        if (r34 == null) goto L220;
        r5.getFontFamilyResolver();
        oo0 r210 = r5.getDensity();
        yc5 r117 = r1.S;
        String r118 = r34.o;
        List r35 = r34.n;
        SpannableString r36 = new SpannableString(r118);
        ArrayList r37 = r34.p;
        if (r37 == null) goto L157;
        int r119 = r37.size();
        int r120 = 0;
    L108:
        if (r120 >= r119) goto L157;
        ArrayList r38 = r37;
        ge r39 = (ge) r37.get(r120);
        int r310 = r120;
        ij4 r121 = (ij4) r39.a;
        int r311 = r119;
        int r122 = r39.b;
        int r40 = r39.c;
        ya r312 = r1;
        long r41 = r121.a.c();
        AccessibilityNodeInfo r313 = r24;
        i94 r314 = r7;
        long r42 = r121.b;
        gb1 r43 = r121.c;
        eb1 r44 = r121.d;
        bs4 r47 = r121.j;
        g03 r315 = r8;
        vd2 r48 = r121.k;
        w03 r49 = r20;
        Resources r316 = r19;
        long r50 = r121.l;
        sr4 r51 = r121.m;
        as4 r52 = r121.a;
        if (x40.c(r41, r52.c()) == false) goto L113;
        as4 r53 = r52;
    L116:
        uo.P(r36, r53.c(), r122, r40);
        SpannableString r211 = r36;
        uo.Q(r211, r42, r210, r122, r40);
        if (r43 != null) goto L121;
        if (r44 != null) goto L121;
        int r54 = 33;
    L144:
        if (r51 == null) goto L151;
        int r55 = r51.a;
        if ((r55 | 1) != r55) goto L149;
        r211.setSpan(new UnderlineSpan(), r122, r40, r54);
    L149:
        if ((r55 | 2) != r55) goto L151;
        r211.setSpan(new StrikethroughSpan(), r122, r40, r54);
    L151:
        if (r47 == null) goto L153;
        r211.setSpan(new ScaleXSpan(r47.a), r122, r40, r54);
    L153:
        uo.R(r211, r48, r122, r40);
        if (r50 == 16) goto L156;
        r211.setSpan(new BackgroundColorSpan(e35.U(r50)), r122, r40, r54);
    L156:
        r120 = r310 + 1;
        r36 = r211;
        r37 = r38;
        r119 = r311;
        r1 = r312;
        r7 = r314;
        r24 = r313;
        r8 = r315;
        r19 = r316;
        r20 = r49;
    L121:
        if (r43 != null) goto L123;
        gb1 r56 = gb1.p;
    L124:
        if (r44 == null) goto L126;
        int r57 = r44.a;
    L128:
        if (h12.j(r56.n, gb1.o.n) < 0) goto L131;
        boolean r58 = true;
    L132:
        if (r57 != 1) goto L134;
        boolean r59 = true;
    L135:
        if (r59 == false) goto L138;
        if (r58 == false) goto L138;
        int r60 = 3;
    L143:
        StyleSpan r61 = new StyleSpan(r60);
        r54 = 33;
        r211.setSpan(r61, r122, r40, 33);
    L138:
        if (r58 == false) goto L140;
        r60 = 1;
        goto L143
    L140:
        if (r59 == false) goto L142;
        r60 = 2;
        goto L143
    L142:
        r60 = 0;
        goto L143
    L134:
        r59 = false;
        goto L135
    L131:
        r58 = false;
        goto L132
    L126:
        r57 = 0;
        goto L128
    L123:
        r56 = r43;
        goto L124
    L113:
        if (r41 == 16) goto L115;
        r53 = new u50(r41);
        goto L116
    L115:
        r53 = rv2.F;
    L157:
        ya r317 = r1;
        g03 r318 = r8;
        SpannableString r62 = r36;
        AccessibilityNodeInfo r319 = r24;
        i94 r320 = r7;
        w03 r410 = r20;
        Resources r321 = r19;
        int r63 = r118.length();
        ?? r64 = u01.n;
        if (r35 == null) goto L169;
        ?? r65 = new ArrayList(r35.size());
        int r66 = r35.size();
        int r67 = 0;
    L162:
        if (r67 >= r66) goto L170;
        Object r68 = r35.get(r67);
        ge r69 = (ge) r68;
        if ((r69.a instanceof p45) == false) goto L168;
        if (ie.a(0, r63, r69.b, r69.c) == false) goto L168;
        r65.add(r68);
    L168:
        r67 = r67 + 1;
    L170:
        int r70 = r65.size();
        int r71 = 0;
    L171:
        if (r71 >= r70) goto L176;
        ge r72 = (ge) r65.get(r71);
        p45 r73 = (p45) r72.a;
        int r74 = r72.b;
        int r75 = r72.c;
        if ((r73 instanceof p45) == false) goto L175;
        r62.setSpan(new TtsSpan.VerbatimBuilder(r73.a).build(), r74, r75, 33);
        r71 = r71 + 1;
        goto L171
    L175:
        er1.n();
        goto L660
    L176:
        int r76 = r118.length();
        if (r35 == null) goto L186;
        ?? r77 = new ArrayList(r35.size());
        int r78 = r35.size();
        int r79 = 0;
    L179:
        if (r79 >= r78) goto L187;
        Object r80 = r35.get(r79);
        ge r81 = (ge) r80;
        if ((r81.a instanceof v25) == false) goto L185;
        if (ie.a(0, r76, r81.b, r81.c) == false) goto L185;
        r77.add(r80);
    L185:
        r79 = r79 + 1;
    L187:
        int r82 = r77.size();
        int r83 = 0;
    L188:
        if (r83 >= r82) goto L193;
        ge r84 = (ge) r77.get(r83);
        v25 r85 = (v25) r84.a;
        int r86 = r84.b;
        int r87 = r84.c;
        WeakHashMap r88 = (WeakHashMap) r117.n;
        Object r123 = r88.get(r85);
        if (r123 != null) goto L192;
        r123 = new URLSpan(r85.a);
        r88.put(r85, r123);
    L192:
        r62.setSpan((URLSpan) r123, r86, r87, 33);
        r83 = r83 + 1;
        goto L188
    L193:
        int r89 = r118.length();
        if (r35 == null) goto L203;
        r64 = new ArrayList(r35.size());
        int r90 = r35.size();
        int r91 = 0;
    L196:
        if (r91 >= r90) goto L203;
        Object r92 = r35.get(r91);
        ge r93 = (ge) r92;
        if ((r93.a instanceof ib2) == false) goto L202;
        if (ie.a(0, r89, r93.b, r93.c) == false) goto L202;
        r64.add(r92);
    L202:
        r91 = r91 + 1;
    L203:
        int r94 = r64.size();
        int r95 = 0;
    L204:
        if (r95 >= r94) goto L219;
        ge r96 = (ge) r64.get(r95);
        int r97 = r96.b;
        Object r98 = r96.a;
        int r99 = r96.c;
        if (r97 == r99) goto L218;
        ib2 r100 = (ib2) r98;
        if ((r100 instanceof hb2) == false) goto L213;
        r98.getClass();
        hb2 r101 = (hb2) r98;
        ge r102 = new ge(r97, r99, r101);
        WeakHashMap r103 = (WeakHashMap) r117.o;
        Object r104 = r103.get(r102);
        if (r104 != null) goto L212;
        r104 = new URLSpan(r101.a);
        r103.put(r102, r104);
    L212:
        r62.setSpan((URLSpan) r104, r97, r99, 33);
        goto L218
    L213:
        WeakHashMap r105 = (WeakHashMap) r117.p;
        Object r106 = r105.get(r96);
        if (r106 != null) goto L216;
        r106 = new s70(r100);
        r105.put(r96, r106);
    L216:
        r62.setSpan((ClickableSpan) r106, r97, r99, 33);
    L218:
        r95 = r95 + 1;
        goto L204
    L219:
        ?? r107 = (SpannableString) ya.P(r62);
    L221:
        r14.n(r107);
        p94 r108 = n94.K;
        w03 r109 = r410;
        if (r109.c(r108) == false) goto L228;
        r13.setContentInvalid(true);
        Object r124 = r109.g(r108);
        if (r124 != null) goto L226;
        r124 = r45;
    L226:
        AccessibilityNodeInfo r125 = r319;
        r125.setError((CharSequence) r124);
        ?? r126 = r125;
    L227:
        i94 r127 = r320;
        Resources r128 = r321;
        String r129 = xl.s(r127, r128);
        if (Build.VERSION.SDK_INT < 30) goto L232;
        p3.i(r126, r129);
    L233:
        r126.setCheckable(xl.r(r127));
        Object r130 = r109.g(n94.H);
        if (r130 != null) goto L236;
        r130 = r45;
    L236:
        qu4 r131 = (qu4) r130;
        if (r131 != null) goto L239;
    L244:
        Object r132 = r109.g(n94.G);
        if (r132 != null) goto L247;
        r132 = r45;
    L247:
        Boolean r133 = (Boolean) r132;
        if (r133 == null) goto L251;
        r126.setChecked(r133.booleanValue());
    L251:
        if (r110.p == true) goto L253;
    L254:
        Object r134 = r109.g(n94.a);
        if (r134 != null) goto L257;
        r134 = r45;
    L257:
        List r135 = (List) r134;
        if (r135 == null) goto L260;
        ?? r136 = (String) q40.x0(r135);
    L261:
        r126.setContentDescription(r136);
    L262:
        Object r137 = r109.g(n94.x);
        if (r137 != null) goto L265;
        r137 = r45;
    L265:
        String r138 = (String) r137;
        if (r138 == null) goto L276;
        i94 r139 = r127;
    L268:
        if (r139 == null) goto L273;
        e94 r140 = r139.d;
        p94 r141 = zz1.k;
        if (r140.n.c(r141) == true) goto L271;
        r139 = r139.l();
        goto L268
    L271:
        boolean r142 = ((Boolean) r140.d(r141)).booleanValue();
    L274:
        if (r142 == false) goto L276;
        r13.setViewIdResourceName(r138);
        goto L276
    L273:
        r142 = false;
    L276:
        Object r143 = r109.g(n94.h);
        if (r143 != null) goto L280;
        r143 = r45;
    L280:
        if (((j15) r143) == null) goto L286;
        if (Build.VERSION.SDK_INT < 28) goto L284;
        i3.C(r126, true);
        goto L286
    L284:
        r14.h(2, true);
    L286:
        if (((j15) bu.o(r110, n94.i)) != null) goto L288;
    L291:
        int r144 = r46;
        if (r144 == (-1)) goto L297;
        int r145 = r318.d(r127.f);
        if (r145 == (-1)) goto L296;
        r13.setDrawingOrder(r145);
        goto L297
    L296:
        Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
    L297:
        r13.setPassword(r109.c(n94.J));
        Object r146 = bu.o(r110, n94.M);
        Boolean r147 = Boolean.TRUE;
        r13.setEditable(h12.c(r146, r147));
        Integer r148 = (Integer) bu.o(r110, n94.N);
        if (r148 == null) goto L300;
        int r149 = r148.intValue();
    L301:
        r126.setMaxTextLength(r149);
        r126.setEnabled(xl.b(r127));
        p94 r150 = n94.l;
        r126.setFocusable(r109.c(r150));
        if (r13.isFocusable() == false) goto L308;
        r126.setFocused(((Boolean) r110.d(r150)).booleanValue());
        if (r13.isFocused() == false) goto L307;
        r14.a(2);
        ya r151 = r317;
        r151.y = r144;
        ya r152 = r151;
    L306:
        boolean r153 = true;
        ?? r154 = r152;
    L309:
        r126.setVisibleToUser(wr1.H(r127) ^ r153);
        if (r127.o() == false) goto L312;
        i94 r155 = r127.l();
        r155.getClass();
    L314:
        if (r155.m().d() == false) goto L316;
        boolean r156 = false;
        r126.setVisibleToUser(false);
    L317:
        xa3.r(bu.o(r110, n94.k));
        r126.setClickable(r156);
        w2 r157 = (w2) bu.o(r110, d94.b);
        if (r157 == null) goto L324;
        h12.c(bu.o(r110, n94.G), r147);
        r126.setClickable(true);
        if (xl.b(r127) == false) goto L324;
        if (r13.isClickable() == false) goto L324;
        r14.b(new o3(16, r157.a));
    L324:
        r126.setLongClickable(false);
        w2 r158 = (w2) bu.o(r110, d94.c);
        if (r158 == null) goto L329;
        r126.setLongClickable(true);
        if (xl.b(r127) == false) goto L329;
        r14.b(new o3(32, r158.a));
    L329:
        w2 r159 = (w2) bu.o(r110, d94.p);
        if (r159 == null) goto L333;
        r14.b(new o3(16384, r159.a));
    L333:
        if (xl.b(r127) == false) goto L356;
        w2 r160 = (w2) bu.o(r110, d94.k);
        if (r160 == null) goto L337;
        r14.b(new o3(2097152, r160.a));
    L337:
        w2 r161 = (w2) bu.o(r110, d94.o);
        if (r161 == null) goto L340;
        r14.b(new o3(R.id.accessibilityActionImeEnter, r161.a));
    L340:
        w2 r162 = (w2) bu.o(r110, d94.q);
        if (r162 == null) goto L343;
        r14.b(new o3(65536, r162.a));
    L343:
        w2 r163 = (w2) bu.o(r110, d94.r);
        if (r163 == null) goto L356;
        if (r13.isFocused() == false) goto L356;
        hd5 r164 = (hd5) r5.getClipboardManager();
        ClipboardManager r165 = (ClipboardManager) r164.p;
        if (r165 != null) goto L350;
        Object r166 = ((Context) r164.o).getSystemService("clipboard");
        r166.getClass();
        r165 = (ClipboardManager) r166;
        r164.p = r165;
    L350:
        ClipDescription r167 = r165.getPrimaryClipDescription();
        if (r167 == null) goto L353;
        boolean r168 = r167.hasMimeType("text/*");
    L354:
        if (r168 == false) goto L356;
        r14.b(new o3(32768, r163.a));
        goto L356
    L353:
        r168 = false;
    L356:
        String r169 = ya.t(r127);
        if (r169 == null) goto L399;
        if (r169.length() == 0) goto L399;
        r13.setTextSelection(r154.r(r127), r154.q(r127));
        w2 r170 = (w2) bu.o(r110, d94.j);
        if (r170 == null) goto L364;
        ?? r171 = r170.a;
    L365:
        r14.b(new o3(131072, r171));
        r14.a(256);
        r14.a(512);
        r126.setMovementGranularities(11);
        List r172 = (List) bu.o(r110, n94.a);
        if (r172 == null) goto L370;
        if (r172.isEmpty() == false) goto L399;
    L370:
        if (r109.c(d94.a) == false) goto L399;
        if (r109.c(n94.D) == true) goto L374;
    L376:
        ?? r173 = r10.t();
    L377:
        if (r173 == 0) goto L386;
        e94 r174 = r173.v();
        if (r174 == null) goto L385;
        if (r174.p != true) goto L385;
        if (r174.n.c(n94.D) == false) goto L385;
    L387:
        if (r173 == 0) goto L397;
        e94 r175 = r173.v();
        if (r175 == null) goto L394;
        Object r176 = r175.n.g(n94.l);
        if (r176 != null) goto L393;
        r176 = r45;
    L393:
        boolean r177 = h12.c(r176, Boolean.TRUE);
    L395:
        if (r177 == true) goto L397;
    L394:
        r177 = false;
    L397:
        r126.setMovementGranularities(r13.getMovementGranularities() | 20);
    L385:
        r173 = r173.t();
        goto L377
    L386:
        r173 = r45;
        goto L387
    L374:
        if (h12.c(bu.o(r110, r150), r147) == true) goto L376;
    L364:
        r171 = r45;
    L399:
        if (Build.VERSION.SDK_INT < 26) goto L417;
        ArrayList r178 = new ArrayList();
        r178.add("androidx.compose.ui.semantics.id");
        CharSequence r179 = r14.g();
        if (r179 == null) goto L409;
        if (r179.length() == 0) goto L409;
        if (r109.c(d94.a) == false) goto L409;
        r178.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
    L409:
        if (r109.c(n94.x) == false) goto L412;
        r178.add("androidx.compose.ui.semantics.testTag");
    L412:
        if (r109.c(n94.O) == false) goto L415;
        r178.add("androidx.compose.ui.semantics.shapeType");
        r178.add("androidx.compose.ui.semantics.shapeRect");
        r178.add("androidx.compose.ui.semantics.shapeCorners");
        r178.add("androidx.compose.ui.semantics.shapeRegion");
    L415:
        if (Build.VERSION.SDK_INT < 26) goto L417;
        j3.y(r13, r178);
    L417:
        xq3 r180 = (xq3) bu.o(r110, n94.c);
        if (r180 == null) goto L434;
        p94 r181 = d94.i;
        if (r109.c(r181) == false) goto L422;
        r14.i("android.widget.SeekBar");
    L424:
        if (r180 == xq3.b) goto L426;
        float r182 = 0.0f;
        r126.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
    L428:
        if (r109.c(r181) == false) goto L434;
        if (xl.b(r127) == false) goto L434;
        if (r182 <= gb.j(r3.floatValue(), r3.floatValue())) goto L434;
        r14.b(o3.k);
        goto L434
    L426:
        r182 = 0.0f;
        goto L428
    L422:
        r14.i("android.widget.ProgressBar");
    L434:
        gb.c(r14, r127);
        te5.L(r14, r127);
        e94 r183 = r127.k();
        Object r184 = r183.n.g(n94.g);
        if (r184 != null) goto L437;
        r184 = r45;
    L437:
        if (r184 != null) goto L479;
        i94 r185 = r127.l();
        if (r185 == null) goto L480;
        e94 r186 = r185.k();
        Object r187 = r186.n.g(n94.e);
        if (r187 != null) goto L444;
        r187 = r45;
    L444:
        if (r187 == null) goto L480;
        e94 r188 = r185.k();
        Object r189 = r188.n.g(n94.f);
        if (r189 != null) goto L448;
        r189 = r45;
    L448:
        o40 r190 = (o40) r189;
        if (r190 != null) goto L451;
    L455:
        e94 r191 = r127.k();
        if (r191.n.c(n94.G) == false) goto L480;
        ArrayList r192 = new ArrayList();
        List r193 = i94.j(4, r185);
        int r194 = r193.size();
        int r195 = 0;
        int r196 = 0;
    L459:
        if (r195 >= r194) goto L467;
        i94 r197 = (i94) r193.get(r195);
        e94 r198 = r197.k();
        if (r198.n.c(n94.G) == false) goto L465;
        r192.add(r197);
        if (r197.c.u() >= r127.c.u()) goto L465;
        r196 = r196 + 1;
    L465:
        r195 = r195 + 1;
        goto L459
    L467:
        if (r192.isEmpty() == true) goto L480;
        boolean r199 = te5.e(r192);
        if (r199 == false) goto L471;
        int r322 = 0;
    L472:
        if (r199 == false) goto L474;
        int r323 = r196;
    L475:
        e94 r200 = r127.k();
        Object r201 = r200.n.g(n94.G);
        if (r201 != null) goto L478;
        r201 = Boolean.FALSE;
    L478:
        r14.k(u3.a(r322, 1, r323, 1, false, ((Boolean) r201).booleanValue()));
        goto L480
    L474:
        r323 = 0;
        goto L475
    L471:
        r322 = r196;
        goto L472
    L451:
        if (r190.a < 0) goto L480;
        if (r190.b >= 0) goto L455;
    L480:
        h64 r202 = (h64) bu.o(r127.n(), n94.u);
        w2 r203 = (w2) bu.o(r127.n(), d94.d);
        if (r202 == null) goto L513;
        if (r203 == null) goto L513;
        e94 r204 = r127.k();
        Object r205 = r204.n.g(n94.f);
        if (r205 != null) goto L486;
        r205 = r45;
    L486:
        if (r205 != null) goto L494;
        e94 r206 = r127.k();
        Object r207 = r206.n.g(n94.e);
        if (r207 != null) goto L490;
        r207 = r45;
    L490:
        if (r207 != null) goto L494;
        r14.i("android.widget.HorizontalScrollView");
    L494:
        if (((Number) r202.b.invoke()).floatValue() <= 0.0f) goto L497;
        r14.m(true);
    L497:
        if (xl.b(r127) == false) goto L513;
        boolean r208 = ya.z(r202);
        r62 r209 = r62.o;
        if (r208 == false) goto L505;
        r14.b(o3.j);
        c72 r212 = r10;
        if (r212.K != r209) goto L503;
        o3 r1100 = o3.q;
    L504:
        r14.b(r1100);
    L507:
        if (ya.y(r202) == false) goto L513;
        r14.b(o3.k);
        if (r212.K != r209) goto L511;
        o3 r213 = o3.s;
    L512:
        r14.b(r213);
        goto L513
    L511:
        r213 = o3.q;
        goto L512
    L503:
        r1100 = o3.s;
        goto L504
    L505:
        r212 = r10;
    L513:
        h64 r214 = (h64) bu.o(r127.n(), n94.v);
        if (r214 == null) goto L537;
        if (r203 == null) goto L537;
        e94 r215 = r127.k();
        Object r216 = r215.n.g(n94.f);
        if (r216 != null) goto L519;
        r216 = r45;
    L519:
        if (r216 != null) goto L527;
        e94 r217 = r127.k();
        Object r218 = r217.n.g(n94.e);
        if (r218 != null) goto L523;
        r218 = r45;
    L523:
        if (r218 != null) goto L527;
        r14.i("android.widget.ScrollView");
    L527:
        if (((Number) r214.b.invoke()).floatValue() <= 0.0f) goto L530;
        r14.m(true);
    L530:
        if (xl.b(r127) == false) goto L537;
        if (ya.z(r214) == false) goto L535;
        r14.b(o3.j);
        r14.b(o3.r);
    L535:
        if (ya.y(r214) == false) goto L537;
        r14.b(o3.k);
        r14.b(o3.p);
    L537:
        int r219 = Build.VERSION.SDK_INT;
        if (r219 < 29) goto L540;
        e35.k(r14, r127);
    L540:
        CharSequence r220 = (CharSequence) bu.o(r127.n(), n94.d);
        if (r219 < 28) goto L543;
        i3.t(r126, r220);
    L545:
        if (xl.b(r127) == false) goto L592;
        w2 r221 = (w2) bu.o(r127.n(), d94.s);
        if (r221 == null) goto L549;
        r14.b(new o3(262144, r221.a));
    L549:
        w2 r222 = (w2) bu.o(r127.n(), d94.t);
        if (r222 == null) goto L552;
        r14.b(new o3(524288, r222.a));
    L552:
        w2 r223 = (w2) bu.o(r127.n(), d94.u);
        if (r223 == null) goto L555;
        r14.b(new o3(1048576, r223.a));
    L555:
        e94 r224 = r127.n();
        p94 r225 = d94.w;
        if (r224.n.c(r225) == false) goto L592;
        List r226 = (List) r127.n().d(r225);
        int r227 = r226.size();
        h03 r228 = ya.a0;
        int r229 = r228.b;
        if (r227 >= r229) goto L591;
        mj4 r230 = new mj4(0);
        p03 r231 = r73.a();
        if (r18.n == false) goto L563;
        su3.f(r18);
    L563:
        if (su3.h(r18.q, r144, r18.o) < 0) goto L565;
        boolean r1101 = true;
    L566:
        if (r1101 == false) goto L587;
        p03 r1102 = (p03) r18.b(r144);
        int[] r1103 = r228.a;
        int r232 = r228.b;
        int[] r1104 = new int[16];
        int r1105 = 0;
        int r1106 = 0;
    L568:
        if (r1105 >= r232) goto L574;
        int r1107 = r1103[r1105];
        int r1108 = r232;
        int r233 = r1106 + 1;
        p03 r1109 = r1102;
        if (r1104.length >= r233) goto L573;
        r1104 = Arrays.copyOf(r1104, Math.max(r233, (r1104.length * 3) / 2));
    L573:
        r1104[r1106] = r1107;
        r1105 = r1105 + 1;
        r1106 = r233;
        r232 = r1108;
        r1102 = r1109;
        goto L568
    L574:
        p03 r1110 = r1102;
        ArrayList r234 = new ArrayList();
        if (r226.size() <= 0) goto L577;
        xa3.r(r226.get(0));
        r1110.getClass();
        throw r45;
    L577:
        if (r234.size() <= 0) goto L588;
        xa3.r(r234.get(0));
        if (r1106 > 0) goto L582;
        kf2.h("Index must be between 0 and size");
        goto L660
    L582:
        int r235 = r1104[0];
        throw r45;
    L588:
        r154.E.d(r144, r230);
        r18.d(r144, r231);
        goto L592
    L587:
        if (r226.size() <= 0) goto L588;
        xa3.r(r226.get(0));
        r228.b(0);
        throw r45;
    L565:
        r1101 = false;
        goto L566
    L591:
        kf2.o(b11.j(r229, "Can't have more than ", " custom actions for one widget"));
    L592:
        boolean r236 = xl.z(r127, r128);
        if (Build.VERSION.SDK_INT < 28) goto L595;
        i3.u(r126, r236);
    L596:
        int r237 = r154.O.d(r144);
        if (r237 == (-1)) goto L599;
        gh0.B(r5.getAndroidViewsHandler$ui(), r237);
        ra r238 = r5;
        r126.setTraversalBefore(r238, r237);
        r154.j(r144, r14, r154.Q, r45);
    L600:
        int r239 = r154.P.d(r144);
        if (r239 == (-1)) goto L603;
        gh0.B(r238.getAndroidViewsHandler$ui(), r239);
    L603:
        String r240 = (String) bu.o(r127.n(), zz1.l);
        if (r240 == null) goto L606;
        r14.i(r240);
    L606:
        ?? r241 = r14;
        ?? r242 = r154;
    L608:
        if (r242.B == true) goto L610;
        return r241;
    L610:
        if (r144 != r242.x) goto L613;
        r242.z = r241;
    L613:
        if (r144 != r242.y) goto L662;
        r242.A = r241;
        return r241;
    L662:
        return r241;
    L599:
        r238 = r5;
        goto L600
    L595:
        r14.h(1, r236);
        goto L596
    L543:
        r126.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", r220);
        goto L545
    L479:
        kf2.k();
        goto L480
    L316:
        r156 = false;
        goto L317
    L312:
        r155 = r127;
        goto L314
    L307:
        r154 = r317;
        r153 = true;
        r14.a(1);
        goto L309
    L308:
        r152 = r317;
        goto L306
    L300:
        r149 = -1;
        goto L301
    L288:
        if (Build.VERSION.SDK_INT < 29) goto L290;
        k3.c(r13);
        goto L291
    L290:
        r14.h(8, true);
        goto L291
    L260:
        r136 = r45;
        goto L261
    L253:
        if (i94.j(4, r127).isEmpty() == false) goto L262;
    L239:
        if (r131 != qu4.n) goto L242;
        r126.setChecked(true);
        goto L244
    L242:
        if (r131 != qu4.o) goto L244;
        r126.setChecked(false);
        goto L244
    L232:
        r126.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", r129);
        goto L233
    L228:
        r126 = r319;
        goto L227
    L186:
        r77 = r64;
        goto L187
    L169:
        r65 = r64;
        goto L170
    L220:
        r317 = r1;
        r318 = r8;
        r319 = r24;
        r320 = r7;
        r410 = r20;
        r321 = r19;
        r10 = r10;
        r107 = r45;
        goto L221
    L102:
        r24.setAccessibilityFocused(false);
        r14.b(o3.h);
        goto L103
    L72:
        r21 = true;
        goto L73
    L61:
        if (r7.o() == true) goto L65;
        if (i94.j(4, r7).isEmpty() == false) goto L69;
    L65:
        if (xl.B(r7) == false) goto L67;
    L68:
        r14.i("android.widget.ImageView");
        goto L69
    L67:
        if (r110.p == false) goto L69;
    L38:
        r17 = r45;
        goto L39
    L40:
        i94 r243 = r7.l();
        if (r243 == null) goto L43;
        ?? r244 = Integer.valueOf(r243.f);
    L44:
        if (r244 == 0) goto L615;
        int r245 = r244.intValue();
        if (r245 != r5.getSemanticsOwner().a().f) goto L48;
        r245 = -1;
    L48:
        r14.b = r245;
        r13.setParent(r5, r245);
        goto L49
    L615:
        ?? r246 = r45;
        cz1.c("semanticsNode " + r46 + " has null parent");
        er1.a();
        return r246;
    L43:
        r244 = r45;
        goto L44
    L32:
        r45 = null;
        r14.h(64, r12);
        goto L34
    L24:
        if (Build.VERSION.SDK_INT < 34) goto L26;
        boolean r1111 = a3.l(r4);
    L27:
        if (r1111 == true) goto L29;
        r242 = r1;
        r144 = r46;
        r241 = 0;
        goto L608
    L26:
        r1111 = true;
        goto L27
    L16:
        if (r4.isEnabled() == false) goto L17;
    L11:
        v3 r247 = null;
    L12:
        r242 = r1;
        r144 = r46;
        r241 = r247;
        goto L608
    L17:
        r247 = new v3(AccessibilityNodeInfo.obtain());
        goto L12
    L9:
        if (r4.isEnabled() == true) goto L11;
        r247 = new v3(AccessibilityNodeInfo.obtain());
        goto L12
    L5:
        return new v3(AccessibilityNodeInfo.obtain(((z41) r0).r(r46).a));
    }
}
