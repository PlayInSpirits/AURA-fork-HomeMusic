package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Log;
import com.eddyizm.tempus.App;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lp1 {
    public lp1() {
        super();
    }

    public static long d;
    public static final lp1 a = new lp1();
    public static final AtomicLong b = new AtomicLong();
    public static final AtomicLong c = new AtomicLong();
    public static final kp1 e = new kp1();

    public static long a(int i, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        a.c();
        int i2 = 0;
        SharedPreferences sharedPreferences = App.a().getSharedPreferences("homemusic_traffic_stats", 0);
        j02 g0 = gb.g0(0, i);
        ArrayList arrayList = new ArrayList(r40.k0(g0, 10));
        Iterator it = g0.iterator();
        while (((i02) it).p) {
            int nextInt = ((b02) it).nextInt();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            calendar.add(6, -nextInt);
            arrayList.add(b(calendar.getTimeInMillis()));
        }
        int size = arrayList.size();
        long j = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            j += sharedPreferences.getLong(b11.o((String) obj, ":", str), 0L);
        }
        return j;
    }

    public static String b(long j) {
        return new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(j));
    }

    public final synchronized void c() {
        try {
            d = SystemClock.elapsedRealtime();
            long andSet = b.getAndSet(0L);
            long andSet2 = c.getAndSet(0L);
            if (andSet == 0 && andSet2 == 0) {
                return;
            }
            String b2 = b(System.currentTimeMillis());
            int i = 0;
            SharedPreferences sharedPreferences = App.a().getSharedPreferences("homemusic_traffic_stats", 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (andSet > 0) {
                edit.putLong(b2 + ":play", sharedPreferences.getLong(b2 + ":play", 0L) + andSet);
            }
            if (andSet2 > 0) {
                edit.putLong(b2 + ":preload", sharedPreferences.getLong(b2 + ":preload", 0L) + andSet2);
            }
            String b3 = b(System.currentTimeMillis() - 2592000000L);
            Set<String> keySet = sharedPreferences.getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                String str = (String) obj;
                str.getClass();
                String H0 = qm4.H0(str, ':');
                b3.getClass();
                if (H0.compareTo(b3) < 0) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                edit.remove((String) obj2);
            }
            edit.apply();
            Log.d("HomeTrafficStats", "metered: play +" + andSet + ", preload +" + andSet2 + " (" + b2 + ")");
        } catch (Throwable th) {
            throw th;
        }
    }
}
