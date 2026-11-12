package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreference;
import app.homemusic.R;
import com.eddyizm.tempus.lan.LanReceiverService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h62 extends kp3 {
    public Preference A0;
    public Preference B0;
    public Preference C0;
    public final Handler D0;
    public final ExecutorService E0;
    public final z42 F0;
    public final LinkedHashMap G0;
    public g62 H0;
    public boolean I0;
    public Future J0;
    public f9 K0;
    public boolean L0;
    public long M0;
    public boolean N0;
    public boolean O0;
    public long P0;
    public boolean Q0;
    public String R0;
    public String S0;
    public String T0;
    public h52 U0;
    public boolean V0;
    public final dc1 W0;
    public final g5 X0;
    public Context t0;
    public NsdManager u0;
    public SwitchPreference v0;
    public SwitchPreference w0;
    public PreferenceCategory x0;
    public PreferenceCategory y0;
    public PreferenceCategory z0;

    public h62() {
        this.D0 = new Handler(Looper.getMainLooper());
        this.E0 = Executors.newSingleThreadExecutor();
        this.F0 = new z42();
        this.G0 = new LinkedHashMap();
        this.R0 = "";
        this.T0 = "";
        q5 r0 = new q5(0);
        this.W0 = W(new a62(this, 4), r0);
        this.X0 = new g5(17, this);
    }

    @Override // defpackage.kc1
    public final void I() {
        this.E0.shutdownNow();
        this.R = true;
    }

    @Override // defpackage.kp3, defpackage.kc1
    public final void R() {
        super.R();
        this.L0 = true;
        this.D0.post(this.X0);
    }

    @Override // defpackage.kp3, defpackage.kc1
    public final void S() {
        this.L0 = false;
        this.M0++;
        this.N0 = false;
        this.O0 = false;
        this.D0.removeCallbacks(this.X0);
        g62 r1 = this.H0;
        if (r1 != null) goto L25;
    L9:
        this.H0 = null;
        this.I0 = false;
        Future r0 = this.J0;
        if (r0 == null) goto L12;
        r0.cancel(true);
    L12:
        z42 r2 = this.F0;
        r2.getClass();
        SSLSocket r3 = r2.a;     // Catch: Throwable -> L22
        if (r3 == null) goto L16;
        r3.close();     // Catch: Throwable -> L22
    L16:
        f9 r4 = this.K0;
        if (r4 == null) goto L19;
        r4.dismiss();
    L19:
        this.K0 = null;
        this.U0 = null;
        super.S();
        return;
    L25:
        NsdManager r5 = this.u0;     // Catch: Throwable -> L21
        if (r5 == null) goto L7;
        r5.stopServiceDiscovery(r1);     // Catch: Throwable -> L21
        goto L9
    L7:
        h12.Q("nsd");     // Catch: Throwable -> L21
        throw null;     // Catch: Throwable -> L21
    }

    @Override // defpackage.kp3, defpackage.kc1
    public final void T(View r3, Bundle r4) {
        r3.getClass();
        super.T(r3, r4);
        u52.b.e(v(), new wd1(new x(20, this), 5));
    }

    @Override // defpackage.kp3
    public final void i0(String r4) {
        Context r0 = Z().getApplicationContext();
        r0.getClass();
        this.t0 = r0;
        Object r1 = r0.getSystemService(NsdManager.class);
        r1.getClass();
        this.u0 = (NsdManager) r1;
        j0(R.xml.lan_preferences, r4);
        this.v0 = (SwitchPreference) m0("lan_receiver_enabled");
        this.w0 = (SwitchPreference) m0("lan_pairing_enabled");
        this.x0 = (PreferenceCategory) m0("lan_paired_controllers");
        this.y0 = (PreferenceCategory) m0("lan_pair_requests");
        this.z0 = (PreferenceCategory) m0("lan_available_devices");
        this.A0 = m0("lan_setup_status");
        this.B0 = m0("lan_controlled_device");
        this.C0 = m0("lan_release_device");
        EditTextPreference r5 = (EditTextPreference) m0("lan_name");
        boolean r2 = LanReceiverService.y;
        Context r3 = this.t0;
        if (r3 == null) goto L18;
        r5.E(kb4.M(r3));
        r5.x(r5.h0);
        r5.i0 = new er1(11);
        r5.r = new ef0(8, this, r5);
        SwitchPreference r6 = this.v0;
        if (r6 == null) goto L16;
        r6.r = new a62(this, 0);
        SwitchPreference r7 = this.w0;
        if (r7 == null) goto L14;
        r7.r = new a62(this, 1);
        Preference r8 = m0("lan_find_devices");
        r8.s = new a62(this, 2);
        Preference r9 = this.C0;
        if (r9 == null) goto L12;
        r9.s = new a62(this, 3);
        return;
    L12:
        h12.Q("releaseControl");
        throw null;
    L14:
        h12.Q("pairing");
        throw null;
    L16:
        h12.Q("receiver");
        throw null;
    L18:
        h12.Q("app");
        throw null;
    }

    public final void k0(NsdServiceInfo r8) {
        if (this.O0 == false) goto L5;
        return;
    L5:
        this.O0 = true;
        long r5 = this.M0;
        boolean r0 = LanReceiverService.y;
        Context r1 = this.t0;
        if (r1 == null) goto L9;
        String r4 = kb4.M(r1);
        this.J0 = this.E0.submit(new un1(this, r8, r4, r5));
        return;
    L9:
        h12.Q("app");
        throw null;
    }

    public final boolean l0(long r3) {
        if (this.L0 == true) goto L5;
        return false;
    L5:
        if (r3 != this.M0) goto L10;
        return true;
    L10:
        return false;
    }

    public final Preference m0(String r1) {
        Preference r0 = h0(r1);
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o("Required value was null.");
        return null;
    }

    public final void n0() {
        PreferenceCategory r0 = this.z0;
        if (r0 == null) goto L17;
        r0.H();
        PreferenceCategory r1 = this.z0;
        if (r1 == null) goto L15;
        LinkedHashMap r3 = this.G0;
        r1.A(!r3.isEmpty());
        Collection r2 = r3.values();
        r2.getClass();
        Iterator r4 = r2.iterator();
    L8:
        if (r4.hasNext() == false) goto L14;
        c62 r5 = (c62) r4.next();
        PreferenceCategory r6 = this.z0;
        if (r6 == null) goto L12;
        Preference r7 = new Preference(Z(), null);
        String r8 = r5.a.getServiceName();
        r8.getClass();
        r7.z(qm4.z0(r8, "Tempus "));
        r7.x(s(R.string.lan_select_receiver));
        r7.v(R.drawable.ic_navigate_next);
        r7.F = false;
        r7.s = new ef0(7, this, r5);
        r6.E(r7);
        goto L8
    L12:
        h12.Q("devices");
        throw null;
    L14:
        return;
    L15:
        h12.Q("devices");
        throw null;
    L17:
        h12.Q("devices");
        throw null;
    }

    public final void o0() {
        boolean r0 = LanReceiverService.y;
        Context r1 = this.t0;
        if (r1 == null) goto L48;
        SharedPreferences r8 = r1.getSharedPreferences("lan-playback", 0);
        Context r2 = this.t0;
        if (r2 == null) goto L46;
        Set r3 = kb4.a0(r2);
        ArrayList r4 = new ArrayList(r40.k0(r3, 10));
        Iterator r5 = r3.iterator();
    L8:
        if (r5.hasNext() == false) goto L19;
        String r6 = (String) r5.next();
        String r7 = r8.getString("peer-" + r6, null);
        if (r7 != null) goto L12;
    L17:
        r7 = s(R.string.lan_unknown_device);
        r7.getClass();
    L18:
        r4.add(new kd3(r6, r7));
        goto L8
    L12:
        if (qm4.u0(r7) == false) goto L15;
        r7 = null;
    L15:
        if (r7 == null) goto L17;
    L19:
        List r9 = q40.K0(r4, new ca1(28));
        String r10 = q40.B0(r9, null, null, null, new k52(8), 31);
        if (r10.equals(this.S0) == true) goto L43;
        this.S0 = r10;
        PreferenceCategory r11 = this.x0;
        if (r11 == null) goto L44;
        r11.H();
        if (r9.isEmpty() == false) goto L35;
        PreferenceCategory r12 = this.x0;
        if (r12 == null) goto L33;
        Preference r13 = new Preference(Z(), null);
        r13.x(s(R.string.lan_no_paired));
        if (r13.D == false) goto L31;
        r13.D = false;
        r13.h();
    L31:
        r12.E(r13);
        return;
    L33:
        h12.Q("paired");
        throw null;
    L35:
        Iterator r14 = r9.iterator();
    L37:
        if (r14.hasNext() == false) goto L55;
        kd3 r15 = (kd3) r14.next();
        String r16 = (String) r15.n;
        String r17 = (String) r15.o;
        PreferenceCategory r18 = this.x0;
        if (r18 == null) goto L41;
        Preference r19 = new Preference(Z(), null);
        r19.z(r17);
        r19.x(s(R.string.lan_revoke_hint));
        r19.F = false;
        r19.s = new dg0(this, r17, r8, r16, 4);
        r18.E(r19);
        goto L37
    L41:
        h12.Q("paired");
        throw null;
    L55:
        return;
    L44:
        h12.Q("paired");
        throw null;
    L43:
        return;
    L46:
        h12.Q("app");
        throw null;
    L48:
        h12.Q("app");
        throw null;
    }

    public final void p0() {
        long r1 = SystemClock.elapsedRealtime();
        boolean r3 = LanReceiverService.y;
        if (LanReceiverService.y == false) goto L6;
        this.P0 = 0;
    L6:
        if (LanReceiverService.y == true) goto L9;
        this.Q0 = false;
    L9:
        if (this.P0 == 0) goto L16;
        if (LanReceiverService.z == null) goto L13;
    L14:
        this.P0 = 0;
        s0(R.string.lan_connection_error);
        goto L16
    L13:
        if ((r1 - this.P0) > 10000) goto L14;
    L16:
        if (LanReceiverService.y == true) goto L18;
    L20:
        boolean r4 = false;
    L21:
        SwitchPreference r8 = this.v0;
        if (r8 == null) goto L124;
        if (r4 == false) goto L25;
    L28:
        boolean r11 = true;
    L29:
        r8.E(r11);
        SwitchPreference r9 = this.v0;
        if (r9 != null) goto L32;
        h12.Q("receiver");
        throw null;
    L32:
        if (this.P0 == 0) goto L34;
        int r5 = R.string.lan_connecting;
    L35:
        r9.x(s(r5));
        SwitchPreference r6 = this.w0;
        if (r6 == null) goto L120;
        r6.A(r4);
        PreferenceCategory r7 = this.x0;
        if (r7 == null) goto L118;
        r7.A(r4);
        if (r4 == false) goto L42;
        o0();
    L42:
        if (r4 == true) goto L44;
    L46:
        boolean r10 = false;
    L47:
        SwitchPreference r12 = this.w0;
        if (r12 == null) goto L116;
        r12.E(r10);
        SwitchPreference r13 = this.w0;
        if (r13 == null) goto L114;
        if (r10 == false) goto L53;
        long r14 = ((LanReceiverService.A - r1) + 999) / 1000;
        String r15 = t(R.string.lan_pairing_remaining, new Object[]{String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(r14 / 60), Long.valueOf(r14 % 60)}, 2))});
    L54:
        r13.x(r15);
        if (r10 == false) goto L68;
        Collection r16 = LanReceiverService.B.values();
        r16.getClass();
        ArrayList r17 = new ArrayList();
        Iterator r18 = r16.iterator();
    L58:
        if (r18.hasNext() == false) goto L66;
        Object r19 = r18.next();
        boolean r20 = LanReceiverService.y;
        long r110 = LanReceiverService.A;
        long r21 = ((h52) r19).d;
        if (r1 >= r110) goto L58;
        if (r1 < r21) goto L58;
        if ((r1 - r21) >= 120000) goto L58;
        r17.add(r19);
        goto L58
    L66:
        Collection r2 = q40.K0(r17, new ca1(29));
    L67:
        Collection r111 = r2;
        PreferenceCategory r22 = this.y0;
        if (r22 == null) goto L112;
        r22.A(!r111.isEmpty());
        h52 r23 = this.U0;
        if (r23 == null) goto L80;
        if (q40.s0(r111, r23) == true) goto L80;
        f9 r24 = this.K0;
        if (r24 == null) goto L78;
        r24.dismiss();
    L78:
        this.U0 = null;
    L80:
        if (this.L0 == false) goto L96;
        f9 r25 = this.K0;
        if (r25 != null) goto L84;
    L86:
        Iterator r26 = r111.iterator();
    L88:
        if (r26.hasNext() == false) goto L92;
        Object r27 = r26.next();
        h52 r28 = (h52) r27;
        r28.getClass();
        if ((r28.a + ":" + r28.d).equals(this.T0) == true) goto L88;
    L93:
        h52 r29 = (h52) r27;
        if (r29 == null) goto L96;
        this.T0 = r29.a + ":" + r29.d;
        r0(r29);
        goto L96
    L92:
        r27 = null;
        goto L93
    L84:
        if (r25.isShowing() != true) goto L86;
    L96:
        String r30 = q40.B0(r111, null, null, null, new k52(7), 31);
        if (r30.equals(this.R0) == true) goto L109;
        this.R0 = r30;
        PreferenceCategory r31 = this.y0;
        if (r31 == null) goto L110;
        r31.H();
        Iterator r32 = r111.iterator();
    L103:
        if (r32.hasNext() == false) goto L140;
        h52 r33 = (h52) r32.next();
        PreferenceCategory r34 = this.y0;
        if (r34 == null) goto L107;
        Preference r35 = new Preference(Z(), null);
        r35.z(r33.b);
        r35.x(t(R.string.lan_pair_request, new Object[]{r33.b, r33.c}));
        r35.F = false;
        r35.s = new ef0(6, this, r33);
        r34.E(r35);
        goto L103
    L107:
        h12.Q("pendingRequests");
        throw null;
    L140:
        return;
    L110:
        h12.Q("pendingRequests");
        throw null;
    L109:
        return;
    L112:
        h12.Q("pendingRequests");
        throw null;
    L68:
        r2 = u01.n;
        goto L67
    L53:
        r15 = s(R.string.lan_pairing_closed);
        goto L54
    L114:
        h12.Q("pairing");
        throw null;
    L116:
        h12.Q("pairing");
        throw null;
    L44:
        if (r1 >= LanReceiverService.A) goto L46;
        r10 = true;
        goto L47
    L118:
        h12.Q("paired");
        throw null;
    L120:
        h12.Q("pairing");
        throw null;
    L34:
        r5 = R.string.lan_receiver_summary;
        goto L35
    L25:
        if (this.P0 != 0) goto L28;
        r11 = false;
        goto L29
    L124:
        h12.Q("receiver");
        throw null;
    L18:
        if (this.Q0 == true) goto L20;
        r4 = true;
        goto L21
    }

    public final void q0() {
        if (Build.VERSION.SDK_INT < 37) goto L12;
        Context r0 = this.t0;
        if (r0 != null) goto L7;
        h12.Q("app");
        throw null;
    L7:
        if (ud3.c(r0, "android.permission.ACCESS_LOCAL_NETWORK") == 0) goto L12;
        this.V0 = false;
        this.W0.a(new String[]{"android.permission.ACCESS_LOCAL_NETWORK"});
        return;
    L12:
        g62 r1 = this.H0;
        if (r1 == null) goto L27;
        this.I0 = true;
        NsdManager r4 = this.u0;     // Catch: Throwable -> L18
        if (r4 == null) goto L20;
        r4.stopServiceDiscovery(r1);     // Catch: Throwable -> L18
        Object r2 = j15.a;     // Catch: Throwable -> L18
    L24:
        if (bb3.a(r2) == null) goto L38;
        this.H0 = null;
        this.I0 = false;
        q0();
        return;
    L38:
        return;
    L20:
        h12.Q("nsd");     // Catch: Throwable -> L18
        throw null;     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        r2 = new s14(th);
        goto L24
    L27:
        this.G0.clear();
        n0();
        g62 r3 = new g62(this, this.M0);
        this.H0 = r3;
        NsdManager r5 = this.u0;     // Catch: Exception -> L34
        if (r5 == null) goto L32;
        r5.discoverServices("_tempus-lan._tcp.", 1, r3);     // Catch: Exception -> L34
        s0(R.string.lan_searching);     // Catch: Exception -> L34
        return;
    L32:
        h12.Q("nsd");     // Catch: Exception -> L34
        throw null;     // Catch: Exception -> L34
    L34:
        this.H0 = null;
        s0(R.string.lan_discovery_error);
    }

    public final void r0(h52 r5) {
        vg2 r0 = new vg2(Z(), 0);
        r0.p(R.string.lan_pair_title);
        r0.a.f = t(R.string.lan_pair_request, new Object[]{r5.b, r5.c});
        f9 r1 = r0.l(R.string.lan_pair_confirm, new b62(this, r5, 0)).j(android.R.string.cancel, null).create();
        this.U0 = null;
        f9 r2 = this.K0;
        if (r2 == null) goto L5;
        r2.dismiss();
    L5:
        this.K0 = r1;
        r1.show();
        this.U0 = r5;
    }

    public final void s0(int r1) {
        Preference r0 = this.A0;
        if (r0 == null) goto L6;
        r0.w(r1);
        return;
    L6:
        h12.Q("status");
        throw null;
    }

    public final void t0() {
        boolean r0 = LanReceiverService.y;     // Catch: Exception -> L13
        LanReceiverService.z = null;     // Catch: Exception -> L13
        this.Q0 = false;     // Catch: Exception -> L13
        this.P0 = SystemClock.elapsedRealtime();     // Catch: Exception -> L13
        Context r1 = this.t0;     // Catch: Exception -> L13
        if (r1 == null) goto L11;
        Context r4 = this.t0;     // Catch: Exception -> L13
        if (r4 == null) goto L9;
        ud3.G0(r1, new Intent(r4, LanReceiverService.class));     // Catch: Exception -> L13
        p0();     // Catch: Exception -> L13
        return;
    L9:
        h12.Q("app");     // Catch: Exception -> L13
        throw null;     // Catch: Exception -> L13
    L11:
        h12.Q("app");     // Catch: Exception -> L13
        throw null;     // Catch: Exception -> L13
    L13:
        this.P0 = 0;
        s0(R.string.lan_connection_error);
        p0();
    }
}
