package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import com.eddyizm.tempus.App;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cx implements vw4 {
    public static final int[] b = null;
    public static final Object c = null;
    public static volatile cx d;
    public static final String[] e = null;
    public int a;

    static {
        b = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        c = new Object();
        e = new String[]{"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};
    }

    public /* synthetic */ cx(int r1) {
        this.a = r1;
    }

    public static cx f() {
        Object r0 = c;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (d != null) goto L9;
        d = new cx(3);     // Catch: Throwable -> L7
    L9:
        cx r1 = d;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    }

    public static boolean h() {
        ConnectivityManager r0 = (ConnectivityManager) App.a().getSystemService("connectivity");
        if (r0 != null) goto L5;
        return false;
    L5:
        Network r2 = r0.getActiveNetwork();
        if (r2 != null) goto L8;
        return false;
    L8:
        NetworkCapabilities r3 = r0.getNetworkCapabilities(r2);
        if (r3 != null) goto L12;
        return false;
    L12:
        if (r3.hasTransport(0) == false) goto L14;
    L21:
        boolean r4 = true;
    L23:
        if (Build.VERSION.SDK_INT >= 29) goto L34;
        if (r3.hasTransport(4) == false) goto L34;
        if (r4 == true) goto L34;
        NetworkInfo r1 = r0.getActiveNetworkInfo();
        if (r1 != null) goto L30;
    L32:
        return false;
    L30:
        if (r1.isConnected() == false) goto L32;
        return true;
    L34:
        if (r3.hasCapability(12) == true) goto L36;
        return false;
    L36:
        return r4;
    L14:
        if (r3.hasTransport(1) == true) goto L21;
        if (r3.hasTransport(3) == true) goto L21;
        if (r3.hasTransport(2) == true) goto L21;
        r4 = false;
        goto L23
    }

    public static String i(String r3) {
        int r0 = r3.length();
        StringBuilder r1 = new StringBuilder(23);
        r1.append("WM-");
        if (r0 < 20) goto L5;
        r1.append(r3.substring(0, 20));
    L7:
        return r1.toString();
    L5:
        r1.append(r3);
        goto L7
    }

    @Override // defpackage.vw4
    public void a(Canvas r1, Paint r2, RectF r3) {
        float r0 = this.a;
        r1.drawRoundRect(r3, r0, r0, r2);
    }

    public void b(String r2, String r3) {
        if (this.a > 3) goto L6;
        Log.d(r2, r3);
        return;
    }

    public void c(String r2, String r3, Throwable r4) {
        if (this.a > 3) goto L6;
        Log.d(r2, r3, r4);
        return;
    }

    public void d(String r2, String r3) {
        if (this.a > 6) goto L6;
        Log.e(r2, r3);
        return;
    }

    public void e(String r2, String r3, Throwable r4) {
        if (this.a > 6) goto L6;
        Log.e(r2, r3, r4);
        return;
    }

    public void g(String r2, String r3) {
        if (this.a > 4) goto L6;
        Log.i(r2, r3);
        return;
    }

    public void j(int r3) {
        int r0 = this.a;
        int r4 = r3 ^ (r0 >> 24);
        if (r4 >= 0) goto L5;
        r4 = r4 + 256;
    L5:
        int r5 = b[r4];
        this.a = r5 ^ (r0 << 8);
    }

    public void k(String r2, String r3) {
        if (this.a > 5) goto L6;
        Log.w(r2, r3);
        return;
    }
}
