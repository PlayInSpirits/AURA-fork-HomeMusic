package defpackage;

import android.app.Dialog;
import android.widget.Toast;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rl3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ pz1 o;

    public /* synthetic */ rl3(pz1 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        pz1 r3 = this.o;
        switch(r0) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        sl3 r4 = (sl3) r3.o;
        Toast.makeText(r4.n(), R.string.playlist_editor_dialog_action_delete_success, 0).show();
        Dialog r5 = r4.w0;
        if (r5 == null) goto L10;
        r5.dismiss();
        return;
    L10:
        return;
    L8:
        Toast.makeText(((sl3) r3.o).n(), R.string.playlist_editor_dialog_action_delete_failure, 0).show();
    }
}
