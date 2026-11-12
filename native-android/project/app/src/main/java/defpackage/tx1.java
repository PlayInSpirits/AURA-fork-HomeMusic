package defpackage;

import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ IndexFragment o;
    public final /* synthetic */ ArrayList p;

    public /* synthetic */ tx1(IndexFragment r1, ArrayList r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r1 = 1;
        ArrayList r2 = this.p;
        IndexFragment r4 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        bo2.o(r4.p0, r2, 0);
        ((au) r4.m0.V.n).d(true);
        Toast.makeText(r4.Z(), r4.t(R.string.folder_play_playing, new Object[]{Integer.valueOf(r2.size())}), 0).show();
        return;
    L6:
        boolean r3 = r2.isEmpty();
        MainActivity r5 = r4.m0;
        if (r3 == true) goto L9;
        r5.runOnUiThread(new tx1(r4, r2, r1));
        return;
    L9:
        r5.runOnUiThread(new qa1(16, r4));
    }
}
