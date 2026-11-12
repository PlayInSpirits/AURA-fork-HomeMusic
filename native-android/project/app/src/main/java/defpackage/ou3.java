package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ou3 extends pp0 {
    public wo0 B0;
    public pu3 C0;

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        if (Y().getParcelable("TRACK_OBJECT") != null) {
            pu3 pu3Var = this.C0;
            pu3Var.f = (Child) Y().getParcelable("TRACK_OBJECT");
            pu3Var.g = null;
            pu3Var.h = null;
        } else if (Y().getParcelable("ALBUM_OBJECT") != null) {
            pu3 pu3Var2 = this.C0;
            AlbumID3 albumID3 = (AlbumID3) Y().getParcelable("ALBUM_OBJECT");
            pu3Var2.f = null;
            pu3Var2.g = albumID3;
            pu3Var2.h = null;
        } else if (Y().getParcelable("ARTIST_OBJECT") != null) {
            pu3 pu3Var3 = this.C0;
            ArtistID3 artistID3 = (ArtistID3) Y().getParcelable("ARTIST_OBJECT");
            pu3Var3.f = null;
            pu3Var3.g = null;
            pu3Var3.h = artistID3;
        }
        pu3 pu3Var4 = this.C0;
        Child child = pu3Var4.f;
        if (child != null) {
            xi4 xi4Var = pu3Var4.c;
            String id = child.getId();
            xi4Var.getClass();
            final int i = 0;
            xi4.r(id).e(this, new a83(this) { // from class: nu3
                public final /* synthetic */ ou3 b;

                {
                    this.b = this;
                }

                @Override // defpackage.a83
                public final void b(Object obj) {
                    int i2 = i;
                    ou3 ou3Var = this.b;
                    switch (i2) {
                        case 0:
                            Child child2 = (Child) obj;
                            ((RatingBar) ou3Var.B0.o).setRating(child2.getUserRating() != null ? child2.getUserRating().intValue() : 0.0f);
                            break;
                        case 1:
                            AlbumID3 albumID4 = (AlbumID3) obj;
                            if (albumID4 != null) {
                                ((RatingBar) ou3Var.B0.o).setRating(albumID4.getUserRating() != null ? albumID4.getUserRating().intValue() : 0.0f);
                            }
                            break;
                        default:
                            ((RatingBar) ou3Var.B0.o).setRating(0.0f);
                            break;
                    }
                }
            });
            return;
        }
        AlbumID3 albumID4 = pu3Var4.g;
        if (albumID4 != null) {
            rv2 rv2Var = pu3Var4.d;
            String id2 = albumID4.getId();
            rv2Var.getClass();
            final int i2 = 1;
            rv2.j(id2).e(this, new a83(this) { // from class: nu3
                public final /* synthetic */ ou3 b;

                {
                    this.b = this;
                }

                @Override // defpackage.a83
                public final void b(Object obj) {
                    int i3 = i2;
                    ou3 ou3Var = this.b;
                    switch (i3) {
                        case 0:
                            Child child2 = (Child) obj;
                            ((RatingBar) ou3Var.B0.o).setRating(child2.getUserRating() != null ? child2.getUserRating().intValue() : 0.0f);
                            break;
                        case 1:
                            AlbumID3 albumID5 = (AlbumID3) obj;
                            if (albumID5 != null) {
                                ((RatingBar) ou3Var.B0.o).setRating(albumID5.getUserRating() != null ? albumID5.getUserRating().intValue() : 0.0f);
                            }
                            break;
                        default:
                            ((RatingBar) ou3Var.B0.o).setRating(0.0f);
                            break;
                    }
                }
            });
            return;
        }
        ArtistID3 artistID4 = pu3Var4.h;
        if (artistID4 != null) {
            pa paVar = pu3Var4.e;
            String id3 = artistID4.getId();
            paVar.getClass();
            final int i3 = 2;
            pa.v(id3).e(this, new a83(this) { // from class: nu3
                public final /* synthetic */ ou3 b;

                {
                    this.b = this;
                }

                @Override // defpackage.a83
                public final void b(Object obj) {
                    int i4 = i3;
                    ou3 ou3Var = this.b;
                    switch (i4) {
                        case 0:
                            Child child2 = (Child) obj;
                            ((RatingBar) ou3Var.B0.o).setRating(child2.getUserRating() != null ? child2.getUserRating().intValue() : 0.0f);
                            break;
                        case 1:
                            AlbumID3 albumID5 = (AlbumID3) obj;
                            if (albumID5 != null) {
                                ((RatingBar) ou3Var.B0.o).setRating(albumID5.getUserRating() != null ? albumID5.getUserRating().intValue() : 0.0f);
                            }
                            break;
                        default:
                            ((RatingBar) ou3Var.B0.o).setRating(0.0f);
                            break;
                    }
                }
            });
        }
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        View viewInflate = o().inflate(R.layout.dialog_rating, (ViewGroup) null, false);
        RatingBar ratingBar = (RatingBar) uo.s(viewInflate, R.id.rating_bar);
        if (ratingBar == null) {
            nz2.n("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.rating_bar)));
            return null;
        }
        this.B0 = new wo0((ConstraintLayout) viewInflate, ratingBar);
        nc1 nc1VarX = X();
        e75 e75VarD = nc1VarX.d();
        b75 b75VarR = gh0.r(nc1VarX);
        bq4 bq4Var = new bq4(e75VarD, b75VarR, b11.e(nc1VarX, b75VarR));
        i30 i30VarA = kx3.a(pu3.class);
        String strB = i30VarA.b();
        if (strB == null) {
            kf2.n("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.C0 = (pu3) bq4Var.l(i30VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        vg2 vg2VarQ = new vg2(e(), 0).q((ConstraintLayout) this.B0.n);
        vg2VarQ.p(R.string.rating_dialog_title);
        return vg2VarQ.j(R.string.rating_dialog_negative_button, new wr(10)).l(R.string.rating_dialog_positive_button, new vr(7, this)).create();
    }
}
