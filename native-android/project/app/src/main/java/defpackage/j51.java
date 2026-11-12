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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j51 {
    public static final Object a = null;
    public static ExecutorService b;
    public static final double[][] c = null;
    public static final double[][] d = null;
    public static final double[] e = null;
    public static final double[] f = null;
    public static final int[] g = null;
    public static final Object h = null;
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

    static {
        a = new Object();
        c = new double[][]{new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
        d = new double[][]{new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
        e = new double[]{0.2126d, 0.7152d, 0.0722d};
        f = new double[]{0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
        g = new int[]{619, 720, 127, 481, 931, 816, 813, 233, 566, 247, 985, 724, 205, 454, 863, 491, 741, 242, 949, 214, 733, 859, 335, 708, 621, 574, 73, 654, 730, 472, 419, 436, 278, 496, 867, 210, 399, 680, 480, 51, 878, 465, 811, 169, 869, 675, 611, 697, 867, 561, 862, 687, 507, 283, 482, 129, 807, 591, 733, 623, 150, 238, 59, 379, 684, 877, 625, 169, 643, 105, 170, 607, 520, 932, 727, 476, 693, 425, 174, 647, 73, 122, 335, 530, 442, 853, 695, 249, 445, 515, 909, 545, 703, 919, 874, 474, 882, SmartPlan.MAX_QUEUE, 594, 612, 641, 801, 220, 162, 819, 984, 589, 513, 495, 799, 161, 604, 958, 533, 221, 400, 386, 867, 600, 782, 382, 596, 414, 171, 516, 375, 682, 485, 911, 276, 98, 553, 163, 354, 666, 933, 424, 341, 533, 870, 227, 730, 475, 186, 263, 647, 537, 686, 600, 224, 469, 68, 770, 919, 190, 373, 294, 822, 808, 206, 184, 943, 795, 384, 383, 461, 404, 758, 839, 887, 715, 67, 618, 276, 204, 918, 873, 777, 604, 560, 951, 160, 578, 722, 79, 804, 96, 409, 713, 940, 652, 934, 970, 447, 318, 353, 859, 672, 112, 785, 645, 863, 803, 350, 139, 93, 354, 99, 820, 908, 609, 772, 154, 274, 580, 184, 79, 626, 630, 742, 653, 282, 762, 623, 680, 81, 927, 626, 789, 125, 411, 521, 938, 300, 821, 78, 343, 175, 128, 250, 170, 774, 972, 275, 999, 639, 495, 78, 352, 126, 857, 956, 358, 619, 580, 124, 737, 594, 701, 612, 669, 112, 134, 694, 363, 992, 809, 743, 168, 974, 944, 375, 748, 52, 600, 747, 642, 182, 862, 81, 344, 805, 988, 739, 511, 655, 814, 334, 249, 515, 897, 955, 664, 981, 649, 113, 974, 459, 893, 228, 433, 837, 553, 268, 926, 240, 102, 654, 459, 51, 686, 754, 806, 760, 493, 403, 415, 394, 687, 700, 946, 670, 656, 610, 738, 392, 760, 799, 887, 653, 978, 321, 576, 617, 626, 502, 894, 679, 243, 440, 680, 879, 194, 572, 640, 724, 926, 56, 204, 700, 707, 151, 457, 449, 797, 195, 791, 558, 945, 679, 297, 59, 87, 824, 713, 663, 412, 693, 342, 606, 134, 108, 571, 364, 631, 212, 174, 643, 304, 329, 343, 97, 430, 751, 497, 314, 983, 374, 822, 928, 140, 206, 73, 263, 980, 736, 876, 478, 430, 305, 170, 514, 364, 692, 829, 82, 855, 953, 676, 246, 369, 970, 294, 750, 807, 827, 150, 790, 288, 923, 804, 378, 215, 828, 592, 281, 565, 555, 710, 82, 896, 831, 547, 261, 524, 462, 293, 465, 502, 56, 661, 821, 976, 991, 658, 869, 905, 758, 745, 193, 768, 550, 608, 933, 378, 286, 215, 979, 792, 961, 61, 688, 793, 644, 986, 403, 106, 366, 905, 644, 372, 567, 466, 434, 645, 210, 389, 550, 919, 135, 780, 773, 635, 389, 707, 100, 626, 958, 165, 504, 920, 176, 193, 713, 857, 265, 203, 50, 668, 108, 645, 990, 626, 197, 510, 357, 358, 850, 858, 364, 936, 638};
        h = new Object();
    }

    public static double A(double r6) {
        double r0 = Math.abs(r6);
        double r2 = Math.max(0.0d, (27.13d * r0) / (400.0d - r0));
        if (r6 >= 0.0d) goto L6;
        int r7 = -1;
    L9:
        double r1 = Math.pow(r2, 2.380952380952381d);
        return r1 * ((double) r7);
    L6:
        if (r6 != 0.0d) goto L8;
        r7 = 0;
        goto L9
    L8:
        r7 = 1;
        goto L9
    }

    public static boolean B(double r2) {
        if (0.0d <= r2) goto L5;
        return false;
    L5:
        if (r2 > 100.0d) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean C(String r1) {
        if ("Connection".equalsIgnoreCase(r1) == false) goto L5;
        return false;
    L5:
        if ("Keep-Alive".equalsIgnoreCase(r1) == false) goto L7;
        return false;
    L7:
        if ("Proxy-Authenticate".equalsIgnoreCase(r1) == false) goto L9;
        return false;
    L9:
        if ("Proxy-Authorization".equalsIgnoreCase(r1) == false) goto L11;
        return false;
    L11:
        if ("TE".equalsIgnoreCase(r1) == false) goto L13;
        return false;
    L13:
        if ("Trailers".equalsIgnoreCase(r1) == false) goto L15;
        return false;
    L15:
        if ("Transfer-Encoding".equalsIgnoreCase(r1) == false) goto L17;
        return false;
    L17:
        if ("Upgrade".equalsIgnoreCase(r1) == true) goto L28;
        return true;
    L28:
        return false;
    }

    public static boolean D(String r5) {
        EGLDisplay r1 = EGL14.eglGetDisplay(0);
        m("No EGL display.", !r1.equals(EGL14.EGL_NO_DISPLAY));
        m("Error in eglInitialize.", EGL14.eglInitialize(r1, new int[1], 0, new int[1], 0));
        l();
        String r2 = EGL14.eglQueryString(r1, 12373);
        if (r2 != null) goto L5;
    L7:
        return false;
    L5:
        if (r2.contains(r5) == false) goto L7;
        return true;
    }

    public static final dx2 E(rg1 r3, dx2 r4) {
        r3.R(439770924);
        byte r2 = 0;
        if (r4.a(new k2(10, r2)) == true) goto L6;
        r3.O(1219399079, null, 0, null);
        r4 = (dx2) r4.b(new d60(8, r2), ax2.a);
        r3.o(false);
    L6:
        r3.o(false);
        return r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(cx2 r2, gf1 r3) {
        c83 r0 = r2.t;
        if (r0 != null) goto L5;
        r0 = new c83((b83) r2);
        r2.t = r0;
    L5:
        wb3 r4 = ((ra) P(r2)).getSnapshotObserver();
        k52 r1 = c83.o;
        r4.a.e(r0, r1, r3);
    }

    public static void G(String r3) {
        Class<?> r4 = Class.forName(r3);     // Catch: ClassNotFoundException -> L23
    L6:
        throw new RuntimeException("Expected instanceof GlideModule, but found: " + r4.getDeclaredConstructor(null).newInstance(null));
    L11:
        e = move-exception;
        R(r4, e);
        throw null;
    L13:
        e = move-exception;
        R(r4, e);
        throw null;
    L9:
        e = move-exception;
        R(r4, e);
        throw null;
    L7:
        e = move-exception;
        R(r4, e);
        throw null;
    L23:
        e = move-exception;
        throw new IllegalArgumentException("Unable to find GlideModule implementation", e);
    }

    public static final int H(int r1, String r2) {
        char r0 = r2.charAt(r1);
        char r3 = r2.charAt(r1 + 1);
        return (r0 << 7) + r3;
    }

    public static JSONObject I() {
        return new JSONObject(b11.m("external_download_metadata", "{}"));
    L6:
        return new JSONObject();
    }

    public static synchronized void J(String r3, long r4) {
        monitor-enter(j51.class);
        if (r3 != null) goto L6;
    L18:
        monitor-exit(j51.class);
        return;
    L6:
        if (r4 <= 0) goto L18;
        JSONObject r1 = I();     // Catch: Throwable -> L11
        r1.put(r3, r4);     // Catch: Throwable -> L11 JSONException -> L20
    L13:
        U(r1);     // Catch: Throwable -> L11
        monitor-exit(j51.class);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public static synchronized void K(String r2) {
        monitor-enter(j51.class);
        if (r2 != null) goto L13;
        monitor-exit(j51.class);
        return;
    L13:
        JSONObject r1 = I();     // Catch: Throwable -> L10
        r1.remove(r2);     // Catch: Throwable -> L10
        U(r1);     // Catch: Throwable -> L10
        monitor-exit(j51.class);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public static boolean L(Set r3, Collection r4) {
        r4.getClass();
        if ((r4 instanceof hx1) == false) goto L5;
        r4 = ((my3) ((hx1) r4)).i();
    L5:
        boolean r1 = false;
        if ((r4 instanceof Set) == true) goto L8;
    L16:
        Iterator r5 = r4.iterator();
    L18:
        if (r5.hasNext() == false) goto L20;
        r1 = r1 | r3.remove(r5.next());
        goto L18
    L20:
        return r1;
    L8:
        if (r4.size() <= r3.size()) goto L16;
        Iterator r6 = r3.iterator();
    L11:
        if (r6.hasNext() == false) goto L15;
        if (r4.contains(r6.next()) == false) goto L11;
        r6.remove();
        r1 = true;
        goto L11
    L15:
        return r1;
    }

    public static final f63 M(eo0 r2, int r3) {
        f63 r0 = ((cx2) r2).n.u;
        r0.getClass();
        if (r0.A0() == r2) goto L6;
    L9:
        return r0;
    L6:
        if (g63.f(r3) == false) goto L9;
        f63 r4 = r0.I;
        r4.getClass();
        return r4;
    }

    public static final f63 N(eo0 r1) {
        if (((cx2) r1).n.A == true) goto L5;
        cz1.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
    L5:
        f63 r2 = M(r1, 2);
        if (r2.A0().A == true) goto L8;
        cz1.b("LayoutCoordinates is not attached.");
    L8:
        return r2;
    }

    public static final c72 O(eo0 r0) {
        f63 r1 = ((cx2) r0).n.u;
        if (r1 == null) goto L7;
        return r1.H;
    L7:
        throw xa3.l("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final ub3 P(eo0 r0) {
        ub3 r1 = O(r0).A;
        if (r1 == null) goto L6;
        return r1;
    L6:
        throw xa3.l("This node does not have an owner.");
    }

    public static xy4 Q(xy4 r3, String[] r4, Map r5) {
        int r0 = 0;
        if (r3 != null) goto L17;
        if (r4 != null) goto L8;
        return null;
    L8:
        if (r4.length != 1) goto L12;
        return (xy4) r5.get(r4[0]);
    L12:
        if (r4.length <= 1) goto L28;
        xy4 r6 = new xy4();
        int r1 = r4.length;
    L14:
        if (r0 >= r1) goto L16;
        r6.a((xy4) r5.get(r4[r0]));
        r0 = r0 + 1;
        goto L14
    L16:
        return r6;
    L28:
        return r3;
    L17:
        if (r4 != null) goto L19;
    L22:
        if (r4 == null) goto L28;
        if (r4.length <= 1) goto L28;
        int r2 = r4.length;
    L26:
        if (r0 >= r2) goto L28;
        r3.a((xy4) r5.get(r4[r0]));
        r0 = r0 + 1;
        goto L26
    L19:
        if (r4.length != 1) goto L22;
        r3.a((xy4) r5.get(r4[0]));
        return r3;
    }

    public static void R(Class r3, ReflectiveOperationException r4) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + r3, r4);
    }

    public static double S(double r2) {
        double r3 = r2 / 100.0d;
        if (r3 > 0.0031308d) goto L5;
        double r4 = r3 * 12.92d;
    L7:
        return r4 * 255.0d;
    L5:
        r4 = (Math.pow(r3, 0.4166666666666667d) * 1.055d) - 0.055d;
        goto L7
    }

    public static void T(ArrayList r8) {
        int r0 = r8.size();
        if (1 <= r0) goto L5;
    L20:
        kf2.n("Failed requirement.");
        return;
    L5:
        if (r0 >= 501) goto L20;
        if (r8.isEmpty() == true) goto L27;
        int r1 = r8.size();
        int r4 = 0;
    L10:
        if (r4 >= r1) goto L28;
        Object r5 = r8.get(r4);
        r4 = r4 + 1;
        String r6 = (String) r5;
        int r7 = r6.length();
        if (1 > r7) goto L18;
        if (r7 >= 513) goto L18;
        if (xm4.k0(r6, "ir_", false) == false) goto L10;
    L18:
        kf2.n("Failed requirement.");
        return;
    L28:
        return;
    }

    public static void U(JSONObject r2) {
        App.b().getClass();
        App.c().edit().putString("external_download_metadata", r2.toString()).apply();
    }

    public static int V(int r4, int r5) {
        RoundingMode r0 = RoundingMode.CEILING;
        r0.getClass();
        if (r5 == 0) goto L24;
        int r1 = r4 / r5;
        int r2 = r4 - (r5 * r1);
        if (r2 == 0) goto L30;
        int r6 = ((r4 ^ r5) >> 31) | 1;
        switch(lj5.a[r0.ordinal()]) {
            case 1: goto L22;
            case 2: goto L25;
            case 3: goto L18;
            case 4: goto L20;
            case 5: goto L16;
            case 6: goto L11;
            case 7: goto L11;
            case 8: goto L11;
            default: goto L10;
        };
    L11:
        int r3 = Math.abs(r2);
        int r7 = r3 - (Math.abs(r5) - r3);
        if (r7 != 0) goto L14;
        RoundingMode r8 = RoundingMode.HALF_UP;
        RoundingMode r9 = RoundingMode.HALF_EVEN;
        return r1;
    L14:
        if (r7 > 0) goto L20;
        return r1;
    L16:
        if (r6 > 0) goto L20;
        return r1;
    L18:
        if (r6 < 0) goto L20;
        return r1;
    L25:
        return r1;
    L10:
        throw new AssertionError();
    L20:
        return r1 + r6;
    L22:
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    L30:
        return r1;
    L24:
        throw new ArithmeticException("/ by zero");
    }

    public static xd a(float r8, float r9, int r10) {
        if ((r10 & 2) == 0) goto L6;
        r9 = 0.0f;
    L6:
        return new xd(Float.valueOf(r8), new zd(r9), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void b(f13 r2, cx2 r3) {
        f13 r4 = O(r3).y();
        int r0 = r4.p - 1;
        Object[] r5 = r4.n;
        if (r0 >= r5.length) goto L6;
    L4:
        if (r0 < 0) goto L8;
        r2.b((cx2) ((c72) r5[r0]).Q.g);
        r0 = r0 - 1;
        goto L4
    L8:
        return;
    }

    public static final cx2 c(f13 r1) {
        if (r1 == null) goto L8;
        int r0 = r1.p;
        if (r0 != 0) goto L7;
        return null;
    L7:
        return (cx2) r1.k(r0 - 1);
    L8:
        return null;
    }

    public static void d(Throwable r2, Throwable r3) {
        r2.getClass();
        r3.getClass();
        if (r2 == r3) goto L18;
        Integer r0 = m22.a;
        if (r0 != null) goto L7;
    L10:
        boolean r1 = true;
    L11:
        if (r1 == false) goto L14;
        r2.addSuppressed(r3);
        return;
    L14:
        Method r4 = tg3.a;
        if (r4 == null) goto L19;
        r4.invoke(r2, new Object[]{r3});
        return;
    L19:
        return;
    L7:
        if (r0.intValue() >= 19) goto L10;
        r1 = false;
        goto L11
    }

    public static final Object e(xd r24, rd r25, long r26, final if1 r28, wd0 r29) {
        final rd r3 = r25;
        fz0 r8 = fz0.g0;
        if ((r29 instanceof dp4) == false) goto L8;
        dp4 r1 = (dp4) r29;
        int r2 = r1.s;
        if ((r2 & Integer.MIN_VALUE) == 0) goto L8;
        r1.s = r2 - Integer.MIN_VALUE;
    L7:
        dp4 r9 = r1;
        Object r0 = r9.r;
        int r4 = r9.s;
        int r10 = 0;
        int r12 = 1;
        xe0 r13 = xe0.n;
        if (r4 == 0) goto L20;
        if (r4 == 1) goto L13;
        if (r4 == 2) goto L13;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L13:
        final jx3 r5 = r9.q;
        if1 r6 = r9.p;
        r3 = r9.o;
        xd r7 = r9.n;
        kb4.X(r0);     // Catch: CancellationException -> L16
    L49:
        Object r11 = r5.n;     // Catch: CancellationException -> L16
        r11.getClass();     // Catch: CancellationException -> L16
        if (((Boolean) ((vd) r11).i.getValue()).booleanValue() == false) goto L68;
        final float r14 = v(r9.getContext());     // Catch: CancellationException -> L16
        final jx3 r27 = r5;
        final if1 r210 = r6;
        final rd r211 = r3;
        final xd r212 = r7;
        if1 r15 = new cp4(r27, r14, r211, r212, r210);     // Catch: CancellationException -> L65
        r5 = r27;
        r3 = r211;
        r7 = r212;
        r6 = r210;
        r9.n = r7;     // Catch: CancellationException -> L16
        r9.o = r3;     // Catch: CancellationException -> L16
        r9.p = r6;     // Catch: CancellationException -> L16
        r9.q = r5;     // Catch: CancellationException -> L16
        r9.s = 2;     // Catch: CancellationException -> L16
        if (r3.a() == true) goto L58;
        ih4 r16 = new ih4(r15, r12);     // Catch: CancellationException -> L16
        Object r17 = vr1.x(r9.getContext()).a(r16, r9);     // Catch: CancellationException -> L16
    L63:
        if (r17 != r13) goto L49;
    L64:
        return r13;
    L58:
        if (r9.getContext().K(r8) != null) goto L61;
        r17 = vr1.x(r9.getContext()).a(r15, r9);     // Catch: CancellationException -> L16
        goto L63
    L61:
        throw new ClassCastException();     // Catch: CancellationException -> L16
    L65:
        e = e;
        r5 = r27;
        r7 = r212;
    L71:
        vd r18 = (vd) r5.n;
        if (r18 == null) goto L74;
        r18.i.setValue(Boolean.FALSE);
    L74:
        vd r19 = (vd) r5.n;
        if (r19 != null) goto L77;
    L79:
        throw e;
    L77:
        if (r19.g != r7.p) goto L79;
        r7.r = false;
        goto L79
    L68:
        return j15.a;
    L16:
        e = e;
        goto L71
    L20:
        kb4.X(r0);
        final Object r110 = r3.f(0);
        final ce r111 = r3.d(0);
        r5 = new jx3();
        if (r26 == Long.MIN_VALUE) goto L89;
        jx3 r20 = r5;
        vd r112 = new vd(r110, r3.c(), r111, r26, r3.g(), r26, new bp4(r24, r10));     // Catch: CancellationException -> L69
        q(r112, r26, v(r9.getContext()), r3, r24, r28);     // Catch: CancellationException -> L69
        r20.n = r112;     // Catch: CancellationException -> L69
        r7 = r24;
        r3 = r25;
        r6 = r28;
    L48:
        r5 = r20;
    L69:
        e = e;
        r7 = r24;
    L38:
        r5 = r20;
        goto L71
    L89:
        final float r21 = v(r9.getContext());     // Catch: CancellationException -> L43
        final xd r22 = r24;
        if1 r23 = new ap4(r5, r110, r3, r111, r22, r21, r28);     // Catch: CancellationException -> L41
        r20 = r5;
        r9.n = r22;     // Catch: CancellationException -> L39
        r9.o = r3;     // Catch: CancellationException -> L39
        r9.p = r28;     // Catch: CancellationException -> L39
        r9.q = r20;     // Catch: CancellationException -> L39
        r9.s = 1;     // Catch: CancellationException -> L39
        if (r3.a() == true) goto L29;
        ih4 r30 = new ih4(r23, r12);     // Catch: CancellationException -> L39
        Object r31 = vr1.x(r9.getContext()).a(r30, r9);     // Catch: CancellationException -> L39
    L34:
        if (r31 == r13) goto L64;
        r7 = r22;
        r6 = r28;
        goto L48
    L29:
        if (r9.getContext().K(r8) != null) goto L32;
        r31 = vr1.x(r9.getContext()).a(r23, r9);     // Catch: CancellationException -> L39
        goto L34
    L32:
        throw new ClassCastException();     // Catch: CancellationException -> L39
    L39:
        e = e;
        r7 = r22;
    L41:
        e = e;
    L42:
        r7 = r22;
    L43:
        e = e;
        r22 = r24;
    L8:
        r1 = new dp4(r29);
        goto L7
    }

    public static Object f(float r9, wd r10, wf1 r11, ep4 r12, int r13) {
        if ((r13 & 8) == 0) goto L5;
        r10 = au0.S(7);
    L5:
        Float r1 = new Float(0.0f);
        Float r0 = new Float(r9);
        Float r14 = new Float(0.0f);
        if1 r15 = (if1) p35.a.o;
        ce r16 = (ce) r15.invoke(r14);
        if (r16 != null) goto L8;
        r16 = ((ce) r15.invoke(r1)).c();
    L8:
        ce r2 = r16;
        yq4 r17 = new yq4(r10, r1, r0, r2);
        Object r18 = e(new xd(r1, r2, Long.MIN_VALUE, Long.MIN_VALUE, false), r17, Long.MIN_VALUE, new kl3(12, r11), r12);
        j15 r19 = j15.a;
        xe0 r110 = xe0.n;
        if (r18 == r110) goto L12;
        r18 = r19;
    L12:
        if (r18 != r110) goto L14;
        return r18;
    L14:
        return r19;
    }

    public static final Object g(xd r8, ui0 r9, boolean r10, if1 r11, wd0 r12) {
        ti0 r3 = new ti0(r9, r8.n.getValue(), r8.o);
        if (r10 == false) goto L6;
        long r13 = r8.p;
    L7:
        Object r14 = e(r8, r3, r13, r11, r12);
        if (r14 != xe0.n) goto L11;
        return r14;
    L11:
        return j15.a;
    L6:
        r13 = Long.MIN_VALUE;
        goto L7
    }

    public static final Object h(xd r3, Float r4, wd r5, boolean r6, if1 r7, wd0 r8) {
        yq4 r9 = new yq4(r5, r3.n.getValue(), r4, r3.o);
        if (r6 == false) goto L5;
        long r10 = r3.p;
    L6:
        Object r11 = e(r3, r9, r10, r7, r8);
        if (r11 != xe0.n) goto L10;
        return r11;
    L10:
        return j15.a;
    L5:
        r10 = Long.MIN_VALUE;
        goto L6
    }

    public static boolean i(double r4, double r6, double r8) {
        if ((((r6 - r4) + 25.132741228718345d) % 6.283185307179586d) >= (((r8 - r4) + 25.132741228718345d) % 6.283185307179586d)) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final u62 j(cx2 r2) {
        if ((r2.p & 2) != 0) goto L5;
    L22:
        return null;
    L5:
        if ((r2 instanceof u62) == false) goto L9;
        return (u62) r2;
    L9:
        if ((r2 instanceof fo0) == false) goto L22;
        cx2 r3 = ((fo0) r2).C;
    L11:
        if (r3 == 0) goto L22;
        if ((r3 instanceof u62) == true) goto L15;
        if ((r3 instanceof fo0) == false) goto L21;
        if ((r3.p & 2) == 0) goto L21;
        r3 = ((fo0) r3).C;
    L21:
        r3 = r3.s;
        goto L11
    L15:
        return (u62) r3;
    }

    public static final int k(int r1, int r2, int r3) {
        int r4 = (r1 >>> r3) & 255;
        return ((int) ((((((r2 >>> r3) & 255) - r4) * 0.45f) + r4) + 0.5f)) << r3;
    }

    public static void l() {
        StringBuilder r0 = new StringBuilder();
        uc5.f(4, "initialCapacity");
        Object[] r1 = new Object[4];
        boolean r2 = false;
        int r3 = 0;
    L3:
        int r4 = GLES20.glGetError();
        if (r4 == 0) goto L15;
        if (r2 == false) goto L7;
        r0.append('\n');
    L7:
        String r5 = GLU.gluErrorString(r4);
        if (r5 != null) goto L10;
        r5 = "error code: 0x" + Integer.toHexString(r4);
    L10:
        r0.append("glError: ");
        r0.append(r5);
        Integer r6 = Integer.valueOf(r4);
        int r7 = r3 + 1;
        int r8 = qw1.b(r1.length, r7);
        if (r8 <= r1.length) goto L14;
        r1 = Arrays.copyOf(r1, r8);
    L14:
        r1[r3] = r6;
        r2 = true;
        r3 = r7;
        goto L3
    L15:
        if (r2 == true) goto L18;
        return;
    L18:
        throw new GlUtil$GlException(r0.toString(), yw1.i(r3, r1));
    }

    public static void m(String r1, boolean r2) {
        if (r2 == false) goto L4;
        return;
    L4:
        vw1 r0 = yw1.o;
        throw new GlUtil$GlException(r1, gy3.r);
    }

    public static double n(double r5) {
        double r0 = Math.pow(Math.abs(r5), 0.42d);
        if (r5 >= 0.0d) goto L6;
        int r6 = -1;
    L10:
        return ((((double) r6) * 400.0d) * r0) / (r0 + 27.13d);
    L6:
        if (r5 != 0.0d) goto L8;
        r6 = 0;
        goto L10
    L8:
        r6 = 1;
        goto L10
    }

    public static synchronized void o() {
        monitor-enter(j51.class);
        U(new JSONObject());     // Catch: Throwable -> L7
        monitor-exit(j51.class);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public static xd p(xd r8, float r9, float r10, int r11) {
        if ((r11 & 1) == 0) goto L6;
        r9 = ((Number) r8.n.getValue()).floatValue();
    L6:
        if ((r11 & 2) == 0) goto L8;
        r10 = ((zd) r8.o).a;
    L8:
        long r3 = r8.p;
        long r5 = r8.q;
        boolean r7 = r8.r;
        r8.getClass();
        return new xd(Float.valueOf(r9), new zd(r10), r3, r5, r7);
    }

    public static final void q(vd r2, long r3, float r5, rd r6, xd r7, if1 r8) {
        if (r5 != 0.0f) goto L5;
        long r0 = r6.b();
    L6:
        r2.g = r3;
        zd3 r4 = r2.i;
        Object r9 = r6.f(r0);
        zd3 r10 = r2.e;
        r10.setValue(r9);
        r2.f = r6.d(r0);
        if (r6.e(r0) == false) goto L9;
        r2.h = r2.g;
        r4.setValue(Boolean.FALSE);
    L9:
        r7.n.setValue(r10.getValue());
        ce r11 = r7.o;
        ce r12 = r2.f;
        int r13 = r11.b();
        int r1 = 0;
    L10:
        if (r1 >= r13) goto L12;
        r11.d(r1, r12.a(r1));
        r1 = r1 + 1;
        goto L10
    L12:
        r7.q = r2.h;
        r7.p = r2.g;
        r7.r = ((Boolean) r4.getValue()).booleanValue();
        r8.invoke(r2);
        return;
    L5:
        r0 = (long) ((r3 - r2.c) / r5);
        goto L6
    }

    public static boolean r(Set r2, Object r3) {
        if (r2 != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof Set) == false) goto L13;
        Set r4 = (Set) r3;
        if (r2.size() != r4.size()) goto L19;
        if (r2.containsAll(r4) == false) goto L20;
        return true;
    L20:
        return false;
    L19:
        return false;
    L21:
        return false;
    L13:
        return false;
    }

    public static hb4 s(Set r5, ro3 r6) {
        if ((r5 instanceof SortedSet) == false) goto L11;
        Set r7 = (SortedSet) r5;
        if ((r7 instanceof hb4) == false) goto L9;
        hb4 r8 = (hb4) r7;
        ro3 r0 = r8.o;
        r0.getClass();
        return new ib4((SortedSet) r8.n, new so3(Arrays.asList(new ro3[]{r0, r6})));
    L9:
        return new ib4(r7, r6);
    L11:
        if ((r5 instanceof hb4) == false) goto L14;
        hb4 r9 = (hb4) r5;
        ro3 r1 = r9.o;
        r1.getClass();
        return new hb4(r9.n, new so3(Arrays.asList(new ro3[]{r1, r6})));
    L14:
        r5.getClass();
        return new hb4(r5, r6);
    }

    public static mw2 t(mw2 r2, r62 r3, zs4 r4, oo0 r5, ha1 r6) {
        if (r2 != null) goto L4;
    L12:
        mw2 r7 = mw2.h;
        if (r7 != null) goto L15;
    L23:
        mw2 r8 = new mw2(r3, ud3.g0(r4, r3), new ro0(r5.g(), r5.J()), r6);
        mw2.h = r8;
        return r8;
    L15:
        if (r3 != r7.a) goto L23;
        if (ud3.g0(r4, r3).equals(r7.b) == false) goto L23;
        if (r5.g() != r7.c.n) goto L23;
        if (r6 != r7.d) goto L23;
        return r7;
    L4:
        if (r3 != r2.a) goto L12;
        if (ud3.g0(r4, r3).equals(r2.b) == false) goto L12;
        if (r5.g() != r2.c.n) goto L12;
        if (r6 != r2.d) goto L12;
        return r2;
    }

    public static final ba2 u(View r3) {
        r3.getClass();
    L4:
        if (r3 == null) goto L15;
        Object r1 = r3.getTag(R.id.view_tree_lifecycle_owner);
        if ((r1 instanceof ba2) == false) goto L8;
        ba2 r2 = (ba2) r1;
    L9:
        if (r2 != null) goto L10;
        Object r4 = au0.z(r3);
        if ((r4 instanceof View) == true) goto L13;
        r3 = null;
        goto L4
    L13:
        r3 = (View) r4;
        goto L4
    L10:
        return r2;
    L8:
        r2 = null;
        goto L9
    L15:
        return null;
    }

    public static final float v(ne0 r1) {
        qx2 r2 = (qx2) r1.K(rv2.q);
        if (r2 == null) goto L5;
        float r3 = r2.v();
    L7:
        if (r3 < 0.0f) goto L9;
        return r3;
    L9:
        qo3.b("negative scale factor");
        return r3;
    L5:
        r3 = 1.0f;
        goto L7
    }

    public static synchronized Long w(String r6) {
        monitor-enter(j51.class);
        Long r1 = null;
        if (r6 != null) goto L23;
        monitor-exit(j51.class);
        return null;
    L23:
        JSONObject r2 = I();     // Catch: Throwable -> L17
        if (r2.has(r6) == true) goto L13;
        monitor-exit(j51.class);
        return null;
    L13:
        long r3 = r2.optLong(r6, -1);     // Catch: Throwable -> L17
        if (r3 <= 0) goto L19;
        r1 = Long.valueOf(r3);     // Catch: Throwable -> L17
    L19:
        monitor-exit(j51.class);
        return r1;
    L17:
        th = move-exception;
        throw th;
    }

    public static int x(Set r3) {
        Iterator r4 = r3.iterator();
        int r1 = 0;
    L4:
        if (r4.hasNext() == false) goto L10;
        Object r2 = r4.next();
        if (r2 == null) goto L8;
        int r5 = r2.hashCode();
    L9:
        r1 = ~(~(r1 + r5));
        goto L4
    L8:
        r5 = 0;
        goto L9
    L10:
        return r1;
    }

    public static double y(double[] r12) {
        double[] r13 = ud3.a0(r12, c);
        double r0 = n(r13[0]);
        double r2 = n(r13[1]);
        double r4 = n(r13[2]);
        double r10 = (-12.0d) * r2;
        double r11 = ((r10 + (r0 * 11.0d)) + r4) / 11.0d;
        return Math.atan2(((r0 + r2) - (r4 * 2.0d)) / 9.0d, r11);
    }

    public static gb4 z(Set r1, jx1 r2) {
        rr2.s(r1, "set1");
        rr2.s(r2, "set2");
        return new gb4(r1, r2);
    }
}
