package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y6 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ AlbumBottomSheetDialog o;

    public /* synthetic */ y6(AlbumBottomSheetDialog r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r8) {
        int r9 = this.n;
        int r0 = 2;
        int r1 = 1;
        int r2 = 0;
        AlbumBottomSheetDialog r7 = this.o;
        switch(r9) {
            case 0: goto L45;
            case 1: goto L43;
            case 2: goto L37;
            case 3: goto L20;
            case 4: goto L12;
            case 5: goto L10;
            case 6: goto L8;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        r7.C0.c().e(r7.v(), new b7(r7, r0));
        return;
    L6:
        r7.C0.c().e(r7.v(), new b7(r7, 5));
        return;
    L8:
        r7.C0.c().e(r7.v(), new b7(r7, r2));
        return;
    L10:
        rv2.l(r7.D0.getId()).e(r7.v(), new b7(r7, 3));
        return;
    L12:
        MainActivity r10 = (MainActivity) r7.l();
        if (r10 == null) goto L47;
        bl2 r3 = r10.P;
        if (r3 == null) goto L48;
        r7.H0 = true;
        Toast.makeText(r7.Z(), R.string.bottom_sheet_generating_instant_mix, 0).show();
        j7 r4 = r7.C0;
        AlbumID3 r5 = r7.D0;
        k03 r6 = r4.h;
        r6.k(Collections.EMPTY_LIST);
        r4.c.getClass();
        new xi4(2).o(r5.getId(), fb0.o, 30).e(r10, new g7(r6, 0));
        r6.e(r10, new z6(r7, r3, r10, r2));
        return;
    L48:
        return;
    L47:
        return;
    L20:
        j7 r11 = r7.C0;
        Context r12 = r7.Z();
        d34 r13 = r11.e;
        String r14 = r11.g.getId();
        if (r11.g.getStarred() == null) goto L23;
        boolean r15 = true;
    L25:
        if (n61.f(2, r14, r15) == false) goto L30;
        boolean r16 = hw.t();
        AlbumID3 r17 = r11.g;
        if (r16 == false) goto L29;
        r13.J(null, r17.getId(), false, null);
        r11.g.setStarred(null);
        return;
    L29:
        String r18 = r17.getId();
        h7 r19 = new h7(r11, 0);
        r13.getClass();
        d34.K(null, r18, null, r19);
        r11.g.setStarred(null);
        return;
    L30:
        boolean r20 = hw.t();
        AlbumID3 r21 = r11.g;
        if (r20 == false) goto L33;
        r13.J(null, r21.getId(), true, null);
        r11.g.setStarred(new Date());
        return;
    L33:
        String r22 = r21.getId();
        h7 r23 = new h7(r11, 1);
        r13.getClass();
        d34.I(null, r22, null, r23);
        r11.g.setStarred(new Date());
        App.b().getClass();
        if (App.c().getBoolean("sync_starred_albums_for_offline_use", false) == false) goto L52;
        k03 r24 = rv2.l(r11.g.getId());
        r24.f(new i7(r12, r24, r2));
        return;
    L52:
        return;
    L23:
        r15 = false;
        goto L25
    L37:
        String r25 = ud3.o();
        List r26 = r7.F0;
        if (r25 != null) goto L40;
        au0.w(r7.Z()).f(r7.G0, (List) r26.stream().map(new hu3(6)).collect(Collectors.toList()));
    L41:
        r7.h0();
        return;
    L40:
        r26.forEach(new e7());
        goto L41
    L43:
        j7 r27 = r7.C0;
        hh3 r28 = r27.f;
        String r29 = r27.g.getId();
        String r30 = r27.g.getName();
        r28.getClass();
        hh3.h(r29, r30).e(r7.v(), new b7(r7, r1));
        return;
    L45:
        j7 r31 = r7.C0;
        pa r32 = r31.d;
        String r33 = r31.g.getArtistId();
        r32.getClass();
        pa.v(r33).e(r7.v(), new b7(r7, 4));
    }
}
