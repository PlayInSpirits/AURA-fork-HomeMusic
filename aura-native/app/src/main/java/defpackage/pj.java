package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import java.util.Date;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class pj implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ ArtistPageFragment o;

    public /* synthetic */ pj(ArtistPageFragment artistPageFragment, int i) {
        this.n = i;
        this.o = artistPageFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        int i2 = 1;
        byte b = 0;
        ArtistPageFragment artistPageFragment = this.o;
        switch (i) {
            case 0:
                artistPageFragment.l0.k.setVisibility(8);
                break;
            case 1:
                Bundle h = b11.h("MEDIA_BY_ARTIST", "MEDIA_BY_ARTIST");
                ArtistID3 artistID3 = artistPageFragment.n0.e;
                h.putParcelable("ARTIST_OBJECT", artistID3 != null ? artistID3.strippedForNav() : null);
                artistPageFragment.m0.T.m(R.id.action_artistPageFragment_to_songListPageFragment, h, null);
                break;
            case 2:
                wj wjVar = artistPageFragment.n0;
                Context Z = artistPageFragment.Z();
                d34 d34Var = wjVar.d;
                if (!n61.f(3, wjVar.e.getId(), wjVar.e.getStarred() != null)) {
                    boolean t = hw.t();
                    ArtistID3 artistID32 = wjVar.e;
                    if (!t) {
                        String id = artistID32.getId();
                        uj ujVar = new uj(wjVar, i2);
                        d34Var.getClass();
                        d34.I(null, null, id, ujVar);
                        wjVar.e.setStarred(new Date());
                        if (!ud3.W()) {
                            Log.d("ArtistSync", "Artist sync preference is disabled");
                            break;
                        } else {
                            wjVar.c.w(wjVar.e.getId(), new vj(Z, b));
                            break;
                        }
                    } else {
                        d34Var.J(null, null, true, artistID32.getId());
                        wjVar.e.setStarred(new Date());
                        break;
                    }
                } else {
                    boolean t2 = hw.t();
                    ArtistID3 artistID33 = wjVar.e;
                    if (!t2) {
                        String id2 = artistID33.getId();
                        uj ujVar2 = new uj(wjVar, b);
                        d34Var.getClass();
                        d34.K(null, null, id2, ujVar2);
                        wjVar.e.setStarred(null);
                        break;
                    } else {
                        d34Var.J(null, null, false, artistID33.getId());
                        wjVar.e.setStarred(null);
                        break;
                    }
                }
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                Toast.makeText(artistPageFragment.e(), R.string.artist_no_artist_info_toast, 0).show();
                break;
            case 4:
                Bundle bundle = new Bundle();
                ArtistID3 artistID34 = artistPageFragment.n0.e;
                bundle.putParcelable("ARTIST_OBJECT", artistID34 != null ? artistID34.strippedForNav() : null);
                gb.x(artistPageFragment.a0()).m(R.id.artistBottomSheetDialog, bundle, null);
                break;
            case 5:
                if (artistPageFragment.l0 != null) {
                    boolean u = xa3.u("artist_display_biography", true);
                    xa3.t("artist_display_biography", !u);
                    artistPageFragment.l0.h.setVisibility(u ? 8 : 0);
                    break;
                }
                break;
            case 6:
                artistPageFragment.m0.T.o();
                break;
            case 7:
                wj wjVar2 = artistPageFragment.n0;
                pa paVar = wjVar2.c;
                ArtistID3 artistID35 = wjVar2.e;
                paVar.getClass();
                k03 k03Var = new k03();
                App.f(false).c().i(artistID35.getId()).enqueue(new r20(paVar, artistID35, k03Var, 2));
                k03Var.e(artistPageFragment.v(), new sj(artistPageFragment, b));
                break;
            default:
                wj wjVar3 = artistPageFragment.n0;
                pa paVar2 = wjVar3.c;
                ArtistID3 artistID36 = wjVar3.e;
                paVar2.getClass();
                new xi4(2).o(artistID36.getId(), fb0.n, 30).e(artistPageFragment.v(), new sj(artistPageFragment, i2));
                break;
        }
    }
}
