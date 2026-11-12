package defpackage;

import android.app.Dialog;
import android.widget.Toast;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rl3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ pz1 o;

    public /* synthetic */ rl3(pz1 pz1Var, int i) {
        this.n = i;
        this.o = pz1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        pz1 pz1Var = this.o;
        switch (i) {
            case 0:
                Toast.makeText(((sl3) pz1Var.o).n(), R.string.playlist_editor_dialog_action_delete_failure, 0).show();
                break;
            default:
                sl3 sl3Var = (sl3) pz1Var.o;
                Toast.makeText(sl3Var.n(), R.string.playlist_editor_dialog_action_delete_success, 0).show();
                Dialog dialog = sl3Var.w0;
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
        }
    }
}
