package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.model.LyricsCache;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ArtistWithAlbumsID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Directory;
import com.eddyizm.tempus.subsonic.models.Genre;
import com.eddyizm.tempus.subsonic.models.Index;
import com.eddyizm.tempus.subsonic.models.Indexes;
import com.eddyizm.tempus.subsonic.models.PodcastChannel;
import com.eddyizm.tempus.subsonic.models.PodcastEpisode;
import com.eddyizm.tempus.subsonic.models.Share;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.AlbumListPageFragment;
import com.eddyizm.tempus.ui.fragment.ArtistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.ArtistListPageFragment;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import com.eddyizm.tempus.ui.fragment.FilterFragment;
import com.eddyizm.tempus.ui.fragment.GenreCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.IndexFragment;
import com.eddyizm.tempus.ui.fragment.LoginFragment;
import com.eddyizm.tempus.ui.fragment.PlaylistCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelCatalogueFragment;
import com.eddyizm.tempus.ui.fragment.PodcastChannelPageFragment;
import com.eddyizm.tempus.ui.fragment.bottomsheetdialog.ArtistBottomSheetDialog;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d8 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        List list;
        List list2;
        List list3;
        int i = this.a;
        byte b = 3;
        int i2 = 2;
        boolean z = true;
        int i3 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AlbumListPageFragment albumListPageFragment = (AlbumListPageFragment) obj2;
                List list4 = (List) obj;
                b8 b8Var = albumListPageFragment.o0;
                if (list4 != null) {
                    list = list4;
                } else {
                    b8Var.getClass();
                    list = Collections.EMPTY_LIST;
                }
                b8Var.s = list;
                ((o7) b8Var.v).filter(b8Var.u);
                b8Var.d();
                String str = albumListPageFragment.n0.d;
                str.getClass();
                switch (str) {
                    case "ALBUM_MOST_PLAYED":
                    case "ALBUM_RECENTLY_PLAYED":
                    case "ALBUM_RECENTLY_ADDED":
                        TextView textView = albumListPageFragment.l0.e;
                        int size = list4.size();
                        int i4 = albumListPageFragment.n0.h;
                        textView.setText(size < i4 ? albumListPageFragment.t(R.string.generic_list_page_count, Integer.valueOf(list4.size())) : albumListPageFragment.t(R.string.generic_list_page_count_unknown, Integer.valueOf(i4)));
                        break;
                    case "ALBUM_STARRED":
                        albumListPageFragment.l0.e.setText(albumListPageFragment.t(R.string.generic_list_page_count, Integer.valueOf(list4.size())));
                        break;
                }
                String str2 = albumListPageFragment.n0.d;
                str2.getClass();
                switch (str2.hashCode()) {
                    case -1245588193:
                        b = str2.equals("ALBUM_MOST_PLAYED") ? (byte) 0 : (byte) -1;
                        break;
                    case 909521647:
                        b = str2.equals("ALBUM_STARRED") ? (byte) 1 : (byte) -1;
                        break;
                    case 928429018:
                        b = str2.equals("ALBUM_RECENTLY_PLAYED") ? (byte) 2 : (byte) -1;
                        break;
                    case 1124239097:
                        if (!str2.equals("ALBUM_RECENTLY_ADDED")) {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                    case 2:
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        albumListPageFragment.l0.d.setVisibility(8);
                        break;
                    case 1:
                        albumListPageFragment.l0.d.setVisibility(0);
                        break;
                }
                break;
            case 1:
                ToggleButton toggleButton = (ToggleButton) obj2;
                AlbumID3 albumID3 = (AlbumID3) obj;
                if (albumID3 != null) {
                    toggleButton.setChecked(n61.f(2, albumID3.getId(), albumID3.getStarred() != null));
                }
                break;
            case 2:
                n8 n8Var = (n8) obj2;
                AlbumID3 albumID4 = (AlbumID3) obj;
                if (albumID4 != null) {
                    n8Var.h.k(albumID4);
                } else {
                    n8Var.getClass();
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ArtistBottomSheetDialog artistBottomSheetDialog = (ArtistBottomSheetDialog) obj2;
                List list5 = (List) obj;
                e03.o(list5);
                if (!list5.isEmpty()) {
                    bo2.q(artistBottomSheetDialog.D0, list5, 0, "artist");
                    ((au) ((MainActivity) artistBottomSheetDialog.X()).V.n).d(true);
                }
                artistBottomSheetDialog.h0();
                break;
            case 4:
                ArtistCatalogueFragment artistCatalogueFragment = (ArtistCatalogueFragment) obj2;
                List list6 = (List) obj;
                ej ejVar = artistCatalogueFragment.o0;
                ejVar.r = list6;
                ejVar.s = new ArrayList(list6);
                ejVar.d();
                ej ejVar2 = artistCatalogueFragment.o0;
                App.b().getClass();
                boolean z2 = App.c().getBoolean("artist_sort_by_album_count", false);
                Log.d("Preferences", "getSortOrder");
                ejVar2.q(z2 ? "ARTIST_ORDER_BY_ALBUM_COUNT" : "ARTIST_ORDER_BY_NAME");
                break;
            case 5:
                ArtistListPageFragment artistListPageFragment = (ArtistListPageFragment) obj2;
                List list7 = (List) obj;
                b8 b8Var2 = artistListPageFragment.o0;
                if (list7 != null) {
                    list2 = list7;
                } else {
                    b8Var2.getClass();
                    list2 = Collections.EMPTY_LIST;
                }
                b8Var2.s = list2;
                ((o7) b8Var2.v).filter(b8Var2.u);
                b8Var2.d();
                String str3 = artistListPageFragment.n0.e;
                str3.getClass();
                if (str3.equals("ARTIST_STARRED") || str3.equals("ARTIST_DOWNLOADED")) {
                    artistListPageFragment.l0.e.setText(artistListPageFragment.t(R.string.generic_list_page_count, Integer.valueOf(list7.size())));
                }
                String str4 = artistListPageFragment.n0.e;
                str4.getClass();
                if (str4.equals("ARTIST_STARRED") || str4.equals("ARTIST_DOWNLOADED")) {
                    artistListPageFragment.l0.d.setVisibility(0);
                }
                break;
            case 6:
                wj wjVar = (wj) obj2;
                ArtistID3 artistID3 = (ArtistID3) obj;
                k03 k03Var = wjVar.f;
                k03 k03Var2 = wjVar.g;
                if (artistID3 != null && (artistID3 instanceof ArtistWithAlbumsID3)) {
                    tj tjVar = new tj(i3, wjVar);
                    List<AlbumID3> albums = ((ArtistWithAlbumsID3) artistID3).getAlbums();
                    if (albums != null) {
                        albums.sort(Comparator.comparing(new m7(2)).reversed());
                        k03Var2.k((Map) ((List) albums.stream().filter(tjVar).collect(Collectors.toList())).stream().collect(Collectors.groupingBy(new m7(14))));
                    } else {
                        k03Var2.k(Collections.EMPTY_MAP);
                        k03Var.k(Collections.EMPTY_LIST);
                    }
                    if (albums != null) {
                        albums.sort(Comparator.comparing(new m7(2)).reversed());
                        k03Var.k((List) albums.stream().filter(new tj(z ? 1 : 0, tjVar)).collect(Collectors.toList()));
                    }
                    break;
                }
                break;
            case 7:
                final DirectoryFragment directoryFragment = (DirectoryFragment) obj2;
                final Directory directory = (Directory) obj;
                ((AppBarLayout) directoryFragment.l0.a).a(new af() { // from class: pq0
                    @Override // defpackage.af
                    public final void a(int i5) {
                        DirectoryFragment directoryFragment2 = directoryFragment;
                        ml3 ml3Var = directoryFragment2.l0;
                        if (ml3Var == null) {
                            return;
                        }
                        int height = ((ConstraintLayout) ml3Var.c).getHeight() + i5;
                        MaterialToolbar materialToolbar = (MaterialToolbar) directoryFragment2.l0.f;
                        WeakHashMap weakHashMap = j65.a;
                        int minimumHeight = materialToolbar.getMinimumHeight() * 2;
                        ml3 ml3Var2 = directoryFragment2.l0;
                        if (height < minimumHeight) {
                            ((MaterialToolbar) ml3Var2.f).setTitle(directory.getName());
                        } else {
                            ((MaterialToolbar) ml3Var2.f).setTitle(R.string.empty_string);
                        }
                    }
                });
                ((TextView) directoryFragment.l0.e).setText(directory.getName());
                zd0 zd0Var = directoryFragment.o0;
                List<Child> children = directory.getChildren();
                zd0Var.getClass();
                if (children != null) {
                    ArrayList arrayList = new ArrayList(children);
                    arrayList.sort(new n7(18));
                    zd0Var.r = arrayList;
                } else {
                    zd0Var.r = Collections.EMPTY_LIST;
                }
                zd0Var.d();
                directoryFragment.r0.setVisible((directory.getChildren() == null || directory.getChildren().stream().filter(new c7(z ? 1 : 0)).findFirst().orElse(null) == null) ? false : true);
                break;
            case 8:
                qq0 qq0Var = (qq0) obj2;
                Directory directory2 = (Directory) obj;
                DirectoryFragment directoryFragment2 = qq0Var.n;
                if (directoryFragment2.B() && directoryFragment2.e() != null) {
                    List list8 = (List) directory2.getChildren().stream().filter(new c7(i2)).collect(Collectors.toList());
                    if (ud3.o() == null) {
                        au0.w(directoryFragment2.Z()).a(gi1.H(list8), (List) list8.stream().map(new hu3(6)).collect(Collectors.toList()), false);
                    } else {
                        list8.forEach(new d7(3, qq0Var));
                    }
                    break;
                }
                break;
            case 9:
                ((bu0) obj2).d.i((List) ((List) obj).stream().map(new m7(22)).collect(Collectors.toList()));
                break;
            case 10:
                FilterFragment filterFragment = (FilterFragment) obj2;
                ((ProgressBar) filterFragment.m0.s).setVisibility(8);
                ((NestedScrollView) filterFragment.m0.o).setVisibility(0);
                for (Genre genre : (List) obj) {
                    Chip chip = (Chip) filterFragment.X().getLayoutInflater().inflate(R.layout.chip_search_filter_genre, (ViewGroup) null, false);
                    chip.setText(genre.getGenre());
                    chip.setChecked(filterFragment.n0.d.contains(genre.getGenre()));
                    chip.setOnCheckedChangeListener(new w11(z ? 1 : 0, filterFragment, genre));
                    ((ChipGroup) filterFragment.m0.p).addView(chip);
                }
                break;
            case 11:
                List list9 = (List) obj;
                ej ejVar3 = ((GenreCatalogueFragment) obj2).o0;
                ejVar3.r = list9;
                ejVar3.s = new ArrayList(list9);
                ejVar3.d();
                break;
            case 12:
                hp1 hp1Var = (hp1) obj2;
                List list10 = (List) obj;
                z40 z40Var = hp1Var.l0;
                if (list10 == null) {
                    if (z40Var != null) {
                        ((RecyclerView) z40Var.q).setVisibility(8);
                    }
                    z40 z40Var2 = hp1Var.l0;
                    if (z40Var2 != null) {
                        ((LinearLayout) z40Var2.n).setVisibility(8);
                    }
                } else {
                    if (z40Var != null) {
                        ((RecyclerView) z40Var.q).setVisibility(!list10.isEmpty() ? 0 : 8);
                    }
                    z40 z40Var3 = hp1Var.l0;
                    if (z40Var3 != null) {
                        ((LinearLayout) z40Var3.n).setVisibility(list10.isEmpty() ? 0 : 8);
                    }
                    zd0 zd0Var2 = hp1Var.o0;
                    zd0Var2.r = list10;
                    zd0Var2.d();
                }
                break;
            case 13:
                IndexFragment indexFragment = (IndexFragment) obj2;
                Indexes indexes = (Indexes) obj;
                if (indexes != null) {
                    if (indexes.getIndices() == null) {
                        list3 = Collections.EMPTY_LIST;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (Index index : indexes.getIndices()) {
                            if (index.getArtists() != null) {
                                arrayList2.addAll(index.getArtists());
                            }
                        }
                        list3 = arrayList2;
                    }
                    indexFragment.s0 = list3;
                    indexFragment.h0();
                }
                break;
            case 14:
                LoginFragment loginFragment = (LoginFragment) obj2;
                List list11 = (List) obj;
                boolean zIsEmpty = list11.isEmpty();
                ml3 ml3Var = loginFragment.l0;
                if (zIsEmpty) {
                    if (ml3Var != null) {
                        ((TextView) ml3Var.c).setVisibility(0);
                    }
                    ml3 ml3Var2 = loginFragment.l0;
                    if (ml3Var2 != null) {
                        ((RecyclerView) ml3Var2.e).setVisibility(8);
                    }
                } else {
                    if (ml3Var != null) {
                        ((TextView) ml3Var.c).setVisibility(8);
                    }
                    ml3 ml3Var3 = loginFragment.l0;
                    if (ml3Var3 != null) {
                        ((RecyclerView) ml3Var3.e).setVisibility(0);
                    }
                    zd0 zd0Var3 = loginFragment.o0;
                    zd0Var3.r = list11;
                    zd0Var3.d();
                }
                break;
            case 15:
                ((Runnable) obj2).run();
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                ((aj3) obj2).e((LyricsCache) obj);
                break;
            case 17:
                PlaylistCatalogueFragment playlistCatalogueFragment = (PlaylistCatalogueFragment) obj2;
                List list12 = (List) obj;
                if (list12 != null) {
                    Log.d("TempusLog", "UI Update: Received " + list12.size() + " items");
                    q7 q7Var = playlistCatalogueFragment.o0;
                    q7Var.getClass();
                    ArrayList arrayList3 = new ArrayList(list12);
                    q7Var.s = arrayList3;
                    q7Var.t = su3.q((String) q7Var.v, arrayList3);
                    q7Var.d();
                    playlistCatalogueFragment.o0.d();
                }
                break;
            case 18:
                fl3 fl3Var = (fl3) obj2;
                List list13 = (List) obj;
                if (list13 != null) {
                    boolean zIsEmpty2 = list13.isEmpty();
                    ml3 ml3Var4 = fl3Var.B0;
                    if (zIsEmpty2) {
                        if (ml3Var4 != null) {
                            ((TextView) ml3Var4.b).setVisibility(0);
                        }
                        ml3 ml3Var5 = fl3Var.B0;
                        if (ml3Var5 != null) {
                            ((RecyclerView) ml3Var5.f).setVisibility(8);
                        }
                    } else {
                        if (ml3Var4 != null) {
                            ((TextView) ml3Var4.b).setVisibility(8);
                        }
                        ml3 ml3Var6 = fl3Var.B0;
                        if (ml3Var6 != null) {
                            ((RecyclerView) ml3Var6.f).setVisibility(0);
                        }
                        zd0 zd0Var4 = fl3Var.D0;
                        zd0Var4.r = list13;
                        zd0Var4.d();
                    }
                }
                break;
            case 19:
                sl3 sl3Var = (sl3) obj2;
                ((ClipboardManager) sl3Var.X().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(sl3Var.s(R.string.app_name), ((Share) obj).getUrl()));
                break;
            case 20:
                wl3 wl3Var = (wl3) obj2;
                List list14 = (List) obj;
                if (list14 != null) {
                    wl3Var.j = Integer.valueOf(list14.size());
                    d8 d8Var = wl3Var.k;
                    if (d8Var != null) {
                        wl3Var.g.j(d8Var);
                        wl3Var.k = null;
                        break;
                    }
                }
                break;
            case 21:
                im3 im3Var = (im3) obj2;
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue() && im3Var.e != null) {
                    im3Var.h();
                    break;
                }
                break;
            case 22:
                PodcastChannelCatalogueFragment podcastChannelCatalogueFragment = (PodcastChannelCatalogueFragment) obj2;
                List list15 = (List) obj;
                if (list15 != null) {
                    ej ejVar4 = podcastChannelCatalogueFragment.o0;
                    ejVar4.r = list15;
                    ejVar4.s = new ArrayList(list15);
                    ejVar4.d();
                }
                break;
            case 23:
                PodcastChannelPageFragment podcastChannelPageFragment = (PodcastChannelPageFragment) obj2;
                List list16 = (List) obj;
                z40 z40Var4 = podcastChannelPageFragment.l0;
                if (list16 == null) {
                    if (z40Var4 != null) {
                        ((RecyclerView) z40Var4.p).setVisibility(8);
                    }
                    podcastChannelPageFragment.o0.p(Collections.EMPTY_LIST);
                } else {
                    if (z40Var4 != null) {
                        ((RecyclerView) z40Var4.p).setVisibility(0);
                    }
                    if (list16.isEmpty() || list16.get(0) == null || ((PodcastChannel) list16.get(0)).getEpisodes() == null) {
                        z40 z40Var5 = podcastChannelPageFragment.l0;
                        if (z40Var5 != null) {
                            ((RecyclerView) z40Var5.p).setVisibility(8);
                        }
                        podcastChannelPageFragment.o0.p(Collections.EMPTY_LIST);
                    } else {
                        List<PodcastEpisode> episodes = ((PodcastChannel) list16.get(0)).getEpisodes();
                        z40 z40Var6 = podcastChannelPageFragment.l0;
                        if (z40Var6 == null || episodes == null) {
                            podcastChannelPageFragment.o0.p(Collections.EMPTY_LIST);
                        } else {
                            ((RecyclerView) z40Var6.p).setVisibility(episodes.isEmpty() ? 8 : 0);
                            podcastChannelPageFragment.o0.p(episodes);
                        }
                    }
                }
                break;
            case 24:
                ui4 ui4Var = (ui4) obj2;
                List list17 = (List) obj;
                ui4Var.getClass();
                if (list17 != null && !list17.isEmpty()) {
                    List list18 = (List) ui4Var.j.d();
                    list18.addAll(list17);
                    ui4Var.j.k(list18);
                    break;
                }
                break;
            case 25:
                bl4 bl4Var = (bl4) obj2;
                List list19 = (List) obj;
                k03 k03Var3 = bl4Var.d;
                if (list19 == null || list19.isEmpty()) {
                    k03Var3.i(new ArrayList());
                } else {
                    Objects.requireNonNull(k03Var3);
                    bl4Var.c(list19, new xj(k03Var3, 2));
                }
                break;
            default:
                cl4 cl4Var = (cl4) obj2;
                List list20 = (List) obj;
                k03 k03Var4 = cl4Var.d;
                if (list20 == null || list20.isEmpty()) {
                    k03Var4.i(new ArrayList());
                } else {
                    Objects.requireNonNull(k03Var4);
                    cl4Var.c(list20, new xj(k03Var4, 3));
                }
                break;
        }
    }
}
