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

    public /* synthetic */ ts1(vb4 r1, Preference r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        long r1 = 0;
        int r4 = 1;
        Preference r5 = this.p;
        vb4 r6 = this.o;
        switch(r0) {
            case 0: goto L49;
            case 1: goto L13;
            default: goto L53;
        };
    L13:
        Context r15 = r6.Z();
        ly4 r2 = uc5.Y(r15, 1);
        ly4 r7 = uc5.Y(r15, 7);
        String r8 = r15.getString(R.string.homemusic_settings_traffic_summary, new Object[]{r2.n, r2.o, r2.p, r7.n, r7.o, r7.p});
        r8.getClass();
        lp1 r3 = lp1.a;
        Object r9 = App.a().getSystemService("netstats");     // Catch: Throwable -> L18
        r9.getClass();     // Catch: Throwable -> L18
        NetworkStatsManager r10 = (NetworkStatsManager) r9;     // Catch: Throwable -> L18
        long r12 = System.currentTimeMillis();     // Catch: Throwable -> L18
        Calendar r11 = Calendar.getInstance();     // Catch: Throwable -> L18
        r11.setTimeInMillis(r12);     // Catch: Throwable -> L18
        r11.add(6, -6);     // Catch: Throwable -> L18
        r11.set(11, 0);     // Catch: Throwable -> L18
        r11.set(12, 0);     // Catch: Throwable -> L18
        r11.set(13, 0);     // Catch: Throwable -> L18
        r11.set(14, 0);     // Catch: Throwable -> L18
        NetworkStats r13 = r10.queryDetailsForUid(0, null, r11.getTimeInMillis(), r12, Process.myUid());     // Catch: Throwable -> L18
        r13.getClass();     // Catch: Throwable -> L18
        NetworkStats.Bucket r14 = new NetworkStats.Bucket();     // Catch: Throwable -> L18
    L16:
        if (r13.hasNextBucket() == false) goto L20;
        r13.getNextBucket(r14);     // Catch: Throwable -> L18
        r1 = r1 + (r14.getRxBytes() + r14.getTxBytes());     // Catch: Throwable -> L18
        goto L16
    L20:
        r13.close();     // Catch: Throwable -> L18
        Object r16 = Long.valueOf(r1);     // Catch: Throwable -> L18
    L23:
        Throwable r17 = bb3.a(r16);
        if (r17 == null) goto L26;
        Log.d("HomeTrafficStats", "system statistics: " + r17);
    L26:
        String r18 = null;
        if ((r16 instanceof s14) == false) goto L29;
        r16 = null;
    L29:
        Long r19 = (Long) r16;
        if (r19 == null) goto L36;
        long r20 = r19.longValue();
        if (r20 < 1073741824) goto L34;
        String r21 = r15.getString(R.string.homemusic_size_gb, new Object[]{Double.valueOf(r20 / 1.073741824E9d)});
        r21.getClass();
    L35:
        r18 = r15.getString(R.string.homemusic_settings_traffic_system, new Object[]{r21});
        goto L36
    L34:
        r21 = r15.getString(R.string.homemusic_size_mb, new Object[]{Double.valueOf(r20 / 1048576.0d)});
        r21.getClass();
    L36:
        if (r18 != null) goto L38;
        r18 = "";
    L38:
        io1.b.post(new v6(r6, r5, r8.concat(r18), 15));
        return;
    L18:
        th = move-exception;
        r16 = new s14(th);
        goto L23
    L49:
        Object r22 = gi1.v();     // Catch: Throwable -> L42
    L44:
        Object r23 = new kd3(0, 0L);
        if ((r22 instanceof s14) == false) goto L47;
        r22 = r23;
    L47:
        kd3 r24 = (kd3) r22;
        io1.b.post(new us1(this.o, ((Number) r24.n).intValue(), this.p, ((Number) r24.o).longValue()));
        return;
    L42:
        th = move-exception;
        r22 = new s14(th);
        goto L44
    L53:
        Object r110 = Boolean.valueOf(rr1.h().isAdmin());     // Catch: Throwable -> L6
    L8:
        Object r25 = Boolean.FALSE;
        if ((r110 instanceof s14) == false) goto L11;
        r110 = r25;
    L11:
        io1.b.post(new bs1(r6, ((Boolean) r110).booleanValue(), r5, r4));
        return;
    L6:
        th = move-exception;
        r110 = new s14(th);
        goto L8
    }
}
