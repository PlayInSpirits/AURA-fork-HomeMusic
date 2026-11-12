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
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ej extends dw3 implements Filterable {
    public ArrayList s;
    public final ClickCallback t;
    public final /* synthetic */ int q = 2;
    public final Filter u = new o7(this, 7);
    public List r = Collections.EMPTY_LIST;

    public ej(PodcastChannelCatalogueFragment podcastChannelCatalogueFragment) {
        this.t = podcastChannelCatalogueFragment;
    }

    @Override // defpackage.dw3
    public final int a() {
        switch (this.q) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.r.size();
    }

    @Override // defpackage.dw3
    public long b(int i) {
        switch (this.q) {
            case 0:
                return i;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return i;
            default:
                return super.b(i);
        }
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        switch (this.q) {
            case 0:
                dj djVar = (dj) cx3Var;
                ArtistID3 artistID3 = (ArtistID3) this.r.get(i);
                r20 r20Var = djVar.u;
                ((TextView) r20Var.q).setText(artistID3.getName());
                Context context = djVar.a.getContext();
                String coverArtId = artistID3.getCoverArtId();
                vz3 vz3VarT = b11.g(context, coverArtId, 3, a.c(context), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT = (vz3) vz3VarT.l();
                }
                vz3VarT.K((ImageView) r20Var.p);
                break;
            case 1:
                ((eh1) cx3Var).u.b.setText(((Genre) this.r.get(i)).getGenre());
                break;
            case 2:
                yl3 yl3Var = (yl3) cx3Var;
                Playlist playlist = (Playlist) this.r.get(i);
                x12 x12Var = yl3Var.u;
                x12Var.e.setText(playlist.getName());
                TextView textView = x12Var.c;
                View view = yl3Var.a;
                textView.setText(view.getContext().getString(R.string.playlist_counted_tracks, Integer.valueOf(playlist.getSongCount()), e03.h(Long.valueOf(playlist.getDuration()), false)));
                Context context2 = view.getContext();
                String coverArtId2 = playlist.getCoverArtId();
                vz3 vz3VarT2 = b11.g(context2, coverArtId2, 6, a.c(context2), coverArtId2 != null ? wg0.b(ud3.t(), coverArtId2) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT2 = (vz3) vz3VarT2.l();
                }
                vz3VarT2.K(x12Var.b);
                break;
            default:
                vm3 vm3Var = (vm3) cx3Var;
                PodcastChannel podcastChannel = (PodcastChannel) this.r.get(i);
                jv3 jv3Var = vm3Var.u;
                ((TextView) jv3Var.p).setText(podcastChannel.getTitle());
                Context context3 = vm3Var.a.getContext();
                String coverArtId3 = podcastChannel.getCoverArtId();
                vz3 vz3VarT3 = b11.g(context3, coverArtId3, 7, a.c(context3), coverArtId3 != null ? wg0.b(ud3.t(), coverArtId3) : null).T(xv0.b());
                if (ud3.R()) {
                    vz3VarT3 = (vz3) vz3VarT3.l();
                }
                vz3VarT3.K((ImageView) jv3Var.o);
                break;
        }
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        switch (this.q) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return (o7) this.u;
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        switch (this.q) {
            case 0:
                View viewI = b11.i(viewGroup, R.layout.item_library_catalogue_artist, viewGroup, false);
                int i2 = R.id.artist_catalogue_cover_image_view;
                ImageView imageView = (ImageView) uo.s(viewI, R.id.artist_catalogue_cover_image_view);
                if (imageView != null) {
                    i2 = R.id.artist_name_label;
                    TextView textView = (TextView) uo.s(viewI, R.id.artist_name_label);
                    if (textView != null) {
                        return new dj(this, new r20((ConstraintLayout) viewI, imageView, textView, false, 7));
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI.getResources().getResourceName(i2)));
                return null;
            case 1:
                View viewI2 = b11.i(viewGroup, R.layout.item_library_catalogue_genre, viewGroup, false);
                int i3 = R.id.card_view;
                if (((CardView) uo.s(viewI2, R.id.card_view)) != null) {
                    i3 = R.id.genre_label;
                    TextView textView2 = (TextView) uo.s(viewI2, R.id.genre_label);
                    if (textView2 != null) {
                        return new eh1(this, new ie1((LinearLayout) viewI2, textView2));
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI2.getResources().getResourceName(i3)));
                return null;
            case 2:
                View viewI3 = b11.i(viewGroup, R.layout.item_horizontal_playlist, viewGroup, false);
                int i4 = R.id.playlist_cover_image_view;
                ImageView imageView2 = (ImageView) uo.s(viewI3, R.id.playlist_cover_image_view);
                if (imageView2 != null) {
                    i4 = R.id.playlist_more_button;
                    FrameLayout frameLayout = (FrameLayout) uo.s(viewI3, R.id.playlist_more_button);
                    if (frameLayout != null) {
                        i4 = R.id.playlist_subtitle_text_view;
                        TextView textView3 = (TextView) uo.s(viewI3, R.id.playlist_subtitle_text_view);
                        if (textView3 != null) {
                            i4 = R.id.playlist_title_text_view;
                            TextView textView4 = (TextView) uo.s(viewI3, R.id.playlist_title_text_view);
                            if (textView4 != null) {
                                return new yl3(this, new x12((ConstraintLayout) viewI3, imageView2, frameLayout, textView3, textView4));
                            }
                        }
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI3.getResources().getResourceName(i4)));
                return null;
            default:
                View viewI4 = b11.i(viewGroup, R.layout.item_home_catalogue_podcast_channel, viewGroup, false);
                int i5 = R.id.podcast_channel_catalogue_cover_image_view;
                ImageView imageView3 = (ImageView) uo.s(viewI4, R.id.podcast_channel_catalogue_cover_image_view);
                if (imageView3 != null) {
                    i5 = R.id.podcast_channel_title_label;
                    TextView textView5 = (TextView) uo.s(viewI4, R.id.podcast_channel_title_label);
                    if (textView5 != null) {
                        return new vm3(this, new jv3((ConstraintLayout) viewI4, imageView3, textView5));
                    }
                }
                nz2.n("Missing required view with ID: ".concat(viewI4.getResources().getResourceName(i5)));
                return null;
        }
    }

    public void p(List list) {
        this.r = list;
        this.s = new ArrayList(list);
        d();
    }

    public void q(String str) {
        switch (str) {
            case "ARTIST_ORDER_BY_ALBUM_COUNT":
                this.r.sort(Comparator.comparing(new m7(10)).reversed());
                break;
            case "ARTIST_ORDER_BY_RANDOM":
                Collections.shuffle(this.r);
                break;
            case "ARTIST_ORDER_BY_NAME":
                this.r.sort(Comparator.comparing(new m7(9), String.CASE_INSENSITIVE_ORDER));
                break;
        }
        d();
    }

    public ej(GenreCatalogueFragment genreCatalogueFragment) {
        this.t = genreCatalogueFragment;
    }

    public ej(ArtistCatalogueFragment artistCatalogueFragment) {
        this.t = artistCatalogueFragment;
    }

    public ej(ClickCallback clickCallback) {
        this.t = clickCallback;
    }
}
