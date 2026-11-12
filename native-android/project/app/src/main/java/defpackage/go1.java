package defpackage;

import android.view.View;
import android.widget.PopupMenu;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.ui.activity.MainActivity;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class go1 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ cp1 o;

    public /* synthetic */ go1(cp1 cp1Var, int i) {
        this.n = i;
        this.o = cp1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        cp1 cp1Var = this.o;
        switch (i) {
            case 0:
                nc1 nc1VarE = cp1Var.e();
                MainActivity mainActivity = nc1VarE instanceof MainActivity ? (MainActivity) nc1VarE : null;
                if (mainActivity != null) {
                    b.l(mainActivity, null, null, WaveOrigin.HOME_CARD);
                }
                break;
            case 1:
                cp1Var.m0.T.m(R.id.action_homeFragment_to_albumListPageFragment, b11.h("ALBUM_RECENTLY_PLAYED", "ALBUM_RECENTLY_PLAYED"), null);
                break;
            case 2:
                cp1Var.m0.T.m(R.id.action_homeFragment_to_albumListPageFragment, b11.h("ALBUM_MOST_PLAYED", "ALBUM_MOST_PLAYED"), null);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                PopupMenu popupMenu = new PopupMenu(cp1Var.Z(), view);
                popupMenu.getMenuInflater().inflate(R.menu.filter_top_songs_popup_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new v7(i2, cp1Var));
                popupMenu.show();
                break;
            case 4:
                cp1Var.n0.c.getClass();
                xi4.q(100, null, null).e(cp1Var.v(), new xo1(cp1Var, 20));
                break;
            case 5:
                cp1Var.m0.T.m(R.id.action_homeFragment_to_songListPageFragment, b11.h("MEDIA_STARRED", "MEDIA_STARRED"), null);
                break;
            case 6:
                cp1Var.m0.T.m(R.id.action_homeFragment_to_albumListPageFragment, b11.h("ALBUM_STARRED", "ALBUM_STARRED"), null);
                break;
            case 7:
                cp1Var.m0.T.m(R.id.action_homeFragment_to_artistListPageFragment, b11.h("ARTIST_STARRED", "ARTIST_STARRED"), null);
                break;
            case 8:
                cp1Var.m0.T.m(R.id.action_homeFragment_to_albumListPageFragment, b11.h("ALBUM_RECENTLY_ADDED", "ALBUM_RECENTLY_ADDED"), null);
                break;
            case 9:
                cp1Var.m0.T.m(R.id.action_homeFragment_to_playlistCatalogueFragment, b11.h("ALL", "ALL"), null);
                break;
            case 10:
                cp1Var.l0.z.setVisibility(8);
                if (cp1Var.e() != null) {
                    cp1Var.e().runOnUiThread(new zo1(cp1Var, i4));
                }
                break;
            case 11:
                bl4 bl4Var = cp1Var.n0.j;
                bl4Var.c.getClass();
                rv2.o(-1, false).f(new np0(i4, bl4Var));
                bl4Var.d.e(cp1Var.v(), new ap1(cp1Var, 2));
                break;
            case 12:
                new po1().m0(cp1Var.X().k(), null);
                break;
            case 13:
                cp1Var.l0.D.setVisibility(8);
                if (cp1Var.e() != null) {
                    cp1Var.e().runOnUiThread(new zo1(cp1Var, i2));
                }
                break;
            case 14:
                cl4 cl4Var = cp1Var.n0.k;
                cl4Var.c.y(-1, false).f(new np0(i3, cl4Var));
                cl4Var.d.e(cp1Var.v(), new ap1(cp1Var, i4));
                break;
            default:
                cp1Var.l0.H.setVisibility(8);
                if (cp1Var.e() != null) {
                    cp1Var.e().runOnUiThread(new zo1(cp1Var, i3));
                }
                break;
        }
    }
}
