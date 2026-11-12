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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v7 implements PopupMenu.OnMenuItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ v7(int i, kc1 kc1Var) {
        this.a = i;
        this.b = kc1Var;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i = this.a;
        String str = "ALBUM_ORDER_BY_NAME";
        kc1 kc1Var = this.b;
        switch (i) {
            case 0:
                AlbumCatalogueFragment albumCatalogueFragment = (AlbumCatalogueFragment) kc1Var;
                if (menuItem.getItemId() != R.id.menu_album_sort_name) {
                    if (menuItem.getItemId() == R.id.menu_album_sort_artist) {
                        str = "ALBUM_ORDER_BY_ARTIST";
                    } else if (menuItem.getItemId() == R.id.menu_album_sort_year) {
                        str = "ALBUM_ORDER_BY_YEAR";
                    } else if (menuItem.getItemId() == R.id.menu_album_sort_random) {
                        str = "ALBUM_ORDER_BY_RANDOM";
                    } else if (menuItem.getItemId() == R.id.menu_album_sort_recently_added) {
                        str = "ALBUM_ORDER_BY_RECENTLY_ADDED";
                    } else if (menuItem.getItemId() == R.id.menu_album_sort_recently_played) {
                        str = "ALBUM_ORDER_BY_RECENTLY_PLAYED";
                    } else {
                        str = menuItem.getItemId() == R.id.menu_album_sort_most_played ? "ALBUM_ORDER_BY_MOST_PLAYED" : null;
                    }
                }
                if (str == null) {
                    return false;
                }
                albumCatalogueFragment.r0 = str;
                App.b().getClass();
                App.c().edit().putString("album_sort_order", str).apply();
                albumCatalogueFragment.h0(str);
                albumCatalogueFragment.j0();
                return true;
            case 1:
                AlbumListPageFragment albumListPageFragment = (AlbumListPageFragment) kc1Var;
                if (menuItem.getItemId() == R.id.menu_horizontal_album_sort_name) {
                    albumListPageFragment.o0.p("ALBUM_ORDER_BY_NAME");
                } else if (menuItem.getItemId() == R.id.menu_horizontal_album_sort_most_recently_starred) {
                    albumListPageFragment.o0.p("ALBUM_ORDER_BY_MOST_RECENTLY_STARRED");
                } else {
                    if (menuItem.getItemId() != R.id.menu_horizontal_album_sort_least_recently_starred) {
                        return false;
                    }
                    albumListPageFragment.o0.p("ALBUM_ORDER_BY_LEAST_RECENTLY_STARRED");
                }
                return true;
            case 2:
                ArtistCatalogueFragment artistCatalogueFragment = (ArtistCatalogueFragment) kc1Var;
                if (menuItem.getItemId() == R.id.menu_artist_sort_name) {
                    artistCatalogueFragment.o0.q("ARTIST_ORDER_BY_NAME");
                } else if (menuItem.getItemId() == R.id.menu_artist_sort_random) {
                    artistCatalogueFragment.o0.q("ARTIST_ORDER_BY_RANDOM");
                } else {
                    if (menuItem.getItemId() != R.id.menu_artist_sort_album_count) {
                        return false;
                    }
                    artistCatalogueFragment.o0.q("ARTIST_ORDER_BY_ALBUM_COUNT");
                }
                return true;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ArtistListPageFragment artistListPageFragment = (ArtistListPageFragment) kc1Var;
                if (menuItem.getItemId() == R.id.menu_horizontal_artist_sort_name) {
                    artistListPageFragment.o0.p("ARTIST_ORDER_BY_NAME");
                } else if (menuItem.getItemId() == R.id.menu_horizontal_artist_sort_most_recently_starred) {
                    artistListPageFragment.o0.p("ARTIST_ORDER_BY_MOST_RECENTLY_STARRED");
                } else {
                    if (menuItem.getItemId() != R.id.menu_horizontal_artist_sort_least_recently_starred) {
                        return false;
                    }
                    artistListPageFragment.o0.p("ARTIST_ORDER_BY_LEAST_RECENTLY_STARRED");
                }
                return true;
            case 4:
                DownloadFragment downloadFragment = (DownloadFragment) kc1Var;
                if (menuItem.getItemId() == R.id.menu_download_group_by_track) {
                    downloadFragment.h0("download_type_track");
                } else if (menuItem.getItemId() == R.id.menu_download_group_by_album) {
                    downloadFragment.h0("download_type_album");
                } else if (menuItem.getItemId() == R.id.menu_download_group_by_artist) {
                    downloadFragment.h0("download_type_artist");
                } else if (menuItem.getItemId() == R.id.menu_download_group_by_genre) {
                    downloadFragment.h0("download_type_genre");
                } else if (menuItem.getItemId() == R.id.menu_download_group_by_year) {
                    downloadFragment.h0("download_type_year");
                } else if (menuItem.getItemId() == R.id.menu_download_group_by_playlist) {
                    downloadFragment.h0("download_type_playlist");
                } else {
                    if (menuItem.getItemId() != R.id.menu_download_set_directory) {
                        return false;
                    }
                    downloadFragment.startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 1002);
                }
                return true;
            case 5:
                GenreCatalogueFragment genreCatalogueFragment = (GenreCatalogueFragment) kc1Var;
                if (menuItem.getItemId() == R.id.menu_genre_sort_name) {
                    ej ejVar = genreCatalogueFragment.o0;
                    ejVar.r.sort(Comparator.comparing(new m7(24)));
                    ejVar.d();
                } else {
                    if (menuItem.getItemId() != R.id.menu_genre_sort_random) {
                        return false;
                    }
                    ej ejVar2 = genreCatalogueFragment.o0;
                    Collections.shuffle(ejVar2.r);
                    ejVar2.d();
                }
                return true;
            case 6:
                cp1 cp1Var = (cp1) kc1Var;
                if (menuItem.getItemId() == R.id.menu_last_week_name) {
                    cp1Var.n0.c(cp1Var.v(), 0);
                    cp1Var.l0.k.setText(cp1Var.s(R.string.home_title_last_week));
                } else if (menuItem.getItemId() == R.id.menu_last_month_name) {
                    cp1Var.n0.c(cp1Var.v(), 1);
                    cp1Var.l0.k.setText(cp1Var.s(R.string.home_title_last_month));
                } else {
                    if (menuItem.getItemId() != R.id.menu_last_year_name) {
                        return false;
                    }
                    cp1Var.n0.c(cp1Var.v(), 2);
                    cp1Var.l0.k.setText(cp1Var.s(R.string.home_title_last_year));
                }
                return true;
            case 7:
                PlaylistCatalogueFragment playlistCatalogueFragment = (PlaylistCatalogueFragment) kc1Var;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.menu_playlist_sort_name) {
                    playlistCatalogueFragment.n0.c("ORDER_BY_NAME");
                } else if (itemId == R.id.menu_playlist_sort_pinned) {
                    playlistCatalogueFragment.n0.c("ORDER_BY_PINNED");
                } else if (itemId == R.id.menu_playlist_sort_random) {
                    playlistCatalogueFragment.n0.c("ORDER_BY_RANDOM");
                } else if (itemId == R.id.menu_playlist_sort_date) {
                    playlistCatalogueFragment.n0.c("ORDER_BY_DATE");
                } else if (itemId == R.id.menu_playlist_sort_songs) {
                    playlistCatalogueFragment.n0.c("ORDER_BY_SONGS");
                } else if (itemId == R.id.menu_playlist_sort_last_played) {
                    playlistCatalogueFragment.n0.c("ORDER_BY_LAST_PLAYED");
                } else if (itemId == R.id.menu_playlist_sort_last_updated) {
                    playlistCatalogueFragment.n0.c("ORDER_BY_LAST_UPDATED");
                } else if (itemId == R.id.menu_playlist_sort_both) {
                    playlistCatalogueFragment.n0.c("ORDER_BY_BOTH");
                }
                return true;
            case 8:
                PodcastChannelPageFragment podcastChannelPageFragment = (PodcastChannelPageFragment) kc1Var;
                if (menuItem.getItemId() == R.id.menu_podcast_filter_download) {
                    podcastChannelPageFragment.o0.q("PODCAST_FILTER_BY_DOWNLOAD");
                } else {
                    if (menuItem.getItemId() != R.id.menu_podcast_filter_all) {
                        return false;
                    }
                    podcastChannelPageFragment.o0.q("PODCAST_FILTER_BY_ALL");
                }
                return true;
            default:
                SongListPageFragment songListPageFragment = (SongListPageFragment) kc1Var;
                if (menuItem.getItemId() == R.id.menu_song_sort_name) {
                    songListPageFragment.p0.t("MEDIA_BY_TITLE");
                } else if (menuItem.getItemId() == R.id.menu_song_sort_most_recently_starred) {
                    songListPageFragment.p0.t("MEDIA_MOST_RECENTLY_STARRED");
                } else {
                    if (menuItem.getItemId() != R.id.menu_song_sort_least_recently_starred) {
                        return false;
                    }
                    songListPageFragment.p0.t("MEDIA_LEAST_RECENTLY_STARRED");
                }
                return true;
        }
    }
}
