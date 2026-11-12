package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.subsonic.models.Share;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uc4 extends dw3 {
    public final /* synthetic */ int q;
    public final cp1 r;
    public List s;

    public uc4(cp1 cp1Var, int i) {
        this.q = i;
        switch (i) {
            case 1:
                this.r = cp1Var;
                this.s = Collections.EMPTY_LIST;
                break;
            default:
                this.r = cp1Var;
                this.s = Collections.EMPTY_LIST;
                break;
        }
    }

    @Override // defpackage.dw3
    public final int a() {
        switch (this.q) {
            case 0:
                break;
        }
        return this.s.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        switch (this.q) {
            case 0:
                tc4 tc4Var = (tc4) cx3Var;
                Share share = (Share) this.s.get(i);
                x12 x12Var = tc4Var.u;
                x12Var.e.setText(share.getDescription());
                TextView textView = x12Var.c;
                View view = tc4Var.a;
                textView.setText(view.getContext().getString(R.string.share_subtitle_item, g12.x(share.getExpires())));
                if (share.getEntries() != null && !share.getEntries().isEmpty()) {
                    Context context = view.getContext();
                    String coverArtId = share.getEntries().get(0).getCoverArtId();
                    vz3 vz3VarT = b11.g(context, coverArtId, 2, a.c(context), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                    if (ud3.R()) {
                        vz3VarT = (vz3) vz3VarT.l();
                    }
                    vz3VarT.K(x12Var.b);
                    break;
                }
                break;
            default:
                ((TextView) ((he5) cx3Var).u.o).setText(Integer.toString(((Integer) this.s.get(i)).intValue()));
                break;
        }
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        switch (this.q) {
            case 0:
                View viewI = b11.i(viewGroup, R.layout.item_horizontal_share, viewGroup, false);
                int i2 = R.id.share_button;
                FrameLayout frameLayout = (FrameLayout) uo.s(viewI, R.id.share_button);
                if (frameLayout != null) {
                    i2 = R.id.share_cover_image_view;
                    ImageView imageView = (ImageView) uo.s(viewI, R.id.share_cover_image_view);
                    if (imageView != null) {
                        i2 = R.id.share_subtitle_text_view;
                        TextView textView = (TextView) uo.s(viewI, R.id.share_subtitle_text_view);
                        if (textView != null) {
                            i2 = R.id.share_title_text_view;
                            TextView textView2 = (TextView) uo.s(viewI, R.id.share_title_text_view);
                            if (textView2 != null) {
                                return new tc4(this, new x12((ConstraintLayout) viewI, frameLayout, imageView, textView, textView2));
                            }
                        }
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI.getResources().getResourceName(i2)));
                return null;
            default:
                View viewI2 = b11.i(viewGroup, R.layout.item_home_year, viewGroup, false);
                int i3 = R.id.card_view;
                if (((CardView) uo.s(viewI2, R.id.card_view)) != null) {
                    i3 = R.id.year_label;
                    TextView textView3 = (TextView) uo.s(viewI2, R.id.year_label);
                    if (textView3 != null) {
                        return new he5(this, new wo0((LinearLayout) viewI2, textView3));
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI2.getResources().getResourceName(i3)));
                return null;
        }
    }
}
