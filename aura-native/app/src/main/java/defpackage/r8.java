package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.DecadesCallback;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class r8 implements DecadesCallback, Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ k03 o;

    public /* synthetic */ r8(k03 k03Var, int i) {
        this.n = i;
        this.o = k03Var;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        int i = this.n;
        Object obj = null;
        k03 k03Var = this.o;
        switch (i) {
            case 1:
                App.f(false).c().j().enqueue(new rf2(k03Var, obj));
                break;
            case 2:
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
            case 4:
                break;
            default:
                k03Var.i(null);
                break;
        }
    }

    @Override // com.eddyizm.tempus.interfaces.DecadesCallback
    public void onLoadYear(int i) {
        App.f(false).a().q("byYear", 1, 0, Integer.valueOf(Calendar.getInstance().get(1)), 1900).enqueue(new d34(4, new x7(i, 1, this)));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        List<Child> songs;
        List<Child> songs2;
        int i = this.n;
        List<ArtistID3> list = null;
        k03 k03Var = this.o;
        switch (i) {
            case 1:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getStarred2() != null) {
                    list = ((ApiResponse) response.body()).getSubsonicResponse().getStarred2().getArtists();
                }
                App.f(false).c().j().enqueue(new rf2(k03Var, list));
                break;
            case 2:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getPodcasts() != null) {
                    k03Var.k(((ApiResponse) response.body()).getSubsonicResponse().getPodcasts().getChannels());
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ArrayList arrayList = new ArrayList();
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getSongsByGenre() != null && (songs = ((ApiResponse) response.body()).getSubsonicResponse().getSongsByGenre().getSongs()) != null) {
                    arrayList.addAll(songs);
                }
                k03Var.k(arrayList);
                break;
            case 4:
                ArrayList arrayList2 = new ArrayList();
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getRandomSongs() != null && (songs2 = ((ApiResponse) response.body()).getSubsonicResponse().getRandomSongs().getSongs()) != null) {
                    arrayList2.addAll(songs2);
                }
                k03Var.k(arrayList2);
                break;
            default:
                if (response.isSuccessful() && response.body() != null) {
                    k03Var.i(((ApiResponse) response.body()).getSubsonicResponse());
                    break;
                } else {
                    k03Var.i(null);
                    break;
                }
        }
    }

    public /* synthetic */ r8(Object obj, k03 k03Var, int i) {
        this.n = i;
        this.o = k03Var;
    }

    private final void a(Call call, Throwable th) {
    }

    private final void b(Call call, Throwable th) {
    }

    private final void c(Call call, Throwable th) {
    }
}
