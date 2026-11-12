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
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.interfaces.ClickCallback;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.DiscTitle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ni4 extends dw3 implements Filterable {
    public bl2 A;
    public rm3 B;
    public final o7 C;
    public final ClickCallback q;
    public final boolean r;
    public final boolean s;
    public final AlbumID3 t;
    public List u;
    public final pk v;
    public String w;
    public String x;
    public boolean y;
    public List z;

    public ni4(le1 r4, ClickCallback r5, boolean r6, boolean r7, AlbumID3 r8) {
        this.v = new pk(this, new hh3(29));
        List r0 = Collections.EMPTY_LIST;
        this.z = r0;
        this.C = new o7(this, 9);
        this.q = r5;
        this.r = r6;
        this.s = r7;
        this.u = r0;
        this.w = "";
        this.t = r8;
        final int r9 = 0;
        o(false);
        if (r4 == null) goto L6;
        Runnable r10 = new ji4(this, r9);
        g51.d.e(r4, new d8(15, r10));
        final int r11 = 1;
        kb4.N(r4, new ji4(this, r11));
        return;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.v.f.size();
    }

    @Override // defpackage.dw3
    public final long b(int r1) {
        return r1;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r19, final int r20) {
        mi4 r2 = (mi4) r19;
        pk r3 = this.v;
        Child r4 = (Child) r3.f.get(r20);
        y12 r5 = r2.u;
        r5.q.setText(r4.getTitle());
        TextView r6 = r5.p;
        ConstraintLayout r7 = r5.m;
        ImageView r8 = r5.r;
        TextView r9 = r5.t;
        ConstraintLayout r10 = r5.e;
        TextView r11 = r5.f;
        FrameLayout r12 = r5.n;
        View r13 = r2.a;
        Context r14 = r13.getContext();
        if (this.s == false) goto L5;
        String r15 = r4.getAlbum();
    L6:
        r6.setText(r14.getString(R.string.song_subtitle_formatter, new Object[]{r15, e03.g(r4.getDuration()), e03.f(r4)}));
        Context r16 = r13.getContext();
        Integer r17 = r4.getTrack();
        if (r17 == null) goto L9;
        String r18 = String.valueOf(r17);
    L10:
        r9.setText(r18);
        if (ud3.o() != null) goto L17;
        eu0 r21 = au0.w(r13.getContext());
        String r110 = r4.getId();
        r21.getClass();
        if (eu0.d(r110) == false) goto L15;
        r12.setVisibility(0);
    L21:
        if (r12.getVisibility() != 0) goto L54;
        Context r22 = r12.getContext();
        r22.getClass();
        String r111 = ud3.o();
        ko1 r23 = ko1.n;
        ko1 r112 = ko1.p;
        if (r111 != null) goto L26;
        eu0 r24 = au0.w(r22);
        String r113 = r4.getId();
        r24.getClass();
        Integer r25 = eu0.c(r113);
        if (r25 != null) goto L32;
    L28:
        ko1 r26 = r23;
    L40:
        if (r26 != r23) goto L42;
        r12.setVisibility(8);
        goto L54
    L42:
        View r114 = r12.getChildAt(0);
        if (r114 != null) goto L45;
        r114 = r12;
    L45:
        Context r27 = r12.getContext();
        if (r26 != r112) goto L48;
        int r115 = R.drawable.ic_homemusic_on_phone;
    L49:
        r114.setBackground(r27.getDrawable(r115));
        Context r28 = r12.getContext();
        if (r26 != r112) goto L52;
        int r29 = R.string.homemusic_downloaded_on_phone;
    L53:
        r114.setContentDescription(r28.getString(r29));
        goto L54
    L52:
        r29 = R.string.homemusic_downloading_to_phone;
        goto L53
    L48:
        r115 = R.drawable.ic_homemusic_to_phone;
        goto L49
    L32:
        if (r25.intValue() == 4) goto L28;
        if (r25.intValue() == 5) goto L28;
        if (r25.intValue() == 3) goto L27;
        r26 = ko1.o;
    L27:
        r26 = r112;
        goto L40
    L26:
        if (g51.e(r4) == null) goto L28;
    L54:
        boolean r30 = this.r;
        if (r30 == false) goto L64;
        Context r31 = r13.getContext();
        String r116 = r4.getCoverArtId();
        c04 r117 = a.c(r31);
        if (r116 == null) goto L59;
        String r118 = wg0.b(ud3.t(), r116);
    L60:
        vz3 r32 = b11.g(r31, r116, 9, r117, r118).T(xv0.b());
        if (ud3.R() == false) goto L63;
        r32 = (vz3) r32.l();
    L63:
        r32.K(r8);
        goto L64
    L59:
        r118 = null;
    L64:
        if (r30 == false) goto L66;
        int r33 = 4;
    L67:
        r9.setVisibility(r33);
        if (r30 == false) goto L70;
        int r34 = 0;
    L71:
        r8.setVisibility(r34);
        if (r30 == true) goto L103;
        if (r20 == 0) goto L75;
    L77:
        if (r20 <= 0) goto L103;
        int r35 = r20 - 1;
        if (r3.f.get(r35) == null) goto L103;
        if (((Child) r3.f.get(r35)).getDiscNumber() == null) goto L103;
        if (((Child) r3.f.get(r20)).getDiscNumber() == null) goto L103;
        if (((Child) r3.f.get(r35)).getDiscNumber().intValue() >= ((Child) r3.f.get(r20)).getDiscNumber().intValue()) goto L103;
    L87:
        if (((Child) r3.f.get(r20)).getDiscNumber() == null) goto L89;
        r11.setText(r13.getContext().getString(R.string.disc_titleless, new Object[]{((Child) r3.f.get(r20)).getDiscNumber().toString()}));
        r10.setVisibility(0);
        r11.setVisibility(0);
        r5.d.setVisibility(0);
    L90:
        AlbumID3 r36 = this.t;
        if (r36 != null) goto L93;
    L104:
        int r37 = 0;
        if (xa3.u("rating_per_item", false) == false) goto L148;
        String r1 = r4.getId();
        if (r4.getStarred() == null) goto L109;
        boolean r38 = true;
    L110:
        boolean r39 = n61.f(1, r1, r38);
        if (r39 == false) goto L113;
    L116:
        int r40 = 0;
    L117:
        r7.setVisibility(r40);
        ImageView r41 = r5.k;
        if (r39 == false) goto L120;
        int r42 = 0;
    L121:
        r41.setVisibility(r42);
        LinearLayout r43 = r5.l;
        if (r4.getUserRating() != null) goto L125;
        r37 = 8;
    L125:
        r43.setVisibility(r37);
        if (r4.getUserRating() == null) goto L149;
        ImageView r44 = r5.i;
        Context r45 = r13.getContext();
        int r46 = r4.getUserRating().intValue();
        int r47 = R.drawable.ic_star_outlined;
        if (r46 < 1) goto L130;
        int r48 = R.drawable.ic_star;
    L131:
        r44.setImageDrawable(zz1.r(r45, r48));
        ImageView r49 = r5.u;
        Context r50 = r13.getContext();
        if (r4.getUserRating().intValue() < 2) goto L134;
        int r51 = R.drawable.ic_star;
    L135:
        r49.setImageDrawable(zz1.r(r50, r51));
        ImageView r52 = r5.s;
        Context r53 = r13.getContext();
        if (r4.getUserRating().intValue() < 3) goto L138;
        int r54 = R.drawable.ic_star;
    L139:
        r52.setImageDrawable(zz1.r(r53, r54));
        ImageView r55 = r5.h;
        Context r56 = r13.getContext();
        if (r4.getUserRating().intValue() < 4) goto L142;
        int r57 = R.drawable.ic_star;
    L143:
        r55.setImageDrawable(zz1.r(r56, r57));
        ImageView r58 = r5.g;
        Context r59 = r13.getContext();
        if (r4.getUserRating().intValue() < 5) goto L146;
        r47 = R.drawable.ic_star;
    L146:
        r58.setImageDrawable(zz1.r(r59, r47));
        goto L149
    L142:
        r57 = R.drawable.ic_star_outlined;
        goto L143
    L138:
        r54 = R.drawable.ic_star_outlined;
        goto L139
    L134:
        r51 = R.drawable.ic_star_outlined;
        goto L135
    L130:
        r48 = R.drawable.ic_star_outlined;
    L149:
        p(r2, r4);
        jz4.k(r13, r5.o, this.B, r4);
        return;
    L120:
        r42 = 8;
        goto L121
    L113:
        if (r4.getUserRating() != null) goto L116;
        r40 = 8;
        goto L117
    L109:
        r38 = false;
        goto L110
    L148:
        r7.setVisibility(8);
        goto L149
    L93:
        if (r36.getDiscTitles() == null) goto L104;
        Optional<DiscTitle> r60 = r36.getDiscTitles().stream().filter(new ki4(this, r20)).findFirst();
        if (r60.isPresent() == false) goto L104;
        if (r60.get().getDisc() == null) goto L104;
        if (r60.get().getTitle() == null) goto L104;
        if (r60.get().getTitle().isEmpty() == true) goto L104;
        r11.setText(r13.getContext().getString(R.string.disc_titlefull, new Object[]{r60.get().getDisc().toString(), r60.get().getTitle()}));
        goto L104
    L89:
        r10.setVisibility(8);
        goto L90
    L75:
        if (r3.f.stream().filter(new c7(20)).map(new hu3(3)).filter(new c7(21)).distinct().count() <= 1) goto L77;
    L103:
        r10.setVisibility(8);
        goto L104
    L70:
        r34 = 4;
        goto L71
    L66:
        r33 = 0;
        goto L67
    L15:
        r12.setVisibility(8);
        goto L21
    L17:
        if (g51.e(r4) == null) goto L19;
        r12.setVisibility(0);
        goto L21
    L19:
        r12.setVisibility(8);
        goto L21
    L9:
        r18 = r16.getString(R.string.label_placeholder);
        goto L10
    L5:
        r15 = r4.getArtist();
        goto L6
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.C;
    }

    @Override // defpackage.dw3
    public final void h(cx3 r4, int r5, List r6) {
        mi4 r7 = (mi4) r4;
        if (r6.isEmpty() == false) goto L5;
    L15:
        g(r7, r5);
        return;
    L5:
        if (r6.contains("payload_playback") == false) goto L7;
    L8:
        Child r8 = (Child) this.v.f.get(r5);
        if (r6.contains("payload_playback") == false) goto L12;
        p(r7, r8);
    L12:
        if (r6.contains("payload_homemusic_selection") == false) goto L17;
        jz4.k(r7.a, r7.u.o, this.B, r8);
        return;
    L17:
        return;
    L7:
        if (r6.contains("payload_homemusic_selection") == false) goto L15;
        goto L8
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r25, int r26) {
        View r0 = b11.i(r25, R.layout.item_horizontal_track, r25, false);
        int r1 = R.id.cover_art_overlay;
        View r4 = uo.s(r0, R.id.cover_art_overlay);
        if (r4 == null) goto L44;
        r1 = R.id.cover_image_separator;
        View r5 = uo.s(r0, R.id.cover_image_separator);
        if (r5 == null) goto L44;
        r1 = R.id.different_disk_divider;
        View r6 = uo.s(r0, R.id.different_disk_divider);
        if (r6 == null) goto L44;
        r1 = R.id.different_disk_divider_sector;
        ConstraintLayout r7 = (ConstraintLayout) uo.s(r0, R.id.different_disk_divider_sector);
        if (r7 == null) goto L44;
        r1 = R.id.disc_title_text_view;
        TextView r8 = (TextView) uo.s(r0, R.id.disc_title_text_view);
        if (r8 == null) goto L44;
        r1 = R.id.five_star_icon;
        ImageView r9 = (ImageView) uo.s(r0, R.id.five_star_icon);
        if (r9 == null) goto L44;
        r1 = R.id.four_star_icon;
        ImageView r10 = (ImageView) uo.s(r0, R.id.four_star_icon);
        if (r10 == null) goto L44;
        r1 = R.id.one_star_icon;
        ImageView r11 = (ImageView) uo.s(r0, R.id.one_star_icon);
        if (r11 == null) goto L44;
        r1 = R.id.play_pause_icon;
        ImageView r12 = (ImageView) uo.s(r0, R.id.play_pause_icon);
        if (r12 == null) goto L44;
        r1 = R.id.preferred_icon;
        ImageView r13 = (ImageView) uo.s(r0, R.id.preferred_icon);
        if (r13 == null) goto L44;
        r1 = R.id.rating_bar_layout;
        LinearLayout r14 = (LinearLayout) uo.s(r0, R.id.rating_bar_layout);
        if (r14 == null) goto L44;
        r1 = R.id.rating_indicator_image_view;
        ConstraintLayout r15 = (ConstraintLayout) uo.s(r0, R.id.rating_indicator_image_view);
        if (r15 == null) goto L44;
        r1 = R.id.search_result_download_indicator_image_view;
        FrameLayout r16 = (FrameLayout) uo.s(r0, R.id.search_result_download_indicator_image_view);
        if (r16 == null) goto L44;
        r1 = R.id.search_result_song_more_button;
        FrameLayout r17 = (FrameLayout) uo.s(r0, R.id.search_result_song_more_button);
        if (r17 == null) goto L44;
        r1 = R.id.search_result_song_subtitle_text_view;
        TextView r18 = (TextView) uo.s(r0, R.id.search_result_song_subtitle_text_view);
        if (r18 == null) goto L44;
        r1 = R.id.search_result_song_title_text_view;
        TextView r19 = (TextView) uo.s(r0, R.id.search_result_song_title_text_view);
        if (r19 == null) goto L44;
        r1 = R.id.song_cover_image_view;
        ImageView r20 = (ImageView) uo.s(r0, R.id.song_cover_image_view);
        if (r20 == null) goto L44;
        r1 = R.id.three_star_icon;
        ImageView r21 = (ImageView) uo.s(r0, R.id.three_star_icon);
        if (r21 == null) goto L44;
        r1 = R.id.track_number_text_view;
        TextView r22 = (TextView) uo.s(r0, R.id.track_number_text_view);
        if (r22 == null) goto L44;
        r1 = R.id.two_star_icon;
        ImageView r23 = (ImageView) uo.s(r0, R.id.two_star_icon);
        if (r23 == null) goto L44;
        return new mi4(this, new y12((ConstraintLayout) r0, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23));
    L44:
        nz2.n("Missing required view with ID: ".concat(r0.getResources().getResourceName(r1)));
        return null;
    }

    @Override // defpackage.dw3
    public final void n(cx3 r2) {
        mi4 r3 = (mi4) r2;
        c04 r1 = a.c(r3.a.getContext());
        ImageView r4 = r3.u.r;
        r1.getClass();
        r1.q(new a04(r4));
    }

    public final void p(mi4 r5, Child r6) {
        y12 r7 = r5.u;
        String r0 = this.x;
        boolean r1 = this.r;
        if (r0 != null) goto L5;
    L15:
        r7.j.setVisibility(4);
        if (r1 == true) goto L19;
        r7.t.setVisibility(0);
        return;
    L19:
        r7.b.setVisibility(4);
        return;
    L5:
        if (r0.equals(r6.getId()) == false) goto L15;
        r7.j.setVisibility(0);
        if (this.y == false) goto L9;
        r7.j.setImageResource(R.drawable.ic_pause);
    L10:
        if (r1 == true) goto L13;
        r7.t.setVisibility(4);
        return;
    L13:
        r7.b.setVisibility(0);
        return;
    L9:
        r7.j.setImageResource(R.drawable.ic_play);
        goto L10
    }

    public final List q(String r5) {
        if (r5 == null) goto L4;
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L6:
        pk r2 = this.v;
        if (r1 >= r2.f.size()) goto L12;
        if (r5.equals(((Child) r2.f.get(r1)).getId()) == false) goto L11;
        r0.add(Integer.valueOf(r1));
    L11:
        r1 = r1 + 1;
        goto L6
    L12:
        return r0;
    L4:
        return Collections.EMPTY_LIST;
    }

    public final void r(List r1) {
        if (r1 != null) goto L5;
        r1 = Collections.EMPTY_LIST;
    L5:
        this.u = r1;
        this.C.filter(this.w);
    }

    public final void s(String r5, boolean r6) {
        String r0 = this.x;
        boolean r1 = this.y;
        List r2 = this.z;
        this.x = r5;
        this.y = r6;
        if (Objects.equals(r0, r5) == false) goto L11;
        if (r1 != r6) goto L11;
        if (r5 == null) goto L7;
        List r7 = q(r5);
    L9:
        if (r2.equals(r7) == false) goto L11;
        return;
    L7:
        r7 = Collections.EMPTY_LIST;
    L11:
        if (r5 == null) goto L13;
        List r8 = q(r5);
    L14:
        this.z = r8;
        Iterator r9 = r2.iterator();
    L15:
        boolean r10 = r9.hasNext();
        pk r3 = this.v;
        if (r10 == false) goto L22;
        int r11 = ((Integer) r9.next()).intValue();
        if (r11 < 0) goto L15;
        if (r11 >= r3.f.size()) goto L15;
        e(r11, "payload_playback");
        goto L15
    L22:
        Iterator r12 = this.z.iterator();
    L24:
        if (r12.hasNext() == false) goto L48;
        Integer r13 = (Integer) r12.next();
        int r4 = r13.intValue();
        if (r2.contains(r13) == true) goto L24;
        if (r4 < 0) goto L24;
        if (r4 >= r3.f.size()) goto L24;
        e(r4, "payload_playback");
        goto L24
    L48:
        return;
    L13:
        r8 = Collections.EMPTY_LIST;
        goto L14
    }

    public final void t(String r4) {
        pk r3 = this.v;
        ArrayList r0 = new ArrayList(r3.f);
        byte r2 = -1;
        switch(r4.hashCode()) {
            case -1737560469: goto L14;
            case 1114836697: goto L10;
            case 1154412489: goto L6;
            default: goto L18;
        };
    L6:
        if (r4.equals("MEDIA_MOST_RECENTLY_STARRED") == false) goto L18;
        r2 = 2;
        goto L18
    L10:
        if (r4.equals("MEDIA_LEAST_RECENTLY_STARRED") == false) goto L18;
        r2 = 1;
        goto L18
    L14:
        if (r4.equals("MEDIA_BY_TITLE") == false) goto L18;
        r2 = 0;
    L18:
        switch(r2) {
            case 0: goto L22;
            case 1: goto L21;
            case 2: goto L20;
            default: goto L23;
        };
    L20:
        r0.sort(Comparator.comparing(new hu3(5), Comparator.nullsLast(Comparator.reverseOrder())));
        goto L23
    L21:
        r0.sort(Comparator.comparing(new hu3(5), Comparator.nullsLast(Comparator.naturalOrder())));
        goto L23
    L22:
        r0.sort(Comparator.comparing(new hu3(4)));
    L23:
        r3.b(r0, null);
    }
}
