package defpackage;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.preference.Preference;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import java.util.Calendar;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ts1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ vb4 o;
    public final /* synthetic */ Preference p;

    public /* synthetic */ ts1(vb4 vb4Var, Preference preference, int i) {
        this.n = i;
        this.o = vb4Var;
        this.p = preference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object s14Var;
        Object s14Var2;
        Object s14Var3;
        String string;
        int i = this.n;
        long j = 0;
        int i2 = 1;
        Preference preference = this.p;
        vb4 vb4Var = this.o;
        switch (i) {
            case 0:
                try {
                    s14Var2 = gi1.v();
                } catch (Throwable th) {
                    s14Var2 = new s14(th);
                }
                Object kd3Var = new kd3(0, 0L);
                if (s14Var2 instanceof s14) {
                    s14Var2 = kd3Var;
                }
                kd3 kd3Var2 = (kd3) s14Var2;
                io1.b.post(new us1(this.o, ((Number) kd3Var2.n).intValue(), this.p, ((Number) kd3Var2.o).longValue()));
                break;
            case 1:
                Context Z = vb4Var.Z();
                ly4 Y = uc5.Y(Z, 1);
                ly4 Y2 = uc5.Y(Z, 7);
                String string2 = Z.getString(R.string.homemusic_settings_traffic_summary, Y.n, Y.o, Y.p, Y2.n, Y2.o, Y2.p);
                string2.getClass();
                lp1 lp1Var = lp1.a;
                try {
                    Object systemService = App.a().getSystemService("netstats");
                    systemService.getClass();
                    NetworkStatsManager networkStatsManager = (NetworkStatsManager) systemService;
                    long currentTimeMillis = System.currentTimeMillis();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(currentTimeMillis);
                    calendar.add(6, -6);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    NetworkStats queryDetailsForUid = networkStatsManager.queryDetailsForUid(0, null, calendar.getTimeInMillis(), currentTimeMillis, Process.myUid());
                    queryDetailsForUid.getClass();
                    NetworkStats.Bucket bucket = new NetworkStats.Bucket();
                    while (queryDetailsForUid.hasNextBucket()) {
                        queryDetailsForUid.getNextBucket(bucket);
                        j += bucket.getRxBytes() + bucket.getTxBytes();
                    }
                    queryDetailsForUid.close();
                    s14Var3 = Long.valueOf(j);
                } catch (Throwable th2) {
                    s14Var3 = new s14(th2);
                }
                Throwable a = bb3.a(s14Var3);
                if (a != null) {
                    Log.d("HomeTrafficStats", "system statistics: " + a);
                }
                String str = null;
                if (s14Var3 instanceof s14) {
                    s14Var3 = null;
                }
                Long l = (Long) s14Var3;
                if (l != null) {
                    long longValue = l.longValue();
                    if (longValue >= 1073741824) {
                        string = Z.getString(R.string.homemusic_size_gb, Double.valueOf(longValue / 1.073741824E9d));
                        string.getClass();
                    } else {
                        string = Z.getString(R.string.homemusic_size_mb, Double.valueOf(longValue / 1048576.0d));
                        string.getClass();
                    }
                    str = Z.getString(R.string.homemusic_settings_traffic_system, string);
                }
                if (str == null) {
                    str = "";
                }
                io1.b.post(new v6(vb4Var, preference, string2.concat(str), 15));
                break;
            default:
                try {
                    s14Var = Boolean.valueOf(rr1.h().isAdmin());
                } catch (Throwable th3) {
                    s14Var = new s14(th3);
                }
                Object obj = Boolean.FALSE;
                if (s14Var instanceof s14) {
                    s14Var = obj;
                }
                io1.b.post(new bs1(vb4Var, ((Boolean) s14Var).booleanValue(), preference, i2));
                break;
        }
    }
}
