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
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.service.DownloaderService;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.login.LoginActivity;
import java.util.HashMap;
import java.util.Locale;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss1 implements bp3, cp3, p5 {
    public final /* synthetic */ int n;
    public final /* synthetic */ vb4 o;

    public /* synthetic */ ss1(vb4 vb4Var, int i) {
        this.n = i;
        this.o = vb4Var;
    }

    @Override // defpackage.bp3
    public boolean g(Preference preference, Object obj) {
        xp xpVar;
        int i = this.n;
        int i2 = 2;
        int i3 = 0;
        vb4 vb4Var = this.o;
        int i4 = 1;
        switch (i) {
            case 0:
                io1.b.post(new qa1(14, vb4Var));
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    rb4 rb4Var = new rb4(preference, 2);
                    zk4 zk4Var = new zk4(i2);
                    zk4Var.D0 = rb4Var;
                    zk4Var.m0(vb4Var.t0.k(), null);
                }
                break;
            case 6:
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    rb4 rb4Var2 = new rb4(preference, 1);
                    zk4 zk4Var2 = new zk4(i3);
                    zk4Var2.D0 = rb4Var2;
                    zk4Var2.m0(vb4Var.t0.k(), null);
                }
                break;
            case 7:
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    rb4 rb4Var3 = new rb4(preference, 0);
                    zk4 zk4Var3 = new zk4(i4);
                    zk4Var3.D0 = rb4Var3;
                    zk4Var3.m0(vb4Var.t0.k(), null);
                }
                break;
            case 8:
                if (obj instanceof Boolean) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    MainActivity mainActivity = vb4Var.t0;
                    if (!zBooleanValue) {
                        mainActivity.getWindow().clearFlags(128);
                    } else {
                        mainActivity.getWindow().addFlags(128);
                    }
                }
                break;
            case 9:
                if (obj instanceof Integer) {
                    float fIntValue = ((Integer) obj).intValue();
                    App.b().getClass();
                    App.c().edit().putInt("loudness_preamp", (int) fIntValue).apply();
                    if (vb4Var.y0 && (xpVar = vb4Var.x0) != null) {
                        jz3.i(xpVar.e.o());
                    }
                }
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                if (!"default".equals(obj)) {
                    String str = (String) obj;
                    pf.j(wd2.a(str));
                    preference.x(Locale.forLanguageTag(str).getDisplayName());
                } else {
                    pf.j(wd2.b);
                    preference.x(vb4Var.Z().getString(R.string.settings_system_language));
                }
                break;
            default:
                if (obj instanceof Boolean) {
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    xa3.t("download_wifi_only", zBooleanValue2);
                    h04 h04Var = zBooleanValue2 ? new h04(2) : new h04(0);
                    Context contextZ = vb4Var.Z();
                    HashMap map = vt0.v;
                    contextZ.startService(new Intent(contextZ, (Class<?>) DownloaderService.class).setAction("androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS").putExtra("foreground", false).putExtra("requirements", h04Var));
                }
                break;
        }
        return true;
    }

    @Override // defpackage.p5
    public void i(Object obj) {
        Intent intent;
        Uri data;
        o5 o5Var = (o5) obj;
        if (o5Var.n != -1 || (intent = o5Var.o) == null || (data = intent.getData()) == null) {
            return;
        }
        vb4 vb4Var = this.o;
        vb4Var.Z().getContentResolver().takePersistableUriPermission(data, 3);
        ud3.i0(data.toString());
        g51.i();
        Toast.makeText(vb4Var.Z(), R.string.settings_download_folder_set, 0).show();
        vb4Var.m0();
    }

    @Override // defpackage.cp3
    public void j(Preference preference) {
        int i = this.n;
        int i2 = 2;
        int i3 = 1;
        vb4 vb4Var = this.o;
        switch (i) {
            case 1:
                HubUpdater.check(vb4Var.X(), true);
                break;
            case 2:
                nc1 nc1VarE = vb4Var.e();
                MainActivity mainActivity = nc1VarE instanceof MainActivity ? (MainActivity) nc1VarE : null;
                if (mainActivity != null) {
                    js1.a(mainActivity, "/admin");
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                ob4 ob4Var = vb4Var.u0;
                int i4 = 21;
                pz1 pz1Var = new pz1(i4, vb4Var);
                hh3 hh3Var = ob4Var.c;
                mb4 mb4Var = new mb4(pz1Var);
                hh3Var.getClass();
                pn4 pn4VarF = App.f(false);
                if (pn4VarF.k == null) {
                    pn4VarF.k = new rm3(pn4VarF, 14);
                }
                rm3 rm3Var = pn4VarF.k;
                rm3Var.getClass();
                Log.d("MediaLibraryScanningClient", "startScan()");
                ((in2) rm3Var.o).a(((pn4) rm3Var.n).f()).enqueue(new si1(i4, mb4Var));
                break;
            case 4:
                Intent intent = new Intent(vb4Var.X(), (Class<?>) LoginActivity.class);
                intent.putExtra("HIDE_TAB_LAYOUT", true);
                intent.putExtra("HIDE_TOPAPPBAR_LAYOUT", false);
                intent.putExtra("SELECT_FRAGMENT", 1);
                vb4Var.g0(intent);
                break;
            case 5:
                v23 v23VarL = q05.l(vb4Var);
                y23 y23Var = new y23(true, false, R.id.equalizerFragment, true, false, -1, -1, -1, -1);
                vb4Var.t0.U.p(true);
                vb4Var.t0.I(true);
                v23VarL.m(R.id.equalizerFragment, null, y23Var);
                break;
            case 10:
                vb4Var.t0.H();
                break;
            case 11:
                new us0(new ub4(vb4Var), i2).m0(vb4Var.t0.k(), null);
                break;
            case 12:
                new us0(new rm2(17, vb4Var), i3).m0(vb4Var.t0.k(), null);
                break;
            case 13:
                Intent intent2 = new Intent(vb4Var.X(), (Class<?>) LoginActivity.class);
                intent2.putExtra("HIDE_TAB_LAYOUT", true);
                intent2.putExtra("HIDE_TOPAPPBAR_LAYOUT", false);
                intent2.putExtra("SELECT_FRAGMENT", 2);
                vb4Var.g0(intent2);
                break;
            case 14:
                if (ud3.o() == null) {
                    Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                    intent3.addFlags(67);
                    vb4Var.w0.a(intent3);
                } else {
                    ud3.i0(null);
                    ud3.j0(0);
                    g51.i();
                    Toast.makeText(vb4Var.Z(), R.string.settings_download_folder_cleared, 0).show();
                    vb4Var.o0();
                    vb4Var.m0();
                }
                break;
            case 15:
                new jo0().m0(vb4Var.t0.k(), null);
                break;
        }
    }
}
