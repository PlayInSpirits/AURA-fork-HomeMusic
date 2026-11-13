package defpackage;

import android.app.Dialog;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.PlaylistCallback;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ql3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ om1 o;

    public /* synthetic */ ql3(om1 om1Var, int i) {
        this.n = i;
        this.o = om1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        om1 om1Var = this.o;
        switch (i) {
            case 0:
                Toast.makeText(((sl3) om1Var.o).n(), R.string.playlist_editor_dialog_action_save_failure, 0).show();
                break;
            default:
                sl3 sl3Var = (sl3) om1Var.o;
                Toast.makeText(sl3Var.n(), R.string.playlist_editor_dialog_action_save_success, 0).show();
                PlaylistCallback playlistCallback = (PlaylistCallback) sl3Var.F0;
                if (playlistCallback != null && ((wl3) sl3Var.E0).f != null) {
                    playlistCallback.onRenamed(sl3Var.C0);
                }
                Dialog dialog = sl3Var.w0;
                if (dialog != null) {
                    dialog.dismiss();
                    break;
                }
                break;
        }
    }
}
