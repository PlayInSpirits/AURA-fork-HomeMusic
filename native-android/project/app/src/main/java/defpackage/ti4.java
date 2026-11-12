package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ti4 extends rw3 {
    public final LinearLayoutManager a;
    public final /* synthetic */ SongListPageFragment b;

    public ti4(SongListPageFragment songListPageFragment, LinearLayoutManager linearLayoutManager) {
        this.b = songListPageFragment;
        this.a = linearLayoutManager;
    }

    @Override // defpackage.rw3
    public final void b(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager = this.a;
        int iV = linearLayoutManager.v();
        int iD = linearLayoutManager.D();
        int iP0 = linearLayoutManager.P0();
        SongListPageFragment songListPageFragment = this.b;
        if (songListPageFragment.r0 || iP0 < 0 || iV + iP0 < (iD / 4) * 3) {
            return;
        }
        songListPageFragment.r0 = true;
        ui4 ui4Var = songListPageFragment.n0;
        le1 le1VarV = songListPageFragment.v();
        int i3 = ui4Var.o;
        String str = ui4Var.e;
        switch (str.hashCode()) {
            case -1749690986:
                if (str.equals("MEDIA_BY_GENRE")) {
                    int size = ui4Var.j.d() != null ? ((List) ui4Var.j.d()).size() : 0;
                    if (size <= 0 || size % i3 == 0) {
                        int i4 = size / i3;
                        xi4 xi4Var = ui4Var.c;
                        String genre = ui4Var.g.getGenre();
                        xi4Var.getClass();
                        k03 k03Var = new k03();
                        xc5 xc5VarA = App.f(false).a();
                        xc5VarA.getClass();
                        Log.d("BrowsingClient", "getSongsByGenre()");
                        ((w8) xc5VarA.p).e(((pn4) xc5VarA.o).f(), genre, 100, i4 * 100, ud3.k()).enqueue(new q8(k03Var, 5));
                        k03Var.e(le1VarV, new d8(24, ui4Var));
                    }
                }
                break;
            case -241049756:
                str.equals("MEDIA_STARRED");
                break;
            case 1434555764:
                str.equals("MEDIA_BY_ARTIST");
                break;
            case 1594154365:
                str.equals("MEDIA_BY_GENRES");
                break;
            case 2022304170:
                str.equals("MEDIA_BY_YEAR");
                break;
        }
    }
}
