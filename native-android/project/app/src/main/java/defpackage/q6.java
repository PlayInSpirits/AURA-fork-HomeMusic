package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageButton;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.AlbumCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
import java.util.ArrayList;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q6 implements View.OnLongClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ q6(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.n;
        int i2 = 0;
        Object obj = this.o;
        switch (i) {
            case 0:
                r6 r6Var = (r6) obj;
                Bundle bundle = new Bundle();
                s6 s6Var = r6Var.v;
                bundle.putParcelable("ALBUM_OBJECT", ((AlbumID3) s6Var.r.get(r6Var.c())).strippedForNav());
                s6Var.t.onAlbumLongClick(bundle);
                return true;
            case 1:
                k7 k7Var = (k7) obj;
                Bundle bundle2 = new Bundle();
                l7 l7Var = k7Var.v;
                bundle2.putParcelable("ALBUM_OBJECT", ((AlbumID3) l7Var.r.get(k7Var.c())).strippedForNav());
                l7Var.q.onAlbumLongClick(bundle2);
                return true;
            case 2:
                p7 p7Var = (p7) obj;
                Bundle bundle3 = new Bundle();
                q7 q7Var = p7Var.v;
                bundle3.putParcelable("ALBUM_OBJECT", ((AlbumID3) q7Var.s.get(p7Var.c())).strippedForNav());
                ((AlbumCatalogueFragment) q7Var.u).onAlbumLongClick(bundle3);
                return true;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((a8) obj).s();
                return true;
            case 4:
                ui uiVar = (ui) obj;
                Bundle bundle4 = new Bundle();
                vi viVar = uiVar.v;
                bundle4.putParcelable("ARTIST_OBJECT", ((ArtistID3) viVar.u.get(uiVar.c())).strippedForNav());
                viVar.q.onArtistLongClick(bundle4);
                return true;
            case 5:
                cj cjVar = (cj) obj;
                Bundle bundle5 = new Bundle();
                s6 s6Var2 = cjVar.v;
                bundle5.putParcelable("ARTIST_OBJECT", (Parcelable) s6Var2.r.get(cjVar.c()));
                ((ArtistPageFragment) s6Var2.t).onArtistLongClick(bundle5);
                return true;
            case 6:
                dj djVar = (dj) obj;
                Bundle bundle6 = new Bundle();
                ej ejVar = djVar.v;
                bundle6.putParcelable("ARTIST_OBJECT", (Parcelable) ejVar.r.get(djVar.c()));
                ((ArtistCatalogueFragment) ejVar.t).onArtistLongClick(bundle6);
                return true;
            case 7:
                ((jj) obj).s();
                return true;
            case 8:
                uq0 uq0Var = (uq0) obj;
                Bundle bundle7 = new Bundle();
                vq0 vq0Var = uq0Var.v;
                bundle7.putParcelable("TRACK_OBJECT", (Parcelable) vq0Var.r.get(uq0Var.c()));
                vq0Var.q.onMediaLongClick(bundle7);
                return true;
            case 9:
                return ((et0) obj).s();
            case 10:
                hp1 hp1Var = (hp1) obj;
                hp1Var.n0.c(hp1Var.v());
                return true;
            case 11:
                ((z02) obj).s();
                return true;
            case 12:
                oe2 oe2Var = (oe2) obj;
                ArrayList arrayList = oe2Var.n0;
                if (arrayList == null) {
                    h12.Q("serverList");
                    throw null;
                }
                Server server = (Server) arrayList.get(oe2Var.o0);
                String serverName = server.getServerName();
                String username = server.getUsername();
                String password = server.getPassword();
                String address = server.getAddress();
                String localAddress = server.getLocalAddress();
                if (localAddress == null) {
                    localAddress = server.getAddress();
                }
                String clientCert = server.getClientCert();
                if (clientCert == null) {
                    clientCert = "";
                }
                App.b().getClass();
                SharedPreferences sharedPreferencesC = App.c();
                sharedPreferencesC.getClass();
                SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                editorEdit.putString("server", serverName);
                editorEdit.apply();
                App.b().getClass();
                SharedPreferences sharedPreferencesC2 = App.c();
                sharedPreferencesC2.getClass();
                SharedPreferences.Editor editorEdit2 = sharedPreferencesC2.edit();
                editorEdit2.putString("user", username);
                editorEdit2.apply();
                App.b().getClass();
                SharedPreferences sharedPreferencesC3 = App.c();
                sharedPreferencesC3.getClass();
                SharedPreferences.Editor editorEdit3 = sharedPreferencesC3.edit();
                editorEdit3.putString("password", password);
                editorEdit3.apply();
                App.b().getClass();
                SharedPreferences sharedPreferencesC4 = App.c();
                sharedPreferencesC4.getClass();
                SharedPreferences.Editor editorEdit4 = sharedPreferencesC4.edit();
                editorEdit4.putString("in_use_server_address", address);
                editorEdit4.apply();
                App.b().getClass();
                SharedPreferences sharedPreferencesC5 = App.c();
                sharedPreferencesC5.getClass();
                SharedPreferences.Editor editorEdit5 = sharedPreferencesC5.edit();
                editorEdit5.putString("local_address", localAddress);
                editorEdit5.apply();
                App.b().getClass();
                SharedPreferences sharedPreferencesC6 = App.c();
                sharedPreferencesC6.getClass();
                SharedPreferences.Editor editorEdit6 = sharedPreferencesC6.edit();
                editorEdit6.putString("client_cert", clientCert);
                editorEdit6.apply();
                App.f(true);
                new mm3().h();
                oe2Var.X().finish();
                oe2Var.g0(new Intent(oe2Var.n(), (Class<?>) MainActivity.class));
                return true;
            case 13:
                yz2 yz2Var = (yz2) obj;
                zd0 zd0Var = yz2Var.v;
                if (((Child) zd0Var.r.get(yz2Var.c())).isDir()) {
                    return false;
                }
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable("TRACK_OBJECT", (Parcelable) zd0Var.r.get(yz2Var.c()));
                ((DirectoryFragment) zd0Var.s).onMediaLongClick(bundle8);
                return true;
            case 14:
                ((ImageButton) ((ae1) ((xi3) obj).o0.q).e).setVisibility(8);
                return true;
            case 15:
                ((yl3) obj).s();
                return true;
            case WaveRetry.MAX_FAILURES /* 16 */:
                vm3 vm3Var = (vm3) obj;
                Bundle bundle9 = new Bundle();
                ej ejVar2 = vm3Var.v;
                bundle9.putParcelable("PODCAST_CHANNEL_OBJECT", (Parcelable) ejVar2.r.get(vm3Var.c()));
                ((PodcastChannelCatalogueFragment) ejVar2.t).onPodcastChannelLongClick(bundle9);
                return true;
            case 17:
                ((zm3) obj).s();
                return true;
            case 18:
                return ((dn3) obj).t();
            case 19:
                la4 la4Var = (la4) obj;
                Bundle bundle10 = new Bundle();
                zd0 zd0Var2 = la4Var.v;
                bundle10.putParcelable("server_object", (Parcelable) zd0Var2.r.get(la4Var.c()));
                ((LoginFragment) zd0Var2.s).onServerLongClick(bundle10);
                return true;
            case 20:
                ra4 ra4Var = (ra4) obj;
                se2 se2Var = ra4Var.C0;
                pz1 pz1Var = se2Var.c;
                Server server2 = se2Var.d;
                if (server2 != null) {
                    new Thread(new oa4((na4) pz1Var.o, server2, i2)).start();
                }
                Dialog dialog = ra4Var.w0;
                Objects.requireNonNull(dialog);
                dialog.dismiss();
                return true;
            case 21:
                ((tc4) obj).s();
                return true;
            case 22:
                xd4 xd4Var = (xd4) obj;
                Bundle bundle11 = new Bundle();
                s6 s6Var3 = xd4Var.v;
                bundle11.putParcelable("TRACK_OBJECT", (Parcelable) s6Var3.r.get(xd4Var.c()));
                ((cp1) s6Var3.t).onMediaLongClick(bundle11);
                return true;
            case 23:
                SongBottomSheetDialog songBottomSheetDialog = (SongBottomSheetDialog) obj;
                Bundle bundle12 = new Bundle();
                bundle12.putParcelable("TRACK_OBJECT", songBottomSheetDialog.D0);
                ou3 ou3Var = new ou3();
                ou3Var.c0(bundle12);
                ou3Var.m0(songBottomSheetDialog.X().k(), null);
                songBottomSheetDialog.h0();
                return true;
            default:
                mi4 mi4Var = (mi4) obj;
                if (mi4Var.v.B != null) {
                    return mi4Var.t();
                }
                mi4Var.s();
                return true;
        }
    }
}
