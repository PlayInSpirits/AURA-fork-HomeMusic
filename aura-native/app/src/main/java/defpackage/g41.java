package defpackage;

import android.content.Context;
import android.widget.Toast;
import app.homemusic.R;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class g41 implements IntConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g41(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                i41 i41Var = (i41) ((yc5) obj).p;
                if (!i41Var.i0) {
                    i41Var.q1(1, 19, Integer.valueOf(i));
                    break;
                }
                break;
            default:
                PlaylistPageFragment playlistPageFragment = (PlaylistPageFragment) obj;
                Context n = playlistPageFragment.n();
                if (n != null && i > 0) {
                    Toast.makeText(n, playlistPageFragment.r().getQuantityString(R.plurals.playlist_sync_downloading, i, Integer.valueOf(i)), 0).show();
                    break;
                }
                break;
        }
    }
}
