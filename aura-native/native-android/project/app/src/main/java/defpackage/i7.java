package defpackage;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.eddyizm.tempus.subsonic.models.PlayQueue;
import com.eddyizm.tempus.ui.fragment.PlaylistPageFragment;
import java.util.List;
import java.util.stream.Collectors;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i7 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int size;
        int i = this.a;
        int iB = -1;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    au0.w((Context) obj3).a(gi1.H(list), (List) list.stream().map(new hu3(6)).collect(Collectors.toList()), false);
                }
                ((k03) obj2).j(this);
                break;
            case 1:
                List list2 = (List) obj;
                ((k03) obj2).j(this);
                if (list2 != null && !list2.isEmpty()) {
                    ((xd0) obj3).accept(list2);
                    break;
                }
                break;
            case 2:
                List list3 = (List) obj;
                ao2 ao2Var = (ao2) ((i7) obj3).c;
                ((k03) obj2).j(this);
                if (list3 == null || list3.isEmpty()) {
                    Log.w("MediaManager", "Continuous Play: random fallback also empty");
                } else {
                    List listA = bo2.a(ao2Var, list3);
                    if (listA.isEmpty()) {
                        Log.w("MediaManager", "Continuous Play: random tracks already in queue");
                    } else {
                        Log.d("MediaManager", "Continuous Play: adding " + listA.size() + " random tracks");
                        iB = bo2.b(ao2Var, listA);
                        size = listA.size();
                    }
                    bo2.c.set(false);
                    is3.b(ao2Var.b(), iB, size);
                }
                size = 0;
                bo2.c.set(false);
                is3.b(ao2Var.b(), iB, size);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                List list4 = (List) obj;
                ao2 ao2Var2 = (ao2) obj3;
                ((k03) obj2).j(this);
                if (list4 != null && !list4.isEmpty()) {
                    List listA2 = bo2.a(ao2Var2, list4);
                    if (!listA2.isEmpty()) {
                        Log.d("MediaManager", "Continuous Play: adding " + listA2.size() + " similar tracks");
                        int iB2 = bo2.b(ao2Var2, listA2);
                        bo2.c.set(false);
                        is3.b(ao2Var2.b(), iB2, listA2.size());
                    }
                }
                if (!xa3.u("fallback_to_random_tracks", false)) {
                    Log.w("MediaManager", "Continuous Play: no new similar tracks, random fallback disabled");
                    bo2.c.set(false);
                    is3.b(ao2Var2.b(), -1, 0);
                } else {
                    Log.w("MediaManager", "Continuous Play: no new similar tracks, falling back to random songs");
                    k03 k03VarQ = xi4.q(25, null, null);
                    k03VarQ.f(new i7(this, k03VarQ, 2));
                }
                break;
            case 4:
                PlayQueue playQueue = (PlayQueue) obj;
                wk3 wk3Var = (wk3) obj2;
                ((aj3) obj3).c().j(this);
                if (playQueue == null || playQueue.getEntries() == null || playQueue.getEntries().isEmpty()) {
                    Toast.makeText(wk3Var.Z(), "No saved queue found", 0).show();
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= playQueue.getEntries().size()) {
                            i2 = 0;
                        } else if (!playQueue.getEntries().get(i2).getId().equals(playQueue.getCurrent())) {
                            i2++;
                        }
                    }
                    bo2.q(wk3Var.v0, playQueue.getEntries(), i2, "queue");
                    Toast.makeText(wk3Var.Z(), "Queue loaded", 0).show();
                }
                wk3Var.k0();
                break;
            default:
                List list5 = (List) obj;
                if (list5 != null) {
                    ((ad2) obj3).j(this);
                    PlaylistPageFragment playlistPageFragment = (PlaylistPageFragment) obj2;
                    playlistPageFragment.v0 = false;
                    playlistPageFragment.h0(list5);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i7(Object obj, k03 k03Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = k03Var;
    }
}
