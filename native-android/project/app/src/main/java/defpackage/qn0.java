package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qn0 {
    public final int a;
    public final List b;

    public qn0() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0061  */
    public ty4 a(int i, gc gcVar) {
        String str = (String) gcVar.b;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new ag3(new vy2(gcVar.b(), str, "video/mp2t"));
            }
            if (i == 21) {
                return new ag3(new wx0());
            }
            if (i == 27) {
                if (c(4)) {
                    return null;
                }
                return new ag3(new bl1(new jv3(b(gcVar)), c(1), c(8)));
            }
            if (i == 36) {
                return new ag3(new dl1(new jv3(b(gcVar))));
            }
            if (i == 45) {
                return new ag3(new xy2());
            }
            if (i == 89) {
                return new ag3(new wx0((List) gcVar.c));
            }
            if (i == 172) {
                return new ag3(new s2(gcVar.b(), 1, str, "video/mp2t"));
            }
            if (i == 257) {
                return new h84(new z05("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new ag3(new jx0(str, gcVar.b(), 5408));
                }
                switch (i) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new ag3(new i6(str, gcVar.b(), "video/mp2t", false));
                    case WaveRetry.MAX_FAILURES /* 16 */:
                        return new ag3(new yk1(new r20(b(gcVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new ag3(new j62(gcVar.b(), str));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case 129:
                                return new ag3(new s2(gcVar.b(), 0, str, "video/mp2t"));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new h84(new z05("application/x-scte35"));
                                    case 135:
                                        return new ag3(new s2(gcVar.b(), 0, str, "video/mp2t"));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new ag3(new jx0(str, gcVar.b(), 4096));
        }
        return new ag3(new vk1(new r20(b(gcVar)), "video/mp2t"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List b(gc gcVar) {
        String str;
        int i;
        List listSingletonList;
        boolean zC = c(32);
        List list = this.b;
        if (zC) {
            return list;
        }
        be3 be3Var = new be3((byte[]) gcVar.d);
        ArrayList arrayList = list;
        while (be3Var.a() > 0) {
            int iA = be3Var.A();
            int iA2 = be3Var.b + be3Var.A();
            if (iA == 134) {
                arrayList = new ArrayList();
                int iA3 = be3Var.A() & 31;
                for (int i2 = 0; i2 < iA3; i2++) {
                    String strY = be3Var.y(3, StandardCharsets.UTF_8);
                    int iA4 = be3Var.A();
                    boolean z = (iA4 & 128) != 0;
                    if (z) {
                        i = iA4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bA = (byte) be3Var.A();
                    be3Var.O(1);
                    if (z) {
                        boolean z2 = (bA & 64) != 0;
                        byte[] bArr = i40.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    sb1 sb1Var = new sb1();
                    sb1Var.m = lw2.m(str);
                    sb1Var.d = strY;
                    sb1Var.J = i;
                    sb1Var.p = listSingletonList;
                    arrayList.add(new tb1(sb1Var));
                }
            }
            be3Var.N(iA2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public boolean c(int i) {
        return (this.a & i) != 0;
    }

    public qn0(List list, int i) {
        this.a = i;
        this.b = list;
    }

    public qn0(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
