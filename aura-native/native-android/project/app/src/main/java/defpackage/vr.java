package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.widget.RatingBar;
import android.widget.Toast;
import app.homemusic.R;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.lan.LanPlaybackActivity;
import com.eddyizm.tempus.subsonic.models.InternetRadioStation;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PlaylistRowBottomSheetDialog;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vr implements DialogInterface.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ vr(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        v23 v23Var;
        int i2 = this.n;
        byte b = 0;
        Object obj = this.o;
        switch (i2) {
            case 0:
                Intent intent = new Intent();
                intent.addFlags(268435456);
                intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                ((xr) obj).g0(intent);
                break;
            case 1:
                DefaultErrorActivity defaultErrorActivity = (DefaultErrorActivity) obj;
                int i3 = DefaultErrorActivity.N;
                String strB = sg0.b(defaultErrorActivity, defaultErrorActivity.getIntent());
                ClipboardManager clipboardManager = (ClipboardManager) defaultErrorActivity.getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(defaultErrorActivity.getString(R.string.customactivityoncrash_error_activity_error_details_clipboard_label), strB));
                    Toast.makeText(defaultErrorActivity, R.string.customactivityoncrash_error_activity_error_details_copied, 0).show();
                }
                break;
            case 2:
                nc1 nc1VarE = ((vb4) obj).e();
                MainActivity mainActivity = nc1VarE instanceof MainActivity ? (MainActivity) nc1VarE : null;
                if (mainActivity != null) {
                    io1.a.execute(new ws1(b, ud3.E(), mainActivity));
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                nc1 nc1Var = (nc1) obj;
                nc1Var.startActivity(new Intent(nc1Var, (Class<?>) LanPlaybackActivity.class));
                break;
            case 4:
                PlaylistPageFragment playlistPageFragment = (PlaylistPageFragment) obj;
                playlistPageFragment.n0.k.k(Boolean.FALSE);
                if (playlistPageFragment.n() != null) {
                    Toast.makeText(playlistPageFragment.n(), R.string.playlist_error_not_found_toast, 0).show();
                }
                MainActivity mainActivity2 = playlistPageFragment.m0;
                if (mainActivity2 != null && (v23Var = mainActivity2.T) != null) {
                    v23Var.o();
                    break;
                }
                break;
            case 5:
                PlaylistRowBottomSheetDialog playlistRowBottomSheetDialog = (PlaylistRowBottomSheetDialog) obj;
                Context applicationContext = playlistRowBottomSheetDialog.Z().getApplicationContext();
                playlistRowBottomSheetDialog.h0();
                playlistRowBottomSheetDialog.B0.b(playlistRowBottomSheetDialog.C0.getId(), new vj(applicationContext, b));
                break;
            case 6:
                gu3 gu3Var = ((eu3) obj).C0;
                InternetRadioStation internetRadioStation = gu3Var.d;
                if (internetRadioStation != null && internetRadioStation.getId() != null) {
                    gu3Var.g.k(null);
                    gu3Var.f.k(Boolean.FALSE);
                    boolean z = gu3Var.e;
                    hh3 hh3Var = gu3Var.c;
                    InternetRadioStation internetRadioStation2 = gu3Var.d;
                    if (!z) {
                        String id = internetRadioStation2.getId();
                        hh3Var.getClass();
                        xc5 xc5VarD = App.f(false).d();
                        xc5VarD.getClass();
                        Log.d("InternetRadioClient", "deleteInternetRadioStation()");
                        ((x02) xc5VarD.p).c(((pn4) xc5VarD.o).f(), id).enqueue(new si1(19, gu3Var));
                    } else {
                        String id2 = internetRadioStation2.getId();
                        fu3 fu3Var = new fu3(gu3Var, 0);
                        hh3Var.getClass();
                        new Thread(new ur2(16, id2, fu3Var)).start();
                    }
                    break;
                }
                break;
            default:
                ou3 ou3Var = (ou3) obj;
                ou3Var.C0.c((int) ((RatingBar) ou3Var.B0.o).getRating());
                break;
        }
    }
}
