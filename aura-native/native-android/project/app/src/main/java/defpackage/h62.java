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
    public String S0;
    public h52 U0;
    public boolean V0;
    public Context t0;
    public NsdManager u0;
    public SwitchPreference v0;
    public SwitchPreference w0;
    public PreferenceCategory x0;
    public PreferenceCategory y0;
    public PreferenceCategory z0;
    public final Handler D0 = new Handler(Looper.getMainLooper());
    public final ExecutorService E0 = Executors.newSingleThreadExecutor();
    public final z42 F0 = new z42();
    public final LinkedHashMap G0 = new LinkedHashMap();
    public String R0 = "";
    public String T0 = "";
    public final dc1 W0 = W(new a62(this, 4), new q5(0));
    public final g5 X0 = new g5(17, this);

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
        g62 g62Var = this.H0;
        if (g62Var != null) {
            try {
                NsdManager nsdManager = this.u0;
                if (nsdManager == null) {
                    h12.Q("nsd");
                    throw null;
                }
                nsdManager.stopServiceDiscovery(g62Var);
            } catch (Throwable unused) {
            }
        }
        this.H0 = null;
        this.I0 = false;
        Future future = this.J0;
        if (future != null) {
            future.cancel(true);
        }
        z42 z42Var = this.F0;
        z42Var.getClass();
        try {
            SSLSocket sSLSocket = z42Var.a;
            if (sSLSocket != null) {
                sSLSocket.close();
            }
        } catch (Throwable unused2) {
        }
        f9 f9Var = this.K0;
        if (f9Var != null) {
            f9Var.dismiss();
        }
        this.K0 = null;
        this.U0 = null;
        super.S();
    }

    @Override // defpackage.kp3, defpackage.kc1
    public final void T(View view, Bundle bundle) {
        view.getClass();
        super.T(view, bundle);
        u52.b.e(v(), new wd1(new x(20, this), 5));
    }

    @Override // defpackage.kp3
    public final void i0(String str) {
        Context applicationContext = Z().getApplicationContext();
        applicationContext.getClass();
        this.t0 = applicationContext;
        Object systemService = applicationContext.getSystemService((Class<Object>) NsdManager.class);
        systemService.getClass();
        this.u0 = (NsdManager) systemService;
        j0(R.xml.lan_preferences, str);
        this.v0 = (SwitchPreference) m0("lan_receiver_enabled");
        this.w0 = (SwitchPreference) m0("lan_pairing_enabled");
        this.x0 = (PreferenceCategory) m0("lan_paired_controllers");
        this.y0 = (PreferenceCategory) m0("lan_pair_requests");
        this.z0 = (PreferenceCategory) m0("lan_available_devices");
        this.A0 = m0("lan_setup_status");
        this.B0 = m0("lan_controlled_device");
        this.C0 = m0("lan_release_device");
        EditTextPreference editTextPreference = (EditTextPreference) m0("lan_name");
        boolean z = LanReceiverService.y;
        Context context = this.t0;
        if (context == null) {
            h12.Q("app");
            throw null;
        }
        editTextPreference.E(kb4.M(context));
        editTextPreference.x(editTextPreference.h0);
        editTextPreference.i0 = new er1(11);
        editTextPreference.r = new ef0(8, this, editTextPreference);
        SwitchPreference switchPreference = this.v0;
        if (switchPreference == null) {
            h12.Q("receiver");
            throw null;
        }
        switchPreference.r = new a62(this, 0);
        SwitchPreference switchPreference2 = this.w0;
        if (switchPreference2 == null) {
            h12.Q("pairing");
            throw null;
        }
        switchPreference2.r = new a62(this, 1);
        m0("lan_find_devices").s = new a62(this, 2);
        Preference preference = this.C0;
        if (preference != null) {
            preference.s = new a62(this, 3);
        } else {
            h12.Q("releaseControl");
            throw null;
        }
    }

    public final void k0(NsdServiceInfo nsdServiceInfo) {
        if (this.O0) {
            return;
        }
        this.O0 = true;
        long j = this.M0;
        boolean z = LanReceiverService.y;
        Context context = this.t0;
        if (context == null) {
            h12.Q("app");
            throw null;
        }
        this.J0 = this.E0.submit(new un1(this, nsdServiceInfo, kb4.M(context), j));
    }

    public final boolean l0(long j) {
        return this.L0 && j == this.M0;
    }

    public final Preference m0(String str) {
        Preference preferenceH0 = h0(str);
        if (preferenceH0 != null) {
            return preferenceH0;
        }
        kf2.o("Required value was null.");
        return null;
    }

    public final void n0() {
        PreferenceCategory preferenceCategory = this.z0;
        if (preferenceCategory == null) {
            h12.Q("devices");
            throw null;
        }
        preferenceCategory.H();
        PreferenceCategory preferenceCategory2 = this.z0;
        if (preferenceCategory2 == null) {
            h12.Q("devices");
            throw null;
        }
        LinkedHashMap linkedHashMap = this.G0;
        preferenceCategory2.A(!linkedHashMap.isEmpty());
        Collection<c62> collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        for (c62 c62Var : collectionValues) {
            PreferenceCategory preferenceCategory3 = this.z0;
            if (preferenceCategory3 == null) {
                h12.Q("devices");
                throw null;
            }
            Preference preference = new Preference(Z(), null);
            String serviceName = c62Var.a.getServiceName();
            serviceName.getClass();
            preference.z(qm4.z0(serviceName, "Tempus "));
            preference.x(s(R.string.lan_select_receiver));
            preference.v(R.drawable.ic_navigate_next);
            preference.F = false;
            preference.s = new ef0(7, this, c62Var);
            preferenceCategory3.E(preference);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    public final void o0() {
        boolean z = LanReceiverService.y;
        Context context = this.t0;
        if (context == null) {
            h12.Q("app");
            throw null;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("lan-playback", 0);
        Context context2 = this.t0;
        if (context2 == null) {
            h12.Q("app");
            throw null;
        }
        Set<String> setA0 = kb4.a0(context2);
        ArrayList arrayList = new ArrayList(r40.k0(setA0, 10));
        for (String str : setA0) {
            String string = sharedPreferences.getString("peer-" + str, null);
            if (string == null) {
                string = s(R.string.lan_unknown_device);
                string.getClass();
            } else {
                if (qm4.u0(string)) {
                    string = null;
                }
                if (string == null) {
                    string = s(R.string.lan_unknown_device);
                    string.getClass();
                }
            }
            arrayList.add(new kd3(str, string));
        }
        List<kd3> listK0 = q40.K0(arrayList, new ca1(28));
        String strB0 = q40.B0(listK0, null, null, null, new k52(8), 31);
        if (strB0.equals(this.S0)) {
            return;
        }
        this.S0 = strB0;
        PreferenceCategory preferenceCategory = this.x0;
        if (preferenceCategory == null) {
            h12.Q("paired");
            throw null;
        }
        preferenceCategory.H();
        if (listK0.isEmpty()) {
            PreferenceCategory preferenceCategory2 = this.x0;
            if (preferenceCategory2 == null) {
                h12.Q("paired");
                throw null;
            }
            Preference preference = new Preference(Z(), null);
            preference.x(s(R.string.lan_no_paired));
            if (preference.D) {
                preference.D = false;
                preference.h();
            }
            preferenceCategory2.E(preference);
            return;
        }
        for (kd3 kd3Var : listK0) {
            String str2 = (String) kd3Var.n;
            String str3 = (String) kd3Var.o;
            PreferenceCategory preferenceCategory3 = this.x0;
            if (preferenceCategory3 == null) {
                h12.Q("paired");
                throw null;
            }
            Preference preference2 = new Preference(Z(), null);
            preference2.z(str3);
            preference2.x(s(R.string.lan_revoke_hint));
            preference2.F = false;
            preference2.s = new dg0(this, str3, sharedPreferences, str2, 4);
            preferenceCategory3.E(preference2);
        }
    }

    public final void p0() {
        String strS;
        Collection collectionK0;
        f9 f9Var;
        Object next;
        h52 h52Var;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = LanReceiverService.y;
        if (LanReceiverService.y) {
            this.P0 = 0L;
        }
        if (!LanReceiverService.y) {
            this.Q0 = false;
        }
        if (this.P0 != 0 && (LanReceiverService.z != null || jElapsedRealtime - this.P0 > 10000)) {
            this.P0 = 0L;
            s0(R.string.lan_connection_error);
        }
        boolean z2 = LanReceiverService.y && !this.Q0;
        SwitchPreference switchPreference = this.v0;
        if (switchPreference == null) {
            h12.Q("receiver");
            throw null;
        }
        switchPreference.E(z2 || this.P0 != 0);
        SwitchPreference switchPreference2 = this.v0;
        if (switchPreference2 == null) {
            h12.Q("receiver");
            throw null;
        }
        switchPreference2.x(s(this.P0 != 0 ? R.string.lan_connecting : R.string.lan_receiver_summary));
        SwitchPreference switchPreference3 = this.w0;
        if (switchPreference3 == null) {
            h12.Q("pairing");
            throw null;
        }
        switchPreference3.A(z2);
        PreferenceCategory preferenceCategory = this.x0;
        if (preferenceCategory == null) {
            h12.Q("paired");
            throw null;
        }
        preferenceCategory.A(z2);
        if (z2) {
            o0();
        }
        boolean z3 = z2 && jElapsedRealtime < LanReceiverService.A;
        SwitchPreference switchPreference4 = this.w0;
        if (switchPreference4 == null) {
            h12.Q("pairing");
            throw null;
        }
        switchPreference4.E(z3);
        SwitchPreference switchPreference5 = this.w0;
        if (switchPreference5 == null) {
            h12.Q("pairing");
            throw null;
        }
        if (z3) {
            long j = ((LanReceiverService.A - jElapsedRealtime) + 999) / 1000;
            strS = t(R.string.lan_pairing_remaining, String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2)));
        } else {
            strS = s(R.string.lan_pairing_closed);
        }
        switchPreference5.x(strS);
        if (z3) {
            Collection collectionValues = LanReceiverService.B.values();
            collectionValues.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                boolean z4 = LanReceiverService.y;
                long j2 = LanReceiverService.A;
                long j3 = ((h52) obj).d;
                if (jElapsedRealtime < j2 && jElapsedRealtime >= j3 && jElapsedRealtime - j3 < 120000) {
                    arrayList.add(obj);
                }
            }
            collectionK0 = q40.K0(arrayList, new ca1(29));
        } else {
            collectionK0 = u01.n;
        }
        Collection<h52> collection = collectionK0;
        PreferenceCategory preferenceCategory2 = this.y0;
        if (preferenceCategory2 == null) {
            h12.Q("pendingRequests");
            throw null;
        }
        preferenceCategory2.A(!collection.isEmpty());
        h52 h52Var2 = this.U0;
        if (h52Var2 != null && !q40.s0(collection, h52Var2)) {
            f9 f9Var2 = this.K0;
            if (f9Var2 != null) {
                f9Var2.dismiss();
            }
            this.U0 = null;
        }
        if (this.L0 && ((f9Var = this.K0) == null || !f9Var.isShowing())) {
            Iterator it = collection.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                h52Var = (h52) next;
                h52Var.getClass();
            } while ((h52Var.a + ":" + h52Var.d).equals(this.T0));
            h52 h52Var3 = (h52) next;
            if (h52Var3 != null) {
                this.T0 = h52Var3.a + ":" + h52Var3.d;
                r0(h52Var3);
            }
        }
        String strB0 = q40.B0(collection, null, null, null, new k52(7), 31);
        if (strB0.equals(this.R0)) {
            return;
        }
        this.R0 = strB0;
        PreferenceCategory preferenceCategory3 = this.y0;
        if (preferenceCategory3 == null) {
            h12.Q("pendingRequests");
            throw null;
        }
        preferenceCategory3.H();
        for (h52 h52Var4 : collection) {
            PreferenceCategory preferenceCategory4 = this.y0;
            if (preferenceCategory4 == null) {
                h12.Q("pendingRequests");
                throw null;
            }
            Preference preference = new Preference(Z(), null);
            preference.z(h52Var4.b);
            preference.x(t(R.string.lan_pair_request, h52Var4.b, h52Var4.c));
            preference.F = false;
            preference.s = new ef0(6, this, h52Var4);
            preferenceCategory4.E(preference);
        }
    }

    public final void q0() {
        Object s14Var;
        if (Build.VERSION.SDK_INT >= 37) {
            Context context = this.t0;
            if (context == null) {
                h12.Q("app");
                throw null;
            }
            if (ud3.c(context, "android.permission.ACCESS_LOCAL_NETWORK") != 0) {
                this.V0 = false;
                this.W0.a(new String[]{"android.permission.ACCESS_LOCAL_NETWORK"});
                return;
            }
        }
        g62 g62Var = this.H0;
        if (g62Var == null) {
            this.G0.clear();
            n0();
            g62 g62Var2 = new g62(this, this.M0);
            this.H0 = g62Var2;
            try {
                NsdManager nsdManager = this.u0;
                if (nsdManager == null) {
                    h12.Q("nsd");
                    throw null;
                }
                nsdManager.discoverServices("_tempus-lan._tcp.", 1, g62Var2);
                s0(R.string.lan_searching);
                return;
            } catch (Exception unused) {
                this.H0 = null;
                s0(R.string.lan_discovery_error);
                return;
            }
        }
        this.I0 = true;
        try {
            NsdManager nsdManager2 = this.u0;
            if (nsdManager2 == null) {
                h12.Q("nsd");
                throw null;
            }
            nsdManager2.stopServiceDiscovery(g62Var);
            s14Var = j15.a;
            if (bb3.a(s14Var) != null) {
                this.H0 = null;
                this.I0 = false;
                q0();
            }
        } catch (Throwable th) {
            s14Var = new s14(th);
        }
    }

    public final void r0(h52 h52Var) {
        vg2 vg2Var = new vg2(Z(), 0);
        vg2Var.p(R.string.lan_pair_title);
        vg2Var.a.f = t(R.string.lan_pair_request, h52Var.b, h52Var.c);
        f9 f9VarCreate = vg2Var.l(R.string.lan_pair_confirm, new b62(this, h52Var, 0)).j(android.R.string.cancel, null).create();
        this.U0 = null;
        f9 f9Var = this.K0;
        if (f9Var != null) {
            f9Var.dismiss();
        }
        this.K0 = f9VarCreate;
        f9VarCreate.show();
        this.U0 = h52Var;
    }

    public final void s0(int i) {
        Preference preference = this.A0;
        if (preference != null) {
            preference.w(i);
        } else {
            h12.Q("status");
            throw null;
        }
    }

    public final void t0() {
        try {
            boolean z = LanReceiverService.y;
            LanReceiverService.z = null;
            this.Q0 = false;
            this.P0 = SystemClock.elapsedRealtime();
            Context context = this.t0;
            if (context == null) {
                h12.Q("app");
                throw null;
            }
            Context context2 = this.t0;
            if (context2 == null) {
                h12.Q("app");
                throw null;
            }
            ud3.G0(context, new Intent(context2, (Class<?>) LanReceiverService.class));
            p0();
        } catch (Exception unused) {
            this.P0 = 0L;
            s0(R.string.lan_connection_error);
            p0();
        }
    }
}
