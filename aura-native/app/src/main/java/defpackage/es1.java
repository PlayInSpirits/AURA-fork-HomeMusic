package defpackage;

import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.homemusic.HubTracks$Item;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class es1 implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ HubFragment o;

    public /* synthetic */ es1(HubFragment hubFragment, int i) {
        this.n = i;
        this.o = hubFragment;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.n;
        j15 j15Var = j15.a;
        HubFragment hubFragment = this.o;
        List<String> list = (List) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                List list2 = HubFragment.y0;
                list.getClass();
                ExecutorService executorService = ms1.a;
                MainActivity mainActivity = hubFragment.m0;
                if (mainActivity == null) {
                    h12.Q("activity");
                    throw null;
                }
                ArrayList arrayList = new ArrayList(r40.k0(list, 10));
                for (String str : list) {
                    HubTracks$Item hubTracks$Item = new HubTracks$Item();
                    hubTracks$Item.setSongId(str);
                    arrayList.add(hubTracks$Item);
                }
                ms1.a(mainActivity, arrayList, intValue, null);
                return j15Var;
            default:
                List list3 = HubFragment.y0;
                list.getClass();
                ExecutorService executorService2 = ms1.a;
                MainActivity mainActivity2 = hubFragment.m0;
                if (mainActivity2 != null) {
                    ms1.a(mainActivity2, list, intValue, null);
                    return j15Var;
                }
                h12.Q("activity");
                throw null;
        }
    }
}
