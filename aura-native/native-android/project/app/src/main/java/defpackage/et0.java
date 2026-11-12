package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.DownloadFragment;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class et0 extends cx3 {
    public final lv4 u;
    public final /* synthetic */ ft0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public et0(ft0 ft0Var, lv4 lv4Var) {
        this.v = ft0Var;
        ConstraintLayout constraintLayout = (ConstraintLayout) lv4Var.n;
        super(constraintLayout);
        this.u = lv4Var;
        final int i = 1;
        ((TextView) lv4Var.s).setSelected(true);
        ((TextView) lv4Var.r).setSelected(true);
        final int i2 = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: dt0
            public final /* synthetic */ et0 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                et0 et0Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        ft0 ft0Var2 = et0Var.v;
                        String str = ft0Var2.r;
                        DownloadFragment downloadFragment = ft0Var2.q;
                        str.getClass();
                        switch (str) {
                            case "download_type_artist":
                                bundle.putString("download_type_artist", ((Child) ft0Var2.w.get(et0Var.c())).getArtistId());
                                downloadFragment.onArtistClick(bundle);
                                break;
                            case "download_type_year":
                                bundle.putString("download_type_year", ((Child) ft0Var2.w.get(et0Var.c())).getYear().toString());
                                downloadFragment.onYearClick(bundle);
                                break;
                            case "download_type_playlist":
                                if (ft0Var2.w.get(et0Var.c()) instanceof Download) {
                                    bundle.putString("download_type_playlist", ((Download) ft0Var2.w.get(et0Var.c())).getPlaylistId());
                                    downloadFragment.onPlaylistClick(bundle);
                                    break;
                                }
                                break;
                            case "download_type_album":
                                bundle.putString("download_type_album", ((Child) ft0Var2.w.get(et0Var.c())).getAlbumId());
                                downloadFragment.onAlbumClick(bundle);
                                break;
                            case "download_type_genre":
                                bundle.putString("download_type_genre", ((Child) ft0Var2.w.get(et0Var.c())).getGenre());
                                downloadFragment.onGenreClick(bundle);
                                break;
                            case "download_type_track":
                                bundle.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(ft0Var2.w));
                                bundle.putInt("ITEM_POSITION", et0Var.c());
                                downloadFragment.onMediaClick(bundle);
                                break;
                        }
                        break;
                    default:
                        et0Var.s();
                        break;
                }
            }
        });
        constraintLayout.setOnLongClickListener(new q6(9, this));
        ((FrameLayout) lv4Var.q).setOnClickListener(new View.OnClickListener(this) { // from class: dt0
            public final /* synthetic */ et0 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                et0 et0Var = this.o;
                switch (i3) {
                    case 0:
                        Bundle bundle = new Bundle();
                        ft0 ft0Var2 = et0Var.v;
                        String str = ft0Var2.r;
                        DownloadFragment downloadFragment = ft0Var2.q;
                        str.getClass();
                        switch (str) {
                            case "download_type_artist":
                                bundle.putString("download_type_artist", ((Child) ft0Var2.w.get(et0Var.c())).getArtistId());
                                downloadFragment.onArtistClick(bundle);
                                break;
                            case "download_type_year":
                                bundle.putString("download_type_year", ((Child) ft0Var2.w.get(et0Var.c())).getYear().toString());
                                downloadFragment.onYearClick(bundle);
                                break;
                            case "download_type_playlist":
                                if (ft0Var2.w.get(et0Var.c()) instanceof Download) {
                                    bundle.putString("download_type_playlist", ((Download) ft0Var2.w.get(et0Var.c())).getPlaylistId());
                                    downloadFragment.onPlaylistClick(bundle);
                                    break;
                                }
                                break;
                            case "download_type_album":
                                bundle.putString("download_type_album", ((Child) ft0Var2.w.get(et0Var.c())).getAlbumId());
                                downloadFragment.onAlbumClick(bundle);
                                break;
                            case "download_type_genre":
                                bundle.putString("download_type_genre", ((Child) ft0Var2.w.get(et0Var.c())).getGenre());
                                downloadFragment.onGenreClick(bundle);
                                break;
                            case "download_type_track":
                                bundle.putParcelableArrayList("TRACKS_OBJECT", new ArrayList<>(ft0Var2.w));
                                bundle.putInt("ITEM_POSITION", et0Var.c());
                                downloadFragment.onMediaClick(bundle);
                                break;
                        }
                        break;
                    default:
                        et0Var.s();
                        break;
                }
            }
        });
    }

    public final boolean s() {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        ft0 ft0Var = this.v;
        DownloadFragment downloadFragment = ft0Var.q;
        if ("download_type_track".equals(ft0Var.r)) {
            bundle.putParcelable("TRACK_OBJECT", (Parcelable) ft0Var.w.get(c()));
            downloadFragment.onMediaLongClick(bundle);
            return true;
        }
        String str = ft0Var.r;
        str.getClass();
        switch (str) {
            case "download_type_artist":
                arrayList.addAll(ft0.q("download_type_artist", ((Child) ft0Var.w.get(c())).getArtistId(), ft0Var.u));
                break;
            case "download_type_year":
                arrayList.addAll(ft0.q("download_type_year", ((Child) ft0Var.w.get(c())).getYear().toString(), ft0Var.u));
                break;
            case "download_type_playlist":
                if (ft0Var.w.get(c()) instanceof Download) {
                    arrayList.addAll(ft0.q("download_type_playlist", ((Download) ft0Var.w.get(c())).getPlaylistId(), ft0Var.u));
                    break;
                }
                break;
            case "download_type_album":
                arrayList.addAll(ft0.q("download_type_album", ((Child) ft0Var.w.get(c())).getAlbumId(), ft0Var.u));
                break;
            case "download_type_genre":
                arrayList.addAll(ft0.q("download_type_genre", ((Child) ft0Var.w.get(c())).getGenre(), ft0Var.u));
                break;
            case "download_type_track":
                arrayList.add((Child) ft0Var.w.get(c()));
                break;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        bundle.putParcelableArrayList("download_group", new ArrayList<>(arrayList));
        lv4 lv4Var = this.u;
        bundle.putString("download_group_title", ((TextView) lv4Var.s).getText().toString());
        bundle.putString("download_group_subtitle", ((TextView) lv4Var.r).getText().toString());
        downloadFragment.onDownloadGroupLongClick(bundle);
        return true;
    }
}
