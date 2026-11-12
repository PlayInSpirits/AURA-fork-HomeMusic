package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.eddyizm.tempus.model.HomeSector;
import com.eddyizm.tempus.viewmodel.b;
import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zo1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ cp1 o;

    public /* synthetic */ zo1(cp1 cp1Var, int i) {
        this.n = i;
        this.o = cp1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar;
        int i = this.n;
        int i2 = 0;
        cp1 cp1Var = this.o;
        switch (i) {
            case 0:
                cp1Var.I0 = false;
                if (cp1Var.l0 != null && cp1Var.n0.D != null) {
                    ArrayList arrayList = new ArrayList();
                    if (cp1Var.l0.H.getVisibility() == 0) {
                        arrayList.add(cp1Var.l0.H);
                    }
                    if (cp1Var.l0.z.getVisibility() == 0) {
                        arrayList.add(cp1Var.l0.z);
                    }
                    if (cp1Var.l0.D.getVisibility() == 0) {
                        arrayList.add(cp1Var.l0.D);
                    }
                    View view = cp1Var.H0;
                    if (view != null) {
                        arrayList.add(view);
                    }
                    for (HomeSector homeSector : cp1Var.n0.D) {
                        if (homeSector.isVisible()) {
                            String id = homeSector.getId();
                            id.getClass();
                            switch (id) {
                                case "HOME_SECTOR_STARRED_TRACKS":
                                    arrayList.add(cp1Var.l0.n0);
                                    break;
                                case "HOME_SECTOR_NEW_RELEASES":
                                    arrayList.add(cp1Var.l0.s);
                                    break;
                                case "HOME_SECTOR_CONTINUE_LISTENING":
                                    arrayList.add(cp1Var.l0.m);
                                    break;
                                case "HOME_SECTOR_FLASHBACK":
                                    arrayList.add(cp1Var.l0.o);
                                    break;
                                case "HOME_SECTOR_SHARED":
                                    arrayList.add(cp1Var.l0.a0);
                                    break;
                                case "HOME_SECTOR_BEST_OF":
                                    arrayList.add(cp1Var.l0.l);
                                    break;
                                case "HOME_SECTOR_DISCOVERY":
                                    arrayList.add(cp1Var.l0.n);
                                    break;
                                case "HOME_SECTOR_STARRED_ARTISTS":
                                    arrayList.add(cp1Var.l0.j0);
                                    break;
                                case "HOME_SECTOR_RECENTLY_ADDED":
                                    arrayList.add(cp1Var.l0.u);
                                    break;
                                case "HOME_SECTOR_TOP_SONGS":
                                    arrayList.add(cp1Var.l0.p);
                                    break;
                                case "HOME_SECTOR_PINNED_PLAYLISTS":
                                    arrayList.add(cp1Var.l0.P);
                                    break;
                                case "HOME_SECTOR_MOST_PLAYED":
                                    arrayList.add(cp1Var.l0.r);
                                    break;
                                case "HOME_SECTOR_STARRED_ALBUMS":
                                    arrayList.add(cp1Var.l0.f0);
                                    break;
                                case "HOME_SECTOR_LAST_PLAYED":
                                    arrayList.add(cp1Var.l0.v);
                                    break;
                                case "HOME_SECTOR_RADIO_STATION":
                                    arrayList.add(cp1Var.l0.t);
                                    break;
                                case "HOME_SECTOR_MADE_FOR_YOU":
                                    arrayList.add(cp1Var.l0.x);
                                    break;
                            }
                        }
                    }
                    arrayList.add(cp1Var.l0.w);
                    LinearLayout linearLayout = cp1Var.l0.q;
                    if (linearLayout.getChildCount() == arrayList.size()) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            if (linearLayout.getChildAt(i3) == arrayList.get(i3)) {
                            }
                        }
                    }
                    linearLayout.removeAllViews();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        linearLayout.addView((View) obj);
                    }
                    break;
                }
                break;
            case 1:
                tc1 tc1Var = cp1Var.l0;
                if (tc1Var != null) {
                    tc1Var.w.setVisibility(0);
                }
                break;
            case 2:
                if (cp1Var.T != null && cp1Var.l0 != null && (bVar = cp1Var.n0) != null) {
                    bVar.A.k(ud3.s());
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (cp1Var.G0 != null && cp1Var.l0 != null) {
                    List listK0 = q40.K0(ud3.A().values(), new jb2(1));
                    boolean zIsEmpty = listK0.isEmpty();
                    tc1 tc1Var2 = cp1Var.l0;
                    if (zIsEmpty) {
                        tc1Var2.m.setVisibility(8);
                    } else {
                        tc1Var2.m.setVisibility(0);
                        zd0 zd0Var = cp1Var.G0;
                        zd0Var.r = listK0;
                        zd0Var.d();
                    }
                    break;
                }
                break;
            case 4:
                cp1Var.j0();
                break;
            case 5:
                cp1Var.j0();
                break;
            case 6:
                cp1Var.j0();
                break;
            default:
                if (cp1Var.T != null && cp1Var.l0 != null && ud3.V()) {
                    cp1Var.n0.g(cp1Var.v());
                    break;
                }
                break;
        }
    }
}
