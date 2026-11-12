package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Genre;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.subsonic.models.PodcastChannel;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.GenreCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelCatalogueFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ej extends dw3 implements Filterable {
    public final /* synthetic */ int q;
    public List r;
    public ArrayList s;
    public final ClickCallback t;
    public final Filter u;

    public ej(PodcastChannelCatalogueFragment r3) {
        this.q = 3;
        this.u = new o7(this, 8);
        this.t = r3;
        this.r = Collections.EMPTY_LIST;
    }

    @Override // defpackage.dw3
    public final int a() {
        switch(this.q) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return this.r.size();
    L7:
        return this.r.size();
    L9:
        return this.r.size();
    L11:
        return this.r.size();
    }

    @Override // defpackage.dw3
    public long b(int r2) {
        switch(this.q) {
            case 0: goto L9;
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return super.b(r2);
    L7:
        return r2;
    L9:
        return r2;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r7, int r8) {
        String r1 = null;
        switch(this.q) {
            case 0: goto L22;
            case 1: goto L20;
            case 2: goto L12;
            default: goto L4;
        };
    L4:
        vm3 r9 = (vm3) r7;
        PodcastChannel r6 = (PodcastChannel) this.r.get(r8);
        jv3 r10 = r9.u;
        ((TextView) r10.p).setText(r6.getTitle());
        Context r11 = r9.a.getContext();
        String r12 = r6.getCoverArtId();
        c04 r0 = a.c(r11);
        if (r12 == null) goto L7;
        r1 = wg0.b(ud3.t(), r12);
    L7:
        vz3 r13 = b11.g(r11, r12, 7, r0, r1).T(xv0.b());
        if (ud3.R() == false) goto L10;
        r13 = (vz3) r13.l();
    L10:
        r13.K((ImageView) r10.o);
        return;
    L12:
        yl3 r14 = (yl3) r7;
        Playlist r15 = (Playlist) this.r.get(r8);
        x12 r16 = r14.u;
        r16.e.setText(r15.getName());
        TextView r2 = r16.c;
        View r17 = r14.a;
        r2.setText(r17.getContext().getString(R.string.playlist_counted_tracks, new Object[]{Integer.valueOf(r15.getSongCount()), e03.h(Long.valueOf(r15.getDuration()), false)}));
        Context r18 = r17.getContext();
        String r19 = r15.getCoverArtId();
        c04 r3 = a.c(r18);
        if (r19 == null) goto L15;
        r1 = wg0.b(ud3.t(), r19);
    L15:
        vz3 r20 = b11.g(r18, r19, 6, r3, r1).T(xv0.b());
        if (ud3.R() == false) goto L18;
        r20 = (vz3) r20.l();
    L18:
        r20.K(r16.b);
        return;
    L20:
        Genre r21 = (Genre) this.r.get(r8);
        ((eh1) r7).u.b.setText(r21.getGenre());
        return;
    L22:
        dj r22 = (dj) r7;
        ArtistID3 r23 = (ArtistID3) this.r.get(r8);
        r20 r24 = r22.u;
        ((TextView) r24.q).setText(r23.getName());
        Context r25 = r22.a.getContext();
        String r26 = r23.getCoverArtId();
        c04 r4 = a.c(r25);
        if (r26 == null) goto L25;
        r1 = wg0.b(ud3.t(), r26);
    L25:
        vz3 r27 = b11.g(r25, r26, 3, r4, r1).T(xv0.b());
        if (ud3.R() == false) goto L28;
        r27 = (vz3) r27.l();
    L28:
        r27.K((ImageView) r24.p);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        switch(this.q) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return (o7) this.u;
    L7:
        return (o7) this.u;
    L9:
        return (o7) this.u;
    L11:
        return (o7) this.u;
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r10, int r11) {
        switch(this.q) {
            case 0: goto L29;
            case 1: goto L22;
            case 2: goto L11;
            default: goto L4;
        };
    L4:
        View r12 = b11.i(r10, R.layout.item_home_catalogue_podcast_channel, r10, false);
        int r13 = R.id.podcast_channel_catalogue_cover_image_view;
        ImageView r2 = (ImageView) uo.s(r12, R.id.podcast_channel_catalogue_cover_image_view);
        if (r2 == null) goto L9;
        r13 = R.id.podcast_channel_title_label;
        TextView r3 = (TextView) uo.s(r12, R.id.podcast_channel_title_label);
        if (r3 == null) goto L9;
        return new vm3(this, new jv3((ConstraintLayout) r12, r2, r3));
    L9:
        nz2.n("Missing required view with ID: ".concat(r12.getResources().getResourceName(r13)));
        return null;
    L11:
        View r14 = b11.i(r10, R.layout.item_horizontal_playlist, r10, false);
        int r15 = R.id.playlist_cover_image_view;
        ImageView r5 = (ImageView) uo.s(r14, R.id.playlist_cover_image_view);
        if (r5 == null) goto L20;
        r15 = R.id.playlist_more_button;
        FrameLayout r6 = (FrameLayout) uo.s(r14, R.id.playlist_more_button);
        if (r6 == null) goto L20;
        r15 = R.id.playlist_subtitle_text_view;
        TextView r7 = (TextView) uo.s(r14, R.id.playlist_subtitle_text_view);
        if (r7 == null) goto L20;
        r15 = R.id.playlist_title_text_view;
        TextView r8 = (TextView) uo.s(r14, R.id.playlist_title_text_view);
        if (r8 == null) goto L20;
        return new yl3(this, new x12((ConstraintLayout) r14, r5, r6, r7, r8));
    L20:
        nz2.n("Missing required view with ID: ".concat(r14.getResources().getResourceName(r15)));
        return null;
    L22:
        View r16 = b11.i(r10, R.layout.item_library_catalogue_genre, r10, false);
        int r17 = R.id.card_view;
        if (((CardView) uo.s(r16, R.id.card_view)) == null) goto L27;
        r17 = R.id.genre_label;
        TextView r4 = (TextView) uo.s(r16, R.id.genre_label);
        if (r4 == null) goto L27;
        return new eh1(this, new ie1((LinearLayout) r16, r4));
    L27:
        nz2.n("Missing required view with ID: ".concat(r16.getResources().getResourceName(r17)));
        return null;
    L29:
        View r18 = b11.i(r10, R.layout.item_library_catalogue_artist, r10, false);
        int r19 = R.id.artist_catalogue_cover_image_view;
        ImageView r9 = (ImageView) uo.s(r18, R.id.artist_catalogue_cover_image_view);
        if (r9 == null) goto L34;
        r19 = R.id.artist_name_label;
        TextView r20 = (TextView) uo.s(r18, R.id.artist_name_label);
        if (r20 == null) goto L34;
        return new dj(this, new r20((ConstraintLayout) r18, r9, r20, false, 7));
    L34:
        nz2.n("Missing required view with ID: ".concat(r18.getResources().getResourceName(r19)));
        return null;
    }

    public void p(List r2) {
        this.r = r2;
        this.s = new ArrayList(r2);
        d();
    }

    public void q(String r3) {
        byte r1 = -1;
        switch(r3.hashCode()) {
            case -980849088: goto L14;
            case 566407394: goto L10;
            case 1636222570: goto L6;
            default: goto L17;
        };
    L17:
        switch(r1) {
            case 0: goto L21;
            case 1: goto L20;
            case 2: goto L19;
            default: goto L22;
        };
    L19:
        this.r.sort(Comparator.comparing(new m7(9), String.CASE_INSENSITIVE_ORDER));
        goto L22
    L20:
        Collections.shuffle(this.r);
        goto L22
    L21:
        this.r.sort(Comparator.comparing(new m7(10)).reversed());
    L22:
        d();
        return;
    L6:
        if (r3.equals("ARTIST_ORDER_BY_NAME") == false) goto L17;
        r1 = 2;
        goto L17
    L10:
        if (r3.equals("ARTIST_ORDER_BY_RANDOM") == false) goto L17;
        r1 = 1;
        goto L17
    L14:
        if (r3.equals("ARTIST_ORDER_BY_ALBUM_COUNT") == false) goto L17;
        r1 = 0;
        goto L17
    }

    public ej(GenreCatalogueFragment r3) {
        this.q = 1;
        this.u = new o7(this, 5);
        this.t = r3;
        this.r = Collections.EMPTY_LIST;
    }

    public ej(ArtistCatalogueFragment r3) {
        this.q = 0;
        this.u = new o7(this, 2);
        this.t = r3;
        this.r = Collections.EMPTY_LIST;
    }

    public ej(ClickCallback r3) {
        this.q = 2;
        this.u = new o7(this, 7);
        this.t = r3;
        this.r = Collections.EMPTY_LIST;
    }
}
