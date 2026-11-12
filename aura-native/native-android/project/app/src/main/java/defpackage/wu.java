package defpackage;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wu {
    public static final byte[] a;

    static {
        String str = f35.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(be3 be3Var) {
        int i = be3Var.b;
        be3Var.O(4);
        if (be3Var.m() != 1751411826) {
            i += 4;
        }
        be3Var.N(i);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:273:0x0596  */
    /* JADX WARN: Code duplicated, block: B:285:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:291:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:365:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0176  */
    public static void b(be3 be3Var, int i, int i2, int i3, int i4, String str, boolean z, ow0 ow0Var, tu tuVar, int i5) throws ParserException {
        int iH;
        int i6;
        int i7;
        int iH2;
        int iM;
        int i8;
        int i9;
        int i10;
        ow0 ow0VarA;
        String str2;
        int i11;
        int i12;
        int i13;
        int i14;
        int iC;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean zH;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z2;
        boolean zH2;
        int i27;
        int i28;
        String str3;
        be3 be3Var2 = be3Var;
        int iIntValue = i;
        int i29 = i3;
        int[] iArr = fu.q;
        int[] iArr2 = fu.o;
        be3Var2.N(i2 + 16);
        if (z) {
            iH = be3Var2.H();
            be3Var2.O(6);
        } else {
            be3Var2.O(8);
            iH = 0;
        }
        if (iH == 0 || iH == 1) {
            i6 = 2;
            i7 = 4;
            iH2 = be3Var2.H();
            be3Var2.O(6);
            int iB = be3Var2.B();
            be3Var2.N(be3Var2.b - 4);
            iM = be3Var2.m();
            if (iH == 1) {
                be3Var2.O(16);
            }
            i8 = iB;
            i9 = -1;
        } else {
            if (iH != 2) {
                return;
            }
            be3Var2.O(16);
            i6 = 2;
            int iRound = (int) Math.round(Double.longBitsToDouble(be3Var2.u()));
            int iE = be3Var2.E();
            be3Var2.O(4);
            i7 = 4;
            int iE2 = be3Var2.E();
            int iE3 = be3Var2.E();
            boolean z3 = (iE3 & 1) != 0;
            boolean z4 = (iE3 & 2) != 0;
            if (z3) {
                if (iE2 == 32) {
                    i9 = 4;
                } else {
                    i9 = -1;
                }
            } else if (iE2 == 8) {
                i9 = 3;
            } else if (iE2 == 16) {
                i9 = z4 ? 268435456 : 2;
            } else if (iE2 == 24) {
                i9 = z4 ? 1342177280 : 21;
            } else if (iE2 == 32) {
                i9 = z4 ? 1610612736 : 22;
            } else {
                i9 = -1;
            }
            be3Var2.O(8);
            i8 = iRound;
            iH2 = iE;
            iM = 0;
        }
        if (iIntValue == 1767992678) {
            iH2 = -1;
            i8 = -1;
        } else {
            if (iIntValue != 1935764850) {
                i10 = iIntValue == 1935767394 ? 16000 : 8000;
            }
            i8 = i10;
            iH2 = 1;
        }
        int i30 = be3Var2.b;
        if (iIntValue == 1701733217) {
            Pair pairH = h(be3Var2, i2, i29);
            if (pairH != null) {
                iIntValue = ((Integer) pairH.first).intValue();
                ow0VarA = ow0Var == null ? null : ow0Var.a(((qv4) pairH.second).b);
                ((qv4[]) tuVar.c)[i5] = (qv4) pairH.second;
            } else {
                ow0VarA = ow0Var;
            }
            be3Var2.N(i30);
        } else {
            ow0VarA = ow0Var;
        }
        String str4 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue == 1936684916) {
            i9 = i6;
            str2 = "audio/raw";
        } else if (iIntValue == 1953984371) {
            str2 = "audio/raw";
            i9 = 268435456;
        } else if (iIntValue == 1819304813) {
            if (i9 == -1) {
                i9 = i6;
            }
            str2 = "audio/raw";
        } else if (iIntValue == 778924082 || iIntValue == 778924083) {
            str2 = "audio/mpeg";
        } else if (iIntValue == 1835557169) {
            str2 = "audio/mha1";
        } else if (iIntValue == 1835560241) {
            str2 = "audio/mhm1";
        } else if (iIntValue == 1634492771) {
            str2 = "audio/alac";
        } else if (iIntValue == 1634492791) {
            str2 = "audio/g711-alaw";
        } else if (iIntValue == 1970037111) {
            str2 = "audio/g711-mlaw";
        } else if (iIntValue == 1332770163) {
            str2 = "audio/opus";
        } else if (iIntValue == 1716281667) {
            str2 = "audio/flac";
        } else if (iIntValue == 1835823201) {
            str2 = "audio/true-hd";
        } else {
            str2 = iIntValue == 1767992678 ? "audio/iamf" : null;
        }
        ru ruVarC = null;
        String strO = null;
        List listO = null;
        pu puVar = null;
        while (i30 - i2 < i29) {
            be3Var2.N(i30);
            int iM2 = be3Var2.m();
            int i31 = i9;
            wr1.i("childAtomSize must be positive", iM2 > 0);
            int iM3 = be3Var2.m();
            strO = strO;
            if (iM3 == 1835557187) {
                be3Var2.N(i30 + 8);
                be3Var2.O(1);
                int iA = be3Var2.A();
                be3Var2.O(1);
                String str5 = Objects.equals(str2, str4) ? String.format("mhm1.%02X", Integer.valueOf(iA)) : String.format("mha1.%02X", Integer.valueOf(iA));
                int iH3 = be3Var2.H();
                byte[] bArr = new byte[iH3];
                String str6 = str5;
                be3Var2.k(bArr, 0, iH3);
                strO = str6;
                listO = listO == null ? yw1.o(bArr) : yw1.p(bArr, (byte[]) listO.get(0));
            } else if (iM3 == 1835557200) {
                be3Var2.N(i30 + 8);
                int iA2 = be3Var2.A();
                if (iA2 > 0) {
                    byte[] bArr2 = new byte[iA2];
                    be3Var2.k(bArr2, 0, iA2);
                    listO = listO == null ? yw1.o(bArr2) : yw1.p((byte[]) listO.get(0), bArr2);
                }
                listO = listO;
                strO = strO;
            } else {
                if (iM3 == 1702061171 || (z && iM3 == 2002876005)) {
                    String str7 = str2;
                    listO = listO;
                    int i32 = iM2;
                    int i33 = i30;
                    int i34 = iH2;
                    str4 = str4;
                    i11 = iIntValue;
                    if (iM3 == 1702061171) {
                        i13 = i32;
                        i12 = i33;
                        i30 = i12;
                    } else {
                        i12 = be3Var2.b;
                        i30 = i33;
                        wr1.i(null, i12 >= i30);
                        while (true) {
                            i13 = i32;
                            if (i12 - i30 < i13) {
                                be3Var2.N(i12);
                                int iM4 = be3Var2.m();
                                wr1.i("childAtomSize must be positive", iM4 > 0);
                                if (be3Var2.m() != 1702061171) {
                                    i12 += iM4;
                                    i32 = i13;
                                }
                            } else {
                                i12 = -1;
                            }
                        }
                    }
                    if (i12 != -1) {
                        ruVarC = c(i12, be3Var2);
                        String str8 = (String) ruVarC.p;
                        byte[] bArr3 = (byte[]) ruVarC.q;
                        if (bArr3 == null) {
                            iM2 = i13;
                        } else if ("audio/vorbis".equals(str8)) {
                            be3 be3Var3 = new be3(bArr3);
                            be3Var3.O(1);
                            int i35 = 0;
                            while (be3Var3.a() > 0 && be3Var3.j() == 255) {
                                i35 += 255;
                                be3Var3.O(1);
                            }
                            int iA3 = be3Var3.A() + i35;
                            int i36 = 0;
                            while (true) {
                                if (be3Var3.a() > 0) {
                                    iM2 = i13;
                                    if (be3Var3.j() == 255) {
                                        i36 += 255;
                                        be3Var3.O(1);
                                        i13 = iM2;
                                    }
                                } else {
                                    iM2 = i13;
                                }
                            }
                            int iA4 = be3Var3.A() + i36;
                            byte[] bArr4 = new byte[iA3];
                            int i37 = be3Var3.b;
                            System.arraycopy(bArr3, i37, bArr4, 0, iA3);
                            int i38 = i37 + iA3 + iA4;
                            int length = bArr3.length - i38;
                            byte[] bArr5 = new byte[length];
                            System.arraycopy(bArr3, i38, bArr5, 0, length);
                            listO = yw1.p(bArr4, bArr5);
                        } else {
                            iM2 = i13;
                            if ("audio/mp4a-latm".equals(str8)) {
                                g gVarD = xl.D(new h00(bArr3.length, bArr3), false);
                                i8 = gVarD.b;
                                iH2 = gVarD.c;
                                strO = gVarD.a;
                            } else {
                                iH2 = i34;
                                strO = strO;
                            }
                            listO = yw1.o(bArr3);
                            str2 = str8;
                        }
                        str2 = str8;
                        iH2 = i34;
                        strO = strO;
                    } else {
                        iM2 = i13;
                        ruVarC = ruVarC;
                        iH2 = i34;
                        strO = strO;
                        str2 = str7;
                    }
                } else if (iM3 == 1651798644) {
                    be3Var2.N(i30 + 8);
                    be3Var2.O(i7);
                    puVar = new pu(be3Var2.C(), be3Var2.C());
                    listO = listO;
                    strO = strO;
                    str2 = str2;
                } else {
                    str2 = str2;
                    str4 = str4;
                    if (iM3 == 1684103987) {
                        be3Var2.N(i30 + 8);
                        String string = Integer.toString(i4);
                        h00 h00Var = new h00();
                        h00Var.p(be3Var2);
                        int i39 = iArr2[h00Var.i(i6)];
                        h00Var.t(8);
                        int i40 = iArr[h00Var.i(3)];
                        if (h00Var.i(1) != 0) {
                            i40++;
                        }
                        int i41 = fu.r[h00Var.i(5)] * 1000;
                        h00Var.c();
                        be3Var2.N(h00Var.f());
                        sb1 sb1Var = new sb1();
                        sb1Var.a = string;
                        sb1Var.m = lw2.m("audio/ac3");
                        sb1Var.E = i40;
                        sb1Var.F = i39;
                        sb1Var.q = ow0VarA;
                        sb1Var.d = str;
                        sb1Var.h = i41;
                        sb1Var.i = i41;
                        tuVar.d = new tb1(sb1Var);
                        listO = listO;
                        iM2 = iM2;
                        i30 = i30;
                        i14 = iH2;
                        i11 = iIntValue;
                    } else if (iM3 == 1684366131) {
                        be3Var2.N(i30 + 8);
                        String string2 = Integer.toString(i4);
                        h00 h00Var2 = new h00();
                        h00Var2.p(be3Var2);
                        int i42 = h00Var2.i(13) * 1000;
                        h00Var2.t(3);
                        int i43 = iArr2[h00Var2.i(2)];
                        h00Var2.t(10);
                        int i44 = iArr[h00Var2.i(3)];
                        if (h00Var2.i(1) != 0) {
                            i44++;
                        }
                        int i45 = i44;
                        h00Var2.t(3);
                        int i46 = h00Var2.i(4);
                        h00Var2.t(1);
                        if (i46 > 0) {
                            h00Var2.t(6);
                            if (h00Var2.i(1) != 0) {
                                i45 += 2;
                            }
                            h00Var2.t(1);
                        }
                        int i47 = i45;
                        iM2 = iM2;
                        if (h00Var2.b() > 7) {
                            h00Var2.t(7);
                            if (h00Var2.i(1) != 0) {
                                str3 = "audio/eac3-joc";
                            } else {
                                str3 = "audio/eac3";
                            }
                        } else {
                            str3 = "audio/eac3";
                        }
                        h00Var2.c();
                        be3Var2.N(h00Var2.f());
                        sb1 sb1Var2 = new sb1();
                        sb1Var2.a = string2;
                        sb1Var2.m = lw2.m(str3);
                        sb1Var2.E = i47;
                        sb1Var2.F = i43;
                        sb1Var2.q = ow0VarA;
                        sb1Var2.d = str;
                        sb1Var2.i = i42;
                        tuVar.d = new tb1(sb1Var2);
                        i11 = iIntValue;
                        i14 = iH2;
                    } else {
                        listO = listO;
                        iM2 = iM2;
                        if (iM3 == 1684103988) {
                            be3Var2.N(i30 + 8);
                            String string3 = Integer.toString(i4);
                            h00 h00Var3 = new h00();
                            h00Var3.p(be3Var2);
                            int iB2 = h00Var3.b();
                            int i48 = h00Var3.i(3);
                            if (i48 > 1) {
                                throw ParserException.c("Unsupported AC-4 DSI version: " + i48);
                            }
                            int i49 = h00Var3.i(7);
                            int i50 = h00Var3.h() ? 48000 : 44100;
                            h00Var3.t(4);
                            int i51 = h00Var3.i(9);
                            if (i49 > 1) {
                                if (i48 == 0) {
                                    throw ParserException.c("Invalid AC-4 DSI version: " + i48);
                                }
                                if (h00Var3.h()) {
                                    h00Var3.t(16);
                                    if (h00Var3.h()) {
                                        h00Var3.t(128);
                                    }
                                }
                            }
                            if (i48 == 1) {
                                if (h00Var3.b() < 66) {
                                    throw ParserException.c("Invalid AC-4 DSI bitrate.");
                                }
                                h00Var3.t(66);
                                h00Var3.c();
                            }
                            u2 u2Var = new u2();
                            u2Var.a = true;
                            u2Var.b = -1;
                            u2Var.c = -1;
                            u2Var.d = true;
                            u2Var.e = 2;
                            u2Var.f = 1;
                            u2Var.g = 0;
                            int i52 = 0;
                            while (true) {
                                if (i52 < i51) {
                                    if (i48 == 0) {
                                        i18 = i8;
                                        zH = h00Var3.h();
                                        i23 = h00Var3.i(5);
                                        i24 = h00Var3.i(5);
                                        i25 = 0;
                                        i26 = 0;
                                        z2 = false;
                                    } else {
                                        int i53 = i51;
                                        int i54 = h00Var3.i(8);
                                        i18 = i8;
                                        int i55 = h00Var3.i(8);
                                        int i56 = i55 == 255 ? h00Var3.i(16) + i55 : i55;
                                        if (i54 > 2) {
                                            h00Var3.t(i56 * 8);
                                            i52++;
                                            i51 = i53;
                                            i8 = i18;
                                        } else {
                                            int iB3 = (iB2 - h00Var3.b()) / 8;
                                            int i57 = h00Var3.i(5);
                                            i26 = iB3;
                                            z2 = i57 == 31;
                                            zH = false;
                                            i24 = i54;
                                            i23 = i57;
                                            i25 = i56;
                                        }
                                    }
                                    u2Var.f = i24;
                                    i17 = iH2;
                                    if (zH || z2 || i23 != 6) {
                                        u2Var.g = h00Var3.i(3);
                                        if (h00Var3.h()) {
                                            h00Var3.t(5);
                                        }
                                        h00Var3.t(2);
                                        int i58 = 1;
                                        if (i48 == 1 && (i24 == 1 || i24 == 2)) {
                                            h00Var3.t(2);
                                        }
                                        h00Var3.t(5);
                                        h00Var3.t(10);
                                        if (i48 == 1) {
                                            if (i24 > 0) {
                                                u2Var.a = h00Var3.h();
                                            }
                                            if (u2Var.a) {
                                                if (i24 != 1) {
                                                    i27 = 2;
                                                    if (i24 == 2) {
                                                        i28 = h00Var3.i(5);
                                                        if (i28 >= 0 && i28 <= 15) {
                                                            u2Var.b = i28;
                                                        }
                                                        if (i28 >= 11 || i28 > 14) {
                                                            i27 = 2;
                                                        } else {
                                                            u2Var.d = h00Var3.h();
                                                            i27 = 2;
                                                            u2Var.e = h00Var3.i(2);
                                                        }
                                                    }
                                                } else {
                                                    i28 = h00Var3.i(5);
                                                    if (i28 >= 0) {
                                                        u2Var.b = i28;
                                                    }
                                                    if (i28 >= 11) {
                                                        i27 = 2;
                                                    } else {
                                                        i27 = 2;
                                                    }
                                                }
                                                h00Var3.t(24);
                                                i58 = 1;
                                            } else {
                                                i27 = 2;
                                            }
                                            if (i24 == i58 || i24 == i27) {
                                                if (h00Var3.h() && h00Var3.h()) {
                                                    h00Var3.t(i27);
                                                }
                                                if (h00Var3.h()) {
                                                    h00Var3.s();
                                                    int i59 = 8;
                                                    int i60 = h00Var3.i(8);
                                                    int i61 = 0;
                                                    while (i61 < i60) {
                                                        h00Var3.t(i59);
                                                        i61++;
                                                        i59 = 8;
                                                    }
                                                }
                                            }
                                        }
                                        if (!zH && !z2) {
                                            h00Var3.s();
                                            if (i23 == 0 || i23 == 1 || i23 == 2) {
                                                if (i24 == 0) {
                                                    for (int i62 = 0; i62 < 2; i62++) {
                                                        hw.E(h00Var3, u2Var);
                                                    }
                                                } else {
                                                    for (int i63 = 0; i63 < 2; i63++) {
                                                        hw.F(h00Var3, u2Var);
                                                    }
                                                }
                                            } else if (i23 == 3 || i23 == 4) {
                                                if (i24 == 0) {
                                                    for (int i64 = 0; i64 < 3; i64++) {
                                                        hw.E(h00Var3, u2Var);
                                                    }
                                                } else {
                                                    for (int i65 = 0; i65 < 3; i65++) {
                                                        hw.F(h00Var3, u2Var);
                                                    }
                                                }
                                            } else if (i23 != 5) {
                                                int i66 = h00Var3.i(7);
                                                for (int i67 = 0; i67 < i66; i67++) {
                                                    h00Var3.t(8);
                                                }
                                            } else if (i24 == 0) {
                                                hw.E(h00Var3, u2Var);
                                            } else {
                                                int i68 = h00Var3.i(3);
                                                for (int i69 = 0; i69 < i68 + 2; i69++) {
                                                    hw.F(h00Var3, u2Var);
                                                }
                                            }
                                        } else if (i24 == 0) {
                                            hw.E(h00Var3, u2Var);
                                        } else {
                                            hw.F(h00Var3, u2Var);
                                        }
                                        h00Var3.s();
                                        zH2 = h00Var3.h();
                                    } else {
                                        i24 = i24;
                                        zH2 = true;
                                    }
                                    if (zH2) {
                                        int i70 = h00Var3.i(7);
                                        for (int i71 = 0; i71 < i70; i71++) {
                                            h00Var3.t(15);
                                        }
                                    }
                                    if (i24 <= 0) {
                                        i19 = 8;
                                    } else {
                                        if (h00Var3.h()) {
                                            if (h00Var3.b() < 66) {
                                                throw ParserException.c("Can't parse bitrate DSI.");
                                            }
                                            h00Var3.t(66);
                                        }
                                        if (h00Var3.h()) {
                                            h00Var3.c();
                                            h00Var3.u(h00Var3.i(16));
                                            int i72 = h00Var3.i(5);
                                            for (int i73 = 0; i73 < i72; i73++) {
                                                h00Var3.t(3);
                                                h00Var3.t(8);
                                            }
                                            i19 = 8;
                                        } else {
                                            i19 = 8;
                                        }
                                    }
                                    h00Var3.c();
                                    if (i48 == 1) {
                                        int iB4 = ((iB2 - h00Var3.b()) / 8) - i26;
                                        if (i25 < iB4) {
                                            throw ParserException.c("pres_bytes is smaller than presentation bytes read.");
                                        }
                                        h00Var3.u(i25 - iB4);
                                    }
                                    if (u2Var.a && u2Var.b == -1) {
                                        throw ParserException.c("Can't determine channel mode of presentation " + i52);
                                    }
                                } else {
                                    iIntValue = iIntValue;
                                    i17 = iH2;
                                    i18 = i8;
                                    i19 = 8;
                                }
                                if (u2Var.a) {
                                    int i74 = u2Var.b;
                                    boolean z5 = u2Var.d;
                                    int i75 = u2Var.e;
                                    switch (i74) {
                                        case 0:
                                            i21 = 11;
                                            i22 = 1;
                                            break;
                                        case 1:
                                            i21 = 11;
                                            i22 = 2;
                                            break;
                                        case 2:
                                            i21 = 11;
                                            i22 = 3;
                                            break;
                                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                            i21 = 11;
                                            i22 = 5;
                                            break;
                                        case 4:
                                            i21 = 11;
                                            i22 = 6;
                                            break;
                                        case 5:
                                        case 7:
                                        case 9:
                                            i21 = 11;
                                            i22 = 7;
                                            break;
                                        case 6:
                                        case 8:
                                        case 10:
                                            i22 = i19;
                                            i21 = 11;
                                            break;
                                        case 11:
                                            i21 = 11;
                                            i22 = 11;
                                            break;
                                        case 12:
                                            i22 = 12;
                                            i21 = 11;
                                            break;
                                        case 13:
                                            i21 = 11;
                                            i22 = 13;
                                            break;
                                        case 14:
                                            i21 = 11;
                                            i22 = 14;
                                            break;
                                        case 15:
                                            i21 = 11;
                                            i22 = 24;
                                            break;
                                        default:
                                            i21 = 11;
                                            i22 = -1;
                                            break;
                                    }
                                    if (i74 == i21 || i74 == 12 || i74 == 13 || i74 == 14) {
                                        if (!z5) {
                                            i22 -= 2;
                                        }
                                        if (i75 == 0) {
                                            i22 -= 4;
                                        } else if (i75 == 1) {
                                            i22 -= 2;
                                        }
                                    }
                                    i20 = i22;
                                } else {
                                    int i76 = u2Var.c;
                                    int i77 = u2Var.g;
                                    if (i76 > 0) {
                                        i20 = i76 + 1;
                                        if (i77 == 4 && i20 == 17) {
                                            i20 = 21;
                                        }
                                    } else if (i77 == 0) {
                                        i20 = 2;
                                    } else if (i77 == 1) {
                                        i20 = 6;
                                    } else if (i77 == 2) {
                                        i20 = i19;
                                    } else if (i77 == 3) {
                                        i20 = 10;
                                    } else if (i77 != 4) {
                                        l93.q0("Ac4Util", "AC-4 level " + u2Var.g + " has not been defined.");
                                        i20 = 2;
                                    } else {
                                        i20 = 12;
                                    }
                                }
                                if (i20 <= 0) {
                                    throw ParserException.c("Cannot determine channel count of presentation.");
                                }
                                Object[] objArr = {Integer.valueOf(i49), Integer.valueOf(u2Var.f), Integer.valueOf(u2Var.g)};
                                String str9 = f35.a;
                                String str10 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                sb1 sb1Var3 = new sb1();
                                sb1Var3.a = string3;
                                sb1Var3.m = lw2.m("audio/ac4");
                                sb1Var3.E = i20;
                                sb1Var3.F = i50;
                                sb1Var3.q = ow0VarA;
                                sb1Var3.d = str;
                                sb1Var3.j = str10;
                                tuVar.d = new tb1(sb1Var3);
                                i8 = i18;
                                i14 = i17;
                                i11 = iIntValue;
                            }
                        } else {
                            i11 = iIntValue;
                            i30 = i30;
                            int i78 = iH2;
                            int i79 = i8;
                            if (iM3 == 1684892784) {
                                if (iM <= 0) {
                                    throw ParserException.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iM);
                                }
                                i8 = iM;
                                iH2 = 2;
                            } else if (iM3 == 1684305011 || iM3 == 1969517683) {
                                i11 = i11;
                                sb1 sb1Var4 = new sb1();
                                sb1Var4.a = Integer.toString(i4);
                                sb1Var4.m = lw2.m(str2);
                                i14 = i78;
                                sb1Var4.E = i14;
                                i8 = i79;
                                sb1Var4.F = i8;
                                sb1Var4.q = ow0VarA;
                                sb1Var4.d = str;
                                tuVar.d = new tb1(sb1Var4);
                            } else if (iM3 == 1682927731) {
                                int i80 = iM2 - 8;
                                byte[] bArr6 = a;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i80);
                                be3Var2.N(i30 + 8);
                                be3Var2.k(bArrCopyOf, bArr6.length, i80);
                                listO = su3.j(bArrCopyOf);
                                i8 = i79;
                                iH2 = i78;
                            } else {
                                if (iM3 == 1684425825) {
                                    byte[] bArr7 = new byte[iM2 - 8];
                                    bArr7[0] = 102;
                                    bArr7[1] = 76;
                                    bArr7[2] = 97;
                                    bArr7[3] = 67;
                                    be3Var2.N(i30 + 12);
                                    be3Var2.k(bArr7, 4, iM2 - 12);
                                    listO = yw1.o(bArr7);
                                    strO = strO;
                                } else if (iM3 == 1634492771) {
                                    int i81 = iM2 - 12;
                                    byte[] bArr8 = new byte[i81];
                                    be3Var2.N(i30 + 12);
                                    be3Var2.k(bArr8, 0, i81);
                                    byte[] bArr9 = i40.a;
                                    be3 be3Var4 = new be3(bArr8);
                                    be3Var4.N(5);
                                    int iA5 = be3Var4.A();
                                    be3Var4.N(9);
                                    int iA6 = be3Var4.A();
                                    be3Var4.N(20);
                                    int[] iArr3 = {be3Var4.E(), iA6, iA5};
                                    int i82 = iArr3[0];
                                    int i83 = iArr3[1];
                                    int i84 = iArr3[2];
                                    String str11 = f35.a;
                                    int iC2 = f35.C(i84, ByteOrder.LITTLE_ENDIAN);
                                    listO = yw1.o(bArr8);
                                    i31 = iC2;
                                    i8 = i82;
                                    iH2 = i83;
                                    strO = strO;
                                    str2 = str2;
                                    i30 = i30;
                                    i11 = i11;
                                    ruVarC = ruVarC;
                                } else if (iM3 == 1767990114) {
                                    be3Var2.N(i30 + 9);
                                    int iF = be3Var2.F();
                                    byte[] bArr10 = new byte[iF];
                                    be3Var2.k(bArr10, 0, iF);
                                    byte[] bArr11 = i40.a;
                                    be3 be3Var5 = new be3(bArr10);
                                    String str12 = null;
                                    String strY = null;
                                    while (be3Var5.a() > 0 && (str12 == null || strY == null)) {
                                        int iA7 = be3Var5.A();
                                        int i85 = iA7 >> 3;
                                        boolean z6 = (iA7 & 2) != 0;
                                        boolean z7 = (iA7 & 1) != 0;
                                        int iF2 = be3Var5.F();
                                        if (i85 > 4 && i85 < 24 && z6) {
                                            do {
                                            } while ((be3Var5.A() & 128) != 0);
                                            for (i16 = 128; (be3Var5.A() & i16) != 0; i16 = 128) {
                                            }
                                        }
                                        if (z7) {
                                            be3Var5.O(be3Var5.F());
                                        }
                                        int i86 = be3Var5.b + iF2;
                                        if (i85 == 31) {
                                            be3Var5.O(4);
                                            Object[] objArr2 = {Integer.valueOf(be3Var5.A()), Integer.valueOf(be3Var5.A())};
                                            String str13 = f35.a;
                                            str12 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                        } else {
                                            if (i85 == 0) {
                                                while ((be3Var5.A() & 128) != 0) {
                                                }
                                                strY = be3Var5.y(4, StandardCharsets.UTF_8);
                                                if (strY.equals("mp4a")) {
                                                    while ((be3Var5.A() & 128) != 0) {
                                                    }
                                                    be3Var5.O(2);
                                                    h00 h00Var4 = new h00();
                                                    h00Var4.p(be3Var5);
                                                    int i87 = h00Var4.i(5);
                                                    if (i87 == 31) {
                                                        i87 = h00Var4.i(6) + 32;
                                                    }
                                                    strY = strY + ".40." + i87;
                                                }
                                            }
                                            be3Var5.N(i86);
                                        }
                                        be3Var5.N(i86);
                                    }
                                    strO = (str12 == null || strY == null) ? null : b11.o(str12, ".", strY);
                                    listO = yw1.o(bArr10);
                                } else if (iM3 == 1885564227) {
                                    be3Var2.N(i30 + 12);
                                    ByteOrder byteOrder = (be3Var2.A() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                    int iA8 = be3Var2.A();
                                    i11 = i11;
                                    if (i11 == 1768973165) {
                                        iC = f35.C(iA8, byteOrder);
                                        i15 = -1;
                                    } else {
                                        iC = (i11 == 1718641517 && iA8 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i31;
                                        i15 = -1;
                                    }
                                    ruVarC = ruVarC;
                                    i31 = iC;
                                    strO = strO;
                                    str2 = iC != i15 ? "audio/raw" : str2;
                                    i30 = i30;
                                    i8 = i79;
                                    iH2 = i78;
                                } else {
                                    i11 = i11;
                                    i8 = i79;
                                    i14 = i78;
                                }
                                str2 = str2;
                                i30 = i30;
                                i8 = i79;
                                iH2 = i78;
                                i11 = i11;
                            }
                        }
                    }
                    ruVarC = ruVarC;
                    iH2 = i14;
                    strO = strO;
                    str2 = str2;
                    i30 = i30;
                }
                i30 += iM2;
                i7 = 4;
                i6 = 2;
                be3Var2 = be3Var;
                i29 = i3;
                iIntValue = i11;
                ruVarC = ruVarC;
                i9 = i31;
                str4 = str4;
                listO = listO;
            }
            ruVarC = ruVarC;
            i11 = iIntValue;
            i30 += iM2;
            i7 = 4;
            i6 = 2;
            be3Var2 = be3Var;
            i29 = i3;
            iIntValue = i11;
            ruVarC = ruVarC;
            i9 = i31;
            str4 = str4;
            listO = listO;
        }
        String str14 = strO;
        String str15 = str2;
        List list = listO;
        int i88 = iH2;
        int i89 = i9;
        if (((tb1) tuVar.d) != null || str15 == null) {
            return;
        }
        sb1 sb1Var5 = new sb1();
        sb1Var5.a = Integer.toString(i4);
        sb1Var5.m = lw2.m(str15);
        sb1Var5.j = str14;
        sb1Var5.E = i88;
        sb1Var5.F = i8;
        sb1Var5.G = i89;
        sb1Var5.p = list;
        sb1Var5.q = ow0VarA;
        sb1Var5.d = str;
        if (ruVarC != null) {
            ru ruVar = ruVarC;
            sb1Var5.h = jz4.I(ruVar.n);
            sb1Var5.i = jz4.I(ruVar.o);
        } else {
            pu puVar2 = puVar;
            if (puVar2 != null) {
                sb1Var5.h = jz4.I(puVar2.a);
                sb1Var5.i = jz4.I(puVar2.b);
            }
        }
        tuVar.d = new tb1(sb1Var5);
    }

    public static ru c(int i, be3 be3Var) {
        be3Var.N(i + 12);
        be3Var.O(1);
        d(be3Var);
        be3Var.O(2);
        int iA = be3Var.A();
        if ((iA & 128) != 0) {
            be3Var.O(2);
        }
        if ((iA & 64) != 0) {
            be3Var.O(be3Var.A());
        }
        if ((iA & 32) != 0) {
            be3Var.O(2);
        }
        be3Var.O(1);
        d(be3Var);
        String strE = lw2.e(be3Var.A());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new ru(strE, null, -1L, -1L);
        }
        be3Var.O(4);
        long jC = be3Var.C();
        long jC2 = be3Var.C();
        be3Var.O(1);
        int iD = d(be3Var);
        long j = jC2;
        byte[] bArr = new byte[iD];
        be3Var.k(bArr, 0, iD);
        if (j <= 0) {
            j = -1;
        }
        return new ru(strE, bArr, j, jC > 0 ? jC : -1L);
    }

    public static int d(be3 be3Var) {
        int iA = be3Var.A();
        int i = iA & 127;
        while ((iA & 128) == 128) {
            iA = be3Var.A();
            i = (i << 7) | (iA & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public static qv2 f(oy2 oy2Var) {
        oi2 oi2Var;
        py2 py2VarS = oy2Var.s(1751411826);
        py2 py2VarS2 = oy2Var.s(1801812339);
        py2 py2VarS3 = oy2Var.s(1768715124);
        if (py2VarS != null && py2VarS2 != null && py2VarS3 != null) {
            be3 be3Var = py2VarS.p;
            be3Var.N(16);
            if (be3Var.m() == 1835299937) {
                be3 be3Var2 = py2VarS2.p;
                be3Var2.N(12);
                int iM = be3Var2.m();
                String[] strArr = new String[iM];
                for (int i = 0; i < iM; i++) {
                    int iM2 = be3Var2.m();
                    be3Var2.O(4);
                    strArr[i] = be3Var2.y(iM2 - 8, StandardCharsets.UTF_8);
                }
                be3 be3Var3 = py2VarS3.p;
                be3Var3.N(8);
                ArrayList arrayList = new ArrayList();
                while (be3Var3.a() > 8) {
                    int i2 = be3Var3.b;
                    int iM3 = be3Var3.m();
                    int iM4 = be3Var3.m() - 1;
                    if (iM4 < 0 || iM4 >= iM) {
                        xa3.m(iM4, "Skipped metadata with unknown key index: ", "BoxParsers");
                    } else {
                        String str = strArr[iM4];
                        int i3 = i2 + iM3;
                        while (true) {
                            int i4 = be3Var3.b;
                            if (i4 >= i3) {
                                oi2Var = null;
                                break;
                            }
                            int iM5 = be3Var3.m();
                            if (be3Var3.m() == 1684108385) {
                                int iM6 = be3Var3.m();
                                int iM7 = be3Var3.m();
                                int i5 = iM5 - 16;
                                byte[] bArr = new byte[i5];
                                be3Var3.k(bArr, 0, i5);
                                oi2Var = new oi2(str, bArr, iM7, iM6);
                                break;
                            }
                            be3Var3.N(i4 + iM5);
                        }
                        if (oi2Var != null) {
                            arrayList.add(oi2Var);
                        }
                    }
                    be3Var3.N(i2 + iM3);
                }
                if (!arrayList.isEmpty()) {
                    return new qv2(arrayList);
                }
            }
        }
        return null;
    }

    public static uy2 g(be3 be3Var) {
        long jU;
        long jU2;
        be3Var.N(8);
        if (e(be3Var.m()) == 0) {
            jU = be3Var.C();
            jU2 = be3Var.C();
        } else {
            jU = be3Var.u();
            jU2 = be3Var.u();
        }
        return new uy2(jU, jU2, be3Var.C());
    }

    public static Pair h(be3 be3Var, int i, int i2) throws ParserException {
        qv4 qv4Var;
        Pair pairCreate;
        int i3;
        int i4;
        int i5 = be3Var.b;
        while (i5 - i < i2) {
            be3Var.N(i5);
            int iM = be3Var.m();
            wr1.i("childAtomSize must be positive", iM > 0);
            if (be3Var.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strY = null;
                while (i6 - i5 < iM) {
                    be3Var.N(i6);
                    int iM2 = be3Var.m();
                    int iM3 = be3Var.m();
                    if (iM3 == 1718775137) {
                        numValueOf = Integer.valueOf(be3Var.m());
                    } else if (iM3 == 1935894637) {
                        be3Var.O(4);
                        strY = be3Var.y(4, StandardCharsets.UTF_8);
                    } else if (iM3 == 1935894633) {
                        i8 = i6;
                        i7 = iM2;
                    }
                    i6 += iM2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strY) || "cbc1".equals(strY) || "cens".equals(strY) || "cbcs".equals(strY)) {
                    wr1.i("frma atom is mandatory", numValueOf != null);
                    wr1.i("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            qv4Var = null;
                            break;
                        }
                        be3Var.N(i9);
                        int iM4 = be3Var.m();
                        if (be3Var.m() == 1952804451) {
                            int iE = e(be3Var.m());
                            be3Var.O(1);
                            if (iE == 0) {
                                be3Var.O(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iA = be3Var.A();
                                i3 = iA & 15;
                                i4 = (iA & 240) >> 4;
                            }
                            boolean z = be3Var.A() == 1;
                            int iA2 = be3Var.A();
                            byte[] bArr2 = new byte[16];
                            be3Var.k(bArr2, 0, 16);
                            if (z && iA2 == 0) {
                                int iA3 = be3Var.A();
                                byte[] bArr3 = new byte[iA3];
                                be3Var.k(bArr3, 0, iA3);
                                bArr = bArr3;
                            }
                            qv4Var = new qv4(z, strY, iA2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iM4;
                    }
                    wr1.i("tenc atom is mandatory", qv4Var != null);
                    String str = f35.a;
                    pairCreate = Pair.create(numValueOf, qv4Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iM;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:370:0x0802  */
    /* JADX WARN: Code duplicated, block: B:372:0x0822  */
    /* JADX WARN: Code duplicated, block: B:374:0x0828  */
    /* JADX WARN: Code duplicated, block: B:375:0x0837  */
    /* JADX WARN: Code duplicated, block: B:380:0x0859  */
    /* JADX WARN: Code duplicated, block: B:382:0x0867  */
    /* JADX WARN: Code duplicated, block: B:383:0x0876  */
    /* JADX WARN: Code duplicated, block: B:385:0x087c  */
    /* JADX WARN: Code duplicated, block: B:386:0x088b  */
    /* JADX WARN: Code duplicated, block: B:388:0x0891  */
    /* JADX WARN: Code duplicated, block: B:389:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:391:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:393:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:397:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:398:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:401:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:404:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:405:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:407:0x0900  */
    /* JADX WARN: Code duplicated, block: B:412:0x090c  */
    /* JADX WARN: Code duplicated, block: B:415:0x0919 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:419:0x0921  */
    /* JADX WARN: Code duplicated, block: B:422:0x0929  */
    /* JADX WARN: Code duplicated, block: B:425:0x0930  */
    /* JADX WARN: Code duplicated, block: B:427:0x0941 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:431:0x0949  */
    /* JADX WARN: Code duplicated, block: B:434:0x0955  */
    /* JADX WARN: Code duplicated, block: B:435:0x0958  */
    /* JADX WARN: Code duplicated, block: B:437:0x0967  */
    /* JADX WARN: Code duplicated, block: B:600:0x08ba A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:370:0x0802, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static tu i(be3 be3Var, vu vuVar, String str, ow0 ow0Var, boolean z) throws ParserException {
        int i;
        ow0 ow0Var2;
        String str2;
        int i2;
        int i3;
        int i4;
        boolean z2;
        char c;
        String str3;
        int i5;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        int i9;
        byte[] bArrCopyOfRange;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean zH;
        int i14;
        int i15;
        int i16;
        int i17;
        char c2;
        int i18;
        boolean zH2;
        int i19;
        int i20;
        boolean z3;
        int i21;
        int iG;
        c50 c50Var;
        int i22;
        int i23;
        c50 c50Var2;
        int i24;
        int i25;
        zh0 zh0Var;
        ow0 ow0VarA;
        int i26;
        String str4;
        gy3 gy3VarO;
        long j;
        be3 be3Var2 = be3Var;
        vu vuVar2 = vuVar;
        String str5 = str;
        int i27 = vuVar2.a;
        be3Var2.N(12);
        int iM = be3Var2.m();
        boolean z4 = false;
        tu tuVar = new tu(iM, 0);
        int i28 = 0;
        while (i28 < iM) {
            int i29 = be3Var2.b;
            int iM2 = be3Var2.m();
            String str6 = "childAtomSize must be positive";
            wr1.i("childAtomSize must be positive", iM2 > 0 ? true : z4);
            int iM3 = be3Var2.m();
            byte b = 3;
            int i30 = 8;
            byte[] bArr2 = null;
            if (iM3 == 1635148593 || iM3 == 1635148595 || iM3 == 1701733238 || iM3 == 1831958048 || iM3 == 1836070006 || iM3 == 1752589105 || iM3 == 1751479857 || iM3 == 1932670515 || iM3 == 1211250227 || iM3 == 1748121139 || iM3 == 1987063864 || iM3 == 1987063865 || iM3 == 1635135537 || iM3 == 1685479798 || iM3 == 1685479729 || iM3 == 1685481573 || iM3 == 1685481521 || iM3 == 1634760241) {
                int i31 = vuVar2.c;
                be3Var2.N(i29 + 16);
                be3Var2.O(16);
                int iH = be3Var2.H();
                int iH2 = be3Var2.H();
                be3Var2.O(50);
                int i32 = be3Var2.b;
                i = i28;
                if (iM3 == 1701733238) {
                    Pair pairH = h(be3Var2, i29, iM2);
                    if (pairH != null) {
                        iM3 = ((Integer) pairH.first).intValue();
                        ow0VarA = ow0Var == null ? null : ow0Var.a(((qv4) pairH.second).b);
                        ((qv4[]) tuVar.c)[i] = (qv4) pairH.second;
                    } else {
                        i29 = i29;
                        ow0VarA = ow0Var;
                    }
                    be3Var2.N(i32);
                    ow0Var2 = ow0VarA;
                } else {
                    i29 = i29;
                    ow0Var2 = ow0Var;
                }
                if (iM3 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iM3 == 1211250227 ? "video/3gpp" : null;
                }
                ow0 ow0Var3 = ow0Var2;
                i2 = i27;
                i3 = iM;
                int i33 = 8;
                int i34 = 8;
                List listO = null;
                ss0 ss0Var = null;
                ByteBuffer byteBuffer = null;
                String string = null;
                byte[] bArr3 = null;
                zh0 zh0VarE = null;
                pu puVar = null;
                ru ruVar = null;
                String str7 = str2;
                float fE = 1.0f;
                int i35 = -1;
                int i36 = -1;
                int iF = -1;
                boolean z5 = false;
                int i37 = -1;
                int i38 = -1;
                int i39 = -1;
                int i40 = -1;
                int i41 = i32;
                int iG2 = -1;
                while (i41 - i29 < iM2) {
                    be3Var2.N(i41);
                    int i42 = be3Var2.b;
                    int i43 = i41;
                    int iM4 = be3Var2.m();
                    if (iM4 == 0 && be3Var2.b - i29 == iM2) {
                        break;
                    }
                    wr1.i(str6, iM4 > 0);
                    int iM5 = be3Var2.m();
                    int i44 = iM2;
                    if (iM5 == 1635148611) {
                        wr1.i(bArr2, str7 == null);
                        be3Var2.N(i42 + 8);
                        yn ynVarA = yn.a(be3Var2);
                        listO = ynVarA.a;
                        tuVar.a = ynVarA.b;
                        float f = !z5 ? ynVarA.k : fE;
                        String str8 = ynVarA.l;
                        int i45 = ynVarA.j;
                        iF = ynVarA.g;
                        int i46 = ynVarA.h;
                        iG2 = ynVarA.i;
                        int i47 = ynVarA.e;
                        i33 = ynVarA.f;
                        i38 = i45;
                        i5 = iM3;
                        i7 = i35;
                        fE = f;
                        i6 = i47;
                        ss0Var = ss0Var;
                        i9 = i30;
                        str7 = "video/avc";
                        string = str8;
                        i36 = i46;
                    } else {
                        i5 = iM3;
                        if (iM5 == 1752589123) {
                            wr1.i(null, str7 == null);
                            be3Var2.N(i42 + 8);
                            zl1 zl1VarA = zl1.a(be3Var2, false, null);
                            listO = zl1VarA.a;
                            tuVar.a = zl1VarA.b;
                            float f2 = !z5 ? zl1VarA.l : fE;
                            int i48 = zl1VarA.m;
                            int i49 = zl1VarA.c;
                            String str9 = zl1VarA.n;
                            int i50 = zl1VarA.k;
                            if (i50 != -1) {
                                i35 = i50;
                            }
                            int i51 = zl1VarA.d;
                            int i52 = zl1VarA.e;
                            iF = zl1VarA.h;
                            int i53 = zl1VarA.i;
                            int i54 = zl1VarA.j;
                            int i55 = zl1VarA.f;
                            int i56 = zl1VarA.g;
                            ss0Var = zl1VarA.o;
                            i33 = i56;
                            str7 = "video/hevc";
                            fE = f2;
                            i40 = i51;
                            i39 = i52;
                            i36 = i53;
                            i9 = i30;
                            iG2 = i54;
                            i6 = i55;
                            i37 = i49;
                            i7 = i35;
                            i38 = i48;
                            string = str9;
                        } else {
                            int i57 = i35;
                            if (iM5 == 1818785347) {
                                wr1.i("lhvC must follow hvcC atom", "video/hevc".equals(str7));
                                wr1.i("must have at least two layers", ss0Var != null && ((yw1) ss0Var.n).size() >= 2);
                                be3Var2.N(i42 + 8);
                                ss0Var.getClass();
                                zl1 zl1VarA2 = zl1.a(be3Var2, true, ss0Var);
                                wr1.i("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", tuVar.a == zl1VarA2.b);
                                int i58 = zl1VarA2.h;
                                if (i58 != -1) {
                                    wr1.i("colorSpace must be the same for both views", iF == i58);
                                }
                                int i59 = zl1VarA2.i;
                                if (i59 != -1) {
                                    wr1.i("colorRange must be the same for both views", i36 == i59);
                                }
                                int i60 = zl1VarA2.j;
                                if (i60 != -1) {
                                    wr1.i("colorTransfer must be the same for both views", iG2 == i60);
                                }
                                wr1.i("bitdepthLuma must be the same for both views", i34 == zl1VarA2.f);
                                wr1.i("bitdepthChroma must be the same for both views", i33 == zl1VarA2.g);
                                if (listO != null) {
                                    uw1 uw1VarJ = yw1.j();
                                    uw1VarJ.d(listO);
                                    uw1VarJ.d(zl1VarA2.a);
                                    listO = uw1VarJ.f();
                                } else {
                                    wr1.i("initializationData must be already set from hvcC atom", false);
                                }
                                i6 = i34;
                                string = zl1VarA2.n;
                                str7 = "video/mv-hevc";
                                tuVar = tuVar;
                                ss0Var = ss0Var;
                                i9 = i30;
                                i7 = i57;
                                bArr = null;
                                str6 = str6;
                            } else {
                                if (iM5 == 1986361461) {
                                    be3Var2.N(i42 + 8);
                                    int i61 = be3Var2.b;
                                    zh0 zh0Var2 = null;
                                    while (i61 - i42 < iM4) {
                                        be3Var2.N(i61);
                                        int iM6 = be3Var2.m();
                                        wr1.i(str6, iM6 > 0);
                                        int i62 = i33;
                                        if (be3Var2.m() == 1702454643) {
                                            be3Var2.N(i61 + 8);
                                            int i63 = be3Var2.b;
                                            while (true) {
                                                if (i63 - i61 >= iM6) {
                                                    zh0Var = null;
                                                    break;
                                                }
                                                be3Var2.N(i63);
                                                int iM7 = be3Var2.m();
                                                wr1.i(str6, iM7 > 0);
                                                int i64 = i63;
                                                if (be3Var2.m() == 1937011305) {
                                                    be3Var2.O(4);
                                                    int iA = be3Var2.A();
                                                    boolean z6 = (iA & 1) == 1;
                                                    boolean z7 = (iA & 2) == 2;
                                                    boolean z8 = (iA & 8) == i30;
                                                    yl ylVar = new yl();
                                                    ylVar.a = z6;
                                                    ylVar.b = z7;
                                                    ylVar.c = z8;
                                                    zh0Var = new zh0(11, ylVar);
                                                    break;
                                                }
                                                i63 = i64 + iM7;
                                                i30 = 8;
                                            }
                                            zh0Var2 = zh0Var;
                                        } else {
                                            i34 = i34;
                                            i61 = i61;
                                            iM6 = iM6;
                                        }
                                        i61 += iM6;
                                        i33 = i62;
                                        i34 = i34;
                                        i30 = 8;
                                    }
                                    int i65 = i33;
                                    i6 = i34;
                                    hg3 hg3Var = zh0Var2 == null ? null : new hg3(8, zh0Var2);
                                    if (hg3Var != null) {
                                        yl ylVar2 = (yl) ((zh0) hg3Var.o).o;
                                        boolean z9 = ylVar2.c;
                                        if (ss0Var == null || ((yw1) ss0Var.n).size() < 2) {
                                            i24 = i57;
                                            if (i24 == -1) {
                                                i25 = z9 ? 5 : 4;
                                            } else {
                                                i25 = i24;
                                            }
                                        } else {
                                            wr1.i("both eye views must be marked as available", ylVar2.a && ylVar2.b);
                                            wr1.i("for MV-HEVC, eye_views_reversed must be set to false", !z9);
                                            i24 = i57;
                                            i25 = i24;
                                        }
                                    } else {
                                        i24 = i57;
                                        i25 = i24;
                                    }
                                    i7 = i25;
                                    str6 = str6;
                                    str7 = str7;
                                    tuVar = tuVar;
                                    ss0Var = ss0Var;
                                    i33 = i65;
                                    bArr = null;
                                    i9 = 8;
                                } else {
                                    i33 = i33;
                                    i6 = i34;
                                    i7 = i57;
                                    if (iM5 == 1685480259 || iM5 == 1685485123 || iM5 == 1685485379) {
                                        str6 = str6;
                                        str7 = str7;
                                        tuVar = tuVar;
                                        i8 = i36;
                                        ss0Var = ss0Var;
                                        bArr = null;
                                        i9 = 8;
                                        zh0VarE = zh0.E(be3Var2);
                                    } else {
                                        int i66 = 6;
                                        if (iM5 == 1987076931) {
                                            wr1.i(null, str7 == null);
                                            String str10 = i5 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            be3Var2.N(i42 + 12);
                                            byte bA = (byte) be3Var2.A();
                                            byte bA2 = (byte) be3Var2.A();
                                            int iA2 = be3Var2.A();
                                            int i67 = iA2 >> 4;
                                            byte b2 = (byte) ((iA2 >> 1) & 7);
                                            if (str10.equals("video/x-vnd.on2.vp9")) {
                                                byte[] bArr4 = i40.a;
                                                byte[] bArr5 = new byte[12];
                                                bArr5[0] = 1;
                                                bArr5[1] = 1;
                                                bArr5[2] = bA;
                                                bArr5[b] = 2;
                                                bArr5[4] = 1;
                                                bArr5[5] = bA2;
                                                bArr5[6] = b;
                                                bArr5[7] = 1;
                                                bArr5[8] = (byte) i67;
                                                bArr5[9] = 4;
                                                bArr5[10] = 1;
                                                bArr5[11] = b2;
                                                listO = yw1.o(bArr5);
                                            }
                                            boolean z10 = (iA2 & 1) != 0;
                                            int iA3 = be3Var2.A();
                                            int iA4 = be3Var2.A();
                                            iF = c50.f(iA3);
                                            int i68 = z10 ? 1 : 2;
                                            iG2 = c50.g(iA4);
                                            i6 = i67;
                                            str6 = str6;
                                            i5 = i5;
                                            tuVar = tuVar;
                                            str7 = str10;
                                            ss0Var = ss0Var;
                                            i36 = i68;
                                            bArr = null;
                                            i9 = 8;
                                            i7 = i7;
                                            i33 = i6;
                                        } else {
                                            int i69 = 7;
                                            i5 = i5;
                                            if (iM5 == 1635135811) {
                                                int i70 = iM4 - 8;
                                                byte[] bArr6 = new byte[i70];
                                                be3Var2.k(bArr6, 0, i70);
                                                listO = yw1.o(bArr6);
                                                be3Var2.N(i42 + 8);
                                                byte[] bArr7 = be3Var2.a;
                                                h00 h00Var = new h00(bArr7.length, bArr7);
                                                h00Var.q(be3Var2.b * 8);
                                                h00Var.u(1);
                                                int i71 = h00Var.i(b);
                                                h00Var.t(6);
                                                boolean zH3 = h00Var.h();
                                                boolean zH4 = h00Var.h();
                                                int i72 = -1;
                                                if (i71 == 2 && zH3) {
                                                    int i73 = zH4 ? 12 : 10;
                                                    i12 = zH4 ? 12 : 10;
                                                    i10 = i73;
                                                } else {
                                                    if (i71 <= 2) {
                                                        int i74 = zH3 ? 10 : 8;
                                                        i12 = zH3 ? 10 : 8;
                                                        i10 = i74;
                                                    } else {
                                                        i10 = -1;
                                                        i11 = -1;
                                                    }
                                                    h00Var.t(13);
                                                    h00Var.s();
                                                    i13 = h00Var.i(4);
                                                    if (i13 != 1) {
                                                        l93.K("BoxParsers", "Unsupported obu_type: " + i13);
                                                        c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                    } else if (h00Var.h()) {
                                                        l93.K("BoxParsers", "Unsupported obu_extension_flag");
                                                        c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                    } else {
                                                        zH = h00Var.h();
                                                        h00Var.s();
                                                        if (zH || h00Var.i(8) <= 127) {
                                                            i14 = h00Var.i(3);
                                                            h00Var.s();
                                                            if (h00Var.h()) {
                                                                l93.K("BoxParsers", "Unsupported reduced_still_picture_header");
                                                                c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                            } else if (h00Var.h()) {
                                                                l93.K("BoxParsers", "Unsupported timing_info_present_flag");
                                                                c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                            } else {
                                                                if (h00Var.h()) {
                                                                    l93.K("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                    c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                                } else {
                                                                    i15 = 5;
                                                                    i16 = h00Var.i(5);
                                                                    i17 = 0;
                                                                    while (i17 <= i16) {
                                                                        h00Var.t(12);
                                                                        if (h00Var.i(i15) > i69) {
                                                                            h00Var.s();
                                                                        }
                                                                        i17++;
                                                                        i15 = 5;
                                                                        i69 = 7;
                                                                    }
                                                                    c2 = '\f';
                                                                    int i75 = h00Var.i(4);
                                                                    int i76 = h00Var.i(4);
                                                                    h00Var.t(i75 + 1);
                                                                    h00Var.t(i76 + 1);
                                                                    if (h00Var.h()) {
                                                                        i18 = 7;
                                                                        h00Var.t(7);
                                                                    } else {
                                                                        i18 = 7;
                                                                    }
                                                                    h00Var.t(i18);
                                                                    zH2 = h00Var.h();
                                                                    if (zH2) {
                                                                        h00Var.t(2);
                                                                    }
                                                                    if (h00Var.h()) {
                                                                        i19 = 1;
                                                                        i20 = 2;
                                                                    } else {
                                                                        i19 = 1;
                                                                        i20 = h00Var.i(1);
                                                                    }
                                                                    if (i20 > 0 && !h00Var.h()) {
                                                                        h00Var.t(i19);
                                                                    }
                                                                    if (zH2) {
                                                                        h00Var.t(3);
                                                                    }
                                                                    h00Var.t(3);
                                                                    boolean zH5 = h00Var.h();
                                                                    if (i14 == 2 && zH5) {
                                                                        h00Var.s();
                                                                    }
                                                                    if (i14 == 1 && h00Var.h()) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = false;
                                                                    }
                                                                    if (h00Var.h()) {
                                                                        int i77 = h00Var.i(8);
                                                                        int i78 = h00Var.i(8);
                                                                        int i79 = h00Var.i(8);
                                                                        if (z3 && i77 == 1 && i78 == 13 && i79 == 0) {
                                                                            i22 = 1;
                                                                        } else {
                                                                            i22 = h00Var.i(1);
                                                                        }
                                                                        int iF2 = c50.f(i77);
                                                                        if (i22 == 1) {
                                                                            i23 = 1;
                                                                        } else {
                                                                            i23 = 2;
                                                                        }
                                                                        i21 = iF2;
                                                                        iG = c50.g(i78);
                                                                        i72 = i23;
                                                                    } else {
                                                                        i21 = -1;
                                                                        iG = -1;
                                                                    }
                                                                    c50Var = new c50(i21, i72, iG, null, i10, i11);
                                                                }
                                                                int i80 = c50Var.e;
                                                                int i81 = c50Var.f;
                                                                int i82 = c50Var.a;
                                                                int i83 = c50Var.b;
                                                                iG2 = c50Var.c;
                                                                str7 = "video/av01";
                                                                i5 = i5;
                                                                i6 = i80;
                                                                ss0Var = ss0Var;
                                                                i9 = 8;
                                                                i7 = i7;
                                                                i33 = i81;
                                                                iF = i82;
                                                                i36 = i83;
                                                            }
                                                        } else {
                                                            l93.K("BoxParsers", "Excessive obu_size");
                                                            c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                        }
                                                    }
                                                    c50Var = c50Var2;
                                                    c2 = '\f';
                                                    int i84 = c50Var.e;
                                                    int i85 = c50Var.f;
                                                    int i86 = c50Var.a;
                                                    int i87 = c50Var.b;
                                                    iG2 = c50Var.c;
                                                    str7 = "video/av01";
                                                    i5 = i5;
                                                    i6 = i84;
                                                    ss0Var = ss0Var;
                                                    i9 = 8;
                                                    i7 = i7;
                                                    i33 = i85;
                                                    iF = i86;
                                                    i36 = i87;
                                                }
                                                i11 = i12;
                                                h00Var.t(13);
                                                h00Var.s();
                                                i13 = h00Var.i(4);
                                                if (i13 != 1) {
                                                    l93.K("BoxParsers", "Unsupported obu_type: " + i13);
                                                    c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                } else if (h00Var.h()) {
                                                    l93.K("BoxParsers", "Unsupported obu_extension_flag");
                                                    c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                } else {
                                                    zH = h00Var.h();
                                                    h00Var.s();
                                                    if (zH) {
                                                        i14 = h00Var.i(3);
                                                        h00Var.s();
                                                        if (h00Var.h()) {
                                                            l93.K("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                        } else if (h00Var.h()) {
                                                            l93.K("BoxParsers", "Unsupported timing_info_present_flag");
                                                            c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                        } else if (h00Var.h()) {
                                                            l93.K("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                        } else {
                                                            i15 = 5;
                                                            i16 = h00Var.i(5);
                                                            i17 = 0;
                                                            while (i17 <= i16) {
                                                                h00Var.t(12);
                                                                if (h00Var.i(i15) > i69) {
                                                                    h00Var.s();
                                                                }
                                                                i17++;
                                                                i15 = 5;
                                                                i69 = 7;
                                                            }
                                                            c2 = '\f';
                                                            int i710 = h00Var.i(4);
                                                            int i711 = h00Var.i(4);
                                                            h00Var.t(i710 + 1);
                                                            h00Var.t(i711 + 1);
                                                            if (h00Var.h()) {
                                                                i18 = 7;
                                                                h00Var.t(7);
                                                            } else {
                                                                i18 = 7;
                                                            }
                                                            h00Var.t(i18);
                                                            zH2 = h00Var.h();
                                                            if (zH2) {
                                                                h00Var.t(2);
                                                            }
                                                            if (h00Var.h()) {
                                                                i19 = 1;
                                                                i20 = 2;
                                                            } else {
                                                                i19 = 1;
                                                                i20 = h00Var.i(1);
                                                            }
                                                            if (i20 > 0) {
                                                                h00Var.t(i19);
                                                            }
                                                            if (zH2) {
                                                                h00Var.t(3);
                                                            }
                                                            h00Var.t(3);
                                                            boolean zH6 = h00Var.h();
                                                            if (i14 == 2) {
                                                                h00Var.s();
                                                            }
                                                            if (i14 == 1) {
                                                                z3 = false;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            if (h00Var.h()) {
                                                                int i712 = h00Var.i(8);
                                                                int i713 = h00Var.i(8);
                                                                int i714 = h00Var.i(8);
                                                                if (z3) {
                                                                    i22 = h00Var.i(1);
                                                                } else {
                                                                    i22 = h00Var.i(1);
                                                                }
                                                                int iF3 = c50.f(i712);
                                                                if (i22 == 1) {
                                                                    i23 = 1;
                                                                } else {
                                                                    i23 = 2;
                                                                }
                                                                i21 = iF3;
                                                                iG = c50.g(i713);
                                                                i72 = i23;
                                                            } else {
                                                                i21 = -1;
                                                                iG = -1;
                                                            }
                                                            c50Var = new c50(i21, i72, iG, null, i10, i11);
                                                        }
                                                    } else {
                                                        i14 = h00Var.i(3);
                                                        h00Var.s();
                                                        if (h00Var.h()) {
                                                            l93.K("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                        } else if (h00Var.h()) {
                                                            l93.K("BoxParsers", "Unsupported timing_info_present_flag");
                                                            c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                        } else if (h00Var.h()) {
                                                            l93.K("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            c50Var2 = new c50(-1, -1, -1, null, i10, i11);
                                                        } else {
                                                            i15 = 5;
                                                            i16 = h00Var.i(5);
                                                            i17 = 0;
                                                            while (i17 <= i16) {
                                                                h00Var.t(12);
                                                                if (h00Var.i(i15) > i69) {
                                                                    h00Var.s();
                                                                }
                                                                i17++;
                                                                i15 = 5;
                                                                i69 = 7;
                                                            }
                                                            c2 = '\f';
                                                            int i715 = h00Var.i(4);
                                                            int i716 = h00Var.i(4);
                                                            h00Var.t(i715 + 1);
                                                            h00Var.t(i716 + 1);
                                                            if (h00Var.h()) {
                                                                i18 = 7;
                                                                h00Var.t(7);
                                                            } else {
                                                                i18 = 7;
                                                            }
                                                            h00Var.t(i18);
                                                            zH2 = h00Var.h();
                                                            if (zH2) {
                                                                h00Var.t(2);
                                                            }
                                                            if (h00Var.h()) {
                                                                i19 = 1;
                                                                i20 = 2;
                                                            } else {
                                                                i19 = 1;
                                                                i20 = h00Var.i(1);
                                                            }
                                                            if (i20 > 0) {
                                                                h00Var.t(i19);
                                                            }
                                                            if (zH2) {
                                                                h00Var.t(3);
                                                            }
                                                            h00Var.t(3);
                                                            boolean zH7 = h00Var.h();
                                                            if (i14 == 2) {
                                                                h00Var.s();
                                                            }
                                                            if (i14 == 1) {
                                                                z3 = false;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            if (h00Var.h()) {
                                                                int i717 = h00Var.i(8);
                                                                int i718 = h00Var.i(8);
                                                                int i719 = h00Var.i(8);
                                                                if (z3) {
                                                                    i22 = h00Var.i(1);
                                                                } else {
                                                                    i22 = h00Var.i(1);
                                                                }
                                                                int iF4 = c50.f(i717);
                                                                if (i22 == 1) {
                                                                    i23 = 1;
                                                                } else {
                                                                    i23 = 2;
                                                                }
                                                                i21 = iF4;
                                                                iG = c50.g(i718);
                                                                i72 = i23;
                                                            } else {
                                                                i21 = -1;
                                                                iG = -1;
                                                            }
                                                            c50Var = new c50(i21, i72, iG, null, i10, i11);
                                                        }
                                                    }
                                                    int i88 = c50Var.e;
                                                    int i89 = c50Var.f;
                                                    int i810 = c50Var.a;
                                                    int i811 = c50Var.b;
                                                    iG2 = c50Var.c;
                                                    str7 = "video/av01";
                                                    i5 = i5;
                                                    i6 = i88;
                                                    ss0Var = ss0Var;
                                                    i9 = 8;
                                                    i7 = i7;
                                                    i33 = i89;
                                                    iF = i810;
                                                    i36 = i811;
                                                }
                                                c50Var = c50Var2;
                                                c2 = '\f';
                                                int i812 = c50Var.e;
                                                int i813 = c50Var.f;
                                                int i814 = c50Var.a;
                                                int i815 = c50Var.b;
                                                iG2 = c50Var.c;
                                                str7 = "video/av01";
                                                i5 = i5;
                                                i6 = i812;
                                                ss0Var = ss0Var;
                                                i9 = 8;
                                                i7 = i7;
                                                i33 = i813;
                                                iF = i814;
                                                i36 = i815;
                                            } else {
                                                if (iM5 == 1668050025) {
                                                    ByteBuffer byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    byteBufferOrder.position(21);
                                                    byteBufferOrder.putShort(be3Var2.x());
                                                    byteBufferOrder.putShort(be3Var2.x());
                                                    byteBuffer = byteBufferOrder;
                                                } else if (iM5 == 1835295606) {
                                                    ByteBuffer byteBufferOrder2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    short sX = be3Var2.x();
                                                    short sX2 = be3Var2.x();
                                                    short sX3 = be3Var2.x();
                                                    short sX4 = be3Var2.x();
                                                    short sX5 = be3Var2.x();
                                                    short sX6 = be3Var2.x();
                                                    int i90 = i36;
                                                    short sX7 = be3Var2.x();
                                                    short sX8 = be3Var2.x();
                                                    long jC = be3Var2.C();
                                                    long jC2 = be3Var2.C();
                                                    byteBufferOrder2.position(1);
                                                    byteBufferOrder2.putShort(sX5);
                                                    byteBufferOrder2.putShort(sX6);
                                                    byteBufferOrder2.putShort(sX);
                                                    byteBufferOrder2.putShort(sX2);
                                                    byteBufferOrder2.putShort(sX3);
                                                    byteBufferOrder2.putShort(sX4);
                                                    byteBufferOrder2.putShort(sX7);
                                                    byteBufferOrder2.putShort(sX8);
                                                    byteBufferOrder2.putShort((short) (jC / 10000));
                                                    byteBufferOrder2.putShort((short) (jC2 / 10000));
                                                    byteBuffer = byteBufferOrder2;
                                                    i36 = i90;
                                                } else {
                                                    i5 = i5;
                                                    str6 = str6;
                                                    str7 = str7;
                                                    tuVar = tuVar;
                                                    i8 = i36;
                                                    ss0Var = ss0Var;
                                                    if (iM5 == 1681012275) {
                                                        bArr = null;
                                                        wr1.i(null, str7 == null);
                                                        i7 = i7;
                                                        str7 = "video/3gpp";
                                                        i33 = i33;
                                                        i36 = i8;
                                                    } else {
                                                        bArr = null;
                                                        if (iM5 == 1702061171) {
                                                            wr1.i(null, str7 == null);
                                                            ru ruVarC = c(i42, be3Var2);
                                                            String str11 = (String) ruVarC.p;
                                                            byte[] bArr8 = (byte[]) ruVarC.q;
                                                            if (bArr8 != null) {
                                                                listO = yw1.o(bArr8);
                                                            }
                                                            ruVar = ruVarC;
                                                            str7 = str11;
                                                            i36 = i8;
                                                            i9 = 8;
                                                        } else {
                                                            if (iM5 == 1651798644) {
                                                                be3Var2.N(i42 + 8);
                                                                be3Var2.O(4);
                                                                i7 = i7;
                                                                puVar = new pu(be3Var2.C(), be3Var2.C());
                                                            } else if (iM5 == 1885434736) {
                                                                be3Var2.N(i42 + 8);
                                                                i7 = i7;
                                                                fE = be3Var2.E() / be3Var2.E();
                                                                i33 = i33;
                                                                i36 = i8;
                                                                i9 = 8;
                                                                z5 = true;
                                                            } else if (iM5 == 1937126244) {
                                                                int i91 = i42 + 8;
                                                                while (true) {
                                                                    if (i91 - i42 >= iM4) {
                                                                        bArrCopyOfRange = null;
                                                                        break;
                                                                    }
                                                                    be3Var2.N(i91);
                                                                    int iM8 = be3Var2.m();
                                                                    if (be3Var2.m() == 1886547818) {
                                                                        bArrCopyOfRange = Arrays.copyOfRange(be3Var2.a, i91, iM8 + i91);
                                                                        break;
                                                                    }
                                                                    i91 += iM8;
                                                                }
                                                                i7 = i7;
                                                                bArr3 = bArrCopyOfRange;
                                                            } else if (iM5 == 1936995172) {
                                                                int iA5 = be3Var2.A();
                                                                be3Var2.O(3);
                                                                if (iA5 == 0) {
                                                                    int iA6 = be3Var2.A();
                                                                    if (iA6 == 0) {
                                                                        i7 = 0;
                                                                    } else if (iA6 == 1) {
                                                                        i7 = 1;
                                                                    } else if (iA6 == 2) {
                                                                        i7 = 2;
                                                                    } else if (iA6 == 3) {
                                                                        i7 = 3;
                                                                    }
                                                                }
                                                                i7 = i7;
                                                            } else if (iM5 == 1634760259) {
                                                                int i92 = iM4 - 12;
                                                                byte[] bArr9 = new byte[i92];
                                                                be3Var2.N(i42 + 12);
                                                                be3Var2.k(bArr9, 0, i92);
                                                                byte[] bArr10 = i40.a;
                                                                rr2.j(i92, "Invalid APV CSD length: %s", i92 >= 17);
                                                                byte b3 = bArr9[0];
                                                                rr2.j(b3, "Invalid APV CSD version: %s", b3 == 1);
                                                                byte b4 = bArr9[5];
                                                                byte b5 = bArr9[6];
                                                                byte b6 = bArr9[7];
                                                                String str12 = f35.a;
                                                                Locale locale = Locale.US;
                                                                StringBuilder sbT = b11.t("apv1.apvf", ".apvl", b4, b5, ".apvb");
                                                                sbT.append((int) b6);
                                                                string = sbT.toString();
                                                                listO = yw1.o(bArr9);
                                                                be3 be3Var3 = new be3(bArr9);
                                                                h00 h00Var2 = new h00(i92, bArr9);
                                                                i9 = 8;
                                                                h00Var2.q(be3Var3.b * 8);
                                                                h00Var2.u(1);
                                                                int i93 = h00Var2.i(8);
                                                                int i94 = 0;
                                                                int i95 = -1;
                                                                int i96 = -1;
                                                                int i97 = -1;
                                                                int i98 = -1;
                                                                int i99 = -1;
                                                                while (i94 < i93) {
                                                                    h00Var2.u(1);
                                                                    int i100 = h00Var2.i(8);
                                                                    int iG3 = i99;
                                                                    int i101 = i98;
                                                                    int i102 = i97;
                                                                    int i103 = i96;
                                                                    int i104 = i95;
                                                                    int i105 = 0;
                                                                    while (i105 < i100) {
                                                                        h00Var2.t(i66);
                                                                        boolean zH8 = h00Var2.h();
                                                                        h00Var2.s();
                                                                        h00Var2.u(11);
                                                                        h00Var2.t(4);
                                                                        i103 = h00Var2.i(4) + 8;
                                                                        h00Var2.u(1);
                                                                        if (zH8) {
                                                                            int i106 = h00Var2.i(8);
                                                                            int i107 = h00Var2.i(8);
                                                                            h00Var2.u(1);
                                                                            boolean zH9 = h00Var2.h();
                                                                            int iF5 = c50.f(i106);
                                                                            int i108 = zH9 ? 1 : 2;
                                                                            iG3 = c50.g(i107);
                                                                            i102 = i108;
                                                                            i101 = iF5;
                                                                        }
                                                                        i105++;
                                                                        i104 = i103;
                                                                        i66 = 6;
                                                                    }
                                                                    i94++;
                                                                    i95 = i104;
                                                                    i96 = i103;
                                                                    i97 = i102;
                                                                    i98 = i101;
                                                                    i99 = iG3;
                                                                    i66 = 6;
                                                                }
                                                                str7 = "video/apv";
                                                                i6 = i96;
                                                                i36 = i97;
                                                                iF = i98;
                                                                iG2 = i99;
                                                                i7 = i7;
                                                                i33 = i95;
                                                            } else {
                                                                i9 = 8;
                                                                if (iM5 == 1668246642 && iF == -1 && iG2 == -1) {
                                                                    int iM9 = be3Var2.m();
                                                                    if (iM9 == 1852009592 || iM9 == 1852009571) {
                                                                        int iH3 = be3Var2.H();
                                                                        int iH4 = be3Var2.H();
                                                                        be3Var2.O(2);
                                                                        boolean z11 = iM4 == 19 && (be3Var2.A() & 128) != 0;
                                                                        int iF6 = c50.f(iH3);
                                                                        int i109 = z11 ? 1 : 2;
                                                                        iG2 = c50.g(iH4);
                                                                        iF = iF6;
                                                                        i36 = i109;
                                                                    } else {
                                                                        l93.q0("BoxParsers", "Unsupported color type: ".concat(uv.c(iM9)));
                                                                    }
                                                                }
                                                            }
                                                            i33 = i33;
                                                            i36 = i8;
                                                        }
                                                        i7 = i7;
                                                        i33 = i33;
                                                    }
                                                    i9 = 8;
                                                }
                                                bArr = null;
                                                i9 = 8;
                                            }
                                        }
                                    }
                                    i33 = i33;
                                    i36 = i8;
                                }
                            }
                            i41 = i43 + iM4;
                            i35 = i7;
                            bArr2 = bArr;
                            i30 = i9;
                            iM2 = i44;
                            iM3 = i5;
                            str6 = str6;
                            i34 = i6;
                            str7 = str7;
                            ss0Var = ss0Var;
                            tuVar = tuVar;
                            b = 3;
                        }
                    }
                    bArr = null;
                    i41 = i43 + iM4;
                    i35 = i7;
                    bArr2 = bArr;
                    i30 = i9;
                    iM2 = i44;
                    iM3 = i5;
                    str6 = str6;
                    i34 = i6;
                    str7 = str7;
                    ss0Var = ss0Var;
                    tuVar = tuVar;
                    b = 3;
                }
                int i110 = i33;
                int i111 = i34;
                i4 = iM2;
                int i112 = i35;
                String str13 = str7;
                tu tuVar2 = tuVar;
                int i113 = i36;
                byte[] bArr11 = bArr2;
                z2 = false;
                c = '\f';
                if (zh0VarE != null) {
                    string = (String) zh0VarE.o;
                    str3 = "video/dolby-vision";
                } else {
                    str3 = str13;
                }
                String str14 = string;
                if (str3 == null) {
                    str5 = str;
                    tuVar = tuVar2;
                } else {
                    sb1 sb1Var = new sb1();
                    sb1Var.a = Integer.toString(i2);
                    sb1Var.m = lw2.m(str3);
                    sb1Var.j = str14;
                    sb1Var.t = iH;
                    sb1Var.u = iH2;
                    sb1Var.v = i40;
                    sb1Var.w = i39;
                    sb1Var.z = fE;
                    sb1Var.y = i31;
                    sb1Var.A = bArr3;
                    sb1Var.B = i112;
                    sb1Var.p = listO;
                    sb1Var.o = i38;
                    sb1Var.D = i37;
                    sb1Var.q = ow0Var3;
                    str5 = str;
                    sb1Var.d = str5;
                    sb1Var.C = new c50(iF, i113, iG2, byteBuffer != null ? byteBuffer.array() : bArr11, i111, i110);
                    pu puVar2 = puVar;
                    if (puVar2 != null) {
                        sb1Var.h = jz4.I(puVar2.a);
                        sb1Var.i = jz4.I(puVar2.b);
                    } else {
                        ru ruVar2 = ruVar;
                        if (ruVar2 != null) {
                            sb1Var.h = jz4.I(ruVar2.n);
                            sb1Var.i = jz4.I(ruVar2.o);
                        }
                    }
                    tuVar = tuVar2;
                    tuVar.d = new tb1(sb1Var);
                }
            } else {
                if (iM3 == 1836069985 || iM3 == 1701733217 || iM3 == 1633889587 || iM3 == 1700998451 || iM3 == 1633889588 || iM3 == 1835823201 || iM3 == 1685353315 || iM3 == 1685353317 || iM3 == 1685353320 || iM3 == 1685353324 || iM3 == 1685353336 || iM3 == 1935764850 || iM3 == 1935767394 || iM3 == 1819304813 || iM3 == 1936684916 || iM3 == 1953984371 || iM3 == 778924082 || iM3 == 778924083 || iM3 == 1835557169 || iM3 == 1835560241 || iM3 == 1634492771 || iM3 == 1634492791 || iM3 == 1970037111 || iM3 == 1332770163 || iM3 == 1716281667 || iM3 == 1767992678 || iM3 == 1768973165 || iM3 == 1718641517) {
                    be3Var2 = be3Var;
                    i29 = i29;
                    b(be3Var2, iM3, i29, iM2, vuVar2.a, str5, z, ow0Var, tuVar, i28);
                    str5 = str;
                } else if (iM3 == 1414810956 || iM3 == 1954034535 || iM3 == 2004251764 || iM3 == 1937010800 || iM3 == 1664495672 || iM3 == 1836070003) {
                    be3Var2.N(i29 + 16);
                    String str15 = "application/ttml+xml";
                    long j2 = Long.MAX_VALUE;
                    if (iM3 != 1414810956) {
                        if (iM3 == 1954034535) {
                            int i114 = iM2 - 16;
                            byte[] bArr12 = new byte[i114];
                            be3Var2.k(bArr12, 0, i114);
                            gy3VarO = yw1.o(bArr12);
                            str15 = "application/x-quicktime-tx3g";
                            i26 = i29;
                        } else {
                            if (iM3 == 2004251764) {
                                str15 = "application/x-mp4-vtt";
                            } else if (iM3 == 1937010800) {
                                j2 = 0;
                            } else if (iM3 == 1664495672) {
                                tuVar.b = 1;
                                str15 = "application/x-mp4-cea-608";
                            } else {
                                if (iM3 != 1836070003) {
                                    tb4.a();
                                    return null;
                                }
                                int i115 = be3Var2.b;
                                be3Var2.O(4);
                                if (be3Var2.m() == 1702061171) {
                                    byte[] bArr13 = (byte[]) c(i115, be3Var2).q;
                                    if (bArr13 == null || bArr13.length != 64) {
                                        i26 = i29;
                                    } else {
                                        int i116 = vuVar2.d;
                                        int i117 = vuVar2.e;
                                        rr2.w(bArr13.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i118 = 0;
                                        while (i118 < bArr13.length - 3) {
                                            byte[] bArr14 = bArr13;
                                            int iU = jz4.u(bArr13[i118], bArr13[i118 + 1], bArr13[i118 + 2], bArr14[i118 + 3]);
                                            int i119 = (iU >> 16) & 255;
                                            int i120 = ((iU >> 8) & 255) - 128;
                                            int i121 = (iU & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(f35.j(((i121 * 17790) / 10000) + i119, 0, 255) | (f35.j((i119 - ((i121 * 3455) / 10000)) - ((i120 * 7169) / 10000), 0, 255) << 8) | (f35.j(((i120 * 14075) / 10000) + i119, 0, 255) << 16))));
                                            i118 += 4;
                                            bArr13 = bArr14;
                                            i29 = i29;
                                        }
                                        i26 = i29;
                                        StringBuilder sbT2 = b11.t("size: ", "x", i116, i117, "\npalette: ");
                                        sbT2.append(new uc0(", ").b(arrayList));
                                        sbT2.append("\n");
                                        String string2 = sbT2.toString();
                                        String str16 = f35.a;
                                        gy3VarO = yw1.o(string2.getBytes(StandardCharsets.UTF_8));
                                        str4 = "application/vobsub";
                                    }
                                } else {
                                    i26 = i29;
                                    str4 = null;
                                    gy3VarO = null;
                                }
                                str15 = str4;
                            }
                            i26 = i29;
                            gy3VarO = null;
                        }
                        j = j2;
                        if (str15 != null) {
                            sb1 sb1Var2 = new sb1();
                            sb1Var2.a = Integer.toString(i27);
                            sb1Var2.m = lw2.m(str15);
                            sb1Var2.d = str5;
                            sb1Var2.r = j;
                            sb1Var2.p = gy3VarO;
                            tuVar.d = new tb1(sb1Var2);
                        }
                    } else {
                        i26 = i29;
                        gy3VarO = null;
                        j = j2;
                        if (str15 != null) {
                            sb1 sb1Var3 = new sb1();
                            sb1Var3.a = Integer.toString(i27);
                            sb1Var3.m = lw2.m(str15);
                            sb1Var3.d = str5;
                            sb1Var3.r = j;
                            sb1Var3.p = gy3VarO;
                            tuVar.d = new tb1(sb1Var3);
                        }
                    }
                    z2 = false;
                    c = '\f';
                    be3Var2 = be3Var;
                    i4 = iM2;
                    i = i28;
                    i2 = i27;
                    i3 = iM;
                    i29 = i26;
                } else if (iM3 == 1835365492) {
                    be3Var2.N(i29 + 16);
                    if (iM3 == 1835365492) {
                        be3Var2.v();
                        String strV = be3Var2.v();
                        if (strV != null) {
                            sb1 sb1Var4 = new sb1();
                            sb1Var4.a = Integer.toString(i27);
                            sb1Var4.m = lw2.m(strV);
                            tuVar.d = new tb1(sb1Var4);
                        }
                    }
                } else if (iM3 == 1667329389) {
                    sb1 sb1Var5 = new sb1();
                    sb1Var5.a = Integer.toString(i27);
                    sb1Var5.m = lw2.m("application/x-camera-motion");
                    tuVar.d = new tb1(sb1Var5);
                }
                i29 = i29;
                i4 = iM2;
                i = i28;
                i2 = i27;
                i3 = iM;
                z2 = false;
                c = '\f';
            }
            be3Var2.N(i29 + i4);
            i28 = i + 1;
            vuVar2 = vuVar;
            z4 = z2;
            i27 = i2;
            iM = i3;
        }
        return tuVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f7 A[EDGE_INSN: B:106:0x01f7->B:105:0x01f4 BREAK  A[LOOP:18: B:96:0x01d7->B:107:0x0203]] */
    /* JADX WARN: Code duplicated, block: B:107:0x0203 A[LOOP:18: B:96:0x01d7->B:107:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x0230  */
    /* JADX WARN: Code duplicated, block: B:121:0x024f  */
    /* JADX WARN: Code duplicated, block: B:123:0x025a  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:156:0x0303  */
    /* JADX WARN: Code duplicated, block: B:157:0x030d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0321  */
    /* JADX WARN: Code duplicated, block: B:221:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:224:0x0505  */
    /* JADX WARN: Code duplicated, block: B:225:0x0508  */
    /* JADX WARN: Code duplicated, block: B:227:0x050c  */
    /* JADX WARN: Code duplicated, block: B:230:0x0518 A[LOOP:1: B:228:0x0512->B:230:0x0518, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:233:0x052b A[LOOP:2: B:232:0x0529->B:233:0x052b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:236:0x054c  */
    /* JADX WARN: Code duplicated, block: B:238:0x0560 A[LOOP:4: B:237:0x055e->B:238:0x0560, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:243:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:245:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:247:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:249:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:252:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:254:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:255:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:257:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:258:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:261:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:262:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:265:0x05df  */
    /* JADX WARN: Code duplicated, block: B:266:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:269:0x0604  */
    /* JADX WARN: Code duplicated, block: B:271:0x0608  */
    /* JADX WARN: Code duplicated, block: B:273:0x060e A[LOOP:14: B:270:0x0606->B:273:0x060e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:278:0x062c A[EDGE_INSN: B:278:0x062c->B:309:0x06e3 BREAK  A[LOOP:13: B:268:0x0602->B:307:0x06c1]] */
    /* JADX WARN: Code duplicated, block: B:279:0x0645 A[EDGE_INSN: B:279:0x0645->B:309:0x06e3 BREAK  A[LOOP:13: B:268:0x0602->B:307:0x06c1]] */
    /* JADX WARN: Code duplicated, block: B:280:0x064d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:281:0x064f A[ADDED_TO_REGION, LOOP:15: B:281:0x064f->B:283:0x0653, LOOP_START, PHI: r3 r23 r24
  0x064f: PHI (r3v13 int) = (r3v3 int), (r3v14 int) binds: [B:280:0x064d, B:283:0x0653] A[DONT_GENERATE, DONT_INLINE]
  0x064f: PHI (r23v10 int) = (r23v8 int), (r23v12 int) binds: [B:280:0x064d, B:283:0x0653] A[DONT_GENERATE, DONT_INLINE]
  0x064f: PHI (r24v8 int) = (r24v4 int), (r24v9 int) binds: [B:280:0x064d, B:283:0x0653] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:287:0x066c  */
    /* JADX WARN: Code duplicated, block: B:289:0x066f  */
    /* JADX WARN: Code duplicated, block: B:291:0x067d  */
    /* JADX WARN: Code duplicated, block: B:292:0x067f  */
    /* JADX WARN: Code duplicated, block: B:295:0x0684  */
    /* JADX WARN: Code duplicated, block: B:297:0x0695  */
    /* JADX WARN: Code duplicated, block: B:299:0x069b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:305:0x06b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:311:0x06e8 A[DONT_INVERT, LOOP:16: B:311:0x06e8->B:315:0x06f2, LOOP_START, PHI: r24
  0x06e8: PHI (r24v5 int) = (r24v4 int), (r24v6 int) binds: [B:310:0x06e6, B:315:0x06f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:312:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:315:0x06f2 A[LOOP:16: B:311:0x06e8->B:315:0x06f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:316:0x06f8 A[EDGE_INSN: B:316:0x06f8->B:317:0x06f9 BREAK  A[LOOP:16: B:311:0x06e8->B:315:0x06f2]] */
    /* JADX WARN: Code duplicated, block: B:323:0x0705  */
    /* JADX WARN: Code duplicated, block: B:325:0x073f  */
    /* JADX WARN: Code duplicated, block: B:326:0x0742  */
    /* JADX WARN: Code duplicated, block: B:331:0x0761  */
    /* JADX WARN: Code duplicated, block: B:338:0x07a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:339:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:342:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:344:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:350:0x07de  */
    /* JADX WARN: Code duplicated, block: B:353:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:355:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:359:0x0805  */
    /* JADX WARN: Code duplicated, block: B:383:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:386:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:395:0x090f  */
    /* JADX WARN: Code duplicated, block: B:396:0x0911  */
    /* JADX WARN: Code duplicated, block: B:400:0x0926  */
    /* JADX WARN: Code duplicated, block: B:402:0x092e  */
    /* JADX WARN: Code duplicated, block: B:405:0x0958  */
    /* JADX WARN: Code duplicated, block: B:407:0x095e  */
    /* JADX WARN: Code duplicated, block: B:408:0x0960  */
    /* JADX WARN: Code duplicated, block: B:415:0x0974  */
    /* JADX WARN: Code duplicated, block: B:421:0x0987  */
    /* JADX WARN: Code duplicated, block: B:426:0x0995  */
    /* JADX WARN: Code duplicated, block: B:431:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:432:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:434:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:438:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:439:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:442:0x09d7  */
    /* JADX WARN: Code duplicated, block: B:443:0x09da  */
    /* JADX WARN: Code duplicated, block: B:445:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:446:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:448:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:450:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:451:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:453:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:454:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:458:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:460:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:463:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:465:0x0a49  */
    /* JADX WARN: Code duplicated, block: B:468:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:472:0x0a58 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:480:0x0a90  */
    /* JADX WARN: Code duplicated, block: B:500:0x07ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x096a A[EDGE_INSN: B:506:0x096a->B:412:0x096a BREAK  A[LOOP:8: B:403:0x0955->B:411:0x0967], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0967 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0981 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x09a2 A[ADDED_TO_REGION, EDGE_INSN: B:511:0x09a2->B:429:0x09a2 BREAK  A[LOOP:10: B:424:0x098f->B:428:0x099b], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x0a69 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:0x06d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0625 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x06c1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x061f A[EDGE_INSN: B:524:0x061f->B:274:0x061f BREAK  A[LOOP:14: B:270:0x0606->B:273:0x060e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x06f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x06f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x016d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0170  */
    /* JADX WARN: Code duplicated, block: B:84:0x017e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0186  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d9  */
    public static ArrayList j(oy2 oy2Var, zg1 zg1Var, long j, ow0 ow0Var, boolean z, boolean z2, eg1 eg1Var, boolean z3) throws ParserException {
        int i;
        int i2;
        long j2;
        long jA0;
        long jC;
        ArrayList arrayList;
        int i3;
        vu vuVar;
        long j3;
        long j4;
        long j5;
        long jA1;
        be3 be3Var;
        int iE;
        int i4;
        long jC2;
        int i5;
        int i6;
        int i7;
        long j6;
        char[] cArr;
        int i8;
        String str;
        py2 py2VarS;
        tu tuVarI;
        long[] jArr;
        long[] jArr2;
        tb1 tb1Var;
        int i9;
        tb1 tb1Var2;
        pv4 pv4Var;
        ny2 ny2Var;
        qv2 qv2Var;
        qv2 qv2Var2;
        oy2 oy2VarR;
        Pair pairCreate;
        char c;
        long jG;
        long j7;
        su suVar;
        boolean z4;
        int iE2;
        int iE3;
        int iE4;
        int iF;
        su suVar2;
        boolean z5;
        ArrayList arrayList2;
        boolean z6;
        long[] jArr3;
        int[] iArr;
        long[] jArrCopyOf;
        int[] iArr2;
        int i10;
        int i11;
        int i12;
        int i13;
        long j8;
        long j9;
        long j10;
        int i14;
        int iM;
        int i15;
        int iE5;
        int i16;
        int iE6;
        be3 be3Var2;
        int i17;
        ArrayList arrayList3;
        long[] jArr4;
        int[] iArrCopyOf;
        int i18;
        int[] iArr3;
        int i19;
        boolean z7;
        String str2;
        int i20;
        long[] jArr5;
        int i21;
        long j11;
        long j12;
        boolean zA;
        int i22;
        int iL;
        long[] jArr6;
        int[] iArr4;
        int i23;
        long[] jArr7;
        ArrayList arrayList4;
        int i24;
        long[] jArr8;
        int[] iArr5;
        int[] iArr6;
        long j13;
        int i25;
        long j14;
        tb1 tb1Var3;
        long[] jArr9;
        long[] jArr10;
        long jA2;
        int[] iArrN;
        long[] jArr11;
        long j15;
        long j16;
        int i26;
        boolean z8;
        int[] iArr7;
        int[] iArr8;
        int i27;
        int i28;
        boolean z9;
        int i29;
        int[] iArr9;
        boolean z10;
        boolean z11;
        long[] jArr12;
        int[] iArr10;
        int[] iArr11;
        ArrayList arrayList5;
        long[] jArr13;
        int i30;
        boolean z12;
        int i31;
        int i32;
        long j17;
        tb1 tb1Var4;
        xv4 xv4Var;
        long j18;
        int i33;
        int i34;
        int i35;
        int i36;
        long jA3;
        int[] iArr12;
        long j19;
        int i37;
        long jA4;
        int iB;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        boolean z13;
        int i43;
        xv4 xv4Var2;
        int i44;
        long jA5;
        long jA6;
        int i45;
        long[] jArr14;
        int[] iArr13;
        long j20;
        int i46;
        int i47;
        int iG;
        long[] jArr15;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        long j21;
        int i53;
        int i54;
        int i55;
        oy2 oy2Var2 = oy2Var;
        ArrayList arrayList6 = new ArrayList();
        int i56 = 0;
        for (ArrayList arrayList7 = oy2Var2.r; i56 < arrayList7.size(); arrayList7 = arrayList) {
            oy2 oy2Var3 = (oy2) arrayList7.get(i56);
            if (oy2Var3.o != 1953653099) {
                arrayList = arrayList7;
                arrayList6 = arrayList6;
                i2 = i56;
            } else {
                py2 py2VarS2 = oy2Var2.s(1836476516);
                py2VarS2.getClass();
                oy2 oy2VarR2 = oy2Var3.r(1835297121);
                oy2VarR2.getClass();
                py2 py2VarS3 = oy2VarR2.s(1751411826);
                py2VarS3.getClass();
                be3 be3Var3 = py2VarS3.p;
                be3Var3.N(16);
                int iM2 = be3Var3.m();
                if (iM2 == 1936684398) {
                    i = 1;
                } else if (iM2 == 1986618469) {
                    i = 2;
                } else if (iM2 == 1952807028 || iM2 == 1935832172 || iM2 == 1937072756 || iM2 == 1668047728 || iM2 == 1937072752) {
                    i = 3;
                } else {
                    i = iM2 == 1835365473 ? 5 : -1;
                }
                int i57 = 1;
                i2 = i56;
                if (i == -1) {
                    arrayList = arrayList7;
                    pv4Var = null;
                    j2 = 0;
                } else {
                    j2 = 0;
                    py2 py2VarS4 = oy2Var3.s(1953196132);
                    py2VarS4.getClass();
                    be3 be3Var4 = py2VarS4.p;
                    be3Var4.N(8);
                    int iE7 = e(be3Var4.m());
                    be3Var4.O(iE7 != 0 ? 16 : 8);
                    int iM3 = be3Var4.m();
                    be3Var4.O(4);
                    int i58 = be3Var4.b;
                    int i59 = iE7 == 0 ? 4 : 8;
                    int i60 = 0;
                    while (true) {
                        jA0 = -9223372036854775807L;
                        if (i60 >= i59) {
                            be3Var4.O(i59);
                        } else {
                            if (be3Var4.a[i58 + i60] != -1) {
                                jC = iE7 == 0 ? be3Var4.C() : be3Var4.G();
                                if (jC != 0) {
                                    break;
                                }
                                break;
                            }
                            i60++;
                        }
                        jC = -9223372036854775807L;
                        break;
                    }
                    be3Var4.O(10);
                    int iH = be3Var4.H();
                    be3Var4.O(4);
                    int iM4 = be3Var4.m();
                    int iM5 = be3Var4.m();
                    be3Var4.O(4);
                    int iM6 = be3Var4.m();
                    int iM7 = be3Var4.m();
                    if (iM4 == 0 && iM5 == 65536) {
                        arrayList = arrayList7;
                        if ((iM6 == -65536 || iM6 == 65536) && iM7 == 0) {
                            i3 = 90;
                        }
                        be3Var4.O(16);
                        short sX = be3Var4.x();
                        be3Var4.O(2);
                        short sX2 = be3Var4.x();
                        vuVar = new vu();
                        vuVar.a = iM3;
                        vuVar.b = iH;
                        vuVar.c = i3;
                        vuVar.d = sX;
                        vuVar.e = sX2;
                        if (j == -9223372036854775807L) {
                            j3 = jC;
                        } else {
                            j3 = j;
                        }
                        j4 = g(py2VarS2.p).c;
                        if (j3 == -9223372036854775807L) {
                            j5 = j4;
                            jA1 = -9223372036854775807L;
                        } else {
                            String str3 = f35.a;
                            j5 = j4;
                            jA1 = f35.a0(j3, 1000000L, j5, RoundingMode.DOWN);
                        }
                        oy2 oy2VarR3 = oy2VarR2.r(1835626086);
                        oy2VarR3.getClass();
                        oy2 oy2VarR4 = oy2VarR3.r(1937007212);
                        oy2VarR4.getClass();
                        py2 py2VarS5 = oy2VarR2.s(1835296868);
                        py2VarS5.getClass();
                        be3Var = py2VarS5.p;
                        be3Var.N(8);
                        iE = e(be3Var.m());
                        if (iE == 0) {
                            i4 = 8;
                        } else {
                            i4 = 16;
                        }
                        be3Var.O(i4);
                        jC2 = be3Var.C();
                        i5 = be3Var.b;
                        if (iE == 0) {
                            i6 = 4;
                        } else {
                            i6 = 8;
                        }
                        i7 = 0;
                        while (true) {
                            if (i7 < i6) {
                                be3Var.O(i6);
                                break;
                            }
                            if (be3Var.a[i5 + i7] != -1) {
                                if (iE == 0) {
                                    jG = be3Var.C();
                                } else {
                                    jG = be3Var.G();
                                }
                                j7 = jG;
                                if (j7 != 0) {
                                    break;
                                }
                                String str4 = f35.a;
                                jA0 = f35.a0(j7, 1000000L, jC2, RoundingMode.DOWN);
                                break;
                            }
                            i7++;
                        }
                        j6 = jA0;
                        int iH2 = be3Var.H();
                        cArr = new char[]{(char) (((iH2 >> 10) & 31) + 96), (char) (((iH2 >> 5) & 31) + 96), (char) ((iH2 & 31) + 96)};
                        i8 = 0;
                        while (true) {
                            if (i8 < 3) {
                                str = new String(cArr);
                                break;
                            }
                            c = cArr[i8];
                            if (c >= 'a' || c > 'z') {
                                str = null;
                                break;
                            }
                            i8++;
                        }
                        py2VarS = oy2VarR4.s(1937011556);
                        if (py2VarS == null) {
                            l93.q0("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        } else {
                            tuVarI = i(py2VarS.p, vuVar, str, ow0Var, z2);
                            if (!z || (oy2VarR = oy2Var3.r(1701082227)) == null) {
                                jArr = null;
                                jArr2 = null;
                            } else {
                                py2 py2VarS6 = oy2VarR.s(1701606260);
                                if (py2VarS6 == null) {
                                    pairCreate = null;
                                } else {
                                    be3 be3Var5 = py2VarS6.p;
                                    be3Var5.N(8);
                                    int iE8 = e(be3Var5.m());
                                    int iE9 = be3Var5.E();
                                    long[] jArr16 = new long[iE9];
                                    long[] jArr17 = new long[iE9];
                                    int i61 = 0;
                                    while (i61 < iE9) {
                                        int i62 = i57;
                                        jArr16[i61] = iE8 == i62 ? be3Var5.G() : be3Var5.C();
                                        jArr17[i61] = iE8 == i62 ? be3Var5.u() : be3Var5.m();
                                        if (be3Var5.x() != 1) {
                                            kf2.n("Unsupported media rate.");
                                            return null;
                                        }
                                        be3Var5.O(2);
                                        i61++;
                                        i57 = 1;
                                    }
                                    pairCreate = Pair.create(jArr16, jArr17);
                                }
                                if (pairCreate != null) {
                                    long[] jArr18 = (long[]) pairCreate.first;
                                    jArr2 = (long[]) pairCreate.second;
                                    jArr = jArr18;
                                } else {
                                    jArr = null;
                                    jArr2 = null;
                                }
                            }
                            tb1Var = (tb1) tuVarI.d;
                            if (tb1Var == null) {
                                i9 = vuVar.b;
                                if (i9 != 0) {
                                    ny2Var = new ny2(i9);
                                    sb1 sb1VarA = tb1Var.a();
                                    qv2Var = ((tb1) tuVarI.d).l;
                                    if (qv2Var != null) {
                                        qv2Var2 = qv2Var.a(ny2Var);
                                    } else {
                                        qv2Var2 = new qv2(ny2Var);
                                    }
                                    sb1VarA.k = qv2Var2;
                                    tb1Var2 = new tb1(sb1VarA);
                                } else {
                                    tb1Var2 = tb1Var;
                                }
                                pv4Var = new pv4(vuVar.a, i, jC2, j5, jA1, j6, tb1Var2, tuVarI.b, (qv4[]) tuVarI.c, tuVarI.a, jArr, jArr2);
                            }
                        }
                        pv4Var = null;
                    } else {
                        arrayList = arrayList7;
                    }
                    i3 = (iM4 == 0 && iM5 == -65536 && (iM6 == 65536 || iM6 == -65536) && iM7 == 0) ? 270 : ((iM4 == -65536 || iM4 == 65536) && iM5 == 0 && iM6 == 0 && iM7 == -65536) ? 180 : 0;
                    be3Var4.O(16);
                    short sX3 = be3Var4.x();
                    be3Var4.O(2);
                    short sX4 = be3Var4.x();
                    vuVar = new vu();
                    vuVar.a = iM3;
                    vuVar.b = iH;
                    vuVar.c = i3;
                    vuVar.d = sX3;
                    vuVar.e = sX4;
                    if (j == -9223372036854775807L) {
                        j3 = jC;
                    } else {
                        j3 = j;
                    }
                    j4 = g(py2VarS2.p).c;
                    if (j3 == -9223372036854775807L) {
                        j5 = j4;
                        jA1 = -9223372036854775807L;
                    } else {
                        String str5 = f35.a;
                        j5 = j4;
                        jA1 = f35.a0(j3, 1000000L, j5, RoundingMode.DOWN);
                    }
                    oy2 oy2VarR5 = oy2VarR2.r(1835626086);
                    oy2VarR5.getClass();
                    oy2 oy2VarR6 = oy2VarR5.r(1937007212);
                    oy2VarR6.getClass();
                    py2 py2VarS7 = oy2VarR2.s(1835296868);
                    py2VarS7.getClass();
                    be3Var = py2VarS7.p;
                    be3Var.N(8);
                    iE = e(be3Var.m());
                    if (iE == 0) {
                        i4 = 8;
                    } else {
                        i4 = 16;
                    }
                    be3Var.O(i4);
                    jC2 = be3Var.C();
                    i5 = be3Var.b;
                    if (iE == 0) {
                        i6 = 4;
                    } else {
                        i6 = 8;
                    }
                    i7 = 0;
                    while (true) {
                        if (i7 < i6) {
                            be3Var.O(i6);
                            break;
                        }
                        if (be3Var.a[i5 + i7] != -1) {
                            if (iE == 0) {
                                jG = be3Var.C();
                            } else {
                                jG = be3Var.G();
                            }
                            j7 = jG;
                            if (j7 != 0) {
                                break;
                            }
                            String str6 = f35.a;
                            jA0 = f35.a0(j7, 1000000L, jC2, RoundingMode.DOWN);
                            break;
                        }
                        i7++;
                    }
                    j6 = jA0;
                    int iH3 = be3Var.H();
                    cArr = new char[]{(char) (((iH3 >> 10) & 31) + 96), (char) (((iH3 >> 5) & 31) + 96), (char) ((iH3 & 31) + 96)};
                    i8 = 0;
                    while (true) {
                        if (i8 < 3) {
                            c = cArr[i8];
                            if (c >= 'a') {
                            }
                            str = null;
                            break;
                        }
                        str = new String(cArr);
                        break;
                        i8++;
                    }
                    py2VarS = oy2VarR6.s(1937011556);
                    if (py2VarS == null) {
                        l93.q0("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                    } else {
                        tuVarI = i(py2VarS.p, vuVar, str, ow0Var, z2);
                        if (z) {
                            jArr = null;
                            jArr2 = null;
                        } else {
                            jArr = null;
                            jArr2 = null;
                        }
                        tb1Var = (tb1) tuVarI.d;
                        if (tb1Var == null) {
                            i9 = vuVar.b;
                            if (i9 != 0) {
                                ny2Var = new ny2(i9);
                                sb1 sb1VarA2 = tb1Var.a();
                                qv2Var = ((tb1) tuVarI.d).l;
                                if (qv2Var != null) {
                                    qv2Var2 = qv2Var.a(ny2Var);
                                } else {
                                    qv2Var2 = new qv2(ny2Var);
                                }
                                sb1VarA2.k = qv2Var2;
                                tb1Var2 = new tb1(sb1VarA2);
                            } else {
                                tb1Var2 = tb1Var;
                            }
                            pv4Var = new pv4(vuVar.a, i, jC2, j5, jA1, j6, tb1Var2, tuVarI.b, (qv4[]) tuVarI.c, tuVarI.a, jArr, jArr2);
                        }
                    }
                    pv4Var = null;
                }
                pv4 pv4VarA = (pv4) eg1Var.mo77apply(pv4Var);
                if (pv4VarA == null) {
                    arrayList6 = arrayList6;
                } else {
                    tb1 tb1Var5 = pv4VarA.g;
                    oy2 oy2VarR7 = oy2Var3.r(1835297121);
                    oy2VarR7.getClass();
                    oy2 oy2VarR8 = oy2VarR7.r(1835626086);
                    oy2VarR8.getClass();
                    oy2 oy2VarR9 = oy2VarR8.r(1937007212);
                    oy2VarR9.getClass();
                    py2 py2VarS8 = oy2VarR9.s(1937011578);
                    if (py2VarS8 != null) {
                        j83 j83Var = new j83();
                        be3 be3Var6 = py2VarS8.p;
                        j83Var.p = be3Var6;
                        be3Var6.N(12);
                        int iE10 = be3Var6.E();
                        if ("audio/raw".equals(tb1Var5.n)) {
                            int iT = f35.t(tb1Var5.H) * tb1Var5.F;
                            if (iE10 % iT != 0) {
                                l93.q0("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iT + ", stsz sample size: " + iE10);
                                iE10 = iT;
                            }
                        }
                        if (iE10 == 0) {
                            iE10 = -1;
                        }
                        j83Var.n = iE10;
                        j83Var.o = be3Var6.E();
                        suVar = j83Var;
                    } else {
                        py2 py2VarS9 = oy2VarR9.s(1937013298);
                        if (py2VarS9 == null) {
                            throw ParserException.a(null, "Track has no sample table size information");
                        }
                        uu uuVar = new uu();
                        be3 be3Var7 = py2VarS9.p;
                        uuVar.r = be3Var7;
                        be3Var7.N(12);
                        uuVar.o = be3Var7.E() & 255;
                        uuVar.n = be3Var7.E();
                        suVar = uuVar;
                    }
                    int iK = suVar.k();
                    if (iK == 0) {
                        xv4Var = new xv4(pv4VarA, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (pv4VarA.b == 2) {
                            long j22 = pv4VarA.f;
                            if (j22 > j2) {
                                sb1 sb1VarA3 = tb1Var5.a();
                                sb1VarA3.x = iK / (j22 / 1000000.0f);
                                pv4VarA = pv4VarA.a(new tb1(sb1VarA3));
                            }
                        }
                        tb1 tb1Var6 = pv4VarA.g;
                        py2 py2VarS10 = oy2VarR9.s(1937007471);
                        if (py2VarS10 == null) {
                            py2VarS10 = oy2VarR9.s(1668232756);
                            py2VarS10.getClass();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        be3 be3Var8 = py2VarS10.p;
                        py2 py2VarS11 = oy2VarR9.s(1937011555);
                        py2VarS11.getClass();
                        be3 be3Var9 = py2VarS11.p;
                        py2 py2VarS12 = oy2VarR9.s(1937011827);
                        py2VarS12.getClass();
                        be3 be3Var10 = py2VarS12.p;
                        py2 py2VarS13 = oy2VarR9.s(1937011571);
                        be3 be3Var11 = py2VarS13 != null ? py2VarS13.p : null;
                        py2 py2VarS14 = oy2VarR9.s(1668576371);
                        be3 be3Var12 = py2VarS14 != null ? py2VarS14.p : null;
                        qu quVar = new qu(be3Var9, be3Var8, z4);
                        be3Var10.N(12);
                        int iE11 = be3Var10.E() - 1;
                        int iE12 = be3Var10.E();
                        int iE13 = be3Var10.E();
                        if (be3Var12 != null) {
                            be3Var12.N(12);
                            iE2 = be3Var12.E();
                        } else {
                            iE2 = 0;
                        }
                        if (be3Var11 != null) {
                            be3Var11.N(12);
                            iE3 = be3Var11.E();
                            if (iE3 > 0) {
                                iE4 = be3Var11.E() - 1;
                                be3Var12 = be3Var12;
                            } else {
                                be3Var11 = null;
                            }
                            iF = suVar.f();
                            suVar2 = suVar;
                            String str7 = tb1Var6.n;
                            if (iF == -1 && (("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && iE11 == 0 && iE2 == 0 && iE3 == 0)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            arrayList2 = new ArrayList();
                            if (be3Var11 == null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z5) {
                                i45 = quVar.a;
                                jArr14 = new long[i45];
                                iArr13 = new int[i45];
                                while (quVar.a()) {
                                    int i63 = quVar.b;
                                    jArr14[i63] = quVar.d;
                                    iArr13[i63] = quVar.c;
                                }
                                j20 = iE13;
                                i46 = 8192 / iF;
                                iG = 0;
                                for (i47 = 0; i47 < i45; i47++) {
                                    iG += f35.g(iArr13[i47], i46);
                                }
                                jArr15 = new long[iG];
                                iArr3 = new int[iG];
                                jArr5 = new long[iG];
                                iArrCopyOf = new int[iG];
                                i48 = 0;
                                i49 = 0;
                                i50 = 0;
                                i51 = 0;
                                i52 = 0;
                                while (i48 < i45) {
                                    int i64 = iArr13[i48];
                                    j21 = jArr14[i48];
                                    int i65 = i52;
                                    int i66 = i45;
                                    i53 = i51;
                                    i54 = i65;
                                    int i67 = i48;
                                    i55 = i64;
                                    while (i55 > 0) {
                                        int iMin = Math.min(i46, i55);
                                        jArr15[i54] = j21;
                                        int i68 = i46;
                                        int i69 = iF * iMin;
                                        iArr3[i54] = i69;
                                        i50 += i69;
                                        int iMax = Math.max(i53, i69);
                                        jArr5[i54] = ((long) i49) * j20;
                                        iArrCopyOf[i54] = 1;
                                        j21 += (long) iArr3[i54];
                                        i49 += iMin;
                                        i55 -= iMin;
                                        i54++;
                                        i46 = i68;
                                        i53 = iMax;
                                    }
                                    int i70 = i46;
                                    i48 = i67 + 1;
                                    int i71 = i54;
                                    i51 = i53;
                                    i45 = i66;
                                    i52 = i71;
                                    i46 = i70;
                                }
                                long j23 = j20 * ((long) i49);
                                j12 = i50;
                                if (z3) {
                                    jArr4 = new long[0];
                                }
                                if (z3) {
                                    jArr4 = jArr15;
                                    iArr3 = new int[0];
                                }
                                if (z3) {
                                    jArr5 = new long[0];
                                }
                                if (z3) {
                                    iArrCopyOf = new int[0];
                                }
                                arrayList3 = arrayList2;
                                j11 = j23;
                                i21 = iG;
                                i20 = i51;
                            } else {
                                if (z3) {
                                    jArr3 = new long[0];
                                } else {
                                    jArr3 = new long[iK];
                                }
                                if (z3) {
                                    iArr = new int[0];
                                } else {
                                    iArr = new int[iK];
                                }
                                if (z3) {
                                    jArrCopyOf = new long[0];
                                } else {
                                    jArrCopyOf = new long[iK];
                                }
                                int i72 = iE3;
                                if (z3) {
                                    iArr2 = new int[0];
                                } else {
                                    iArr2 = new int[iK];
                                }
                                i10 = iE11;
                                i11 = iE2;
                                i12 = iE13;
                                i13 = i72;
                                j8 = j2;
                                j9 = j8;
                                j10 = j9;
                                i14 = 0;
                                iM = 0;
                                i15 = 0;
                                iE5 = 0;
                                i16 = iE12;
                                iE6 = iE4;
                                be3Var2 = be3Var11;
                                i17 = 0;
                                while (true) {
                                    if (i17 < iK) {
                                        arrayList3 = arrayList2;
                                        jArr4 = jArr3;
                                        iArrCopyOf = iArr2;
                                        i18 = i15;
                                        iArr3 = iArr;
                                        i19 = iK;
                                        break;
                                    }
                                    zA = true;
                                    while (i15 == 0) {
                                        zA = quVar.a();
                                        if (zA) {
                                            break;
                                        }
                                        j10 = quVar.d;
                                        i15 = quVar.c;
                                        arrayList2 = arrayList2;
                                        iK = iK;
                                    }
                                    i22 = iK;
                                    arrayList3 = arrayList2;
                                    if (!zA) {
                                        l93.q0("BoxParsers", "Unexpected end of chunk data");
                                        if (z3) {
                                            long[] jArrCopyOf2 = Arrays.copyOf(jArr3, i17);
                                            int[] iArrCopyOf2 = Arrays.copyOf(iArr, i17);
                                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i17);
                                            int i73 = i17;
                                            iArrCopyOf = Arrays.copyOf(iArr2, i17);
                                            i19 = i73;
                                            jArr4 = jArrCopyOf2;
                                            iArr3 = iArrCopyOf2;
                                            i18 = i15;
                                            break;
                                        }
                                        jArr4 = jArr3;
                                        iArr3 = iArr;
                                        i19 = i17;
                                        i18 = i15;
                                        iArrCopyOf = iArr2;
                                        break;
                                    }
                                    if (be3Var12 != null) {
                                        while (iE5 == 0 && i11 > 0) {
                                            iE5 = be3Var12.E();
                                            iM = be3Var12.m();
                                            i11--;
                                        }
                                        iE5--;
                                    }
                                    iL = suVar2.l();
                                    jArr6 = jArr3;
                                    iArr4 = iArr;
                                    long j24 = iL;
                                    j9 += j24;
                                    if (iL > i14) {
                                        i14 = iL;
                                    }
                                    if (z3) {
                                        i23 = i14;
                                        jArr7 = jArrCopyOf;
                                    } else {
                                        jArr6[i17] = j10;
                                        iArr4[i17] = iL;
                                        i23 = i14;
                                        jArr7 = jArrCopyOf;
                                        jArr7[i17] = j8 + ((long) iM);
                                        if (be3Var2 == null) {
                                            i24 = 1;
                                        } else {
                                            i24 = 0;
                                        }
                                        iArr2[i17] = i24;
                                        if (i17 == iE6) {
                                            iArr2[i17] = 1;
                                            arrayList4 = arrayList3;
                                            arrayList4.add(Integer.valueOf(i17));
                                        }
                                        if (be3Var2 != null && i17 == iE6 && (i13 = i13 - 1) > 0) {
                                            iE6 = be3Var2.E() - 1;
                                        }
                                        ArrayList arrayList8 = arrayList4;
                                        j8 += (long) i12;
                                        i16--;
                                        if (i16 != 0 && i10 > 0) {
                                            int iE14 = be3Var10.E();
                                            int iM8 = be3Var10.m();
                                            i10--;
                                            i16 = iE14;
                                            i12 = iM8;
                                        }
                                        j10 += j24;
                                        i15--;
                                        i17++;
                                        jArrCopyOf = jArr7;
                                        jArr3 = jArr6;
                                        iArr = iArr4;
                                        arrayList2 = arrayList8;
                                        iK = i22;
                                        i14 = i23;
                                    }
                                    arrayList4 = arrayList3;
                                    if (be3Var2 != null) {
                                        iE6 = be3Var2.E() - 1;
                                    }
                                    ArrayList arrayList9 = arrayList4;
                                    j8 += (long) i12;
                                    i16--;
                                    if (i16 != 0) {
                                    }
                                    j10 += j24;
                                    i15--;
                                    i17++;
                                    jArrCopyOf = jArr7;
                                    jArr3 = jArr6;
                                    iArr = iArr4;
                                    arrayList2 = arrayList9;
                                    iK = i22;
                                    i14 = i23;
                                }
                                long j25 = j8 + ((long) iM);
                                if (be3Var12 != null) {
                                    z7 = true;
                                    break;
                                }
                                while (true) {
                                    if (i11 > 0) {
                                        z7 = true;
                                        break;
                                    }
                                    if (be3Var12.E() != 0) {
                                        z7 = false;
                                        break;
                                    }
                                    be3Var12.m();
                                    i11--;
                                }
                                if (i13 == 0 || i16 != 0 || i18 != 0 || i10 != 0 || iE5 != 0 || !z7) {
                                    StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                    sb.append(pv4VarA.a);
                                    sb.append(": remainingSynchronizationSamples ");
                                    sb.append(i13);
                                    sb.append(", remainingSamplesAtTimestampDelta ");
                                    sb.append(i16);
                                    sb.append(", remainingSamplesInChunk ");
                                    sb.append(i18);
                                    sb.append(", remainingTimestampDeltaChanges ");
                                    sb.append(i10);
                                    sb.append(", remainingSamplesAtTimestampOffset ");
                                    sb.append(iE5);
                                    if (z7) {
                                        str2 = "";
                                    } else {
                                        str2 = ", ctts invalid";
                                    }
                                    sb.append(str2);
                                    l93.q0("BoxParsers", sb.toString());
                                }
                                i20 = i14;
                                jArr5 = jArrCopyOf;
                                i21 = i19;
                                j11 = j25;
                                j12 = j9;
                            }
                            jArr8 = jArr4;
                            iArr5 = iArr3;
                            iArr6 = iArrCopyOf;
                            j13 = pv4VarA.f;
                            if (j13 > j2) {
                                jA6 = f35.a0(j12 * 8, 1000000L, j13, RoundingMode.HALF_DOWN);
                                if (jA6 > j2 && jA6 < 2147483647L) {
                                    sb1 sb1VarA4 = tb1Var6.a();
                                    sb1VarA4.h = (int) jA6;
                                    pv4VarA = pv4VarA.a(new tb1(sb1VarA4));
                                }
                            }
                            i25 = pv4VarA.b;
                            j14 = pv4VarA.c;
                            tb1Var3 = pv4VarA.g;
                            jArr9 = pv4VarA.j;
                            jArr10 = pv4VarA.i;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jA2 = f35.a0(j11, 1000000L, j14, roundingMode);
                            iArrN = jz4.N(arrayList3);
                            if (jArr10 == null) {
                                if (!z3) {
                                    f35.Z(jArr5, j14);
                                }
                                xv4Var2 = new xv4(pv4VarA, jArr8, iArr5, i20, jArr5, iArr6, iArrN, z6, jA2, i21);
                            } else {
                                jArr11 = jArr5;
                                if (z3) {
                                    jArr9.getClass();
                                    if (jArr10.length == 1 || jArr10[0] != j2) {
                                        for (i44 = 0; i44 < jArr10.length; i44++) {
                                            if (jArr9[i44] != -1) {
                                                j2 += jArr10[i44];
                                            }
                                        }
                                        jA5 = f35.a0(j2, 1000000L, pv4VarA.d, RoundingMode.DOWN);
                                    } else {
                                        jA5 = f35.a0(j11 - jArr9[0], 1000000L, pv4VarA.c, roundingMode);
                                    }
                                    xv4Var2 = new xv4(pv4VarA, jArr8, iArr5, i20, jArr11, iArr6, iArrN, z6, jA5, i21);
                                } else {
                                    if (jArr10.length == 1 || i25 != 1 || jArr11.length < 2) {
                                        j15 = j11;
                                        j16 = -1;
                                    } else {
                                        jArr9.getClass();
                                        long j26 = jArr9[0];
                                        j16 = -1;
                                        j15 = j11;
                                        long jA7 = f35.a0(jArr10[0], pv4VarA.c, pv4VarA.d, roundingMode) + j26;
                                        int length = jArr11.length - 1;
                                        int iJ = f35.j(4, 0, length);
                                        int iJ2 = f35.j(jArr11.length - 4, 0, length);
                                        if (jArr11[0] <= j26 && j26 < jArr11[iJ] && jArr11[iJ2] < jA7 && jA7 <= j15 + 2) {
                                            long jMax = Math.max(j2, j15 - jA7);
                                            long jA8 = f35.a0(j26 - jArr11[0], tb1Var3.G, pv4VarA.c, roundingMode);
                                            long jA9 = f35.a0(jMax, tb1Var3.G, pv4VarA.c, roundingMode);
                                            if ((jA8 != j2 || jA9 != j2) && jA8 <= 2147483647L && jA9 <= 2147483647L) {
                                                zg1Var.a = (int) jA8;
                                                zg1Var.b = (int) jA9;
                                                f35.Z(jArr11, j14);
                                                xv4Var2 = new xv4(pv4VarA, jArr8, iArr5, i20, jArr11, iArr6, iArrN, z6, f35.a0(jArr10[0], 1000000L, pv4VarA.d, roundingMode), i21);
                                            }
                                        }
                                        arrayList6.add(xv4Var);
                                    }
                                    if (jArr10.length == 1 || jArr10[0] != 0) {
                                        i26 = i21;
                                        if (i25 == 1) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        iArr7 = new int[jArr10.length];
                                        iArr8 = new int[jArr10.length];
                                        jArr9.getClass();
                                        i27 = 0;
                                        i28 = 0;
                                        z9 = false;
                                        i29 = 0;
                                        while (i28 < jArr10.length) {
                                            iArr12 = iArr8;
                                            j19 = jArr9[i28];
                                            if (j19 != j16) {
                                                i37 = i28;
                                                boolean z14 = z9;
                                                jA4 = f35.a0(jArr10[i28], pv4VarA.c, pv4VarA.d, RoundingMode.DOWN) + j19;
                                                iArr7[i37] = f35.f(jArr11, j19, true);
                                                iB = f35.b(jArr11, jA4, z8) - 1;
                                                i39 = 0;
                                                for (i38 = r5; i38 < jArr11.length; i38++) {
                                                    if (jArr11[i38] >= jA4) {
                                                        i39++;
                                                        if (i39 > tb1Var3.p) {
                                                            break;
                                                        }
                                                    } else {
                                                        iB = i38;
                                                    }
                                                }
                                                iArr12[i37] = iB + 1;
                                                i40 = iArr7[i37];
                                                while (true) {
                                                    i41 = iArr7[i37];
                                                    if (i41 > 0 || (iArr6[i41] & 1) != 0) {
                                                        break;
                                                        break;
                                                    }
                                                    iArr7[i37] = i41 - 1;
                                                }
                                                if (i41 == 0 && (iArr6[0] & 1) == 0) {
                                                    iArr7[i37] = i40;
                                                    while (true) {
                                                        i43 = iArr7[i37];
                                                        if (i43 < iArr12[i37] || (iArr6[i43] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr7[i37] = i43 + 1;
                                                    }
                                                }
                                                int i74 = iArr12[i37];
                                                i42 = iArr7[i37];
                                                int i75 = (i74 - i42) + i29;
                                                if (i27 != i42) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                z9 = z14 | z13;
                                                i29 = i75;
                                                i27 = i74;
                                            } else {
                                                i37 = i28;
                                            }
                                            i28 = i37 + 1;
                                            iArr8 = iArr12;
                                            z8 = z8;
                                        }
                                        iArr9 = iArr8;
                                        boolean z15 = z9;
                                        if (i29 != i26) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        z11 = z15 | z10;
                                        if (z11) {
                                            jArr12 = new long[i29];
                                        } else {
                                            jArr12 = jArr8;
                                        }
                                        if (z11) {
                                            iArr10 = new int[i29];
                                        } else {
                                            iArr10 = iArr5;
                                        }
                                        if (z11) {
                                            i20 = 0;
                                        }
                                        if (z11) {
                                            iArr11 = new int[i29];
                                        } else {
                                            iArr11 = iArr6;
                                        }
                                        if (z11) {
                                            arrayList5 = new ArrayList();
                                        } else {
                                            arrayList5 = arrayList3;
                                        }
                                        jArr13 = new long[i29];
                                        i30 = 0;
                                        z12 = false;
                                        i31 = 0;
                                        i32 = i20;
                                        j17 = 0;
                                        while (i30 < jArr10.length) {
                                            j18 = jArr9[i30];
                                            i33 = iArr7[i30];
                                            tb1 tb1Var7 = tb1Var3;
                                            i34 = iArr9[i30];
                                            long[] jArr19 = jArr10;
                                            if (z11) {
                                                int i76 = i34 - i33;
                                                System.arraycopy(jArr8, i33, jArr12, i31, i76);
                                                System.arraycopy(iArr5, i33, iArr10, i31, i76);
                                                System.arraycopy(iArr6, i33, iArr11, i31, i76);
                                            }
                                            i35 = i32;
                                            while (i33 < i34) {
                                                i36 = i33;
                                                int i77 = i34;
                                                long j27 = pv4VarA.d;
                                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                long jA10 = f35.a0(j17, 1000000L, j27, roundingMode2);
                                                jA3 = f35.a0(jArr11[i36] - j18, 1000000L, pv4VarA.c, roundingMode2);
                                                if (jA3 < 0) {
                                                    z12 = true;
                                                }
                                                jArr13[i31] = jA10 + jA3;
                                                if (z11 && iArr10[i31] > i35) {
                                                    i35 = iArr5[i36];
                                                }
                                                if (!z11 && !z6 && (iArr11[i31] & 1) != 0) {
                                                    arrayList5.add(Integer.valueOf(i31));
                                                }
                                                i31++;
                                                i33 = i36 + 1;
                                                i34 = i77;
                                            }
                                            j17 += jArr19[i30];
                                            i30++;
                                            i32 = i35;
                                            tb1Var3 = tb1Var7;
                                            jArr10 = jArr19;
                                        }
                                        tb1Var4 = tb1Var3;
                                        long jA11 = f35.a0(j17, 1000000L, pv4VarA.d, RoundingMode.DOWN);
                                        if (z12) {
                                            sb1 sb1VarA5 = tb1Var4.a();
                                            sb1VarA5.s = true;
                                            pv4VarA = pv4VarA.a(new tb1(sb1VarA5));
                                        }
                                        xv4Var = new xv4(pv4VarA, jArr12, iArr10, i32, jArr13, iArr11, jz4.N(arrayList5), z6, jA11, jArr12.length);
                                        arrayList6 = arrayList6;
                                    } else {
                                        jArr9.getClass();
                                        long j28 = jArr9[0];
                                        for (int i78 = 0; i78 < jArr11.length; i78++) {
                                            jArr11[i78] = f35.a0(jArr11[i78] - j28, 1000000L, pv4VarA.c, RoundingMode.DOWN);
                                        }
                                        xv4Var2 = new xv4(pv4VarA, jArr8, iArr5, i20, jArr11, iArr6, iArrN, z6, f35.a0(j15 - j28, 1000000L, pv4VarA.c, RoundingMode.DOWN), i21);
                                    }
                                    arrayList6.add(xv4Var);
                                }
                            }
                            xv4Var = xv4Var2;
                        } else {
                            iE3 = 0;
                        }
                        iE4 = -1;
                        iF = suVar.f();
                        suVar2 = suVar;
                        String str8 = tb1Var6.n;
                        if (iF == -1) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        arrayList2 = new ArrayList();
                        if (be3Var11 == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z5) {
                            i45 = quVar.a;
                            jArr14 = new long[i45];
                            iArr13 = new int[i45];
                            while (quVar.a()) {
                                int i610 = quVar.b;
                                jArr14[i610] = quVar.d;
                                iArr13[i610] = quVar.c;
                            }
                            j20 = iE13;
                            i46 = 8192 / iF;
                            iG = 0;
                            while (i47 < i45) {
                                iG += f35.g(iArr13[i47], i46);
                            }
                            jArr15 = new long[iG];
                            iArr3 = new int[iG];
                            jArr5 = new long[iG];
                            iArrCopyOf = new int[iG];
                            i48 = 0;
                            i49 = 0;
                            i50 = 0;
                            i51 = 0;
                            i52 = 0;
                            while (i48 < i45) {
                                int i611 = iArr13[i48];
                                j21 = jArr14[i48];
                                int i612 = i52;
                                int i613 = i45;
                                i53 = i51;
                                i54 = i612;
                                int i614 = i48;
                                i55 = i611;
                                while (i55 > 0) {
                                    int iMin2 = Math.min(i46, i55);
                                    jArr15[i54] = j21;
                                    int i615 = i46;
                                    int i616 = iF * iMin2;
                                    iArr3[i54] = i616;
                                    i50 += i616;
                                    int iMax2 = Math.max(i53, i616);
                                    jArr5[i54] = ((long) i49) * j20;
                                    iArrCopyOf[i54] = 1;
                                    j21 += (long) iArr3[i54];
                                    i49 += iMin2;
                                    i55 -= iMin2;
                                    i54++;
                                    i46 = i615;
                                    i53 = iMax2;
                                }
                                int i79 = i46;
                                i48 = i614 + 1;
                                int i710 = i54;
                                i51 = i53;
                                i45 = i613;
                                i52 = i710;
                                i46 = i79;
                            }
                            long j29 = j20 * ((long) i49);
                            j12 = i50;
                            if (z3) {
                                jArr4 = new long[0];
                            }
                            if (z3) {
                                jArr4 = jArr15;
                                iArr3 = new int[0];
                            }
                            if (z3) {
                                jArr5 = new long[0];
                            }
                            if (z3) {
                                iArrCopyOf = new int[0];
                            }
                            arrayList3 = arrayList2;
                            j11 = j29;
                            i21 = iG;
                            i20 = i51;
                        } else {
                            if (z3) {
                                jArr3 = new long[0];
                            } else {
                                jArr3 = new long[iK];
                            }
                            if (z3) {
                                iArr = new int[0];
                            } else {
                                iArr = new int[iK];
                            }
                            if (z3) {
                                jArrCopyOf = new long[0];
                            } else {
                                jArrCopyOf = new long[iK];
                            }
                            int i711 = iE3;
                            if (z3) {
                                iArr2 = new int[0];
                            } else {
                                iArr2 = new int[iK];
                            }
                            i10 = iE11;
                            i11 = iE2;
                            i12 = iE13;
                            i13 = i711;
                            j8 = j2;
                            j9 = j8;
                            j10 = j9;
                            i14 = 0;
                            iM = 0;
                            i15 = 0;
                            iE5 = 0;
                            i16 = iE12;
                            iE6 = iE4;
                            be3Var2 = be3Var11;
                            i17 = 0;
                            while (true) {
                                if (i17 < iK) {
                                    arrayList3 = arrayList2;
                                    jArr4 = jArr3;
                                    iArrCopyOf = iArr2;
                                    i18 = i15;
                                    iArr3 = iArr;
                                    i19 = iK;
                                    break;
                                }
                                zA = true;
                                while (i15 == 0) {
                                    zA = quVar.a();
                                    if (zA) {
                                        break;
                                        break;
                                    }
                                    j10 = quVar.d;
                                    i15 = quVar.c;
                                    arrayList2 = arrayList2;
                                    iK = iK;
                                }
                                i22 = iK;
                                arrayList3 = arrayList2;
                                if (!zA) {
                                    l93.q0("BoxParsers", "Unexpected end of chunk data");
                                    if (z3) {
                                        jArr4 = jArr3;
                                        iArr3 = iArr;
                                        i19 = i17;
                                        i18 = i15;
                                        iArrCopyOf = iArr2;
                                        break;
                                    }
                                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i17);
                                    int[] iArrCopyOf3 = Arrays.copyOf(iArr, i17);
                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i17);
                                    int i712 = i17;
                                    iArrCopyOf = Arrays.copyOf(iArr2, i17);
                                    i19 = i712;
                                    jArr4 = jArrCopyOf3;
                                    iArr3 = iArrCopyOf3;
                                    i18 = i15;
                                    break;
                                }
                                if (be3Var12 != null) {
                                    while (iE5 == 0) {
                                        iE5 = be3Var12.E();
                                        iM = be3Var12.m();
                                        i11--;
                                    }
                                    iE5--;
                                }
                                iL = suVar2.l();
                                jArr6 = jArr3;
                                iArr4 = iArr;
                                long j210 = iL;
                                j9 += j210;
                                if (iL > i14) {
                                    i14 = iL;
                                }
                                if (z3) {
                                    jArr6[i17] = j10;
                                    iArr4[i17] = iL;
                                    i23 = i14;
                                    jArr7 = jArrCopyOf;
                                    jArr7[i17] = j8 + ((long) iM);
                                    if (be3Var2 == null) {
                                        i24 = 1;
                                    } else {
                                        i24 = 0;
                                    }
                                    iArr2[i17] = i24;
                                    if (i17 == iE6) {
                                        iArr2[i17] = 1;
                                        arrayList4 = arrayList3;
                                        arrayList4.add(Integer.valueOf(i17));
                                    }
                                    if (be3Var2 != null) {
                                        iE6 = be3Var2.E() - 1;
                                    }
                                    ArrayList arrayList10 = arrayList4;
                                    j8 += (long) i12;
                                    i16--;
                                    if (i16 != 0) {
                                    }
                                    j10 += j210;
                                    i15--;
                                    i17++;
                                    jArrCopyOf = jArr7;
                                    jArr3 = jArr6;
                                    iArr = iArr4;
                                    arrayList2 = arrayList10;
                                    iK = i22;
                                    i14 = i23;
                                } else {
                                    i23 = i14;
                                    jArr7 = jArrCopyOf;
                                }
                                arrayList4 = arrayList3;
                                if (be3Var2 != null) {
                                    iE6 = be3Var2.E() - 1;
                                }
                                ArrayList arrayList11 = arrayList4;
                                j8 += (long) i12;
                                i16--;
                                if (i16 != 0) {
                                }
                                j10 += j210;
                                i15--;
                                i17++;
                                jArrCopyOf = jArr7;
                                jArr3 = jArr6;
                                iArr = iArr4;
                                arrayList2 = arrayList11;
                                iK = i22;
                                i14 = i23;
                            }
                            long j211 = j8 + ((long) iM);
                            if (be3Var12 != null) {
                                z7 = true;
                                break;
                            }
                            while (true) {
                                if (i11 > 0) {
                                    z7 = true;
                                    break;
                                }
                                if (be3Var12.E() != 0) {
                                    z7 = false;
                                    break;
                                }
                                be3Var12.m();
                                i11--;
                            }
                            if (i13 == 0) {
                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                sb2.append(pv4VarA.a);
                                sb2.append(": remainingSynchronizationSamples ");
                                sb2.append(i13);
                                sb2.append(", remainingSamplesAtTimestampDelta ");
                                sb2.append(i16);
                                sb2.append(", remainingSamplesInChunk ");
                                sb2.append(i18);
                                sb2.append(", remainingTimestampDeltaChanges ");
                                sb2.append(i10);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(iE5);
                                if (z7) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb2.append(str2);
                                l93.q0("BoxParsers", sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                sb3.append(pv4VarA.a);
                                sb3.append(": remainingSynchronizationSamples ");
                                sb3.append(i13);
                                sb3.append(", remainingSamplesAtTimestampDelta ");
                                sb3.append(i16);
                                sb3.append(", remainingSamplesInChunk ");
                                sb3.append(i18);
                                sb3.append(", remainingTimestampDeltaChanges ");
                                sb3.append(i10);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(iE5);
                                if (z7) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb3.append(str2);
                                l93.q0("BoxParsers", sb3.toString());
                            }
                            i20 = i14;
                            jArr5 = jArrCopyOf;
                            i21 = i19;
                            j11 = j211;
                            j12 = j9;
                        }
                        jArr8 = jArr4;
                        iArr5 = iArr3;
                        iArr6 = iArrCopyOf;
                        j13 = pv4VarA.f;
                        if (j13 > j2) {
                            jA6 = f35.a0(j12 * 8, 1000000L, j13, RoundingMode.HALF_DOWN);
                            if (jA6 > j2) {
                                sb1 sb1VarA6 = tb1Var6.a();
                                sb1VarA6.h = (int) jA6;
                                pv4VarA = pv4VarA.a(new tb1(sb1VarA6));
                            }
                        }
                        i25 = pv4VarA.b;
                        j14 = pv4VarA.c;
                        tb1Var3 = pv4VarA.g;
                        jArr9 = pv4VarA.j;
                        jArr10 = pv4VarA.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        jA2 = f35.a0(j11, 1000000L, j14, roundingMode3);
                        iArrN = jz4.N(arrayList3);
                        if (jArr10 == null) {
                            if (!z3) {
                                f35.Z(jArr5, j14);
                            }
                            xv4Var2 = new xv4(pv4VarA, jArr8, iArr5, i20, jArr5, iArr6, iArrN, z6, jA2, i21);
                        } else {
                            jArr11 = jArr5;
                            if (z3) {
                                jArr9.getClass();
                                if (jArr10.length == 1) {
                                    while (i44 < jArr10.length) {
                                        if (jArr9[i44] != -1) {
                                            j2 += jArr10[i44];
                                        }
                                    }
                                    jA5 = f35.a0(j2, 1000000L, pv4VarA.d, RoundingMode.DOWN);
                                } else {
                                    while (i44 < jArr10.length) {
                                        if (jArr9[i44] != -1) {
                                            j2 += jArr10[i44];
                                        }
                                    }
                                    jA5 = f35.a0(j2, 1000000L, pv4VarA.d, RoundingMode.DOWN);
                                }
                                xv4Var2 = new xv4(pv4VarA, jArr8, iArr5, i20, jArr11, iArr6, iArrN, z6, jA5, i21);
                            } else if (jArr10.length == 1) {
                                j15 = j11;
                                j16 = -1;
                                if (jArr10.length == 1) {
                                }
                                i26 = i21;
                                if (i25 == 1) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                iArr7 = new int[jArr10.length];
                                iArr8 = new int[jArr10.length];
                                jArr9.getClass();
                                i27 = 0;
                                i28 = 0;
                                z9 = false;
                                i29 = 0;
                                while (i28 < jArr10.length) {
                                    iArr12 = iArr8;
                                    j19 = jArr9[i28];
                                    if (j19 != j16) {
                                        i37 = i28;
                                        boolean z16 = z9;
                                        jA4 = f35.a0(jArr10[i28], pv4VarA.c, pv4VarA.d, RoundingMode.DOWN) + j19;
                                        iArr7[i37] = f35.f(jArr11, j19, true);
                                        iB = f35.b(jArr11, jA4, z8) - 1;
                                        i39 = 0;
                                        while (i38 < jArr11.length) {
                                            if (jArr11[i38] >= jA4) {
                                                i39++;
                                                if (i39 > tb1Var3.p) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i38;
                                            }
                                        }
                                        iArr12[i37] = iB + 1;
                                        i40 = iArr7[i37];
                                        while (true) {
                                            i41 = iArr7[i37];
                                            if (i41 > 0) {
                                                break;
                                            }
                                            iArr7[i37] = i41 - 1;
                                        }
                                        if (i41 == 0) {
                                            iArr7[i37] = i40;
                                            while (true) {
                                                i43 = iArr7[i37];
                                                if (i43 < iArr12[i37]) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i37] = i43 + 1;
                                            }
                                        }
                                        int i713 = iArr12[i37];
                                        i42 = iArr7[i37];
                                        int i714 = (i713 - i42) + i29;
                                        if (i27 != i42) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z9 = z16 | z13;
                                        i29 = i714;
                                        i27 = i713;
                                    } else {
                                        i37 = i28;
                                    }
                                    i28 = i37 + 1;
                                    iArr8 = iArr12;
                                    z8 = z8;
                                }
                                iArr9 = iArr8;
                                boolean z17 = z9;
                                if (i29 != i26) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z17 | z10;
                                if (z11) {
                                    jArr12 = new long[i29];
                                } else {
                                    jArr12 = jArr8;
                                }
                                if (z11) {
                                    iArr10 = new int[i29];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z11) {
                                    i20 = 0;
                                }
                                if (z11) {
                                    iArr11 = new int[i29];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z11) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList3;
                                }
                                jArr13 = new long[i29];
                                i30 = 0;
                                z12 = false;
                                i31 = 0;
                                i32 = i20;
                                j17 = 0;
                                while (i30 < jArr10.length) {
                                    j18 = jArr9[i30];
                                    i33 = iArr7[i30];
                                    tb1 tb1Var8 = tb1Var3;
                                    i34 = iArr9[i30];
                                    long[] jArr110 = jArr10;
                                    if (z11) {
                                        int i715 = i34 - i33;
                                        System.arraycopy(jArr8, i33, jArr12, i31, i715);
                                        System.arraycopy(iArr5, i33, iArr10, i31, i715);
                                        System.arraycopy(iArr6, i33, iArr11, i31, i715);
                                    }
                                    i35 = i32;
                                    while (i33 < i34) {
                                        i36 = i33;
                                        int i716 = i34;
                                        long j212 = pv4VarA.d;
                                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                                        long jA12 = f35.a0(j17, 1000000L, j212, roundingMode4);
                                        jA3 = f35.a0(jArr11[i36] - j18, 1000000L, pv4VarA.c, roundingMode4);
                                        if (jA3 < 0) {
                                            z12 = true;
                                        }
                                        jArr13[i31] = jA12 + jA3;
                                        if (z11) {
                                            i35 = iArr5[i36];
                                        }
                                        if (!z11) {
                                        }
                                        i31++;
                                        i33 = i36 + 1;
                                        i34 = i716;
                                    }
                                    j17 += jArr110[i30];
                                    i30++;
                                    i32 = i35;
                                    tb1Var3 = tb1Var8;
                                    jArr10 = jArr110;
                                }
                                tb1Var4 = tb1Var3;
                                long jA13 = f35.a0(j17, 1000000L, pv4VarA.d, RoundingMode.DOWN);
                                if (z12) {
                                    sb1 sb1VarA7 = tb1Var4.a();
                                    sb1VarA7.s = true;
                                    pv4VarA = pv4VarA.a(new tb1(sb1VarA7));
                                }
                                xv4Var = new xv4(pv4VarA, jArr12, iArr10, i32, jArr13, iArr11, jz4.N(arrayList5), z6, jA13, jArr12.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(xv4Var);
                            } else {
                                j15 = j11;
                                j16 = -1;
                                if (jArr10.length == 1) {
                                }
                                i26 = i21;
                                if (i25 == 1) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                iArr7 = new int[jArr10.length];
                                iArr8 = new int[jArr10.length];
                                jArr9.getClass();
                                i27 = 0;
                                i28 = 0;
                                z9 = false;
                                i29 = 0;
                                while (i28 < jArr10.length) {
                                    iArr12 = iArr8;
                                    j19 = jArr9[i28];
                                    if (j19 != j16) {
                                        i37 = i28;
                                        boolean z18 = z9;
                                        jA4 = f35.a0(jArr10[i28], pv4VarA.c, pv4VarA.d, RoundingMode.DOWN) + j19;
                                        iArr7[i37] = f35.f(jArr11, j19, true);
                                        iB = f35.b(jArr11, jA4, z8) - 1;
                                        i39 = 0;
                                        while (i38 < jArr11.length) {
                                            if (jArr11[i38] >= jA4) {
                                                i39++;
                                                if (i39 > tb1Var3.p) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i38;
                                            }
                                        }
                                        iArr12[i37] = iB + 1;
                                        i40 = iArr7[i37];
                                        while (true) {
                                            i41 = iArr7[i37];
                                            if (i41 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr7[i37] = i41 - 1;
                                        }
                                        if (i41 == 0) {
                                            iArr7[i37] = i40;
                                            while (true) {
                                                i43 = iArr7[i37];
                                                if (i43 < iArr12[i37]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i37] = i43 + 1;
                                            }
                                        }
                                        int i717 = iArr12[i37];
                                        i42 = iArr7[i37];
                                        int i718 = (i717 - i42) + i29;
                                        if (i27 != i42) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z9 = z18 | z13;
                                        i29 = i718;
                                        i27 = i717;
                                    } else {
                                        i37 = i28;
                                    }
                                    i28 = i37 + 1;
                                    iArr8 = iArr12;
                                    z8 = z8;
                                }
                                iArr9 = iArr8;
                                boolean z19 = z9;
                                if (i29 != i26) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z19 | z10;
                                if (z11) {
                                    jArr12 = new long[i29];
                                } else {
                                    jArr12 = jArr8;
                                }
                                if (z11) {
                                    iArr10 = new int[i29];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z11) {
                                    i20 = 0;
                                }
                                if (z11) {
                                    iArr11 = new int[i29];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z11) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList3;
                                }
                                jArr13 = new long[i29];
                                i30 = 0;
                                z12 = false;
                                i31 = 0;
                                i32 = i20;
                                j17 = 0;
                                while (i30 < jArr10.length) {
                                    j18 = jArr9[i30];
                                    i33 = iArr7[i30];
                                    tb1 tb1Var9 = tb1Var3;
                                    i34 = iArr9[i30];
                                    long[] jArr111 = jArr10;
                                    if (z11) {
                                        int i719 = i34 - i33;
                                        System.arraycopy(jArr8, i33, jArr12, i31, i719);
                                        System.arraycopy(iArr5, i33, iArr10, i31, i719);
                                        System.arraycopy(iArr6, i33, iArr11, i31, i719);
                                    }
                                    i35 = i32;
                                    while (i33 < i34) {
                                        i36 = i33;
                                        int i7110 = i34;
                                        long j213 = pv4VarA.d;
                                        RoundingMode roundingMode5 = RoundingMode.DOWN;
                                        long jA14 = f35.a0(j17, 1000000L, j213, roundingMode5);
                                        jA3 = f35.a0(jArr11[i36] - j18, 1000000L, pv4VarA.c, roundingMode5);
                                        if (jA3 < 0) {
                                            z12 = true;
                                        }
                                        jArr13[i31] = jA14 + jA3;
                                        if (z11) {
                                            i35 = iArr5[i36];
                                        }
                                        if (!z11) {
                                        }
                                        i31++;
                                        i33 = i36 + 1;
                                        i34 = i7110;
                                    }
                                    j17 += jArr111[i30];
                                    i30++;
                                    i32 = i35;
                                    tb1Var3 = tb1Var9;
                                    jArr10 = jArr111;
                                }
                                tb1Var4 = tb1Var3;
                                long jA15 = f35.a0(j17, 1000000L, pv4VarA.d, RoundingMode.DOWN);
                                if (z12) {
                                    sb1 sb1VarA8 = tb1Var4.a();
                                    sb1VarA8.s = true;
                                    pv4VarA = pv4VarA.a(new tb1(sb1VarA8));
                                }
                                xv4Var = new xv4(pv4VarA, jArr12, iArr10, i32, jArr13, iArr11, jz4.N(arrayList5), z6, jA15, jArr12.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(xv4Var);
                            }
                        }
                        xv4Var = xv4Var2;
                    }
                    arrayList6.add(xv4Var);
                }
            }
            i56 = i2 + 1;
            oy2Var2 = oy2Var;
            arrayList6 = arrayList6;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0351  */
    /* JADX WARN: Code duplicated, block: B:205:0x0356 A[EDGE_INSN: B:205:0x0356->B:208:0x0376 BREAK  A[LOOP:4: B:166:0x02e2->B:206:0x0368]] */
    public static qv2 k(py2 py2Var) {
        int i;
        boolean z;
        qv2 qv2Var;
        qv2 qv2Var2;
        int iB;
        qv2 qv2Var3;
        Object objY;
        be3 be3Var = py2Var.p;
        int i2 = 8;
        be3Var.N(8);
        boolean z2 = false;
        qv2 qv2Var4 = new qv2(new pv2[0]);
        while (be3Var.a() >= i2) {
            int i3 = be3Var.b;
            int iM = be3Var.m();
            int iM2 = be3Var.m();
            String str = null;
            if (iM2 == 1835365473) {
                be3Var.N(i3);
                int i4 = i3 + iM;
                be3Var.O(i2);
                a(be3Var);
                while (true) {
                    int i5 = be3Var.b;
                    if (i5 < i4) {
                        int iM3 = be3Var.m();
                        if (be3Var.m() == 1768715124) {
                            be3Var.N(i5);
                            int i6 = i5 + iM3;
                            be3Var.O(i2);
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                int i7 = be3Var.b;
                                if (i7 >= i6) {
                                    break;
                                }
                                int iM4 = be3Var.m() + i7;
                                int iM5 = be3Var.m();
                                int i8 = (iM5 >> 24) & 255;
                                if (i8 == 169 || i8 == 253) {
                                    int i9 = 16777215 & iM5;
                                    if (i9 == 6516084) {
                                        int iM6 = be3Var.m();
                                        if (be3Var.m() == 1684108385) {
                                            be3Var.O(8);
                                            String strW = be3Var.w(iM6 - 16);
                                            objY = new l60("und", strW, strW);
                                        } else {
                                            l93.q0("MetadataUtil", "Failed to parse comment attribute: ".concat(uv.c(iM5)));
                                            objY = null;
                                        }
                                    } else if (i9 == 7233901 || i9 == 7631467) {
                                        objY = gh0.y(iM5, be3Var, "TIT2");
                                    } else if (i9 == 6516589 || i9 == 7828084) {
                                        objY = gh0.y(iM5, be3Var, "TCOM");
                                    } else if (i9 == 6578553) {
                                        objY = gh0.y(iM5, be3Var, "TDRC");
                                    } else if (i9 == 4280916) {
                                        objY = gh0.y(iM5, be3Var, "TPE1");
                                    } else if (i9 == 7630703) {
                                        objY = gh0.y(iM5, be3Var, "TSSE");
                                    } else if (i9 == 6384738) {
                                        objY = gh0.y(iM5, be3Var, "TALB");
                                    } else if (i9 == 7108978) {
                                        objY = gh0.y(iM5, be3Var, "USLT");
                                    } else if (i9 == 6776174) {
                                        objY = gh0.y(iM5, be3Var, "TCON");
                                    } else if (i9 == 6779504) {
                                        objY = gh0.y(iM5, be3Var, "TIT1");
                                    } else if (i9 == 7173742) {
                                        objY = gh0.y(iM5, be3Var, "MVNM");
                                    } else if (i9 == 7173737) {
                                        Object objX = gh0.x(iM5, "MVIN", be3Var, true, false);
                                        be3Var.N(iM4);
                                        objY = objX;
                                    } else {
                                        l93.A("MetadataUtil", "Skipped unknown metadata entry: ".concat(uv.c(iM5)));
                                        be3Var.N(iM4);
                                        objY = null;
                                    }
                                    be3Var.N(iM4);
                                } else {
                                    if (iM5 == 1735291493) {
                                        try {
                                            String strA = pv1.a(gh0.w(be3Var) - 1);
                                            if (strA != null) {
                                                objY = new ds4("TCON", str, yw1.o(strA));
                                            } else {
                                                l93.q0("MetadataUtil", "Failed to parse standard genre code");
                                                objY = str;
                                            }
                                        } catch (Throwable th) {
                                            be3Var.N(iM4);
                                            throw th;
                                        }
                                    } else if (iM5 == 1684632427) {
                                        objY = gh0.v(iM5, be3Var, "TPOS");
                                    } else if (iM5 == 1953655662) {
                                        objY = gh0.v(iM5, be3Var, "TRCK");
                                    } else if (iM5 == 1953329263) {
                                        objY = gh0.x(iM5, "TBPM", be3Var, true, z2);
                                    } else if (iM5 == 1668311404) {
                                        objY = gh0.x(iM5, "TCMP", be3Var, true, true);
                                    } else if (iM5 == 1668249202) {
                                        objY = gh0.u(be3Var);
                                    } else if (iM5 == 1631670868) {
                                        objY = gh0.y(iM5, be3Var, "TPE2");
                                    } else if (iM5 == 1936682605) {
                                        objY = gh0.y(iM5, be3Var, "TSOT");
                                    } else if (iM5 == 1936679276) {
                                        objY = gh0.y(iM5, be3Var, "TSOA");
                                    } else if (iM5 == 1936679282) {
                                        objY = gh0.y(iM5, be3Var, "TSOP");
                                    } else if (iM5 == 1936679265) {
                                        objY = gh0.y(iM5, be3Var, "TSO2");
                                    } else if (iM5 == 1936679791) {
                                        objY = gh0.y(iM5, be3Var, "TSOC");
                                    } else if (iM5 == 1920233063) {
                                        objY = gh0.x(iM5, "ITUNESADVISORY", be3Var, z2, z2);
                                    } else if (iM5 == 1885823344) {
                                        objY = gh0.x(iM5, "ITUNESGAPLESS", be3Var, z2, true);
                                    } else if (iM5 == 1936683886) {
                                        objY = gh0.y(iM5, be3Var, "TVSHOWSORT");
                                    } else if (iM5 == 1953919848) {
                                        objY = gh0.y(iM5, be3Var, "TVSHOW");
                                    } else if (iM5 == 757935405) {
                                        String strW2 = str;
                                        String strW3 = strW2;
                                        int i10 = -1;
                                        int i11 = -1;
                                        while (true) {
                                            int i12 = be3Var.b;
                                            if (i12 >= iM4) {
                                                break;
                                            }
                                            int iM7 = be3Var.m();
                                            int iM8 = be3Var.m();
                                            be3Var.O(4);
                                            if (iM8 == 1835360622) {
                                                strW2 = be3Var.w(iM7 - 12);
                                            } else if (iM8 == 1851878757) {
                                                strW3 = be3Var.w(iM7 - 12);
                                            } else {
                                                if (iM8 == 1684108385) {
                                                    i10 = i12;
                                                    i11 = iM7;
                                                }
                                                be3Var.O(iM7 - 12);
                                            }
                                        }
                                        if (strW2 == null || strW3 == null || i10 == -1) {
                                            objY = null;
                                        } else {
                                            be3Var.N(i10);
                                            be3Var.O(16);
                                            objY = new s02(strW2, strW3, be3Var.w(i11 - 16));
                                        }
                                        be3Var.N(iM4);
                                    } else {
                                        l93.A("MetadataUtil", "Skipped unknown metadata entry: ".concat(uv.c(iM5)));
                                        be3Var.N(iM4);
                                        objY = null;
                                    }
                                    be3Var.N(iM4);
                                }
                                if (objY != null) {
                                    arrayList.add(objY);
                                }
                                z2 = false;
                                str = null;
                            }
                            if (!arrayList.isEmpty()) {
                                qv2Var3 = new qv2(arrayList);
                                break;
                            }
                            break;
                        }
                        be3Var.N(i5 + iM3);
                        i2 = 8;
                        z2 = false;
                        str = null;
                    }
                    qv2Var3 = null;
                    break;
                }
                qv2Var4 = qv2Var4.b(qv2Var3);
                i = 8;
            } else if (iM2 == 1936553057) {
                be3Var.N(i3);
                int i13 = i3 + iM;
                be3Var.O(12);
                while (true) {
                    int i14 = be3Var.b;
                    if (i14 < i13) {
                        int iM9 = be3Var.m();
                        if (be3Var.m() == 1935766900) {
                            if (iM9 >= 16) {
                                be3Var.O(4);
                                int i15 = -1;
                                int i16 = 0;
                                for (int i17 = 0; i17 < 2; i17++) {
                                    int iA = be3Var.A();
                                    int iA2 = be3Var.A();
                                    if (iA == 0) {
                                        i15 = iA2;
                                    } else if (iA == 1) {
                                        i16 = iA2;
                                    }
                                }
                                if (i15 != 12) {
                                    if (i15 != 13) {
                                        if (i15 != 21) {
                                            iB = -2147483647;
                                        } else {
                                            i = 8;
                                            if (be3Var.a() < 8 || be3Var.b + 8 > i13) {
                                                iB = -2147483647;
                                            } else {
                                                int iM10 = be3Var.m();
                                                int iM11 = be3Var.m();
                                                if (iM10 < 12 || iM11 != 1936877170) {
                                                    iB = -2147483647;
                                                } else {
                                                    iB = be3Var.B();
                                                }
                                            }
                                        }
                                        if (iB == -2147483647) {
                                            qv2Var2 = new qv2(new pg4(i16, iB));
                                            break;
                                        }
                                        break;
                                    }
                                    iB = 120;
                                } else {
                                    iB = 240;
                                }
                                i = 8;
                                if (iB == -2147483647) {
                                    qv2Var2 = new qv2(new pg4(i16, iB));
                                    break;
                                }
                                break;
                            }
                            qv2Var2 = null;
                            i = 8;
                            break;
                        }
                        be3Var.N(i14 + iM9);
                    } else {
                        i = 8;
                    }
                    qv2Var2 = null;
                    break;
                }
                qv2Var4 = qv2Var4.b(qv2Var2);
            } else {
                i = 8;
                if (iM2 == -1451722374) {
                    short sX = be3Var.x();
                    be3Var.O(2);
                    String strY = be3Var.y(sX, StandardCharsets.UTF_8);
                    int iMax = Math.max(strY.lastIndexOf(43), strY.lastIndexOf(45));
                    try {
                        try {
                            ty2 ty2Var = new ty2(Float.parseFloat(strY.substring(0, iMax)), Float.parseFloat(strY.substring(iMax, strY.length() - 1)));
                            pv2[] pv2VarArr = new pv2[1];
                            z = false;
                            try {
                                pv2VarArr[0] = ty2Var;
                                qv2Var = new qv2(pv2VarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                qv2Var = null;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z = false;
                    }
                    qv2Var4 = qv2Var4.b(qv2Var);
                }
                be3Var.N(i3 + iM);
                i2 = i;
                z2 = z;
            }
            z = false;
            be3Var.N(i3 + iM);
            i2 = i;
            z2 = z;
        }
        return qv2Var4;
    }
}
