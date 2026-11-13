package defpackage;

import android.view.ViewTreeObserver;
import android.widget.Button;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qj implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Button n;
    public final /* synthetic */ Button o;
    public final /* synthetic */ CoordinatorLayout p;
    public final /* synthetic */ ArtistPageFragment q;

    public qj(ArtistPageFragment artistPageFragment, Button button, Button button2, CoordinatorLayout coordinatorLayout) {
        this.q = artistPageFragment;
        this.n = button;
        this.o = button2;
        this.p = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        CoordinatorLayout coordinatorLayout = this.p;
        ArtistPageFragment artistPageFragment = this.q;
        try {
            ArtistPageFragment.h0(artistPageFragment, this.n, R.string.artist_page_shuffle_button);
            ArtistPageFragment.h0(artistPageFragment, this.o, R.string.artist_page_radio_button);
        } finally {
            coordinatorLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
