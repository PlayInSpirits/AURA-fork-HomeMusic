package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ti4 extends rw3 {
    public final LinearLayoutManager a;
    public final /* synthetic */ SongListPageFragment b;

    public ti4(SongListPageFragment r1, LinearLayoutManager r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // defpackage.rw3
    public final void b(RecyclerView r9, int r10, int r11) {
        LinearLayoutManager r12 = this.a;
        int r13 = r12.v();
        int r14 = r12.D();
        int r15 = r12.P0();
        SongListPageFragment r8 = this.b;
        if (r8.r0 == true) goto L30;
        if (r15 >= 0) goto L6;
        return;
    L6:
        if ((r13 + r15) < ((r14 / 4) * 3)) goto L32;
        r8.r0 = true;
        ui4 r16 = r8.n0;
        le1 r17 = r8.v();
        int r18 = r16.o;
        String r19 = r16.e;
        switch(r19.hashCode()) {
            case -1749690986: goto L19;
            case -241049756: goto L16;
            case 1434555764: goto L14;
            case 1594154365: goto L12;
            case 2022304170: goto L10;
            default: goto L34;
        };
    L10:
        r19.equals("MEDIA_BY_YEAR");
        return;
    L12:
        r19.equals("MEDIA_BY_GENRES");
        return;
    L14:
        r19.equals("MEDIA_BY_ARTIST");
        return;
    L16:
        r19.equals("MEDIA_STARRED");
        return;
    L34:
        return;
    L19:
        if (r19.equals("MEDIA_BY_GENRE") == true) goto L21;
        return;
    L21:
        if (r16.j.d() == null) goto L23;
        int r110 = ((List) r16.j.d()).size();
    L24:
        if (r110 > 0) goto L26;
    L28:
        int r111 = r110 / r18;
        xi4 r112 = r16.c;
        String r4 = r16.g.getGenre();
        r112.getClass();
        k03 r113 = new k03();
        xc5 r0 = App.f(false).a();
        r0.getClass();
        Log.d("BrowsingClient", "getSongsByGenre()");
        ((w8) r0.p).e(((pn4) r0.o).f(), r4, 100, r111 * 100, ud3.k()).enqueue(new q8(r113, 5));
        r113.e(r17, new d8(24, r16));
        return;
    L26:
        if ((r110 % r18) == 0) goto L28;
        return;
    L23:
        r110 = 0;
        goto L24
    L32:
        return;
    }
}
