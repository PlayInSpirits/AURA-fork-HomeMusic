package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import androidx.preference.Preference;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.eddyizm.tempus.service.DownloaderService;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.login.LoginActivity;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss1 implements bp3, cp3, p5 {
    public final /* synthetic */ int n;
    public final /* synthetic */ vb4 o;

    public /* synthetic */ ss1(vb4 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.bp3
    public boolean g(Preference r6, Object r7) {
        int r0 = this.n;
        int r2 = 2;
        int r3 = 0;
        vb4 r5 = this.o;
        int r4 = 1;
        switch(r0) {
            case 0: goto L51;
            case 3: goto L46;
            case 6: goto L40;
            case 7: goto L34;
            case 8: goto L27;
            case 9: goto L18;
            case 16: goto L13;
            default: goto L5;
        };
    L51:
        io1.b.post(new qa1(14, r5));
        return true;
    L5:
        if ((r7 instanceof Boolean) == false) goto L11;
        boolean r8 = ((Boolean) r7).booleanValue();
        xa3.t("download_wifi_only", r8);
        if (r8 == false) goto L9;
        h04 r9 = new h04(2);
    L10:
        Context r10 = r5.Z();
        HashMap r11 = vt0.v;
        r10.startService(new Intent(r10, DownloaderService.class).setAction("androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS").putExtra("foreground", false).putExtra("requirements", r9));
        goto L11
    L9:
        r9 = new h04(0);
    L11:
        return true;
    L13:
        if ("default".equals(r7) == false) goto L15;
        pf.j(wd2.b);
        r6.x(r5.Z().getString(R.string.settings_system_language));
    L16:
        return true;
    L15:
        String r12 = (String) r7;
        pf.j(wd2.a(r12));
        r6.x(Locale.forLanguageTag(r12).getDisplayName());
        goto L16
    L18:
        if ((r7 instanceof Integer) == false) goto L25;
        float r13 = ((Integer) r7).intValue();
        App.b().getClass();
        App.c().edit().putInt("loudness_preamp", (int) r13).apply();
        if (r5.y0 == false) goto L25;
        xp r14 = r5.x0;
        if (r14 == null) goto L25;
        jz3.i(r14.e.o());
    L25:
        return true;
    L27:
        if ((r7 instanceof Boolean) == false) goto L32;
        boolean r15 = ((Boolean) r7).booleanValue();
        MainActivity r16 = r5.t0;
        if (r15 == false) goto L31;
        r16.getWindow().addFlags(128);
        goto L32
    L31:
        r16.getWindow().clearFlags(128);
    L32:
        return true;
    L34:
        if ((r7 instanceof Boolean) == true) goto L36;
    L38:
        return true;
    L36:
        if (((Boolean) r7).booleanValue() == false) goto L38;
        rb4 r1 = new rb4(r6, 0);
        zk4 r17 = new zk4(r4);
        r17.D0 = r1;
        r17.m0(r5.t0.k(), null);
        goto L38
    L40:
        if ((r7 instanceof Boolean) == true) goto L42;
    L44:
        return true;
    L42:
        if (((Boolean) r7).booleanValue() == false) goto L44;
        rb4 r18 = new rb4(r6, 1);
        zk4 r19 = new zk4(r3);
        r19.D0 = r18;
        r19.m0(r5.t0.k(), null);
        goto L44
    L46:
        if ((r7 instanceof Boolean) == true) goto L48;
    L50:
        return true;
    L48:
        if (((Boolean) r7).booleanValue() == false) goto L50;
        rb4 r20 = new rb4(r6, 2);
        zk4 r21 = new zk4(r2);
        r21.D0 = r20;
        r21.m0(r5.t0.k(), null);
        goto L50
    }

    @Override // defpackage.p5
    public void i(Object r3) {
        o5 r4 = (o5) r3;
        if (r4.n != (-1)) goto L10;
        Intent r5 = r4.o;
        if (r5 == null) goto L11;
        Uri r6 = r5.getData();
        if (r6 == null) goto L12;
        vb4 r2 = this.o;
        r2.Z().getContentResolver().takePersistableUriPermission(r6, 3);
        ud3.i0(r6.toString());
        g51.i();
        Toast.makeText(r2.Z(), R.string.settings_download_folder_set, 0).show();
        r2.m0();
        return;
    L12:
        return;
    L11:
        return;
    }

    @Override // defpackage.cp3
    public void j(Preference r21) {
        int r1 = this.n;
        int r2 = 2;
        int r7 = 1;
        MainActivity r9 = null;
        vb4 r0 = this.o;
        switch(r1) {
            case 1: goto L34;
            case 2: goto L28;
            case 3: goto L4;
            case 4: goto L26;
            case 5: goto L24;
            case 6: goto L4;
            case 7: goto L4;
            case 8: goto L4;
            case 9: goto L4;
            case 10: goto L22;
            case 11: goto L20;
            case 12: goto L18;
            case 13: goto L16;
            case 14: goto L12;
            case 15: goto L9;
            default: goto L4;
        };
    L4:
        ob4 r3 = r0.u0;
        int r4 = 21;
        pz1 r5 = new pz1(r4, r0);
        hh3 r6 = r3.c;
        mb4 r8 = new mb4(r5);
        r6.getClass();
        pn4 r10 = App.f(false);
        if (r10.k != null) goto L7;
        r10.k = new rm3(r10, 14);
    L7:
        rm3 r11 = r10.k;
        r11.getClass();
        Log.d("MediaLibraryScanningClient", "startScan()");
        ((in2) r11.o).a(((pn4) r11.n).f()).enqueue(new si1(r4, r8));
        return;
    L9:
        new jo0().m0(r0.t0.k(), null);
        return;
    L16:
        Intent r12 = new Intent(r0.X(), LoginActivity.class);
        r12.putExtra("HIDE_TAB_LAYOUT", true);
        r12.putExtra("HIDE_TOPAPPBAR_LAYOUT", false);
        r12.putExtra("SELECT_FRAGMENT", 2);
        r0.g0(r12);
        return;
    L18:
        new us0(new rm2(17, r0), r7).m0(r0.t0.k(), null);
        return;
    L20:
        new us0(new ub4(r0), r2).m0(r0.t0.k(), null);
        return;
    L22:
        r0.t0.H();
        return;
    L24:
        v23 r13 = q05.l(r0);
        y23 r14 = new y23(true, false, R.id.equalizerFragment, true, false, -1, -1, -1, -1);
        r0.t0.U.p(true);
        r0.t0.I(true);
        r13.m(R.id.equalizerFragment, null, r14);
        return;
    L26:
        Intent r15 = new Intent(r0.X(), LoginActivity.class);
        r15.putExtra("HIDE_TAB_LAYOUT", true);
        r15.putExtra("HIDE_TOPAPPBAR_LAYOUT", false);
        r15.putExtra("SELECT_FRAGMENT", 1);
        r0.g0(r15);
        return;
    L28:
        nc1 r16 = r0.l();
        if ((r16 instanceof MainActivity) == false) goto L31;
        r9 = (MainActivity) r16;
    L31:
        if (r9 == null) goto L37;
        js1.a(r9, "/admin");
        return;
    L37:
        return;
    L34:
        HubUpdater.check(r0.X(), true);
        return;
    L12:
        if (ud3.o() == null) goto L14;
        ud3.i0(null);
        ud3.j0(0);
        g51.i();
        Toast.makeText(r0.Z(), R.string.settings_download_folder_cleared, 0).show();
        r0.o0();
        r0.m0();
        return;
    L14:
        Intent r17 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        r17.addFlags(67);
        r0.w0.a(r17);
    }
}
