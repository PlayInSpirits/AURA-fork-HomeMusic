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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q7 extends dw3 implements Filterable {
    public final /* synthetic */ int q;
    public final boolean r;
    public List s;
    public List t;
    public final ClickCallback u;
    public Object v;

    public q7(AlbumCatalogueFragment r3) {
        this.q = 0;
        this.v = new o7(this, 0);
        this.u = r3;
        List r4 = Collections.EMPTY_LIST;
        this.s = r4;
        this.t = r4;
        this.r = true;
    }

    @Override // defpackage.dw3
    public final int a() {
        switch(this.q) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.t.size();
    L7:
        return this.s.size();
    }

    @Override // defpackage.dw3
    public long b(int r2) {
        switch(this.q) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.b(r2);
    L7:
        return r2;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r7, int r8) {
        String r1 = null;
        switch(this.q) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        mo1 r9 = (mo1) r7;
        Playlist r6 = (Playlist) this.t.get(r8);
        View r10 = r9.a;
        Resources r0 = r10.getResources();
        r9.v.setText(r6.getName());
        r9.w.setText(r0.getQuantityString(R.plurals.homemusic_tracks_count, r6.getSongCount(), new Object[]{Integer.valueOf(r6.getSongCount())}));
        Context r11 = r10.getContext();
        String r12 = r6.getCoverArtId();
        c04 r2 = a.c(r11);
        if (r12 == null) goto L7;
        r1 = wg0.b(ud3.t(), r12);
    L7:
        vz3 r13 = b11.g(r11, r12, 6, r2, r1).T(xv0.b());
        if (ud3.R() == false) goto L10;
        r13 = (vz3) r13.l();
    L10:
        r13.K(r9.u);
        return;
    L12:
        p7 r14 = (p7) r7;
        AlbumID3 r15 = (AlbumID3) this.s.get(r8);
        ss0 r3 = r14.u;
        ((TextView) r3.p).setText(r15.getName());
        ((TextView) r3.q).setText(r15.getArtist());
        TextView r4 = (TextView) r3.q;
        if (this.r == false) goto L15;
        int r16 = 0;
    L16:
        r4.setVisibility(r16);
        Context r17 = r14.a.getContext();
        String r18 = r15.getCoverArtId();
        c04 r19 = a.c(r17);
        if (r18 == null) goto L19;
        r1 = wg0.b(ud3.t(), r18);
    L19:
        vz3 r20 = b11.g(r17, r18, 2, r19, r1).T(xv0.b());
        if (ud3.R() == false) goto L22;
        r20 = (vz3) r20.l();
    L22:
        r20.K((ImageView) r3.o);
        return;
    L15:
        r16 = 8;
        goto L16
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        switch(this.q) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new o7(this, 6);
    L7:
        return (o7) this.v;
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r8, int r9) {
        switch(this.q) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        LayoutInflater r10 = LayoutInflater.from(r8.getContext());
        if (this.r == false) goto L7;
        ss0 r11 = ss0.C(r10, r8);
        ConstraintLayout r2 = (ConstraintLayout) r11.n;
        r2.getClass();
        return new mo1(this, r2, (ImageView) r11.o, (TextView) r11.p, (TextView) r11.q);
    L7:
        bq4 r7 = bq4.m(r10, r8);
        ImageView r4 = (ImageView) r7.o;
        int r12 = ut4.c().d(r8.getContext());
        ViewGroup.LayoutParams r13 = r4.getLayoutParams();
        r13.width = r12;
        r13.height = r12;
        r4.setLayoutParams(r13);
        ConstraintLayout r3 = (ConstraintLayout) r7.n;
        r3.getClass();
        return new mo1(this, r3, r4, (TextView) r7.p, (TextView) r7.q);
    L10:
        return new p7(this, ss0.C(LayoutInflater.from(r8.getContext()), r8));
    }

    public q7(ClickCallback r2, boolean r3) {
        this.q = 1;
        this.u = r2;
        this.r = r3;
        u01 r4 = u01.n;
        this.s = r4;
        this.t = r4;
        this.v = "";
    }
}
