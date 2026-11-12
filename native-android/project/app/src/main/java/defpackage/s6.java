package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s6 extends dw3 {
    public final ClickCallback t;
    public final /* synthetic */ int q = 0;
    public int s = 400;
    public List r = Collections.EMPTY_LIST;

    public s6(ArtistPageFragment artistPageFragment) {
        this.t = artistPageFragment;
    }

    @Override // defpackage.dw3
    public final int a() {
        switch (this.q) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.r.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        switch (this.q) {
            case 0:
                r6 r6Var = (r6) cx3Var;
                bq4 bq4Var = r6Var.u;
                ViewGroup.LayoutParams layoutParams = ((ImageView) bq4Var.o).getLayoutParams();
                int i2 = this.s;
                layoutParams.width = i2;
                layoutParams.height = i2;
                ((ImageView) bq4Var.o).setLayoutParams(layoutParams);
                AlbumID3 albumID3 = (AlbumID3) this.r.get(i);
                ((TextView) bq4Var.p).setText(albumID3.getName());
                ((TextView) bq4Var.q).setText(albumID3.getArtist());
                Context context = r6Var.a.getContext();
                String coverArtId = albumID3.getCoverArtId();
                vz3 vz3VarT = b11.g(context, coverArtId, 2, a.c(context), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K((ImageView) bq4Var.o);
                break;
            case 1:
                cj cjVar = (cj) cx3Var;
                ns3 ns3Var = cjVar.u;
                ViewGroup.LayoutParams layoutParams2 = ((ShapeableImageView) ns3Var.p).getLayoutParams();
                int i3 = this.s;
                layoutParams2.width = i3;
                layoutParams2.height = i3;
                ((ShapeableImageView) ns3Var.p).setLayoutParams(layoutParams2);
                ArtistID3 artistID3 = (ArtistID3) this.r.get(i);
                ((TextView) ns3Var.q).setText(artistID3.getName());
                Context context2 = cjVar.a.getContext();
                String coverArtId2 = artistID3.getCoverArtId();
                vz3 vz3VarT2 = b11.g(context2, coverArtId2, 3, a.c(context2), coverArtId2 != null ? wg0.b(ud3.t(), coverArtId2) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT2 = (vz3) vz3VarT2.l();
                }
                vz3VarT2.K((ShapeableImageView) ns3Var.p);
                break;
            default:
                xd4 xd4Var = (xd4) cx3Var;
                qp4 qp4Var = xd4Var.u;
                ViewGroup.LayoutParams layoutParams3 = ((ImageView) qp4Var.c).getLayoutParams();
                int i4 = this.s;
                layoutParams3.width = i4;
                layoutParams3.height = i4;
                ((ImageView) qp4Var.c).setLayoutParams(layoutParams3);
                Child child = (Child) this.r.get(i);
                ((TextView) qp4Var.b).setText(child.getTitle());
                Context context3 = xd4Var.a.getContext();
                String coverArtId3 = child.getCoverArtId();
                vz3 vz3VarT3 = b11.g(context3, coverArtId3, 9, a.c(context3), coverArtId3 != null ? wg0.b(ud3.t(), coverArtId3) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT3 = (vz3) vz3VarT3.l();
                }
                vz3VarT3.K((ImageView) qp4Var.c);
                break;
        }
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        switch (this.q) {
            case 0:
                bq4 bq4VarM = bq4.m(LayoutInflater.from(viewGroup.getContext()), viewGroup);
                ut4.c().b(viewGroup.getContext());
                this.s = ut4.c().d(viewGroup.getContext());
                return new r6(this, bq4VarM);
            case 1:
                View viewI = b11.i(viewGroup, R.layout.item_artist_carousel, viewGroup, false);
                int i2 = R.id.artist_cover_image_view;
                ShapeableImageView shapeableImageView = (ShapeableImageView) uo.s(viewI, R.id.artist_cover_image_view);
                if (shapeableImageView != null) {
                    i2 = R.id.artist_name_label;
                    TextView textView = (TextView) uo.s(viewI, R.id.artist_name_label);
                    if (textView != null) {
                        ns3 ns3Var = new ns3((ConstraintLayout) viewI, shapeableImageView, textView, 5);
                        ut4.c().b(viewGroup.getContext());
                        this.s = ut4.c().d(viewGroup.getContext());
                        return new cj(this, ns3Var);
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI.getResources().getResourceName(i2)));
                return null;
            default:
                View viewI2 = b11.i(viewGroup, R.layout.item_home_similar_track, viewGroup, false);
                int i3 = R.id.title_track_label;
                TextView textView2 = (TextView) uo.s(viewI2, R.id.title_track_label);
                if (textView2 != null) {
                    i3 = R.id.track_cover_image_view;
                    ImageView imageView = (ImageView) uo.s(viewI2, R.id.track_cover_image_view);
                    if (imageView != null) {
                        qp4 qp4Var = new qp4((ConstraintLayout) viewI2, textView2, imageView);
                        ut4.c().b(viewGroup.getContext());
                        this.s = ut4.c().d(viewGroup.getContext());
                        return new xd4(this, qp4Var);
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI2.getResources().getResourceName(i3)));
                return null;
        }
    }

    public void p(List list) {
        this.r = list;
        d();
    }

    public s6(cp1 cp1Var) {
        this.t = cp1Var;
    }

    public s6(ClickCallback clickCallback) {
        this.t = clickCallback;
    }
}
