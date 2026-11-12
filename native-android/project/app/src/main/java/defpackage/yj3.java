package defpackage;

import android.view.View;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.ui.fragment.PlayerControllerFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.SongBottomSheetDialog;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yj3 implements View.OnLongClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ ik o;
    public final /* synthetic */ String p;
    public final /* synthetic */ kc1 q;

    public /* synthetic */ yj3(kc1 r1, ik r2, String r3, int r4) {
        this.n = r4;
        this.q = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View r6) {
        int r7 = this.n;
        String r3 = this.p;
        ik r4 = this.o;
        kc1 r5 = this.q;
        switch(r7) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        SongBottomSheetDialog r8 = (SongBottomSheetDialog) r5;
        l93.t(r8.Z(), r4);
        Toast.makeText(r8.Z(), r8.t(R.string.asset_link_copied_toast, new Object[]{r3}), 0).show();
        return true;
    L6:
        PlayerControllerFragment r9 = (PlayerControllerFragment) r5;
        l93.t(r9.Z(), r4);
        Toast.makeText(r9.Z(), r9.t(R.string.asset_link_copied_toast, new Object[]{r3}), 0).show();
        return true;
    }
}
