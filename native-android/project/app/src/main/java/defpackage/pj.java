package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pj implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ ArtistPageFragment o;

    public /* synthetic */ pj(ArtistPageFragment r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r8) {
        int r9 = this.n;
        int r1 = 8;
        int r4 = 1;
        byte r5 = 0;
        ArtistPageFragment r7 = this.o;
        switch(r9) {
            case 0: goto L50;
            case 1: goto L44;
            case 2: goto L26;
            case 3: goto L24;
            case 4: goto L18;
            case 5: goto L11;
            case 6: goto L8;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        wj r10 = r7.n0;
        pa r0 = r10.c;
        ArtistID3 r11 = r10.e;
        r0.getClass();
        new xi4(2).o(r11.getId(), fb0.n, 30).e(r7.v(), new sj(r7, r4));
        return;
    L6:
        wj r12 = r7.n0;
        pa r2 = r12.c;
        ArtistID3 r13 = r12.e;
        r2.getClass();
        k03 r3 = new k03();
        App.f(false).c().i(r13.getId()).enqueue(new r20(r2, r13, r3, 2));
        r3.e(r7.v(), new sj(r7, r5));
        return;
    L8:
        r7.m0.T.o();
        return;
    L18:
        Bundle r14 = new Bundle();
        ArtistID3 r6 = r7.n0.e;
        if (r6 == null) goto L21;
        ArtistID3 r15 = r6.strippedForNav();
    L22:
        r14.putParcelable("ARTIST_OBJECT", r15);
        gb.x(r7.a0()).m(R.id.artistBottomSheetDialog, r14, null);
        return;
    L21:
        r15 = null;
        goto L22
    L24:
        Toast.makeText(r7.l(), R.string.artist_no_artist_info_toast, 0).show();
        return;
    L26:
        wj r16 = r7.n0;
        Context r17 = r7.Z();
        d34 r18 = r16.d;
        String r19 = r16.e.getId();
        if (r16.e.getStarred() == null) goto L29;
        boolean r20 = true;
    L31:
        if (n61.f(3, r19, r20) == false) goto L36;
        boolean r21 = hw.t();
        ArtistID3 r22 = r16.e;
        if (r21 == false) goto L35;
        r18.J(null, null, false, r22.getId());
        r16.e.setStarred(null);
        return;
    L35:
        String r23 = r22.getId();
        uj r24 = new uj(r16, r5);
        r18.getClass();
        d34.K(null, null, r23, r24);
        r16.e.setStarred(null);
        return;
    L36:
        boolean r25 = hw.t();
        ArtistID3 r26 = r16.e;
        if (r25 == false) goto L39;
        r18.J(null, null, true, r26.getId());
        r16.e.setStarred(new Date());
        return;
    L39:
        String r27 = r26.getId();
        uj r28 = new uj(r16, r4);
        r18.getClass();
        d34.I(null, null, r27, r28);
        r16.e.setStarred(new Date());
        if (ud3.W() == false) goto L42;
        r16.c.w(r16.e.getId(), new vj(r17, r5));
        return;
    L42:
        Log.d("ArtistSync", "Artist sync preference is disabled");
        return;
    L29:
        r20 = false;
        goto L31
    L44:
        Bundle r29 = b11.h("MEDIA_BY_ARTIST", "MEDIA_BY_ARTIST");
        ArtistID3 r30 = r7.n0.e;
        if (r30 == null) goto L47;
        ArtistID3 r31 = r30.strippedForNav();
    L48:
        r29.putParcelable("ARTIST_OBJECT", r31);
        r7.m0.T.m(R.id.action_artistPageFragment_to_songListPageFragment, r29, null);
        return;
    L47:
        r31 = null;
        goto L48
    L50:
        r7.l0.k.setVisibility(8);
        return;
    L11:
        if (r7.l0 == null) goto L52;
        boolean r32 = xa3.u("artist_display_biography", true);
        xa3.t("artist_display_biography", !r32);
        LinearLayout r33 = r7.l0.h;
        if (r32 == true) goto L16;
        r1 = 0;
    L16:
        r33.setVisibility(r1);
        return;
    }
}
