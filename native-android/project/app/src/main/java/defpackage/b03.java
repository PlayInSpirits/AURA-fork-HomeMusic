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
    public List r;

    public b03(IndexFragment r1) {
        this.q = r1;
        this.r = Collections.EMPTY_LIST;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.r.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 r4, int r5) {
        a03 r6 = (a03) r4;
        Artist r3 = (Artist) this.r.get(r5);
        z12 r7 = r6.u;
        r7.e.setText(r3.getName());
        Context r8 = r6.a.getContext();
        String r9 = r3.getName();
        c04 r0 = a.c(r8);
        if (r9 == null) goto L5;
        String r1 = wg0.b(ud3.t(), r9);
    L6:
        vz3 r10 = b11.g(r8, r9, 5, r0, r1).T(xv0.b());
        if (ud3.R() == false) goto L9;
        r10 = (vz3) r10.l();
    L9:
        r10.K(r7.b);
        return;
    L5:
        r1 = null;
        goto L6
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r8, int r9) {
        View r10 = b11.i(r8, R.layout.item_library_music_index, r8, false);
        int r11 = R.id.music_index_cover_image_view;
        ImageView r3 = (ImageView) uo.s(r10, R.id.music_index_cover_image_view);
        if (r3 == null) goto L12;
        r11 = R.id.music_index_more_button;
        ImageView r4 = (ImageView) uo.s(r10, R.id.music_index_more_button);
        if (r4 == null) goto L12;
        r11 = R.id.music_index_play_button;
        ImageView r5 = (ImageView) uo.s(r10, R.id.music_index_play_button);
        if (r5 == null) goto L12;
        r11 = R.id.music_index_title_text_view;
        TextView r6 = (TextView) uo.s(r10, R.id.music_index_title_text_view);
        if (r6 == null) goto L12;
        return new a03(this, new z12((ConstraintLayout) r10, r3, r4, r5, r6));
    L12:
        nz2.n("Missing required view with ID: ".concat(r10.getResources().getResourceName(r11)));
        return null;
    }
}
