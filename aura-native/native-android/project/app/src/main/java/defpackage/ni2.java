package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.eddyizm.tempus.homemusic.WaveRetry;
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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ni2 implements k51 {
    public static final byte[] k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] l0;
    public static final byte[] m0;
    public static final byte[] n0;
    public static final UUID o0;
    public static final Map p0;
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
        String str = f35.a;
        l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        xa3.n(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        xa3.n(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        p0 = Collections.unmodifiableMap(map);
    }

    public ni2(xn4 xn4Var, int i) {
        mk0 mk0Var = new mk0();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.a = mk0Var;
        mk0Var.d = new hg3(28, this);
        this.f = xn4Var;
        this.C = new SparseArray();
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
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
    }

    public static byte[] j(long j, long j2, String str) {
        rr2.l(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = f35.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x035e  */
    /* JADX WARN: Code duplicated, block: B:325:0x0523  */
    /* JADX WARN: Code duplicated, block: B:487:0x07af A[PHI: r0
  0x07af: PHI (r0v124 int) = (r0v68 int), (r0v120 int), (r0v121 int), (r0v122 int), (r0v126 int) binds: [B:610:0x0a1c, B:499:0x07ce, B:496:0x07c7, B:493:0x07c0, B:484:0x0794] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:622:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:627:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:628:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:631:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:632:0x0a92  */
    /* JADX WARN: Code duplicated, block: B:634:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:636:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:638:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:641:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:643:0x0aae  */
    /* JADX WARN: Code duplicated, block: B:646:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:649:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:652:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:654:0x0ace  */
    /* JADX WARN: Code duplicated, block: B:674:0x0b84  */
    /* JADX WARN: Code duplicated, block: B:676:0x0ba0  */
    /* JADX WARN: Code duplicated, block: B:679:0x0ba5  */
    /* JADX WARN: Code duplicated, block: B:682:0x0bb8  */
    /* JADX WARN: Code duplicated, block: B:685:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:691:0x0bd6  */
    /* JADX WARN: Code duplicated, block: B:692:0x0bd8  */
    /* JADX WARN: Code duplicated, block: B:694:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:695:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:697:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:703:0x0c07  */
    /* JADX WARN: Code duplicated, block: B:705:0x0c20  */
    /* JADX WARN: Code duplicated, block: B:707:0x0c26  */
    /* JADX WARN: Code duplicated, block: B:722:0x0c51  */
    /* JADX WARN: Code duplicated, block: B:727:0x0c65  */
    /* JADX WARN: Code duplicated, block: B:728:0x0c68  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b7  */
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
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        boolean z;
        int i;
        int i2;
        int i3;
        String str;
        int r4;
        int i4;
        int iA;
        l51 r1;
        boolean z2;
        l51 r2;
        int i5;
        byte b;
        List listSingletonList;
        int iC;
        byte r3;
        int i6;
        ArrayList arrayList;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        String str3;
        List list;
        List listO;
        String str4;
        List list2;
        List list3;
        int i7;
        sb1 sb1Var;
        boolean zI;
        int i8;
        int i9;
        float f;
        c50 c50Var;
        String str5;
        int iIntValue;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        String str6;
        String str7;
        zh0 zh0VarE;
        List list4;
        int i13;
        List list5;
        int i14;
        long j;
        long j2;
        long j3;
        qv2 qv2Var;
        rt4 rt4Var;
        qv2 qv2VarA;
        ni2 ni2Var = this;
        boolean z3 = false;
        ni2Var.N = false;
        boolean z4 = true;
        boolean z5 = true;
        while (z5 && !ni2Var.N) {
            mk0 r7 = ni2Var.a;
            k35 r8 = r7.c;
            ArrayDeque arrayDeque = r7.b;
            r7.d.getClass();
            while (true) {
                lk0 lk0Var = (lk0) arrayDeque.peek();
                if (lk0Var == null || l51Var.getPosition() < lk0Var.b) {
                    int z6 = z3 ? 1 : 0;
                    l51 r5 = l51Var;
                    if (r7.e == 0) {
                        int i15 = 4;
                        long jB = r8.b(r5, true, z6, 4);
                        if (jB == -2) {
                            byte[] bArr2 = r7.a;
                            r5.k();
                            int r6 = z6;
                            while (true) {
                                r5.n(bArr2, r6, i15);
                                byte b2 = bArr2[r6];
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= 8) {
                                        i4 = -1;
                                    } else if ((k35.d[i16] & ((long) b2)) != 0) {
                                        i4 = i16 + 1;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (i4 != -1 && i4 <= 4) {
                                    iA = (int) k35.a(i4, false, bArr2);
                                    Object obj = r7.d.o;
                                    if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                    }
                                }
                                r5.l(1);
                                i15 = 4;
                                r6 = 0;
                            }
                            r5.l(i4);
                            jB = iA;
                        }
                        z = true;
                        if (jB == -1) {
                            r4 = 0;
                            z5 = false;
                            r1 = r5;
                        } else {
                            r7.f = (int) jB;
                            r7.e = 1;
                        }
                    } else {
                        z = true;
                    }
                    if (r7.e == z) {
                        r7.g = r8.b(r5, false, z, 8);
                        r7.e = 2;
                    }
                    hg3 r0 = r7.d;
                    int i17 = r7.f;
                    Object obj2 = r0.o;
                    switch (i17) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 240:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        r5.l((int) r7.g);
                        r7.e = 0;
                        z3 = false;
                        z4 = true;
                    } else if (i == 1) {
                        long position = r5.getPosition();
                        arrayDeque.push(new lk0(r7.f, r7.g + position));
                        r7.d.I(r7.f, position, r7.g);
                        i2 = 0;
                        r7.e = 0;
                        r2 = r5;
                    } else if (i == 2) {
                        long j4 = r7.g;
                        if (j4 > 8) {
                            throw ParserException.a(null, "Invalid integer size: " + r7.g);
                        }
                        r0.F(i17, r7.a(r5, (int) j4));
                        i2 = 0;
                        r7.e = 0;
                        r2 = r5;
                    } else if (i == 3) {
                        long j5 = r7.g;
                        if (j5 > 2147483647L) {
                            throw ParserException.a(null, "String element size: " + r7.g);
                        }
                        int i18 = (int) j5;
                        if (i18 == 0) {
                            str = "";
                            i3 = 0;
                        } else {
                            byte[] bArr3 = new byte[i18];
                            r5.readFully(bArr3, 0, i18);
                            while (i18 > 0 && bArr3[i18 - 1] == 0) {
                                i18--;
                            }
                            i3 = 0;
                            str = new String(bArr3, 0, i18);
                        }
                        r0.J(i17, str);
                        r7.e = i3;
                        i2 = i3;
                        r2 = r5;
                    } else if (i == 4) {
                        r0.B(i17, (int) r7.g, r5);
                        i2 = 0;
                        r7.e = 0;
                        r2 = r5;
                    } else {
                        if (i != 5) {
                            throw ParserException.a(null, "Invalid element type " + i);
                        }
                        long j6 = r7.g;
                        if (j6 != 4 && j6 != 8) {
                            throw ParserException.a(null, "Invalid float size: " + r7.g);
                        }
                        int i19 = (int) j6;
                        long jA = r7.a(r5, i19);
                        double dIntBitsToFloat = i19 == 4 ? Float.intBitsToFloat((int) jA) : Double.longBitsToDouble(jA);
                        ni2 ni2Var2 = (ni2) r0.o;
                        if (i17 == 181) {
                            ni2Var2.h(i17);
                            ni2Var2.y.S = (int) dIntBitsToFloat;
                        } else if (i17 != 17545) {
                            switch (i17) {
                                case 21969:
                                    ni2Var2.h(i17);
                                    ni2Var2.y.F = (float) dIntBitsToFloat;
                                    break;
                                case 21970:
                                    ni2Var2.h(i17);
                                    ni2Var2.y.G = (float) dIntBitsToFloat;
                                    break;
                                case 21971:
                                    ni2Var2.h(i17);
                                    ni2Var2.y.H = (float) dIntBitsToFloat;
                                    break;
                                case 21972:
                                    ni2Var2.h(i17);
                                    ni2Var2.y.I = (float) dIntBitsToFloat;
                                    break;
                                case 21973:
                                    ni2Var2.h(i17);
                                    ni2Var2.y.J = (float) dIntBitsToFloat;
                                    break;
                                case 21974:
                                    ni2Var2.h(i17);
                                    ni2Var2.y.K = (float) dIntBitsToFloat;
                                    break;
                                case 21975:
                                    ni2Var2.h(i17);
                                    ni2Var2.y.L = (float) dIntBitsToFloat;
                                    break;
                                case 21976:
                                    ni2Var2.h(i17);
                                    ni2Var2.y.M = (float) dIntBitsToFloat;
                                    break;
                                case 21977:
                                    ni2Var2.h(i17);
                                    ni2Var2.y.N = (float) dIntBitsToFloat;
                                    break;
                                case 21978:
                                    ni2Var2.h(i17);
                                    ni2Var2.y.O = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    switch (i17) {
                                        case 30323:
                                            ni2Var2.h(i17);
                                            ni2Var2.y.u = (float) dIntBitsToFloat;
                                            break;
                                        case 30324:
                                            ni2Var2.h(i17);
                                            ni2Var2.y.v = (float) dIntBitsToFloat;
                                            break;
                                        case 30325:
                                            ni2Var2.h(i17);
                                            ni2Var2.y.w = (float) dIntBitsToFloat;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            ni2Var2.u = (long) dIntBitsToFloat;
                        }
                        i2 = 0;
                        r7.e = 0;
                        r2 = r5;
                    }
                } else {
                    hg3 hg3Var = r7.d;
                    int i20 = ((lk0) arrayDeque.pop()).a;
                    ni2 ni2Var3 = (ni2) hg3Var.o;
                    SparseArray sparseArray = ni2Var3.C;
                    SparseArray sparseArray2 = ni2Var3.c;
                    ni2Var3.j0.getClass();
                    if (i20 != 160) {
                        if (i20 == 174) {
                            mi2 mi2Var = ni2Var3.y;
                            mi2Var.getClass();
                            String str8 = mi2Var.c;
                            if (str8 == null) {
                                throw ParserException.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str8) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i21 = mi2Var.d;
                                    switch (str8) {
                                        case "V_MPEG4/ISO/AP":
                                            b = 0;
                                            break;
                                        case "V_MPEG4/ISO/SP":
                                            b = 1;
                                            break;
                                        case "A_MS/ACM":
                                            b = 2;
                                            break;
                                        case "A_TRUEHD":
                                            b = 3;
                                            break;
                                        case "A_VORBIS":
                                            b = 4;
                                            break;
                                        case "A_MPEG/L2":
                                            b = 5;
                                            break;
                                        case "A_MPEG/L3":
                                            b = 6;
                                            break;
                                        case "V_MS/VFW/FOURCC":
                                            b = 7;
                                            break;
                                        case "S_DVBSUB":
                                            b = 8;
                                            break;
                                        case "V_MPEG4/ISO/ASP":
                                            b = 9;
                                            break;
                                        case "V_MPEG4/ISO/AVC":
                                            b = 10;
                                            break;
                                        case "S_VOBSUB":
                                            b = 11;
                                            break;
                                        case "A_DTS/LOSSLESS":
                                            b = 12;
                                            break;
                                        case "A_AAC":
                                            b = 13;
                                            break;
                                        case "A_AC3":
                                            b = 14;
                                            break;
                                        case "A_DTS":
                                            b = 15;
                                            break;
                                        case "V_AV1":
                                            b = 16;
                                            break;
                                        case "V_VP8":
                                            b = 17;
                                            break;
                                        case "V_VP9":
                                            b = 18;
                                            break;
                                        case "S_HDMV/PGS":
                                            b = 19;
                                            break;
                                        case "V_THEORA":
                                            b = 20;
                                            break;
                                        case "A_DTS/EXPRESS":
                                            b = 21;
                                            break;
                                        case "A_PCM/FLOAT/IEEE":
                                            b = 22;
                                            break;
                                        case "A_PCM/INT/BIG":
                                            b = 23;
                                            break;
                                        case "A_PCM/INT/LIT":
                                            b = 24;
                                            break;
                                        case "S_TEXT/ASS":
                                            b = 25;
                                            break;
                                        case "S_TEXT/SSA":
                                            b = 26;
                                            break;
                                        case "V_MPEGH/ISO/HEVC":
                                            b = 27;
                                            break;
                                        case "S_TEXT/WEBVTT":
                                            b = 28;
                                            break;
                                        case "S_TEXT/UTF8":
                                            b = 29;
                                            break;
                                        case "V_MPEG2":
                                            b = 30;
                                            break;
                                        case "A_EAC3":
                                            b = 31;
                                            break;
                                        case "A_FLAC":
                                            b = 32;
                                            break;
                                        case "A_OPUS":
                                            b = 33;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    String str9 = "video/x-unknown";
                                    switch (b) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            byte[] bArr4 = mi2Var.l;
                                            listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str9 = "video/mp4v-es";
                                            listO = listSingletonList;
                                            iC = -1;
                                            i6 = -1;
                                            list4 = listO;
                                            str3 = null;
                                            list3 = list4;
                                            if (mi2Var.P != null && (zh0VarE = zh0.E(new be3(mi2Var.P))) != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z7 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i22 = (z7 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8 || (i10 = mi2Var.r) == i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = (mi2Var.o * i9) / (mi2Var.n * i10);
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f || mi2Var.G == -1.0f || mi2Var.H == -1.0f || mi2Var.I == -1.0f || mi2Var.J == -1.0f || mi2Var.K == -1.0f || mi2Var.L == -1.0f || mi2Var.M == -1.0f || mi2Var.N == -1.0f || mi2Var.O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((mi2Var.F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((mi2Var.G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((mi2Var.H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((mi2Var.I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((mi2Var.J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((mi2Var.K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((mi2Var.L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((mi2Var.M * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (mi2Var.N + 0.5f));
                                                        byteBufferOrder.putShort((short) (mi2Var.O + 0.5f));
                                                        byteBufferOrder.putShort((short) mi2Var.D);
                                                        byteBufferOrder.putShort((short) mi2Var.E);
                                                        bArr = bArr5;
                                                    }
                                                    int i23 = mi2Var.A;
                                                    int i24 = mi2Var.C;
                                                    int i25 = mi2Var.B;
                                                    int i26 = mi2Var.p;
                                                    c50Var = new c50(i23, i24, i25, bArr, i26, i26);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null && map.containsKey(str5)) {
                                                    iIntValue = ((Integer) map.get(mi2Var.b)).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0 && Float.compare(mi2Var.u, 0.0f) == 0 && Float.compare(mi2Var.v, 0.0f) == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0 || Float.compare(mi2Var.w, 180.0f) == 0) {
                                                        iIntValue = 180;
                                                    } else if (Float.compare(mi2Var.w, -90.0f) == 0) {
                                                        iIntValue = 270;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9) && !"text/x-ssa".equals(str9) && !"text/vtt".equals(str9) && !"application/vobsub".equals(str9) && !"application/pgs".equals(str9) && !"application/dvbsubs".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null && !map.containsKey(str6)) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i22;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 2:
                                            be3 be3Var = new be3(mi2Var.a(mi2Var.c));
                                            try {
                                                int iT = be3Var.t();
                                                if (iT != 1) {
                                                    if (iT == 65534) {
                                                        be3Var.N(24);
                                                        long jU = be3Var.u();
                                                        UUID uuid = o0;
                                                        if (jU != uuid.getMostSignificantBits() || be3Var.u() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str9 = "audio/x-unknown";
                                                        iC = -1;
                                                        i6 = -1;
                                                        str3 = null;
                                                        list3 = null;
                                                        if (mi2Var.P != null) {
                                                            str3 = (String) zh0VarE.o;
                                                            str9 = "video/dolby-vision";
                                                        }
                                                        boolean z8 = mi2Var.Y;
                                                        if (mi2Var.X) {
                                                            i7 = 2;
                                                        } else {
                                                            i7 = 0;
                                                        }
                                                        int i27 = (z8 ? 1 : 0) | i7;
                                                        sb1Var = new sb1();
                                                        zI = lw2.i(str9);
                                                        Map map2 = p0;
                                                        if (zI) {
                                                            sb1Var.E = mi2Var.Q;
                                                            sb1Var.F = mi2Var.S;
                                                            sb1Var.G = iC;
                                                        } else if (lw2.l(str9)) {
                                                            if (mi2Var.s == 0) {
                                                                i11 = mi2Var.q;
                                                                i8 = -1;
                                                                if (i11 == -1) {
                                                                    i11 = mi2Var.n;
                                                                }
                                                                mi2Var.q = i11;
                                                                i12 = mi2Var.r;
                                                                if (i12 == -1) {
                                                                    i12 = mi2Var.o;
                                                                }
                                                                mi2Var.r = i12;
                                                            } else {
                                                                i8 = -1;
                                                            }
                                                            i9 = mi2Var.q;
                                                            if (i9 != i8) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (mi2Var.z) {
                                                                if (mi2Var.F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i28 = mi2Var.A;
                                                                int i29 = mi2Var.C;
                                                                int i210 = mi2Var.B;
                                                                int i211 = mi2Var.p;
                                                                c50Var = new c50(i28, i29, i210, bArr, i211, i211);
                                                            } else {
                                                                c50Var = null;
                                                            }
                                                            str5 = mi2Var.b;
                                                            if (str5 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (mi2Var.t == 0) {
                                                                if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            sb1Var.t = mi2Var.n;
                                                            sb1Var.u = mi2Var.o;
                                                            sb1Var.z = f;
                                                            sb1Var.y = iIntValue;
                                                            sb1Var.A = mi2Var.x;
                                                            sb1Var.B = mi2Var.y;
                                                            sb1Var.C = c50Var;
                                                        } else if (!"application/x-subrip".equals(str9)) {
                                                            throw ParserException.a(null, "Unexpected MIME type.");
                                                        }
                                                        str6 = mi2Var.b;
                                                        if (str6 != null) {
                                                            sb1Var.b = mi2Var.b;
                                                        }
                                                        sb1Var.a = Integer.toString(i21);
                                                        if (mi2Var.a) {
                                                            str7 = "video/webm";
                                                        } else {
                                                            str7 = "video/x-matroska";
                                                        }
                                                        sb1Var.l = lw2.m(str7);
                                                        sb1Var.m = lw2.m(str9);
                                                        sb1Var.n = i6;
                                                        sb1Var.d = mi2Var.Z;
                                                        sb1Var.e = i27;
                                                        sb1Var.p = list3;
                                                        sb1Var.j = str3;
                                                        sb1Var.q = mi2Var.m;
                                                        mi2Var.b0 = sb1Var.a();
                                                        mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                                        sparseArray2.put(mi2Var.d, mi2Var);
                                                    }
                                                    l93.q0("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iC = -1;
                                                    i6 = -1;
                                                    str3 = null;
                                                    list3 = null;
                                                    if (mi2Var.P != null) {
                                                        str3 = (String) zh0VarE.o;
                                                        str9 = "video/dolby-vision";
                                                    }
                                                    boolean z9 = mi2Var.Y;
                                                    if (mi2Var.X) {
                                                        i7 = 2;
                                                    } else {
                                                        i7 = 0;
                                                    }
                                                    int i212 = (z9 ? 1 : 0) | i7;
                                                    sb1Var = new sb1();
                                                    zI = lw2.i(str9);
                                                    Map map3 = p0;
                                                    if (zI) {
                                                        sb1Var.E = mi2Var.Q;
                                                        sb1Var.F = mi2Var.S;
                                                        sb1Var.G = iC;
                                                    } else if (lw2.l(str9)) {
                                                        if (mi2Var.s == 0) {
                                                            i11 = mi2Var.q;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = mi2Var.n;
                                                            }
                                                            mi2Var.q = i11;
                                                            i12 = mi2Var.r;
                                                            if (i12 == -1) {
                                                                i12 = mi2Var.o;
                                                            }
                                                            mi2Var.r = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = mi2Var.q;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (mi2Var.z) {
                                                            if (mi2Var.F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i213 = mi2Var.A;
                                                            int i214 = mi2Var.C;
                                                            int i215 = mi2Var.B;
                                                            int i216 = mi2Var.p;
                                                            c50Var = new c50(i213, i214, i215, bArr, i216, i216);
                                                        } else {
                                                            c50Var = null;
                                                        }
                                                        str5 = mi2Var.b;
                                                        if (str5 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (mi2Var.t == 0) {
                                                            if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        sb1Var.t = mi2Var.n;
                                                        sb1Var.u = mi2Var.o;
                                                        sb1Var.z = f;
                                                        sb1Var.y = iIntValue;
                                                        sb1Var.A = mi2Var.x;
                                                        sb1Var.B = mi2Var.y;
                                                        sb1Var.C = c50Var;
                                                    } else if (!"application/x-subrip".equals(str9)) {
                                                        throw ParserException.a(null, "Unexpected MIME type.");
                                                    }
                                                    str6 = mi2Var.b;
                                                    if (str6 != null) {
                                                        sb1Var.b = mi2Var.b;
                                                    }
                                                    sb1Var.a = Integer.toString(i21);
                                                    if (mi2Var.a) {
                                                        str7 = "video/webm";
                                                    } else {
                                                        str7 = "video/x-matroska";
                                                    }
                                                    sb1Var.l = lw2.m(str7);
                                                    sb1Var.m = lw2.m(str9);
                                                    sb1Var.n = i6;
                                                    sb1Var.d = mi2Var.Z;
                                                    sb1Var.e = i212;
                                                    sb1Var.p = list3;
                                                    sb1Var.j = str3;
                                                    sb1Var.q = mi2Var.m;
                                                    mi2Var.b0 = sb1Var.a();
                                                    mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                                    sparseArray2.put(mi2Var.d, mi2Var);
                                                    break;
                                                }
                                                int i30 = mi2Var.R;
                                                String str10 = f35.a;
                                                iC = f35.C(i30, ByteOrder.LITTLE_ENDIAN);
                                                if (iC == 0) {
                                                    l93.q0("MatroskaExtractor", "Unsupported PCM bit depth: " + mi2Var.R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iC = -1;
                                                } else {
                                                    str9 = "audio/raw";
                                                }
                                                i6 = -1;
                                                str3 = null;
                                                list3 = null;
                                                if (mi2Var.P != null) {
                                                    str3 = (String) zh0VarE.o;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z10 = mi2Var.Y;
                                                if (mi2Var.X) {
                                                    i7 = 2;
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i217 = (z10 ? 1 : 0) | i7;
                                                sb1Var = new sb1();
                                                zI = lw2.i(str9);
                                                Map map4 = p0;
                                                if (zI) {
                                                    sb1Var.E = mi2Var.Q;
                                                    sb1Var.F = mi2Var.S;
                                                    sb1Var.G = iC;
                                                } else if (lw2.l(str9)) {
                                                    if (mi2Var.s == 0) {
                                                        i11 = mi2Var.q;
                                                        i8 = -1;
                                                        if (i11 == -1) {
                                                            i11 = mi2Var.n;
                                                        }
                                                        mi2Var.q = i11;
                                                        i12 = mi2Var.r;
                                                        if (i12 == -1) {
                                                            i12 = mi2Var.o;
                                                        }
                                                        mi2Var.r = i12;
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    i9 = mi2Var.q;
                                                    if (i9 != i8) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (mi2Var.z) {
                                                        if (mi2Var.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i218 = mi2Var.A;
                                                        int i219 = mi2Var.C;
                                                        int i2110 = mi2Var.B;
                                                        int i2111 = mi2Var.p;
                                                        c50Var = new c50(i218, i219, i2110, bArr, i2111, i2111);
                                                    } else {
                                                        c50Var = null;
                                                    }
                                                    str5 = mi2Var.b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (mi2Var.t == 0) {
                                                        if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    sb1Var.t = mi2Var.n;
                                                    sb1Var.u = mi2Var.o;
                                                    sb1Var.z = f;
                                                    sb1Var.y = iIntValue;
                                                    sb1Var.A = mi2Var.x;
                                                    sb1Var.B = mi2Var.y;
                                                    sb1Var.C = c50Var;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw ParserException.a(null, "Unexpected MIME type.");
                                                }
                                                str6 = mi2Var.b;
                                                if (str6 != null) {
                                                    sb1Var.b = mi2Var.b;
                                                }
                                                sb1Var.a = Integer.toString(i21);
                                                if (mi2Var.a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                sb1Var.l = lw2.m(str7);
                                                sb1Var.m = lw2.m(str9);
                                                sb1Var.n = i6;
                                                sb1Var.d = mi2Var.Z;
                                                sb1Var.e = i217;
                                                sb1Var.p = list3;
                                                sb1Var.j = str3;
                                                sb1Var.q = mi2Var.m;
                                                mi2Var.b0 = sb1Var.a();
                                                mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                                sparseArray2.put(mi2Var.d, mi2Var);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw ParserException.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                            mi2Var.V = new my4();
                                            str9 = "audio/true-hd";
                                            iC = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2112 = (z11 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map5 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2113 = mi2Var.A;
                                                    int i2114 = mi2Var.C;
                                                    int i2115 = mi2Var.B;
                                                    int i2116 = mi2Var.p;
                                                    c50Var = new c50(i2113, i2114, i2115, bArr, i2116, i2116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i2112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 4:
                                            byte[] bArrA = mi2Var.a(str8);
                                            try {
                                                r3 = bArrA[0];
                                                try {
                                                    if (r3 != 2) {
                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i31 = 0;
                                                    int i32 = 1;
                                                    while (true) {
                                                        int i33 = bArrA[i32] & 255;
                                                        if (i33 != 255) {
                                                            int i34 = i32 + 1;
                                                            int i35 = i31 + i33;
                                                            int i36 = 0;
                                                            while (true) {
                                                                int i37 = bArrA[i34] & 255;
                                                                if (i37 != 255) {
                                                                    int i38 = i34 + 1;
                                                                    int i39 = i36 + i37;
                                                                    if (bArrA[i38] != 1) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i35];
                                                                    System.arraycopy(bArrA, i38, bArr6, 0, i35);
                                                                    int i40 = i38 + i35;
                                                                    if (bArrA[i40] != 3) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i41 = i40 + i39;
                                                                    if (bArrA[i41] != 5) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[bArrA.length - i41];
                                                                    System.arraycopy(bArrA, i41, bArr7, 0, bArrA.length - i41);
                                                                    ArrayList arrayList2 = new ArrayList(2);
                                                                    arrayList2.add(bArr6);
                                                                    arrayList2.add(bArr7);
                                                                    str9 = "audio/vorbis";
                                                                    i6 = 8192;
                                                                    arrayList = arrayList2;
                                                                    iC = -1;
                                                                    list4 = arrayList;
                                                                    str3 = null;
                                                                    list3 = list4;
                                                                    if (mi2Var.P != null) {
                                                                        str3 = (String) zh0VarE.o;
                                                                        str9 = "video/dolby-vision";
                                                                    }
                                                                    boolean z12 = mi2Var.Y;
                                                                    if (mi2Var.X) {
                                                                        i7 = 2;
                                                                    } else {
                                                                        i7 = 0;
                                                                    }
                                                                    int i2117 = (z12 ? 1 : 0) | i7;
                                                                    sb1Var = new sb1();
                                                                    zI = lw2.i(str9);
                                                                    Map map6 = p0;
                                                                    if (zI) {
                                                                        sb1Var.E = mi2Var.Q;
                                                                        sb1Var.F = mi2Var.S;
                                                                        sb1Var.G = iC;
                                                                    } else if (lw2.l(str9)) {
                                                                        if (mi2Var.s == 0) {
                                                                            i11 = mi2Var.q;
                                                                            i8 = -1;
                                                                            if (i11 == -1) {
                                                                                i11 = mi2Var.n;
                                                                            }
                                                                            mi2Var.q = i11;
                                                                            i12 = mi2Var.r;
                                                                            if (i12 == -1) {
                                                                                i12 = mi2Var.o;
                                                                            }
                                                                            mi2Var.r = i12;
                                                                        } else {
                                                                            i8 = -1;
                                                                        }
                                                                        i9 = mi2Var.q;
                                                                        if (i9 != i8) {
                                                                            f = -1.0f;
                                                                        } else {
                                                                            f = -1.0f;
                                                                        }
                                                                        if (mi2Var.z) {
                                                                            if (mi2Var.F != -1.0f) {
                                                                                bArr = null;
                                                                            } else {
                                                                                bArr = null;
                                                                            }
                                                                            int i2118 = mi2Var.A;
                                                                            int i2119 = mi2Var.C;
                                                                            int i21110 = mi2Var.B;
                                                                            int i21111 = mi2Var.p;
                                                                            c50Var = new c50(i2118, i2119, i21110, bArr, i21111, i21111);
                                                                        } else {
                                                                            c50Var = null;
                                                                        }
                                                                        str5 = mi2Var.b;
                                                                        if (str5 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (mi2Var.t == 0) {
                                                                            if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                                                iIntValue = 0;
                                                                            } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                                                iIntValue = 90;
                                                                            } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                                                iIntValue = 180;
                                                                            } else {
                                                                                iIntValue = 180;
                                                                            }
                                                                        }
                                                                        sb1Var.t = mi2Var.n;
                                                                        sb1Var.u = mi2Var.o;
                                                                        sb1Var.z = f;
                                                                        sb1Var.y = iIntValue;
                                                                        sb1Var.A = mi2Var.x;
                                                                        sb1Var.B = mi2Var.y;
                                                                        sb1Var.C = c50Var;
                                                                    } else if (!"application/x-subrip".equals(str9)) {
                                                                        throw ParserException.a(null, "Unexpected MIME type.");
                                                                    }
                                                                    str6 = mi2Var.b;
                                                                    if (str6 != null) {
                                                                        sb1Var.b = mi2Var.b;
                                                                    }
                                                                    sb1Var.a = Integer.toString(i21);
                                                                    if (mi2Var.a) {
                                                                        str7 = "video/webm";
                                                                    } else {
                                                                        str7 = "video/x-matroska";
                                                                    }
                                                                    sb1Var.l = lw2.m(str7);
                                                                    sb1Var.m = lw2.m(str9);
                                                                    sb1Var.n = i6;
                                                                    sb1Var.d = mi2Var.Z;
                                                                    sb1Var.e = i2117;
                                                                    sb1Var.p = list3;
                                                                    sb1Var.j = str3;
                                                                    sb1Var.q = mi2Var.m;
                                                                    mi2Var.b0 = sb1Var.a();
                                                                    mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                                                    sparseArray2.put(mi2Var.d, mi2Var);
                                                                } else {
                                                                    i36 += 255;
                                                                    i34++;
                                                                }
                                                            }
                                                        } else {
                                                            i31 += 255;
                                                            i32++;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw ParserException.a(r3, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r3 = 0;
                                            }
                                            break;
                                        case 5:
                                            str9 = "audio/mpeg-L2";
                                            iC = -1;
                                            i6 = 4096;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z13 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21112 = (z13 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map7 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21113 = mi2Var.A;
                                                    int i21114 = mi2Var.C;
                                                    int i21115 = mi2Var.B;
                                                    int i21116 = mi2Var.p;
                                                    c50Var = new c50(i21113, i21114, i21115, bArr, i21116, i21116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i21112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 6:
                                            str9 = "audio/mpeg";
                                            iC = -1;
                                            i6 = 4096;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z14 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21117 = (z14 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map8 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21118 = mi2Var.A;
                                                    int i21119 = mi2Var.C;
                                                    int i211110 = mi2Var.B;
                                                    int i211111 = mi2Var.p;
                                                    c50Var = new c50(i21118, i21119, i211110, bArr, i211111, i211111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i21117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 7:
                                            be3 be3Var2 = new be3(mi2Var.a(mi2Var.c));
                                            try {
                                                be3Var2.O(16);
                                                long jR = be3Var2.r();
                                                if (jR == 1482049860) {
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        runtimeException = null;
                                                    }
                                                } else {
                                                    if (jR == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (jR == 826496599) {
                                                            int i42 = be3Var2.b + 20;
                                                            byte[] bArr8 = be3Var2.a;
                                                            while (true) {
                                                                if (i42 < bArr8.length - 4) {
                                                                    if (bArr8[i42] == 0 && bArr8[i42 + 1] == 0 && bArr8[i42 + 2] == 1) {
                                                                        if (bArr8[i42 + 3] == 15) {
                                                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i42, bArr8.length)));
                                                                        }
                                                                    }
                                                                    i42++;
                                                                } else {
                                                                    runtimeException = null;
                                                                    try {
                                                                        throw ParserException.a(null, "Failed to find FourCC VC1 initialization data");
                                                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                    }
                                                                }
                                                                throw ParserException.a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        l93.q0("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str2 = null;
                                                }
                                                str9 = (String) pair.first;
                                                str3 = str2;
                                                list = (List) pair.second;
                                                iC = -1;
                                                i6 = -1;
                                                list3 = list;
                                                if (mi2Var.P != null) {
                                                    str3 = (String) zh0VarE.o;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z15 = mi2Var.Y;
                                                if (mi2Var.X) {
                                                    i7 = 2;
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i211112 = (z15 ? 1 : 0) | i7;
                                                sb1Var = new sb1();
                                                zI = lw2.i(str9);
                                                Map map9 = p0;
                                                if (zI) {
                                                    sb1Var.E = mi2Var.Q;
                                                    sb1Var.F = mi2Var.S;
                                                    sb1Var.G = iC;
                                                } else if (lw2.l(str9)) {
                                                    if (mi2Var.s == 0) {
                                                        i11 = mi2Var.q;
                                                        i8 = -1;
                                                        if (i11 == -1) {
                                                            i11 = mi2Var.n;
                                                        }
                                                        mi2Var.q = i11;
                                                        i12 = mi2Var.r;
                                                        if (i12 == -1) {
                                                            i12 = mi2Var.o;
                                                        }
                                                        mi2Var.r = i12;
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    i9 = mi2Var.q;
                                                    if (i9 != i8) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (mi2Var.z) {
                                                        if (mi2Var.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i211113 = mi2Var.A;
                                                        int i211114 = mi2Var.C;
                                                        int i211115 = mi2Var.B;
                                                        int i211116 = mi2Var.p;
                                                        c50Var = new c50(i211113, i211114, i211115, bArr, i211116, i211116);
                                                    } else {
                                                        c50Var = null;
                                                    }
                                                    str5 = mi2Var.b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (mi2Var.t == 0) {
                                                        if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    sb1Var.t = mi2Var.n;
                                                    sb1Var.u = mi2Var.o;
                                                    sb1Var.z = f;
                                                    sb1Var.y = iIntValue;
                                                    sb1Var.A = mi2Var.x;
                                                    sb1Var.B = mi2Var.y;
                                                    sb1Var.C = c50Var;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw ParserException.a(null, "Unexpected MIME type.");
                                                }
                                                str6 = mi2Var.b;
                                                if (str6 != null) {
                                                    sb1Var.b = mi2Var.b;
                                                }
                                                sb1Var.a = Integer.toString(i21);
                                                if (mi2Var.a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                sb1Var.l = lw2.m(str7);
                                                sb1Var.m = lw2.m(str9);
                                                sb1Var.n = i6;
                                                sb1Var.d = mi2Var.Z;
                                                sb1Var.e = i211112;
                                                sb1Var.p = list3;
                                                sb1Var.j = str3;
                                                sb1Var.q = mi2Var.m;
                                                mi2Var.b0 = sb1Var.a();
                                                mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                                sparseArray2.put(mi2Var.d, mi2Var);
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case 8:
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(mi2Var.a(str8), 0, bArr9, 0, 4);
                                            listO = yw1.o(bArr9);
                                            str9 = "application/dvbsubs";
                                            iC = -1;
                                            i6 = -1;
                                            list4 = listO;
                                            str3 = null;
                                            list3 = list4;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z16 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211117 = (z16 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map10 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211118 = mi2Var.A;
                                                    int i211119 = mi2Var.C;
                                                    int i2111110 = mi2Var.B;
                                                    int i2111111 = mi2Var.p;
                                                    c50Var = new c50(i211118, i211119, i2111110, bArr, i2111111, i2111111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i211117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 10:
                                            yn ynVarA = yn.a(new be3(mi2Var.a(mi2Var.c)));
                                            ArrayList arrayList3 = ynVarA.a;
                                            mi2Var.c0 = ynVarA.b;
                                            str4 = ynVarA.l;
                                            str9 = "video/avc";
                                            list2 = arrayList3;
                                            str3 = str4;
                                            list = list2;
                                            iC = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z17 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111112 = (z17 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map11 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111113 = mi2Var.A;
                                                    int i2111114 = mi2Var.C;
                                                    int i2111115 = mi2Var.B;
                                                    int i2111116 = mi2Var.p;
                                                    c50Var = new c50(i2111113, i2111114, i2111115, bArr, i2111116, i2111116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i2111112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 11:
                                            listO = yw1.o(mi2Var.a(str8));
                                            str9 = "application/vobsub";
                                            iC = -1;
                                            i6 = -1;
                                            list4 = listO;
                                            str3 = null;
                                            list3 = list4;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z18 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111117 = (z18 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map12 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111118 = mi2Var.A;
                                                    int i2111119 = mi2Var.C;
                                                    int i21111110 = mi2Var.B;
                                                    int i21111111 = mi2Var.p;
                                                    c50Var = new c50(i2111118, i2111119, i21111110, bArr, i21111111, i21111111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i2111117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 12:
                                            str9 = "audio/vnd.dts.hd";
                                            iC = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z19 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111112 = (z19 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map13 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111113 = mi2Var.A;
                                                    int i21111114 = mi2Var.C;
                                                    int i21111115 = mi2Var.B;
                                                    int i21111116 = mi2Var.p;
                                                    c50Var = new c50(i21111113, i21111114, i21111115, bArr, i21111116, i21111116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i21111112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 13:
                                            List listSingletonList2 = Collections.singletonList(mi2Var.a(str8));
                                            byte[] bArr10 = mi2Var.l;
                                            g gVarD = xl.D(new h00(bArr10.length, bArr10), false);
                                            mi2Var.S = gVarD.b;
                                            mi2Var.Q = gVarD.c;
                                            str9 = "audio/mp4a-latm";
                                            list = listSingletonList2;
                                            str3 = gVarD.a;
                                            iC = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z110 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111117 = (z110 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map14 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111118 = mi2Var.A;
                                                    int i21111119 = mi2Var.C;
                                                    int i211111110 = mi2Var.B;
                                                    int i211111111 = mi2Var.p;
                                                    c50Var = new c50(i21111118, i21111119, i211111110, bArr, i211111111, i211111111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i21111117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 14:
                                            str9 = "audio/ac3";
                                            iC = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z111 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111112 = (z111 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map15 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111113 = mi2Var.A;
                                                    int i211111114 = mi2Var.C;
                                                    int i211111115 = mi2Var.B;
                                                    int i211111116 = mi2Var.p;
                                                    c50Var = new c50(i211111113, i211111114, i211111115, bArr, i211111116, i211111116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i211111112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 15:
                                        case 21:
                                            mi2Var.W = true;
                                            str9 = "audio/vnd.dts";
                                            iC = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z112 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111117 = (z112 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map16 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111118 = mi2Var.A;
                                                    int i211111119 = mi2Var.C;
                                                    int i2111111110 = mi2Var.B;
                                                    int i2111111111 = mi2Var.p;
                                                    c50Var = new c50(i211111118, i211111119, i2111111110, bArr, i2111111111, i2111111111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i211111117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case WaveRetry.MAX_FAILURES /* 16 */:
                                            byte[] bArr11 = mi2Var.l;
                                            listSingletonList = bArr11 == null ? null : yw1.o(bArr11);
                                            str9 = "video/av01";
                                            listO = listSingletonList;
                                            iC = -1;
                                            i6 = -1;
                                            list4 = listO;
                                            str3 = null;
                                            list3 = list4;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z113 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111112 = (z113 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map17 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111113 = mi2Var.A;
                                                    int i2111111114 = mi2Var.C;
                                                    int i2111111115 = mi2Var.B;
                                                    int i2111111116 = mi2Var.p;
                                                    c50Var = new c50(i2111111113, i2111111114, i2111111115, bArr, i2111111116, i2111111116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i2111111112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 17:
                                            str9 = "video/x-vnd.on2.vp8";
                                            iC = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z114 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111117 = (z114 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map18 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111118 = mi2Var.A;
                                                    int i2111111119 = mi2Var.C;
                                                    int i21111111110 = mi2Var.B;
                                                    int i21111111111 = mi2Var.p;
                                                    c50Var = new c50(i2111111118, i2111111119, i21111111110, bArr, i21111111111, i21111111111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i2111111117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 18:
                                            byte[] bArr12 = mi2Var.l;
                                            listSingletonList = bArr12 == null ? null : yw1.o(bArr12);
                                            str9 = "video/x-vnd.on2.vp9";
                                            listO = listSingletonList;
                                            iC = -1;
                                            i6 = -1;
                                            list4 = listO;
                                            str3 = null;
                                            list3 = list4;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z115 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111112 = (z115 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map19 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111113 = mi2Var.A;
                                                    int i21111111114 = mi2Var.C;
                                                    int i21111111115 = mi2Var.B;
                                                    int i21111111116 = mi2Var.p;
                                                    c50Var = new c50(i21111111113, i21111111114, i21111111115, bArr, i21111111116, i21111111116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i21111111112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 19:
                                            str9 = "application/pgs";
                                            iC = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z116 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111117 = (z116 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map110 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111118 = mi2Var.A;
                                                    int i21111111119 = mi2Var.C;
                                                    int i211111111110 = mi2Var.B;
                                                    int i211111111111 = mi2Var.p;
                                                    c50Var = new c50(i21111111118, i21111111119, i211111111110, bArr, i211111111111, i211111111111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i21111111117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 20:
                                            iC = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z117 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111112 = (z117 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map111 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111113 = mi2Var.A;
                                                    int i211111111114 = mi2Var.C;
                                                    int i211111111115 = mi2Var.B;
                                                    int i211111111116 = mi2Var.p;
                                                    c50Var = new c50(i211111111113, i211111111114, i211111111115, bArr, i211111111116, i211111111116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i211111111112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 22:
                                            if (mi2Var.R == 32) {
                                                str9 = "audio/raw";
                                                iC = 4;
                                            } else {
                                                l93.q0("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + mi2Var.R + ". Setting mimeType to audio/x-unknown");
                                                str9 = "audio/x-unknown";
                                                iC = -1;
                                            }
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z118 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111117 = (z118 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map112 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111118 = mi2Var.A;
                                                    int i211111111119 = mi2Var.C;
                                                    int i2111111111110 = mi2Var.B;
                                                    int i2111111111111 = mi2Var.p;
                                                    c50Var = new c50(i211111111118, i211111111119, i2111111111110, bArr, i2111111111111, i2111111111111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i211111111117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 23:
                                            int i43 = mi2Var.R;
                                            if (i43 == 8) {
                                                str9 = "audio/raw";
                                                iC = 3;
                                            } else {
                                                if (i43 == 16) {
                                                    iC = 268435456;
                                                } else if (i43 == 24) {
                                                    iC = 1342177280;
                                                } else if (i43 == 32) {
                                                    iC = 1610612736;
                                                } else {
                                                    l93.q0("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + mi2Var.R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iC = -1;
                                                }
                                                str9 = "audio/raw";
                                            }
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z119 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111112 = (z119 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map113 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111113 = mi2Var.A;
                                                    int i2111111111114 = mi2Var.C;
                                                    int i2111111111115 = mi2Var.B;
                                                    int i2111111111116 = mi2Var.p;
                                                    c50Var = new c50(i2111111111113, i2111111111114, i2111111111115, bArr, i2111111111116, i2111111111116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i2111111111112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 24:
                                            int i44 = mi2Var.R;
                                            String str11 = f35.a;
                                            iC = f35.C(i44, ByteOrder.LITTLE_ENDIAN);
                                            if (iC == 0) {
                                                l93.q0("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + mi2Var.R + ". Setting mimeType to audio/x-unknown");
                                                str9 = "audio/x-unknown";
                                                iC = -1;
                                            } else {
                                                str9 = "audio/raw";
                                            }
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1110 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111117 = (z1110 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map114 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111118 = mi2Var.A;
                                                    int i2111111111119 = mi2Var.C;
                                                    int i21111111111110 = mi2Var.B;
                                                    int i21111111111111 = mi2Var.p;
                                                    c50Var = new c50(i2111111111118, i2111111111119, i21111111111110, bArr, i21111111111111, i21111111111111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i2111111111117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 25:
                                        case 26:
                                            listO = yw1.p(l0, mi2Var.a(str8));
                                            str9 = "text/x-ssa";
                                            iC = -1;
                                            i6 = -1;
                                            list4 = listO;
                                            str3 = null;
                                            list3 = list4;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1111 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111112 = (z1111 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map115 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111113 = mi2Var.A;
                                                    int i21111111111114 = mi2Var.C;
                                                    int i21111111111115 = mi2Var.B;
                                                    int i21111111111116 = mi2Var.p;
                                                    c50Var = new c50(i21111111111113, i21111111111114, i21111111111115, bArr, i21111111111116, i21111111111116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i21111111111112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 27:
                                            zl1 zl1VarA = zl1.a(new be3(mi2Var.a(mi2Var.c)), false, null);
                                            List list6 = zl1VarA.a;
                                            mi2Var.c0 = zl1VarA.b;
                                            str4 = zl1VarA.n;
                                            str9 = "video/hevc";
                                            list2 = list6;
                                            str3 = str4;
                                            list = list2;
                                            iC = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1112 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111117 = (z1112 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map116 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111118 = mi2Var.A;
                                                    int i21111111111119 = mi2Var.C;
                                                    int i211111111111110 = mi2Var.B;
                                                    int i211111111111111 = mi2Var.p;
                                                    c50Var = new c50(i21111111111118, i21111111111119, i211111111111110, bArr, i211111111111111, i211111111111111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i21111111111117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 28:
                                            str9 = "text/vtt";
                                            iC = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1113 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111111112 = (z1113 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map117 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111113 = mi2Var.A;
                                                    int i211111111111114 = mi2Var.C;
                                                    int i211111111111115 = mi2Var.B;
                                                    int i211111111111116 = mi2Var.p;
                                                    c50Var = new c50(i211111111111113, i211111111111114, i211111111111115, bArr, i211111111111116, i211111111111116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i211111111111112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 29:
                                            str9 = "application/x-subrip";
                                            iC = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1114 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111111117 = (z1114 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map118 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111118 = mi2Var.A;
                                                    int i211111111111119 = mi2Var.C;
                                                    int i2111111111111110 = mi2Var.B;
                                                    int i2111111111111111 = mi2Var.p;
                                                    c50Var = new c50(i211111111111118, i211111111111119, i2111111111111110, bArr, i2111111111111111, i2111111111111111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i211111111111117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 30:
                                            str9 = "video/mpeg2";
                                            iC = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1115 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111111112 = (z1115 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map119 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111111113 = mi2Var.A;
                                                    int i2111111111111114 = mi2Var.C;
                                                    int i2111111111111115 = mi2Var.B;
                                                    int i2111111111111116 = mi2Var.p;
                                                    c50Var = new c50(i2111111111111113, i2111111111111114, i2111111111111115, bArr, i2111111111111116, i2111111111111116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i2111111111111112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 31:
                                            str9 = "audio/eac3";
                                            iC = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1116 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111111117 = (z1116 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map1110 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111111118 = mi2Var.A;
                                                    int i2111111111111119 = mi2Var.C;
                                                    int i21111111111111110 = mi2Var.B;
                                                    int i21111111111111111 = mi2Var.p;
                                                    c50Var = new c50(i2111111111111118, i2111111111111119, i21111111111111110, bArr, i21111111111111111, i21111111111111111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i2111111111111117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 32:
                                            listSingletonList = Collections.singletonList(mi2Var.a(str8));
                                            str9 = "audio/flac";
                                            listO = listSingletonList;
                                            iC = -1;
                                            i6 = -1;
                                            list4 = listO;
                                            str3 = null;
                                            list3 = list4;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1117 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111111112 = (z1117 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map1111 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111111113 = mi2Var.A;
                                                    int i21111111111111114 = mi2Var.C;
                                                    int i21111111111111115 = mi2Var.B;
                                                    int i21111111111111116 = mi2Var.p;
                                                    c50Var = new c50(i21111111111111113, i21111111111111114, i21111111111111115, bArr, i21111111111111116, i21111111111111116);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i21111111111111112;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        case 33:
                                            ArrayList arrayList4 = new ArrayList(3);
                                            arrayList4.add(mi2Var.a(mi2Var.c));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList4.add(byteBufferAllocate.order(byteOrder).putLong(mi2Var.T).array());
                                            arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(mi2Var.U).array());
                                            str9 = "audio/opus";
                                            i6 = 5760;
                                            arrayList = arrayList4;
                                            iC = -1;
                                            list4 = arrayList;
                                            str3 = null;
                                            list3 = list4;
                                            if (mi2Var.P != null) {
                                                str3 = (String) zh0VarE.o;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1118 = mi2Var.Y;
                                            if (mi2Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111111117 = (z1118 ? 1 : 0) | i7;
                                            sb1Var = new sb1();
                                            zI = lw2.i(str9);
                                            Map map1112 = p0;
                                            if (zI) {
                                                sb1Var.E = mi2Var.Q;
                                                sb1Var.F = mi2Var.S;
                                                sb1Var.G = iC;
                                            } else if (lw2.l(str9)) {
                                                if (mi2Var.s == 0) {
                                                    i11 = mi2Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = mi2Var.n;
                                                    }
                                                    mi2Var.q = i11;
                                                    i12 = mi2Var.r;
                                                    if (i12 == -1) {
                                                        i12 = mi2Var.o;
                                                    }
                                                    mi2Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = mi2Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (mi2Var.z) {
                                                    if (mi2Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111111118 = mi2Var.A;
                                                    int i21111111111111119 = mi2Var.C;
                                                    int i211111111111111110 = mi2Var.B;
                                                    int i211111111111111111 = mi2Var.p;
                                                    c50Var = new c50(i21111111111111118, i21111111111111119, i211111111111111110, bArr, i211111111111111111, i211111111111111111);
                                                } else {
                                                    c50Var = null;
                                                }
                                                str5 = mi2Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (mi2Var.t == 0) {
                                                    if (Float.compare(mi2Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(mi2Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(mi2Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sb1Var.t = mi2Var.n;
                                                sb1Var.u = mi2Var.o;
                                                sb1Var.z = f;
                                                sb1Var.y = iIntValue;
                                                sb1Var.A = mi2Var.x;
                                                sb1Var.B = mi2Var.y;
                                                sb1Var.C = c50Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = mi2Var.b;
                                            if (str6 != null) {
                                                sb1Var.b = mi2Var.b;
                                            }
                                            sb1Var.a = Integer.toString(i21);
                                            if (mi2Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sb1Var.l = lw2.m(str7);
                                            sb1Var.m = lw2.m(str9);
                                            sb1Var.n = i6;
                                            sb1Var.d = mi2Var.Z;
                                            sb1Var.e = i21111111111111117;
                                            sb1Var.p = list3;
                                            sb1Var.j = str3;
                                            sb1Var.q = mi2Var.m;
                                            mi2Var.b0 = sb1Var.a();
                                            mi2Var.a0 = ni2Var3.j0.t(mi2Var.d, mi2Var.e);
                                            sparseArray2.put(mi2Var.d, mi2Var);
                                            break;
                                        default:
                                            throw ParserException.a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    ni2Var3.y = null;
                                    break;
                            }
                        } else if (i20 != 183) {
                            if (i20 == 19899) {
                                int i45 = ni2Var3.A;
                                if (i45 != -1) {
                                    long j7 = ni2Var3.B;
                                    if (j7 != -1) {
                                        if (i45 == 475249515) {
                                            ni2Var3.K = j7;
                                        }
                                    }
                                }
                                throw ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i20 == 25152) {
                                ni2Var3.h(i20);
                                mi2 mi2Var2 = ni2Var3.y;
                                if (mi2Var2.i) {
                                    vv4 vv4Var = mi2Var2.k;
                                    if (vv4Var == null) {
                                        throw ParserException.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    mi2Var2.m = new ow0(null, true, new nw0(ax.a, null, "video/webm", vv4Var.b));
                                }
                            } else if (i20 == 28032) {
                                ni2Var3.h(i20);
                                mi2 mi2Var3 = ni2Var3.y;
                                if (mi2Var3.i && mi2Var3.j != null) {
                                    throw ParserException.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i20 == 357149030) {
                                if (ni2Var3.t == -9223372036854775807L) {
                                    ni2Var3.t = 1000000L;
                                }
                                long j8 = ni2Var3.u;
                                if (j8 != -9223372036854775807L) {
                                    ni2Var3.v = ni2Var3.n(j8);
                                }
                            } else if (i20 == 374648427) {
                                boolean z20 = z3 ? 1 : 0;
                                if (sparseArray2.size() == 0) {
                                    throw ParserException.a(null, "No valid tracks were found");
                                }
                                boolean z21 = (!ni2Var3.d || ni2Var3.K == -1) ? true : z20 ? 1 : 0;
                                int i46 = -1;
                                int i47 = -1;
                                int i48 = -1;
                                int i49 = -1;
                                for (int i50 = z20 ? 1 : 0; i50 < sparseArray2.size(); i50++) {
                                    mi2 mi2Var4 = (mi2) sparseArray2.valueAt(i50);
                                    int i51 = mi2Var4.e;
                                    if (i51 == 2) {
                                        if (mi2Var4.Y) {
                                            i46 = mi2Var4.d;
                                        }
                                        if (i47 == -1) {
                                            i47 = mi2Var4.d;
                                        }
                                    } else if (i51 == 1) {
                                        if (mi2Var4.Y) {
                                            i48 = mi2Var4.d;
                                        }
                                        if (i49 == -1) {
                                            i49 = mi2Var4.d;
                                        }
                                    }
                                    if (z21) {
                                        mi2Var4.a0.getClass();
                                        if (!mi2Var4.W) {
                                            wv4 wv4Var = mi2Var4.a0;
                                            tb1 tb1Var = mi2Var4.b0;
                                            tb1Var.getClass();
                                            wv4Var.g(tb1Var);
                                        }
                                    }
                                }
                                if (i46 != -1) {
                                    ni2Var3.I = i46;
                                } else if (i47 != -1) {
                                    ni2Var3.I = i47;
                                } else if (i48 != -1) {
                                    ni2Var3.I = i48;
                                } else if (i49 != -1) {
                                    ni2Var3.I = i49;
                                } else {
                                    ni2Var3.I = sparseArray2.size() > 0 ? ((mi2) sparseArray2.valueAt(z20 ? 1 : 0)).d : -1;
                                }
                                if (z21) {
                                    ni2Var3.k();
                                }
                            } else if (i20 == 475249515 && !ni2Var3.z) {
                                int i52 = z3 ? 1 : 0;
                                while (true) {
                                    if (i52 < sparseArray.size()) {
                                        if (((List) sparseArray.valueAt(i52)).isEmpty()) {
                                            i52++;
                                        } else if (ni2Var3.v != -9223372036854775807L) {
                                            for (int i53 = z3 ? 1 : 0; i53 < sparseArray.size(); i53++) {
                                                Collections.sort((List) sparseArray.valueAt(i53));
                                            }
                                            ni2Var3.j0.w(new li2(sparseArray, ni2Var3.v, ni2Var3.I, ni2Var3.s, ni2Var3.r));
                                        }
                                    }
                                    ni2Var3.j0.w(new bo(ni2Var3.v));
                                }
                                ni2Var3.z = z4;
                                ni2Var3.D = z3;
                                int i54 = z3 ? 1 : 0;
                                while (i54 < sparseArray2.size()) {
                                    mi2 mi2Var5 = (mi2) sparseArray2.valueAt(i54);
                                    long j9 = ni2Var3.v;
                                    long j10 = ni2Var3.s;
                                    long j11 = ni2Var3.r;
                                    boolean z22 = z3;
                                    int i55 = z4;
                                    if (mi2Var5.e != 2 || (list5 = (List) sparseArray.get(mi2Var5.d)) == null || list5.isEmpty()) {
                                        i14 = i54;
                                    } else {
                                        if (list5.isEmpty()) {
                                            i14 = i54;
                                        } else {
                                            i14 = i54;
                                            int iMin = Math.min(list5.size(), 20);
                                            double d = 0.0d;
                                            int i56 = z22 ? 1 : 0;
                                            int i57 = -1;
                                            while (i56 < iMin) {
                                                ki2 ki2Var = (ki2) list5.get(i56);
                                                long j12 = j10;
                                                long j13 = ki2Var.n;
                                                long j14 = ki2Var.p;
                                                long j15 = ki2Var.o;
                                                if (j13 > 10000000) {
                                                    if (i57 == -1) {
                                                        j = ((ki2) list5.get(i57 == true ? 1 : 0)).n;
                                                    }
                                                    if (j != -9223372036854775807L) {
                                                        tb1 tb1Var2 = mi2Var5.b0;
                                                        tb1Var2.getClass();
                                                        qv2Var = tb1Var2.l;
                                                        rt4Var = new rt4(j);
                                                        if (qv2Var == null) {
                                                            pv2[] pv2VarArr = new pv2[i55];
                                                            pv2VarArr[z22 ? 1 : 0] = rt4Var;
                                                            qv2VarA = new qv2(pv2VarArr);
                                                        } else {
                                                            pv2[] pv2VarArr2 = new pv2[i55];
                                                            pv2VarArr2[z22 ? 1 : 0] = rt4Var;
                                                            qv2VarA = qv2Var.a(pv2VarArr2);
                                                        }
                                                        sb1 sb1VarA = mi2Var5.b0.a();
                                                        sb1VarA.k = qv2VarA;
                                                        mi2Var5.b0 = new tb1(sb1VarA);
                                                    }
                                                } else {
                                                    if (i56 < list5.size() - 1) {
                                                        ki2 ki2Var2 = (ki2) list5.get(i56 + 1);
                                                        j2 = (ki2Var2.o + ki2Var2.p) - (j15 + j14);
                                                        j3 = ki2Var2.n - j13;
                                                    } else {
                                                        j2 = (j12 + j11) - (j15 + j14);
                                                        j3 = j9 - j13;
                                                    }
                                                    if (j3 > 0) {
                                                        double d2 = j2 / j3;
                                                        if (d2 > d) {
                                                            d = d2;
                                                            i57 = i56;
                                                        }
                                                    }
                                                    i56++;
                                                    j10 = j12;
                                                }
                                            }
                                            if (i57 == -1) {
                                                j = ((ki2) list5.get(i57 == true ? 1 : 0)).n;
                                            }
                                            if (j != -9223372036854775807L) {
                                                tb1 tb1Var3 = mi2Var5.b0;
                                                tb1Var3.getClass();
                                                qv2Var = tb1Var3.l;
                                                rt4Var = new rt4(j);
                                                if (qv2Var == null) {
                                                    pv2[] pv2VarArr3 = new pv2[i55];
                                                    pv2VarArr3[z22 ? 1 : 0] = rt4Var;
                                                    qv2VarA = new qv2(pv2VarArr3);
                                                } else {
                                                    pv2[] pv2VarArr4 = new pv2[i55];
                                                    pv2VarArr4[z22 ? 1 : 0] = rt4Var;
                                                    qv2VarA = qv2Var.a(pv2VarArr4);
                                                }
                                                sb1 sb1VarA2 = mi2Var5.b0.a();
                                                sb1VarA2.k = qv2VarA;
                                                mi2Var5.b0 = new tb1(sb1VarA2);
                                            }
                                        }
                                        j = -9223372036854775807L;
                                        if (j != -9223372036854775807L) {
                                            tb1 tb1Var4 = mi2Var5.b0;
                                            tb1Var4.getClass();
                                            qv2Var = tb1Var4.l;
                                            rt4Var = new rt4(j);
                                            if (qv2Var == null) {
                                                pv2[] pv2VarArr5 = new pv2[i55];
                                                pv2VarArr5[z22 ? 1 : 0] = rt4Var;
                                                qv2VarA = new qv2(pv2VarArr5);
                                            } else {
                                                pv2[] pv2VarArr6 = new pv2[i55];
                                                pv2VarArr6[z22 ? 1 : 0] = rt4Var;
                                                qv2VarA = qv2Var.a(pv2VarArr6);
                                            }
                                            sb1 sb1VarA3 = mi2Var5.b0.a();
                                            sb1VarA3.k = qv2VarA;
                                            mi2Var5.b0 = new tb1(sb1VarA3);
                                        }
                                    }
                                    if (!mi2Var5.W) {
                                        mi2Var5.a0.getClass();
                                        wv4 wv4Var2 = mi2Var5.a0;
                                        tb1 tb1Var5 = mi2Var5.b0;
                                        tb1Var5.getClass();
                                        wv4Var2.g(tb1Var5);
                                    }
                                    i54 = i14 + 1;
                                    z3 = z22 ? 1 : 0;
                                    z4 = true;
                                }
                                ni2Var3.k();
                                i5 = z3 ? 1 : 0;
                            }
                        } else if (!ni2Var3.z) {
                            ni2Var3.g(i20);
                            if (ni2Var3.E != -9223372036854775807L && (i13 = ni2Var3.F) != -1 && ni2Var3.G != -1) {
                                List arrayList5 = (List) sparseArray.get(i13);
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    sparseArray.put(ni2Var3.F, arrayList5);
                                }
                                arrayList5.add(new ki2(ni2Var3.E, ni2Var3.s + ni2Var3.G, ni2Var3.H));
                            }
                        }
                        i5 = 0;
                    } else if (ni2Var3.O != 2) {
                        i5 = 0;
                    } else {
                        mi2 mi2Var6 = (mi2) sparseArray2.get(ni2Var3.U);
                        mi2Var6.a0.getClass();
                        if (ni2Var3.Z > 0 && "A_OPUS".equals(mi2Var6.c)) {
                            be3 be3Var3 = ni2Var3.p;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(ni2Var3.Z).array();
                            be3Var3.getClass();
                            be3Var3.L(bArrArray.length, bArrArray);
                        }
                        int i58 = 0;
                        for (int i59 = 0; i59 < ni2Var3.S; i59++) {
                            i58 += ni2Var3.T[i59];
                        }
                        int i60 = 0;
                        while (i60 < ni2Var3.S) {
                            long j16 = ni2Var3.P + ((long) ((mi2Var6.f * i60) / 1000));
                            int i61 = ni2Var3.W;
                            if (i60 == 0 && !ni2Var3.Y) {
                                i61 |= 1;
                            }
                            int i62 = ni2Var3.T[i60];
                            int i63 = i58 - i62;
                            ni2Var3.i(mi2Var6, j16, i61, i62, i63);
                            i60++;
                            i58 = i63;
                        }
                        i5 = 0;
                        ni2Var3.O = 0;
                    }
                    r2 = l51Var;
                    i2 = i5;
                }
                z5 = true;
                r1 = r2;
                r4 = i2;
            }
            if (z5) {
                long position2 = r1.getPosition();
                ni2Var = this;
                if (ni2Var.J) {
                    ni2Var.L = position2;
                    t71Var.a = ni2Var.K;
                    ni2Var.J = r4;
                    return 1;
                }
                z2 = true;
                if (ni2Var.z) {
                    long j17 = ni2Var.L;
                    if (j17 != -1) {
                        t71Var.a = j17;
                        ni2Var.L = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                z2 = true;
                ni2Var = this;
            }
            z4 = z2;
            z3 = false;
        }
        if (z5) {
            return 0;
        }
        int i64 = 0;
        while (true) {
            SparseArray sparseArray3 = ni2Var.c;
            if (i64 >= sparseArray3.size()) {
                return -1;
            }
            mi2 mi2Var7 = (mi2) sparseArray3.valueAt(i64);
            mi2Var7.a0.getClass();
            my4 my4Var = mi2Var7.V;
            if (my4Var != null) {
                my4Var.a(mi2Var7.a0, mi2Var7.k);
            }
            i64++;
        }
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        x7 x7Var = new x7(13);
        be3 be3Var = (be3) x7Var.p;
        rk0 rk0Var = (rk0) l51Var;
        long j = rk0Var.p;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        rk0Var.e(be3Var.a, 0, 4, false);
        x7Var.o = 4;
        for (long jC = be3Var.C(); jC != 440786851; jC = ((jC << 8) & (-256)) | ((long) (be3Var.a[0] & 255))) {
            int i2 = x7Var.o + 1;
            x7Var.o = i2;
            if (i2 == i) {
                return false;
            }
            rk0Var.e(be3Var.a, 0, 1, false);
        }
        long jC2 = x7Var.c(rk0Var);
        long j3 = x7Var.o;
        if (jC2 != Long.MIN_VALUE && (j == -1 || j3 + jC2 < j)) {
            while (true) {
                long j4 = x7Var.o;
                long j5 = j3 + jC2;
                if (j4 < j5) {
                    if (x7Var.c(rk0Var) == Long.MIN_VALUE) {
                        break;
                    }
                    long jC3 = x7Var.c(rk0Var);
                    if (jC3 < 0 || jC3 > 2147483647L) {
                        break;
                    }
                    if (jC3 != 0) {
                        int i3 = (int) jC3;
                        rk0Var.o(i3, false);
                        x7Var.o += i3;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        this.M = -9223372036854775807L;
        this.O = 0;
        mk0 mk0Var = this.a;
        mk0Var.e = 0;
        mk0Var.b.clear();
        k35 k35Var = mk0Var.c;
        k35Var.a = 0;
        k35Var.b = 0;
        k35 k35Var2 = this.b;
        k35Var2.a = 0;
        k35Var2.b = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.z) {
            this.C.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            my4 my4Var = ((mi2) sparseArray.valueAt(i)).V;
            if (my4Var != null) {
                my4Var.b = false;
                my4Var.c = 0;
            }
            i++;
        }
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        if (this.e) {
            m51Var = new ll(m51Var, this.f);
        }
        this.j0 = m51Var;
    }

    public final void g(int i) {
        if (this.D) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a Cues");
    }

    public final void h(int i) {
        if (this.y != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a TrackEntry");
    }

    public final void i(mi2 mi2Var, long j, int i, int i2, int i3) {
        byte[] bArrJ;
        int i4;
        int i5;
        my4 my4Var = mi2Var.V;
        if (my4Var != null) {
            my4Var.b(mi2Var.a0, j, i, i2, i3, mi2Var.k);
        } else {
            if ("S_TEXT/UTF8".equals(mi2Var.c) || "S_TEXT/ASS".equals(mi2Var.c) || "S_TEXT/SSA".equals(mi2Var.c) || "S_TEXT/WEBVTT".equals(mi2Var.c)) {
                if (this.S > 1) {
                    l93.q0("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.Q;
                    if (j2 == -9223372036854775807L) {
                        l93.q0("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = mi2Var.c;
                        be3 be3Var = this.m;
                        byte[] bArr = be3Var.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrJ = j(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrJ = j(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrJ = j(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i4 = 19;
                                break;
                            default:
                                nz2.c();
                                return;
                        }
                        System.arraycopy(bArrJ, 0, bArr, i4, bArrJ.length);
                        for (int i6 = be3Var.b; i6 < be3Var.c; i6++) {
                            if (be3Var.a[i6] == 0) {
                                be3Var.M(i6);
                                mi2Var.a0.e(be3Var.c, be3Var);
                                i5 = i2 + be3Var.c;
                            }
                        }
                        mi2Var.a0.e(be3Var.c, be3Var);
                        i5 = i2 + be3Var.c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.S;
                be3 be3Var2 = this.p;
                if (i7 > 1) {
                    be3Var2.K(0);
                } else {
                    int i8 = be3Var2.c;
                    mi2Var.a0.b(be3Var2, i8, 2);
                    i5 += i8;
                }
            }
            mi2Var.a0.a(j, i, i5, i3, mi2Var.k);
        }
        this.N = true;
    }

    public final void k() {
        if (!this.x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                m51 m51Var = this.j0;
                m51Var.getClass();
                m51Var.p();
                this.x = false;
                return;
            }
            if (((mi2) sparseArray.valueAt(i)).W) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void l(l51 l51Var, int i) {
        be3 be3Var = this.i;
        if (be3Var.c >= i) {
            return;
        }
        byte[] bArr = be3Var.a;
        if (bArr.length < i) {
            be3Var.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = be3Var.a;
        int i2 = be3Var.c;
        l51Var.readFully(bArr2, i2, i - i2);
        be3Var.M(i);
    }

    public final void m() {
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = 0;
        this.h0 = (byte) 0;
        this.i0 = false;
        this.l.K(0);
    }

    public final long n(long j) throws ParserException {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = f35.a;
        return f35.a0(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
    public final int o(l51 l51Var, mi2 mi2Var, int i, boolean z) {
        int iF;
        int iF2;
        int i2;
        boolean z2;
        int i3;
        if ("S_TEXT/UTF8".equals(mi2Var.c)) {
            p(l51Var, k0, i);
            int i4 = this.b0;
            m();
            return i4;
        }
        if ("S_TEXT/ASS".equals(mi2Var.c) || "S_TEXT/SSA".equals(mi2Var.c)) {
            p(l51Var, m0, i);
            int i5 = this.b0;
            m();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(mi2Var.c)) {
            p(l51Var, n0, i);
            int i6 = this.b0;
            m();
            return i6;
        }
        int i7 = 2;
        if (mi2Var.W) {
            mi2Var.b0.getClass();
            be3 be3Var = new be3(i);
            if (l51Var.e(be3Var.a, 0, i, true)) {
                l51Var.k();
                if (e35.z(be3Var.i()) == 1 && be3Var.a() >= 10) {
                    byte[] bArr = new byte[10];
                    be3Var.k(bArr, 0, 10);
                    be3Var.N(0);
                    int iY = e35.y(bArr);
                    if (iY > 0 && be3Var.a() >= iY + 4) {
                        be3Var.O(iY);
                        if (e35.z(be3Var.m()) == 2) {
                            sb1 sb1VarA = mi2Var.b0.a();
                            sb1VarA.m = lw2.m("audio/vnd.dts.hd");
                            mi2Var.b0 = new tb1(sb1VarA);
                        }
                    }
                }
            }
            mi2Var.a0.g(mi2Var.b0);
            mi2Var.W = false;
            k();
        }
        wv4 wv4Var = mi2Var.a0;
        boolean z3 = this.d0;
        be3 be3Var2 = this.l;
        if (!z3) {
            boolean z4 = mi2Var.i;
            be3 be3Var3 = this.i;
            if (z4) {
                this.W &= -1073741825;
                if (!this.e0) {
                    l51Var.readFully(be3Var3.a, 0, 1);
                    this.a0++;
                    byte b = be3Var3.a[0];
                    if ((b & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.h0 = b;
                    this.e0 = true;
                }
                byte b2 = this.h0;
                if ((b2 & 1) != 1) {
                    i2 = 2;
                } else {
                    boolean z5 = (b2 & 2) == 2;
                    this.W |= 1073741824;
                    if (!this.i0) {
                        be3 be3Var4 = this.n;
                        l51Var.readFully(be3Var4.a, 0, 8);
                        this.a0 += 8;
                        this.i0 = true;
                        be3Var3.a[0] = (byte) ((z5 ? 128 : 0) | 8);
                        be3Var3.N(0);
                        wv4Var.b(be3Var3, 1, 1);
                        this.b0++;
                        be3Var4.N(0);
                        wv4Var.b(be3Var4, 8, 1);
                        this.b0 += 8;
                    }
                    if (z5) {
                        if (!this.f0) {
                            l51Var.readFully(be3Var3.a, 0, 1);
                            this.a0++;
                            be3Var3.N(0);
                            this.g0 = be3Var3.A();
                            this.f0 = true;
                        }
                        int i8 = this.g0 * 4;
                        be3Var3.K(i8);
                        l51Var.readFully(be3Var3.a, 0, i8);
                        this.a0 += i8;
                        short s = (short) ((this.g0 / 2) + 1);
                        int i9 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.q = ByteBuffer.allocate(i9);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i3 = this.g0;
                            if (i10 >= i3) {
                                break;
                            }
                            int iE = be3Var3.E();
                            int i12 = i10 % 2;
                            int i13 = i7;
                            ByteBuffer byteBuffer2 = this.q;
                            if (i12 == 0) {
                                byteBuffer2.putShort((short) (iE - i11));
                            } else {
                                byteBuffer2.putInt(iE - i11);
                            }
                            i10++;
                            i11 = iE;
                            i7 = i13;
                        }
                        i2 = i7;
                        int i14 = (i - this.a0) - i11;
                        int i15 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.q;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.q.putInt(0);
                        }
                        byte[] bArrArray = this.q.array();
                        be3 be3Var5 = this.o;
                        be3Var5.L(i9, bArrArray);
                        wv4Var.b(be3Var5, i9, 1);
                        this.b0 += i9;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 2;
                byte[] bArr2 = mi2Var.j;
                if (bArr2 != null) {
                    be3Var2.L(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(mi2Var.c)) {
                z2 = z;
            } else {
                z2 = mi2Var.g > 0;
            }
            if (z2) {
                this.W |= 268435456;
                this.p.K(0);
                int i16 = (be3Var2.c + i) - this.a0;
                be3Var3.K(4);
                byte[] bArr3 = be3Var3.a;
                bArr3[0] = (byte) ((i16 >> 24) & 255);
                bArr3[1] = (byte) ((i16 >> 16) & 255);
                bArr3[i2] = (byte) ((i16 >> 8) & 255);
                bArr3[3] = (byte) (i16 & 255);
                wv4Var.b(be3Var3, 4, i2);
                this.b0 += 4;
            }
            this.d0 = true;
        }
        int i17 = i + be3Var2.c;
        if (!"V_MPEG4/ISO/AVC".equals(mi2Var.c) && !"V_MPEGH/ISO/HEVC".equals(mi2Var.c)) {
            if (mi2Var.V != null) {
                rr2.w(be3Var2.c == 0);
                mi2Var.V.c(l51Var);
            }
            while (true) {
                int i18 = this.a0;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int iA = be3Var2.a();
                if (iA > 0) {
                    iF2 = Math.min(i19, iA);
                    wv4Var.e(iF2, be3Var2);
                } else {
                    iF2 = wv4Var.f(l51Var, i19, false);
                }
                this.a0 += iF2;
                this.b0 += iF2;
            }
        } else {
            be3 be3Var6 = this.h;
            byte[] bArr4 = be3Var6.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i20 = mi2Var.c0;
            int i21 = 4 - i20;
            while (this.a0 < i17) {
                int i22 = this.c0;
                if (i22 == 0) {
                    int iMin = Math.min(i20, be3Var2.a());
                    l51Var.readFully(bArr4, i21 + iMin, i20 - iMin);
                    if (iMin > 0) {
                        be3Var2.k(bArr4, i21, iMin);
                    }
                    this.a0 += i20;
                    be3Var6.N(0);
                    this.c0 = be3Var6.E();
                    be3 be3Var7 = this.g;
                    be3Var7.N(0);
                    wv4Var.e(4, be3Var7);
                    this.b0 += 4;
                } else {
                    int iA2 = be3Var2.a();
                    if (iA2 > 0) {
                        iF = Math.min(i22, iA2);
                        wv4Var.e(iF, be3Var2);
                    } else {
                        iF = wv4Var.f(l51Var, i22, false);
                    }
                    this.a0 += iF;
                    this.b0 += iF;
                    this.c0 -= iF;
                }
            }
        }
        if ("A_VORBIS".equals(mi2Var.c)) {
            be3 be3Var8 = this.j;
            be3Var8.N(0);
            wv4Var.e(4, be3Var8);
            this.b0 += 4;
        }
        int i23 = this.b0;
        m();
        return i23;
    }

    public final void p(l51 l51Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        be3 be3Var = this.m;
        byte[] bArr2 = be3Var.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            be3Var.getClass();
            be3Var.L(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        l51Var.readFully(be3Var.a, bArr.length, i);
        be3Var.N(0);
        be3Var.M(length);
    }
}
