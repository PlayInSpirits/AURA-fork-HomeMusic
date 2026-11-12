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
    public final /* synthetic */ int q;
    public List r;
    public int s;
    public final ClickCallback t;

    public s6(ArtistPageFragment r2) {
        this.q = 1;
        this.s = 400;
        this.t = r2;
        this.r = Collections.EMPTY_LIST;
    }

    @Override // defpackage.dw3
    public final int a() {
        switch(this.q) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return this.r.size();
    L7:
        return this.r.size();
    L9:
        return this.r.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 r5, int r6) {
        String r1 = null;
        switch(this.q) {
            case 0: goto L20;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        xd4 r7 = (xd4) r5;
        qp4 r0 = r7.u;
        ViewGroup.LayoutParams r2 = ((ImageView) r0.c).getLayoutParams();
        int r3 = this.s;
        r2.width = r3;
        r2.height = r3;
        ((ImageView) r0.c).setLayoutParams(r2);
        Child r4 = (Child) this.r.get(r6);
        ((TextView) r0.b).setText(r4.getTitle());
        Context r8 = r7.a.getContext();
        String r9 = r4.getCoverArtId();
        c04 r10 = a.c(r8);
        if (r9 == null) goto L7;
        r1 = wg0.b(ud3.t(), r9);
    L7:
        vz3 r11 = b11.g(r8, r9, 9, r10, r1).T(xv0.b());
        if (ud3.R() == false) goto L10;
        r11 = (vz3) r11.l();
    L10:
        r11.K((ImageView) r0.c);
        return;
    L12:
        cj r12 = (cj) r5;
        ns3 r13 = r12.u;
        ViewGroup.LayoutParams r14 = ((ShapeableImageView) r13.p).getLayoutParams();
        int r15 = this.s;
        r14.width = r15;
        r14.height = r15;
        ((ShapeableImageView) r13.p).setLayoutParams(r14);
        ArtistID3 r16 = (ArtistID3) this.r.get(r6);
        ((TextView) r13.q).setText(r16.getName());
        Context r17 = r12.a.getContext();
        String r18 = r16.getCoverArtId();
        c04 r19 = a.c(r17);
        if (r18 == null) goto L15;
        r1 = wg0.b(ud3.t(), r18);
    L15:
        vz3 r20 = b11.g(r17, r18, 3, r19, r1).T(xv0.b());
        if (ud3.R() == false) goto L18;
        r20 = (vz3) r20.l();
    L18:
        r20.K((ShapeableImageView) r13.p);
        return;
    L20:
        r6 r21 = (r6) r5;
        bq4 r22 = r21.u;
        ViewGroup.LayoutParams r23 = ((ImageView) r22.o).getLayoutParams();
        int r24 = this.s;
        r23.width = r24;
        r23.height = r24;
        ((ImageView) r22.o).setLayoutParams(r23);
        AlbumID3 r25 = (AlbumID3) this.r.get(r6);
        ((TextView) r22.p).setText(r25.getName());
        ((TextView) r22.q).setText(r25.getArtist());
        Context r26 = r21.a.getContext();
        String r27 = r25.getCoverArtId();
        c04 r28 = a.c(r26);
        if (r27 == null) goto L23;
        r1 = wg0.b(ud3.t(), r27);
    L23:
        vz3 r29 = b11.g(r26, r27, 2, r28, r1).T(xv0.b());
        if (ud3.R() == false) goto L26;
        r29 = (vz3) r29.l();
    L26:
        r29.K((ImageView) r22.o);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r6, int r7) {
        switch(this.q) {
            case 0: goto L18;
            case 1: goto L11;
            default: goto L4;
        };
    L4:
        View r8 = b11.i(r6, R.layout.item_home_similar_track, r6, false);
        int r2 = R.id.title_track_label;
        TextView r3 = (TextView) uo.s(r8, R.id.title_track_label);
        if (r3 == null) goto L9;
        r2 = R.id.track_cover_image_view;
        ImageView r4 = (ImageView) uo.s(r8, R.id.track_cover_image_view);
        if (r4 == null) goto L9;
        qp4 r0 = new qp4((ConstraintLayout) r8, r3, r4);
        ut4.c().b(r6.getContext());
        this.s = ut4.c().d(r6.getContext());
        return new xd4(this, r0);
    L9:
        nz2.n("Missing required view with ID: ".concat(r8.getResources().getResourceName(r2)));
        return null;
    L11:
        View r9 = b11.i(r6, R.layout.item_artist_carousel, r6, false);
        int r5 = R.id.artist_cover_image_view;
        ShapeableImageView r10 = (ShapeableImageView) uo.s(r9, R.id.artist_cover_image_view);
        if (r10 == null) goto L16;
        r5 = R.id.artist_name_label;
        TextView r11 = (TextView) uo.s(r9, R.id.artist_name_label);
        if (r11 == null) goto L16;
        ns3 r1 = new ns3((ConstraintLayout) r9, r10, r11, 5);
        ut4.c().b(r6.getContext());
        this.s = ut4.c().d(r6.getContext());
        return new cj(this, r1);
    L16:
        nz2.n("Missing required view with ID: ".concat(r9.getResources().getResourceName(r5)));
        return null;
    L18:
        bq4 r12 = bq4.m(LayoutInflater.from(r6.getContext()), r6);
        ut4.c().b(r6.getContext());
        this.s = ut4.c().d(r6.getContext());
        return new r6(this, r12);
    }

    public void p(List r1) {
        this.r = r1;
        d();
    }

    public s6(cp1 r2) {
        this.q = 2;
        this.s = 400;
        this.t = r2;
        this.r = Collections.EMPTY_LIST;
    }

    public s6(ClickCallback r2) {
        this.q = 0;
        this.s = 400;
        this.t = r2;
        this.r = Collections.EMPTY_LIST;
    }
}
