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
        SharedPreferences sharedPreferencesC;
        this.e = 0L;
        this.f = false;
        this.g = false;
        try {
            App.b().getClass();
            sharedPreferencesC = App.c();
        } catch (Exception unused) {
            sharedPreferencesC = null;
        }
        if (sharedPreferencesC == null) {
            return;
        }
        boolean z = sharedPreferencesC.getBoolean("sleep_timer_end_of_track", false);
        long j2 = sharedPreferencesC.getLong("sleep_timer_end_time_ms", 0L);
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
        SharedPreferences sharedPreferencesC;
        try {
            App.b().getClass();
            sharedPreferencesC = App.c();
        } catch (Exception unused) {
            sharedPreferencesC = null;
        }
        if (sharedPreferencesC == null) {
            return;
        }
        sharedPreferencesC.edit().remove("sleep_timer_end_time_ms").remove("sleep_timer_end_of_track").apply();
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
        long jMax = 0;
        if (z2 && !z) {
            jMax = Math.max(0L, this.e - System.currentTimeMillis());
        }
        return String.format("%d:%02d", Long.valueOf(jMax / 60000), Long.valueOf((jMax % 60000) / 1000));
    }

    public final void e() {
        SharedPreferences sharedPreferencesC;
        a(false);
        this.g = true;
        this.f = true;
        this.e = 0L;
        try {
            App.b().getClass();
            sharedPreferencesC = App.c();
        } catch (Exception unused) {
            sharedPreferencesC = null;
        }
        if (sharedPreferencesC != null) {
            sharedPreferencesC.edit().putLong("sleep_timer_end_time_ms", this.e).putBoolean("sleep_timer_end_of_track", this.g).apply();
        }
        vj3 vj3Var = this.h;
        if (vj3Var != null) {
            vj3Var.a.x0();
        }
        zh0 zh0Var = this.i;
        if (zh0Var != null) {
            yf4 yf4VarC = c();
            qi3 qi3VarA = ((MediaService) zh0Var.o).p().a();
            yf4VarC.f();
            yf4VarC.c = false;
            ua4 ua4Var = new ua4(yf4VarC, qi3VarA);
            yf4VarC.d = ua4Var;
            yf4VarC.a.post(ua4Var);
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
