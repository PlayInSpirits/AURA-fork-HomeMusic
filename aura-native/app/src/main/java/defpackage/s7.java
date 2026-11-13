package defpackage;

import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.ui.fragment.AlbumCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.AlbumListPageFragment;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistListPageFragment;
import com.eddyizm.tempus.ui.fragment.GenreCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistEditorFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import com.google.android.material.search.SearchView;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class s7 implements View.OnTouchListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ s7(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                ((AlbumCatalogueFragment) obj).i0(view);
                break;
            case 1:
                ((InputMethodManager) ((AlbumListPageFragment) obj).X().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                break;
            case 2:
                ((ArtistCatalogueFragment) obj).i0(view);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((InputMethodManager) ((ArtistListPageFragment) obj).X().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                break;
            case 4:
                ix0 ix0Var = (ix0) obj;
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - ix0Var.o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        ix0Var.m = false;
                    }
                    ix0Var.t();
                    ix0Var.m = true;
                    ix0Var.o = System.currentTimeMillis();
                    break;
                }
                break;
            case 5:
                ((GenreCatalogueFragment) obj).h0(view);
                break;
            case 6:
                ((PlaylistCatalogueFragment) obj).h0(view);
                break;
            case 7:
                ol3 ol3Var = (ol3) obj;
                if (motionEvent.getActionMasked() == 0) {
                    PlaylistEditorFragment playlistEditorFragment = (PlaylistEditorFragment) ol3Var.v.s;
                    if (!playlistEditorFragment.m0.i) {
                        f22 f22Var = playlistEditorFragment.o0;
                        e22 e22Var = f22Var.m;
                        RecyclerView recyclerView = f22Var.r;
                        int i2 = e22Var.c;
                        if ((e22.b((i2 << 8) | i2 | 3 | 196608, recyclerView.getLayoutDirection()) & 16711680) == 0) {
                            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
                            break;
                        } else if (ol3Var.a.getParent() == f22Var.r) {
                            VelocityTracker velocityTracker = f22Var.t;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                            }
                            f22Var.t = VelocityTracker.obtain();
                            f22Var.i = 0.0f;
                            f22Var.h = 0.0f;
                            f22Var.r(ol3Var, 2);
                            break;
                        } else {
                            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                            break;
                        }
                    }
                }
                break;
            case 8:
                ((PodcastChannelCatalogueFragment) obj).h0(view);
                break;
            case 9:
                SearchView searchView = (SearchView) obj;
                int i3 = SearchView.Q;
                if (searchView.h()) {
                    searchView.f();
                    break;
                }
                break;
            default:
                ((SongListPageFragment) obj).h0(view);
                break;
        }
        return false;
    }
}
