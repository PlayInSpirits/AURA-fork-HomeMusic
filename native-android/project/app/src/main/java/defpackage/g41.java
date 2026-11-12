package defpackage;

import android.content.Context;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g41 implements IntConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g41(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int r4) {
        int r0 = this.a;
        Object r3 = this.b;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        PlaylistPageFragment r5 = (PlaylistPageFragment) r3;
        Context r1 = r5.n();
        if (r1 == null) goto L15;
        if (r4 <= 0) goto L16;
        Toast.makeText(r1, r5.r().getQuantityString(R.plurals.playlist_sync_downloading, r4, new Object[]{Integer.valueOf(r4)}), 0).show();
        return;
    L16:
        return;
    L15:
        return;
    L10:
        i41 r6 = (i41) ((yc5) r3).p;
        if (r6.i0 == true) goto L17;
        r6.q1(1, 19, Integer.valueOf(r4));
        return;
    }
}
