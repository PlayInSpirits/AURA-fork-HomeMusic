package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.a;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl3 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlaylistPageFragment b;

    public /* synthetic */ zl3(PlaylistPageFragment playlistPageFragment, int i) {
        this.a = i;
        this.b = playlistPageFragment;
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
        final int i2 = 0;
        final PlaylistPageFragment playlistPageFragment = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (playlistPageFragment.p0 != null) {
                    Boolean bool = (Boolean) playlistPageFragment.o0.c.d();
                    playlistPageFragment.p0.s(str, bool != null && bool.booleanValue());
                }
                break;
            case 1:
                final List list = (List) obj;
                if (list != null) {
                    Playlist playlist = playlistPageFragment.n0.e;
                    if (playlist != null) {
                        String strA = v13.a(playlist.getId());
                        String name = playlistPageFragment.n0.e.getName();
                        WeakReference weakReference = a.a;
                        if (name != null && !qm4.u0(name)) {
                            a.e.put(strA, name);
                        }
                    }
                    playlistPageFragment.l0.k.setEnabled(!list.isEmpty());
                    playlistPageFragment.l0.l.setEnabled(!list.isEmpty());
                    playlistPageFragment.l0.o.setVisibility(8);
                    playlistPageFragment.l0.k.setOnClickListener(new View.OnClickListener() { // from class: am3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i3 = i2;
                            List list2 = list;
                            PlaylistPageFragment playlistPageFragment2 = playlistPageFragment;
                            switch (i3) {
                                case 0:
                                    bo2.q(playlistPageFragment2.r0, list2, 0, v13.a(playlistPageFragment2.n0.e.getId()));
                                    ((au) playlistPageFragment2.m0.V.n).d(true);
                                    break;
                                default:
                                    String strA2 = v13.a(playlistPageFragment2.n0.e.getId());
                                    a.m(playlistPageFragment2.m0, strA2, playlistPageFragment2.n0.e.getName(), list2, new qo2(playlistPageFragment2, list2, strA2, 5));
                                    break;
                            }
                        }
                    });
                    Button button = playlistPageFragment.l0.l;
                    final int i3 = z ? 1 : 0;
                    button.setOnClickListener(new View.OnClickListener() { // from class: am3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i4 = i3;
                            List list2 = list;
                            PlaylistPageFragment playlistPageFragment2 = playlistPageFragment;
                            switch (i4) {
                                case 0:
                                    bo2.q(playlistPageFragment2.r0, list2, 0, v13.a(playlistPageFragment2.n0.e.getId()));
                                    ((au) playlistPageFragment2.m0.V.n).d(true);
                                    break;
                                default:
                                    String strA2 = v13.a(playlistPageFragment2.n0.e.getId());
                                    a.m(playlistPageFragment2.m0, strA2, playlistPageFragment2.n0.e.getName(), list2, new qo2(playlistPageFragment2, list2, strA2, 5));
                                    break;
                            }
                        }
                    });
                }
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                if (playlistPageFragment.p0 != null) {
                    playlistPageFragment.p0.s((String) playlistPageFragment.o0.b.d(), bool2 != null && bool2.booleanValue());
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (((Boolean) obj).booleanValue() && playlistPageFragment.n() != null) {
                    f9 f9Var = playlistPageFragment.q0;
                    if (f9Var == null || !f9Var.isShowing()) {
                        e9 e9Var = new e9(playlistPageFragment.n());
                        a9 a9Var = e9Var.a;
                        a9Var.d = a9Var.a.getText(R.string.playlist_error_not_found_title);
                        a9Var.f = a9Var.a.getText(R.string.playlist_error_not_found_message);
                        playlistPageFragment.q0 = e9Var.setPositiveButton(android.R.string.ok, new vr(4, playlistPageFragment)).a().h();
                    }
                    break;
                }
                break;
            case 4:
                List list2 = (List) obj;
                if (playlistPageFragment.l0 != null && list2 != null && !list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list2);
                    Collections.shuffle(arrayList);
                    Context contextZ = playlistPageFragment.Z();
                    String coverArtId = !arrayList.isEmpty() ? ((Child) arrayList.get(0)).getCoverArtId() : null;
                    vz3 vz3VarT = b11.g(contextZ, coverArtId, 9, com.bumptech.glide.a.c(contextZ), coverArtId != null ? wg0.b(ud3.t(), coverArtId) : null).T(xv0.b());
                    if (ud3.R()) {
                        vz3VarT = (vz3) vz3VarT.l();
                    }
                    float f = wg0.a;
                    ((vz3) vz3VarT.A(new qj1(f, 0.0f, 0.0f, 0.0f))).K(playlistPageFragment.l0.f);
                    Context contextZ2 = playlistPageFragment.Z();
                    String coverArtId2 = arrayList.size() > 1 ? ((Child) arrayList.get(1)).getCoverArtId() : null;
                    vz3 vz3VarT2 = b11.g(contextZ2, coverArtId2, 9, com.bumptech.glide.a.c(contextZ2), coverArtId2 != null ? wg0.b(ud3.t(), coverArtId2) : null).T(xv0.b());
                    if (ud3.R()) {
                        vz3VarT2 = (vz3) vz3VarT2.l();
                    }
                    ((vz3) vz3VarT2.A(new qj1(0.0f, f, 0.0f, 0.0f))).K(playlistPageFragment.l0.g);
                    Context contextZ3 = playlistPageFragment.Z();
                    String coverArtId3 = arrayList.size() > 2 ? ((Child) arrayList.get(2)).getCoverArtId() : null;
                    vz3 vz3VarT3 = b11.g(contextZ3, coverArtId3, 9, com.bumptech.glide.a.c(contextZ3), coverArtId3 != null ? wg0.b(ud3.t(), coverArtId3) : null).T(xv0.b());
                    if (ud3.R()) {
                        vz3VarT3 = (vz3) vz3VarT3.l();
                    }
                    ((vz3) vz3VarT3.A(new qj1(0.0f, 0.0f, 0.0f, f))).K(playlistPageFragment.l0.d);
                    Context contextZ4 = playlistPageFragment.Z();
                    String coverArtId4 = arrayList.size() > 3 ? ((Child) arrayList.get(3)).getCoverArtId() : null;
                    vz3 vz3VarT4 = b11.g(contextZ4, coverArtId4, 9, com.bumptech.glide.a.c(contextZ4), coverArtId4 != null ? wg0.b(ud3.t(), coverArtId4) : null).T(xv0.b());
                    if (ud3.R()) {
                        vz3VarT4 = (vz3) vz3VarT4.l();
                    }
                    ((vz3) vz3VarT4.A(new qj1(0.0f, 0.0f, f, 0.0f))).K(playlistPageFragment.l0.e);
                    break;
                }
                break;
            default:
                List list3 = (List) obj;
                playlistPageFragment.p0.r(list3);
                if (list3 != null) {
                    playlistPageFragment.l0.c.setVisibility(list3.isEmpty() ? 0 : 8);
                    playlistPageFragment.l0.m.setText(playlistPageFragment.t(R.string.playlist_song_count, Integer.valueOf(list3.size())));
                    playlistPageFragment.l0.h.setText(playlistPageFragment.t(R.string.playlist_duration, e03.h(Long.valueOf(list3.stream().mapToLong(new bm3()).sum()), false)));
                    if (playlistPageFragment.s0) {
                        List list4 = (List) list3.stream().map(new m7(17)).collect(Collectors.toList());
                        if (!list4.equals(playlistPageFragment.u0)) {
                            playlistPageFragment.u0 = list4;
                            playlistPageFragment.h0(list3);
                        }
                    }
                }
                playlistPageFragment.i0();
                break;
        }
    }
}
