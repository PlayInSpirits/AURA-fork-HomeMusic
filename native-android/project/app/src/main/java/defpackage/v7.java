package defpackage;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.PopupMenu;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.ui.fragment.AlbumCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.AlbumListPageFragment;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistListPageFragment;
import com.eddyizm.tempus.ui.fragment.DownloadFragment;
import com.eddyizm.tempus.ui.fragment.GenreCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelPageFragment;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v7 implements PopupMenu.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ v7(int r1, kc1 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem r6) {
        int r0 = this.a;
        String r1 = "ALBUM_ORDER_BY_NAME";
        kc1 r5 = this.b;
        switch(r0) {
            case 0: goto L123;
            case 1: goto L112;
            case 2: goto L101;
            case 3: goto L90;
            case 4: goto L67;
            case 5: goto L59;
            case 6: goto L48;
            case 7: goto L23;
            case 8: goto L15;
            default: goto L4;
        };
    L4:
        SongListPageFragment r7 = (SongListPageFragment) r5;
        if (r6.getItemId() != R.id.menu_song_sort_name) goto L9;
        r7.p0.t("MEDIA_BY_TITLE");
    L14:
        return true;
    L9:
        if (r6.getItemId() != R.id.menu_song_sort_most_recently_starred) goto L12;
        r7.p0.t("MEDIA_MOST_RECENTLY_STARRED");
        goto L14
    L12:
        if (r6.getItemId() != R.id.menu_song_sort_least_recently_starred) goto L148;
        r7.p0.t("MEDIA_LEAST_RECENTLY_STARRED");
        goto L14
    L148:
        return false;
    L15:
        PodcastChannelPageFragment r8 = (PodcastChannelPageFragment) r5;
        if (r6.getItemId() != R.id.menu_podcast_filter_download) goto L20;
        r8.o0.q("PODCAST_FILTER_BY_DOWNLOAD");
    L22:
        return true;
    L20:
        if (r6.getItemId() != R.id.menu_podcast_filter_all) goto L149;
        r8.o0.q("PODCAST_FILTER_BY_ALL");
        goto L22
    L149:
        return false;
    L23:
        PlaylistCatalogueFragment r9 = (PlaylistCatalogueFragment) r5;
        int r10 = r6.getItemId();
        if (r10 != R.id.menu_playlist_sort_name) goto L27;
        r9.n0.c("ORDER_BY_NAME");
    L47:
        return true;
    L27:
        if (r10 != R.id.menu_playlist_sort_pinned) goto L30;
        r9.n0.c("ORDER_BY_PINNED");
        goto L47
    L30:
        if (r10 != R.id.menu_playlist_sort_random) goto L33;
        r9.n0.c("ORDER_BY_RANDOM");
        goto L47
    L33:
        if (r10 != R.id.menu_playlist_sort_date) goto L36;
        r9.n0.c("ORDER_BY_DATE");
        goto L47
    L36:
        if (r10 != R.id.menu_playlist_sort_songs) goto L39;
        r9.n0.c("ORDER_BY_SONGS");
        goto L47
    L39:
        if (r10 != R.id.menu_playlist_sort_last_played) goto L42;
        r9.n0.c("ORDER_BY_LAST_PLAYED");
        goto L47
    L42:
        if (r10 != R.id.menu_playlist_sort_last_updated) goto L45;
        r9.n0.c("ORDER_BY_LAST_UPDATED");
        goto L47
    L45:
        if (r10 != R.id.menu_playlist_sort_both) goto L47;
        r9.n0.c("ORDER_BY_BOTH");
        goto L47
    L48:
        cp1 r11 = (cp1) r5;
        if (r6.getItemId() != R.id.menu_last_week_name) goto L53;
        r11.n0.c(r11.v(), 0);
        r11.l0.k.setText(r11.s(R.string.home_title_last_week));
    L58:
        return true;
    L53:
        if (r6.getItemId() != R.id.menu_last_month_name) goto L56;
        r11.n0.c(r11.v(), 1);
        r11.l0.k.setText(r11.s(R.string.home_title_last_month));
        goto L58
    L56:
        if (r6.getItemId() != R.id.menu_last_year_name) goto L150;
        r11.n0.c(r11.v(), 2);
        r11.l0.k.setText(r11.s(R.string.home_title_last_year));
        goto L58
    L150:
        return false;
    L59:
        GenreCatalogueFragment r12 = (GenreCatalogueFragment) r5;
        if (r6.getItemId() != R.id.menu_genre_sort_name) goto L64;
        ej r13 = r12.o0;
        r13.r.sort(Comparator.comparing(new m7(24)));
        r13.d();
    L66:
        return true;
    L64:
        if (r6.getItemId() != R.id.menu_genre_sort_random) goto L151;
        ej r14 = r12.o0;
        Collections.shuffle(r14.r);
        r14.d();
        goto L66
    L151:
        return false;
    L67:
        DownloadFragment r15 = (DownloadFragment) r5;
        if (r6.getItemId() != R.id.menu_download_group_by_track) goto L72;
        r15.h0("download_type_track");
    L89:
        return true;
    L72:
        if (r6.getItemId() != R.id.menu_download_group_by_album) goto L75;
        r15.h0("download_type_album");
        goto L89
    L75:
        if (r6.getItemId() != R.id.menu_download_group_by_artist) goto L78;
        r15.h0("download_type_artist");
        goto L89
    L78:
        if (r6.getItemId() != R.id.menu_download_group_by_genre) goto L81;
        r15.h0("download_type_genre");
        goto L89
    L81:
        if (r6.getItemId() != R.id.menu_download_group_by_year) goto L84;
        r15.h0("download_type_year");
        goto L89
    L84:
        if (r6.getItemId() != R.id.menu_download_group_by_playlist) goto L87;
        r15.h0("download_type_playlist");
        goto L89
    L87:
        if (r6.getItemId() != R.id.menu_download_set_directory) goto L152;
        r15.startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 1002);
        goto L89
    L152:
        return false;
    L90:
        ArtistListPageFragment r16 = (ArtistListPageFragment) r5;
        if (r6.getItemId() != R.id.menu_horizontal_artist_sort_name) goto L95;
        r16.o0.p("ARTIST_ORDER_BY_NAME");
    L100:
        return true;
    L95:
        if (r6.getItemId() != R.id.menu_horizontal_artist_sort_most_recently_starred) goto L98;
        r16.o0.p("ARTIST_ORDER_BY_MOST_RECENTLY_STARRED");
        goto L100
    L98:
        if (r6.getItemId() != R.id.menu_horizontal_artist_sort_least_recently_starred) goto L153;
        r16.o0.p("ARTIST_ORDER_BY_LEAST_RECENTLY_STARRED");
        goto L100
    L153:
        return false;
    L101:
        ArtistCatalogueFragment r17 = (ArtistCatalogueFragment) r5;
        if (r6.getItemId() != R.id.menu_artist_sort_name) goto L106;
        r17.o0.q("ARTIST_ORDER_BY_NAME");
    L111:
        return true;
    L106:
        if (r6.getItemId() != R.id.menu_artist_sort_random) goto L109;
        r17.o0.q("ARTIST_ORDER_BY_RANDOM");
        goto L111
    L109:
        if (r6.getItemId() != R.id.menu_artist_sort_album_count) goto L154;
        r17.o0.q("ARTIST_ORDER_BY_ALBUM_COUNT");
        goto L111
    L154:
        return false;
    L112:
        AlbumListPageFragment r18 = (AlbumListPageFragment) r5;
        if (r6.getItemId() != R.id.menu_horizontal_album_sort_name) goto L117;
        r18.o0.p("ALBUM_ORDER_BY_NAME");
    L122:
        return true;
    L117:
        if (r6.getItemId() != R.id.menu_horizontal_album_sort_most_recently_starred) goto L120;
        r18.o0.p("ALBUM_ORDER_BY_MOST_RECENTLY_STARRED");
        goto L122
    L120:
        if (r6.getItemId() != R.id.menu_horizontal_album_sort_least_recently_starred) goto L155;
        r18.o0.p("ALBUM_ORDER_BY_LEAST_RECENTLY_STARRED");
        goto L122
    L155:
        return false;
    L123:
        AlbumCatalogueFragment r19 = (AlbumCatalogueFragment) r5;
        if (r6.getItemId() != R.id.menu_album_sort_name) goto L127;
    L145:
        if (r1 == null) goto L156;
        r19.r0 = r1;
        App.b().getClass();
        App.c().edit().putString("album_sort_order", r1).apply();
        r19.h0(r1);
        r19.j0();
        return true;
    L156:
        return false;
    L127:
        if (r6.getItemId() != R.id.menu_album_sort_artist) goto L130;
        r1 = "ALBUM_ORDER_BY_ARTIST";
        goto L145
    L130:
        if (r6.getItemId() != R.id.menu_album_sort_year) goto L133;
        r1 = "ALBUM_ORDER_BY_YEAR";
        goto L145
    L133:
        if (r6.getItemId() != R.id.menu_album_sort_random) goto L136;
        r1 = "ALBUM_ORDER_BY_RANDOM";
        goto L145
    L136:
        if (r6.getItemId() != R.id.menu_album_sort_recently_added) goto L139;
        r1 = "ALBUM_ORDER_BY_RECENTLY_ADDED";
        goto L145
    L139:
        if (r6.getItemId() != R.id.menu_album_sort_recently_played) goto L142;
        r1 = "ALBUM_ORDER_BY_RECENTLY_PLAYED";
        goto L145
    L142:
        if (r6.getItemId() != R.id.menu_album_sort_most_played) goto L144;
        r1 = "ALBUM_ORDER_BY_MOST_PLAYED";
        goto L145
    L144:
        r1 = null;
        goto L145
    }
}
