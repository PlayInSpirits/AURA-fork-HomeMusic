package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.ArrayList;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ds4 extends nv1 {
    public final String b;
    public final String c;
    public final yw1 d;

    public ds4(String str, String str2, gy3 gy3Var) {
        super(str);
        rr2.l(!gy3Var.isEmpty());
        this.b = str2;
        yw1 yw1VarK = yw1.k(gy3Var);
        this.d = yw1VarK;
        this.c = (String) yw1VarK.get(0);
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // defpackage.pv2
    public final void b(co2 co2Var) {
        byte b;
        switch (this.a) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TRCK":
                b = 21;
                break;
            case "TYER":
                b = 22;
                break;
            default:
                b = -1;
                break;
        }
        yw1 yw1Var = this.d;
        try {
            switch (b) {
                case 0:
                case 10:
                    co2Var.c = (CharSequence) yw1Var.get(0);
                    break;
                case 1:
                case 11:
                    co2Var.z = (CharSequence) yw1Var.get(0);
                    break;
                case 2:
                case 13:
                    String str = (String) yw1Var.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    co2Var.t = Integer.valueOf(i);
                    co2Var.u = Integer.valueOf(i2);
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                case 18:
                    co2Var.b = (CharSequence) yw1Var.get(0);
                    break;
                case 4:
                case 19:
                    co2Var.d = (CharSequence) yw1Var.get(0);
                    break;
                case 5:
                case 20:
                    co2Var.A = (CharSequence) yw1Var.get(0);
                    break;
                case 6:
                case 21:
                    String str2 = (String) yw1Var.get(0);
                    String str3 = f35.a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    co2Var.n = Integer.valueOf(i3);
                    co2Var.o = numValueOf;
                    break;
                case 7:
                case 17:
                    co2Var.a = (CharSequence) yw1Var.get(0);
                    break;
                case 8:
                case WaveRetry.MAX_FAILURES /* 16 */:
                    co2Var.y = (CharSequence) yw1Var.get(0);
                    break;
                case 9:
                case 22:
                    co2Var.s = Integer.valueOf(Integer.parseInt((String) yw1Var.get(0)));
                    break;
                case 12:
                    Integer numO = jz4.O((String) yw1Var.get(0));
                    if (numO != null) {
                        String strA = pv1.a(numO.intValue());
                        if (strA != null) {
                            co2Var.D = strA;
                        }
                    } else {
                        co2Var.D = (CharSequence) yw1Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) yw1Var.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                co2Var.u = (Integer) arrayListD.get(2);
                            }
                        }
                        co2Var.t = (Integer) arrayListD.get(1);
                    }
                    co2Var.s = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) yw1Var.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                co2Var.x = (Integer) arrayListD2.get(2);
                            }
                        }
                        co2Var.w = (Integer) arrayListD2.get(1);
                    }
                    co2Var.v = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ds4.class != obj.getClass()) {
            return false;
        }
        ds4 ds4Var = (ds4) obj;
        return this.a.equals(ds4Var.a) && Objects.equals(this.b, ds4Var.b) && this.d.equals(ds4Var.d);
    }

    public final int hashCode() {
        int iE = f34.e(this.a, 527, 31);
        String str = this.b;
        return this.d.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.d;
    }
}
