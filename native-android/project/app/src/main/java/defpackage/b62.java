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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b62 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ kc1 o;
    public final /* synthetic */ Object p;

    public /* synthetic */ b62(kc1 r1, Object r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r9, int r10) {
        SharedPreferences r11 = null;
        switch(this.n) {
            case 0: goto L20;
            default: goto L4;
        };
    L4:
        xf4 r12 = (xf4) this.o;
        String r8 = ((EditText) this.p).getText().toString().trim();
        if (r8.isEmpty() == true) goto L44;
        int r13 = Integer.parseInt(r8);     // Catch: NumberFormatException -> L40
        if (r13 <= 0) goto L45;
        pz1 r14 = r12.B0;     // Catch: NumberFormatException -> L40
        if (r14 != null) goto L11;
        return;
    L11:
        if (u52.c().a == false) goto L13;
        u52.s(r13, "minutes");     // Catch: NumberFormatException -> L40
        return;
    L13:
        yf4 r1 = yf4.c();     // Catch: NumberFormatException -> L40
        r1.a(false);     // Catch: NumberFormatException -> L40
        r1.g = false;     // Catch: NumberFormatException -> L40
        long r4 = ((long) r13) * 60000;     // Catch: NumberFormatException -> L40
        r1.e = r4 + System.currentTimeMillis();     // Catch: NumberFormatException -> L40
        r1.f = true;     // Catch: NumberFormatException -> L40
        App.b().getClass();     // Catch: Exception -> L39
        r11 = App.c();     // Catch: Exception -> L39
    L15:
        if (r11 == null) goto L18;
        r11.edit().putLong("sleep_timer_end_time_ms", r1.e).putBoolean("sleep_timer_end_of_track", r1.g).apply();     // Catch: NumberFormatException -> L40
    L18:
        jq3 r15 = new jq3(8, r1);     // Catch: NumberFormatException -> L40
        r1.b = r15;     // Catch: NumberFormatException -> L40
        r1.a.postDelayed(r15, 1000);     // Catch: NumberFormatException -> L40
        PlayerControllerFragment r16 = (PlayerControllerFragment) r14.o;     // Catch: NumberFormatException -> L40
        yf4 r17 = yf4.c();     // Catch: NumberFormatException -> L40
        r17.h = new vj3(r16);     // Catch: NumberFormatException -> L40
        r16.x0();     // Catch: NumberFormatException -> L40
        return;
    L45:
        return;
    L48:
        return;
    L44:
        return;
    L20:
        h62 r18 = (h62) this.o;
        h52 r19 = (h52) this.p;
        boolean r2 = LanReceiverService.y;
        Context r3 = r18.t0;
        if (r3 != null) goto L23;
        h12.Q("app");
        throw null;
    L23:
        if (LanReceiverService.y == false) goto L34;
        long r5 = SystemClock.elapsedRealtime();
        long r6 = LanReceiverService.A;
        long r7 = r19.d;
        if (r5 >= r6) goto L34;
        if (r5 < r7) goto L34;
        if ((r5 - r7) >= 120000) goto L34;
        ConcurrentHashMap r20 = LanReceiverService.B;
        if (h12.c(r20.get(r19.a), r19) == false) goto L34;
        r3.getSharedPreferences("lan-playback", 0).edit().putStringSet("trusted", kb4.Q(kb4.a0(r3), r19.a)).putString("peer-".concat(r19.a), r19.b).apply();
        r20.remove(r19.a);
        w42 r21 = w42.a;
        w42.b("Receiver approved controller");
    L35:
        r18.U0 = null;
        r18.p0();
        return;
    L34:
        r18.s0(R.string.lan_pairing_expired);
        goto L35
    }
}
