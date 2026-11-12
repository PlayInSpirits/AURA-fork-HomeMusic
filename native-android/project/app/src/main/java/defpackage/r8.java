package defpackage;

import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.DecadesCallback;
import com.eddyizm.tempus.subsonic.base.ApiResponse;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r8 implements DecadesCallback, Callback {
    public final /* synthetic */ int n;
    public final /* synthetic */ k03 o;

    public /* synthetic */ r8(k03 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    private final void a(Call r1, Throwable r2) {
    }

    private final void b(Call r1, Throwable r2) {
    }

    private final void c(Call r1, Throwable r2) {
    }

    @Override // retrofit2.Callback
    public void onFailure(Call r2, Throwable r3) {
        int r4 = this.n;
        Object r5 = null;
        k03 r1 = this.o;
        switch(r4) {
            case 1: goto L6;
            case 2: goto L8;
            case 3: goto L8;
            case 4: goto L8;
            default: goto L4;
        };
    L4:
        r1.i(null);
        return;
    L6:
        App.f(false).c().j().enqueue(new rf2(r1, r5));
        return;
    }

    @Override // com.eddyizm.tempus.interfaces.DecadesCallback
    public void onLoadYear(int r9) {
        x7 r0 = new x7(r9, 1, this);
        App.f(false).a().q("byYear", 1, 0, Integer.valueOf(Calendar.getInstance().get(1)), 1900).enqueue(new d34(4, r0));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call r2, Response r3) {
        int r4 = this.n;
        List<ArtistID3> r0 = null;
        k03 r1 = this.o;
        switch(r4) {
            case 1: goto L42;
            case 2: goto L34;
            case 3: goto L22;
            case 4: goto L11;
            default: goto L5;
        };
    L11:
        ArrayList r5 = new ArrayList();
        if (r3.isSuccessful() == true) goto L14;
    L20:
        r1.k(r5);
        return;
    L14:
        if (r3.body() == null) goto L20;
        if (((ApiResponse) r3.body()).getSubsonicResponse().getRandomSongs() == null) goto L20;
        List<Child> r6 = ((ApiResponse) r3.body()).getSubsonicResponse().getRandomSongs().getSongs();
        if (r6 == null) goto L20;
        r5.addAll(r6);
        goto L20
    L22:
        ArrayList r7 = new ArrayList();
        if (r3.isSuccessful() == true) goto L25;
    L31:
        r1.k(r7);
        return;
    L25:
        if (r3.body() == null) goto L31;
        if (((ApiResponse) r3.body()).getSubsonicResponse().getSongsByGenre() == null) goto L31;
        List<Child> r8 = ((ApiResponse) r3.body()).getSubsonicResponse().getSongsByGenre().getSongs();
        if (r8 == null) goto L31;
        r7.addAll(r8);
        goto L31
    L5:
        if (r3.isSuccessful() == true) goto L7;
    L9:
        r1.i(null);
        return;
    L7:
        if (r3.body() == null) goto L9;
        r1.i(((ApiResponse) r3.body()).getSubsonicResponse());
        return;
    L34:
        if (r3.isSuccessful() == true) goto L36;
        return;
    L36:
        if (r3.body() != null) goto L38;
        return;
    L38:
        if (((ApiResponse) r3.body()).getSubsonicResponse().getPodcasts() == null) goto L53;
        r1.k(((ApiResponse) r3.body()).getSubsonicResponse().getPodcasts().getChannels());
        return;
    L53:
        return;
    L42:
        if (r3.isSuccessful() == true) goto L44;
    L48:
        App.f(false).c().j().enqueue(new rf2(r1, r0));
        return;
    L44:
        if (r3.body() == null) goto L48;
        if (((ApiResponse) r3.body()).getSubsonicResponse().getStarred2() == null) goto L48;
        r0 = ((ApiResponse) r3.body()).getSubsonicResponse().getStarred2().getArtists();
        goto L48
    }

    public /* synthetic */ r8(Object r1, k03 r2, int r3) {
        this.n = r3;
        this.o = r2;
    }
}
