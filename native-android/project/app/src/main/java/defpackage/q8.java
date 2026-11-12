package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.Indexes;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q8 implements Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ k03 o;

    public /* synthetic */ q8(k03 r1, int r2) {
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
    public final void onFailure(Call r1, Throwable r2) {
        int r3 = this.n;
        k03 r0 = this.o;
        switch(r3) {
            case 0: goto L10;
            case 1: goto L10;
            case 2: goto L7;
            case 3: goto L9;
            case 4: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        r0.k(null);
        return;
    L7:
        r0.k(kb4.E(null));
        return;
    L9:
        return;
    }

    @Override // retrofit2.Callback
    public final void onResponse(Call r3, Response r4) {
        int r5 = this.n;
        Indexes r0 = null;
        k03 r2 = this.o;
        switch(r5) {
            case 0: goto L49;
            case 1: goto L41;
            case 2: goto L34;
            case 3: goto L26;
            case 4: goto L13;
            default: goto L5;
        };
    L5:
        if (r4.isSuccessful() == true) goto L7;
        return;
    L7:
        if (r4.body() != null) goto L9;
        return;
    L9:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getSongsByGenre() == null) goto L58;
        r2.k(((ApiResponse) r4.body()).getSubsonicResponse().getSongsByGenre().getSongs());
        return;
    L58:
        return;
    L13:
        if (r4.isSuccessful() == true) goto L15;
    L23:
        r2.k(null);
        return;
    L15:
        if (r4.body() == null) goto L23;
        if (((ApiResponse) r4.body()).getSubsonicResponse().getShares() == null) goto L23;
        if (((ApiResponse) r4.body()).getSubsonicResponse().getShares().getShares() == null) goto L23;
        if (((ApiResponse) r4.body()).getSubsonicResponse().getShares().getShares().get(0) == null) goto L23;
        r2.k(((ApiResponse) r4.body()).getSubsonicResponse().getShares().getShares().get(0));
        return;
    L26:
        if (r4.isSuccessful() == true) goto L28;
        return;
    L28:
        if (r4.body() != null) goto L30;
        return;
    L30:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getLyricsList() == null) goto L62;
        r2.k(((ApiResponse) r4.body()).getSubsonicResponse().getLyricsList());
        return;
    L62:
        return;
    L34:
        if (r4.isSuccessful() == true) goto L36;
    L38:
        r2.k(kb4.E(r0));
        return;
    L36:
        if (r4.body() == null) goto L38;
        r0 = ((ApiResponse) r4.body()).getSubsonicResponse().getIndexes();
        goto L38
    L41:
        if (r4.isSuccessful() == true) goto L43;
        return;
    L43:
        if (r4.body() != null) goto L45;
        return;
    L45:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getArtistInfo2() == null) goto L65;
        r2.k(((ApiResponse) r4.body()).getSubsonicResponse().getArtistInfo2());
        return;
    L65:
        return;
    L49:
        if (r4.isSuccessful() == true) goto L51;
        return;
    L51:
        if (r4.body() != null) goto L53;
        return;
    L53:
        if (((ApiResponse) r4.body()).getSubsonicResponse().getAlbumInfo() == null) goto L68;
        r2.k(((ApiResponse) r4.body()).getSubsonicResponse().getAlbumInfo());
        return;
    }
}
