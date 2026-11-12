package defpackage;

import android.app.Dialog;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.interfaces.PlaylistCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ql3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ om1 o;

    public /* synthetic */ ql3(om1 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        om1 r3 = this.o;
        switch(r0) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        sl3 r4 = (sl3) r3.o;
        Toast.makeText(r4.n(), R.string.playlist_editor_dialog_action_save_success, 0).show();
        PlaylistCallback r1 = (PlaylistCallback) r4.F0;
        if (r1 != null) goto L7;
    L9:
        Dialog r5 = r4.w0;
        if (r5 == null) goto L15;
        r5.dismiss();
        return;
    L15:
        return;
    L7:
        if (((wl3) r4.E0).f == null) goto L9;
        r1.onRenamed(r4.C0);
        goto L9
    L13:
        Toast.makeText(((sl3) r3.o).n(), R.string.playlist_editor_dialog_action_save_failure, 0).show();
    }
}
