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
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p8 implements Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ k03 o;

    public /* synthetic */ p8(k03 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    private final void a(Call r1, Throwable r2) {
    }

    private final void b(Call r1, Throwable r2) {
    }

    private final void c(Call r1, Throwable r2) {
    }

    private final void d(Call r1, Throwable r2) {
    }

    @Override // retrofit2.Callback
    public final void onFailure(Call r3, Throwable r4) {
        int r5 = this.n;
        k03 r2 = this.o;
        switch(r5) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            case 3: goto L5;
            case 4: goto L4;
            case 5: goto L4;
            default: goto L4;
        };
    L4:
        return;
    L5:
        Log.e("QueueRepository", "Failed to get play queue", r4);
        r2.k(null);
        return;
    L7:
        r2.k(kb4.L(null));
        return;
    L9:
        r2.k(null);
        return;
    }

    @Override // retrofit2.Callback
    public final void onResponse(Call r3, Response r4) {
        int r5 = this.n;
        k03 r2 = this.o;
        switch(r5) {
            case 0: goto L85;
            case 1: goto L72;
            case 2: goto L64;
            case 3: goto L49;
            case 4: goto L22;
            case 5: goto L13;
            default: goto L5;
        };
    L22:
        ArrayList r6 = new ArrayList();
        if (r4.isSuccessful() == true) goto L25;
        return;
    L25:
        if (r4.body() != null) goto L27;
        return;
    L27:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getSearchResult3() != null) goto L29;
        return;
    L29:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getSearchResult3().getArtists() == null) goto L35;
        Iterator<ArtistID3> r0 = ((ApiResponse) r4.body()).getSubsonicResponse().getSearchResult3().getArtists().iterator();
    L32:
        if (r0.hasNext() == false) goto L35;
        r6.add(r0.next().getName());
    L35:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getSearchResult3().getAlbums() == null) goto L41;
        Iterator<AlbumID3> r1 = ((ApiResponse) r4.body()).getSubsonicResponse().getSearchResult3().getAlbums().iterator();
    L38:
        if (r1.hasNext() == false) goto L41;
        r6.add(r1.next().getName());
    L41:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getSearchResult3().getSongs() == null) goto L46;
        Iterator<Child> r7 = ((ApiResponse) r4.body()).getSubsonicResponse().getSearchResult3().getSongs().iterator();
    L44:
        if (r7.hasNext() == false) goto L46;
        r6.add(r7.next().getTitle());
    L46:
        r2.k(new ArrayList(new LinkedHashSet(r6)));
        return;
    L72:
        ApiResponse r8 = (ApiResponse) r4.body();
        if (r4.isSuccessful() == false) goto L82;
        if (r8 == null) goto L82;
        if (r8.getSubsonicResponse() == null) goto L82;
        SubsonicResponse r9 = r8.getSubsonicResponse();
        ArtistWithAlbumsID3 r10 = r9.getArtist();
        if (ResponseStatus.OK.equals(r9.getStatus()) == false) goto L81;
        if (r10 == null) goto L81;
        r2.k(r10);
        return;
    L81:
        r2.k(null);
        return;
    L82:
        r2.k(null);
        return;
    L5:
        if (r4.isSuccessful() == true) goto L7;
        return;
    L7:
        if (r4.body() != null) goto L9;
        return;
    L9:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getLyrics() == null) goto L97;
        r2.k(((ApiResponse) r4.body()).getSubsonicResponse().getLyrics().getValue());
        return;
    L97:
        return;
    L13:
        if (r4.isSuccessful() == true) goto L15;
        return;
    L15:
        if (r4.body() != null) goto L17;
        return;
    L17:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getShares() != null) goto L19;
        return;
    L19:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getShares().getShares() == null) goto L101;
        r2.k(((ApiResponse) r4.body()).getSubsonicResponse().getShares().getShares());
        return;
    L101:
        return;
    L49:
        if (r4.isSuccessful() == true) goto L51;
    L61:
        Log.d("QueueRepository", "Server returned no play queue");
        r2.k(null);
        return;
    L51:
        if (r4.body() == null) goto L61;
        if (((ApiResponse) r4.body()).getSubsonicResponse() == null) goto L61;
        if (((ApiResponse) r4.body()).getSubsonicResponse().getPlayQueue() == null) goto L61;
        PlayQueue r11 = ((ApiResponse) r4.body()).getSubsonicResponse().getPlayQueue();
        StringBuilder r12 = new StringBuilder("Server returned play queue with ");
        if (r11.getEntries() == null) goto L59;
        int r13 = r11.getEntries().size();
    L60:
        r12.append(r13);
        r12.append(" items");
        Log.d("QueueRepository", r12.toString());
        r2.k(r11);
        return;
    L59:
        r13 = 0;
        goto L60
    L64:
        if (r4.isSuccessful() == true) goto L66;
    L70:
        r2.k(kb4.L(null));
        return;
    L66:
        if (r4.body() == null) goto L70;
        if (((ApiResponse) r4.body()).getSubsonicResponse().getMusicFolders() == null) goto L70;
        r2.k(kb4.L(((ApiResponse) r4.body()).getSubsonicResponse().getMusicFolders().getMusicFolders()));
        return;
    L85:
        if (r4.isSuccessful() == true) goto L87;
        return;
    L87:
        if (r4.body() != null) goto L89;
        return;
    L89:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getAlbum() == null) goto L111;
        r2.k(((ApiResponse) r4.body()).getSubsonicResponse().getAlbum());
        return;
    }
}
