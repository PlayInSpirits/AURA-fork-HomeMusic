package defpackage;

import android.util.Log;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ArtistWithAlbumsID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.PlayQueue;
import com.eddyizm.tempus.subsonic.models.ResponseStatus;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p8 implements Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ k03 o;

    public /* synthetic */ p8(k03 k03Var, int i) {
        this.n = i;
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

    @Override // retrofit2.Callback
    public final void onFailure(Call call, Throwable th) {
        int i = this.n;
        k03 k03Var = this.o;
        switch (i) {
            case 1:
                k03Var.k(null);
                break;
            case 2:
                k03Var.k(kb4.L(null));
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                Log.e("QueueRepository", "Failed to get play queue", th);
                k03Var.k(null);
                break;
        }
    }

    @Override // retrofit2.Callback
    public final void onResponse(Call call, Response response) {
        int i = this.n;
        k03 k03Var = this.o;
        switch (i) {
            case 0:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getAlbum() != null) {
                    k03Var.k(((ApiResponse) response.body()).getSubsonicResponse().getAlbum());
                    break;
                }
                break;
            case 1:
                ApiResponse apiResponse = (ApiResponse) response.body();
                if (!response.isSuccessful() || apiResponse == null || apiResponse.getSubsonicResponse() == null) {
                    k03Var.k(null);
                } else {
                    SubsonicResponse subsonicResponse = apiResponse.getSubsonicResponse();
                    ArtistWithAlbumsID3 artist = subsonicResponse.getArtist();
                    if (ResponseStatus.OK.equals(subsonicResponse.getStatus()) && artist != null) {
                        k03Var.k(artist);
                    } else {
                        k03Var.k(null);
                    }
                }
                break;
            case 2:
                if (!response.isSuccessful() || response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse().getMusicFolders() == null) {
                    k03Var.k(kb4.L(null));
                } else {
                    k03Var.k(kb4.L(((ApiResponse) response.body()).getSubsonicResponse().getMusicFolders().getMusicFolders()));
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (!response.isSuccessful() || response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse() == null || ((ApiResponse) response.body()).getSubsonicResponse().getPlayQueue() == null) {
                    Log.d("QueueRepository", "Server returned no play queue");
                    k03Var.k(null);
                } else {
                    PlayQueue playQueue = ((ApiResponse) response.body()).getSubsonicResponse().getPlayQueue();
                    StringBuilder sb = new StringBuilder("Server returned play queue with ");
                    sb.append(playQueue.getEntries() != null ? playQueue.getEntries().size() : 0);
                    sb.append(" items");
                    Log.d("QueueRepository", sb.toString());
                    k03Var.k(playQueue);
                }
                break;
            case 4:
                ArrayList arrayList = new ArrayList();
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getSearchResult3() != null) {
                    if (((ApiResponse) response.body()).getSubsonicResponse().getSearchResult3().getArtists() != null) {
                        Iterator<ArtistID3> it = ((ApiResponse) response.body()).getSubsonicResponse().getSearchResult3().getArtists().iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getName());
                        }
                    }
                    if (((ApiResponse) response.body()).getSubsonicResponse().getSearchResult3().getAlbums() != null) {
                        Iterator<AlbumID3> it2 = ((ApiResponse) response.body()).getSubsonicResponse().getSearchResult3().getAlbums().iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().getName());
                        }
                    }
                    if (((ApiResponse) response.body()).getSubsonicResponse().getSearchResult3().getSongs() != null) {
                        Iterator<Child> it3 = ((ApiResponse) response.body()).getSubsonicResponse().getSearchResult3().getSongs().iterator();
                        while (it3.hasNext()) {
                            arrayList.add(it3.next().getTitle());
                        }
                    }
                    k03Var.k(new ArrayList(new LinkedHashSet(arrayList)));
                    break;
                }
                break;
            case 5:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getShares() != null && ((ApiResponse) response.body()).getSubsonicResponse().getShares().getShares() != null) {
                    k03Var.k(((ApiResponse) response.body()).getSubsonicResponse().getShares().getShares());
                    break;
                }
                break;
            default:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getLyrics() != null) {
                    k03Var.k(((ApiResponse) response.body()).getSubsonicResponse().getLyrics().getValue());
                    break;
                }
                break;
        }
    }
}
