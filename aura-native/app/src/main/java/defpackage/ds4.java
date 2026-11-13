package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.ArrayList;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ds4 extends nv1 {
    public final String b;
    public final String c;
    public final yw1 d;

    public ds4(String str, String str2, gy3 gy3Var) {
        super(str);
        rr2.l(!gy3Var.isEmpty());
        this.b = str2;
        yw1 k = yw1.k(gy3Var);
        this.d = k;
        this.c = (String) k.get(0);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.pv2
    public final void b(co2 co2Var) {
        char c;
        String str = this.a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        yw1 yw1Var = this.d;
        try {
            switch (c) {
                case 0:
                case '\n':
                    co2Var.c = (CharSequence) yw1Var.get(0);
                    break;
                case 1:
                case 11:
                    co2Var.z = (CharSequence) yw1Var.get(0);
                    break;
                case 2:
                case '\r':
                    String str2 = (String) yw1Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    co2Var.t = Integer.valueOf(parseInt);
                    co2Var.u = Integer.valueOf(parseInt2);
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
                    String str3 = (String) yw1Var.get(0);
                    String str4 = f35.a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    co2Var.n = Integer.valueOf(parseInt3);
                    co2Var.o = valueOf;
                    break;
                case 7:
                case 17:
                    co2Var.a = (CharSequence) yw1Var.get(0);
                    break;
                case '\b':
                case WaveRetry.MAX_FAILURES /* 16 */:
                    co2Var.y = (CharSequence) yw1Var.get(0);
                    break;
                case '\t':
                case 22:
                    co2Var.s = Integer.valueOf(Integer.parseInt((String) yw1Var.get(0)));
                    break;
                case '\f':
                    Integer O = jz4.O((String) yw1Var.get(0));
                    if (O != null) {
                        String a = pv1.a(O.intValue());
                        if (a != null) {
                            co2Var.D = a;
                            break;
                        }
                    } else {
                        co2Var.D = (CharSequence) yw1Var.get(0);
                        break;
                    }
                    break;
                case 14:
                    ArrayList d = d((String) yw1Var.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                co2Var.u = (Integer) d.get(2);
                            }
                        }
                        co2Var.t = (Integer) d.get(1);
                    }
                    co2Var.s = (Integer) d.get(0);
                    break;
                case 15:
                    ArrayList d2 = d((String) yw1Var.get(0));
                    int size2 = d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                co2Var.x = (Integer) d2.get(2);
                            }
                        }
                        co2Var.w = (Integer) d2.get(1);
                    }
                    co2Var.v = (Integer) d2.get(0);
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
        int e = f34.e(this.a, 527, 31);
        String str = this.b;
        return this.d.hashCode() + ((e + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.nv1
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.d;
    }
}
