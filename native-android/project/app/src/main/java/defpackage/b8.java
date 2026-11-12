package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b8 extends dw3 implements Filterable {
    public final /* synthetic */ int q;
    public final ClickCallback r;
    public List s;
    public List t;
    public String u;
    public final Filter v;

    public b8(ClickCallback r3, int r4) {
        this.q = r4;
        switch(r4) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.v = new o7(this, 1);
        this.r = r3;
        List r5 = Collections.EMPTY_LIST;
        this.t = r5;
        this.s = r5;
        this.u = "";
        return;
    L6:
        this.v = new o7(this, 3);
        this.r = r3;
        List r6 = Collections.EMPTY_LIST;
        this.t = r6;
        this.s = r6;
        this.u = "";
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
        return this.t.size();
    }

    @Override // defpackage.dw3
    public long b(int r2) {
        switch(this.q) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.b(r2);
    L7:
        return r2;
    }

    @Override // defpackage.dw3
    public int c(int r2) {
        switch(this.q) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        return 0;
    L5:
        return super.c(r2);
    }

    @Override // defpackage.dw3
    public final void g(cx3 r5, int r6) {
        String r1 = null;
        switch(this.q) {
            case 0: goto L16;
            default: goto L4;
        };
    L4:
        jj r7 = (jj) r5;
        ArtistID3 r4 = (ArtistID3) this.t.get(r6);
        x12 r8 = r7.u;
        r8.e.setText(r4.getName());
        if (r4.getAlbumCount() <= 0) goto L7;
        r8.c.setText("Album count: " + r4.getAlbumCount());
    L8:
        Context r9 = r7.a.getContext();
        String r10 = r4.getCoverArtId();
        c04 r0 = a.c(r9);
        if (r10 == null) goto L11;
        r1 = wg0.b(ud3.t(), r10);
    L11:
        vz3 r11 = b11.g(r9, r10, 3, r0, r1).T(xv0.b());
        if (ud3.R() == false) goto L14;
        r11 = (vz3) r11.l();
    L14:
        r11.K(r8.b);
        return;
    L7:
        r8.c.setVisibility(8);
        goto L8
    L16:
        a8 r12 = (a8) r5;
        AlbumID3 r13 = (AlbumID3) this.t.get(r6);
        x12 r14 = r12.u;
        r14.e.setText(r13.getName());
        r14.c.setText(r13.getArtist());
        Context r15 = r12.a.getContext();
        String r16 = r13.getCoverArtId();
        c04 r2 = a.c(r15);
        if (r16 == null) goto L19;
        r1 = wg0.b(ud3.t(), r16);
    L19:
        vz3 r17 = b11.g(r15, r16, 2, r2, r1).T(xv0.b());
        if (ud3.R() == false) goto L22;
        r17 = (vz3) r17.l();
    L22:
        r17.K(r14.b);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        switch(this.q) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return (o7) this.v;
    L7:
        return (o7) this.v;
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r10, int r11) {
        switch(this.q) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        View r12 = b11.i(r10, R.layout.item_horizontal_artist, r10, false);
        int r13 = R.id.artist_cover_image_view;
        ImageView r5 = (ImageView) uo.s(r12, R.id.artist_cover_image_view);
        if (r5 == null) goto L13;
        r13 = R.id.artist_info_text_view;
        TextView r6 = (TextView) uo.s(r12, R.id.artist_info_text_view);
        if (r6 == null) goto L13;
        r13 = R.id.artist_more_button;
        FrameLayout r7 = (FrameLayout) uo.s(r12, R.id.artist_more_button);
        if (r7 == null) goto L13;
        r13 = R.id.artist_name_text_view;
        TextView r8 = (TextView) uo.s(r12, R.id.artist_name_text_view);
        if (r8 == null) goto L13;
        return new jj(this, new x12((ConstraintLayout) r12, r5, r6, r7, r8));
    L13:
        nz2.n("Missing required view with ID: ".concat(r12.getResources().getResourceName(r13)));
        return null;
    L15:
        View r14 = b11.i(r10, R.layout.item_horizontal_album, r10, false);
        int r15 = R.id.album_artist_text_view;
        TextView r9 = (TextView) uo.s(r14, R.id.album_artist_text_view);
        if (r9 == null) goto L24;
        r15 = R.id.album_cover_image_view;
        ImageView r16 = (ImageView) uo.s(r14, R.id.album_cover_image_view);
        if (r16 == null) goto L24;
        r15 = R.id.album_more_button;
        FrameLayout r17 = (FrameLayout) uo.s(r14, R.id.album_more_button);
        if (r17 == null) goto L24;
        r15 = R.id.album_title_text_view;
        TextView r18 = (TextView) uo.s(r14, R.id.album_title_text_view);
        if (r18 == null) goto L24;
        return new a8(this, new x12((ConstraintLayout) r14, r9, r16, r17, r18));
    L24:
        nz2.n("Missing required view with ID: ".concat(r14.getResources().getResourceName(r15)));
        return null;
    }

    public final void p(String r6) {
        byte r1 = 2;
        switch(this.q) {
            case 0: goto L27;
            default: goto L5;
        };
    L5:
        switch(r6.hashCode()) {
            case -1637097955: goto L15;
            case -1566758907: goto L11;
            case 1636222570: goto L8;
            default: goto L6;
        };
    L6:
        r1 = -1;
    L19:
        switch(r1) {
            case 0: goto L23;
            case 1: goto L22;
            case 2: goto L21;
            default: goto L24;
        };
    L21:
        this.t.sort(Comparator.comparing(new m7(9)));
        goto L24
    L22:
        this.t.sort(Comparator.comparing(new m7(11), Comparator.nullsLast(Comparator.reverseOrder())));
        goto L24
    L23:
        this.t.sort(Comparator.comparing(new m7(11), Comparator.nullsLast(Comparator.naturalOrder())));
    L24:
        d();
        return;
    L8:
        if (r6.equals("ARTIST_ORDER_BY_NAME") == true) goto L19;
        r1 = -1;
        goto L19
    L11:
        if (r6.equals("ARTIST_ORDER_BY_MOST_RECENTLY_STARRED") == false) goto L49;
        r1 = 1;
        goto L19
    L49:
        r1 = -1;
        goto L19
    L15:
        if (r6.equals("ARTIST_ORDER_BY_LEAST_RECENTLY_STARRED") == false) goto L50;
        r1 = 0;
        goto L19
    L50:
        r1 = -1;
        goto L19
    L27:
        switch(r6.hashCode()) {
            case -569472142: goto L37;
            case 834629925: goto L33;
            case 1283920893: goto L30;
            default: goto L28;
        };
    L28:
        r1 = -1;
    L41:
        switch(r1) {
            case 0: goto L45;
            case 1: goto L44;
            case 2: goto L43;
            default: goto L46;
        };
    L43:
        this.t.sort(Comparator.comparing(new m7(7), Comparator.nullsLast(Comparator.reverseOrder())));
        goto L46
    L44:
        this.t.sort(Comparator.comparing(new m7(7), Comparator.nullsLast(Comparator.naturalOrder())));
        goto L46
    L45:
        this.t.sort(Comparator.comparing(new m7(6)));
    L46:
        d();
        return;
    L30:
        if (r6.equals("ALBUM_ORDER_BY_MOST_RECENTLY_STARRED") == true) goto L41;
        r1 = -1;
        goto L41
    L33:
        if (r6.equals("ALBUM_ORDER_BY_LEAST_RECENTLY_STARRED") == false) goto L52;
        r1 = 1;
        goto L41
    L52:
        r1 = -1;
        goto L41
    L37:
        if (r6.equals("ALBUM_ORDER_BY_NAME") == false) goto L53;
        r1 = 0;
        goto L41
    L53:
        r1 = -1;
        goto L41
    }
}
