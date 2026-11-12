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
    public int s = 800;
    public int t = 400;
    public List r = Collections.EMPTY_LIST;

    public vq0(cp1 cp1Var) {
        this.q = cp1Var;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.r.size();
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        uq0 uq0Var = (uq0) cx3Var;
        na4 na4Var = uq0Var.u;
        ViewGroup.LayoutParams layoutParams = ((ImageView) na4Var.p).getLayoutParams();
        layoutParams.width = this.s;
        layoutParams.height = this.t;
        ((ImageView) na4Var.p).setLayoutParams(layoutParams);
        Child child = (Child) this.r.get(i);
        ((TextView) na4Var.q).setText(child.getTitle());
        ((TextView) na4Var.o).setText(child.getAlbum());
        Context context = uq0Var.a.getContext();
        String coverArtId = child.getCoverArtId();
        vz3 vz3VarT = b11.g(context, coverArtId, 9, a.c(context), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
        if (ud3.R()) {
            vz3VarT = (vz3) vz3VarT.l();
        }
        vz3VarT.K((ImageView) na4Var.p);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        float f;
        View viewI = b11.i(viewGroup, R.layout.item_home_discover_song, viewGroup, false);
        int i2 = R.id.album_discover_song_label;
        TextView textView = (TextView) uo.s(viewI, R.id.album_discover_song_label);
        if (textView != null) {
            i2 = R.id.discover_song_cover_image_view;
            ImageView imageView = (ImageView) uo.s(viewI, R.id.discover_song_cover_image_view);
            if (imageView != null) {
                i2 = R.id.title_discover_song_label;
                TextView textView2 = (TextView) uo.s(viewI, R.id.title_discover_song_label);
                if (textView2 != null) {
                    na4 na4Var = new na4((ConstraintLayout) viewI, textView, imageView, textView2);
                    ut4 ut4VarC = ut4.c();
                    Context context = viewGroup.getContext();
                    ut4VarC.getClass();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f2 = displayMetrics.widthPixels;
                    float f3 = displayMetrics.heightPixels;
                    int iMax = Math.max(2, Math.min(6, ud3.I()));
                    if (iMax == 3) {
                        f = 1.25f;
                    } else if (iMax == 4) {
                        f = 1.5f;
                    } else if (iMax != 5) {
                        f = iMax != 6 ? 1.0f : 2.0f;
                    } else {
                        f = 1.75f;
                    }
                    int iRound = Math.round(Math.min(f2, f3) / f) - 50;
                    ut4VarC.f = iRound;
                    ut4VarC.g = Math.round(iRound * 0.6f);
                    ut4VarC.j = true;
                    ut4 ut4VarC2 = ut4.c();
                    Context context2 = viewGroup.getContext();
                    if (!ut4VarC2.j) {
                        ut4VarC2.b(context2);
                    }
                    this.s = ut4VarC2.f;
                    ut4 ut4VarC3 = ut4.c();
                    Context context3 = viewGroup.getContext();
                    if (!ut4VarC3.j) {
                        ut4VarC3.b(context3);
                    }
                    this.t = ut4VarC3.g;
                    return new uq0(this, na4Var);
                }
            }
        }
        nz2.n("Missing required view with ID: ".concat(viewI.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.dw3
    public final void l(cx3 cx3Var) {
        ((ImageView) ((uq0) cx3Var).u.p).animate().setDuration(20000L).setStartDelay(10L).setInterpolator(new AccelerateDecelerateInterpolator()).scaleX(1.4f).scaleY(1.4f).start();
    }

    @Override // defpackage.dw3
    public final void m(cx3 cx3Var) {
        ((ImageView) ((uq0) cx3Var).u.p).animate().cancel();
    }
}
