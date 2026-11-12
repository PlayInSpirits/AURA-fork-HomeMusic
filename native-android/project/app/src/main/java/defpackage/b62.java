package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.widget.EditText;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.lan.LanReceiverService;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b62 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ kc1 o;
    public final /* synthetic */ Object p;

    public /* synthetic */ b62(kc1 kc1Var, Object obj, int i) {
        this.n = i;
        this.o = kc1Var;
        this.p = obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010a  */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        pz1 pz1Var;
        SharedPreferences sharedPreferencesC = null;
        switch (this.n) {
            case 0:
                h62 h62Var = (h62) this.o;
                h52 h52Var = (h52) this.p;
                boolean z = LanReceiverService.y;
                Context context = h62Var.t0;
                if (context == null) {
                    h12.Q("app");
                    throw null;
                }
                if (LanReceiverService.y) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j = LanReceiverService.A;
                    long j2 = h52Var.d;
                    if (jElapsedRealtime >= j || jElapsedRealtime < j2 || jElapsedRealtime - j2 >= 120000) {
                        h62Var.s0(R.string.lan_pairing_expired);
                    } else {
                        ConcurrentHashMap concurrentHashMap = LanReceiverService.B;
                        if (h12.c(concurrentHashMap.get(h52Var.a), h52Var)) {
                            context.getSharedPreferences("lan-playback", 0).edit().putStringSet("trusted", kb4.Q(kb4.a0(context), h52Var.a)).putString("peer-".concat(h52Var.a), h52Var.b).apply();
                            concurrentHashMap.remove(h52Var.a);
                            w42 w42Var = w42.a;
                            w42.a.a("Receiver approved controller", null);
                        } else {
                            h62Var.s0(R.string.lan_pairing_expired);
                        }
                    }
                } else {
                    h62Var.s0(R.string.lan_pairing_expired);
                }
                h62Var.U0 = null;
                h62Var.p0();
                return;
            default:
                xf4 xf4Var = (xf4) this.o;
                String strTrim = ((EditText) this.p).getText().toString().trim();
                if (strTrim.isEmpty()) {
                    return;
                }
                try {
                    int i2 = Integer.parseInt(strTrim);
                    if (i2 <= 0 || (pz1Var = xf4Var.B0) == null) {
                        return;
                    }
                    if (u52.c().a) {
                        u52.s(i2, "minutes");
                        return;
                    }
                    yf4 yf4VarC = yf4.c();
                    yf4VarC.a(false);
                    yf4VarC.g = false;
                    yf4VarC.e = (((long) i2) * 60000) + System.currentTimeMillis();
                    yf4VarC.f = true;
                    try {
                        App.b().getClass();
                        sharedPreferencesC = App.c();
                        break;
                    } catch (Exception unused) {
                    }
                    if (sharedPreferencesC != null) {
                        sharedPreferencesC.edit().putLong("sleep_timer_end_time_ms", yf4VarC.e).putBoolean("sleep_timer_end_of_track", yf4VarC.g).apply();
                    }
                    jq3 jq3Var = new jq3(8, yf4VarC);
                    yf4VarC.b = jq3Var;
                    yf4VarC.a.postDelayed(jq3Var, 1000L);
                    PlayerControllerFragment playerControllerFragment = (PlayerControllerFragment) pz1Var.o;
                    yf4.c().h = new vj3(playerControllerFragment);
                    playerControllerFragment.x0();
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
        }
    }
}
