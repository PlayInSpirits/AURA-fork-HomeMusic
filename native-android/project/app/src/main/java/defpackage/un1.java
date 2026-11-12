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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class un1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ un1(h62 r2, long r3, Object r5, NsdServiceInfo r6) {
        this.n = 3;
        this.p = r2;
        this.o = r3;
        this.q = r5;
        this.r = r6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r1 = R.string.lan_connection_error;
        switch(r0) {
            case 0: goto L73;
            case 1: goto L63;
            case 2: goto L56;
            default: goto L4;
        };
    L4:
        h62 r6 = (h62) this.p;
        long r3 = this.o;
        Object r2 = this.q;
        NsdServiceInfo r7 = (NsdServiceInfo) this.r;
        if (r6.l0(r3) == false) goto L83;
        r6.O0 = false;
        r42 r9 = null;
        if ((r2 instanceof s14) == true) goto L25;
        y42 r5 = (y42) r2;
        String r11 = r5.a;
        boolean r4 = LanReceiverService.y;
        Context r8 = r6.t0;
        if (r8 == null) goto L23;
        SharedPreferences r10 = r8.getSharedPreferences("lan-playback", 0);
        Set<String> r12 = r10.getStringSet("receivers", z01.n);
        r12.getClass();
        boolean r13 = r12.contains(r11);
        if (r5.c == false) goto L19;
        if (r13 == false) goto L19;
        Context r14 = r6.t0;
        if (r14 == null) goto L17;
        u52.b(r14, r7, r11);
        r6.X().finish();
        goto L25
    L17:
        h12.Q("app");
        throw null;
    L19:
        vg2 r15 = new vg2(r6.Z(), 0);
        r15.p(R.string.lan_pair_title);
        r15.a.f = r6.t(R.string.lan_pair_compare, new Object[]{r5.b});
        f9 r16 = r15.l(R.string.lan_pair_confirm, new vs1(r10, r5, r6, r7, 1)).j(android.R.string.cancel, null).create();
        r6.U0 = null;
        f9 r17 = r6.K0;
        if (r17 == null) goto L22;
        r17.dismiss();
    L22:
        r6.K0 = r16;
        r16.show();
        goto L25
    L23:
        h12.Q("app");
        throw null;
    L25:
        Throwable r18 = bb3.a(r2);
        if (r18 != null) goto L28;
        return;
    L28:
        if ((r18 instanceof LanConnectionFailure) == false) goto L30;
        LanConnectionFailure r19 = (LanConnectionFailure) r18;
    L31:
        if (r19 == null) goto L34;
        r9 = r19.n;
    L34:
        if (r9 != null) goto L36;
        int r20 = -1;
    L37:
        if (r20 != (-1)) goto L39;
    L54:
        r6.s0(r1);
        return;
    L39:
        if (r20 != 1) goto L41;
        r1 = R.string.lan_identity_error;
        goto L54
    L41:
        if (r20 != 2) goto L43;
        r1 = R.string.lan_connect_error;
        goto L54
    L43:
        if (r20 != 3) goto L45;
        r1 = R.string.lan_tls_error;
        goto L54
    L45:
        if (r20 != 4) goto L47;
        r1 = R.string.lan_identity_mismatch;
        goto L54
    L47:
        if (r20 != 5) goto L49;
        r1 = R.string.lan_response_error;
        goto L54
    L49:
        er1.n();
        return;
    L36:
        r20 = d62.a[r9.ordinal()];
        goto L37
    L30:
        r19 = null;
        goto L31
    L83:
        return;
    L56:
        h62 r21 = (h62) this.q;
        NsdServiceInfo r22 = (NsdServiceInfo) this.r;
        String r23 = (String) this.p;
        long r24 = this.o;
        Object r25 = r21.F0.a(r22, r23);     // Catch: Throwable -> L59
    L61:
        r21.D0.post(new un1(r21, r24, r25, r22));
        return;
    L59:
        th = move-exception;
        r25 = new s14(th);
        goto L61
    L63:
        long r26 = this.o;
        Exception r27 = (Exception) this.p;
        JSONObject r28 = (JSONObject) this.q;
        gf1 r110 = (gf1) this.r;
        if (u52.i == r26) goto L66;
        return;
    L66:
        if ((r27 instanceof q52) == false) goto L68;
        r1 = R.string.lan_queue_changed;
    L68:
        u52.b.k(v52.a(u52.c(), 0, 0, r1, 536739839));
        if (h12.c(r28.optString("command"), "queue_state") == true) goto L71;
        Handler r29 = u52.a;
        u52.h(r1);
    L71:
        r110.invoke();
        return;
    L73:
        long r30 = this.o;
        String r31 = (String) this.p;
        Consumer r32 = (Consumer) this.q;
        List r111 = (List) this.r;
        if (r30 != n61.d()) goto L85;
        b00 r33 = b00.a;
        if (h12.c(r31, b00.a()) == false) goto L86;
        r32.accept(kb4.U(r111));
        return;
    L86:
        return;
    }

    public /* synthetic */ un1(long r1, Serializable r3, Object r4, Object r5, int r6) {
        this.n = r6;
        this.o = r1;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    public /* synthetic */ un1(h62 r2, NsdServiceInfo r3, String r4, long r5) {
        this.n = 2;
        this.q = r2;
        this.r = r3;
        this.p = r4;
        this.o = r5;
    }
}
