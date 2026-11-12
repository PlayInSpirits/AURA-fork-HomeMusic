package defpackage;

import android.widget.SearchView;
import com.eddyizm.tempus.ui.fragment.AlbumCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistListPageFragment;
import com.eddyizm.tempus.ui.fragment.GenreCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w7 implements SearchView.OnQueryTextListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;
    public final /* synthetic */ kc1 c;

    public /* synthetic */ w7(kc1 kc1Var, SearchView searchView, int i) {
        this.a = i;
        this.c = kc1Var;
        this.b = searchView;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        int i = this.a;
        kc1 kc1Var = this.c;
        switch (i) {
            case 0:
                ((o7) ((AlbumCatalogueFragment) kc1Var).q0.v).filter(str);
                return false;
            case 1:
                ((o7) ((ArtistListPageFragment) kc1Var).o0.v).filter(str);
                return false;
            case 2:
                ((o7) ((GenreCatalogueFragment) kc1Var).o0.u).filter(str);
                return true;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                q7 q7Var = ((PlaylistCatalogueFragment) kc1Var).o0;
                q7Var.getClass();
                new o7(q7Var, 6).filter(str);
                return false;
            case 4:
                ((PlaylistPageFragment) kc1Var).p0.C.filter(str);
                return false;
            case 5:
                ((o7) ((PodcastChannelCatalogueFragment) kc1Var).o0.u).filter(str);
                return false;
            default:
                ((SongListPageFragment) kc1Var).p0.C.filter(str);
                return false;
        }
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        int i = this.a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                searchView.clearFocus();
                return false;
            case 1:
                searchView.clearFocus();
                return false;
            case 2:
                ((o7) ((GenreCatalogueFragment) this.c).o0.u).filter(str);
                searchView.clearFocus();
                return true;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                searchView.clearFocus();
                return false;
            case 4:
                searchView.clearFocus();
                return false;
            case 5:
                searchView.clearFocus();
                return false;
            default:
                searchView.clearFocus();
                return false;
        }
    }
}
