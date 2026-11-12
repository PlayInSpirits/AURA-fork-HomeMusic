package defpackage;

import android.view.View;
import android.widget.PopupMenu;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.ui.activity.MainActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class go1 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ cp1 o;

    public /* synthetic */ go1(cp1 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r10) {
        int r0 = this.n;
        int r1 = 6;
        int r4 = 5;
        int r5 = 4;
        cp1 r9 = this.o;
        switch(r0) {
            case 0: goto L40;
            case 1: goto L38;
            case 2: goto L36;
            case 3: goto L34;
            case 4: goto L32;
            case 5: goto L30;
            case 6: goto L28;
            case 7: goto L26;
            case 8: goto L24;
            case 9: goto L22;
            case 10: goto L18;
            case 11: goto L16;
            case 12: goto L14;
            case 13: goto L10;
            case 14: goto L8;
            default: goto L4;
        };
    L4:
        r9.l0.H.setVisibility(8);
        if (r9.l() == null) goto L47;
        r9.l().runOnUiThread(new zo1(r9, r4));
        return;
    L47:
        return;
    L8:
        cl4 r11 = r9.n0.k;
        r11.c.y(-1, false).f(new np0(r4, r11));
        r11.d.e(r9.v(), new ap1(r9, r5));
        return;
    L10:
        r9.l0.D.setVisibility(8);
        if (r9.l() == null) goto L48;
        r9.l().runOnUiThread(new zo1(r9, r1));
        return;
    L48:
        return;
    L14:
        new po1().m0(r9.X().k(), null);
        return;
    L16:
        bl4 r12 = r9.n0.j;
        r12.c.getClass();
        rv2.o(-1, false).f(new np0(r5, r12));
        r12.d.e(r9.v(), new ap1(r9, 2));
        return;
    L18:
        r9.l0.z.setVisibility(8);
        if (r9.l() == null) goto L49;
        r9.l().runOnUiThread(new zo1(r9, r5));
        return;
    L49:
        return;
    L22:
        r9.m0.T.m(R.id.action_homeFragment_to_playlistCatalogueFragment, b11.h("ALL", "ALL"), null);
        return;
    L24:
        r9.m0.T.m(R.id.action_homeFragment_to_albumListPageFragment, b11.h("ALBUM_RECENTLY_ADDED", "ALBUM_RECENTLY_ADDED"), null);
        return;
    L26:
        r9.m0.T.m(R.id.action_homeFragment_to_artistListPageFragment, b11.h("ARTIST_STARRED", "ARTIST_STARRED"), null);
        return;
    L28:
        r9.m0.T.m(R.id.action_homeFragment_to_albumListPageFragment, b11.h("ALBUM_STARRED", "ALBUM_STARRED"), null);
        return;
    L30:
        r9.m0.T.m(R.id.action_homeFragment_to_songListPageFragment, b11.h("MEDIA_STARRED", "MEDIA_STARRED"), null);
        return;
    L32:
        r9.n0.c.getClass();
        xi4.q(100, null, null).e(r9.v(), new xo1(r9, 20));
        return;
    L34:
        PopupMenu r2 = new PopupMenu(r9.Z(), r10);
        r2.getMenuInflater().inflate(R.menu.filter_top_songs_popup_menu, r2.getMenu());
        r2.setOnMenuItemClickListener(new v7(r1, r9));
        r2.show();
        return;
    L36:
        r9.m0.T.m(R.id.action_homeFragment_to_albumListPageFragment, b11.h("ALBUM_MOST_PLAYED", "ALBUM_MOST_PLAYED"), null);
        return;
    L38:
        r9.m0.T.m(R.id.action_homeFragment_to_albumListPageFragment, b11.h("ALBUM_RECENTLY_PLAYED", "ALBUM_RECENTLY_PLAYED"), null);
        return;
    L40:
        nc1 r13 = r9.l();
        if ((r13 instanceof MainActivity) == false) goto L43;
        MainActivity r14 = (MainActivity) r13;
    L44:
        if (r14 == null) goto L50;
        b.l(r14, null, null, WaveOrigin.HOME_CARD);
        return;
    L50:
        return;
    L43:
        r14 = null;
        goto L44
    }
}
