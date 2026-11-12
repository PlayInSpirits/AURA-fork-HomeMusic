package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Genre;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o8 implements Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ k03 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ int q;

    public o8(int i, k03 k03Var, boolean z) {
        this.n = 1;
        this.o = k03Var;
        this.p = z;
        this.q = i;
    }

    private final void a(Call call, Throwable th) {
    }

    private final void b(Call call, Throwable th) {
    }

    private final void c(Call call, Throwable th) {
    }

    @Override // retrofit2.Callback
    public final void onFailure(Call call, Throwable th) {
        int i = this.n;
    }

    @Override // retrofit2.Callback
    public final void onResponse(Call call, Response response) {
        List<AlbumID3> albums;
        List<Child> songs;
        int i = this.n;
        int i2 = this.q;
        boolean z = this.p;
        k03 k03Var = this.o;
        switch (i) {
            case 0:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getStarred2() != null && (albums = ((ApiResponse) response.body()).getSubsonicResponse().getStarred2().getAlbums()) != null) {
                    if (!z) {
                        k03Var.k(albums);
                    } else {
                        Collections.shuffle(albums);
                        k03Var.k(albums.subList(0, Math.min(i2, albums.size())));
                    }
                    break;
                }
                break;
            case 1:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse() != null && ((ApiResponse) response.body()).getSubsonicResponse().getGenres() != null) {
                    List<Genre> genres = ((ApiResponse) response.body()).getSubsonicResponse().getGenres().getGenres();
                    if (genres == null || genres.isEmpty()) {
                        k03Var.k(Collections.EMPTY_LIST);
                    } else {
                        if (z) {
                            Collections.shuffle(genres);
                        }
                        if (i2 == -1) {
                            k03Var.k((List) genres.stream().sorted(Comparator.comparing(new m7(24))).collect(Collectors.toList()));
                        } else {
                            k03Var.k(genres.subList(0, Math.min(i2, genres.size())));
                        }
                    }
                    break;
                }
                break;
            default:
                if (response.isSuccessful() && response.body() != null && ((ApiResponse) response.body()).getSubsonicResponse().getStarred2() != null && (songs = ((ApiResponse) response.body()).getSubsonicResponse().getStarred2().getSongs()) != null) {
                    ArrayList arrayList = new ArrayList(kb4.U(songs));
                    if (!z) {
                        k03Var.k(arrayList);
                    } else {
                        Collections.shuffle(arrayList);
                        k03Var.k(arrayList.subList(0, Math.min(i2, arrayList.size())));
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o8(boolean z, k03 k03Var, int i, int i2) {
        this.n = i2;
        this.p = z;
        this.o = k03Var;
        this.q = i;
    }
}
