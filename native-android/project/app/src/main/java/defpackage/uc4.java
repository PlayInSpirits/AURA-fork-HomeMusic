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

    public uc4(cp1 r1, int r2) {
        this.q = r2;
        switch(r2) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.r = r1;
        this.s = Collections.EMPTY_LIST;
        return;
    L6:
        this.r = r1;
        this.s = Collections.EMPTY_LIST;
    }

    @Override // defpackage.dw3
    public final int a() {
        switch(this.q) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.s.size();
    L7:
        return this.s.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 r5, int r6) {
        switch(this.q) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        int r4 = ((Integer) this.s.get(r6)).intValue();
        ((TextView) ((he5) r5).u.o).setText(Integer.toString(r4));
        return;
    L6:
        tc4 r7 = (tc4) r5;
        Share r8 = (Share) this.s.get(r6);
        x12 r9 = r7.u;
        r9.e.setText(r8.getDescription());
        TextView r0 = r9.c;
        View r10 = r7.a;
        r0.setText(r10.getContext().getString(R.string.share_subtitle_item, new Object[]{g12.x(r8.getExpires())}));
        if (r8.getEntries() != null) goto L9;
        return;
    L9:
        if (r8.getEntries().isEmpty() == true) goto L20;
        Context r11 = r10.getContext();
        String r12 = r8.getEntries().get(0).getCoverArtId();
        c04 r1 = a.c(r11);
        if (r12 == null) goto L13;
        String r2 = wg0.b(ud3.t(), r12);
    L14:
        vz3 r13 = b11.g(r11, r12, 2, r1, r2).T(xv0.b());
        if (ud3.R() == false) goto L17;
        r13 = (vz3) r13.l();
    L17:
        r13.K(r9.b);
        return;
    L13:
        r2 = null;
        goto L14
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r10, int r11) {
        switch(this.q) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        View r12 = b11.i(r10, R.layout.item_home_year, r10, false);
        int r13 = R.id.card_view;
        if (((CardView) uo.s(r12, R.id.card_view)) == null) goto L9;
        r13 = R.id.year_label;
        TextView r2 = (TextView) uo.s(r12, R.id.year_label);
        if (r2 == null) goto L9;
        return new he5(this, new wo0((LinearLayout) r12, r2));
    L9:
        nz2.n("Missing required view with ID: ".concat(r12.getResources().getResourceName(r13)));
        return null;
    L11:
        View r14 = b11.i(r10, R.layout.item_horizontal_share, r10, false);
        int r15 = R.id.share_button;
        FrameLayout r5 = (FrameLayout) uo.s(r14, R.id.share_button);
        if (r5 == null) goto L20;
        r15 = R.id.share_cover_image_view;
        ImageView r6 = (ImageView) uo.s(r14, R.id.share_cover_image_view);
        if (r6 == null) goto L20;
        r15 = R.id.share_subtitle_text_view;
        TextView r7 = (TextView) uo.s(r14, R.id.share_subtitle_text_view);
        if (r7 == null) goto L20;
        r15 = R.id.share_title_text_view;
        TextView r8 = (TextView) uo.s(r14, R.id.share_title_text_view);
        if (r8 == null) goto L20;
        return new tc4(this, new x12((ConstraintLayout) r14, r5, r6, r7, r8));
    L20:
        nz2.n("Missing required view with ID: ".concat(r14.getResources().getResourceName(r15)));
        return null;
    }
}
