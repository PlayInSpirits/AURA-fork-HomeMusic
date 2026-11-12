package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.SubsonicResponse;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.AlbumBottomSheetDialog;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.ArtistBottomSheetDialog;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.PlaylistRowBottomSheetDialog;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z6 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ KeyEvent.Callback c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z6(MainActivity r2, k03 r3, String r4) {
        this.a = 2;
        this.c = r2;
        this.d = r3;
        this.b = r4;
    }

    @Override // defpackage.a83
    public final void b(Object r6) {
        int r0 = this.a;
        int r2 = 0;
        KeyEvent.Callback r3 = this.c;
        Object r4 = this.b;
        Object r5 = this.d;
        switch(r0) {
            case 0: goto L64;
            case 1: goto L49;
            case 2: goto L32;
            case 3: goto L22;
            default: goto L4;
        };
    L4:
        SongBottomSheetDialog r7 = (SongBottomSheetDialog) r5;
        ic2 r8 = (ic2) r4;
        MainActivity r9 = (MainActivity) r3;
        List r10 = (List) r6;
        if (r10 != null) goto L7;
        return;
    L7:
        if (r10.isEmpty() == false) goto L10;
        return;
    L10:
        if (r7.l() == null) goto L83;
        e03.o(r10);
        if (r7.N0 == false) goto L20;
        r7.N0 = false;
        bo2.o(r8, r10, 0);
        if (r7.E0 == true) goto L18;
        ((au) r9.V.n).d(true);
    L18:
        if (r7.y() == false) goto L80;
        r7.h0();
        return;
    L80:
        return;
    L20:
        bo2.e(r8, r10, true);
        return;
    L83:
        return;
    L22:
        View r11 = (View) r4;
        View r12 = (View) r3;
        boolean r13 = ((List) r6).stream().anyMatch(new tj(5, (PlaylistRowBottomSheetDialog) r5));
        if (r13 == false) goto L25;
        int r1 = 8;
    L26:
        r11.setVisibility(r1);
        if (r13 == true) goto L30;
        r2 = 8;
    L30:
        r12.setVisibility(r2);
        return;
    L25:
        r1 = 0;
        goto L26
    L32:
        MainActivity r14 = (MainActivity) r3;
        String r15 = (String) r4;
        SubsonicResponse r16 = (SubsonicResponse) r6;
        if (((k03) r5) != r14.Q) goto L36;
        r2 = 1;
    L36:
        if (r2 == 0) goto L38;
        r14.Q = null;
    L38:
        if (r2 == 0) goto L44;
        if (r16 == null) goto L44;
        if (r15.equals(ud3.v()) == false) goto L44;
        ud3.m0(r15);
        App.p = App.d();
        ra0.a();
        r14.d().a();
        v23 r17 = (v23) ((ss0) r14.U.o).q;
        int r18 = r17.g().u;
        r17.p(r18, true);
        r17.m(r18, null, null);
        return;
    L44:
        ra0.a();
        if (r2 == 0) goto L85;
        if (r16 != null) goto L86;
        App.b().getClass();
        App.c().edit().putLong("next_server_switch", System.currentTimeMillis()).apply();
        r14.G();
        return;
    L86:
        return;
    L85:
        return;
    L49:
        ArtistBottomSheetDialog r19 = (ArtistBottomSheetDialog) r5;
        ic2 r20 = (ic2) r4;
        MainActivity r21 = (MainActivity) r3;
        List r22 = (List) r6;
        if (r22 != null) goto L52;
        return;
    L52:
        if (r22.isEmpty() == false) goto L55;
        return;
    L55:
        if (r19.l() == null) goto L91;
        e03.o(r22);
        if (r19.E0 == false) goto L62;
        r19.E0 = false;
        bo2.q(r20, r22, 0, "artist");
        ((au) r21.V.n).d(true);
        if (r19.y() == false) goto L88;
        r19.h0();
        return;
    L88:
        return;
    L62:
        bo2.e(r20, r22, true);
        return;
    L91:
        return;
    L64:
        AlbumBottomSheetDialog r23 = (AlbumBottomSheetDialog) r5;
        ic2 r24 = (ic2) r4;
        MainActivity r25 = (MainActivity) r3;
        List r26 = (List) r6;
        if (r26 != null) goto L67;
        return;
    L67:
        if (r26.isEmpty() == false) goto L70;
        return;
    L70:
        if (r23.l() == null) goto L96;
        e03.o(r26);
        if (r23.H0 == false) goto L77;
        r23.H0 = false;
        bo2.q(r24, r26, 0, "album");
        ((au) r25.V.n).d(true);
        if (r23.y() == false) goto L93;
        r23.h0();
        return;
    L93:
        return;
    L77:
        bo2.e(r24, r26, true);
        return;
    }

    public /* synthetic */ z6(zt r1, Object r2, KeyEvent.Callback r3, int r4) {
        this.a = r4;
        this.d = r1;
        this.b = r2;
        this.c = r3;
    }
}
