package defpackage;

import android.widget.SearchView;
import android.widget.Toast;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gj implements SearchView.OnQueryTextListener {
    public final /* synthetic */ ArtistCatalogueFragment a;

    public gj(ArtistCatalogueFragment r1) {
        this.a = r1;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String r1) {
        ArtistCatalogueFragment.h0(this.a, r1);
        return true;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String r4) {
        ArtistCatalogueFragment r3 = this.a;
        Toast.makeText(r3.Z(), "Search: " + r4, 0).show();
        ArtistCatalogueFragment.h0(r3, r4);
        return true;
    }
}
