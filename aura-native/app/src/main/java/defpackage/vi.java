package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vi extends dw3 {
    public final ClickCallback q;
    public final boolean r;
    public final boolean s;
    public int t = 400;
    public List u = Collections.EMPTY_LIST;

    public vi(ClickCallback clickCallback, Boolean bool, Boolean bool2) {
        this.q = clickCallback;
        this.r = bool.booleanValue();
        this.s = bool2.booleanValue();
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.u.size();
    }

    @Override // defpackage.dw3
    public final long b(int i) {
        return i;
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        ui uiVar = (ui) cx3Var;
        yc5 yc5Var = uiVar.u;
        ViewGroup.LayoutParams layoutParams = ((ImageView) yc5Var.o).getLayoutParams();
        int i2 = this.t;
        layoutParams.width = i2;
        layoutParams.height = i2;
        ((ImageView) yc5Var.o).setLayoutParams(layoutParams);
        ArtistID3 artistID3 = (ArtistID3) this.u.get(i);
        ((TextView) yc5Var.p).setText(artistID3.getName());
        Context context = uiVar.a.getContext();
        String coverArtId = artistID3.getCoverArtId();
        vz3 T = b11.g(context, coverArtId, 3, a.c(context), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
        if (ud3.R()) {
            T = (vz3) T.l();
        }
        T.K((ImageView) yc5Var.o);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        View i2 = b11.i(viewGroup, R.layout.item_library_artist, viewGroup, false);
        int i3 = R.id.artist_cover_image_view;
        ImageView imageView = (ImageView) uo.s(i2, R.id.artist_cover_image_view);
        if (imageView != null) {
            i3 = R.id.artist_name_label;
            TextView textView = (TextView) uo.s(i2, R.id.artist_name_label);
            if (textView != null) {
                yc5 yc5Var = new yc5();
                yc5Var.n = (ConstraintLayout) i2;
                yc5Var.o = imageView;
                yc5Var.p = textView;
                ut4.c().b(viewGroup.getContext());
                this.t = ut4.c().d(viewGroup.getContext());
                return new ui(this, yc5Var);
            }
        }
        nz2.n("Missing required view with ID: ".concat(i2.getResources().getResourceName(i3)));
        return null;
    }
}
