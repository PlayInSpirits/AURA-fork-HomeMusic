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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s7 implements View.OnTouchListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ s7(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r6, MotionEvent r7) {
        int r0 = this.n;
        Object r5 = this.o;
        switch(r0) {
            case 0: goto L47;
            case 1: goto L45;
            case 2: goto L43;
            case 3: goto L41;
            case 4: goto L32;
            case 5: goto L30;
            case 6: goto L28;
            case 7: goto L12;
            case 8: goto L10;
            case 9: goto L6;
            default: goto L4;
        };
    L4:
        ((SongListPageFragment) r5).h0(r6);
        return false;
    L6:
        SearchView r8 = (SearchView) r5;
        int r9 = SearchView.Q;
        if (r8.h() == false) goto L9;
        r8.f();
    L9:
        return false;
    L10:
        ((PodcastChannelCatalogueFragment) r5).h0(r6);
        return false;
    L12:
        ol3 r10 = (ol3) r5;
        if (r7.getActionMasked() != 0) goto L27;
        PlaylistEditorFragment r11 = (PlaylistEditorFragment) r10.v.s;
        if (r11.m0.i == true) goto L27;
        f22 r12 = r11.o0;
        e22 r13 = r12.m;
        RecyclerView r1 = r12.r;
        int r14 = r13.c;
        int r2 = r14 | 3;
        if ((e22.b(((r14 << 8) | r2) | 196608, r1.getLayoutDirection()) & 16711680) != 0) goto L20;
        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
        goto L27
    L20:
        if (r10.a.getParent() == r12.r) goto L22;
        Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        goto L27
    L22:
        VelocityTracker r15 = r12.t;
        if (r15 == null) goto L25;
        r15.recycle();
    L25:
        r12.t = VelocityTracker.obtain();
        r12.i = 0.0f;
        r12.h = 0.0f;
        r12.r(r10, 2);
    L27:
        return false;
    L28:
        ((PlaylistCatalogueFragment) r5).h0(r6);
        return false;
    L30:
        ((GenreCatalogueFragment) r5).h0(r6);
        return false;
    L32:
        ix0 r16 = (ix0) r5;
        if (r7.getAction() != 1) goto L40;
        long r3 = System.currentTimeMillis() - r16.o;
        if (r3 >= 0) goto L37;
    L38:
        r16.m = false;
    L39:
        r16.t();
        r16.m = true;
        r16.o = System.currentTimeMillis();
        goto L40
    L37:
        if (r3 <= 300) goto L39;
    L40:
        return false;
    L41:
        ((InputMethodManager) ((ArtistListPageFragment) r5).X().getSystemService("input_method")).hideSoftInputFromWindow(r6.getWindowToken(), 0);
        return false;
    L43:
        ((ArtistCatalogueFragment) r5).i0(r6);
        return false;
    L45:
        ((InputMethodManager) ((AlbumListPageFragment) r5).X().getSystemService("input_method")).hideSoftInputFromWindow(r6.getWindowToken(), 0);
        return false;
    L47:
        ((AlbumCatalogueFragment) r5).i0(r6);
        return false;
    }
}
