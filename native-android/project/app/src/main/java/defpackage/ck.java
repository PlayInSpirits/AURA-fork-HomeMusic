package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.ArtistWithAlbumsID3;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ck implements Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ k03 o;

    public ck(pa r1, k03 r2) {
        this.n = 0;
        this.o = r2;
    }

    private final void a(Call r1, Throwable r2) {
    }

    private final void b(Call r1, Throwable r2) {
    }

    private final void c(Call r1, Throwable r2) {
    }

    private final void d(Call r1, Throwable r2) {
    }

    private final void e(Call r1, Throwable r2) {
    }

    @Override // retrofit2.Callback
    public final void onFailure(Call r1, Throwable r2) {
        switch(this.n) {
            case 0: goto L6;
            case 1: goto L6;
            case 2: goto L6;
            case 3: goto L6;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        this.o.i(null);
        return;
    }

    @Override // retrofit2.Callback
    public final void onResponse(Call r2, Response r3) {
        int r4 = this.n;
        k03 r1 = this.o;
        switch(r4) {
            case 0: goto L42;
            case 1: goto L34;
            case 2: goto L28;
            case 3: goto L22;
            case 4: goto L10;
            default: goto L5;
        };
    L10:
        ArrayList r5 = new ArrayList();
        if (r3.isSuccessful() == true) goto L13;
    L19:
        r1.k(r5);
        return;
    L13:
        if (r3.body() == null) goto L19;
        if (((ApiResponse) r3.body()).getSubsonicResponse().getRandomSongs() == null) goto L19;
        List<Child> r6 = ((ApiResponse) r3.body()).getSubsonicResponse().getRandomSongs().getSongs();
        if (r6 == null) goto L19;
        r5.addAll(r6);
        goto L19
    L5:
        if (r3.isSuccessful() == true) goto L7;
        return;
    L7:
        if (r3.body() == null) goto L53;
        r1.i(((ApiResponse) r3.body()).getSubsonicResponse().getOpenSubsonicExtensions());
        return;
    L53:
        return;
    L22:
        if (r3.isSuccessful() == true) goto L24;
        return;
    L24:
        if (r3.body() == null) goto L55;
        r1.k(((ApiResponse) r3.body()).getSubsonicResponse().getSong());
        return;
    L55:
        return;
    L28:
        if (r3.isSuccessful() == true) goto L30;
        return;
    L30:
        if (r3.body() == null) goto L57;
        r1.k(((ApiResponse) r3.body()).getSubsonicResponse().getSearchResult3());
        return;
    L57:
        return;
    L34:
        if (r3.isSuccessful() == true) goto L36;
        return;
    L36:
        if (r3.body() != null) goto L38;
        return;
    L38:
        if (((ApiResponse) r3.body()).getSubsonicResponse().getNewestPodcasts() == null) goto L60;
        r1.k(((ApiResponse) r3.body()).getSubsonicResponse().getNewestPodcasts().getEpisodes());
        return;
    L60:
        return;
    L42:
        if (r3.isSuccessful() == true) goto L44;
        return;
    L44:
        if (r3.body() != null) goto L46;
        return;
    L46:
        if (((ApiResponse) r3.body()).getSubsonicResponse().getArtist() == null) goto L63;
        ArtistWithAlbumsID3 r7 = ((ApiResponse) r3.body()).getSubsonicResponse().getArtist();
        List r8 = (List) r1.d();
        if (r8 == null) goto L50;
        r8.add(r7);
    L50:
        r1.k(r8);
        return;
    }

    public /* synthetic */ ck(k03 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }
}
