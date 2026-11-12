package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.view.View;
import androidx.media3.common.util.GlUtil$GlException;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.SmartPlan;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j51 {
    public static ExecutorService b;
    public static boolean i;
    public static int j;
    public static Field k;
    public static boolean l;
    public static Class m;
    public static boolean n;
    public static Field o;
    public static boolean p;
    public static Field q;
    public static boolean r;
    public static final Object a = new Object();
    public static final double[][] c = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] d = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] e = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] f = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final int[] g = {619, 720, 127, 481, 931, 816, 813, 233, 566, 247, 985, 724, 205, 454, 863, 491, 741, 242, 949, 214, 733, 859, 335, 708, 621, 574, 73, 654, 730, 472, 419, 436, 278, 496, 867, 210, 399, 680, 480, 51, 878, 465, 811, 169, 869, 675, 611, 697, 867, 561, 862, 687, 507, 283, 482, 129, 807, 591, 733, 623, 150, 238, 59, 379, 684, 877, 625, 169, 643, 105, 170, 607, 520, 932, 727, 476, 693, 425, 174, 647, 73, 122, 335, 530, 442, 853, 695, 249, 445, 515, 909, 545, 703, 919, 874, 474, 882, SmartPlan.MAX_QUEUE, 594, 612, 641, 801, 220, 162, 819, 984, 589, 513, 495, 799, 161, 604, 958, 533, 221, 400, 386, 867, 600, 782, 382, 596, 414, 171, 516, 375, 682, 485, 911, 276, 98, 553, 163, 354, 666, 933, 424, 341, 533, 870, 227, 730, 475, 186, 263, 647, 537, 686, 600, 224, 469, 68, 770, 919, 190, 373, 294, 822, 808, 206, 184, 943, 795, 384, 383, 461, 404, 758, 839, 887, 715, 67, 618, 276, 204, 918, 873, 777, 604, 560, 951, 160, 578, 722, 79, 804, 96, 409, 713, 940, 652, 934, 970, 447, 318, 353, 859, 672, 112, 785, 645, 863, 803, 350, 139, 93, 354, 99, 820, 908, 609, 772, 154, 274, 580, 184, 79, 626, 630, 742, 653, 282, 762, 623, 680, 81, 927, 626, 789, 125, 411, 521, 938, 300, 821, 78, 343, 175, 128, 250, 170, 774, 972, 275, 999, 639, 495, 78, 352, 126, 857, 956, 358, 619, 580, 124, 737, 594, 701, 612, 669, 112, 134, 694, 363, 992, 809, 743, 168, 974, 944, 375, 748, 52, 600, 747, 642, 182, 862, 81, 344, 805, 988, 739, 511, 655, 814, 334, 249, 515, 897, 955, 664, 981, 649, 113, 974, 459, 893, 228, 433, 837, 553, 268, 926, 240, 102, 654, 459, 51, 686, 754, 806, 760, 493, 403, 415, 394, 687, 700, 946, 670, 656, 610, 738, 392, 760, 799, 887, 653, 978, 321, 576, 617, 626, 502, 894, 679, 243, 440, 680, 879, 194, 572, 640, 724, 926, 56, 204, 700, 707, 151, 457, 449, 797, 195, 791, 558, 945, 679, 297, 59, 87, 824, 713, 663, 412, 693, 342, 606, 134, 108, 571, 364, 631, 212, 174, 643, 304, 329, 343, 97, 430, 751, 497, 314, 983, 374, 822, 928, 140, 206, 73, 263, 980, 736, 876, 478, 430, 305, 170, 514, 364, 692, 829, 82, 855, 953, 676, 246, 369, 970, 294, 750, 807, 827, 150, 790, 288, 923, 804, 378, 215, 828, 592, 281, 565, 555, 710, 82, 896, 831, 547, 261, 524, 462, 293, 465, 502, 56, 661, 821, 976, 991, 658, 869, 905, 758, 745, 193, 768, 550, 608, 933, 378, 286, 215, 979, 792, 961, 61, 688, 793, 644, 986, 403, 106, 366, 905, 644, 372, 567, 466, 434, 645, 210, 389, 550, 919, 135, 780, 773, 635, 389, 707, 100, 626, 958, 165, 504, 920, 176, 193, 713, 857, 265, 203, 50, 668, 108, 645, 990, 626, 197, 510, 357, 358, 850, 858, 364, 936, 638};
    public static final Object h = new Object();

    public static double A(double d2) {
        int i2;
        double dAbs = Math.abs(d2);
        double dMax = Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs));
        if (d2 < 0.0d) {
            i2 = -1;
        } else {
            i2 = d2 == 0.0d ? 0 : 1;
        }
        return Math.pow(dMax, 2.380952380952381d) * ((double) i2);
    }

    public static boolean B(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static boolean C(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean D(String str) throws GlUtil$GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        m("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        m("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        l();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static final dx2 E(rg1 rg1Var, dx2 dx2Var) {
        rg1Var.R(439770924);
        byte b2 = 0;
        if (!dx2Var.a(new k2(10, b2))) {
            rg1Var.O(1219399079, null, 0, null);
            dx2Var = (dx2) dx2Var.b(new d60(8, b2), ax2.a);
            rg1Var.o(false);
        }
        rg1Var.o(false);
        return dx2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(cx2 cx2Var, gf1 gf1Var) {
        c83 c83Var = cx2Var.t;
        if (c83Var == null) {
            c83Var = new c83((b83) cx2Var);
            cx2Var.t = c83Var;
        }
        wb3 snapshotObserver = ((ra) P(cx2Var)).getSnapshotObserver();
        snapshotObserver.a.e(c83Var, c83.o, gf1Var);
    }

    public static void G(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(null).newInstance(null));
            } catch (IllegalAccessException e2) {
                R(cls, e2);
                throw null;
            } catch (InstantiationException e3) {
                R(cls, e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                R(cls, e4);
                throw null;
            } catch (InvocationTargetException e5) {
                R(cls, e5);
                throw null;
            }
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    public static final int H(int i2, String str) {
        char cCharAt = str.charAt(i2);
        return (cCharAt << 7) + str.charAt(i2 + 1);
    }

    public static JSONObject I() {
        try {
            return new JSONObject(b11.m("external_download_metadata", "{}"));
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static synchronized void J(String str, long j2) {
        if (str == null || j2 <= 0) {
            return;
        }
        JSONObject jSONObjectI = I();
        try {
            jSONObjectI.put(str, j2);
        } catch (JSONException unused) {
        }
        U(jSONObjectI);
    }

    public static synchronized void K(String str) {
        if (str == null) {
            return;
        }
        JSONObject jSONObjectI = I();
        jSONObjectI.remove(str);
        U(jSONObjectI);
    }

    public static boolean L(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof hx1) {
            collection = ((my3) ((hx1) collection)).i();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static final f63 M(eo0 eo0Var, int i2) {
        f63 f63Var = ((cx2) eo0Var).n.u;
        f63Var.getClass();
        if (f63Var.A0() != eo0Var || !g63.f(i2)) {
            return f63Var;
        }
        f63 f63Var2 = f63Var.I;
        f63Var2.getClass();
        return f63Var2;
    }

    public static final f63 N(eo0 eo0Var) {
        if (!((cx2) eo0Var).n.A) {
            cz1.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        f63 f63VarM = M(eo0Var, 2);
        if (!f63VarM.A0().A) {
            cz1.b("LayoutCoordinates is not attached.");
        }
        return f63VarM;
    }

    public static final c72 O(eo0 eo0Var) {
        f63 f63Var = ((cx2) eo0Var).n.u;
        if (f63Var != null) {
            return f63Var.H;
        }
        throw xa3.l("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final ub3 P(eo0 eo0Var) {
        ub3 ub3Var = O(eo0Var).A;
        if (ub3Var != null) {
            return ub3Var;
        }
        throw xa3.l("This node does not have an owner.");
    }

    public static xy4 Q(xy4 xy4Var, String[] strArr, Map map) {
        int i2 = 0;
        if (xy4Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (xy4) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                xy4 xy4Var2 = new xy4();
                int length = strArr.length;
                while (i2 < length) {
                    xy4Var2.a((xy4) map.get(strArr[i2]));
                    i2++;
                }
                return xy4Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                xy4Var.a((xy4) map.get(strArr[0]));
                return xy4Var;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    xy4Var.a((xy4) map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return xy4Var;
    }

    public static void R(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static double S(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static void T(ArrayList arrayList) {
        int size = arrayList.size();
        if (1 > size || size >= 501) {
            kf2.n("Failed requirement.");
            return;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            int length = str.length();
            if (1 > length || length >= 513 || xm4.k0(str, "ir_", false)) {
                kf2.n("Failed requirement.");
                return;
            }
        }
    }

    public static void U(JSONObject jSONObject) {
        App.b().getClass();
        App.c().edit().putString("external_download_metadata", jSONObject.toString()).apply();
    }

    public static int V(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (lj5.a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i4;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i5);
                int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i4;
                }
                if (iAbs2 <= 0) {
                    return i4;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i4 + i6;
    }

    public static xd a(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new xd(Float.valueOf(f2), new zd(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void b(f13 f13Var, cx2 cx2Var) {
        f13 f13VarY = O(cx2Var).y();
        int i2 = f13VarY.p - 1;
        Object[] objArr = f13VarY.n;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                f13Var.b((cx2) ((c72) objArr[i2]).Q.g);
                i2--;
            }
        }
    }

    public static final cx2 c(f13 f13Var) {
        int i2;
        if (f13Var == null || (i2 = f13Var.p) == 0) {
            return null;
        }
        return (cx2) f13Var.k(i2 - 1);
    }

    public static void d(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = m22.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = tg3.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:76:0x019a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final Object e(xd xdVar, rd rdVar, long j2, final if1 if1Var, wd0 wd0Var) {
        dp4 dp4Var;
        final jx3 jx3Var;
        final xd xdVar2;
        xd xdVar3;
        jx3 jx3Var2;
        Object objA;
        if1 if1Var2;
        vd vdVar;
        vd vdVar2;
        Object objA2;
        final rd rdVar2 = rdVar;
        fz0 fz0Var = fz0.g0;
        if (wd0Var instanceof dp4) {
            dp4Var = (dp4) wd0Var;
            int i2 = dp4Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dp4Var.s = i2 - Integer.MIN_VALUE;
            } else {
                dp4Var = new dp4(wd0Var);
            }
        } else {
            dp4Var = new dp4(wd0Var);
        }
        dp4 dp4Var2 = dp4Var;
        Object obj = dp4Var2.r;
        int i3 = dp4Var2.s;
        int i4 = 0;
        int i5 = 1;
        xe0 xe0Var = xe0.n;
        if (i3 == 0) {
            kb4.X(obj);
            final Object objF = rdVar2.f(0L);
            final ce ceVarD = rdVar2.d(0L);
            jx3Var = new jx3();
            if (j2 == Long.MIN_VALUE) {
                try {
                    final float fV = v(dp4Var2.getContext());
                    xdVar2 = xdVar;
                    try {
                        if1 if1Var3 = new if1() { // from class: ap4
                            @Override // defpackage.if1
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                rd rdVar3 = rdVar2;
                                hd5 hd5VarC = rdVar3.c();
                                Object objG = rdVar3.g();
                                xd xdVar4 = xdVar2;
                                vd vdVar3 = new vd(objF, hd5VarC, ceVarD, jLongValue, objG, jLongValue, new bp4(xdVar4, 1));
                                j51.q(vdVar3, jLongValue, fV, rdVar3, xdVar4, if1Var);
                                jx3Var.n = vdVar3;
                                return j15.a;
                            }
                        };
                        jx3Var2 = jx3Var;
                        try {
                            dp4Var2.n = xdVar2;
                            dp4Var2.o = rdVar2;
                            dp4Var2.p = if1Var;
                            dp4Var2.q = jx3Var2;
                            dp4Var2.s = 1;
                            if (!rdVar2.a()) {
                                objA = vr1.x(dp4Var2.getContext()).a(new ih4(if1Var3, i5), dp4Var2);
                            } else {
                                if (dp4Var2.getContext().K(fz0Var) != null) {
                                    throw new ClassCastException();
                                }
                                objA = vr1.x(dp4Var2.getContext()).a(if1Var3, dp4Var2);
                            }
                            if (objA != xe0Var) {
                                xdVar3 = xdVar2;
                                if1Var2 = if1Var;
                                jx3Var = jx3Var2;
                            }
                            return xe0Var;
                        } catch (CancellationException e2) {
                            e = e2;
                            xdVar3 = xdVar2;
                            jx3Var = jx3Var2;
                            vdVar = (vd) jx3Var.n;
                            if (vdVar != null) {
                                vdVar.i.setValue(Boolean.FALSE);
                            }
                            vdVar2 = (vd) jx3Var.n;
                            if (vdVar2 != null) {
                                xdVar3.r = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        xdVar3 = xdVar2;
                        vdVar = (vd) jx3Var.n;
                        if (vdVar != null) {
                            vdVar.i.setValue(Boolean.FALSE);
                        }
                        vdVar2 = (vd) jx3Var.n;
                        if (vdVar2 != null && vdVar2.g == xdVar3.p) {
                            xdVar3.r = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e4) {
                    e = e4;
                    xdVar2 = xdVar;
                }
            } else {
                jx3Var2 = jx3Var;
                try {
                    vd vdVar3 = new vd(objF, rdVar2.c(), ceVarD, j2, rdVar2.g(), j2, new bp4(xdVar, i4));
                    q(vdVar3, j2, v(dp4Var2.getContext()), rdVar2, xdVar, if1Var);
                    jx3Var2.n = vdVar3;
                    xdVar3 = xdVar;
                    rdVar2 = rdVar;
                    if1Var2 = if1Var;
                    jx3Var = jx3Var2;
                } catch (CancellationException e5) {
                    e = e5;
                    xdVar3 = xdVar;
                    jx3Var = jx3Var2;
                    vdVar = (vd) jx3Var.n;
                    if (vdVar != null) {
                        vdVar.i.setValue(Boolean.FALSE);
                    }
                    vdVar2 = (vd) jx3Var.n;
                    if (vdVar2 != null) {
                        xdVar3.r = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jx3Var = dp4Var2.q;
            if1Var2 = dp4Var2.p;
            rdVar2 = dp4Var2.o;
            xdVar3 = dp4Var2.n;
            try {
                kb4.X(obj);
            } catch (CancellationException e6) {
                e = e6;
                vdVar = (vd) jx3Var.n;
                if (vdVar != null) {
                    vdVar.i.setValue(Boolean.FALSE);
                }
                vdVar2 = (vd) jx3Var.n;
                if (vdVar2 != null) {
                    xdVar3.r = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = jx3Var.n;
            obj2.getClass();
            if (!((Boolean) ((vd) obj2).i.getValue()).booleanValue()) {
                return j15.a;
            }
            final float fV2 = v(dp4Var2.getContext());
            final jx3 jx3Var3 = jx3Var;
            final if1 if1Var4 = if1Var2;
            final rd rdVar3 = rdVar2;
            final xd xdVar4 = xdVar3;
            try {
                if1 if1Var5 = new if1() { // from class: cp4
                    @Override // defpackage.if1
                    public final Object invoke(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = jx3Var3.n;
                        obj4.getClass();
                        j51.q((vd) obj4, jLongValue, fV2, rdVar3, xdVar4, if1Var4);
                        return j15.a;
                    }
                };
                jx3Var = jx3Var3;
                rdVar2 = rdVar3;
                xdVar3 = xdVar4;
                if1Var2 = if1Var4;
                dp4Var2.n = xdVar3;
                dp4Var2.o = rdVar2;
                dp4Var2.p = if1Var2;
                dp4Var2.q = jx3Var;
                dp4Var2.s = 2;
                if (!rdVar2.a()) {
                    objA2 = vr1.x(dp4Var2.getContext()).a(new ih4(if1Var5, i5), dp4Var2);
                } else {
                    if (dp4Var2.getContext().K(fz0Var) != null) {
                        throw new ClassCastException();
                    }
                    objA2 = vr1.x(dp4Var2.getContext()).a(if1Var5, dp4Var2);
                }
            } catch (CancellationException e7) {
                e = e7;
                jx3Var = jx3Var3;
                xdVar3 = xdVar4;
                vdVar = (vd) jx3Var.n;
                if (vdVar != null) {
                    vdVar.i.setValue(Boolean.FALSE);
                }
                vdVar2 = (vd) jx3Var.n;
                if (vdVar2 != null) {
                    xdVar3.r = false;
                }
                throw e;
            }
        } while (objA2 != xe0Var);
        return xe0Var;
    }

    public static Object f(float f2, wd wdVar, wf1 wf1Var, ep4 ep4Var, int i2) {
        if ((i2 & 8) != 0) {
            wdVar = au0.S(7);
        }
        Float f3 = new Float(0.0f);
        Float f4 = new Float(f2);
        Float f5 = new Float(0.0f);
        if1 if1Var = (if1) p35.a.o;
        ce ceVarC = (ce) if1Var.invoke(f5);
        if (ceVarC == null) {
            ceVarC = ((ce) if1Var.invoke(f3)).c();
        }
        ce ceVar = ceVarC;
        Object objE = e(new xd(f3, ceVar, Long.MIN_VALUE, Long.MIN_VALUE, false), new yq4(wdVar, f3, f4, ceVar), Long.MIN_VALUE, new kl3(12, wf1Var), ep4Var);
        j15 j15Var = j15.a;
        xe0 xe0Var = xe0.n;
        if (objE != xe0Var) {
            objE = j15Var;
        }
        return objE == xe0Var ? objE : j15Var;
    }

    public static final Object g(xd xdVar, ui0 ui0Var, boolean z, if1 if1Var, wd0 wd0Var) {
        Object objE = e(xdVar, new ti0(ui0Var, xdVar.n.getValue(), xdVar.o), z ? xdVar.p : Long.MIN_VALUE, if1Var, wd0Var);
        return objE == xe0.n ? objE : j15.a;
    }

    public static final Object h(xd xdVar, Float f2, wd wdVar, boolean z, if1 if1Var, wd0 wd0Var) {
        Object objE = e(xdVar, new yq4(wdVar, xdVar.n.getValue(), f2, xdVar.o), z ? xdVar.p : Long.MIN_VALUE, if1Var, wd0Var);
        return objE == xe0.n ? objE : j15.a;
    }

    public static boolean i(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final u62 j(cx2 cx2Var) {
        if ((cx2Var.p & 2) != 0) {
            if (cx2Var instanceof u62) {
                return (u62) cx2Var;
            }
            if (cx2Var instanceof fo0) {
                cx2 cx2Var2 = ((fo0) cx2Var).C;
                while (cx2Var2 != 0) {
                    if (cx2Var2 instanceof u62) {
                        return (u62) cx2Var2;
                    }
                    cx2Var2 = (!(cx2Var2 instanceof fo0) || (cx2Var2.p & 2) == 0) ? cx2Var2.s : ((fo0) cx2Var2).C;
                }
            }
        }
        return null;
    }

    public static final int k(int i2, int i3, int i4) {
        int i5 = (i2 >>> i4) & 255;
        return ((int) ((((((i3 >>> i4) & 255) - i5) * 0.45f) + i5) + 0.5f)) << i4;
    }

    public static void l() throws GlUtil$GlException {
        StringBuilder sb = new StringBuilder();
        uc5.f(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i3 = i2 + 1;
            int iB = qw1.b(objArrCopyOf.length, i3);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i2] = numValueOf;
            z = true;
            i2 = i3;
        }
        if (z) {
            throw new GlUtil$GlException(sb.toString(), yw1.i(i2, objArrCopyOf));
        }
    }

    public static void m(String str, boolean z) throws GlUtil$GlException {
        if (z) {
            return;
        }
        vw1 vw1Var = yw1.o;
        throw new GlUtil$GlException(str, gy3.r);
    }

    public static double n(double d2) {
        int i2;
        double dPow = Math.pow(Math.abs(d2), 0.42d);
        if (d2 < 0.0d) {
            i2 = -1;
        } else {
            i2 = d2 == 0.0d ? 0 : 1;
        }
        return ((((double) i2) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    public static synchronized void o() {
        U(new JSONObject());
    }

    public static xd p(xd xdVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) xdVar.n.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((zd) xdVar.o).a;
        }
        long j2 = xdVar.p;
        long j3 = xdVar.q;
        boolean z = xdVar.r;
        xdVar.getClass();
        return new xd(Float.valueOf(f2), new zd(f3), j2, j3, z);
    }

    public static final void q(vd vdVar, long j2, float f2, rd rdVar, xd xdVar, if1 if1Var) {
        long jB = f2 == 0.0f ? rdVar.b() : (long) ((j2 - vdVar.c) / f2);
        vdVar.g = j2;
        zd3 zd3Var = vdVar.i;
        Object objF = rdVar.f(jB);
        zd3 zd3Var2 = vdVar.e;
        zd3Var2.setValue(objF);
        vdVar.f = rdVar.d(jB);
        if (rdVar.e(jB)) {
            vdVar.h = vdVar.g;
            zd3Var.setValue(Boolean.FALSE);
        }
        xdVar.n.setValue(zd3Var2.getValue());
        ce ceVar = xdVar.o;
        ce ceVar2 = vdVar.f;
        int iB = ceVar.b();
        for (int i2 = 0; i2 < iB; i2++) {
            ceVar.d(i2, ceVar2.a(i2));
        }
        xdVar.q = vdVar.h;
        xdVar.p = vdVar.g;
        xdVar.r = ((Boolean) zd3Var.getValue()).booleanValue();
        if1Var.invoke(vdVar);
    }

    public static boolean r(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static hb4 s(Set set, ro3 ro3Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof hb4)) {
                return new ib4(set2, ro3Var);
            }
            hb4 hb4Var = (hb4) set2;
            ro3 ro3Var2 = hb4Var.o;
            ro3Var2.getClass();
            return new ib4((SortedSet) hb4Var.n, new so3(Arrays.asList(ro3Var2, ro3Var)));
        }
        if (!(set instanceof hb4)) {
            set.getClass();
            return new hb4(set, ro3Var);
        }
        hb4 hb4Var2 = (hb4) set;
        ro3 ro3Var3 = hb4Var2.o;
        ro3Var3.getClass();
        return new hb4(hb4Var2.n, new so3(Arrays.asList(ro3Var3, ro3Var)));
    }

    public static mw2 t(mw2 mw2Var, r62 r62Var, zs4 zs4Var, oo0 oo0Var, ha1 ha1Var) {
        if (mw2Var != null && r62Var == mw2Var.a && ud3.g0(zs4Var, r62Var).equals(mw2Var.b) && oo0Var.g() == mw2Var.c.n && ha1Var == mw2Var.d) {
            return mw2Var;
        }
        mw2 mw2Var2 = mw2.h;
        if (mw2Var2 != null && r62Var == mw2Var2.a && ud3.g0(zs4Var, r62Var).equals(mw2Var2.b) && oo0Var.g() == mw2Var2.c.n && ha1Var == mw2Var2.d) {
            return mw2Var2;
        }
        mw2 mw2Var3 = new mw2(r62Var, ud3.g0(zs4Var, r62Var), new ro0(oo0Var.g(), oo0Var.J()), ha1Var);
        mw2.h = mw2Var3;
        return mw2Var3;
    }

    public static final ba2 u(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            ba2 ba2Var = tag instanceof ba2 ? (ba2) tag : null;
            if (ba2Var != null) {
                return ba2Var;
            }
            Object objZ = au0.z(view);
            view = objZ instanceof View ? (View) objZ : null;
        }
        return null;
    }

    public static final float v(ne0 ne0Var) {
        qx2 qx2Var = (qx2) ne0Var.K(rv2.q);
        float fV = qx2Var != null ? qx2Var.v() : 1.0f;
        if (fV >= 0.0f) {
            return fV;
        }
        qo3.b("negative scale factor");
        return fV;
    }

    public static synchronized Long w(String str) {
        if (str == null) {
            return null;
        }
        JSONObject jSONObjectI = I();
        if (!jSONObjectI.has(str)) {
            return null;
        }
        long jOptLong = jSONObjectI.optLong(str, -1L);
        return jOptLong > 0 ? Long.valueOf(jOptLong) : null;
    }

    public static int x(Set set) {
        Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    public static double y(double[] dArr) {
        double[] dArrA0 = ud3.a0(dArr, c);
        double dN = n(dArrA0[0]);
        double dN2 = n(dArrA0[1]);
        double dN3 = n(dArrA0[2]);
        return Math.atan2(((dN + dN2) - (dN3 * 2.0d)) / 9.0d, ((((-12.0d) * dN2) + (dN * 11.0d)) + dN3) / 11.0d);
    }

    public static gb4 z(Set set, jx1 jx1Var) {
        rr2.s(set, "set1");
        rr2.s(jx1Var, "set2");
        return new gb4(set, jx1Var);
    }
}
