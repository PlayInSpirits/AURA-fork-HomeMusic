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

    public /* synthetic */ yj3(kc1 kc1Var, ik ikVar, String str, int i) {
        this.n = i;
        this.q = kc1Var;
        this.o = ikVar;
        this.p = str;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.n;
        String str = this.p;
        ik ikVar = this.o;
        kc1 kc1Var = this.q;
        switch (i) {
            case 0:
                PlayerControllerFragment playerControllerFragment = (PlayerControllerFragment) kc1Var;
                l93.t(playerControllerFragment.Z(), ikVar);
                Toast.makeText(playerControllerFragment.Z(), playerControllerFragment.t(R.string.asset_link_copied_toast, str), 0).show();
                break;
            default:
                SongBottomSheetDialog songBottomSheetDialog = (SongBottomSheetDialog) kc1Var;
                l93.t(songBottomSheetDialog.Z(), ikVar);
                Toast.makeText(songBottomSheetDialog.Z(), songBottomSheetDialog.t(R.string.asset_link_copied_toast, str), 0).show();
                break;
        }
        return true;
    }
}
