package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
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

    public ou3() {
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void J() {
        super.J();
        this.B0 = null;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        if (Y().getParcelable("TRACK_OBJECT") == null) goto L6;
        pu3 r0 = this.C0;
        r0.f = (Child) Y().getParcelable("TRACK_OBJECT");
        r0.g = null;
        r0.h = null;
    L11:
        pu3 r1 = this.C0;
        Child r2 = r1.f;
        if (r2 == null) goto L15;
        xi4 r3 = r1.c;
        String r4 = r2.getId();
        r3.getClass();
        final int r5 = 0;
        xi4.r(r4).e(this, new nu3(this, r5));
        return;
    L15:
        AlbumID3 r6 = r1.g;
        if (r6 == null) goto L19;
        rv2 r7 = r1.d;
        String r8 = r6.getId();
        r7.getClass();
        final int r9 = 1;
        rv2.j(r8).e(this, new nu3(this, r9));
        return;
    L19:
        ArtistID3 r10 = r1.h;
        if (r10 == null) goto L23;
        pa r11 = r1.e;
        String r12 = r10.getId();
        r11.getClass();
        final int r13 = 2;
        pa.v(r12).e(this, new nu3(this, r13));
        return;
    L23:
        return;
    L6:
        if (Y().getParcelable("ALBUM_OBJECT") == null) goto L9;
        pu3 r14 = this.C0;
        AlbumID3 r15 = (AlbumID3) Y().getParcelable("ALBUM_OBJECT");
        r14.f = null;
        r14.g = r15;
        r14.h = null;
        goto L11
    L9:
        if (Y().getParcelable("ARTIST_OBJECT") == null) goto L11;
        pu3 r16 = this.C0;
        ArtistID3 r17 = (ArtistID3) Y().getParcelable("ARTIST_OBJECT");
        r16.f = null;
        r16.g = null;
        r16.h = r17;
        goto L11
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r6) {
        View r7 = o().inflate(R.layout.dialog_rating, null, false);
        RatingBar r3 = (RatingBar) uo.s(r7, R.id.rating_bar);
        if (r3 == null) goto L10;
        this.B0 = new wo0((ConstraintLayout) r7, r3);
        nc1 r8 = X();
        e75 r0 = r8.d();
        b75 r4 = gh0.r(r8);
        bq4 r5 = new bq4(r0, r4, b11.e(r8, r4));
        i30 r9 = kx3.a(pu3.class);
        String r1 = r9.b();
        if (r1 == null) goto L8;
        this.C0 = (pu3) r5.l(r9, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r1));
        vg2 r10 = new vg2(l(), 0).q((ConstraintLayout) this.B0.n);
        r10.p(R.string.rating_dialog_title);
        return r10.j(R.string.rating_dialog_negative_button, new wr(10)).l(R.string.rating_dialog_positive_button, new vr(7, this)).create();
    L8:
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L10:
        nz2.n("Missing required view with ID: ".concat(r7.getResources().getResourceName(R.id.rating_bar)));
        return null;
    }
}
