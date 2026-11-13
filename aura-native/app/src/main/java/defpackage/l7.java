package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class l7 extends dw3 {
    public final ClickCallback q;
    public final boolean s;
    public int t = 400;
    public List r = Collections.EMPTY_LIST;

    public l7(ArtistPageFragment artistPageFragment, boolean z) {
        this.q = artistPageFragment;
        this.s = z;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.r.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        k7 k7Var = (k7) cx3Var;
        bq4 bq4Var = k7Var.u;
        ViewGroup.LayoutParams layoutParams = ((ShapeableImageView) bq4Var.o).getLayoutParams();
        int i2 = this.t;
        layoutParams.width = i2;
        layoutParams.height = i2;
        ShapeableImageView shapeableImageView = (ShapeableImageView) bq4Var.o;
        TextView textView = (TextView) bq4Var.q;
        TextView textView2 = (TextView) bq4Var.p;
        shapeableImageView.setLayoutParams(layoutParams);
        AlbumID3 albumID3 = (AlbumID3) this.r.get(i);
        if (xa3.u("album_year_visible", false)) {
            textView2.setText(albumID3.getName() + " (" + albumID3.getYear() + ")");
        } else {
            textView2.setText(albumID3.getName());
        }
        textView.setText(albumID3.getArtist());
        textView.setVisibility(this.s ? 0 : 8);
        Context context = k7Var.a.getContext();
        String coverArtId = albumID3.getCoverArtId();
        vz3 T = b11.g(context, coverArtId, 2, a.c(context), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
        if (ud3.R()) {
            T = (vz3) T.l();
        }
        T.K((ShapeableImageView) bq4Var.o);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        View i2 = b11.i(viewGroup, R.layout.item_album_carousel, viewGroup, false);
        int i3 = R.id.album_cover_image_view;
        ShapeableImageView shapeableImageView = (ShapeableImageView) uo.s(i2, R.id.album_cover_image_view);
        if (shapeableImageView != null) {
            i3 = R.id.album_name_label;
            TextView textView = (TextView) uo.s(i2, R.id.album_name_label);
            if (textView != null) {
                i3 = R.id.artist_name_label;
                TextView textView2 = (TextView) uo.s(i2, R.id.artist_name_label);
                if (textView2 != null) {
                    bq4 bq4Var = new bq4((ConstraintLayout) i2, shapeableImageView, textView, textView2);
                    ut4.c().b(viewGroup.getContext());
                    this.t = ut4.c().d(viewGroup.getContext());
                    return new k7(this, bq4Var);
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(i2.getResources().getResourceName(i3)));
        return null;
    }
}
