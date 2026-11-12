package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vq0 extends dw3 {
    public final cp1 q;
    public List r;
    public int s;
    public int t;

    public vq0(cp1 r2) {
        this.s = 800;
        this.t = 400;
        this.q = r2;
        this.r = Collections.EMPTY_LIST;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.r.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 r4, int r5) {
        uq0 r6 = (uq0) r4;
        na4 r0 = r6.u;
        ViewGroup.LayoutParams r1 = ((ImageView) r0.p).getLayoutParams();
        r1.width = this.s;
        r1.height = this.t;
        ((ImageView) r0.p).setLayoutParams(r1);
        Child r3 = (Child) this.r.get(r5);
        ((TextView) r0.q).setText(r3.getTitle());
        ((TextView) r0.o).setText(r3.getAlbum());
        Context r7 = r6.a.getContext();
        String r8 = r3.getCoverArtId();
        c04 r9 = a.c(r7);
        if (r8 == null) goto L5;
        String r2 = wg0.b(ud3.t(), r8);
    L6:
        vz3 r10 = b11.g(r7, r8, 9, r9, r2).T(xv0.b());
        if (ud3.R() == false) goto L9;
        r10 = (vz3) r10.l();
    L9:
        r10.K((ImageView) r0.p);
        return;
    L5:
        r2 = null;
        goto L6
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r7, int r8) {
        View r9 = b11.i(r7, R.layout.item_home_discover_song, r7, false);
        int r0 = R.id.album_discover_song_label;
        TextView r1 = (TextView) uo.s(r9, R.id.album_discover_song_label);
        if (r1 == null) goto L28;
        r0 = R.id.discover_song_cover_image_view;
        ImageView r2 = (ImageView) uo.s(r9, R.id.discover_song_cover_image_view);
        if (r2 == null) goto L28;
        r0 = R.id.title_discover_song_label;
        TextView r3 = (TextView) uo.s(r9, R.id.title_discover_song_label);
        if (r3 == null) goto L28;
        na4 r4 = new na4((ConstraintLayout) r9, r1, r2, r3);
        ut4 r10 = ut4.c();
        Context r5 = r7.getContext();
        r10.getClass();
        DisplayMetrics r6 = r5.getResources().getDisplayMetrics();
        float r11 = r6.widthPixels;
        float r12 = r6.heightPixels;
        int r13 = Math.max(2, Math.min(6, ud3.I()));
        if (r13 != 3) goto L11;
        float r14 = 1.25f;
    L20:
        int r15 = Math.round(Math.min(r11, r12) / r14) - 50;
        r10.f = r15;
        r10.g = Math.round(r15 * 0.6f);
        r10.j = true;
        ut4 r16 = ut4.c();
        Context r17 = r7.getContext();
        if (r16.j == true) goto L23;
        r16.b(r17);
    L23:
        this.s = r16.f;
        ut4 r18 = ut4.c();
        Context r19 = r7.getContext();
        if (r18.j == true) goto L26;
        r18.b(r19);
    L26:
        this.t = r18.g;
        return new uq0(this, r4);
    L11:
        if (r13 != 4) goto L13;
        r14 = 1.5f;
        goto L20
    L13:
        if (r13 == 5) goto L17;
        if (r13 == 6) goto L16;
        r14 = 1.0f;
        goto L20
    L16:
        r14 = 2.0f;
        goto L20
    L17:
        r14 = 1.75f;
    L28:
        nz2.n("Missing required view with ID: ".concat(r9.getResources().getResourceName(r0)));
        return null;
    }

    @Override // defpackage.dw3
    public final void l(cx3 r3) {
        ((ImageView) ((uq0) r3).u.p).animate().setDuration(20000).setStartDelay(10).setInterpolator(new AccelerateDecelerateInterpolator()).scaleX(1.4f).scaleY(1.4f).start();
    }

    @Override // defpackage.dw3
    public final void m(cx3 r1) {
        ((ImageView) ((uq0) r1).u.p).animate().cancel();
    }
}
