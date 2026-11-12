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

    public o8(int r2, k03 r3, boolean r4) {
        this.n = 1;
        this.o = r3;
        this.p = r4;
        this.q = r2;
    }

    private final void a(Call r1, Throwable r2) {
    }

    private final void b(Call r1, Throwable r2) {
    }

    private final void c(Call r1, Throwable r2) {
    }

    @Override // retrofit2.Callback
    public final void onFailure(Call r1, Throwable r2) {
        int r0 = this.n;
    }

    @Override // retrofit2.Callback
    public final void onResponse(Call r4, Response r5) {
        int r6 = this.n;
        int r0 = this.q;
        boolean r2 = this.p;
        k03 r3 = this.o;
        switch(r6) {
            case 0: goto L39;
            case 1: goto L18;
            default: goto L5;
        };
    L5:
        if (r5.isSuccessful() == true) goto L7;
        return;
    L7:
        if (r5.body() != null) goto L9;
        return;
    L9:
        if (((ApiResponse) r5.body()).getSubsonicResponse().getStarred2() == null) goto L52;
        List<Child> r7 = ((ApiResponse) r5.body()).getSubsonicResponse().getStarred2().getSongs();
        if (r7 == null) goto L53;
        ArrayList r8 = new ArrayList(kb4.U(r7));
        if (r2 == true) goto L15;
        r3.k(r8);
        return;
    L15:
        Collections.shuffle(r8);
        r3.k(r8.subList(0, Math.min(r0, r8.size())));
        return;
    L53:
        return;
    L52:
        return;
    L18:
        if (r5.isSuccessful() == true) goto L20;
        return;
    L20:
        if (r5.body() != null) goto L22;
        return;
    L22:
        if (((ApiResponse) r5.body()).getSubsonicResponse() != null) goto L24;
        return;
    L24:
        if (((ApiResponse) r5.body()).getSubsonicResponse().getGenres() == null) goto L58;
        List<Genre> r9 = ((ApiResponse) r5.body()).getSubsonicResponse().getGenres().getGenres();
        if (r9 != null) goto L28;
    L36:
        r3.k(Collections.EMPTY_LIST);
        return;
    L28:
        if (r9.isEmpty() == true) goto L36;
        if (r2 == false) goto L33;
        Collections.shuffle(r9);
    L33:
        if (r0 == (-1)) goto L35;
        r3.k(r9.subList(0, Math.min(r0, r9.size())));
        return;
    L35:
        r3.k((List) r9.stream().sorted(Comparator.comparing(new m7(24))).collect(Collectors.toList()));
        return;
    L58:
        return;
    L39:
        if (r5.isSuccessful() == true) goto L41;
        return;
    L41:
        if (r5.body() != null) goto L43;
        return;
    L43:
        if (((ApiResponse) r5.body()).getSubsonicResponse().getStarred2() == null) goto L63;
        List<AlbumID3> r10 = ((ApiResponse) r5.body()).getSubsonicResponse().getStarred2().getAlbums();
        if (r10 == null) goto L64;
        if (r2 == false) goto L48;
        Collections.shuffle(r10);
        r3.k(r10.subList(0, Math.min(r0, r10.size())));
        return;
    L48:
        r3.k(r10);
        return;
    L64:
        return;
    }

    public /* synthetic */ o8(boolean r1, k03 r2, int r3, int r4) {
        this.n = r4;
        this.p = r1;
        this.o = r2;
        this.q = r3;
    }
}
