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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
        long rxBytes = 0;
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
                Context contextZ = vb4Var.Z();
                ly4 ly4VarY = uc5.Y(contextZ, 1);
                ly4 ly4VarY2 = uc5.Y(contextZ, 7);
                String string2 = contextZ.getString(R.string.homemusic_settings_traffic_summary, ly4VarY.n, ly4VarY.o, ly4VarY.p, ly4VarY2.n, ly4VarY2.o, ly4VarY2.p);
                string2.getClass();
                lp1 lp1Var = lp1.a;
                try {
                    Object systemService = App.a().getSystemService("netstats");
                    systemService.getClass();
                    NetworkStatsManager networkStatsManager = (NetworkStatsManager) systemService;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(jCurrentTimeMillis);
                    calendar.add(6, -6);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    NetworkStats networkStatsQueryDetailsForUid = networkStatsManager.queryDetailsForUid(0, null, calendar.getTimeInMillis(), jCurrentTimeMillis, Process.myUid());
                    networkStatsQueryDetailsForUid.getClass();
                    NetworkStats.Bucket bucket = new NetworkStats.Bucket();
                    while (networkStatsQueryDetailsForUid.hasNextBucket()) {
                        networkStatsQueryDetailsForUid.getNextBucket(bucket);
                        rxBytes += bucket.getRxBytes() + bucket.getTxBytes();
                    }
                    networkStatsQueryDetailsForUid.close();
                    s14Var3 = Long.valueOf(rxBytes);
                } catch (Throwable th2) {
                    s14Var3 = new s14(th2);
                }
                Throwable thA = bb3.a(s14Var3);
                if (thA != null) {
                    Log.d("HomeTrafficStats", "system statistics: " + thA);
                }
                String string3 = null;
                if (s14Var3 instanceof s14) {
                    s14Var3 = null;
                }
                Long l = (Long) s14Var3;
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (jLongValue >= 1073741824) {
                        string = contextZ.getString(R.string.homemusic_size_gb, Double.valueOf(jLongValue / 1.073741824E9d));
                        string.getClass();
                    } else {
                        string = contextZ.getString(R.string.homemusic_size_mb, Double.valueOf(jLongValue / 1048576.0d));
                        string.getClass();
                    }
                    string3 = contextZ.getString(R.string.homemusic_settings_traffic_system, string);
                }
                if (string3 == null) {
                    string3 = "";
                }
                io1.b.post(new v6(vb4Var, preference, string2.concat(string3), 15));
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
