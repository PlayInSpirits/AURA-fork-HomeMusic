package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.service.MediaService;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yf4 {
    public static yf4 j;
    public jq3 b;
    public ua4 d;
    public long e;
    public boolean f;
    public boolean g;
    public vj3 h;
    public zh0 i;
    public final Handler a = new Handler(Looper.getMainLooper());
    public volatile boolean c = false;

    public yf4() {
        SharedPreferences sharedPreferences;
        this.e = 0L;
        this.f = false;
        this.g = false;
        try {
            App.b().getClass();
            sharedPreferences = App.c();
        } catch (Exception unused) {
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return;
        }
        boolean z = sharedPreferences.getBoolean("sleep_timer_end_of_track", false);
        long j2 = sharedPreferences.getLong("sleep_timer_end_time_ms", 0L);
        if (z) {
            this.g = true;
            this.f = true;
        } else {
            if (j2 <= System.currentTimeMillis()) {
                b();
                return;
            }
            this.e = j2;
            this.f = true;
            jq3 jq3Var = new jq3(8, this);
            this.b = jq3Var;
            this.a.postDelayed(jq3Var, 1000L);
        }
    }

    public static void b() {
        SharedPreferences sharedPreferences;
        try {
            App.b().getClass();
            sharedPreferences = App.c();
        } catch (Exception unused) {
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove("sleep_timer_end_time_ms").remove("sleep_timer_end_of_track").apply();
    }

    public static yf4 c() {
        if (j == null) {
            j = new yf4();
        }
        return j;
    }

    public final void a(boolean z) {
        vj3 vj3Var;
        this.f = false;
        this.g = false;
        this.e = 0L;
        this.c = true;
        jq3 jq3Var = this.b;
        if (jq3Var != null) {
            this.a.removeCallbacks(jq3Var);
            this.b = null;
        }
        f();
        b();
        if (!z || (vj3Var = this.h) == null) {
            return;
        }
        vj3Var.a.x0();
    }

    public final String d() {
        boolean z;
        boolean z2 = this.f;
        if (!z2 || (z = this.g)) {
            return "";
        }
        long j2 = 0;
        if (z2 && !z) {
            j2 = Math.max(0L, this.e - System.currentTimeMillis());
        }
        return String.format("%d:%02d", Long.valueOf(j2 / 60000), Long.valueOf((j2 % 60000) / 1000));
    }

    public final void e() {
        SharedPreferences sharedPreferences;
        a(false);
        this.g = true;
        this.f = true;
        this.e = 0L;
        try {
            App.b().getClass();
            sharedPreferences = App.c();
        } catch (Exception unused) {
            sharedPreferences = null;
        }
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("sleep_timer_end_time_ms", this.e).putBoolean("sleep_timer_end_of_track", this.g).apply();
        }
        vj3 vj3Var = this.h;
        if (vj3Var != null) {
            vj3Var.a.x0();
        }
        zh0 zh0Var = this.i;
        if (zh0Var != null) {
            yf4 c = c();
            qi3 a = ((MediaService) zh0Var.o).p().a();
            c.f();
            c.c = false;
            ua4 ua4Var = new ua4(c, a);
            c.d = ua4Var;
            c.a.post(ua4Var);
        }
    }

    public final void f() {
        ua4 ua4Var = this.d;
        if (ua4Var != null) {
            this.a.removeCallbacks(ua4Var);
            this.d = null;
        }
    }
}
