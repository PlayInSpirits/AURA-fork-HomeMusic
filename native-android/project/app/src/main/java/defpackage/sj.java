package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sj implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArtistPageFragment b;

    public /* synthetic */ sj(ArtistPageFragment artistPageFragment, int i) {
        this.a = i;
        this.b = artistPageFragment;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        ArtistPageFragment artistPageFragment = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    bo2.q(artistPageFragment.t0, list, 0, "artist");
                    ((au) artistPageFragment.m0.V.n).d(true);
                    wj wjVar = artistPageFragment.n0;
                    pa paVar = wjVar.c;
                    ArtistID3 artistID3 = wjVar.e;
                    paVar.getClass();
                    k03 k03Var = new k03();
                    App.f(false).c().i(artistID3.getId()).enqueue(new r20(paVar, artistID3, k03Var, 2));
                    k03Var.j(this);
                    break;
                }
                break;
            default:
                List list2 = (List) obj;
                if (list2 != null && !list2.isEmpty()) {
                    bo2.q(artistPageFragment.t0, list2, 0, "artist");
                    ((au) artistPageFragment.m0.V.n).d(true);
                    wj wjVar2 = artistPageFragment.n0;
                    pa paVar2 = wjVar2.c;
                    ArtistID3 artistID4 = wjVar2.e;
                    paVar2.getClass();
                    new xi4(2).o(artistID4.getId(), fb0.n, 30).j(this);
                    break;
                }
                break;
        }
    }
}
