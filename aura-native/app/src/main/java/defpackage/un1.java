package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.nsd.NsdServiceInfo;
import android.os.Handler;
import app.homemusic.R;
import com.eddyizm.tempus.lan.LanConnectionFailure;
import com.eddyizm.tempus.lan.LanReceiverService;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.json.JSONObject;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class un1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ un1(h62 h62Var, long j, Object obj, NsdServiceInfo nsdServiceInfo) {
        this.n = 3;
        this.p = h62Var;
        this.o = j;
        this.q = obj;
        this.r = nsdServiceInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object s14Var;
        int i = this.n;
        int i2 = app.homemusic.R.string.lan_connection_error;
        switch (i) {
            case 0:
                long j = this.o;
                String str = (String) this.p;
                Consumer consumer = (Consumer) this.q;
                List list = (List) this.r;
                if (j == n61.d()) {
                    b00 b00Var = b00.a;
                    if (h12.c(str, b00.a())) {
                        consumer.accept(kb4.U(list));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                long j2 = this.o;
                Exception exc = (Exception) this.p;
                JSONObject jSONObject = (JSONObject) this.q;
                gf1 gf1Var = (gf1) this.r;
                if (u52.i == j2) {
                    if (exc instanceof q52) {
                        i2 = app.homemusic.R.string.lan_queue_changed;
                    }
                    u52.b.k(v52.a(u52.c(), 0, 0, i2, 536739839));
                    if (!h12.c(jSONObject.optString("command"), "queue_state")) {
                        Handler handler = u52.a;
                        u52.h(i2);
                    }
                    gf1Var.invoke();
                    return;
                }
                return;
            case 2:
                h62 h62Var = (h62) this.q;
                NsdServiceInfo nsdServiceInfo = (NsdServiceInfo) this.r;
                String str2 = (String) this.p;
                long j3 = this.o;
                try {
                    s14Var = h62Var.F0.a(nsdServiceInfo, str2);
                } catch (Throwable th) {
                    s14Var = new s14(th);
                }
                h62Var.D0.post(new un1(h62Var, j3, s14Var, nsdServiceInfo));
                return;
            default:
                h62 h62Var2 = (h62) this.p;
                long j4 = this.o;
                Object obj = this.q;
                NsdServiceInfo nsdServiceInfo2 = (NsdServiceInfo) this.r;
                if (h62Var2.l0(j4)) {
                    h62Var2.O0 = false;
                    if (!(obj instanceof s14)) {
                        y42 y42Var = (y42) obj;
                        String str3 = y42Var.a;
                        boolean z = LanReceiverService.y;
                        Context context = h62Var2.t0;
                        if (context == null) {
                            h12.Q("app");
                            throw null;
                        }
                        SharedPreferences sharedPreferences = context.getSharedPreferences("lan-playback", 0);
                        Set<String> stringSet = sharedPreferences.getStringSet("receivers", z01.n);
                        stringSet.getClass();
                        boolean contains = stringSet.contains(str3);
                        if (y42Var.c && contains) {
                            Context context2 = h62Var2.t0;
                            if (context2 == null) {
                                h12.Q("app");
                                throw null;
                            }
                            u52.b(context2, nsdServiceInfo2, str3);
                            h62Var2.X().finish();
                        } else {
                            vg2 vg2Var = new vg2(h62Var2.Z(), 0);
                            vg2Var.p(app.homemusic.R.string.lan_pair_title);
                            vg2Var.a.f = h62Var2.t(app.homemusic.R.string.lan_pair_compare, y42Var.b);
                            f9 create = vg2Var.l(app.homemusic.R.string.lan_pair_confirm, new vs1(sharedPreferences, y42Var, h62Var2, nsdServiceInfo2, 1)).j(android.R.string.cancel, null).create();
                            h62Var2.U0 = null;
                            f9 f9Var = h62Var2.K0;
                            if (f9Var != null) {
                                f9Var.dismiss();
                            }
                            h62Var2.K0 = create;
                            create.show();
                        }
                    }
                    Throwable a = bb3.a(obj);
                    if (a != null) {
                        LanConnectionFailure lanConnectionFailure = a instanceof LanConnectionFailure ? (LanConnectionFailure) a : null;
                        r42 r42Var = lanConnectionFailure != null ? lanConnectionFailure.n : null;
                        int i3 = r42Var == null ? -1 : d62.a[r42Var.ordinal()];
                        if (i3 != -1) {
                            if (i3 == 1) {
                                i2 = app.homemusic.R.string.lan_identity_error;
                            } else if (i3 == 2) {
                                i2 = app.homemusic.R.string.lan_connect_error;
                            } else if (i3 == 3) {
                                i2 = app.homemusic.R.string.lan_tls_error;
                            } else if (i3 == 4) {
                                i2 = app.homemusic.R.string.lan_identity_mismatch;
                            } else {
                                if (i3 != 5) {
                                    er1.n();
                                    return;
                                }
                                i2 = app.homemusic.R.string.lan_response_error;
                            }
                        }
                        h62Var2.s0(i2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ un1(long j, Serializable serializable, Object obj, Object obj2, int i) {
        this.n = i;
        this.o = j;
        this.p = serializable;
        this.q = obj;
        this.r = obj2;
    }

    public /* synthetic */ un1(h62 h62Var, NsdServiceInfo nsdServiceInfo, String str, long j) {
        this.n = 2;
        this.q = h62Var;
        this.r = nsdServiceInfo;
        this.p = str;
        this.o = j;
    }
}
