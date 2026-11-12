package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Indexes;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q8 implements Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ k03 o;

    public /* synthetic */ q8(k03 k03Var, int i) {
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
            case 2:
                k03Var.k(kb4.E(null));
                break;
            case 4:
                k03Var.k(null);
                break;
        }
    }

    @Override // retrofit2.Callback
    public final void onResponse(Call call, Response response) {
        int i = this.n;
        Indexes indexes = null;
        k03 k03Var = this.o;
        switch (i) {
            case 0:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getAlbumInfo() != null) {
                    k03Var.k(((ApiResponse) response.body()).getSubsonicResponse().getAlbumInfo());
                    break;
                }
                break;
            case 1:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getArtistInfo2() != null) {
                    k03Var.k(((ApiResponse) response.body()).getSubsonicResponse().getArtistInfo2());
                    break;
                }
                break;
            case 2:
                if (response.isSuccessful() && response.body() != null) {
                    indexes = ((ApiResponse) response.body()).getSubsonicResponse().getIndexes();
                }
                k03Var.k(kb4.E(indexes));
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getLyricsList() != null) {
                    k03Var.k(((ApiResponse) response.body()).getSubsonicResponse().getLyricsList());
                    break;
                }
                break;
            case 4:
                if (!response.isSuccessful() || response.body() == null || ((ApiResponse) response.body()).getSubsonicResponse().getShares() == null || ((ApiResponse) response.body()).getSubsonicResponse().getShares().getShares() == null || ((ApiResponse) response.body()).getSubsonicResponse().getShares().getShares().get(0) == null) {
                    k03Var.k(null);
                } else {
                    k03Var.k(((ApiResponse) response.body()).getSubsonicResponse().getShares().getShares().get(0));
                }
                break;
            default:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getSongsByGenre() != null) {
                    k03Var.k(((ApiResponse) response.body()).getSubsonicResponse().getSongsByGenre().getSongs());
                    break;
                }
                break;
        }
    }
}
