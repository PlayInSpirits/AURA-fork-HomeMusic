package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rb2 implements ao {
    public final yw1 a;
    public final int b;

    public rb2(int i, gy3 gy3Var) {
        this.b = i;
        this.a = gy3Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static rb2 b(int i, be3 be3Var) {
        String str;
        ao dm4Var;
        String str2;
        int i2 = 4;
        uc5.f(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = be3Var.c;
        int iA = -2;
        int i4 = 0;
        while (be3Var.a() > 8) {
            int iO = be3Var.o();
            int iO2 = be3Var.b + be3Var.o();
            be3Var.M(iO2);
            if (iO != 1414744396) {
                fo foVar = null;
                switch (iO) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iT = be3Var.t();
                                if (iT == 1) {
                                    str = "audio/raw";
                                } else if (iT == 85) {
                                    str = "audio/mpeg";
                                } else if (iT == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iT != 8192) {
                                    str = iT != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iT2 = be3Var.t();
                                    int iO3 = be3Var.o();
                                    be3Var.O(6);
                                    int iT3 = be3Var.t();
                                    String str3 = f35.a;
                                    int iC = f35.C(iT3, ByteOrder.LITTLE_ENDIAN);
                                    int iT4 = be3Var.a() > 0 ? be3Var.t() : 0;
                                    sb1 sb1Var = new sb1();
                                    sb1Var.m = lw2.m(str);
                                    sb1Var.E = iT2;
                                    sb1Var.F = iO3;
                                    if (str.equals("audio/raw") && iC != 0) {
                                        sb1Var.G = iC;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iT4 > 0) {
                                        byte[] bArr = new byte[iT4];
                                        be3Var.k(bArr, 0, iT4);
                                        sb1Var.p = yw1.o(bArr);
                                    }
                                    dm4Var = new dm4(new tb1(sb1Var));
                                } else {
                                    xa3.m(iT, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                l93.q0("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(f35.H(iA)));
                            }
                            dm4Var = foVar;
                            break;
                        } else {
                            be3Var.O(i2);
                            int iO4 = be3Var.o();
                            int iO5 = be3Var.o();
                            be3Var.O(i2);
                            int iO6 = be3Var.o();
                            switch (iO6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                sb1 sb1Var2 = new sb1();
                                sb1Var2.t = iO4;
                                sb1Var2.u = iO5;
                                sb1Var2.m = lw2.m(str2);
                                dm4Var = new dm4(new tb1(sb1Var2));
                            } else {
                                xa3.m(iO6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                dm4Var = foVar;
                            }
                        }
                        break;
                    case 1751742049:
                        int iO7 = be3Var.o();
                        be3Var.O(8);
                        int iO8 = be3Var.o();
                        int iO9 = be3Var.o();
                        be3Var.O(i2);
                        be3Var.o();
                        be3Var.O(12);
                        dm4Var = new eo(iO7, iO8, iO9);
                        break;
                    case 1752331379:
                        int iO10 = be3Var.o();
                        be3Var.O(12);
                        be3Var.o();
                        int iO11 = be3Var.o();
                        int iO12 = be3Var.o();
                        be3Var.O(i2);
                        int iO13 = be3Var.o();
                        int iO14 = be3Var.o();
                        be3Var.O(i2);
                        foVar = new fo(iO10, iO11, iO12, iO13, iO14, be3Var.o());
                        dm4Var = foVar;
                        break;
                    case 1852994675:
                        dm4Var = new hm4(be3Var.y(be3Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        dm4Var = foVar;
                        break;
                }
            } else {
                dm4Var = b(be3Var.o(), be3Var);
            }
            if (dm4Var != null) {
                if (dm4Var.getType() == 1752331379) {
                    iA = ((fo) dm4Var).a();
                }
                int i5 = i4 + 1;
                int iB = qw1.b(objArrCopyOf.length, i5);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i4] = dm4Var;
                i4 = i5;
            }
            be3Var.N(iO2);
            be3Var.M(i3);
            i2 = 4;
        }
        return new rb2(i, yw1.i(i4, objArrCopyOf));
    }

    public final ao a(Class cls) {
        vw1 vw1VarListIterator = this.a.listIterator(0);
        while (vw1VarListIterator.hasNext()) {
            ao aoVar = (ao) vw1VarListIterator.next();
            if (aoVar.getClass() == cls) {
                return aoVar;
            }
        }
        return null;
    }

    @Override // defpackage.ao
    public final int getType() {
        return this.b;
    }
}
