package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ni2 implements k51 {
    public static final byte[] k0 = null;
    public static final byte[] l0 = null;
    public static final byte[] m0 = null;
    public static final byte[] n0 = null;
    public static final UUID o0 = null;
    public static final Map p0 = null;
    public int A;
    public long B;
    public final SparseArray C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;
    public final mk0 a;
    public int a0;
    public final k35 b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public boolean e0;
    public final xn4 f;
    public boolean f0;
    public final be3 g;
    public int g0;
    public final be3 h;
    public byte h0;
    public final be3 i;
    public boolean i0;
    public final be3 j;
    public m51 j0;
    public final be3 k;
    public final be3 l;
    public final be3 m;
    public final be3 n;
    public final be3 o;
    public final be3 p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public mi2 y;
    public boolean z;

    static {
        k0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        String r1 = f35.a;
        l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap r0 = new HashMap();
        xa3.n(0, r0, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        xa3.n(180, r0, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        p0 = Collections.unmodifiableMap(r0);
    }

    public ni2(xn4 r7, int r8) {
        mk0 r0 = new mk0();
        this.s = -1;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.K = -1;
        this.L = -1;
        this.M = -9223372036854775807L;
        this.a = r0;
        r0.d = new hg3(28, this);
        this.f = r7;
        this.C = new SparseArray();
        boolean r1 = false;
        if ((r8 & 1) != 0) goto L5;
        boolean r9 = true;
    L6:
        this.d = r9;
        if ((r8 & 2) != 0) goto L9;
        r1 = true;
    L9:
        this.e = r1;
        this.b = new k35();
        this.c = new SparseArray();
        this.i = new be3(4);
        this.j = new be3(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new be3(4);
        this.g = new be3(uc5.c);
        this.h = new be3(4);
        this.l = new be3();
        this.m = new be3();
        this.n = new be3(8);
        this.o = new be3();
        this.p = new be3();
        this.T = new int[1];
        this.x = true;
        return;
    L5:
        r9 = false;
        goto L6
    }

    public static byte[] j(long r7, long r9, String r11) {
        if (r7 == (-9223372036854775807L)) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        int r2 = (int) (r7 / 3600000000L);
        long r8 = r7 - (((long) r2) * 3600000000L);
        int r3 = (int) (r8 / 60000000);
        long r10 = r8 - (((long) r3) * 60000000);
        int r4 = (int) (r10 / 1000000);
        int r12 = (int) ((r10 - (((long) r4) * 1000000)) / r9);
        String r13 = String.format(Locale.US, r11, new Object[]{Integer.valueOf(r2), Integer.valueOf(r3), Integer.valueOf(r4), Integer.valueOf(r12)});
        String r14 = f35.a;
        return r13.getBytes(StandardCharsets.UTF_8);
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [hg3] */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v16, types: [l51] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4, types: [l51] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r35v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v113 */
    /* JADX WARN: Type inference failed for: r4v119 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1, types: [mk0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [k35] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.k51
    public final int b(l51 r44, t71 r45) {
        ni2 r0 = this;
        boolean r3 = false;
        r0.N = false;
        boolean r4 = true;
        boolean r5 = true;
    L3:
        if (r5 == false) goto L883;
        if (r0.N == true) goto L883;
        ?? r7 = r0.a;
        ?? r8 = r7.c;
        ArrayDeque r9 = r7.b;
        r7.d.getClass();
    L7:
        lk0 r6 = (lk0) r9.peek();
        if (r6 != null) goto L10;
    L757:
        boolean r10 = r3 ? 1 : 0;
        ?? r1 = r44;
        if (r7.e != 0) goto L789;
        int r2 = 4;
        long r11 = r8.b(r1, true, r10, 4);
        if (r11 != (-2)) goto L783;
        byte[] r12 = r7.a;
        r1.k();
        ?? r13 = r10;
    L762:
        r1.n(r12, r13, r2);
        byte r14 = r12[r13];
        int r15 = 0;
    L764:
        if (r15 >= 8) goto L770;
        if ((k35.d[r15] & ((long) r14)) != 0) goto L767;
        r15 = r15 + 1;
        goto L764
    L767:
        int r16 = r15 + 1;
    L771:
        if (r16 == (-1)) goto L784;
        if (r16 > 4) goto L784;
        int r17 = (int) k35.a(r16, false, r12);
        Object r18 = r7.d.o;
        if (r17 == 357149030) goto L782;
        if (r17 == 524531317) goto L782;
        if (r17 == 475249515) goto L782;
        if (r17 != 374648427) goto L784;
    L782:
        r1.l(r16);
        r11 = r17;
    L784:
        r1.l(1);
        r2 = 4;
        r13 = 0;
        goto L762
    L770:
        r16 = -1;
    L783:
        boolean r19 = true;
        if (r11 == (-1)) goto L787;
        r7.f = (int) r11;
        r7.e = 1;
    L791:
        if (r7.e != r19) goto L793;
        r7.g = r8.b(r1, false, r19, 8);
        r7.e = 2;
    L793:
        ?? r20 = r7.d;
        int r21 = r7.f;
        Object r22 = r20.o;
        switch(r21) {
            case 131: goto L800;
            case 134: goto L799;
            case 136: goto L800;
            case 155: goto L800;
            case 159: goto L800;
            case 160: goto L798;
            case 161: goto L797;
            case 163: goto L797;
            case 165: goto L797;
            case 166: goto L798;
            case 174: goto L798;
            case 176: goto L800;
            case 179: goto L800;
            case 181: goto L796;
            case 183: goto L798;
            case 186: goto L800;
            case 187: goto L798;
            case 215: goto L800;
            case 224: goto L798;
            case 225: goto L798;
            case 231: goto L800;
            case 238: goto L800;
            case 240: goto L800;
            case 241: goto L800;
            case 247: goto L800;
            case 251: goto L800;
            case 16868: goto L798;
            case 16871: goto L800;
            case 16877: goto L797;
            case 16980: goto L800;
            case 16981: goto L797;
            case 17026: goto L799;
            case 17029: goto L800;
            case 17143: goto L800;
            case 17545: goto L796;
            case 18401: goto L800;
            case 18402: goto L797;
            case 18407: goto L798;
            case 18408: goto L800;
            case 19899: goto L798;
            case 20529: goto L800;
            case 20530: goto L800;
            case 20532: goto L798;
            case 20533: goto L798;
            case 21358: goto L799;
            case 21419: goto L797;
            case 21420: goto L800;
            case 21432: goto L800;
            case 21680: goto L800;
            case 21682: goto L800;
            case 21690: goto L800;
            case 21930: goto L800;
            case 21936: goto L798;
            case 21938: goto L800;
            case 21945: goto L800;
            case 21946: goto L800;
            case 21947: goto L800;
            case 21948: goto L800;
            case 21949: goto L800;
            case 21968: goto L798;
            case 21969: goto L796;
            case 21970: goto L796;
            case 21971: goto L796;
            case 21972: goto L796;
            case 21973: goto L796;
            case 21974: goto L796;
            case 21975: goto L796;
            case 21976: goto L796;
            case 21977: goto L796;
            case 21978: goto L796;
            case 21998: goto L800;
            case 22186: goto L800;
            case 22203: goto L800;
            case 25152: goto L798;
            case 25188: goto L800;
            case 25506: goto L797;
            case 28032: goto L798;
            case 30113: goto L798;
            case 30114: goto L800;
            case 30320: goto L798;
            case 30321: goto L800;
            case 30322: goto L797;
            case 30323: goto L796;
            case 30324: goto L796;
            case 30325: goto L796;
            case 2274716: goto L799;
            case 2352003: goto L800;
            case 2807729: goto L800;
            case 290298740: goto L798;
            case 357149030: goto L798;
            case 374648427: goto L798;
            case 408125543: goto L798;
            case 440786851: goto L798;
            case 475249515: goto L798;
            case 524531317: goto L798;
            default: goto L795;
        };
    L795:
        int r23 = 0;
    L801:
        if (r23 != 0) goto L803;
        r1.l((int) r7.g);
        r7.e = 0;
        r3 = false;
        r4 = true;
        goto L7
    L803:
        if (r23 != 1) goto L805;
        long r110 = r1.getPosition();
        r9.push(new lk0(r7.f, r7.g + r110));
        r7.d.I(r7.f, r110, r7.g);
        int r24 = 0;
        r7.e = 0;
        ?? r25 = r1;
    L756:
        r5 = true;
        ?? r26 = r25;
        ?? r27 = r24;
    L869:
        if (r5 == false) goto L880;
        long r28 = r26.getPosition();
        r0 = this;
        if (r0.J == true) goto L872;
        boolean r35 = true;
        if (r0.z == false) goto L881;
        long r29 = r0.L;
        if (r29 == (-1)) goto L881;
        r45.a = r29;
        r0.L = -1;
        return 1;
    L881:
        r4 = r35;
        r3 = false;
        goto L3
    L872:
        r0.L = r28;
        r45.a = r0.K;
        r0.J = r27;
        return 1;
    L880:
        r35 = true;
        r0 = this;
        goto L881
    L805:
        if (r23 != 2) goto L807;
        long r30 = r7.g;
        if (r30 > 8) goto L867;
        r20.F(r21, r7.a(r1, (int) r30));
        r24 = 0;
        r7.e = 0;
        r25 = r1;
        goto L756
    L867:
        throw ParserException.a(null, "Invalid integer size: " + r7.g);
    L807:
        if (r23 != 3) goto L809;
        long r31 = r7.g;
        if (r31 > 2147483647L) goto L862;
        int r32 = (int) r31;
        if (r32 != 0) goto L854;
        String r33 = "";
        int r111 = 0;
    L860:
        r20.J(r21, r33);
        r7.e = r111;
        r24 = r111;
        r25 = r1;
        goto L756
    L854:
        byte[] r34 = new byte[r32];
        r1.readFully(r34, 0, r32);
    L855:
        if (r32 <= 0) goto L859;
        if (r34[r32 - 1] != 0) goto L859;
        r32 = r32 - 1;
    L859:
        r111 = 0;
        r33 = new String(r34, 0, r32);
        goto L860
    L862:
        throw ParserException.a(null, "String element size: " + r7.g);
    L809:
        if (r23 != 4) goto L811;
        r20.B(r21, (int) r7.g, r1);
        r24 = 0;
        r7.e = 0;
        r25 = r1;
        goto L756
    L811:
        if (r23 != 5) goto L847;
        long r36 = r7.g;
        if (r36 != 4) goto L815;
    L819:
        int r37 = (int) r36;
        long r38 = r7.a(r1, r37);
        if (r37 != 4) goto L822;
        double r39 = Float.intBitsToFloat((int) r38);
    L823:
        ni2 r40 = (ni2) r20.o;
        if (r21 != 181) goto L826;
        r40.h(r21);
        r40.y.S = (int) r39;
    L829:
        r24 = 0;
        r7.e = 0;
        r25 = r1;
        goto L756
    L826:
        if (r21 == 17545) goto L843;
        switch(r21) {
            case 21969: goto L842;
            case 21970: goto L841;
            case 21971: goto L840;
            case 21972: goto L839;
            case 21973: goto L838;
            case 21974: goto L837;
            case 21975: goto L836;
            case 21976: goto L835;
            case 21977: goto L834;
            case 21978: goto L833;
            default: goto L828;
        };
    L828:
        switch(r21) {
            case 30323: goto L832;
            case 30324: goto L831;
            case 30325: goto L830;
            default: goto L829;
        };
    L830:
        r40.h(r21);
        r40.y.w = (float) r39;
        goto L829
    L831:
        r40.h(r21);
        r40.y.v = (float) r39;
        goto L829
    L832:
        r40.h(r21);
        r40.y.u = (float) r39;
        goto L829
    L833:
        r40.h(r21);
        r40.y.O = (float) r39;
        goto L829
    L834:
        r40.h(r21);
        r40.y.N = (float) r39;
        goto L829
    L835:
        r40.h(r21);
        r40.y.M = (float) r39;
        goto L829
    L836:
        r40.h(r21);
        r40.y.L = (float) r39;
        goto L829
    L837:
        r40.h(r21);
        r40.y.K = (float) r39;
        goto L829
    L838:
        r40.h(r21);
        r40.y.J = (float) r39;
        goto L829
    L839:
        r40.h(r21);
        r40.y.I = (float) r39;
        goto L829
    L840:
        r40.h(r21);
        r40.y.H = (float) r39;
        goto L829
    L841:
        r40.h(r21);
        r40.y.G = (float) r39;
        goto L829
    L842:
        r40.h(r21);
        r40.y.F = (float) r39;
        goto L829
    L843:
        r40.u = (long) r39;
        goto L829
    L822:
        r39 = Double.longBitsToDouble(r38);
        goto L823
    L815:
        if (r36 == 8) goto L819;
        throw ParserException.a(null, "Invalid float size: " + r7.g);
    L847:
        throw ParserException.a(null, "Invalid element type " + r23);
    L796:
        r23 = 5;
        goto L801
    L797:
        r23 = 4;
        goto L801
    L798:
        r23 = 1;
        goto L801
    L799:
        r23 = 3;
        goto L801
    L800:
        r23 = 2;
        goto L801
    L787:
        r27 = 0;
        r5 = false;
        r26 = r1;
        goto L869
    L789:
        r19 = true;
        goto L791
    L10:
        if (r44.getPosition() < r6.b) goto L757;
        hg3 r41 = r7.d;
        int r42 = ((lk0) r9.pop()).a;
        ni2 r43 = (ni2) r41.o;
        SparseArray r46 = r43.C;
        SparseArray r47 = r43.c;
        r43.j0.getClass();
        if (r42 == 160) goto L734;
        if (r42 != 174) goto L16;
        mi2 r48 = r43.y;
        r48.getClass();
        String r49 = r48.c;
        if (r49 == null) goto L732;
        switch(r49.hashCode()) {
            case -2095576542: goto L318;
            case -2095575984: goto L314;
            case -1985379776: goto L310;
            case -1784763192: goto L306;
            case -1730367663: goto L302;
            case -1482641358: goto L298;
            case -1482641357: goto L294;
            case -1373388978: goto L290;
            case -933872740: goto L286;
            case -538363189: goto L282;
            case -538363109: goto L278;
            case -425012669: goto L274;
            case -356037306: goto L270;
            case 62923557: goto L266;
            case 62923603: goto L262;
            case 62927045: goto L258;
            case 82318131: goto L254;
            case 82338133: goto L250;
            case 82338134: goto L246;
            case 99146302: goto L242;
            case 444813526: goto L238;
            case 542569478: goto L234;
            case 635596514: goto L230;
            case 725948237: goto L226;
            case 725957860: goto L222;
            case 738597099: goto L218;
            case 738614379: goto L214;
            case 855502857: goto L210;
            case 1045209816: goto L206;
            case 1422270023: goto L202;
            case 1809237540: goto L198;
            case 1950749482: goto L194;
            case 1950789798: goto L190;
            case 1951062397: goto L186;
            default: goto L184;
        };
    L184:
        byte r50 = -1;
    L321:
        switch(r50) {
            case 0: goto L323;
            case 1: goto L323;
            case 2: goto L323;
            case 3: goto L323;
            case 4: goto L323;
            case 5: goto L323;
            case 6: goto L323;
            case 7: goto L323;
            case 8: goto L323;
            case 9: goto L323;
            case 10: goto L323;
            case 11: goto L323;
            case 12: goto L323;
            case 13: goto L323;
            case 14: goto L323;
            case 15: goto L323;
            case 16: goto L323;
            case 17: goto L323;
            case 18: goto L323;
            case 19: goto L323;
            case 20: goto L323;
            case 21: goto L323;
            case 22: goto L323;
            case 23: goto L323;
            case 24: goto L323;
            case 25: goto L323;
            case 26: goto L323;
            case 27: goto L323;
            case 28: goto L323;
            case 29: goto L323;
            case 30: goto L323;
            case 31: goto L323;
            case 32: goto L323;
            case 33: goto L323;
            default: goto L730;
        };
    L323:
        int r51 = r48.d;
        switch(r49.hashCode()) {
            case -2095576542: goto L459;
            case -2095575984: goto L455;
            case -1985379776: goto L451;
            case -1784763192: goto L447;
            case -1730367663: goto L443;
            case -1482641358: goto L439;
            case -1482641357: goto L435;
            case -1373388978: goto L431;
            case -933872740: goto L427;
            case -538363189: goto L423;
            case -538363109: goto L419;
            case -425012669: goto L415;
            case -356037306: goto L411;
            case 62923557: goto L407;
            case 62923603: goto L403;
            case 62927045: goto L399;
            case 82318131: goto L395;
            case 82338133: goto L391;
            case 82338134: goto L387;
            case 99146302: goto L383;
            case 444813526: goto L379;
            case 542569478: goto L375;
            case 635596514: goto L371;
            case 725948237: goto L367;
            case 725957860: goto L363;
            case 738597099: goto L359;
            case 738614379: goto L355;
            case 855502857: goto L351;
            case 1045209816: goto L347;
            case 1422270023: goto L343;
            case 1809237540: goto L339;
            case 1950749482: goto L335;
            case 1950789798: goto L331;
            case 1951062397: goto L327;
            default: goto L325;
        };
    L325:
        byte r112 = -1;
    L462:
        String r113 = "video/x-unknown";
        switch(r112) {
            case 0: goto L615;
            case 1: goto L615;
            case 2: goto L598;
            case 3: goto L597;
            case 4: goto L566;
            case 5: goto L565;
            case 6: goto L563;
            case 7: goto L524;
            case 8: goto L523;
            case 9: goto L615;
            case 10: goto L522;
            case 11: goto L521;
            case 12: goto L520;
            case 13: goto L519;
            case 14: goto L518;
            case 15: goto L517;
            case 16: goto L512;
            case 17: goto L511;
            case 18: goto L506;
            case 19: goto L505;
            case 20: goto L473;
            case 21: goto L517;
            case 22: goto L502;
            case 23: goto L488;
            case 24: goto L483;
            case 25: goto L482;
            case 26: goto L482;
            case 27: goto L479;
            case 28: goto L478;
            case 29: goto L477;
            case 30: goto L476;
            case 31: goto L472;
            case 32: goto L469;
            case 33: goto L466;
            default: goto L465;
        };
    L466:
        ArrayList r52 = new ArrayList(3);
        r52.add(r48.a(r48.c));
        ByteBuffer r53 = ByteBuffer.allocate(8);
        ByteOrder r114 = ByteOrder.LITTLE_ENDIAN;
        r52.add(r53.order(r114).putLong(r48.T).array());
        r52.add(ByteBuffer.allocate(8).order(r114).putLong(r48.U).array());
        r113 = "audio/opus";
        int r54 = 5760;
        ArrayList r55 = r52;
    L467:
        int r56 = -1;
        List r57 = r55;
    L468:
        String r58 = null;
        List r59 = r57;
    L621:
        if (r48.P == null) goto L625;
        zh0 r60 = zh0.E(new be3(r48.P));
        if (r60 == null) goto L625;
        r58 = (String) r60.o;
        r113 = "video/dolby-vision";
    L625:
        boolean r61 = r48.Y;
        if (r48.X == false) goto L628;
        int r210 = 2;
    L629:
        int r62 = (r61 ? 1 : 0) | r210;
        sb1 r115 = new sb1();
        boolean r116 = lw2.i(r113);
        Map r63 = p0;
        if (r116 == false) goto L633;
        r115.E = r48.Q;
        r115.F = r48.S;
        r115.G = r56;
    L720:
        String r64 = r48.b;
        if (r64 != null) goto L723;
    L725:
        r115.a = Integer.toString(r51);
        if (r48.a == false) goto L728;
        String r65 = "video/webm";
    L729:
        r115.l = lw2.m(r65);
        r115.m = lw2.m(r113);
        r115.n = r54;
        r115.d = r48.Z;
        r115.e = r62;
        r115.p = r59;
        r115.j = r58;
        r115.q = r48.m;
        r48.b0 = r115.a();
        r48.a0 = r43.j0.t(r48.d, r48.e);
        r47.put(r48.d, r48);
        goto L730
    L728:
        r65 = "video/x-matroska";
        goto L729
    L723:
        if (r63.containsKey(r64) == true) goto L725;
        r115.b = r48.b;
        goto L725
    L633:
        if (lw2.l(r113) == false) goto L706;
        if (r48.s != 0) goto L643;
        int r66 = r48.q;
        int r117 = -1;
        if (r66 != (-1)) goto L639;
        r66 = r48.n;
    L639:
        r48.q = r66;
        int r67 = r48.r;
        if (r67 != (-1)) goto L642;
        r67 = r48.o;
    L642:
        r48.r = r67;
    L644:
        int r68 = r48.q;
        if (r68 == r117) goto L649;
        int r69 = r48.r;
        if (r69 == r117) goto L649;
        float r70 = (r48.o * r68) / (r48.n * r69);
    L651:
        if (r48.z == true) goto L653;
        c50 r71 = null;
    L677:
        String r72 = r48.b;
        if (r72 != null) goto L680;
    L682:
        int r73 = -1;
    L684:
        if (r48.t == 0) goto L686;
    L704:
        r115.t = r48.n;
        r115.u = r48.o;
        r115.z = r70;
        r115.y = r73;
        r115.A = r48.x;
        r115.B = r48.y;
        r115.C = r71;
        goto L720
    L686:
        if (Float.compare(r48.u, 0.0f) != 0) goto L704;
        if (Float.compare(r48.v, 0.0f) != 0) goto L704;
        if (Float.compare(r48.w, 0.0f) != 0) goto L693;
        r73 = 0;
        goto L704
    L693:
        if (Float.compare(r48.w, 90.0f) != 0) goto L696;
        r73 = 90;
        goto L704
    L696:
        if (Float.compare(r48.w, -180.0f) != 0) goto L698;
    L703:
        r73 = 180;
        goto L704
    L698:
        if (Float.compare(r48.w, 180.0f) == 0) goto L703;
        if (Float.compare(r48.w, -90.0f) != 0) goto L704;
        r73 = 270;
        goto L704
    L680:
        if (r63.containsKey(r72) == false) goto L682;
        r73 = ((Integer) r63.get(r48.b)).intValue();
        goto L684
    L653:
        if (r48.F != (-1.0f)) goto L655;
    L674:
        byte[] r410 = null;
    L675:
        int r74 = r48.A;
        int r75 = r48.C;
        int r118 = r48.B;
        int r119 = r48.p;
        r71 = new c50(r74, r75, r118, r410, r119, r119);
        goto L677
    L655:
        if (r48.G == (-1.0f)) goto L674;
        if (r48.H == (-1.0f)) goto L674;
        if (r48.I == (-1.0f)) goto L674;
        if (r48.J == (-1.0f)) goto L674;
        if (r48.K == (-1.0f)) goto L674;
        if (r48.L == (-1.0f)) goto L674;
        if (r48.M == (-1.0f)) goto L674;
        if (r48.N == (-1.0f)) goto L674;
        if (r48.O == (-1.0f)) goto L674;
        byte[] r76 = new byte[25];
        ByteBuffer r77 = ByteBuffer.wrap(r76).order(ByteOrder.LITTLE_ENDIAN);
        r77.put((byte) 0);
        r77.putShort((short) ((r48.F * 50000.0f) + 0.5f));
        r77.putShort((short) ((r48.G * 50000.0f) + 0.5f));
        r77.putShort((short) ((r48.H * 50000.0f) + 0.5f));
        r77.putShort((short) ((r48.I * 50000.0f) + 0.5f));
        r77.putShort((short) ((r48.J * 50000.0f) + 0.5f));
        r77.putShort((short) ((r48.K * 50000.0f) + 0.5f));
        r77.putShort((short) ((r48.L * 50000.0f) + 0.5f));
        r77.putShort((short) ((r48.M * 50000.0f) + 0.5f));
        r77.putShort((short) (r48.N + 0.5f));
        r77.putShort((short) (r48.O + 0.5f));
        r77.putShort((short) r48.D);
        r77.putShort((short) r48.E);
        r410 = r76;
    L649:
        r70 = -1.0f;
        goto L651
    L643:
        r117 = -1;
        goto L644
    L706:
        if ("application/x-subrip".equals(r113) == true) goto L720;
        if ("text/x-ssa".equals(r113) == true) goto L720;
        if ("text/vtt".equals(r113) == true) goto L720;
        if ("application/vobsub".equals(r113) == true) goto L720;
        if ("application/pgs".equals(r113) == true) goto L720;
        if ("application/dvbsubs".equals(r113) == true) goto L720;
        throw ParserException.a(null, "Unexpected MIME type.");
    L628:
        r210 = 0;
        goto L629
    L469:
        List r78 = Collections.singletonList(r48.a(r49));
        r113 = "audio/flac";
    L470:
        List r79 = r78;
    L471:
        r56 = -1;
        r54 = -1;
        r57 = r79;
        goto L468
    L472:
        r113 = "audio/eac3";
    L473:
        r56 = -1;
    L474:
        r54 = -1;
    L475:
        r58 = null;
        r59 = null;
        goto L621
    L476:
        r113 = "video/mpeg2";
        goto L473
    L477:
        r113 = "application/x-subrip";
        goto L473
    L478:
        r113 = "text/vtt";
        goto L473
    L479:
        zl1 r80 = zl1.a(new be3(r48.a(r48.c)), false, null);
        List r81 = r80.a;
        r48.c0 = r80.b;
        String r82 = r80.n;
        r113 = "video/hevc";
        List r83 = r81;
    L480:
        r58 = r82;
        List r84 = r83;
    L481:
        r56 = -1;
        r54 = -1;
        r59 = r84;
        goto L621
    L482:
        r79 = yw1.p(l0, r48.a(r49));
        r113 = "text/x-ssa";
        goto L471
    L483:
        int r85 = r48.R;
        String r86 = f35.a;
        r56 = f35.C(r85, ByteOrder.LITTLE_ENDIAN);
        if (r56 != 0) goto L487;
        l93.q0("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + r48.R + ". Setting mimeType to audio/x-unknown");
    L486:
        r113 = "audio/x-unknown";
    L487:
        r113 = "audio/raw";
        goto L474
    L488:
        int r87 = r48.R;
        if (r87 != 8) goto L492;
        r113 = "audio/raw";
        r56 = 3;
        goto L474
    L492:
        if (r87 != 16) goto L495;
        r56 = 268435456;
        goto L487
    L495:
        if (r87 != 24) goto L498;
        r56 = 1342177280;
        goto L487
    L498:
        if (r87 != 32) goto L500;
        r56 = 1610612736;
        goto L487
    L500:
        l93.q0("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + r48.R + ". Setting mimeType to audio/x-unknown");
        goto L486
    L505:
        r113 = "application/pgs";
        goto L473
    L506:
        byte[] r88 = r48.l;
        if (r88 != null) goto L509;
        r78 = null;
    L510:
        r113 = "video/x-vnd.on2.vp9";
        goto L470
    L509:
        r78 = yw1.o(r88);
        goto L510
    L511:
        r113 = "video/x-vnd.on2.vp8";
        goto L473
    L512:
        byte[] r89 = r48.l;
        if (r89 != null) goto L515;
        r78 = null;
    L516:
        r113 = "video/av01";
        goto L470
    L515:
        r78 = yw1.o(r89);
        goto L516
    L517:
        r48.W = true;
        r113 = "audio/vnd.dts";
        goto L473
    L518:
        r113 = "audio/ac3";
        goto L473
    L519:
        List r90 = Collections.singletonList(r48.a(r49));
        byte[] r91 = r48.l;
        g r92 = xl.D(new h00(r91.length, r91), false);
        r48.S = r92.b;
        r48.Q = r92.c;
        r113 = "audio/mp4a-latm";
        r84 = r90;
        r58 = r92.a;
        goto L481
    L520:
        r113 = "audio/vnd.dts.hd";
        goto L473
    L521:
        r79 = yw1.o(r48.a(r49));
        r113 = "application/vobsub";
        goto L471
    L522:
        yn r93 = yn.a(new be3(r48.a(r48.c)));
        ArrayList r94 = r93.a;
        r48.c0 = r93.b;
        r82 = r93.l;
        r113 = "video/avc";
        r83 = r94;
        goto L480
    L523:
        byte[] r95 = new byte[4];
        System.arraycopy(r48.a(r49), 0, r95, 0, 4);
        r79 = yw1.o(r95);
        r113 = "application/dvbsubs";
        goto L471
    L524:
        be3 r96 = new be3(r48.a(r48.c));
        r96.O(16);     // Catch: ArrayIndexOutOfBoundsException -> L532
        long r97 = r96.r();     // Catch: ArrayIndexOutOfBoundsException -> L532
        if (r97 != 1482049860) goto L534;
        Pair r98 = new Pair("video/divx", null);     // Catch: ArrayIndexOutOfBoundsException -> L531
    L530:
        String r99 = null;
    L560:
        r113 = (String) r98.first;
        r58 = r99;
        r84 = (List) r98.second;
    L531:
        RuntimeException r100 = null;
    L562:
        throw ParserException.a(r100, "Error parsing FourCC private data");
    L534:
        if (r97 != 859189832) goto L540;
        r98 = new Pair("video/3gpp", null);     // Catch: ArrayIndexOutOfBoundsException -> L531
        goto L530
    L540:
        if (r97 != 826496599) goto L559;
        int r101 = r96.b + 20;     // Catch: ArrayIndexOutOfBoundsException -> L532
        byte[] r102 = r96.a;     // Catch: ArrayIndexOutOfBoundsException -> L532
    L543:
        if (r101 >= (r102.length - 4)) goto L556;
        if (r102[r101] != 0) goto L554;
        if (r102[r101 + 1] != 0) goto L554;
        if (r102[r101 + 2] != 1) goto L554;
        if (r102[r101 + 3] != 15) goto L554;
        r98 = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(r102, r101, r102.length)));     // Catch: ArrayIndexOutOfBoundsException -> L532
    L554:
        r101 = r101 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L532
        goto L543
    L556:
        r100 = null;
        throw ParserException.a(null, "Failed to find FourCC VC1 initialization data");     // Catch: ArrayIndexOutOfBoundsException -> L532
    L559:
        l93.q0("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        r99 = null;
        r98 = new Pair("video/x-unknown", null);
    L532:
        r100 = null;
        goto L562
    L563:
        r113 = "audio/mpeg";
    L564:
        r56 = -1;
        r54 = 4096;
        goto L475
    L565:
        r113 = "audio/mpeg-L2";
        goto L564
    L566:
        byte[] r103 = r48.a(r49);
        ?? r104 = r103[0];     // Catch: ArrayIndexOutOfBoundsException -> L585
        if (r104 != 2) goto L594;
        int r105 = 0;
        int r106 = 1;
    L570:
        int r107 = r103[r106] & 255;     // Catch: ArrayIndexOutOfBoundsException -> L585
        if (r107 != 255) goto L573;
        r105 = r105 + 255;     // Catch: ArrayIndexOutOfBoundsException -> L585
        r106 = r106 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L585
        goto L570
    L573:
        int r108 = r106 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L585
        int r109 = r105 + r107;     // Catch: ArrayIndexOutOfBoundsException -> L585
        int r120 = 0;
    L574:
        int r121 = r103[r108] & 255;     // Catch: ArrayIndexOutOfBoundsException -> L585
        if (r121 != 255) goto L577;
        r120 = r120 + 255;     // Catch: ArrayIndexOutOfBoundsException -> L585
        r108 = r108 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L585
        goto L574
    L577:
        int r122 = r108 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L585
        int r123 = r120 + r121;     // Catch: ArrayIndexOutOfBoundsException -> L585
        if (r103[r122] != 1) goto L592;
        byte[] r124 = new byte[r109];     // Catch: ArrayIndexOutOfBoundsException -> L585
        System.arraycopy(r103, r122, r124, 0, r109);     // Catch: ArrayIndexOutOfBoundsException -> L585
        int r125 = r122 + r109;     // Catch: ArrayIndexOutOfBoundsException -> L585
        if (r103[r125] != 3) goto L590;
        int r126 = r125 + r123;     // Catch: ArrayIndexOutOfBoundsException -> L585
        if (r103[r126] != 5) goto L588;
        byte[] r127 = new byte[r103.length - r126];     // Catch: ArrayIndexOutOfBoundsException -> L585
        System.arraycopy(r103, r126, r127, 0, r103.length - r126);     // Catch: ArrayIndexOutOfBoundsException -> L585
        ArrayList r128 = new ArrayList(2);     // Catch: ArrayIndexOutOfBoundsException -> L585
        r128.add(r124);     // Catch: ArrayIndexOutOfBoundsException -> L585
        r128.add(r127);     // Catch: ArrayIndexOutOfBoundsException -> L585
        r113 = "audio/vorbis";
        r54 = 8192;
        r55 = r128;
        goto L467
    L588:
        throw ParserException.a(null, "Error parsing vorbis codec private");     // Catch: ArrayIndexOutOfBoundsException -> L896
    L590:
        throw ParserException.a(null, "Error parsing vorbis codec private");     // Catch: ArrayIndexOutOfBoundsException -> L896
    L592:
        throw ParserException.a(null, "Error parsing vorbis codec private");     // Catch: ArrayIndexOutOfBoundsException -> L896
    L594:
        throw ParserException.a(null, "Error parsing vorbis codec private");     // Catch: ArrayIndexOutOfBoundsException -> L896
    L596:
        throw ParserException.a(r104, "Error parsing vorbis codec private");
    L585:
        r104 = 0;
        goto L596
    L597:
        r48.V = new my4();
        r113 = "audio/true-hd";
        goto L473
    L598:
        be3 r129 = new be3(r48.a(r48.c));
        int r130 = r129.t();     // Catch: ArrayIndexOutOfBoundsException -> L613
        if (r130 != 1) goto L603;
    L609:
        int r131 = r48.R;
        String r132 = f35.a;
        r56 = f35.C(r131, ByteOrder.LITTLE_ENDIAN);
        if (r56 != 0) goto L487;
        l93.q0("MatroskaExtractor", "Unsupported PCM bit depth: " + r48.R + ". Setting mimeType to audio/x-unknown");
        goto L486
    L603:
        if (r130 != 65534) goto L612;
        r129.N(24);     // Catch: ArrayIndexOutOfBoundsException -> L613
        long r133 = r129.u();     // Catch: ArrayIndexOutOfBoundsException -> L613
        UUID r134 = o0;     // Catch: ArrayIndexOutOfBoundsException -> L613
        if (r133 != r134.getMostSignificantBits()) goto L612;
        if (r129.u() == r134.getLeastSignificantBits()) goto L609;
    L612:
        l93.q0("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
    L614:
        throw ParserException.a(null, "Error parsing MS/ACM codec private");
    L615:
        byte[] r135 = r48.l;
        if (r135 != null) goto L618;
        r78 = null;
    L619:
        r113 = "video/mp4v-es";
        goto L470
    L618:
        r78 = Collections.singletonList(r135);
        goto L619
    L502:
        if (r48.R != 32) goto L504;
        r113 = "audio/raw";
        r56 = 4;
        goto L474
    L504:
        l93.q0("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + r48.R + ". Setting mimeType to audio/x-unknown");
        goto L486
    L465:
        throw ParserException.a(null, "Unrecognized codec identifier.");
    L327:
        if (r49.equals("A_OPUS") == false) goto L325;
        r112 = 33;
        goto L462
    L331:
        if (r49.equals("A_FLAC") == false) goto L325;
        r112 = 32;
        goto L462
    L335:
        if (r49.equals("A_EAC3") == false) goto L325;
        r112 = 31;
        goto L462
    L339:
        if (r49.equals("V_MPEG2") == false) goto L325;
        r112 = 30;
        goto L462
    L343:
        if (r49.equals("S_TEXT/UTF8") == false) goto L325;
        r112 = 29;
        goto L462
    L347:
        if (r49.equals("S_TEXT/WEBVTT") == false) goto L325;
        r112 = 28;
        goto L462
    L351:
        if (r49.equals("V_MPEGH/ISO/HEVC") == false) goto L325;
        r112 = 27;
        goto L462
    L355:
        if (r49.equals("S_TEXT/SSA") == false) goto L325;
        r112 = 26;
        goto L462
    L359:
        if (r49.equals("S_TEXT/ASS") == false) goto L325;
        r112 = 25;
        goto L462
    L363:
        if (r49.equals("A_PCM/INT/LIT") == false) goto L325;
        r112 = 24;
        goto L462
    L367:
        if (r49.equals("A_PCM/INT/BIG") == false) goto L325;
        r112 = 23;
        goto L462
    L371:
        if (r49.equals("A_PCM/FLOAT/IEEE") == false) goto L325;
        r112 = 22;
        goto L462
    L375:
        if (r49.equals("A_DTS/EXPRESS") == false) goto L325;
        r112 = 21;
        goto L462
    L379:
        if (r49.equals("V_THEORA") == false) goto L325;
        r112 = 20;
        goto L462
    L383:
        if (r49.equals("S_HDMV/PGS") == false) goto L325;
        r112 = 19;
        goto L462
    L387:
        if (r49.equals("V_VP9") == false) goto L325;
        r112 = 18;
        goto L462
    L391:
        if (r49.equals("V_VP8") == false) goto L325;
        r112 = 17;
        goto L462
    L395:
        if (r49.equals("V_AV1") == false) goto L325;
        r112 = 16;
        goto L462
    L399:
        if (r49.equals("A_DTS") == false) goto L325;
        r112 = 15;
        goto L462
    L403:
        if (r49.equals("A_AC3") == false) goto L325;
        r112 = 14;
        goto L462
    L407:
        if (r49.equals("A_AAC") == false) goto L325;
        r112 = 13;
        goto L462
    L411:
        if (r49.equals("A_DTS/LOSSLESS") == false) goto L325;
        r112 = 12;
        goto L462
    L415:
        if (r49.equals("S_VOBSUB") == false) goto L325;
        r112 = 11;
        goto L462
    L419:
        if (r49.equals("V_MPEG4/ISO/AVC") == false) goto L325;
        r112 = 10;
        goto L462
    L423:
        if (r49.equals("V_MPEG4/ISO/ASP") == false) goto L325;
        r112 = 9;
        goto L462
    L427:
        if (r49.equals("S_DVBSUB") == false) goto L325;
        r112 = 8;
        goto L462
    L431:
        if (r49.equals("V_MS/VFW/FOURCC") == false) goto L325;
        r112 = 7;
        goto L462
    L435:
        if (r49.equals("A_MPEG/L3") == false) goto L325;
        r112 = 6;
        goto L462
    L439:
        if (r49.equals("A_MPEG/L2") == false) goto L325;
        r112 = 5;
        goto L462
    L443:
        if (r49.equals("A_VORBIS") == false) goto L325;
        r112 = 4;
        goto L462
    L447:
        if (r49.equals("A_TRUEHD") == false) goto L325;
        r112 = 3;
        goto L462
    L451:
        if (r49.equals("A_MS/ACM") == false) goto L325;
        r112 = 2;
        goto L462
    L455:
        if (r49.equals("V_MPEG4/ISO/SP") == false) goto L325;
        r112 = 1;
        goto L462
    L459:
        if (r49.equals("V_MPEG4/ISO/AP") == false) goto L325;
        r112 = 0;
    L730:
        r43.y = null;
    L137:
        int r136 = 0;
    L755:
        r25 = r44;
        r24 = r136;
        goto L756
    L186:
        if (r49.equals("A_OPUS") == false) goto L184;
        r50 = 33;
        goto L321
    L190:
        if (r49.equals("A_FLAC") == false) goto L184;
        r50 = 32;
        goto L321
    L194:
        if (r49.equals("A_EAC3") == false) goto L184;
        r50 = 31;
        goto L321
    L198:
        if (r49.equals("V_MPEG2") == false) goto L184;
        r50 = 30;
        goto L321
    L202:
        if (r49.equals("S_TEXT/UTF8") == false) goto L184;
        r50 = 29;
        goto L321
    L206:
        if (r49.equals("S_TEXT/WEBVTT") == false) goto L184;
        r50 = 28;
        goto L321
    L210:
        if (r49.equals("V_MPEGH/ISO/HEVC") == false) goto L184;
        r50 = 27;
        goto L321
    L214:
        if (r49.equals("S_TEXT/SSA") == false) goto L184;
        r50 = 26;
        goto L321
    L218:
        if (r49.equals("S_TEXT/ASS") == false) goto L184;
        r50 = 25;
        goto L321
    L222:
        if (r49.equals("A_PCM/INT/LIT") == false) goto L184;
        r50 = 24;
        goto L321
    L226:
        if (r49.equals("A_PCM/INT/BIG") == false) goto L184;
        r50 = 23;
        goto L321
    L230:
        if (r49.equals("A_PCM/FLOAT/IEEE") == false) goto L184;
        r50 = 22;
        goto L321
    L234:
        if (r49.equals("A_DTS/EXPRESS") == false) goto L184;
        r50 = 21;
        goto L321
    L238:
        if (r49.equals("V_THEORA") == false) goto L184;
        r50 = 20;
        goto L321
    L242:
        if (r49.equals("S_HDMV/PGS") == false) goto L184;
        r50 = 19;
        goto L321
    L246:
        if (r49.equals("V_VP9") == false) goto L184;
        r50 = 18;
        goto L321
    L250:
        if (r49.equals("V_VP8") == false) goto L184;
        r50 = 17;
        goto L321
    L254:
        if (r49.equals("V_AV1") == false) goto L184;
        r50 = 16;
        goto L321
    L258:
        if (r49.equals("A_DTS") == false) goto L184;
        r50 = 15;
        goto L321
    L262:
        if (r49.equals("A_AC3") == false) goto L184;
        r50 = 14;
        goto L321
    L266:
        if (r49.equals("A_AAC") == false) goto L184;
        r50 = 13;
        goto L321
    L270:
        if (r49.equals("A_DTS/LOSSLESS") == false) goto L184;
        r50 = 12;
        goto L321
    L274:
        if (r49.equals("S_VOBSUB") == false) goto L184;
        r50 = 11;
        goto L321
    L278:
        if (r49.equals("V_MPEG4/ISO/AVC") == false) goto L184;
        r50 = 10;
        goto L321
    L282:
        if (r49.equals("V_MPEG4/ISO/ASP") == false) goto L184;
        r50 = 9;
        goto L321
    L286:
        if (r49.equals("S_DVBSUB") == false) goto L184;
        r50 = 8;
        goto L321
    L290:
        if (r49.equals("V_MS/VFW/FOURCC") == false) goto L184;
        r50 = 7;
        goto L321
    L294:
        if (r49.equals("A_MPEG/L3") == false) goto L184;
        r50 = 6;
        goto L321
    L298:
        if (r49.equals("A_MPEG/L2") == false) goto L184;
        r50 = 5;
        goto L321
    L302:
        if (r49.equals("A_VORBIS") == false) goto L184;
        r50 = 4;
        goto L321
    L306:
        if (r49.equals("A_TRUEHD") == false) goto L184;
        r50 = 3;
        goto L321
    L310:
        if (r49.equals("A_MS/ACM") == false) goto L184;
        r50 = 2;
        goto L321
    L314:
        if (r49.equals("V_MPEG4/ISO/SP") == false) goto L184;
        r50 = 1;
        goto L321
    L318:
        if (r49.equals("V_MPEG4/ISO/AP") == false) goto L184;
        r50 = 0;
        goto L321
    L732:
        throw ParserException.a(null, "CodecId is missing in TrackEntry element");
    L16:
        if (r42 == 183) goto L169;
        if (r42 != 19899) goto L20;
        int r137 = r43.A;
        if (r137 == (-1)) goto L167;
        long r138 = r43.B;
        if (r138 == (-1)) goto L167;
        if (r137 != 475249515) goto L137;
        r43.K = r138;
    L167:
        throw ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
    L20:
        if (r42 != 25152) goto L22;
        r43.h(r42);
        mi2 r139 = r43.y;
        if (r139.i == false) goto L137;
        vv4 r140 = r139.k;
        if (r140 == null) goto L159;
        r139.m = new ow0(null, true, new nw0[]{new nw0(ax.a, null, "video/webm", r140.b)});
        goto L137
    L159:
        throw ParserException.a(null, "Encrypted Track found but ContentEncKeyID was not found");
    L22:
        if (r42 == 28032) goto L146;
        if (r42 == 357149030) goto L141;
        if (r42 == 374648427) goto L89;
        if (r42 != 475249515) goto L137;
        if (r43.z == true) goto L137;
        int r141 = r3 ? 1 : 0;
    L31:
        if (r141 >= r46.size()) goto L43;
        if (((List) r46.valueAt(r141)).isEmpty() == false) goto L35;
        r141 = r141 + 1;
        goto L31
    L35:
        if (r43.v == (-9223372036854775807L)) goto L43;
        int r142 = r3 ? 1 : 0;
    L39:
        if (r142 >= r46.size()) goto L41;
        Collections.sort((List) r46.valueAt(r142));
        r142 = r142 + 1;
        goto L39
    L41:
        r43.j0.w(new li2(r46, r43.v, r43.I, r43.s, r43.r));
    L44:
        r43.z = r4;
        r43.D = r3;
        int r143 = r3 ? 1 : 0;
    L46:
        if (r143 >= r47.size()) goto L88;
        mi2 r144 = (mi2) r47.valueAt(r143);
        long r145 = r43.v;
        long r146 = r43.s;
        long r147 = r43.r;
        boolean r310 = r3;
        int r311 = r4;
        if (r144.e == 2) goto L50;
    L49:
        int r211 = r143;
    L85:
        if (r144.W == true) goto L87;
        r144.a0.getClass();
        wv4 r148 = r144.a0;
        tb1 r149 = r144.b0;
        r149.getClass();
        r148.g(r149);
    L87:
        r143 = r211 + 1;
        r3 = r310 ? 1 : 0;
        r4 = true;
        goto L46
    L50:
        List r150 = (List) r46.get(r144.d);
        if (r150 == null) goto L49;
        if (r150.isEmpty() == true) goto L49;
        if (r150.isEmpty() == false) goto L59;
        r211 = r143;
    L58:
        long r151 = -9223372036854775807L;
    L78:
        if (r151 == (-9223372036854775807L)) goto L85;
        tb1 r152 = r144.b0;
        r152.getClass();
        qv2 r153 = r152.l;
        rt4 r154 = new rt4(r151);
        if (r153 != null) goto L82;
        pv2[] r155 = new pv2[r311];
        r155[r310 ? 1 : 0] = r154;
        qv2 r156 = new qv2(r155);
    L83:
        sb1 r157 = r144.b0.a();
        r157.k = r156;
        r144.b0 = new tb1(r157);
        goto L85
    L82:
        pv2[] r158 = new pv2[r311];
        r158[r310 ? 1 : 0] = r154;
        r156 = r153.a(r158);
        goto L83
    L59:
        r211 = r143;
        int r159 = Math.min(r150.size(), 20);
        double r212 = 0.0d;
        int r160 = r310 ? 1 : 0;
        int r161 = -1;
    L60:
        if (r160 >= r159) goto L74;
        ki2 r162 = (ki2) r150.get(r160);
        long r312 = r146;
        long r163 = r162.n;
        long r164 = r162.p;
        long r165 = r162.o;
        if (r163 > 10000000) goto L74;
        if (r160 >= (r150.size() - 1)) goto L67;
        ki2 r166 = (ki2) r150.get(r160 + 1);
        long r167 = (r166.o + r166.p) - (r165 + r164);
        long r168 = r166.n - r163;
    L69:
        if (r168 <= 0) goto L73;
        double r169 = r167 / r168;
        if (r169 <= r212) goto L73;
        r212 = r169;
        r161 = r160;
    L73:
        r160 = r160 + 1;
        r146 = r312;
        goto L60
    L67:
        r167 = (r312 + r147) - (r165 + r164);
        r168 = r145 - r163;
    L74:
        if (r161 == (-1)) goto L58;
        r151 = ((ki2) r150.get(r161 == true ? 1 : 0)).n;
        goto L78
    L88:
        r43.k();
        r136 = r3 ? 1 : 0;
    L43:
        r43.j0.w(new bo(r43.v));
        goto L44
    L89:
        boolean r313 = r3 ? 1 : 0;
        if (r47.size() == 0) goto L139;
        if (r43.d == true) goto L94;
    L97:
        boolean r170 = true;
    L98:
        int r171 = r313 ? 1 : 0;
        int r172 = -1;
        int r173 = -1;
        int r174 = -1;
        int r175 = -1;
    L100:
        if (r171 >= r47.size()) goto L122;
        mi2 r176 = (mi2) r47.valueAt(r171);
        int r177 = r176.e;
        if (r177 != 2) goto L110;
        if (r176.Y == false) goto L107;
        r172 = r176.d;
    L107:
        if (r173 != (-1)) goto L116;
        r173 = r176.d;
    L116:
        if (r170 == false) goto L120;
        r176.a0.getClass();
        if (r176.W == true) goto L120;
        wv4 r178 = r176.a0;
        tb1 r179 = r176.b0;
        r179.getClass();
        r178.g(r179);
    L120:
        r171 = r171 + 1;
        goto L100
    L110:
        if (r177 != 1) goto L116;
        if (r176.Y == false) goto L114;
        r174 = r176.d;
    L114:
        if (r175 != (-1)) goto L116;
        r175 = r176.d;
        goto L116
    L122:
        if (r172 == (-1)) goto L124;
        r43.I = r172;
    L135:
        if (r170 == false) goto L137;
        r43.k();
        goto L137
    L124:
        if (r173 == (-1)) goto L126;
        r43.I = r173;
        goto L135
    L126:
        if (r174 == (-1)) goto L128;
        r43.I = r174;
        goto L135
    L128:
        if (r175 == (-1)) goto L131;
        r43.I = r175;
        goto L135
    L131:
        if (r47.size() <= 0) goto L133;
        int r180 = ((mi2) r47.valueAt(r313 ? 1 : 0)).d;
    L134:
        r43.I = r180;
        goto L135
    L133:
        r180 = -1;
        goto L134
    L94:
        if (r43.K == (-1)) goto L97;
        r170 = r313 ? 1 : 0;
        goto L98
    L139:
        throw ParserException.a(null, "No valid tracks were found");
    L141:
        if (r43.t != (-9223372036854775807L)) goto L143;
        r43.t = 1000000;
    L143:
        long r181 = r43.u;
        if (r181 == (-9223372036854775807L)) goto L137;
        r43.v = r43.n(r181);
        goto L137
    L146:
        r43.h(r42);
        mi2 r182 = r43.y;
        if (r182.i == false) goto L137;
        if (r182.j == null) goto L137;
        throw ParserException.a(null, "Combining encryption and compression is not supported");
    L169:
        if (r43.z == true) goto L137;
        r43.g(r42);
        if (r43.E == (-9223372036854775807L)) goto L137;
        int r183 = r43.F;
        if (r183 == (-1)) goto L137;
        if (r43.G == (-1)) goto L137;
        List r184 = (List) r46.get(r183);
        if (r184 != null) goto L179;
        r184 = new ArrayList();
        r46.put(r43.F, r184);
    L179:
        r184.add(new ki2(r43.E, r43.s + r43.G, r43.H));
        goto L137
    L734:
        if (r43.O != 2) goto L137;
        mi2 r185 = (mi2) r47.get(r43.U);
        r185.a0.getClass();
        if (r43.Z > 0) goto L739;
    L741:
        int r186 = 0;
        int r187 = 0;
    L743:
        if (r186 >= r43.S) goto L745;
        r187 = r187 + r43.T[r186];
        r186 = r186 + 1;
        goto L743
    L745:
        int r188 = 0;
    L747:
        if (r188 >= r43.S) goto L754;
        long r213 = r43.P + ((long) ((r185.f * r188) / 1000));
        int r189 = r43.W;
        if (r188 != 0) goto L753;
        if (r43.Y == true) goto L753;
        r189 = r189 | 1;
    L753:
        int r314 = r43.T[r188];
        int r315 = r187 - r314;
        r43.i(r185, r213, r189, r314, r315);
        r188 = r188 + 1;
        r187 = r315;
        goto L747
    L754:
        r136 = 0;
        r43.O = 0;
        goto L755
    L739:
        if ("A_OPUS".equals(r185.c) == false) goto L741;
        be3 r190 = r43.p;
        byte[] r191 = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(r43.Z).array();
        r190.getClass();
        r190.L(r191.length, r191);
    L883:
        if (r5 == true) goto L893;
        int r192 = 0;
    L885:
        SparseArray r193 = r0.c;
        if (r192 >= r193.size()) goto L891;
        mi2 r194 = (mi2) r193.valueAt(r192);
        r194.a0.getClass();
        my4 r195 = r194.V;
        if (r195 == null) goto L890;
        r195.a(r194.a0, r194.k);
    L890:
        r192 = r192 + 1;
        goto L885
    L891:
        return -1;
    L893:
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 r15) {
        x7 r14 = new x7(13);
        be3 r0 = (be3) r14.p;
        rk0 r16 = (rk0) r15;
        long r1 = r16.p;
        long r4 = 1024;
        if (r1 != (-1)) goto L5;
    L8:
        int r5 = (int) r4;
        r16.e(r0.a, 0, 4, false);
        long r8 = r0.C();
        r14.o = 4;
    L10:
        if (r8 == 440786851) goto L15;
        int r6 = r14.o + 1;
        r14.o = r6;
        if (r6 == r5) goto L35;
        r16.e(r0.a, 0, 1, false);
        r8 = ((r8 << 8) & (-256)) | ((long) (r0.a[0] & 255));
    L35:
        return false;
    L15:
        long r7 = r14.c(r16);
        long r9 = r14.o;
        if (r7 == Long.MIN_VALUE) goto L35;
        if (r1 == (-1)) goto L21;
        if ((r9 + r7) >= r1) goto L35;
    L21:
        long r2 = r14.o;
        long r3 = r9 + r7;
        if (r2 >= r3) goto L33;
        if (r14.c(r16) == Long.MIN_VALUE) goto L35;
        long r10 = r14.c(r16);
        if (r10 < 0) goto L35;
        if (r10 > 2147483647L) goto L35;
        if (r10 == 0) goto L21;
        int r11 = (int) r10;
        r16.o(r11, false);
        r14.o += r11;
        goto L21
    L33:
        if (r2 != r3) goto L35;
        return true;
    L5:
        if (r1 > 1024) goto L8;
        r4 = r1;
        goto L8
    }

    @Override // defpackage.k51
    public final void d(long r2, long r4) {
        this.M = -9223372036854775807L;
        this.O = 0;
        mk0 r5 = this.a;
        r5.e = 0;
        r5.b.clear();
        k35 r6 = r5.c;
        r6.a = 0;
        r6.b = 0;
        k35 r7 = this.b;
        r7.a = 0;
        r7.b = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        if (this.z == true) goto L5;
        this.C.clear();
    L5:
        int r3 = 0;
    L6:
        SparseArray r8 = this.c;
        if (r3 >= r8.size()) goto L12;
        my4 r9 = ((mi2) r8.valueAt(r3)).V;
        if (r9 == null) goto L11;
        r9.b = false;
        r9.c = 0;
    L11:
        r3 = r3 + 1;
        goto L6
    }

    @Override // defpackage.k51
    public final void f(m51 r3) {
        if (this.e == false) goto L5;
        r3 = new ll(r3, this.f);
    L5:
        this.j0 = r3;
    }

    public final void g(int r2) {
        if (this.D == false) goto L6;
        return;
    L6:
        throw ParserException.a(null, "Element " + r2 + " must be in a Cues");
    }

    public final void h(int r2) {
        if (this.y == null) goto L6;
        return;
    L6:
        throw ParserException.a(null, "Element " + r2 + " must be in a TrackEntry");
    }

    public final void i(mi2 r18, long r19, int r21, int r22, int r23) {
        my4 r2 = r18.V;
        if (r2 == null) goto L6;
        r2.b(r18.a0, r19, r21, r22, r23, r18.k);
    L61:
        this.N = true;
        return;
    L6:
        if ("S_TEXT/UTF8".equals(r18.c) == true) goto L14;
        if ("S_TEXT/ASS".equals(r18.c) == true) goto L14;
        if ("S_TEXT/SSA".equals(r18.c) == true) goto L14;
        if ("S_TEXT/WEBVTT".equals(r18.c) == true) goto L14;
    L19:
        int r3 = r22;
    L55:
        if ((r21 & 268435456) == 0) goto L60;
        int r4 = this.S;
        be3 r5 = this.p;
        if (r4 <= 1) goto L59;
        r5.K(0);
        goto L60
    L59:
        int r6 = r5.c;
        r18.a0.b(r5, r6, 2);
        r3 = r3 + r6;
    L60:
        r18.a0.a(r19, r21, r3, r23, r18.k);
    L14:
        if (this.S <= 1) goto L16;
        l93.q0("MatroskaExtractor", "Skipping subtitle sample in laced block.");
        goto L19
    L16:
        long r11 = this.Q;
        if (r11 != (-9223372036854775807L)) goto L20;
        l93.q0("MatroskaExtractor", "Skipping subtitle sample with no duration.");
        goto L19
    L20:
        String r7 = r18.c;
        be3 r10 = this.m;
        byte[] r13 = r10.a;
        r7.getClass();
        byte r15 = -1;
        switch(r7.hashCode()) {
            case 738597099: goto L36;
            case 738614379: goto L32;
            case 1045209816: goto L28;
            case 1422270023: goto L24;
            default: goto L40;
        };
    L24:
        if (r7.equals("S_TEXT/UTF8") == false) goto L40;
        r15 = 3;
        goto L40
    L28:
        if (r7.equals("S_TEXT/WEBVTT") == false) goto L40;
        r15 = 2;
        goto L40
    L32:
        if (r7.equals("S_TEXT/SSA") == false) goto L40;
        r15 = 1;
        goto L40
    L36:
        if (r7.equals("S_TEXT/ASS") == false) goto L40;
        r15 = 0;
    L40:
        switch(r15) {
            case 0: goto L45;
            case 1: goto L45;
            case 2: goto L44;
            case 3: goto L43;
            default: goto L41;
        };
    L41:
        nz2.c();
        return;
    L43:
        byte[] r8 = j(r11, 1000, "%02d:%02d:%02d,%03d");
        int r9 = 19;
    L46:
        System.arraycopy(r8, 0, r13, r9, r8.length);
        int r12 = r10.b;
    L48:
        if (r12 >= r10.c) goto L53;
        if (r10.a[r12] == 0) goto L51;
        r12 = r12 + 1;
        goto L48
    L51:
        r10.M(r12);
    L53:
        r18.a0.e(r10.c, r10);
        r3 = r22 + r10.c;
        goto L55
    L44:
        r8 = j(r11, 1000, "%02d:%02d:%02d.%03d");
        r9 = 25;
        goto L46
    L45:
        r8 = j(r11, 10000, "%01d:%02d:%02d:%02d");
        r9 = 21;
        goto L46
    }

    public final void k() {
        if (this.x == false) goto L10;
        int r1 = 0;
    L6:
        SparseArray r2 = this.c;
        if (r1 >= r2.size()) goto L12;
        if (((mi2) r2.valueAt(r1)).W == true) goto L16;
        r1 = r1 + 1;
        goto L6
    L16:
        return;
    L12:
        m51 r3 = this.j0;
        r3.getClass();
        r3.p();
        this.x = false;
        return;
    }

    public final void l(l51 r4, int r5) {
        be3 r3 = this.i;
        if (r3.c < r5) goto L5;
        return;
    L5:
        byte[] r0 = r3.a;
        if (r0.length >= r5) goto L8;
        r3.c(Math.max(r0.length * 2, r5));
    L8:
        byte[] r1 = r3.a;
        int r2 = r3.c;
        r4.readFully(r1, r2, r5 - r2);
        r3.M(r5);
    }

    public final void m() {
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = false;
        this.l.K(0);
    }

    public final long n(long r8) {
        long r2 = this.t;
        if (r2 == (-9223372036854775807L)) goto L7;
        String r7 = f35.a;
        return f35.a0(r8, r2, 1000, RoundingMode.DOWN);
    L7:
        throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int o(l51 r18, mi2 r19, int r20, boolean r21) {
        if ("S_TEXT/UTF8".equals(r19.c) == false) goto L7;
        p(r18, k0, r20);
        int r1 = this.b0;
        m();
        return r1;
    L7:
        if ("S_TEXT/ASS".equals(r19.c) == false) goto L9;
    L132:
        p(r18, m0, r20);
        int r2 = this.b0;
        m();
        return r2;
    L9:
        if ("S_TEXT/SSA".equals(r19.c) == true) goto L132;
        if ("S_TEXT/WEBVTT".equals(r19.c) == false) goto L15;
        p(r18, n0, r20);
        int r3 = this.b0;
        m();
        return r3;
    L15:
        int r5 = 2;
        boolean r6 = true;
        if (r19.W == false) goto L34;
        r19.b0.getClass();
        be3 r4 = new be3(r20);
        if (r18.e(r4.a, 0, r20, true) == false) goto L33;
        r18.k();
        if (e35.z(r4.i()) != 1) goto L33;
        if (r4.a() < 10) goto L33;
        byte[] r8 = new byte[10];
        r4.k(r8, 0, 10);
        r4.N(0);
        int r9 = e35.y(r8);
        if (r9 <= 0) goto L33;
        if (r4.a() < (r9 + 4)) goto L33;
        r4.O(r9);
        if (e35.z(r4.m()) != 2) goto L33;
        sb1 r7 = r19.b0.a();
        r7.m = lw2.m("audio/vnd.dts.hd");
        r19.b0 = new tb1(r7);
    L33:
        r19.a0.g(r19.b0);
        r19.W = false;
        k();
    L34:
        wv4 r10 = r19.a0;
        boolean r11 = this.d0;
        be3 r12 = this.l;
        if (r11 == true) goto L94;
        boolean r13 = r19.i;
        be3 r14 = this.i;
        if (r13 == false) goto L81;
        this.W &= -1073741825;
        int r15 = 128;
        if (this.e0 == true) goto L45;
        r18.readFully(r14.a, 0, 1);
        this.a0++;
        byte r16 = r14.a[0];
        if ((r16 & 128) == 128) goto L44;
        this.h0 = r16;
        this.e0 = true;
        goto L45
    L44:
        throw ParserException.a(null, "Extension bit is set in signal byte");
    L45:
        byte r17 = this.h0;
        if ((r17 & 1) == 1) goto L48;
    L80:
        int r110 = 2;
    L85:
        if ("A_OPUS".equals(r19.c) == false) goto L88;
        boolean r22 = r21;
    L91:
        if (r22 == false) goto L93;
        this.W |= 268435456;
        this.p.K(0);
        int r23 = (r12.c + r20) - this.a0;
        r14.K(4);
        byte[] r24 = r14.a;
        r24[0] = (byte) ((r23 >> 24) & 255);
        r24[1] = (byte) ((r23 >> 16) & 255);
        r24[r110] = (byte) ((r23 >> 8) & 255);
        r24[3] = (byte) (r23 & 255);
        r10.b(r14, 4, r110);
        this.b0 += 4;
    L93:
        this.d0 = true;
        goto L94
    L88:
        if (r19.g <= 0) goto L90;
        r22 = true;
        goto L91
    L90:
        r22 = false;
        goto L91
    L48:
        if ((r17 & 2) != 2) goto L50;
        boolean r25 = true;
    L51:
        this.W |= 1073741824;
        if (this.i0 == true) goto L58;
        be3 r111 = this.n;
        r18.readFully(r111.a, 0, 8);
        this.a0 += 8;
        this.i0 = true;
        byte[] r112 = r14.a;
        if (r25 == true) goto L57;
        r15 = 0;
    L57:
        r112[0] = (byte) (r15 | 8);
        r14.N(0);
        r10.b(r14, 1, 1);
        this.b0++;
        r111.N(0);
        r10.b(r111, 8, 1);
        this.b0 += 8;
    L58:
        if (r25 == false) goto L80;
        if (this.f0 == true) goto L62;
        r18.readFully(r14.a, 0, 1);
        this.a0++;
        r14.N(0);
        this.g0 = r14.A();
        this.f0 = true;
    L62:
        int r26 = this.g0 * 4;
        r14.K(r26);
        r18.readFully(r14.a, 0, r26);
        this.a0 += r26;
        short r27 = (short) ((this.g0 / 2) + 1);
        int r113 = (r27 * 6) + 2;
        ByteBuffer r114 = this.q;
        if (r114 != null) goto L65;
    L66:
        this.q = ByteBuffer.allocate(r113);
    L67:
        this.q.position(0);
        this.q.putShort(r27);
        int r28 = 0;
        int r115 = 0;
    L68:
        int r116 = this.g0;
        if (r28 >= r116) goto L75;
        int r117 = r14.E();
        int r118 = r28 % 2;
        int r119 = r5;
        ByteBuffer r29 = this.q;
        if (r118 != 0) goto L73;
        r29.putShort((short) (r117 - r115));
    L74:
        r28 = r28 + 1;
        r115 = r117;
        r5 = r119;
        goto L68
    L73:
        r29.putInt(r117 - r115);
        goto L74
    L75:
        r110 = r5;
        int r30 = (r20 - this.a0) - r115;
        int r120 = r116 % 2;
        ByteBuffer r31 = this.q;
        if (r120 != 1) goto L78;
        r31.putInt(r30);
    L79:
        byte[] r32 = this.q.array();
        be3 r33 = this.o;
        r33.L(r113, r32);
        r10.b(r33, r113, 1);
        this.b0 += r113;
        goto L85
    L78:
        r31.putShort((short) r30);
        this.q.putInt(0);
        goto L79
    L65:
        if (r114.capacity() >= r113) goto L67;
    L50:
        r25 = false;
        goto L51
    L81:
        r110 = 2;
        byte[] r34 = r19.j;
        if (r34 == null) goto L85;
        r12.L(r34.length, r34);
    L94:
        int r35 = r20 + r12.c;
        if ("V_MPEG4/ISO/AVC".equals(r19.c) == false) goto L97;
    L113:
        be3 r36 = this.h;
        byte[] r37 = r36.a;
        r37[0] = 0;
        r37[1] = 0;
        r37[2] = 0;
        int r38 = r19.c0;
        int r121 = 4 - r38;
    L115:
        if (this.a0 >= r35) goto L128;
        int r122 = this.c0;
        if (r122 == 0) goto L118;
        int r123 = r12.a();
        if (r123 <= 0) goto L125;
        int r124 = Math.min(r122, r123);
        r10.e(r124, r12);
    L126:
        this.a0 += r124;
        this.b0 += r124;
        this.c0 -= r124;
        goto L115
    L125:
        r124 = r10.f(r18, r122, false);
        goto L126
    L118:
        int r125 = Math.min(r38, r12.a());
        r18.readFully(r37, r121 + r125, r38 - r125);
        if (r125 <= 0) goto L121;
        r12.k(r37, r121, r125);
    L121:
        this.a0 += r38;
        r36.N(0);
        this.c0 = r36.E();
        be3 r126 = this.g;
        r126.N(0);
        r10.e(4, r126);
        this.b0 += 4;
    L128:
        if ("A_VORBIS".equals(r19.c) == false) goto L130;
        be3 r39 = this.j;
        r39.N(0);
        r10.e(4, r39);
        this.b0 += 4;
    L130:
        int r40 = this.b0;
        m();
        return r40;
    L97:
        if ("V_MPEGH/ISO/HEVC".equals(r19.c) == true) goto L113;
        if (r19.V == null) goto L106;
        if (r12.c == 0) goto L105;
        r6 = false;
    L105:
        rr2.w(r6);
        r19.V.c(r18);
    L106:
        int r41 = this.a0;
        if (r41 >= r35) goto L128;
        int r42 = r35 - r41;
        int r43 = r12.a();
        if (r43 <= 0) goto L111;
        int r44 = Math.min(r42, r43);
        r10.e(r44, r12);
    L112:
        this.a0 += r44;
        this.b0 += r44;
        goto L106
    L111:
        r44 = r10.f(r18, r42, false);
        goto L112
    }

    public final void p(l51 r5, byte[] r6, int r7) {
        int r0 = r6.length + r7;
        be3 r4 = this.m;
        byte[] r1 = r4.a;
        if (r1.length >= r0) goto L5;
        byte[] r2 = Arrays.copyOf(r6, r0 + r7);
        r4.getClass();
        r4.L(r2.length, r2);
    L6:
        r5.readFully(r4.a, r6.length, r7);
        r4.N(0);
        r4.M(r0);
        return;
    L5:
        System.arraycopy(r6, 0, r1, 0, r6.length);
        goto L6
    }
}
