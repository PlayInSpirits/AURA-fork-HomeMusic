package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rj3 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ PlayerControllerFragment o;

    public /* synthetic */ rj3(PlayerControllerFragment r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r5) {
        int r6 = this.n;
        PlayerControllerFragment r4 = this.o;
        switch(r6) {
            case 0: goto L36;
            case 1: goto L34;
            case 2: goto L23;
            case 3: goto L17;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        xa3.t("skip_silence", !r4.w0.isChecked());
        return;
    L6:
        ai3 r7 = new ai3();
        r7.B0 = new vj3(r4);
        r7.m0(r4.X().k(), null);
        return;
    L8:
        gh0.G(r4.X());
        return;
    L10:
        Child r8 = (Child) r4.L0.n.d();
        if (r8 != null) goto L13;
        return;
    L13:
        if (r4.K0 == null) goto L39;
        Bundle r2 = new Bundle();
        r2.putParcelable("TRACK_OBJECT", r8);
        r2.putBoolean("homemusic_song_sheet_from_player", true);
        r4.K0.T.m(R.id.songBottomSheetDialog, r2, null);
        return;
    L39:
        return;
    L17:
        int r9 = r4.o0.getCurrentItem();
        if (r9 != 0) goto L20;
        r4.o0.c(1, true);
        return;
    L20:
        if (r9 != 1) goto L41;
        r4.o0.c(0, true);
        return;
    L41:
        return;
    L23:
        xi3 r10 = (xi3) r4.X().k().D("PlayerBottomSheet");
        if (r10 != null) goto L26;
        return;
    L26:
        if (r10.n() != null) goto L28;
        return;
    L28:
        if (r10.y() == true) goto L30;
        return;
    L30:
        if (r10.T == null) goto L45;
        ((ViewPager2) ((om1) r10.o0.p).o).c(1, true);
        return;
    L45:
        return;
    L34:
        r4.u0();
        return;
    L36:
        r4.u0();
    }
}
