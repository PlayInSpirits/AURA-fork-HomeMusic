package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.service.MediaService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yf4 {
    public static yf4 j;
    public final Handler a;
    public jq3 b;
    public volatile boolean c;
    public ua4 d;
    public long e;
    public boolean f;
    public boolean g;
    public vj3 h;
    public zh0 i;

    public yf4() {
        this.a = new Handler(Looper.getMainLooper());
        this.c = false;
        this.e = 0;
        this.f = false;
        this.g = false;
        App.b().getClass();     // Catch: Exception -> L5
        SharedPreferences r3 = App.c();     // Catch: Exception -> L5
    L6:
        if (r3 != null) goto L8;
        return;
    L8:
        boolean r0 = r3.getBoolean("sleep_timer_end_of_track", false);
        long r1 = r3.getLong("sleep_timer_end_time_ms", 0);
        if (r0 == false) goto L13;
        this.g = true;
        this.f = true;
        return;
    L13:
        if (r1 <= System.currentTimeMillis()) goto L16;
        this.e = r1;
        this.f = true;
        jq3 r2 = new jq3(8, this);
        this.b = r2;
        this.a.postDelayed(r2, 1000);
        return;
    L16:
        b();
        return;
    L5:
        r3 = null;
        goto L6
    }

    public static void b() {
        App.b().getClass();     // Catch: Exception -> L4
        SharedPreferences r0 = App.c();     // Catch: Exception -> L4
    L5:
        if (r0 != null) goto L7;
        return;
    L7:
        r0.edit().remove("sleep_timer_end_time_ms").remove("sleep_timer_end_of_track").apply();
        return;
    L4:
        r0 = null;
        goto L5
    }

    public static yf4 c() {
        if (j != null) goto L6;
        j = new yf4();
    L6:
        return j;
    }

    public final void a(boolean r3) {
        this.f = false;
        this.g = false;
        this.e = 0;
        this.c = true;
        jq3 r0 = this.b;
        if (r0 == null) goto L5;
        this.a.removeCallbacks(r0);
        this.b = null;
    L5:
        f();
        b();
        if (r3 == false) goto L11;
        vj3 r2 = this.h;
        if (r2 == null) goto L12;
        r2.a.x0();
        return;
    L12:
        return;
    }

    public final String d() {
        boolean r0 = this.f;
        if (r0 == false) goto L14;
        boolean r1 = this.g;
        if (r1 == true) goto L16;
        long r2 = 0;
        if (r0 == false) goto L12;
        if (r1 == true) goto L12;
        r2 = Math.max(0, this.e - System.currentTimeMillis());
    L12:
        long r4 = r2 / 60000;
        return String.format("%d:%02d", new Object[]{Long.valueOf(r4), Long.valueOf((r2 % 60000) / 1000)});
    L16:
        return "";
    L14:
        return "";
    }

    public final void e() {
        a(false);
        this.g = true;
        this.f = true;
        this.e = 0;
        App.b().getClass();     // Catch: Exception -> L5
        SharedPreferences r1 = App.c();     // Catch: Exception -> L5
    L6:
        if (r1 == null) goto L9;
        r1.edit().putLong("sleep_timer_end_time_ms", this.e).putBoolean("sleep_timer_end_of_track", this.g).apply();
    L9:
        vj3 r2 = this.h;
        if (r2 == null) goto L12;
        r2.a.x0();
    L12:
        zh0 r5 = this.i;
        if (r5 == null) goto L18;
        yf4 r3 = c();
        qi3 r6 = ((MediaService) r5.o).p().a();
        r3.f();
        r3.c = false;
        ua4 r0 = new ua4(r3, r6);
        r3.d = r0;
        r3.a.post(r0);
        return;
    L18:
        return;
    L5:
        r1 = null;
        goto L6
    }

    public final void f() {
        ua4 r0 = this.d;
        if (r0 == null) goto L6;
        this.a.removeCallbacks(r0);
        this.d = null;
        return;
    }
}
