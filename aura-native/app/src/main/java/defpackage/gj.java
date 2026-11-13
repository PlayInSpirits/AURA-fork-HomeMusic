package defpackage;

import android.widget.SearchView;
import android.widget.Toast;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gj implements SearchView.OnQueryTextListener {
    public final /* synthetic */ ArtistCatalogueFragment a;

    public gj(ArtistCatalogueFragment artistCatalogueFragment) {
        this.a = artistCatalogueFragment;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        ArtistCatalogueFragment.h0(this.a, str);
        return true;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        ArtistCatalogueFragment artistCatalogueFragment = this.a;
        Toast.makeText(artistCatalogueFragment.Z(), "Search: " + str, 0).show();
        ArtistCatalogueFragment.h0(artistCatalogueFragment, str);
        return true;
    }
}
