package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.ArtistWithAlbumsID3;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ck implements Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ k03 o;

    public ck(pa paVar, k03 k03Var) {
        this.n = 0;
        this.o = k03Var;
    }

    private final void a(Call call, Throwable th) {
    }

    private final void b(Call call, Throwable th) {
    }

    private final void c(Call call, Throwable th) {
    }

    private final void d(Call call, Throwable th) {
    }

    private final void e(Call call, Throwable th) {
    }

    @Override // retrofit2.Callback
    public final void onFailure(Call call, Throwable th) {
        switch (this.n) {
            case 0:
            case 1:
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 4:
                break;
            default:
                this.o.i(null);
                break;
        }
    }

    @Override // retrofit2.Callback
    public final void onResponse(Call call, Response response) {
        List<Child> songs;
        int i = this.n;
        k03 k03Var = this.o;
        switch (i) {
            case 0:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getArtist() != null) {
                    ArtistWithAlbumsID3 artist = ((ApiResponse) response.body()).getSubsonicResponse().getArtist();
                    List list = (List) k03Var.d();
                    if (list != null) {
                        list.add(artist);
                    }
                    k03Var.k(list);
                    break;
                }
                break;
            case 1:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getNewestPodcasts() != null) {
                    k03Var.k(((ApiResponse) response.body()).getSubsonicResponse().getNewestPodcasts().getEpisodes());
                    break;
                }
                break;
            case 2:
                if (response.isSuccessful() && response.body() != null) {
                    k03Var.k(((ApiResponse) response.body()).getSubsonicResponse().getSearchResult3());
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (response.isSuccessful() && response.body() != null) {
                    k03Var.k(((ApiResponse) response.body()).getSubsonicResponse().getSong());
                    break;
                }
                break;
            case 4:
                ArrayList arrayList = new ArrayList();
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getRandomSongs() != null && (songs = ((ApiResponse) response.body()).getSubsonicResponse().getRandomSongs().getSongs()) != null) {
                    arrayList.addAll(songs);
                }
                k03Var.k(arrayList);
                break;
            default:
                if (response.isSuccessful() && response.body() != null) {
                    k03Var.i(((ApiResponse) response.body()).getSubsonicResponse().getOpenSubsonicExtensions());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ck(k03 k03Var, int i) {
        this.n = i;
        this.o = k03Var;
    }
}
