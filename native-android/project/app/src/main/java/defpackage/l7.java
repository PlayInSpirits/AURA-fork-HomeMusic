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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l7 extends dw3 {
    public final ClickCallback q;
    public List r;
    public final boolean s;
    public int t;

    public l7(ArtistPageFragment r2, boolean r3) {
        this.t = 400;
        this.q = r2;
        this.r = Collections.EMPTY_LIST;
        this.s = r3;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.r.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 r7, int r8) {
        k7 r9 = (k7) r7;
        bq4 r0 = r9.u;
        ViewGroup.LayoutParams r1 = ((ShapeableImageView) r0.o).getLayoutParams();
        int r2 = this.t;
        r1.width = r2;
        r1.height = r2;
        ShapeableImageView r3 = (ShapeableImageView) r0.o;
        TextView r4 = (TextView) r0.q;
        TextView r5 = (TextView) r0.p;
        r3.setLayoutParams(r1);
        AlbumID3 r10 = (AlbumID3) this.r.get(r8);
        int r6 = 0;
        if (xa3.u("album_year_visible", false) == false) goto L5;
        r5.setText(r10.getName() + " (" + r10.getYear() + ")");
    L6:
        r4.setText(r10.getArtist());
        if (this.s == true) goto L10;
        r6 = 8;
    L10:
        r4.setVisibility(r6);
        Context r11 = r9.a.getContext();
        String r12 = r10.getCoverArtId();
        c04 r13 = a.c(r11);
        if (r12 == null) goto L13;
        String r14 = wg0.b(ud3.t(), r12);
    L14:
        vz3 r15 = b11.g(r11, r12, 2, r13, r14).T(xv0.b());
        if (ud3.R() == false) goto L17;
        r15 = (vz3) r15.l();
    L17:
        r15.K((ShapeableImageView) r0.o);
        return;
    L13:
        r14 = null;
        goto L14
    L5:
        r5.setText(r10.getName());
        goto L6
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r5, int r6) {
        View r7 = b11.i(r5, R.layout.item_album_carousel, r5, false);
        int r0 = R.id.album_cover_image_view;
        ShapeableImageView r1 = (ShapeableImageView) uo.s(r7, R.id.album_cover_image_view);
        if (r1 == null) goto L10;
        r0 = R.id.album_name_label;
        TextView r2 = (TextView) uo.s(r7, R.id.album_name_label);
        if (r2 == null) goto L10;
        r0 = R.id.artist_name_label;
        TextView r3 = (TextView) uo.s(r7, R.id.artist_name_label);
        if (r3 == null) goto L10;
        bq4 r4 = new bq4((ConstraintLayout) r7, r1, r2, r3);
        ut4.c().b(r5.getContext());
        this.t = ut4.c().d(r5.getContext());
        return new k7(this, r4);
    L10:
        nz2.n("Missing required view with ID: ".concat(r7.getResources().getResourceName(r0)));
        return null;
    }
}
