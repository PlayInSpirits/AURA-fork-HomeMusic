package defpackage;

import android.widget.SearchView;
import com.eddyizm.tempus.ui.fragment.AlbumCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistListPageFragment;
import com.eddyizm.tempus.ui.fragment.GenreCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w7 implements SearchView.OnQueryTextListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;
    public final /* synthetic */ kc1 c;

    public /* synthetic */ w7(kc1 r1, SearchView r2, int r3) {
        this.a = r3;
        this.c = r1;
        this.b = r2;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String r4) {
        int r0 = this.a;
        kc1 r3 = this.c;
        switch(r0) {
            case 0: goto L16;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        ((SongListPageFragment) r3).p0.C.filter(r4);
        return false;
    L6:
        ((o7) ((PodcastChannelCatalogueFragment) r3).o0.u).filter(r4);
        return false;
    L8:
        ((PlaylistPageFragment) r3).p0.C.filter(r4);
        return false;
    L10:
        q7 r5 = ((PlaylistCatalogueFragment) r3).o0;
        r5.getClass();
        new o7(r5, 6).filter(r4);
        return false;
    L12:
        ((o7) ((GenreCatalogueFragment) r3).o0.u).filter(r4);
        return true;
    L14:
        ((o7) ((ArtistListPageFragment) r3).o0.v).filter(r4);
        return false;
    L16:
        ((o7) ((AlbumCatalogueFragment) r3).q0.v).filter(r4);
        return false;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String r4) {
        int r0 = this.a;
        SearchView r2 = this.b;
        switch(r0) {
            case 0: goto L16;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        r2.clearFocus();
        return false;
    L6:
        r2.clearFocus();
        return false;
    L8:
        r2.clearFocus();
        return false;
    L10:
        r2.clearFocus();
        return false;
    L12:
        ((o7) ((GenreCatalogueFragment) this.c).o0.u).filter(r4);
        r2.clearFocus();
        return true;
    L14:
        r2.clearFocus();
        return false;
    L16:
        r2.clearFocus();
        return false;
    }
}
