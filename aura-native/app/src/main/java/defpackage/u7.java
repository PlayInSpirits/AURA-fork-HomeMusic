package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.eddyizm.tempus.ui.fragment.AlbumCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.AlbumListPageFragment;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistListPageFragment;
import com.eddyizm.tempus.ui.fragment.FilterFragment;
import com.eddyizm.tempus.ui.fragment.GenreCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class u7 implements af {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ u7(int i, kc1 kc1Var) {
        this.a = i;
        this.b = kc1Var;
    }

    @Override // defpackage.af
    public final void a(int i) {
        int i2 = this.a;
        kc1 kc1Var = this.b;
        switch (i2) {
            case 0:
                AlbumCatalogueFragment albumCatalogueFragment = (AlbumCatalogueFragment) kc1Var;
                lv4 lv4Var = albumCatalogueFragment.l0;
                if (lv4Var != null) {
                    int height = ((ConstraintLayout) lv4Var.o).getHeight() + i;
                    MaterialToolbar materialToolbar = (MaterialToolbar) albumCatalogueFragment.l0.t;
                    WeakHashMap weakHashMap = j65.a;
                    int minimumHeight = materialToolbar.getMinimumHeight() * 2;
                    lv4 lv4Var2 = albumCatalogueFragment.l0;
                    if (height >= minimumHeight) {
                        ((MaterialToolbar) lv4Var2.t).setTitle(R.string.empty_string);
                        break;
                    } else {
                        ((MaterialToolbar) lv4Var2.t).setTitle(R.string.album_catalogue_title);
                        break;
                    }
                }
                break;
            case 1:
                AlbumListPageFragment albumListPageFragment = (AlbumListPageFragment) kc1Var;
                oc1 oc1Var = albumListPageFragment.l0;
                if (oc1Var != null) {
                    int height2 = oc1Var.b.getHeight() + i;
                    MaterialToolbar materialToolbar2 = albumListPageFragment.l0.g;
                    WeakHashMap weakHashMap2 = j65.a;
                    int minimumHeight2 = materialToolbar2.getMinimumHeight() * 2;
                    oc1 oc1Var2 = albumListPageFragment.l0;
                    if (height2 >= minimumHeight2) {
                        oc1Var2.g.setTitle(R.string.empty_string);
                        break;
                    } else {
                        oc1Var2.g.setTitle(R.string.album_list_page_title);
                        break;
                    }
                }
                break;
            case 2:
                ArtistCatalogueFragment artistCatalogueFragment = (ArtistCatalogueFragment) kc1Var;
                rc1 rc1Var = artistCatalogueFragment.l0;
                if (rc1Var != null) {
                    int height3 = rc1Var.a.getHeight() + i;
                    MaterialToolbar materialToolbar3 = artistCatalogueFragment.l0.e;
                    WeakHashMap weakHashMap3 = j65.a;
                    int minimumHeight3 = materialToolbar3.getMinimumHeight() * 2;
                    rc1 rc1Var2 = artistCatalogueFragment.l0;
                    if (height3 >= minimumHeight3) {
                        rc1Var2.e.setTitle(R.string.empty_string);
                        break;
                    } else {
                        rc1Var2.e.setTitle(R.string.artist_catalogue_title);
                        break;
                    }
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ArtistListPageFragment artistListPageFragment = (ArtistListPageFragment) kc1Var;
                oc1 oc1Var3 = artistListPageFragment.l0;
                if (oc1Var3 != null) {
                    int height4 = oc1Var3.b.getHeight() + i;
                    MaterialToolbar materialToolbar4 = artistListPageFragment.l0.g;
                    WeakHashMap weakHashMap4 = j65.a;
                    int minimumHeight4 = materialToolbar4.getMinimumHeight() * 2;
                    oc1 oc1Var4 = artistListPageFragment.l0;
                    if (height4 >= minimumHeight4) {
                        oc1Var4.g.setTitle(R.string.empty_string);
                        break;
                    } else {
                        oc1Var4.g.setTitle(R.string.artist_list_page_title);
                        break;
                    }
                }
                break;
            case 4:
                FilterFragment filterFragment = (FilterFragment) kc1Var;
                lv4 lv4Var3 = filterFragment.m0;
                if (lv4Var3 != null) {
                    int height5 = ((ConstraintLayout) lv4Var3.r).getHeight() + i;
                    MaterialToolbar materialToolbar5 = (MaterialToolbar) filterFragment.m0.t;
                    WeakHashMap weakHashMap5 = j65.a;
                    int minimumHeight5 = materialToolbar5.getMinimumHeight() * 2;
                    lv4 lv4Var4 = filterFragment.m0;
                    if (height5 >= minimumHeight5) {
                        ((MaterialToolbar) lv4Var4.t).setTitle(R.string.empty_string);
                        break;
                    } else {
                        ((MaterialToolbar) lv4Var4.t).setTitle(R.string.filter_title);
                        break;
                    }
                }
                break;
            case 5:
                GenreCatalogueFragment genreCatalogueFragment = (GenreCatalogueFragment) kc1Var;
                ml3 ml3Var = genreCatalogueFragment.l0;
                if (ml3Var != null) {
                    int height6 = ((ConstraintLayout) ml3Var.d).getHeight() + i;
                    MaterialToolbar materialToolbar6 = (MaterialToolbar) genreCatalogueFragment.l0.f;
                    WeakHashMap weakHashMap6 = j65.a;
                    int minimumHeight6 = materialToolbar6.getMinimumHeight() * 2;
                    ml3 ml3Var2 = genreCatalogueFragment.l0;
                    if (height6 >= minimumHeight6) {
                        ((MaterialToolbar) ml3Var2.f).setTitle(R.string.empty_string);
                        break;
                    } else {
                        ((MaterialToolbar) ml3Var2.f).setTitle(R.string.genre_catalogue_title);
                        break;
                    }
                }
                break;
            case 6:
                IndexFragment indexFragment = (IndexFragment) kc1Var;
                ey eyVar = indexFragment.l0;
                if (eyVar != null) {
                    int height7 = ((ConstraintLayout) eyVar.e).getHeight() + i;
                    MaterialToolbar materialToolbar7 = (MaterialToolbar) indexFragment.l0.h;
                    WeakHashMap weakHashMap7 = j65.a;
                    int minimumHeight7 = materialToolbar7.getMinimumHeight() * 2;
                    ey eyVar2 = indexFragment.l0;
                    if (height7 >= minimumHeight7) {
                        ((MaterialToolbar) eyVar2.h).setTitle(R.string.empty_string);
                        break;
                    } else {
                        MaterialToolbar materialToolbar8 = (MaterialToolbar) eyVar2.h;
                        MusicFolder musicFolder = indexFragment.n0.d;
                        materialToolbar8.setTitle(musicFolder != null ? musicFolder.getName() : "");
                        break;
                    }
                }
                break;
            case 7:
                LoginFragment loginFragment = (LoginFragment) kc1Var;
                ml3 ml3Var3 = loginFragment.l0;
                if (ml3Var3 != null) {
                    int height8 = ((ConstraintLayout) ml3Var3.d).getHeight() + i;
                    MaterialToolbar materialToolbar9 = (MaterialToolbar) loginFragment.l0.f;
                    WeakHashMap weakHashMap8 = j65.a;
                    int minimumHeight8 = materialToolbar9.getMinimumHeight() * 2;
                    ml3 ml3Var4 = loginFragment.l0;
                    if (height8 >= minimumHeight8) {
                        ((MaterialToolbar) ml3Var4.f).setTitle(R.string.empty_string);
                        break;
                    } else {
                        ((MaterialToolbar) ml3Var4.f).setTitle(R.string.login_title);
                        break;
                    }
                }
                break;
            case 8:
                PlaylistCatalogueFragment playlistCatalogueFragment = (PlaylistCatalogueFragment) kc1Var;
                rc1 rc1Var3 = playlistCatalogueFragment.l0;
                if (rc1Var3 != null) {
                    int height9 = rc1Var3.a.getHeight() + i;
                    MaterialToolbar materialToolbar10 = playlistCatalogueFragment.l0.e;
                    WeakHashMap weakHashMap9 = j65.a;
                    int minimumHeight9 = materialToolbar10.getMinimumHeight() * 2;
                    rc1 rc1Var4 = playlistCatalogueFragment.l0;
                    if (height9 >= minimumHeight9) {
                        rc1Var4.e.setTitle(R.string.empty_string);
                        break;
                    } else {
                        rc1Var4.e.setTitle(R.string.playlist_catalogue_title);
                        break;
                    }
                }
                break;
            case 9:
                PodcastChannelCatalogueFragment podcastChannelCatalogueFragment = (PodcastChannelCatalogueFragment) kc1Var;
                bq4 bq4Var = podcastChannelCatalogueFragment.l0;
                if (bq4Var != null) {
                    int height10 = ((ConstraintLayout) bq4Var.p).getHeight() + i;
                    MaterialToolbar materialToolbar11 = (MaterialToolbar) podcastChannelCatalogueFragment.l0.q;
                    WeakHashMap weakHashMap10 = j65.a;
                    int minimumHeight10 = materialToolbar11.getMinimumHeight() * 2;
                    bq4 bq4Var2 = podcastChannelCatalogueFragment.l0;
                    if (height10 >= minimumHeight10) {
                        ((MaterialToolbar) bq4Var2.q).setTitle(R.string.empty_string);
                        break;
                    } else {
                        ((MaterialToolbar) bq4Var2.q).setTitle(R.string.podcast_channel_catalogue_title);
                        break;
                    }
                }
                break;
            default:
                SongListPageFragment songListPageFragment = (SongListPageFragment) kc1Var;
                up0 up0Var = songListPageFragment.l0;
                if (up0Var != null) {
                    int height11 = ((ConstraintLayout) up0Var.a).getHeight() + i;
                    MaterialToolbar materialToolbar12 = (MaterialToolbar) songListPageFragment.l0.i;
                    WeakHashMap weakHashMap11 = j65.a;
                    int minimumHeight11 = materialToolbar12.getMinimumHeight() * 2;
                    up0 up0Var2 = songListPageFragment.l0;
                    if (height11 >= minimumHeight11) {
                        ((MaterialToolbar) up0Var2.i).setTitle(R.string.empty_string);
                        break;
                    } else {
                        ((MaterialToolbar) up0Var2.i).setTitle(songListPageFragment.n0.f);
                        break;
                    }
                }
                break;
        }
    }
}
