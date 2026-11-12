package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tb1 {
    public static final String A0 = null;
    public static final tb1 Q = null;
    public static final String R = null;
    public static final String S = null;
    public static final String T = null;
    public static final String U = null;
    public static final String V = null;
    public static final String W = null;
    public static final String X = null;
    public static final String Y = null;
    public static final String Z = null;
    public static final String a0 = null;
    public static final String b0 = null;
    public static final String c0 = null;
    public static final String d0 = null;
    public static final String e0 = null;
    public static final String f0 = null;
    public static final String g0 = null;
    public static final String h0 = null;
    public static final String i0 = null;
    public static final String j0 = null;
    public static final String k0 = null;
    public static final String l0 = null;
    public static final String m0 = null;
    public static final String n0 = null;
    public static final String o0 = null;
    public static final String p0 = null;
    public static final String q0 = null;
    public static final String r0 = null;
    public static final String s0 = null;
    public static final String t0 = null;
    public static final String u0 = null;
    public static final String v0 = null;
    public static final String w0 = null;
    public static final String x0 = null;
    public static final String y0 = null;
    public static final String z0 = null;
    public final float A;
    public final byte[] B;
    public final int C;
    public final c50 D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;
    public final String a;
    public final String b;
    public final yw1 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final qv2 l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final ow0 r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final float y;
    public final int z;

    static {
        Q = new tb1(new sb1());
        R = Integer.toString(0, 36);
        S = Integer.toString(1, 36);
        T = Integer.toString(2, 36);
        U = Integer.toString(3, 36);
        V = Integer.toString(4, 36);
        W = Integer.toString(5, 36);
        X = Integer.toString(6, 36);
        Y = Integer.toString(7, 36);
        Integer.toString(8, 36);
        Z = Integer.toString(9, 36);
        a0 = Integer.toString(10, 36);
        b0 = Integer.toString(11, 36);
        c0 = Integer.toString(12, 36);
        d0 = Integer.toString(13, 36);
        e0 = Integer.toString(14, 36);
        f0 = Integer.toString(15, 36);
        g0 = Integer.toString(16, 36);
        h0 = Integer.toString(17, 36);
        i0 = Integer.toString(18, 36);
        j0 = Integer.toString(19, 36);
        k0 = Integer.toString(20, 36);
        l0 = Integer.toString(21, 36);
        m0 = Integer.toString(22, 36);
        n0 = Integer.toString(23, 36);
        o0 = Integer.toString(24, 36);
        p0 = Integer.toString(25, 36);
        q0 = Integer.toString(26, 36);
        r0 = Integer.toString(27, 36);
        s0 = Integer.toString(28, 36);
        t0 = Integer.toString(29, 36);
        u0 = Integer.toString(30, 36);
        v0 = Integer.toString(31, 36);
        w0 = Integer.toString(32, 36);
        x0 = Integer.toString(33, 36);
        y0 = Integer.toString(34, 36);
        z0 = Integer.toString(35, 36);
        A0 = Integer.toString(36, 36);
    }

    public tb1(sb1 r9) {
        this.a = r9.a;
        String r1 = f35.R(r9.d);
        this.d = r1;
        int r3 = 0;
        if (r9.c.isEmpty() == false) goto L8;
        if (r9.b == null) goto L8;
        this.c = yw1.o(new o42(r1, r9.b));
        this.b = r9.b;
    L32:
        this.e = r9.e;
        if (r9.g != 0) goto L35;
    L38:
        boolean r2 = true;
    L39:
        rr2.v("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", r2);
        this.f = r9.f;
        this.g = r9.g;
        int r4 = r9.h;
        this.h = r4;
        int r5 = r9.i;
        this.i = r5;
        if (r5 == (-1)) goto L42;
        r4 = r5;
    L42:
        this.j = r4;
        this.k = r9.j;
        this.l = r9.k;
        this.m = r9.l;
        this.n = r9.m;
        this.o = r9.n;
        this.p = r9.o;
        List r6 = r9.p;
        if (r6 != null) goto L45;
        r6 = Collections.EMPTY_LIST;
    L45:
        this.q = r6;
        ow0 r7 = r9.q;
        this.r = r7;
        this.s = r9.r;
        this.t = r9.s;
        this.u = r9.t;
        this.v = r9.u;
        this.w = r9.v;
        this.x = r9.w;
        this.y = r9.x;
        int r8 = r9.y;
        if (r8 != (-1)) goto L48;
        r8 = 0;
    L48:
        this.z = r8;
        float r10 = r9.z;
        if (r10 != (-1.0f)) goto L51;
        r10 = 1.0f;
    L51:
        this.A = r10;
        this.B = r9.A;
        this.C = r9.B;
        this.D = r9.C;
        this.E = r9.D;
        this.F = r9.E;
        this.G = r9.F;
        this.H = r9.G;
        int r11 = r9.H;
        if (r11 != (-1)) goto L54;
        r11 = 0;
    L54:
        this.I = r11;
        int r12 = r9.I;
        if (r12 == (-1)) goto L58;
        r3 = r12;
    L58:
        this.J = r3;
        this.K = r9.J;
        this.L = r9.K;
        this.M = r9.L;
        this.N = r9.M;
        int r13 = r9.N;
        if (r13 != 0) goto L63;
        if (r7 == null) goto L63;
        this.O = 1;
        return;
    L63:
        this.O = r13;
        return;
    L35:
        if ((r9.f & 32768) != 0) goto L38;
        r2 = false;
    L8:
        if (r9.c.isEmpty() == true) goto L19;
        if (r9.b != null) goto L19;
        yw1 r14 = r9.c;
        this.c = r14;
        int r15 = r14.size();
        int r16 = 0;
    L12:
        if (r16 >= r15) goto L16;
        Object r17 = r14.get(r16);
        r16 = r16 + 1;
        o42 r18 = (o42) r17;
        if (TextUtils.equals(r18.a, r1) == false) goto L12;
        String r19 = r18.b;
    L17:
        this.b = r19;
        goto L32
    L16:
        r19 = ((o42) r14.get(0)).b;
    L19:
        if (r9.c.isEmpty() == true) goto L21;
    L23:
        int r20 = 0;
    L25:
        if (r20 >= r9.c.size()) goto L30;
        if (((o42) r9.c.get(r20)).b.equals(r9.b) == true) goto L22;
        r20 = r20 + 1;
    L22:
        boolean r21 = true;
    L31:
        rr2.w(r21);
        this.c = r9.c;
        this.b = r9.b;
        goto L32
    L30:
        r21 = false;
        goto L31
    L21:
        if (r9.b != null) goto L23;
        goto L22
    }

    public static String c(tb1 r23) {
        if (r23 != null) goto L6;
        return "null";
    L6:
        int r1 = r23.e;
        yw1 r2 = r23.c;
        String r3 = r23.d;
        int r4 = r23.G;
        int r5 = r23.F;
        int r6 = r23.E;
        float r7 = r23.y;
        c50 r8 = r23.D;
        float r9 = r23.A;
        int r10 = r23.x;
        int r11 = r23.w;
        int r12 = r23.v;
        int r13 = r23.u;
        ow0 r14 = r23.r;
        String r15 = r23.k;
        int r16 = r23.j;
        String r17 = r23.m;
        int r18 = r23.f;
        uc0 r19 = new uc0(String.valueOf(','));
        StringBuilder r20 = xa3.i("id=");
        r20.append(r23.a);
        r20.append(", mimeType=");
        r20.append(r23.n);
        if (r17 == null) goto L10;
        r20.append(", container=");
        r20.append(r17);
    L10:
        if (r16 == (-1)) goto L12;
        r20.append(", bitrate=");
        r20.append(r16);
    L12:
        if (r15 == null) goto L14;
        r20.append(", codecs=");
        r20.append(r15);
    L14:
        if (r14 == null) goto L38;
        LinkedHashSet r21 = new LinkedHashSet();
        int r22 = 0;
    L17:
        if (r22 >= r14.q) goto L36;
        UUID r110 = r14.n[r22].o;
        if (r110.equals(ax.b) == false) goto L23;
        r21.add("cenc");
    L35:
        r22 = r22 + 1;
        goto L17
    L23:
        if (r110.equals(ax.c) == false) goto L26;
        r21.add("clearkey");
        goto L35
    L26:
        if (r110.equals(ax.e) == false) goto L29;
        r21.add("playready");
        goto L35
    L29:
        if (r110.equals(ax.d) == false) goto L32;
        r21.add("widevine");
        goto L35
    L32:
        if (r110.equals(ax.a) == false) goto L34;
        r21.add("universal");
        goto L35
    L34:
        r21.add("unknown (" + r110 + ")");
        goto L35
    L36:
        r20.append(", drm=[");
        r19.a(r20, r21.iterator());
        r20.append(']');
    L38:
        if (r13 == (-1)) goto L41;
        if (r12 == (-1)) goto L41;
        r20.append(", res=");
        r20.append(r13);
        r20.append("x");
        r20.append(r12);
    L41:
        if (r11 == (-1)) goto L44;
        if (r10 == (-1)) goto L44;
        r20.append(", decRes=");
        r20.append(r11);
        r20.append("x");
        r20.append(r10);
    L44:
        double r24 = r9;
        int r25 = ms0.a;
        if (Math.copySign(r24 - 1.0d, 1.0d) > 0.001d) goto L47;
    L54:
        if (r8 == null) goto L72;
        int r26 = r8.f;
        int r27 = r8.e;
        if (r27 == (-1)) goto L60;
        if (r26 == (-1)) goto L60;
    L61:
        r20.append(", color=");
        if (r8.d() == false) goto L65;
        String r28 = c50.b(r8.a);
        String r111 = c50.a(r8.b);
        String r29 = c50.c(r8.c);
        String r112 = f35.a;
        Locale r113 = Locale.US;
        String r30 = r28 + "/" + r111 + "/" + r29;
    L66:
        if (r27 == (-1)) goto L69;
        if (r26 == (-1)) goto L69;
        String r31 = r27 + "/" + r26;
    L70:
        r20.append(r30 + "/" + r31);
    L69:
        r31 = "NA/NA";
        goto L70
    L65:
        r30 = "NA/NA/NA";
    L60:
        if (r8.d() == true) goto L61;
    L72:
        if (r7 == (-1.0f)) goto L75;
        r20.append(", fps=");
        r20.append(r7);
    L75:
        if (r6 == (-1)) goto L78;
        r20.append(", maxSubLayers=");
        r20.append(r6);
    L78:
        if (r5 == (-1)) goto L81;
        r20.append(", channels=");
        r20.append(r5);
    L81:
        if (r4 == (-1)) goto L83;
        r20.append(", sample_rate=");
        r20.append(r4);
    L83:
        if (r3 == null) goto L86;
        r20.append(", language=");
        r20.append(r3);
    L86:
        if (r2.isEmpty() == true) goto L89;
        r20.append(", labels=[");
        r19.a(r20, hw.P(new mj0(20), r2).iterator());
        r20.append("]");
    L89:
        if (r1 == 0) goto L101;
        r20.append(", selectionFlags=[");
        String r32 = f35.a;
        ArrayList r33 = new ArrayList();
        if ((r1 & 4) == 0) goto L94;
        r33.add("auto");
    L94:
        if ((r1 & 1) == 0) goto L97;
        r33.add("default");
    L97:
        if ((r1 & 2) == 0) goto L99;
        r33.add("forced");
    L99:
        r19.a(r20, r33.iterator());
        r20.append("]");
    L101:
        if (r18 == 0) goto L151;
        r20.append(", roleFlags=[");
        String r34 = f35.a;
        ArrayList r35 = new ArrayList();
        if ((r18 & 1) == 0) goto L106;
        r35.add("main");
    L106:
        if ((r18 & 2) == 0) goto L109;
        r35.add("alt");
    L109:
        if ((r18 & 4) == 0) goto L112;
        r35.add("supplementary");
    L112:
        if ((r18 & 8) == 0) goto L115;
        r35.add("commentary");
    L115:
        if ((r18 & 16) == 0) goto L118;
        r35.add("dub");
    L118:
        if ((r18 & 32) == 0) goto L121;
        r35.add("emergency");
    L121:
        if ((r18 & 64) == 0) goto L123;
        r35.add("caption");
    L123:
        int r36 = r18;
        if ((r36 & 128) == 0) goto L127;
        r35.add("subtitle");
    L127:
        if ((r36 & 256) == 0) goto L130;
        r35.add("sign");
    L130:
        if ((r36 & 512) == 0) goto L133;
        r35.add("describes-video");
    L133:
        if ((r36 & 1024) == 0) goto L136;
        r35.add("describes-music");
    L136:
        if ((r36 & 2048) == 0) goto L139;
        r35.add("enhanced-intelligibility");
    L139:
        if ((r36 & 4096) == 0) goto L142;
        r35.add("transcribes-dialog");
    L142:
        if ((r36 & 8192) == 0) goto L145;
        r35.add("easy-read");
    L145:
        if ((r36 & 16384) == 0) goto L148;
        r35.add("trick-play");
    L148:
        if ((r36 & 32768) == 0) goto L150;
        r35.add("auxiliary");
    L150:
        r19.a(r20, r35.iterator());
        r20.append("]");
    L153:
        if ((r36 & 32768) == 0) goto L172;
        r20.append(", auxiliaryTrackType=");
        int r37 = r23.g;
        String r38 = f35.a;
        if (r37 != 0) goto L157;
        String r39 = "undefined";
    L170:
        r20.append(r39);
        goto L172
    L157:
        if (r37 == 1) goto L168;
        if (r37 != 2) goto L160;
        r39 = "depth-linear";
        goto L170
    L160:
        if (r37 != 3) goto L162;
        r39 = "depth-inverse";
        goto L170
    L162:
        if (r37 != 4) goto L164;
        r39 = "depth metadata";
        goto L170
    L164:
        kf2.o("Unsupported auxiliary track type");
        return null;
    L168:
        r39 = "original";
    L172:
        return r20.toString();
    L151:
        r36 = r18;
        goto L153
    L47:
        if (r24 == 1.0d) goto L54;
        if (Double.isNaN(r24) == true) goto L51;
    L53:
        r20.append(", par=");
        Object[] r40 = {Float.valueOf(r9)};
        String r41 = f35.a;
        r20.append(String.format(Locale.US, "%.3f", r40));
        goto L54
    L51:
        if (Double.isNaN(1.0d) == false) goto L53;
        goto L53
    }

    public final sb1 a() {
        sb1 r1 = new sb1();
        r1.a = this.a;
        r1.b = this.b;
        r1.c = this.c;
        r1.d = this.d;
        r1.e = this.e;
        r1.f = this.f;
        r1.h = this.h;
        r1.i = this.i;
        r1.j = this.k;
        r1.k = this.l;
        r1.l = this.m;
        r1.m = this.n;
        r1.n = this.o;
        r1.o = this.p;
        r1.p = this.q;
        r1.q = this.r;
        r1.r = this.s;
        r1.s = this.t;
        r1.t = this.u;
        r1.u = this.v;
        r1.v = this.w;
        r1.w = this.x;
        r1.x = this.y;
        r1.y = this.z;
        r1.z = this.A;
        r1.A = this.B;
        r1.B = this.C;
        r1.C = this.D;
        r1.D = this.E;
        r1.E = this.F;
        r1.F = this.G;
        r1.G = this.H;
        r1.H = this.I;
        r1.I = this.J;
        r1.J = this.K;
        r1.K = this.L;
        r1.L = this.M;
        r1.M = this.N;
        r1.N = this.O;
        return r1;
    }

    public final boolean b(tb1 r5) {
        List r4 = this.q;
        if (r4.size() == r5.q.size()) goto L5;
        return false;
    L5:
        int r1 = 0;
    L7:
        if (r1 >= r4.size()) goto L12;
        if (Arrays.equals((byte[]) r4.get(r1), (byte[]) r5.q.get(r1)) == false) goto L10;
        r1 = r1 + 1;
        goto L7
    L10:
        return false;
    L12:
        return true;
    }

    public final tb1 d(tb1 r26) {
        if (this != r26) goto L5;
        return this;
    L5:
        int r2 = lw2.h(this.n);
        String r3 = r26.a;
        yw1 r4 = r26.c;
        int r5 = r26.M;
        int r6 = r26.N;
        String r7 = r26.b;
        if (r7 != null) goto L10;
        r7 = this.b;
    L10:
        if (r4.isEmpty() == false) goto L14;
        r4 = this.c;
    L14:
        if (r2 == 3) goto L16;
        if (r2 == 1) goto L16;
    L19:
        String r8 = this.d;
    L20:
        int r11 = this.h;
        if (r11 != (-1)) goto L23;
        r11 = r26.h;
    L23:
        int r12 = this.i;
        if (r12 != (-1)) goto L26;
        r12 = r26.i;
    L26:
        String r10 = this.k;
        if (r10 != null) goto L31;
        String r13 = f35.v(r2, r26.k);
        if (f35.e0(r13).length != 1) goto L31;
        r10 = r13;
    L31:
        qv2 r9 = r26.l;
        qv2 r14 = this.l;
        if (r14 == null) goto L35;
        r9 = r14.b(r9);
    L35:
        float r15 = this.y;
        if (r15 == (-1.0f)) goto L38;
    L40:
        int r16 = this.e | r26.e;
        int r17 = this.f | r26.f;
        ow0 r1 = r26.r;
        ArrayList r18 = new ArrayList();
        yw1 r19 = r4;
        if (r1 == null) goto L49;
        String r20 = r1.p;
        nw0[] r21 = r1.n;
        int r22 = r21.length;
        int r23 = 0;
    L43:
        if (r23 >= r22) goto L48;
        int r24 = r23;
        nw0 r25 = r21[r24];
        int r27 = r22;
        if (r25.r == null) goto L47;
        r18.add(r25);
    L47:
        r23 = r24 + 1;
        r22 = r27;
        goto L43
    L48:
        String r28 = r20;
    L50:
        ow0 r29 = this.r;
        if (r29 == null) goto L68;
        if (r28 != null) goto L54;
        r28 = r29.p;
    L54:
        int r30 = r18.size();
        nw0[] r31 = r29.n;
        String r110 = r28;
        int r32 = r31.length;
        int r33 = 0;
    L55:
        if (r33 >= r32) goto L67;
        int r210 = r33;
        nw0 r34 = r31[r210];
        int r211 = r32;
        if (r34.r == null) goto L65;
        UUID r35 = r34.o;
        int r212 = r6;
        int r36 = 0;
    L59:
        if (r36 >= r30) goto L64;
        int r213 = r30;
        if (((nw0) r18.get(r36)).o.equals(r35) == true) goto L66;
        r36 = r36 + 1;
        r30 = r213;
    L66:
        r33 = r210 + 1;
        r32 = r211;
        r6 = r212;
        r30 = r213;
        goto L55
    L64:
        r213 = r30;
        r18.add(r34);
        goto L66
    L65:
        r213 = r30;
        r212 = r6;
        goto L66
    L67:
        r28 = r110;
    L68:
        int r214 = r6;
        if (r18.isEmpty() == false) goto L71;
        ow0 r37 = null;
    L72:
        sb1 r38 = a();
        r38.a = r3;
        r38.b = r7;
        r38.c = yw1.k(r19);
        r38.d = r8;
        r38.e = r16;
        r38.f = r17;
        r38.h = r11;
        r38.i = r12;
        r38.j = r10;
        r38.k = r9;
        r38.q = r37;
        r38.x = r15;
        r38.L = r5;
        r38.M = r214;
        return new tb1(r38);
    L71:
        r37 = new ow0(r28, false, (nw0[]) r18.toArray(new nw0[0]));
        goto L72
    L49:
        r28 = null;
        goto L50
    L38:
        if (r2 != 2) goto L40;
        r15 = r26.y;
    L16:
        r8 = r26.d;
        if (r8 == null) goto L19;
        goto L19
    }

    public final boolean equals(Object r6) {
        if (this != r6) goto L5;
        return true;
    L5:
        if (r6 != null) goto L7;
        return false;
    L7:
        if (tb1.class != r6.getClass()) goto L129;
        tb1 r7 = (tb1) r6;
        int r1 = this.P;
        if (r1 == 0) goto L16;
        int r2 = r7.P;
        if (r2 == 0) goto L16;
        if (r1 == r2) goto L16;
        return false;
    L16:
        if (this.e == r7.e) goto L18;
        return false;
    L18:
        if (this.f == r7.f) goto L20;
        return false;
    L20:
        if (this.g == r7.g) goto L22;
        return false;
    L22:
        if (this.h == r7.h) goto L24;
        return false;
    L24:
        if (this.i == r7.i) goto L26;
        return false;
    L26:
        if (this.o == r7.o) goto L28;
        return false;
    L28:
        if (this.s == r7.s) goto L30;
        return false;
    L30:
        if (this.u == r7.u) goto L32;
        return false;
    L32:
        if (this.v == r7.v) goto L34;
        return false;
    L34:
        if (this.w == r7.w) goto L36;
        return false;
    L36:
        if (this.x == r7.x) goto L38;
        return false;
    L38:
        if (this.z == r7.z) goto L40;
        return false;
    L40:
        if (this.C == r7.C) goto L42;
        return false;
    L42:
        if (this.E == r7.E) goto L44;
        return false;
    L44:
        if (this.F == r7.F) goto L46;
        return false;
    L46:
        if (this.G == r7.G) goto L48;
        return false;
    L48:
        if (this.H == r7.H) goto L50;
        return false;
    L50:
        if (this.I == r7.I) goto L52;
        return false;
    L52:
        if (this.J == r7.J) goto L54;
        return false;
    L54:
        if (this.K == r7.K) goto L56;
        return false;
    L56:
        if (this.M == r7.M) goto L58;
        return false;
    L58:
        if (this.N == r7.N) goto L60;
        return false;
    L60:
        if (this.O == r7.O) goto L62;
        return false;
    L62:
        if (Float.compare(this.y, r7.y) == 0) goto L64;
        return false;
    L64:
        if (Float.compare(this.A, r7.A) == 0) goto L66;
        return false;
    L66:
        if (Objects.equals(this.a, r7.a) == true) goto L68;
        return false;
    L68:
        if (Objects.equals(this.b, r7.b) == true) goto L70;
        return false;
    L70:
        if (this.c.equals(r7.c) == true) goto L72;
        return false;
    L72:
        if (Objects.equals(this.k, r7.k) == true) goto L74;
        return false;
    L74:
        if (Objects.equals(this.m, r7.m) == true) goto L76;
        return false;
    L76:
        if (Objects.equals(this.n, r7.n) == true) goto L78;
        return false;
    L78:
        if (Objects.equals(this.d, r7.d) == true) goto L80;
        return false;
    L80:
        if (Arrays.equals(this.B, r7.B) == true) goto L82;
        return false;
    L82:
        if (Objects.equals(this.l, r7.l) == true) goto L84;
        return false;
    L84:
        if (Objects.equals(this.D, r7.D) == true) goto L86;
        return false;
    L86:
        if (Objects.equals(this.r, r7.r) == true) goto L88;
        return false;
    L88:
        if (b(r7) == false) goto L128;
        return true;
    L128:
        return false;
    L129:
        return false;
    }

    public final int hashCode() {
        if (this.P != 0) goto L34;
        int r1 = 0;
        String r2 = this.a;
        if (r2 != null) goto L7;
        int r3 = 0;
    L8:
        int r4 = (527 + r3) * 31;
        String r5 = this.b;
        if (r5 != null) goto L11;
        int r6 = 0;
    L12:
        int r7 = (this.c.hashCode() + ((r4 + r6) * 31)) * 31;
        String r8 = this.d;
        if (r8 != null) goto L15;
        int r9 = 0;
    L16:
        int r10 = (((((((((((r7 + r9) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String r11 = this.k;
        if (r11 != null) goto L19;
        int r12 = 0;
    L20:
        int r13 = (r10 + r12) * 31;
        qv2 r14 = this.l;
        if (r14 != null) goto L23;
        int r15 = 0;
    L24:
        int r16 = (r13 + r15) * 961;
        String r17 = this.m;
        if (r17 != null) goto L27;
        int r18 = 0;
    L28:
        int r19 = (r16 + r18) * 31;
        String r20 = this.n;
        if (r20 == null) goto L32;
        r1 = r20.hashCode();
    L32:
        this.P = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.y) + ((((((((((((((r19 + r1) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31)) * 31) + this.z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        goto L34
    L27:
        r18 = r17.hashCode();
        goto L28
    L23:
        r15 = r14.hashCode();
        goto L24
    L19:
        r12 = r11.hashCode();
        goto L20
    L15:
        r9 = r8.hashCode();
        goto L16
    L11:
        r6 = r5.hashCode();
        goto L12
    L7:
        r3 = r2.hashCode();
    L34:
        return this.P;
    }

    public final String toString() {
        StringBuilder r1 = new StringBuilder("Format(");
        r1.append(this.a);
        r1.append(", ");
        r1.append(this.b);
        r1.append(", ");
        r1.append(this.m);
        r1.append(", ");
        r1.append(this.n);
        r1.append(", ");
        r1.append(this.k);
        r1.append(", ");
        r1.append(this.j);
        r1.append(", ");
        r1.append(this.d);
        r1.append(", [");
        r1.append(this.u);
        r1.append(", ");
        r1.append(this.v);
        r1.append(", ");
        r1.append(this.y);
        r1.append(", ");
        r1.append(this.D);
        r1.append("], [");
        r1.append(this.F);
        r1.append(", ");
        return f34.i(r1, this.G, "])");
    }
}
