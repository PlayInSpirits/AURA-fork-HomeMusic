package defpackage;

import android.view.ViewTreeObserver;
import android.widget.Button;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qj implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Button n;
    public final /* synthetic */ Button o;
    public final /* synthetic */ CoordinatorLayout p;
    public final /* synthetic */ ArtistPageFragment q;

    public qj(ArtistPageFragment r1, Button r2, Button r3, CoordinatorLayout r4) {
        this.q = r1;
        this.n = r2;
        this.o = r3;
        this.p = r4;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        CoordinatorLayout r0 = this.p;
        ArtistPageFragment r1 = this.q;
        ArtistPageFragment.h0(r1, this.n, R.string.artist_page_shuffle_button);     // Catch: Throwable -> L6
        ArtistPageFragment.h0(r1, this.o, R.string.artist_page_radio_button);     // Catch: Throwable -> L6
        r0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        return;
    L6:
        th = move-exception;
        r0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        throw th;
    }
}
