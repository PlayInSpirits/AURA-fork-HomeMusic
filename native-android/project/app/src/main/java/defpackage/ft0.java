package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.DownloadFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ft0 extends dw3 {
    public final DownloadFragment q;
    public String r;
    public String s;
    public String t;
    public List u;
    public List v;
    public List w;
    public final HashMap x;

    public ft0(DownloadFragment r2) {
        this.x = new HashMap();
        this.q = r2;
        this.r = "download_type_track";
        List r3 = Collections.EMPTY_LIST;
        this.u = r3;
        this.w = r3;
    }

    public static String p(String r5, String r6, List r7) {
        if (r6 == null) goto L44;
        byte r4 = -1;
        switch(r5.hashCode()) {
            case -2125974859: goto L27;
            case -940056789: goto L23;
            case 155496896: goto L19;
            case 901055809: goto L15;
            case 906399829: goto L11;
            case 918779933: goto L7;
            default: goto L30;
        };
    L30:
        switch(r4) {
            case 0: goto L43;
            case 1: goto L41;
            case 2: goto L39;
            case 3: goto L37;
            case 4: goto L35;
            case 5: goto L33;
            default: goto L46;
        };
    L46:
        return "0";
    L33:
        return String.valueOf(r7.stream().filter(new at0(0, r6)).count());
    L35:
        return String.valueOf(r7.stream().filter(new at0(5, r6)).count());
    L37:
        return String.valueOf(r7.stream().filter(new at0(1, r6)).count());
    L39:
        return String.valueOf(r7.stream().filter(new at0(11, r6)).count());
    L41:
        return String.valueOf(r7.stream().filter(new at0(9, r6)).count());
    L43:
        return String.valueOf(r7.stream().filter(new at0(10, r6)).count());
    L7:
        if (r5.equals("download_type_track") == false) goto L30;
        r4 = 5;
        goto L30
    L11:
        if (r5.equals("download_type_genre") == false) goto L30;
        r4 = 4;
        goto L30
    L15:
        if (r5.equals("download_type_album") == false) goto L30;
        r4 = 3;
        goto L30
    L19:
        if (r5.equals("download_type_playlist") == false) goto L30;
        r4 = 2;
        goto L30
    L23:
        if (r5.equals("download_type_year") == false) goto L30;
        r4 = 1;
        goto L30
    L27:
        if (r5.equals("download_type_artist") == false) goto L30;
        r4 = 0;
        goto L30
    L44:
        return "0";
    }

    public static List q(String r5, String r6, List r7) {
        if (r6 == null) goto L44;
        r5.getClass();
        byte r4 = -1;
        switch(r5.hashCode()) {
            case -2125974859: goto L27;
            case -940056789: goto L23;
            case 155496896: goto L19;
            case 901055809: goto L15;
            case 906399829: goto L11;
            case 918779933: goto L7;
            default: goto L30;
        };
    L30:
        switch(r4) {
            case 0: goto L43;
            case 1: goto L41;
            case 2: goto L39;
            case 3: goto L37;
            case 4: goto L35;
            case 5: goto L33;
            default: goto L44;
        };
    L33:
        return (List) r7.stream().filter(new at0(2, r6)).collect(Collectors.toList());
    L35:
        return (List) r7.stream().filter(new at0(4, r6)).collect(Collectors.toList());
    L37:
        return (List) r7.stream().filter(new at0(3, r6)).collect(Collectors.toList());
    L39:
        return (List) r7.stream().filter(new at0(8, r6)).collect(Collectors.toList());
    L41:
        return (List) r7.stream().filter(new at0(6, r6)).collect(Collectors.toList());
    L43:
        return (List) r7.stream().filter(new at0(7, r6)).collect(Collectors.toList());
    L7:
        if (r5.equals("download_type_track") == false) goto L30;
        r4 = 5;
        goto L30
    L11:
        if (r5.equals("download_type_genre") == false) goto L30;
        r4 = 4;
        goto L30
    L15:
        if (r5.equals("download_type_album") == false) goto L30;
        r4 = 3;
        goto L30
    L19:
        if (r5.equals("download_type_playlist") == false) goto L30;
        r4 = 2;
        goto L30
    L23:
        if (r5.equals("download_type_year") == false) goto L30;
        r4 = 1;
        goto L30
    L27:
        if (r5.equals("download_type_artist") == false) goto L30;
        r4 = 0;
    L44:
        return r7;
    }

    public static boolean r(Child r1, Child r2) {
        if (r1.getAlbumId() == null) goto L9;
        if (r2.getAlbumId() == null) goto L9;
        return Objects.equals(r1.getAlbumId(), r2.getAlbumId());
    L9:
        return Objects.equals(r1.getAlbum(), r2.getAlbum());
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.w.size();
    }

    @Override // defpackage.dw3
    public final long b(int r1) {
        return r1;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r17, int r18) {
        et0 r2 = (et0) r17;
        View r3 = r2.a;
        lv4 r4 = r2.u;
        String r5 = this.r;
        r5.getClass();
        byte r13 = -1;
        switch(r5.hashCode()) {
            case -2125974859: goto L26;
            case -940056789: goto L22;
            case 155496896: goto L18;
            case 901055809: goto L14;
            case 906399829: goto L10;
            case 918779933: goto L6;
            default: goto L30;
        };
    L6:
        if (r5.equals("download_type_track") == false) goto L30;
        r13 = 5;
        goto L30
    L10:
        if (r5.equals("download_type_genre") == false) goto L30;
        r13 = 4;
        goto L30
    L14:
        if (r5.equals("download_type_album") == false) goto L30;
        r13 = 3;
        goto L30
    L18:
        if (r5.equals("download_type_playlist") == false) goto L30;
        r13 = 2;
        goto L30
    L22:
        if (r5.equals("download_type_year") == false) goto L30;
        r13 = 1;
        goto L30
    L26:
        if (r5.equals("download_type_artist") == false) goto L30;
        r13 = 0;
    L30:
        switch(r13) {
            case 0: goto L111;
            case 1: goto L109;
            case 2: goto L95;
            case 3: goto L52;
            case 4: goto L50;
            case 5: goto L32;
            default: goto L123;
        };
    L32:
        Child r6 = (Child) this.w.get(r18);
        ((TextView) r4.s).setText(r6.getTitle());
        TextView r7 = (TextView) r4.r;
        ImageView r8 = (ImageView) r4.t;
        LinearLayout r9 = (LinearLayout) r4.o;
        r7.setText(r3.getContext().getString(R.string.song_subtitle_formatter, new Object[]{r6.getArtist(), e03.g(r6.getDuration()), e03.f(r6)}));
        ((TextView) r4.p).setText(r6.getAlbum());
        Context r10 = r3.getContext();
        String r11 = r6.getCoverArtId();
        c04 r12 = a.c(r10);
        if (r11 == null) goto L35;
        String r14 = wg0.b(ud3.t(), r11);
    L36:
        vz3 r15 = b11.g(r10, r11, 9, r12, r14).T(xv0.b());
        if (ud3.R() == false) goto L39;
        r15 = (vz3) r15.l();
    L39:
        r15.K(r8);
        r8.setVisibility(0);
        ((FrameLayout) r4.q).setVisibility(0);
        r9.setVisibility(0);
        if (r18 <= 0) goto L47;
        int r16 = r18 - 1;
        if (this.w.get(r16) == null) goto L47;
        if (r((Child) this.w.get(r16), (Child) this.w.get(r18)) == true) goto L47;
        r9.setPadding(0, (int) r3.getContext().getResources().getDimension(R.dimen.downloaded_item_padding), 0, 0);
        return;
    L47:
        if (r18 <= 0) goto L120;
        r9.setVisibility(8);
        return;
    L120:
        return;
    L35:
        r14 = null;
        goto L36
    L50:
        Child r1 = (Child) this.w.get(r18);
        ((TextView) r4.s).setText(r1.getGenre());
        ((TextView) r4.r).setText(r3.getContext().getString(R.string.download_item_single_subtitle_formatter, new Object[]{p("download_type_genre", r1.getGenre(), this.u)}));
        ((ImageView) r4.t).setVisibility(8);
        ((FrameLayout) r4.q).setVisibility(0);
        ((LinearLayout) r4.o).setVisibility(8);
        return;
    L52:
        Child r19 = (Child) this.w.get(r18);
        ((TextView) r4.s).setText(r19.getAlbum());
        TextView r20 = (TextView) r4.r;
        ImageView r21 = (ImageView) r4.t;
        LinearLayout r110 = (LinearLayout) r4.o;
        r20.setText(r3.getContext().getString(R.string.download_item_single_subtitle_formatter, new Object[]{p("download_type_album", r19.getAlbumId(), this.u)}));
        TextView r22 = (TextView) r4.p;
        String r23 = r19.getAlbumArtist();
        if (r23 != null) goto L55;
    L57:
        r23 = null;
    L58:
        if (r23 != null) goto L61;
        r23 = r19.getArtist();
    L61:
        r22.setText(r23);
        Context r24 = r3.getContext();
        String r25 = r19.getCoverArtId();
        c04 r26 = a.c(r24);
        if (r25 == null) goto L64;
        String r27 = wg0.b(ud3.t(), r25);
    L65:
        vz3 r28 = b11.g(r24, r25, 9, r26, r27).T(xv0.b());
        if (ud3.R() == false) goto L68;
        r28 = (vz3) r28.l();
    L68:
        r28.K(r21);
        r21.setVisibility(0);
        ((FrameLayout) r4.q).setVisibility(0);
        r110.setVisibility(0);
        if (r18 <= 0) goto L92;
        int r29 = r18 - 1;
        if (this.w.get(r29) == null) goto L92;
        Child r30 = (Child) this.w.get(r29);
        Child r0 = (Child) this.w.get(r18);
        String r31 = r30.getAlbumArtist();
        if (r31 != null) goto L75;
    L77:
        r31 = null;
    L78:
        String r32 = r0.getAlbumArtist();
        if (r32 != null) goto L81;
    L83:
        r32 = null;
    L84:
        if (r31 != null) goto L88;
        if (r32 != null) goto L88;
        boolean r33 = r(r30, r0);
    L89:
        if (r33 == true) goto L92;
        r110.setPadding(0, (int) r3.getContext().getResources().getDimension(R.dimen.downloaded_item_padding), 0, 0);
        return;
    L88:
        r33 = Objects.equals(r31, r32);
        goto L89
    L81:
        if (r32.isEmpty() == true) goto L83;
    L75:
        if (r31.isEmpty() == true) goto L77;
    L92:
        if (r18 <= 0) goto L121;
        r110.setVisibility(8);
        return;
    L121:
        return;
    L64:
        r27 = null;
        goto L65
    L55:
        if (r23.isEmpty() == true) goto L57;
    L95:
        Child r34 = (Child) this.w.get(r18);
        if ((r34 instanceof Download) == false) goto L122;
        Download r35 = (Download) r34;
        ((TextView) r4.s).setText(r35.getPlaylistName());
        TextView r36 = (TextView) r4.r;
        ImageView r37 = (ImageView) r4.t;
        r36.setText(r3.getContext().getString(R.string.download_item_single_subtitle_formatter, new Object[]{p("download_type_playlist", r35.getPlaylistId(), this.u)}));
        String r38 = r35.getPlaylistId();
        String r39 = (String) this.x.get(r38);
        if (r39 != null) goto L100;
        new Thread(new ct0(this, r38, r2, r18)).start();
        r39 = r35.getCoverArtId();
    L100:
        Context r40 = r3.getContext();
        c04 r41 = a.c(r40);
        if (r39 == null) goto L103;
        String r42 = wg0.b(ud3.t(), r39);
    L104:
        vz3 r43 = b11.g(r40, r39, 9, r41, r42).T(xv0.b());
        if (ud3.R() == false) goto L107;
        r43 = (vz3) r43.l();
    L107:
        r43.K(r37);
        r37.setVisibility(0);
        ((FrameLayout) r4.q).setVisibility(0);
        ((LinearLayout) r4.o).setVisibility(8);
        return;
    L103:
        r42 = null;
        goto L104
    L122:
        return;
    L109:
        Child r44 = (Child) this.w.get(r18);
        ((TextView) r4.s).setText(String.valueOf(r44.getYear()));
        ((TextView) r4.r).setText(r3.getContext().getString(R.string.download_item_single_subtitle_formatter, new Object[]{p("download_type_year", r44.getYear().toString(), this.u)}));
        ((ImageView) r4.t).setVisibility(8);
        ((FrameLayout) r4.q).setVisibility(0);
        ((LinearLayout) r4.o).setVisibility(8);
        return;
    L111:
        Child r45 = (Child) this.w.get(r18);
        ((TextView) r4.s).setText(r45.getArtist());
        TextView r46 = (TextView) r4.r;
        ImageView r47 = (ImageView) r4.t;
        r46.setText(r3.getContext().getString(R.string.download_item_single_subtitle_formatter, new Object[]{p("download_type_artist", r45.getArtistId(), this.u)}));
        Context r48 = r3.getContext();
        String r49 = r45.getCoverArtId();
        c04 r50 = a.c(r48);
        if (r49 == null) goto L114;
        String r51 = wg0.b(ud3.t(), r49);
    L115:
        vz3 r52 = b11.g(r48, r49, 9, r50, r51).T(xv0.b());
        if (ud3.R() == false) goto L118;
        r52 = (vz3) r52.l();
    L118:
        r52.K(r47);
        r47.setVisibility(0);
        ((FrameLayout) r4.q).setVisibility(0);
        ((LinearLayout) r4.o).setVisibility(8);
        return;
    L114:
        r51 = null;
        goto L115
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r10, int r11) {
        View r12 = b11.i(r10, R.layout.item_horizontal_download, r10, false);
        int r13 = R.id.divider;
        LinearLayout r3 = (LinearLayout) uo.s(r12, R.id.divider);
        if (r3 == null) goto L16;
        r13 = R.id.downloaded_item_more_button;
        FrameLayout r4 = (FrameLayout) uo.s(r12, R.id.downloaded_item_more_button);
        if (r4 == null) goto L16;
        r13 = R.id.downloaded_item_pre_text_view;
        TextView r5 = (TextView) uo.s(r12, R.id.downloaded_item_pre_text_view);
        if (r5 == null) goto L16;
        r13 = R.id.downloaded_item_subtitle_text_view;
        TextView r6 = (TextView) uo.s(r12, R.id.downloaded_item_subtitle_text_view);
        if (r6 == null) goto L16;
        r13 = R.id.downloaded_item_title_text_view;
        TextView r7 = (TextView) uo.s(r12, R.id.downloaded_item_title_text_view);
        if (r7 == null) goto L16;
        r13 = R.id.item_cover_image_view;
        ImageView r8 = (ImageView) uo.s(r12, R.id.item_cover_image_view);
        if (r8 == null) goto L16;
        return new et0(this, new lv4((ConstraintLayout) r12, r3, r4, r5, r6, r7, r8));
    L16:
        nz2.n("Missing required view with ID: ".concat(r12.getResources().getResourceName(r13)));
        return null;
    }

    public final void s(String r17, String r18, String r19, List r20) {
        if (r19 == null) goto L5;
        String r3 = r17;
    L6:
        this.r = r3;
        this.s = r18;
        this.t = r19;
        this.u = r20;
        r3.getClass();
        final int r13 = 0;
        final int r14 = 5;
        final int r15 = 4;
        switch(r3.hashCode()) {
            case -2125974859: goto L30;
            case -940056789: goto L26;
            case 155496896: goto L22;
            case 901055809: goto L18;
            case 906399829: goto L14;
            case 918779933: goto L10;
            default: goto L8;
        };
    L8:
        byte r1 = -1;
    L33:
        switch(r1) {
            case 0: goto L40;
            case 1: goto L39;
            case 2: goto L38;
            case 3: goto L37;
            case 4: goto L36;
            case 5: goto L35;
            default: goto L34;
        };
    L34:
        List r2 = Collections.EMPTY_LIST;
    L41:
        this.w = r2;
        List r4 = new ArrayList(r20);
        if (this.t == null) goto L79;
        String r5 = this.s;
        r5.getClass();
        switch(r5.hashCode()) {
            case -2125974859: goto L68;
            case -940056789: goto L64;
            case 155496896: goto L60;
            case 901055809: goto L56;
            case 906399829: goto L52;
            case 918779933: goto L48;
            default: goto L46;
        };
    L46:
        byte r10 = -1;
    L71:
        switch(r10) {
            case 0: goto L78;
            case 1: goto L77;
            case 2: goto L76;
            case 3: goto L75;
            case 4: goto L74;
            case 5: goto L73;
            default: goto L79;
        };
    L73:
        r4 = (List) r4.stream().filter(new bt0(this, r15)).collect(Collectors.toList());
        goto L79
    L74:
        r4 = (List) r4.stream().filter(new bt0(this, r13)).collect(Collectors.toList());
        goto L79
    L75:
        r4 = (List) r4.stream().filter(new bt0(this, r14)).collect(Collectors.toList());
        goto L79
    L76:
        final int r6 = 3;
        r4 = (List) r4.stream().filter(new bt0(this, r6)).collect(Collectors.toList());
        goto L79
    L77:
        final int r7 = 1;
        r4 = (List) r4.stream().filter(new bt0(this, r7)).collect(Collectors.toList());
        goto L79
    L78:
        final int r8 = 2;
        r4 = (List) r4.stream().filter(new bt0(this, r8)).collect(Collectors.toList());
        goto L79
    L48:
        if (r5.equals("download_type_track") == false) goto L46;
        r10 = 5;
        goto L71
    L52:
        if (r5.equals("download_type_genre") == false) goto L46;
        r10 = 4;
        goto L71
    L56:
        if (r5.equals("download_type_album") == false) goto L46;
        r10 = 3;
        goto L71
    L60:
        if (r5.equals("download_type_playlist") == false) goto L46;
        r10 = 2;
        goto L71
    L64:
        if (r5.equals("download_type_year") == false) goto L46;
        r10 = 1;
        goto L71
    L68:
        if (r5.equals("download_type_artist") == false) goto L46;
        r10 = 0;
    L79:
        this.v = r4;
        d();
        return;
    L35:
        r2 = q(this.s, this.t, (List) r20.stream().filter(new c7(3)).filter(q05.j(new m7(17))).collect(Collectors.toList()));
        goto L41
    L36:
        r2 = q(this.s, this.t, (List) r20.stream().filter(new c7(7)).filter(q05.j(new m7(21))).collect(Collectors.toList()));
        goto L41
    L37:
        r2 = q(this.s, this.t, (List) r20.stream().filter(new c7(5)).filter(q05.j(new m7(18))).collect(Collectors.toList()));
        goto L41
    L38:
        r2 = q(this.s, this.t, (List) r20.stream().filter(new c7(4)).filter(q05.j(new m7(16))).collect(Collectors.toList()));
        goto L41
    L39:
        r2 = q(this.s, this.t, (List) r20.stream().filter(new c7(8)).filter(q05.j(new m7(15))).collect(Collectors.toList()));
        goto L41
    L40:
        r2 = q(this.s, this.t, (List) r20.stream().filter(new c7(6)).filter(q05.j(new m7(19))).sorted(Comparator.comparing(new m7(20), Comparator.nullsLast(Comparator.naturalOrder()))).collect(Collectors.toList()));
        goto L41
    L10:
        if (r3.equals("download_type_track") == false) goto L8;
        r1 = 5;
        goto L33
    L14:
        if (r3.equals("download_type_genre") == false) goto L8;
        r1 = 4;
        goto L33
    L18:
        if (r3.equals("download_type_album") == false) goto L8;
        r1 = 3;
        goto L33
    L22:
        if (r3.equals("download_type_playlist") == false) goto L8;
        r1 = 2;
        goto L33
    L26:
        if (r3.equals("download_type_year") == false) goto L8;
        r1 = 1;
        goto L33
    L30:
        if (r3.equals("download_type_artist") == false) goto L8;
        r1 = 0;
        goto L33
    L5:
        r3 = r18;
        goto L6
    }
}
