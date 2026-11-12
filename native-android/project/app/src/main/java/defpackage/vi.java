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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vi extends dw3 {
    public final ClickCallback q;
    public final boolean r;
    public final boolean s;
    public int t;
    public List u;

    public vi(ClickCallback r2, Boolean r3, Boolean r4) {
        this.t = 400;
        this.q = r2;
        this.r = r3.booleanValue();
        this.s = r4.booleanValue();
        this.u = Collections.EMPTY_LIST;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.u.size();
    }

    @Override // defpackage.dw3
    public final long b(int r1) {
        return r1;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r4, int r5) {
        ui r6 = (ui) r4;
        yc5 r0 = r6.u;
        ViewGroup.LayoutParams r1 = ((ImageView) r0.o).getLayoutParams();
        int r2 = this.t;
        r1.width = r2;
        r1.height = r2;
        ((ImageView) r0.o).setLayoutParams(r1);
        ArtistID3 r3 = (ArtistID3) this.u.get(r5);
        ((TextView) r0.p).setText(r3.getName());
        Context r7 = r6.a.getContext();
        String r8 = r3.getCoverArtId();
        c04 r9 = a.c(r7);
        if (r8 == null) goto L5;
        String r10 = wg0.b(ud3.t(), r8);
    L6:
        vz3 r11 = b11.g(r7, r8, 3, r9, r10).T(xv0.b());
        if (ud3.R() == false) goto L9;
        r11 = (vz3) r11.l();
    L9:
        r11.K((ImageView) r0.o);
        return;
    L5:
        r10 = null;
        goto L6
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r4, int r5) {
        View r6 = b11.i(r4, R.layout.item_library_artist, r4, false);
        int r0 = R.id.artist_cover_image_view;
        ImageView r1 = (ImageView) uo.s(r6, R.id.artist_cover_image_view);
        if (r1 == null) goto L8;
        r0 = R.id.artist_name_label;
        TextView r2 = (TextView) uo.s(r6, R.id.artist_name_label);
        if (r2 == null) goto L8;
        yc5 r3 = new yc5();
        r3.n = (ConstraintLayout) r6;
        r3.o = r1;
        r3.p = r2;
        ut4.c().b(r4.getContext());
        this.t = ut4.c().d(r4.getContext());
        return new ui(this, r3);
    L8:
        nz2.n("Missing required view with ID: ".concat(r6.getResources().getResourceName(r0)));
        return null;
    }
}
