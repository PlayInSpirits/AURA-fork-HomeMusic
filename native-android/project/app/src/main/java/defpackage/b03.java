package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.subsonic.models.Artist;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b03 extends dw3 {
    public final IndexFragment q;
    public List r = Collections.EMPTY_LIST;

    public b03(IndexFragment indexFragment) {
        this.q = indexFragment;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.r.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        a03 a03Var = (a03) cx3Var;
        Artist artist = (Artist) this.r.get(i);
        z12 z12Var = a03Var.u;
        z12Var.e.setText(artist.getName());
        Context context = a03Var.a.getContext();
        String name = artist.getName();
        vz3 vz3VarT = b11.g(context, name, 5, a.c(context), name != null ? wg0.b(ud3.t(), name) : null).T(xv0.b());
        if (ud3.R()) {
            vz3VarT = (vz3) vz3VarT.l();
        }
        vz3VarT.K(z12Var.b);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        View viewI = b11.i(viewGroup, R.layout.item_library_music_index, viewGroup, false);
        int i2 = R.id.music_index_cover_image_view;
        ImageView imageView = (ImageView) uo.s(viewI, R.id.music_index_cover_image_view);
        if (imageView != null) {
            i2 = R.id.music_index_more_button;
            ImageView imageView2 = (ImageView) uo.s(viewI, R.id.music_index_more_button);
            if (imageView2 != null) {
                i2 = R.id.music_index_play_button;
                ImageView imageView3 = (ImageView) uo.s(viewI, R.id.music_index_play_button);
                if (imageView3 != null) {
                    i2 = R.id.music_index_title_text_view;
                    TextView textView = (TextView) uo.s(viewI, R.id.music_index_title_text_view);
                    if (textView != null) {
                        return new a03(this, new z12((ConstraintLayout) viewI, imageView, imageView2, imageView3, textView));
                    }
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewI.getResources().getResourceName(i2)));
        return null;
    }
}
