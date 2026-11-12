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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lp1 {
    public static final lp1 a = null;
    public static final AtomicLong b = null;
    public static final AtomicLong c = null;
    public static long d;
    public static final kp1 e = null;

    static {
        a = new lp1();
        b = new AtomicLong();
        c = new AtomicLong();
        e = new kp1();
    }

    public static long a(int r9, String r10) {
        long r0 = System.currentTimeMillis();
        a.c();
        int r4 = 0;
        SharedPreferences r2 = App.a().getSharedPreferences("homemusic_traffic_stats", 0);
        j02 r11 = gb.g0(0, r9);
        ArrayList r3 = new ArrayList(r40.k0(r11, 10));
        Iterator r12 = r11.iterator();
    L4:
        if (((i02) r12).p == false) goto L6;
        int r5 = ((b02) r12).nextInt();
        Calendar r6 = Calendar.getInstance();
        r6.setTimeInMillis(r0);
        r6.add(6, -r5);
        r3.add(b(r6.getTimeInMillis()));
        goto L4
    L6:
        int r13 = r3.size();
        long r7 = 0;
    L7:
        if (r4 >= r13) goto L9;
        Object r8 = r3.get(r4);
        r4 = r4 + 1;
        r7 = r7 + r2.getLong(b11.o((String) r8, ":", r10), 0);
        goto L7
    L9:
        return r7;
    }

    public static String b(long r3) {
        return new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(r3));
    }

    public final synchronized void c() {
        monitor-enter(this);
        d = SystemClock.elapsedRealtime();     // Catch: Throwable -> L13
        long r3 = b.getAndSet(0);     // Catch: Throwable -> L13
        long r5 = c.getAndSet(0);     // Catch: Throwable -> L13
        if (r3 == 0) goto L7;
    L10:
        String r7 = b(System.currentTimeMillis());     // Catch: Throwable -> L13
        int r10 = 0;
        SharedPreferences r8 = App.a().getSharedPreferences("homemusic_traffic_stats", 0);     // Catch: Throwable -> L13
        SharedPreferences.Editor r9 = r8.edit();     // Catch: Throwable -> L13
        if (r3 <= 0) goto L16;
        r9.putLong(r7 + ":play", r8.getLong(r7 + ":play", 0) + r3);     // Catch: Throwable -> L13
    L16:
        if (r5 <= 0) goto L18;
        r9.putLong(r7 + ":preload", r8.getLong(r7 + ":preload", 0) + r5);     // Catch: Throwable -> L13
    L18:
        String r0 = b(System.currentTimeMillis() - 2592000000L);     // Catch: Throwable -> L13
        Set<String> r1 = r8.getAll().keySet();     // Catch: Throwable -> L13
        ArrayList r2 = new ArrayList();     // Catch: Throwable -> L13
        Iterator<T> r4 = r1.iterator();     // Catch: Throwable -> L13
    L20:
        if (r4.hasNext() == false) goto L24;
        Object r11 = r4.next();     // Catch: Throwable -> L13
        String r12 = (String) r11;     // Catch: Throwable -> L13
        r12.getClass();     // Catch: Throwable -> L13
        String r13 = qm4.H0(r12, ':');     // Catch: Throwable -> L13
        r0.getClass();     // Catch: Throwable -> L13
        if (r13.compareTo(r0) >= 0) goto L20;
        r2.add(r11);     // Catch: Throwable -> L13
        goto L20
    L24:
        int r6 = r2.size();     // Catch: Throwable -> L13
    L25:
        if (r10 >= r6) goto L27;
        Object r14 = r2.get(r10);     // Catch: Throwable -> L13
        r10 = r10 + 1;     // Catch: Throwable -> L13
        r9.remove((String) r14);     // Catch: Throwable -> L13
        goto L25
    L27:
        r9.apply();     // Catch: Throwable -> L13
        Log.d("HomeTrafficStats", "metered: play +" + r3 + ", preload +" + r5 + " (" + r7 + ")");     // Catch: Throwable -> L13
        monitor-exit(this);
        return;
    L7:
        if (r5 != 0) goto L10;
        monitor-exit(this);
        return;
    L13:
        th = move-exception;
        throw th;
    }
}
