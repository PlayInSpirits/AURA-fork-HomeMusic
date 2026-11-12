package defpackage;

import android.os.Build;
import android.util.Log;
import com.eddyizm.tempus.homemusic.SmartPlan;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ll1 {
    public static final boolean e = false;
    public static final boolean f = false;
    public static final File g = null;
    public static volatile ll1 h;
    public final int a;
    public int b;
    public boolean c;
    public final AtomicBoolean d;

    static {
        int r0 = Build.VERSION.SDK_INT;
        boolean r2 = false;
        if (r0 >= 29) goto L5;
        boolean r1 = true;
    L6:
        e = r1;
        if (r0 < 28) goto L9;
        r2 = true;
    L9:
        f = r2;
        g = new File("/proc/self/fd");
        return;
    L5:
        r1 = false;
        goto L6
    }

    public ll1() {
        this.c = true;
        this.d = new AtomicBoolean(false);
        this.a = 20000;
    }

    public static ll1 a() {
        if (h != null) goto L16;
        monitor-enter(ll1.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (h != null) goto L11;
        h = new ll1();     // Catch: Throwable -> L9
    L11:
        monitor-exit(ll1.class);     // Catch: Throwable -> L9
    L16:
        return h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT != 28) goto L13;
        Iterator r0 = Arrays.asList(new String[]{"GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013"}).iterator();
    L7:
        if (r0.hasNext() == false) goto L13;
        String r1 = (String) r0.next();
        if (Build.MODEL.startsWith(r1) == false) goto L7;
        return SmartPlan.MAX_QUEUE;
    L13:
        return this.a;
    }

    public final boolean c(int r7, int r8, boolean r9, boolean r10) {
        if (r9 == true) goto L9;
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L58;
        Log.v("HardwareConfig", "Hardware config disallowed by caller");
        return false;
    L58:
        return false;
    L9:
        if (f == true) goto L15;
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L58;
        Log.v("HardwareConfig", "Hardware config disallowed by sdk");
        return false;
    L15:
        if (e == true) goto L17;
    L22:
        if (r10 == true) goto L24;
        if (r7 < 0) goto L56;
        if (r8 < 0) goto L56;
        monitor-enter(this);
        int r11 = this.b + 1;     // Catch: Throwable -> L43
        this.b = r11;     // Catch: Throwable -> L43
        if (r11 < 50) goto L45;
        this.b = 0;     // Catch: Throwable -> L43
        int r12 = g.list().length;     // Catch: Throwable -> L43
        long r2 = b();     // Catch: Throwable -> L43
        if (r12 >= r2) goto L37;
        boolean r13 = true;
    L38:
        this.c = r13;     // Catch: Throwable -> L43
        if (r13 == true) goto L45;
        if (Log.isLoggable("Downsampler", 5) == false) goto L45;
        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + r12 + ", limit " + r2);     // Catch: Throwable -> L43
        goto L45
    L37:
        r13 = false;
    L45:
        boolean r14 = this.c;     // Catch: Throwable -> L43
        monitor-exit(this);
        if (r14 == false) goto L49;
        return true;
    L49:
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L58;
        Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        return false;
    L43:
        th = move-exception;
        throw th;
    L56:
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L58;
        Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
        goto L58
    L24:
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L58;
        Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
        return false;
    L17:
        if (this.d.get() == true) goto L22;
        if (Log.isLoggable("HardwareConfig", 2) == false) goto L58;
        Log.v("HardwareConfig", "Hardware config disallowed by app state");
        return false;
    }
}
