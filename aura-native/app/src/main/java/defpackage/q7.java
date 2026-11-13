package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.fragment.AlbumCatalogueFragment;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class q7 extends dw3 implements Filterable {
    public final /* synthetic */ int q;
    public final boolean r;
    public List s;
    public List t;
    public final ClickCallback u;
    public Object v;

    public q7(AlbumCatalogueFragment albumCatalogueFragment) {
        this.q = 0;
        this.v = new o7(this, 0);
        this.u = albumCatalogueFragment;
        List list = Collections.EMPTY_LIST;
        this.s = list;
        this.t = list;
        this.r = true;
    }

    @Override // defpackage.dw3
    public final int a() {
        switch (this.q) {
            case 0:
                return this.s.size();
            default:
                return this.t.size();
        }
    }

    @Override // defpackage.dw3
    public long b(int i) {
        switch (this.q) {
            case 0:
                return i;
            default:
                return super.b(i);
        }
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        switch (this.q) {
            case 0:
                p7 p7Var = (p7) cx3Var;
                AlbumID3 albumID3 = (AlbumID3) this.s.get(i);
                ss0 ss0Var = p7Var.u;
                ((TextView) ss0Var.p).setText(albumID3.getName());
                ((TextView) ss0Var.q).setText(albumID3.getArtist());
                ((TextView) ss0Var.q).setVisibility(this.r ? 0 : 8);
                Context context = p7Var.a.getContext();
                String coverArtId = albumID3.getCoverArtId();
                vz3 T = b11.g(context, coverArtId, 2, a.c(context), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    T = (vz3) T.l();
                }
                T.K((ImageView) ss0Var.o);
                break;
            default:
                mo1 mo1Var = (mo1) cx3Var;
                Playlist playlist = (Playlist) this.t.get(i);
                View view = mo1Var.a;
                Resources resources = view.getResources();
                mo1Var.v.setText(playlist.getName());
                mo1Var.w.setText(resources.getQuantityString(R.plurals.homemusic_tracks_count, playlist.getSongCount(), Integer.valueOf(playlist.getSongCount())));
                Context context2 = view.getContext();
                String coverArtId2 = playlist.getCoverArtId();
                vz3 T2 = b11.g(context2, coverArtId2, 6, a.c(context2), coverArtId2 != null ? wg0.b(ud3.t(), coverArtId2) : null).T(xv0.b());
                if (ud3.R()) {
                    T2 = (vz3) T2.l();
                }
                T2.K(mo1Var.u);
                break;
        }
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        switch (this.q) {
            case 0:
                return (o7) this.v;
            default:
                return new o7(this, 6);
        }
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        switch (this.q) {
            case 0:
                return new p7(this, ss0.C(LayoutInflater.from(viewGroup.getContext()), viewGroup));
            default:
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                if (this.r) {
                    ss0 C = ss0.C(from, viewGroup);
                    ConstraintLayout constraintLayout = (ConstraintLayout) C.n;
                    constraintLayout.getClass();
                    return new mo1(this, constraintLayout, (ImageView) C.o, (TextView) C.p, (TextView) C.q);
                }
                bq4 m = bq4.m(from, viewGroup);
                ImageView imageView = (ImageView) m.o;
                int d = ut4.c().d(viewGroup.getContext());
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = d;
                layoutParams.height = d;
                imageView.setLayoutParams(layoutParams);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) m.n;
                constraintLayout2.getClass();
                return new mo1(this, constraintLayout2, imageView, (TextView) m.p, (TextView) m.q);
        }
    }

    public q7(ClickCallback clickCallback, boolean z) {
        this.q = 1;
        this.u = clickCallback;
        this.r = z;
        u01 u01Var = u01.n;
        this.s = u01Var;
        this.t = u01Var;
        this.v = "";
    }
}
