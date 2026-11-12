package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.AlbumInfo;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.ui.fragment.AlbumPageFragment;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g8 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AlbumPageFragment b;

    public /* synthetic */ g8(AlbumPageFragment albumPageFragment, int i) {
        this.a = i;
        this.b = albumPageFragment;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        boolean z = true;
        final AlbumPageFragment albumPageFragment = this.b;
        final int i2 = 0;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (albumPageFragment.p0 != null) {
                    Boolean bool = (Boolean) albumPageFragment.o0.c.d();
                    albumPageFragment.p0.s(str, bool != null && bool.booleanValue());
                }
                break;
            case 1:
                AlbumInfo albumInfo = (AlbumInfo) obj;
                pc1 pc1Var = albumPageFragment.l0;
                if (albumInfo == null) {
                    if (pc1Var != null) {
                        ((TextView) pc1Var.f).setVisibility(8);
                    }
                    break;
                } else {
                    if (pc1Var != null) {
                        ((TextView) pc1Var.f).setVisibility(0);
                    }
                    pc1 pc1Var2 = albumPageFragment.l0;
                    if (pc1Var2 != null) {
                        ((TextView) pc1Var2.f).setText(e03.c(albumInfo.getNotes()));
                    }
                    if (albumPageFragment.l0 != null && albumInfo.getLastFmUrl() != null && !albumInfo.getLastFmUrl().isEmpty()) {
                        ((TextView) albumPageFragment.l0.f).setOnClickListener(new j8(1, albumPageFragment, albumInfo));
                        break;
                    }
                }
                break;
            case 2:
                final List list = (List) obj;
                if (albumPageFragment.l0 != null && list != null && !list.isEmpty()) {
                    ((Button) albumPageFragment.l0.l).setOnClickListener(new View.OnClickListener() { // from class: h8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i3 = i2;
                            List list2 = list;
                            AlbumPageFragment albumPageFragment2 = albumPageFragment;
                            switch (i3) {
                                case 0:
                                    bo2.q(albumPageFragment2.q0, list2, 0, "album");
                                    ((au) albumPageFragment2.m0.V.n).d(true);
                                    break;
                                default:
                                    Collections.shuffle(list2);
                                    bo2.q(albumPageFragment2.q0, list2, 0, "album");
                                    ((au) albumPageFragment2.m0.V.n).d(true);
                                    break;
                            }
                        }
                    });
                    Button button = albumPageFragment.l0.m;
                    final int i3 = z ? 1 : 0;
                    button.setOnClickListener(new View.OnClickListener() { // from class: h8
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i3;
                            List list2 = list;
                            AlbumPageFragment albumPageFragment2 = albumPageFragment;
                            switch (i4) {
                                case 0:
                                    bo2.q(albumPageFragment2.q0, list2, 0, "album");
                                    ((au) albumPageFragment2.m0.V.n).d(true);
                                    break;
                                default:
                                    Collections.shuffle(list2);
                                    bo2.q(albumPageFragment2.q0, list2, 0, "album");
                                    ((au) albumPageFragment2.m0.V.n).d(true);
                                    break;
                            }
                        }
                    });
                }
                if (albumPageFragment.l0 != null) {
                    if (list == null || list.isEmpty()) {
                        ((Button) albumPageFragment.l0.l).setEnabled(false);
                        albumPageFragment.l0.m.setEnabled(false);
                    }
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                albumPageFragment.p0.r((List) obj);
                albumPageFragment.h0();
                break;
            case 4:
                Boolean bool2 = (Boolean) obj;
                if (albumPageFragment.p0 != null) {
                    albumPageFragment.p0.s((String) albumPageFragment.o0.b.d(), bool2 != null && bool2.booleanValue());
                }
                break;
            case 5:
                ArtistID3 artistID3 = (ArtistID3) obj;
                albumPageFragment.i0();
                if (artistID3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("ARTIST_OBJECT", artistID3.strippedForNav());
                    albumPageFragment.m0.T.m(R.id.action_albumPageFragment_to_artistPageFragment, bundle, null);
                } else {
                    Toast.makeText(albumPageFragment.Z(), R.string.album_error_retrieving_artist, 0).show();
                }
                break;
            case 6:
                AlbumID3 albumID3 = (AlbumID3) obj;
                AlbumPageFragment albumPageFragment2 = this.b;
                if (albumPageFragment2.l0 != null && albumID3 != null) {
                    ni4 ni4Var = new ni4(albumPageFragment2.v(), albumPageFragment2, false, false, albumID3);
                    albumPageFragment2.p0 = ni4Var;
                    ((RecyclerView) albumPageFragment2.l0.q).setAdapter(ni4Var);
                    albumPageFragment2.p0.A = albumPageFragment2.q0;
                    albumPageFragment2.h0();
                    albumPageFragment2.n0.i.e(albumPageFragment2.v(), new g8(albumPageFragment2, 3));
                    break;
                }
                break;
            case 7:
                AlbumID3 albumID4 = (AlbumID3) obj;
                pc1 pc1Var3 = albumPageFragment.l0;
                if (pc1Var3 != null && albumID4 != null) {
                    ((MaterialToolbar) pc1Var3.n).setTitle(albumID4.getName());
                    albumPageFragment.l0.e.setText(albumID4.getName());
                    albumPageFragment.l0.c.setText(albumID4.getArtist());
                    l93.g(albumPageFragment.l0.c);
                    albumPageFragment.l0.c.setOnLongClickListener(new i8(0, albumPageFragment, (albumID4.getArtistId() == null || albumID4.getArtistId().isEmpty()) ? null : l93.h("artist", albumID4.getArtistId())));
                    albumPageFragment.l0.g.setText(albumID4.getYear() != 0 ? String.valueOf(albumID4.getYear()) : "");
                    int year = albumID4.getYear();
                    pc1 pc1Var4 = albumPageFragment.l0;
                    if (year != 0) {
                        pc1Var4.g.setVisibility(0);
                        l93.g(albumPageFragment.l0.g);
                        albumPageFragment.l0.g.setOnClickListener(new j8(0, albumPageFragment, albumID4));
                        albumPageFragment.l0.g.setOnLongClickListener(new i8(1, albumPageFragment, albumID4));
                    } else {
                        pc1Var4.g.setVisibility(8);
                        albumPageFragment.l0.g.setOnClickListener(null);
                        albumPageFragment.l0.g.setOnLongClickListener(null);
                        l93.p(albumPageFragment.l0.g);
                    }
                    ((TextView) albumPageFragment.l0.i).setText(albumPageFragment.t(R.string.album_page_tracks_count_and_duration, albumID4.getSongCount(), Integer.valueOf(albumID4.getDuration() != null ? albumID4.getDuration().intValue() / 60 : 0)));
                    if (albumID4.getGenre() == null || albumID4.getGenre().isEmpty()) {
                        albumPageFragment.l0.d.setVisibility(8);
                    } else {
                        albumPageFragment.l0.d.setText(albumID4.getGenre());
                        albumPageFragment.l0.d.setVisibility(0);
                    }
                    if (albumID4.getReleaseDate() != null && albumID4.getOriginalReleaseDate() != null) {
                        if (albumID4.getReleaseDate().getFormattedDate() == null && albumID4.getOriginalReleaseDate().getFormattedDate() == null) {
                            albumPageFragment.l0.h.setVisibility(8);
                        } else {
                            albumPageFragment.l0.h.setVisibility(0);
                        }
                        if (albumID4.getReleaseDate().getFormattedDate() == null || albumID4.getOriginalReleaseDate().getFormattedDate() == null) {
                            albumPageFragment.l0.h.setText(albumPageFragment.t(R.string.album_page_release_date_label, (albumID4.getReleaseDate() != null ? albumID4.getReleaseDate() : albumID4.getOriginalReleaseDate()).getFormattedDate()));
                        }
                        if (albumID4.getReleaseDate().getFormattedDate() != null && albumID4.getOriginalReleaseDate().getFormattedDate() != null) {
                            if (Objects.equals(albumID4.getReleaseDate().getYear(), albumID4.getOriginalReleaseDate().getYear()) && Objects.equals(albumID4.getReleaseDate().getMonth(), albumID4.getOriginalReleaseDate().getMonth()) && Objects.equals(albumID4.getReleaseDate().getDay(), albumID4.getOriginalReleaseDate().getDay())) {
                                albumPageFragment.l0.h.setText(albumPageFragment.t(R.string.album_page_release_date_label, albumID4.getReleaseDate().getFormattedDate()));
                            } else {
                                albumPageFragment.l0.h.setText(albumPageFragment.t(R.string.album_page_release_dates_label, albumID4.getReleaseDate().getFormattedDate(), albumID4.getOriginalReleaseDate().getFormattedDate()));
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                AlbumID3 albumID5 = (AlbumID3) obj;
                if (albumPageFragment.l0 != null && albumID5 != null) {
                    Context contextZ = albumPageFragment.Z();
                    String coverArtId = albumID5.getCoverArtId();
                    vz3 vz3VarT = b11.g(contextZ, coverArtId, 2, a.c(contextZ), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                    if (ud3.R()) {
                        vz3VarT = (vz3) vz3VarT.l();
                    }
                    vz3VarT.K((ImageView) albumPageFragment.l0.j);
                    break;
                }
                break;
        }
    }
}
