package defpackage;

import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.preference.ListPreference;
import app.homemusic.R;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.MusicFolder;
import com.eddyizm.tempus.subsonic.models.PlayQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class np0 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ np0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i;
        int i2 = this.a;
        int i3 = 0;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                pp0 pp0Var = (pp0) obj2;
                if (((ba2) obj) != null && pp0Var.s0) {
                    View viewA0 = pp0Var.a0();
                    if (viewA0.getParent() != null) {
                        kf2.o("DialogFragment can not be attached to a container view");
                    } else if (pp0Var.w0 != null) {
                        if (ld1.I(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + pp0Var.w0);
                        }
                        pp0Var.w0.setContentView(viewA0);
                    }
                    break;
                }
                break;
            case 1:
                List<Child> list = (List) obj;
                cp1 cp1Var = (cp1) ((i4) obj2).o;
                if (list != null && !list.isEmpty()) {
                    if (ud3.o() == null) {
                        eu0 eu0VarW = au0.w(cp1Var.Z());
                        i = 0;
                        for (Child child : list) {
                            String id = child.getId();
                            eu0VarW.getClass();
                            if (!eu0.d(id)) {
                                eu0VarW.b(gi1.G(child), new Download(child), false);
                                i++;
                            }
                        }
                    } else {
                        i = 0;
                        for (Child child2 : list) {
                            if (g51.e(child2) == null) {
                                i51.a(cp1Var.Z(), child2);
                                i++;
                            }
                        }
                    }
                    if (i > 0) {
                        Toast.makeText(cp1Var.Z(), cp1Var.r().getQuantityString(R.plurals.songs_download_started, i, Integer.valueOf(i)), 0).show();
                    }
                }
                cp1Var.l0.H.setVisibility(8);
                if (cp1Var.e() != null) {
                    cp1Var.e().runOnUiThread(new qa1(6, this));
                }
                break;
            case 2:
                final PlayQueue playQueue = (PlayQueue) obj;
                xi3 xi3Var = (xi3) obj2;
                xi3Var.p0.c().j(this);
                if (xi3Var.o0 != null && !u52.c().a) {
                    if (playQueue == null || playQueue.getEntries() == null || playQueue.getEntries().isEmpty()) {
                        ((ImageButton) ((ae1) xi3Var.o0.q).e).setVisibility(8);
                        ((ImageButton) ((ae1) xi3Var.o0.q).e).setOnClickListener(null);
                    } else {
                        int iOrElse = IntStream.range(0, playQueue.getEntries().size()).filter(new IntPredicate() { // from class: vi3
                            @Override // java.util.function.IntPredicate
                            public final boolean test(int i4) {
                                PlayQueue playQueue2 = playQueue;
                                return playQueue2.getEntries().get(i4).getId().equals(playQueue2.getCurrent());
                            }
                        }).findFirst().orElse(-1);
                        if (iOrElse != -1) {
                            ((ImageButton) ((ae1) xi3Var.o0.q).e).setVisibility(0);
                            ((ImageButton) ((ae1) xi3Var.o0.q).e).setOnClickListener(new wi3(this, playQueue, iOrElse, i3));
                        }
                    }
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                List<MusicFolder> list2 = (List) obj;
                vb4 vb4Var = (vb4) obj2;
                ListPreference listPreference = (ListPreference) vb4Var.h0("active_music_folder_id");
                if (listPreference != null && list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList.add(vb4Var.s(R.string.settings_music_library_all));
                    arrayList2.add("default");
                    ArrayList arrayList3 = new ArrayList();
                    for (MusicFolder musicFolder : list2) {
                        if (musicFolder.getId() != null) {
                            arrayList3.add(musicFolder.getId());
                            arrayList.add(musicFolder.getName() != null ? musicFolder.getName() : musicFolder.getId());
                            arrayList2.add(musicFolder.getId());
                        }
                    }
                    listPreference.G((CharSequence[]) arrayList.toArray(new CharSequence[0]));
                    listPreference.i0 = (CharSequence[]) arrayList2.toArray(new CharSequence[0]);
                    String strK = ud3.k();
                    if (strK != null && !arrayList3.isEmpty() && !arrayList3.contains(strK)) {
                        listPreference.H("default");
                        vb4Var.v0.d(null);
                    }
                    vb4Var.C0 = Integer.valueOf(arrayList3.size());
                    vb4Var.l0();
                    vb4Var.s0(listPreference);
                    break;
                }
                break;
            case 4:
                List list3 = (List) obj;
                bl4 bl4Var = (bl4) obj2;
                if (list3 == null || list3.isEmpty()) {
                    bl4Var.d.i(new ArrayList());
                } else {
                    k03 k03Var = bl4Var.d;
                    Objects.requireNonNull(k03Var);
                    bl4Var.c(list3, new xj(k03Var, 2));
                }
                bl4Var.c.getClass();
                rv2.o(-1, false).j(this);
                break;
            default:
                List list4 = (List) obj;
                cl4 cl4Var = (cl4) obj2;
                if (list4 == null || list4.isEmpty()) {
                    cl4Var.d.i(new ArrayList());
                } else {
                    k03 k03Var2 = cl4Var.d;
                    Objects.requireNonNull(k03Var2);
                    cl4Var.c(list4, new xj(k03Var2, 3));
                }
                cl4Var.c.y(-1, false).j(this);
                break;
        }
    }
}
