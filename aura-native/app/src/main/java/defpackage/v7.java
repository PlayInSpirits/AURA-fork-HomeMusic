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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        kc1 kc1Var = this.b;
        switch (i) {
            case 0:
                AlbumCatalogueFragment albumCatalogueFragment = (AlbumCatalogueFragment) kc1Var;
                String str = menuItem.getItemId() != app.homemusic.R.id.menu_album_sort_name ? menuItem.getItemId() == app.homemusic.R.id.menu_album_sort_artist ? "ALBUM_ORDER_BY_ARTIST" : menuItem.getItemId() == app.homemusic.R.id.menu_album_sort_year ? "ALBUM_ORDER_BY_YEAR" : menuItem.getItemId() == app.homemusic.R.id.menu_album_sort_random ? "ALBUM_ORDER_BY_RANDOM" : menuItem.getItemId() == app.homemusic.R.id.menu_album_sort_recently_added ? "ALBUM_ORDER_BY_RECENTLY_ADDED" : menuItem.getItemId() == app.homemusic.R.id.menu_album_sort_recently_played ? "ALBUM_ORDER_BY_RECENTLY_PLAYED" : menuItem.getItemId() == app.homemusic.R.id.menu_album_sort_most_played ? "ALBUM_ORDER_BY_MOST_PLAYED" : null : "ALBUM_ORDER_BY_NAME";
                if (str != null) {
                    albumCatalogueFragment.r0 = str;
                    App.b().getClass();
                    App.c().edit().putString("album_sort_order", str).apply();
                    albumCatalogueFragment.h0(str);
                    albumCatalogueFragment.j0();
                    break;
                }
                break;
            case 1:
                AlbumListPageFragment albumListPageFragment = (AlbumListPageFragment) kc1Var;
                if (menuItem.getItemId() == app.homemusic.R.id.menu_horizontal_album_sort_name) {
                    albumListPageFragment.o0.p("ALBUM_ORDER_BY_NAME");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_horizontal_album_sort_most_recently_starred) {
                    albumListPageFragment.o0.p("ALBUM_ORDER_BY_MOST_RECENTLY_STARRED");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_horizontal_album_sort_least_recently_starred) {
                    albumListPageFragment.o0.p("ALBUM_ORDER_BY_LEAST_RECENTLY_STARRED");
                }
                break;
            case 2:
                ArtistCatalogueFragment artistCatalogueFragment = (ArtistCatalogueFragment) kc1Var;
                if (menuItem.getItemId() == app.homemusic.R.id.menu_artist_sort_name) {
                    artistCatalogueFragment.o0.q("ARTIST_ORDER_BY_NAME");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_artist_sort_random) {
                    artistCatalogueFragment.o0.q("ARTIST_ORDER_BY_RANDOM");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_artist_sort_album_count) {
                    artistCatalogueFragment.o0.q("ARTIST_ORDER_BY_ALBUM_COUNT");
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ArtistListPageFragment artistListPageFragment = (ArtistListPageFragment) kc1Var;
                if (menuItem.getItemId() == app.homemusic.R.id.menu_horizontal_artist_sort_name) {
                    artistListPageFragment.o0.p("ARTIST_ORDER_BY_NAME");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_horizontal_artist_sort_most_recently_starred) {
                    artistListPageFragment.o0.p("ARTIST_ORDER_BY_MOST_RECENTLY_STARRED");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_horizontal_artist_sort_least_recently_starred) {
                    artistListPageFragment.o0.p("ARTIST_ORDER_BY_LEAST_RECENTLY_STARRED");
                }
                break;
            case 4:
                DownloadFragment downloadFragment = (DownloadFragment) kc1Var;
                if (menuItem.getItemId() == app.homemusic.R.id.menu_download_group_by_track) {
                    downloadFragment.h0("download_type_track");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_download_group_by_album) {
                    downloadFragment.h0("download_type_album");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_download_group_by_artist) {
                    downloadFragment.h0("download_type_artist");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_download_group_by_genre) {
                    downloadFragment.h0("download_type_genre");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_download_group_by_year) {
                    downloadFragment.h0("download_type_year");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_download_group_by_playlist) {
                    downloadFragment.h0("download_type_playlist");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_download_set_directory) {
                    downloadFragment.startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 1002);
                }
                break;
            case 5:
                GenreCatalogueFragment genreCatalogueFragment = (GenreCatalogueFragment) kc1Var;
                if (menuItem.getItemId() == app.homemusic.R.id.menu_genre_sort_name) {
                    ej ejVar = genreCatalogueFragment.o0;
                    ejVar.r.sort(Comparator.comparing(new m7(24)));
                    ejVar.d();
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_genre_sort_random) {
                    ej ejVar2 = genreCatalogueFragment.o0;
                    Collections.shuffle(ejVar2.r);
                    ejVar2.d();
                }
                break;
            case 6:
                cp1 cp1Var = (cp1) kc1Var;
                if (menuItem.getItemId() == app.homemusic.R.id.menu_last_week_name) {
                    cp1Var.n0.c(cp1Var.v(), 0);
                    cp1Var.l0.k.setText(cp1Var.s(app.homemusic.R.string.home_title_last_week));
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_last_month_name) {
                    cp1Var.n0.c(cp1Var.v(), 1);
                    cp1Var.l0.k.setText(cp1Var.s(app.homemusic.R.string.home_title_last_month));
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_last_year_name) {
                    cp1Var.n0.c(cp1Var.v(), 2);
                    cp1Var.l0.k.setText(cp1Var.s(app.homemusic.R.string.home_title_last_year));
                }
                break;
            case 7:
                PlaylistCatalogueFragment playlistCatalogueFragment = (PlaylistCatalogueFragment) kc1Var;
                int itemId = menuItem.getItemId();
                if (itemId != app.homemusic.R.id.menu_playlist_sort_name) {
                    if (itemId != app.homemusic.R.id.menu_playlist_sort_pinned) {
                        if (itemId != app.homemusic.R.id.menu_playlist_sort_random) {
                            if (itemId != app.homemusic.R.id.menu_playlist_sort_date) {
                                if (itemId != app.homemusic.R.id.menu_playlist_sort_songs) {
                                    if (itemId != app.homemusic.R.id.menu_playlist_sort_last_played) {
                                        if (itemId != app.homemusic.R.id.menu_playlist_sort_last_updated) {
                                            if (itemId == app.homemusic.R.id.menu_playlist_sort_both) {
                                                playlistCatalogueFragment.n0.c("ORDER_BY_BOTH");
                                                break;
                                            }
                                        } else {
                                            playlistCatalogueFragment.n0.c("ORDER_BY_LAST_UPDATED");
                                            break;
                                        }
                                    } else {
                                        playlistCatalogueFragment.n0.c("ORDER_BY_LAST_PLAYED");
                                        break;
                                    }
                                } else {
                                    playlistCatalogueFragment.n0.c("ORDER_BY_SONGS");
                                    break;
                                }
                            } else {
                                playlistCatalogueFragment.n0.c("ORDER_BY_DATE");
                                break;
                            }
                        } else {
                            playlistCatalogueFragment.n0.c("ORDER_BY_RANDOM");
                            break;
                        }
                    } else {
                        playlistCatalogueFragment.n0.c("ORDER_BY_PINNED");
                        break;
                    }
                } else {
                    playlistCatalogueFragment.n0.c("ORDER_BY_NAME");
                    break;
                }
                break;
            case 8:
                PodcastChannelPageFragment podcastChannelPageFragment = (PodcastChannelPageFragment) kc1Var;
                if (menuItem.getItemId() == app.homemusic.R.id.menu_podcast_filter_download) {
                    podcastChannelPageFragment.o0.q("PODCAST_FILTER_BY_DOWNLOAD");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_podcast_filter_all) {
                    podcastChannelPageFragment.o0.q("PODCAST_FILTER_BY_ALL");
                }
                break;
            default:
                SongListPageFragment songListPageFragment = (SongListPageFragment) kc1Var;
                if (menuItem.getItemId() == app.homemusic.R.id.menu_song_sort_name) {
                    songListPageFragment.p0.t("MEDIA_BY_TITLE");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_song_sort_most_recently_starred) {
                    songListPageFragment.p0.t("MEDIA_MOST_RECENTLY_STARRED");
                } else if (menuItem.getItemId() == app.homemusic.R.id.menu_song_sort_least_recently_starred) {
                    songListPageFragment.p0.t("MEDIA_LEAST_RECENTLY_STARRED");
                }
                break;
        }
        return true;
    }
}
