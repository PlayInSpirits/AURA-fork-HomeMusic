package defpackage;

import android.content.Context;
import android.os.Handler;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.ArtistInfo2;
import com.eddyizm.tempus.ui.fragment.ArtistPageFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oj implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArtistPageFragment b;

    public /* synthetic */ oj(ArtistPageFragment artistPageFragment, int i) {
        this.a = i;
        this.b = artistPageFragment;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.a;
        int i2 = 5;
        int i3 = 3;
        int i4 = 8;
        ArtistPageFragment artistPageFragment = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (artistPageFragment.p0 != null) {
                    Boolean bool = (Boolean) artistPageFragment.o0.c.d();
                    artistPageFragment.p0.s(str, bool != null && bool.booleanValue());
                }
                break;
            case 1:
                ArtistInfo2 artistInfo2 = (ArtistInfo2) obj;
                if (artistInfo2 != null) {
                    if (artistPageFragment.n() != null && artistPageFragment.l0 != null) {
                        ArtistID3 artistID3 = artistPageFragment.n0.e;
                        String id = (artistID3.getCoverArtId() == null || artistID3.getCoverArtId().trim().isEmpty()) ? artistID3.getId() : artistID3.getCoverArtId();
                        Objects.requireNonNull(id);
                        String id2 = (!id.equals(artistID3.getCoverArtId()) || artistID3.getId() == null || artistID3.getId().equals(id)) ? null : artistID3.getId();
                        Context contextZ = artistPageFragment.Z();
                        vz3 vz3VarT = b11.g(contextZ, id, 3, a.c(contextZ), wg0.b(ud3.t(), id)).T(xv0.b());
                        if (ud3.R()) {
                            vz3VarT = (vz3) vz3VarT.l();
                        }
                        vz3VarT.L(new rj(artistPageFragment, id2)).K(artistPageFragment.l0.f);
                    }
                    if (artistPageFragment.l0 != null) {
                        String strTrim = e03.c(artistInfo2.getBiography()).trim();
                        String lastFmUrl = artistInfo2.getLastFmUrl();
                        boolean zIsEmpty = strTrim.isEmpty();
                        sc1 sc1Var = artistPageFragment.l0;
                        if (zIsEmpty) {
                            sc1Var.m.setVisibility(8);
                        } else {
                            sc1Var.m.setText(strTrim);
                        }
                        sc1 sc1Var2 = artistPageFragment.l0;
                        if (lastFmUrl == null) {
                            sc1Var2.l.setVisibility(8);
                        } else {
                            sc1Var2.l.setOnClickListener(new j8(4, artistPageFragment, artistInfo2));
                            artistPageFragment.l0.l.setVisibility(0);
                        }
                        if (!strTrim.isEmpty() || lastFmUrl != null) {
                            ((Button) artistPageFragment.l0.a.findViewById(R.id.button_toggle_bio)).setOnClickListener(new pj(artistPageFragment, i2));
                            App.b().getClass();
                            artistPageFragment.l0.h.setVisibility(App.c().getBoolean("artist_display_biography", true) ? 0 : 8);
                        }
                    }
                } else {
                    sc1 sc1Var3 = artistPageFragment.l0;
                    if (sc1Var3 != null) {
                        sc1Var3.h.setVisibility(8);
                    }
                }
                break;
            case 2:
                List list = (List) obj;
                Handler handler = artistPageFragment.w0;
                a0 a0Var = artistPageFragment.x0;
                handler.removeCallbacks(a0Var);
                boolean zIsEmpty2 = list.isEmpty();
                sc1 sc1Var4 = artistPageFragment.l0;
                if (!zIsEmpty2) {
                    sc1Var4.t.setVisibility(0);
                    artistPageFragment.l0.k.setVisibility(0);
                    artistPageFragment.l0.p.setVisibility(0);
                    artistPageFragment.l0.s.setVisibility(0);
                    artistPageFragment.l0.r.setVisibility(8);
                    artistPageFragment.l0.q.setVisibility(8);
                    artistPageFragment.l0.t.setVisibility(list.size() > 3 ? 0 : 8);
                    artistPageFragment.p0.r((List) list.stream().limit(3L).collect(Collectors.toList()));
                    artistPageFragment.i0();
                } else {
                    sc1Var4.k.setVisibility(0);
                    artistPageFragment.l0.p.setVisibility(8);
                    artistPageFragment.l0.s.setVisibility(8);
                    artistPageFragment.l0.r.setVisibility(0);
                    artistPageFragment.l0.q.setVisibility(8);
                    handler.postDelayed(a0Var, 3000L);
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                Boolean bool2 = (Boolean) obj;
                if (artistPageFragment.p0 != null) {
                    artistPageFragment.p0.s((String) artistPageFragment.o0.b.d(), bool2 != null && bool2.booleanValue());
                }
                break;
            case 4:
                Map map = (Map) obj;
                sc1 sc1Var5 = artistPageFragment.l0;
                if (sc1Var5 != null) {
                    RecyclerView recyclerView = sc1Var5.b;
                    if (map != null && !map.isEmpty()) {
                        i4 = 0;
                    }
                    recyclerView.setVisibility(i4);
                    if (map != null) {
                        v8 v8Var = artistPageFragment.q0;
                        v8Var.s = map;
                        v8Var.d();
                    }
                }
                break;
            case 5:
                List list2 = (List) obj;
                sc1 sc1Var6 = artistPageFragment.l0;
                if (sc1Var6 != null) {
                    sc1Var6.g.setVisibility((list2 == null || list2.isEmpty()) ? 8 : 0);
                    if (list2 != null) {
                        artistPageFragment.l0.e.setVisibility(list2.size() > 5 ? 0 : 8);
                        l7 l7Var = artistPageFragment.r0;
                        l7Var.r = list2;
                        l7Var.d();
                        artistPageFragment.l0.e.setOnClickListener(new j8(i3, artistPageFragment, list2));
                    }
                }
                break;
            default:
                ArtistInfo2 artistInfo3 = (ArtistInfo2) obj;
                sc1 sc1Var7 = artistPageFragment.l0;
                if (artistInfo3 != null) {
                    if (sc1Var7 != null && artistInfo3.getSimilarArtists() != null) {
                        artistPageFragment.l0.u.setVisibility(artistInfo3.getSimilarArtists().isEmpty() ? 8 : 0);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (artistInfo3.getSimilarArtists() != null) {
                        arrayList.addAll(artistInfo3.getSimilarArtists());
                    }
                    s6 s6Var = artistPageFragment.s0;
                    s6Var.r = arrayList;
                    s6Var.d();
                } else if (sc1Var7 != null) {
                    sc1Var7.u.setVisibility(8);
                }
                break;
        }
    }
}
