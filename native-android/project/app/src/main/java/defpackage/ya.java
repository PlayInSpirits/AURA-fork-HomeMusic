package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ya extends z2 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final h03 a0 = null;
    public v3 A;
    public boolean B;
    public final i03 C;
    public final i03 D;
    public final mj4 E;
    public final mj4 F;
    public int G;
    public Integer H;
    public final qi I;
    public final aw J;
    public boolean K;
    public va L;
    public i03 M;
    public final j03 N;
    public final g03 O;
    public final g03 P;
    public final String Q;
    public final String R;
    public final yc5 S;
    public final i03 T;
    public j94 U;
    public boolean V;
    public final g03 W;
    public final a0 X;
    public final ArrayList Y;
    public final sa Z;
    public final ra q;
    public int r;
    public final sa s;
    public final AccessibilityManager t;
    public long u;
    public List v;
    public final ua w;
    public int x;
    public int y;
    public v3 z;

    static {
        int[] r1 = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        h03 r2 = c02.a;
        h03 r3 = new h03(32);
        int r4 = r3.b;
        if (r4 < 0) goto L12;
        int r5 = r4 + 32;
        int[] r6 = r3.a;
        if (r6.length >= r5) goto L7;
        r3.a = Arrays.copyOf(r6, Math.max(r5, (r6.length * 3) / 2));
    L7:
        int[] r7 = r3.a;
        int r8 = r3.b;
        if (r4 == r8) goto L10;
        ti.Y(r5, r4, r8, r7, r7);
    L10:
        ti.b0(r4, 0, 12, r1, r7);
        r3.b += 32;
        a0 = r3;
        return;
    L12:
        kf2.h("");
    }

    public ya(ra r6) {
        this.q = r6;
        this.r = Integer.MIN_VALUE;
        int r2 = 0;
        this.s = new sa(this, r2);
        Object r1 = r6.getContext().getSystemService("accessibility");
        r1.getClass();
        this.t = (AccessibilityManager) r1;
        this.u = 100;
        new Handler(Looper.getMainLooper());
        this.w = new ua(this, r2);
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.C = new i03();
        this.D = new i03();
        this.E = new mj4(0);
        this.F = new mj4(0);
        this.G = -1;
        this.I = new qi(0);
        this.J = su3.a(1, 6, null);
        this.K = true;
        i03 r0 = f02.a;
        r0.getClass();
        this.M = r0;
        this.N = new j03();
        this.O = new g03();
        this.P = new g03();
        this.Q = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.R = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.S = new yc5(10);
        this.T = new i03();
        this.U = new j94(r6.getSemanticsOwner().a(), r0);
        int r3 = a02.a;
        this.W = new g03();
        r6.addOnAttachStateChangeListener(this);
        this.X = new a0(4, this);
        this.Y = new ArrayList();
        this.Z = new sa(this, 1);
    }

    public static /* synthetic */ void E(ya r1, int r2, int r3, Integer r4, int r5) {
        if ((r5 & 4) == 0) goto L5;
        r4 = null;
    L5:
        r1.D(r2, r3, r4, null);
    }

    public static Rect L(ya4 r4, float r5, float r6) {
        if ((r4 instanceof nb3) == false) goto L5;
    L9:
        wv3 r7 = r4.s();
        return new Rect((int) (r7.a + r5), (int) (r7.b + r6), (int) (r7.c + r5), (int) (r7.d + r6));
    L5:
        if ((r4 instanceof ob3) == true) goto L9;
        return null;
    }

    public static float[] N(ya4 r13) {
        if ((r13 instanceof ob3) == false) goto L6;
        g34 r14 = ((ob3) r13).f;
        long r0 = r14.h;
        long r2 = r14.g;
        long r4 = r14.f;
        long r6 = r14.e;
        return new float[]{Float.intBitsToFloat((int) (r6 >> 32)), Float.intBitsToFloat((int) (r6 & 4294967295L)), Float.intBitsToFloat((int) (r4 >> 32)), Float.intBitsToFloat((int) (r4 & 4294967295L)), Float.intBitsToFloat((int) (r2 >> 32)), Float.intBitsToFloat((int) (r2 & 4294967295L)), Float.intBitsToFloat((int) (r0 >> 32)), Float.intBitsToFloat((int) (r0 & 4294967295L))};
    L6:
        return null;
    }

    public static Region O(ya4 r8, float r9, float r10) {
        if ((r8 instanceof mb3) == false) goto L9;
        mb3 r11 = (mb3) r8;
        wv3 r2 = r11.s().e(r9, r10);
        Region r0 = new Region(new Rect((int) (r2.a + 0.0f), (int) (r2.b + 0.0f), (int) (r2.c + 0.0f), (int) (r2.d + 0.0f)));
        Region r3 = new Region();
        nc r12 = r11.f;
        if ((r12 instanceof nc) == false) goto L8;
        Path r13 = r12.a;
        r13.offset(r9, r10);
        r3.setPath(r13, r0);
        return r3;
    L8:
        er1.l("Unable to obtain android.graphics.Path");
    L9:
        return null;
    }

    public static CharSequence P(CharSequence r3) {
        if (r3.length() == 0) goto L7;
        int r1 = 100000;
        if (r3.length() <= 100000) goto L7;
        if (Character.isHighSurrogate(r3.charAt(99999)) == true) goto L11;
    L13:
        CharSequence r4 = r3.subSequence(0, r1);
        r4.getClass();
        return r4;
    L11:
        if (Character.isLowSurrogate(r3.charAt(100000)) == false) goto L13;
        r1 = 99999;
    L7:
        return r3;
    }

    public static String t(i94 r4) {
        if (r4 == null) goto L27;
        e94 r5 = r4.d;
        w03 r1 = r5.n;
        p94 r2 = n94.a;
        if (r1.c(r2) == true) goto L8;
        p94 r6 = n94.D;
        if (r1.c(r6) == false) goto L18;
        Object r7 = r1.g(r6);
        if (r7 != null) goto L14;
        r7 = null;
    L14:
        he r8 = (he) r7;
        if (r8 == null) goto L27;
        return r8.o;
    L18:
        Object r9 = r1.g(n94.z);
        if (r9 != null) goto L21;
        r9 = null;
    L21:
        List r10 = (List) r9;
        if (r10 == null) goto L27;
        he r11 = (he) q40.x0(r10);
        if (r11 == null) goto L27;
        return r11.o;
    L8:
        return gc2.a((List) r5.d(r2), ",", null, 62);
    L27:
        return null;
    }

    public static final boolean x(h64 r3, float r4) {
        v82 r0 = r3.a;
        if (r4 >= 0.0f) goto L7;
        if (((Number) r0.invoke()).floatValue() <= 0.0f) goto L7;
        return true;
    L7:
        if (r4 > 0.0f) goto L9;
        return false;
    L9:
        if (((Number) r0.invoke()).floatValue() >= ((Number) r3.b.invoke()).floatValue()) goto L15;
        return true;
    L15:
        return false;
    }

    public static final boolean y(h64 r3) {
        v82 r0 = r3.a;
        if (((Number) r0.invoke()).floatValue() <= 0.0f) goto L6;
        return true;
    L6:
        ((Number) r0.invoke()).floatValue();
        ((Number) r3.b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(h64 r2) {
        v82 r0 = r2.a;
        if (((Number) r0.invoke()).floatValue() >= ((Number) r2.b.invoke()).floatValue()) goto L6;
        return true;
    L6:
        ((Number) r0.invoke()).floatValue();
        return false;
    }

    public final int A(int r1) {
        if (r1 != this.q.getSemanticsOwner().a().f) goto L6;
        return -1;
    L6:
        return r1;
    }

    public final void B(i94 r20, j94 r21) {
        int[] r3 = m02.a;
        j03 r4 = new j03();
        List r5 = i94.j(4, r20);
        c72 r6 = r20.c;
        int r7 = r5.size();
        int r8 = 0;
        int r9 = 0;
    L3:
        if (r9 >= r7) goto L12;
        i94 r10 = (i94) r5.get(r9);
        e02 r11 = s();
        int r12 = r10.f;
        if (r11.a(r12) == false) goto L11;
        if (r21.b.c(r12) == false) goto L8;
        r4.a(r12);
        goto L11
    L8:
        w(r6);
        return;
    L11:
        r9 = r9 + 1;
        goto L3
    L12:
        j03 r2 = r21.b;
        int[] r13 = r2.b;
        long[] r14 = r2.a;
        int r15 = r14.length - 2;
        if (r15 < 0) goto L29;
        int r16 = 0;
    L15:
        long r17 = r14[r16];
        if (((((~r17) << 7) & r17) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L27;
        int r18 = 8 - ((~(r16 - r15)) >>> 31);
        int r19 = 0;
    L18:
        if (r19 >= r18) goto L26;
        if ((255 & r17) >= 128) goto L25;
        if (r4.c(r13[(r16 << 3) + r19]) == true) goto L25;
        w(r6);
        return;
    L25:
        r17 = r17 >> 8;
        r19 = r19 + 1;
        goto L18
    L26:
        if (r18 != 8) goto L29;
    L27:
        if (r16 == r15) goto L29;
        r16 = r16 + 1;
    L29:
        List r1 = i94.j(4, r20);
        int r22 = r1.size();
    L30:
        if (r8 >= r22) goto L37;
        i94 r23 = (i94) r1.get(r8);
        j94 r24 = (j94) this.T.b(r23.f);
        if (r24 == null) goto L36;
        if (s().a(r23.f) == false) goto L36;
        B(r23, r24);
    L36:
        r8 = r8 + 1;
        goto L30
    }

    public final boolean C(AccessibilityEvent r4) {
        if (v() == true) goto L6;
        return false;
    L6:
        if (r4.getEventType() != 2048) goto L8;
    L9:
        this.B = true;
    L16:
        boolean r5 = ((Boolean) this.s.invoke(r4)).booleanValue();     // Catch: Throwable -> L13
        this.B = false;
        return r5;
    L13:
        th = move-exception;
        this.B = false;
        throw th;
    L8:
        if (r4.getEventType() != 32768) goto L16;
        goto L9
    }

    public final boolean D(int r2, int r3, Integer r4, List r5) {
        if (r2 != Integer.MIN_VALUE) goto L5;
        return false;
    L5:
        if (v() == false) goto L16;
        AccessibilityEvent r6 = o(r2, r3);
        if (r4 == null) goto L10;
        r6.setContentChangeTypes(r4.intValue());
    L10:
        if (r5 == null) goto L13;
        r6.setContentDescription(gc2.a(r5, ",", null, 62));
    L13:
        return C(r6);
    L16:
        return false;
    }

    public final void F(String r2, int r3, int r4) {
        AccessibilityEvent r5 = o(A(r3), 32);
        r5.setContentChangeTypes(r4);
        if (r2 == null) goto L5;
        r5.getText().add(r2);
    L5:
        C(r5);
    }

    public final void G(int r7) {
        va r0 = this.L;
        if (r0 == null) goto L10;
        i94 r1 = r0.a;
        if (r7 == r1.f) goto L8;
        return;
    L8:
        if ((SystemClock.uptimeMillis() - r0.f) > 1000) goto L10;
        AccessibilityEvent r8 = o(A(r1.f), 131072);
        r8.setFromIndex(r0.d);
        r8.setToIndex(r0.e);
        r8.setAction(r0.b);
        r8.setMovementGranularity(r0.c);
        r8.getText().add(t(r1));
        C(r8);
    L10:
        this.L = null;
    }

    public final void H(e02 r55) {
        e02 r6 = r55;
        Integer r7 = 64;
        ArrayList r9 = this.Y;
        ArrayList r8 = new ArrayList(r9);
        r9.clear();
        int[] r10 = r6.b;
        long[] r11 = r6.a;
        int r12 = 2;
        int r13 = r11.length - 2;
        int r14 = 0;
        Integer r2 = 0;
        if (r13 < 0) goto L272;
        int r15 = 0;
    L5:
        long r3 = r11[r15];
        int r16 = r12;
        int r17 = r13;
        if (((((~r3) << 7) & r3) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L269;
        int r18 = 8;
        int r19 = 8 - ((~(r15 - r17)) >>> 31);
        long r21 = r3;
        int r1 = r14;
    L8:
        if (r1 >= r19) goto L266;
        if ((r21 & 255) >= 128) goto L264;
        int r4 = r10[(r15 << 3) + r1];
        j94 r5 = (j94) this.T.b(r4);
        if (r5 == null) goto L264;
        e94 r20 = r5.a;
        w03 r22 = r20.n;
        k94 r110 = (k94) r6.b(r4);
        if (r110 == null) goto L17;
        i94 r111 = r110.a;
    L18:
        if (r111 == null) goto L263;
        int r28 = r18;
        int r112 = r111.f;
        e94 r23 = r111.d;
        int[] r29 = r10;
        w03 r113 = r23.n;
        long[] r30 = r11;
        Object[] r114 = r113.b;
        Object[] r115 = r113.c;
        long[] r116 = r113.a;
        int r33 = r1;
        int r24 = r116.length - 2;
        if (r24 < 0) goto L249;
        int r36 = r112;
        boolean r35 = false;
        int r37 = 0;
    L22:
        long r117 = r116[r37];
        int r38 = r19;
        i94 r39 = r111;
        if (((((~r117) << 7) & r117) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L246;
        int r118 = 8 - ((~(r37 - r24)) >>> 31);
        int r119 = 0;
    L25:
        if (r119 >= r118) goto L243;
        if ((r117 & 255) >= 128) goto L240;
        int r40 = (r37 << 3) + r119;
        Object r41 = r114[r40];
        int r42 = r24;
        Object r25 = r115[r40];
        e94 r43 = r20;
        p94 r26 = (p94) r41;
        long r44 = r117;
        p94 r120 = n94.u;
        if (h12.c(r26, r120) == false) goto L31;
    L34:
        int r121 = r8.size();
        int r122 = 0;
    L35:
        if (r122 >= r121) goto L40;
        int r46 = r121;
        if (((p64) r8.get(r122)).n == r4) goto L38;
        r122 = r122 + 1;
        r121 = r46;
        goto L35
    L38:
        p64 r123 = (p64) r8.get(r122);
    L41:
        if (r123 == null) goto L43;
        boolean r124 = false;
    L44:
        r9.add(r123);
    L45:
        if (r124 == true) goto L52;
        Object r125 = r22.g(r26);
        if (r125 != null) goto L50;
        r125 = null;
    L50:
        if (h12.c(r25, r125) == false) goto L52;
    L51:
        Integer r126 = r2;
        r22 = r22;
        Integer r50 = r7;
        ArrayList r51 = r8;
        int r27 = r36;
        int r31 = r42;
        int r32 = r4;
    L241:
        i94 r34 = r39;
    L242:
        r36 = r27;
        r39 = r34;
        r28 = 8;
        r4 = r32;
        r2 = r126;
        r22 = r22;
        r20 = r43;
        r117 = r44 >> 8;
        r7 = r50;
        r119 = r119 + 1;
        r24 = r31;
        r8 = r51;
    L52:
        p94 r127 = n94.d;
        if (h12.c(r26, r127) == false) goto L57;
        r25.getClass();
        String r45 = (String) r25;
        boolean r47 = r22.c(r127);
        int r128 = r28;
        if (r47 == false) goto L51;
        F(r45, r4, r128);
        goto L51
    L57:
        int r129 = r28;
        if (h12.c(r26, n94.b) == false) goto L61;
        E(this, A(r4), 2048, r7, r129);
        E(this, A(r4), 2048, r2, r129);
        goto L51
    L61:
        if (h12.c(r26, n94.H) == false) goto L64;
        E(this, A(r4), 2048, 8192, 8);
        E(this, A(r4), 2048, r2, 8);
        goto L51
    L64:
        if (h12.c(r26, n94.K) == false) goto L67;
        E(this, A(r4), 2048, 3072, 8);
        goto L51
    L67:
        if (h12.c(r26, n94.c) == false) goto L70;
        E(this, A(r4), 2048, r7, 8);
        E(this, A(r4), 2048, r2, 8);
        goto L51
    L70:
        if (h12.c(r26, n94.G) == false) goto L76;
        Object r48 = r113.g(n94.w);
        if (r48 != null) goto L74;
        r48 = null;
    L74:
        m24 r49 = (m24) r48;
        E(this, A(r4), 2048, r7, 8);
        E(this, A(r4), 2048, r2, 8);
        goto L51
    L76:
        if (h12.c(r26, n94.a) == false) goto L78;
        int r52 = A(r4);
        r25.getClass();
        D(r52, 2048, 4, (List) r25);
        goto L51
    L78:
        p94 r130 = n94.D;
        String r410 = "";
        if (h12.c(r26, r130) == true) goto L81;
        Integer r411 = r2;
        r22 = r22;
        r50 = r7;
        r51 = r8;
        r31 = r42;
        r32 = r4;
        r34 = r39;
        p94 r53 = n94.E;
        if (h12.c(r26, r53) == false) goto L156;
        Object r54 = r113.g(r130);
        if (r54 != null) goto L149;
        r54 = null;
    L149:
        he r56 = (he) r54;
        if (r56 == null) goto L155;
        String r57 = r56.o;
        if (r57 == null) goto L155;
        r410 = r57;
    L155:
        long r58 = ((ss4) r23.d(r53)).a;
        r39 = r34;
        r126 = r411;
        C(p(A(r32), Integer.valueOf((int) (r58 >> 32)), Integer.valueOf((int) (r58 & 4294967295L)), Integer.valueOf(r410.length()), P(r410)));
        r27 = r36;
        G(r27);
        goto L241
    L156:
        r27 = r36;
        r126 = r411;
        if (h12.c(r26, r120) == false) goto L159;
    L222:
        w(r34.c);
        int r59 = r9.size();
        int r60 = 0;
    L223:
        if (r60 >= r59) goto L228;
        if (((p64) r9.get(r60)).n == r32) goto L226;
        r60 = r60 + 1;
        goto L223
    L226:
        p64 r61 = (p64) r9.get(r60);
    L229:
        r61.getClass();
        Object r62 = r113.g(r120);
        if (r62 != null) goto L232;
        r62 = null;
    L232:
        r61.r = (h64) r62;
        Object r63 = r113.g(n94.v);
        if (r63 != null) goto L235;
        r63 = null;
    L235:
        r61.s = (h64) r63;
        if (r61.o.contains(r61) == false) goto L242;
        wb3 r64 = this.q.getSnapshotObserver();
        r64.a.e(r61, this.Z, new fa(1, r61, this));
        goto L242
    L228:
        r61 = null;
        goto L229
    L159:
        if (h12.c(r26, n94.v) == true) goto L222;
        if (h12.c(r26, n94.l) == false) goto L168;
        r25.getClass();
        if (((Boolean) r25).booleanValue() == false) goto L166;
        int r65 = 8;
        C(o(A(r27), 8));
    L167:
        E(this, A(r27), 2048, r126, r65);
        goto L242
    L166:
        r65 = 8;
        goto L167
    L168:
        p94 r66 = d94.w;
        if (h12.c(r26, r66) == false) goto L199;
        List r67 = (List) r23.d(r66);
        Object r68 = r22.g(r66);
        if (r68 != null) goto L173;
        r68 = null;
    L173:
        List r69 = (List) r68;
        if (r69 == null) goto L192;
        x03 r70 = w54.a;
        x03 r71 = new x03();
        if (r67.size() > 0) goto L189;
        x03 r72 = new x03();
        if (r69.size() > 0) goto L187;
        if (r35 == false) goto L181;
    L184:
        boolean r73 = true;
    L186:
        r35 = r73;
        goto L242
    L181:
        if (r71.equals(r72) == false) goto L184;
        r73 = false;
        goto L186
    L187:
        r69.get(0).getClass();
        kf2.k();
        return;
    L189:
        r67.get(0).getClass();
        kf2.k();
        return;
    L192:
        if (r35 == false) goto L194;
    L197:
        r73 = true;
        goto L186
    L194:
        if (r67.isEmpty() == false) goto L197;
        r73 = false;
        goto L186
    L199:
        if (r35 == false) goto L201;
    L221:
        r35 = true;
        goto L242
    L201:
        if ((r25 instanceof w2) == false) goto L221;
        w2 r74 = (w2) r25;
        Object r75 = r22.g(r26);
        if (r75 != null) goto L205;
        r75 = null;
    L205:
        if (r74 != r75) goto L208;
    L220:
        r35 = false;
        goto L242
    L208:
        if ((r75 instanceof w2) == false) goto L221;
        String r131 = r74.a;
        w2 r76 = (w2) r75;
        sf1 r77 = r76.b;
        if (h12.c(r131, r76.a) == false) goto L221;
        sf1 r78 = r74.b;
        if (r78 != null) goto L217;
        if (r77 != null) goto L221;
    L217:
        if (r78 == null) goto L220;
        if (r77 != null) goto L220;
    L81:
        if (r113.c(d94.k) == false) goto L143;
        Object r79 = r22.g(r130);
        if (r79 != null) goto L85;
        r79 = null;
    L85:
        he r80 = (he) r79;
        if (r80 != null) goto L89;
        r80 = "";
    L89:
        Object r81 = r113.g(r130);
        if (r81 != null) goto L92;
        r81 = null;
    L92:
        CharSequence r82 = (he) r81;
        if (r82 != null) goto L96;
        r82 = "";
    L96:
        CharSequence r132 = P(r82);
        int r133 = r80.length();
        int r134 = r82.length();
        Integer r412 = r2;
        if (r133 <= r134) goto L99;
        int r83 = r134;
    L100:
        r50 = r7;
        int r84 = 0;
    L101:
        int r413 = r83;
        if (r84 >= r83) goto L107;
        r51 = r8;
        if (r80.charAt(r84) != r82.charAt(r84)) goto L108;
        r84 = r84 + 1;
        r83 = r413;
        r8 = r51;
    L108:
        int r85 = 0;
    L110:
        if (r85 >= (r413 - r84)) goto L115;
        int r510 = r85;
        if (r80.charAt((r133 - 1) - r85) != r82.charAt((r134 - 1) - r510)) goto L116;
        r85 = r510 + 1;
    L116:
        int r135 = (r133 - r510) - r84;
        int r86 = (r134 - r510) - r84;
        p94 r87 = n94.J;
        boolean r88 = r22.c(r87);
        boolean r89 = r113.c(r87);
        boolean r90 = r22.c(n94.D);
        if (r90 == false) goto L121;
        if (r88 == true) goto L121;
        if (r89 == false) goto L121;
        boolean r511 = true;
    L122:
        if (r90 == false) goto L126;
        if (r88 == false) goto L126;
        if (r89 == true) goto L126;
        boolean r91 = true;
    L127:
        if (r511 == true) goto L131;
        if (r91 == true) goto L131;
        AccessibilityEvent r92 = o(A(r4), 16);
        r92.setFromIndex(r84);
        r92.setRemovedCount(r135);
        r92.setAddedCount(r86);
        r92.setBeforeText(r80);
        r92.getText().add(r132);
        r32 = r4;
        Integer r93 = r412;
    L132:
        r92.setClassName("android.widget.EditText");
        if (Build.VERSION.SDK_INT < 37) goto L135;
        r34 = r39;
        ta.a(r34, r92);
    L136:
        C(r92);
        if (r511 == true) goto L141;
        if (r91 == true) goto L141;
        Integer r414 = r93;
    L142:
        r27 = r36;
        r31 = r42;
        r126 = r414;
    L141:
        long r136 = ((ss4) r23.d(n94.E)).a;
        r414 = r93;
        r92.setFromIndex((int) (r136 >> 32));
        r92.setToIndex((int) (r136 & 4294967295L));
        C(r92);
        goto L142
    L135:
        r34 = r39;
    L131:
        r32 = r4;
        r93 = r412;
        r92 = p(A(r4), r93, r412, Integer.valueOf(r134), r132);
    L126:
        r91 = false;
    L121:
        r511 = false;
        goto L122
    L115:
        r510 = r85;
        goto L116
    L107:
        r51 = r8;
        goto L108
    L99:
        r83 = r133;
        goto L100
    L143:
        r414 = r2;
        r22 = r22;
        r50 = r7;
        r51 = r8;
        r32 = r4;
        r34 = r39;
        E(this, A(r32), 2048, Integer.valueOf(r16), 8);
        goto L142
    L43:
        r123 = new p64(r4, r9);
        r124 = true;
        goto L44
    L40:
        r123 = null;
        goto L41
    L31:
        if (h12.c(r26, n94.v) == true) goto L34;
        r124 = false;
        goto L45
    L240:
        r43 = r20;
        r50 = r7;
        r51 = r8;
        r44 = r117;
        r119 = r119;
        r31 = r24;
        r126 = r2;
        r32 = r4;
        r22 = r22;
        r27 = r36;
        goto L241
    L243:
        Integer r137 = r2;
        e94 r415 = r20;
        w03 r138 = r22;
        Integer r512 = r7;
        ArrayList r513 = r8;
        int r94 = r36;
        int r95 = r24;
        int r96 = r4;
        i94 r97 = r39;
        if (r118 != r28) goto L250;
    L245:
        int r98 = r37;
        if (r98 == r95) goto L250;
        r37 = r98 + 1;
        r36 = r94;
        r24 = r95;
        r2 = r137;
        r22 = r138;
        r19 = r38;
        r20 = r415;
        r8 = r513;
        r28 = 8;
        r111 = r97;
        r4 = r96;
        r7 = r512;
    L250:
        if (r35 == true) goto L259;
        Iterator r99 = r415.iterator();
    L253:
        if (r99.hasNext() == false) goto L257;
        Map.Entry r100 = (Map.Entry) r99.next();
        e94 r101 = r97.k();
        if (r101.n.c((p94) r100.getKey()) == true) goto L253;
        boolean r139 = true;
    L258:
        r35 = r139;
        goto L259
    L257:
        r139 = false;
    L259:
        if (r35 == false) goto L261;
        int r102 = 8;
        E(this, A(r96), 2048, r137, 8);
    L265:
        r21 = r21 >> r102;
        r1 = r33 + 1;
        r6 = r55;
        r2 = r137;
        r10 = r29;
        r11 = r30;
        r19 = r38;
        r7 = r512;
        r8 = r513;
        r18 = r102;
        goto L8
    L261:
        r102 = 8;
        goto L265
    L246:
        r137 = r2;
        r415 = r20;
        r138 = r22;
        r512 = r7;
        r513 = r8;
        r94 = r36;
        r95 = r24;
        r96 = r4;
        r97 = r39;
        goto L245
    L249:
        r137 = r2;
        r415 = r20;
        r512 = r7;
        r513 = r8;
        r38 = r19;
        r96 = r4;
        r97 = r111;
        r35 = false;
        goto L250
    L263:
        throw xa3.l("no value for specified key");
    L17:
        r111 = null;
    L264:
        r33 = r1;
        r512 = r7;
        r513 = r8;
        r29 = r10;
        r30 = r11;
        r102 = r18;
        r38 = r19;
        r137 = r2;
        goto L265
    L266:
        Integer r514 = r7;
        ArrayList r515 = r8;
        int[] r210 = r10;
        long[] r310 = r11;
        int r103 = r18;
        Integer r140 = r2;
        if (r19 != r103) goto L296;
    L270:
        if (r15 == r17) goto L297;
        r15 = r15 + 1;
        r6 = r55;
        r13 = r17;
        r2 = r140;
        r12 = r16;
        r10 = r210;
        r11 = r310;
        r7 = r514;
        r8 = r515;
        r14 = 0;
        goto L5
    L297:
        return;
    L296:
        return;
    L269:
        r140 = r2;
        r514 = r7;
        r515 = r8;
        r210 = r10;
        r310 = r11;
        goto L270
    }

    public final void I(c72 r6, j03 r7) {
        if (r6.G() == true) goto L6;
        return;
    L6:
        if (this.q.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(r6) == true) goto L47;
        c72 r2 = null;
        if (r6.Q.d(8) == true) goto L18;
        r6 = r6.t();
    L12:
        if (r6 == null) goto L17;
        if (r6.Q.d(8) == true) goto L18;
        r6 = r6.t();
        goto L12
    L17:
        r6 = null;
    L18:
        if (r6 == null) goto L45;
        e94 r0 = r6.v();
        if (r0 != null) goto L23;
        return;
    L23:
        if (r0.p == true) goto L34;
        c72 r1 = r6.t();
    L25:
        if (r1 == null) goto L32;
        e94 r4 = r1.v();
        if (r4 == null) goto L31;
        if (r4.p != true) goto L31;
        r2 = r1;
    L31:
        r1 = r1.t();
    L32:
        if (r2 == null) goto L34;
        r6 = r2;
    L34:
        int r8 = r6.o;
        if (r7.a(r8) == false) goto L49;
        E(this, A(r8), 2048, 1, 8);
        return;
    L49:
        return;
    L45:
        return;
    }

    public final void J(c72 r4) {
        if (r4.G() == true) goto L6;
        return;
    L6:
        if (this.q.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(r4) == true) goto L20;
        int r5 = r4.o;
        h64 r0 = (h64) this.C.b(r5);
        h64 r1 = (h64) this.D.b(r5);
        if (r0 != null) goto L12;
        if (r1 != null) goto L12;
        return;
    L12:
        AccessibilityEvent r6 = o(r5, 4096);
        if (r0 == null) goto L15;
        r6.setScrollX((int) ((Number) r0.a.invoke()).floatValue());
        r6.setMaxScrollX((int) ((Number) r0.b.invoke()).floatValue());
    L15:
        if (r1 == null) goto L17;
        r6.setScrollY((int) ((Number) r1.a.invoke()).floatValue());
        r6.setMaxScrollY((int) ((Number) r1.b.invoke()).floatValue());
    L17:
        C(r6);
        return;
    }

    public final boolean K(i94 r11, int r12, int r13, boolean r14) {
        e94 r0 = r11.d;
        int r1 = r11.f;
        p94 r2 = d94.j;
        boolean r3 = false;
        if (r0.n.c(r2) == true) goto L5;
    L10:
        if (r12 == r13) goto L12;
    L14:
        String r9 = t(r11);
        if (r9 != null) goto L17;
    L16:
        return false;
    L17:
        if (r12 < 0) goto L22;
        if (r12 != r13) goto L22;
        if (r13 > r9.length()) goto L22;
    L23:
        this.G = r12;
        if (r9.length() <= 0) goto L26;
        r3 = true;
    L26:
        int r5 = A(r1);
        Integer r15 = null;
        if (r3 == false) goto L29;
        Integer r6 = Integer.valueOf(this.G);
    L30:
        if (r3 == false) goto L32;
        Integer r7 = Integer.valueOf(this.G);
    L33:
        if (r3 == false) goto L35;
        r15 = Integer.valueOf(r9.length());
    L35:
        C(p(r5, r6, r7, r15, r9));
        G(r1);
        return true;
    L32:
        r7 = null;
        goto L33
    L29:
        r6 = null;
    L22:
        r12 = -1;
        goto L23
    L12:
        if (r13 != this.G) goto L14;
    L5:
        if (xl.b(r11) == false) goto L10;
        xf1 r10 = (xf1) ((w2) r11.d.d(r2)).b;
        if (r10 == null) goto L16;
        return ((Boolean) r10.a(Integer.valueOf(r12), Integer.valueOf(r13), Boolean.valueOf(r14))).booleanValue();
    }

    public final Rect M(float r8, float r9, float r10, float r11) {
        long r0 = Float.floatToRawIntBits(r8);
        long r12 = ((long) Float.floatToRawIntBits(r9)) & 4294967295L;
        ra r7 = this.q;
        long r13 = r7.p(r12 | (r0 << 32));
        long r1 = Float.floatToRawIntBits(r10);
        long r14 = r7.p((((long) Float.floatToRawIntBits(r11)) & 4294967295L) | (r1 << 32));
        int r2 = (int) (r13 >> 32);
        int r3 = (int) (r14 >> 32);
        int r15 = (int) (r13 & 4294967295L);
        int r16 = (int) (r14 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(r2), Float.intBitsToFloat(r3))), (int) Math.floor(Math.min(Float.intBitsToFloat(r15), Float.intBitsToFloat(r16))), (int) Math.ceil(Math.max(Float.intBitsToFloat(r2), Float.intBitsToFloat(r3))), (int) Math.ceil(Math.max(Float.intBitsToFloat(r15), Float.intBitsToFloat(r16))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        j03 r1 = new j03();
        j03 r2 = this.N;
        int[] r3 = r2.b;
        long[] r4 = r2.a;
        int r5 = r4.length - 2;
        i03 r6 = this.T;
        int r14 = 8;
        if (r5 < 0) goto L34;
        int r7 = 0;
        long r16 = 128;
        long r18 = 255;
    L5:
        long r9 = r4[r7];
        char r8 = 7;
        long r20 = -9187201950435737472L;
        if (((((~r9) << 7) & r9) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L31;
        int r11 = 8 - ((~(r7 - r5)) >>> 31);
        int r12 = 0;
    L8:
        if (r12 >= r11) goto L28;
        if ((r9 & 255) >= 128) goto L26;
        int r13 = r3[(r7 << 3) + r12];
        char r22 = r8;
        k94 r10 = (k94) s().b(r13);
        Object r23 = null;
        if (r10 == null) goto L14;
        i94 r15 = r10.a;
    L15:
        if (r15 == null) goto L18;
        e94 r17 = r15.d;
        if (r17.n.c(n94.d) == false) goto L18;
    L27:
        r9 = r9 >> 8;
        r12 = r12 + 1;
        r8 = r22;
    L18:
        r1.a(r13);
        j94 r19 = (j94) r6.b(r13);
        if (r19 == null) goto L25;
        e94 r21 = r19.a;
        Object r24 = r21.n.g(n94.d);
        if (r24 == null) goto L24;
        r23 = r24;
    L24:
        r23 = (String) r23;
    L25:
        F(r23, r13, 32);
        goto L27
    L14:
        r15 = null;
        goto L15
    L26:
        r22 = r8;
        goto L27
    L28:
        char r25 = r8;
        if (r11 != 8) goto L35;
    L32:
        if (r7 == r5) goto L35;
        r7 = r7 + 1;
    L35:
        int[] r26 = r1.b;
        long[] r27 = r1.a;
        int r28 = r27.length - 2;
        if (r28 < 0) goto L66;
        int r29 = 0;
    L38:
        long r30 = r27[r29];
        if (((((~r30) << r25) & r30) & r20) == r20) goto L63;
        int r31 = 8 - ((~(r29 - r28)) >>> 31);
        int r110 = 0;
    L41:
        if (r110 >= r31) goto L60;
        if ((r30 & r18) >= r16) goto L58;
        int r111 = r26[(r29 << 3) + r110];
        int r112 = Integer.hashCode(r111) * (-862048943);
        int r113 = r112 ^ (r112 << 16);
        int r114 = r113 & 127;
        int r115 = r2.c;
        int r116 = (r113 >>> 7) & r115;
        int r210 = r14;
        int r211 = 0;
    L45:
        long[] r117 = r2.a;
        int r212 = r116 >> 3;
        long[] r213 = r27;
        int r32 = (r116 & 7) << 3;
        long r33 = r30;
        long r34 = (r117[r212] >>> r32) | ((r117[r212 + 1] << (64 - r32)) & ((-r32) >> 63));
        int r35 = r115;
        long r118 = (((long) r114) * 72340172838076673L) ^ r34;
        long r119 = ((r118 - 72340172838076673L) & (~r118)) & r20;
    L47:
        if (r119 == 0) goto L52;
        int r214 = (r116 + (Long.numberOfTrailingZeros(r119) >> 3)) & r35;
        int r215 = r35;
        if (r2.b[r214] == r111) goto L50;
        r119 = r119 & (r119 - 1);
        r35 = r215;
    L50:
        int r36 = r214;
        if (r36 < 0) goto L59;
        r2.g(r36);
    L59:
        r30 = r33 >> r210;
        r110 = r110 + 1;
        r14 = r210;
        r27 = r213;
        goto L41
    L52:
        int r216 = r35;
        if (((r34 & ((~r34) << 6)) & r20) != 0) goto L54;
        r211 = r211 + 8;
        r116 = (r116 + r211) & r216;
        r27 = r213;
        r115 = r216;
        r30 = r33;
        goto L45
    L54:
        r214 = -1;
        goto L50
    L58:
        r213 = r27;
        r33 = r30;
        r210 = r14;
        goto L59
    L60:
        long[] r217 = r27;
        if (r31 != r14) goto L66;
    L64:
        if (r29 == r28) goto L66;
        r29 = r29 + 1;
        r27 = r217;
        r14 = 8;
        goto L38
    L63:
        r217 = r27;
    L66:
        r6.c();
        e02 r37 = s();
        int[] r38 = r37.b;
        Object[] r39 = r37.c;
        long[] r40 = r37.a;
        int r41 = r40.length - 2;
        if (r41 < 0) goto L88;
        int r42 = 0;
    L69:
        long r43 = r40[r42];
        if (((((~r43) << r25) & r43) & r20) == r20) goto L86;
        int r120 = 8 - ((~(r42 - r41)) >>> 31);
        int r121 = 0;
    L72:
        if (r121 >= r120) goto L83;
        if ((r43 & r18) >= r16) goto L81;
        int r122 = (r42 << 3) + r121;
        int r123 = r38[r122];
        i94 r124 = ((k94) r39[r122]).a;
        e94 r125 = r124.d;
        p94 r126 = n94.d;
        if (r125.n.c(r126) == true) goto L78;
    L80:
        r6.i(r123, new j94(r124, s()));
        goto L81
    L78:
        if (r2.a(r123) == false) goto L80;
        F((String) r124.d.d(r126), r123, 16);
    L81:
        r43 = r43 >> 8;
        r121 = r121 + 1;
        goto L72
    L83:
        if (r120 != 8) goto L88;
    L86:
        if (r42 == r41) goto L88;
        r42 = r42 + 1;
    L88:
        this.U = new j94(this.q.getSemanticsOwner().a(), s());
        return;
    L31:
        r25 = 7;
        goto L32
    L34:
        r16 = 128;
        r18 = 255;
        r20 = -9187201950435737472L;
        r25 = 7;
        goto L35
    }

    @Override // defpackage.z2
    public final zh0 b(View r1) {
        return this.w;
    }

    public final void j(int r24, v3 r25, String r26, Bundle r27) {
        AccessibilityNodeInfo r3 = r25.a;
        k94 r5 = (k94) s().b(r24);
        if (r5 == null) goto L182;
        i94 r6 = r5.a;
        if (r6 == null) goto L194;
        c72 r7 = r6.c;
        e94 r8 = r6.d;
        w03 r9 = r8.n;
        String r10 = t(r6);
        if (h12.c(r26, this.Q) == false) goto L14;
        int r0 = this.O.d(r24);
        if (r0 == (-1)) goto L183;
        r3.getExtras().putInt(r26, r0);
        return;
    L183:
        return;
    L14:
        if (h12.c(r26, this.R) == false) goto L19;
        int r1 = this.P.d(r24);
        if (r1 == (-1)) goto L184;
        r3.getExtras().putInt(r26, r1);
        return;
    L184:
        return;
    L19:
        boolean r2 = r9.c(d94.a);
        ra r11 = this.q;
        if (r2 == false) goto L103;
        if (r27 == null) goto L103;
        if (h12.c(r26, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY") == false) goto L103;
        int r4 = r27.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int r12 = r27.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (r12 <= 0) goto L101;
        if (r4 < 0) goto L101;
        if (r10 == null) goto L29;
        int r13 = r10.length();
    L30:
        if (r4 >= r13) goto L101;
        ms4 r14 = gh0.p(r8);
        if (r14 != null) goto L35;
    L34:
        RectF[] r15 = null;
    L97:
        if (r15 == null) goto L195;
        r3.getExtras().putParcelableArray(r26, r15);
        return;
    L195:
        return;
    L35:
        iz1 r16 = (iz1) r7.Q.d;
        if (r16.n0.A == true) goto L39;
        r16 = null;
    L39:
        if (r16 == null) goto L34;
        long r17 = r16.K0(0);
        wv3 r18 = r6.g();
        RectF[] r19 = new RectF[r12];
        int r20 = 0;
    L41:
        if (r20 >= r12) goto L96;
        int r110 = r4 + r20;
        if (r110 < r14.a.a.o.length()) goto L45;
        int r23 = r4;
        r12 = r12;
        ms4 r111 = r14;
        RectF[] r112 = r19;
        int r113 = r20;
    L95:
        r20 = r113 + 1;
        r4 = r23;
        r12 = r12;
        r19 = r112;
        r14 = r111;
        goto L41
    L45:
        fd r114 = r14.b;
        he r115 = (he) ((bq4) r114.c).n;
        r23 = r4;
        if (r110 >= 0) goto L48;
    L50:
        dz1.a("offset(" + r110 + ") is out of bounds [0, " + r115.o.length() + ")");
    L51:
        ArrayList r21 = (ArrayList) r114.e;
        od3 r22 = (od3) r21.get(rr2.C(r21, r110));
        ic r28 = r22.a;
        int r116 = r22.a(r110);
        CharSequence r117 = r28.e;
        if (r116 >= 0) goto L54;
    L56:
        dz1.a("offset(" + r116 + ") is out of bounds [0," + r117.length() + ")");
    L57:
        ks4 r29 = r28.d;
        int r118 = r29.f(r116);
        float r119 = r29.g(r118);
        float r120 = r29.d(r118);
        Layout r121 = r29.e;
        r111 = r14;
        if (r121.getParagraphDirection(r118) != 1) goto L60;
        boolean r122 = true;
    L61:
        boolean r123 = r121.isRtlCharAt(r116);
        if (r122 == false) goto L66;
        if (r123 == true) goto L66;
        float r124 = r29.h(r116, false);
        float r30 = r29.h(r116 + 1, true);
    L73:
        RectF r31 = new RectF(r124, r119, r30, r120);
        float r32 = r31.left;
        float r125 = r31.top + 0.0f;
        float r126 = r31.right;
        float r33 = r31.bottom + 0.0f;
        float r34 = r22.f;
        long r127 = Float.floatToRawIntBits(0.0f);
        long r35 = (((long) Float.floatToRawIntBits(r34)) & 4294967295L) | (r127 << 32);
        int r36 = (int) (r35 >> 32);
        r112 = r19;
        r113 = r20;
        int r37 = (int) (r35 & 4294967295L);
        wv3 r38 = new wv3(Float.intBitsToFloat(r36) + r32, Float.intBitsToFloat(r37) + r125, Float.intBitsToFloat(r36) + r126, Float.intBitsToFloat(r37) + r33).f(r17);
        if (r38.a >= r18.c) goto L76;
        boolean r39 = true;
    L78:
        if (r18.a >= r38.c) goto L80;
        boolean r40 = true;
    L81:
        boolean r41 = r40 & r39;
        if (r38.b >= r18.d) goto L84;
        boolean r42 = true;
    L85:
        boolean r43 = r41 & r42;
        if (r18.b >= r38.d) goto L88;
        boolean r44 = true;
    L90:
        if ((r43 & r44) == false) goto L92;
        wv3 r45 = r38.c(r18);
    L93:
        if (r45 == null) goto L95;
        float r46 = r45.a;
        float r47 = r45.b;
        long r48 = r11.p((Float.floatToRawIntBits(r46) << 32) | (((long) Float.floatToRawIntBits(r47)) & 4294967295L));
        float r49 = r45.c;
        float r50 = r45.d;
        long r128 = Float.floatToRawIntBits(r49);
        long r51 = r11.p((((long) Float.floatToRawIntBits(r50)) & 4294967295L) | (r128 << 32));
        int r129 = (int) (r48 >> 32);
        int r52 = (int) (r51 >> 32);
        int r53 = (int) (r48 & 4294967295L);
        int r130 = (int) (r51 & 4294967295L);
        r112[r113] = new RectF(Math.min(Float.intBitsToFloat(r129), Float.intBitsToFloat(r52)), Math.min(Float.intBitsToFloat(r53), Float.intBitsToFloat(r130)), Math.max(Float.intBitsToFloat(r129), Float.intBitsToFloat(r52)), Math.max(Float.intBitsToFloat(r53), Float.intBitsToFloat(r130)));
        goto L95
    L92:
        r45 = null;
        goto L93
    L88:
        r44 = false;
        goto L90
    L84:
        r42 = false;
        goto L85
    L80:
        r40 = false;
        goto L81
    L76:
        r39 = false;
    L66:
        if (r122 == false) goto L70;
        if (r123 == false) goto L70;
        float r131 = r29.i(r116, false);
        r124 = r29.i(r116 + 1, true);
        r30 = r131;
    L70:
        if (r123 == false) goto L72;
        float r132 = r29.h(r116, false);
        r124 = r29.h(r116 + 1, true);
        r30 = r132;
        goto L73
    L72:
        float r133 = r29.i(r116, false);
        r30 = r29.i(r116 + 1, true);
        r124 = r133;
        goto L73
    L60:
        r122 = false;
        goto L61
    L54:
        if (r116 >= r117.length()) goto L56;
    L48:
        if (r110 >= r115.o.length()) goto L50;
    L96:
        r15 = r19;
        goto L97
    L29:
        r13 = Integer.MAX_VALUE;
    L101:
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
        return;
    L103:
        p94 r54 = n94.x;
        if (r9.c(r54) == false) goto L117;
        if (r27 == null) goto L117;
        if (h12.c(r26, "androidx.compose.ui.semantics.testTag") == false) goto L117;
        Object r55 = r9.g(r54);
        if (r55 != null) goto L111;
        Object r134 = null;
    L112:
        String r135 = (String) r134;
        if (r135 == null) goto L185;
        r3.getExtras().putCharSequence(r26, r135);
        return;
    L185:
        return;
    L111:
        r134 = r55;
    L117:
        if (h12.c(r26, "androidx.compose.ui.semantics.id") == false) goto L121;
        r3.getExtras().putInt(r26, r6.f);
        return;
    L121:
        if (h12.c(r26, "androidx.compose.ui.semantics.shapeType") == false) goto L143;
        Object r56 = r9.g(n94.O);
        if (r56 != null) goto L125;
        Object r136 = null;
    L126:
        ac4 r137 = (ac4) r136;
        if (r137 == null) goto L186;
        Rect r57 = new Rect();
        r3.getBoundsInScreen(r57);
        wv3 r58 = u(r6, r57, r137);
        float r59 = r58.b;
        float r60 = r58.a;
        ya4 r61 = r137.a(r58.b(), r7.K, r11.getDensity());
        if ((r61 instanceof nb3) == false) goto L133;
        r3.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
        r3.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(r61, r60, r59));
        return;
    L133:
        if ((r61 instanceof ob3) == false) goto L137;
        r3.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
        r3.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(r61, r60, r59));
        r3.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(r61));
        return;
    L137:
        if ((r61 instanceof mb3) == false) goto L140;
        r3.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
        r3.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(r61, r60, r59));
        return;
    L140:
        er1.n();
        return;
    L186:
        return;
    L125:
        r136 = r56;
        goto L126
    L143:
        if (h12.c(r26, "androidx.compose.ui.semantics.shapeRect") == false) goto L155;
        Object r62 = r9.g(n94.O);
        if (r62 != null) goto L147;
        Object r138 = null;
    L148:
        ac4 r139 = (ac4) r138;
        if (r139 == null) goto L187;
        Rect r63 = new Rect();
        r3.getBoundsInScreen(r63);
        wv3 r64 = u(r6, r63, r139);
        Rect r65 = L(r139.a(r64.b(), r7.K, r11.getDensity()), r64.a, r64.b);
        if (r65 == null) goto L188;
        r3.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", r65);
        return;
    L188:
        return;
    L187:
        return;
    L147:
        r138 = r62;
        goto L148
    L155:
        if (h12.c(r26, "androidx.compose.ui.semantics.shapeCorners") == false) goto L167;
        Object r66 = r9.g(n94.O);
        if (r66 != null) goto L159;
        Object r140 = null;
    L160:
        ac4 r141 = (ac4) r140;
        if (r141 == null) goto L189;
        Rect r67 = new Rect();
        r3.getBoundsInScreen(r67);
        float[] r68 = N(r141.a(u(r6, r67, r141).b(), r7.K, r11.getDensity()));
        if (r68 == null) goto L190;
        r3.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", r68);
        return;
    L190:
        return;
    L189:
        return;
    L159:
        r140 = r66;
        goto L160
    L167:
        if (h12.c(r26, "androidx.compose.ui.semantics.shapeRegion") == false) goto L191;
        Object r69 = r9.g(n94.O);
        if (r69 != null) goto L171;
        Object r142 = null;
    L172:
        ac4 r143 = (ac4) r142;
        if (r143 == null) goto L192;
        Rect r70 = new Rect();
        r3.getBoundsInScreen(r70);
        wv3 r71 = u(r6, r70, r143);
        Region r72 = O(r143.a(r71.b(), r7.K, r11.getDensity()), r71.a, r71.b);
        if (r72 == null) goto L193;
        r3.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", r72);
        return;
    L193:
        return;
    L192:
        return;
    L171:
        r142 = r69;
        goto L172
    L191:
        return;
    L194:
        return;
    }

    public final Rect k(k94 r4) {
        k02 r5 = r4.b;
        return M(r5.a, r5.b, r5.c, r5.d);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cb -> B:14:0x002f). Please report as a decompilation issue!!! */
    public final Object l(wd0 r11) {
        if ((r11 instanceof wa) == false) goto L7;
        wa r0 = (wa) r11;
        int r1 = r0.r;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.r = r1 - Integer.MIN_VALUE;
    L8:
        Object r12 = r0.p;
        int r2 = r0.r;
        qi r3 = this.I;
        xe0 r5 = xe0.n;
        if (r2 == 0) goto L22;
        if (r2 == 1) goto L19;
        if (r2 != 2) goto L17;
        xv r4 = r0.o;
        j03 r6 = r0.n;
        kb4.X(r12);     // Catch: Throwable -> L15
    L14:
        j03 r13 = r6;
        xv r7 = r4;
    L24:
        r0.n = r13;     // Catch: Throwable -> L15
        r0.o = r7;     // Catch: Throwable -> L15
        r0.r = 1;     // Catch: Throwable -> L15
        Object r8 = r7.b(r0);     // Catch: Throwable -> L15
        if (r8 == r5) goto L47;
        xv r9 = r7;
        r6 = r13;
        r12 = r8;
        r4 = r9;
    L29:
        if (((Boolean) r12).booleanValue() == false) goto L48;
        r4.c();     // Catch: Throwable -> L15
        if (v() == false) goto L45;
        Trace.beginSection("Compose:semantics:boundUpdates");     // Catch: Throwable -> L15
        int r14 = r3.p;     // Catch: Throwable -> L36
        int r10 = 0;
    L34:
        if (r10 >= r14) goto L38;
        c72 r15 = (c72) r3.o[r10];     // Catch: Throwable -> L36
        I(r15, r6);     // Catch: Throwable -> L36
        J(r15);     // Catch: Throwable -> L36
        r10 = r10 + 1;     // Catch: Throwable -> L36
        goto L34
    L38:
        r6.b();     // Catch: Throwable -> L36
        Trace.endSection();     // Catch: Throwable -> L15
        Handler r16 = this.q.getHandler();     // Catch: Throwable -> L15
        if (this.V == true) goto L45;
        if (r16 == null) goto L45;
        this.V = true;     // Catch: Throwable -> L15
        r16.post(this.X);     // Catch: Throwable -> L15
        goto L45
    L36:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L15
        throw th;     // Catch: Throwable -> L15
    L45:
        r3.clear();     // Catch: Throwable -> L15
        this.C.c();     // Catch: Throwable -> L15
        this.D.c();     // Catch: Throwable -> L15
        long r17 = this.u;     // Catch: Throwable -> L15
        r0.n = r6;     // Catch: Throwable -> L15
        r0.o = r4;     // Catch: Throwable -> L15
        r0.r = 2;     // Catch: Throwable -> L15
        if (au0.j(r17, r0) != r5) goto L14;
    L48:
        r3.clear();
        return j15.a;
    L47:
        return r5;
    L17:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L19:
        r4 = r0.o;
        r6 = r0.n;
        kb4.X(r12);     // Catch: Throwable -> L15
        goto L29
    L22:
        kb4.X(r12);
        r13 = new j03();     // Catch: Throwable -> L15
        aw r18 = this.J;     // Catch: Throwable -> L15
        r18.getClass();     // Catch: Throwable -> L15
        r7 = new xv(r18);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        r3.clear();
        throw th;
    L7:
        r0 = new wa(this, r11);
        goto L8
    }

    public final boolean m(int r22, long r23, boolean r25) {
        if (h12.c(Looper.getMainLooper().getThread(), Thread.currentThread()) == true) goto L5;
    L4:
        return false;
    L5:
        e02 r3 = s();
        if (g83.b(r23, 9205357640488583168L) == true) goto L4;
        if ((((9223372034707292159L & r23) + 36028792732385279L) & (-9223372034707292160L)) != 0) goto L4;
        if (r25 != true) goto L12;
        p94 r2 = n94.v;
    L14:
        Object[] r6 = r3.c;
        long[] r4 = r3.a;
        int r7 = r4.length - 2;
        if (r7 < 0) goto L4;
        int r8 = 0;
        boolean r9 = false;
    L17:
        long r10 = r4[r8];
        if (((((~r10) << 7) & r10) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L63;
        int r13 = 8;
        int r12 = 8 - ((~(r8 - r7)) >>> 31);
        int r14 = 0;
    L20:
        if (r14 >= r12) goto L59;
        if ((255 & r10) >= 128) goto L56;
        k94 r15 = (k94) r6[(r8 << 3) + r14];
        k02 r5 = r15.b;
        float r11 = r5.a;
        int r26 = r13;
        float r16 = r5.b;
        float r0 = r5.c;
        float r1 = r5.d;
        float r17 = Float.intBitsToFloat((int) (r23 >> 32));
        float r18 = Float.intBitsToFloat((int) (r23 & 4294967295L));
        if (r17 < r11) goto L26;
        boolean r19 = true;
    L28:
        if (r17 >= r0) goto L30;
        boolean r20 = true;
    L31:
        boolean r21 = r19 & r20;
        if (r18 < r16) goto L34;
        boolean r24 = true;
    L35:
        boolean r27 = r21 & r24;
        if (r18 >= r1) goto L38;
        boolean r28 = true;
    L40:
        if ((r28 & r27) == false) goto L57;
        Object r29 = r15.a.d.n.g(r2);
        if (r29 != null) goto L45;
        r29 = null;
    L45:
        h64 r30 = (h64) r29;
        if (r30 == null) goto L57;
        v82 r31 = r30.a;
        if (r22 >= 0) goto L54;
        if (((Number) r31.invoke()).floatValue() <= 0.0f) goto L57;
    L52:
        r9 = true;
        goto L57
    L54:
        if (((Number) r31.invoke()).floatValue() < ((Number) r30.b.invoke()).floatValue()) goto L52;
    L57:
        r10 = r10 >> r26;
        r14 = r14 + 1;
        r13 = r26;
        goto L20
    L38:
        r28 = false;
        goto L40
    L34:
        r24 = false;
        goto L35
    L30:
        r20 = false;
        goto L31
    L26:
        r19 = false;
        goto L28
    L56:
        r26 = r13;
        goto L57
    L59:
        if (r12 == r13) goto L63;
        return r9;
    L63:
        if (r8 == r7) goto L65;
        r8 = r8 + 1;
        goto L17
    L65:
        return r9;
    L12:
        if (r25 == true) goto L66;
        r2 = n94.u;
        goto L14
    L66:
        er1.n();
        return false;
    }

    public final void n() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
    L18:
        th = move-exception;
        Trace.endSection();
        throw th;
    L4:
        if (v() == false) goto L6;
        B(this.q.getSemanticsOwner().a(), this.U);     // Catch: Throwable -> L18
    L6:
        Trace.endSection();
        Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
        H(s());     // Catch: Throwable -> L15
        Trace.endSection();
        Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
        Q();     // Catch: Throwable -> L12
        Trace.endSection();
        return;
    L12:
        th = move-exception;
        Trace.endSection();
        throw th;
    L15:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    public final AccessibilityEvent o(int r3, int r4) {
        AccessibilityEvent r5 = AccessibilityEvent.obtain(r4);
        r5.setEnabled(true);
        r5.setClassName("android.view.View");
        ra r0 = this.q;
        r5.setPackageName(r0.getContext().getPackageName());
        r5.setSource(r0, r3);
        if (v() == false) goto L12;
        k94 r2 = (k94) s().b(r3);
        if (r2 == null) goto L12;
        i94 r6 = r2.a;
        e94 r7 = r6.d;
        p94 r1 = n94.J;
        r5.setPassword(r7.n.c(r1));
        e94 r8 = r6.d;
        p94 r9 = n94.n;
        Object r10 = r8.n.g(r9);
        if (r10 != null) goto L9;
        r10 = null;
    L9:
        boolean r11 = h12.c(r10, Boolean.TRUE);
        if (Build.VERSION.SDK_INT < 34) goto L12;
        a3.m(r5, r11);
    L12:
        return r5;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean r1) {
        this.v = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean r1) {
        this.v = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r2) {
        AccessibilityManager r3 = this.t;
        if (r3.isEnabled() == false) goto L5;
        this.v = null;
    L5:
        r3.addAccessibilityStateChangeListener(this);
        r3.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r2) {
        Handler r3 = this.q.getHandler();
        r3.getClass();
        r3.removeCallbacks(this.X);
        AccessibilityManager r4 = this.t;
        r4.removeAccessibilityStateChangeListener(this);
        r4.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int r2, Integer r3, Integer r4, Integer r5, CharSequence r6) {
        AccessibilityEvent r1 = o(r2, 8192);
        if (r3 == null) goto L5;
        r1.setFromIndex(r3.intValue());
    L5:
        if (r4 == null) goto L7;
        r1.setToIndex(r4.intValue());
    L7:
        if (r5 == null) goto L9;
        r1.setItemCount(r5.intValue());
    L9:
        if (r6 == null) goto L11;
        r1.getText().add(r6);
    L11:
        return r1;
    }

    public final int q(i94 r3) {
        e94 r4 = r3.d;
        p94 r0 = n94.a;
        if (r4.n.c(r0) == true) goto L9;
        p94 r1 = n94.E;
        if (r4.n.c(r1) == false) goto L9;
        return (int) (((ss4) r4.d(r1)).a & 4294967295L);
    L9:
        return this.G;
    }

    public final int r(i94 r3) {
        e94 r4 = r3.d;
        p94 r0 = n94.a;
        if (r4.n.c(r0) == true) goto L9;
        p94 r1 = n94.E;
        if (r4.n.c(r1) == false) goto L9;
        return (int) (((ss4) r4.d(r1)).a >> 32);
    L9:
        return this.G;
    }

    public final e02 s() {
        if (this.K == false) goto L16;
        this.K = false;
        ra r1 = this.q;
        this.M = wr1.o(r1.getSemanticsOwner(), new k2(2, (byte) 0));
        if (v() == false) goto L16;
        i03 r0 = this.M;
        Resources r2 = r1.getContext().getResources();
        g03 r3 = this.O;
        r3.a();
        g03 r4 = this.P;
        r4.a();
        k94 r5 = (k94) r0.b(-1);
        if (r5 == null) goto L9;
        i94 r6 = r5.a;
    L10:
        r6.getClass();
        ArrayList r7 = r94.b(r6, new x(5, r0), new x(6, r2), gb.O(r6));
        int r8 = 1;
        int r9 = r7.size() - 1;
        if (1 > r9) goto L16;
    L12:
        int r10 = ((i94) r7.get(r8 - 1)).f;
        int r11 = ((i94) r7.get(r8)).f;
        r3.f(r10, r11);
        r4.f(r11, r10);
        if (r8 == r9) goto L16;
        r8 = r8 + 1;
        goto L12
    L9:
        r6 = null;
    L16:
        return this.M;
    }

    public final wv3 u(i94 r10, Rect r11, ac4 r12) {
        xa r0 = new xa(r12);
        c72 r13 = r10.c;
        cx2 r14 = (cx2) r13.Q.g;
        eo0 r2 = null;
        if ((r14.q & 8) == 0) goto L37;
    L4:
        if (r14 == null) goto L37;
        if ((r14.p & 8) == 0) goto L35;
        cx2 r1 = r14;
        f13 r5 = null;
    L8:
        if (r1 == null) goto L35;
        if ((r1 instanceof g94) == true) goto L11;
        if ((r1.p & 8) == 0) goto L33;
        if ((r1 instanceof fo0) == false) goto L33;
        cx2 r6 = ((fo0) r1).C;
        int r7 = 0;
    L19:
        if (r6 == null) goto L31;
        if ((r6.p & 8) == 0) goto L30;
        r7 = r7 + 1;
        if (r7 != 1) goto L25;
        r1 = r6;
        goto L30
    L25:
        if (r5 != null) goto L27;
        r5 = new f13(new cx2[16]);
    L27:
        if (r1 == null) goto L29;
        r5.b(r1);
        r1 = null;
    L29:
        r5.b(r6);
    L30:
        r6 = r6.s;
        goto L19
    L31:
        if (r7 == 1) goto L8;
    L33:
        r1 = j51.c(r5);
        goto L8
    L11:
        ((g94) r1).c0(r0);
        if (r0.n == false) goto L33;
        r2 = r1;
    L35:
        if ((r14.q & 8) == 0) goto L37;
        r14 = r14.s;
    L37:
        eo0 r3 = (g94) r2;
        if (r3 == null) goto L44;
        if (((cx2) r3).n.A != true) goto L44;
        f63 r15 = j51.N(r3);
        wv3 r16 = wr1.n(r15).C(r15, false);
        Rect r9 = M(r16.a, r16.b, r16.c, r16.d);
        float r17 = r9.left - r11.left;
        float r18 = r9.top - r11.top;
        return new wv3(r17, r18, r9.width() + r17, r9.height() + r18);
    L44:
        return wr1.d((f63) r13.Q.e, false);
    }

    public final boolean v() {
        AccessibilityManager r0 = this.t;
        if (r0.isEnabled() == false) goto L11;
        List<AccessibilityServiceInfo> r1 = this.v;
        if (r1 != null) goto L8;
        r1 = r0.getEnabledAccessibilityServiceList(-1);
        this.v = r1;
    L8:
        if (r1.isEmpty() == true) goto L13;
        return true;
    L13:
        return false;
    L11:
        return false;
    }

    public final void w(c72 r2) {
        if (this.I.add(r2) == false) goto L6;
        this.J.d(j15.a);
        return;
    }
}
